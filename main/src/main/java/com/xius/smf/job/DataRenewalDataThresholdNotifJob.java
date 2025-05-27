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

import com.xius.smf.domaindata.DataRenewalDataThresholdCursorData;
import com.xius.smf.domaindata.DataRenewalDataThresholdData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.job.task.DataRenewalDataThresholdThread;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class DataRenewalDataThresholdNotifJob implements Job,StatefulJob{
	private	 static final Logger logger = LogManager.getLogger("DataRenewalDataThresholdNotifJob");

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		Long startTime  = System.currentTimeMillis();

		if(logger.isDebugEnabled()) {
			logger.debug("--- Executing DataRenewalDataThresholdNotifJob ---");
		}
		//do{
		DataRenewalDataThresholdData dataRenewalDataThresholdData  = callDBToGetRecords();
			if( null != dataRenewalDataThresholdData && dataRenewalDataThresholdData.getCursor() != null && dataRenewalDataThresholdData.getCursor().size() > 0) {
				logger.info( "Number of DataRenewalDataThresholdNotif records  found : " + dataRenewalDataThresholdData.getCursor().size() );
				procressTopupData(dataRenewalDataThresholdData);
			} else {
				logger.info( "*** *** *** No DataRenewalDataThresholdNotif Records Found ");
				//break;
			}
		//}while(true);
			logger.info("Completed DataRenewalDataThresholdNotifJob"+(int) (System.currentTimeMillis() - startTime)+" ms");
	}
	
	/**
	 * DB Call to fetch records for processing
	 * @return
	 */
	
	public DataRenewalDataThresholdData callDBToGetRecords(){
		long intMaxRecords = 10;
		String maxRecords = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.DATA_RENEWAL_DATA_THRESHOLD_MAX_RECORDS );
		DataRenewalDataThresholdData domainData = new DataRenewalDataThresholdData();
		if(Utilities.isNotEmpty(maxRecords)) {
			intMaxRecords =new Long(maxRecords).longValue();
		}
		String networkId = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.NETWORKID_PROP);
		domainData.setPi_network_id(new Long(networkId));
		domainData.setPi_maxRecords(intMaxRecords);
		domainData.setPi_app_id(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.APP_ID_PROP));
		SPFactory factory =null;
		
		try {
			factory = ServiceUtils.executeSPWithOutCommit("pro_get_lac_sac_notif_info", domainData, domainData);
			Utilities.commitOrRollback(factory, domainData.getPo_error_code());
			if(logger.isInfoEnabled()) {
				logger.info( "Error Code in pro_get_lac_sac_notif_info==>"+domainData.getPo_error_code());
				logger.info( "Error MESSEGE in pro_get_lac_sac_notif_info==>"+domainData.getPo_error_desc());
				logger.info( "CURSOR LIST SIZE==>"+domainData.getCursor().size());
			}
		} catch (SMFAgentException e) {
			logger.error( "Exception in pro_get_lac_sac_notif_info \n"+Utilities.getStackTrace(e));
		}
		
		return domainData;
	}
	
	/**
	 * 
	 * @param topUpData
	 */

	private void procressTopupData(DataRenewalDataThresholdData dataRenewalDataThresholdData) {
		long startTimeTotal = System.currentTimeMillis();
		
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		CountDownLatch latch = null;
		ThreadPoolExecutor tpExecutor;
		String maxThreadsStr = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_RENEWAL_DATA_THRESHOLD_MAX_THREADS) ;
		int maxThreads = 5;
		
		if(maxThreadsStr != null){
			try {
				maxThreads = Integer.parseInt( maxThreadsStr );
			} catch(Exception e) {
				if (logger.isDebugEnabled())
					logger.debug("Exception while parsing property DATA_RENEWAL_DATA_THRESHOLD_MAX_THREADS in pool. so taking default value 5" );
			}
		} else {
			if (logger.isDebugEnabled())
				logger.debug("Property DATA_RENEWAL_DATA_THRESHOLD_MAX_THREADS in pool is null. so taking default value 5 ");
		}
		DataRenewalDataThresholdThread renewalDataThresholdThread = null;
		tpExecutor = new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
		latch = new CountDownLatch(dataRenewalDataThresholdData.getCursor().size());
		
		for(DataRenewalDataThresholdCursorData data : dataRenewalDataThresholdData.getCursor()){
			renewalDataThresholdThread = new DataRenewalDataThresholdThread(data, latch);
			tpExecutor.execute(renewalDataThresholdThread);
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
			logger.debug( "<<<### ### ###>>>Total Time taken for Processing DataRenewalDataThresholdNotifJob (Count: "+ dataRenewalDataThresholdData.getCursor().size() +") : " + totalTime );
	}
}