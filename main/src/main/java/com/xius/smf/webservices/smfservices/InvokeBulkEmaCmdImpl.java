package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.InvokeBulkEmaCmdRequest;
import com.xius.agent.smf.smfmanagement.InvokeBulkEmaCmdResponse;
import com.xius.smf.domaindata.InvokeBulkEmaCmdData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;


import net.bcgi.util.db.SPFactory;

@Service("InvokeBulkEmaCmdImpl")
public class InvokeBulkEmaCmdImpl {

	private  static final Logger logger = LogManager.getLogger(InvokeBulkEmaCmdImpl.class.getSimpleName());

	public InvokeBulkEmaCmdResponse InvokeBulkEmaCmd(InvokeBulkEmaCmdRequest request, HeaderDetails headerDetails)

			throws RemoteException, SMFAgentException {

		InvokeBulkEmaCmdResponse response = new InvokeBulkEmaCmdResponse();

		InvokeBulkEmaCmdData domainData = null;

		domainData = setRequestData(request, headerDetails);

		SPFactory factory = ServiceUtils.executeSPWithOutCommit("pro_ttsa_ema_cmd_bulk_insert", domainData, domainData);

		if (logger.isDebugEnabled()) {
			logger.debug(
					"EmaFlowInsertImpl pro_ttsa_ema_cmd_bulk_insert-ERRORCODE :::" + domainData.getPo_error_code());
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

	private InvokeBulkEmaCmdData setRequestData(InvokeBulkEmaCmdRequest request, HeaderDetails headerDetails) {

		InvokeBulkEmaCmdData domainData = new InvokeBulkEmaCmdData();

		if (headerDetails.getNetworkID() != null)
			domainData.setPi_network_id(headerDetails.getNetworkID());

		if (headerDetails.getLoginID() != null)
			domainData.setPi_login_id(headerDetails.getLoginID());

		if (request.getMSISDN() != null) {
			List<String> msisdn=request.getMSISDN();
			domainData.setPi_msisdn(msisdn.toArray(new String[0]));
		}
		if (request.getCommandName() != null) {
			domainData.setPi_command_name(request.getCommandName());
		}
		if (request.getReason() != null) {
			List<String> reason=request.getReason();
			domainData.setPi_reason_arr(reason.toArray(new String[0]));
		} else {
			String[] reason = new String[request.getMSISDN().size()];
			domainData.setPi_reason_arr(reason);
		}

		return domainData;
	}

	private InvokeBulkEmaCmdResponse setWebserviceResponse(InvokeBulkEmaCmdData domainData) {
		InvokeBulkEmaCmdResponse response = new InvokeBulkEmaCmdResponse();

		if (domainData.getPo_transaction_id() != null)
			response.setTransactionID(domainData.getPo_transaction_id());

		if (logger.isDebugEnabled()) {
			logger.debug("TransactionNumber ==> " + response.getTransactionID());
		}
		return response;
	}

}
