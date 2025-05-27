package com.xius.smf.job;

import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.domaindata.CAGroupDtlsUpdateData;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class CAGroupDtlsUpdateProcessor {
	private	 static final Logger logger = LogManager.getLogger(CAGroupDtlsUpdateProcessor.class.getSimpleName());

	public void statusUpdate(CAGroupDtlsUpdateData domainData)throws Exception {
		
		 
		SPFactory factory = ServiceUtils.executeSPWithOutCommit("pro_ca_group_dtls_update", domainData, domainData);

		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}

		Utilities.commitOrRollback(factory, domainData.getPo_error_code());

		if (logger.isInfoEnabled()) {
			logger.info("Error Code from pro_thiredparty_notific_update  ==>"+ domainData.getPo_error_code());
			logger.info("Error Msg from pro_thiredparty_notific_update  ==>"+ domainData.getPo_error_desc());
		}		
	}
	 
}
