package com.xius.smf.job;

import java.util.ArrayList;
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
import com.xius.smf.domaindata.EmaCMDCursorData;
import com.xius.smf.domaindata.EmaCMDRetryData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class EmaCMDRetryJob implements Job, StatefulJob {
	private	 static final Logger logger = LogManager.getLogger(EmaCMDRetryJob.class.getSimpleName());

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		ArrayList<EmaCMDCursorData> cursordata = null;
		String[] nwIds = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.EMA_CMD_EXTERNAL_NW_ID).split(",");
		Integer[] nwId = StringToInt(nwIds);
		String instanceId = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.EMA_CMD_INSTANCE_ID);
		Long maxrec = Long
				.parseLong(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.EMA_CMD_RETRY_JOB_MAX_RECORDS));
		EmaCMDRetryData data = new EmaCMDRetryData();
		data.setNetwork_id(nwId);
		data.setPi_instanceid(new Long(instanceId));
		data.setPi_max_records(maxrec);

		try {
			cursordata = fetchDataFromDb(data);

			if (cursordata != null) {

				spanThreads(cursordata);

			} else {
				logger.info("CursorData is empty");

			}

		} catch (SMFAgentException e) {

			e.printStackTrace();
		}

	}

	public void spanThreads(ArrayList<EmaCMDCursorData> cursordata) {
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		CountDownLatch latch = null;
		int size = cursordata.size();

		ThreadPoolExecutor taskExecutor;

		String maxThreadsStr = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.EMA_CMD_RETRY_JOB_MAX_THREADS);
		int maxThreads = 5;

		if (maxThreadsStr != null) {
			try {
				maxThreads = Integer.parseInt(maxThreadsStr);

			} catch (Exception e) {
				if (logger.isDebugEnabled())
					logger.debug(
							"Exception while parsing property CHANGEMSISDN_RETRY_JOB_MAX_THREADS. so taking default value 5");
			}
		} else {
			if (logger.isDebugEnabled())
				logger.debug("Property CHANGEMSISDN_RETRY_JOB_MAX_THREADS is null. so taking default value 5 ");
		}
		logger.info("cursorData Size " + size);
		logger.info("Spanning threads with max thread count " + maxThreads);
		long startTimeTotal = System.currentTimeMillis();
		taskExecutor = new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
		latch = new CountDownLatch(size);

		for (EmaCMDCursorData curData : cursordata) {
			logger.info("sending cursor data to processor " + curData.toString());
			/*
			 * if (curData.getNotification_flag().equalsIgnoreCase("Y")) {
			 * 
			 * } else
			 */

			taskExecutor.execute(new EmaCMDRetryProcessor(latch, curData));

		}
		try {

			if (latch != null)
				latch.await();
		} catch (InterruptedException e) {

			logger.error("Excepion in await()" + Utilities.getStackTrace(e));
		}
		latch = null;
		logger.info("ChangeMSISDNRetry iteration finished ----------------------------");

	}

	public ArrayList<EmaCMDCursorData> fetchDataFromDb(EmaCMDRetryData domaindata) throws SMFAgentException {
		ArrayList<EmaCMDCursorData> cursordata = null;

		logger.info("Data Sending to DB " + domaindata.toString());
		ServiceUtils._executeStoredProcedure("pro_ttsa_ema_cmd_get", domaindata, domaindata);

		if (domaindata.getPo_error_code() == 0) {
			cursordata = new ArrayList<EmaCMDCursorData>();

			cursordata = domaindata.getPo_ema_cmd_request_dtls();

		}

		return cursordata;
	}

	public Integer[] StringToInt(String[] nwIds) {
		int size = nwIds.length;
		Integer[] intAry = new Integer[size];
		for (int iter = 0; iter < size; iter++) {

			intAry[iter] = Integer.parseInt(nwIds[iter]);

		}

		return intAry;
	}

}
