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
import com.xius.billing.BalanceManagement_xsd.WaiverRequest;
import com.xius.billing.BalanceManagement_xsd.WaiverResponse;
import com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
import com.xius.smf.domaindata.BulkCreditUpdData;
import com.xius.smf.domaindata.GetBulkCreditDtlsCursorData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class BulkCreditProcessor implements Runnable {

	private	 static final Logger logger = LogManager.getLogger(BulkCreditProcessor.class.getSimpleName());

	CountDownLatch latch=null;


	GetBulkCreditDtlsCursorData cursorData=null;

	


	public BulkCreditProcessor(CountDownLatch latch,GetBulkCreditDtlsCursorData curData){

		this.latch=latch;
		this.cursorData=curData;
		


	}
	public void run() {


		logger.info("---------In BulkCreditProcessor run------------ transid "+cursorData.getTransaction_id());
		WaiverRequest request = null;
		WaiverResponse response = null;

		request = setRequest(cursorData);

		try {
			response = callIBA(request, cursorData);

			if (response != null)
				try {
					updateStatusDb(response, cursorData);
				} catch (SMFAgentException e) {

					logger.error("SMFAgentException in BulkCreditProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
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

		logger.error("MalformedURLException in BulkCreditProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
		} catch (RemoteException e) {

			logger.error("RemoteException in BulkCreditProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
		} catch (SOAPException e) {

			logger.error("SOAPException in BulkCreditProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
		}
		finally {
			latch.countDown();
		}

	}


	public WaiverRequest setRequest(GetBulkCreditDtlsCursorData cursorData) {
		WaiverRequest request = new WaiverRequest();
		logger.info("Setting Request For IBA BulkCreditProcessor with transid "+cursorData.getTransaction_id()+cursorData.toString());
		String activityId=InitiateAll.getSMFProps().getProperty("BulkCreditActivityId");
		request.setActivityId(Long.parseLong(activityId));
	  request.setMSISDN(cursorData.getMsisdn_no().toString());
		if(cursorData.getTransaction_id()!=null)
	    request.setTransactionId(cursorData.getTransaction_id());
			if(cursorData.getCredit_amount()!=null)
		request.setWaiverAmount(cursorData.getCredit_amount());
			if(cursorData.getReason()!=null)
	
		request.setReason(cursorData.getReason());	
		/*	if(cursorData.getChannel_id()!=null)
	{
		request.setChannelId(cursorData.getChannel_id());
	}*/

		return request;

	}


	public WaiverResponse callIBA(
			WaiverRequest request, GetBulkCreditDtlsCursorData cursorData)
			throws AxisFault,MalformedURLException, RemoteException, SOAPException {
		WaiverResponse response = new WaiverResponse();
		BalanceServiceLocator service = new BalanceServiceLocator();
		String url = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_CREDIT_IBA_URL);
		logger.info("Calling IBA with the url from BulkCreditProcessor "+url);
		BalanceManagementBindingStub stub = new BalanceManagementBindingStub(new URL(url), service);
		HeaderDetails headerDetails=new HeaderDetails();
		headerDetails.setLoginID("chief");
		headerDetails.setRequestID("124578");
		headerDetails.setNetworkID(cursorData.getNetwork_id());
		headerDetails.setPassword("11111111");
        stub.setHeader(Utilities.getSoapHeader(headerDetails));
		response = stub.waiver(request);

		return response;
	}



	public void updateStatusDb(WaiverResponse response,
			GetBulkCreditDtlsCursorData cursorData) throws SMFAgentException {
		BulkCreditUpdData data = null;
		
		data = setData(response, cursorData);

		logger.info("Setting Data to BulkCreditProcessor pro_bulk_subs_credit_upd"+data.toString());
		SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_bulk_subs_credit_upd", data, data);

		Long errorcode = data.getPo_error_code();
		Utilities.commitOrRollback(spfactory, errorcode);

	}

	public BulkCreditUpdData setData(
			WaiverResponse response, GetBulkCreditDtlsCursorData cursorData) {
		BulkCreditUpdData data = new BulkCreditUpdData();

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



	public void failUpdate(GetBulkCreditDtlsCursorData cursorData,String msg,String  errorcodes)
	{
		BulkCreditUpdData data = new BulkCreditUpdData();

		data.setPi_transaction_id(cursorData.getTransaction_id());
		data.setPi_network_id(cursorData.getNetwork_id());
		data.setPi_status("FAIL");
		data.setPi_remarks(msg);
        data.setPi_ext_error_code(errorcodes);
		try {
			SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_bulk_subs_credit_upd", data, data);
			Long errorcode = data.getPo_error_code();
			Utilities.commitOrRollback(spfactory, errorcode);

		} catch (SMFAgentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}
	
}
