package com.xius.smf.job;

import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.domaindata.BulkLUJobData;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class FLUBulkFinalStatUpdate {
	
	private	 static final Logger logger = LogManager.getLogger(FLUBulkFinalStatUpdate.class.getSimpleName());
	public void statuUpdate(BulkLUJobData domainData)throws Exception {
		
		 
		domainData.setFinalStatus("COMPLETED");
		SPFactory factory = ServiceUtils.executeSPWithOutCommit("pro_bulk_flu_staus_upd", domainData, domainData);

		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}

		Utilities.commitOrRollback(factory, domainData.getPo_error_code());

		if (logger.isInfoEnabled()) {
			logger.info("Error Code from pro_bulk_flu_reject_insert  ==>"+ domainData.getPo_error_code());
			logger.info("Error Msg from pro_bulk_flu_reject_inser  ==>"+ domainData.getPo_error_desc());
		}		
	}
	 
}
