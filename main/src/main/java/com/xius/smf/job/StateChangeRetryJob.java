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

import com.xius.smf.domaindata.StateChangeRetryCursorData;
import com.xius.smf.domaindata.StateChangeRetryData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class StateChangeRetryJob implements Job,StatefulJob{
	private static final Logger logger = LogManager.getLogger(StateChangeRetryJob.class.getSimpleName());

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
	

		
		ArrayList<StateChangeRetryCursorData> cursordata=null;	
		String[] nwIds=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.STATECHANGE_EXTERNAL_NW_ID).split(",");
		
		Integer[] nwId=StringToInt(nwIds);
		
		String instanceId=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.STATECHANGE_INSTANCE_ID);
		Long maxrec=Long.parseLong(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.STATECHANGE_RETRY_JOB_MAX_RECORDS));
		StateChangeRetryData data=new StateChangeRetryData();
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
			
			e.printStackTrace();
		}
		
		
	}
	
	public ArrayList<StateChangeRetryCursorData> fetchDataFromDb(StateChangeRetryData domaindata) throws SMFAgentException
	{
		ArrayList<StateChangeRetryCursorData> cursordate=null;
		
		logger.info("Data Sending to DB "+domaindata.toString());
		ServiceUtils._executeStoredProcedure("pro_state_change_retry_job", domaindata, domaindata);
		
		
		if(domaindata.getPo_error_code()==0)
		{
			cursordate=new ArrayList<StateChangeRetryCursorData>();
			
			cursordate=domaindata.getPo_state_chng_dets_ref();
			
		}
		
		
		return cursordate;
	}
	public void spanThreads(ArrayList<StateChangeRetryCursorData> cursordata)
	{
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		CountDownLatch latch = null;
		int size=cursordata.size();
		
		ThreadPoolExecutor taskExecutor;
		
		String maxThreadsStr =InitiateAll.getSMFProps().getProperty(SMFAgentConstants.STATECHANGE_RETRY_JOB_MAX_THREADS);
		int maxThreads = 5;
		
		if(maxThreadsStr != null){
			try {
				maxThreads = Integer.parseInt( maxThreadsStr );
				
				
			} catch(Exception e) {
				if (logger.isDebugEnabled())
					logger.debug("Exception while parsing property STATECHANGE_RETRY_JOB_MAX_THREADS. so taking default value 5" );
			}
		} else {
			if (logger.isDebugEnabled())
				logger.debug("Property STATECHANGE_RETRY_JOB_MAX_THREADS is null. so taking default value 5 ");
		}
		logger.info("cursorData Size "+size);
		logger.info("Spanning threads with max thread count "+maxThreads);
		long startTimeTotal = System.currentTimeMillis();
		taskExecutor= new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
		latch = new CountDownLatch(size);
		
		
			 
		
		for(StateChangeRetryCursorData curData:cursordata)
		{
			logger.info("sending cursor data to processor "+curData.toString());
			
			if(curData.getOld_state().equalsIgnoreCase(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.ACTIVATEOLDSTATUS)) && curData.getNew_state().equalsIgnoreCase(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.ACTIVATENEWSTATUS)))
			taskExecutor.execute(new ActivateSubscriberRetryProcessor(latch, curData) );
			
			if(curData.getOld_state().equalsIgnoreCase(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SUSPENDOLDSTATUS)) && curData.getNew_state().equalsIgnoreCase(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SUSPENDNEWSTATUS)))
				taskExecutor.execute(new SuspendSubscriberRetryProcessor(latch, curData) );
			
			if(curData.getNew_state().equalsIgnoreCase(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DEACTNEWSTATUS)))
				taskExecutor.execute(new DeActivateSubscriberRetryProcessor(latch, curData) );
			
		}
		try {

			if(latch != null)
				latch.await();
		} catch (InterruptedException e) {

			logger.error("Excepion in await()"+Utilities.getStackTrace(e));
		}
		latch = null;
		logger.info("StateChangeRetryJob iteration finished ----------------------------");

		
		
		
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
