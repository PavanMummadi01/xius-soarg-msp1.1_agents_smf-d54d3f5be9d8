/**
 * Copyright   2006 New Wireless Services, Inc.
 * All rights reserved. These computer programs, listings, and
 * specifications are the property of New Wireless Services,
 * Inc. and may not be copied, stored, used or transmitted, in
 * whole or in part, in any for or by any means, without the
 * prior written permission of New Wireless Services, Inc.
 *
 */
package com.xius.smf.job;

import java.math.BigDecimal;
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

import com.xius.smf.domaindata.BalNotificationData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.job.task.ScheduleBalNotifThread;
import com.xius.smf.scoket.TCPClient;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

/**
File Name:BalNotificationJob.java
Description:This class is used as scheduler for pooling db continuously for getting notificatins data.
@Author : srikanthm
@Created Date : Jul 28, 2011
@Modified By:
@Modified Date:
@Modifications:
@Reason for Modification
 */
public class BalNotificationJob implements Job,StatefulJob {
	 static  Logger logger = LogManager.getLogger("BalNotificationJob");

	/* (non-Javadoc)
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
	 */
	public void execute(JobExecutionContext arg0) throws JobExecutionException {

		Long startTime  = System.currentTimeMillis();
		BalNotificationData balData 			= null;

		logger.debug("--- Low Balance Notificaiton job executed ---");

		try {

			String USSDNotifFlag = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.USSD_NOTIFICATION );
			/**
			 * checking whether USSD notification required or not
			 */
			if(USSDNotifFlag.equals("1")){
				/**
				 * calling USSD Gateway
				 */
				String respStr = new TCPClient().socketCommunication("<?xml version=\"1.0\" encoding=\"UTF-8\"?><FnFSMSRequest><AccountID>12121</AccountID><MSISDN>99898947</MSISDN><ProvisionType>F</ProvisionType><ActionType>A</ActionType><NumberList><number>99898946</number><number>99898948</number></NumberList><LoginID>devuser</LoginID><NetworkID>369</NetworkID></FnFSMSRequest>");
				logger.debug("Response from USSD Gatway-----"+respStr);
			}

			//			calling DB to get data
			balData = callDBforNotifications();
			if( null != balData && null != balData.getMSISDN() && balData.getMSISDN().length > 0) {
				logger.info( "Number of Low Balance Notification records  found : " + balData.getMSISDN().length );
				processBalNotif(balData);
			} else 
				logger.info( "*** *** *** No Low Balance Notification records Found ");
				logger.info("Completed Low Balance Notificaiton job"+(int) (System.currentTimeMillis() - startTime)+" ms");

		} catch (Exception e) {
			logger.error("Exception in execute() :"+Utilities.getStackTrace(e));
		} finally {
			balData = null;
		}

		logger.info( "--- Low Balance Notificaiton job completed ---");
	}// end of method execute()

	
	/**
	 * This method is used to call database procedure for getting the 
	 * notification data
	 * @return
	 */
	private BalNotificationData callDBforNotifications() {

		//just for safety adding this
		Long networkID = 1L;
		Long mFetch = 1000L;
		String networkId = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.NETWORKID_PROP );
		String consumerType = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.CONSUMER_TYPE );
		String maxFetch = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.LOW_BAL_NOTIF_MAX_RECORDS) ;
		BalNotificationData balData = new BalNotificationData();
		/**
		 * Setting the input
		 */
		balData.setPi_source(SMFAgentConstants.SOURCE_NOTIFICAITON);
		if( Utilities.isNull( consumerType )== false ) {

			balData.setPi_consumer_type(consumerType);
		} else {

			logger.debug( "Default Consumer Type (A) selected");
			balData.setPi_consumer_type( SMFAgentConstants.CONSUMER_TYPE );
		}

		if(Utilities.isNull(networkId) == false ) {

			balData.setPi_network_id(new Long(networkId));
		} else {
			logger.error("No netwrok id found taking default value 1");
			balData.setPi_network_id(networkID);
		}
		
		if(Utilities.isNull(maxFetch) == false ) {

			balData.setPi_record_limit(new Long(maxFetch));
		} else {
			logger.error("max records fetch count not found, taking default value 1000");
			balData.setPi_record_limit(mFetch);
		}

		try {
			/**
			 * calling db proc using mosf
			 */
			ServiceUtils._executeStoredProcedure("pro_ams_balance_notification", balData, balData);

		} catch (SMFAgentException e) {
			logger.error("Exception in callDBforNotifications \n"+Utilities.getStackTrace(e));
		}

		return balData;
	} // end of method callDBforNotifications()


	/**
	 * 
	 * @param ArrayList<BalanceNotificationE>
	 * @param String[]
	 */
	
	private void processBalNotif(BalNotificationData balData) {
		long startTimeTotal = System.currentTimeMillis();
		
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		CountDownLatch latch = null;
		ThreadPoolExecutor tpExecutor;
		String maxThreadsStr = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.LOW_BAL_NOTIF_MAX_THREADS) ;
		int maxThreads = 5;
		
		if(maxThreadsStr != null){
			try {
				maxThreads = Integer.parseInt( maxThreadsStr );
			} catch(Exception e) {
					logger.error("Exception while parsing property LOW_BAL_NOTIF_MAX_THREADS in pool. so taking default value 5" );
			}
		} else {
				logger.debug("Property LOW_BAL_NOTIF_MAX_THREADS in pool is null. so taking default value 5 ");
		}
		ScheduleBalNotifThread balNotifThread = null;
		tpExecutor = new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
		latch = new CountDownLatch(balData.getMSISDN().length);
		
		int msisdnArrLen 	 = 0;
		int actNbrArrLen 	 = 0;
		int balArrLen 		 = 0;
		int balDateArrLen 	 = 0;
		int balExpArrLen 	 = 0;
		int acctStatusArrLen = 0;
		int acctTypeArrLen 	 = 0;

		String[] balDateArr 	= balData.getBalanceDatetime();
		String[] balExpArr 		= balData.getBalanceExpiryDatetime();
		String[] acctStatusArr 	= balData.getAccountStatus();
		String[] acctTypeArr 	= balData.getAccountType();
		BigDecimal[] msisdnArr 	= balData.getMSISDN();
		BigDecimal[] actNbrArr	= balData.getAccountNumber();
		BigDecimal[] balArr 	= balData.getBalanceAmount();
		String tranIDArr[] = balData.getTransactionID();

		if(msisdnArr!= null && msisdnArr.length > 0)
			msisdnArrLen = msisdnArr.length;

		if(actNbrArr!= null)
			actNbrArrLen = actNbrArr.length;

		if(balArr!= null)
			balArrLen = balArr.length;

		if(balDateArr!= null)
			balDateArrLen = balDateArr.length;

		if(balExpArr!= null)
			balExpArrLen = balExpArr.length;

		if(acctStatusArr!= null)
			acctStatusArrLen = acctStatusArr.length;

		if(acctTypeArr!= null)
			acctTypeArrLen = acctTypeArr.length;

		if(acctTypeArr!= null)
			acctTypeArrLen = acctTypeArr.length;
		
		logger.info( (new StringBuilder()).append("MSISDNs size for Low Balance Notification : ").append(msisdnArrLen).toString());
		

		if(msisdnArrLen > 0)
		{
			if((msisdnArrLen == actNbrArrLen) && 
					(actNbrArrLen == balArrLen)  &&
					(balArrLen == balDateArrLen) &&
					(balDateArrLen == balExpArrLen) &&
					(balExpArrLen == acctStatusArrLen) &&
					(acctStatusArrLen == acctTypeArrLen)) {

				logger.debug("got data from database for balance notificaiton.Length:"+msisdnArrLen);

			 
				for(int i=0;i<msisdnArrLen ; i++) {						 

					//balNotifThread = new ScheduleBalNotifThread(balE, latch, tranIDArr[i]);			
					balNotifThread = new ScheduleBalNotifThread (latch, tranIDArr[i],actNbrArr[i].toString(),msisdnArr[i].toString(),
							balDateArr[i] , balExpArr[i],balArr[i],acctTypeArr[i], acctStatusArr[i]);
					tpExecutor.execute(balNotifThread);
				}// End of for loop
			}
			else
				logger.error("Inconsistent data from database for balance notificaiton");
		}
		else
			logger.error("Found no data from database for balance notificaiton");
		
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
		long totalTime = ((System.currentTimeMillis() - startTimeTotal)/1000);
		logger.info( "<<<### ### ###>>>Total Time taken for Processing BalNotificationJob (Count: "+ balData.getMSISDN().length +") in seconds: " + totalTime );
		balData = null;
		balDateArr 	= null;
		balExpArr 	= null;
		acctStatusArr 	= null;
		acctTypeArr 	= null;
		msisdnArr 	= null;
		actNbrArr	= null;
		balArr 	= null;
		tranIDArr = null;
	}
}