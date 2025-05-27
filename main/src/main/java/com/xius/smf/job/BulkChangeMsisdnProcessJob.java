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

import com.xius.smf.domaindata.BulkChangeMsisdnProcessData;
import com.xius.smf.domaindata.GetBulkChangeMsisdnDtlsCursorData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class BulkChangeMsisdnProcessJob implements Job,StatefulJob {

	private	 static final Logger logger = LogManager.getLogger(BulkChangeMsisdnProcessJob.class.getSimpleName());

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		
		if(logger.isInfoEnabled())
			logger.info("BulkChnageMsisdnProcessJob - execute method called");
		
		BulkChangeMsisdnProcessData data=new BulkChangeMsisdnProcessData();
		ArrayList<GetBulkChangeMsisdnDtlsCursorData> cursordata=null;
       
        String nwIdSplit=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_CHANGE_MSISDN_PROCESS_JOB_EXTERNAL_NW_ID);
		  if(!Utilities.isNull(nwIdSplit)){
			  data.setPi_network_id(Long.valueOf(nwIdSplit));  
		  }
		
		String maxrec=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_CHANGE_MSISDN_PROCESS_JOB_MAX_RECORDS);
		if(maxrec!=null)
			data.setPi_max_rows(Long.valueOf(maxrec));
		
		try {
				cursordata=fetchDataFromDb(data);			
			if(cursordata!=null && cursordata.size()>0) {
				if(logger.isInfoEnabled())
					logger.info("BulkChangeMsisdnProcessJob - cursor size is :: "+cursordata.size());
				for(int i=0;i<cursordata.size();i++){
					logger.info("cursordata >>> "+cursordata.get(i).getMsisdn());
				}
				processBulkChnageMsisdnData(cursordata);
			}
			else{
				logger.info("CursorData is empty");
			}
		} catch (SMFAgentException e) {
			e.printStackTrace();
		}
	}

	
	private void processBulkChnageMsisdnData(ArrayList<GetBulkChangeMsisdnDtlsCursorData> cursordata) {
		
		if(logger.isInfoEnabled())
			logger.info("BulkChangeMsisdnProcessJob - processBulkChnageMsisdnData called");
		
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		ThreadPoolExecutor taskExecutor;
		CountDownLatch latch = null;
		//assuming always only 1 record will be fetched at a time
		String maxThreadsStr =InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_CHANGE_MSISDN_PROCESS_JOB_MAX_THREADS);
		int maxThreads = 5;
		if(maxThreadsStr!=null && maxThreadsStr.length()>0){
			maxThreads = Integer.parseInt(maxThreadsStr);
		}
		taskExecutor= new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
		int num=0;
		int size=cursordata.size();
		latch = new CountDownLatch(size);
		for(GetBulkChangeMsisdnDtlsCursorData curData:cursordata)
		{
			logger.info("BulkChnageMsisdnProcessJob iteration start for  cursordata------------"+num);	
			
					try {
						
						taskExecutor.execute(new BulkChangeMsisdnProcessor(latch,
								curData));
					} catch (Exception _exp) {
						logger.error("Excepion in taskExecutor"+ Utilities.getStackTrace(_exp));
				}
				
				
				logger.info("BulkChangeMsisdnProcessJob iteration finished ----------------------------");	
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
	private ArrayList<GetBulkChangeMsisdnDtlsCursorData> fetchDataFromDb(
			BulkChangeMsisdnProcessData data) throws SMFAgentException {
		
			ArrayList<GetBulkChangeMsisdnDtlsCursorData> cursordate=null;
			logger.info("Data Sending to DB "+data.toString());
			ServiceUtils._executeStoredProcedure("pro_get_chg_msisdn_upld_dtls", data, data);
		
		if(data.getPo_error_code()==0)
		{
			cursordate=new ArrayList<GetBulkChangeMsisdnDtlsCursorData>();
			cursordate=data.getPo_chg_msisdn_dtls();
			
		}
		
		return cursordate;
	}

}
