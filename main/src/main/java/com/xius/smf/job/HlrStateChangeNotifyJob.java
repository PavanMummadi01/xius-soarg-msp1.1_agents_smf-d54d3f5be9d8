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

import com.xius.smf.domaindata.HlrStateChgNotifData;
import com.xius.smf.domaindata.HlrStateChngCurData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.StateChangeConfig;
import com.xius.smf.utils.Utilities;

public class HlrStateChangeNotifyJob implements Job,StatefulJob {
	private static final Logger logger = LogManager.getLogger(HlrStateChangeNotifyJob.class.getSimpleName());

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		
		ArrayList<HlrStateChngCurData> cursordata=null;
		

		
		String[] nwId=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.EXTERNAL_NW_ID).split(",");
		
		String[] toStatus=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.TO_STATUS).split(",");
		String instanceId=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.INSTANCE_ID);
		
		
		String considersmftransaction=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.CONSIDER_SMF_TRANSACTTION);
		logger.info("THE SWITCH___________"+considersmftransaction);
		boolean considersmftransactionflag=false;
		
		if(considersmftransaction.equalsIgnoreCase("ON")){
			
		considersmftransactionflag=true;
		logger.info("The smf transaction switch  is"+considersmftransactionflag);
		}
		
			try {
			
				HlrStateChgNotifData data=new HlrStateChgNotifData();
				data.setNetwork_id(nwId);
				data.setPi_to_status(toStatus);
				data.setPi_instance_id(instanceId);
				data.setPi_max_rows(Long.parseLong(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.HLR_STATECHANGE_NOTIFY_JOB_MAX_RECORDS)));
				
				
				cursordata=fetchDataFromDb(data);
				
				if(cursordata!=null)
				{
						spanThreads(cursordata,considersmftransactionflag);
					
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
	
	
		
	
	public ArrayList<HlrStateChngCurData> fetchDataFromDb(HlrStateChgNotifData domaindata) throws SMFAgentException
	{
		ArrayList<HlrStateChngCurData> cursordate=null;
		
		logger.info("Data Sending to DB "+domaindata.toString());
		ServiceUtils._executeStoredProcedure("pro_hlr_statechange_notif_job", domaindata, domaindata);
		
		
		if(domaindata.getPo_error_code()==0)
		{
			cursordate=new ArrayList<HlrStateChngCurData>();
			
			cursordate=domaindata.getPo_trans_details();
			
		}
		
		
		return cursordate;
	}
	
	public void spanThreads(ArrayList<HlrStateChngCurData> cursordata,boolean Considersmftransactionflag)
	{
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		CountDownLatch latch = null;
		int size=cursordata.size();
		
		ThreadPoolExecutor taskExecutor;
		
		String maxThreadsStr =InitiateAll.getSMFProps().getProperty(SMFAgentConstants.HLR_STATECHANGE_NOTIFY_JOB_MAX_THREADS);
		int maxThreads = 5;
		
		if(maxThreadsStr != null){
			try {
				maxThreads = Integer.parseInt( maxThreadsStr );
				
				
			} catch(Exception e) {
				if (logger.isDebugEnabled())
					logger.debug("Exception while parsing property HLR_STATECHANGE_NOTIFY_JOB_MAX_THREADS. so taking default value 5" );
			}
		} else {
			if (logger.isDebugEnabled())
				logger.debug("Property HLR_STATECHANGE_NOTIFY_JOB_MAX_THREADS is null. so taking default value 5 ");
		}
		logger.info("cursorData Size "+size);
		logger.info("Spanning threads with max thread count "+maxThreads);
		long startTimeTotal = System.currentTimeMillis();
		taskExecutor= new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
		latch = new CountDownLatch(size);
		
		//String url=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.TIA_URL);
		
		
			//logger.info("::: Hitting to TIA_URL with :::"+url);
			 
			 
		
		for(HlrStateChngCurData curData:cursordata)
		{
			logger.info("sending cursor data to processor "+curData.toString());
			// calling smf for data insertion
			String suspendStatus=StateChangeConfig.getSuspOldStatus(curData.getNetwork_id().toString());
			logger.info("suspendStatus from property file "+suspendStatus);
			String activeStatus=StateChangeConfig.getActOldStatus(curData.getNetwork_id().toString());
			logger.info("activeStatus from property file "+activeStatus);
			
			if(curData.getOld_state().equalsIgnoreCase(activeStatus) && 
			curData.getNew_state().equalsIgnoreCase(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.ACTIVATENEWSTATUS)))
			{
				taskExecutor.execute(new ActivateSubscriberProcessor(latch, curData,Considersmftransactionflag) );
			}
			
			else if(curData.getOld_state().equalsIgnoreCase(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SUSPENDOLDSTATUS)) && 
			curData.getNew_state().equalsIgnoreCase(suspendStatus))
				{
				taskExecutor.execute(new SuspendSubscriberProcessor(latch, curData,Considersmftransactionflag) );
				}
			
			else if(curData.getNew_state().equalsIgnoreCase(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DEACTNEWSTATUS)))
				{
				taskExecutor.execute(new DeActivateSubscriberProcessor(latch, curData,Considersmftransactionflag) );
				}
			
			else
			{
				latch.countDown();	
			}
			
			
			logger.info("in for loop "+this.getClass().getName());
		}
		logger.info("after for loop "+this.getClass().getName());
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
		logger.info("Hlrstatechange iteration finished ----------------------------");

		
		
		
	}

}
