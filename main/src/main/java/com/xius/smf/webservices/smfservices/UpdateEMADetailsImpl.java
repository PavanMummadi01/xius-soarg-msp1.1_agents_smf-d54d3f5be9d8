package com.xius.smf.webservices.smfservices;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.UpdateEMADetailsRequest;
import com.xius.agent.smf.smfmanagement.UpdateEMADetailsResponse;
import com.xius.smf.domaindata.UpdateEMADetailsData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;


import net.bcgi.util.db.SPFactory;

@Service("UpdateEMADetailsImpl")
public class UpdateEMADetailsImpl {
	private  static final Logger logger = LogManager.getLogger(UpdateEMADetailsImpl.class.getSimpleName());

	public UpdateEMADetailsResponse updateEMADetails(UpdateEMADetailsRequest request, HeaderDetails headerDetails)
			throws SMFAgentException {
		UpdateEMADetailsResponse response = new UpdateEMADetailsResponse();
		UpdateEMADetailsData domainData = null;
		domainData = setRequestData(request, headerDetails);

		SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_upd_emaid_vs_emacommand", domainData,
				domainData);

		Utilities.commitOrRollback(spfactory, domainData.getPo_error_code());

		if (domainData.getPo_error_code() != 0) {

			throw new SMFAgentException(domainData.getPo_error_code().toString(), domainData.getPo_error_desc());
		} else {
			response.setMessage("SUCCESS");
		}

		return response;

	}

	private UpdateEMADetailsData setRequestData(UpdateEMADetailsRequest request, HeaderDetails headerDetails) {
		UpdateEMADetailsData domainData = new UpdateEMADetailsData();
		if (headerDetails.getNetworkID() != null) {
			domainData.setPi_network_id(headerDetails.getNetworkID());
		}
		if (headerDetails.getLoginID() != null) {
			domainData.setPi_username(headerDetails.getLoginID());
		}
		if (request.getEmaCommand() != null) {
			domainData.setPi_emacommand(request.getEmaCommand());
		}

		if (request.getEmaID() != null) {
			domainData.setPi_emaid(request.getEmaID());
		}

		return domainData;
	}

}
