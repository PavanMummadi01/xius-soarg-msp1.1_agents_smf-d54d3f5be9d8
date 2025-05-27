package com.xius.smf.job.task;
/**
 *As per the 'REQ1794-Data Threshold Triggering to TT System'   changed the processDataRenewalDataThresholdRecords(),
 * and added  firstUrlCall():-this method used to call the firsturl,call the second url
 * callThresholdFirstUrl():this method is used call the both urls and update the status ,remarks in DB.
 * 
 * Author:premalatha.o
 * date:07/10/16
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.CountDownLatch;

import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.bcgi.util.db.SPFactory;

import com.xius.billing.AccountManagement_xsd.MDNBasedGetNwIdRequest;
import com.xius.billing.AccountManagement_xsd.MDNBasedGetNwIdResponse;
import com.xius.billing.ProductManagement_xsd.ProductPurchageRequest;
import com.xius.billing.ProductManagement_xsd.ProductPurchageResponse;
import com.xius.billing.SubscriberManagement_xsd.GetETNotifInfoRequest;
import com.xius.billing.SubscriberManagement_xsd.GetETNotifInfoResponse;
import com.xius.smf.client.invoker.ATPSubscriptionInvoker;
import com.xius.smf.client.invoker.GetETNotificationInvoker;
import com.xius.smf.client.invoker.MDNbasedGetNwIdInvoker;
import com.xius.smf.client.invoker.PackageNotifyInvoker;
import com.xius.smf.client.invoker.ProductPurchageInvoker;
import com.xius.smf.client.invoker.ThirdPartyNotify;
import com.xius.smf.domaindata.DataRenewalDataThresholdCursorData;
import com.xius.smf.domaindata.DataRenewalDataThresholdData;
import com.xius.smf.domaindata.ThirdPartyNotifyTrackerData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
import com.xius.tia.TIAManagement_xsd.PackageNotifyRequest;
import com.xius.tia.TIAManagement_xsd.PackageNotifyResponse;
import com.xius.xbus.messages.billing.tariff.ATPSubscriptionRequest;
import com.xius.xbus.messages.billing.tariff.ATPSubscriptionResponse;

@SuppressWarnings("static-access")
public class DataRenewalDataThresholdThread implements Runnable{
	private Logger logger = LogManager.getLogger("DataRenewalDataThresholdThread");

	BufferedOutputStream outputStream = null;
	BufferedInputStream inputStream = null;
	GetETNotifInfoResponse getETNotifInfoResponse=null;
	String invocationResponse = null;
	String freeAppPublicityId;
	URL execURL = null;
	int timeout = 0;
	String url = null;
	String eventtype = null;
	String uname;
	String pwd;
	String notifyFlag =null;
	String notifyFor =null;
	String MDNForNotify=null;
	String transStatus=null;
	String resCode=null;
	String notifyRemarks=null;
	
	HttpURLConnection urlConnection = null;
	private DataRenewalDataThresholdCursorData cursorData;
	private CountDownLatch latch;

	public DataRenewalDataThresholdThread(DataRenewalDataThresholdCursorData cursorData) {
		this.cursorData = cursorData;
	}

	public DataRenewalDataThresholdThread(DataRenewalDataThresholdCursorData cursorData, CountDownLatch latch) {
		this.cursorData = cursorData;
		this.latch= latch;
	}
	public void run() {
		try{
			processDataRenewalDataThresholdRecords(cursorData);
		}catch (Exception e) {
			logger.error("Error in DataRenewalDataThresholdThread run():"+Utilities.getStackTrace( e ) );
		}finally {			
			latch.countDown();
		}
	}
	
	/**
	 * 
	 * @param data
	 * @throws SMFAgentException 
	 * @throws ServiceException 
	 */
	
	private void processDataRenewalDataThresholdRecords(DataRenewalDataThresholdCursorData data) throws SMFAgentException, ServiceException {
		eventtype = data.getEventType();
		freeAppPublicityId=InitiateAll.sendNotification(String.valueOf(data.getNetwork_id()));
		logger.info("EventType = "+eventtype + " :::::FreeAppPublicityId = "+freeAppPublicityId);
		if(eventtype!=null && eventtype.equalsIgnoreCase("EXPIRY") && freeAppPublicityId!=null && freeAppPublicityId.length()>0){
				logger.info( "*** *** ***DataRenewalDataThresholdThread: "+freeAppPublicityId+"Publicity attachment is YES");
				logger.info( "*** *** ***DataRenewalDataThresholdThread:EventType is  "+ eventtype +" so calling IBA isSendNotification");
				getETNotifInfoResponse = callIBA_IsSendNotification(data,freeAppPublicityId);
				if(getETNotifInfoResponse!=null && getETNotifInfoResponse.getIsSendNotification().equalsIgnoreCase("Y")){
					logger.info( "*** *** ***DataRenewalDataThresholdThread: getETNotifInfoResponse --- getIsSendNotification is YES ");
					data.setPublicityId(freeAppPublicityId);  //Here we are Changing the ATP Name to Configured(In Properties file) ATP Name.
					callIBAApi_freeAtp(data);  //calling xBUS ATPSubscription API for to AttachATP.
				}else if(getETNotifInfoResponse!=null){
					logger.info( "*** *** ***DataRenewalDataThresholdThread: getETNotifInfoResponse --- getIsSendNotification is NO ");
					callDBToUpdateDataRenewalDataThreshold(data.getNetwork_id(),data.getTransaction_id(),data.getAccount_id(),getETNotifInfoResponse.getRejectReason(),"SUCCESS");
				}else{
					logger.info( "*** *** ***DataRenewalDataThresholdThread: getETNotifInfoResponse --- not Found ");
					callDBToUpdateDataRenewalDataThreshold(data.getNetwork_id(),data.getTransaction_id(),data.getAccount_id(),"GetETNotifInfo Response is not found","FAIL");
				}
		}
		else if(eventtype!=null && eventtype.equalsIgnoreCase("RENEWAL"))	
		{
			url =InitiateAll.getSMFProps().getProperty(data.getEventType()+"_URL" );
			if(url!=null)
			{
			logger.info( "*** *** ***DataRenewalDataThresholdThread: URL to be sent:"+url);
			 uname=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_RENEWAL_NOTIFICATION_JOB_USERNAME);
			 pwd=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_RENEWAL_NOTIFICATION_JOB_PASSWORD);
		 	 firstUrlCall(url,data,uname,pwd);
			}else
			{
				logger.error("Error in DataRenewalDataThresholdThread processDataRenewalDataThresholdRecords RENEWAL  URL is null():" );
				callDBToUpdateDataRenewalDataThreshold(data.getNetwork_id(),data.getTransaction_id(),data.getAccount_id(),"RENEWAL Url is null","FAIL");
			}
		}else if(data.getNotify_api_flag()!=null)
			{   
				notifyFlag= InitiateAll.getSMFProps().getProperty("HelppyNotifyFlag");
				  logger.info("HelppyNotifyFlag value is :: "+notifyFlag);
				  if(notifyFlag!=null && notifyFlag.equalsIgnoreCase("ON")){
					  logger.info("HelppyNotifyFlag is ON ,So calling TIA-PackageNotify API ");
					  notifyFor="2"; //2 for data bucket has to 0 MB  
					  MDNbasedGetNwIdInvoker MDNinvoker =new MDNbasedGetNwIdInvoker();
						
						HeaderDetails headerDetails=new HeaderDetails();
						headerDetails.setNetworkID(data.getNetwork_id());
						headerDetails.setLoginID(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_THRESHOLD_NOTIFICATION_JOB_TTSA_USERNAME));
						headerDetails.setRequestID("1");
						headerDetails.setPassword(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_THRESHOLD_NOTIFICATION_JOB_TTSA_PASSWORD));
						
						MDNBasedGetNwIdRequest MDNrequest=new MDNBasedGetNwIdRequest();
						MDNrequest.setAccountId(data.getAccount_id());
						MDNBasedGetNwIdResponse MDNresponse = null;
						try {
							MDNresponse = MDNinvoker.MDNbasedGetNwId(headerDetails, MDNrequest);
						} catch (SMFAgentException ex) {
							callDBToUpdateDataRenewalDataThreshold(data.getNetwork_id(), data
									.getTransaction_id(), data.getAccount_id(), ex.getErrorCode()+":"+ex.getErrorMessage(), "FAIL");//JOB UPDATE
						}
						if(MDNresponse!=null && MDNresponse.getMSISDN()!=null)
							MDNForNotify=MDNresponse.getMSISDN();
						else
							logger.info("DataRenewalDataThresholdCursorData -- MDNBasedGetNwId API ---> MSISDN is NULL");
						
					  callDBToUpdateDataRenewalDataThreshold(data.getNetwork_id(),
						data.getTransaction_id(), data.getAccount_id(),
						"NOTIFICATION INITIATED", "SUCCESS");// after record  fetch here
															// we are changing the status as SUCCESS
					  Call_TIA_PackageNotifyAPI(data,MDNForNotify);
				  }
				  else if(data.getNotify_api_flag().equalsIgnoreCase("U1")){
					logger.info( "*** *** ***DataRenewalDataThresholdThread::"+data.getNotify_api_flag());
					url =InitiateAll.getSMFProps().getProperty(data.getEventType()+"_URL" );
					if(url!=null)
					{
					logger.info( "*** *** ***DataRenewalDataThresholdThread: URL to be sent:"+url);
					uname=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_THRESHOLD_NOTIFICATION_JOB_USERNAME);
					pwd=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_THRESHOLD_NOTIFICATION_JOB_PASSWORD);
			
					firstUrlCall(url,data,uname,pwd);
					}else
					{
						logger.error("Error in DataRenewalDataThresholdThread processDataRenewalDataThresholdRecords THRESHOLD URL1 is null():" );
						callDBToUpdateDataRenewalDataThreshold(data.getNetwork_id(),data.getTransaction_id(),data.getAccount_id(),"THRESHOLD URL1 is null","FAIL");
			   
					}
				}else if(data.getNotify_api_flag().equalsIgnoreCase("U")){
					logger.info( "*** *** ***DataRenewalDataThresholdThread::"+data.getNotify_api_flag()   );
				       callIBAApi(data);
				}
				else{
					if(data.getNotify_api_flag().equalsIgnoreCase("U2")){
						logger.info( "*** *** ***DataRenewalDataThresholdThread::"+data.getNotify_api_flag());
						url =InitiateAll.getSMFProps().getProperty(data.getEventType()+"_URL2" );
						if(url!=null)
						{
						uname=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_THRESHOLD_NOTIFICATION_JOB_TTSA_USERNAME);
						pwd=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_THRESHOLD_NOTIFICATION_JOB_TTSA_PASSWORD);	
						logger.info( "*** *** ***DataRenewalDataThresholdThread: URL to be sent:"+url);
						firstUrlCall(url,data,uname,pwd);
						}else
						{
							logger.error("Error in DataRenewalDataThresholdThread processDataRenewalDataThresholdRecords THRESHOLD  URL2 is null():" );
							callDBToUpdateDataRenewalDataThreshold(data.getNetwork_id(),data.getTransaction_id(),data.getAccount_id(),"THRESHOLD URL2 is null","FAIL");
				   
						}
					}else
						{
						if(data.getNotify_api_flag().equalsIgnoreCase("B"))
					{
					   logger.info( "*** *** ***DataRenewalDataThresholdThread::"+data.getNotify_api_flag());
				       callThresholdFirstUrl(data);
					}
			     }
			}
			}
	}
	
	private GetETNotifInfoResponse callIBA_IsSendNotification(DataRenewalDataThresholdCursorData data, String freeAppPublicityId)  {
		
		GetETNotifInfoRequest request =new GetETNotifInfoRequest();
			request.setAccountId(String.valueOf(data.getAccount_id()));
			request.setEventType(data.getEventType());
			request.setPublicityId(data.getPublicityId());
			request.setFreepublicityId(freeAppPublicityId);
		GetETNotificationInvoker invoker=new GetETNotificationInvoker();
		
			HeaderDetails headerDetails=new HeaderDetails();
			headerDetails.setNetworkID(data.getNetwork_id());
			headerDetails.setLoginID(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_THRESHOLD_NOTIFICATION_JOB_TTSA_USERNAME));
			headerDetails.setRequestID("1");
			headerDetails.setPassword(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_THRESHOLD_NOTIFICATION_JOB_TTSA_PASSWORD));
			
		try {
			getETNotifInfoResponse=invoker.GetETNotification(headerDetails, request);
		} catch (SMFAgentException ex) {
			logger.error("Error in DataRenewalDataThresholdThread-GetETNotifInfo in exception block ():" );
			logger.error("DataRenewalDataThresholdThread-GetETNotifInfo Error :"+ex.getErrorCode()+"#"+ex.getMessage());
			callDBToUpdateDataRenewalDataThreshold(data.getNetwork_id(), data
					.getTransaction_id(), data.getAccount_id(), ex.getErrorCode()+":"+ex.getErrorMessage(), "FAIL");//JOB UPDATE
		}
		
		return getETNotifInfoResponse;
		
		
	}
	
	private void callIBAApi_freeAtp(DataRenewalDataThresholdCursorData data) {
		ATPSubscriptionRequest request = new ATPSubscriptionRequest();

		String status = null;
		String remarks = null;
		String errorCode = null;
		String errorMessage = null;
		
		request.setChannel("SMFJOB");
		MDNbasedGetNwIdInvoker MDNinvoker =new MDNbasedGetNwIdInvoker();
		
		HeaderDetails headerDetails=new HeaderDetails();
		headerDetails.setNetworkID(data.getNetwork_id());
		headerDetails.setLoginID(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_THRESHOLD_NOTIFICATION_JOB_TTSA_USERNAME));
		headerDetails.setRequestID("1");
		headerDetails.setPassword(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_THRESHOLD_NOTIFICATION_JOB_TTSA_PASSWORD));
		
		MDNBasedGetNwIdRequest MDNrequest=new MDNBasedGetNwIdRequest();
		MDNrequest.setAccountId(data.getAccount_id());
		MDNBasedGetNwIdResponse MDNresponse = null;
		try {
			MDNresponse = MDNinvoker.MDNbasedGetNwId(headerDetails, MDNrequest);
		} catch (SMFAgentException ex) {
			callDBToUpdateDataRenewalDataThreshold(data.getNetwork_id(), data
					.getTransaction_id(), data.getAccount_id(), ex.getErrorCode()+":"+ex.getErrorMessage(), "FAIL");//JOB UPDATE
		}
		if(MDNresponse!=null && MDNresponse.getMSISDN()!=null){
			request.setMsisdn(MDNresponse.getMSISDN());
			MDNForNotify=request.getMsisdn();
		}else
			logger.info("DataRenewalDataThresholdCursorData -- MDNBasedGetNwId API ---> MSISDN is NULL");

		request.setPublicityId(data.getPublicityId()); // FREEATP PublicityID  Name
		request.setServiceFlag("SUBSCRIBED");
		if (data.getTransaction_id() != null)
			request.setTransationId(String.valueOf(data.getTransaction_id()));

		ATPSubscriptionInvoker invoker = new ATPSubscriptionInvoker();
		ATPSubscriptionResponse response = null;
		try {
			response = invoker.atpSubscription(request,
					headerDetails);
			
			if (response!=null && response.getStatusCode().getValue() != null)
				status = response.getStatusCode().getValue().toUpperCase();

			if (response!=null && response.getStatusCode() != null
					&& status.equalsIgnoreCase("success")) {
				status = "SUCCESS";
			} else if (response != null && status.equalsIgnoreCase("ERROR")) {
				status = "FAIL";
				com.xius.xbus.messages.common.ErrorData[] errors = response
						.getErrors();
				for (int i = 0; i < errors.length; i++) {
					errorCode = errors[i].getErrorCode();
					errorMessage = errors[i].getErrorMessage();
					remarks = errorCode + ":" + errorMessage;
				}
			} else {
				remarks = status;
			}
			
		} catch (SMFAgentException ex) {
			logger.error("Error in DataRenewalDataThresholdThread-ATP attachment in exception block ():" );
			  logger.error("DataRenewalDataThresholdThread-ATP attachment Error :"+ex.getErrorCode()+"#"+ex.getMessage());
			callDBToUpdateDataRenewalDataThreshold(data.getNetwork_id(), data
					.getTransaction_id(), data.getAccount_id(), ex.getErrorCode()+":"+ex.getErrorMessage(), "FAIL");//JOB UPDATE
		} catch (ServiceException ex) {
			logger.error("Error in DataRenewalDataThresholdThread-ATP attachment in exception block ():" );
			logger.error("DataRenewalDataThresholdThread-ATP attachment Error :"+ex.getMessage());
			callDBToUpdateDataRenewalDataThreshold(data.getNetwork_id(), data
					.getTransaction_id(), data.getAccount_id(), ex.getMessage(),"FAIL");//JOB UPDATE
		}
		callDBToUpdateDataRenewalDataThreshold(data.getNetwork_id(), data
				.getTransaction_id(), data.getAccount_id(), remarks, status);//JOB UPDATE
		 if(status.equalsIgnoreCase("SUCCESS")){ //If Purchase success only we are calling TIA - PackageNotify API based on HelppyNotifyFlag property
			  notifyFlag = InitiateAll.getSMFProps().getProperty("HelppyNotifyFlag");
			  logger.info("HelppyNotifyFlag value is :: "+notifyFlag);
			  if(notifyFlag!=null && notifyFlag.equalsIgnoreCase("ON")){
				  logger.info("HelppyNotifyFlag is ON ,So calling TIA-PackageNotify API ");
				  notifyFor="1";  //1 For �Free Apps package� has been activated
				  Call_TIA_PackageNotifyAPI(data,MDNForNotify);
			  }else{
				  logger.error("HelppyNotifyFlag is OFF");
			  }
		  }
	}

	private void callIBAApi(DataRenewalDataThresholdCursorData data) {
		ProductPurchageRequest ibarequest=new ProductPurchageRequest();
		String status=null;
		String	remarks=null;
		ProductPurchageInvoker invoker=new ProductPurchageInvoker();
		if (data.getTransaction_id() != null && data.getTransaction_id().SIZE > 0) {
			ibarequest.setExternalTransId(data.getTransaction_id().toString());
		}
		if (data.getAccount_id() != null && data.getAccount_id().SIZE > 0) {
			ibarequest.setAccountId(data.getAccount_id().toString());
		}
		if (data.getMsisdn_no()!= null && data.getMsisdn_no().SIZE > 0) {
			ibarequest.setMSISDN(data.getMsisdn_no().toString());
		}
		if (data.getPublicityId() != null && data.getPublicityId().trim().length() > 0) {
			ibarequest.setProductId(data.getPublicityId());
		}
		
	ProductPurchageResponse ibaresponse=new ProductPurchageResponse();
	try{
		HeaderDetails headerDetails=new HeaderDetails();
		headerDetails.setNetworkID(data.getNetwork_id());
		headerDetails.setLoginID(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_THRESHOLD_NOTIFICATION_JOB_TTSA_USERNAME));
		headerDetails.setRequestID("1");
		headerDetails.setPassword(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_THRESHOLD_NOTIFICATION_JOB_TTSA_PASSWORD));
	ibaresponse=invoker.productPurchage(headerDetails, ibarequest);
	if(ibaresponse!=null){
		
	logger.error("Error in DataRenewalDataThresholdThread processDataRenewalDataThresholdRecords Success:" );
	logger.info(" status  :"+ibaresponse.getProductPurchageData().getResponseCode()+ "      AND remarks:"+ibaresponse.getProductPurchageData().getResponseDescription());
   	if(ibaresponse.getProductPurchageData().getResponseCode().equalsIgnoreCase("0")){
   		status="SUCCESS";
   	}else
   	{
   		status="FAIL";
   	}
	
	remarks =ibaresponse.getProductPurchageData().getResponseCode()+":"+ibaresponse.getProductPurchageData().getResponseDescription();
//	callDBToUpdateDataRenewalDataThreshold(data.getNetwork_id(),data.getTransaction_id(),data.getAccount_id(),ibaresponse.getProductPurchageData().getResponseCode(),ibaresponse.getProductPurchageData().getResponseDescription());	
	}else
		{	logger.info("*** *** ***DataRenewalDataThresholdThread: Response is NULL from :");
			 status="FAIL";
			remarks = "Response is NULL from API";
			logger.info("*** *** ***DataRenewalDataThresholdThread: calling API:");							
		}
      }catch(SMFAgentException exception){
		
		logger.error("Error in DataRenewalDataThresholdThread processDataRenewalDataThresholdRecords in exception block ():" );
		logger.info(" status  :"+exception.getErrorCode()+ "      AND remarks :"+exception.getErrorMessage());
		
		status="FAIL";
		remarks = exception.getErrorCode().toString()+":"+exception.getErrorMessage();
	}
	  catch(Exception e){
		logger.error("Error in DataRenewalDataThresholdThread processDataRenewalDataThresholdRecords in exception block ():" );
		logger.info(" status  :"+e.getMessage()+ "      AND remarks :"+e.getLocalizedMessage());
		status="FAIL";
		remarks =e.getLocalizedMessage();
		
	}
	  callDBToUpdateDataRenewalDataThreshold(data.getNetwork_id(),data.getTransaction_id(),data.getAccount_id(),remarks,status);	
	}

	private void Call_TIA_PackageNotifyAPI(
			DataRenewalDataThresholdCursorData data,String msisdn) {
		 logger.info(" TIA-PackageNotify Start");
		PackageNotifyInvoker  packageNotifyInvoker=new PackageNotifyInvoker();
		PackageNotifyResponse notifyResponse=null;
		HeaderDetails headerDetails=new HeaderDetails();
		headerDetails.setNetworkID(data.getNetwork_id());
		headerDetails.setLoginID(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_THRESHOLD_NOTIFICATION_JOB_TTSA_USERNAME));
		headerDetails.setRequestID("1");
		headerDetails.setPassword(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_THRESHOLD_NOTIFICATION_JOB_TTSA_PASSWORD));
		
		PackageNotifyRequest notifyRequest=new PackageNotifyRequest();
		notifyRequest.setMsisdn(msisdn);
		if(notifyFor!=null){
			notifyRequest.setReason(notifyFor); 
			logger.info("PackageNotify - Reason is "+notifyFor);
		}else {
			logger.info("PackageNotify - Reason is Null");
		}
		try {
			notifyResponse=packageNotifyInvoker.PackageNotify(headerDetails, notifyRequest);
			if(notifyResponse!=null){
				logger.info("Responsecode "
						+ notifyResponse.getResponseData().getResponsecode()
						+ "TransStatus" + notifyResponse.getTransStatus());
				resCode = notifyResponse.getResponseData()
						.getResponsecode();
				transStatus = notifyResponse.getTransStatus();
				notifyRemarks = notifyResponse.getResponseData().getRespdescription();
			}else{
				logger.info("PackageNotify - Reason is Null");
			}
			
			thirdPartyNotifyTracker(data,headerDetails,notifyRemarks);
			
		} catch (SMFAgentException ex) {
			logger.error("Error in DataRenewalDataThresholdThread-PackageNotify in exception block ():" );
			logger.error("DataRenewalDataThresholdThread-PackageNotify Error :"+ex.getErrorCode()+"#"+ex.getMessage());
			
			resCode = SMFAgentConstants.INTERNAL_ERROR_CODE_STR;
			notifyRemarks = ex.getErrorCode()+"#"+ex.getMessage();
			
			thirdPartyNotifyTracker(data,headerDetails,notifyRemarks);
			
		} catch (SOAPException exception) {
			logger.error("Error in DataRenewalDataThresholdThread-PackageNotify in exception block ():" );
			logger.info(" status  :"+exception.getMessage());
			
			resCode = SMFAgentConstants.INTERNAL_ERROR_CODE_STR;
			notifyRemarks = exception.getMessage();
			
			thirdPartyNotifyTracker(data,headerDetails,notifyRemarks);
		}
		 logger.info(" TIA-PackageNotify End");
	}

	private void thirdPartyNotifyTracker(
			DataRenewalDataThresholdCursorData data, HeaderDetails headerDetails, String remarks) {
		
		ThirdPartyNotifyTrackerData notifyTrackerData = new ThirdPartyNotifyTrackerData();
		notifyTrackerData.setPi_account_id(data.getAccount_id());
		notifyTrackerData.setPi_msisdn_no(MDNForNotify);
		notifyTrackerData.setPi_network_id(headerDetails.getNetworkID());
		notifyTrackerData.setPi_notif_trans_id(String.valueOf(data.getTransaction_id()));
		
		if(notifyFor!=null){
			notifyTrackerData.setPi_notification_type(notifyFor);
			if(notifyFor.equalsIgnoreCase("1")){
				notifyTrackerData.setPi_notification_msg("FREEAPP");
			}else if(notifyFor.equalsIgnoreCase("2")){
				notifyTrackerData.setPi_notification_msg("THRESHOLD");
			}
		}
		if(transStatus!=null)
			notifyTrackerData.setPi_trans_status(transStatus);
		if(resCode!=null)
			notifyTrackerData.setPi_response_code(resCode);
		if(notifyRemarks!=null)
			notifyTrackerData.setPi_remarks(notifyRemarks);
		
		ThirdPartyNotify thirdPartyNotify=new ThirdPartyNotify();
		try {
			thirdPartyNotify.thridPartyNotify(notifyTrackerData, headerDetails);
		} catch (SMFAgentException ex) {
			logger.error("Error in DataRenewalDataThresholdThread-thirdPartyNotifyTracker in exception block ():" );
			logger.error("DataRenewalDataThresholdThread-thirdPartyNotifyTracker Error :"+ex.getErrorCode()+"#"+ex.getMessage());
		}
		
		
	}

	/**
	 * 
	 * @param inStream
	 * @return
	 * @throws Exception
	 */
	
	public static String readLines(InputStream inStream) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(inStream));
		String resultString = null;
		StringBuffer strBuffer = new StringBuffer("");
		String strLine = null;
		while ((strLine = in.readLine()) != null) {
			strBuffer.append(strLine);
		}
		if(null != strBuffer && strBuffer.length() > 0) {
			resultString = strBuffer.toString();
		} else {
			resultString = null;
		}
		return resultString;
	}
	
	/**
	 * Update for processed record
	 * @param networkid
	 * @param transaction_id
	 * @param remarks
	 * @param status
	 */
	
	public void callDBToUpdateDataRenewalDataThreshold(Long networkid,Long transaction_id, Long account_id,String remarks, String status) {
		DataRenewalDataThresholdData domainData = new DataRenewalDataThresholdData();
		domainData.setAccount_id(account_id);
		domainData.setPi_network_id(networkid);
		domainData.setTransaction_id(transaction_id);
		domainData.setStatus(status);
		domainData.setRemarks(remarks);
		domainData.setPi_app_id(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.APP_ID_PROP));
		try {
			SPFactory factory = ServiceUtils.executeSPWithOutCommit("pro_lac_sac_status_update", domainData, domainData);
			Utilities.commitOrRollback(factory, domainData.getPo_error_code());
			
			if(logger.isInfoEnabled()) {
				logger.info( "DataRenewalDataThresholdThread:Error Code in pro_lac_sac_status_update==>"+domainData.getPo_error_code());
			}
		} catch (SMFAgentException e) {
			logger.error( "DataRenewalDataThresholdThread:Exception in pro_lac_sac_status_update \n"+Utilities.getStackTrace(e));
		}
	}
	
	
	public DataRenewalDataThresholdData callDBToGetSacLac(DataRenewalDataThresholdCursorData data) {
		DataRenewalDataThresholdData domainData = new DataRenewalDataThresholdData();
		domainData.setPi_network_id(data.getNetwork_id());
		domainData.setAccount_id(data.getAccount_id());
		domainData.setImsi(data.getImsi());
		domainData.setPi_app_id(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.APP_ID_PROP));
		try {
			SPFactory factory = ServiceUtils.executeSPWithOutCommit("pro_get_lac_sac_info", domainData, domainData);
			Utilities.commitOrRollback(factory, domainData.getPo_error_code());
			
			if(logger.isInfoEnabled()) {
				logger.info( "DataRenewalDataThresholdThread:Error Code in pro_get_lac_sac_info==>"+domainData.getPo_error_code());
				logger.info( "DataRenewalDataThresholdThread:LACSAC in pro_get_lac_sac_info==>"+domainData.getLac_sac());
			}
		} catch (SMFAgentException e) {
			logger.error( "DataRenewalDataThresholdThread:Exception in pro_get_lac_sac_info \n"+Utilities.getStackTrace(e));
		}
		return domainData;
	}
	
	
	/**
	 * 
	 * @param url
	 * @param uname
	 * @param pwd
	 * @param data
	 * @return
	 */
	
	public String formatURL(String url,DataRenewalDataThresholdCursorData data,String eventType,String uname,String pwd){
		
		DataRenewalDataThresholdData lacSacData = (DataRenewalDataThresholdData) callDBToGetSacLac(data);
		
		if(eventType.equalsIgnoreCase("THRESHOLD")){
									
			url=url.replace("$UNAME",uname);
			url=url.replace("$PWD",pwd);
			if(data.getTransaction_id() != null){
				url=url.replace("$TRANS_ID",data.getTransaction_id().toString());
			}
			if(data.getMsisdn_no() != null){
				url=url.replace("$MSISDN",data.getMsisdn_no().toString());
			}		
			if(data.getImsi() != null){
				url=url.replace("$IMSI",data.getImsi().toString());
			}
			if(data.getPublicityId() != null){
				url=url.replace("$PUBID",data.getPublicityId().toString());
			}
			if(data.getVolumeTotal() != null){
				url=url.replace("$VT",data.getVolumeTotal().toString());
			}
			if(data.getVolumeRemain() != null){
				url =url.replace("$VR",data.getVolumeRemain().toString());
			}
			if(data.getVolumeUsed() != null){
				url =url.replace("$VU",data.getVolumeUsed().toString());
			}
			if(data.getThreshold() != null){
				url =url.replace("$THRESHOLD",data.getThreshold().toString());
			}
			if(data.getDateTime() != null){
				url =url.replace("$TRXDT",data.getDateTime().toString());
			}
			String[] lacsac = Utilities.splitString(data.getLac_sac(), "#");
			if(lacsac[0] != null){
				url =url.replace("$LAC",lacsac[0]);
			}
			if(lacsac[1] != null){
				url = url.replace("$SAC",lacsac[1]);
			}
			
			//Commented , getLac_sac  getting only SIM as per DB changes,   getting Sac Lac info from DataRenewalDataThresholdNotifJob
			
		/*	if(lacSacData.getLac_sac() != null){
				//getLac_sac  getting only SIM as per DB changes
				String[] lacsac = Utilities.splitString(lacSacData.getLac_sac(), "#");
				
				
				if(lacsac[0] != null){
					url = url.replace("$LAC", lacsac[0]);
				}
				if(lacsac[1] != null){
					url = url.replace("$SAC", lacsac[1]);
				}
				
			}*/
			
			if(lacSacData.getSim() != null){
				url = url.replace("$SIM",lacSacData.getSim().toString());
			}
		}
		if(eventType.equalsIgnoreCase("RENEWAL")){
			
			//http://203.82.85.146/notifications/datarenewal.php??u=$UNAME&p=$PWD&trxid=$TRANS_ID&
			//msisdn=$MSISDN&iccid=$SIM&imsi=$IMSI&pubid=$PUBID&tariffid=$TARIFFID&cur_bal=$CURBAL&trxdt=$TRXDT
			
			
			
			url = url.replace("$UNAME",uname);
			url = url.replace("$PWD",pwd);
			if(data.getTransaction_id() != null){
				url = url.replace("$TRANS_ID", data.getTransaction_id().toString());
			}
			if(data.getMsisdn_no() != null){
				url = url.replace("$MSISDN", data.getMsisdn_no().toString());
			}		
			if(lacSacData.getSim() != null){
				url = url.replace("$SIM", lacSacData.getSim().toString());
			}
			if(data.getImsi() != null){
				url = url.replace("$IMSI", data.getImsi().toString());
			}
			if(data.getPublicityId() != null){
				url = url.replace("$PUBID",data.getPublicityId().toString());
			}
			if(data.getTariffId() != null){
				url = url.replace("$TARIFFID",data.getTariffId().toString());
			}
			if(data.getCurrBalance() != null){
				url = url.replace("$CURBAL",data.getCurrBalance().toString());
			}		
			if(data.getDateTime() != null){
				url = url.replace("$TRXDT",data.getDateTime().toString());
			}	
		}
		
		
		return url;
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	
	public String[] formatReponse(String str){
		
		String[] output = new String[4];
		
		if(str.indexOf("<action>") > 0 && str.indexOf("</action>") > 0){
			output[0] = str.substring((str.indexOf("<action>")+8), str.indexOf("</action>"));
		}else{
			output[0] = null;
		}
		if(str.indexOf("<status>") > 0 && str.indexOf("</status>") > 0){
			output[1] = (str.substring((str.indexOf("<status>")+8), str.indexOf("</status>")).toUpperCase());
		}else{
			output[1] = "FAIL";
		}
		if(str.indexOf("<code>") > 0 && str.indexOf("</code>") > 0){
			output[2] = str.substring((str.indexOf("<code>")+6), str.indexOf("</code>"));
		}else{
			output[2] = "40000";
		}
		if(str.indexOf("<description>") > 0 && str.indexOf("</description>") > 0){
			output[3] = str.substring((str.indexOf("<description>")+13), str.indexOf("</description>"));
		}else{
			output[3] = "No Message from Third Party";
		}
		return output;
	}
	
	
	private void callThresholdFirstUrl(DataRenewalDataThresholdCursorData data)
	{
		String url = null;
		String[] TTResponse = null;
		String eventtype = null;
		
		String status = null;
		String remarks = null;
		try {
			if (data.getEventType() != null) {
				url =InitiateAll.getSMFProps().getProperty(data.getEventType()+"_URL");
				logger.info("*** *** ******************************:"+ url);
				if(url!=null){
				logger.info("*** *** ******************************:"+ data.getEventType());
				eventtype = data.getEventType();
				uname=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_THRESHOLD_NOTIFICATION_JOB_USERNAME);
				pwd=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_THRESHOLD_NOTIFICATION_JOB_PASSWORD);
					 url= formatURL(url,data,eventtype,uname,pwd );
					inputStream=urlConnection(url,data);	
		          invocationResponse=readLines(inputStream);
			if (invocationResponse != null&& invocationResponse.trim().length() > 0) {
				logger.info("*** *** ***DataRenewalDataThresholdThread: invocationResponse from TuneTalk For URL1:"+ invocationResponse);
				TTResponse = formatReponse(invocationResponse);
				remarks = TTResponse[2] + ":" + TTResponse[3];
				status=TTResponse[1];
				logger.info("*** *** ***DataRenewalDataThresholdThread: calling second Url:");
			   		      				
			} else {
				logger.info("*** *** ***DataRenewalDataThresholdThread: invocationResponse is NULL from TuneTalk For URL1:");
				status="FAIL";
				remarks = "Response is NULL from Third Party For URL1";
				logger.info("*** *** ***DataRenewalDataThresholdThread: calling second Url:");							
				}
		
			}else
			{
				logger.error("Error in DataRenewalDataThresholdThread processDataRenewalDataThresholdRecords eventType is null():" );
				status="FAIL";
				remarks = "THRESHOLD URL1 is null";
				logger.info("*** *** ***DataRenewalDataThresholdThread: calling second Url:");
							}
			}else{
			logger.error("Error in DataRenewalDataThresholdThread processDataRenewalDataThresholdRecords eventType is null():" );
			status="FAIL";
			remarks ="EventType is null";
			logger.info("*** *** ***DataRenewalDataThresholdThread: calling second Url:");
			}
			
		callThresholdSecondUrl(data,status,remarks);
			} catch (Exception e) {
			logger.info("************DataRenewalDataThresholdThread:in catch block url1");
			logger.error("Error in ScheduleDataRenewalDataThresholdThread processDataRenewalDataThresholdRecords():"+ Utilities.getStackTrace(e));
			remarks=e.getLocalizedMessage();
			status="FAIL";
		    logger.info("*** *** ***DataRenewalDataThresholdThread: calling second Url:");
		    callThresholdSecondUrl(data,status,remarks);
			} 
	finally {
		try {
			if (outputStream != null) {
				outputStream.close();
			}
			if (inputStream != null) {
				inputStream.close();
			}
			if (urlConnection != null) {
				urlConnection.disconnect();
			}
		} catch (Exception e) {
			logger.error("Error in ScheduleDataRenewalDataThresholdThread processDataRenewalDataThresholdRecords():in closing Streams:"+ Utilities.getStackTrace(e));
		}
	}
	}
	private void callThresholdSecondUrl(DataRenewalDataThresholdCursorData data,String status,String remarks )
	{
		
		String url = null;
		String[] TTSAResponse = null;
		String eventtype = null;
		try{
			if (data.getEventType() != null) {
				url=InitiateAll.getSMFProps().getProperty(data.getEventType()+"_URL2");
				if(url!=null)
				{
				logger.info("*** *** ****************************** For URL2::" + url );
				eventtype = data.getEventType();
				uname=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_THRESHOLD_NOTIFICATION_JOB_TTSA_USERNAME);
				pwd=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_THRESHOLD_NOTIFICATION_JOB_TTSA_PASSWORD);	
			    url = formatURL(url,data,eventtype,uname,pwd);
				inputStream=urlConnection(url,data);				
			  invocationResponse=readLines(inputStream);
				
			
			if (invocationResponse != null&& invocationResponse.trim().length() > 0) {
				logger.info("*** *** ****** *** ***DataRenewalDataThresholdThread: invocationResponse from TuneTalk FOR Seconsd URL2:"+ invocationResponse);
				 TTSAResponse= formatReponse(invocationResponse);
				logger.info(" status  from URL1:"+status+ "      AND remarks from URL1:"+remarks);
				logger.info("process status  from URL2:"+ TTSAResponse[1]+"   AND remarks from URL2::" +  TTSAResponse[2]+ ":"+  TTSAResponse[3]);
				callDBToUpdateDataRenewalDataThreshold(data.getNetwork_id(),data.getTransaction_id(),data.getAccount_id(), remarks+"#" +TTSAResponse[2] + ":"+ TTSAResponse[3], status+"#"+TTSAResponse[1]);
			} else {
				logger.info("*** *** ***DataRenewalDataThresholdThread: invocationResponse is NULL from TuneTalk  For URL2:");
				logger.info(" status  from URL1:"+status+ "      AND remarks from URL1:"+remarks);
				callDBToUpdateDataRenewalDataThreshold(data.getNetwork_id(),data.getTransaction_id(),data.getAccount_id(), remarks+"Response is NULL from Third Party For URL2 ", status+"#"+"FAIL");
			}
				}else{
					logger.error("Error in DataRenewalDataThresholdThread processDataRenewalDataThresholdRecords eventType is null():" );
					logger.info(" status  from URL1:"+status+ "      AND remarks from URL1:"+remarks);
					callDBToUpdateDataRenewalDataThreshold(data.getNetwork_id(),data.getTransaction_id(),data.getAccount_id(),remarks+"#"+"THRESHOLD URL2 is null",status+"#"+"FAIL");
				}
		}
			else{
				logger.error("Error in DataRenewalDataThresholdThread processDataRenewalDataThresholdRecords eventType is null():" );
				logger.info("status  from URL1:"+status+ "      AND remarks from URL1:"+remarks);
				callDBToUpdateDataRenewalDataThreshold(data.getNetwork_id(),data.getTransaction_id(),data.getAccount_id(),remarks+"#"+"EventType is null",status+"#"+"FAIL");
			}
	}
		catch (Exception e) {
			logger.info("*** *** ***DataRenewalDataThresholdThread:in catch block url2");
			logger.info("process status  from URL1:"+status+ "      AND remarks from URL1:"+remarks);
			logger.error("Error in DataRenewalDataThresholdThread processDataRenewalDataThresholdRecords():"+ Utilities.getStackTrace(e));
			callDBToUpdateDataRenewalDataThreshold(data.getNetwork_id(),data.getTransaction_id(),data.getAccount_id() ,remarks+"#"+ e.getLocalizedMessage(),status+"#"+"FAIL" );
		}

			}
	
	public BufferedInputStream  urlConnection(String url,DataRenewalDataThresholdCursorData data) throws IOException 
	  {
			int timeout = 0;
	
			logger.info( "*** *** ***DataRenewalDataThresholdThread: URL to be sent:"+url);
			url=url.replaceAll(" ","%20");
			execURL=new URL(url);
			logger.info( "*** *** ***DataRenewalDataThresholdThread: URL to be senting:"+execURL);
			urlConnection = (HttpURLConnection)execURL.openConnection();
			if(InitiateAll.getSMFProps().getProperty( SMFAgentConstants.DATA_RENEWAL_DATA_THRESHOLD_JOB_URL_TIMEOUT )!= null){
				timeout = Integer.parseInt(InitiateAll.getSMFProps().getProperty( SMFAgentConstants.DATA_RENEWAL_DATA_THRESHOLD_JOB_URL_TIMEOUT ));
			}else{
				//Configuring default value
				timeout = 15000;
			}
			urlConnection.setConnectTimeout(timeout);
			urlConnection.setReadTimeout(timeout);
              urlConnection.setDoOutput(true);
             if(urlConnection.getDoInput()) {
				outputStream = new BufferedOutputStream( urlConnection.getOutputStream());
				outputStream.write(url.getBytes());
				outputStream.flush();
				if(urlConnection.getDoOutput()) {
			  inputStream = new BufferedInputStream(urlConnection.getInputStream());
			   }
				}
				return inputStream;
	  }
	  
public  void firstUrlCall(String url,DataRenewalDataThresholdCursorData data,String uname,String pwd)
{
	try{
		
		logger.info("*** *** ***DataRenewalDataThresholdThread: Event Type received:"+eventtype);
			if(eventtype!= null){
				logger.info( "*** *** ***DataRenewalDataThresholdThread: URL to be sent:"+url);
				eventtype = data.getEventType();
				 url= formatURL(url,data,eventtype,uname,pwd );
					inputStream=urlConnection(url,data);	
		          invocationResponse=readLines(inputStream);
				  				
				if(invocationResponse != null && invocationResponse.trim().length() > 0){
				logger.info( "*** *** ***DataRenewalDataThresholdThread: invocationResponse from TuneTalk:"+invocationResponse);
				String[] outputmsg = formatReponse(invocationResponse);
				callDBToUpdateDataRenewalDataThreshold(data.getNetwork_id(),data.getTransaction_id(),data.getAccount_id(),outputmsg[2]+":"+outputmsg[3],outputmsg[1]);				
				}else{
					logger.info( "*** *** ***DataRenewalDataThresholdThread: invocationResponse is NULL from TuneTalk:");
					callDBToUpdateDataRenewalDataThreshold(data.getNetwork_id(),data.getTransaction_id(),data.getAccount_id(),"Response is NULL from Third Party","FAIL");
				}
			}
			else
			{
				logger.error("Error in DataRenewalDataThresholdThread processDataRenewalDataThresholdRecords eventType is null():" );
				callDBToUpdateDataRenewalDataThreshold(data.getNetwork_id(),data.getTransaction_id(),data.getAccount_id(),"EventType is null","FAIL");
	      }
			
		}catch (Exception e) {
			logger.error("Error in DataRenewalDataThresholdThread processDataRenewalDataThresholdRecords():"+Utilities.getStackTrace( e ) );
			callDBToUpdateDataRenewalDataThreshold(data.getNetwork_id(),data.getTransaction_id(),data.getAccount_id(),e.getLocalizedMessage(),"FAIL");
		} finally {
			try {
				if(outputStream != null){
					outputStream.close();
				}
				if(inputStream != null){
					inputStream.close();
				}		
				if(urlConnection != null){
					urlConnection.disconnect();
				}				
			} catch (Exception e) {
				logger.error("Error in ScheduleDataRenewalDataThresholdThread processDataRenewalDataThresholdRecords():in closing Streams:"+ Utilities.getStackTrace(e));
			}
			
		}

}
}