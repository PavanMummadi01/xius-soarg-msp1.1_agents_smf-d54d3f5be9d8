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

import com.xius.smf.domaindata.RetryFromSMFCursorData;
import com.xius.smf.domaindata.RetryFromSMFJobData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.StateChangeConfig;
import com.xius.smf.utils.Utilities;

public class RetryFromSMFJob implements Job,StatefulJob {
	private static final Logger logger = LogManager.getLogger(RetryFromSMFJob.class.getSimpleName());

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		
		ArrayList<RetryFromSMFCursorData> cursordata=null;	
		String[] nwIds=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.RETRY_FROM_SMF_EXTERNAL_NW_ID).split(",");
		String[] actIds=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.RETRY_FROM_SMF_ACTIVITY_ID).split(",");
		Integer[] nwId=StringToInt(nwIds);
		Integer[] actId=StringToInt(actIds);
		String instanceId=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.RETRY_FROM_SMF_INSTANCE_ID);
		Long maxrec=Long.parseLong(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.RETRY_FROM_SMF_JOB_MAX_RECORDS));
		RetryFromSMFJobData data=new RetryFromSMFJobData();
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
	
	public ArrayList<RetryFromSMFCursorData> fetchDataFromDb(RetryFromSMFJobData domaindata) throws SMFAgentException
	{
		ArrayList<RetryFromSMFCursorData> cursordate=null;
		
		logger.info("Data Sending to DB "+domaindata.toString());
		ServiceUtils._executeStoredProcedure("pro_msisdn_imsi_statchng_retry", domaindata, domaindata);
		
		
		if(domaindata.getPo_error_code()==0)
		{
			cursordate=new ArrayList<RetryFromSMFCursorData>();
			
			cursordate=domaindata.getCursor_data();
			
		}
		
		
		return cursordate;
	}
	
	
	
	
	public void spanThreads(ArrayList<RetryFromSMFCursorData> cursordata)
	{
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		CountDownLatch latch = null;
		int size=cursordata.size();
		
		ThreadPoolExecutor taskExecutor;
		
		String maxThreadsStr =InitiateAll.getSMFProps().getProperty(SMFAgentConstants.RETRY_FROM_SMF_JOB_MAX_THREADS);
		int maxThreads = 5;
		
		if(maxThreadsStr != null){
			try {
				maxThreads = Integer.parseInt( maxThreadsStr );
				
				
			} catch(Exception e) {
				if (logger.isDebugEnabled())
					logger.debug("Exception while parsing property RETRY_FROM_SMF_JOB_MAX_THREADS. so taking default value 5" );
			}
		} else {
			if (logger.isDebugEnabled())
				logger.debug("Property RETRY_FROM_SMF_JOB_MAX_THREADS is null. so taking default value 5 ");
		}
		logger.info("cursorData Size "+size);
		logger.info("Spanning threads with max thread count "+maxThreads);
		long startTimeTotal = System.currentTimeMillis();
		taskExecutor= new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
		latch = new CountDownLatch(size);
		
		
			 
		
		for(RetryFromSMFCursorData curData:cursordata)
		{
			logger.info("sending cursor data to processor "+curData.toString());
			
			
			String activityId=curData.getActivityId();
			
			if((activityId.equalsIgnoreCase(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.STATE_CHANGE_ACTIVATE))) || 
					(activityId.equalsIgnoreCase(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.STATE_CHANGE_DEACTIVATE))) ||
					(activityId.equalsIgnoreCase(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.STATE_CHANGE_SUSPEND))))
			{

				String suspendStatus=StateChangeConfig.getSuspOldStatus(curData.getNetwork_id().toString());
				logger.info("suspendStatus from property file "+suspendStatus);
				String activeStatus=StateChangeConfig.getActOldStatus(curData.getNetwork_id().toString());
				logger.info("activeStatus from property file "+activeStatus);
				
			if(curData.getOld_state().equalsIgnoreCase(activeStatus) && 
				curData.getNew_state().equalsIgnoreCase(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.ACTIVATENEWSTATUS)))
			{
				taskExecutor.execute(new ActSubRetryFrmSMFProcessor(latch, curData) );
			}
			
			else if(curData.getOld_state().equalsIgnoreCase(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SUSPENDOLDSTATUS)) && 
					curData.getNew_state().equalsIgnoreCase(suspendStatus))
			{
				taskExecutor.execute(new SuspSubRetryFrmSMFProcessor(latch, curData) );
			}
			
			else if(curData.getNew_state().equalsIgnoreCase(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DEACTNEWSTATUS)))
			{
				taskExecutor.execute(new DActSubRetryFrmSMFProcessor(latch, curData) );
			}
			else
			{
				latch.countDown();
			}
			
			}
			
			if(containsActivityId(curData.getActivityId()))
			{
				taskExecutor.execute(new ChngeMsisdnFrmSMFRetryProcessor(latch, curData));
				
			}
			
			else if(curData.getActivityId().equalsIgnoreCase(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SIM_SWAP_ACTIVITY_ID)))
			{
				taskExecutor.execute(new SimSwapFrmSMFRetryProcessor(latch, curData));
				
			}
			
			else if(curData.getActivityId().equalsIgnoreCase(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.CHANGE_TECHNOLOGY_ACTIVITY_ID)))
			{
				taskExecutor.execute(new ChngTechFrmSMFRetryProcessor(latch, curData));
				
			}
			
			
			else if((curData.getActivityId().equalsIgnoreCase(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.ROAMING_ACTIVATE_ACTIVITY_ID)))||
				(curData.getActivityId().equalsIgnoreCase(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.ROAMING_DEACTIVATE_ACTIVITY_ID)))	)
			{
				taskExecutor.execute(new RoamingRtryFrmSMFProcessor(latch, curData));
				
			}
			else
			{
				latch.countDown();
			}
			
			
			
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
		logger.info("RetryFromSMFJob iteration finished ----------------------------");

		
		
		
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
	
	
	
	public boolean containsActivityId(String actID)
	{
		String[] activityId=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.CHANGE_MSISDN_ACTIVITY_ID).split(",");
		boolean value=false;
		for(int iter=0;iter<activityId.length;iter++)
		{
			if(actID.equalsIgnoreCase(activityId[iter]))
			{
			value=true;
			break;
			}
		}
	return 	value;
	}

}
