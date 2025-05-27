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
import com.xius.smf.domaindata.GetRetryChangeDeviceDtlsCursorData;
import com.xius.smf.domaindata.RetryChangeDeviceProcessData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class RetryChangeDeviceProcessJob implements Job,StatefulJob {

	private static final Logger logger = LogManager.getLogger(RetryChangeDeviceProcessJob.class.getSimpleName());

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		
		if(logger.isInfoEnabled())
			logger.info("RetryChangeDeviceProcessJob - execute method called");
		
		RetryChangeDeviceProcessData data=new RetryChangeDeviceProcessData();
		ArrayList<GetRetryChangeDeviceDtlsCursorData> cursordata=null;
       
        String nwIdSplit=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.RETRY_CHANGE_DEVICE_PROCESS_JOB_EXTERNAL_NW_ID);
		  if(!Utilities.isNull(nwIdSplit)){
			  data.setPi_network_id(Long.valueOf(nwIdSplit));  
		  }
		
		String maxrec=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.RETRY_CHANGE_DEVICE_PROCESS_JOB_MAX_RECORDS);
		if(maxrec!=null)
			data.setPi_max_rows(Long.valueOf(maxrec));
		
		logger.info("RetryChangeDeviceProcessJob - Pi_max_rows ::::::::: "+data.getPi_max_rows());
		
		try {
				cursordata=fetchDataFromDb(data);	
				
				logger.info("RetryChangeDeviceProcessJob - cursor size is :: "+cursordata.size());
				
			if(cursordata!=null && cursordata.size()>0) {
				if(logger.isInfoEnabled())
					//logger.info("RetryChangeDeviceProcessJob - cursor size is :: "+cursordata.size());
		/*		for(int i=0;i<cursordata.size();i++){
					logger.info("cursordata trans_id >>> "+cursordata.get(i).getTransaction_id());
				}*/
				processRetryChnageDeviceData(cursordata);
			}
			else{
				logger.info("CursorData is empty :::::::::::::::::::");
			}
		} catch (SMFAgentException e) {
			e.printStackTrace();
		}
	}
	
	private void processRetryChnageDeviceData(ArrayList<GetRetryChangeDeviceDtlsCursorData> cursordata) {
		
		if(logger.isInfoEnabled())
			logger.info("RetryChangeDeviceProcessJob - processRetryChnageDeviceData called");
		
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		ThreadPoolExecutor taskExecutor;
		CountDownLatch latch = null;
		//assuming always only 1 record will be fetched at a time
		String maxThreadsStr =InitiateAll.getSMFProps().getProperty(SMFAgentConstants.RETRY_CHANGE_DEVICE_PROCESS_JOB_MAX_THREADS);
		int maxThreads = 5;
		if(maxThreadsStr!=null && maxThreadsStr.length()>0){
			maxThreads = Integer.parseInt(maxThreadsStr);
		}
		taskExecutor= new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
		int num=0;
		int size=cursordata.size();
		latch = new CountDownLatch(size);
		for(GetRetryChangeDeviceDtlsCursorData curData:cursordata)
		{
			logger.info("RetryChangeDeviceProcessJob iteration start for  cursordata------------"+num);	
			
					try {
						// here curData ----> getting activity_type and trans_id
						taskExecutor.execute(new RetryChangeDeviceProcessor(latch,curData));
					
					} catch (Exception _exp) {
						logger.error("Excepion in taskExecutor"+ Utilities.getStackTrace(_exp));
				}
				
				logger.info("RetryChangeDeviceProcessJob iteration finished ----------------------------");	
				num++;
			}

		try {
			if (latch != null)
				latch.await();
		} catch (InterruptedException e) {
			logger.error("Excepion in await()"+ Utilities.getStackTrace(e));
		}
		
		if (taskExecutor!=null) {
			taskExecutor.shutdown();
		}
		while (!taskExecutor.isTerminated()) {
		}
		
		latch = null;
		taskExecutor = null;
	}
	 // Invoke the SMF DB procedure to get the Records to be processed
	private ArrayList<GetRetryChangeDeviceDtlsCursorData> fetchDataFromDb(
			RetryChangeDeviceProcessData data) throws SMFAgentException {
		
			ArrayList<GetRetryChangeDeviceDtlsCursorData> cursordata=null;
			logger.info("Data Sending to DB "+data.toString());
			ServiceUtils._executeStoredProcedure("pro_rty_sim_swap_chg_mdn_dtls", data, data);
			
		if(data.getPo_error_code()==0) {
			cursordata=new ArrayList<GetRetryChangeDeviceDtlsCursorData>();
			cursordata=data.getPo_sim_swap_retry_dtls();
		}
		
		return cursordata;
	}

}
