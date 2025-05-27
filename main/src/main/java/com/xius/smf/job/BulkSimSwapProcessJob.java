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

import com.xius.smf.domaindata.BulkSimSwapJobData;
import com.xius.smf.domaindata.BulkSimSwapProcessData;
import com.xius.smf.domaindata.GetBulkSimSwapDtlsCursorData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class BulkSimSwapProcessJob implements Job,StatefulJob {

	private	 static final Logger logger = LogManager.getLogger(BulkSimSwapProcessJob.class.getSimpleName());

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		
		if(logger.isInfoEnabled())
			logger.info("BulkSimSwapProcessJob - execute method called");
		
		BulkSimSwapProcessData data=new BulkSimSwapProcessData();
		ArrayList<GetBulkSimSwapDtlsCursorData> cursordata=null;
       
        String nwIdSplit=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_SIM_SWAP_PROCESS_JOB_EXTERNAL_NW_ID);
		  if(!Utilities.isNull(nwIdSplit)){
			  data.setPi_network_id(Long.valueOf(nwIdSplit));  
		  }
		
		String maxrec=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_SIM_SWAP_PROCESS_JOB_MAX_RECORDS);
		if(maxrec!=null)
			data.setPi_max_records(Long.valueOf(maxrec));
		
		try {
				cursordata=fetchDataFromDb(data);			
			if(cursordata!=null) {
				if(logger.isInfoEnabled())
					logger.info("BulkSimSwapProcessJob - cursor size is :: "+cursordata.size());
				for(int i=0;i<cursordata.size();i++){
					logger.info("cursordata >>> "+cursordata.get(i).getNEW_SIM());
				}
				processBulkSimSwapData(cursordata);
			}
			else{
				logger.info("CursorData is empty");
			}
		} catch (SMFAgentException e) {
			e.printStackTrace();
		}
	}

	// 1. from cursor Data, find the total no of SIMs to process
	// 2. on completion of all the records update the SMF DB with completed state
	
	private void processBulkSimSwapData(ArrayList<GetBulkSimSwapDtlsCursorData> cursordata) {
		
		if(logger.isInfoEnabled())
			logger.info("BulkSimSwapProcessJob - processBulkSimSwapData called");
		
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		ThreadPoolExecutor taskExecutor;
		CountDownLatch latch = null;
		//assuming always only 1 record will be fetched at a time
		String maxThreadsStr =InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_SIM_SWAP_PROCESS_JOB_MAX_THREADS);
		int maxThreads = 5;
		if(maxThreadsStr!=null && maxThreadsStr.length()>0){
			maxThreads = Integer.parseInt(maxThreadsStr);
		}
		taskExecutor= new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
		int num=0;
		int size=cursordata.size();
		latch = new CountDownLatch(size);
		for(GetBulkSimSwapDtlsCursorData curData:cursordata)
		{
			logger.info("BulkSimSwapProcessJob iteration start for  cursordata------------"+num);	
			
				BulkSimSwapJobData data = new BulkSimSwapJobData();
				
				if(curData.getNetwork_id()!=null)
					data.setPi_network_id(Long.valueOf(curData.getNetwork_id()));
				if(curData.getUser_id()!=null)
					data.setPi_login_id(curData.getUser_id());
				if(curData.getOLD_MSISDN()!=null)
					data.setPi_old_msisdn(curData.getOLD_MSISDN());
				if(curData.getNEW_SIM()!=null)
					data.setPi_new_sim(curData.getNEW_SIM());
				if(curData.getTRANS_ID()!=null)
					data.setTrans_id(curData.getTRANS_ID());
				if(curData.getREMARKS()!=null)
					data.setPi_remarks(curData.getREMARKS());
				
					try {
						taskExecutor.execute(new BulkSimSwapProcessProcessor(latch,
								data));
					} catch (Exception _exp) {
						logger.error("Excepion in taskExecutor"+ Utilities.getStackTrace(_exp));
				}
				
				
				logger.info("BulkSimSwapProcessJob iteration finished ----------------------------");	
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
	private ArrayList<GetBulkSimSwapDtlsCursorData> fetchDataFromDb(
			BulkSimSwapProcessData data) throws SMFAgentException {
		
			ArrayList<GetBulkSimSwapDtlsCursorData> cursordate=null;
			logger.info("Data Sending to DB "+data.toString());
			ServiceUtils._executeStoredProcedure("pro_get_sim_swap_action_dtls", data, data);
		
		if(data.getPo_error_code()==0)
		{
			cursordate=new ArrayList<GetBulkSimSwapDtlsCursorData>();
			cursordate=data.getPo_sim_swap_cursor();
			
		}
		
		return cursordate;
	}

}
