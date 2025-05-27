package com.xius.smf.webservices.smfservices;


import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.ValidateTokenRequest;
import com.xius.agent.smf.smfmanagement.ValidateTokenResponse;
import com.xius.smf.domaindata.ValidateTokenData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("ValidateTokenImpl")
public class ValidateTokenImpl {
	private  static final Logger logger = LogManager.getLogger(ValidateTokenImpl.class.getSimpleName());

	public ValidateTokenResponse validateToken(ValidateTokenRequest request,
			HeaderDetails headerDetails) throws SMFAgentException {
		ValidateTokenResponse response = new ValidateTokenResponse();
		
		ValidateTokenData domainData = null;
		domainData = setRequestData(request, headerDetails);
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_otp_request_validation",domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from  pro_otp_request_validation  ==>" + domainData.getPo_error_code());
			logger.info( "Error Msg from  pro_otp_request_validation  ==>" + domainData.getPo_error_desc());
		}
		if(domainData.getPo_error_code()==0)
		{
			response=setWebserviceResponse(domainData);
		}
		
		else
		{
			throw new SMFAgentException(String.valueOf(domainData.getPo_error_code()), domainData.getPo_error_desc());
		}
		
		
		return response;
	}

	private ValidateTokenData setRequestData(ValidateTokenRequest request,
			HeaderDetails headerDetails) {
		ValidateTokenData domainData = new ValidateTokenData();
	  
	    domainData.setPi_network_id(headerDetails.getNetworkID());
	    if(request.getMSISDN() != null)
		domainData.setPi_msisdn_no(Long.parseLong(request.getMSISDN()));
	    if(request.getUserID() != null)
		domainData.setUser_id(request.getUserID());
	    if(request.getAccountId() != null)
		domainData.setPi_account_id(Long.parseLong(request.getAccountId()));
	    if(request.getToken() != null)
		domainData.setPi_token(Long.parseLong(request.getToken()));
	    if(request.getChannel() != null)
			domainData.setPi_channel(request.getChannel());

		return domainData;
	}

	private ValidateTokenResponse setWebserviceResponse(
			ValidateTokenData domainData) {
		ValidateTokenResponse response =new ValidateTokenResponse();
		
		response.setMessage(SMFAgentConstants.SUCCESS);
	
		return response;
	}

}
