package com.xius.smf.job;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.smf.domaindata.BulkRCSubscriptionCursorData;

public class BulkRCSubscriptionProcessor implements Runnable{
	private	 static final Logger logger = LogManager.getLogger(BulkRCSubscriptionProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	BulkRCSubscriptionCursorData cursorData = null;

	public BulkRCSubscriptionProcessor(CountDownLatch latch,BulkRCSubscriptionCursorData cursorData) {
		this.latch = latch;
		this.cursorData = cursorData;
	}

	public void run() {
		try {
			BulkRCSubscriptionTask bulkRCSubscriptionTask=new BulkRCSubscriptionTask();
			if(logger.isDebugEnabled())
			 	logger.debug("***Calling Xbus***");
			bulkRCSubscriptionTask.doJob(cursorData);
		} catch (Exception e) {
		} finally {
            latch.countDown();
		}
	}
	
}