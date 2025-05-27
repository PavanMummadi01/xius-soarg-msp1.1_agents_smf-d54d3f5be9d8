package com.xius.smf.job;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;

import com.xius.smf.job.task.SubscriberBulkUploadTask;
import com.xius.smf.job.task.UploadBulkIDReplacementTask;
import com.xius.smf.job.task.UploadSIMSTask;
import com.xius.smf.utils.Utilities;

public class UploadBulkIDReplacementJob implements Job , StatefulJob {
	private static final Logger logger = LogManager.getLogger(UploadBulkIDReplacementJob.class.getSimpleName());

	public void execute(JobExecutionContext executionContext) throws JobExecutionException {
		
		long start = System.currentTimeMillis();
		logger.info("=========== UploadBulkIDReplacementJob Started ===========");
		
		try {
			
			UploadBulkIDReplacementTask task = new UploadBulkIDReplacementTask();
			task.doJob();
		} catch (Exception e) {

			logger.error("Exception in UploadBulkIDReplacementJob execute() :"+Utilities.getStackTrace(e));
		} 
		
		logger.info("=========== UploadBulkIDReplacementJob Ended ===========");
		logger.info("### ### ### Total Time taken to execute UploadBulkIDReplacementJob in (milli secons): " + (System.currentTimeMillis() - start));
		
	}

}
