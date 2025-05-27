package com.xius.smf.job;


import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.domaindata.BulkLUJobData;
import com.xius.smf.domaindata.FluValidationData;
import com.xius.smf.domaindata.GetBulkFluDtlsCursorData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class FluValidationImpl {

	
	private	 static final Logger logger = LogManager.getLogger(FluValidationImpl.class.getSimpleName());

	public FluValidationData fluValidation(BulkLUJobData data,String SIM) throws SMFAgentException {

		String IMSI = null;
		FluValidationData domainData = null;

		domainData = setMOSRequest(data, SIM);
		SPFactory factory = ServiceUtils.executeSPWithOutCommit("pro_bulk_flu_validation", domainData, domainData);

		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}

		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {
			logger.info("Error Code from pro_bulk_flu_validation  ==>"+ domainData.getPo_error_code());
			logger.info("Error Msg from pro_bulk_flu_validation  ==>"+ domainData.getPo_error_desc());
		}
		if (domainData.getPo_error_code() == 0) {
			IMSI = domainData.getPo_IMSI();
		}
		return domainData;
	}

	private FluValidationData setMOSRequest(BulkLUJobData data,String SIM) {

		FluValidationData fluValidationData = new FluValidationData();

		if (data.getPi_network_id() != null)
			fluValidationData.setPi_network_id(data.getPi_network_id());

		if (data.getPi_nir_code() != null)
			fluValidationData.setPi_nir_code(data.getPi_nir_code());
		if (data.getPi_office_code() != null)
			fluValidationData.setPi_office_code(data.getPi_office_code());
		if (SIM != null){
			fluValidationData.setPi_iccid(SIM);
			data.setPi_iccid(SIM);
		}
		
		return fluValidationData;

	}

}
