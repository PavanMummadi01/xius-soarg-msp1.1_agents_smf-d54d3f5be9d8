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

import com.xius.smf.domaindata.MDNRegActCursorDtlsData;
import com.xius.smf.domaindata.MDNRegActProcessData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class MDNRegActProcessJob implements Job, StatefulJob {

	private static final Logger logger = LogManager.getLogger(MDNRegActProcessJob.class.getSimpleName());

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		logger
				.info(" ====================== MDNRegActProcessJob STARTED  ======================");
		MDNRegActProcessData data = new MDNRegActProcessData();

		ArrayList<MDNRegActCursorDtlsData> cursordata = null;

		String nwIdSplit = InitiateAll.getSMFProps().getProperty(
				SMFAgentConstants.BULK_MDN_REG_ACT_PROCESS_JOB_EXTERNAL_NW_ID);
		if (!Utilities.isNull(nwIdSplit)) {
			data.setPi_network_id(Long.valueOf(nwIdSplit));
		}

		String maxrec = InitiateAll.getSMFProps().getProperty(
				SMFAgentConstants.BULK_MDN_REG_ACT_PROCESS_JOB_MAX_RECORDS);
		if (maxrec != null)
			data.setPi_max_records(Long.valueOf(maxrec));

		try {
			cursordata = fetchDataFromDb(data);
			if (cursordata != null && cursordata.size() > 0) {
				processMDNRegActData(cursordata);
			} else {
				logger.info("CursorData is empty");
			}
		} catch (SMFAgentException e) {
			e.printStackTrace();
		}

		logger
				.info(" ====================== MDNRegActProcessJob  ENDED ======================");
	}

	private void processMDNRegActData(ArrayList<MDNRegActCursorDtlsData> cursordata) {
		logger
				.info("MDNRegActProcessJob processMDNRegActData method called ----------------------------");
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(
				100000);
		ThreadPoolExecutor taskExecutor;
		CountDownLatch latch = null;
		String maxThreadsStr = InitiateAll.getSMFProps().getProperty(
				SMFAgentConstants.YF_API_PROCESS_JOB_MAX_THREADS);
		int maxThreads = Integer.parseInt(maxThreadsStr);
		taskExecutor = new ThreadPoolExecutor(maxThreads, maxThreads, 100000,
				TimeUnit.SECONDS, queue);
		int size = cursordata.size();

		try {
			latch = new CountDownLatch(size);
			for (MDNRegActCursorDtlsData curData : cursordata) {

				if (curData.getAction_flag() != null) {
					logger.info("ActionFlag is ::" + curData.getAction_flag());
					logger.info("MDN Internal TransId is  ::"
							+ curData.getMsdn_rec_trans_id());

					if (curData.getAction_flag().equalsIgnoreCase("3")) {
						logger
								.info("MDNRegActProcessJob MDNRegActProcessor Invoking ----------------------------");
						taskExecutor.execute(new MDNRegActProcessor(latch,
								curData));

					} else if (curData.getAction_flag().equalsIgnoreCase("2")) {
						logger
								.info("MDNRegActProcessJob MDNRegProcessor Invoking ----------------------------");
						taskExecutor
								.execute(new MDNRegProcessor(latch, curData));
		} else if (curData.getAction_flag().equalsIgnoreCase("1") || curData.getAction_flag().equalsIgnoreCase("4") ) {
						logger
								.info("MDNRegActProcessJob MDNActProcessor Invoking ----------------------------");
						taskExecutor
								.execute(new MDNActProcessor(latch, curData));
					} else {
						logger.info("ActionFlag related processerNot found");
					}
				} else {
					logger.info("MDNRegActProcessJob ActionFlag is Null");
				}
			}
			if (latch != null)
				logger.info("latch count is :: " + latch.getCount()
						+ " So calling latch.await Function");
			latch.await();
		} catch (InterruptedException e) {
			logger.error("Excepion in await()" + Utilities.getStackTrace(e));
		} catch (Exception _exp) {
			logger.error("Excepion in taskExecutor.execute Processer call"
					+ Utilities.getStackTrace(_exp));
		}
		taskExecutor.shutdown();
		while (!taskExecutor.isTerminated()) {

		}
		latch = null;
		taskExecutor = null;

		logger
				.info("MDNRegActProcessJob iteration finished ----------------------------");
		logger
				.info("MDNRegActProcessJob processYFAPIData method Ended ----------------------------");
	}

	// Invoke the SMF DB procedure to get the Records to be processed
	private ArrayList<MDNRegActCursorDtlsData> fetchDataFromDb(MDNRegActProcessData data)
			throws SMFAgentException {
		logger
				.info("MDNRegActProcessJob fetchDataFromDb method called ----------------------------");
		String activities = InitiateAll.getSMFProps().getProperty(
				SMFAgentConstants.BULK_MDN_REG_ACT_PROCESS_ACTIVITIES);
		logger
				.info("MDNRegActProcessJob fetchDataFromDb method for activities ::"
						+ activities);

		ArrayList<MDNRegActCursorDtlsData> cursordata = null;

		if (activities != null) {
			String[] activitiesArray = activities.split(",");
			String[] activity = new String[activitiesArray.length];
			for (int i = 0; i < activitiesArray.length; i++) {
				activity[i] = new String(activitiesArray[i]);
			}
			data.setPi_action_flag(activity);
		} else {
			logger
					.info("MDNRegActProcessJob fetchDataFromDb method for activities is null");
			return cursordata;
		}

		logger.info("Data Sending to DB " + data.toString());
		ServiceUtils._executeStoredProcedure("pro_get_msisdn_action_dtls", data, data);

		if (data.getPo_error_code() == 0) {
			cursordata = new ArrayList<MDNRegActCursorDtlsData>();
			if (data.getPo_msdn_dtls_cursor() != null
					&& data.getPo_msdn_dtls_cursor().size() > 0) {
				logger
						.info("MDNRegActProcessJob fetchDataFromDb getPo_msdn_dtls_cursor Cursor Size is :: "
								+ data.getPo_msdn_dtls_cursor().size());
				cursordata=data.getPo_msdn_dtls_cursor();
			} else {
				logger
						.info("MDNRegActProcessJob fetchDataFromDb getPo_msdn_dtls_cursor  Cursor is Null");
			}
		}

		logger
				.info("MDNRegActProcessJob fetchDataFromDb method Ended ----------------------------");
		return cursordata;
	}

}
