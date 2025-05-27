package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.GetChangeMdnStatusRequest;
import com.xius.agent.smf.smfmanagement.GetChangeMdnStatusResponse;
import com.xius.smf.domaindata.GetChangeMdnStatusData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

import net.bcgi.util.db.SPFactory;

@Service("GetChangeMdnStatusImpl")
public class GetChangeMdnStatusImpl {
	private  static final Logger logger = LogManager.getLogger(GetChangeMdnStatusImpl.class.getSimpleName());

	public GetChangeMdnStatusResponse GetChangeMdnStatus(GetChangeMdnStatusRequest request, HeaderDetails headerDetails)

			throws RemoteException, SMFAgentException {

		GetChangeMdnStatusResponse response = new GetChangeMdnStatusResponse();

		GetChangeMdnStatusData domainData = null;

		domainData = setRequestData(request, headerDetails);

		SPFactory factory = ServiceUtils.executeSPWithOutCommit("pro_get_change_msisdn_dtls", domainData, domainData);

		if (logger.isDebugEnabled()) {
			logger.debug(
					"GetChangeMdnStatusImpl pro_get_change_msisdn_dtls-ERRORCODE :::" + domainData.getPo_error_code());
		}

		Utilities.commitOrRollback(factory, domainData.getPo_error_code());

		if (domainData.getPo_error_code() == 0) {
			response = setWebserviceResponse(domainData);
		} else {
			throw new SMFAgentException(domainData.getPo_error_code().toString(), domainData.getPo_error_desc());
		}
		return response;
	}

	private GetChangeMdnStatusData setRequestData(GetChangeMdnStatusRequest request, HeaderDetails headerDetails) {

		GetChangeMdnStatusData domainData = new GetChangeMdnStatusData();

		if (headerDetails.getNetworkID() != null)
			domainData.setPi_network_id(headerDetails.getNetworkID());

		if (headerDetails.getLoginID() != null)
			domainData.setPi_userid(headerDetails.getLoginID());

		if (request.getTransID() != null) {
			domainData.setPi_trans_id(request.getTransID());
		}

		if (request.getTransactionID() != null) {
			domainData.setPi_ext_trans_id(request.getTransactionID());
		}

		return domainData;
	}

	private GetChangeMdnStatusResponse setWebserviceResponse(GetChangeMdnStatusData domainData) {
		GetChangeMdnStatusResponse response = new GetChangeMdnStatusResponse();

		if (domainData.getPo_status() != null)
			response.setStatus(domainData.getPo_status());
		return response;
	}

}
