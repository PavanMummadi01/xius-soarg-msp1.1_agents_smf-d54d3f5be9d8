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

import com.xius.smf.domaindata.BulkAtpSubsCursorData;
import com.xius.smf.domaindata.BulkAtpSubsData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class BulkAtpsubsJob implements Job,StatefulJob {
	
	private	 static final Logger logger = LogManager.getLogger(BulkAtpsubsJob.class.getSimpleName());



	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		
		BulkAtpSubsData data=new BulkAtpSubsData();
		ArrayList<BulkAtpSubsCursorData> cursordata=null;
       
//       Integer[]  externalnwIdlistarray=null;
		String[] externalnwIdliststrarray=null;
        String nwIdSplit=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_ATP_SUBSCRIPTION_EXTERNAL_NW_ID);
		  if(!Utilities.isNull(nwIdSplit)){
				
			  // StringTokenizer st = new StringTokenizer(nwIdSplit,",");  
			  externalnwIdliststrarray=nwIdSplit.split(",");
			  data.setNetwork_id(StringToInt(externalnwIdliststrarray));  
			  
			  
			  
		  }
		
		String maxrec=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_ATP_SUBSCRIPTION_JOB_MAX_RECORDS);
		String instId=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_ATP_SUBSCRIPTION_INSTANCE_ID);
	
		
		
			
		
			
				
		
		data.setPi_max_rows(Long.parseLong(maxrec));
		data.setPi_instance_id(instId);
		
		
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
	
	
	
	public ArrayList<BulkAtpSubsCursorData> fetchDataFromDb(BulkAtpSubsData domaindata) throws SMFAgentException
	{
		ArrayList<BulkAtpSubsCursorData> cursordate=null;
		
		logger.info("Data Sending to DB "+domaindata.toString());
		ServiceUtils._executeStoredProcedure("pro_get_bulkatp_upload_dtls", domaindata, domaindata);
		
		
		if(domaindata.getPo_error_code()==0)
		{
			cursordate=new ArrayList<BulkAtpSubsCursorData>();
			
			cursordate=domaindata.getPo_subscription_dtls();
			
		}
		
		
		return cursordate;
	}
	
	
	
	public void spanThreads(ArrayList<BulkAtpSubsCursorData> cursordata)
	{
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		CountDownLatch latch = null;
		int size=cursordata.size();
		
		ThreadPoolExecutor taskExecutor;
		
		String maxThreadsStr =InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_ATP_SUBSCRIPTION_JOB_MAX_THREADS);
		int maxThreads = 5;
		
		if(maxThreadsStr != null){
			try {
				maxThreads = Integer.parseInt( maxThreadsStr );
				
				
			} catch(Exception e) {
				if (logger.isDebugEnabled())
					logger.debug("Exception while parsing property BULK_ATP_SUBSCRIPTION_JOB_MAX_THREADS. so taking default value 5" );
			}
		} else {
			if (logger.isDebugEnabled())
				logger.debug("Property BULK_ATP_SUBSCRIPTION_JOB_MAX_THREADS is null. so taking default value 5 ");
		}
		logger.info("cursorData Size "+size);
		logger.info("Spanning threads with max thread count "+maxThreads);
		long startTimeTotal = System.currentTimeMillis();
		taskExecutor= new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
		latch = new CountDownLatch(size);
		
		
			 
		
		for(BulkAtpSubsCursorData curData:cursordata)
		{
			logger.info("sending cursor data to processor "+curData.toString());
			
			
			taskExecutor.execute(new BulkAtpSubsProcessor(latch, curData) );
			
			
		
			
			
			
		}
		try {

			if(latch != null)
				latch.await();
		} catch (InterruptedException e) {

			logger.error("Excepion in await()"+Utilities.getStackTrace(e));
		}
		taskExecutor.shutdown();
		while (!taskExecutor.isTerminated()) {

		}
		latch = null;
		taskExecutor = null;
		logger.info("BulkAtpsubsJob iteration finished ----------------------------");

		
		
		
	}

	public Integer[] StringToInt(String[] nwIds)
	{
		int size=nwIds.length;
		Integer[] intAry=new Integer[size];
		for(int iter=0;iter<size;iter++)
		{
			if(!Utilities.isNull(nwIds[iter]))
			intAry[iter]=Integer.parseInt(nwIds[iter]);
			
		}
		
		
		return intAry;
	}
	
}
