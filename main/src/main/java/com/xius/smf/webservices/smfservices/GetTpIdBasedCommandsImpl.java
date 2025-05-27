package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;
import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.CommandlistType;
import com.xius.agent.smf.smfmanagement.GetTpIdBasedCommandsRequest;
import com.xius.agent.smf.smfmanagement.GetTpIdBasedCommandsResponse;
import com.xius.smf.domaindata.EmaFlowCMDSInsertData;
import com.xius.smf.domaindata.GetTpIdBasedCommandsCursorData;
import com.xius.smf.domaindata.GetTpIdBasedCommandsData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

import net.bcgi.util.db.SPFactory;

@Service("GetTpIdBasedCommandsImpl")
public class GetTpIdBasedCommandsImpl {

	private  static final Logger logger = LogManager.getLogger(GetTpIdBasedCommandsImpl.class.getSimpleName());

	public GetTpIdBasedCommandsResponse getTpIdBasedCommands(GetTpIdBasedCommandsRequest request,
			HeaderDetails headerDetails) throws RemoteException, SMFAgentException {

		GetTpIdBasedCommandsResponse response = new GetTpIdBasedCommandsResponse();
		GetTpIdBasedCommandsData domainData = null;
		domainData = setRequestData(request, headerDetails);

		if (request.getFlag() != null
				&& (request.getFlag().equalsIgnoreCase("I") || (request.getFlag().equalsIgnoreCase("G")))) {// ONLY IF
																											// TP REQ
			// RECIVED
			SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_msisdn_tp_cmd_name_ttsa", domainData,
					domainData);

			if (logger.isInfoEnabled()) {

				logger.info( "pro_msisdn_tp_cmd_name_ttsa for msisdn" + ">>" + request.getMsisdn()
						+ "Error Code ==>" + domainData.getPo_error_code());
				logger.info( "pro_msisdn_tp_cmd_name_ttsa for msisdn" + ">>" + request.getMsisdn()
						+ "Error Msg ==>" + domainData.getPo_error_desc());
			}

			Utilities.commitOrRollback(spfactory, domainData.getPo_error_code());

			if (domainData.getPo_error_code() != 0) {

				throw new SMFAgentException(domainData.getPo_error_code().toString(), domainData.getPo_error_desc());
			} else {
				response = setWebserviceResponse(domainData);
			}
		}

		else if (request.getFlag() != null && request.getFlag().equalsIgnoreCase("ATP")
				&& request.getFlowName() != null) {// FOR ATP HLRCODES CASE

			EmaFlowCMDSInsertData emaFlowCMDSInsertData = new EmaFlowCMDSInsertData();
			String[] strArray = request.getFlowName().split(",");

			String[] pi_cmd_names = new String[strArray.length];
			Long[] pi_priorities = new Long[strArray.length];

			for (int i = 0; i < strArray.length; i++) {
				String[] val = strArray[i].split("#");
				logger.info( "pro_ema_flwcmds_ins Inserting commands for ATP HLRCODEs for msisdn " + ">>"
						+ request.getMsisdn() + " command >>" + val[0] + " priority >> " + val[1]);

				pi_cmd_names[i] = val[0];
				System.out.println("pi_cmd_names[i] >>>" + pi_cmd_names[i]);
				if (val[1] != null) {
					pi_priorities[i] = Long.parseLong(val[1]);
				}
				System.out.println("pi_priorities[i] >>>" + pi_priorities[i]);
			}
			emaFlowCMDSInsertData.setPi_network_id(headerDetails.getNetworkID());
			emaFlowCMDSInsertData.setPi_status("P");
			emaFlowCMDSInsertData.setPi_priorities(pi_priorities);
			emaFlowCMDSInsertData.setPi_msisdn(request.getMsisdn());
			emaFlowCMDSInsertData.setPi_flow_name("ATP");
			emaFlowCMDSInsertData.setPi_cmd_names(pi_cmd_names);

			SPFactory spfactory1 = ServiceUtils.executeSPWithOutCommit("pro_ema_flwcmds_ins", emaFlowCMDSInsertData,
					emaFlowCMDSInsertData);

			if (logger.isInfoEnabled()) {

				logger.info( "pro_ema_flwcmds_ins for msisdn" + ">>" + request.getMsisdn()
						+ "Error Code ==>" + domainData.getPo_error_code());
				logger.info( "pro_ema_flwcmds_ins for msisdn" + ">>" + request.getMsisdn()
						+ "Error Msg ==>" + domainData.getPo_error_desc());
			}

			Utilities.commitOrRollback(spfactory1, domainData.getPo_error_code());

			if (emaFlowCMDSInsertData.getPo_error_code() != 0) {

				throw new SMFAgentException(emaFlowCMDSInsertData.getPo_error_code().toString(),
						emaFlowCMDSInsertData.getPo_error_desc());
			} else {
				response = setWebserviceResponse(emaFlowCMDSInsertData, pi_cmd_names, pi_priorities);
			}

		}

		if (domainData != null && domainData.getPo_command_list() != null && domainData.getPo_command_list().size() > 0
				&& request.getFlag() != null && request.getFlag().equalsIgnoreCase("I")) {
			EmaFlowCMDSInsertData emaFlowCMDSInsertData = new EmaFlowCMDSInsertData();
			String[] pi_cmd_names = new String[domainData.getPo_command_list().size()];
			Long[] pi_priorities = new Long[domainData.getPo_command_list().size()];
			GetTpIdBasedCommandsCursorData cur = null;

			for (int i = 0; i < domainData.getPo_command_list().size(); i++) {
				cur = domainData.getPo_command_list().get(i);
				logger.info(
						"pro_ema_flwcmds_ins Inserting commands for msisdn" + ">>" + request.getMsisdn() + " command >>"
								+ cur.getCommand_name() + " priority >> " + cur.getPriority());

				if (cur.getCommand_name() != null) {
					pi_cmd_names[i] = cur.getCommand_name();
				}
				if (cur.getPriority() != null) {
					pi_priorities[i] = cur.getPriority();
				}

			}
			emaFlowCMDSInsertData.setPi_network_id(headerDetails.getNetworkID());
			emaFlowCMDSInsertData.setPi_status("P");
			emaFlowCMDSInsertData.setPi_priorities(pi_priorities);
			emaFlowCMDSInsertData.setPi_msisdn(request.getMsisdn());
			emaFlowCMDSInsertData.setPi_flow_name(request.getFlowName());
			emaFlowCMDSInsertData.setPi_cmd_names(pi_cmd_names);

			SPFactory spfactory1 = ServiceUtils.executeSPWithOutCommit("pro_ema_flwcmds_ins", emaFlowCMDSInsertData,
					emaFlowCMDSInsertData);

			if (logger.isInfoEnabled()) {

				logger.info( "pro_ema_flwcmds_ins for msisdn" + ">>" + request.getMsisdn()
						+ "Error Code ==>" + domainData.getPo_error_code());
				logger.info( "pro_ema_flwcmds_ins for msisdn" + ">>" + request.getMsisdn()
						+ "Error Msg ==>" + domainData.getPo_error_desc());
			}

			Utilities.commitOrRollback(spfactory1, domainData.getPo_error_code());

			if (emaFlowCMDSInsertData.getPo_error_code() != 0) {

				throw new SMFAgentException(emaFlowCMDSInsertData.getPo_error_code().toString(),
						emaFlowCMDSInsertData.getPo_error_desc());
			} else {
				response = setWebserviceResponse(emaFlowCMDSInsertData, pi_cmd_names, pi_priorities);
			}

		}

		return response;
	}

	private GetTpIdBasedCommandsResponse setWebserviceResponse(GetTpIdBasedCommandsData domainData) {

		GetTpIdBasedCommandsResponse response = new GetTpIdBasedCommandsResponse();
		CommandlistType[] commandlistType = null;
		CommandlistType obj = null;
		GetTpIdBasedCommandsCursorData cur = null;

		if (domainData != null) {

			if (domainData.getPo_command_list() != null && domainData.getPo_command_list().size() > 0) {

				commandlistType = new CommandlistType[domainData.getPo_command_list().size()];

				for (int i = 0; i < domainData.getPo_command_list().size(); i++) {
					cur = domainData.getPo_command_list().get(i);
					obj = new CommandlistType();

					if (cur.getCommand_name() != null) {
						obj.setCommandname(cur.getCommand_name());
					}
					if (cur.getPriority() != null) {
						obj.setPriority(cur.getPriority().toString());
					}
					commandlistType[i] = obj;
				}
			}
			if (commandlistType != null) {
				// response.setCommandlist(commandlistType);
				response.getCommandlist().addAll(Arrays.asList(commandlistType));
			}
		}
		response.setMessage(domainData.getPo_error_desc());

		return response;
	}

	private GetTpIdBasedCommandsResponse setWebserviceResponse(EmaFlowCMDSInsertData domainData, String[] pi_cmd_names,
			Long[] pi_priorities) {

		GetTpIdBasedCommandsResponse response = new GetTpIdBasedCommandsResponse();
		CommandlistType[] commandlistType = null;
		CommandlistType obj = null;

		if (domainData != null) {

			if (pi_cmd_names != null && pi_cmd_names.length > 0) {

				commandlistType = new CommandlistType[pi_cmd_names.length];

				for (int i = 0; i < pi_cmd_names.length; i++) {

					obj = new CommandlistType();

					if (pi_cmd_names[i] != null) {
						obj.setCommandname(pi_cmd_names[i]);
					}
					if (pi_priorities[i] != null) {
						obj.setPriority(pi_priorities[i] + "");
					}
					commandlistType[i] = obj;
				}
			}
			if (commandlistType != null) {
				// response.setCommandlist(commandlistType);
				response.getCommandlist().addAll(Arrays.asList(commandlistType));
			}
		}
		response.setMessage(domainData.getPo_error_desc());

		return response;
	}

	private GetTpIdBasedCommandsData setRequestData(GetTpIdBasedCommandsRequest request, HeaderDetails headerDetails) {

		GetTpIdBasedCommandsData data = new GetTpIdBasedCommandsData();
		if (headerDetails.getNetworkID() != null) {
			data.setPi_network_id(headerDetails.getNetworkID());
		}
		if (request.getMsisdn() != null) {
			data.setPi_msisdn_no(Long.parseLong(request.getMsisdn()));
		}
		if (request.getTariffPackageId() != null) {
			data.setPi_tp_id(Long.parseLong(request.getTariffPackageId()));
		}
		if (request.getNewTariffPackageId() != null) {
			data.setPi_newtp_id(Long.parseLong(request.getNewTariffPackageId()));
		}

		return data;
	}
}
