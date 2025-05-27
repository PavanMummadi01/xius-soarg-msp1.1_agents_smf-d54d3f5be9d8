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

import com.xius.billing.AccountManagement_xsd.MDNBasedGetNwIdRequest;
import com.xius.smf.client.invoker.MDNbasedGetNwIdInvoker;
import com.xius.smf.domaindata.BulkCorpRctCursorData;
import com.xius.smf.domaindata.BulkCorpRctUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
import com.xius.xbus.messages.common.AccountType;
import com.xius.xbus.messages.common.ETopUpDetailsType;
import com.xius.xbus.messages.common.SecurityId;
import com.xius.xbus.messages.common.ServiceContext;
import com.xius.xbus.messages.common.UserType;
import com.xius.xbus.messages.selfcare.corpcustomerservice.ActivateCorpRCProdRequest;
import com.xius.xbus.messages.selfcare.corpcustomerservice.ActivateCorpRCProdResponse;
import com.xius.xbus.services.selfcare.corpcustomerservice.CorpCustomerServiceBindingStub;
import com.xius.xbus.services.selfcare.corpcustomerservice.CorpCustomerServiceLocator;

public class BulkCorpRctSubJobProcessor implements Runnable {
	private	 static final Logger logger = LogManager.getLogger(BulkCorpRctSubJobProcessor.class.getSimpleName());
	CountDownLatch latch=null;
	BulkCorpRctCursorData cursorData=null;
	public BulkCorpRctSubJobProcessor(CountDownLatch latch,BulkCorpRctCursorData curData){
		this.latch=latch;
		this.cursorData=curData;
	}
	public void run() {
		logger.info("---------In BulkCorpRctSubJobProcessor run------------ transid "+cursorData.getTransaction_id());
		ActivateCorpRCProdRequest request = null;
		ActivateCorpRCProdResponse response = null;
		request = setRequest(cursorData);
		
		MDNbasedGetNwIdInvoker getNwIdInvoker=new MDNbasedGetNwIdInvoker();
		
		HeaderDetails details=new HeaderDetails();
		details.setLoginID(cursorData.getUser_id()); 
		details.setNetworkID(cursorData.getNetwork_id());
		details.setRequestID("123"); //dummy
		details.setPassword("12345678"); //dummy
		
		MDNBasedGetNwIdRequest idRequest=new MDNBasedGetNwIdRequest();
		
		idRequest.setMSISDN(cursorData.getMsisdn_no().toString());
		
		 Long accountId=null;
		try {
			
			accountId = getNwIdInvoker.MDNbasedGetNwId(details, idRequest).getAccountId();
			
		} catch (SMFAgentException e1) {
			logger.error("SMFAgentException in BulkCorpRctSubJobProcessor while getting accountID transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e1));
		}
		

		try {
			response = callXbus(request, cursorData);

			if (response != null)
				try {
					updateStatusDb(response, cursorData,accountId);

				} catch (SMFAgentException e) {

					logger.error("SMFAgentException in BulkCorpRctSubJobProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
				}

		}
			catch (AxisFault e) {

			String errormsg=InitiateAll.getErrorProps().getProperty(SMFAgentConstants.XBUS_ERRCODE);
			String errorcode=SMFAgentConstants.XBUS_ERRCODE;

			logger.error("Communication error from XBUS:: transid "+cursorData.getTransaction_id()+" "+errorcode+":"+errormsg);
			failUpdate(cursorData,errormsg,accountId);

			logger.error(""+Utilities.getStackTrace( e ) );


		}

		catch (MalformedURLException e) {

		logger.error("MalformedURLException in BulkCorpRctSubJobProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
		} catch (RemoteException e) {

			logger.error("RemoteException in BulkCorpRctSubJobProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
		} catch (SOAPException e) {

			logger.error("SOAPException in BulkCorpRctSubJobProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
		}
		finally {
			latch.countDown();
		}

	}


	public ActivateCorpRCProdRequest setRequest(BulkCorpRctCursorData cursorData) {
		ActivateCorpRCProdRequest actRcProductReqst = new ActivateCorpRCProdRequest();
		if(cursorData.getMsisdn_no()!=null){
			AccountType accountType=new AccountType();
			accountType.setMsisdn(cursorData.getMsisdn_no().toString());
			actRcProductReqst.setAccountType(accountType);
		}
		if(cursorData.getRc_amount()!=null)
		actRcProductReqst.setAmtToDebit(cursorData.getRc_amount().toString());
		actRcProductReqst.setChannel(cursorData.getChannel_id());
		if(cursorData.getRc_id()!=null){
			ETopUpDetailsType topUpDetails=new ETopUpDetailsType();
			topUpDetails.setCategory(cursorData.getRc_category());
			topUpDetails.setReChargeId(cursorData.getRc_id());
			actRcProductReqst.setETopUp(topUpDetails);
		}
		
		actRcProductReqst.setMessageID("123"); //dummy
		
		if(cursorData.getMrp()!=null)
		actRcProductReqst.setMrp(cursorData.getMrp().toString());
		
		actRcProductReqst.setOfficeCode(cursorData.getOffice_code().toString());
		
		if(cursorData.getReason()!=null)
		actRcProductReqst.setReason(cursorData.getReason());
		
		SecurityId  securityId=new SecurityId();
		securityId.setUserAccountName(cursorData.getUser_id());
		securityId.setUserAccountPassword("11111111");
		actRcProductReqst.setSecurityId(securityId);
		if(cursorData.getNetwork_id()!=null){
			ServiceContext serviceContext=new ServiceContext();
			serviceContext.setCarrierId(cursorData.getNetwork_id().toString());
			actRcProductReqst.setServiceContext(serviceContext);
		}
		if (cursorData.getTransaction_id() != null) {
			actRcProductReqst.setTransId(cursorData.getTransaction_id());

		}
		// BulkRCjob office code added-1 for null value Based on this condition
		// we are skipping CORP calls in xBus added by maheswar
		if (cursorData.getOffice_code() != null
				&& cursorData.getOffice_code() == -1) {
			actRcProductReqst.setUserType(UserType.CCUSER);
		} else {
			actRcProductReqst.setUserType(UserType.CORPUSER);
		}
		
		return actRcProductReqst;
	}

	public ActivateCorpRCProdResponse callXbus(
			ActivateCorpRCProdRequest request, BulkCorpRctCursorData cursorData)
			throws AxisFault,MalformedURLException, RemoteException, SOAPException {
		ActivateCorpRCProdResponse response=null;
		CorpCustomerServiceLocator service = null;
		CorpCustomerServiceBindingStub stub=null;
		String url = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.XBUS_CXF_BULK_CORP_RC_SUBSCRIPTION_URL);
		if (logger.isInfoEnabled())
			logger.info("Calling XBUS with the url from BulkCorpRctSubJobProcessor  ===> : "+ url);
	       
			 response=new ActivateCorpRCProdResponse();
			 service=new CorpCustomerServiceLocator();
			 stub = new CorpCustomerServiceBindingStub(new URL(url), service);
			 response = stub.activateCorpRCProd(request);
		return response;
	}



	public void updateStatusDb(ActivateCorpRCProdResponse response,
			BulkCorpRctCursorData cursorData,Long accountId) throws SMFAgentException {
		BulkCorpRctUpdateData data = null;
		
		data = setData(response, cursorData,accountId);

		logger.info("Setting Data to BulkCorpRctSubJobProcessor pro_corp_rct_upd"+data.toString());
		SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_corp_rct_upd", data, data);

		Long errorcode = data.getPo_error_code();
		Utilities.commitOrRollback(spfactory, errorcode);

	}

	public BulkCorpRctUpdateData setData(ActivateCorpRCProdResponse response, BulkCorpRctCursorData cursorData,Long accountId) {
		BulkCorpRctUpdateData data = new BulkCorpRctUpdateData();

		data.setPi_network_id(cursorData.getNetwork_id());

		data.setPi_transaction_id(cursorData.getTransaction_id());
		
		if(accountId!=null)
		data.setPi_account_id(accountId);
      
		
		if(response.getErrors()!=null)
		{
		data.setPi_status("FAIL");
     
		if(response.getErrors().length>0)
		{
		data.setPi_remarks(response.getErrors()[0].getErrorMessage());
		data.setPi_ext_error_code(response.getErrors()[0].getErrorCode());
		}
		}
		else
		{
			data.setPi_status("SUCCESS");
			data.setPi_remarks("SUCCESS");
		}
		return data;
	}

	public void failUpdate(BulkCorpRctCursorData cursorData,String msg,Long accountId)
	{
		BulkCorpRctUpdateData data = new BulkCorpRctUpdateData();

		data.setPi_transaction_id(cursorData.getTransaction_id());
		
		if(accountId!=null)
			data.setPi_account_id(accountId);
		
		data.setPi_network_id(cursorData.getNetwork_id());
		data.setPi_status("FAIL");
		data.setPi_remarks(msg);

		try {
			SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_corp_rct_upd", data, data);
			Long errorcode = data.getPo_error_code();
			Utilities.commitOrRollback(spfactory, errorcode);

		} catch (SMFAgentException e) {
			e.printStackTrace();
		}



	}
	
}
