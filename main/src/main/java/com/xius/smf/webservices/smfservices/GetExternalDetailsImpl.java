package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.GetExternalDetailsRequest;
import com.xius.agent.smf.smfmanagement.GetExternalDetailsResponse;
import com.xius.smf.domaindata.GetExternalDetailsData;
import com.xius.smf.domaindata.GetExternalDetailsRefCursorData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("GetExternalDetailsImpl")
public class GetExternalDetailsImpl {
	private  static final Logger logger = LogManager.getLogger(GetExternalDetailsImpl.class.getSimpleName());

	public GetExternalDetailsResponse getExternalDetails(
			GetExternalDetailsRequest request, HeaderDetails headerDetails)
			throws RemoteException, SMFAgentException {

		GetExternalDetailsResponse response = new GetExternalDetailsResponse();

		GetExternalDetailsData domainData = null;

		domainData = setRequestData(request, headerDetails);
		SPFactory factory = ServiceUtils.executeSPWithOutCommit(
				"pro_get_external_dtls", domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info(
					"Error Code from  pro_get_external_dtls_api  ==>"
							+ domainData.getPo_error_code());
			logger.info(
					"Error Msg from  pro_get_external_dtls_api  ==>"
							+ domainData.getPo_error_desc());
		}
		if (domainData.getPo_error_code() == 0) {
			response = setWebserviceResponse(domainData);
		}

		else {
			throw new SMFAgentException(domainData.getPo_error_code().toString(),
					domainData.getPo_error_desc());
		}

		return response;

	}

	private GetExternalDetailsData setRequestData(
			GetExternalDetailsRequest request, HeaderDetails headerDetails2) {
		GetExternalDetailsData domainData = new GetExternalDetailsData();

		if (headerDetails2.getNetworkID() != null)
			domainData.setPi_network_id(headerDetails2.getNetworkID());
		if (headerDetails2.getLoginID() != null)
			domainData.setPi_username(headerDetails2.getLoginID());

		
		if (request.getIDValue() != null)
			domainData.setPi_id_value(request.getIDValue());

		if (request.getMSISDN() != null)
			domainData.setPi_msisdn_no(Long.parseLong(request.getMSISDN()));

		if (request.getSIMNo() != null)
			domainData.setPi_sim_no(request.getSIMNo());

		logger.info("request seting to DomainData");
		return domainData;
	}

	private GetExternalDetailsResponse setWebserviceResponse(
			GetExternalDetailsData domainData) {
		GetExternalDetailsResponse response = new GetExternalDetailsResponse();

		if (domainData.getPo_external_dtls() != null) {
			logger.info("setWebresponse......domainData.getPo_external_dtls()"
					+ domainData.getPo_external_dtls().size());

			ArrayList<GetExternalDetailsRefCursorData> curData = domainData
					.getPo_external_dtls();

			if (curData != null) {

				for (int iter = 0; iter < curData.size(); iter++) {

					logger.info("setWebresponse......domainData.getPo_external_dtls()"
							+ domainData.getPo_external_dtls().get(iter));
					
					GetExternalDetailsRefCursorData cur = curData.get(iter);
					
					if(cur.getExecuted_date()!=null)
					response.setExecutedDate(cur.getExecuted_date());
					
					if(cur.getExternal_id()!=null)
					response.setExternalID(cur.getExternal_id());
					
					if(cur.getId_type()!=null)
					response.setIDType(cur.getId_type());
					
					if(cur.getId_value()!=null)
					response.setIDValue(cur.getId_value());
					
					if(cur.getInserted_date()!=null)
					response.setInsertDate(cur.getInserted_date());
					
					if(cur.getInvoker_id()!=null)
					response.setInvokerID(cur.getInvoker_id());
					
					if(cur.getMsisdn_no()!=null)
					response.setMSISDN(cur.getMsisdn_no().toString());
					
					if(cur.getSim_no()!=null)
					response.setSIMNo(cur.getSim_no());
					
					if(cur.getProcess_flag()!=null)
					response.setStatus(cur.getProcess_flag());
					
					if(cur.getTariffplan_id()!=null)
					response.setTPID(cur.getTariffplan_id());
					
					if(cur.getForce_action_flag()!=null)
					response.setForceActFlag(cur.getForce_action_flag());
					
					if(cur.getExtarnal_trans_id()!=null)
					response.setTransRefNumber(cur.getExtarnal_trans_id());
				}
			}
		} else {
			logger.info("GetExternalDetails cursor Data  is NUll");
		}

		return response;
	}

}
