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

import com.xius.smf.domaindata.PaytmTxStatusRetryCursorData;
import com.xius.smf.domaindata.PaytmTxStatusRetryData;
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
 * Name of File : PaytmTxStatusRetryJob.java
 * Date /Year   : May 28, 2018
 * Author       : Aditya Thumma
 * Discription  :   
 * 				  
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



public class PaytmTxStatusRetryJob implements Job,StatefulJob {
	
	private static final Logger logger = LogManager.getLogger(PaytmTxStatusRetryJob.class.getSimpleName());

	
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
	ArrayList<PaytmTxStatusRetryCursorData> cursordata=null;	
	/*String[] nwIds=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.PAYTM_TX_STATUS_RETRY_EXTERNAL_NW_ID).split(",");
	
	Integer[] nwId=StringToInt(nwIds);*/
	
	String nwIds=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.PAYTM_TX_STATUS_RETRY_EXTERNAL_NW_ID);
	
	Integer nwId=Integer.parseInt(nwIds);
	
	String instanceId=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.PAYTM_TX_STATUS_RETRY_INSTANCE_ID);
	Long maxrec=Long.parseLong(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.PAYTM_TX_STATUS_RETRY_JOB_MAX_RECORDS));
	PaytmTxStatusRetryData data=new PaytmTxStatusRetryData();
		data.setNetwork_id(nwId);
		data.setPi_instance_id(instanceId);
		data.setPi_max_records(maxrec);
	
	
	try {
		cursordata=fetchDataFromDb(data);
		
		
		if(cursordata!=null && cursordata.size()>0)
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
	
	public void spanThreads(ArrayList<PaytmTxStatusRetryCursorData> cursordata)
	{
		
		CountDownLatch latch = null;
		int size=cursordata.size();
		
		ThreadPoolExecutor taskExecutor;
		
		String maxThreadsStr =InitiateAll.getSMFProps().getProperty(SMFAgentConstants.PAYTM_TX_STATUS_RETRY_JOB_MAX_THREADS);
		int maxThreads = 5;
		
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(size+100);
		
		
		if(maxThreadsStr != null){
			try {
				maxThreads = Integer.parseInt( maxThreadsStr );
				
				
			} catch(Exception e) {
				if (logger.isDebugEnabled())
					logger.debug("Exception while parsing property PAYTM_TX_STATUS_RETRY_JOB_MAX_THREADS. so taking default value 5" );
			}
		} else {
			if (logger.isDebugEnabled())
				logger.debug("Property PAYTM_TX_STATUS_RETRY_JOB_MAX_THREADS is null. so taking default value 5 ");
		}
		logger.info("cursorData Size "+size);
		logger.info("Spanning threads with max thread count "+maxThreads);
		long startTimeTotal = System.currentTimeMillis();
		taskExecutor= new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
		latch = new CountDownLatch(size);
		
			 
			 
		
		for(PaytmTxStatusRetryCursorData curData:cursordata)
		{
			logger.info("sending cursor data to processor "+curData.toString());
			
			taskExecutor.execute(new PaytmTxStatusRetryProcessor(latch,curData));
			
		}
		try {

			if(latch != null)
				latch.await();
		} catch (InterruptedException e) {

			logger.error("Excepion in await()"+Utilities.getStackTrace(e));
		}
		latch = null;
		taskExecutor.shutdown();
		while (!taskExecutor.isTerminated()) {

		}
		latch = null;
		taskExecutor = null;	
		
		
		logger.info("PaytmTxStatusRetryJob iteration finished ----------------------------");

		
		
		
	}
	public ArrayList<PaytmTxStatusRetryCursorData> fetchDataFromDb(PaytmTxStatusRetryData domaindata) throws SMFAgentException
	{
		ArrayList<PaytmTxStatusRetryCursorData> cursordate=null;
		
		logger.info("Data Sending to DB "+domaindata.toString());
		ServiceUtils._executeStoredProcedure("pro_payment_retry", domaindata, domaindata);
		
		
		if(domaindata.getPo_error_code()==0)
		{
			cursordate=new ArrayList<PaytmTxStatusRetryCursorData>();
			
			cursordate=domaindata.getPo_transaction_details();
			
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