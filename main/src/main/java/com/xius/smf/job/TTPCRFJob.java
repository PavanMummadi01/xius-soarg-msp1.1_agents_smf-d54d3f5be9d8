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

import com.xius.smf.domaindata.TTPCRFCursorData;
import com.xius.smf.domaindata.TTPCRFSelectDATA;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class TTPCRFJob implements Job, StatefulJob {
	
	private static final Logger logger = LogManager.getLogger(TTPCRFJob.class.getSimpleName());

	public void execute(JobExecutionContext arg0) throws JobExecutionException {

		ArrayList<TTPCRFCursorData> cursordata = null;

		String[] nwId = InitiateAll.getSMFProps()
				.getProperty(SMFAgentConstants.PCRF_POLICY_EXTERNAL_NW_ID)
				.split(",");
		String maxRows = InitiateAll.getSMFProps().getProperty(
				SMFAgentConstants.PCRF_POLICY_TRACKER_JOB_MAX_RECORDS);
		String FailureCountStr=InitiateAll.getSMFProps().getProperty(
				SMFAgentConstants.PCRF_POLICY_FAILURE_COUNT);
		try {

			TTPCRFSelectDATA data = new TTPCRFSelectDATA();
			if (nwId != null) {

				Long nwArr[] = new Long[nwId.length];
				for (int t = 0; t < nwId.length; t++) {
					nwArr[t] = Long.parseLong(nwId[t]);
					logger.info("nwId>>>" + nwId[t]);
				}
				data.setPi_network(nwArr);
			}
			if (maxRows != null)
				data.setPi_max_records(Long.parseLong(maxRows));
			
			//Setting Failure Count
			if (FailureCountStr != null){
				data.setPi_failure_count(Long.parseLong(FailureCountStr));
			}
			else{
				data.setPi_failure_count(3L);
			}
			//Fetching the data from DB
			if (data != null){
				cursordata = fetchDataFromDb(data);
			}
			// data.setPo_cursor_data(cursordata);
			if (cursordata != null && cursordata.size() > 0) {
				processPCRFData(cursordata);
			} else {
				logger.info("CursorData is Empty");
			}

		} catch (SMFAgentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<TTPCRFCursorData> fetchDataFromDb(
			TTPCRFSelectDATA domaindata) throws SMFAgentException {
		logger.info("TTPCRFJob fetchDataFromDb method called ----------------------------");
		ArrayList<TTPCRFCursorData> cursordate = null;
		logger.info("Data Sending to DB " + domaindata);
		ServiceUtils._executeStoredProcedure("select_policy_tracker",
				domaindata, domaindata);
		logger.info("TTPCRFJob fetchDataFromDb method called ----------------------------78");
		if (domaindata.getPo_error_code() == 0) {
			cursordate = new ArrayList<TTPCRFCursorData>();
			if (domaindata.getPo_cursor_data() != null
					&& domaindata.getPo_cursor_data().size() > 0) {
				logger.info("TTPCRFJob fetchDataFromDb Cursor Size is :: "
						+ domaindata.getPo_cursor_data().size());
				cursordate = domaindata.getPo_cursor_data();
			} else {
				logger.info("TTPCRFJob fetchDataFromDb Cursor is Null");
			}
		} else {
			logger.info("TTPCRFJob fetchDataFromDb failed>>>"
					+ domaindata.getPo_error_code());
			logger.info("TTPCRFJob fetchDataFromDb failed>>>"
					+ domaindata.getPo_error_desc());
		}
		logger.info("TTPCRFJob fetchDataFromDb method Ended ----------------------------");
		return cursordate;
	}

	public void processPCRFData(ArrayList<TTPCRFCursorData> cursordata) {
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(
				100000);
		CountDownLatch latch = null;
		int size = cursordata.size();

		ThreadPoolExecutor taskExecutor;

		String maxThreadsStr = InitiateAll.getSMFProps().getProperty(
				SMFAgentConstants.PCRF_POLICY_TRACKER_JOB_MAX_THREADS);
		int maxThreads = 5;

		if (maxThreadsStr != null) {
			try {
				maxThreads = Integer.parseInt(maxThreadsStr);

			} catch (Exception e) {
				if (logger.isDebugEnabled())
					logger.debug("Exception while parsing property PCRF_POLICY_TRACKER_JOB_MAX_THREADS. so taking default value 5");
			}
		} else {
			if (logger.isDebugEnabled())
				logger.debug("Property PCRF_POLICY_TRACKER_JOB_MAX_THREADS is null. so taking default value 5 ");
		}
		logger.info("processPCRFData PCRF_POLICY_TRACKER_JOB_MAX_THREADS are "
				+ maxThreads);
		taskExecutor = new ThreadPoolExecutor(maxThreads, maxThreads, 100000,
				TimeUnit.SECONDS, queue);
		latch = new CountDownLatch(size);

		for (TTPCRFCursorData curData : cursordata) {
			
			logger.info("curData.getActivity_type()::"+curData.getActivity_type());
			logger.info("curData.getFailure_count()::"+curData.getFailure_count());
			logger.info("PCRF_POLICY_FAILURE_COUNT()::"+	InitiateAll.getSMFProps().getProperty(
					SMFAgentConstants.PCRF_POLICY_FAILURE_COUNT));
		
			
			if(InitiateAll.getSMFProps().getProperty(
					SMFAgentConstants.PCRF_POLICY_FAILURE_COUNT) != null){
				//checking max count reached so delete proc invoked
			 if(curData.getFailure_count()!=null && curData.getFailure_count()>= Long.parseLong(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.PCRF_POLICY_FAILURE_COUNT))){
				 
				logger.info("TTPCRFJob TTPCRFDeleteDBCallProcessor Invoking Delete proc DB  as max count reached---------------------");
				taskExecutor.execute(new TTPCRFDeleteDBCallProcessor(latch,
						curData));
			}
			 else if(curData.getEma_processed_status()!=null && (curData.getEma_processed_status().equalsIgnoreCase("F") || curData.getEma_processed_status().equalsIgnoreCase("S"))){// error code doesn't match with the configured error codes so delete
				 
					logger.info("TTPCRFJob TTPCRFDeleteDBCallProcessor Invoking Delete proc DB  as ema processed status is F or S ---------------------");
					taskExecutor.execute(new TTPCRFDeleteDBCallProcessor(latch,
							curData));
			 }
			else{
			if (curData.getActivity_type() != null) {
				Long TransID = curData.getTransation_id();

				logger.info("TTPCRFJob Activity_type is :: "
						+ curData.getActivity_type());
				logger.info("TransID from cursor Data " + TransID);
 					if (curData
							.getActivity_type()
							.equals(new Long(
									InitiateAll
											.getSMFProps()
											.getProperty(
													SMFAgentConstants.PCRF_POLICY_UNASSIGN_AND_ASSIGN_FLG)))) { // assign flag 5

						logger.info("TTPCRFJob Invoking ASSIGN ---------------------");
						
						if((curData.getNotify_status()).equalsIgnoreCase("U")){
							logger.info("TTPCRFJob TTPCRFUnsubscribeProcessor 5 Invoking ASSIGN UNSUBSCRIBE---------------------");
							taskExecutor.execute(new TTPCRFUnsubscribeProcessor(latch,
									curData));
						}
						else{
							logger.info("TTPCRFJob TTPCRFSubscribeProcessor 5 Invoking ASSIGN SUBSCRIBE---------------------");
							taskExecutor.execute(new TTPCRFSubscribeProcessor(
									latch,curData));
						}
						
				} else if (curData.getActivity_type().equals(
						new Long(InitiateAll.getSMFProps().getProperty(
								SMFAgentConstants.PCRF_POLICY_UNASSIGN_FLG)))) { // unassign Flag 6
					logger.info("TTPCRFJob TTPCRFUnsubscribeProcessor 6 Invoking UNASSIGN ---------------------");
					taskExecutor.execute(new TTPCRFUnsubscribeProcessor(latch,
							curData));
				}

				else if (curData.getActivity_type().equals(
						new Long(InitiateAll.getSMFProps().getProperty(
								SMFAgentConstants.PCRF_POLICY_RENEWAL_FLG)))) { // Renewal Flag 7
					
					logger.info("TTPCRFJob 7 Invoking RENEWAL ---------------------"); 
					if((curData.getNotify_status()).equalsIgnoreCase("U")){
						logger.info("TTPCRFJob TTPCRFUnsubscribeProcessor 7 Invoking RENEWAL UNSUBSCRIBE---------------------");
						taskExecutor.execute(new TTPCRFUnsubscribeProcessor(latch,
								curData));
					}
					else{
						logger.info("TTPCRFJob TTPCRFSubscribeProcessor 7 Invoking RENEWAL SUBSCRIBE---------------------");
						taskExecutor.execute(new TTPCRFSubscribeProcessor(
								latch,curData));
					}
				}
			} else {
				logger.info("TTPCRFJob Activity_type is Null ");
			}
			}
		}
		}
		try {
			if (latch != null)
				latch.await();
		} catch (InterruptedException e) {
			logger.error("Excepion in await()" + Utilities.getStackTrace(e));
		}
		taskExecutor.shutdown();
		while (!taskExecutor.isTerminated()) {

		}
		latch = null;
		taskExecutor = null;
		logger.info("Hlrstatechange iteration finished ----------------------------");

	}

}
