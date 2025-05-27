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

import com.xius.smf.domaindata.ThresholdLimitCurData;
import com.xius.smf.domaindata.ThresholdLimitJobData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class ThresholdLimitJob implements Job,StatefulJob {

	
	private static final Logger logger = LogManager.getLogger(ThresholdLimitJob.class.getSimpleName());

	
	public void execute(JobExecutionContext arg0) throws JobExecutionException {

		
		ArrayList<ThresholdLimitCurData> cursordata=null;
		
		
		
		ThresholdLimitJobData data=new ThresholdLimitJobData();
		
		
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
	
	
	
	public ArrayList<ThresholdLimitCurData> fetchDataFromDb(ThresholdLimitJobData domaindata) throws SMFAgentException
	{
		ArrayList<ThresholdLimitCurData> cursordate=null;
		
		logger.info("Data Sending to DB "+domaindata.toString());
		ServiceUtils._executeStoredProcedure("pro_free_msisdn_threshold_job", domaindata, domaindata);
		
		
		if(domaindata.getPo_error_code()==0)
		{
			cursordate=new ArrayList<ThresholdLimitCurData>();
			
			cursordate=domaindata.getPo_pool_percentage_dtls();
			
		}
		
		
		return cursordate;
	}
	
	
	public void spanThreads(ArrayList<ThresholdLimitCurData> cursordata)
	{
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		CountDownLatch latch = null;
		int size=cursordata.size();
		
		ThreadPoolExecutor taskExecutor;
		
		String maxThreadsStr =InitiateAll.getSMFProps().getProperty(SMFAgentConstants.THRESHOLD_LIMIT_MONITORING_JOB_MAX_THREADS);
		int maxThreads = 5;
		
		if(maxThreadsStr != null){
			try {
				maxThreads = Integer.parseInt( maxThreadsStr );
				
				
			} catch(Exception e) {
				if (logger.isDebugEnabled())
					logger.debug("Exception while parsing property THRESHOLD_LIMIT_MONITORING_JOB_MAX_THREADS. so taking default value 5" );
			}
		} else {
			if (logger.isDebugEnabled())
				logger.debug("Property THRESHOLD_LIMIT_MONITORING_JOB_MAX_THREADS is null. so taking default value 5 ");
		}
		logger.info("cursorData Size "+size);
		logger.info("Spanning threads with max thread count "+maxThreads);
		long startTimeTotal = System.currentTimeMillis();
		taskExecutor= new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
		latch = new CountDownLatch(size);
		
		
			 
		
		for(ThresholdLimitCurData curData:cursordata)
		{
			//1:S#Y,E#N$2:S#N,E#Y
			logger.info("sending cursor data to processor "+curData.toString());
			
			if( curData.getPi_limit_reached_yn().equalsIgnoreCase("Y"))
			{
			
			String emailSmsNotifFlag = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.EmailSmsNotifFlag);
			String getNetworkId = curData.getPi_network_id().toString();
			//1:S#Y,E#N@2:S#N,E#Y
			String[] smsEmailarr = emailSmsNotifFlag.split("@");
			String value = null;
			String[] getSmsYNFlag= null,getEmailYNFlag=null;
			for (String string : smsEmailarr) {
				String[] ar = string.split(":");
				if (ar[0].equals(getNetworkId)) {
					value = ar[1];
					//S#Y,E#N
					String arr[] = value.split(",");
					String k = arr[0];
					getSmsYNFlag = k.split("#");
					String d = arr[1];
					getEmailYNFlag=d.split("#");
					break;
				}
			}
			if(getSmsYNFlag[1].equalsIgnoreCase("Y")){
				taskExecutor.execute(new ThresholdLimitSmsProcessor(latch, curData) );
			}if(getEmailYNFlag[1].equalsIgnoreCase("Y")) {
				taskExecutor.execute(new ThresholdLimitEmailProcessor(latch, curData) );
			}
			}
			else {
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
		logger.info("ThresholdLimitJob iteration finished ----------------------------");

		
		
		
	}

	
}
