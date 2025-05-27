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

import com.xius.smf.domaindata.GetBulkDebitDetailsData;
import com.xius.smf.domaindata.GetBulkDebitDtlsCursorData;
import com.xius.smf.domaindata.GetBulkDebitTransCursorData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class BulkDebitJob implements Job,StatefulJob {
	private	 static final Logger logger = LogManager.getLogger(BulkDebitJob.class.getSimpleName());

	


	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		
		GetBulkDebitDetailsData  data=new GetBulkDebitDetailsData();
		ArrayList<GetBulkDebitDtlsCursorData> cursordata=null;
       
//       Integer[]  externalnwIdlistarray=null;
		String[] externalnwIdliststrarray=null;
        String nwIdSplit=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_DEBIT_EXTERNAL_NW_ID);
		  if(!Utilities.isNull(nwIdSplit)){
				
			  // StringTokenizer st = new StringTokenizer(nwIdSplit,",");  
			  externalnwIdliststrarray=nwIdSplit.split(",");
			  data.setNetwork_id(StringToInt(externalnwIdliststrarray));  
			  
			  
			  
		  }
		
		String maxrec=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_DEBIT_JOB_MAX_RECORDS);
		String instId=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_DEBIT_INSTANCE_ID);
	
		
		
			
		
			
				
		
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
	
	
	
	public ArrayList<GetBulkDebitDtlsCursorData> fetchDataFromDb(GetBulkDebitDetailsData domaindata) throws SMFAgentException
	{
		ArrayList<GetBulkDebitDtlsCursorData> cursordate=null;
		
		logger.info("Data Sending to DB "+domaindata.toString());
		ServiceUtils._executeStoredProcedure("pro_get_subs_debit_upld_dtls", domaindata, domaindata);
		if(domaindata.getPo_error_code()==0)
		{
			cursordate=new ArrayList<GetBulkDebitDtlsCursorData>();
			
			cursordate=domaindata.getPo_subs_debit_dtls();
			
		}
			return cursordate;
	}
	
	
	
	public void spanThreads(ArrayList<GetBulkDebitDtlsCursorData> cursordata)
	{
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		CountDownLatch latch = null;
		int size=cursordata.size();
		
		ThreadPoolExecutor taskExecutor;
		
		String maxThreadsStr =InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_DEBIT_JOB_MAX_THREADS);
		int maxThreads = 5;
		
		if(maxThreadsStr != null){
			try {
				maxThreads = Integer.parseInt( maxThreadsStr );
				
				
			} catch(Exception e) {
				if (logger.isDebugEnabled())
					logger.debug("Exception while parsing property BULK_DEBIT_JOB_MAX_THREADS. so taking default value 5" );
			}
		} else {
			if (logger.isDebugEnabled())
				logger.debug("Property BULK_DEBIT_JOB_MAX_THREADS is null. so taking default value 5 ");
		}
		logger.info("cursorData Size "+size);
		logger.info("Spanning threads with max thread count "+maxThreads);
		long startTimeTotal = System.currentTimeMillis();
		taskExecutor= new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
		latch = new CountDownLatch(size);
		
		
			 
		
		for(GetBulkDebitDtlsCursorData curData:cursordata)
		{
			logger.info("sending cursor data to processor "+curData.toString());
			
			
			taskExecutor.execute(new BulkDebitProcessor(latch, curData) );
			
			
		
			
			
			
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
		logger.info("BulkCreditJob iteration finished ----------------------------");

		
		
		
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
