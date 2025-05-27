package com.xius.smf.webservices.smfservices;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.UpdateCMDAuditRequest;
import com.xius.agent.smf.smfmanagement.UpdateCMDAuditResponse;
import com.xius.smf.domaindata.InvokeEmaCmdupdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;


import net.bcgi.util.db.SPFactory;

@Service("updateCMDAuditImpl")
public class updateCMDAuditImpl {

	private  static final Logger logger = LogManager.getLogger(updateCMDAuditImpl.class.getSimpleName());
	SPFactory spFactory = null;

	public UpdateCMDAuditResponse updateCMDAudit(UpdateCMDAuditRequest request,
			HeaderDetails headerDetails) throws SMFAgentException {

		UpdateCMDAuditResponse response = new UpdateCMDAuditResponse();

		InvokeEmaCmdupdateData domainData = setMOSRequest(request,
				headerDetails);
		if (logger.isDebugEnabled()) {

			logger.debug( domainData.toString());
		}

		spFactory = ServiceUtils.executeSPWithOutCommit(
				"proc_ttsa_ema_cmd_req_update", domainData, domainData);

		if (logger.isInfoEnabled()) {

			logger.info(
					"Error Code ==>" + domainData.getPo_error_code());
			logger.info(
					"Error Msg ==>" + domainData.getPo_error_msg());
		}

		Utilities.commitOrRollback(spFactory, domainData.getPo_error_code());

		if (null != domainData.getPo_error_code()
				&& domainData.getPo_error_code() != 0) {

			throw new SMFAgentException(domainData.getPo_error_code().toString(),domainData.getPo_error_msg());
		} else {
			response = setWebserviceResponse(domainData);
		}
		return response;

	}

	private UpdateCMDAuditResponse setWebserviceResponse(
			InvokeEmaCmdupdateData domainData) {

		UpdateCMDAuditResponse response = new UpdateCMDAuditResponse();

		if (domainData.getPo_error_code() != null) {
			response.setMesssge(domainData.getPo_error_msg());
		}
		return response;
	}

	private InvokeEmaCmdupdateData setMOSRequest(UpdateCMDAuditRequest request,
			HeaderDetails headerDetails) {

		InvokeEmaCmdupdateData data = new InvokeEmaCmdupdateData();

		if (headerDetails.getNetworkID() != null) {
			data.setPi_network_id(headerDetails.getNetworkID());
		}
		if (request.getExternalTransID() != null) {
			data.setPi_transaction_id(request.getExternalTransID());
		}
		if (request.getStatus() != null) {
			data.setPi_status(request.getStatus());
		}
		if (request.getRemarks() != null) {
			data.setPi_remarks(request.getRemarks());
		}
		if (request.getCommand() != null) {
			data.setPi_cmd(request.getCommand());
		}
		if (request.getMaxRetryCount() != null) {
			data.setPi_max_retry_count(Long.parseLong(request
					.getMaxRetryCount()));
		}
		if (request.getErrorCode() != null) {
			data.setPi_error_code(request.getErrorCode());
		}
		if (request.getErrorMsg() != null) {
			data.setPi_error_msg(request.getErrorMsg());
		}

		return data;
	}
}
