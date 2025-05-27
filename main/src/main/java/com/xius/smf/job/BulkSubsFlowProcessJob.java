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

import com.xius.smf.domaindata.GetSubsFlowTrackerCurData;
import com.xius.smf.domaindata.GetSubsFlowTrackerData;
import com.xius.smf.domaindata.GetSubImsiData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class BulkSubsFlowProcessJob implements Job, StatefulJob {

	
	private	 static final Logger logger = LogManager.getLogger(BulkSubsFlowProcessJob.class.getSimpleName());

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {

		if (logger.isInfoEnabled())
			logger.info("BulkSubsFlowProcessJob - execute method called");

		GetSubsFlowTrackerData data = new GetSubsFlowTrackerData();
		ArrayList<GetSubsFlowTrackerCurData> cursordata = null;

		String nwIdSplit = InitiateAll.getSMFProps().getProperty(
				SMFAgentConstants.BULK_SUBS_FLOW_PROCESS_JOB_EXTERNAL_NW_ID);
		String nwArr[] = nwIdSplit.split(",");
		Long nwIdArr[] = new Long[nwArr.length];
		for (int i = 0; i < nwArr.length; i++) {
			nwIdArr[i] = Long.valueOf(nwArr[i]);
		}

		if (!Utilities.isNull(nwIdSplit)) {
			data.setPi_networkids(nwIdArr);
		}

		String maxrec = InitiateAll.getSMFProps().getProperty(
				SMFAgentConstants.BULK_SUBS_FLOW_PROCESS_JOB_MAX_RECORDS);
		if (maxrec != null)
			data.setPi_max_records(Long.valueOf(maxrec));

		try {
			cursordata = fetchDataFromDb(data);
			if (cursordata != null) {
				if (logger.isInfoEnabled())
					logger.info("BulkSubsFlowProcessJob - cursor size is :: "
							+ cursordata.size());
				processData(cursordata);
			} else {
				logger.info("CursorData is empty");
			}
		} catch (SMFAgentException e) {
			e.printStackTrace();
		}
	}

	// 1. from cursor Data, find the total no of SIMs to process
	// 2. on completion of all the records update the SMF DB with completed
	// state

	private void processData(ArrayList<GetSubsFlowTrackerCurData> cursordata) {

		if (logger.isInfoEnabled())
			logger.info("BulkSubsFlowProcessJob - processData called");

		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(
				100000);
		ThreadPoolExecutor taskExecutor;
		CountDownLatch latch = null;
		String maxThreadsStr = InitiateAll.getSMFProps().getProperty(
				SMFAgentConstants.BULK_SUBS_FLOW_PROCESS_JOB_MAX_THREADS);
		int maxThreads = 5;
		if (maxThreadsStr != null && maxThreadsStr.length() > 0) {
			maxThreads = Integer.parseInt(maxThreadsStr);
		}
		taskExecutor = new ThreadPoolExecutor(maxThreads, maxThreads, 100000,
				TimeUnit.SECONDS, queue);
		int num = 0;
		int size = cursordata.size();
		latch = new CountDownLatch(size);
		for (GetSubsFlowTrackerCurData curData : cursordata) {
			logger.info("BulkSubsFlowProcessJob iteration start for  cursordata------------ "
					+ num + " >>> " + curData.getRequest_data());
			try {
				int CheckFlag = 0;
				if (curData != null && curData.getFlow_id() != null) {
					String checkVal = InitiateAll.getSMFProps().getProperty(
							"BULK_SUBS_FLOW_PROCESS_5G_CHECK");

					if (checkVal != null) {
						String[] checkArr = checkVal.split("#");

						for (int i = 0; i < checkArr.length; i++) {
							if (curData.getFlow_id().equalsIgnoreCase(
									checkArr[i])) {
								CheckFlag = 1;
								break;
							}
						}

					}

					// To check the SUBFLOWIDS and assign CC to the MSISDN
					String CC = InitiateAll.getSMFProps().getProperty(
							"BULK_SUBS_FLOW_PROCESS_JOB_COUNTRY_CODE");

					if (CC != null) {
						curData.setOrg_request_data(curData.getRequest_data());
						String Value = Utilities.getMSISDNWithCCSubFLows(
								curData.getRequest_data(),
								curData.getSub_flow_ids(), CC);
						curData.setRequest_data(Value);
						logger.info("BulkSubsFlowProcessJob setting Request_data after CC ------------ "
								+ num + " >>> " + curData.getRequest_data());
					}
					if (curData.getSub_flow_ids().equalsIgnoreCase("5001")) {
						taskExecutor.execute(new FourGProvisionProcessor(latch,
								curData, CheckFlag));
					}
					if (curData.getSub_flow_ids().equalsIgnoreCase("5002")) {
						taskExecutor.execute(new FourGDeProvisionProcessor(
								latch, curData));
					}
					if (curData.getSub_flow_ids().equalsIgnoreCase("5003")) {
						taskExecutor.execute(new FiveGProvisionProcessor(latch,
								curData, CheckFlag));
					}
					if (curData.getSub_flow_ids().equalsIgnoreCase("5004")) {
						taskExecutor.execute(new FiveGDeProvisionProcessor(
								latch, curData));
					}

				} else {
					logger.error("GetSubsFlowTrackerCurData is Null");
				}

			} catch (Exception _exp) {
				logger.error("Excepion in taskExecutor"
						+ Utilities.getStackTrace(_exp));
			}

			logger.info("BulkSubsFlowProcessor iteration finished ----------------------------");
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
	private ArrayList<GetSubsFlowTrackerCurData> fetchDataFromDb(
			GetSubsFlowTrackerData data) throws SMFAgentException, com.xius.smf.exceptions.SMFAgentException {

		ArrayList<GetSubsFlowTrackerCurData> cursordate = null;
		

		String instance_id = InitiateAll.getSMFProps().getProperty(
				"BULK_SUBS_FLOW_PROCESS_JOB_INSTANCE_ID");

		if (instance_id != null)
			data.setPi_instance_id(instance_id);

		String flow_id_prop = InitiateAll.getSMFProps().getProperty(
				"BULK_SUBS_FLOW_PROCESS_JOB_FLOW_IDS");
		if (flow_id_prop != null) {
			String[] pi_flow_ids = flow_id_prop.split(",");
			data.setPi_flow_ids(pi_flow_ids);
		}

		String sub_flow_id_prop = InitiateAll.getSMFProps().getProperty(
				"BULK_SUBS_FLOW_PROCESS_JOB_SUBFLOW_IDS");
		if (sub_flow_id_prop != null) {
			String[] pi_sub_flow_ids = sub_flow_id_prop.split(",");
			data.setPi_sub_flow_ids(pi_sub_flow_ids);
		}
		logger.info("Data Sending to DB " + data.toString());
		ServiceUtils._executeStoredProcedure("pro_subs_bulk_flow_tracker_get",
				data, data);// pro_subs_bulk_flow_tracker_get

		if (data.getPo_error_code() == 0) {
			cursordate = new ArrayList<GetSubsFlowTrackerCurData>();
			cursordate = data.getPo_subs_flow_dtls();

		}

		return cursordate;
	}

}
