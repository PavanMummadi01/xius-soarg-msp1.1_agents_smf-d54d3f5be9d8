package com.xius.smf.job;

import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.domaindata.TTPCRFUpdateDATA;
import com.xius.smf.domaindata.VolteUpdateData;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class VOLTEUpdateProcessor  {
	
	
	private static final Logger logger = LogManager.getLogger(VOLTEUpdateProcessor.class.getSimpleName());

	public void statusUpdate(VolteUpdateData updatedData)throws Exception {
		
		 
		SPFactory factory = ServiceUtils.executeSPWithOutCommit("pro_lte_srvc_update", updatedData, updatedData);

		if (logger.isInfoEnabled()) {
			logger.info( updatedData.toString());
		}

		Utilities.commitOrRollback(factory, updatedData.getPo_error_code());

		if (logger.isInfoEnabled()) {
			logger.info("Error Code from pro_lte_srvc_update  ==>"+ updatedData.getPo_error_code());
			logger.info("Error Msg from pro_lte_srvc_update  ==>"+ updatedData.getPo_error_desc());
		}	
		
	}

}