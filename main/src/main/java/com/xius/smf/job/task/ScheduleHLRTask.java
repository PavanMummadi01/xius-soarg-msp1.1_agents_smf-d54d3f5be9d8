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
 *	@package	com.xius.smf.job.task
 * 	@author		SaiRajesh.g
 *	@Date		Jan 29, 2014,5:41:53 PM
*/

package com.xius.smf.job.task;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.bcgi.util.db.SPFactory;

import com.xius.smf.domaindata.HLRCursorData;
import com.xius.smf.domaindata.HLRData;
import com.xius.smf.domaindata.HlrUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class ScheduleHLRTask {
	
	static Logger logger = LogManager.getLogger("ScheduleHLRTask");

	public static HLRData callDBToGetSchedule() {
		
		long intMaxRecords = 10;
		String maxRecords = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.HLR_MAX_RECORDS );
		HLRData hlrdata = null;
		if(Utilities.isNotEmpty(maxRecords)) {
			intMaxRecords =new Long(maxRecords).longValue();
		}
		
		HLRData domainData = new HLRData();
		
		
		String networkId = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.NETWORKID_PROP);
		
		domainData.setPi_network_id(new Long(networkId));
		domainData.setPi_maxRecords(intMaxRecords);
		domainData.setPi_app_id(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.APP_ID_PROP));
		SPFactory factory =null;
		
		try {
			factory = ServiceUtils.executeSPWithOutCommit("pro_get_acct_status_chng_to_ac", domainData, domainData);
			Utilities.commitOrRollback(factory, domainData.getPo_error_code());
			if(logger.isInfoEnabled()) {
				logger.info( "Error Code in pro_get_acct_status_chng_to_ac==>"+domainData.getPo_error_code());
				logger.info( "Error MESSEGE in pro_get_acct_status_chng_to_ac==>"+domainData.getPo_error_desc());
				logger.info( "CURSOR LIST SIZE==>"+domainData.getCursor().size());
				logger.info( "Total Records==>"+domainData.getPo_total_records());
			}
		} catch (SMFAgentException e) {
			logger.error( "Exception in pro_get_acct_status_chng_to_ac \n"+Utilities.getStackTrace(e));
		}
		
		return domainData;
	}
	
	
	

	/**
	 * @param transaction_id
	 * @param remarks
	 * @param process_flag
	 */
	
	public static void callDBToUpdateScheduleHLR(String transaction_id, String remarks, String process_flag) {
		
		HlrUpdateData domainData = new HlrUpdateData();
		
		String networkId = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.NETWORKID_PROP);
		
		domainData.setPi_network_id(new Long(networkId));
		domainData.setTransaction_id(transaction_id);
		domainData.setProcess_flag(process_flag);
		domainData.setRemarks(remarks);
		
		try {
			SPFactory factory = ServiceUtils.executeSPWithOutCommit("pro_upd_acct_status_chng_to_ac", domainData, domainData);
			Utilities.commitOrRollback(factory, domainData.getPo_error_code());
			
			if(logger.isInfoEnabled()) {
				logger.info( "Error Code in pro_upd_acct_status_chng_to_ac==>"+domainData.getPo_error_code());
			}
		} catch (SMFAgentException e) {
			logger.error("Exception in pro_upd_acct_status_chng_to_ac \n"+Utilities.getStackTrace(e));
		}
		
	}

}
