package com.xius.smf.job;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.smf.client.invoker.CorpManagementInvoker;
import com.xius.smf.domaindata.CAGroupCursorDtlsData;
import com.xius.smf.domaindata.CAGroupDtlsUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;
import com.xius.smf.webservices.smfservices.CAServiceImpl;
import com.xius.xbus.messages.common.StatusCode;
import com.xius.xbus.messages.common.UserType;
import com.xius.xbus.messages.selfcare.communityaccountservice.AcctBalListsType;
import com.xius.xbus.messages.selfcare.communityaccountservice.CAGroupType;
import com.xius.xbus.messages.selfcare.communityaccountservice.ManageCommActATPRequest;
import com.xius.xbus.messages.selfcare.communityaccountservice.ManageCommActATPResponse;
import com.xiusbcgi.xbus.scare.CorpManagement_xsd.GetAccountResponse;

public class CAGroupDetailProcessor implements Runnable{
	
	private	 static final Logger logger = LogManager.getLogger(CAGroupDetailProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	CAGroupCursorDtlsData data =null;
	
	public CAGroupDetailProcessor(CountDownLatch latch, CAGroupCursorDtlsData data)
	{
		this.latch=latch;
		this.data=data;
		
	}
	
	public void run() {
		 logger.debug(">>>>> CAGroupDetailProcessor run called ..."); 
		 
		 CAGroupDtlsUpdateProcessor updateProcessor=new CAGroupDtlsUpdateProcessor();
		 CAGroupDtlsUpdateData domainData=null;
		 
	 try {
		 
		 CAServiceImpl serviceImpl = new CAServiceImpl();
		 
		 HeaderDetails headerDetails =new HeaderDetails();
		 
		 headerDetails.setLoginID(data.getUsername());
		 headerDetails.setNetworkID(data.getNetwork_id());
		 headerDetails.setPassword("11111111");
		 
		 checkOfficeCode(headerDetails,data);
		 
		 ManageCommActATPRequest request=new ManageCommActATPRequest();
		 ManageCommActATPResponse response=null;
		 if (data != null) {
				request.setCaUserType(UserType._CORPUSER);
				request.setUserType(UserType.CORPUSER);
				if (data.getAction_flag() != null)
					request.setActDeactFlag(data.getAction_flag());
				
				CAGroupType caGroup = new CAGroupType();
				if (data.getGrp_name() != null)
					caGroup.setGrpName(data.getGrp_name());
				if (data.getGrp_id() != null)
					caGroup.setGrpID(data.getGrp_id());
				if (data.getGrp_parent_msisdn_no() != null)
					caGroup
							.setGrpParentMsisdnNO(data
									.getGrp_parent_msisdn_no());
				if (data.getPkg_id() != null)
					caGroup.setPkgID(data.getPkg_id());
				if (data.getParntacct_id() != null)
					caGroup.setParntAcctID(data.getParntacct_id());
				if (data.getUseparntsrvce() != null)
					caGroup.setUseParntSrvce(data.getUseparntsrvce());
				if (data.getIterflag() != null)
					caGroup.setIterFlag(data.getIterflag());
				if (data.getParnt_exp_status() != null)
					caGroup.setParntExpStatus(data.getParnt_exp_status());
				if (data.getChild_deflt_limt() != null)
					caGroup.setChildDefltLimt(data.getChild_deflt_limt());

				AcctBalListsType[] acctBalListsTypeArr = new AcctBalListsType[1];
				AcctBalListsType acctBalListsType = new AcctBalListsType();
				if (data.getChild_msisdns() != null)
					acctBalListsType.setMsisdn(data.getChild_msisdns());
				if (data.getUse_parnt_ca_bal() != null)
					acctBalListsType.setUseParntCaBal(data
							.getUse_parnt_ca_bal());
				if (data.getUse_parnt_core_bal() != null)
					acctBalListsType.setUseParntCoreBal(data
							.getUse_parnt_core_bal());
				if (data.getAllowed_bal_type() != null)
					acctBalListsType.setAllowedBalType(Integer.valueOf(String
							.valueOf(data.getAllowed_bal_type())));
				acctBalListsTypeArr[0] = acctBalListsType;
				caGroup.setChildAccts(acctBalListsTypeArr);
				
					request.setCaGroup(caGroup);

			} else {
				logger.debug(">>>>> CAGroupDetailCursorData is Null ...");
			}
		 
		 response=serviceImpl.manageCaATP(request, headerDetails);
		 
		 domainData=new CAGroupDtlsUpdateData();
			if (data.getInernal_transaction_id() != null)
				domainData.setPi_transaction_id(data.getInernal_transaction_id());
			
		 domainData.setPi_network_id(data.getNetwork_id());
		 
		 if(response!=null){
			 if ((response.getStatusCode() != null )&& !(response.getStatusCode().getValue().equals(StatusCode._ERROR))) {
					if (response.getErrorDetails() != null) {
						domainData.setPi_status(SMFAgentConstants.FAILURE);
						domainData.setPi_remarks(response.getErrorDetails()[0]
								.getError_desc());
					} else {
						domainData.setPi_status(SMFAgentConstants.COMPLETED);
						domainData.setPi_remarks(SMFAgentConstants.SUCCESS);
					}
				}else {
					domainData.setPi_status(SMFAgentConstants.FAILURE);
				 if(response.getErrors()!=null ){
					 domainData.setPi_remarks(response.getErrors()[0].getErrorCode()+"#"+response.getErrors()[0].getErrorMessage());
				 }else {
					 domainData.setPi_remarks(SMFAgentConstants.FAILURE);
			 }
		 	}
		 }
			
		} catch (SMFAgentException _exp) {
			
			logger.error("ManageCommActATPResponse ---> SMFAgentException");	
			
			 domainData=new CAGroupDtlsUpdateData();
			 if (data.getInernal_transaction_id() != null)
				 domainData.setPi_transaction_id(data.getInernal_transaction_id());
			 domainData.setPi_network_id(data.getNetwork_id());
			 domainData.setPi_status(SMFAgentConstants.FAILURE);
			 domainData.setPi_remarks(_exp.getErrorCode()+"#"+_exp.getErrorMessage());
			logger.error(Utilities.getStackTrace(_exp));	
			
		} catch (Exception _exp) {
			logger.error("ManageCommActATPResponse ---> Exception");	
			 domainData=new CAGroupDtlsUpdateData();
			 if (data.getInernal_transaction_id() != null)
				 domainData.setPi_transaction_id(data.getInernal_transaction_id());
			 domainData.setPi_network_id(data.getNetwork_id());
			 domainData.setPi_status(SMFAgentConstants.FAILURE);
			 domainData.setPi_remarks(_exp.getLocalizedMessage());
			 
			logger.error(Utilities.getStackTrace(_exp));		
		}finally{
			
			 try {
				 if(domainData!=null)
					 updateProcessor.statusUpdate(domainData);
				 else{
					 logger.error("CAGroupDetailProcessor -- updateProcessor -domainData is Null");	
				 }
			} catch (Exception e) {
				logger.error("CAGroupDetailProcessor -- updateProcessor ---> Exception");	
				logger.error(Utilities.getStackTrace(e));	
			}
			
			latch.countDown();
		}
		
		
	}

	private void checkOfficeCode(HeaderDetails headerDetails,
			CAGroupCursorDtlsData data) throws SMFAgentException {
		
		 CorpManagementInvoker corpManagementInvoker=new CorpManagementInvoker();
		 GetAccountResponse getAccountResponse=null;
		 getAccountResponse=corpManagementInvoker.getAccountInfo(headerDetails, data.getChild_msisdns());
		 if(getAccountResponse.getIsCorp()){
			 logger.info("Parent-OfficeCode --"+ data.getOffice_code());	
			 logger.info("child-OfficeCode --"+ getAccountResponse.getOfficeCode());
			 if(getAccountResponse.getOfficeCode()!=null && !(String.valueOf(getAccountResponse.getOfficeCode()).equals(data.getOffice_code()))){
				 throw new SMFAgentException(("40001"),InitiateAll.getErrorProps().getProperty("40001"));
			 }
		 }else{
			 throw new SMFAgentException(("40002"),InitiateAll.getErrorProps().getProperty("40002"));
		 }
		
	}
	
	 

	
}
	
	
	
	 