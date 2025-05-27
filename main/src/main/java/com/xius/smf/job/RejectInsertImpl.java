package com.xius.smf.job;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.domaindata.BulkLUJobData;
import com.xius.smf.domaindata.FluValidationData;
import com.xius.smf.domaindata.RejectInsertData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.ServiceUtils;

public class RejectInsertImpl {

	
	private static final Logger logger = LogManager.getLogger(RejectInsertImpl.class.getSimpleName());

	public RejectInsertData rejectInsert(BulkLUJobData data, String SIM, FluValidationData validationData)
			throws SMFAgentException {

		RejectInsertData domainData = null;

		domainData = setMOSRequest(data, SIM,validationData);
		ServiceUtils._executeStoredProcedure("pro_bulk_flu_reject_insert", domainData, domainData);

		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}

		if (logger.isInfoEnabled()) {
			logger.info("Error Code from pro_bulk_flu_reject_insert  ==>"+ domainData.getPo_error_code());
			logger.info("Error Msg from pro_bulk_flu_reject_insert  ==>"+ domainData.getPo_error_desc());
		}
		
		return domainData;
	}

	private RejectInsertData setMOSRequest(BulkLUJobData data, String SIM, FluValidationData validationData) {

		RejectInsertData rejectInsertData = new RejectInsertData();

		if (validationData.getPi_network_id() != null)
			rejectInsertData.setPi_network_id(validationData.getPi_network_id());
		if (validationData.getPi_nir_code() != null)
			rejectInsertData.setPi_nir_code(String.valueOf(validationData.getPi_nir_code()));
		if (data.getPi_office_code() != null)
			rejectInsertData.setPi_office_code(Long.valueOf(validationData.getPi_office_code()));
		if (SIM != null)
			rejectInsertData.setPi_iccid(SIM);
		if (validationData.getPo_error_code() != null)
			rejectInsertData.setPi_reject_code(String.valueOf(validationData.getPo_error_code()));
		if (validationData.getPo_error_desc() != null)
			rejectInsertData.setPi_reject_reason(validationData.getPo_error_desc());
		if (data.getTrans_id() != null)
			rejectInsertData.setPi_trans_id(data.getTrans_id());

		return rejectInsertData;

	}
}
