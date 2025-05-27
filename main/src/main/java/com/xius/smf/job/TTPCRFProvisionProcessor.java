package com.xius.smf.job;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.smf.domaindata.TTPCRFCursorData;
import com.xius.smf.domaindata.TTPCRFSelectDATA;
import com.xius.smf.domaindata.TTPCRFUpdateDATA;
import com.xius.smf.exceptions.SMFAgentException;
//import com.xius.smf.exception.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;
import com.xius.smf.webservices.smfservices.TTPCRFProcessImpl;
import com.xius.tia.TTprovisioning_xsd.ProdListType;
import com.xius.tia.TTprovisioning_xsd.ProvisionPCRFRequest;
import com.xius.tia.TTprovisioning_xsd.ProvisionPCRFResponse;

public class TTPCRFProvisionProcessor implements Runnable {
	private static final Logger logger = LogManager.getLogger(TTPCRFProvisionProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	TTPCRFCursorData cursorData = null;
	TTPCRFSelectDATA Data = null;
	TTPCRFUpdateDATA updatedData=null;
	TTPCRFUpdateProcessor updateProcessor=null; 

	public TTPCRFProvisionProcessor(CountDownLatch latch,
			TTPCRFCursorData curData) {
		this.latch = latch;
		this.cursorData = curData;
	}

	public TTPCRFProvisionProcessor(
			TTPCRFCursorData curData) {
		this.cursorData = curData;
	}

	//@Override
	public void run() {
		logger.debug(">>>>> TTPCRFDelProvProcessor run called ..."); 
		try{
			callProvisionPCRF();
		}finally{
			if(latch!=null)
				latch.countDown();
		}
	}

	public  void callProvisionPCRF() {

		logger.debug(">>>>> TTPCRFDelProvProcessor callProvisionPCRF called ..."); 
		try{
			HeaderDetails headerDetails =new HeaderDetails();
		
			headerDetails.setLoginID("SMFJob");
			headerDetails.setNetworkID(cursorData.getNetworkid());
			headerDetails.setPassword("11111111");
		
			TTPCRFProcessImpl pcrfImpl = new TTPCRFProcessImpl();
			updatedData=new TTPCRFUpdateDATA();
		
			
			ProvisionPCRFRequest request=new ProvisionPCRFRequest();
			ProvisionPCRFResponse response=null;
		
			if(cursorData!=null){
				if(cursorData.getImsi()!=null){
					request.setIMSI(String.valueOf(cursorData.getImsi()));
				}
				if(cursorData.getMsisdn()!=null){
					request.setMSISDN(String.valueOf(cursorData.getMsisdn()));
				}
				if(cursorData.getProduct_list()!=null){
				 ProdListType[] types=new ProdListType[1];
				 ProdListType listType=null;
					listType=new ProdListType();
					listType.setProductID(cursorData.getProduct_list());
					listType.setStatrtDate(cursorData.getStart_date());
					listType.setEndDate(cursorData.getEnd_date());
					types[0]=listType;
				request.setProdList(types);
				}
			} else{
			 logger.debug(">>>>> TTPCRFDelProvProcessor - TTPCRFCursorData  is Null ..."); 
			}
		 
		 response=pcrfImpl.provision(request, headerDetails);
		 
		 if(response!=null){
			 
			 if(response.getStatus()!=null){
				 if(response.getStatus()!=null && String.valueOf(response.getStatus()).equalsIgnoreCase(SMFAgentConstants.SUCCESS)){
					 updatedData.setPi_status(SMFAgentConstants.SUCCESS);
					 updatedData.setPi_config_error("0");
				 }else{
					 updatedData.setPi_status(SMFAgentConstants.FAILURE);
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
			
			logger.error("TTPCRFDelProvProcessor - ProvisionPCRFResponse ---> SMFAgentException");	
			updatedData=new TTPCRFUpdateDATA();
		//	updatedData.setPi_ref_tarnsation_id(data.getInternal_trans_id());
		//	updatedData.setPi_network_id(data.getNetwork_id());
			updatedData.setPi_status(SMFAgentConstants.FAILURE);
		//	updatedData.setPi_remarks(_exp.getErrorCode()+"#"+_exp.getErrorMessage());
			logger.error(Utilities.getStackTrace(_exp));	
			
		} catch (Exception _exp) {
			logger.error("TTPCRFDelProvProcessor - ProvisionPCRFResponse ---> Exception");	
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
					 logger.error("TTPCRFDelProvProcessor -- updateProcessor -domainData is Null");	
				 }
			} catch (Exception e) {
				logger.error("TTPCRFDelProvProcessor -- updateProcessor ---> Exception");	
				logger.error(Utilities.getStackTrace(e));	
			}
			
		}
	
		
	}



}