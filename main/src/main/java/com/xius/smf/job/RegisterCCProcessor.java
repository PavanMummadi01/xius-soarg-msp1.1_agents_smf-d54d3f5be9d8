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
import com.xius.tia.ccard.CreditCardManagment_xsd.RegisterCCRequest;
import com.xius.tia.ccard.CreditCardManagment_xsd.RegisterCCResponse;

public class RegisterCCProcessor implements Runnable{
	
	private static final Logger logger = LogManager.getLogger(RegisterCCProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	YFAPICursorDtlsData data =null;
	
	public RegisterCCProcessor(CountDownLatch latch, YFAPICursorDtlsData data)
	{
		this.latch=latch;
		this.data=data;
		
	}
	public void run() {
		 logger.debug(">>>>> RegisterCCProcessor run called ..."); 
		 
		 YFAPIUpdateProcessor updateProcessor=new YFAPIUpdateProcessor();
		 YFAPIUpdateData domainData=null;
		 
	 try {

		 YFAPIProcessImpl registerCCImpl = new YFAPIProcessImpl();
		 
		 HeaderDetails headerDetails =new HeaderDetails();
		 
		 headerDetails.setLoginID(data.getUsername());
		 headerDetails.setNetworkID(data.getNetwork_id());
		 headerDetails.setPassword("14334112");
		 
		 RegisterCCRequest request=new RegisterCCRequest();
		 RegisterCCResponse response=null;
		 if(data!=null){
			 if(data.getAccount_id()!=null)
				 request.setAccountID(String.valueOf(data.getAccount_id()));
			 if(data.getMsisdn_no()!=null)
				 request.setMSISDN(String.valueOf(data.getMsisdn_no()));
			 if(data.getDpi()!=null)
				 request.setDPI(data.getDpi());
			 if(data.getImsi()!=null)
				 request.setIMSI(String.valueOf(data.getImsi()));
			 if(data.getSellercode()!=null)
				 request.setSellerCode(data.getSellercode());
			 if(data.getSim_no()!=null)
				 request.setSIMNO(data.getSim_no());
			 if(null!=data.getInternal_trans_id())
				 request.setTransactionId(String.valueOf(data.getInternal_trans_id()));
			 if(data.getChannel()!=null)
				 request.setChannel(data.getChannel());
			 
			 
		 }else{
			 logger.debug(">>>>> YFAPICursorDtlsData is Null ..."); 
		 }
		 
		 response=registerCCImpl.registerCC(request, headerDetails);
		 
		 domainData=new YFAPIUpdateData();
			if (data.getInternal_trans_id() != null)
		 domainData.setPi_ref_tarnsation_id(String.valueOf(data.getInternal_trans_id()));
		 domainData.setPi_network_id(data.getNetwork_id());
		 
		 if(response!=null){
			 
			 if(response.getResult()!=null){
				 if(response.getResult().getRespStatus()!=null && String.valueOf(response.getResult().getRespStatus()).equalsIgnoreCase("0")){
					 domainData.setPi_status(SMFAgentConstants.SUCCESS);
					 domainData.setPi_remarks(SMFAgentConstants.SUCCESS);
				 }else{
					 domainData.setPi_status(SMFAgentConstants.FAILURE);
					 domainData.setPi_remarks(String.valueOf(response.getResult().getRespStatus())+"#"+
							 response.getResult().getRespcode()+"::"+response.getResult().getRespdescription());
				 }
			 }else{
				 domainData.setPi_status(SMFAgentConstants.FAILURE);
				 domainData.setPi_remarks("TIA RegisterCCResponse-getResult is NULL");
			 }
		 }else{
			 domainData.setPi_status(SMFAgentConstants.FAILURE);
			 domainData.setPi_remarks("TIA RegisterCCResponse is NULL");
		 }
			
		} catch (SMFAgentException _exp) {
			
			logger.error("RegisterCCResponse ---> SMFAgentException");	
			
			 domainData=new YFAPIUpdateData();
			 if (data.getInternal_trans_id() != null)
			 domainData.setPi_ref_tarnsation_id(String.valueOf(data.getInternal_trans_id()));
			 domainData.setPi_network_id(data.getNetwork_id());
			 domainData.setPi_status(SMFAgentConstants.FAILURE);
			 domainData.setPi_remarks(_exp.getErrorCode()+"#"+_exp.getErrorMessage());
			logger.error(Utilities.getStackTrace(_exp));	
			
		} catch (Exception _exp) {
			logger.error("RegisterCCResponse ---> Exception");	
			 domainData=new YFAPIUpdateData();
			 if (data.getInternal_trans_id() != null)
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
					 logger.error("RegisterCCProcessor -- updateProcessor -domainData is Null");	
				 }
			} catch (Exception e) {
				logger.error("RegisterCCProcessor -- updateProcessor ---> Exception");	
				logger.error(Utilities.getStackTrace(e));	
			}
			
			latch.countDown();
		}
		
		
	}
	
	 

	
}
	
	
	
	 