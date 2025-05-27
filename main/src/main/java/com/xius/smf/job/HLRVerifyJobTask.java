package com.xius.smf.job;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.smf.domaindata.ProcesssimswapRecordsData;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;

public class HLRVerifyJobTask  {

	private static final Logger logger = LogManager.getLogger(HLRVerifyJobTask.class.getSimpleName());

	private ArrayList<ProcesssimswapRecordsData> processRecordsData;
	private String taskName;

	public HLRVerifyJobTask(String taskName,
			ArrayList<ProcesssimswapRecordsData> processRecordsData) {
		super();
		this.processRecordsData = processRecordsData;
		this.taskName = taskName;
	}

	public void processhlr() {
		// TODO Auto-generated method stub
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(
				100000);
		ThreadPoolExecutor taskExecutor;
		CountDownLatch latch = null;
		int size = processRecordsData.size();
		if (size > 0) {
			String maxThreadsStr = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.hlr_verify_job_Switch_MAX_THREADS);
			int maxThreads = 5;
			if (maxThreadsStr != null && maxThreadsStr.length() > 0) {
				maxThreads = Integer.parseInt(maxThreadsStr);
			}
			taskExecutor = new ThreadPoolExecutor(maxThreads, maxThreads,
					100000, TimeUnit.SECONDS, queue);
			// int num=0;

			latch = new CountDownLatch(size);
			for (ProcesssimswapRecordsData curData : processRecordsData) {
				logger.info("hlr verify job iteration start for  cursordata------------"+ taskName);
				try {

					taskExecutor.execute(new HLRVerifyJobProcessor(latch,curData, taskName));
				} catch (Exception _exp) {
					logger.error("Excepion in taskExecutor"
							+ Utilities.getStackTrace(_exp));
				}

				logger.info("hlr verify job  iteration finished -------------------------"+ taskName);

			}
			
			try {
				if (latch != null)
					latch.await();
			} catch (InterruptedException e) {

				logger.error("Excepion in await()" + Utilities.getStackTrace(e));
			}
	/*		while (!taskExecutor.isTerminated()) {

			}*/
			try {
				if (!taskExecutor.awaitTermination(30, TimeUnit.SECONDS)) {
				    taskExecutor.shutdownNow(); // Force shutdown if not terminated
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//taskExecutor.shutdown();

			latch = null;
			taskExecutor = null;
			logger.info("hlr verify job iteration finished ----------------------------");
		}
	}
}
