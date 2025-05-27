//package com.xius.smf.job;
//
//import java.text.ParseException;
//
//import net.bcgi.common.jmon.monitor.BCGLevel;
//import net.bcgi.common.jmon.monitor.BCGLogger;
//
//import org.quartz.CronTrigger;
//import org.quartz.JobDetail;
//import org.quartz.Scheduler;
//import org.quartz.impl.StdSchedulerFactory;
//
//import com.xius.smf.utils.InitiateAll;
//import com.xius.smf.utils.SMFAgentConstants;
//import com.xius.smf.utils.Utilities;
//
//
//public class JobScheduler {
//
//	private static Scheduler schdlr;
//	public boolean isshtdn = false;
//
//	private static BCGLogger logger = BCGLogger.getBCGLogger("JobScheduler");
//
//	public boolean startJobs(String repearInterval) {
//
//		boolean isStarted     		= false;
//
//		try{
//			schdlr = StdSchedulerFactory.getDefaultScheduler();
//			schdlr.start();
//			
//			
//			
//			/* For BULK_INITIATER_RC_SUBSCRIPTION_JOB 
//			 * By Sambasiva Rao Aakula
//			 * Date 060/16/2017
//			 */ 
//			
//			
//			 String bulkInitiaterRCSubscriptionSwitch = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.BULK_INITIATER_RC_SUBSCRIPTION_JOB_SWITCH );
//				
//				if(Utilities.isNull( bulkInitiaterRCSubscriptionSwitch ) == false 	&& bulkInitiaterRCSubscriptionSwitch.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON) ) {
//
//					if(logger.isDebugEnabled())
//						logger.log(BCGLevel.DEBUG, "BULK_INITIATER_RC_SUBSCRIPTION_JOB_SWITCH is on");
//
//					String pattern = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.BULK_INITIATER_RC_SUBSCRIPTION_JOB_PATTERN );
//					if( Utilities.isNull( pattern ) ) {
//						// default trigger value is 0 0/60 * * * ?
//						pattern = SMFAgentConstants.FTP_BULK_SIMS_UPLOAD_DEFAULT_TRIGGER_VAL;
//					}
//					startJobs("BulkInitiaterRCSubscriptionJob", BulkInitiaterRCSubscriptionJob.class, "BulkInitiaterRCSubscriptionJobJobTrigger", pattern, SMFAgentConstants.FTP_BULK_SIMS_UPLOAD_DEFAULT_TRIGGER_VAL);
//				} else {
//
//					if(logger.isDebugEnabled())
//						logger.log(BCGLevel.DEBUG, "BULK_INITIATER_RC_SUBSCRIPTION_JOB_SWITCH is off/null");
//				}
//			
//			
//			
//			
//			 /* For BULKRCSUBSCRIPTION 
//			 * By Sambasiva Rao Aakula
//			 * Date 060/16/2017
//			 * 
//			 */ 
//			
//           String BulkRCSubscriptionSwitch = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.BULK_RC_SUBSCRIPTION_JOB_SWITCH );
//			
//			if(Utilities.isNull( BulkRCSubscriptionSwitch ) == false 	&& BulkRCSubscriptionSwitch.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON) ) {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "BULK_RC_SUBSCRIPTION_JOB_SWITCH is on");
//
//				String pattern = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.BULK_RC_SUBSCRIPTION_JOB_PATTERN );
//				if( Utilities.isNull( pattern ) ) {
//					// default trigger value is 0 0/60 * * * ?
//					pattern = SMFAgentConstants.FTP_BULK_SIMS_UPLOAD_DEFAULT_TRIGGER_VAL;
//				}
//				startJobs("BulkRCSubscriptionJob", BulkRCSubscriptionJob.class, "BulkRCSubscriptionJobJobTrigger", pattern, SMFAgentConstants.FTP_BULK_SIMS_UPLOAD_DEFAULT_TRIGGER_VAL);
//			} else {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "BULK_RC_SUBSCRIPTION_JOB_SWITCH is off/null");
//			}
//			
//			
//			 /* For FTPBulkSIMUploadJOb
//			 * By Sambasiva Rao Aakula
//			 * Date 060/16/2017
//			 * 
//			 */ 
//			
//			
//			
//			String ftpBulkUploadSwitch = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.FTP_BULK_SIMS_UPLOAD_SWITCH );
//			
//			if(Utilities.isNull( ftpBulkUploadSwitch ) == false 	&& ftpBulkUploadSwitch.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON) ) {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "FTP_BULK_SIMS_UPLOAD_SWITCH is on");
//
//				String pattern = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.FTP_BULK_SIMS_UPLOAD_TIMER_PATTERN );
//				if( Utilities.isNull( pattern ) ) {
//
//					// default trigger value is 0 0/60 * * * ?
//					pattern = SMFAgentConstants.FTP_BULK_SIMS_UPLOAD_DEFAULT_TRIGGER_VAL;
//				}
//				startJobs("FTPFileBulkSimUploadJob", FTPFileBulkSimUploadJob.class, "FTPFileBulkSimUploadJobTrigger", pattern, SMFAgentConstants.FTP_BULK_SIMS_UPLOAD_DEFAULT_TRIGGER_VAL);
//			} else {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "FTP_BULK_SIMS_UPLOAD_SWITCH is off/null");
//			}
//			
//			
//			
//
//
//			// Low balance notification job			
//			String isLowBalSwitchOn = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.LOWBAL_NOTIFICATION_SWITCH );
//
//			if(Utilities.isNull( isLowBalSwitchOn ) == false 
//					&& isLowBalSwitchOn.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON) ) {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "LOWBAL_NOTIFICATION_SWITCH is on");
//				String pattern = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.LOW_BALANCE_TIMER_PATTERN );
//				if( Utilities.isNull( pattern ) ) {
//
//					// default trigger value is 0 0/30 * * * ?
//					pattern = SMFAgentConstants.LOWBAL_NOTIF_DEFAULT_TRIGGER_VAL;
//				}
//				startJobs("LowBalanceNotificationJob", BalNotificationJob.class, "balNotifTrigger", pattern, SMFAgentConstants.LOWBAL_NOTIF_DEFAULT_TRIGGER_VAL);
//			} else {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "LOWBAL_NOTIFICATION_SWITCH is off/null");
//			}
//
//
//			 
//			 /* Commenting Expired MSISDINs job because same is moved to IBA
//			  startExpiredMSISDNJob();*/
//			 
//
//			// CUG Debit Job
//
//			String isCUGDebitSwitchOn = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.SCHEDULE_CUG_PARENT_DEBIT_SWITCH );
//			if(Utilities.isNull( isCUGDebitSwitchOn ) == false 
//					&& isCUGDebitSwitchOn.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON) ) {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "SCHEDULE_CUG_PARENT_DEBIT_SWITCH is on");
//
//				String pattern = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.SCHEDULE_CUG_PARENT_DEBIT_TIMER_PATTERN );
//				if( Utilities.isNull( pattern ) ) {
//
//					// default trigger value is 0 0/60 * * * ?
//					pattern = SMFAgentConstants.SCHEDULE_CUG_PARENT_DEBIT_DEFAULT_TRIGGER_VAL;
//				}
//				startJobs("ScheduleCUGDebitJob", ScheduleCUGDebitJob.class, "scheduleCUGDebitCronTrigger", pattern, SMFAgentConstants.SCHEDULE_CUG_PARENT_DEBIT_DEFAULT_TRIGGER_VAL);
//			} else {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "SCHEDULE_CUG_PARENT_DEBIT_SWITCH is off/null");
//			}
//
//
//			//CUG Credit Job;
//
//			String isCUGCreditSwitchOn = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.SCHEDULE_CUG_CHILD_TOPUP_SWITCH );
//			if(Utilities.isNull( isCUGCreditSwitchOn ) == false 
//					&& isCUGCreditSwitchOn.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON) ) {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "SCHEDULE_CUG_CHILD_TOPUP_SWITCH is on");
//
//				String pattern = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.SCHEDULE_CUG_CHILD_TOPUP_TIMER_PATTERN );
//				if( Utilities.isNull( pattern ) ) {
//
//					// default trigger value is 0 0/60 * * * ?
//					pattern = SMFAgentConstants.SCHEDULE_CUG_CHILD_TOPUP_DEFAULT_TRIGGER_VAL;
//				}
//				startJobs("ScheduleCUGTopUpJob", ScheduleCUGTopUpJob.class, "scheduleCUGTopUpCronTrigger", pattern, SMFAgentConstants.SCHEDULE_CUG_CHILD_TOPUP_DEFAULT_TRIGGER_VAL);
//			} else {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "SCHEDULE_CUG_CHILD_TOPUP_SWITCH is off/null");
//			}
//
//			//Bulk Upload Subscriber Job;
//
//			String isBulkUploadSubsSwitchOn = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.BULK_UPLOAD_SUBSCRIBER_SWITCH );
//			if(Utilities.isNull( isBulkUploadSubsSwitchOn ) == false 
//					&& isBulkUploadSubsSwitchOn.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON) ) {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "BULK_UPLOAD_SUBSCRIBER_SWITCH is on");
//
//				String pattern = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.BULK_UPLOAD_SUBSCRIBER_TIMER_PATTERN );
//				if( Utilities.isNull( pattern ) ) {
//
//					// default trigger value is 0 0/60 * * * ?
//					pattern = SMFAgentConstants.BULK_UPLOAD_SUBSCRIBER_DEFAULT_TRIGGER_VAL;
//				}
//				startJobs("BulkUploadSubscriberJob", SubscriberBulkUploadJob.class, "BulkUploadSubscriberTrigger", pattern, SMFAgentConstants.BULK_UPLOAD_SUBSCRIBER_DEFAULT_TRIGGER_VAL);
//			} else {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "BULK_UPLOAD_SUBSCRIBER_SWITCH is off/null");
//			}
//
//
//			//Bulk Upload Bulk ID replacement Job;
//
//			String isBulkIDRpclSwitchOn = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.UPLOAD_BULK_ID_REPLACEMENT_SWITCH );
//			if(Utilities.isNull( isBulkIDRpclSwitchOn ) == false 
//					&& isBulkIDRpclSwitchOn.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON) ) {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "UPLOAD_BULK_ID_REPLACEMENT_SWITCH is on");
//
//				String pattern = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.UPLOAD_BULK_ID_REPLACEMENT_TIMER_PATTERN );
//				if( Utilities.isNull( pattern ) ) {
//
//					// default trigger value is 0 0/60 * * * ?
//					pattern = SMFAgentConstants.UPLOAD_BULK_ID_REPLACEMENT_DEFAULT_TRIGGER_VAL;
//				}
//				startJobs("UploadBulkIDReplacementJob", UploadBulkIDReplacementJob.class, "UploadBulkIDReplacementTrigger", pattern, SMFAgentConstants.UPLOAD_BULK_ID_REPLACEMENT_DEFAULT_TRIGGER_VAL);
//			} else {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "UPLOAD_BULK_ID_REPLACEMENT_SWITCH is off/null");
//			}
//			
//			//Bulk Upload Demo garaphic details Job;
//
//			String isDemographicSwitchOn = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.UPLOAD_DEMOGRAPHIC_DETAILS_SWITCH );
//			if(Utilities.isNull( isDemographicSwitchOn ) == false 
//					&& isDemographicSwitchOn.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON) ) {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "UPLOAD_DEMOGRAPHIC_DETAILS_SWITCH is on");
//
//				String pattern = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.UPLOAD_DEMOGRAPHIC_DETAILS_TIMER_PATTERN );
//				if( Utilities.isNull( pattern ) ) {
//
//					// default trigger value is 0 0/60 * * * ?
//					pattern = SMFAgentConstants.UPLOAD_DEMOGRAPHIC_DETAILS_DEFAULT_TRIGGER_VAL;
//				}
//				startJobs("UploadDemographicDetailsJob", UploadDemographicDetailsJob.class, "UploadDemographicDetailsTrigger", pattern, SMFAgentConstants.UPLOAD_DEMOGRAPHIC_DETAILS_DEFAULT_TRIGGER_VAL);
//			} else {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "UPLOAD_DEMOGRAPHIC_DETAILS_SWITCH is off/null");
//			}
//
//			
//			//Upload Bulk SIM details Job;
//			//this job has been deprecated during tunetalk-adr migration
//			/*String isBulkSIMUploadSwitchOn = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.UPLOAD_BULK_SIM_DETAILS_SWITCH );
//			if(Utilities.isNull( isBulkSIMUploadSwitchOn ) == false 
//					&& isBulkSIMUploadSwitchOn.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON) ) {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "UPLOAD_BULK_SIM_DETAILS_SWITCH is on");
//
//				String pattern = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.UPLOAD_BULK_SIM_DETAILS_TIMER_PATTERN );
//				if( Utilities.isNull( pattern ) ) {
//
//					// default trigger value is 0 0/60 * * * ?
//					pattern = SMFAgentConstants.UPLOAD_BULK_SIM_DETAILS_DEFAULT_TRIGGER_VAL;
//				}
//				startJobs("UploadSIMSJob", UploadSIMSJob.class, "UploadSIMSTrigger", pattern, SMFAgentConstants.UPLOAD_BULK_SIM_DETAILS_DEFAULT_TRIGGER_VAL);
//			} else {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "UPLOAD_BULK_SIM_DETAILS_SWITCH is off/null");
//			}*/
//			
//			//HLR status G1 to AC(ODB Removal) Job;
//
//			String isHLRODBREMOVALSwitchOn = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.HLR_JOB_SWITCH );
//			if(Utilities.isNull( isHLRODBREMOVALSwitchOn ) == false 
//					&& isHLRODBREMOVALSwitchOn.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON) ) {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "HLR_JOB_SWITCH is on");
//
//				String pattern = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.HLR_JOB_TIMER_PATTERN );
//				if( Utilities.isNull( pattern ) ) {
//
//					// default trigger value is 0 0/60 * * * ?
//					pattern = SMFAgentConstants.HLR_DEFAULT_TRIGGER_VAL;
//				}
//				startJobs("HLRJob", HLRJob.class, "HLRJobTrigger", pattern, SMFAgentConstants.HLR_DEFAULT_TRIGGER_VAL);
//			} else {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "HLR_Job_SWITCH is off/null");
//			}
//			//Top-up Notification to Third Party JOB
//			String isTOPUPNOTIFSwitchOn = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.TOPUP_NOTIF_JOB_SWITCH );
//			if(Utilities.isNull( isTOPUPNOTIFSwitchOn ) == false 
//					&& isTOPUPNOTIFSwitchOn.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON) ) {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "TOPUP_NOTIF_JOB_SWITCH is on");
//
//				String pattern = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.TOPUP_NOTIF_JOB_TIMER_PATTERN );
//				if( Utilities.isNull( pattern ) ) {
//
//					// default trigger value is 0 0/60 * * * ?
//					pattern = SMFAgentConstants.TOPUP_NOTIF_JOB_DEFAULT_TIMER_PATTERN;
//				}
//				startJobs("TOPUPNOTIFJob", TopUpNotifJob.class, "TOPUPNOTIFJobTrigger", pattern, SMFAgentConstants.TOPUP_NOTIF_JOB_DEFAULT_TIMER_PATTERN);
//			} else {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "TOPUP_NOTIF_Job_SWITCH is off/null");
//			}
//			
//			//Data Renewal and Data Threshold Notification Invoke ThirdParty  JOB
//			String isDataRenewalSwitchOn = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.DATA_RENEWAL_DATA_THRESHOLD_JOB_SWITCH );
//			if(Utilities.isNull( isDataRenewalSwitchOn ) == false 
//					&& isDataRenewalSwitchOn.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON) ) {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "DATA_RENEWAL_DATA_THRESHOLD_JOB_SWITCH is on");
//
//				String pattern = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.DATA_RENEWAL_DATA_THRESHOLD_JOB_TIMER_PATTERN );
//				if( Utilities.isNull( pattern ) ) {
//
//					// default trigger value is 0 0/60 * * * ?
//					pattern = SMFAgentConstants.DATA_RENEWAL_DATA_THRESHOLD_JOB_DEFAULT_TIMER_PATTERN;
//				}
//				startJobs("DataRenewalDataThresholdNotifJob", DataRenewalDataThresholdNotifJob.class, "DataRenewalDataThresholdNotifJobTrigger", pattern, SMFAgentConstants.TOPUP_NOTIF_JOB_DEFAULT_TIMER_PATTERN);
//			} else {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "DATA_RENEWAL_DATA_THRESHOLD_JOB_SWITCH is off/null");
//			}
//			//Added by sampath for TTADR as part of SMFagent 1.1.0.0 
//			//Postpaid Bill generation notification 
//			String ppBillGenSwitchOn = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.POSTPAID_BILL_GEN_NOTIFY_JOB_SWITCH );
//			if(Utilities.isNull( ppBillGenSwitchOn ) == false 
//					&& ppBillGenSwitchOn.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON) ) {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "POSTPAID_BILL_GEN_NOTIFY_JOB_SWITCH is on");
//
//				String pattern = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.POSTPAID_BILL_GEN_NOTIFY_JOB_TIMER_PATTERN );
//				if( Utilities.isNull( pattern ) ) {
//
//					// default trigger value is 0 0/60 * * * ?
//					pattern = SMFAgentConstants.POSTPAID_BILL_GEN_NOTIFY_JOB_DEFAULT_TIMER_PATTERN;
//				}
//				startJobs("PostpaidBilGenNotificationJob", PostpaidBilGenNotificationJob.class, "PostPaidBillNotifJobTrigger", pattern, SMFAgentConstants.POSTPAID_BILL_GEN_NOTIFY_JOB_TIMER_PATTERN);
//			} else {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "POSTPAID_BILL_GEN_NOTIFY_JOB_SWITCH is off/null");
//			}
//			
//			
//			
//			String hlrStateChangeNotifySwitch=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.HLR_STATECHANGE_NOTIFY_JOB_SWITCH);
//			
//			if(Utilities.isNull( hlrStateChangeNotifySwitch ) == false && hlrStateChangeNotifySwitch.equalsIgnoreCase("ON"))
//			{
//				
//				String pattern=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.HLR_STATECHANGE_NOTIFY_JOB_PATTERN);
//				
//				startJobs("HlrStateChangeNotifyJob",HlrStateChangeNotifyJob.class,"HlrStateChangeNotifyJobTrigger",pattern,SMFAgentConstants.HLR_STATECHANGE_NOTIFY_JOB_PATTERN);
//				
//			}else
//			{
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "HLR_STATECHANGE_NOTIFY_JOB_SWITCH is off/null");
//			}
//
//			
//			
//			String changeMSISDNJobSwitch=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.CHANGEMSISDN_RETRY_JOB_SWITCH);
//			
//			if(Utilities.isNull( changeMSISDNJobSwitch ) == false && changeMSISDNJobSwitch.equalsIgnoreCase("ON"))
//			{
//				
//				String pattern=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.CHANGEMSISDN_RETRY_JOB_PATTERN);
//				
//				startJobs("ChangeMSISDNRetryJob",ChangeMSISDNRetryJob.class,"ChangeMSISDNRetryJobTrigger",pattern,SMFAgentConstants.CHANGEMSISDN_RETRY_JOB_PATTERN);
//				
//			}else
//			{
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "CHANGEMSISDN_RETRY_JOB_SWITCH is off/null");
//			}
//			
//			String SimSwapJobSwitch=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SIMSWAP_RETRY_JOB_SWITCH);
//			
//			if(Utilities.isNull( SimSwapJobSwitch ) == false && SimSwapJobSwitch.equalsIgnoreCase("ON"))
//			{
//				
//				String pattern=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SIMSWAP_RETRY_JOB_PATTERN);
//				
//				startJobs("SimSwapRetryJob",SimSwapRetryJob.class,"SimSwapRetryJobTrigger",pattern,SMFAgentConstants.SIMSWAP_RETRY_JOB_PATTERN);
//				
//			}else
//			{
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "SIMSWAP_RETRY_JOB_SWITCH is off/null");
//			}
//
//			
//			
//			String StateChangeRetryJobSwitch=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.STATECHANGE_RETRY_JOB_SWITCH);
//			
//			if(Utilities.isNull( StateChangeRetryJobSwitch ) == false && StateChangeRetryJobSwitch.equalsIgnoreCase("ON"))
//			{
//				
//				String pattern=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.STATECHANGE_RETRY_JOB_PATTERN);
//				
//				startJobs("StateChangeRetryJob",StateChangeRetryJob.class,"StateChangeRetryJobTrigger",pattern,SMFAgentConstants.STATECHANGE_RETRY_JOB_PATTERN);
//				
//			}else
//			{
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "STATECHANGE_RETRY_JOB_SWITCH is off/null");
//			}
//
//			
//			
//			
//			String StateChangeExpiryJobSwitch=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.STATECHANGE_EXPIRY_JOB_SWITCH);
//			
//			
//			if(Utilities.isNull( StateChangeExpiryJobSwitch ) == false && StateChangeExpiryJobSwitch.equalsIgnoreCase("ON"))
//			{
//				
//				String pattern=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.STATECHANGE_EXPIRY_JOB_PATTERN);
//				
//				startJobs("StateChangeExpiryJob",StateChangeExpiryJob.class,"StateChangeExpiryJobTrigger",pattern,SMFAgentConstants.STATECHANGE_EXPIRY_JOB_PATTERN);
//				
//			}else
//			{
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "STATECHANGE_EXPIRY_JOB_SWITCH is off/null");
//			}
//			
//			String StateChangeExpiryRetryJobSwitch=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.STATECHANGE_EXPIRY_RETRY_JOB_SWITCH);
//			
//			
//			if(Utilities.isNull( StateChangeExpiryRetryJobSwitch ) == false && StateChangeExpiryRetryJobSwitch.equalsIgnoreCase("ON"))
//			{
//				
//				String pattern=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.STATECHANGE_EXPIRY_RETRY_JOB_PATTERN);
//				
//				startJobs("StateChangeExpiryRetryJob",StateChangeExpiryRetryJob.class,"StateChangeExpiryRetryJobTrigger",pattern,SMFAgentConstants.STATECHANGE_EXPIRY_RETRY_JOB_PATTERN);
//				
//			}else
//			{
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "STATECHANGE_EXPIRY_RETRY_JOB_SWITCH is off/null");
//			}
//			
//			
//			
//			
//			String retryFromSMFJobSwitch=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.RETRY_FROM_SMF_JOB_SWITCH);
//			
//			
//			if(Utilities.isNull( retryFromSMFJobSwitch ) == false && retryFromSMFJobSwitch.equalsIgnoreCase("ON"))
//			{
//				
//				String pattern=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.RETRY_FROM_SMF_JOB_PATTERN);
//				
//				startJobs("RetryFromSMFJob",RetryFromSMFJob.class,"RetryFromSMFJobTrigger",pattern,SMFAgentConstants.RETRY_FROM_SMF_JOB_PATTERN);
//				
//			}else
//			{
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "RETRY_FROM_SMF_JOB_SWITCH is off/null");
//			}
//			
//			
//			
//			String bulkAtpsubsJobSwitch=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_ATP_SUBSCRIPTION_JOB_SWITCH);
//			
//			
//			if(Utilities.isNull( bulkAtpsubsJobSwitch ) == false && bulkAtpsubsJobSwitch.equalsIgnoreCase("ON"))
//			{
//				
//				String pattern=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_ATP_SUBSCRIPTION_JOB_PATTERN);
//				
//				startJobs("bulkAtpsubsJob",BulkAtpsubsJob.class,"bulkAtpsubsJobTrigger",pattern,SMFAgentConstants.BULK_ATP_SUBSCRIPTION_JOB_PATTERN);
//				
//			}else
//			{
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "BULK_ATP_SUBSCRIPTION_JOB_SWITCH is off/null");
//			}
//			
//			
//			
//			// BulkUpload SIMs for managementui details Job;
//
//			String isSIMsUploadSwitchOn = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.BULK_SIMS_UPLOAD_DETAILS_SWITCH );
//			if(Utilities.isNull( isSIMsUploadSwitchOn ) == false 
//					&& isSIMsUploadSwitchOn.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON) ) {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "BULK_SIMS_UPLOAD_DETAILS_SWITCH is on");
//
//				String pattern = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.BULK_SIMS_UPLOAD_DETAILS_TIMER_PATTERN );
//				if( Utilities.isNull( pattern ) ) {
//
//					// default trigger value is 0 0/60 * * * ?
//					pattern = SMFAgentConstants.BULK_SIMS_UPLOAD_DETAILS_DEFAULT_TRIGGER_VAL;
//				}
//				startJobs("BulkUploadSIMSJob", BulkUploadSIMsJob.class, "BulkUploadSIMSTrigger", pattern, SMFAgentConstants.BULK_SIMS_UPLOAD_DETAILS_DEFAULT_TRIGGER_VAL);
//			} else {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "BULK_SIMS_UPLOAD_DETAILS_SWITCH is off/null");
//			}
//			
//			String ispostpaidSIMsUploadSwitchOn = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.POSTPAID_BULK_SIMS_UPLOAD_DETAILS_SWITCH );
//			if(Utilities.isNull( ispostpaidSIMsUploadSwitchOn ) == false 
//					&& ispostpaidSIMsUploadSwitchOn.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON) ) {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "POSTPAID_BULK_SIMS_UPLOAD_DETAILS_SWITCH is on");
//
//				String pattern = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.POSTPAID_BULK_SIMS_UPLOAD_DETAILS_TIMER_PATTERN );
//				if( Utilities.isNull( pattern ) ) {
//
//					// default trigger value is 0 0/60 * * * ?
//					pattern = SMFAgentConstants.POSTPAID_BULK_SIMS_UPLOAD_DETAILS_DEFAULT_TRIGGER_VAL;
//				}
//				startJobs("PostpaidBulkUploadSIMsJob", PostpaidBulkUploadSIMsJob.class, "PostpaidBulkUploadSIMSTrigger", pattern, SMFAgentConstants.POSTPAID_BULK_SIMS_UPLOAD_DETAILS_DEFAULT_TRIGGER_VAL);
//			} else {
//
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "POSTPAID_BULK_SIMS_UPLOAD_DETAILS_SWITCH is off/null");
//			}
//			
//			
//	           String bulktpsubsJobSwitch=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_TP_SUBSCRIPTION_JOB_SWITCH);
//				
//				
//				if(Utilities.isNull( bulktpsubsJobSwitch ) == false && bulktpsubsJobSwitch.equalsIgnoreCase("ON"))
//				{
//					
//					String pattern=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_TP_SUBSCRIPTION_JOB_PATTERN);
//					
//					startJobs("bulktpsubsJob",BulkTpSubsJob.class,"bulktpsubsJobTrigger",pattern,SMFAgentConstants.BULK_TP_SUBSCRIPTION_JOB_PATTERN);
//					
//				}else
//				{
//					if(logger.isDebugEnabled())
//						logger.log(BCGLevel.DEBUG, "BULK_TP_SUBSCRIPTION_JOB_SWITCH is off/null");
//				}
//				
//				String sorianaRetryJobSwitch=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SORIANA_RETRY_JOB_SWITCH);
//				
//				
//				if(Utilities.isNull( sorianaRetryJobSwitch ) == false && sorianaRetryJobSwitch.equalsIgnoreCase("ON"))
//				{
//					
//					String pattern=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SORIANA_RETRY_JOB_PATTERN);
//					
//					startJobs("sorianaRetryJob",SorianaRetryJob.class,"sorianaRetryJobTrigger",pattern,SMFAgentConstants.SORIANA_RETRY_JOB_PATTERN);
//					
//				}else
//				{
//					if(logger.isDebugEnabled())
//						logger.log(BCGLevel.DEBUG, "SORIANA_RETRY_JOB_SWITCH is off/null");
//				}
//				
//				
//				String thresholdLimitMonitoringJobSwitch=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.THRESHOLD_LIMIT_MONITORING_JOB_SWITCH);
//				
//				
//				if(Utilities.isNull( thresholdLimitMonitoringJobSwitch ) == false && thresholdLimitMonitoringJobSwitch.equalsIgnoreCase("ON"))
//				{
//					
//					if(logger.isDebugEnabled())
//						logger.log(BCGLevel.DEBUG, "THRESHOLD_LIMIT_MONITORING_JOB_SWITCH is on");
//					
//					String pattern=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.THRESHOLD_LIMIT_MONITORING_JOB_PATTERN);
//					
//					startJobs("thresholdLimitJob",ThresholdLimitJob.class,"thresholdLimitJobTrigger",pattern,SMFAgentConstants.THRESHOLD_LIMIT_MONITORING_JOB_PATTERN);
//					
//				}else
//				{
//					if(logger.isDebugEnabled())
//						logger.log(BCGLevel.DEBUG, "THRESHOLD_LIMIT_MONITORING_JOB_SWITCH is off/null");
//				}
//				
//				
//
//				  String bulkcreditJobSwitch=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_CREDIT_JOB_SWITCH);
//					
//					
//					if(Utilities.isNull( bulkcreditJobSwitch ) == false && bulkcreditJobSwitch.equalsIgnoreCase("ON"))
//					{
//						
//						String pattern=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_CREDIT_JOB_PATTERN);
//						
//						startJobs("bulkcreditJob",BulkCreditJob.class,"bulkcreditJobTrigger",pattern,SMFAgentConstants.BULK_CREDIT_JOB_PATTERN);
//						
//					}else
//					{
//						if(logger.isDebugEnabled())
//							logger.log(BCGLevel.DEBUG, "BULK_CREDIT_JOB_SWITCH is off/null");
//					}
//					
//					
//					
//					 String bulkSplcreditJobSwitch=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_SPECIAL_CREDIT_JOB_SWITCH);
//						
//						
//						if(Utilities.isNull( bulkSplcreditJobSwitch ) == false && bulkSplcreditJobSwitch.equalsIgnoreCase("ON"))
//						{
//							
//							String pattern=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_SPECIAL_CREDIT_JOB_PATTERN);
//							
//							startJobs("bulkSplcreditJob",BulkSplCreditJob.class,"bulkSplcreditJobTrigger",pattern,SMFAgentConstants.BULK_SPECIAL_CREDIT_JOB_PATTERN);
//							
//						}else
//						{
//							if(logger.isDebugEnabled())
//								logger.log(BCGLevel.DEBUG, "BULK_SPECIAL_CREDIT_JOB_SWITCH is off/null");
//						}
//						
//						
//						 String bulkDebitJobSwitch=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_DEBIT_JOB_SWITCH);
//							
//							
//							if(Utilities.isNull( bulkDebitJobSwitch ) == false && bulkDebitJobSwitch.equalsIgnoreCase("ON"))
//							{
//								
//								String pattern=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_DEBIT_JOB_PATTERN);
//								
//								startJobs("bulkDebitJob",BulkDebitJob.class,"bulkDebitJobTrigger",pattern,SMFAgentConstants.BULK_DEBIT_JOB_PATTERN);
//								
//							}else
//							{
//								if(logger.isDebugEnabled())
//									logger.log(BCGLevel.DEBUG, "BULK_DEBIT_JOB_SWITCH is off/null");
//							}
//			
//			
//							
//							String paytmtxstatusretryJobSwitch=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.PAYTM_TX_STATUS_RETRY_JOB_SWITCH);
//							
//							
//							if(Utilities.isNull( paytmtxstatusretryJobSwitch ) == false && paytmtxstatusretryJobSwitch.equalsIgnoreCase("ON"))
//							{
//								
//								String pattern=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.PAYTM_TX_STATUS_RETRY_JOB_PATTERN);
//								
//								startJobs("PaytmTxStatusRetryJob",PaytmTxStatusRetryJob.class,"PaytmTxStatusRetryJobTrigger",pattern,SMFAgentConstants.PAYTM_TX_STATUS_RETRY_JOB_PATTERN);
//								
//							}else
//							{
//								if(logger.isDebugEnabled())
//									logger.log(BCGLevel.DEBUG, "PAYTM_TX_STATUS_RETRY_JOB_SWITCH is off/null");
//							}
//							
//							
//							String bulkActDeactJobSwitch=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_ACT_DEACT_JOB_SWITCH);
//							
//							
//							if(Utilities.isNull( bulkActDeactJobSwitch ) == false && bulkActDeactJobSwitch.equalsIgnoreCase("ON"))
//							{
//								
//								String pattern=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_ACT_DEACT_JOB_PATTERN);
//								
//								startJobs("BulkActDeactJob",BulkActDeactJob.class,"BulkActDeactJobTrigger",pattern,SMFAgentConstants.BULK_ACT_DEACT_JOB_PATTERN);
//								
//							}else
//							{
//								if(logger.isDebugEnabled())
//									logger.log(BCGLevel.DEBUG, "BULK_ACT_DEACT_JOB_SWITCH is off/null");
//							}	
//							
//							
//							
//							String bulkCorpRCTJobSwitch=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_CORP_RC_SUBSCRIPTION_JOB_SWITCH);
//							
//							
//							if(Utilities.isNull( bulkCorpRCTJobSwitch ) == false && bulkCorpRCTJobSwitch.equalsIgnoreCase("ON"))
//							{
//								
//								String pattern=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_CORP_RC_SUBSCRIPTION_JOB_PATTERN);
//								
//								startJobs("BulkCorpRctSubJob",BulkCorpRctSubJob.class,"BulkCorpRctSubJobTrigger",pattern,SMFAgentConstants.BULK_CORP_RC_SUBSCRIPTION_JOB_PATTERN);
//								
//							}else
//							{
//								if(logger.isDebugEnabled())
//									logger.log(BCGLevel.DEBUG, "BULK_CORP_RC_SUBSCRIPTION_JOB_SWITCH is off/null");
//							}
//							
//							
//                     String DATAJobSwitch=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_ENABLE_DISABLE_JOB_SWITCH);
//							
//							
//							if(Utilities.isNull( DATAJobSwitch ) == false && DATAJobSwitch.equalsIgnoreCase("ON"))
//							{
//								
//								String pattern=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_ENABLE_DISABLE_JOB_PATTERN);
//								
//								startJobs("DataEnableDesableJob",DataEnableDisableJob.class,"DataEnableDesableJobTrigger",pattern,SMFAgentConstants.DATA_ENABLE_DISABLE_JOB_PATTERN);
//								
//							}else
//							{
//								if(logger.isDebugEnabled())
//									logger.log(BCGLevel.DEBUG, "DATA_ENABLE_DESABLE_JOB_SWITCH is off/null");
//							}
//							
//							
//							
//		                     String UsageNotifyJobSwitch=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.USAGE_THRESHOLD_LIMITS_NOTIFY_JOB_SWITCH);
//									
//									
//									if(Utilities.isNull( DATAJobSwitch ) == false && UsageNotifyJobSwitch.equalsIgnoreCase("ON"))
//									{
//										
//										String pattern=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.USAGE_THRESHOLD_LIMITS_NOTIFY_JOB_PATTERN);
//										
//										startJobs("UsageThresholdLimitNotifyJob",UsageThresholdLimitNotifyJob.class,"UsageThresholdLimitNotifyJob",pattern,SMFAgentConstants.USAGE_THRESHOLD_LIMITS_NOTIFY_JOB_PATTERN);
//										
//									}else
//									{
//										if(logger.isDebugEnabled())
//											logger.log(BCGLevel.DEBUG, "USAGE_THRESHOLD_LIMITS_NOTIFY_JOB_SWITCH is off/null");
//									}
//		/**
//		 * added by shashidhar.P on 26July,2019							
//		 */
//									
//			String fluSwitch = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.FIRST_LU_PROCESS_JOB_SWITCH);
//
//			if (Utilities.isNull(fluSwitch) == false&& fluSwitch.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON)) {
//
//				if (logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG,"FIRST_LU_PROCESS_JOB_SWITCH is on");
//
//				String pattern = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.FIRST_LU_PROCESS_JOB_SWITCH_TIMER_PATTERN);
//				if (Utilities.isNull(pattern)) {
//					// default trigger value is 0 0/60 * * * ?
//					pattern = SMFAgentConstants.FIRST_LU_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL;
//				}
//				startJobs("FirstLuProcessJob",FirstLuProcessJob.class,"FirstLuProcessJobJobTrigger",
//						pattern,SMFAgentConstants.FIRST_LU_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL);
//			} else {
//				if (logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG,"FIRST_LU_PROCESS_JOB_SWITCH is off/null");
//			}
//			
//			/**
//			 * added by shashidhar.P on 18thFEB,2020							
//			 */
//										
//				String yfAPISwitch = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.YF_API_PROCESS_JOB_SWITCH);
//
//				if (Utilities.isNull(yfAPISwitch) == false&& yfAPISwitch.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON)) {
//
//					if (logger.isDebugEnabled())
//						logger.log(BCGLevel.DEBUG,"YF_API_PROCESS_JOB_SWITCH is on");
//
//					String pattern = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.YF_API_PROCESS_JOB_SWITCH_TIMER_PATTERN);
//					if (Utilities.isNull(pattern)) {
//						// default trigger value is 0 0/60 * * * ?
//						pattern = SMFAgentConstants.YF_API_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL;
//					}
//					startJobs("YFAPIProcessJob",YFAPIProcessJob.class,"YFAPIProcessJobJobTrigger",
//							pattern,SMFAgentConstants.YF_API_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL);
//				} else {
//					if (logger.isDebugEnabled())
//						logger.log(BCGLevel.DEBUG,"YF_API_PROCESS_JOB_SWITCH is off/null");
//				}
//			
//				/**
//				 * added by shashidhar.P on 11thMar,2020							
//				 */	
//			String isTTPCRFSwitchOn = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.PCRF_POLICY_TRACKER_JOB_SWITCH );
//				if(Utilities.isNull( isTTPCRFSwitchOn ) == false 
//						&& isTTPCRFSwitchOn.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON) ) {
//
//					if(logger.isDebugEnabled())
//						logger.log(BCGLevel.DEBUG, "PCRF_POLICY_TRACKER_JOB_SWITCH is on");
//
//					String pattern = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.PCRF_POLICY_TRACKER_JOB_PATTERN );
//					if( Utilities.isNull( pattern ) ) {
//
//						// default trigger value is 0 0/60 * * * ?
//						pattern = SMFAgentConstants.PCRF_POLICY_TRACKER_JOB_PATTERN;
//					}
//					startJobs("TTPCRFJob", TTPCRFJob.class, "TTPCRFJobTrigger", pattern, SMFAgentConstants.PCRF_POLICY_TRACKER_JOB_PATTERN);
//				} else {
//
//					if(logger.isDebugEnabled())
//						logger.log(BCGLevel.DEBUG, "PCRF_POLICY_TRACKER_JOB_SWITCH is off/null");
//				}
//				
//				/**
//				 * added by maheswar on 09thsep,2021							
//				 */	
//				String isVOLTESwitchOn = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.VOLTE_JOB_SWITCH );
//				if(Utilities.isNull( isVOLTESwitchOn ) == false 
//						&& isVOLTESwitchOn.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON) ) {
//
//					if(logger.isDebugEnabled())
//						logger.log(BCGLevel.DEBUG, "VOLTE_JOB_SWITCH is on");
//
//					String pattern = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.VOLTE_JOB_PATTERN );
//					if( Utilities.isNull( pattern ) ) {
//
//						// default trigger value is 0 0/60 * * * ?
//						pattern = SMFAgentConstants.VOLTE_JOB_PATTERN;
//					}
//					startJobs("VOLTEJob", VOLTEJob.class, "VOLTEJobTrigger", pattern, SMFAgentConstants.VOLTE_JOB_PATTERN);
//				} else {
//
//					if(logger.isDebugEnabled())
//						logger.log(BCGLevel.DEBUG, "VOLTE_JOB_SWITCH is off/null");
//				}
//				
//				/**
//				 * added by sumanth.k for RetryProcessOfYF						
//				 */
//			String isYFRetrySwitchOn = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.TIA_API_RETRY_PROCESS_JOB_SWITCH);
//				if(Utilities.isNull( isYFRetrySwitchOn ) == false 
//						&& isYFRetrySwitchOn.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON) ) {
//
//					if(logger.isDebugEnabled())
//						logger.log(BCGLevel.DEBUG, "TIA_API_RETRY_PROCESS_JOB_SWITCH is on");
//
//					String pattern = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.TIA_API_RETRY_PROCESS_JOB_SWITCH_TIMER_PATTERN );
//					if( Utilities.isNull( pattern ) ) {
//
//						// default trigger value is 0 0/60 * * * ?
//						pattern = SMFAgentConstants.TIA_API_RETRY_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL;
//					}
//					startJobs("TIARETRY", TIARetryJob.class, "TIAAPIRETRYJobTrigger", pattern, SMFAgentConstants.TIA_API_RETRY_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL);
//				} else {
//
//					if(logger.isDebugEnabled())
//						logger.log(BCGLevel.DEBUG, "TIA_API_RETRY_PROCESS_JOB_SWITCH is off/null");
//				}
//				
//				/**
//				 * added by sumanth.k for SMSNotifierJoB						
//				 */
//			String smsNotifierSwitchOn = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SMS_NOTIFIER_PROCESS_JOB_SWITCH);
//				if(Utilities.isNull(smsNotifierSwitchOn) == false 
//						&& smsNotifierSwitchOn.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON) ) {
//
//					if(logger.isDebugEnabled())
//						logger.log(BCGLevel.DEBUG, "SMS_NOTIFIER_PROCESS_JOB_SWITCH is on");
//
//					String pattern = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.SMS_NOTIFIER_PROCESS_JOB_SWITCH_TIMER_PATTERN );
//					if( Utilities.isNull( pattern ) ) {
//
//						// default trigger value is 0 0/60 * * * ?
//						pattern = SMFAgentConstants.SMS_NOTIFIER__DEFAULT_TRIGGER_VAL;
//					}
//					startJobs("SMSNotifierJob", SMSNotifierJob.class, "SMSNotifierJobTrigger", pattern,  SMFAgentConstants.SMS_NOTIFIER__DEFAULT_TRIGGER_VAL);
//				} else {
//
//					if(logger.isDebugEnabled())
//						logger.log(BCGLevel.DEBUG, "SMS_NOTIFIER_JOB_SWITCH is off/null");
//				}
//				
//				/**
//				 * added by shashidhar.P on 20thJune,2020							
//				 */
//											
//					String ca_group_creation_job_switch = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.CA_GROUP_CREATION_JOB_SWITCH);
//
//					if (Utilities.isNull(ca_group_creation_job_switch) == false&& ca_group_creation_job_switch.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON)) {
//
//						if (logger.isDebugEnabled())
//							logger.log(BCGLevel.DEBUG,"CA_GROUP_CREATION_JOB_SWITCH is on");
//
//						String pattern = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.CA_GROUP_CREATION_JOB_SWITCH_TIMER_PATTERN);
//						if (Utilities.isNull(pattern)) {
//							// default trigger value is 0 0/60 * * * ?
//							pattern = SMFAgentConstants.CA_GROUP_CREATION_JOB_SWITCH_DEFAULT_TRIGGER_VAL;
//						}
//						startJobs("CaGroupCreationJob",CAGroupCreationJob.class,"CaGroupCreationJobJobTrigger",
//								pattern,SMFAgentConstants.CA_GROUP_CREATION_JOB_SWITCH_DEFAULT_TRIGGER_VAL);
//					} else {
//						if (logger.isDebugEnabled())
//							logger.log(BCGLevel.DEBUG,"CA_GROUP_CREATION_JOB_SWITCH is off/null");
//					}
//				
//					/**
//					 * added for IMEIUPLOAD JOB							
//					 */
//												
//			String imei_block_unblock_job_switch = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.IMEI_BLOCK_UNBLOCK_JOB_SWITCH);
//
//						if (Utilities.isNull(imei_block_unblock_job_switch) == false && imei_block_unblock_job_switch.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON)) {
//
//							if (logger.isDebugEnabled())
//								logger.log(BCGLevel.DEBUG,"IMEI_BLOCK_UNBLOCK_JOB_SWITCH is on");
//
//							String pattern = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.IMEI_BLOCK_UNBLOCK_JOB_SWITCH_TIMER_PATTERN);
//							if (Utilities.isNull(pattern)) {
//								// default trigger value is 0 0/60 * * * ?
//								pattern = SMFAgentConstants.IMEI_BLOCK_UNBLOCK_JOB_PATTERN;
//							}
//							startJobs("IMEIFileUploadJob",IMEIFileUploadJob.class,"IMEIFileUploadJobJobTrigger",
//									pattern,SMFAgentConstants.IMEI_BLOCK_UNBLOCK_JOB_PATTERN);
//						} else {
//							if (logger.isDebugEnabled())
//								logger.log(BCGLevel.DEBUG,"IMEI_BLOCK_UNBLOCK_JOB_SWITCH is off/null");
//						}
//						 
//			String imei_block_unblock_Log_job_switch = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.IMEI_BLOCK_UNBLOCK_LOG_JOB_SWITCH);
//
//			if (Utilities.isNull(imei_block_unblock_Log_job_switch) == false && imei_block_unblock_Log_job_switch.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON)) {
//
//				if (logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG,"IMEI_BLOCK_UNBLOCK_LOG_JOB_SWITCH is on");
//
//				String pattern = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.IMEI_BLOCK_UNBLOCK_LOG_JOB_SWITCH_TIMER_PATTERN);
//				if (Utilities.isNull(pattern)) {
//					// default trigger value is 0 0/60 * * * ?
//					pattern = SMFAgentConstants.IMEI_BLOCK_UNBLOCK_LOG_DEFAULT_JOB_PATTERN;
//				}
//				startJobs("IMEILogReadJob",IMEILogReadJob.class,"IMEILogReadJobJobTrigger",pattern,SMFAgentConstants.IMEI_BLOCK_UNBLOCK_LOG_DEFAULT_JOB_PATTERN);
//			} else {
//				if (logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG,"IMEI_BLOCK_UNBLOCK_LOG_JOB_SWITCH is off/null");
//			}
//			
//			String bulk_mdn_reg_act_process_job_switch = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_MDN_REG_ACT_PROCESS_JOB_SWITCH);
//
//			if (Utilities.isNull(bulk_mdn_reg_act_process_job_switch) == false && bulk_mdn_reg_act_process_job_switch.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON)) {
//
//				if (logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG,"BULK_MDN_REG_ACT_PROCESS_JOB_SWITCH is on");
//
//				String pattern = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_MDN_REG_ACT_PROCESS_JOB_SWITCH_TIMER_PATTERN);
//				if (Utilities.isNull(pattern)) {
//					// default trigger value is 0 0/60 * * * ?
//					pattern = SMFAgentConstants.BULK_MDN_REG_ACT_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL;
//				}
//				startJobs("MDNRegActProcessJob",MDNRegActProcessJob.class,"MDNRegActProcessJobTrigger",pattern,SMFAgentConstants.BULK_MDN_REG_ACT_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL);
//			} else {
//				if (logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG,"BULK_MDN_REG_ACT_PROCESS_JOB_SWITCH is off/null");
//			}
//
//			/**
//			 * added by Maheswar M on 19th Nov,2021 for BULK SIMSWAP							
//			 */
//			String BulkSimSwapSwitch = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_SIM_SWAP_PROCESS_JOB_SWITCH);
//
//			if (Utilities.isNull(BulkSimSwapSwitch) == false&& BulkSimSwapSwitch.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON)) {
//
//				if (logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG,"BULK_SIM_SWAP_PROCESS_JOB_SWITCH is on");
//
//				String pattern = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_SIM_SWAP_PROCESS_JOB_SWITCH_TIMER_PATTERN);
//				if (Utilities.isNull(pattern)) {
//					// default trigger value is 0 0/60 * * * ?
//					pattern = SMFAgentConstants.BULK_SIM_SWAP_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL;
//				}
//				startJobs("BulkSimSwapProcessJob",BulkSimSwapProcessJob.class,"BulkSimSwapProcessJobJobTrigger",
//						pattern,SMFAgentConstants.BULK_SIM_SWAP_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL);
//			} else {
//				if (logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG,"BULK_SIM_SWAP_PROCESS_JOB_SWITCH is off/null");
//			}
//			
//			String BulkChangeMsisdnSwitch = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_CHANGE_MSISDN_PROCESS_JOB_SWITCH);
//
//			if (Utilities.isNull(BulkChangeMsisdnSwitch) == false&& BulkChangeMsisdnSwitch.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON)) {
//
//				if (logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG,"BULK_CHANGE_MSISDN_PROCESS_JOB_SWITCH is on");
//
//				String pattern = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_CHANGE_MSISDN_PROCESS_JOB_SWITCH_TIMER_PATTERN);
//				if (Utilities.isNull(pattern)) {
//					// default trigger value is 0 0/60 * * * ?
//					pattern = SMFAgentConstants.BULK_CHANGE_MSISDN_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL;
//				}
//				startJobs("BulkChangeMsisdnProcessJob",BulkChangeMsisdnProcessJob.class,"BulkChangeMsisdnProcessJobJobTrigger",
//						pattern,SMFAgentConstants.BULK_CHANGE_MSISDN_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL);
//			} else {
//				if (logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG,"BULK_CHANGE_MSISDN_PROCESS_JOB_SWITCH is off/null");
//			}
//
//			String BulkStateChangeSwitch = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_STATE_CHANGE_PROCESS_JOB_SWITCH);
//
//			if (Utilities.isNull(BulkStateChangeSwitch) == false&& BulkStateChangeSwitch.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON)) {
//
//				if (logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG,"BULK_STATE_CHANGE_PROCESS_JOB_SWITCH is on");
//
//				String pattern = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_STATE_CHANGE_PROCESS_JOB_SWITCH_TIMER_PATTERN);
//				if (Utilities.isNull(pattern)) {
//					// default trigger value is 0 0/60 * * * ?
//					pattern = SMFAgentConstants.BULK_STATE_CHANGE_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL;
//				}
//				startJobs("BulkStateChangeProcessJob",BulkStateChangeProcessJob.class,"BulkStateChangeProcessJobTrigger",
//						pattern,SMFAgentConstants.BULK_STATE_CHANGE_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL);
//			} else {
//				if (logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG,"BULK_STATE_CHANGE_PROCESS_JOB_SWITCH is off/null");
//			}
//			
//			String BulkSubsFlowSwitch = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_SUBS_FLOW_PROCESS_JOB_SWITCH);
//			logger.log(BCGLevel.DEBUG,"BULK_SUBS_FLOW_PROCESS_JOB_SWITCH is  >"+BulkSubsFlowSwitch);
//			if (Utilities.isNull(BulkSubsFlowSwitch) == false&& BulkSubsFlowSwitch.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON)) {
//
//				if (logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG,"BULK_SUBS_FLOW_PROCESS_JOB_SWITCH is on");
//
//				String pattern = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_SUBS_FLOW_PROCESS_JOB_SWITCH_TIMER_PATTERN);
//				if (Utilities.isNull(pattern)) {
//					// default trigger value is 0 0/60 * * * ?
//					pattern = SMFAgentConstants.BULK_SUBS_FLOW_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL;
//				}
//				startJobs("BulkSubsFlowProcessJob",BulkSubsFlowProcessJob.class,"BulkSubsFlowJobTrigger",
//						pattern,SMFAgentConstants.BULK_SUBS_FLOW_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL);
//			} else {
//				if (logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG,"BULK_SUBS_FLOW_PROCESS_JOB_SWITCH is off/null");
//			}
//			
//			String lteRetryjobSwitch = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.LTE_RETRY_PROCESS_JOB_SWITCH);
//
//			if (Utilities.isNull(lteRetryjobSwitch) == false&& lteRetryjobSwitch.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON)) {
//
//				if (logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG,"LTE_RETRY_PROCESS_JOB_SWITCH is on");
//
//				String pattern = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.LTE_RETRY_PROCESS_JOB_SWITCH_TIMER_PATTERN);
//				if (Utilities.isNull(pattern)) {
//					// default trigger value is 0 0/60 * * * ?
//					pattern = SMFAgentConstants.LTE_RETRY_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL;
//				}
//				startJobs("LTERetryProcessJob",LTERetryProcessJob.class,"LteRetryProcessJobTrigger",
//						pattern,SMFAgentConstants.LTE_RETRY_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL);
//			} else {
//				if (logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG,"LTE_RETRY_PROCESS_JOB_SWITCH is off/null");
//			}
//			
//		String EMACMDRETRYJOBSwitch=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.EMA_CMD_RETRY_JOB_SWITCH);
//			
//			if(Utilities.isNull( EMACMDRETRYJOBSwitch ) == false && EMACMDRETRYJOBSwitch.equalsIgnoreCase("ON"))
//			{
//				if (logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG,"EMA_CMD_RETRY_JOB_SWITCH is on");
//				
//				String pattern=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.EMA_CMD_RETRY_JOB_PATTERN);
//				
//				
//				startJobs("EmaCMDRetryJob",EmaCMDRetryJob.class,"EmaCMDRetryJobTrigger",pattern,SMFAgentConstants.EMA_CMD_RETRY_JOB_PATTERN);
//				
//			}else
//			{
//				if(logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG, "EMA_CMD_RETRY_JOB_SWITCH is off/null");
//			}
//			
//			String emaFlowjobSwitch = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.EMA_FLOW_JOB_SWITCH);
//
//			if (Utilities.isNull(emaFlowjobSwitch) == false&& emaFlowjobSwitch.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON)) {
//
//				if (logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG,"EMA_FLOW_JOB_SWITCH is on");
//
//				String pattern = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.EMA_FLOW_JOB_SWITCH_TIMER_PATTERN);
//				if (Utilities.isNull(pattern)) {
//					// default trigger value is 0 0/60 * * * ?
//					pattern = SMFAgentConstants.EMA_FLOW_JOB_SWITCH_DEFAULT_TRIGGER_VAL;
//				}
//				startJobs("EmaFlowProcessJob",EmaFlowProcessJob.class,"EmaFlowProcessJobTrigger",
//						pattern,SMFAgentConstants.EMA_FLOW_JOB_SWITCH_DEFAULT_TRIGGER_VAL);
//			} else {
//				if (logger.isDebugEnabled())
//					logger.log(BCGLevel.DEBUG,"EMA_FLOW_JOB_SWITCH is off/null");
//			}
//			
//		      String PREPAIDACTIVATIONRETRYJOBSwitch=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.PREPAID_ACTIVATION_RETRY_JOB_SWITCH);
//				
//				if(Utilities.isNull( PREPAIDACTIVATIONRETRYJOBSwitch ) == false && PREPAIDACTIVATIONRETRYJOBSwitch.equalsIgnoreCase("ON")){
//				
//					if (logger.isDebugEnabled())
//						logger.log(BCGLevel.DEBUG,"PREPAID_ACTIVATION_RETRY_JOB_SWITCH is on");
//					
//					String pattern=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.PREPAID_ACTIVATION_RETRY_JOB_SWITCH_TIMER_PATTERN);
//					
//					startJobs("PrepaidActivationRetryJob",PrepaidActivationRetryProcessJob.class,"PrepaidActivationRetryJobTrigger",pattern,SMFAgentConstants.PREPAID_ACTIVATION_RETRY_JOB_SWITCH_TIMER_PATTERN);
//					
//				}else {
//					if(logger.isDebugEnabled())
//						logger.log(BCGLevel.DEBUG, "PREPAID_ACTIVATION_RETRY_JOB_SWITCH is off/null");
//				}
//				
//				/*Added by naveen*/
//				String retryChangeDeviceSwitch = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.RETRY_CHANGE_DEVICE_PROCESS_JOB_SWITCH);
//
//				if (Utilities.isNull(retryChangeDeviceSwitch) == false&& retryChangeDeviceSwitch.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON)) {
//
//					if (logger.isDebugEnabled())
//						logger.log(BCGLevel.DEBUG,"RETRY_CHANGE_DEVICE_PROCESS_JOB_SWITCH is on");
//
//					String pattern = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.RETRY_CHANGE_DEVICE_PROCESS_JOB_SWITCH_TIMER_PATTERN);
//					if (Utilities.isNull(pattern)) {
//						// default trigger value is 0 0/60 * * * ?
//						pattern = SMFAgentConstants.RETRY_CHANGE_DEVICE_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL;
//					}
//					startJobs("RetryChangeDeviceProcessJob",RetryChangeDeviceProcessJob.class,"RetryChangeDeviceProcessJobJobTrigger",
//							pattern,SMFAgentConstants.RETRY_CHANGE_DEVICE_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL);
//				} else {
//					if (logger.isDebugEnabled())
//						logger.log(BCGLevel.DEBUG,"RETRY_CHANGE_DEVICE_PROCESS_JOB_SWITCH is off/null");
//				}
//				
//				// added for ttsa file write process job
//				String hlrverify_job = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.hlr_verify_job_Switch);
//
//				if (Utilities.isNull(hlrverify_job) == false&& hlrverify_job.equalsIgnoreCase(SMFAgentConstants.SWITCH_ON)) {
//
//					if (logger.isDebugEnabled())
//						logger.log(BCGLevel.DEBUG,"hlr_verify_job_Switch is on");
//
//					String pattern = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.hlr_verify_job_Switch_TIMER_PATTERN);
//					if (Utilities.isNull(pattern)) {
//						// default trigger value is 0 0/60 * * * ?
//						pattern = SMFAgentConstants.hlr_verify_job_Switch_DEFAULT_TRIGGER_VAL;
//					}
//					startJobs("Hlrverifyjob",Hlrverifyjob.class,"hlrverifyjobTrigger",
//							pattern,SMFAgentConstants.hlr_verify_job_Switch_DEFAULT_TRIGGER_VAL);
//				} else {
//					if (logger.isDebugEnabled())
//						logger.log(BCGLevel.DEBUG,"hlr_verify_job_Switch is off/null");
//				}			
//			
//			isStarted = true;
//			
//		}catch(Exception e){
//			logger.log(BCGLevel.ERROR, "Exception while Starting JobScheduler .."+Utilities.getStackTrace(e));
//		}
//		return isStarted;
//	}
//
//	@SuppressWarnings("unchecked")
//	public boolean startJobs(String jobName, Class jobClass, String triggerName, String triggerPattern, String defaultPattern) {
//
//		boolean isStarted     		= false;
//
//		try{
//
//			CronTrigger cronTrigger = getTrigger( triggerName, triggerPattern, defaultPattern );
//			JobDetail jobDetail = getJobDetail(jobName, jobClass);
//			schdlr.scheduleJob(jobDetail,cronTrigger);	
//
//		} catch(Exception e) {
//
//			logger.log(BCGLevel.ERROR, "Exception while Starting "+ jobName +" .." + Utilities.getStackTrace(e));
//		}
//		return isStarted;
//	}
//
//	private CronTrigger getTrigger(String triggerName, String triggerPattern, String defaultPattern) throws ParseException{
//
//		CronTrigger cronTrigger 	= null;
//
//		cronTrigger = new CronTrigger(triggerName, Scheduler.DEFAULT_GROUP);
//
//		if(logger.isDebugEnabled()) {
//
//			logger.log(BCGLevel.DEBUG,"Triger pattern for "+ triggerName +" is : "+ triggerPattern);
//		}
//		try {
//
//			cronTrigger.setCronExpression( triggerPattern );
//		} catch (Exception e) {
//
//			logger.log(BCGLevel.ERROR, "Failed to start trigger with configured value.\n Taking the default value :" + defaultPattern);
//			cronTrigger.setCronExpression( defaultPattern );
//		}
//
//		return cronTrigger;
//	}
//	@SuppressWarnings("unchecked")
//	private JobDetail getJobDetail(String jobName, Class jobClass){
//
//		return new JobDetail( jobName, Scheduler.DEFAULT_GROUP, jobClass);
//	}

	/*public String getConfigValue(){

		String ret = null;
		try {
			List servers = MBeanServerFactory.findMBeanServer(null);
			System.out.println("size----------"+servers.size());
			MBeanServer server = (MBeanServer)servers.get(0);
			System.out.println("-------server---------"+server);
			//Data.Configuration:type=Service,name=DataConfiguration
			//ObjectName name = new ObjectName("acme.com:service=HelloWorld");
			ObjectName name = new ObjectName("xius.com:service=DataConfig");
			System.out.println("-------name---------"+name);
			ret =  (String)server.getAttribute(name, "TimeFrame");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}*/
	
	
//}