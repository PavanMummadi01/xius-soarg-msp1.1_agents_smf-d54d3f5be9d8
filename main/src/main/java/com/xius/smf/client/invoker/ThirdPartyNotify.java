package com.xius.smf.client.invoker;
/******************************************************************
 * Company XIUS (Megasoft Pvt Ltd Hyderabad,INDIA)
 * � Copyright 2006 MEGASOFT. 
 *
 * Package      : com.xius.smf.client.invoker;
 * Name of File : BulkRCSubscriptionJob.java
 * Date /Year   : 25/10/2018
 * Author       : shashidharkumar.poloju
 * Discription  : This is to store the ThirdParty Notification details
 * Method names : thridPartyNotify
 * Modifications:
 * Method Name  |  Date   |  Author  | Explanation
 * -------------------------------------------------------------              
 *              |         |          |
 *              |         |          | 
 *             
 ********************************************************************/
import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.domaindata.ThirdPartyNotifyTrackerData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.job.service.GetOfficeDetails;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class ThirdPartyNotify {
    private static final Logger logger = LogManager.getLogger(ThirdPartyNotify.class);
	
	public void thridPartyNotify(ThirdPartyNotifyTrackerData domaindata,HeaderDetails headerDetails) throws SMFAgentException {
		
			 logger.info("ThirdPartyNotifyTrackerData Sending to DB "
				+ domaindata.toString());
			 
		SPFactory factory =ServiceUtils.executeSPWithOutCommit("pro_third_party_notif_tracker",
				domaindata, domaindata);
		Utilities.commitOrRollback(factory, domaindata.getPo_error_code());
		if (domaindata.getPo_error_code() != 0) {
			logger.error("ThirdPartyNotifyTrackerData" + "ErrorCode:: "
					+ domaindata.getPo_error_code() + "ErrorMsg:: "
					+ domaindata.getPo_error_desc());
			
			throw Utilities.setSMFAgentException(domaindata
					.getPo_error_code().toString(), domaindata.getPo_error_desc());
		}
	}
	
	
}
