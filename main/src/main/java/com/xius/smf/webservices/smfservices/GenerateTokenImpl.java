package com.xius.smf.webservices.smfservices;

import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.GenerateTokenRequest;
import com.xius.agent.smf.smfmanagement.GenerateTokenResponse;
import com.xius.smf.domaindata.GenerateTokenData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("GenerateTokenImpl")
public class GenerateTokenImpl {
	private  static final Logger logger = LogManager.getLogger(GenerateTokenImpl.class.getSimpleName());

	public GenerateTokenResponse generateToken(GenerateTokenRequest request,
			HeaderDetails headerDetails) throws SMFAgentException {
		GenerateTokenResponse response = new GenerateTokenResponse();
		
		GenerateTokenData domainData = null;
		domainData = setRequestData(request, headerDetails);
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_otp_generation_request",domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from pro_otp_generation_request  ==>" + domainData.getPo_error_code());
			logger.info( "Error Msg from  pro_otp_generation_request ==>" + domainData.getPo_error_desc());
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

	private GenerateTokenData setRequestData(GenerateTokenRequest request,
			HeaderDetails headerDetails) {
		GenerateTokenData domainData = new GenerateTokenData();
		
		domainData.setPi_network_id(headerDetails.getNetworkID());
		if(request.getMSISDN() != null)
		domainData.setPi_msisdn_no(Long.parseLong(request.getMSISDN()));
		if(request.getUserID() != null)
		domainData.setUser_id(request.getUserID());
		if(request.getAccountId() != null)
		domainData.setPi_account_id(Long.parseLong(request.getAccountId()));
		if(request.getChannel() != null)
		domainData.setPi_channel(request.getChannel());
		if(request.getReason() != null)
		domainData.setPi_reason(request.getReason());
		if(request.getTokenLife() != null)
		domainData.setPi_time_to_live(request.getTokenLife());
		if(request.getToken() != null && request.getToken().trim().length()>0  )
		domainData.setPio_token(Long.parseLong(request.getToken()));

		return domainData;
	}
	
	private GenerateTokenResponse setWebserviceResponse(
			GenerateTokenData domainData) {
		GenerateTokenResponse response = new GenerateTokenResponse();
		if(domainData.getPio_token() != null)
		response.setToken(domainData.getPio_token().toString());
		if(domainData.getPi_time_to_live() != null)
		response.setTokenLife(domainData.getPi_time_to_live());
		if(domainData.getPo_expiry_date() != null)
		response.setTokenExpiryDate(domainData.getPo_expiry_date());
		if(domainData.getPo_expiry_time() != null)
		response.setTokenExpiryTime(domainData.getPo_expiry_time());
		
		return response;
	}


}
