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

import com.xius.smf.domaindata.TopUpData;
import com.xius.smf.domaindata.UsageThresholdLimitCursorData;
import com.xius.smf.domaindata.UsageThresholdLimitData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class UsageThresholdLimitNotifyJob implements Job,StatefulJob {

	
	
	private static final Logger logger = LogManager.getLogger(UsageThresholdLimitNotifyJob.class.getSimpleName());

	public void execute(JobExecutionContext arg0) throws JobExecutionException {

		
		ArrayList<UsageThresholdLimitCursorData> cursordata=null;
		
		
		
		UsageThresholdLimitData data=new UsageThresholdLimitData();
		
		
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
	
	
	
	public ArrayList<UsageThresholdLimitCursorData> fetchDataFromDb(UsageThresholdLimitData domaindata) throws SMFAgentException
	{
		ArrayList<UsageThresholdLimitCursorData> cursordate=null;
		Long intMaxRecords =null;
		String maxRecords = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.USAGE_THRESHOLD_LIMITS_NOTIFY_JOB_MAX_RECORDS );
		String networkID = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.USAGE_THRESHOLD_LIMITS_NOTIFY_JOB_EXTERNAL_NW_ID );
	
		if(Utilities.isNotEmpty(maxRecords)) {
			 intMaxRecords =new Long(maxRecords).longValue();
		}
		
		domaindata.setPi_flag("GET");
		domaindata.setPi_max_records(intMaxRecords);
		domaindata.setPi_network_id(Long.parseLong(networkID));
	
		logger.info("Data Sending to DB "+domaindata.toString());
		ServiceUtils._executeStoredProcedure("pro_nw_avg_threshold_notif_mng", domaindata, domaindata);
		
		
		if(domaindata.getPo_error_code()==0)
		{
			cursordate=new ArrayList<UsageThresholdLimitCursorData>();
			
			cursordate=domaindata.getPo_threshold_notif_dtls();
			
		}
		
		
		return cursordate;
	}
	
	
	public void spanThreads(ArrayList<UsageThresholdLimitCursorData> cursordata)
	{
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		CountDownLatch latch = null;
		int size=cursordata.size();
		
		ThreadPoolExecutor taskExecutor;
		
		String maxThreadsStr =InitiateAll.getSMFProps().getProperty(SMFAgentConstants.USAGE_THRESHOLD_LIMITS_NOTIFY_JOB_MAX_THREADS);
		int maxThreads = 5;
		
		if(maxThreadsStr != null){
			try {
				maxThreads = Integer.parseInt( maxThreadsStr );
				
				
			} catch(Exception e) {
				if (logger.isDebugEnabled())
					logger.debug("Exception while parsing property USAGE_THRESHOLD_LIMITS_NOTIFY_JOB_MAX_THREADS. so taking default value 5" );
			}
		} else {
			if (logger.isDebugEnabled())
				logger.debug("Property USAGE_THRESHOLD_LIMITS_NOTIFY_JOB_MAX_THREADS is null. so taking default value 5 ");
		}
		logger.info("cursorData Size "+size);
		logger.info("Spanning threads with max thread count "+maxThreads);
		long startTimeTotal = System.currentTimeMillis();
		taskExecutor= new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
		latch = new CountDownLatch(size);
		
		
			 
		
		for(UsageThresholdLimitCursorData curData:cursordata)
		{
			//1:S#Y,E#N$2:S#N,E#Y
			logger.info("sending cursor data to processor "+curData.toString());
			
			if( curData.getPeriod().equalsIgnoreCase(InitiateAll.getSMFProps().getProperty("D")))
			{
			
			String DemailSmsNotifFlag = InitiateAll.getSMFProps().getProperty("DailyEmailSmsNotifyFlag");
			String DDestMsisdns = InitiateAll.getSMFProps().getProperty("DailyDestMsisdns");
			String DSmsEventID = InitiateAll.getSMFProps().getProperty("DailySmsEventID");
			String  DEmailEventID= InitiateAll.getSMFProps().getProperty("DailyEmailEventID");
			String  DEmailsToList= InitiateAll.getSMFProps().getProperty("DailyEmailToNir");
			String  DEmailsFromList= InitiateAll.getSMFProps().getProperty("DailyEmailFromNir");
			String getNetworkId = curData.getPi_network_id().toString();
			//1:S#Y,E#N@2:S#N,E#Y
			String[] smsEmailarr = DemailSmsNotifFlag.split("@");
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
				taskExecutor.execute(new UsageThresholdLimitSMSProcessor(latch, curData,DDestMsisdns,DSmsEventID) );
			}if(getEmailYNFlag[1].equalsIgnoreCase("Y")) {
				taskExecutor.execute(new UsageThresholdLimitEmailProcessor(latch, curData,DEmailsToList,DEmailsFromList,DEmailEventID) );
			}
			}else
			if( curData.getPeriod().equalsIgnoreCase(InitiateAll.getSMFProps().getProperty("W")))
			{
			
			String  WemailSmsNotifFlag = InitiateAll.getSMFProps().getProperty("WeeklyEmailSmsNotifyFlag");
			String  WDestMsisdns = InitiateAll.getSMFProps().getProperty("WeeklyDestMsisdns");
			String  WSmsEventID = InitiateAll.getSMFProps().getProperty("WeeklySmsEventID");
			String  WEmailEventID= InitiateAll.getSMFProps().getProperty("WeeklyEmailEventID");
			String  WEmailsToList= InitiateAll.getSMFProps().getProperty("WeeklyEmailToNir");
			String  WEmailsFromList= InitiateAll.getSMFProps().getProperty("WeeklyEmailFromNir");
			String  getNetworkId = curData.getPi_network_id().toString();
			//1:S#Y,E#N@2:S#N,E#Y
			String[] smsEmailarr = WemailSmsNotifFlag.split("@");
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
				taskExecutor.execute(new UsageThresholdLimitSMSProcessor(latch, curData,WDestMsisdns,WSmsEventID) );
			}if(getEmailYNFlag[1].equalsIgnoreCase("Y")) {
				taskExecutor.execute(new UsageThresholdLimitEmailProcessor(latch, curData,WEmailsToList,WEmailsFromList,WEmailEventID) );
			}
			}else
			if( curData.getPeriod().equalsIgnoreCase(InitiateAll.getSMFProps().getProperty("M")))
			{
			String  MemailSmsNotifFlag = InitiateAll.getSMFProps().getProperty("MonthlyEmailSmsNotifyFlag");
			String  MDestMsisdns = InitiateAll.getSMFProps().getProperty("MonthlyDestMsisdns");
			String  MSmsEventID = InitiateAll.getSMFProps().getProperty("MonthlySmsEventID");
			String  MEmailEventID= InitiateAll.getSMFProps().getProperty("MonthlyEmailEventID");
			String  MEmailsToList= InitiateAll.getSMFProps().getProperty("MonthlyEmailToNir");
			String  MEmailsFromList= InitiateAll.getSMFProps().getProperty("MonthlyEmailFromNir");
			String getNetworkId = curData.getPi_network_id().toString();
			//1:S#Y,E#N@2:S#N,E#Y
			String[] smsEmailarr = MemailSmsNotifFlag.split("@");
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
				taskExecutor.execute(new UsageThresholdLimitSMSProcessor(latch, curData,MDestMsisdns,MSmsEventID) );
			}if(getEmailYNFlag[1].equalsIgnoreCase("Y")) {
				taskExecutor.execute(new UsageThresholdLimitEmailProcessor(latch, curData,MEmailsToList,MEmailsFromList,MEmailEventID) );
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
