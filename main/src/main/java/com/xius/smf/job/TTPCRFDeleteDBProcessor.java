package com.xius.smf.job;

import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.domaindata.TTPCRFDeleteDATA;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class TTPCRFDeleteDBProcessor  {
	private static final Logger logger = LogManager.getLogger(TTPCRFDeleteDBProcessor.class.getSimpleName());

	

	public void statusUpdate(TTPCRFDeleteDATA  Data)throws Exception {
		
		 
		SPFactory factory = ServiceUtils.executeSPWithOutCommit("delete_policy_tracker", Data, Data);

		if (logger.isInfoEnabled()) {
			logger.info( Data.toString());
		}

		Utilities.commitOrRollback(factory, Data.getPo_error_code());

		if (logger.isInfoEnabled()) {
			logger.info("Error Code from delete_policy_tracker.xml  ==>"+ Data.getPo_error_code());
			logger.info("Error Msg from delete_policy_tracker.xml  ==>"+ Data.getPo_error_desc());
		}	
		
	}

}