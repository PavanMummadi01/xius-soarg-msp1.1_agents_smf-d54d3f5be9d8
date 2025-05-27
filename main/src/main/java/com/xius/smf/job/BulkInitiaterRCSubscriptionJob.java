/******************************************************************
 * Company XIUS (Megasoft Pvt Ltd Hyderabad,INDIA)
 * � Copyright 2006 MEGASOFT. 
 *
 * Package      : com.xius.smf.job;
 * Name of File : BulkInitiaterRCSubscriptionJob.java
 * Date /Year   : 1/08/2018
 * Author       : Sambasiva Rao Aakula
 * Discription  : This Job Will Initiate Subscribe Bulk  RC
 * Method names : 
 * Modifications:
 * Method Name  |  Date   |  Author  | Explanation
 * -------------------------------------------------------------              
 *              |         |          |
 *              |         |          | 
 *             
 ********************************************************************/

package com.xius.smf.job;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;

import com.xius.smf.domaindata.BulkInitiaterRCSubscriptionData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class BulkInitiaterRCSubscriptionJob implements Job, StatefulJob {
	private	 static final Logger logger = LogManager.getLogger(BulkInitiaterRCSubscriptionJob.class.getSimpleName());
	private static String networkIdList = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_INITIATER_RC_SUBSCRIPTION_EXTERNAL_NW_ID);
	//private static String instId = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_RC_SUBSCRIPTION_INSTANCE_ID);
	private static String[] networkIdArray = null;

	public void execute(JobExecutionContext context)throws JobExecutionException {
		BulkInitiaterRCSubscriptionData data = null;
		
		try {
			  
			       data=new BulkInitiaterRCSubscriptionData();
				if (logger.isInfoEnabled())
					logger.info("Configured networkIds in Property File are ==>"+ networkIdList);
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
				//data.setPi_instance_id(instId);
			      initiateRcCall(data);
			
		} catch (SMFAgentException e) {
			logger.error("Error While Getting Data From DB.");
			e.printStackTrace();
		}

	}
	
	public void initiateRcCall(BulkInitiaterRCSubscriptionData domaindata) throws SMFAgentException {
		if(logger.isInfoEnabled())
		   logger.info("Data Sending to DB " + domaindata.toString());
		    ServiceUtils._executeStoredProcedure("pro_get_schdual_topup_dtls",	domaindata, domaindata);
		if (domaindata.getPo_error_code() == 0) {
			 logger.info("Success Db Call  with Erro Code   : ===> :" + domaindata.getPo_error_code());
		}
		else{
			 logger.info("Erro Code  From Db   : ===> :" + domaindata.getPo_error_code());
			 logger.info("Erro Message From Db : ===> :" + domaindata.getPo_error_desc());

		}
		
	}
}
