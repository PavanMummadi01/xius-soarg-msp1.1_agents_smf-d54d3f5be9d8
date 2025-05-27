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


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.xius.smf.domaindata.ScheduleTopUpActs;
import com.xius.smf.job.task.ScheduleCUGDebitTask;
import com.xius.smf.job.task.ScheduleCUGTopUpTask;

/**
File Name:ScheduleCUGDebitJob.java
Description:This class is used as scheduler for pooling db continuously for Schedule CUG TopUp.
@Author : naveen.dasyam
@Created Date : Nov 16, 2012
@Modified By:
@Modified Date:
@Modifications:
@Reason for Modification
 */
public class ScheduleCUGDebitJob implements Job {
	
	private static final Logger logger = LogManager.getLogger(ScheduleCUGDebitJob.class.getSimpleName());

	/* (non-Javadoc)
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
	 */
	public void execute(JobExecutionContext arg0) throws JobExecutionException {

		Long startTime  = System.currentTimeMillis();

		if(logger.isDebugEnabled()) {
			logger.debug("--- Executing Schedule CUG Debit job ---");
		}

		do {
			ScheduleTopUpActs scheduleCUGDebitdata = ScheduleCUGDebitTask.callDBToGetScheduleGroupActs();

			if( null != scheduleCUGDebitdata && 
					scheduleCUGDebitdata.getGroupTopupActs() != null &&
					scheduleCUGDebitdata.getGroupTopupActs().size() > 0) {
				logger.info( "Number of CUG schedule debit GroupActs(parent msisdns) found : " + 
						scheduleCUGDebitdata.getGroupTopupActs().size() );

				/*ScheduleTopUpActs scheduleDebitRespData = ScheduleCUGDebitTask.doScheduleCUGDebitActs(scheduleCUGTopUpdata);

					//Update the Success and (or) failure list of Parent MSISNDs Debit to Database
					ScheduleCUGDebitTask.callDBToUpdateMsisdnsDebitStatus(scheduleDebitRespData);*/
				scheduleCUGDebitdata = ScheduleCUGDebitTask.executeScheduleCUGJobForParentDebits(scheduleCUGDebitdata,null);

				//Do SpecialTop for all Childs of Success Parent's Debit
				ScheduleTopUpActs scheduleCUGTopUpdata = ScheduleCUGTopUpTask.executeSchedCUGJobForParentChilds(scheduleCUGDebitdata);

			} else {
				logger.info( "*** *** *** Found No CUG schedule debit GroupActs(parent msisdns)");
				break;
			}
		} while(true); // This provide appropriate condition
		logger.info("Completed Schedule CUG Debit job"+(int) (System.currentTimeMillis() - startTime)+" ms");
	}// end of method execute()
	
}