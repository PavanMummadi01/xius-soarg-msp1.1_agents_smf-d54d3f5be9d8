package com.xius.smf.webservices.smfservices;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.LoginLogoutTrackingRequest;
import com.xius.agent.smf.smfmanagement.LoginLogoutTrackingResponse;
import com.xius.smf.domaindata.LoginLogoutTrackingData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("LoginLogoutTrackingImpl")
public class LoginLogoutTrackingImpl {
	private  static final Logger logger = LogManager.getLogger(LoginLogoutTrackingImpl.class.getSimpleName());

	public LoginLogoutTrackingResponse loginLogoutTracking(
			LoginLogoutTrackingRequest request, HeaderDetails headerDetails) throws SMFAgentException {
		LoginLogoutTrackingResponse response = new LoginLogoutTrackingResponse();
		LoginLogoutTrackingData domainData = setMOSRequest(request,headerDetails);
		ServiceUtils._executeStoredProcedure( "pro_user_login_logout_tracking", domainData, domainData);
			
			Long errCode = domainData.getPo_error_code();
			if(logger.isInfoEnabled()) {

				logger.info( domainData.toString());
				logger.info( "Error Code ==>"+errCode);
			}

			if(errCode !=0) {
				 
				throw Utilities.setSMFAgentException(String.valueOf(errCode), domainData.getPo_error_desc());
			}
			response = setWebserviceResponse(domainData);

			return response;
		}

	private LoginLogoutTrackingData setMOSRequest(
			LoginLogoutTrackingRequest request, HeaderDetails headerDetails) {
		LoginLogoutTrackingData data = new LoginLogoutTrackingData();
		if(headerDetails != null)
			data.setPi_network_id(headerDetails.getNetworkID());
		
		 if (Utilities.isNull(request.getUserName()) == false) {
			 data.setPi_user_name(request.getUserName().trim());
	     }
		 if (Utilities.isNull(request.getUniqueID()) == false) {
			 data.setPi_unique_id(Long.parseLong(request.getUniqueID().trim()));
	     }
		 if(Utilities.isNull(request.getOperation()) == false){
			 data.setPi_operation(request.getOperation());
		 }
		 if(Utilities.isNull(request.getUserType()) == false){
			 data.setPi_user_type(request.getUserType());
		 }
		return data;
	}
	
	private LoginLogoutTrackingResponse setWebserviceResponse(
			LoginLogoutTrackingData domainData) {
		LoginLogoutTrackingResponse response = new LoginLogoutTrackingResponse();
		if(domainData.getPi_unique_id() != null)
			response.setUniqueID(domainData.getPi_unique_id().toString());
		return response;
	}
	
}
