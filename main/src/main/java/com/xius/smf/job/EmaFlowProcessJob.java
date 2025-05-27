package com.xius.smf.job;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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

import com.xius.smf.domaindata.EmaFlowProcessCursorData;
import com.xius.smf.domaindata.EmaFlowProcessData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class EmaFlowProcessJob implements Job, StatefulJob {

	private	 static final Logger logger = LogManager.getLogger(EmaFlowProcessJob.class.getSimpleName());

	// Static fields
	static String[] urlarr;

	static {
		try {
			String maxURLCountp = InitiateAll.getSMFProps().getProperty(
					"TTSA_REST_URL_MAX_COUNT");
			String maxURLCount = (maxURLCountp != null) ? maxURLCountp : "1";

			// Handle invalid property value gracefully
			int count = 1;
			try {
				count = Integer.parseInt(maxURLCount);
			} catch (NumberFormatException e) {
				logger.error(
						"Invalid TTSA_REST_URL_MAX_COUNT value, using default value '1'.",
						e);
			}

			urlarr = new String[count];
			for (int i = 0; i < urlarr.length; i++) { // Fix array indexing
				urlarr[i] = (i + 1) + ""; // Populate array starting from "1"
			}

			logger.info("Initialized urlarr with size: " + urlarr.length);
		} catch (Exception e) {
			logger.error("Error initializing static block", e);
			throw new RuntimeException(
					"Error during static initialization of EmaFlowProcessJob",
					e);
		}
	}

	@Override
	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		if (logger.isInfoEnabled()) {
			logger.info("EmaFlowInsertProcessJob - execute method called");
		}

		EmaFlowProcessData data = new EmaFlowProcessData();
		Map<String, List<EmaFlowProcessCursorData>> transactionMap = new HashMap<String, List<EmaFlowProcessCursorData>>();

		String nwIdSplit = InitiateAll.getSMFProps().getProperty(
				SMFAgentConstants.EMA_FLOW_JOB_EXTERNAL_NW_ID);
		if (!Utilities.isNull(nwIdSplit)) {
			data.setPi_network_id(Long.valueOf(nwIdSplit));
		}

		String maxrec = InitiateAll.getSMFProps().getProperty(
				SMFAgentConstants.EMA_FLOW_JOB_MAX_RECORDS);
		if (maxrec != null) {
			data.setPi_max_records(Long.valueOf(maxrec));
		}

		try {
			transactionMap = fetchDataFromDb(data);
			if (transactionMap != null && !transactionMap.isEmpty()) {
				if (logger.isInfoEnabled()) {
					logger.info("EmaFlowInsertProcessJob - cursor size is :: "
							+ transactionMap.size());
				}

				for (Entry<String, List<EmaFlowProcessCursorData>> entry : transactionMap
						.entrySet()) {
					String key = entry.getKey();
					List<EmaFlowProcessCursorData> value = entry.getValue();
					logger.info("cursordata >>> Key: " + key + ", Value: "
							+ value);
				}

				processEmaFlowData(transactionMap);
			} else {
				logger.info("CursorData is empty");
			}
		} catch (SMFAgentException e) {
			logger.error("Error while fetching data from DB", e);
		}
	}

	private void processEmaFlowData(
			Map<String, List<EmaFlowProcessCursorData>> transactionMap) {
		if (logger.isInfoEnabled()) {
			logger.info("EmaFlowProcessJob - processEmaFlowData called");
		}

		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(
				100000);
		ThreadPoolExecutor taskExecutor;
		CountDownLatch latch = new CountDownLatch(transactionMap.size());

		String maxThreadsStr = InitiateAll.getSMFProps().getProperty(
				SMFAgentConstants.EMA_FLOW_JOB_MAX_THREADS);
		int maxThreads = 5; // Default value
		try {
			if (maxThreadsStr != null && !maxThreadsStr.isEmpty()) {
				maxThreads = Integer.parseInt(maxThreadsStr);
			}
		} catch (NumberFormatException e) {
			logger.error("Invalid value for EMA_FLOW_JOB_MAX_THREADS: "
					+ maxThreadsStr, e);
		}

		taskExecutor = new ThreadPoolExecutor(maxThreads, maxThreads, 100000,
				TimeUnit.SECONDS, queue);

		try {
			int idx = 0;
			for (Map.Entry<String, List<EmaFlowProcessCursorData>> entry : transactionMap
					.entrySet()) {
				List<EmaFlowProcessCursorData> cursorData = entry.getValue();
				String transactionId = entry.getKey();
				logger.info("EmaFlowProcessJob iteration start for transaction "
						+ transactionId);

				try {
					String next = urlarr[idx++ % urlarr.length];
					logger.info("Key invoking for transId: " + transactionId
							+ " key: " + next);

					taskExecutor.execute(new EmaFlowProcessor(latch,
							cursorData, next));
				} catch (Exception _exp) {
					logger.error("Exception in taskExecutor for transaction "
							+ transactionId, _exp);
				}
				logger.info("EmaFlowProcessor iteration finished for transaction "
						+ transactionId);
			}

			latch.await(); // Wait for all tasks to complete

		} catch (InterruptedException e) {
			logger.error("Exception in await()", e);
		} finally {
			if (taskExecutor != null) {
				taskExecutor.shutdown();
				while (!taskExecutor.isTerminated()) {
					// Wait for the thread pool to terminate
				}
			}
		}
	}

	// Fetch records from the database by invoking a stored procedure
	private Map<String, List<EmaFlowProcessCursorData>> fetchDataFromDb(
			EmaFlowProcessData data) throws SMFAgentException {
		Map<String, List<EmaFlowProcessCursorData>> transactionMap = new HashMap();
		String instanceId = InitiateAll.getSMFProps().getProperty(
				"EMA_FLOW_JOB_INSTANCE_ID");

		if (instanceId != null) {
			data.setPi_instance_id(instanceId);
		}

		String getimmediateflag = InitiateAll.getSMFProps().getProperty("EMA_FLOW_JOB_GET_I_OR_N");
		
		if(getimmediateflag!=null && getimmediateflag.length()>0){
			data.setPi_flag(getimmediateflag);
		}
		logger.info("Data Sending to DB " + data.toString());
		ServiceUtils._executeStoredProcedure("pro_get_ema_flow_cmds", data,
				data);

		if (data.getPo_error_code() == 0
				&& data.getPo_cmd_cursor_data() != null
				&& data.getPo_int_tranid() != null) {
			String[] inttransid = data.getPo_int_tranid();
			for (String tranId : inttransid) {
				List<EmaFlowProcessCursorData> list = new ArrayList();
				for (EmaFlowProcessCursorData cursorData : data
						.getPo_cmd_cursor_data()) {
					if (cursorData.getInt_trans_id().equals(tranId)) {
						list.add(cursorData);
					}
				}
				transactionMap.put(tranId, list);
			}
		} else {
			logger.info("EmaFlowProcessJob fetchDataFromDb Cursor is Null");
		}

		return transactionMap;
	}
}
