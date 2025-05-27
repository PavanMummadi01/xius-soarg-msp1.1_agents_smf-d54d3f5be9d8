package com.xius.smf.job;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;

import com.xius.smf.domaindata.TopUpCursorData;
import com.xius.smf.domaindata.TopUpData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.job.task.ScheduleTopUpThread;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class TopUpNotifJob implements Job,StatefulJob{
	private static final Logger logger = LogManager.getLogger(TopUpNotifJob.class.getSimpleName());

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		Long startTime  = System.currentTimeMillis();

		if(logger.isDebugEnabled()) {
			logger.debug("--- Executing TopUpNotifJob ---");
		}
		//do{
			TopUpData topupdata = callDBToGetRecords();
			if( null != topupdata && topupdata.getCursor() != null && topupdata.getCursor().size() > 0) {
				logger.info( "Number of TopUp records  found : " + topupdata.getCursor().size() );
				procressTopupData(topupdata);
			} else {
				logger.info( "*** *** *** No TopUp Records Found ");
				//break;
			}
		//}while(true);
			logger.info("ompleted TopUpNotifJob"+(int) (System.currentTimeMillis() - startTime)+" ms");
	}
	
	/**
	 * DB Call to fetch records for processing
	 * @return
	 */
	
	public TopUpData callDBToGetRecords(){
		long intMaxRecords = 10;
		String maxRecords = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.TOPUP_NOTIF_MAX_RECORDS );
		TopUpData domainData = new TopUpData();
		if(Utilities.isNotEmpty(maxRecords)) {
			intMaxRecords =new Long(maxRecords).longValue();
		}
		String networkId = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.NETWORKID_PROP);
		domainData.setPi_network_id(new Long(networkId));
		domainData.setPi_maxRecords(intMaxRecords);
		domainData.setPi_app_id(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.APP_ID_PROP));
		domainData.setSourceType(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.EVENT_TYPE_NOTIF));
		SPFactory factory =null;
		
		try {
			factory = ServiceUtils.executeSPWithOutCommit("pro_get_topup_notifi_schd", domainData, domainData);
			Utilities.commitOrRollback(factory, domainData.getPo_error_code());
			if(logger.isInfoEnabled()) {
				logger.info( "Error Code in pro_get_topup_notifi_schd==>"+domainData.getPo_error_code());
				logger.info( "Error MESSEGE in pro_get_topup_notifi_schd==>"+domainData.getPo_error_desc());
				logger.info("CURSOR LIST SIZE==>"+domainData.getCursor().size());
			}
		} catch (SMFAgentException e) {
			logger.error( "Exception in pro_get_topup_notifi_schd \n"+Utilities.getStackTrace(e));
		}
		
		return domainData;
	}
	
	/**
	 * 
	 * @param topUpData
	 */
	
	private void procressTopupData(TopUpData topUpData) {
		long startTimeTotal = System.currentTimeMillis();
		
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		CountDownLatch latch = null;
		ThreadPoolExecutor tpExecutor;
		String maxThreadsStr = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.TOPUP_NOTIF_MAX_THREADS) ;
		int maxThreads = 5;
		
		if(maxThreadsStr != null){
			try {
				maxThreads = Integer.parseInt( maxThreadsStr );
			} catch(Exception e) {
				if (logger.isDebugEnabled())
					logger.debug("Exception while parsing property TOPUP_NOTIF_MAX_THREADS in pool. so taking default value 5" );
			}
		} else {
			if (logger.isDebugEnabled())
				logger.debug("Property TOPUP_NOTIF_MAX_THREADS in pool is null. so taking default value 5 ");
		}
		ScheduleTopUpThread topupThread = null;
		tpExecutor = new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
		latch = new CountDownLatch(topUpData.getCursor().size());
		
		for(TopUpCursorData data : topUpData.getCursor()){
			topupThread = new ScheduleTopUpThread(data, latch);
			tpExecutor.execute(topupThread);
		}
		
		try {

			if(latch != null)
				latch.await();
		} catch (InterruptedException e) {
			logger.error("Excepion in await()"+Utilities.getStackTrace(e));
		}
		tpExecutor.shutdown();
		while (!tpExecutor.isTerminated()) {

		}
		latch = null;
		tpExecutor = null;		
		long totalTime = System.currentTimeMillis() - startTimeTotal;
		if (logger.isDebugEnabled())
			logger.debug( "<<<### ### ###>>>Total Time taken for Processing TopUpNotifJob (Count: "+ topUpData.getCursor().size() +") : " + totalTime );
	}
}
