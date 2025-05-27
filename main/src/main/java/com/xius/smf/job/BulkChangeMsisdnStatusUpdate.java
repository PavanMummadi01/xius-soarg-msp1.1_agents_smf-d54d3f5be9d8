package com.xius.smf.job;

import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.domaindata.BulkChangeMsisdnStatusUpdateData;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class BulkChangeMsisdnStatusUpdate {
	private	 static final Logger logger = LogManager.getLogger(BulkChangeMsisdnStatusUpdate.class.getSimpleName());

	public void statuUpdate(BulkChangeMsisdnStatusUpdateData domainData)throws Exception {
		
		 
		SPFactory factory = ServiceUtils.executeSPWithOutCommit("pro_change_msisdn_upd", domainData, domainData);

		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}

		Utilities.commitOrRollback(factory, domainData.getPo_error_code());

		if (logger.isInfoEnabled()) {
			logger.info("Error Code from pro_change_msisdn_upd ==>"+ domainData.getPo_error_code());
			logger.info("Error Msg from pro_change_msisdn_upd  ==>"+ domainData.getPo_error_desc());
		}		
	}
	 
}
