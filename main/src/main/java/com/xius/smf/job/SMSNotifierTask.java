package com.xius.smf.job;

import java.math.BigInteger;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.ne.NotificationManagement_xsd.MessageType;
import com.xius.ne.NotificationManagement_xsd.NotifyMessageRequest;
import com.xius.smf.domaindata.SMSNotifierData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.ne.TempMessageInfo;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;

/**
 * @author sumanth.komula
 *
 */
public class SMSNotifierTask {
	private static final Logger logger = LogManager.getLogger(SMSNotifierTask.class.getSimpleName());

	NotifyMessageRequest notifyMessageRequest;
	TempMessageInfo smsData;
	MessageType messageType;
	final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
	ThreadPoolExecutor taskExecutor;
	CountDownLatch latch = null;
	

	/**
	 *This method is used for iteration of records fetched according to configuration from db 
	 *and basing on flag message is sent to ne all the combinations are fetched from property file where 
	 *first one is all zeros and then different combinations are done.
	 *
	 */	
	
	
 public void processSMSNTask(SMSNotifierData notifierData) throws SMFAgentException{
	 
	 logger.info("The execution has reached the task content");
	 String maxThreadsStr =InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SMS_NOTIFIER_MAX_THREAD);
	int maxThreads = Integer.parseInt(maxThreadsStr);
	taskExecutor= new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
	if(null!=notifierData.getPo_msisdn_arr() && notifierData.getPo_msisdn_arr().length>0)
	latch=new CountDownLatch(notifierData.getPo_msisdn_arr().length);
	 
	 for(int iterator=0;iterator<notifierData.getPo_msisdn_arr().length;iterator++){
		 
		 
		 notifyMessageRequest=new NotifyMessageRequest ();
		 smsData=new TempMessageInfo();
		 messageType= new MessageType();
		 
		 messageType.setSyncFlag("A");
		
		
		 
		 if(null!=notifierData.getPo_network_id()[iterator]){
		 messageType.setNetworkId(new BigInteger(notifierData.getPo_network_id()[iterator]+""));
		 smsData.setNetworkId(notifierData.getPo_network_id()[iterator]+"");
		 }
		 
		 if(null!=notifierData.getPo_msisdn_arr()[iterator]){
			 String cCode=Utilities.getPropertyValueForCCLengthCofig(notifierData.getPo_network_id()[iterator]+"");
			
			 if(cCode!=null&& cCode.length()>0 ){
			 String[] cCodearray=cCode.split(",");
			 if(cCodearray.length==2){
	if(notifierData.getPo_msisdn_arr()[iterator].length() > Integer.parseInt(cCodearray[0]) && notifierData.getPo_msisdn_arr()[iterator].startsWith(cCodearray[1])){
	
		String destMsisdn=notifierData.getPo_msisdn_arr()[iterator];
		
		messageType.setDestMSISDNs(destMsisdn.substring(cCodearray[1].length()));
					 
				 }else{
					 messageType.setDestMSISDNs(notifierData.getPo_msisdn_arr()[iterator]); 
				 }
				 
			 }else{
				  logger.info("Configure msisdnlength and CountryCode in property file");	 
			 }
				
			}else{	 
			 messageType.setDestMSISDNs(notifierData.getPo_msisdn_arr()[iterator]);
			}
			 }
		 
		 if(null!=notifierData.getPo_expiration_date_arr()[iterator] && notifierData.getPo_expiration_date_arr()[iterator].length()>0)
			    messageType.setUserDefined2(notifierData.getPo_expiration_date_arr()[iterator]);
			   if(null!=notifierData.getPo_threshold_amnt_arr()[iterator] ) 
			   messageType.setAmount1(notifierData.getPo_threshold_amnt_arr()[iterator]);
			   if(null!=notifierData.getPo_data_arr()[iterator]&& notifierData.getPo_data_arr()[iterator].length()>0)
			   messageType.setUserDefined1(notifierData.getPo_data_arr()[iterator]);
			   
			   if(null!=notifierData.getPo_current_bal_arr()[iterator])
				   messageType.setAmount2(notifierData.getPo_current_bal_arr()[iterator]);
				   
			   
					 
		 if(null!=notifierData.getPo_flag_arr()[iterator] && notifierData.getPo_flag_arr()[iterator].equalsIgnoreCase("E")){
			 
			  logger.info("The Flag is Expiry  Threshold Notification");
		
			  boolean expiryMarketingTextFlag=false; 
	
		
		
   String expiryMarketingText=Utilities.getPropertyValueForExpiryMarketingText(notifierData.getPo_network_id()[iterator]+"");
			
		
			 
		 
		  if(null!=expiryMarketingText && expiryMarketingText.length()> 0){
				 messageType.setUserDefined3(expiryMarketingText);
				 expiryMarketingTextFlag=true;	
		  }
	   String expiryDateFlag=Utilities.getPropertyExpiryDateRecquired(notifierData.getPo_network_id()[iterator]+"");
	   
	   
	   String expiryBalanceFlag=Utilities.getPopertyValueForExpiryBalanceRecquired(notifierData.getPo_network_id()[iterator]+"");		  	
	  	
	   
	   String eventReffCodeForExpiry=Utilities.getEventRefCodeForExpiryNotification(notifierData.getPo_network_id()[iterator]+"");		 
		
	   String[] eventReffCodeArray=eventReffCodeForExpiry.split(",");
	   
	   if(null!=eventReffCodeArray && eventReffCodeArray.length==8){
		   String expiryFlag="0";
		   if(expiryMarketingTextFlag){
			   expiryFlag="1";
		   }
		   
		   String finaldecimal=expiryDateFlag+expiryBalanceFlag+expiryFlag;
		   
			int endDecimal=Integer.parseInt(finaldecimal,2); 
		   if(endDecimal<8){
			   logger.info("The Event Id that has been picked for expiry notification ne execution is"+eventReffCodeArray[endDecimal]);   
			  if(null!=eventReffCodeArray[endDecimal] && eventReffCodeArray[endDecimal].length()>0){
			   messageType.setEventReferenceCode(eventReffCodeArray[endDecimal]);
			  }else{
				  logger.info("event id has been not configured");
					throw Utilities.setSMFAgentException("88888","event id has been not configured");
			  }
		   }else{
			   logger.info("Proper configuration of event ids has to be done");
				throw Utilities.setSMFAgentException("88888","Configure proper event-ids in property file");
		   }		 
	   }else{
		
		logger.info("Proper configuration of event ids has to be done");
		throw Utilities.setSMFAgentException("88888","Configure proper event-ids in property file");
		   
	   }
	   
	  
		 
		 
   }else if(null!=notifierData.getPo_flag_arr()[iterator]&& notifierData.getPo_flag_arr()[iterator].equalsIgnoreCase("T")){
	   logger.info("The Flag is Low Balance Threshold Notification");
	   
	   String expiryLowBalanceMarketingTextFlag="0";
	  
	 String expiryLowBalanceMarketingText=Utilities.getPropertyValueForLowBalanceMarketingText(notifierData.getPo_network_id()[iterator]+"");
			
	  
	  if(null!= expiryLowBalanceMarketingText && expiryLowBalanceMarketingText.length()>0){
				 messageType.setUserDefined3(expiryLowBalanceMarketingText);
				 expiryLowBalanceMarketingTextFlag="1";		
	  } 
			 
	  String expiryDateLowBalFlag=Utilities.getPropertyValueForLowBalanceExpiryDate(notifierData.getPo_network_id()[iterator]+"");		  	
	  	
	   
	   String eventReffCodeForExpiry=Utilities.getEventRefCodeForLowBalanceNotification(notifierData.getPo_network_id()[iterator]+"");		 
	  
	   String[] eventReffCodeForExpiryArray=eventReffCodeForExpiry.split(",");
			 
	   if(null!=eventReffCodeForExpiryArray && eventReffCodeForExpiryArray.length==4){
		  
		   String finaldecimal=expiryDateLowBalFlag+expiryLowBalanceMarketingTextFlag;
		   
			int endDecimal=Integer.parseInt(finaldecimal,2); 
		   if(endDecimal<4){
			   logger.info("The Event Id that has been picked for ne execution for lowBalance Treshold is"+eventReffCodeForExpiryArray[endDecimal]);   
			   if(null!=eventReffCodeForExpiryArray[endDecimal] && eventReffCodeForExpiryArray[endDecimal].length()>0){
				   messageType.setEventReferenceCode(eventReffCodeForExpiryArray[endDecimal]);
				  }else{
					  logger.info("event id has been not configured");
						throw Utilities.setSMFAgentException("88888","event id has been not configured");
				  }
		   }
	   }else{
		   logger.info("Proper configuration of event ids has tobe done");
			throw Utilities.setSMFAgentException("88888","Configure proper event-ids in property file");
	   }
			 
		 }else if(notifierData.getPo_flag_arr()[iterator]== null){
			 String eventReffCode=Utilities.getSMSEventReffCodeForCommonEvent(notifierData.getPo_network_id()[iterator]+"");
			if(null!=eventReffCode &&eventReffCode.length()>0 ){
			 messageType.setEventReferenceCode(eventReffCode);
			}
		 }
		 
		if(notifierData.getPo_network_id()[iterator]!=null){
			String loginpsswd=Utilities.getLoginCredentialsForNE(notifierData.getPo_network_id()[iterator]+"");
		String[] lpsswd= loginpsswd.split(","); 
		if(lpsswd.length==2){
		    messageType.setLoginId(lpsswd[0]);
		    smsData.setLoginId(lpsswd[0]);	
		    
		    messageType.setLoginPassword(lpsswd[1]);
		}else{
			 logger.info("please configure login credentials of ne in property file");
				throw Utilities.setSMFAgentException("88888","please configure login credentials of ne in property file");
			
		}
		
		}
		notifyMessageRequest.setMessageType(messageType);
		 
		taskExecutor.execute(new SMSNotifierProcessor(notifyMessageRequest,smsData,latch)); 
	 }
	 
	 try {
			if (latch != null){
				logger.info("latch count is :: "+latch.getCount() +" So calling latch.await Function" );
				latch.await();
			}
		} catch (InterruptedException e) {
			logger.error("Excepion in await()" + Utilities.getStackTrace(e));
		}
		taskExecutor.shutdown();
		while (!taskExecutor.isTerminated()) {

		}
		latch = null;
		taskExecutor = null;
		
		logger
				.info("SMSNotitfier iteration finished ----------------------------");
		logger
				.info("SMSNotitfierJob processSMSNTask method Ended ----------------------------");	

	 
	 
	 
 }
	
	
}
