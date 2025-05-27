package com.xius.smf.job;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.bcgi.util.db.SPFactory;

import com.xius.smf.client.invoker.TIAMngmtInvoker;
import com.xius.smf.domaindata.TIARetryCursorDtlsData;
import com.xius.smf.domaindata.TIARetryUpdateData;
import com.xius.smf.domaindata.YFAPIInsertData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
import com.xius.tia.TIAManagement_xsd.RequestData;
import com.xius.tia.TIAManagement_xsd.SimActivationRequest;
import com.xius.tia.TIAManagement_xsd.SimActivationResponse;
import com.xius.tia.TIAManagement_xsd.SimDataType;

public class SimActivationProcessor implements Runnable 
{
	private static final Logger logger = LogManager.getLogger(SimActivationProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	TIARetryCursorDtlsData tiaRetryCursorDtlsData=null;
	TIARetryUpdateData domainData=null;
	YFAPIInsertData yfAPIInsertDataObj=null;
	
	
	public SimActivationProcessor(CountDownLatch latch,
			TIARetryCursorDtlsData tiaRetryCursorDtlsData) {
		this.latch = latch;
		this.tiaRetryCursorDtlsData = tiaRetryCursorDtlsData;
	}




	public void run() {
	
		 try {

			 TIAMngmtInvoker tiaMngmtInvokerObj = new TIAMngmtInvoker();
			 
			 HeaderDetails headerDetails =new HeaderDetails();
			 SimActivationRequest request=null;
			 SimActivationResponse response=null;
			
			 
			 if (tiaRetryCursorDtlsData != null ) {
						
				 yfAPIInsertDataObj=new YFAPIInsertData();
				 request=new SimActivationRequest();
				 headerDetails.setLoginID("SMFRetryJob");
						 headerDetails.setNetworkID(tiaRetryCursorDtlsData.getNetwork_id());
						 headerDetails.setPassword("11111111");
						 
						 
						 
							 SimDataType simDataObj=new SimDataType();
							 RequestData data=new RequestData();
							 yfAPIInsertDataObj.setPi_network_id(tiaRetryCursorDtlsData.getNetwork_id());
							 yfAPIInsertDataObj.setPi_channel("SMFJOB");
							 if(null!=tiaRetryCursorDtlsData.getOld_msisdn_no()){
								 simDataObj.setOldMSISDN(String.valueOf(tiaRetryCursorDtlsData.getOld_msisdn_no()));
								
							 }
								 if(null!=tiaRetryCursorDtlsData.getMsisdn_no())
								 {
									 simDataObj.setNewMSISDN(String.valueOf(tiaRetryCursorDtlsData.getMsisdn_no()));
									 yfAPIInsertDataObj.setPi_msisdn_no(tiaRetryCursorDtlsData.getMsisdn_no());   
								 }
							 if(null!=tiaRetryCursorDtlsData.getImsi())
								 { 
								 simDataObj.setOldIMSI(String.valueOf(tiaRetryCursorDtlsData.getImsi()));
								 yfAPIInsertDataObj.setPi_imsi(String.valueOf(tiaRetryCursorDtlsData.getImsi()));
								 }
							 if(null!=tiaRetryCursorDtlsData.getSim_serial_no())
								 { 
								 simDataObj.setOldICC(String.valueOf(tiaRetryCursorDtlsData.getSim_serial_no()));
								 yfAPIInsertDataObj.setPi_sim_no(String.valueOf(tiaRetryCursorDtlsData.getSim_serial_no()));
								 }
							 if(null!=tiaRetryCursorDtlsData.getTrans_id() )
							 { 
								 data.setTransactionId(tiaRetryCursorDtlsData.getTrans_id());
								 yfAPIInsertDataObj.setPi_transaction_id(tiaRetryCursorDtlsData.getTrans_id());
							 }
							 
							 simDataObj.setRequestData(data);
							 request.setSimData(simDataObj);
							 
							 
										} else {
								logger.debug(">>>>> TIARetryCursorDtlsData is Null ...");
							}
						 
						 response=tiaMngmtInvokerObj.SIMActivation(headerDetails,request);
						 
						 domainData=new TIARetryUpdateData();
						 if(null!=tiaRetryCursorDtlsData.getTrans_id() )
						 { 					 
						 domainData.setPi_transaction_id(tiaRetryCursorDtlsData.getTrans_id());
						 }
						 domainData.setPi_network_id(tiaRetryCursorDtlsData.getNetwork_id());
						 
						 if(response!=null){
							 
							 if(response.getResponseData()!=null){
							
								 if(null!=response.getResponseData().getRespdescription() && response.getResponseData().getRespdescription().contains("-")){
								 String[] transactionArray=response.getResponseData().getRespdescription().split("-");
								 if(null!=transactionArray[0]&& transactionArray[0].length()>0)
								 yfAPIInsertDataObj.setPi_external_trans_id(transactionArray[0]);
								}
								 
								 if(response.getResponseData().getReturnCode()!=null && response.getResponseData().getReturnCode().equalsIgnoreCase("0")){
									 
									 if(null!=response.getResponseData().getResponsecode()&& response.getResponseData().getResponsecode().equalsIgnoreCase("0")){
                                            //  need to form an call activation tracker update call
									
										 domainData.setPi_status(SMFAgentConstants.SUCCESS);
										 domainData.setPi_remarks(SMFAgentConstants.SUCCESS);
										 yfAPIInsertDataObj.setPi_activity("ACTIVATED");
										 
										 logger.info(">>>>> Starting NEIntimation Thread...");
									    Thread invokerthread=new Thread(new NETIARetryAPIInvokerThread(tiaRetryCursorDtlsData,"success")) ;
									    invokerthread.start();
										 
										 }else{
									// need for yfAPIinsert
									 String remarks=(null!=response.getResponseData().getRespdescription()&&response.getResponseData().getRespdescription().length()>0) ? response.getResponseData().getRespdescription():SMFAgentConstants.QUEUED;
									 domainData.setPi_status(SMFAgentConstants.SUCCESS);
									domainData.setPi_remarks(remarks);
									yfAPIInsertDataObj.setPi_activity("ACTIVATE_QUEUED");
									 
									 }
									 }else{
										// need for yfAPIinsert 
										 yfAPIInsertDataObj.setPi_activity(SMFAgentConstants.FAILURE); 
									domainData.setPi_status(SMFAgentConstants.FAILURE);
									domainData.setPi_remarks(String.valueOf(response.getResponseData().getReturnCode())+"#"+
											 response.getResponseData().getResponsecode()+"::"+response.getResponseData().getRespdescription());
								      logger.info(">>>>> Starting NEIntimation Thread...");
										 Thread invokerthread=new Thread(new NETIARetryAPIInvokerThread(tiaRetryCursorDtlsData,"failure")) ;
                                      invokerthread.start();
										 
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
							
							 domainData=new TIARetryUpdateData();
							 domainData.setPi_transaction_id(tiaRetryCursorDtlsData.getTrans_id());
							 domainData.setPi_network_id(tiaRetryCursorDtlsData.getNetwork_id());
							 domainData.setPi_status(SMFAgentConstants.FAILURE);
							 domainData.setPi_remarks(_exp.getErrorCode()+"#"+_exp.getErrorMessage());
							 
							logger.error(Utilities.getStackTrace(_exp));		
						} catch (Exception _exp) {
							
							 logger.error("YFQueryProcessor ---> Exception");	
							 
							 domainData=new TIARetryUpdateData();
							 domainData.setPi_transaction_id(tiaRetryCursorDtlsData.getTrans_id());
							 domainData.setPi_network_id(tiaRetryCursorDtlsData.getNetwork_id());
							 domainData.setPi_status(SMFAgentConstants.FAILURE);
							 domainData.setPi_remarks(_exp.getLocalizedMessage());
							
							logger.error(Utilities.getStackTrace(_exp));		
							
						}finally{
							
								try {
								 if(domainData!=null)
									statusUpdate(domainData);
								 
								 else{
									 logger.error("YFQueryProcessor -- updateProcessor -domainData is Null");	
								 }
								 if(yfAPIInsertDataObj!=null)
									 yfInsert(yfAPIInsertDataObj);
									 
									 else{
										 logger.error("YFQueryProcessor -- yfAPIInsert -yfAPIInsertDataObj is Null");	
									 }
							} catch (Exception e) {
								logger.error("YFQueryProcessor -- updateProcessor ---> Exception");	
								logger.error(Utilities.getStackTrace(e));	
							}
							
							latch.countDown();
							
						}

		
		
	}

	private void statusUpdate(TIARetryUpdateData domainData)throws Exception {
		
		 
		SPFactory factory = ServiceUtils.executeSPWithOutCommit("pro_tia_notific_update", domainData, domainData);

		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}

		Utilities.commitOrRollback(factory, domainData.getPo_error_code());

		if (logger.isInfoEnabled()) {
			logger.info("Error Code from pro_tia_notific_update  ==>"+ domainData.getPo_error_code());
			logger.info("Error Msg from pro_tia_notific_update  ==>"+ domainData.getPo_error_desc());
		}		
	}
	
	
	private void yfInsert(YFAPIInsertData yfAPIInsertDataObj)throws Exception{
   SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_thiredparty_notification",yfAPIInsertDataObj, yfAPIInsertDataObj);
		
		if(logger.isInfoEnabled()) {
			logger.info( "Error code from DB - YFAPIInsert " + yfAPIInsertDataObj.getPo_error_code() );
		}
		
		Utilities.commitOrRollback(factory, yfAPIInsertDataObj.getPo_error_code());	

		if (logger.isInfoEnabled()) {
			logger.info("Error Code from pro_thiredparty_notification  ==>"+ yfAPIInsertDataObj.getPo_error_code());
			logger.info("Error Msg from pro_thiredparty_notification  ==>"+ yfAPIInsertDataObj.getPo_error_desc());
		}				
		
	
}
}