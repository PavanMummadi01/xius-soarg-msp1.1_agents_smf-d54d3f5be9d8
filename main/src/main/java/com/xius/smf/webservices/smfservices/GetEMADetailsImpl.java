package com.xius.smf.webservices.smfservices;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.GetEMADetailsRequest;
import com.xius.agent.smf.smfmanagement.GetEMADetailsResponse;
import com.xius.smf.domaindata.GetEMADetailsData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

import net.bcgi.util.db.SPFactory;

@Service("GetEMADetailsImpl")
public class GetEMADetailsImpl {

	private  static final Logger logger = LogManager.getLogger(GetEMADetailsImpl.class.getSimpleName());

	public GetEMADetailsResponse getEMADetails(GetEMADetailsRequest request, HeaderDetails headerDetails)
			throws SMFAgentException {
		GetEMADetailsResponse response = new GetEMADetailsResponse();
		GetEMADetailsData domainData = null;
		domainData = setRequestData(request, headerDetails);

		SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_get_emaid_vs_emacommand", domainData,
				domainData);

		Utilities.commitOrRollback(spfactory, domainData.getPo_error_code());

		if (domainData.getPo_error_code() != 0) {

			throw new SMFAgentException(domainData.getPo_error_code().toString(), domainData.getPo_error_desc());
		} else {
			response = setWebserviceResponse(domainData);
		}

		return response;

	}

	private GetEMADetailsResponse setWebserviceResponse(GetEMADetailsData domainData) {
		GetEMADetailsResponse response = new GetEMADetailsResponse();

		if (domainData.getPo_emacommand() != null) {
			// response.setEmaCommand(domainData.getPo_emacommand());
			response.getEmaCommand().addAll(Arrays.asList(domainData.getPo_emacommand()));
		}
		if (domainData.getPo_emaid() != null) {
			// response.setEmaID(domainData.getPo_emaid());
			response.getEmaID().addAll(Arrays.asList(domainData.getPo_emaid()));
		}
		if (domainData.getPo_reasons_list() != null) {
			// response.setReasons(domainData.getPo_reasons_list());
			response.getReasons().addAll(Arrays.asList(domainData.getPo_reasons_list()));
		}
		if (domainData.getPo_reasons_list_id() != null) {
			// response.setReasonsId(domainData.getPo_reasons_list_id());
			response.getReasonsId().addAll(Arrays.asList(domainData.getPo_reasons_list_id()));
		}

		return response;
	}

	private GetEMADetailsData setRequestData(GetEMADetailsRequest request, HeaderDetails headerDetails) {
		GetEMADetailsData domainData = new GetEMADetailsData();

		if (headerDetails.getNetworkID() != null)
			domainData.setPi_network_id(headerDetails.getNetworkID());

		return domainData;

	}

}
