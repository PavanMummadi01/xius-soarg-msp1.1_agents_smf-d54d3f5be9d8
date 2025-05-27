package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.GetInvokeEmaCmdStatusRequest;
import com.xius.agent.smf.smfmanagement.GetInvokeEmaCmdStatusResponse;
import com.xius.smf.domaindata.GetEmaCmdData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

import net.bcgi.util.db.SPFactory;

@Service("GetInvokeEmaCmdStatusimpl")
public class GetInvokeEmaCmdStatusimpl {
	private  static final Logger logger = LogManager.getLogger(GetInvokeEmaCmdStatusimpl.class.getSimpleName());

	public GetInvokeEmaCmdStatusResponse getEmaCmdStatus(GetInvokeEmaCmdStatusRequest request,
			HeaderDetails headerDetails) throws RemoteException, SMFAgentException {

		GetInvokeEmaCmdStatusResponse response = new GetInvokeEmaCmdStatusResponse();
		GetEmaCmdData domaindata = setRequestData(request, headerDetails);

		SPFactory factory = ServiceUtils.executeSPWithOutCommit("pro_get_invoke_ema_cmd_status", domaindata,
				domaindata);

		if (logger.isDebugEnabled()) {
			logger.debug("GetEmaCmdimpl pro_get_invoke_ema_cmd_status-ERRORCODE :::" + domaindata.getPo_error_code());

			logger.info(
					"Error Msg from  pro_get_invoke_ema_cmd_status  ==>" + domaindata.getPo_error_msg());
		}

		Utilities.commitOrRollback(factory, domaindata.getPo_error_code());

		if (domaindata.getPo_error_code() == 0) {
			response = setWebserviceResponse(domaindata);
		} else {
			throw new SMFAgentException(domaindata.getPo_error_code().toString(), domaindata.getPo_error_desc());
		}

		return response;
	}

	private GetInvokeEmaCmdStatusResponse setWebserviceResponse(GetEmaCmdData domaindata) {

		GetInvokeEmaCmdStatusResponse response = new GetInvokeEmaCmdStatusResponse();

		if (domaindata.getPo_status() != null) {
			response.setStatus(domaindata.getPo_status());
		}
		return response;
	}

	private GetEmaCmdData setRequestData(GetInvokeEmaCmdStatusRequest request, HeaderDetails headerDetails) {

		GetEmaCmdData data = new GetEmaCmdData();
		if (headerDetails.getNetworkID() != null) {
			data.setPi_network_id(headerDetails.getNetworkID());
		}
		if (request.getTransID() != null) {
			data.setPi_transaction_id(request.getTransID());
		}

		return data;
	}
}
