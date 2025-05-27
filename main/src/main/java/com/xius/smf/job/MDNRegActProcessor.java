package com.xius.smf.job;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationResponse;

import com.xius.smf.domaindata.MDNRegActCursorDtlsData;
import com.xius.smf.domaindata.MDNRegActUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;
import com.xius.smf.webservices.smfservices.ActivateSubscriberImpl;
import com.xius.smf.webservices.smfservices.MDNRegActUpdateImpl;
import com.xius.smf.webservices.smfservices.MSISDNRegistrationImpl;
import com.xius.xbus.messages.common.StatusCode;
import com.xius.xbus.messages.provisioning.device.FirstLUActivationResponse;

public class MDNRegActProcessor implements Runnable{
	
	private static final Logger logger = LogManager.getLogger(MDNRegActProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	MDNRegActCursorDtlsData data =null;
	
	public MDNRegActProcessor(CountDownLatch latch, MDNRegActCursorDtlsData curData)
	{
		this.latch=latch;
		this.data=curData;
		
	}
	public void run() {
		 logger.debug(">>>>> MDNRegActProcessor run called ..."); 
		 
		MDNRegActUpdateImpl mdnRegActUpdateImpl=new MDNRegActUpdateImpl();
		MDNRegActUpdateData mdnRegActUpdateData=null;
		 
	 try {

		 MSISDNRegistrationImpl mdnRegImpl = new MSISDNRegistrationImpl();
		 
		 HeaderDetails headerDetails =new HeaderDetails();
		 mdnRegActUpdateData=new MDNRegActUpdateData();
		 
		PrepaidActivationResponse prepaidActivationResponse=null;
		 if(data!=null){
			 
			 headerDetails.setLoginID(data.getUser_id());
			 headerDetails.setNetworkID(data.getNetwork_id());
			 headerDetails.setPassword("1433411");
			 headerDetails.setRequestID("1");
			 if (data.getMsdn_rec_trans_id() != null){
				 mdnRegActUpdateData.setPi_trans_no(data.getMsdn_rec_trans_id());
		 	 }else{
		 		logger.debug(">>>>> MDNRegActCursorDtlsData - getMsdn_rec_trans_id is Null ..."); 
		 	 }
			 mdnRegActUpdateData.setPi_network_id(data.getNetwork_id());
			 
			 logger.debug(">>>>> MDNRegActCursorDtlsData - MSISDN "+data.getMsisdn_no());
			 logger.debug(">>>>> MDNRegActCursorDtlsData - TarifplanId "+data.getTarifplan_id());
			 logger.debug(">>>>> MDNRegActCursorDtlsData - MSISDN Transaction Id  "+data.getMsdn_rec_trans_id());
			 
			 prepaidActivationResponse=mdnRegImpl.msisdnRegistration(data.getMsisdn_no(),data.getNetworkName(),data.getTarifplan_id(),headerDetails);
			 
		 }else{
			 logger.debug(">>>>> MDNRegActCursorDtlsData is Null ..."); 
		 }
		 
		 if(prepaidActivationResponse!=null && !prepaidActivationResponse.getStatusCode().equals(StatusCode.ERROR)){
			 try{
			 ActivateSubscriberImpl activateSubscriberImpl=new ActivateSubscriberImpl();
			FirstLUActivationResponse fluResponse= activateSubscriberImpl.activateSubscriber(data.getMsisdn_no(), String.valueOf(data.getMsdn_rec_trans_id()),
					data.getSim(),data.getSna(),data.getNir(),data.getTarifplan_id(), headerDetails);
			if(fluResponse!=null && !fluResponse.getStatusCode().equals(StatusCode.ERROR)) {
				mdnRegActUpdateData.setPi_msdn_status(SMFAgentConstants.SUCCESS);
				mdnRegActUpdateData.setPi_remarks(SMFAgentConstants.SUCCESS);
			}else if(fluResponse!=null && !fluResponse.getStatusCode().equals(StatusCode.SUCCESS)){
				mdnRegActUpdateData.setPi_msdn_status(SMFAgentConstants.FAILURE);
				mdnRegActUpdateData.setPi_remarks(fluResponse.getErrors()[0].getErrorCode()+"#"+fluResponse.getErrors()[0].getErrorMessage());
			}else{
				mdnRegActUpdateData.setPi_msdn_status(SMFAgentConstants.FAILURE);
				mdnRegActUpdateData.setPi_remarks(SMFAgentConstants.INTERNAL_ERROR_MSG);
			}
			 }catch (SMFAgentException e) {
				 
				 mdnRegActUpdateData.setPi_msdn_status(SMFAgentConstants.FAILURE);
				 String erroMsg=SMFAgentConstants.INTERNAL_ERROR_MSG;
				 if(e.getErrorMessage()!=null){
					 erroMsg=e.getErrorMessage();
				 }
				 mdnRegActUpdateData.setPi_remarks(e.getErrorCode()+"#"+erroMsg);
			}
			
		}else if(prepaidActivationResponse!=null && !prepaidActivationResponse.getStatusCode().equals(StatusCode.SUCCESS)){
			mdnRegActUpdateData.setPi_msdn_status(SMFAgentConstants.FAILURE);
			mdnRegActUpdateData.setPi_remarks(prepaidActivationResponse.getErrors()[0].getErrorCode()+"#"+prepaidActivationResponse.getErrors()[0].getErrorMessage());
		}else{
			mdnRegActUpdateData.setPi_msdn_status(SMFAgentConstants.FAILURE);
			mdnRegActUpdateData.setPi_remarks(SMFAgentConstants.INTERNAL_ERROR_MSG);
		}
	 }catch (SMFAgentException _exp) {
		 
		 	mdnRegActUpdateData=new MDNRegActUpdateData();
		 	logger.error(Utilities.getStackTrace(_exp));
			logger.error("MDNRegActProcessor ---> SMFAgentException");	
			 mdnRegActUpdateData.setPi_trans_no(data.getMsdn_rec_trans_id());
			 mdnRegActUpdateData.setPi_msdn_status(SMFAgentConstants.FAILURE);
			 String erroMsg=SMFAgentConstants.INTERNAL_ERROR_MSG;
			 if(_exp.getErrorMessage()!=null){
				 erroMsg=_exp.getErrorMessage();
			 }
			 mdnRegActUpdateData.setPi_remarks(_exp.getErrorCode()+"#"+erroMsg);
				
			
		} catch (Exception _exp) {
			logger.error("MDNRegActProcessor ---> Exception");	
			logger.error(Utilities.getStackTrace(_exp));	
			mdnRegActUpdateData=new MDNRegActUpdateData();
			logger.error("MDNRegActProcessor ---> SMFAgentException");	
			mdnRegActUpdateData.setPi_trans_no(data.getMsdn_rec_trans_id());
			 mdnRegActUpdateData.setPi_msdn_status(SMFAgentConstants.FAILURE);
			 mdnRegActUpdateData.setPi_remarks(SMFAgentConstants.INTERNAL_ERROR_CODE+"#"+SMFAgentConstants.INTERNAL_ERROR_MSG);
			 
		}finally{
			
			 try {
				if(mdnRegActUpdateData != null && mdnRegActUpdateData.getPi_trans_no()!=null)
					 mdnRegActUpdateImpl.mdnRegActUpdate(mdnRegActUpdateData);
				 else{
					 logger.error("MDNRegActProcessor -- mdnRegActUpdate -mdnRegActUpdateData is Null");	
				 }
			} catch (Exception e) {
				logger.error("MDNRegActProcessor -- mdnRegActUpdate ---> Exception");	
				logger.error(Utilities.getStackTrace(e));	
			}
			
			latch.countDown();
		}
	 
	}
	
}
 