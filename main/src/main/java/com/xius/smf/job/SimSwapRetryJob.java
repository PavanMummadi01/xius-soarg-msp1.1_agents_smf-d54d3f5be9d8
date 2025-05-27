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
import com.xius.smf.domaindata.SimSwapRetryCursorData;
import com.xius.smf.domaindata.SimSwapRetryData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

/******************************************************************
 * Company XIUS (Megasoft Pvt Ltd Hyderabad,INDIA)
 * � Copyright 2006 MEGASOFT. 
 *
 * Package      : com.xius.smf.job;
 * Name of File : SimSwapRetryJob.java
 * Date /Year   : Dec 22, 2016
 * Author       : Aditya Thumma
 * Discription  : Based on the number of cursor count eligible for SimSwap  
 * 				  spans thread for each cursor
 * 
 *
 * Method names : 
 * 
 * Modifications
 * Method Name  |  Date   |  Author  | Explanation
 * -------------------------------------------------------------              
 *              |         |          |
 *              |         |          | 
 *             
 ********************************************************************/ 

public class SimSwapRetryJob implements Job,StatefulJob {
	private static final Logger logger = LogManager.getLogger(SimSwapRetryJob.class.getSimpleName());

	
	public void execute(JobExecutionContext arg0) throws JobExecutionException {

	ArrayList<SimSwapRetryCursorData> cursordata=null;
String[] nwIds=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SIMSWAP_EXTERNAL_NW_ID).split(",");
	
	Integer[] nwId=StringToInt(nwIds);
	
	String instanceId=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SIMSWAP_INSTANCE_ID);
	Long maxrec=Long.parseLong(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SIMSWAP_RETRY_JOB_MAX_RECORDS));
		
	
		SimSwapRetryData data=new SimSwapRetryData();
		data.setNetwork_id(nwId);
		data.setPi_instance_id(instanceId);
		data.setPi_max_records(maxrec);
	
		
		
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public void spanThreads(ArrayList<SimSwapRetryCursorData> cursordata)
	{
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		CountDownLatch latch = null;
		int size=cursordata.size();
		
		ThreadPoolExecutor taskExecutor;
		
		String maxThreadsStr =InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SIMSWAP_RETRY_JOB_MAX_THREADS);
		int maxThreads = 5;
		
		if(maxThreadsStr != null){
			try {
				maxThreads = Integer.parseInt( maxThreadsStr );
				
				
			} catch(Exception e) {
				if (logger.isDebugEnabled())
					logger.debug("Exception while parsing property SIMSWAP_RETRY_JOB_MAX_THREADS. so taking default value 5" );
			}
		} else {
			if (logger.isDebugEnabled())
				logger.debug("Property SIMSWAP_RETRY_JOB_MAX_THREADS is null. so taking default value 5 ");
		}
		logger.info("cursorData Size "+size);
		logger.info("Spanning threads with max thread count "+maxThreads);
		long startTimeTotal = System.currentTimeMillis();
		taskExecutor= new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
		latch = new CountDownLatch(size);
		
		
		
		for(SimSwapRetryCursorData curData:cursordata)
		{
			logger.info("sending cursor data to processor "+curData.toString());
			/*if(curData.getNotification_flag().equalsIgnoreCase("Y"))
			{
				
				
			}
			else*/
			taskExecutor.execute(new SimSwapRetryProcessor(latch,curData));
			
		}
		try {

			if(latch != null)
				latch.await();
		} catch (InterruptedException e) {

			logger.error("Excepion in await()"+Utilities.getStackTrace(e));
		}
		latch = null;
		logger.info("SimSwapRetry iteration finished ----------------------------");

		
		
		
	}
	public ArrayList<SimSwapRetryCursorData> fetchDataFromDb(SimSwapRetryData domaindata) throws SMFAgentException
	{
		ArrayList<SimSwapRetryCursorData> cursordate=null;
		
		logger.info("Data Sending to DB "+domaindata.toString());
		ServiceUtils._executeStoredProcedure("pro_sim_swap_retry_job", domaindata, domaindata);
		
		
		if(domaindata.getPo_error_code()==0)
		{
			cursordate=new ArrayList<SimSwapRetryCursorData>();
			
			cursordate=domaindata.getPo_simswap_dets_ref();
			
		}
		
		
		return cursordate;
	}

	public Integer[] StringToInt(String[] nwIds)
	{
		int size=nwIds.length;
		Integer[] intAry=new Integer[size];
		for(int iter=0;iter<size;iter++)
		{
			
			intAry[iter]=Integer.parseInt(nwIds[iter]);
			
		}
		
		
		return intAry;
	}
	
}
