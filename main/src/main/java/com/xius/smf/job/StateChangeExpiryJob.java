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

import com.xius.smf.domaindata.StateChangeExpiryData;
import com.xius.smf.domaindata.StateChangeExpiryPrimCursorData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class StateChangeExpiryJob implements Job,StatefulJob {
	private static final Logger logger = LogManager.getLogger(StateChangeExpiryJob.class.getSimpleName());

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		

		
		ArrayList<StateChangeExpiryPrimCursorData> cursordata=null;
		//ArrayList<StateChangeExpiryNpCursorData> nprimcursordata=new ArrayList<StateChangeExpiryNpCursorData>();
		
		String[] nwId=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.STATECHANGE_EXPIRY_EXTERNAL_NW_ID).split(",");
		
		String[] toStatus=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.STATECHANGE_EXPIRY_TO_STATUS).split(",");
		String instanceId=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.STATECHANGE_EXPIRY_INSTANCE_ID);
		
		StateChangeExpiryData data=new StateChangeExpiryData();
		data.setNetwork_id(nwId);
		data.setPi_to_status(toStatus);
		data.setPi_instance_id(instanceId);
		data.setPi_max_rows(Long.parseLong(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.STATECHANGE_EXPIRY_JOB_MAX_RECORDS)));
		
		try {
			//primcursordata=fetchDataFromDb(data);
			
			logger.info("Data Sending to DB "+data.toString());
			ServiceUtils._executeStoredProcedure("pro_extcard_info_on_acct_exp", data, data);
			
			
			if(data.getPo_error_code()==0)
			{
				cursordata=new ArrayList<StateChangeExpiryPrimCursorData>();
				
				cursordata=data.getPo_prim_msisdn_details();
				
				/*nprimcursordata=new ArrayList<StateChangeExpiryNpCursorData>();
				nprimcursordata=data.getPo_non_prim_msisdn_details();
				*/
			}
			
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
	
	/*public ArrayList<StateChangeExpiryPrimCursorData> fetchDataFromDb(StateChangeExpiryData domaindata) throws SMFAgentException
	{
		ArrayList<StateChangeExpiryPrimCursorData> cursordate=null;
		
		logger.info("Data Sending to DB "+domaindata.toString());
		ServiceUtils._executeStoredProcedure("pro_hlr_statechange_expiry_job", domaindata, domaindata);
		
		
		if(domaindata.getPo_error_code()==0)
		{
			cursordate=new ArrayList<StateChangeExpiryPrimCursorData>();
			
			cursordate=domaindata.getPo_prim_msisdn_details();
			
			nprimcursordata=new ArrayList<StateChangeExpiryNpCursorData>();
			nprimcursordata=domaindata.getPo_non_prim_msisdn_details();
			
		}
		
		
		return cursordate;
	}*/
	public void spanThreads(ArrayList<StateChangeExpiryPrimCursorData> cursordata)
	{
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		CountDownLatch latch = null;
		//int nPrimsize=nprimcursordata.size();
		int Primsize=cursordata.size();
		ThreadPoolExecutor taskExecutor;
		
		String maxThreadsStr =InitiateAll.getSMFProps().getProperty(SMFAgentConstants.STATECHANGE_EXPIRY_JOB_MAX_THREADS);
		int maxThreads = 5;
		
		if(maxThreadsStr != null){
			try {
				maxThreads = Integer.parseInt( maxThreadsStr );
				
				
			} catch(Exception e) {
				if (logger.isDebugEnabled())
					logger.debug("Exception while parsing property STATECHANGE_EXPIRY_JOB_MAX_THREADS. so taking default value 5" );
			}
		} else {
			if (logger.isDebugEnabled())
				logger.debug("Property STATECHANGE_EXPIRY_JOB_MAX_THREADS is null. so taking default value 5 ");
		}
		logger.info("cursorData Size "+Primsize);
		logger.info("Spanning threads with max thread count "+maxThreads);
		long startTimeTotal = System.currentTimeMillis();
		taskExecutor= new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
		latch = new CountDownLatch(Primsize);
			 
		
		for(StateChangeExpiryPrimCursorData curData:cursordata)
		{
			logger.info("sending cursor data to processor "+curData.toString());
			if(curData.getIsPrimary().equalsIgnoreCase("Y"))
			taskExecutor.execute(new ModifyPrincipalMSISDN(latch, curData));
			
			if(curData.getIsPrimary().equalsIgnoreCase("N"))
			taskExecutor.execute(new DeleteMSISDNProcressor(latch, curData));
			
		}
		
	
		
		/*for(int iter=0;iter<Primsize;iter++)
		{
			StateChangeExpiryPrimCursorData curdataMod=primcursordata.get(iter);
			StateChangeExpiryPrimCursorData curdataDel=primcursordata.get(iter+1);
			
			logger.info("sending cursor data to processor Modify data "+curdataMod.toString());
			logger.info("sending cursor data to processor Delete data "+curdataDel.toString());
			
			taskExecutor.execute(new ModifyPrincipalMSISDN(latch, curdataDel,curdataMod));
		}*/
		try {

			if(latch != null)
				latch.await();
		} catch (InterruptedException e) {

			logger.error("Excepion in await()"+Utilities.getStackTrace(e));
		}
		latch = null;
		logger.info("StateChangeExpiryJob iteration finished ----------------------------");

		
		
		
	}

}
