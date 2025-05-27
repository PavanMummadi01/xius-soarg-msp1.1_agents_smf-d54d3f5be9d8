/**
 * Copyright   2006 New Wireless Services, Inc.
 * All rights reserved. These computer programs, listings, and
 * specifications are the property of New Wireless Services,
 * Inc. and may not be copied, stored, used or transmitted, in
 * whole or in part, in any for or by any means, without the
 * prior written permission of New Wireless Services, Inc.
 *
 */
package com.xius.smf.utils;

/**
 * File Name: Description:
 * 
 * @Author : srikanthm
 * @Created Date : Jul 28, 2011
 * @Modified By:
 * @Modified Date:
 * @Modifications:
 * @Reason for Modification
 */
public  class  SMFAgentConstants {

	public static final String INTERNAL_ERROR_CODE = "40000";
	public static final String INTERNAL_ERROR_CODE_STR = "40000";
	public static final String INTERNAL_ERROR_MSG = "Internal Error";
	public static final String NETWORKID_PROP = "NetworkId";
	public static final String SOURCE_NOTIFICAITON = "SMF";
	public static final String CONSUMER_TYPE = "CONSUMER_TYPE";
	public static final String USSD_NOTIFICATION = "USSDNotification";
	public static final String NOTIFICATION_SUCCESS_FLAG = "C";
	public static final String NOTIFICATION_FAIL_FLAG = "F";
	public static final String EXTERNAL_SYSTEM_URL = "EXTERNAL_SYSTEM_URL";
	public static final String EXTERNAL_SYSTEM_USER = "USERNAME";
	public static final String EXTERNAL_SYSTEM_PASSWORD = "PASSWORD";
	public static final String LOW_BALANCE_TIMER_PATTERN = "LOW_BALANCE_TIMER_PATTERN";
	public static final String LOWBAL_NOTIFICATION_SWITCH = "LOWBAL_NOTIFICATION_SWITCH";
	public static final String LOW_BALANCE_NOTIFICATION_TIMEOUT = "LOW_BALANCE_NOTIFICATION_TIMEOUT";

	// constant for Default error code when abnormal situations occurs
	public static final String DEFAULT_ERROR_CODE = "40000";
	// constant for Default error message when abnormal situations occurs
	public static final String DEFAULT_ERROR_MESG = "Internal system error";

	// constant for Default error code when abnormal situations occurs
	public static final String DEF_ERROR_CODE_STR = "40000";

	// constant for No Data Found error code
	public static final String NO_DATA_FOUND_ERROR_CODE = "50000";

	public static final String MISSING_MSG_HEADER_ERROR_CODE = "40004";
	public static final String INVALID_MSG_BODY_ERROR_CODE = "40005";

	public static final String TRUSTSTORE_PATH = "TRUSTSTORE_PATH";
	public static final String TRUSTSTORE_PASSWORD = "TRUSTSTORE_PSWD";
	public static final String LOWBAL_NOTIF_DEFAULT_TRIGGER_VAL = "0 0/30 * * * ?";

	// Added for REQ#1213 DCCS notification for expiry accoutns
	public static final String EXP_NOTIFICATION_SWITCH = "EXP_NOTIFICATION_SWITCH";
	public static final String EXP_SWITCH_VALUE_ON = "on";
	public static final String EXP_NOTIF_DEFAULT_TRIGGER_VAL = "0 0/60 * * * ?";
	public static final String EXPIRE_NOTIF_TIMER_PATTERN = "EXPIRE_NOTIF_TIMER_PATTERN";

	// Added for REQ# SMF Schedule Parent Debit and Childs Special Topup

	public static final String SCHEDULE_CUG_PARENT_DEBIT_SWITCH = "SCHEDULE_CUG_PARENT_DEBIT_SWITCH";
	public static final String SCHEDULE_CUG_PARENT_DEBIT_SWITCH_VALUE_ON = "on";
	public static final String SCHEDULE_CUG_PARENT_DEBIT_TIMER_PATTERN = "SCHEDULE_CUG_PARENT_DEBIT_TIMER_PATTERN";
	public static final String SCHEDULE_CUG_PARENT_DEBIT_DEFAULT_TRIGGER_VAL = "0 0/60 * * * ?";

	public static final String SCHEDULE_CUG_CHILD_TOPUP_SWITCH = "SCHEDULE_CUG_CHILD_TOPUP_SWITCH";
	public static final String SCHEDULE_CUG_CHILD_TOPUP_SWITCH_VALUE_ON = "on";
	public static final String SCHEDULE_CUG_CHILD_TOPUP_TIMER_PATTERN = "SCHEDULE_CUG_CHILD_TOPUP_TIMER_PATTERN";
	public static final String SCHEDULE_CUG_CHILD_TOPUP_DEFAULT_TRIGGER_VAL = "0 0/60 * * * ?";

	public static final String IBA_BAL_MGMT_URL = "IBA_BAL_MGMT_URL";
	public static final String OPERATOR = "OPERATOR";

	public static final String DEFAULT_CUG_PARENT_DEBIT_REASON = "Schedule CUG Debit";
	public static final String DEFAULT_CUG_CHILD_SPECIAL_TOPUP_REASON = "Schedule CUG Special Topup";

	public static final String SMF_AGENT_USER_NAME = "SMF_AGENT_USER_NAME";
	public static final String SMF_AGENT_USER_PASSWORD = SMF_AGENT_USER_NAME;

	public static final String SCHEDULE_CUG_THREAD_POOL_SIZE = "SCHEDULE_CUG_THREAD_POOL_SIZE";
	public static final String SCHEDULE_CUG_MAXRECORDS = "SCHEDULE_CUG_MAXRECORDS";

	public static final String EMPTY_STRING_VALUE = "NA";

	/*
	 * public static final String CUG_MAIN_SCHEDULER_PROPERTY =
	 * "com.xius.smf.cug.main.scheduler.property"; public static final String
	 * CUG_CHILD_SCHEDULER_PROPERTY =
	 * "com.xius.smf.cug.child.scheduler.property"; public static final String
	 * CUG_SCHEDULER_PROPERTY_ON = "ON"; public static final String
	 * CUG_SCHEDULER_PROPERTY_OFF = "OFF";
	 */

	public static final String BULK_UPLOAD_SUBSCRIBER_SWITCH = "BULK_UPLOAD_SUBSCRIBER_SWITCH";
	public static final String UPLOAD_BULK_ID_REPLACEMENT_SWITCH = "UPLOAD_BULK_ID_REPLACEMENT_SWITCH";
	public static final String UPLOAD_DEMOGRAPHIC_DETAILS_SWITCH = "UPLOAD_DEMOGRAPHIC_DETAILS_SWITCH";
	public static final String UPLOAD_BULK_SIM_DETAILS_SWITCH = "UPLOAD_BULK_SIM_DETAILS_SWITCH";
	public static final String BULK_UPLOAD_SUBSCRIBER_SWITCH_VALUE_ON = "on";
	public static final String BULK_UPLOAD_SUBSCRIBER_TIMER_PATTERN = "BULK_UPLOAD_SUBSCRIBER_TIMER_PATTERN";
	public static final String UPLOAD_BULK_SIM_DETAILS_TIMER_PATTERN = "UPLOAD_BULK_SIM_DETAILS_TIMER_PATTERN";
	public static final String UPLOAD_DEMOGRAPHIC_DETAILS_TIMER_PATTERN = "UPLOAD_DEMOGRAPHIC_DETAILS_TIMER_PATTERN";
	public static final String UPLOAD_BULK_ID_REPLACEMENT_TIMER_PATTERN = "UPLOAD_BULK_ID_REPLACEMENT_TIMER_PATTERN";
	public static final String BULK_UPLOAD_SUBSCRIBER_DEFAULT_TRIGGER_VAL = "0 0/60 * * * ?";
	public static final String UPLOAD_DEMOGRAPHIC_DETAILS_DEFAULT_TRIGGER_VAL = "0 0/60 * * * ?";
	public static final String UPLOAD_BULK_ID_REPLACEMENT_DEFAULT_TRIGGER_VAL = "0 0/60 * * * ?";
	public static final String UPLOAD_BULK_SIM_DETAILS_DEFAULT_TRIGGER_VAL = "0 0/60 * * * ?";
	public static final String SWITCH_ON = "on";
	public static final String FTP_AUDIT_FILE_NAME = "ftpAuditFile";

	public static final String DEFAULT_TRIGGER_PATTERN = "0 0/60 * * * ?";

	public static final String SUCCESS = "SUCCESS";
	public static final String PARTIAL = "PARTIAL";
	public static final String FAILURE = "FAILURE";
	public static final String QUEUED  =  "QUEUED";

	public static final String MYKAD_ID = "1";
	public static final String PASSPORT_NO = "2";
	public static final String DEFAULT_VERSION = "1";
	public static final String ACCOUNT_PASSWORD = "TTCARE";
	public static final String USER_TYPE_TTCARE = "TTCARE";
	public static final String USER_TYPE_CORP = "CORP";
	public static final String SUCCESS_ALLOCATION = "SUCCESS - Mobile Number allocation is done";
	public static final String SUCCESS_NOT_ALLOCATED = "SUCCESS - Mobile Number allocation is not yet done";

	public static final String TX_STATUS_FAILED_AFTER_MAX_RETRYS = "FAILURE - transaction reached maximum retrys : ";
	public static final String TX_STATUS_SUCCESS = "SUCCESS - transaction compleeted successfully ";
	public static final String TX_STATUS_FAILURE = "FAILURE - transaction not compleeted successfully ";

	public static final String POSTPAID_ACCOUNT = "2";
	public static final String PREPAID_ACCOUNT = "1";

	public static final String DELIMETER_COMMA = ",";
	public static final String EMPTY_STRING = "";
	public static final String SINGLE_SPACE = " ";

	public static final String COMPLETED = "COMPLETED";

	public static final String HLR_JOB_SWITCH = "HLR_JOB_SWITCH";
	public static final String HLR_JOB_TIMER_PATTERN = "HLR_JOB_TIMER_PATTERN";
	public static final String HLR_DEFAULT_TRIGGER_VAL = "0 0/60 * * * ?";
	public static final String HLR_MAX_RECORDS = "HLR_MAX_RECORDS";
	public static final String HLR_MAX_THREADS = "HLR_MAX_THREADS";
	public static final String APP_ID_PROP = "APP_ID";
	public static final String TOPUP_NOTIF_JOB_SWITCH = "TOPUP_NOTIF_JOB_SWITCH";
	public static final String TOPUP_NOTIF_JOB_TIMER_PATTERN = "TOPUP_NOTIF_JOB_TIMER_PATTERN";
	public static final String TOPUP_NOTIF_JOB_DEFAULT_TIMER_PATTERN = "TOPUP_NOTIF_JOB_DEFAULT_TIMER_PATTERN";
	public static final String TOPUP_NOTIF_MAX_RECORDS = "TOPUP_NOTIF_MAX_RECORDS";
	public static final String TOPUP_NOTIF_MAX_THREADS = "TOPUP_NOTIF_MAX_THREADS";
	public static final String TOPUP_NOTIF_JOB_TIME = "TOPUP_NOTIF_JOB_TIME";
	public static final String TOPUP_NOTIF_JOB_USERNAME = "TOPUP_NOTIF_JOB_USERNAME";
	public static final String TOPUP_NOTIF_JOB_PASSWORD = "TOPUP_NOTIF_JOB_PASSWORD";
	public static final String TOPUP_NOTIF_JOB_URL_TIMEOUT = "TOPUP_NOTIF_JOB_URL_TIMEOUT";
	public static final String EVENT_TYPE_NOTIF = "EVENT_TYPE_NOTIF";

	public static final String LOW_BAL_NOTIF_MAX_RECORDS = "LOW_BAL_NOTIF_MAX_RECORDS";
	public static final String LOW_BAL_NOTIF_MAX_THREADS = "LOW_BAL_NOTIF_MAX_THREADS";

	// Data Renewal and Data Threshold Notification Job

	public static final String DATA_RENEWAL_DATA_THRESHOLD_JOB_SWITCH = "DATA_RENEWAL_DATA_THRESHOLD_JOB_SWITCH";
	public static final String DATA_RENEWAL_DATA_THRESHOLD_JOB_TIMER_PATTERN = "DATA_RENEWAL_DATA_THRESHOLD_JOB_TIMER_PATTERN";
	public static final String DATA_RENEWAL_DATA_THRESHOLD_JOB_DEFAULT_TIMER_PATTERN = "DATA_RENEWAL_DATA_THRESHOLD_JOB_DEFAULT_TIMER_PATTERN";
	public static final String DATA_RENEWAL_DATA_THRESHOLD_MAX_RECORDS = "DATA_RENEWAL_DATA_THRESHOLD_MAX_RECORDS";
	public static final String DATA_RENEWAL_DATA_THRESHOLD_MAX_THREADS = "DATA_RENEWAL_DATA_THRESHOLD_MAX_THREADS";
	public static final String DATA_RENEWAL_DATA_THRESHOLD_JOB_TIME = "DATA_RENEWAL_DATA_THRESHOLD_JOB_TIME";
	public static final String DATA_THRESHOLD_NOTIFICATION_JOB_USERNAME = "DATA_THRESHOLD_NOTIFICATION_JOB_USERNAME";
	public static final String DATA_THRESHOLD_NOTIFICATION_JOB_PASSWORD = "DATA_THRESHOLD_NOTIFICATION_JOB_PASSWORD";
	public static final String DATA_RENEWAL_NOTIFICATION_JOB_USERNAME = "DATA_RENEWAL_NOTIFICATION_JOB_USERNAME";
	public static final String DATA_RENEWAL_NOTIFICATION_JOB_PASSWORD = "DATA_RENEWAL_NOTIFICATION_JOB_PASSWORD";
	public static final String DATA_RENEWAL_DATA_THRESHOLD_JOB_URL_TIMEOUT = "DATA_RENEWAL_DATA_THRESHOLD_JOB_URL_TIMEOUT";

	/* Added by sampath for TT-ADR as part of SMFAgent 1.1.0.0 */

	public static final String POSTPAID_BILL_GEN_NOTIFY_JOB_SWITCH = "POSTPAID_BILL_GEN_NOTIFY_JOB_SWITCH";
	public static final String POSTPAID_BILL_GEN_NOTIFY_JOB_TIMER_PATTERN = "POSTPAID_BILL_GEN_NOTIFY_JOB_TIMER_PATTERN";
	public static final String POSTPAID_BILL_GEN_NOTIFY_JOB_DEFAULT_TIMER_PATTERN = "POSTPAID_BILL_GEN_NOTIFY_JOB_DEFAULT_TIMER_PATTERN";

	public static final String SMS_NOTFICATION_3 = "bill_generate_sms_notification";
	public static final String SMS_NOTFICATION_1 = "bill_payment_sms_notification";
	public static final String SMS_NOTFICATION_2 = "bill_payment_sms_notification1";
	public static final String BILL_AMOUNT = "${bill.amount}";
	public static final String MSISDN = "${msisdn}";
	public static final String BILL_LAST_DT = "${bill.last.dt}";
	public static final String BILL_INVOICE_DT = "${bill.invoice.dt}";
	public static final String SMS_LANGUAGETYPE = "SMS_LANGUAGETYPE";

	// REQ1774-TT A top-up trigger from Xius to TTSA
	public static final String TOPUP_NOTIF_JOB_TTSA_USERNAME = "TOPUP_NOTIF_JOB_TTSA_USERNAME";
	public static final String TOPUP_NOTIF_JOB_TTSA_PASSWORD = "TOPUP_NOTIF_JOB_TTSA_PASSWORD";

	// REQ1794-Data Threshold Triggering to TT System
	public static final String DATA_THRESHOLD_NOTIFICATION_JOB_TTSA_PASSWORD = "DATA_THRESHOLD_NOTIFICATION_JOB_TTSA_PASSWORD";
	public static final String DATA_THRESHOLD_NOTIFICATION_JOB_TTSA_USERNAME = "DATA_THRESHOLD_NOTIFICATION_JOB_TTSA_USERNAME";

	// Added for HLR_STATECHANGE_NOTIFY_JOB for invoking TIA
	public static final String NETWORK_NAME_MAP = "NETWORK_NAME_MAP";
	public static final String EXTERNAL_NW_ID = "EXTERNAL_NW_ID";
	public static final String TO_STATUS = "TO_STATUS";
	public static final String INSTANCE_ID = "INSTANCE_ID";
	public static final String TIA_URL = "TIA_URL";
	public static final String HLR_STATECHANGE_NOTIFY_JOB_SWITCH = "HLR_STATECHANGE_NOTIFY_JOB_SWITCH";
	public static final String HLR_STATECHANGE_NOTIFY_JOB_PATTERN = "HLR_STATECHANGE_NOTIFY_JOB_PATTERN";
	public static final String HLR_STATECHANGE_NOTIFY_JOB_MAX_RECORDS = "HLR_STATECHANGE_NOTIFY_JOB_MAX_RECORDS";
	public static final String HLR_STATECHANGE_NOTIFY_JOB_MAX_THREADS = "HLR_STATECHANGE_NOTIFY_JOB_MAX_THREADS";
	public static final String SUSPENDOLDSTATUS = "SUSPENDOLDSTATUS";
	public static final String SUSPENDNEWSTATUS = "SUSPENDNEWSTATUS";
	public static final String ACTIVATEOLDSTATUS = "ACTIVATEOLDSTATUS";
	public static final String ACTIVATENEWSTATUS = "ACTIVATENEWSTATUS";
	public static final String DEACTNEWSTATUS = "DEACTNEWSTATUS";

	public static final String TIA_ERRCODE = "45455";

	// Added for CHANGEMSISDN_RETRY_JOB
	public static final String CHANGEMSISDN_EXTERNAL_NW_ID = "CHANGEMSISDN_EXTERNAL_NW_ID";
	public static final String CHANGEMSISDN_INSTANCE_ID = "CHANGEMSISDN_INSTANCE_ID";
	public static final String CHANGEMSISDN_RETRY_JOB_SWITCH = "CHANGEMSISDN_RETRY_JOB_SWITCH";
	public static final String CHANGEMSISDN_RETRY_JOB_PATTERN = "CHANGEMSISDN_RETRY_JOB_PATTERN";
	public static final String CHANGEMSISDN_RETRY_JOB_MAX_RECORDS = "CHANGEMSISDN_RETRY_JOB_MAX_RECORDS";
	public static final String CHANGEMSISDN_RETRY_JOB_MAX_THREADS = "CHANGEMSISDN_RETRY_JOB_MAX_THREADS";

	// Added for SIMSWAP_RETRY_JOB
	public static final String SIMSWAP_EXTERNAL_NW_ID = "SIMSWAP_EXTERNAL_NW_ID";
	public static final String SIMSWAP_INSTANCE_ID = "SIMSWAP_INSTANCE_ID";
	public static final String SIMSWAP_RETRY_JOB_SWITCH = "SIMSWAP_RETRY_JOB_SWITCH";
	public static final String SIMSWAP_RETRY_JOB_PATTERN = "SIMSWAP_RETRY_JOB_PATTERN";
	public static final String SIMSWAP_RETRY_JOB_MAX_RECORDS = "SIMSWAP_RETRY_JOB_MAX_RECORDS";
	public static final String SIMSWAP_RETRY_JOB_MAX_THREADS = "SIMSWAP_RETRY_JOB_MAX_THREADS";

	// Added for STATECHANGE_RETRY_JOB
	public static final String STATECHANGE_EXTERNAL_NW_ID = "STATECHANGE_EXTERNAL_NW_ID";
	public static final String STATECHANGE_INSTANCE_ID = "STATECHANGE_INSTANCE_ID";
	public static final String STATECHANGE_RETRY_JOB_SWITCH = "STATECHANGE_RETRY_JOB_SWITCH";
	public static final String STATECHANGE_RETRY_JOB_PATTERN = "STATECHANGE_RETRY_JOB_PATTERN";
	public static final String STATECHANGE_RETRY_JOB_MAX_RECORDS = "STATECHANGE_RETRY_JOB_MAX_RECORDS";
	public static final String STATECHANGE_RETRY_JOB_MAX_THREADS = "STATECHANGE_RETRY_JOB_MAX_THREADS";

	// Added for Notification Engine
	public static final String DynamicContentForNE = "DynamicContentForNE";
	public static final String loginid = "ne.loginid";
	public static final String password = "ne.password";
	public static final String EmailTo = "EmailTo";
	public static final String EmailFrom = "EmailFrom";
	public static final String EmailNotificationEvent = "EmailNotificationEvent";
	public static final String NE_URL = "ne.webservice.url";
	public static final String NE_TIMEOUT = "ne.timeout.seconds";
	
	// Added for StateChange when Changed to EX intimating to Soriana System
	public static final String STATECHANGE_EXPIRY_EXTERNAL_NW_ID = "STATECHANGE_EXPIRY_EXTERNAL_NW_ID";
	public static final String STATECHANGE_EXPIRY_INSTANCE_ID = "STATECHANGE_EXPIRY_INSTANCE_ID";
	public static final String STATECHANGE_EXPIRY_TO_STATUS="STATECHANGE_EXPIRY_TO_STATUS";
	public static final String STATECHANGE_EXPIRY_JOB_SWITCH = "STATECHANGE_EXPIRY_JOB_SWITCH";
	public static final String STATECHANGE_EXPIRY_JOB_PATTERN = "STATECHANGE_EXPIRY_JOB_PATTERN";
	public static final String STATECHANGE_EXPIRY_JOB_MAX_RECORDS = "STATECHANGE_EXPIRY_JOB_MAX_RECORDS";
	public static final String STATECHANGE_EXPIRY_JOB_MAX_THREADS = "STATECHANGE_EXPIRY_JOB_MAX_THREADS";
	public static final String TIA_SORIANA_URL="TIA_SORIANA_URL";	
	
	// Added for Retry StateChange when Changed to EX intimating to Soriana System
	public static final String STATECHANGE_EXPIRY_RETRY_EXTERNAL_NW_ID = "STATECHANGE_EXPIRY_RETRY_EXTERNAL_NW_ID";
	public static final String STATECHANGE_EXPIRY_RETRY_INSTANCE_ID = "STATECHANGE_EXPIRY_RETRY_INSTANCE_ID";
	public static final String STATECHANGE_EXPIRY_RETRY_TO_STATUS="STATECHANGE_EXPIRY_RETRY_TO_STATUS";
	public static final String STATECHANGE_EXPIRY_RETRY_JOB_SWITCH = "STATECHANGE_EXPIRY_RETRY_JOB_SWITCH";
	public static final String STATECHANGE_EXPIRY_RETRY_JOB_PATTERN = "STATECHANGE_EXPIRY_RETRY_JOB_PATTERN";
	public static final String STATECHANGE_EXPIRY_RETRY_JOB_MAX_RECORDS = "STATECHANGE_EXPIRY_RETRY_JOB_MAX_RECORDS";
	public static final String STATECHANGE_EXPIRY_RETRY_JOB_MAX_THREADS = "STATECHANGE_EXPIRY_RETRY_JOB_MAX_THREADS";
	public static final String CHANGE_MSISDN ="CHANGE_MSISDN";
	public static final String SIM_SWAP="SIM SWAP";
	public static final String ACTIVATE= "ACTIVATE";
	public static final String DEACTIVATE="DEACTIVATE";
	
	
	public static final String SIM_SALE_STATUS_FAILCODE = "60000";
	public static final String SIM_ACTIVATION_STATUS_FAILCODE= "60001";

	public static final String RETRY_FROM_SMF_EXTERNAL_NW_ID="RETRY_FROM_SMF_EXTERNAL_NW_ID";
	public static final String RETRY_FROM_SMF_INSTANCE_ID="RETRY_FROM_SMF_INSTANCE_ID";
	public static final String RETRY_FROM_SMF_ACTIVITY_ID="RETRY_FROM_SMF_ACTIVITY_ID";
	public static final String RETRY_FROM_SMF_JOB_SWITCH="RETRY_FROM_SMF_JOB_SWITCH";
	public static final String RETRY_FROM_SMF_JOB_PATTERN="RETRY_FROM_SMF_JOB_PATTERN";
	public static final String RETRY_FROM_SMF_JOB_MAX_RECORDS ="RETRY_FROM_SMF_JOB_MAX_RECORDS";
	public static final String RETRY_FROM_SMF_JOB_MAX_THREADS ="RETRY_FROM_SMF_JOB_MAX_THREADS";
	
	public static final String CHANGE_MSISDN_ACTIVITY_ID="CHANGE_MSISDN_ACTIVITY_ID";
	public static final String SIM_SWAP_ACTIVITY_ID="SIM_SWAP_ACTIVITY_ID";
	public static final String STATE_CHANGE_ACTIVATE="STATE_CHANGE_ACTIVATE_ACTIVITY_ID";
	public static final String STATE_CHANGE_DEACTIVATE="STATE_CHANGE_DEACTIVATE_ACTIVITY_ID";
	public static final String STATE_CHANGE_SUSPEND="STATE_CHANGE_SUSPEND_ACTIVITY_ID";
	public static final String STATE_CHANGE_ACTIVITY_ID="STATE_CHANGE_ACTIVITY_ID";
	
	public static final String CHANGE_TECHNOLOGY_ACTIVITY_ID="CHANGE_TECHNOLOGY_ACTIVITY_ID";
	
	public static final String CONSIDER_SMF_TRANSACTTION ="CONSIDER_SMF_TRANSACTTION";
	public static final String SMF_ACTIVITY_TYPE="SMF_ACTIVITY_TYPE";
	public static final String SMF_CURRENTSTATE_ID="SMF_CURRENTSTATE_ID";
	
	public static final String BULK_ATP_SUBSCRIPTION_EXTERNAL_NW_ID="BULK_ATP_SUBSCRIPTION_EXTERNAL_NW_ID";
	public static final String BULK_ATP_SUBSCRIPTION_INSTANCE_ID="BULK_ATP_SUBSCRIPTION_INSTANCE_ID";
	public static final String BULK_ATP_SUBSCRIPTION_JOB_SWITCH="BULK_ATP_SUBSCRIPTION_JOB_SWITCH";
	public static final String BULK_ATP_SUBSCRIPTION_JOB_PATTERN="BULK_ATP_SUBSCRIPTION_JOB_PATTERN";
	public static final String BULK_ATP_SUBSCRIPTION_JOB_MAX_RECORDS ="BULK_ATP_SUBSCRIPTION_JOB_MAX_RECORDS";
	public static final String BULK_ATP_SUBSCRIPTION_JOB_MAX_THREADS ="BULK_ATP_SUBSCRIPTION_JOB_MAX_THREADS";
	public static final String BULK_ATP_SUBSCRIPTION_IBA_URL="BULK_ATP_SUBSCRIPTION_IBA_URL";
	public static final String XBUS_ERRCODE = "45456";
	public static final String CORP_USER = null;
	public static final String BULK_SIMS_UPLOAD_DETAILS_DEFAULT_TRIGGER_VAL = "0 0/60 * * * ?";
	public static final String BULK_SIMS_UPLOAD_DETAILS_TIMER_PATTERN="BULK_SIMS_UPLOAD_DETAILS_TIMER_PATTERN";
	public static final String BULK_SIMS_UPLOAD_DETAILS_SWITCH = "BULK_SIMS_UPLOAD_DETAILS_SWITCH";
	
	
	public static final String ROAMING_ACTIVATE_ACTIVITY_ID="ROAMING_ACTIVATE_ACTIVITY_ID";
	public static final String ROAMING_DEACTIVATE_ACTIVITY_ID="ROAMING_DEACTIVATE_ACTIVITY_ID";
	
	
	/*
	 * Added for New Job 
	 * FTPFileBulkSimUploadJob
	 * By Sambasiva Rao Aakula
	 * 
	 * */
	
	public static final String FTP_BULKSIM_UPLOAD_JOB_NETWORK_ID="FTP_BULKSIM_UPLOAD_JOB_NETWORK_ID";
	public static final String FTP_BULKSIM_UPLOAD_EXPECTED_FILENAME="FTP_BULKSIM_UPLOAD_EXPECTED_FILENAME";
	public static final String FTP_BULKSIM_UPLOAD_FOLDER_PATH="FTP_BULKSIM_UPLOAD_FOLDER_PATH";
	public static final String FTP_BULKSIM_UPLOAD_READ_SKIP_LINE="FTP_BULKSIM_UPLOAD_READ_SKIP_LINE";
	public static final String FTP_BULKSIM_UPLOAD_FILE_NAME_TYPE="FTP_BULKSIM_UPLOAD_FILE_NAME_TYPE";
	public static final String SIMREG_COMPLETED_PATH="SIMREG_COMPLETED_PATH";
	public static final String BAD_FILE_MOVING_PATH="BAD_FILE_MOVING_PATH";
	public static final String CHANNEL_ID="CHANNEL_ID";
	public static final String FILE_SIZE_LIMIT="FILE_SIZE_LIMIT";
	
	
	public static final String FTP_BULKSIM_UPLOAD_JOB_MAXTHREADS="FTP_BULKSIM_UPLOAD_JOB_MAXTHREADS";
	public static final String FTP_BULK_SIMS_UPLOAD_SWITCH="FTP_BULK_SIMS_UPLOAD_SWITCH";
	public static final String FTP_BULK_SIMS_UPLOAD_TIMER_PATTERN="FTP_BULK_SIMS_UPLOAD_TIMER_PATTERN";
	public static final String FTP_BULK_SIMS_UPLOAD_DEFAULT_TRIGGER_VAL="0 0/60 * * * ?";
	
	
	public static final String BULK_TP_SUBSCRIPTION_EXTERNAL_NW_ID="BULK_TP_SUBSCRIPTION_EXTERNAL_NW_ID";
	public static final String BULK_TP_SUBSCRIPTION_INSTANCE_ID="BULK_TP_SUBSCRIPTION_INSTANCE_ID";
	public static final String BULK_TP_SUBSCRIPTION_JOB_SWITCH="BULK_TP_SUBSCRIPTION_JOB_SWITCH";
	public static final String BULK_TP_SUBSCRIPTION_JOB_PATTERN="BULK_TP_SUBSCRIPTION_JOB_PATTERN";
	public static final String BULK_TP_SUBSCRIPTION_JOB_MAX_RECORDS ="BULK_TP_SUBSCRIPTION_JOB_MAX_RECORDS";
	public static final String BULK_TP_SUBSCRIPTION_JOB_MAX_THREADS ="BULK_TP_SUBSCRIPTION_JOB_MAX_THREADS";
	public static final String BULK_TP_SUBSCRIPTION_XBUS_URL="BULK_TP_SUBSCRIPTION_XBUS_URL";
	
	
	public static final String SORIANA_RETRY_EXTERNAL_NW_ID="SORIANA_RETRY_EXTERNAL_NW_ID";
	public static final String SORIANA_RETRY_INSTANCE_ID="SORIANA_RETRY_INSTANCE_ID";	
	public static final String SORIANA_RETRY_JOB_SWITCH	="SORIANA_RETRY_JOB_SWITCH";
	public static final String SORIANA_RETRY_ACTIVITY_ID="SORIANA_RETRY_ACTIVITY_ID";	
	public static final String SORIANA_RETRY_JOB_PATTERN="SORIANA_RETRY_JOB_PATTERN";
	public static final String SORIANA_RETRY_JOB_MAX_RECORDS="SORIANA_RETRY_JOB_MAX_RECORDS";
	public static final String SORIANA_RETRY_JOB_MAX_THREADS="SORIANA_RETRY_JOB_MAX_THREADS";
	public static final String XBUS_URL="XBUS_URL";
	
	
	
	public static final String THRESHOLD_LIMIT_MONITORING_JOB_SWITCH="THRESHOLD_LIMIT_MONITORING_JOB_SWITCH";
	public static final String THRESHOLD_LIMIT_MONITORING_JOB_PATTERN="THRESHOLD_LIMIT_MONITORING_JOB_PATTERN";
	public static final String THRESHOLD_LIMIT_MONITORING_JOB_MAX_THREADS="THRESHOLD_LIMIT_MONITORING_JOB_MAX_THREADS";
	
	// Added for Notification Engine
	public static final String NIREmailNotificationEvent = "NIREmailNotificationEvent";
	public static final String EmailToNir = "EmailToNir";
	public static final String EmailFromNir = "EmailFromNir";
	public static final String DestMsisdnNir = "DestMsisdnNir";
	public static final String nirNeNetworkID = "ne.networkID";
	public static final String NIRSmsNotificationEvent = "NIRSmsNotificationEvent";
	public static final String EmailSmsNotifFlag = "EmailSmsNotifFlag";
	
	
	public static final String BULK_RC_SUBSCRIPTION_EXTERNAL_NW_ID="BULK_RC_SUBSCRIPTION_EXTERNAL_NW_ID";
	public static final String BULK_RC_SUBSCRIPTION_INSTANCE_ID="BULK_RC_SUBSCRIPTION_INSTANCE_ID";
	public static final String BULK_RC_SUBSCRIPTION_JOB_PATTERN="BULK_RC_SUBSCRIPTION_JOB_PATTERN";
	public static final String BULK_RC_SUBSCRIPTION_JOB_MAX_RECORDS ="BULK_RC_SUBSCRIPTION_JOB_MAX_RECORDS";
	public static final String BULK_RC_SUBSCRIPTION_JOB_MAX_THREADS ="BULK_RC_SUBSCRIPTION_JOB_MAX_THREADS";
	public static final String BULK_RC_SUBSCRIPTION_XBUS_URL="BULK_RC_SUBSCRIPTION_XBUS_URL";
	public static final String BULK_RC_SUBSCRIPTION_JOB_SWITCH="BULK_RC_SUBSCRIPTION_JOB_SWITCH";
	public static final String BULK_INITIATER_RC_SUBSCRIPTION_JOB_SWITCH="BULK_INITIATER_RC_SUBSCRIPTION_JOB_SWITCH";
	public static final String BULK_INITIATER_RC_SUBSCRIPTION_JOB_PATTERN="BULK_INITIATER_RC_SUBSCRIPTION_JOB_PATTERN";
	public static final String BULK_INITIATER_RC_SUBSCRIPTION_EXTERNAL_NW_ID="BULK_INITIATER_RC_SUBSCRIPTION_EXTERNAL_NW_ID";
	

	public static final String BULK_DEBIT_EXTERNAL_NW_ID="BULK_DEBIT_EXTERNAL_NW_ID";
	public static final String BULK_DEBIT_INSTANCE_ID="BULK_DEBIT_INSTANCE_ID";
	public static final String BULK_DEBIT_JOB_SWITCH="BULK_DEBIT_JOB_SWITCH";
	public static final String BULK_DEBIT_JOB_PATTERN="BULK_DEBIT_JOB_PATTERN";
	public static final String BULK_DEBIT_JOB_MAX_RECORDS ="BULK_DEBIT_JOB_MAX_RECORDS";
	public static final String BULK_DEBIT_JOB_MAX_THREADS ="BULK_DEBIT_JOB_MAX_THREADS";
	public static final String BULK_DEBIT_IBA_URL="BULK_DEBIT_IBA_URL";
	
	public static final String BULK_CREDIT_EXTERNAL_NW_ID="BULK_CREDIT_EXTERNAL_NW_ID";
  	public static final String BULK_CREDIT_INSTANCE_ID="BULK_CREDIT_INSTANCE_ID";
  	public static final String BULK_CREDIT_JOB_SWITCH="BULK_CREDIT_JOB_SWITCH";
  	public static final String BULK_CREDIT_JOB_PATTERN="BULK_CREDIT_JOB_PATTERN";
  	public static final String BULK_CREDIT_JOB_MAX_RECORDS ="BULK_CREDIT_JOB_MAX_RECORDS";
  	public static final String BULK_CREDIT_JOB_MAX_THREADS ="BULK_CREDIT_JOB_MAX_THREADS";
    public static final String BULK_CREDIT_IBA_URL="BULK_CREDIT_IBA_URL";
    
    public static final String BULK_SPECIAL_CREDIT_EXTERNAL_NW_ID="BULK_SPECIAL_CREDIT_EXTERNAL_NW_ID";
	public static final String BULK_SPECIAL_CREDIT_INSTANCE_ID="BULK_SPECIAL_CREDIT_INSTANCE_ID";
	public static final String BULK_SPECIAL_CREDIT_JOB_SWITCH="BULK_SPECIAL_CREDIT_JOB_SWITCH";
	public static final String BULK_SPECIAL_CREDIT_JOB_PATTERN="BULK_SPECIAL_CREDIT_JOB_PATTERN";
	public static final String BULK_SPECIAL_CREDIT_JOB_MAX_RECORDS ="BULK_SPECIAL_CREDIT_JOB_MAX_RECORDS";
	public static final String BULK_SPECIAL_CREDIT_JOB_MAX_THREADS ="BULK_SPECIAL_CREDIT_JOB_MAX_THREADS";
    public static final String BULK_SPECIAL_CREDIT_IBA_URL="BULK_SPECIAL_CREDIT_IBA_URL";

    public static final String PAYTM_TX_STATUS_RETRY_JOB_SWITCH="PAYTM_TX_STATUS_RETRY_JOB_SWITCH";
    public static final String PAYTM_TX_STATUS_RETRY_JOB_PATTERN="PAYTM_TX_STATUS_RETRY_JOB_PATTERN";
    public static final String PAYTM_TX_STATUS_RETRY_JOB_MAX_RECORDS="PAYTM_TX_STATUS_RETRY_JOB_MAX_RECORDS";
    public static final String PAYTM_TX_STATUS_RETRY_JOB_MAX_THREADS="PAYTM_TX_STATUS_RETRY_JOB_MAX_THREADS";
    public static final String PAYTM_TX_STATUS_URL="PAYTM_TX_STATUS_URL";
    public static final String PAYTM_TX_STATUS_RETRY_EXTERNAL_NW_ID="PAYTM_TX_STATUS_RETRY_EXTERNAL_NW_ID";
    public static final String PAYTM_TX_STATUS_RETRY_INSTANCE_ID="PAYTM_TX_STATUS_RETRY_INSTANCE_ID";
    
    public static final String XBUS_SELFCARE_SERVICES_URL="XBUS_SELFCARE_SERVICES_URL";
    public static final String MID="PAYTM_TX_STATUS_MID";
    public static final String MARCHENTKEY="PAYTM_TX_STATUS_MARCHENT_KEY";
    public static final String XBUS_TIMEOUT="XBUS_TIMEOUT";
    
    public static final String BULK_ACT_DEACT_JOB_EXTERNAL_NW_ID="BULK_ACT_DEACT_JOB_EXTERNAL_NW_ID";
    public static final String BULK_ACT_DEACT_JOB_INSTANCE_ID="BULK_ACT_DEACT_JOB_INSTANCE_ID";
    public static final String BULK_ACT_DEACT_JOB_SWITCH="BULK_ACT_DEACT_JOB_SWITCH";
    public static final String BULK_ACT_DEACT_JOB_PATTERN="BULK_ACT_DEACT_JOB_PATTERN";
    public static final String BULK_ACT_DEACT_JOB_MAX_RECORDS="BULK_ACT_DEACT_JOB_MAX_RECORDS";
    public static final String BULK_ACT_DEACT_JOB_MAX_THREADS="BULK_ACT_DEACT_JOB_MAX_THREADS";
    public static final String XBUS_CXF_DEVICE_MGMT_URL="XBUS_CXF_DEVICE_MGMT_URL";
    
    public static final String BULK_CORP_RC_SUBSCRIPTION_JOB_EXTERNAL_NW_ID="BULK_CORP_RC_SUBSCRIPTION_JOB_EXTERNAL_NW_ID";
    public static final String BULK_CORP_RC_SUBSCRIPTION_JOB_INSTANCE_ID="BULK_CORP_RC_SUBSCRIPTION_JOB_INSTANCE_ID";
    public static final String BULK_CORP_RC_SUBSCRIPTION_JOB_SWITCH="BULK_CORP_RC_SUBSCRIPTION_JOB_SWITCH";
    public static final String BULK_CORP_RC_SUBSCRIPTION_JOB_PATTERN="BULK_CORP_RC_SUBSCRIPTION_JOB_PATTERN";
    public static final String BULK_CORP_RC_SUBSCRIPTION_JOB_MAX_RECORDS="BULK_CORP_RC_SUBSCRIPTION_JOB_MAX_RECORDS";
    public static final String BULK_CORP_RC_SUBSCRIPTION_JOB_MAX_THREADS="BULK_CORP_RC_SUBSCRIPTION_JOB_MAX_THREADS";
    public static final String XBUS_CXF_BULK_CORP_RC_SUBSCRIPTION_URL="XBUS_CXF_BULK_CORP_RC_SUBSCRIPTION_URL";
    
    
    public static final String   DATA_ENABLE_DISABLE_JOB_EXTERNAL_NW_ID="DATA_ENABLE_DISABLE_JOB_EXTERNAL_NW_ID";
    public static final String   DATA_ENABLE_DISABLE_JOB_INSTANCE_ID="DATA_ENABLE_DISABLE_JOB_INSTANCE_ID";
    public static final String   DATA_ENABLE_DISABLE_JOB_SWITCH="DATA_ENABLE_DISABLE_JOB_SWITCH";
    public static final String   DATA_ENABLE_DISABLE_JOB_PATTERN="DATA_ENABLE_DISABLE_JOB_PATTERN";
    public static final String   DATA_ENABLE_DISABLE_JOB_MAX_RECORDS ="DATA_ENABLE_DISABLE_JOB_MAX_RECORDS";
    public static final String   DATA_ENABLE_DISABLE_JOB_MAX_THREADS ="DATA_ENABLE_DISABLE_JOB_MAX_THREADS";
    public static final String   DATA_ENABLE_DISABLE_TIA_URL="DATA_ENABLE_DISABLE_TIA_URL";
    
    
    public static final String   USAGE_THRESHOLD_LIMITS_NOTIFY_JOB_EXTERNAL_NW_ID="USAGE_THRESHOLD_LIMITS_NOTIFY_JOB_EXTERNAL_NW_ID";
    public static final String  USAGE_THRESHOLD_LIMITS_NOTIFY_JOB_INSTANCE_ID="USAGE_THRESHOLD_LIMITS_NOTIFY_JOB_INSTANCE_ID";
    public static final String  USAGE_THRESHOLD_LIMITS_NOTIFY_JOB_SWITCH="USAGE_THRESHOLD_LIMITS_NOTIFY_JOB_SWITCH";
    public static final String   USAGE_THRESHOLD_LIMITS_NOTIFY_JOB_PATTERN="USAGE_THRESHOLD_LIMITS_NOTIFY_JOB_PATTERN";
    public static final String   USAGE_THRESHOLD_LIMITS_NOTIFY_JOB_MAX_RECORDS ="USAGE_THRESHOLD_LIMITS_NOTIFY_JOB_MAX_RECORDS";
    public static final String   USAGE_THRESHOLD_LIMITS_NOTIFY_JOB_MAX_THREADS ="USAGE_THRESHOLD_LIMITS_NOTIFY_JOB_MAX_THREADS";

    
    public static final String FIRST_LU_PROCESS_JOB_SWITCH="FIRST_LU_PROCESS_JOB_SWITCH";
    public static final String FIRST_LU_PROCESS_JOB_SWITCH_TIMER_PATTERN="FIRST_LU_PROCESS_JOB_SWITCH_TIMER_PATTERN";
    public static final String FIRST_LU_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL="0 0/60 * * * ?";
    public static final String FIRST_LU_PROCESS_JOB_EXTERNAL_NW_ID="FIRST_LU_PROCESS_JOB_EXTERNAL_NW_ID";
    public static final String FIRST_LU_PROCESS_JOB_MAX_RECORDS="FIRST_LU_PROCESS_JOB_MAX_RECORDS";
    public static final String FIRST_LU_PROCESS_JOB_INSTANCE_ID="FIRST_LU_PROCESS_JOB_INSTANCE_ID";
    public static final String FIRST_LU_PROCESS_JOB_MAX_THREADS="FIRST_LU_PROCESS_JOB_MAX_THREADS";
    public static final String NO_DATA_FOUND = "NO_DATA_FOUND";
    
    public static final String YF_API_PROCESS_JOB_SWITCH="YF_API_PROCESS_JOB_SWITCH";
    public static final String YF_API_PROCESS_JOB_SWITCH_TIMER_PATTERN="YF_API_PROCESS_JOB_SWITCH_TIMER_PATTERN";
    public static final String YF_API_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL="0 0/60 * * * ?";
    public static final String YF_API_PROCESS_JOB_EXTERNAL_NW_ID="YF_API_PROCESS_JOB_EXTERNAL_NW_ID";
    public static final String YF_API_PROCESS_JOB_MAX_RECORDS="YF_API_PROCESS_JOB_MAX_RECORDS";
    public static final String YF_API_PROCESS_JOB_INSTANCE_ID="YF_API_PROCESS_JOB_INSTANCE_ID";
    public static final String YF_API_PROCESS_JOB_MAX_THREADS="YF_API_PROCESS_JOB_MAX_THREADS";
    public static final String YF_API_PROCESS_ACTIVITIES="YF_API_PROCESS_ACTIVITIES";
    
    public static final String PCRF_POLICY_EXTERNAL_NW_ID="PCRF_POLICY_EXTERNAL_NW_ID";
    public static final String PCRF_POLICY_TRACKER_JOB_MAX_RECORDS="PCRF_POLICY_TRACKER_JOB_MAX_RECORDS";
	public static final String PCRF_POLICY_TRACKER_FAILURE_COUNT = "PCRF_POLICY_TRACKER_FAILURE_COUNT";
	public static final String PCRF_POLICY_TRACKER_JOB_SWITCH = "PCRF_POLICY_TRACKER_JOB_SWITCH";
	public static final String PCRF_POLICY_TRACKER_JOB_MAX_THREADS = "PCRF_POLICY_TRACKER_JOB_MAX_THREADS";
	public static final String PCRF_POLICY_TRACKER_JOB_PATTERN = "PCRF_POLICY_TRACKER_JOB_PATTERN";
	public static final String PCRF_POLICY_TRACKER_DEFAULT_JOB_PATTERN = "0 0/60 * * * ?"; 
	
	public static final String PCRF_POLICY_UNASSIGN_AND_ASSIGN_FLG = "PCRF_POLICY_UNASSIGN_AND_ASSIGN_FLG"; 
	public static final String PCRF_POLICY_UNASSIGN_FLG = "PCRF_POLICY_UNASSIGN_FLG"; 
	public static final String PCRF_POLICY_RENEWAL_FLG = "PCRF_POLICY_RENEWAL_FLG"; 
	public static final String PCRF_SUCCESS_FLAG = "S";
	public static final String PCRF_FALIURE_FLAG = "F";
	public static final String PCRF_POLICY_FAILURE_COUNT = "PCRF_POLICY_FAILURE_COUNT";

	public static final String VOLTE_EXTERNAL_NW_ID="VOLTE_EXTERNAL_NW_ID";
    public static final String VOLTE_JOB_MAX_RECORDS="VOLTE_JOB_MAX_RECORDS";
	public static final String VOLTE_FAILURE_COUNT = "VOLTE_FAILURE_COUNT";
	public static final String VOLTE_JOB_SWITCH = "VOLTE_JOB_SWITCH";
	public static final String VOLTE_JOB_MAX_THREADS = "VOLTE_JOB_MAX_THREADS";
	public static final String VOLTE_JOB_PATTERN = "VOLTE_JOB_PATTERN";
	public static final String VOLTE_DEFAULT_JOB_PATTERN = "0 0/60 * * * ?"; 
	public static final String VOLTE_ASSIGN_FLG = "VOLTE_ASSIGN_FLG"; 
	public static final String VOLTE_UNASSIGN_FLG = "VOLTE_UNASSIGN_FLG"; 
	public static final String VOLTE_SUCCESS_FLAG = "S";
	public static final String VOLTE_FALIURE_FLAG = "F";
	
	
	
	public static final String TIA_API_RETRY_PROCESS_JOB_SWITCH="TIA_API_RETRY_PROCESS_JOB_SWITCH";
    public static final String TIA_API_RETRY_PROCESS_JOB_SWITCH_TIMER_PATTERN="TIA_API_RETRY_PROCESS_JOB_SWITCH_TIMER_PATTERN";
    public static final String TIA_API_RETRY_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL="0 0/60 * * * ?";
    public static final String TIA_API_RETRY_PROCESS_JOB_EXTERNAL_NW_ID="TIA_API_RETRY_PROCESS_JOB_EXTERNAL_NW_IDS";
    public static final String TIA_API_RETRY_PROCESS_JOB_MAX_RECORDS="TIA_API_RETRY_PROCESS_JOB_MAX_RECORDS";
    public static final String TIA_API_RETRY_PROCESS_JOB_INSTANCE_ID="TIA_API_RETRY_PROCESS_JOB_INSTANCE_ID";
    public static final String TIA_API_RETRY_PROCESS_JOB_MAX_THREADS="TIA_API_RETRY_PROCESS_JOB_MAX_THREADS";
    public static final String TIA_API_RETRY_PROCESS_ACTIVITIES="TIA_API_RETRY_PROCESS_ACTIVITIES";
	
	
    public static final String SMS_NOTIFIER_PROCESS_JOB_SWITCH="SMS_NOTIFIER_PROCESS_JOB_SWITCH";
    public static final String SMS_NOTIFIER_PROCESS_JOB_SWITCH_TIMER_PATTERN="SMS_NOTIFIER_PROCESS_JOB_SWITCH_TIMER_PATTERN";
	public static final String SMS_NOTIFIER__DEFAULT_TRIGGER_VAL = "SMS_NOTIFIER__DEFAULT_TRIGGER_VAL";
	public static final String SMS_NOTIFIER_PROCESS_JOB_EXTERNAL_NW_ID = "SMS_NOTIFIER_PROCESS_JOB_EXTERNAL_NW_ID";
	public static final String SMS_NOTIFIER_RECORD_TO_PROCESS = "SMS_NOTIFIER_RECORD_TO_PROCESS";
	public static final String SMS_NOTIFIER_MAX_THREAD = "SMS_NOTIFIER_MAX_THREAD";
    
	
	public static final String CA_GROUP_CREATION_JOB_SWITCH="CA_GROUP_CREATION_JOB_SWITCH";
	public static final String CA_GROUP_CREATION_JOB_SWITCH_TIMER_PATTERN = "CA_GROUP_CREATION_JOB_SWITCH_TIMER_PATTERN";
	public static final String CA_GROUP_CREATION_JOB_SWITCH_DEFAULT_TRIGGER_VAL = "0 0/60 * * * ?";
	public static final String CA_GROUP_CREATION_JOB_EXTERNAL_NW_ID = "CA_GROUP_CREATION_JOB_EXTERNAL_NW_ID";
	public static final String CA_GROUP_CREATION_JOB_MAX_RECORDS = "CA_GROUP_CREATION_JOB_MAX_RECORDS";
	public static final String CA_GROUP_CREATION_JOB_INSTANCE_ID = "CA_GROUP_CREATION_INSTANCE_ID";
	public static final String CA_GROUP_CREATION_JOB_MAX_THREADS = "CA_GROUP_CREATION_JOB_MAX_THREADS";

	public static final String IMEI_BLOCK_UNBLOCK_JOB_EXTERNAL_NW_ID = "IMEI_BLOCK_UNBLOCK_JOB_EXTERNAL_NW_ID";
	public static final String IMEI_BLOCK_UNBLOCK_JOB_MAX_RECORDS = "IMEI_BLOCK_UNBLOCK_JOB_MAX_RECORDS";
	public static final String IMEI_BLOCK_UNBLOCK_JOB_SWITCH = "IMEI_BLOCK_UNBLOCK_JOB_SWITCH";
	public static final String IMEI_BLOCK_UNBLOCK_JOB_MAX_THREADS = "IMEI_BLOCK_UNBLOCK_JOB_MAX_THREADS";
	public static final String IMEI_BLOCK_UNBLOCK_JOB_SWITCH_TIMER_PATTERN = "IMEI_BLOCK_UNBLOCK_JOB_SWITCH_TIMER_PATTERN";
	public static final String IMEI_BLOCK_UNBLOCK_JOB_PATTERN = "0 0/60 * * * ?";

	public static final String IMEI_BLOCK_UNBLOCK_LOG_JOB_EXTERNAL_NW_ID = "IMEI_BLOCK_UNBLOCK_LOG_JOB_EXTERNAL_NW_ID";
	public static final String IMEI_BLOCK_UNBLOCK_LOG_JOB_MAX_RECORDS = "IMEI_BLOCK_UNBLOCK_LOG_JOB_MAX_RECORDS";
	public static final String IMEI_BLOCK_UNBLOCK_LOG_JOB_SWITCH = "IMEI_BLOCK_UNBLOCK_LOG_JOB_SWITCH";
	public static final String IMEI_BLOCK_UNBLOCK_LOG_JOB_MAX_THREADS = "IMEI_BLOCK_UNBLOCK_LOG_JOB_MAX_THREADS";
	public static final String IMEI_BLOCK_UNBLOCK_LOG_JOB_SWITCH_TIMER_PATTERN = "IMEI_BLOCK_UNBLOCK_LOG_JOB_SWITCH_TIMER_PATTERN";
	public static final String IMEI_BLOCK_UNBLOCK_LOG_DEFAULT_JOB_PATTERN = "0 0/60 * * * ?";
	
	
	public static final String BULK_MDN_REG_ACT_PROCESS_JOB_SWITCH = "BULK_MDN_REG_ACT_PROCESS_JOB_SWITCH";
	public static final String BULK_MDN_REG_ACT_PROCESS_JOB_SWITCH_TIMER_PATTERN = "BULK_MDN_REG_ACT_PROCESS_JOB_SWITCH_TIMER_PATTERN";
	public static final String BULK_MDN_REG_ACT_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL = "0 0/60 * * * ?";
	public static final String BULK_MDN_REG_ACT_PROCESS_JOB_EXTERNAL_NW_ID = "BULK_MDN_REG_ACT_PROCESS_JOB_EXTERNAL_NW_ID";
	public static final String BULK_MDN_REG_ACT_PROCESS_JOB_MAX_RECORDS = "BULK_MDN_REG_ACT_PROCESS_JOB_MAX_RECORDS";
	public static final String BULK_MDN_REG_ACT_PROCESS_JOB_INSTANCE_ID = "BULK_MDN_REG_ACT_PROCESS_JOB_INSTANCE_ID";
	public static final String BULK_MDN_REG_ACT_PROCESS_JOB_MAX_THREADS = "BULK_MDN_REG_ACT_PROCESS_JOB_MAX_THREADS";
	public static final String BULK_MDN_REG_ACT_PROCESS_ACTIVITIES = "BULK_MDN_REG_ACT_PROCESS_ACTIVITIES";
	
	public static final String BULK_SIM_SWAP_PROCESS_JOB_SWITCH="BULK_SIM_SWAP_PROCESS_JOB_SWITCH";
    public static final String BULK_SIM_SWAP_PROCESS_JOB_SWITCH_TIMER_PATTERN="BULK_SIM_SWAP_PROCESS_JOB_SWITCH_TIMER_PATTERN";
    public static final String BULK_SIM_SWAP_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL="0 0/60 * * * ?";
    public static final String BULK_SIM_SWAP_PROCESS_JOB_EXTERNAL_NW_ID="BULK_SIM_SWAP_PROCESS_JOB_EXTERNAL_NW_ID";
    public static final String BULK_SIM_SWAP_PROCESS_JOB_MAX_RECORDS="BULK_SIM_SWAP_PROCESS_JOB_MAX_RECORDS";
    public static final String BULK_SIM_SWAP_PROCESS_JOB_INSTANCE_ID="BULK_SIM_SWAP_PROCESS_JOB_INSTANCE_ID";
    public static final String BULK_SIM_SWAP_PROCESS_JOB_MAX_THREADS="BULK_SIM_SWAP_PROCESS_JOB_MAX_THREADS";
    
    public static final String BULK_STATE_CHANGE_PROCESS_JOB_SWITCH="BULK_STATE_CHANGE_PROCESS_JOB_SWITCH";
    public static final String BULK_STATE_CHANGE_PROCESS_JOB_SWITCH_TIMER_PATTERN="BULK_STATE_CHANGE_PROCESS_JOB_SWITCH_TIMER_PATTERN";
    public static final String BULK_STATE_CHANGE_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL="0 0/60 * * * ?";
    public static final String BULK_STATE_CHANGE_PROCESS_JOB_EXTERNAL_NW_ID="BULK_STATE_CHANGE_PROCESS_JOB_EXTERNAL_NW_ID";
    public static final String BULK_STATE_CHANGE_PROCESS_JOB_MAX_RECORDS="BULK_STATE_CHANGE_PROCESS_JOB_MAX_RECORDS";
    public static final String BULK_STATE_CHANGE_PROCESS_JOB_INSTANCE_ID="BULK_STATE_CHANGE_PROCESS_JOB_INSTANCE_ID";
    public static final String BULK_STATE_CHANGE_PROCESS_JOB_MAX_THREADS="BULK_STATE_ECHANGE_PROCESS_JOB_MAX_THREADS";
    
    public static final String BULK_SUBS_FLOW_PROCESS_JOB_SWITCH="BULK_SUBS_FLOW_PROCESS_JOB_SWITCH";
    public static final String BULK_SUBS_FLOW_PROCESS_JOB_SWITCH_TIMER_PATTERN="BULK_SUBS_FLOW_PROCESS_JOB_SWITCH_TIMER_PATTERN";
    public static final String BULK_SUBS_FLOW_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL="0 0/60 * * * ?";
    public static final String BULK_SUBS_FLOW_PROCESS_JOB_EXTERNAL_NW_ID="BULK_SUBS_FLOW_PROCESS_JOB_EXTERNAL_NW_ID";
    public static final String BULK_SUBS_FLOW_PROCESS_JOB_MAX_RECORDS="BULK_SUBS_FLOW_PROCESS_JOB_MAX_RECORDS";
    public static final String BULK_SUBS_FLOW_PROCESS_JOB_INSTANCE_ID="BULK_SUBS_FLOW_PROCESS_JOB_INSTANCE_ID";
    public static final String BULK_SUBS_FLOW_PROCESS_JOB_MAX_THREADS="BULK_SUBS_FLOW_PROCESS_JOB_MAX_THREADS";

    public static final String LTE_RETRY_PROCESS_JOB_SWITCH="LTE_RETRY_PROCESS_JOB_SWITCH";
    public static final String LTE_RETRY_PROCESS_JOB_SWITCH_TIMER_PATTERN="LTE_RETRY_PROCESS_JOB_SWITCH_TIMER_PATTERN";
    public static final String LTE_RETRY_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL="0 0/60 * * * ?";
    public static final String LTE_RETRY_PROCESS_JOB_EXTERNAL_NW_ID="LTE_RETRY_PROCESS_JOB_EXTERNAL_NW_ID";
    public static final String LTE_RETRY_PROCESS_JOB_MAX_RECORDS="LTE_RETRY_PROCESS_JOB_MAX_RECORDS";
    public static final String LTE_RETRY_PROCESS_JOB_MAX_THREADS="LTE_RETRY_PROCESS_JOB_MAX_THREADS";
    public static final String LTE_RETRY_PROCESS_JOB_MAX_RETRY="LTE_RETRY_PROCESS_JOB_MAX_RETRY";
    
    public static final String BULK_CHANGE_MSISDN_PROCESS_JOB_SWITCH="BULK_CHANGE_MSISDN_PROCESS_JOB_SWITCH";
    public static final String BULK_CHANGE_MSISDN_PROCESS_JOB_SWITCH_TIMER_PATTERN="BULK_CHANGE_MSISDN_PROCESS_JOB_SWITCH_TIMER_PATTERN";
    public static final String BULK_CHANGE_MSISDN_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL="0 0/60 * * * ?";
    public static final String BULK_CHANGE_MSISDN_PROCESS_JOB_EXTERNAL_NW_ID="BULK_CHANGE_MSISDN_PROCESS_JOB_EXTERNAL_NW_ID";
    public static final String BULK_CHANGE_MSISDN_PROCESS_JOB_MAX_RECORDS="BULK_CHANGE_MSISDN_PROCESS_JOB_MAX_RECORDS";
    public static final String BULK_CHANGE_MSISDN_PROCESS_JOB_MAX_THREADS="BULK_CHANGE_MSISDN_PROCESS_JOB_MAX_THREADS";

    public static final String POSTPAID_BULK_SIMS_UPLOAD_DETAILS_DEFAULT_TRIGGER_VAL = "0 0/60 * * * ?";
    public static final String POSTPAID_BULK_SIMS_UPLOAD_DETAILS_TIMER_PATTERN="POSTPAID_BULK_SIMS_UPLOAD_DETAILS_TIMER_PATTERN";
	public static final String POSTPAID_BULK_SIMS_UPLOAD_DETAILS_SWITCH = "POSTPAID_BULK_SIMS_UPLOAD_DETAILS_SWITCH";

	// Added for EMA_CMD_RETRY_JOB
	public static final String EMA_CMD_EXTERNAL_NW_ID = "EMA_CMD_EXTERNAL_NW_ID";
	public static final String EMA_CMD_INSTANCE_ID = "EMA_CMD_INSTANCE_ID";
	public static final String EMA_CMD_RETRY_JOB_SWITCH = "EMA_CMD_RETRY_JOB_SWITCH";
	public static final String EMA_CMD_RETRY_JOB_PATTERN = "EMA_CMD_RETRY_JOB_PATTERN";
	public static final String EMA_CMD_RETRY_JOB_MAX_RECORDS = "EMA_CMD_RETRY_JOB_MAX_RECORDS";
	public static final String EMA_CMD_RETRY_JOB_MAX_THREADS = "EMA_CMD_RETRY_JOB_MAX_THREADS";
	
	public static final String EMA_FLOW_JOB_SWITCH = "EMA_FLOW_JOB_SWITCH";
	public static final String EMA_FLOW_JOB_SWITCH_TIMER_PATTERN = "EMA_FLOW_JOB_SWITCH_TIMER_PATTERN";
	public static final String EMA_FLOW_JOB_SWITCH_DEFAULT_TRIGGER_VAL = "0 0/60 * * * ?";
	public static final String EMA_FLOW_JOB_EXTERNAL_NW_ID = "EMA_FLOW_JOB_EXTERNAL_NW_ID";
	public static final String EMA_FLOW_JOB_MAX_RECORDS = "EMA_FLOW_JOB_MAX_RECORDS";
	public static final String EMA_FLOW_JOB_MAX_THREADS = "EMA_FLOW_JOB_MAX_THREADS";
	public static final String EMA_FLOW_JOB_MAX_RETRY = "EMA_FLOW_JOB_MAX_RETRY";
	
	public static final String PREPAID_ACTIVATION_RETRY_JOB_SWITCH = "PREPAID_ACTIVATION_RETRY_JOB_SWITCH";
	public static final String PREPAID_ACTIVATION_RETRY_JOB_SWITCH_TIMER_PATTERN = "PREPAID_ACTIVATION_RETRY_JOB_SWITCH_TIMER_PATTERN";
	public static final String PREPAID_ACTIVATION_RETRY_JOB_SWITCH_DEFAULT_TRIGGER_VAL = "0 0/60 * * * ?";
	public static final String PREPAID_ACTIVATION_RETRY_JOB_EXTERNAL_NW_ID = "PREPAID_ACTIVATION_RETRY_JOB_EXTERNAL_NW_ID";
	public static final String PREPAID_ACTIVATION_RETRY_JOB_MAX_RECORDS = "PREPAID_ACTIVATION_RETRY_JOB_MAX_RECORDS";
	public static final String PREPAID_ACTIVATION_RETRY_MAX_THREADS = "PREPAID_ACTIVATION_RETRY_MAX_THREADS";
	public static final String PREPAID_ACTIVATION_RETRY_JOB_MAX_RETRY = "PREPAID_ACTIVATION_RETRY_JOB_MAX_RETRY";

	public static final String RETRY_CHANGE_DEVICE_PROCESS_JOB_SWITCH = "RETRY_CHANGE_DEVICE_PROCESS_JOB_SWITCH";
	public static final String RETRY_CHANGE_DEVICE_PROCESS_JOB_SWITCH_TIMER_PATTERN = "RETRY_CHANGE_DEVICE_PROCESS_JOB_SWITCH_TIMER_PATTERN";
	public static final String RETRY_CHANGE_DEVICE_PROCESS_JOB_SWITCH_DEFAULT_TRIGGER_VAL = "0 0/60 * * * ?";
	public static final String RETRY_CHANGE_DEVICE_PROCESS_JOB_EXTERNAL_NW_ID = "RETRY_CHANGE_DEVICE_PROCESS_JOB_EXTERNAL_NW_ID";
	public static final String RETRY_CHANGE_DEVICE_PROCESS_JOB_MAX_RECORDS = "RETRY_CHANGE_DEVICE_PROCESS_JOB_MAX_RECORDS";
	public static final String RETRY_CHANGE_DEVICE_PROCESS_JOB_MAX_THREADS = "RETRY_CHANGE_DEVICE_PROCESS_JOB_MAX_THREADS";
	public static final String RETRY_CHANGE_DEVICE_PROCESS_MAX_RETRY = "RETRY_CHANGE_DEVICE_PROCESS_MAX_RETRY";

	public static final String hlr_verify_job_Switch = "hlr_verify_job";
	public static final String hlr_verify_job_Switch_TIMER_PATTERN = "hlr_verify_job_Switch_TIMER_PATTERN";
	public static final String hlr_verify_job_Switch_DEFAULT_TRIGGER_VAL = "0 0/60 * * * ?";
	public static final String hlr_verify_job_Switch_EXTERNAL_NW_ID = "hlr_verify_job_Switch_EXTERNAL_NW_ID";
	public static final String hlr_verify_job_Switch_MAX_RECORDS = "hlr_verify_job_Switch_MAX_RECORDS";
	public static final String hlr_verify_job_Switch_MAX_THREADS = "hlr_verify_job_Switch_MAX_THREADS";
	public static final String hlr_verify_job_Switch_OPERATION_TYPE = "hlr_verify_job_Switch_OPERATION_TYPE";
	public static final String hlr_verify_job_Switch_COMMAND_TYPE = "hlr_verify_job_Switch_COMMAND_TYPE";
	public static final String hlr_verify_job_Switch_FILE_PATH = "hlr_verify_job_Switch_FILE_PATH";

}
