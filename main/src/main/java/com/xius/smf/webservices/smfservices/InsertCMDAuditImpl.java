package com.xius.smf.webservices.smfservices;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.InsertCMDAuditRequest;
import com.xius.agent.smf.smfmanagement.InsertCMDAuditResponse;
import com.xius.smf.domaindata.InvokeEmaCmdinsertData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

import net.bcgi.util.db.SPFactory;

@Service("InsertCMDAuditImpl")
public class InsertCMDAuditImpl {

	private  static final Logger logger = LogManager.getLogger(InsertCMDAuditImpl.class.getSimpleName());
	SPFactory spFactory = null;

	public InsertCMDAuditResponse insertCMDAudit(InsertCMDAuditRequest request, HeaderDetails headerDetails)
			throws SMFAgentException {

		InsertCMDAuditResponse response = new InsertCMDAuditResponse();

		InvokeEmaCmdinsertData domainData = setMOSRequest(request, headerDetails);
		if (logger.isDebugEnabled()) {

			logger.debug( domainData.toString());
		}

		spFactory = ServiceUtils.executeSPWithOutCommit("pro_ttsa_ema_cmd_insert", domainData, domainData);

		if (logger.isInfoEnabled()) {

			logger.info( "Error Code ==>" + domainData.getPo_error_code());
			logger.info( "Error Msg ==>" + domainData.getPo_error_msg());
		}

		Utilities.commitOrRollback(spFactory, domainData.getPo_error_code());

		if (null != domainData.getPo_error_code() && domainData.getPo_error_code() != 0) {

			throw new SMFAgentException(domainData.getPo_error_code().toString(), domainData.getPo_error_msg());
		} else {
			response = setWebserviceResponse(domainData);
		}
		return response;
	}

	private InsertCMDAuditResponse setWebserviceResponse(InvokeEmaCmdinsertData domainData) {

		InsertCMDAuditResponse response = new InsertCMDAuditResponse();

		if (domainData.getPo_cmd() != null) {
			response.setCmd(domainData.getPo_cmd());
		}
		if (domainData.getPo_transaction_id() != null) {
			response.setTransactionID(domainData.getPo_transaction_id());
		}
		return response;
	}

	private InvokeEmaCmdinsertData setMOSRequest(InsertCMDAuditRequest request, HeaderDetails headerDetails) {

		InvokeEmaCmdinsertData data = new InvokeEmaCmdinsertData();

		if (headerDetails.getNetworkID() != null) {
			data.setPi_network_id(headerDetails.getNetworkID());
		}
		if (headerDetails.getLoginID() != null) {
			data.setPi_login_id(headerDetails.getLoginID());
		}
		if (request.getMsisdn() != null) {
			data.setPi_msisdn(Long.parseLong(request.getMsisdn()));
		}
		if (request.getCommandName() != null) {
			data.setPi_command_name(request.getCommandName());
		}
		if (request.getStatus() != null) {
			data.setPi_status(request.getStatus());
		}
		if (request.getNewIMSI() != null) {
			data.setPi_new_imsi(request.getNewIMSI());
		}
		if (request.getNewMsisdn() != null) {
			data.setPi_new_msisdn(Long.parseLong(request.getNewMsisdn()));
		}
		if (request.getIMSI() != null) {
			data.setPi_imsi(request.getIMSI());
		}
		if (request.getExternalTransID() != null) {
			data.setPi_external_trans_id(request.getExternalTransID());
		}

		return data;
	}
}
