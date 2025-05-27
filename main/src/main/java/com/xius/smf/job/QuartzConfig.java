package com.xius.smf.job;

import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import com.xius.smf.config.JobProperties;


@Configuration
public class QuartzConfig {
	private static final Logger logger = LogManager.getLogger("QuartzConfig");

	private final JobProperties jobProperties;
	
	@Autowired
	Environment environment;
	
    public QuartzConfig(JobProperties jobProperties) {
        this.jobProperties = jobProperties;
    }
    

	@PostConstruct
	public void logJobConfiguration() {
		
		logger.info("BULK_INITIATER_RC_SUBSCRIPTION_JOB_SWITCH"+ "---> is "+environment.getProperty("BULK_INITIATER_RC_SUBSCRIPTION_JOB_SWITCH"));
		logger.info("BULK_INITIATER_RC_SUBSCRIPTION_JOB_PATTERN"+ "---> is "+environment.getProperty("BULK_INITIATER_RC_SUBSCRIPTION_JOB_PATTERN"));
				
		logger.info("BULK_RC_SUBSCRIPTION_JOB_SWITCH"+ "---> is "+environment.getProperty("BULK_RC_SUBSCRIPTION_JOB_SWITCH"));
		logger.info("BULK_RC_SUBSCRIPTION_JOB_PATTERN"+ "---> is "+environment.getProperty("BULK_RC_SUBSCRIPTION_JOB_PATTERN"));
			
		logger.info("FTP_BULK_SIMS_UPLOAD_SWITCH"+ "---> is "+environment.getProperty("FTP_BULK_SIMS_UPLOAD_SWITCH"));
		logger.info("FTP_BULK_SIMS_UPLOAD_TIMER_PATTERN"+ "---> is "+environment.getProperty("FTP_BULK_SIMS_UPLOAD_TIMER_PATTERN"));
		
		logger.info("LOWBAL_NOTIFICATION_SWITCH"+ "---> is "+environment.getProperty("LOWBAL_NOTIFICATION_SWITCH"));
		logger.info("LOW_BALANCE_TIMER_PATTERN"+ "---> is "+environment.getProperty("LOW_BALANCE_TIMER_PATTERN"));
			
		logger.info("SCHEDULE_CUG_PARENT_DEBIT_SWITCH"+ "---> is "+environment.getProperty("SCHEDULE_CUG_PARENT_DEBIT_SWITCH"));
		logger.info("SCHEDULE_CUG_PARENT_DEBIT_TIMER_PATTERN"+ "---> is "+environment.getProperty("SCHEDULE_CUG_PARENT_DEBIT_TIMER_PATTERN"));
		
		logger.info("SCHEDULE_CUG_CHILD_TOPUP_SWITCH"+ "---> is "+environment.getProperty("SCHEDULE_CUG_CHILD_TOPUP_SWITCH"));
		logger.info("SCHEDULE_CUG_CHILD_TOPUP_TIMER_PATTERN"+ "---> is "+environment.getProperty("SCHEDULE_CUG_CHILD_TOPUP_TIMER_PATTERN"));
		
		logger.info("BULK_UPLOAD_SUBSCRIBER_SWITCH"+ "---> is "+environment.getProperty("BULK_UPLOAD_SUBSCRIBER_SWITCH"));
		logger.info("BULK_UPLOAD_SUBSCRIBER_TIMER_PATTERN"+ "---> is "+environment.getProperty("BULK_UPLOAD_SUBSCRIBER_TIMER_PATTERN"));
				
		logger.info("UPLOAD_BULK_ID_REPLACEMENT_SWITCH"+ "---> is "+environment.getProperty("UPLOAD_BULK_ID_REPLACEMENT_SWITCH"));
		logger.info("UPLOAD_BULK_ID_REPLACEMENT_TIMER_PATTERN"+ "---> is "+environment.getProperty("UPLOAD_BULK_ID_REPLACEMENT_TIMER_PATTERN"));
	
		logger.info("UPLOAD_DEMOGRAPHIC_DETAILS_SWITCH"+ "---> is "+environment.getProperty("UPLOAD_DEMOGRAPHIC_DETAILS_SWITCH"));
		logger.info("UPLOAD_DEMOGRAPHIC_DETAILS_TIMER_PATTERN"+ "---> is "+environment.getProperty("UPLOAD_DEMOGRAPHIC_DETAILS_TIMER_PATTERN"));
		
		logger.info("HLR_JOB_SWITCH"+ "---> is "+environment.getProperty("HLR_JOB_SWITCH"));
		logger.info("HLR_JOB_TIMER_PATTERN"+ "---> is "+environment.getProperty("HLR_JOB_TIMER_PATTERN"));
	
		logger.info("TOPUP_NOTIF_JOB_SWITCH"+ "---> is "+environment.getProperty("TOPUP_NOTIF_JOB_SWITCH"));
		logger.info("TOPUP_NOTIF_JOB_TIMER_PATTERN"+ "---> is "+environment.getProperty("TOPUP_NOTIF_JOB_TIMER_PATTERN"));
	
		logger.info("DATA_RENEWAL_DATA_THRESHOLD_JOB_SWITCH"+ "---> is "+environment.getProperty("DATA_RENEWAL_DATA_THRESHOLD_JOB_SWITCH"));
		logger.info("DATA_RENEWAL_DATA_THRESHOLD_JOB_TIMER_PATTERN"+ "---> is "+environment.getProperty("DATA_RENEWAL_DATA_THRESHOLD_JOB_TIMER_PATTERN"));
	
		logger.info("POSTPAID_BILL_GEN_NOTIFY_JOB_SWITCH"+ "---> is "+environment.getProperty("POSTPAID_BILL_GEN_NOTIFY_JOB_SWITCH"));
		logger.info("POSTPAID_BILL_GEN_NOTIFY_JOB_TIMER_PATTERN"+ "---> is "+environment.getProperty("POSTPAID_BILL_GEN_NOTIFY_JOB_TIMER_PATTERN"));
	
		logger.info("HLR_STATECHANGE_NOTIFY_JOB_SWITCH"+ "---> is "+environment.getProperty("HLR_STATECHANGE_NOTIFY_JOB_SWITCH"));
		logger.info("HLR_STATECHANGE_NOTIFY_JOB_PATTERN"+ "---> is "+environment.getProperty("HLR_STATECHANGE_NOTIFY_JOB_PATTERN"));
	
		logger.info("CHANGEMSISDN_RETRY_JOB_SWITCH"+ "---> is "+environment.getProperty("CHANGEMSISDN_RETRY_JOB_SWITCH"));
		logger.info("CHANGEMSISDN_RETRY_JOB_PATTERN"+ "---> is "+environment.getProperty("CHANGEMSISDN_RETRY_JOB_PATTERN"));
	
		logger.info("SIMSWAP_RETRY_JOB_SWITCH"+ "---> is "+environment.getProperty("SIMSWAP_RETRY_JOB_SWITCH"));
		logger.info("SIMSWAP_RETRY_JOB_PATTERN"+ "---> is "+environment.getProperty("SIMSWAP_RETRY_JOB_PATTERN"));
	
		logger.info("STATECHANGE_RETRY_JOB_SWITCH"+ "---> is "+environment.getProperty("STATECHANGE_RETRY_JOB_SWITCH"));
		logger.info("STATECHANGE_RETRY_JOB_PATTERN"+ "---> is "+environment.getProperty("STATECHANGE_RETRY_JOB_PATTERN"));
	
		logger.info("STATECHANGE_EXPIRY_JOB_SWITCH"+ "---> is "+environment.getProperty("STATECHANGE_EXPIRY_JOB_SWITCH"));
		logger.info("STATECHANGE_EXPIRY_JOB_PATTERN"+ "---> is "+environment.getProperty("STATECHANGE_EXPIRY_JOB_PATTERN"));
	
		logger.info("STATECHANGE_EXPIRY_RETRY_JOB_SWITCH"+ "---> is "+environment.getProperty("STATECHANGE_EXPIRY_RETRY_JOB_SWITCH"));
		logger.info("STATECHANGE_EXPIRY_RETRY_JOB_PATTERN"+ "---> is "+environment.getProperty("STATECHANGE_EXPIRY_RETRY_JOB_PATTERN"));
	
		logger.info("RETRY_FROM_SMF_JOB_SWITCH"+ "---> is "+environment.getProperty("RETRY_FROM_SMF_JOB_SWITCH"));
		logger.info("RETRY_FROM_SMF_JOB_PATTERN"+ "---> is "+environment.getProperty("RETRY_FROM_SMF_JOB_PATTERN"));
	
		logger.info("BULK_ATP_SUBSCRIPTION_JOB_SWITCH"+ "---> is "+environment.getProperty("BULK_ATP_SUBSCRIPTION_JOB_SWITCH"));
		logger.info("BULK_ATP_SUBSCRIPTION_JOB_PATTERN"+ "---> is "+environment.getProperty("BULK_ATP_SUBSCRIPTION_JOB_PATTERN"));
		
		logger.info("BULK_SIMS_UPLOAD_DETAILS_SWITCH"+ "---> is "+environment.getProperty("BULK_SIMS_UPLOAD_DETAILS_SWITCH"));
		logger.info("BULK_SIMS_UPLOAD_DETAILS_TIMER_PATTERN"+ "---> is "+environment.getProperty("BULK_SIMS_UPLOAD_DETAILS_TIMER_PATTERN"));
		
		logger.info("POSTPAID_BULK_SIMS_UPLOAD_DETAILS_SWITCH"+ "---> is "+environment.getProperty("POSTPAID_BULK_SIMS_UPLOAD_DETAILS_SWITCH"));
		logger.info("POSTPAID_BULK_SIMS_UPLOAD_DETAILS_TIMER_PATTERN"+ "---> is "+environment.getProperty("POSTPAID_BULK_SIMS_UPLOAD_DETAILS_TIMER_PATTERN"));
		
		logger.info("BULK_TP_SUBSCRIPTION_JOB_SWITCH"+ "---> is "+environment.getProperty("BULK_TP_SUBSCRIPTION_JOB_SWITCH"));
		logger.info("BULK_TP_SUBSCRIPTION_JOB_PATTERN"+ "---> is "+environment.getProperty("BULK_TP_SUBSCRIPTION_JOB_PATTERN"));
		
		logger.info("SORIANA_RETRY_JOB_SWITCH"+ "---> is "+environment.getProperty("SORIANA_RETRY_JOB_SWITCH"));
		logger.info("SORIANA_RETRY_JOB_PATTERN"+ "---> is "+environment.getProperty("SORIANA_RETRY_JOB_PATTERN"));
		
		logger.info("THRESHOLD_LIMIT_MONITORING_JOB_SWITCH"+ "---> is "+environment.getProperty("THRESHOLD_LIMIT_MONITORING_JOB_SWITCH"));
		logger.info("THRESHOLD_LIMIT_MONITORING_JOB_PATTERN"+ "---> is "+environment.getProperty("THRESHOLD_LIMIT_MONITORING_JOB_PATTERN"));
		
//		logger.info(jobProperties.getJobs().getBulkCredit().getName() + " ---> Job Switch ---> " + jobProperties.getJobs().getBulkCredit().getSwitch());
//		logger.info(jobProperties.getJobs().getBulkCredit().getName() + " ---> CronExpression ---> "+ jobProperties.getJobs().getBulkCredit().getCronExpression());
//
//		logger.info(jobProperties.getJobs().getBulkSplCredit().getName() + " ---> Job Switch ---> " + jobProperties.getJobs().getBulkSplCredit().getSwitch());
//		logger.info(jobProperties.getJobs().getBulkSplCredit().getName() + " ---> CronExpression ---> "+ jobProperties.getJobs().getBulkSplCredit().getCronExpression());
//
//		logger.info(jobProperties.getJobs().getBulkDebit().getName() + " ---> Job Switch ---> " + jobProperties.getJobs().getBulkDebit().getSwitch());
//		logger.info(jobProperties.getJobs().getBulkDebit().getName() + " ---> CronExpression ---> "+ jobProperties.getJobs().getBulkDebit().getCronExpression());
//
//		logger.info(jobProperties.getJobs().getPaytmTxStatusRetry().getName() + " ---> Job Switch ---> " + jobProperties.getJobs().getPaytmTxStatusRetry().getSwitch());
//		logger.info(jobProperties.getJobs().getPaytmTxStatusRetry().getName() + " ---> CronExpression ---> "+ jobProperties.getJobs().getPaytmTxStatusRetry().getCronExpression());
//	
//		logger.info(jobProperties.getJobs().getPaytmTxStatusRetry().getName() + " ---> Job Switch ---> " + jobProperties.getJobs().getPaytmTxStatusRetry().getSwitch());
//		logger.info(jobProperties.getJobs().getPaytmTxStatusRetry().getName() + " ---> CronExpression ---> "+ jobProperties.getJobs().getPaytmTxStatusRetry().getCronExpression());
//	
//		logger.info(jobProperties.getJobs().getBulkActDeact().getName() + " ---> Job Switch ---> " + jobProperties.getJobs().getBulkActDeact().getSwitch());
//		logger.info(jobProperties.getJobs().getBulkActDeact().getName() + " ---> CronExpression ---> "+ jobProperties.getJobs().getBulkActDeact().getCronExpression());
//	
//		logger.info(jobProperties.getJobs().getBulkCorpRctSub().getName() + " ---> Job Switch ---> " + jobProperties.getJobs().getBulkCorpRctSub().getSwitch());
//		logger.info(jobProperties.getJobs().getBulkCorpRctSub().getName() + " ---> CronExpression ---> "+ jobProperties.getJobs().getBulkCorpRctSub().getCronExpression());
//		
//		logger.info(jobProperties.getJobs().getDataEnableDisable().getName() + " ---> Job Switch ---> " + jobProperties.getJobs().getDataEnableDisable().getSwitch());
//		logger.info(jobProperties.getJobs().getDataEnableDisable().getName() + " ---> CronExpression ---> "+ jobProperties.getJobs().getDataEnableDisable().getCronExpression());
//
//		logger.info(jobProperties.getJobs().getUsageThresholdLimitNotify().getName() + " ---> Job Switch ---> " + jobProperties.getJobs().getUsageThresholdLimitNotify().getSwitch());
//		logger.info(jobProperties.getJobs().getUsageThresholdLimitNotify().getName() + " ---> CronExpression ---> "+ jobProperties.getJobs().getUsageThresholdLimitNotify().getCronExpression());
//
//		logger.info(jobProperties.getJobs().getFirstLuProcess().getName() + " ---> Job Switch ---> " + jobProperties.getJobs().getFirstLuProcess().getSwitch());
//		logger.info(jobProperties.getJobs().getFirstLuProcess().getName() + " ---> CronExpression ---> "+ jobProperties.getJobs().getFirstLuProcess().getCronExpression());
//
//		logger.info(jobProperties.getJobs().getYFAPIProcess().getName() + " ---> Job Switch ---> " + jobProperties.getJobs().getYFAPIProcess().getSwitch());
//		logger.info(jobProperties.getJobs().getYFAPIProcess().getName() + " ---> CronExpression ---> "+ jobProperties.getJobs().getYFAPIProcess().getCronExpression());
//	
//		logger.info(jobProperties.getJobs().getTTPCRF().getName() + " ---> Job Switch ---> " + jobProperties.getJobs().getTTPCRF().getSwitch());
//		logger.info(jobProperties.getJobs().getTTPCRF().getName() + " ---> CronExpression ---> "+ jobProperties.getJobs().getTTPCRF().getCronExpression());
//	
		logger.info("VOLTE_JOB_SWITCH"+ "---> is "+environment.getProperty("VOLTE_JOB_SWITCH"));
		logger.info("VOLTE_JOB_PATTERN"+ "---> is "+environment.getProperty("VOLTE_JOB_PATTERN"));
		
//		logger.info(jobProperties.getJobs().getTIARetry().getName() + " ---> Job Switch ---> " + jobProperties.getJobs().getTIARetry().getSwitch());
//		logger.info(jobProperties.getJobs().getTIARetry().getName() + " ---> CronExpression ---> "+ jobProperties.getJobs().getTIARetry().getCronExpression());
//	
//		logger.info(jobProperties.getJobs().getSMSNotifier().getName() + " ---> Job Switch ---> " + jobProperties.getJobs().getSMSNotifier().getSwitch());
//		logger.info(jobProperties.getJobs().getSMSNotifier().getName() + " ---> CronExpression ---> "+ jobProperties.getJobs().getSMSNotifier().getCronExpression());
//	
//		logger.info(jobProperties.getJobs().getCAGroupCreation().getName() + " ---> Job Switch ---> " + jobProperties.getJobs().getCAGroupCreation().getSwitch());
//		logger.info(jobProperties.getJobs().getCAGroupCreation().getName() + " ---> CronExpression ---> "+ jobProperties.getJobs().getCAGroupCreation().getCronExpression());
//	
//		logger.info(jobProperties.getJobs().getIMEIFileUpload().getName() + " ---> Job Switch ---> " + jobProperties.getJobs().getIMEIFileUpload().getSwitch());
//		logger.info(jobProperties.getJobs().getIMEIFileUpload().getName() + " ---> CronExpression ---> "+ jobProperties.getJobs().getIMEIFileUpload().getCronExpression());
//	
//		logger.info(jobProperties.getJobs().getIMEILogRead().getName() + " ---> Job Switch ---> " + jobProperties.getJobs().getIMEILogRead().getSwitch());
//		logger.info(jobProperties.getJobs().getIMEILogRead().getName() + " ---> CronExpression ---> "+ jobProperties.getJobs().getIMEILogRead().getCronExpression());
//	
//		logger.info(jobProperties.getJobs().getMDNRegActProcess().getName() + " ---> Job Switch ---> " + jobProperties.getJobs().getMDNRegActProcess().getSwitch());
//		logger.info(jobProperties.getJobs().getMDNRegActProcess().getName() + " ---> CronExpression ---> "+ jobProperties.getJobs().getMDNRegActProcess().getCronExpression());
//		
//		logger.info(jobProperties.getJobs().getBulkSimSwapProcess().getName() + " ---> Job Switch ---> " + jobProperties.getJobs().getBulkSimSwapProcess().getSwitch());
//		logger.info(jobProperties.getJobs().getBulkSimSwapProcess().getName() + " ---> CronExpression ---> "+ jobProperties.getJobs().getBulkSimSwapProcess().getCronExpression());
//		
//		logger.info(jobProperties.getJobs().getBulkChangeMsisdnProcess().getName() + " ---> Job Switch ---> " + jobProperties.getJobs().getBulkChangeMsisdnProcess().getSwitch());
//		logger.info(jobProperties.getJobs().getBulkChangeMsisdnProcess().getName() + " ---> CronExpression ---> "+ jobProperties.getJobs().getBulkChangeMsisdnProcess().getCronExpression());
//		
//		logger.info(jobProperties.getJobs().getBulkStateChangeProcess().getName() + " ---> Job Switch ---> " + jobProperties.getJobs().getBulkStateChangeProcess().getSwitch());
//		logger.info(jobProperties.getJobs().getBulkStateChangeProcess().getName() + " ---> CronExpression ---> "+ jobProperties.getJobs().getBulkStateChangeProcess().getCronExpression());
//		
		logger.info("BULK_SUBS_FLOW_PROCESS_JOB_SWITCH"+ "---> is "+environment.getProperty("BULK_SUBS_FLOW_PROCESS_JOB_SWITCH"));
		logger.info("BULK_SUBS_FLOW_PROCESS_JOB_SWITCH_TIMER_PATTERN"+ "---> is "+environment.getProperty("BULK_SUBS_FLOW_PROCESS_JOB_SWITCH_TIMER_PATTERN"));		
		
		logger.info("LTE_RETRY_PROCESS_JOB_SWITCH"+ "---> is "+environment.getProperty("LTE_RETRY_PROCESS_JOB_SWITCH"));
		logger.info("LTE_RETRY_PROCESS_JOB_SWITCH_TIMER_PATTERN"+ "---> is "+environment.getProperty("LTE_RETRY_PROCESS_JOB_SWITCH_TIMER_PATTERN"));		
		
		logger.info("EMA_CMD_RETRY_JOB_SWITCH"+ "---> is "+environment.getProperty("EMA_CMD_RETRY_JOB_SWITCH"));
		logger.info("EMA_CMD_RETRY_JOB_PATTERN"+ "---> is "+environment.getProperty("EMA_CMD_RETRY_JOB_PATTERN"));
		
		logger.info("EMA_FLOW_JOB_SWITCH"+ "---> is "+environment.getProperty("EMA_FLOW_JOB_SWITCH"));
		logger.info("EMA_FLOW_JOB_SWITCH_TIMER_PATTERN"+ "---> is "+environment.getProperty("EMA_FLOW_JOB_SWITCH_TIMER_PATTERN"));
		
//		logger.info(jobProperties.getJobs().getPrepaidActivationRetryProcess().getName() + " ---> Job Switch ---> " + jobProperties.getJobs().getPrepaidActivationRetryProcess().getSwitch());
//		logger.info(jobProperties.getJobs().getPrepaidActivationRetryProcess().getName() + " ---> CronExpression ---> "+ jobProperties.getJobs().getPrepaidActivationRetryProcess().getCronExpression());
//
//		logger.info(jobProperties.getJobs().getRetrychangedevice().getName() + " ---> Job Switch ---> " + jobProperties.getJobs().getRetrychangedevice().getSwitch());
//		logger.info(jobProperties.getJobs().getRetrychangedevice().getName() + " ---> CronExpression ---> " + jobProperties.getJobs().getRetrychangedevice().getCronExpression());
//		
//		logger.info(jobProperties.getJobs().getHlrverify().getName() + " ---> Job Switch ---> " + jobProperties.getJobs().getHlrverify().getSwitch());
//		logger.info(jobProperties.getJobs().getHlrverify().getName() + " ---> CronExpression ---> " + jobProperties.getJobs().getHlrverify().getCronExpression());
	}
	// BulkInitiaterRCSubscriptionJob
	@Bean
	@ConditionalOnProperty(name = "BULK_INITIATER_RC_SUBSCRIPTION_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean BulkInitiaterRCSubscriptionJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(BulkInitiaterRCSubscriptionJob.class);
		factoryBean.setName("BulkInitiaterRCSubscriptionJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "BULK_INITIATER_RC_SUBSCRIPTION_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean BulkInitiaterRCSubscriptionJobTrigger(
			@Qualifier("BulkInitiaterRCSubscriptionJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("BULK_INITIATER_RC_SUBSCRIPTION_JOB_PATTERN"));
		triggerFactory.setBeanName("BulkInitiaterRCSubscriptionJobTrigger");
		return triggerFactory;
	}
	
	// BulkRCSubscriptionJob
	@Bean
	@ConditionalOnProperty(name = "BULK_RC_SUBSCRIPTION_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean BulkRCSubscriptionJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(BulkRCSubscriptionJob.class);
		factoryBean.setName("BulkRCSubscriptionJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "BULK_RC_SUBSCRIPTION_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean BulkRCSubscriptionJobTrigger(
			@Qualifier("BulkRCSubscriptionJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("BULK_RC_SUBSCRIPTION_JOB_PATTERN"));
		triggerFactory.setBeanName("BulkRCSubscriptionJobTrigger");
		return triggerFactory;
	}
	
	// FTPFileBulkSimUploadJob
	@Bean
	@ConditionalOnProperty(name = "FTP_BULK_SIMS_UPLOAD_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean FTPFileBulkSimUploadJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(FTPFileBulkSimUploadJob.class);
		factoryBean.setName("FTPFileBulkSimUploadJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "FTP_BULK_SIMS_UPLOAD_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean FTPFileBulkSimUploadJobTrigger(
			@Qualifier("FTPFileBulkSimUploadJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("FTP_BULK_SIMS_UPLOAD_TIMER_PATTERN"));
		triggerFactory.setBeanName("FTPFileBulkSimUploadJobTrigger");
		return triggerFactory;
	}
	
	// BalNotificationJob
	@Bean
	@ConditionalOnProperty(name = "LOWBAL_NOTIFICATION_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean BalNotificationJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(BalNotificationJob.class);
		factoryBean.setName("BalNotificationJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "LOWBAL_NOTIFICATION_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean BalNotificationJobTrigger(
			@Qualifier("BalNotificationJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("LOW_BALANCE_TIMER_PATTERN"));
		triggerFactory.setBeanName("BalNotificationJobTrigger");
		return triggerFactory;
	}
	
	// ScheduleCUGDebitJob
	@Bean
	@ConditionalOnProperty(name = "SCHEDULE_CUG_PARENT_DEBIT_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean ScheduleCUGDebitJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(ScheduleCUGDebitJob.class);
		factoryBean.setName("ScheduleCUGDebitJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "SCHEDULE_CUG_PARENT_DEBIT_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean ScheduleCUGDebitJobTrigger(
			@Qualifier("ScheduleCUGDebitJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("SCHEDULE_CUG_PARENT_DEBIT_TIMER_PATTERN"));
		triggerFactory.setBeanName("ScheduleCUGDebitJobTrigger");
		return triggerFactory;
	}
	
	// ScheduleCUGTopUpJob
	@Bean
	@ConditionalOnProperty(name = "SCHEDULE_CUG_CHILD_TOPUP_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean ScheduleCUGTopUpJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(ScheduleCUGTopUpJob.class);
		factoryBean.setName("ScheduleCUGTopUpJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "SCHEDULE_CUG_CHILD_TOPUP_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean ScheduleCUGTopUpJobTrigger(
			@Qualifier("ScheduleCUGTopUpJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("SCHEDULE_CUG_CHILD_TOPUP_TIMER_PATTERN"));
		triggerFactory.setBeanName("ScheduleCUGTopUpJobTrigger");
		return triggerFactory;
	}
	
	// SubscriberBulkUploadJob
	@Bean
	@ConditionalOnProperty(name = "BULK_UPLOAD_SUBSCRIBER_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean SubscriberBulkUploadJobJobDetail() {
			JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
			factoryBean.setJobClass(SubscriberBulkUploadJob.class);
			factoryBean.setName("SubscriberBulkUploadJob");
			factoryBean.setGroup("SMF_AGENT");
			factoryBean.setDurability(true);
			return factoryBean;
	}
	
	@Bean
	@ConditionalOnProperty(name = "BULK_UPLOAD_SUBSCRIBER_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean SubscriberBulkUploadJobTrigger(
	    @Qualifier("SubscriberBulkUploadJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
	        CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
	        triggerFactory.setJobDetail(jobDetail.getObject());
	        triggerFactory.setCronExpression(environment.getProperty("BULK_UPLOAD_SUBSCRIBER_TIMER_PATTERN"));
	        triggerFactory.setBeanName("SubscriberBulkUploadJobTrigger");
	        return triggerFactory;
	}
	
	// UploadBulkIDReplacementJob
	@Bean
	@ConditionalOnProperty(name = "UPLOAD_BULK_ID_REPLACEMENT_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean UploadBulkIDReplacementJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(UploadBulkIDReplacementJob.class);
		factoryBean.setName("UploadBulkIDReplacementJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "UPLOAD_BULK_ID_REPLACEMENT_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean UploadBulkIDReplacementJobTrigger(
			@Qualifier("UploadBulkIDReplacementJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("UPLOAD_BULK_ID_REPLACEMENT_TIMER_PATTERN"));
		triggerFactory.setBeanName("UploadBulkIDReplacementJobTrigger");
		return triggerFactory;
	}
	
	// UploadDemographicDetailsJob
	@Bean
	@ConditionalOnProperty(name = "UPLOAD_DEMOGRAPHIC_DETAILS_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean UploadDemographicDetailsJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(UploadDemographicDetailsJob.class);
		factoryBean.setName("UploadDemographicDetailsJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "UPLOAD_DEMOGRAPHIC_DETAILS_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean UploadDemographicDetailsJobTrigger(
			@Qualifier("UploadDemographicDetailsJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("UPLOAD_DEMOGRAPHIC_DETAILS_TIMER_PATTERN"));
		triggerFactory.setBeanName("UploadDemographicDetailsJobTrigger");
		return triggerFactory;
	}
	
	// HLRJob
	@Bean
	@ConditionalOnProperty(name = "HLR_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean HLRJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(HLRJob.class);
		factoryBean.setName("HLRJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "HLR_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean HLRJobTrigger(
			@Qualifier("HLRJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("HLR_JOB_TIMER_PATTERN"));
		triggerFactory.setBeanName("HLRJobTrigger");
		return triggerFactory;
	}
	
	// TopUpNotifJob
	@Bean
	@ConditionalOnProperty(name = "TOPUP_NOTIF_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean TopUpNotifJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(TopUpNotifJob.class);
		factoryBean.setName("TopUpNotifJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "TOPUP_NOTIF_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean TopUpNotifJobTrigger(
			@Qualifier("TopUpNotifJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("TOPUP_NOTIF_JOB_TIMER_PATTERN"));
		triggerFactory.setBeanName("TopUpNotifJobTrigger");
		return triggerFactory;
	}
	
	// DataRenewalDataThresholdNotifJob
	@Bean
	@ConditionalOnProperty(name = "DATA_RENEWAL_DATA_THRESHOLD_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean DataRenewalDataThresholdNotifJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(DataRenewalDataThresholdNotifJob.class);
		factoryBean.setName("DataRenewalDataThresholdNotifJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "DATA_RENEWAL_DATA_THRESHOLD_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean DataRenewalDataThresholdNotifJobTrigger(
			@Qualifier("DataRenewalDataThresholdNotifJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("DATA_RENEWAL_DATA_THRESHOLD_JOB_TIMER_PATTERN"));
		triggerFactory.setBeanName("DataRenewalDataThresholdNotifJobTrigger");
		return triggerFactory;
	}
	
	// PostpaidBilGenNotificationJob
	@Bean
	@ConditionalOnProperty(name = "POSTPAID_BILL_GEN_NOTIFY_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean PostpaidBilGenNotificationJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(PostpaidBilGenNotificationJob.class);
		factoryBean.setName("PostpaidBilGenNotificationJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "POSTPAID_BILL_GEN_NOTIFY_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean PostpaidBilGenNotificationJobTrigger(
			@Qualifier("PostpaidBilGenNotificationJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("POSTPAID_BILL_GEN_NOTIFY_JOB_TIMER_PATTERN"));
		triggerFactory.setBeanName("PostpaidBilGenNotificationJobTrigger");
		return triggerFactory;
	}
	
	// HlrStateChangeNotifyJob
	@Bean
	@ConditionalOnProperty(name = "HLR_STATECHANGE_NOTIFY_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean HlrStateChangeNotifyJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(HlrStateChangeNotifyJob.class);
		factoryBean.setName("HlrStateChangeNotifyJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "HLR_STATECHANGE_NOTIFY_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean HlrStateChangeNotifyJobTrigger(
			@Qualifier("HlrStateChangeNotifyJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("HLR_STATECHANGE_NOTIFY_JOB_PATTERN"));
		triggerFactory.setBeanName("HlrStateChangeNotifyJobTrigger");
		return triggerFactory;
	}
	
	// ChangeMSISDNRetryJob
	@Bean
	@ConditionalOnProperty(name = "CHANGEMSISDN_RETRY_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean ChangeMSISDNRetryJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(ChangeMSISDNRetryJob.class);
		factoryBean.setName("ChangeMSISDNRetryJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "CHANGEMSISDN_RETRY_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean ChangeMSISDNRetryJobTrigger(
			@Qualifier("ChangeMSISDNRetryJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("CHANGEMSISDN_RETRY_JOB_PATTERN"));
		triggerFactory.setBeanName("ChangeMSISDNRetryJobTrigger");
		return triggerFactory;
	}
	
	// SimSwapRetryJob	
	@Bean
	@ConditionalOnProperty(name = "SIMSWAP_RETRY_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean SimSwapRetryJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(SimSwapRetryJob.class);
		factoryBean.setName("SimSwapRetryJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "SIMSWAP_RETRY_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean SimSwapRetryJobTrigger(
			@Qualifier("SimSwapRetryJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("SIMSWAP_RETRY_JOB_PATTERN"));
		triggerFactory.setBeanName("SimSwapRetryJobTrigger");
		return triggerFactory;
	}
	
	// StateChangeRetryJob
	@Bean
	@ConditionalOnProperty(name = "STATECHANGE_RETRY_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean StateChangeRetryJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(StateChangeRetryJob.class);
		factoryBean.setName("StateChangeRetryJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "STATECHANGE_RETRY_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean StateChangeRetryJobTrigger(
			@Qualifier("StateChangeRetryJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("STATECHANGE_RETRY_JOB_PATTERN"));
		triggerFactory.setBeanName("StateChangeRetryJobTrigger");
		return triggerFactory;
	}
	
	// StateChangeExpiryJob
	@Bean
	@ConditionalOnProperty(name = "STATECHANGE_EXPIRY_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean StateChangeExpiryJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(StateChangeExpiryJob.class);
		factoryBean.setName("StateChangeExpiryJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "STATECHANGE_EXPIRY_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean StateChangeExpiryJobTrigger(
			@Qualifier("StateChangeExpiryJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("STATECHANGE_EXPIRY_JOB_PATTERN"));
		triggerFactory.setBeanName("StateChangeExpiryJobTrigger");
		return triggerFactory;
	}
	
	// StateChangeExpiryRetryJob
	@Bean
	@ConditionalOnProperty(name = "STATECHANGE_EXPIRY_RETRY_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean StateChangeExpiryRetryJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(StateChangeExpiryRetryJob.class);
		factoryBean.setName("StateChangeExpiryRetryJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "STATECHANGE_EXPIRY_RETRY_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean StateChangeExpiryRetryJobTrigger(
			@Qualifier("StateChangeExpiryRetryJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("STATECHANGE_EXPIRY_RETRY_JOB_PATTERN"));
		triggerFactory.setBeanName("StateChangeExpiryRetryJobTrigger");
		return triggerFactory;
	}
	
	// RetryFromSMFJob
	@Bean
	@ConditionalOnProperty(name = "RETRY_FROM_SMF_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean RetryFromSMFJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(RetryFromSMFJob.class);
		factoryBean.setName("RetryFromSMFJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "RETRY_FROM_SMF_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean RetryFromSMFJobTrigger(
			@Qualifier("RetryFromSMFJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("RETRY_FROM_SMF_JOB_PATTERN"));
		triggerFactory.setBeanName("RetryFromSMFJobTrigger");
		return triggerFactory;
	}
	
	// BulkAtpsubsJob
	@Bean
	@ConditionalOnProperty(name = "BULK_ATP_SUBSCRIPTION_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean BulkAtpsubsJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(BulkAtpsubsJob.class);
		factoryBean.setName("BulkAtpsubsJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "BULK_ATP_SUBSCRIPTION_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean BulkAtpsubsJobTrigger(
			@Qualifier("BulkAtpsubsJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("BULK_ATP_SUBSCRIPTION_JOB_PATTERN"));
		triggerFactory.setBeanName("BulkAtpsubsJobTrigger");
		return triggerFactory;
	}
	
	// BulkUploadSIMsJob
	@Bean
	@ConditionalOnProperty(name = "BULK_SIMS_UPLOAD_DETAILS_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean BulkUploadSIMsJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(BulkUploadSIMsJob.class);
		factoryBean.setName("BulkUploadSIMsJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "BULK_SIMS_UPLOAD_DETAILS_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean BulkUploadSIMsJobTrigger(
			@Qualifier("BulkUploadSIMsJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("BULK_SIMS_UPLOAD_DETAILS_TIMER_PATTERN"));
		triggerFactory.setBeanName("BulkUploadSIMsJobTrigger");
		return triggerFactory;
	}
	
	// PostpaidBulkUploadSIMsJob
	@Bean
	@ConditionalOnProperty(name = "POSTPAID_BULK_SIMS_UPLOAD_DETAILS_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean PostpaidBulkUploadSIMsJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(PostpaidBulkUploadSIMsJob.class);
		factoryBean.setName("PostpaidBulkUploadSIMsJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "POSTPAID_BULK_SIMS_UPLOAD_DETAILS_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean PostpaidBulkUploadSIMsJobTrigger(
			@Qualifier("PostpaidBulkUploadSIMsJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("POSTPAID_BULK_SIMS_UPLOAD_DETAILS_TIMER_PATTERN"));
		triggerFactory.setBeanName("PostpaidBulkUploadSIMsJobTrigger");
		return triggerFactory;
	}
	
	// BulkTpSubsJob
	@Bean
	@ConditionalOnProperty(name = "BULK_TP_SUBSCRIPTION_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean BulkTpSubsJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(BulkTpSubsJob.class);
		factoryBean.setName("BulkTpSubsJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "BULK_TP_SUBSCRIPTION_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean BulkTpSubsJobTrigger(
			@Qualifier("BulkTpSubsJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("BULK_TP_SUBSCRIPTION_JOB_PATTERN"));
		triggerFactory.setBeanName("BulkTpSubsJobTrigger");
		return triggerFactory;
	}
	
	// SorianaRetryJob
	@Bean
	@ConditionalOnProperty(name = "SORIANA_RETRY_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean SorianaRetryJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(SorianaRetryJob.class);
		factoryBean.setName("SorianaRetryJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "SORIANA_RETRY_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean SorianaRetryJobTrigger(
			@Qualifier("SorianaRetryJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("SORIANA_RETRY_JOB_PATTERN"));
		triggerFactory.setBeanName("SorianaRetryJobTrigger");
		return triggerFactory;
	}
	
	// ThresholdLimitJob
	@Bean
	@ConditionalOnProperty(name = "THRESHOLD_LIMIT_MONITORING_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean ThresholdLimitJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(ThresholdLimitJob.class);
		factoryBean.setName("ThresholdLimitJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "THRESHOLD_LIMIT_MONITORING_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean ThresholdLimitJobTrigger(
			@Qualifier("ThresholdLimitJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("THRESHOLD_LIMIT_MONITORING_JOB_PATTERN"));
		triggerFactory.setBeanName("ThresholdLimitJobTrigger");
		return triggerFactory;
	}
	
	// BulkCreditJob
	@Bean
	@ConditionalOnProperty(name = "job.jobs.BulkCredit.Switch", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean BulkCreditJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(BulkCreditJob.class);
		factoryBean.setName(jobProperties.getJobs().getBulkCredit().getName());
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "job.jobs.BulkCredit.Switch", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean BulkCreditJobTrigger(
			@Qualifier("BulkCreditJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(jobProperties.getJobs().getBulkCredit().getCronExpression());
		triggerFactory.setBeanName("BulkCreditJobTrigger");
		return triggerFactory;
	}
	
	// BulkSplCreditJob
	@Bean
	@ConditionalOnProperty(name = "job.jobs.BulkSplCredit.Switch", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean BulkSplCreditJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(BulkSplCreditJob.class);
		factoryBean.setName(jobProperties.getJobs().getBulkSplCredit().getName());
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "job.jobs.BulkSplCredit.Switch", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean BulkSplCreditJobTrigger(
			@Qualifier("BulkSplCreditJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(jobProperties.getJobs().getBulkSplCredit().getCronExpression());
		triggerFactory.setBeanName("BulkSplCreditJobTrigger");
		return triggerFactory;
	}
	
	// BulkDebitJob
	@Bean
	@ConditionalOnProperty(name = "job.jobs.BulkDebit.Switch", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean BulkDebitJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(BulkDebitJob.class);
		factoryBean.setName(jobProperties.getJobs().getBulkDebit().getName());
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "job.jobs.BulkDebit.Switch", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean BulkDebitJobTrigger(
			@Qualifier("BulkDebitJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(jobProperties.getJobs().getBulkDebit().getCronExpression());
		triggerFactory.setBeanName("BulkDebitJobTrigger");
		return triggerFactory;
	}
	
	// PaytmTxStatusRetryJob
	@Bean
	@ConditionalOnProperty(name = "job.jobs.PaytmTxStatusRetry.Switch", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean PaytmTxStatusRetryJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(PaytmTxStatusRetryJob.class);
		factoryBean.setName(jobProperties.getJobs().getPaytmTxStatusRetry().getName());
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "job.jobs.PaytmTxStatusRetry.Switch", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean PaytmTxStatusRetryJobTrigger(
			@Qualifier("PaytmTxStatusRetryJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(jobProperties.getJobs().getPaytmTxStatusRetry().getCronExpression());
		triggerFactory.setBeanName("PaytmTxStatusRetryJobTrigger");
		return triggerFactory;
	}
	
	// BulkActDeactJob
	@Bean
	@ConditionalOnProperty(name = "job.jobs.BulkActDeact.Switch", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean BulkActDeactJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(BulkActDeactJob.class);
		factoryBean.setName(jobProperties.getJobs().getBulkActDeact().getName());
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "job.jobs.BulkActDeact.Switch", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean BulkActDeactJobTrigger(
			@Qualifier("BulkActDeactJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(jobProperties.getJobs().getBulkActDeact().getCronExpression());
		triggerFactory.setBeanName("BulkActDeactJobTrigger");
		return triggerFactory;
	}
	
	// BulkCorpRctSubJob
	@Bean
	@ConditionalOnProperty(name = "job.jobs.BulkCorpRctSub.Switch", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean BulkCorpRctSubJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(BulkCorpRctSubJob.class);
		factoryBean.setName(jobProperties.getJobs().getBulkCorpRctSub().getName());
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "job.jobs.BulkCorpRctSub.Switch", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean BulkCorpRctSubJobTrigger(
			@Qualifier("BulkCorpRctSubJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(jobProperties.getJobs().getBulkCorpRctSub().getCronExpression());
		triggerFactory.setBeanName("BulkCorpRctSubJobTrigger");
		return triggerFactory;
	}
	
	// DataEnableDisableJob
	@Bean
	@ConditionalOnProperty(name = "job.jobs.DataEnableDisable.Switch", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean DataEnableDisableJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(DataEnableDisableJob.class);
		factoryBean.setName(jobProperties.getJobs().getDataEnableDisable().getName());
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "job.jobs.DataEnableDisable.Switch", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean DataEnableDisableJobTrigger(
			@Qualifier("DataEnableDisableJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(jobProperties.getJobs().getDataEnableDisable().getCronExpression());
		triggerFactory.setBeanName("DataEnableDisableJobTrigger");
		return triggerFactory;
	}
	
	// UsageThresholdLimitNotifyJob
	@Bean
	@ConditionalOnProperty(name = "job.jobs.UsageThresholdLimitNotify.Switch", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean UsageThresholdLimitNotifyJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(UsageThresholdLimitNotifyJob.class);
		factoryBean.setName(jobProperties.getJobs().getUsageThresholdLimitNotify().getName());
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "job.jobs.UsageThresholdLimitNotify.Switch", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean UsageThresholdLimitNotifyJobTrigger(
			@Qualifier("UsageThresholdLimitNotifyJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(jobProperties.getJobs().getUsageThresholdLimitNotify().getCronExpression());
		triggerFactory.setBeanName("UsageThresholdLimitNotifyJobTrigger");
		return triggerFactory;
	}
	
	// FirstLuProcessJob
	@Bean
	@ConditionalOnProperty(name = "job.jobs.FirstLuProcess.Switch", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean FirstLuProcessJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(FirstLuProcessJob.class);
		factoryBean.setName(jobProperties.getJobs().getFirstLuProcess().getName());
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "job.jobs.FirstLuProcess.Switch", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean FirstLuProcessJobTrigger(
			@Qualifier("FirstLuProcessJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(jobProperties.getJobs().getFirstLuProcess().getCronExpression());
		triggerFactory.setBeanName("FirstLuProcessJobTrigger");
		return triggerFactory;
	}
	
	// YFAPIProcessJob
	@Bean
	@ConditionalOnProperty(name = "job.jobs.YFAPIProcess.Switch", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean YFAPIProcessJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(YFAPIProcessJob.class);
		factoryBean.setName(jobProperties.getJobs().getYFAPIProcess().getName());
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "job.jobs.YFAPIProcess.Switch", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean YFAPIProcessJobTrigger(
			@Qualifier("YFAPIProcessJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(jobProperties.getJobs().getYFAPIProcess().getCronExpression());
		triggerFactory.setBeanName("YFAPIProcessJobTrigger");
		return triggerFactory;
	}
	
	// TTPCRFJob
	@Bean
	@ConditionalOnProperty(name = "job.jobs.TTPCRF.Switch", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean TTPCRFJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(TTPCRFJob.class);
		factoryBean.setName(jobProperties.getJobs().getTTPCRF().getName());
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "job.jobs.TTPCRF.Switch", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean TTPCRFJobTrigger(
			@Qualifier("TTPCRFJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(jobProperties.getJobs().getTTPCRF().getCronExpression());
		triggerFactory.setBeanName("TTPCRFJobTrigger");
		return triggerFactory;
	}
	
	// VOLTEJob
	@Bean
	@ConditionalOnProperty(name = "VOLTE_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean VOLTEJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(VOLTEJob.class);
		factoryBean.setName("VOLTEJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "VOLTE_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean VOLTEJobTrigger(
			@Qualifier("VOLTEJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("VOLTE_JOB_PATTERN"));
		triggerFactory.setBeanName("VOLTEJobTrigger");
		return triggerFactory;
	}
	
	// TIARetryJob
	@Bean
	@ConditionalOnProperty(name = "job.jobs.TIARetry.Switch", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean TIARetryJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(TIARetryJob.class);
		factoryBean.setName(jobProperties.getJobs().getTIARetry().getName());
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "job.jobs.TIARetry.Switch", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean TIARetryJobTrigger(
			@Qualifier("TIARetryJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(jobProperties.getJobs().getTIARetry().getCronExpression());
		triggerFactory.setBeanName("TIARetryJobTrigger");
		return triggerFactory;
	}
	
	// SMSNotifierJob
	@Bean
	@ConditionalOnProperty(name = "job.jobs.SMSNotifier.Switch", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean SMSNotifierJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(SMSNotifierJob.class);
		factoryBean.setName(jobProperties.getJobs().getSMSNotifier().getName());
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "job.jobs.SMSNotifier.Switch", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean SMSNotifierJobTrigger(
			@Qualifier("SMSNotifierJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(jobProperties.getJobs().getSMSNotifier().getCronExpression());
		triggerFactory.setBeanName("SMSNotifierJobTrigger");
		return triggerFactory;
	}
	
	// CAGroupCreationJob 
	@Bean
	@ConditionalOnProperty(name = "job.jobs.CAGroupCreation.Switch", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean CAGroupCreationJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(CAGroupCreationJob.class);
		factoryBean.setName(jobProperties.getJobs().getCAGroupCreation().getName());
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "job.jobs.CAGroupCreation.Switch", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean CAGroupCreationJobTrigger(
			@Qualifier("CAGroupCreationJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(jobProperties.getJobs().getCAGroupCreation().getCronExpression());
		triggerFactory.setBeanName("CAGroupCreationJobTrigger");
		return triggerFactory;
	}
	
	// IMEIFileUploadJob
	@Bean
	@ConditionalOnProperty(name = "job.jobs.IMEIFileUpload.Switch", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean IMEIFileUploadJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(IMEIFileUploadJob.class);
		factoryBean.setName(jobProperties.getJobs().getIMEIFileUpload().getName());
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "job.jobs.IMEIFileUpload.Switch", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean IMEIFileUploadJobTrigger(
			@Qualifier("IMEIFileUploadJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(jobProperties.getJobs().getIMEIFileUpload().getCronExpression());
		triggerFactory.setBeanName("IMEIFileUploadJobTrigger");
		return triggerFactory;
	}
	
	// IMEILogReadJob
	@Bean
	@ConditionalOnProperty(name = "job.jobs.IMEILogRead.Switch", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean IMEILogReadJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(IMEILogReadJob.class);
		factoryBean.setName(jobProperties.getJobs().getIMEILogRead().getName());
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "job.jobs.IMEILogRead.Switch", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean IMEILogReadJobTrigger(
			@Qualifier("IMEILogReadJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(jobProperties.getJobs().getIMEILogRead().getCronExpression());
		triggerFactory.setBeanName("IMEILogReadJobTrigger");
		return triggerFactory;
	}
	
	// MDNRegActProcessJob
	@Bean
	@ConditionalOnProperty(name = "job.jobs.MDNRegActProcess.Switch", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean MDNRegActProcessJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(MDNRegActProcessJob.class);
		factoryBean.setName(jobProperties.getJobs().getMDNRegActProcess().getName());
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "job.jobs.MDNRegActProcess.Switch", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean MDNRegActProcessJobTrigger(
			@Qualifier("MDNRegActProcessJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(jobProperties.getJobs().getMDNRegActProcess().getCronExpression());
		triggerFactory.setBeanName("MDNRegActProcessJobTrigger");
		return triggerFactory;
	}
	
	// BulkSimSwapProcessJob
	@Bean
	@ConditionalOnProperty(name = "job.jobs.BulkSimSwapProcess.Switch", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean BulkSimSwapProcessJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(BulkSimSwapProcessJob.class);
		factoryBean.setName(jobProperties.getJobs().getBulkSimSwapProcess().getName());
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "job.jobs.BulkSimSwapProcess.Switch", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean BulkSimSwapProcessJobJobDetailTrigger(
			@Qualifier("BulkSimSwapProcessJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(jobProperties.getJobs().getBulkSimSwapProcess().getCronExpression());
		triggerFactory.setBeanName("BulkSimSwapProcessJobJobDetailTrigger");
		return triggerFactory;
	}
	
	//BulkChangeMsisdnProcessJob
	@Bean
	@ConditionalOnProperty(name = "job.jobs.BulkChangeMsisdnProcess.Switch", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean BulkChangeMsisdnProcessJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(BulkChangeMsisdnProcessJob.class);
		factoryBean.setName(jobProperties.getJobs().getBulkChangeMsisdnProcess().getName());
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "job.jobs.BulkChangeMsisdnProcess.Switch", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean BulkChangeMsisdnProcessJobJobDetailTrigger(
			@Qualifier("BulkChangeMsisdnProcessJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(jobProperties.getJobs().getBulkChangeMsisdnProcess().getCronExpression());
		triggerFactory.setBeanName("BulkChangeMsisdnProcessJobJobDetailTrigger");
		return triggerFactory;
	}
	
	//BulkStateChangeProcessJob
	@Bean
	@ConditionalOnProperty(name = "job.jobs.BulkStateChangeProcess.Switch", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean BulkStateChangeProcessJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(BulkStateChangeProcessJob.class);
		factoryBean.setName(jobProperties.getJobs().getBulkStateChangeProcess().getName());
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "job.jobs.BulkStateChangeProcess.Switch", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean BulkStateChangeProcessJobJobDetailTrigger(
			@Qualifier("BulkStateChangeProcessJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(jobProperties.getJobs().getBulkStateChangeProcess().getCronExpression());
		triggerFactory.setBeanName("BulkStateChangeProcessJobJobDetailTrigger");
		return triggerFactory;
	}
	
	//BulkSubsFlowProcessJob
	@Bean
	@ConditionalOnProperty(name = "BULK_SUBS_FLOW_PROCESS_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean BulkSubsFlowProcessJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(BulkSubsFlowProcessJob.class);
		factoryBean.setName("BulkSubsFlowProcessJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "BULK_SUBS_FLOW_PROCESS_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean BulkSubsFlowProcessJobJobDetailTrigger(
			@Qualifier("BulkSubsFlowProcessJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("BULK_SUBS_FLOW_PROCESS_JOB_SWITCH_TIMER_PATTERN"));
		triggerFactory.setBeanName("BulkSubsFlowProcessJobJobDetailTrigger");
		return triggerFactory;
	}
	
	//LTERetryProcessJob
	@Bean
	@ConditionalOnProperty(name = "LTE_RETRY_PROCESS_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean LTERetryProcessJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(LTERetryProcessJob.class);
		factoryBean.setName("LTERetryProcessJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "LTE_RETRY_PROCESS_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean LTERetryProcessJobJobDetailTrigger(
			@Qualifier("LTERetryProcessJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("LTE_RETRY_PROCESS_JOB_SWITCH_TIMER_PATTERN"));
		triggerFactory.setBeanName("LTERetryProcessJobJobDetailTrigger");
		return triggerFactory;
	}
	
	// EmaCMDRetryJob
	@Bean
	 @ConditionalOnProperty(name = "EMA_CMD_RETRY_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean EmaCMDRetryJobJobDetail() {
			JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
			factoryBean.setJobClass(EmaCMDRetryJob.class);
			factoryBean.setName("EmaCMDRetryJob");
			factoryBean.setGroup("SMF_AGENT");
			factoryBean.setDurability(true);
			return factoryBean;
	}

	@Bean
	@ConditionalOnProperty(name = "EMA_CMD_RETRY_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean EmaCMDRetryJobJobDetailTrigger(
			@Qualifier("EmaCMDRetryJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
			CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
			triggerFactory.setJobDetail(jobDetail.getObject());
			triggerFactory.setCronExpression(environment.getProperty("EMA_CMD_RETRY_JOB_PATTERN"));
			triggerFactory.setBeanName("EmaCMDRetryJobJobDetailTrigger");
			return triggerFactory;
	}
	
	// EmaFlowProcessJob
	@Bean
	@ConditionalOnProperty(name = "EMA_FLOW_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean EmaFlowProcessJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(EmaFlowProcessJob.class);
		factoryBean.setName("EmaFlowProcessJob");
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "EMA_FLOW_JOB_SWITCH", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean EmaFlowProcessJobTrigger(
			@Qualifier("EmaFlowProcessJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(environment.getProperty("EMA_FLOW_JOB_SWITCH_TIMER_PATTERN"));
		triggerFactory.setBeanName("EmaFlowProcessJobTrigger");
		return triggerFactory;
	}

	// PrepaidActivationRetryProcessJob
	@Bean
	@ConditionalOnProperty(name = "job.jobs.PrepaidActivationRetryProcess.Switch", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean PrepaidActivationRetryProcessJobJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(PrepaidActivationRetryProcessJob.class);
		factoryBean.setName(jobProperties.getJobs().getPrepaidActivationRetryProcess().getName());
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "job.jobs.PrepaidActivationRetryProcess.Switch", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean PrepaidActivationRetryProcessJobTrigger(
			@Qualifier("PrepaidActivationRetryProcessJobJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(jobProperties.getJobs().getPrepaidActivationRetryProcess().getCronExpression());
		triggerFactory.setBeanName("PrepaidActivationRetryProcessJobTrigger");
		return triggerFactory;
	}

	// RetryChangeDeviceProcessJob
	@Bean
	@ConditionalOnProperty(name = "job.jobs.retrychangedevice.Switch", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean RetryChangeDeviceProcessJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(RetryChangeDeviceProcessJob.class);
		factoryBean.setName(jobProperties.getJobs().getRetrychangedevice().getName());
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "job.jobs.retrychangedevice.Switch", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean RetryChangeDeviceProcessJobJobTrigger(
			@Qualifier("RetryChangeDeviceProcessJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(jobProperties.getJobs().getRetrychangedevice().getCronExpression());
		triggerFactory.setBeanName("RetryChangeDeviceProcessJobJobTrigger");
		return triggerFactory;
	}

	// Hlrverifyjob
	@Bean
	@ConditionalOnProperty(name = "job.jobs.hlrverify.Switch", havingValue = "ON", matchIfMissing = false)
	public JobDetailFactoryBean hlrVerifyJobDetail() {
		JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
		factoryBean.setJobClass(Hlrverifyjob.class);
		factoryBean.setName(jobProperties.getJobs().getHlrverify().getName());
		factoryBean.setGroup("SMF_AGENT");
		factoryBean.setDurability(true);
		return factoryBean;
	}
	@Bean
	@ConditionalOnProperty(name = "job.jobs.hlrverify.Switch", havingValue = "ON", matchIfMissing = false)
	public CronTriggerFactoryBean hlrVerifyJobTrigger(
			@Qualifier("hlrVerifyJobDetail") @Autowired JobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobDetail.getObject());
		triggerFactory.setCronExpression(jobProperties.getJobs().getHlrverify().getCronExpression());
		triggerFactory.setBeanName("hlrVerifyJobTrigger");
		return triggerFactory;
	}

	@Bean
	public SchedulerFactoryBean scheduler(@Autowired List<JobDetailFactoryBean> jobDetails,
			@Autowired List<CronTriggerFactoryBean> triggers) {

		SchedulerFactoryBean schedulerFactory = new SchedulerFactoryBean();

		// Convert JobDetailFactoryBean list to JobDetail list
		List<JobDetail> jobDetailObjects = jobDetails.stream().map(JobDetailFactoryBean::getObject)
				.collect(Collectors.toList());

		// Convert CronTriggerFactoryBean list to Trigger list
		List<Trigger> triggerObjects = triggers.stream().map(CronTriggerFactoryBean::getObject)
				.collect(Collectors.toList());

		schedulerFactory.setJobDetails(jobDetailObjects.toArray(new JobDetail[0]));
		schedulerFactory.setTriggers(triggerObjects.toArray(new Trigger[0]));

		Properties quartzProperties = new Properties();
		quartzProperties.put("org.quartz.scheduler.instanceName", "SMFScheduler");
		//quartzProperties.put("org.quartz.threadPool.threadCount", "3");
		schedulerFactory.setQuartzProperties(quartzProperties);

		return schedulerFactory;
	}

//	@Bean
//	public SchedulerFactoryBean scheduler(@Autowired JobDetailFactoryBean jobDetail,
//			@Autowired CronTriggerFactoryBean trigger) {
//		SchedulerFactoryBean schedulerFactory = new SchedulerFactoryBean();
//		schedulerFactory.setJobDetails(jobDetail.getObject());
//		schedulerFactory.setTriggers(trigger.getObject());
//
//		Properties quartzProperties = new Properties();
//		quartzProperties.put("org.quartz.scheduler.instanceName", "SMFScheduler");
//		quartzProperties.put("org.quartz.threadPool.threadCount", "3");
//		schedulerFactory.setQuartzProperties(quartzProperties);
//
//		return schedulerFactory;
//	}

	/*
	 * @Bean public QuartzSchedulerStarter
	 * quartzSchedulerStarter(SchedulerFactoryBean schedulerFactoryBean) { return
	 * new QuartzSchedulerStarter(schedulerFactoryBean); }
	 * 
	 * 
	 * public static class QuartzSchedulerStarter { private final
	 * SchedulerFactoryBean schedulerFactoryBean;
	 * 
	 * public QuartzSchedulerStarter(SchedulerFactoryBean schedulerFactoryBean) {
	 * this.schedulerFactoryBean = schedulerFactoryBean; startScheduler(); }
	 * 
	 * private void startScheduler() { try { Scheduler scheduler =
	 * schedulerFactoryBean.getScheduler(); if (scheduler != null &&
	 * !scheduler.isStarted()) { scheduler.start();
	 * logger.info("Quartz Scheduler started successfully"); } } catch
	 * (SchedulerException e) { logger.error("Error starting Quartz Scheduler", e);
	 * } } }
	 */
}