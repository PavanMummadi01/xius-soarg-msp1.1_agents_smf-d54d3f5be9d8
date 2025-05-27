package com.xius.smf.job;

import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.domaindata.TTPCRFUpdateDATA;
import com.xius.smf.domaindata.VolteInsertData;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class VOLTEInsertProcessor  {
	
	
	private static final Logger logger = LogManager.getLogger(VOLTEInsertProcessor.class.getSimpleName());

	public void statusInsert(VolteInsertData insertData)throws Exception {
		
		 
		SPFactory factory = ServiceUtils.executeSPWithOutCommit("pro_lte_srvc_req_insrt",insertData, insertData);

		if (logger.isInfoEnabled()) {
			logger.info( insertData.toString());
		}

		Utilities.commitOrRollback(factory, insertData.getPo_error_code());

		if (logger.isInfoEnabled()) {
			logger.info("Error Code from pro_lte_srvc_req_insrt  ==>"+ insertData.getPo_error_code());
			logger.info("Error Msg from pro_lte_srvc_req_insrt  ==>"+ insertData.getPo_error_desc());
			logger.info("internal transaction id from pro_lte_srvc_req_insrt  ==>"+ insertData.getPo_intrnl_transaction_id());
		}	
		
	}

}