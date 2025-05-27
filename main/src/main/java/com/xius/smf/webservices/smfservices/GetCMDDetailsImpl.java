package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.GetCMDDetailsRequest;
import com.xius.agent.smf.smfmanagement.GetCMDDetailsResponse;
import com.xius.smf.domaindata.GetCMDDetailsCursorData;
import com.xius.smf.domaindata.GetCMDDetailsData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

import net.bcgi.util.db.SPFactory;

@Service("GetCMDDetailsImpl")
public class GetCMDDetailsImpl {

	private  static final Logger logger = LogManager.getLogger(GetCMDDetailsImpl.class.getSimpleName());

	public GetCMDDetailsResponse getCMDDetails(GetCMDDetailsRequest request, HeaderDetails headerDetails)
			throws RemoteException, SMFAgentException {

		GetCMDDetailsResponse response = new GetCMDDetailsResponse();

		GetCMDDetailsData domainData = null;
		domainData = setRequestData(request, headerDetails);

		SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_get_cmd_details", domainData, domainData);

		Utilities.commitOrRollback(spfactory, domainData.getPo_error_code());

		if (domainData.getPo_error_code() != 0) {
			throw new SMFAgentException(domainData.getPo_error_code().toString(), domainData.getPo_error_desc());
		} else {
			response = setWebserviceResponse(domainData);
		}

		return response;

	}

	private GetCMDDetailsData setRequestData(GetCMDDetailsRequest request, HeaderDetails headerDetails) {
		GetCMDDetailsData domainData = new GetCMDDetailsData();

		if (headerDetails.getNetworkID() != null)
			domainData.setPi_network_id(headerDetails.getNetworkID());

		return domainData;
	}

	private GetCMDDetailsResponse setWebserviceResponse(GetCMDDetailsData domainData) {
		GetCMDDetailsResponse response = new GetCMDDetailsResponse();

		ArrayList<GetCMDDetailsCursorData> curData = domainData.getPo_cmd_details();

		if (curData != null) {
			String[] emaCommandName = new String[curData.size()];
			String[] emaCommand = new String[curData.size()];

			for (int count = 0; count < curData.size(); count++) {
				GetCMDDetailsCursorData cursor = curData.get(count);

				if (cursor.getCommand_name() != null) {
					emaCommandName[count] = cursor.getCommand_name();
				}

				if (cursor.getCommand() != null) {
					emaCommand[count] = cursor.getCommand();
				}
			}

			// response.setEmaCommandName(emaCommandName);
			// response.setEmaCommand(emaCommand);
			if (emaCommandName != null) {
				response.getEmaCommandName().addAll(Arrays.asList(emaCommandName));
			}
			if (emaCommand != null) {
				response.getEmaCommand().addAll(Arrays.asList(emaCommand));
			}
		} else {
			logger.info("GetCMDDetails cursor Data is NULL");
		}

		return response;
	}
}
