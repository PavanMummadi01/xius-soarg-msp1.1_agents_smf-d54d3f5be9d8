package com.xius.smf.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "job")
public class JobProperties {
    private Jobs jobs;

    public Jobs getJobs() {
        return jobs;
    }

    public void setJobs(Jobs jobs) {
        this.jobs = jobs;
    }

    public static class Jobs {
        private JobConfig hlrverify;
        private JobConfig retrychangedevice;
        private JobConfig PrepaidActivationRetryProcess;
        private JobConfig EmaFlowProcess;
        private JobConfig EmaCMDRetry;
        private JobConfig LTERetryProcess;
        private JobConfig BulkSubsFlowProcess;
        private JobConfig BulkStateChangeProcess;
        private JobConfig BulkChangeMsisdnProcess;
        private JobConfig BulkSimSwapProcess;
        private JobConfig MDNRegActProcess;
        private JobConfig IMEILogRead;
        private JobConfig IMEIFileUpload;
        private JobConfig CAGroupCreation;
        private JobConfig SMSNotifier;
        private JobConfig TIARetry;
        private JobConfig VOLTE;
        private JobConfig TTPCRF;
        private JobConfig YFAPIProcess;
        private JobConfig FirstLuProcess;
        private JobConfig UsageThresholdLimitNotify;
        private JobConfig DataEnableDisable;
        private JobConfig BulkCorpRctSub;
        private JobConfig BulkActDeact;
        private JobConfig PaytmTxStatusRetry;
        private JobConfig BulkDebit;
        private JobConfig BulkSplCredit;
        private JobConfig BulkCredit;
        private JobConfig ThresholdLimit;
        private JobConfig SorianaRetry;
        private JobConfig BulkTpSubs;
        private JobConfig PostpaidBulkUploadSIMs;
        private JobConfig BulkUploadSIMs;
        private JobConfig BulkAtpsubs;
        private JobConfig RetryFromSMF;
        private JobConfig StateChangeExpiryRetry;
        private JobConfig StateChangeExpiry;
        private JobConfig StateChangeRetry;
        private JobConfig SimSwapRetry;
        private JobConfig ChangeMSISDNRetry;
        private JobConfig HlrStateChangeNotify;
        private JobConfig PostpaidBilGenNotification;
        private JobConfig DataRenewalDataThresholdNotif;
        private JobConfig TopUpNotif;
        private JobConfig HLR;
        private JobConfig UploadDemographicDetails;
        private JobConfig UploadBulkIDReplacement;
        private JobConfig SubscriberBulkUpload;
        private JobConfig ScheduleCUGTopUp;
        private JobConfig ScheduleCUGDebit;
        private JobConfig BalNotification;
        private JobConfig FTPFileBulkSimUpload;
        private JobConfig BulkRCSubscription;
        private JobConfig BulkInitiaterRCSubscription;
        
        public JobConfig getBulkInitiaterRCSubscription() {
			return BulkInitiaterRCSubscription;
		}

		public void setBulkInitiaterRCSubscription(JobConfig bulkInitiaterRCSubscription) {
			BulkInitiaterRCSubscription = bulkInitiaterRCSubscription;
		}

		public JobConfig getBulkRCSubscription() {
			return BulkRCSubscription;
		}

		public void setBulkRCSubscription(JobConfig bulkRCSubscription) {
			BulkRCSubscription = bulkRCSubscription;
		}

		public JobConfig getFTPFileBulkSimUpload() {
			return FTPFileBulkSimUpload;
		}

		public void setFTPFileBulkSimUpload(JobConfig fTPFileBulkSimUpload) {
			FTPFileBulkSimUpload = fTPFileBulkSimUpload;
		}

		public JobConfig getBalNotification() {
			return BalNotification;
		}

		public void setBalNotification(JobConfig balNotification) {
			BalNotification = balNotification;
		}

		public JobConfig getScheduleCUGDebit() {
			return ScheduleCUGDebit;
		}

		public void setScheduleCUGDebit(JobConfig scheduleCUGDebit) {
			ScheduleCUGDebit = scheduleCUGDebit;
		}

		public JobConfig getScheduleCUGTopUp() {
			return ScheduleCUGTopUp;
		}

		public void setScheduleCUGTopUp(JobConfig scheduleCUGTopUp) {
			ScheduleCUGTopUp = scheduleCUGTopUp;
		}

		public JobConfig getSubscriberBulkUpload() {
			return SubscriberBulkUpload;
		}

		public void setSubscriberBulkUpload(JobConfig subscriberBulkUpload) {
			SubscriberBulkUpload = subscriberBulkUpload;
		}

		public JobConfig getUploadBulkIDReplacement() {
			return UploadBulkIDReplacement;
		}

		public void setUploadBulkIDReplacement(JobConfig uploadBulkIDReplacement) {
			UploadBulkIDReplacement = uploadBulkIDReplacement;
		}

		public JobConfig getUploadDemographicDetails() {
			return UploadDemographicDetails;
		}

		public void setUploadDemographicDetails(JobConfig uploadDemographicDetails) {
			UploadDemographicDetails = uploadDemographicDetails;
		}

		public JobConfig getHLR() {
			return HLR;
		}

		public void setHLR(JobConfig hLR) {
			HLR = hLR;
		}

		public JobConfig getTopUpNotif() {
			return TopUpNotif;
		}

		public void setTopUpNotif(JobConfig topUpNotif) {
			TopUpNotif = topUpNotif;
		}

		public JobConfig getDataRenewalDataThresholdNotif() {
			return DataRenewalDataThresholdNotif;
		}

		public void setDataRenewalDataThresholdNotif(JobConfig dataRenewalDataThresholdNotif) {
			DataRenewalDataThresholdNotif = dataRenewalDataThresholdNotif;
		}

		public JobConfig getPostpaidBilGenNotification() {
			return PostpaidBilGenNotification;
		}

		public void setPostpaidBilGenNotification(JobConfig postpaidBilGenNotification) {
			PostpaidBilGenNotification = postpaidBilGenNotification;
		}

		public JobConfig getHlrStateChangeNotify() {
			return HlrStateChangeNotify;
		}

		public void setHlrStateChangeNotify(JobConfig hlrStateChangeNotify) {
			HlrStateChangeNotify = hlrStateChangeNotify;
		}

		public JobConfig getChangeMSISDNRetry() {
			return ChangeMSISDNRetry;
		}

		public void setChangeMSISDNRetry(JobConfig changeMSISDNRetry) {
			ChangeMSISDNRetry = changeMSISDNRetry;
		}

		public JobConfig getStateChangeRetry() {
			return StateChangeRetry;
		}

		public void setStateChangeRetry(JobConfig stateChangeRetry) {
			StateChangeRetry = stateChangeRetry;
		}
        
        public JobConfig getSimSwapRetry() {
			return SimSwapRetry;
		}

		public void setSimSwapRetry(JobConfig simSwapRetry) {
			SimSwapRetry = simSwapRetry;
		}

		public JobConfig getStateChangeExpiry() {
			return StateChangeExpiry;
		}

		public void setStateChangeExpiry(JobConfig stateChangeExpiry) {
			StateChangeExpiry = stateChangeExpiry;
		}

		public JobConfig getStateChangeExpiryRetry() {
			return StateChangeExpiryRetry;
		}

		public void setStateChangeExpiryRetry(JobConfig stateChangeExpiryRetry) {
			StateChangeExpiryRetry = stateChangeExpiryRetry;
		}

		public JobConfig getRetryFromSMF() {
			return RetryFromSMF;
		}

		public void setRetryFromSMF(JobConfig retryFromSMF) {
			RetryFromSMF = retryFromSMF;
		}

		public JobConfig getBulkAtpsubs() {
			return BulkAtpsubs;
		}

		public void setBulkAtpsubs(JobConfig bulkAtpsubs) {
			BulkAtpsubs = bulkAtpsubs;
		}

		public JobConfig getBulkUploadSIMs() {
			return BulkUploadSIMs;
		}

		public void setBulkUploadSIMs(JobConfig bulkUploadSIMs) {
			BulkUploadSIMs = bulkUploadSIMs;
		}

		public JobConfig getPostpaidBulkUploadSIMs() {
			return PostpaidBulkUploadSIMs;
		}

		public void setPostpaidBulkUploadSIMs(JobConfig postpaidBulkUploadSIMs) {
			PostpaidBulkUploadSIMs = postpaidBulkUploadSIMs;
		}

		public JobConfig getBulkTpSubs() {
			return BulkTpSubs;
		}

		public void setBulkTpSubs(JobConfig bulkTpSubs) {
			BulkTpSubs = bulkTpSubs;
		}

		public JobConfig getSorianaRetry() {
			return SorianaRetry;
		}

		public void setSorianaRetry(JobConfig sorianaRetry) {
			SorianaRetry = sorianaRetry;
		}

		public JobConfig getThresholdLimit() {
			return ThresholdLimit;
		}

		public void setThresholdLimit(JobConfig thresholdLimit) {
			ThresholdLimit = thresholdLimit;
		}

		public JobConfig getBulkCredit() {
			return BulkCredit;
		}

		public void setBulkCredit(JobConfig bulkCredit) {
			BulkCredit = bulkCredit;
		}

		public JobConfig getBulkSplCredit() {
			return BulkSplCredit;
		}

		public void setBulkSplCredit(JobConfig bulkSplCredit) {
			BulkSplCredit = bulkSplCredit;
		}

		public JobConfig getBulkDebit() {
			return BulkDebit;
		}

		public void setBulkDebit(JobConfig bulkDebit) {
			BulkDebit = bulkDebit;
		}

		public JobConfig getPaytmTxStatusRetry() {
			return PaytmTxStatusRetry;
		}

		public void setPaytmTxStatusRetry(JobConfig paytmTxStatusRetry) {
			PaytmTxStatusRetry = paytmTxStatusRetry;
		}

		public JobConfig getBulkActDeact() {
			return BulkActDeact;
		}

		public void setBulkActDeact(JobConfig bulkActDeact) {
			BulkActDeact = bulkActDeact;
		}

		public JobConfig getBulkCorpRctSub() {
			return BulkCorpRctSub;
		}

		public void setBulkCorpRctSub(JobConfig bulkCorpRctSub) {
			BulkCorpRctSub = bulkCorpRctSub;
		}

		public JobConfig getDataEnableDisable() {
			return DataEnableDisable;
		}

		public void setDataEnableDisable(JobConfig dataEnableDisable) {
			DataEnableDisable = dataEnableDisable;
		}

		public JobConfig getUsageThresholdLimitNotify() {
			return UsageThresholdLimitNotify;
		}

		public void setUsageThresholdLimitNotify(JobConfig usageThresholdLimitNotify) {
			UsageThresholdLimitNotify = usageThresholdLimitNotify;
		}

		public JobConfig getFirstLuProcess() {
			return FirstLuProcess;
		}

		public void setFirstLuProcess(JobConfig firstLuProcess) {
			FirstLuProcess = firstLuProcess;
		}

		public JobConfig getYFAPIProcess() {
			return YFAPIProcess;
		}

		public void setYFAPIProcess(JobConfig yFAPIProcess) {
			YFAPIProcess = yFAPIProcess;
		}

		public JobConfig getTTPCRF() {
			return TTPCRF;
		}

		public void setTTPCRF(JobConfig tTPCRF) {
			TTPCRF = tTPCRF;
		}

		public JobConfig getVOLTE() {
			return VOLTE;
		}

		public void setVOLTE(JobConfig vOLTE) {
			VOLTE = vOLTE;
		}

		public JobConfig getTIARetry() {
			return TIARetry;
		}

		public void setTIARetry(JobConfig tIARetry) {
			TIARetry = tIARetry;
		}

		public JobConfig getSMSNotifier() {
			return SMSNotifier;
		}

		public void setSMSNotifier(JobConfig sMSNotifier) {
			SMSNotifier = sMSNotifier;
		}

		public JobConfig getCAGroupCreation() {
			return CAGroupCreation;
		}

		public void setCAGroupCreation(JobConfig cAGroupCreation) {
			CAGroupCreation = cAGroupCreation;
		}

		public JobConfig getIMEIFileUpload() {
			return IMEIFileUpload;
		}

		public void setIMEIFileUpload(JobConfig iMEIFileUpload) {
			IMEIFileUpload = iMEIFileUpload;
		}

		public JobConfig getIMEILogRead() {
			return IMEILogRead;
		}

		public void setIMEILogRead(JobConfig iMEILogRead) {
			IMEILogRead = iMEILogRead;
		}

		public JobConfig getMDNRegActProcess() {
			return MDNRegActProcess;
		}

		public void setMDNRegActProcess(JobConfig mDNRegActProcess) {
			MDNRegActProcess = mDNRegActProcess;
		}

		public JobConfig getBulkSimSwapProcess() {
			return BulkSimSwapProcess;
		}

		public void setBulkSimSwapProcess(JobConfig bulkSimSwapProcess) {
			BulkSimSwapProcess = bulkSimSwapProcess;
		}

		public JobConfig getBulkChangeMsisdnProcess() {
			return BulkChangeMsisdnProcess;
		}

		public void setBulkChangeMsisdnProcess(JobConfig bulkChangeMsisdnProcess) {
			BulkChangeMsisdnProcess = bulkChangeMsisdnProcess;
		}

		public JobConfig getBulkStateChangeProcess() {
			return BulkStateChangeProcess;
		}

		public void setBulkStateChangeProcess(JobConfig bulkStateChangeProcess) {
			BulkStateChangeProcess = bulkStateChangeProcess;
		}

		public JobConfig getBulkSubsFlowProcess() {
			return BulkSubsFlowProcess;
		}

		public void setBulkSubsFlowProcess(JobConfig bulkSubsFlowProcess) {
			BulkSubsFlowProcess = bulkSubsFlowProcess;
		}

		public JobConfig getLTERetryProcess() {
			return LTERetryProcess;
		}

		public void setLTERetryProcess(JobConfig lTERetryProcess) {
			LTERetryProcess = lTERetryProcess;
		}

		public JobConfig getEmaCMDRetry() {
			return EmaCMDRetry;
		}

		public void setEmaCMDRetry(JobConfig emaCMDRetry) {
			EmaCMDRetry = emaCMDRetry;
		}

		public JobConfig getEmaFlowProcess() {
			return EmaFlowProcess;
		}

		public void setEmaFlowProcess(JobConfig emaFlowProcess) {
			EmaFlowProcess = emaFlowProcess;
		}

		public JobConfig getPrepaidActivationRetryProcess() {
			return PrepaidActivationRetryProcess;
		}

		public void setPrepaidActivationRetryProcess(JobConfig prepaidActivationRetryProcess) {
			PrepaidActivationRetryProcess = prepaidActivationRetryProcess;
		}

		public JobConfig getHlrverify() {
            return hlrverify;
        }

        public void setHlrverify(JobConfig hlrverify) {
            this.hlrverify = hlrverify;
        }

        public JobConfig getRetrychangedevice() {
            return retrychangedevice;
        }

        public void setRetrychangedevice(JobConfig retrychangedevice) {
            this.retrychangedevice = retrychangedevice;
        }
    }

    public static class JobConfig {
    	
        private String Switch;
    	private String name;
        private String cronExpression;
        
        public String getSwitch() {
			return Switch;
		}

		public void setSwitch(String switch1) {
			Switch = switch1;
		}

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCronExpression() {
            return cronExpression;
        }

        public void setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
        }
    }
}
