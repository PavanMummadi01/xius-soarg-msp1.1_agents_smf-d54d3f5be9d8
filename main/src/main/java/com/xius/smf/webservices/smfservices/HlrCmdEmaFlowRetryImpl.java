package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.HlrCmdEmaFlowRetryRequest;
import com.xius.agent.smf.smfmanagement.HlrCmdEmaFlowRetryResponse;
import com.xius.smf.domaindata.HlrCmdEmaFlowRetryData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

import net.bcgi.util.db.SPFactory;

@Service("HlrCmdEmaFlowRetryImpl")
public class HlrCmdEmaFlowRetryImpl {

	private  static final Logger logger = LogManager.getLogger(HlrCmdEmaFlowRetryImpl.class.getSimpleName());

	public HlrCmdEmaFlowRetryResponse hlrCmdEmaFlow(HlrCmdEmaFlowRetryRequest request, HeaderDetails headerDetails)
			throws RemoteException, SMFAgentException {

		HlrCmdEmaFlowRetryResponse response = new HlrCmdEmaFlowRetryResponse();
		HlrCmdEmaFlowRetryData domainData = null;

		domainData = setRequestData(request, headerDetails);

		SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_reini_fail_emaflow_trans", domainData,
				domainData);

		if (logger.isInfoEnabled()) {

			logger.info( "pro_reini_fail_emaflow_trans for transId :::::" + ">>" + request.getTransId()
					+ "Error Code ==>" + domainData.getPo_error_code());
			logger.info( "pro_reini_fail_emaflow_trans for transId :::::" + ">>" + request.getTransId()
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

	private HlrCmdEmaFlowRetryData setRequestData(HlrCmdEmaFlowRetryRequest request,
			HeaderDetails headerDetails)throws RemoteException, SMFAgentException{

		HlrCmdEmaFlowRetryData data = new HlrCmdEmaFlowRetryData();

		if (headerDetails.getNetworkID() != null) {
			data.setPi_network_id(headerDetails.getNetworkID());
		}
		if (request.getTransId()!= null) {
			data.setPi_trans_id(request.getTransId());
		}

		logger.info( "HlrCmdEmaFlowRetryImpl request Success..."+data.getPi_trans_id());
		
		return data;
	}

	private HlrCmdEmaFlowRetryResponse setWebserviceResponse(HlrCmdEmaFlowRetryData domainData) {

		HlrCmdEmaFlowRetryResponse response = new HlrCmdEmaFlowRetryResponse();

		response.setMessage(SMFAgentConstants.SUCCESS);

		return response;
	}
}
