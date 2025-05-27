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

import com.xius.smf.domaindata.SorianaRetryCurData;
import com.xius.smf.domaindata.SorianaRetryJobData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class SorianaRetryJob implements Job,StatefulJob{
	private static final Logger logger = LogManager.getLogger(SorianaRetryJob.class.getSimpleName());

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		
		ArrayList<SorianaRetryCurData> cursordata=null;
		String[] nwIds=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SORIANA_RETRY_EXTERNAL_NW_ID).split(",");
		String[] actIds=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SORIANA_RETRY_ACTIVITY_ID).split(",");
		Integer[] nwId=Utilities.StringToInt(nwIds);
		Integer[] actId=Utilities.StringToInt(actIds);
		String instanceId=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SORIANA_RETRY_INSTANCE_ID);
		Long maxrec=Long.parseLong(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SORIANA_RETRY_JOB_MAX_RECORDS));
		
		
		
		SorianaRetryJobData data=new SorianaRetryJobData();
		data.setNetwork_id(nwId);
		data.setPi_instance_id(instanceId);
		data.setPi_max_records(maxrec);
		data.setPi_activity_id(actId);
		
		
		try {
			cursordata=fetchDataFromDb(data);
			
			if(cursordata!=null)
			{
				
				spanThreads(cursordata);
				
			}
			else
			{
				logger.info("CursorData is empty");
				
			}
			
			
		} catch (SMFAgentException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	public ArrayList<SorianaRetryCurData> fetchDataFromDb(SorianaRetryJobData domaindata) throws SMFAgentException
	{
		ArrayList<SorianaRetryCurData> cursordate=null;
		
		logger.info("Data Sending to DB "+domaindata.toString());
		ServiceUtils._executeStoredProcedure("pro_first_lu_retry_job", domaindata, domaindata);
		
		
		if(domaindata.getPo_error_code()==0)
		{
			cursordate=new ArrayList<SorianaRetryCurData>();
			
			cursordate=domaindata.getCursor_data();
			
		}
		
		
		return cursordate;
	}
	
	
	public void spanThreads(ArrayList<SorianaRetryCurData> cursordata)
	{
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		CountDownLatch latch = null;
		int size=cursordata.size();
		
		ThreadPoolExecutor taskExecutor;
		
		String maxThreadsStr =InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SORIANA_RETRY_JOB_MAX_THREADS);
		int maxThreads = 5;
		
		if(maxThreadsStr != null){
			try {
				maxThreads = Integer.parseInt( maxThreadsStr );
				
				
			} catch(Exception e) {
				if (logger.isDebugEnabled())
					logger.debug("Exception while parsing property SORIANA_RETRY_JOB_MAX_THREADS. so taking default value 5" );
			}
		} else {
			if (logger.isDebugEnabled())
				logger.debug("Property SORIANA_RETRY_JOB_MAX_THREADS is null. so taking default value 5 ");
		}
		logger.info("cursorData Size "+size);
		logger.info("Spanning threads with max thread count "+maxThreads);
		long startTimeTotal = System.currentTimeMillis();
		taskExecutor= new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
		latch = new CountDownLatch(size);
		
		
			 
		
		for(SorianaRetryCurData curData:cursordata)
		{
			logger.info("sending cursor data to processor "+curData.toString());
			
			
			taskExecutor.execute(new SorianaRetryProcessor(latch, curData) );
			
			
			
			
			
			
			
			
		}
		try {

			if(latch != null)
				latch.await();
		} catch (InterruptedException e) {

			logger.error("Excepion in await()"+Utilities.getStackTrace(e));
		}
		latch = null;
		logger.info("SorianaRetryJob iteration finished ----------------------------");

		
		
		
	}
	

}
