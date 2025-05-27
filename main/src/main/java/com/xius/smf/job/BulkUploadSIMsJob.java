package com.xius.smf.job;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;



import com.xius.smf.job.task.BulkUploadSIMSTask;
import com.xius.smf.utils.Utilities;

public class BulkUploadSIMsJob implements Job , StatefulJob {
	
	private	 static final Logger logger = LogManager.getLogger("BulkUploadSIMsJob");

		public void execute(JobExecutionContext executionContext) throws JobExecutionException {
			
			long start = System.currentTimeMillis();
			logger.info("=========== BulkUploadSIMSJob Started ===========");
			try {
				
				BulkUploadSIMSTask task = new BulkUploadSIMSTask();
				task.doJob();
			} catch (Exception e) {

				logger.error("Exception in BulkUploadSIMSJob execute() :"+Utilities.getStackTrace(e));
			} 
			
			logger.info("=========== BulkUploadSIMSJob Ended ===========");
			logger.info("### ### ### Total Time taken to execute BulkUploadSIMSJob in (milli secons): " + (System.currentTimeMillis() - start)  );
		}
	}


