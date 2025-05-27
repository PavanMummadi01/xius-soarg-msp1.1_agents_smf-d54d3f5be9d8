package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.EmaCmdRetryUpdateRequest;
import com.xius.agent.smf.smfmanagement.EmaCmdRetryUpdateResponse;
import com.xius.smf.domaindata.EmaCmdRetryUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

import net.bcgi.util.db.SPFactory;

@Service("EmaCmdRetryUpdateimpl")
public class EmaCmdRetryUpdateimpl {

	private  static final Logger logger = LogManager.getLogger(EmaCmdRetryUpdateimpl.class.getSimpleName());

	public EmaCmdRetryUpdateResponse emaCmdRetryUpdate(EmaCmdRetryUpdateRequest request, HeaderDetails headerDetails)
			throws RemoteException, SMFAgentException {

		EmaCmdRetryUpdateResponse response = new EmaCmdRetryUpdateResponse();
		EmaCmdRetryUpdateData domaindata = setRequestData(request, headerDetails);
		SPFactory factory = ServiceUtils.executeSPWithOutCommit("proc_ttsa_ema_cmd_retry_update", domaindata,
				domaindata);

		if (logger.isDebugEnabled()) {
			logger.debug("GetEmaCmdimpl proc_ttsa_ema_cmd_retry_update-ERRORCODE :::" + domaindata.getPo_error_code());

			logger.info(
					"Error Msg from  proc_ttsa_ema_cmd_retry_update  ==>" + domaindata.getPo_error_msg());
		}

		Utilities.commitOrRollback(factory, domaindata.getPo_error_code());

		if (domaindata.getPo_error_code() == 0) {
			response = setWebserviceResponse(domaindata);
		} else {
			throw new SMFAgentException(domaindata.getPo_error_code().toString(), domaindata.getPo_error_desc());
		}

		return response;
	}

	private EmaCmdRetryUpdateResponse setWebserviceResponse(EmaCmdRetryUpdateData domaindata) {

		EmaCmdRetryUpdateResponse response = new EmaCmdRetryUpdateResponse();
		if (domaindata.getPo_error_msg() != null) {
			response.setMessage(domaindata.getPo_error_msg());
		}
		return response;
	}

	private EmaCmdRetryUpdateData setRequestData(EmaCmdRetryUpdateRequest request, HeaderDetails headerDetails) {

		EmaCmdRetryUpdateData data = new EmaCmdRetryUpdateData();
		if (headerDetails.getNetworkID() != null) {
			data.setPi_network_id(headerDetails.getNetworkID());
		}
		if (request.getTransID() != null) {
			data.setPi_transaction_id(request.getTransID());
		}
		if (request.getRetryLoginID() != null) {
			data.setPi_retry_login_id(request.getRetryLoginID());
		}

		return data;
	}
}
