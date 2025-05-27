package com.xius.smf.job;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;

import com.xius.smf.domaindata.PrepaidActRetryTransid;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;


public class PrepaidActivationRetryProcessJob implements Job, StatefulJob {

	
	private static final Logger logger = LogManager.getLogger(PrepaidActivationRetryProcessJob.class.getSimpleName());


	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {

		if (logger.isInfoEnabled())
			logger.info("PrepaidActivationRetryProcessJob - execute method called");

		PrepaidActRetryTransid data = new PrepaidActRetryTransid();
		String[] cursordata = null;
		Long nwID;
		String nwId = InitiateAll.getSMFProps()
				.getProperty(SMFAgentConstants.PREPAID_ACTIVATION_RETRY_JOB_EXTERNAL_NW_ID);
		if (!Utilities.isNull(nwId)) {
			data.setPi_network_id(Long.valueOf(nwId));
		}

		String maxrec = InitiateAll.getSMFProps()
				.getProperty(SMFAgentConstants.PREPAID_ACTIVATION_RETRY_JOB_MAX_RECORDS);
		if (maxrec != null)
			data.setPi_no_of_records(Long.parseLong(maxrec));
		try {
			cursordata = fetchDataFromDb(data);
			nwID = data.getPi_network_id();
			if (cursordata != null && cursordata.length > 0) {
				if (logger.isInfoEnabled())
					logger.info("PrepaidActivationRetryProcessJob - cursor size is :: " + cursordata.length);
				/*
				 * for(int i=0;i<cursordata.length;i++){ logger.
				 * info("PrepaidActivationRetry Processing for this transID >>> "
				 * +cursordata[i]); }
				 */
				processPrepaidActivationRetryData(cursordata, nwID);
			} else {
				logger.info("CursorData is empty");
			}
		} catch (SMFAgentException e) {
			e.printStackTrace();
		}
	}

	private void processPrepaidActivationRetryData(String[] cursordata, Long nwID) {

		if (logger.isInfoEnabled())
			logger.info("PrepaidActivationRetryProcessJob - processPrepaidActivationRetryData called");

		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		ThreadPoolExecutor taskExecutor;
		CountDownLatch latch = null;
		// assuming always only 1 record will be fetched at a time
		String maxThreadsStr = InitiateAll.getSMFProps()
				.getProperty(SMFAgentConstants.PREPAID_ACTIVATION_RETRY_MAX_THREADS);
		int maxThreads = 5;
		if (maxThreadsStr != null && maxThreadsStr.length() > 0) {
			maxThreads = Integer.parseInt(maxThreadsStr);
		}
		taskExecutor = new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
		int num = 0;
		int size = cursordata.length;
		latch = new CountDownLatch(size);
		for (String transID : cursordata) {
			logger.info("PrepaidActivationRetryProcessJob iteration start for  cursordata------------" + num);

			try {

				taskExecutor.execute(new PrepaidActivationRetryProcessor(latch, transID, nwID));
			} catch (Exception _exp) {
				logger.error("Excepion in taskExecutor" + Utilities.getStackTrace(_exp));
			}

			logger.info("PrepaidActivationRetryProcessJob iteration finished -------------------------");
			num++;
		}

		try {
			if (latch != null)
				latch.await();
		} catch (InterruptedException e) {
			logger.error("Excepion in await()" + Utilities.getStackTrace(e));
		}

		if (taskExecutor != null) {
			taskExecutor.shutdown();
		}

		while (!taskExecutor.isTerminated()) {

		}

		latch = null;
		taskExecutor = null;
	}

	// Invoke the SMF DB procedure to get the Records to be processed
	private String[] fetchDataFromDb(PrepaidActRetryTransid data) throws SMFAgentException {

		String[] trnsIds = null;
		logger.info("Data Sending to DB " + data.toString());
		ServiceUtils._executeStoredProcedure("pro_get_nw_pend_sim_reg_dtls", data, data);

		if (data.getPo_error_code() == 0) {
			trnsIds = data.getPo_nw_failed_trans_id();
		}

		return trnsIds;
	}

}
