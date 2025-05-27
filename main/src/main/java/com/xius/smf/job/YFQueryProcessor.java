package com.xius.smf.job;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.smf.client.invoker.TIAMngmtInvoker;
import com.xius.smf.domaindata.YFAPICursorDtlsData;
import com.xius.smf.domaindata.YFAPIUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;
import com.xius.tia.TIAManagement_xsd.QueryTransactionsRequest;
import com.xius.tia.TIAManagement_xsd.QueryTransactionsResponse;

public class YFQueryProcessor implements Runnable  {

	
private static final Logger logger = LogManager.getLogger(YFQueryProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	YFAPICursorDtlsData data =null;
	
	public YFQueryProcessor(CountDownLatch latch, YFAPICursorDtlsData data){
		this.latch=latch;
		this.data=data;
	}
	public void run() {
		logger.debug(">>>>> Query Processor run called ..."); 
		 
		 YFAPIUpdateData domainData=null;
		 YFAPIUpdateProcessor updateProcessor=new YFAPIUpdateProcessor();
	
		 
		 try {

			 TIAMngmtInvoker tiaMngmtInvokerObj = new TIAMngmtInvoker();
			 
			 HeaderDetails headerDetails =new HeaderDetails();
			 
			 headerDetails.setLoginID(data.getUsername());
			 headerDetails.setNetworkID(data.getNetwork_id());
			 headerDetails.setPassword("14334112");
			
			 
			 
			 QueryTransactionsRequest request=new QueryTransactionsRequest();
			 QueryTransactionsResponse response=null;
			 
			 if (data != null) {
				if (data.getExternal_trans_id() != null && data.getExternal_trans_id().length()>0) 
				 request.setQueryTransactionId(data.getExternal_trans_id());
				if (data.getInternal_trans_id() != null ) 
				request.setTransactionRefNum(String.valueOf(data.getInternal_trans_id()));
				 
				request.setTransactionType("SMFProcessJob"); 
							} else {
					logger.debug(">>>>> YFAPICursorDtlsData is Null ...");
				}
			 
			 response=tiaMngmtInvokerObj.queryTransactions(headerDetails,request);
			 
			 domainData=new YFAPIUpdateData();
			 if(null!=data.getInternal_trans_id())
			 domainData.setPi_ref_tarnsation_id(String.valueOf(data.getInternal_trans_id()));
			 domainData.setPi_network_id(data.getNetwork_id());
			 
			 if(response!=null){
				 
				 if(response.getResponseData()!=null){
					 if(response.getResponseData().getReturnCode()!=null && response.getResponseData().getReturnCode().equalsIgnoreCase("0")){
						 
						 if(null!=response.getResponseData().getResponsecode()&& response.getResponseData().getResponsecode().equalsIgnoreCase("0")){
					
							 domainData.setPi_status(SMFAgentConstants.SUCCESS);
							 
							 String remarks=(null!=response.getResponseData().getRespdescription()&&response.getResponseData().getRespdescription().length()>0) ? response.getResponseData().getRespdescription():SMFAgentConstants.SUCCESS;
							 domainData.setPi_remarks(remarks);
	
							 logger.info(">>>>> Starting NEIntimation Thread...");
						    Thread invokerthread=new Thread(new NEInvokerThread(data)) ;
						    invokerthread.start();
						 }else{
						 domainData.setPi_status(SMFAgentConstants.QUEUED);
						 String remarks=(null!=response.getResponseData().getRespdescription()&&response.getResponseData().getRespdescription().length()>0) ? response.getResponseData().getRespdescription():SMFAgentConstants.QUEUED;
						 domainData.setPi_remarks(remarks);
						 }
						 }else{
						 domainData.setPi_status(SMFAgentConstants.FAILURE);
						 domainData.setPi_remarks(String.valueOf(response.getResponseData().getReturnCode())+"#"+
								 response.getResponseData().getResponsecode()+"::"+response.getResponseData().getRespdescription());
					 }
				 }else{
					 domainData.setPi_status(SMFAgentConstants.FAILURE);
					 domainData.setPi_remarks("TIA QueryTransaction-getResponseData is NULL");
				 
			 }
			 }else{
				 domainData.setPi_status(SMFAgentConstants.FAILURE);
				 domainData.setPi_remarks("TIA QueryTransaction is NULL");
			 }
			 
			 
			} catch (SMFAgentException _exp) {
				
				logger.error("YFQueryProcessor ---> SMFAgentException");	
				
				 domainData=new YFAPIUpdateData();
				 if(null!=data.getInternal_trans_id())
				 domainData.setPi_ref_tarnsation_id(String.valueOf(data.getInternal_trans_id()));
				 domainData.setPi_network_id(data.getNetwork_id());
				 domainData.setPi_status(SMFAgentConstants.FAILURE);
				 domainData.setPi_remarks(_exp.getErrorCode()+"#"+_exp.getErrorMessage());
				 
				logger.error(Utilities.getStackTrace(_exp));		
			} catch (Exception _exp) {
				
				 logger.error("YFQueryProcessor ---> Exception");	
				 
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
						 logger.error("YFQueryProcessor -- updateProcessor -domainData is Null");	
					 }
				} catch (Exception e) {
					logger.error("YFQueryProcessor -- updateProcessor ---> Exception");	
					logger.error(Utilities.getStackTrace(e));	
				}
				
				latch.countDown();
				
			}
			
			 
		}

		 
		 
	

}
