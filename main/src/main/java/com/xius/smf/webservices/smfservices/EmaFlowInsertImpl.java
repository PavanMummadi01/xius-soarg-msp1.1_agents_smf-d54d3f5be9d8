package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.EmaFlowInsertRequest;
import com.xius.agent.smf.smfmanagement.EmaFlowInsertResponse;
import com.xius.smf.domaindata.EmaFlowInsertData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

import net.bcgi.util.db.SPFactory;

@Service("EmaFlowInsertImpl")
public class EmaFlowInsertImpl {
	private  static final Logger logger = LogManager.getLogger(EmaFlowInsertImpl.class.getSimpleName());

	public EmaFlowInsertResponse EmaFlowInsert(EmaFlowInsertRequest request, HeaderDetails headerDetails)

			throws RemoteException, SMFAgentException {

		EmaFlowInsertResponse response = new EmaFlowInsertResponse();

		EmaFlowInsertData domainData = null;

		domainData = setRequestData(request, headerDetails);

		SPFactory factory = ServiceUtils.executeSPWithOutCommit("pro_ema_flow_ins_req", domainData, domainData);

		if (logger.isDebugEnabled()) {
			logger.debug("EmaFlowInsertImpl pro_ema_flow_ins_req-ERRORCODE :::" + domainData.getPo_error_code());
			logger.info( "Error Msg ==>" + domainData.getPo_error_desc());
		}

		Utilities.commitOrRollback(factory, domainData.getPo_error_code());

		if (domainData.getPo_error_code() == 0) {
			response = setWebserviceResponse(domainData);
		} else {
			throw new SMFAgentException(domainData.getPo_error_code().toString(), domainData.getPo_error_desc());
		}
		return response;
	}

	private EmaFlowInsertData setRequestData(EmaFlowInsertRequest request, HeaderDetails headerDetails) {

		EmaFlowInsertData domainData = new EmaFlowInsertData();

		if (headerDetails.getNetworkID() != null)
			domainData.setPi_network_id(headerDetails.getNetworkID());

		if (request.getMSISDN() != null) {
			domainData.setPi_msisdn(request.getMSISDN());
		}
		if (request.getNewMSISDN() != null) {
			domainData.setPi_new_msisdn(request.getNewMSISDN());
		}
		if (request.getIMSI() != null) {
			domainData.setPi_imsi(request.getIMSI());
		}
		if (request.getNewIMSI() != null) {
			domainData.setPi_new_imsi(request.getNewIMSI());
		}
		if (request.getStatus() != null) {
			domainData.setPi_status(request.getStatus());
		}
		if (request.getFlowName() != null) {
			domainData.setPi_flow_name(request.getFlowName());
		}
		return domainData;
	}

	private EmaFlowInsertResponse setWebserviceResponse(EmaFlowInsertData domainData) {
		EmaFlowInsertResponse response = new EmaFlowInsertResponse();

		if (domainData.getPo_trans_id() != null)
			response.setTransID(domainData.getPo_trans_id());

		if (logger.isDebugEnabled()) {
			logger.debug("TransactionNumber ==> " + response.getTransID());
		}
		return response;
	}

}
