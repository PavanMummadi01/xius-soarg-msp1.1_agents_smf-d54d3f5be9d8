package com.xius.smf.job;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.ne.NotificationManagement_xsd.NotifyMessageRequest;
import com.xius.smf.ne.NEServiceInvoker;
import com.xius.smf.ne.TempMessageInfo;

public class SMSNotifierProcessor implements Runnable {
	private static final Logger logger = LogManager.getLogger(SMSNotifierProcessor.class.getSimpleName());

	NotifyMessageRequest notifyMessageRequest;
	TempMessageInfo smsData;
	CountDownLatch latch;
	
	
	
	public SMSNotifierProcessor(NotifyMessageRequest notifyMessageRequest,
	TempMessageInfo smsData,CountDownLatch latch){
		this.notifyMessageRequest=notifyMessageRequest;
		this.smsData=smsData;
	     this.latch=latch;
	}
	public void run() {
		logger.info("Reached the processor class about to send to NE");	
		try{
	logger.info("The Request that has to be set is "+ notifyMessageRequest.toString()+"::"+notifyMessageRequest.getMessageType().toString());	
	
	NEServiceInvoker.invokeNotifyMessageFromNE(notifyMessageRequest, smsData);
		}finally{
			latch.countDown();
		}
		}

}
