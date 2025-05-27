package com.xius.smf.job;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;
import org.springframework.util.StringUtils;

import com.xius.smf.domaindata.GetNotificationCursorData;
import com.xius.smf.domaindata.GetNotificationData;
import com.xius.smf.domaindata.GetNotificationsMsisdnsData;
import com.xius.smf.domaindata.ManageNotificationsMsisdnsData;
import com.xius.smf.domaindata.NotificationDetailsCursorData;
import com.xius.smf.domaindata.SendNotificationMsgsData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
import com.xius.smf.utils.XmlResourceBundleParser;

/**
File Name:PostpaidBilGenNotificationTask.java
Description:This class is used as scheduler for pooling db continuously for getting notificatins data.
@Author : Sampath
@Created Date : Jun 14, 2012
@Modified By:
@Modified Date:
@Modifications:
@Reason for Modification
 */
public class PostpaidBilGenNotificationJob implements Job,StatefulJob{
	private static final Logger logger = LogManager.getLogger("PostpaidBilGenNotificationTask");

	private static boolean isRunning = false;

	/* (non-Javadoc)
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
	 * 
	 */

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
	
		logger.info("--- Bil generation Notificaiton job invoked ---@"+new Date());
		if (!isRunning) {
		isRunning = true;
		GetNotificationsMsisdnsData bilNotificationsData 			= null;
		ManageNotificationsMsisdnsData  notiMsisdnsData             = null;

		if(logger.isInfoEnabled())
			logger.info("--- Bil generation Notificaiton job started ---@"+new Date());

		try {
			
			// GetNotificationsMsisdns calling DB to get MSISNDs
			bilNotificationsData = callDBforNotifications();

			logger.info("Notifications MSISDNs count:"+bilNotificationsData.getPo_notification_details().size());

			if(bilNotificationsData != null && bilNotificationsData.getPo_notification_details().size()>0 ){

				List<NotificationDetailsCursorData> cursorDataList = bilNotificationsData.getPo_notification_details();
				notiMsisdnsData  = new ManageNotificationsMsisdnsData();
				
				
				for( NotificationDetailsCursorData cursorData :  cursorDataList){
				
					List<Long> invoicesList  =  new ArrayList<Long>();
					List<Long> msisdnsList   =  new ArrayList<Long>();
					List<Long> remainderList =  new ArrayList<Long>();
					
					try{
						logger.info(" SMSService For :: "+cursorData.getMsisdn_no());
						boolean sendStatus = sendNotificationMsgsToDB(cursorData);
						if(sendStatus){
							
							invoicesList.add(cursorData.getInvoice_id());							
							msisdnsList.add(cursorData.getMsisdn_no());
							remainderList.add(cursorData.getRemindertype());
						}
					
						if(invoicesList.size() > 0 && msisdnsList.size() >0  && remainderList.size()>0)
						{
							
							try{
								notiMsisdnsData.setPi_invoice_id(invoicesList.toArray(new Long[invoicesList.size()]));
								notiMsisdnsData.setPi_msisdn(msisdnsList.toArray(new Long[msisdnsList.size()]));
								notiMsisdnsData.setPi_reminder_type(remainderList.toArray(new Long[remainderList.size()]));
								updateDBBillNotification(notiMsisdnsData); 
							}catch(Exception e){
								logger.error("Exception in updating DB BillNotification Data :"+Utilities.getStackTrace(e));
							}
						}
						
					
					}catch(Exception _ex){

						logger.error("Exception in Sending SMS  :"+Utilities.getStackTrace(_ex));
					}
					finally{
						invoicesList  = null;
						msisdnsList   = null;
						remainderList = null;
					}
				}	

			}else{

				logger.error("Found no data from DB for Bill Generation notificaitons.");

			}

		} catch (Exception e) {
			logger.error("Exception in execute() :"+Utilities.getStackTrace(e));
		} finally {			
			bilNotificationsData = null;
			notiMsisdnsData      = null;
			isRunning = false;
		}
		if(logger.isInfoEnabled())
			logger.info("--- Bil generation Notificaiton job completed ---@"+new Date());
		} else {
			logger.info("Sorry..., previous job still running...");
		}
	}// end of method execute()


	// send notification msgs to db
	
	public boolean sendNotificationMsgsToDB(NotificationDetailsCursorData cursorData){
	
		boolean status = false;
		SendNotificationMsgsData notificationMsgsData = new SendNotificationMsgsData();
		
		String notificationMsg = "" ;
		String sms_ussd_flag   = "";
		String arabic_flag = "" ;
		
		 boolean is_arabicmsg = getLanguageTypeData (cursorData); 
		
		logger.info("getLanguageTypeData :- Sending Notification Language is Arabic::" + is_arabicmsg);
		
		try{
		
		if(is_arabicmsg && cursorData.getLv_notification_type()==0 )
		{
			if(cursorData.getRemindertype() == 1){
				notificationMsg  = getArabicMsg("2");
			}else if(cursorData.getRemindertype() == 2){
				notificationMsg  = getArabicMsg("2");
			}else{
				notificationMsg  = getArabicMsg("1");
			}
			logger.info("notificationMsg  Befor Hexa Covertion::" + notificationMsg);
			arabic_flag="A";
			
		}
		else {	
		if(cursorData.getRemindertype() == 1){
			notificationMsg  = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.SMS_NOTFICATION_1 );
		}else if(cursorData.getRemindertype() == 2){
			
			notificationMsg  = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.SMS_NOTFICATION_2 );
		}else
			notificationMsg  = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.SMS_NOTFICATION_3 );
		}
		
		notificationMsg = StringUtils.replace(notificationMsg,SMFAgentConstants.BILL_AMOUNT,cursorData.getTotal_amount_due() +"");
		notificationMsg = StringUtils.replace(notificationMsg,SMFAgentConstants.MSISDN,cursorData.getMsisdn_no()+"");
		notificationMsg = StringUtils.replace(notificationMsg,SMFAgentConstants.BILL_LAST_DT,cursorData.getPayment_due_date()+"");
		notificationMsg = StringUtils.replace(notificationMsg,SMFAgentConstants.BILL_INVOICE_DT,cursorData.getInvoice_date()+"");
  
		logger.info("***********************::" + notificationMsg);
		
		if(cursorData.getLv_notification_type() == 0){
			sms_ussd_flag = "S";
		}else if(cursorData.getLv_notification_type() == 1){
			sms_ussd_flag = "U";
		}else if(cursorData.getLv_notification_type() == 2){
			sms_ussd_flag = "B";
		}
		
		notificationMsgsData.setPi_network_id(cursorData.getNetwork_id());		
		notificationMsgsData.setPi_msisdn(cursorData.getMsisdn_no());
		notificationMsgsData.setPi_data(notificationMsg);
		notificationMsgsData.setPi_flag(arabic_flag);
		notificationMsgsData.setPi_sms_ussd_flag(sms_ussd_flag);
		
		Long errorCode      = null;
		SPFactory spFactory = null;

			//invoke Stored Procedure.
			spFactory = ServiceUtils.executeSPWithOutCommit("pro_send_notification_msgs", notificationMsgsData, notificationMsgsData);

			if(logger.isInfoEnabled())
				logger.info( "pro_send_notification_msgs Error Code==>"+notificationMsgsData.getPo_error_code());

			errorCode = notificationMsgsData.getPo_error_code();

			//Depending upon the result  either roll back(Failure) or commit(Success)
			Utilities.commitOrRollback(spFactory, errorCode);

			//If return value is zero then success else throwing the error back to user
			if(null != errorCode && errorCode !=0){ 
				//throw Utilities.setRejectDetails(errorCode,null);
				status = false;
				logger.error( ">>> send notification msg failed for the msisdn>>>"+cursorData.getMsisdn_no()+"<<< DB error code["+errorCode+"]");
			}else{
				status = true;
				logger.info( ">>> send notification msg Success for the msisdn>>>"+cursorData.getMsisdn_no());
			}
			

		} catch (SMFAgentException e) {

			logger.error( "send notification msg failed "+Utilities.getStackTrace(e));
		}
		
		catch (Exception e) {

			logger.error( "send notification msg failed "+Utilities.getStackTrace(e));
		}
		

		return status;
		
	}
	/**
	 * This method is used to call db for update the status.
	 * @param tranxNumber
	 * @param status
	 * @param description
	 */
	private void updateDBBillNotification(ManageNotificationsMsisdnsData domainData){

		Long startTime  = System.currentTimeMillis();
		Long[] msisdns = domainData.getPi_msisdn();
		if (msisdns != null) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < msisdns.length; i++) {
				if(logger.isDebugEnabled())
					sb.append(msisdns[i]+" ");					
			}
			logger.debug( ">>> Updating Bill generation status notification for msisdn(s): "+sb.toString());
		}

		Long errorCode = null;
		SPFactory spFactory = null;

		try {

			//invoke Stored Procedure.
			spFactory = ServiceUtils.executeSPWithOutCommit("manage_invoice_notifications", domainData, domainData);

			if(logger.isInfoEnabled())
				logger.info( "manage_invoice_notifications Error Code==>"+domainData.getPo_error_code());

			errorCode = domainData.getPo_error_code();

			//Depending upon the result  either roll back(Failure) or commit(Success)
			Utilities.commitOrRollback(spFactory, errorCode);

			//If return value is zero then success else throwing the error back to user
			if(null != errorCode && errorCode !=0){ 
				//throw Utilities.setRejectDetails(errorCode,null);
				logger.error( ">>> Update failed while updating the status. DB error code["+errorCode+"]");
			}
			if(logger.isInfoEnabled())
				logger.info( ">>> Updated Bill generation status notification.");
		

		} catch (SMFAgentException e) {

			logger.error( "Exception in updateBilGenerationNotification() \n"+Utilities.getStackTrace(e));
		}
		logger.info("BillGenerationNotification Update success"+(int) (System.currentTimeMillis() - startTime)+" ms");
	} // end of method updateNotification
	/**
	 * This method is used to call database procedure for getting the 
	 * notification data
	 * @return
	 */
	private GetNotificationsMsisdnsData callDBforNotifications() {

		if(logger.isDebugEnabled())
			logger.debug( ">>> getting notification msisdns: ");
		//just for safety adding this
		GetNotificationsMsisdnsData bilNotificationsData = new GetNotificationsMsisdnsData();
		try{

			String networkId = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.NETWORKID_PROP );

			/**
			 * Setting the input
			 */

			if(Utilities.isNull(networkId) == false ) {

				bilNotificationsData.setNetwork_id(networkId);
			} else {
				logger.error("No netwrok id found");
				//bilNotificationsData.setPi_network_id(new Long(networkId));
			}
		}catch(Exception e){
			logger.error("Exception while setting the NetworkId in GetNotificationsMsisdnsData"+Utilities.getStackTrace(e));
		}
		try {
			/**
			 * calling db proc using mosf
			 */
			ServiceUtils._executeStoredProcedure("get_notification_msisdns", bilNotificationsData, bilNotificationsData);

		} catch (SMFAgentException e) {
			logger.error("Exception in callDBforNotifications \n"+Utilities.getStackTrace(e));
		}

		return bilNotificationsData;
	} // end of method callDBforNotifications()


	private boolean getLanguageTypeData(NotificationDetailsCursorData ndcData) {
		String LanguageType = "";
		boolean is_arabic= false;
		if(logger.isDebugEnabled())
			logger.debug( ">>> getting LanguageType: ");
		//just for safety adding this
		GetNotificationData notificationsData = new GetNotificationData();
		try{
			String networkId = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.NETWORKID_PROP );
			if(Utilities.isNull(networkId) == false ) {

				notificationsData.setPi_network_id(Long.parseLong(networkId));
				notificationsData.setPi_msisdn_no(ndcData.getMsisdn_no());
				logger.debug(">>>>>> getLanguageTypeData :NetworkID : "+notificationsData.getPi_network_id());
				logger.debug(">>>>>> getLanguageTypeData :MSISDN    : "+notificationsData.getPi_msisdn_no());
				
			} else {
				logger.error("No netwrok id found");
				//bilNotificationsData.setPi_network_id(new Long(networkId));
			}
		}catch(Exception e){
			logger.error("Exception while setting the NetworkId  & MSISDN in GetNotificationData"+Utilities.getStackTrace(e));
		}

		try {
			/**
			 * calling db proc using mosf
			 */
			ServiceUtils._executeStoredProcedure("pro_get_notification_data", notificationsData, notificationsData);
			
			List<GetNotificationCursorData> datalist =  new ArrayList<GetNotificationCursorData>();
				datalist = notificationsData.getNotifCursor();
			for(GetNotificationCursorData data1 : datalist)
			{
				if(null != data1.getSms_notification_lang())
					LanguageType=data1.getSms_notification_lang().toString();
			}
			
			logger.debug(">>>>> getLanguageTypeData :Language_Type : " +LanguageType);
		//	logger.log(BCGLevel.DEBUG,">>>>> getLanguageTypeData :language_id_out**: " +notificationsData.getPo_def_lang_desc());
			
			String sms_languageType = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.SMS_LANGUAGETYPE ); 
			 
			String[] langtype = sms_languageType.split(":");
			 if(langtype[0].equalsIgnoreCase(LanguageType))
			 {
				 is_arabic = true;
			 }
		} catch (SMFAgentException e) {
			logger.error( "Exception in callDBforNotifications \n"+Utilities.getStackTrace(e));
		}

		return is_arabic;
	}
	
	public static String getArabicMsg(String msgid) {

		String msg = null;
		String langid=null;
		langid =  InitiateAll.getSMFProps().getProperty( SMFAgentConstants.SMS_LANGUAGETYPE );
		new XmlResourceBundleParser().buildXmlPropertyMap();
		String[] langtype = langid.split(":");

		if( Utilities.isNull( langid ) == false ) {
			if(langtype[1] .equalsIgnoreCase("arabic")){
				 msg=XmlResourceBundleParser.arabicMap.get(msgid);
			}else{
				msg = XmlResourceBundleParser.englishMap.get(msgid);
			
				}
		   }

		return msg;
	}

}
