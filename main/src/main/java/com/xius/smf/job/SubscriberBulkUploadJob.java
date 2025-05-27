package com.xius.smf.job;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.xius.smf.job.task.SubscriberBulkUploadTask;
import com.xius.smf.utils.Utilities;

public class SubscriberBulkUploadJob implements Job {
	private static final Logger logger = LogManager.getLogger(SubscriberBulkUploadJob.class.getSimpleName());

	public void execute(JobExecutionContext executionContext) throws JobExecutionException {
		
		try {
			
			logger.info("Executing SubscriberBulkUploadJob");
			
			SubscriberBulkUploadTask.doJob();
		} catch (Exception e) {

			logger.error("Exception in execute() :"+Utilities.getStackTrace(e));
		} 
		
	}

}
