/******************************************************************
 * Company XIUS (Megasoft Pvt Ltd Hyderabad,INDIA)
 * � Copyright 2006 MEGASOFT. 
 *
 * Package      : com.xius.smf.job;
 * Name of File : BulkRCSubscriptionJob.java
 * Date /Year   : 1/08/2018
 * Author       : Sambasiva Rao Aakula
 * Discription  : This Job Will Subscribe Bulk  RC
 * Method names : 
 * Modifications:
 * Method Name  |  Date   |  Author  | Explanation
 * -------------------------------------------------------------              
 *              |         |          |
 *              |         |          | 
 *             
 ********************************************************************/

package com.xius.smf.job;

import java.util.ArrayList;
import java.util.List;
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

import com.xius.smf.domaindata.BulkRCSubscriptionCursorData;
import com.xius.smf.domaindata.BulkRCSubscriptionData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class BulkRCSubscriptionJob implements Job, StatefulJob {
	private	 static final Logger logger = LogManager.getLogger(BulkRCSubscriptionJob.class.getSimpleName());
	private static String networkIdList = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_RC_SUBSCRIPTION_EXTERNAL_NW_ID);
	private static String maxrec = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_RC_SUBSCRIPTION_JOB_MAX_RECORDS);
	private static String instId = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_RC_SUBSCRIPTION_INSTANCE_ID);
	private static String[] networkIdArray = null;

	public void execute(JobExecutionContext context)throws JobExecutionException {
		BulkRCSubscriptionData data = null;
		List<BulkRCSubscriptionCursorData> cursordData=null;
		try {
			do {
				data=new BulkRCSubscriptionData();
				if (logger.isInfoEnabled())
					logger.info("Configured networkIds in Property File are ==>"+ networkIdList);
				/*if (!Utilities.isNull(networkIdList)) {
					networkIdArray = networkIdList.split(",");
					data.setNetwork_id(Utilities.StringToInt(networkIdArray));
				}*/
				if (logger.isInfoEnabled())
				if (!Utilities.isNull(networkIdList)) {
					if(networkIdList.contains(",")){
						networkIdArray = networkIdList.split(",");
						data.setNetwork_id(Utilities.StringToInt(networkIdArray));
					}
					else{
						Integer[] intAry = {Integer.parseInt(networkIdList)};
						data.setNetwork_id(intAry);
					}
				}
				
				data.setPi_max_rows(Long.parseLong(maxrec));
				data.setPi_instance_id(instId);
				cursordData = fetchDataFromDb(data);
				if (cursordData.size()>0) {
					  spanThreads(cursordData);
				 } else {
					   logger.info("  CursorData is empty   ");
					  break;
					
				}
			} while (true);
			
		} catch (SMFAgentException e) {
			       logger.error("Error While Getting Data From DB.");
			       e.printStackTrace();
		}

	}
	
	public ArrayList<BulkRCSubscriptionCursorData> fetchDataFromDb(BulkRCSubscriptionData domaindata) throws SMFAgentException {
		ArrayList<BulkRCSubscriptionCursorData> cursorData=new ArrayList<BulkRCSubscriptionCursorData>();

		if(logger.isInfoEnabled())
		   logger.info("Data Sending to DB " + domaindata.toString());
		    ServiceUtils._executeStoredProcedure("pro_get_topup_msisdns_detls",	domaindata, domaindata);
		if (domaindata.getPo_error_code() == 0) {
			cursorData = new ArrayList<BulkRCSubscriptionCursorData>();
			cursorData = domaindata.getPo_topup_dtls();
		}
		return cursorData;
	}
	
	
	public void spanThreads(List<BulkRCSubscriptionCursorData> cursordData) {
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		CountDownLatch latch = null;
		int size = cursordData.size();
		ThreadPoolExecutor taskExecutor;
		String maxThreadsStr = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_RC_SUBSCRIPTION_JOB_MAX_THREADS);
		int maxThreads = 5;

		if (maxThreadsStr != null) {
			try {
				maxThreads = Integer.parseInt(maxThreadsStr);

			} catch (Exception e) {
				if (logger.isDebugEnabled())
					logger.debug("Exception while parsing property BULK_ATP_SUBSCRIPTION_JOB_MAX_THREADS. so taking default value 5");
			}
		} else {
			if (logger.isDebugEnabled())
				logger.debug("Property BULK_ATP_SUBSCRIPTION_JOB_MAX_THREADS is null. so taking default value 5 ");
		}
		if (logger.isDebugEnabled()){
			  logger.info("cursorData Size " + size);
			   logger.info("Spanning threads with max thread count " + maxThreads);
		}
		long startTimeTotal = System.currentTimeMillis();
		taskExecutor = new ThreadPoolExecutor(maxThreads, maxThreads, 100000,TimeUnit.SECONDS, queue);
		latch = new CountDownLatch(size);
		for (BulkRCSubscriptionCursorData curData : cursordData) {
			logger.info("sending cursor data to processor "+ curData.toString());
			  taskExecutor.execute(new BulkRCSubscriptionProcessor(latch, curData));
		}
		try {
			         if (latch != null)
			          	latch.await();
		} catch (InterruptedException e) {
			logger.error("Excepion in await()" + Utilities.getStackTrace(e));
		}
		latch = null;
		logger.info("Total Time Taken To Complete Job is :======> :  "+ startTimeTotal);

		logger.info("********** BulkRCSubscriptionJob iteration finished ************");

	}

}
