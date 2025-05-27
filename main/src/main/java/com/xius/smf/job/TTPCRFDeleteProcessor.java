package com.xius.smf.job;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.smf.domaindata.TTPCRFCursorData;
import com.xius.smf.domaindata.TTPCRFSelectDATA;
import com.xius.smf.domaindata.TTPCRFUpdateDATA;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;
import com.xius.smf.webservices.smfservices.TTPCRFProcessImpl;
import com.xius.tia.TTprovisioning_xsd.DeletePCRFRequest;
import com.xius.tia.TTprovisioning_xsd.DeletePCRFResponse;
import com.xius.tia.TTprovisioning_xsd.ResponseDataType;

public class TTPCRFDeleteProcessor implements Runnable {
	

	private static final Logger logger = LogManager.getLogger(TTPCRFDeleteProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	TTPCRFCursorData cursorData = null;
	TTPCRFSelectDATA Data = null;
	TTPCRFUpdateDATA updatedData=null;
	TTPCRFUpdateProcessor updateProcessor=null; 
	
	public TTPCRFDeleteProcessor(CountDownLatch latch,
			TTPCRFCursorData curData) {
		this.latch = latch;
		this.cursorData = curData;
	}
	public void run() {

		logger.debug(">>>>> TTPCRFDeleteProcessor run called ..."); 
		try{
			HeaderDetails headerDetails =new HeaderDetails();
		
			headerDetails.setLoginID("SMFJob");
			headerDetails.setNetworkID(cursorData.getNetworkid());
			headerDetails.setPassword("11111111");
		
			TTPCRFProcessImpl pcrfImpl = new TTPCRFProcessImpl();
			updatedData=new TTPCRFUpdateDATA();
			
		DeletePCRFRequest request = new DeletePCRFRequest();
		DeletePCRFResponse response = null;
		
		
		if(cursorData!=null){
			if(cursorData.getMsisdn()!=null){
				request.setMSISDN(String.valueOf(cursorData.getMsisdn()));
			}
			if(cursorData.getProduct_list()!=null){
				request.setProductID(cursorData.getProduct_list());
			}
		} else{
		 logger.debug(">>>>> TTPCRFDeleteProcessor - TTPCRFCursorData  is Null ..."); 
		}
		
		response=pcrfImpl.delete(request, headerDetails);
		 if(response!=null){
			 if(response.getStatus()!=null){
				 if(response.getStatus()!=null && String.valueOf(response.getStatus()).equalsIgnoreCase(SMFAgentConstants.SUCCESS)){
					 updatedData.setPi_status(SMFAgentConstants.SUCCESS);
				//	 updatedData.setPi_config_error(SMFAgentConstants.SUCCESS);
					 if(response.getResponseData()!=null){
						 ResponseDataType rsd= response.getResponseData();
						 updatedData.setPi_config_error(rsd.getReturnCode()); 
					 }	
					 if(response.getTransID()!=null){
						 updatedData.setPi_transation_id(Long.parseLong(response.getTransID()));
					 }
				 }else{
					 updatedData.setPi_status(SMFAgentConstants.FAILURE);
					 if(response.getResponseData()!=null){
						 ResponseDataType rsd= response.getResponseData();
						 updatedData.setPi_config_error(rsd.getReturnCode()); 
					 }	
					 if(response.getTransID()!=null){
						 updatedData.setPi_transation_id(Long.parseLong(response.getTransID()));
					 }
						 
				 }
			 }else{
				 updatedData.setPi_status(SMFAgentConstants.FAILURE);
				 //domainData.setPi_remarks("TIA RegisterCCResponse-getResult is NULL");
			 }
		 }else{
			 updatedData.setPi_status(SMFAgentConstants.FAILURE);
			 //domainData.setPi_remarks("TIA RegisterCCResponse is NULL");
		 }
			
		} catch (SMFAgentException _exp) {
			
			logger.error("TTPCRFDeleteProcessor - ProvisionPCRFResponse ---> SMFAgentException");	
			updatedData=new TTPCRFUpdateDATA();
		//	updatedData.setPi_ref_tarnsation_id(data.getInternal_trans_id());
		//	updatedData.setPi_network_id(data.getNetwork_id());
			updatedData.setPi_status(SMFAgentConstants.FAILURE);
		//	updatedData.setPi_remarks(_exp.getErrorCode()+"#"+_exp.getErrorMessage());
			logger.error(Utilities.getStackTrace(_exp));	
			
		} catch (Exception _exp) {
			logger.error("TTPCRFDeleteProcessor - ProvisionPCRFResponse ---> Exception");	
			updatedData=new TTPCRFUpdateDATA();
		//	domainData.setPi_ref_tarnsation_id(data.getInternal_trans_id());
		//	domainData.setPi_network_id(data.getNetwork_id());
			updatedData.setPi_status(SMFAgentConstants.FAILURE);
			//domainData.setPi_remarks(_exp.getLocalizedMessage());
			 
			logger.error(Utilities.getStackTrace(_exp));		
		}finally{
			
			 try {
				 if(updatedData!=null)
					 updateProcessor.statusUpdate(updatedData);
				 else{
					 logger.error("TTPCRFDeleteProcessor -- updateProcessor -domainData is Null");	
				 }
			} catch (Exception e) {
				logger.error("TTPCRFDeleteProcessor -- updateProcessor ---> Exception");	
				logger.error(Utilities.getStackTrace(e));	
			}
			
			latch.countDown();
		}
		
	}
}