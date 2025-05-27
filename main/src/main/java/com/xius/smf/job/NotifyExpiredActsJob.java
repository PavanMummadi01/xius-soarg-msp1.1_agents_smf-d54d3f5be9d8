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
 * ${todo}
 * @author srikanthm $Author: kiranmai.kode $
 * @version $Id: //depot/xb/MSP1.0/MSP-AWS/agents/smf/main/src/main/java/com/xius/smf/job/NotifyExpiredActsJob.java#2 $ 
 * $DateTime: 2023/12/08 12:29:41 $Change:  $
 */

package com.xius.smf.job;

import java.math.BigDecimal;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.xius.smf.domaindata.GetExpiredActsData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.scoket.DCCSClient;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;


public class NotifyExpiredActsJob implements Job{
	private static final Logger logger = LogManager.getLogger(NotifyExpiredActsJob.class.getSimpleName());

	final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
	private ThreadPoolExecutor executor;

	public void execute(JobExecutionContext arg0) throws JobExecutionException {

		BigDecimal[] expiredMsisdns = callDBforExpiredActs();

		if( null != expiredMsisdns && expiredMsisdns.length > 0 ) {

			logger.info( "No. of msisdns to be expired found : " + expiredMsisdns.length );

			executor = new ThreadPoolExecutor(10, 10, 100000, TimeUnit.SECONDS, queue);
			exeUsingThreadPoolExecutor( expiredMsisdns );
		} else {

			logger.info( "*** *** *** Found No msisdns to be expired to notify DCCS");
		}
	}

	private void exeUsingThreadPoolExecutor(BigDecimal[] expiredMsisdns){

		try {

			long startTimeTotal = System.currentTimeMillis();
			executor = new ThreadPoolExecutor(10, 10, 100000, TimeUnit.SECONDS, queue);
			DCCSClient worker = null;

			for( int i = 0; i < expiredMsisdns.length; i++ ) {

				if( null != expiredMsisdns[i] ) {

					worker = new DCCSClient( expiredMsisdns[i].toString() );
					worker.setLocalTcpIpConfig( InitiateAll.tcpIpConfig );
					executor.execute(worker);
				}
			}

			// This will make the executor accept no new threads
			// and finish all existing threads in the queue
			executor.shutdown();
			// Wait until all threads are finish
			while (!executor.isTerminated()) {

			}

			long totalTime = System.currentTimeMillis() - startTimeTotal;
			logger.info( "<<<### ### ###>>>Total Time taken for sending expiredMsisdns to DCCS in (secons) : " + (totalTime/1000));
		} catch (Exception e) {

			logger.error( Utilities.getStackTrace( e ) );
		} finally {

			logger.info("*** NotifyExpiredActsJob is job compleeted... Shout Downing ThreadPool");
			executor.shutdown();

			logger.info("*** Making executor null intentionally");
			executor = null;
		}
	} 

	/**
	 * This method is used to call database procedure for getting the expired accounts 
	 * 
	 * @return
	 */
	private BigDecimal[] callDBforExpiredActs() {

		//just for safety adding this
		Long networkID = 1L;
		String networkId = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.NETWORKID_PROP );
		GetExpiredActsData domainData = new GetExpiredActsData();

		if(Utilities.isNull(networkId) == false)
			networkID = new Long(networkId).longValue();

		/**
		 * Setting the input
		 */
		domainData.setPi_network_id(networkID);

		try {
			/**
			 * calling db proc using mosf
			 */
			ServiceUtils._executeStoredProcedure("get_exp_msisdns", domainData, domainData);
			
			if(logger.isInfoEnabled()) {

				logger.info( "Error Code in get_exp_msisdns==>"+domainData.getPo_error_code());
			}

		} catch (SMFAgentException e) {
			logger.error( "Exception in callDBforExpiredActs \n"+Utilities.getStackTrace(e));
		}

		return domainData.getPo_expired_msisdns();
	} // end of method callDBforExpiredActs()
}

