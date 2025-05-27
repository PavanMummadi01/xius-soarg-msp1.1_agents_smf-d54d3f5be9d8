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
import com.xius.smf.job.task.ScheduleCUGTopUpTask;

/**
File Name:ScheduleCUGTopUpJob.java
Description:This class is used as scheduler for pooling db continuously for Schedule CUG TopUp.
@Author : naveen.dasyam
@Created Date : Nov 16, 2012
@Modified By:
@Modified Date:
@Modifications:
@Reason for Modification
 */
public class ScheduleCUGTopUpJob implements Job {
	 static final Logger logger = LogManager.getLogger("ScheduleCUGTopUpJob");

	/* (non-Javadoc)
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
	 */
	public void execute(JobExecutionContext arg0) throws JobExecutionException {

		Long startTime  = System.currentTimeMillis();
		
		if(logger.isDebugEnabled()) {
			logger.debug("--- Executing Schedule CUG TopUp job ---");
		}

		//do {
			ScheduleTopUpActs scheduleCUGTopUpdata = ScheduleCUGTopUpTask.callDBToGetScheduleChildActs();

			if( null != scheduleCUGTopUpdata && 
					scheduleCUGTopUpdata.getGroupTopupActs() != null &&
					scheduleCUGTopUpdata.getGroupTopupActs().size() > 0) {
				logger.info( "Number of CUG schedule GroupActs(parent msisdns) found for topUp of respective child msisdns : " + scheduleCUGTopUpdata.getGroupTopupActs().size() );

				ScheduleTopUpActs scheduleTopUpRespData = ScheduleCUGTopUpTask.doScheduleTopupForChildMsisdns(scheduleCUGTopUpdata);

				//Update the Success or failure list of child MSISNDs Topup to Database
				ScheduleCUGTopUpTask.callDBToUpdateMsisdnsTopUpStatus(scheduleTopUpRespData);

			} else {
				logger.info( "*** *** *** Found No CUG schedule GroupActs(parent msisdns) for topUp of respective child msisdns");
				//break;
			}
//		}while(true); // This provide appropriate condition
			logger.info("Completed Schedule CUG Topup job"+(int) (System.currentTimeMillis() - startTime)+" ms");
	}// end of method execute()
}