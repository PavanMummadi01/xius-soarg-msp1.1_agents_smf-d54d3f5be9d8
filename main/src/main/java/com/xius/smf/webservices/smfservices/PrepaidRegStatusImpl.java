/**
 * 
 */
package com.xius.smf.webservices.smfservices;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.PrepaidRegStatusRequest;
import com.xius.agent.smf.smfmanagement.PrepaidRegStatusResponse;
import com.xius.agent.smf.smfmanagement.RegStatusInfoListtype;
import com.xius.smf.domaindata.PrepaidRegStatusData;
import com.xius.smf.domaindata.PrepaidRegStatusRefCurData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;


import net.bcgi.util.db.SPFactory;

@Service("PrepaidRegStatusImpl")
public class PrepaidRegStatusImpl {
	private  static final Logger logger = LogManager.getLogger(PrepaidRegStatusImpl.class.getSimpleName());
	SPFactory spFactory = null;

	private PrepaidRegStatusData setMOSRequest(PrepaidRegStatusRequest request, HeaderDetails headerDetails)
			throws SMFAgentException {
		PrepaidRegStatusData data = new PrepaidRegStatusData();

		if (null != headerDetails.getNetworkID()) {
			data.setPi_network_id(headerDetails.getNetworkID());
		}
		if (null != request.getMsisdn()) {
			data.setPi_msisdn_no(Long.parseLong(request.getMsisdn()));
		}
		if (null != request.getSIMNumber()) {
			data.setPi_sim_serial_no(request.getSIMNumber());
		}
		if (null != request.getTransRefferenceID()) {
			data.setPio_trans_id(request.getTransRefferenceID());
		}
		if (request.getAdditionalInput1() != null) {
			data.setPi_ext_transid(request.getAdditionalInput1());
		}

		return data;
	}

	public PrepaidRegStatusResponse PrepaidRegStatus(PrepaidRegStatusRequest request, HeaderDetails headerDetails)
			throws SMFAgentException {

		PrepaidRegStatusResponse response = new PrepaidRegStatusResponse();

		PrepaidRegStatusData domainData = setMOSRequest(request, headerDetails);
		if (logger.isDebugEnabled()) {

			logger.debug( domainData.toString());
		}

		if (request.getAdditionalInput1() != null) {
			spFactory = ServiceUtils.executeSPWithOutCommit("pro_sim_reg_status_exttrans_pre", domainData, domainData);
		} else {
			spFactory = ServiceUtils.executeSPWithOutCommit("pro_sim_reg_status", domainData, domainData);
		}

		if (logger.isInfoEnabled()) {

			logger.info( "Error Code ==>" + domainData.getPo_error_code());
			logger.info( "Error Msg ==>" + domainData.getPo_error_desc());
		}

		Utilities.commitOrRollback(spFactory, domainData.getPo_error_code());

		if (null != domainData.getPo_error_code() && domainData.getPo_error_code() != 0) {

			throw new SMFAgentException(domainData.getPo_error_code().toString(), domainData.getPo_error_desc());

		} else {

			/**
			 * Set response
			 */
			response = setWebserviceResponse(domainData, request);

		}
		return response;
	}

	private PrepaidRegStatusResponse setWebserviceResponse(PrepaidRegStatusData domainData,
			PrepaidRegStatusRequest request) {

		PrepaidRegStatusResponse response = new PrepaidRegStatusResponse();
		RegStatusInfoListtype resp = null;
		PrepaidRegStatusRefCurData dbData = null;
		List<PrepaidRegStatusRefCurData> curData = domainData.getPo_sim_reg_status();
		RegStatusInfoListtype[] regList = null;
		if (curData != null) {
			regList = new RegStatusInfoListtype[curData.size()];
			logger.info(" pro_sim_reg_status cursor size is:" + curData.size());
		}
		if (curData != null && curData.size() > 0) {
			for (int i = 0; i < curData.size(); i++) {

				dbData = new PrepaidRegStatusRefCurData();
				resp = new RegStatusInfoListtype();

				dbData = curData.get(i);

				if (dbData.getMsisdn_no() != null)
					resp.setMsisdn(dbData.getMsisdn_no().toString());

				if (dbData.getSim_serial_no() != null)
					resp.setSIMNumber(dbData.getSim_serial_no());

				if (dbData.getStatus() != null) {

					if (dbData.getStatus().contains("SUCCESS")) {
						resp.setStatus("SUCCESS");
					} else {
						resp.setStatus(dbData.getStatus());
					}

				}

				regList[i] = resp;

			}
			response.setTransStatus(0);
			response.setRespCode(0);
			response.setRespDescription(SMFAgentConstants.SUCCESS);
			if (regList != null) {
				// response.setRegStatusInfo(regList);
				response.getRegStatusInfo().addAll(Arrays.asList(regList));
			}

		} else {
			logger.info(" PrepaidRegStatusRefCurData is null");
			response.setTransStatus(1);
			response.setRespCode(1);
			response.setRespDescription(SMFAgentConstants.FAILURE);
		}
		response.setTransRefferenceID(domainData.getPio_trans_id());

		if (logger.isDebugEnabled()) {

			StringBuilder builder = new StringBuilder();
			builder.append(":TransRefferenceID").append(response.getTransRefferenceID());
			builder.append(":RespDescription").append(response.getRespDescription());

			logger.debug( builder.toString());
		}

		return response;
	}
}
