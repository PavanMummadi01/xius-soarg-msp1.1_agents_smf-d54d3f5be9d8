package com.xius.smf.job;

import java.math.BigDecimal;
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
import com.xius.tia.TIAManagement_xsd.YFCreateInvoiceRequest;
import com.xius.tia.TIAManagement_xsd.YFCreateInvoiceResponse;

public class InvoiceProcessor implements Runnable{
	
	private static final Logger logger = LogManager.getLogger(InvoiceProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	YFAPICursorDtlsData data =null;
	
	public InvoiceProcessor(CountDownLatch latch, YFAPICursorDtlsData data)
	{
		this.latch=latch;
		this.data=data;
		
	}
	public void run() {
		 logger.debug(">>>>> InvoiceProcessor run called ..."); 
		 
		 YFAPIUpdateData domainData=null;
		 YFAPIUpdateProcessor updateProcessor=new YFAPIUpdateProcessor();
		 
	 try {

		 YFAPIProcessImpl processImpl = new YFAPIProcessImpl();
		 
		 HeaderDetails headerDetails =new HeaderDetails();
		 
		 headerDetails.setLoginID(data.getUsername());
		 headerDetails.setNetworkID(data.getNetwork_id());
		 headerDetails.setPassword("14334112");
		 
		 YFCreateInvoiceRequest request=new YFCreateInvoiceRequest();
		 YFCreateInvoiceResponse response=null;
		 
		 if (data != null) {

				if (data.getAccount_id() != null)
					request.setAccountID(String.valueOf(data.getAccount_id()));
				if (data.getAmount() != null)
					request.setAmount(new BigDecimal(data.getAmount()));
				if (data.getNit() != null)
					request.setNIT(data.getNit());
				if (data.getFirst_name() != null)
					request.setName(data.getFirst_name());
				if (data.getLast_name() != null)
					request.setLastName(data.getLast_name());
				if (data.getPublicity_id() != null) {
					request.setPublicityID(data.getPublicity_id());
				}
				if (data.getDescription() != null) {
					request.setDescription(data.getDescription());
				}else if (data.getPublicity_id() != null) {
					request.setDescription(data.getPublicity_id());
				}
				if (data.getMsisdn_no() != null)
					request.setMSISDN(String.valueOf(data.getMsisdn_no()));
				if (data.getSim_no() != null)
					request.setICCID(data.getSim_no());
				if (data.getInternal_trans_id() != null)
					request.setTransactionID(String.valueOf(data.getInternal_trans_id()));
				if (data.getAuthentic_code() != null)
					request.setAuthorizationID(data.getAuthentic_code());
				if (data.getChannel() != null)
					request.setChannel(data.getChannel());
				if (data.getSellercode() != null)
					request.setSellerCode(data.getSellercode());

			} else {
				logger.debug(">>>>> YFAPICursorDtlsData is Null ...");
			}
		 
		 response=processImpl.invoice(request, headerDetails);
		 
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
				 domainData.setPi_remarks("TIA YFCreateInvoiceResponse-getResponseData is NULL");
			 }
		 }else{
			 domainData.setPi_status(SMFAgentConstants.FAILURE);
			 domainData.setPi_remarks("TIA YFCreateInvoiceResponse is NULL");
		 }
		 
		 
		} catch (SMFAgentException _exp) {
			
			logger.error("InvoiceProcessor ---> SMFAgentException");	
			
			 domainData=new YFAPIUpdateData();
			 if(null!=data.getInternal_trans_id())
			 domainData.setPi_ref_tarnsation_id(String.valueOf(data.getInternal_trans_id()));
			 domainData.setPi_network_id(data.getNetwork_id());
			 domainData.setPi_status(SMFAgentConstants.FAILURE);
			 domainData.setPi_remarks(_exp.getErrorCode()+"#"+_exp.getErrorMessage());
			 
			logger.error(Utilities.getStackTrace(_exp));		
		} catch (Exception _exp) {
			
			 logger.error("InvoiceProcessor ---> Exception");	
			 
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
					 logger.error("InvoiceProcessor -- updateProcessor -domainData is Null");	
				 }
			} catch (Exception e) {
				logger.error("InvoiceProcessor -- updateProcessor ---> Exception");	
				logger.error(Utilities.getStackTrace(e));	
			}
			
			latch.countDown();
			
		}
		
		 
	}
	
	 

	
}
	
	
	
	 