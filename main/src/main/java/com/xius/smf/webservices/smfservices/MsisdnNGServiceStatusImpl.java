/**
 * 
 */
package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;



import com.xius.agent.smf.smfmanagement.DetailsType;
import com.xius.agent.smf.smfmanagement.GetMsisdnNGServiceStatusRequest;
import com.xius.agent.smf.smfmanagement.GetMsisdnNGServiceStatusResponse;
import com.xius.smf.domaindata.MsisdnNGServiceStatusCursorData;
import com.xius.smf.domaindata.MsisdnNGServiceStatusData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

/**
 * @author prince.kumar
 * 
 */
@Service("MsisdnNGServiceStatusImpl")
public class MsisdnNGServiceStatusImpl {

	/**
	 * @param request
	 * @param headerDetails
	 * @return
	 */

	private  static final Logger logger = LogManager.getLogger(MsisdnNGServiceStatusImpl.class.getSimpleName());


	public GetMsisdnNGServiceStatusResponse getMsisdnNGServiceStatus(
			GetMsisdnNGServiceStatusRequest request, HeaderDetails headerDetails)
			throws RemoteException, SMFAgentException, com.xius.smf.exceptions.SMFAgentException {
		GetMsisdnNGServiceStatusResponse response = new GetMsisdnNGServiceStatusResponse();
		MsisdnNGServiceStatusData domainData = null;
		domainData = setRequestData(request, headerDetails);

		ServiceUtils._executeStoredProcedure("pro_get_mblser_add_detch_dtls",
				domainData, domainData);

		if (logger.isInfoEnabled() && domainData != null) {

			logger.info(
					"Error Code from pro_get_mblser_add_detch_dtls   ==>"
							+ domainData.getPo_error_code());
			logger.info(
					"Error Msg from pro_insert_sim_act_ext_dtls   ==>"
							+ domainData.getPo_error_desc());
			logger.info(
					
					"DATA from pro_insert_sim_act_ext_dtls   ==>"
							+ domainData.toString());
		}
		if (domainData.getPo_error_code() != 0) {

			throw Utilities.setSMFAgentException(domainData.getPo_error_code().toString(),
					domainData.getPo_error_desc().toString());
		} else {
			response = setWebserviceResponse(domainData);
		}

		return response;

	}

	private MsisdnNGServiceStatusData setRequestData(
			GetMsisdnNGServiceStatusRequest request,
			HeaderDetails headerDetails2) {
		MsisdnNGServiceStatusData domainData = new MsisdnNGServiceStatusData();

		if (headerDetails2.getNetworkID() != null)
			domainData.setPi_network_id(headerDetails2.getNetworkID());

		if (request.getMSISDN() != null)
			domainData.setPi_msisdn_no(request.getMSISDN());

		return domainData;
	}

	private GetMsisdnNGServiceStatusResponse setWebserviceResponse(
			MsisdnNGServiceStatusData domainData) throws SMFAgentException, com.xius.smf.exceptions.SMFAgentException {
		GetMsisdnNGServiceStatusResponse response = new GetMsisdnNGServiceStatusResponse();

		if (domainData != null) {

			DetailsType[] add_detch_dtls_types = null;
			DetailsType det = null;
			MsisdnNGServiceStatusCursorData cur = null;

			if (domainData.getPo_mblservice_add_detch_dtls() != null
					&& domainData.getPo_mblservice_add_detch_dtls().size() > 0
					&& !domainData.getPo_mblservice_add_detch_dtls().isEmpty()) {

				add_detch_dtls_types = new DetailsType[domainData
						.getPo_mblservice_add_detch_dtls().size()];

				for (int iter = 0; iter < domainData
						.getPo_mblservice_add_detch_dtls().size(); iter++) {
					cur = domainData.getPo_mblservice_add_detch_dtls()
							.get(iter);
					det = new DetailsType();

					if (cur.getFourGprovisioned() != null)
						det.setProvisioned4G(cur.getFourGprovisioned()
								.toString());

					if (cur.getFiveGprovisioned() != null)
						det.setProvisioned5G(cur.getFiveGprovisioned()
								.toString());

					if (cur.getReason() != null)
						det.setReason(cur.getReason().toString());

					add_detch_dtls_types[iter] = det;

				}
				response.setDetails(det);
			} else {
				throw Utilities.setSMFAgentException("8888", "No Data Found");
			}

		}

		return response;
	}
}
