package com.xius.smf.job;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.concurrent.CountDownLatch;

import javax.xml.soap.SOAPException;

import net.bcgi.util.db.SPFactory;

import org.apache.axis.AxisFault;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.billing.BalanceManagement_wsdl.BalanceManagementBindingStub;
import com.xius.billing.BalanceManagement_wsdl.BalanceServiceLocator;
import com.xius.billing.BalanceManagement_xsd.DebitRequest;
import com.xius.billing.BalanceManagement_xsd.DebitResponse;
import com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
import com.xius.smf.domaindata.BulkDebitUpdData;
import com.xius.smf.domaindata.GetBulkDebitDtlsCursorData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class BulkDebitProcessor implements Runnable {

	private	 static final Logger logger = LogManager.getLogger(BulkDebitProcessor.class.getSimpleName());

	CountDownLatch latch=null;


	GetBulkDebitDtlsCursorData cursorData=null;

	


	public BulkDebitProcessor(CountDownLatch latch,GetBulkDebitDtlsCursorData curData){

		this.latch=latch;
		this.cursorData=curData;
		


	}
	public void run() {


		logger.info("---------In BulkDebitProcessor run------------ transid "+cursorData.getTransaction_id());
		DebitRequest request = null;
		DebitResponse response = null;

		request = setRequest(cursorData);

		try {
			response = callIBA(request, cursorData);

			if (response != null)
				try {
					updateStatusDb(response, cursorData);
				} catch (SMFAgentException e) {

					logger.error("SMFAgentException in BulkDebitProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
				}

		}
		catch (ErrorDetailsType ex) {

			String errormsg=InitiateAll.getErrorProps().getProperty(SMFAgentConstants.XBUS_ERRCODE);
			String errorcode=SMFAgentConstants.XBUS_ERRCODE;

			logger.error("Communication error from IBA:: transid "+cursorData.getTransaction_id()+" "+errorcode+":"+errormsg);
			failUpdate(cursorData,ex.getErrorMessage(),ex.getErrorCode());

			logger.error(""+Utilities.getStackTrace( ex  ) );


		}
		catch (AxisFault e) {

			String errormsg=InitiateAll.getErrorProps().getProperty(SMFAgentConstants.XBUS_ERRCODE);
			String errorcode=SMFAgentConstants.XBUS_ERRCODE;

			logger.error("Communication error from IBA:: transid "+cursorData.getTransaction_id()+" "+errorcode+":"+errormsg);
			failUpdate(cursorData,errormsg,errorcode);

			logger.error(""+Utilities.getStackTrace( e ) );


		}
			

		catch (MalformedURLException e) {

		logger.error("MalformedURLException in BulkDebitProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
		} catch (RemoteException e) {

			logger.error("RemoteException in BulkDebitProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
		} catch (SOAPException e) {

			logger.error("SOAPException in BulkDebitProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
		}
		finally {
			latch.countDown();
		}

	}


	public DebitRequest setRequest(GetBulkDebitDtlsCursorData cursorData) {
		DebitRequest request = new DebitRequest();
		logger.info("Setting Request For IBA BulkDebitProcessor with transid "+cursorData.getTransaction_id()+cursorData.toString());
		String activityId=InitiateAll.getSMFProps().getProperty("BulkDebitActivityId");
		request.setActivityId(Long.parseLong(activityId));
	  request.setMSISDN(cursorData.getMsisdn_no().toString());
		if(cursorData.getTransaction_id()!=null)
	    request.setTransactionId(cursorData.getTransaction_id());
			if(cursorData.getDebit_amount()!=null)
		request.setDebitAmount(cursorData.getDebit_amount());
			if(cursorData.getReason()!=null)
	
		request.setReason(cursorData.getReason());	
			/*if(cursorData.getChannel_id()!=null)
	{
		request.setChannelId(cursorData.getChannel_id());
	}
*/
		return request;

	}


	public DebitResponse callIBA(
			DebitRequest request, GetBulkDebitDtlsCursorData cursorData)
			throws AxisFault,MalformedURLException, RemoteException, SOAPException {
		DebitResponse response = new DebitResponse();
		BalanceServiceLocator service = new BalanceServiceLocator();
		String url = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_DEBIT_IBA_URL);
		logger.info("Calling IBA with the url from BulkDebitProcessor "+url);
		BalanceManagementBindingStub stub = new BalanceManagementBindingStub(new URL(url), service);
		HeaderDetails headerDetails=new HeaderDetails();
		headerDetails.setLoginID("chief");
		headerDetails.setRequestID("124578");
		headerDetails.setNetworkID(cursorData.getNetwork_id());
		headerDetails.setPassword("11111111");
        stub.setHeader(Utilities.getSoapHeader(headerDetails));

		response = stub.debit(request);

		return response;
	}



	public void updateStatusDb(DebitResponse response,
			GetBulkDebitDtlsCursorData cursorData) throws SMFAgentException {
		BulkDebitUpdData data = null;
		
		data = setData(response, cursorData);

		logger.info("Setting Data to BulkDebitProcessor pro_bulk_subs_debit_upd"+data.toString());
		SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_bulk_subs_debit_upd", data, data);

		Long errorcode = data.getPo_error_code();
		Utilities.commitOrRollback(spfactory, errorcode);

	}

	public BulkDebitUpdData setData(
			DebitResponse response, GetBulkDebitDtlsCursorData cursorData) {
		BulkDebitUpdData data = new BulkDebitUpdData();

		data.setPi_network_id(cursorData.getNetwork_id());

		data.setPi_transaction_id(cursorData.getTransaction_id());
     
		/*if(response.getErrors()!=null)
		{
		data.setPi_status("FAIL");
     System.out.println(response.getErrors(0).getErrorCode());
     System.out.println(response.getErrors(0).getErrorMessage());
		if(response.getErrors().length>0)
		{
		data.setPi_remarks(response.getErrors()[0].getErrorMessage());
		data.setPi_ext_error_code(response.getErrors()[0].getErrorCode());
		}
		}
		else
		{*/
		
			data.setPi_status("SUCCESS");
			data.setPi_remarks("SUCCESS");
		/*}*/







		return data;
	}



	public void failUpdate(GetBulkDebitDtlsCursorData cursorData,String msg,String  errorcodes)
	{
		BulkDebitUpdData data = new BulkDebitUpdData();

		data.setPi_transaction_id(cursorData.getTransaction_id());
		data.setPi_network_id(cursorData.getNetwork_id());
		data.setPi_status("FAIL");
		data.setPi_remarks(msg);
        data.setPi_ext_error_code(errorcodes);
		try {
			SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_bulk_subs_debit_upd", data, data);
			Long errorcode = data.getPo_error_code();
			Utilities.commitOrRollback(spfactory, errorcode);

		} catch (SMFAgentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}
	
}
