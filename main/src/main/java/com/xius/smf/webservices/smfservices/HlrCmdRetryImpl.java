package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.HlrCmdRetryRequest;
import com.xius.agent.smf.smfmanagement.HlrCmdRetryResponse;
import com.xius.smf.domaindata.HlrCmdRetryData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

import net.bcgi.util.db.SPFactory;

@Service("HlrCmdRetryImpl")
public class HlrCmdRetryImpl {

	private  static final Logger logger = LogManager.getLogger(HlrCmdRetryImpl.class.getSimpleName());

	public HlrCmdRetryResponse hlrCmdRetry(HlrCmdRetryRequest request, HeaderDetails headerDetails)
			throws RemoteException, SMFAgentException {

		HlrCmdRetryResponse response = new HlrCmdRetryResponse();
		HlrCmdRetryData domainData = null;

		domainData = setRequestData(request, headerDetails);

		SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_reini_fail_ema_cmd_trans", domainData,
				domainData);

		if (logger.isInfoEnabled()) {

			logger.info("pro_reini_fail_ema_cmd_trans for transId :::::" + ">>" + request.getTransId()
					+ "Error Code ==>" + domainData.getPo_error_code());
			logger.info( "pro_reini_fail_ema_cmd_trans for transId :::::" + ">>" + request.getTransId()
					+ "Error Msg ==>" + domainData.getPo_error_desc());
		}

		Utilities.commitOrRollback(spfactory, domainData.getPo_error_code());

		if (domainData.getPo_error_code() != 0) {

			throw new SMFAgentException(domainData.getPo_error_code().toString(), domainData.getPo_error_desc());
		} else {
			response = setWebserviceResponse(domainData);
		}

		return response;
	}

	private HlrCmdRetryData setRequestData(HlrCmdRetryRequest request, HeaderDetails headerDetails)
			throws RemoteException, SMFAgentException {

		HlrCmdRetryData data = new HlrCmdRetryData();

		if (headerDetails.getNetworkID() != null) {
			data.setPi_network_id(headerDetails.getNetworkID());
		}
		if (request.getTransId() != null) {
			data.setPi_trans_id(request.getTransId());
		}

		return data;
	}

	private HlrCmdRetryResponse setWebserviceResponse(HlrCmdRetryData domainData) {

		HlrCmdRetryResponse response = new HlrCmdRetryResponse();

		response.setMessage(SMFAgentConstants.SUCCESS);

		return response;
	}
}
