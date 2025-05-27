/**
 * Copyright   2012 XIUS.
 * All rights reserved. These computer programs, listings, and
 * specifications are the property of XIUS.
 * And may not be copied, stored, used or transmitted, in
 * whole or in part, in any for or by any means, without the
 * prior written permission of XIUS.
 *
 */


/**
 * 	@company	XIUS (Megasoft Pvt Ltd Hyderabad,INDIA)
 *	@package	com.xius.smf.job
 * 	@author		SaiRajesh.g
 *	@Date		Jan 29, 2014,4:32:54 PM
*/

package com.xius.smf.job;

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

import com.xius.smf.utils.Utilities;
import com.xius.smf.domaindata.HLRCursorData;
import com.xius.smf.domaindata.HLRData;
import com.xius.smf.job.task.ScheduleHLRTask;
import com.xius.smf.job.task.ScheduleHLRThread;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;

public class HLRJob implements Job,StatefulJob{
	
	 static final Logger logger = LogManager.getLogger("HLRJob");

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		Long startTime  = System.currentTimeMillis();

		if(logger.isDebugEnabled()) {
			logger.debug("--- Executing HLR job ---");
		}

		do {
			HLRData hlrData = ScheduleHLRTask.callDBToGetSchedule();
			
			if( null != hlrData && hlrData.getCursor() != null && hlrData.getCursor().size() > 0) {
				logger.info( "Number of HLR records  found : " + hlrData.getCursor().size() );
				procressHlrData(hlrData);
			} else {
				logger.info( "*** *** *** No HLR Records Found ");
				break;
			}
		} while(true); // This provide appropriate condition
		logger.info("Completed HLR job"+(int) (System.currentTimeMillis() - startTime)+" ms");
		
	}

	/**
	 * @param hlrData
	 */
	private void procressHlrData(HLRData hlrData) {
		
		long startTimeTotal = System.currentTimeMillis();
		
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		CountDownLatch latch = null;
		ThreadPoolExecutor tpExecutor;
		String maxThreadsStr = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.HLR_MAX_THREADS) ;
		int maxThreads = 5;
		
		if(maxThreadsStr != null){
			try {
				maxThreads = Integer.parseInt( maxThreadsStr );
			} catch(Exception e) {
				if (logger.isDebugEnabled())
					logger.debug("Exception while parsing property HLR_MAX_THREADS in pool. so taking default value 5" );
			}
		} else {
			if (logger.isDebugEnabled())
				logger.debug("Property HLR_MAX_THREADS in pool is null. so taking default value 5 ");
		}
			
		ScheduleHLRThread hlrThread = null;
		tpExecutor = new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
		latch = new CountDownLatch(hlrData.getCursor().size());
		
		for(HLRCursorData data : hlrData.getCursor()){
			hlrThread = new ScheduleHLRThread(data, latch);
			tpExecutor.execute(hlrThread);
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
		tpExecutor = null;
		long totalTime = System.currentTimeMillis() - startTimeTotal;
		if (logger.isDebugEnabled())
			logger.debug( "<<<### ### ###>>>Total Time taken for Processing HLR JOB (Count: "+ hlrData.getCursor().size() +") : " + totalTime );
	}
}
