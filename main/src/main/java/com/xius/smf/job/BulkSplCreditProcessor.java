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
import com.xius.billing.BalanceManagement_xsd.SpecialTopUpRequest;
import com.xius.billing.BalanceManagement_xsd.SpecialTopUpResponse;
import com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
import com.xius.smf.domaindata.BulkSplCreditUpdData;
import com.xius.smf.domaindata.GetBulkSplCreditDtlsCursorData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class BulkSplCreditProcessor implements Runnable {

	private	 static final Logger logger = LogManager.getLogger(BulkSplCreditProcessor.class.getSimpleName());

	CountDownLatch latch=null;


	GetBulkSplCreditDtlsCursorData cursorData=null;

	


	public BulkSplCreditProcessor(CountDownLatch latch,GetBulkSplCreditDtlsCursorData curData){

		this.latch=latch;
		this.cursorData=curData;
		


	}
	public void run() {


		logger.info("---------In BulkSplCreditProcessor run------------ transid "+cursorData.getTransaction_id());
		SpecialTopUpRequest request = null;
		SpecialTopUpResponse response = null;

		request = setRequest(cursorData);

		try {
			response = callIBA(request, cursorData);

			if (response != null)
				try {
					updateStatusDb(response, cursorData);
				} catch (SMFAgentException e) {

					logger.error("SMFAgentException in BulkSplCreditProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
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

		logger.error("MalformedURLException in BulkSplCreditProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
		} catch (RemoteException e) {

			logger.error("RemoteException in BulkSplCreditProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
		} catch (SOAPException e) {

			logger.error("SOAPException in BulkSplCreditProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
		}
		finally {
			latch.countDown();
		}

	}


	public SpecialTopUpRequest setRequest(GetBulkSplCreditDtlsCursorData cursorData) {
		SpecialTopUpRequest request = new SpecialTopUpRequest();
		logger.info("Setting Request For IBA BulkSplCreditProcessor with transid "+cursorData.getTransaction_id()+cursorData.toString());
		String activityId=InitiateAll.getSMFProps().getProperty("BulkSplCreditActivityId");
		request.setActivityId(Long.parseLong(activityId));
	    request.setMSISDN(cursorData.getMsisdn_no().toString());
		if(cursorData.getTransaction_id()!=null)
	    request.setTransactionId(cursorData.getTransaction_id());
			if(cursorData.getCredit_amount()!=null)
		request.setAmountToCredit(cursorData.getCredit_amount());
			
	
				if(cursorData.getExpiry_date()!=null)
				request.setNewExpiryDate(cursorData.getExpiry_date());
			
				if(cursorData.getGp_end_date()!=null)
				request.setNewGracePeriodIEndDate(cursorData.getGp_end_date());
		
				if(cursorData.getValidity_date()!=null)
				request.setNewValidityDate(cursorData.getValidity_date());
		
				if(cursorData.getReason()!=null)
		request.setReason(cursorData.getReason());	
			/*if(cursorData.getChannel_id()!=null)
	{
		request.setChannelId(cursorData.getChannel_id());
	}
*/
		return request;

	}


	public SpecialTopUpResponse callIBA(
			SpecialTopUpRequest request, GetBulkSplCreditDtlsCursorData cursorData)
			throws AxisFault,MalformedURLException, RemoteException, SOAPException {
		SpecialTopUpResponse response = new SpecialTopUpResponse();
		BalanceServiceLocator service = new BalanceServiceLocator();
		String url = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_SPECIAL_CREDIT_IBA_URL);
		logger.info("Calling IBA with the url from BulkSplCreditProcessor "+url);
		BalanceManagementBindingStub stub = new BalanceManagementBindingStub(new URL(url), service);

		HeaderDetails headerDetails=new HeaderDetails();
		headerDetails.setLoginID("chief");
		headerDetails.setRequestID("124578");
		headerDetails.setNetworkID(cursorData.getNetwork_id());
		headerDetails.setPassword("11111111");
        stub.setHeader(Utilities.getSoapHeader(headerDetails));
		response = stub.specialTopUp(request);

		return response;
	}



	public void updateStatusDb(SpecialTopUpResponse response,
			GetBulkSplCreditDtlsCursorData cursorData) throws SMFAgentException {
		BulkSplCreditUpdData data = null;
		
		data = setData(response, cursorData);

		logger.info("Setting Data to BulkSplCreditProcessor pro_bulk_subs_spcl_credit_upd"+data.toString());
		SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_bulk_subs_spcl_credit_upd", data, data);

		Long errorcode = data.getPo_error_code();
		Utilities.commitOrRollback(spfactory, errorcode);

	}

	public BulkSplCreditUpdData setData(
			SpecialTopUpResponse response, GetBulkSplCreditDtlsCursorData cursorData) {
		BulkSplCreditUpdData data = new BulkSplCreditUpdData();

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



	public void failUpdate(GetBulkSplCreditDtlsCursorData cursorData,String msg,String  errorcodes)
	{
		BulkSplCreditUpdData data = new BulkSplCreditUpdData();

		data.setPi_transaction_id(cursorData.getTransaction_id());
		data.setPi_network_id(cursorData.getNetwork_id());
		data.setPi_status("FAIL");
		data.setPi_remarks(msg);
        data.setPi_ext_error_code(errorcodes);
		try {
			SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_bulk_subs_spcl_credit_upd", data, data);
			Long errorcode = data.getPo_error_code();
			Utilities.commitOrRollback(spfactory, errorcode);

		} catch (SMFAgentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}
	
}
