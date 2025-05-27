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

public class ThresholdLimitSmsProcessor implements Runnable{
	private static final Logger logger = LogManager.getLogger(ThresholdLimitSmsProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	ThresholdLimitCurData cursorData = null;

	public ThresholdLimitSmsProcessor(CountDownLatch latch,ThresholdLimitCurData curData) {
		this.latch = latch;
		this.cursorData = curData;

	}
	public void run() {
		try {
			neRequest(cursorData);
			}catch (Exception e) {
			logger.error("SMFAgentException in ThresholdLimitSmsProcessor "+Utilities.getStackTrace(e));
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
		
		if(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DestMsisdnNir)!=null){
		replyToSubscriber.setEventReferenceCode(Utilities.getEventSmsRefCode(cursorData.getPi_network_id().toString()));
		replyToSubscriber.setUserDefined1(cursorData.getPi_nir_code().toString());
		replyToSubscriber.setUserDefined2(cursorData.getPi_msisdn_threshold_percentage().toString());
		replyToSubscriber.setUserDefined3(cursorData.getPi_network_display());
		replyToSubscriber.setUserDefined4(cursorData.getPi_cur_percentage().toString());
		replyToSubscriber.setNetworkId(cursorData.getPi_network_id().toString());
		String getLoginIdPass = Utilities.getNetworkId(cursorData.getPi_network_id().toString());
		if(getLoginIdPass!=null){
		String getAllMsisdns = Utilities.getDestMsisdnNir(cursorData.getPi_network_id().toString());
		String getMsisdn[] = getAllMsisdns.split(",");
		for(int i=0 ; i<getMsisdn.length;i++){
			replyToSubscriber.setDestMSISDNs(getMsisdn[i]);
			neResponse=helper.sendMsgToNE(replyToSubscriber,getLoginIdPass);
		}
		} else {
			logger.info("The Given Network Id related Properties are not configured in Property File.");
		}
		} else {
			logger.info("Destination msisdn related Properties are not configured in Property File.");
		}

	}
	
	
}
