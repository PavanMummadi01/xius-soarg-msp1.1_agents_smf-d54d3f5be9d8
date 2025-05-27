package com.xius.smf.job;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;

import com.xius.smf.job.task.PostpaidBulkUploadSIMSTask;
import com.xius.smf.utils.Utilities;

public class PostpaidBulkUploadSIMsJob implements Job , StatefulJob {
	
	private static final Logger logger = LogManager.getLogger("PostpaidBulkUploadSIMsJob");

		public void execute(JobExecutionContext executionContext) throws JobExecutionException {
			
			long start = System.currentTimeMillis();
			logger.info("=========== PostpaidBulkUploadSIMsJob Started ===========");
			try {
				
				PostpaidBulkUploadSIMSTask task = new PostpaidBulkUploadSIMSTask();
				task.doJob();
			} catch (Exception e) {

				logger.error("Exception in PostpaidBulkUploadSIMsJob execute() :"+Utilities.getStackTrace(e));
			} 
			
			logger.info("=========== PostpaidBulkUploadSIMsJob Ended ===========");
			logger.info("### ### ### Total Time taken to execute PostpaidBulkUploadSIMsJob in (milli secons): " + (System.currentTimeMillis() - start)  );
		}
	}


