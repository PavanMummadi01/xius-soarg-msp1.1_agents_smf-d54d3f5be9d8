package com.xius.smf.job;

import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.domaindata.BulkStateChangeUpdateData;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class BulkStateChangeFinalStatUpdate {
	private	 static final Logger logger = LogManager.getLogger(BulkStateChangeFinalStatUpdate.class.getSimpleName());

	public void statuUpdate(BulkStateChangeUpdateData domainData)throws Exception {
		
		 
		SPFactory factory = ServiceUtils.executeSPWithOutCommit("pro_state_change_upd", domainData, domainData);

		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}

		Utilities.commitOrRollback(factory, domainData.getPo_error_code());

		if (logger.isInfoEnabled()) {
			logger.info("Error Code from pro_state_change_upd  ==>"+ domainData.getPo_error_code());
			logger.info("Error Msg from pro_state_change_upd  ==>"+ domainData.getPo_error_desc());
		}		
	}
	 
}
