package com.xius.smf.webservices.smfservices;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.RestAPIUserAuthRequest;
import com.xius.agent.smf.smfmanagement.RestAPIUserAuthResponse;
import com.xius.smf.domaindata.RestAPIUserAuthData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;


import net.bcgi.util.db.SPFactory;

@Service("RestAPIUserAuthImpl")
public class RestAPIUserAuthImpl {
	private  static final Logger logger = LogManager.getLogger(RestAPIUserAuthImpl.class.getSimpleName());
	SPFactory spFactory = null;

	public RestAPIUserAuthResponse restAPIUserAuth(RestAPIUserAuthRequest request, HeaderDetails headerDetails)
			throws SMFAgentException {

		RestAPIUserAuthResponse response = new RestAPIUserAuthResponse();

		RestAPIUserAuthData domainData = setMOSRequest(request, headerDetails);
		if (logger.isDebugEnabled()) {

			logger.debug( domainData.toString());
		}

		spFactory = ServiceUtils.executeSPWithOutCommit("pro_TTSA_restapi_user_auth", domainData, domainData);

		if (logger.isInfoEnabled()) {

			logger.info("Error Code ==>" + domainData.getPo_error_code());
			logger.info( "Error Msg ==>" + domainData.getPo_error_desc());
		}

		Utilities.commitOrRollback(spFactory, domainData.getPo_error_code());

		if (null != domainData.getPo_error_code() && domainData.getPo_error_code() != 0) {

			throw new SMFAgentException(domainData.getPo_error_code().toString(), domainData.getPo_error_desc());

		} else {

			/**
			 * Set response
			 */
			response = setWebserviceResponse(domainData);

		}
		return response;
	}

	private RestAPIUserAuthResponse setWebserviceResponse(RestAPIUserAuthData domainData) {

		RestAPIUserAuthResponse response = new RestAPIUserAuthResponse();

		if (domainData.getPo_error_desc() != null) {
			response.setMessage(domainData.getPo_error_desc());
		}

		return response;
	}

	private RestAPIUserAuthData setMOSRequest(RestAPIUserAuthRequest request, HeaderDetails headerDetails) {

		RestAPIUserAuthData data = new RestAPIUserAuthData();

		if (headerDetails.getNetworkID() != null) {
			data.setPi_network_id(headerDetails.getNetworkID());
		}

		if (headerDetails.getLoginID() != null) {
			data.setPi_login_id(headerDetails.getLoginID());
		}

		if (headerDetails.getPassword() != null) {
			data.setPi_password(headerDetails.getPassword());
		}

		if (request.getMspapiPrivilegeId() != null) {
			data.setPi_mspapi_privilege_id(request.getMspapiPrivilegeId());
		}

		return data;
	}
}
