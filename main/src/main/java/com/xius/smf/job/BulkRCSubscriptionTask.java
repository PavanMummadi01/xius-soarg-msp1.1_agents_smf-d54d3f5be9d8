package com.xius.smf.job;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import net.bcgi.util.db.SPFactory;

import org.apache.axis.AxisFault;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.domaindata.BulkRCSubscriptionCursorData;
import com.xius.smf.domaindata.BulkRcUpdatedData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
import com.xius.xbus.messages.common.AccountType;
import com.xius.xbus.messages.common.ETopUpDetailsType;
import com.xius.xbus.messages.common.ErrorData;
import com.xius.xbus.messages.common.SecurityId;
import com.xius.xbus.messages.common.ServiceContext;
import com.xius.xbus.messages.common.UserType;
import com.xius.xbus.messages.selfcare.corpcustomerservice.ActivateCorpRCProdRequest;
import com.xius.xbus.messages.selfcare.corpcustomerservice.ActivateCorpRCProdResponse;
import com.xius.xbus.services.selfcare.corpcustomerservice.CorpCustomerServiceBindingStub;
import com.xius.xbus.services.selfcare.corpcustomerservice.CorpCustomerServiceLocator;

public class BulkRCSubscriptionTask {
	private	 static final Logger logger = LogManager.getLogger(BulkRCSubscriptionTask.class.getSimpleName());


	public void doJob(BulkRCSubscriptionCursorData cursorData) {
		ActivateCorpRCProdRequest activateCorpRCProdRequest = null;
		ActivateCorpRCProdResponse activateCorpRCProdResponse = null;

		try {
			activateCorpRCProdResponse = new ActivateCorpRCProdResponse();
			 activateCorpRCProdRequest = formXbusRequest(cursorData);
			 activateCorpRCProdResponse = callXbus(activateCorpRCProdRequest);

			if (activateCorpRCProdResponse.getErrors() == null) {
				if (logger.isInfoEnabled()) {
					logger.info("Success From Xbus with the Transsaction Id  :==> :"+ activateCorpRCProdResponse.getTransId());
					logger.info("Success From Xbus with the Trans Ref Num  :==> :"+ activateCorpRCProdResponse.getTransRefNum());
				}
				updatingDbForRCSubscription(cursorData.getTransaction_no(), "SUCCESS","SUCCESS",cursorData);
			} else {
					//ErrorData errorData = null;
					ErrorData[] errorDataArr=activateCorpRCProdResponse.getErrors();
						// errorData=errorDataArr[0];
							logger.error("Error From Xbus Axis Fault:");
					logger.error("Error From Xbus Axis Fault:"+errorDataArr[0].getErrorCode());
					logger.error("Error From Xbus Axis Fault:"+errorDataArr[0].getErrorMessage());

					updatingDbForRCSubscription(cursorData.getTransaction_no(),"FAIL",errorDataArr[0].getErrorMessage(),cursorData);
			}
		} catch (AxisFault  e) {
			logger.error("Error From Xbus Axis Fault:");
			updatingDbForRCSubscription(cursorData.getTransaction_no(),"FAIL","FAILED DUE TO INTERNAL SREVER ERROR.",cursorData);
			e.printStackTrace();
		} catch (RemoteException e) {
			updatingDbForRCSubscription(cursorData.getTransaction_no(),"FAIL","FAILED DUE TO INTERNAL SREVER ERROR.",cursorData);
			logger.error("Error From Xbus RemoteException:");
			e.printStackTrace();
		} catch (Exception e) {
			logger.error("Error From Xbus Axis Fault:");
			updatingDbForRCSubscription(cursorData.getTransaction_no(),"FAIL","FAILED DUE TO INTERNAL SREVER ERROR.",cursorData);
			e.printStackTrace();
		}
	}
	
	
	
	public ActivateCorpRCProdResponse callXbus(ActivateCorpRCProdRequest request) throws MalformedURLException, RemoteException {
		ActivateCorpRCProdResponse response=null;
		CorpCustomerServiceLocator service = null;
		CorpCustomerServiceBindingStub stub=null;
		String url = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_RC_SUBSCRIPTION_XBUS_URL);
		if (logger.isInfoEnabled())
			logger.info("Calling XBUS with the url from BulkRCSubscriptionTask  ===> : "+ url);
	       
			 response=new ActivateCorpRCProdResponse();
			 service=new CorpCustomerServiceLocator();
			 stub = new CorpCustomerServiceBindingStub(new URL(url), service);
			 response = stub.activateCorpRCProd(request);
		return response;
	}
	
	
	
	
	/*
	 * Forming xbus Request  
	 * 
	 * */

	private ActivateCorpRCProdRequest formXbusRequest(BulkRCSubscriptionCursorData cursorData) {
		ActivateCorpRCProdRequest actRcProductReqst = new ActivateCorpRCProdRequest();
		if(cursorData.getMsisdn_no()!=null){
			AccountType accountType=new AccountType();
			accountType.setMsisdn(cursorData.getMsisdn_no().toString());
			actRcProductReqst.setAccountType(accountType);
		}
		if(cursorData.getAmount()!=null)
		actRcProductReqst.setAmtToDebit(cursorData.getAmount().toString());
		actRcProductReqst.setChannel("CORPORATE");
		if(cursorData.getRc_code()!=null){
			ETopUpDetailsType topUpDetails=new ETopUpDetailsType();
			topUpDetails.setCategory(cursorData.getRc_category());
			topUpDetails.setReChargeId(cursorData.getRc_code());
			actRcProductReqst.setETopUp(topUpDetails);
		}
		
		actRcProductReqst.setMessageID(cursorData.getBatch_seq_id().toString());
		if(cursorData.getAmount()!=null)
		actRcProductReqst.setMrp(cursorData.getAmount().toString());
		actRcProductReqst.setOfficeCode(cursorData.getOffice_code().toString());
		actRcProductReqst.setReason("SMF BUlK RC SUBSCSRIPTION");
		SecurityId  securityId=new SecurityId();
		securityId.setUserAccountName("CORPUSER");
		securityId.setUserAccountPassword("11111111");
		actRcProductReqst.setSecurityId(securityId);
		if(cursorData.getNetwork_id()!=null){
			ServiceContext serviceContext=new ServiceContext();
			serviceContext.setCarrierId(cursorData.getNetwork_id().toString());
			actRcProductReqst.setServiceContext(serviceContext);
		}
		if (cursorData.getTransaction_no() != null) {
			actRcProductReqst.setTransId(cursorData.getTransaction_no().toString());

		}
        actRcProductReqst.setUserType(UserType.CORPUSER);
       // actRcProductReqst.setVoucher("12312112454545");
		
		return actRcProductReqst;
	}
	
	private void updatingDbForRCSubscription(Long transId,String status,String remarks,BulkRCSubscriptionCursorData cursorData){
		
		BulkRcUpdatedData data=new BulkRcUpdatedData();

		data.setPi_transaction_id(cursorData.getTransaction_no().toString());
		data.setPi_network_id(cursorData.getNetwork_id());
		data.setPi_status(status);
		data.setPi_remarks(remarks);

		try {
			SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("topup_msisdns_stat_upd", data, data);
			Long errorcode = data.getPo_error_code();
			Utilities.commitOrRollback(spfactory, errorcode);

		} catch (SMFAgentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();


	}
		
	}
	
	

}
