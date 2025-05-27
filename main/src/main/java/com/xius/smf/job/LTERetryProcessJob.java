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

import com.xius.smf.domaindata.LTERetryProcessCursorData;
import com.xius.smf.domaindata.LTERetryProcessData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class LTERetryProcessJob implements Job,StatefulJob {

	private static final Logger logger = LogManager.getLogger(LTERetryProcessJob.class.getSimpleName());

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		
		if(logger.isInfoEnabled())
			logger.info("LTERetryProcessJob - execute method called");
		
		LTERetryProcessData data=new LTERetryProcessData();
		ArrayList<LTERetryProcessCursorData>  cursordata=null;
       
        String nwIdSplit=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.LTE_RETRY_PROCESS_JOB_EXTERNAL_NW_ID);
		  if(!Utilities.isNull(nwIdSplit)){
			  data.setPi_network_id(Long.valueOf(nwIdSplit));  
		  }
		
		String maxrec=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.LTE_RETRY_PROCESS_JOB_MAX_RECORDS);
		if(maxrec!=null)
			data.setPi_max_records(Long.valueOf(maxrec));
		
		String maxRetry=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.LTE_RETRY_PROCESS_JOB_MAX_RETRY);
		if(maxRetry!=null)
			data.setPi_max_retry(Long.valueOf(maxRetry));
		
		try {
				cursordata=fetchDataFromDb(data);			
			if(cursordata!=null) {
				if(logger.isInfoEnabled())
					logger.info("LTERetryProcessJob - cursor size is :: "+cursordata.size());
				for(int i=0;i<cursordata.size();i++){
					logger.info("cursordata >>> "+cursordata.get(i).getMsisdn_no());
				}
				lteRetryProcess(cursordata);
			}
			else{
				logger.info("CursorData is empty");
			}
		} catch (SMFAgentException e) {
			e.printStackTrace();
		}
	}

	
	private void lteRetryProcess(ArrayList<LTERetryProcessCursorData> cursordata) {
		
		if(logger.isInfoEnabled())
			logger.info("BulkStateChangeProcessJob - processBulkStateChangeData called");
		
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		ThreadPoolExecutor taskExecutor;
		CountDownLatch latch = null;
		//assuming always only 1 record will be fetched at a time
		String maxThreadsStr =InitiateAll.getSMFProps().getProperty(SMFAgentConstants.LTE_RETRY_PROCESS_JOB_MAX_THREADS);
		int maxThreads = 5;
		if(maxThreadsStr!=null && maxThreadsStr.length()>0){
			maxThreads = Integer.parseInt(maxThreadsStr);
		}
		taskExecutor= new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
		int num=0;
		int size=cursordata.size();
		latch = new CountDownLatch(size);
		for(LTERetryProcessCursorData curData:cursordata)
		{
			logger.info("BulkStateChangeProcessJob iteration start for  cursordata------------"+num);	
			
					try {
						if (curData != null && curData.getService_flag() != null) {
						if(curData.getService_flag().equalsIgnoreCase("A")){
						taskExecutor.execute(new LTERetryProvisionProcessor(latch,curData));
						}
						if(curData.getService_flag().equalsIgnoreCase("D")){
						taskExecutor.execute(new LTERetryDeProvisionProcessor(latch,curData));	
						}
						}else{
							logger.error("LTERetryProcessCursorData is Null");
						}
					} catch (Exception _exp) {
						logger.error("Excepion in taskExecutor"+ Utilities.getStackTrace(_exp));
				}
				
				
				logger.info("BulkStateChengeProcessor iteration finished ----------------------------");	
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
	private ArrayList<LTERetryProcessCursorData> fetchDataFromDb(
			LTERetryProcessData data) throws SMFAgentException {
		
			ArrayList<LTERetryProcessCursorData> cursordate=null;
			logger.info("Data Sending to DB "+data.toString());
			try {
				ServiceUtils._executeStoredProcedure("pro_lte_srvc_volte_retry", data, data);
			} catch (com.xius.smf.exceptions.SMFAgentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//pro_state_change_action_dtls
		
		if(data.getPo_error_code()==0)
		{
			cursordate=new ArrayList<LTERetryProcessCursorData>();
			cursordate=data.getPo_retry_cursor();
			
		}
		
		return cursordate;
	}

}
