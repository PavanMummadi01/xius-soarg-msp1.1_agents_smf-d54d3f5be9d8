package com.xius.smf.job;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.ne.NotificationManagement_xsd.NotifyMessageResponse;
import com.xius.smf.domaindata.ThresholdLimitCurData;
import com.xius.smf.ne.NPRsmsConfirmationHelper;
import com.xius.smf.ne.TempMessageInfo;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;

public class ThresholdLimitEmailProcessor implements Runnable{
	private static final Logger logger = LogManager.getLogger(ThresholdLimitEmailProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	ThresholdLimitCurData cursorData = null;

	public ThresholdLimitEmailProcessor(CountDownLatch latch,ThresholdLimitCurData curData) {
		this.latch = latch;
		this.cursorData = curData;

	}
	public void run() {
		try {
			neRequest(cursorData);
			}catch (Exception e) {
			logger.error("SMFAgentException in ThresholdLimitEmailProcessor "+Utilities.getStackTrace(e));
			}
		finally {			
				latch.countDown();
			}
		
	}
	
	
	
	
	public void neRequest(ThresholdLimitCurData curData)
	{
	ThresholdLimitCurData data = null;
	NotifyMessageResponse neResponse=null;
	String resp=null;
		NPRsmsConfirmationHelper helper=new NPRsmsConfirmationHelper();
		TempMessageInfo replyToSubscriber=new TempMessageInfo();
		
		replyToSubscriber.setEventReferenceCode(Utilities.getEventEmailRefCode(cursorData.getPi_network_id().toString()));
		if(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.EmailFromNir)!=null && InitiateAll.getSMFProps().getProperty(SMFAgentConstants.EmailToNir)!=null){
		replyToSubscriber.setEmailTo(Utilities.getEmailToNir(cursorData.getPi_network_id().toString()));
		replyToSubscriber.setEmailFrom(Utilities.getEmailFromNir(cursorData.getPi_network_id().toString()));
		replyToSubscriber.setUserDefined1(cursorData.getPi_nir_code().toString());
		replyToSubscriber.setUserDefined2(cursorData.getPi_msisdn_threshold_percentage().toString());
		replyToSubscriber.setUserDefined3(cursorData.getPi_network_display());
		replyToSubscriber.setUserDefined4(cursorData.getPi_cur_percentage().toString());
		replyToSubscriber.setNetworkId(cursorData.getPi_network_id().toString());
		if(null!=InitiateAll.getSMFProps().getProperty("EmailSubject"))
		replyToSubscriber.setSubject(InitiateAll.getSMFProps().getProperty("EmailSubject"));
		logger.info("The subject configured in Property File."+InitiateAll.getSMFProps().getProperty("EmailSubject"));
		
		String getLoginIdPass = Utilities.getNetworkId(cursorData.getPi_network_id().toString());
		if(getLoginIdPass!=null){
		neResponse=helper.sendEmailToNE(replyToSubscriber,getLoginIdPass);
		} else {
			logger.info("The Given Network Id related Properties are not configured in Property File.");
		}
		} else {
			logger.info("EmailFrom (or) EmailTo related Properties are not configured in Property File.");
		}
	}
	
	
}
