package com.xius.smf.job;

import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.domaindata.TTPCRFUpdateDATA;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class TTPCRFUpdateProcessor  {
	

	private static final Logger logger = LogManager.getLogger(TTPCRFUpdateProcessor.class.getSimpleName());

	public void statusUpdate(TTPCRFUpdateDATA updatedData)throws Exception {
		
		 
		SPFactory factory = ServiceUtils.executeSPWithOutCommit("update_policy_tracker", updatedData, updatedData);

		if (logger.isInfoEnabled()) {
			logger.info( updatedData.toString());
		}

		Utilities.commitOrRollback(factory, updatedData.getPo_error_code());

		if (logger.isInfoEnabled()) {
			logger.info("Error Code from update_policy_tracker  ==>"+ updatedData.getPo_error_code());
			logger.info("Error Msg from update_policy_tracker  ==>"+ updatedData.getPo_error_desc());
		}	
		
	}

}