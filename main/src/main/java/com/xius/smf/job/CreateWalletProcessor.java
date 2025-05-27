package com.xius.smf.job;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.smf.domaindata.YFAPICursorDtlsData;
import com.xius.smf.domaindata.YFAPIUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;
import com.xius.smf.webservices.smfservices.YFAPIProcessImpl;
import com.xius.tia.WalletManagement_xsd.CreateWalletRequest;
import com.xius.tia.WalletManagement_xsd.CreateWalletResponse;

public class CreateWalletProcessor implements Runnable{
	
	private	 static final Logger logger = LogManager.getLogger(CreateWalletProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	YFAPICursorDtlsData data =null;
	
	public CreateWalletProcessor(CountDownLatch latch, YFAPICursorDtlsData data)
	{
		this.latch=latch;
		this.data=data;
		
	}
	public void run() {
		 logger.debug(">>>>> CreateWalletProcessor run called ..."); 
		 
		 YFAPIUpdateData domainData=null;
		 YFAPIUpdateProcessor updateProcessor=new YFAPIUpdateProcessor();
		 
	 try {

		 YFAPIProcessImpl processImpl = new YFAPIProcessImpl();
		 
		 HeaderDetails headerDetails =new HeaderDetails();
		 
		 headerDetails.setLoginID(data.getUsername());
		 headerDetails.setNetworkID(data.getNetwork_id());
		 headerDetails.setPassword("14334112");
		 
		 CreateWalletRequest request=new CreateWalletRequest();
		 CreateWalletResponse response=null;
		 if(data!=null){
			 if(data.getAccount_id()!=null)
				 request.setWalletID(String.valueOf(data.getAccount_id()));
			 if(data.getWalletunits()!=null)
				 request.setWalletamount(String.valueOf(data.getWalletunits()));
		 }else{
			 logger.debug(">>>>> YFAPICursorDtlsData is Null ..."); 
		 }
		 
		 response=processImpl.createWallet(request, headerDetails);
		 
		 domainData=new YFAPIUpdateData();
		 if(null!=data.getInternal_trans_id())
		 domainData.setPi_ref_tarnsation_id(String.valueOf(data.getInternal_trans_id()));
		 domainData.setPi_network_id(data.getNetwork_id());
		 
		 if(response!=null){
			 
			 if(response.getResponseData()!=null){
				 if(response.getResponseData().getReturnCode()!=null && response.getResponseData().getReturnCode().equalsIgnoreCase("0")){
					 domainData.setPi_status(SMFAgentConstants.SUCCESS);
					 domainData.setPi_remarks(SMFAgentConstants.SUCCESS);
				 }else{
					 domainData.setPi_status(SMFAgentConstants.FAILURE);
					 domainData.setPi_remarks(String.valueOf(response.getResponseData().getReturnCode())+"#"+
							 response.getResponseData().getResponsecode()+"::"+response.getResponseData().getRespdescription());
				 }
			 }else{
				 domainData.setPi_status(SMFAgentConstants.FAILURE);
				 domainData.setPi_remarks("TIA CreateWalletResponse-getResponseData is NULL");
			 }
		 }else{
			 domainData.setPi_status(SMFAgentConstants.FAILURE);
			 domainData.setPi_remarks("TIA CreateWalletResponse is NULL");
		 }
		 
			
			 updateProcessor.statusUpdate(domainData);
		 
		} catch (SMFAgentException _exp) {
			
			logger.error("CreateWalletProcessor ---> SMFAgentException");	
			
			 domainData=new YFAPIUpdateData();
			 if(null!=data.getInternal_trans_id())
			 domainData.setPi_ref_tarnsation_id(String.valueOf(data.getInternal_trans_id()));
			 domainData.setPi_network_id(data.getNetwork_id());
			 domainData.setPi_status(SMFAgentConstants.FAILURE);
			 domainData.setPi_remarks(_exp.getErrorCode()+"#"+_exp.getErrorMessage());
			 
			logger.error(Utilities.getStackTrace(_exp));		
		} catch (Exception _exp) {
			
			 logger.error("CreateWalletProcessor ---> Exception");	
			 
			 domainData=new YFAPIUpdateData();
			 if(null!=data.getInternal_trans_id())
			 domainData.setPi_ref_tarnsation_id(String.valueOf(data.getInternal_trans_id()));
			 domainData.setPi_network_id(data.getNetwork_id());
			 domainData.setPi_status(SMFAgentConstants.FAILURE);
			 domainData.setPi_remarks(_exp.getLocalizedMessage());
			 
			logger.error(Utilities.getStackTrace(_exp));		
			
		}finally{
			
			 try {
				 if(domainData!=null)
					 updateProcessor.statusUpdate(domainData);
				 else{
					 logger.error("CreateWalletProcessor -- updateProcessor -domainData is Null");	
				 }
			} catch (Exception e) {
				logger.error("CreateWalletProcessor -- updateProcessor ---> Exception");	
				logger.error(Utilities.getStackTrace(e));	
			}
			
			latch.countDown();
		}
		
		
	}
	
	 

	
}
	
	
	
	 