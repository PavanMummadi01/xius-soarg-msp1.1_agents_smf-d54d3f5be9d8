package com.xius.smf.job;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;

import com.xius.smf.job.task.UploadDemographicDetailsTask;
import com.xius.smf.utils.Utilities;

public class UploadDemographicDetailsJob implements Job , StatefulJob {


	private static final Logger logger = LogManager.getLogger(UploadDemographicDetailsJob.class.getSimpleName());

	public void execute(JobExecutionContext executionContext) throws JobExecutionException {
		
		long start = System.currentTimeMillis();
		
		logger.info("=========== UploadDemographicDetailsJob Started ===========");
		
		try {
			
			UploadDemographicDetailsTask task = new UploadDemographicDetailsTask();
			task.doJob();
		} catch (Exception e) {

			logger.error("Exception in UploadDemographicDetailsJob execute() :" + Utilities.getStackTrace(e));
		} 
		
		logger.info("=========== UploadDemographicDetailsJob Ended ===========");
		
		logger.info("### ### ### Total Time taken to execute UploadDemographicDetailsJob in (milli secons): " + (System.currentTimeMillis() - start)  );
	}

}
