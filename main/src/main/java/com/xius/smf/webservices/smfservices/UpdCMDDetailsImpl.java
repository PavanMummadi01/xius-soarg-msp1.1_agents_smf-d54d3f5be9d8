package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.UpdCMDDetailsRequest;
import com.xius.agent.smf.smfmanagement.UpdCMDDetailsResponse;
import com.xius.smf.domaindata.UpdCMDDetailsData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;


import net.bcgi.util.db.SPFactory;

@Service("UpdCMDDetailsImpl")
public class UpdCMDDetailsImpl {

	private  static final Logger logger = LogManager.getLogger(UpdCMDDetailsImpl.class.getSimpleName());


	public UpdCMDDetailsResponse UpdCMDDetails(UpdCMDDetailsRequest request,
			HeaderDetails headerDetails)

	throws RemoteException, SMFAgentException {

		UpdCMDDetailsResponse response = new UpdCMDDetailsResponse();

		UpdCMDDetailsData domainData = null;

		domainData = setRequestData(request, headerDetails);

		SPFactory factory = ServiceUtils.executeSPWithOutCommit(
				"pro_update_cmd_details", domainData, domainData);

		if (logger.isDebugEnabled()) {
			logger.debug("UpdCMDDetailsImpl pro_update_cmd_details-ERRORCODE :::"
					+ domainData.getPo_error_code());
			logger.info(
					"Error Msg ==>" + domainData.getPo_error_desc());
		}

		Utilities.commitOrRollback(factory, domainData.getPo_error_code());

		if (domainData.getPo_error_code() == 0) {
			response = setWebserviceResponse(domainData);
		} else {
			throw new SMFAgentException(domainData.getPo_error_code().toString(),domainData.getPo_error_desc());
		}
		return response;
	}

	private UpdCMDDetailsData setRequestData(UpdCMDDetailsRequest request,
			HeaderDetails headerDetails) {

		UpdCMDDetailsData domainData = new UpdCMDDetailsData();

		if (headerDetails.getNetworkID() != null)
			domainData.setPi_network_id(headerDetails.getNetworkID());

		if (headerDetails.getLoginID() != null)
			domainData.setPi_login_id(headerDetails.getLoginID());

		if (request.getEmaCommand() != null) {
			domainData.setPi_command(request.getEmaCommand());
		}
		if (request.getEmaCommandName() != null) {
			domainData.setPi_command_name(request.getEmaCommandName());
		}
		return domainData;
	}
	
	private UpdCMDDetailsResponse setWebserviceResponse(
			UpdCMDDetailsData domainData) {
		UpdCMDDetailsResponse response = new UpdCMDDetailsResponse();

		if (domainData.getPo_error_code() != null && domainData.getPo_error_code()==0) {
			response.setStatus(SMFAgentConstants.SUCCESS);
		} else {
			response.setStatus(SMFAgentConstants.FAILURE);
		}
		return response;
	}
	
}
