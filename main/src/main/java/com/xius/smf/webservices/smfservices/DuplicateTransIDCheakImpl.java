package com.xius.smf.webservices.smfservices;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.DuplicateTransIDCheakRequest;
import com.xius.agent.smf.smfmanagement.DuplicateTransIDCheakResponse;
import com.xius.smf.domaindata.DuplicateTransIDCheakData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

import net.bcgi.util.db.SPFactory;

@Service("DuplicateTransIDCheakImpl")
public class DuplicateTransIDCheakImpl {

	private  static final Logger logger = LogManager.getLogger(DuplicateTransIDCheakImpl.class.getSimpleName());
	SPFactory spFactory = null;

	public DuplicateTransIDCheakResponse duplicateTransIDCheak(DuplicateTransIDCheakRequest request,
			HeaderDetails headerDetails) throws SMFAgentException {

		DuplicateTransIDCheakResponse response = new DuplicateTransIDCheakResponse();

		DuplicateTransIDCheakData domainData = setMOSRequest(request, headerDetails);
		if (logger.isDebugEnabled()) {

			logger.info( domainData.toString());
		}

		spFactory = ServiceUtils.executeSPWithOutCommit("pro_ttsa_check_exttransid", domainData, domainData);

		if (logger.isInfoEnabled()) {

			logger.info( "Error Code ==>" + domainData.getPo_error_code());
			logger.info( "Error Msg ==>" + domainData.getPo_error_desc());
		}

		Utilities.commitOrRollback(spFactory, domainData.getPo_error_code());

		if (null != domainData.getPo_error_code() && domainData.getPo_error_code() != 0) {

			throw new SMFAgentException(domainData.getPo_error_code().toString(), domainData.getPo_error_desc());
		} else {
			response = setWebserviceResponse(domainData);
		}
		return response;
	}

	private DuplicateTransIDCheakResponse setWebserviceResponse(DuplicateTransIDCheakData domainData) {

		DuplicateTransIDCheakResponse response = new DuplicateTransIDCheakResponse();
		if (domainData.getPo_error_code() != null) {
			response.setMessage(domainData.getPo_error_desc());
		}
		return response;
	}

	private DuplicateTransIDCheakData setMOSRequest(DuplicateTransIDCheakRequest request, HeaderDetails headerDetails) {

		DuplicateTransIDCheakData data = new DuplicateTransIDCheakData();

		if (headerDetails.getNetworkID() != null) {
			data.setPi_network_id(headerDetails.getNetworkID());
		}
		if (request.getExtTransID() != null) {
			data.setPi_exttransid(request.getExtTransID());
		}
		if (request.getOrderid() != null) {
			data.setPi_orderid(request.getOrderid());
		}
		if (request.getNewMsisdn() != null) {
			data.setPi_new_msisdn(Long.parseLong(request.getNewMsisdn()));
		}
		if (request.getNewSim() != null) {
			data.setPi_new_sim(request.getNewSim());
		}
		if (request.getOldMsisdn() != null) {
			data.setPi_old_msisdn(Long.parseLong(request.getOldMsisdn()));
		}
		if (request.getOldSim() != null) {
			data.setPi_old_sim(request.getOldSim());
		}
		if (request.getFlag() != null) {
			data.setPi_flag(request.getFlag());
		}
		return data;
	}
}
