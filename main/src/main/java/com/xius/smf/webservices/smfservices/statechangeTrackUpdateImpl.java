package com.xius.smf.webservices.smfservices;


import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.StateChangeTrackUpdateRequest;
import com.xius.agent.smf.smfmanagement.StateChangeTrackUpdateResponse;
import com.xius.smf.domaindata.statechangeTrackUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("statechangeTrackUpdateImpl")
public class statechangeTrackUpdateImpl {
	private  static final Logger logger = LogManager.getLogger(statechangeTrackUpdateImpl.class.getSimpleName());

	public StateChangeTrackUpdateResponse StateChangeTrackUpdate(
			StateChangeTrackUpdateRequest request, HeaderDetails headerDetails) throws SMFAgentException {
		StateChangeTrackUpdateResponse response =new StateChangeTrackUpdateResponse();
		statechangeTrackUpdateData domainData = null;
domainData = setRequestData(request, headerDetails);
		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_state_change_Track_Update",domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from pro_state_change_Track_Insert  ==>" + domainData.getPo_error_code());
			logger.info("Error Msg from pro_state_change_Track_Insert  ==>" + domainData.getPo_error_desc());
		}
		if(domainData.getPo_error_code()==0)
		{
			response=setWebserviceResponse(domainData);
		}
		
		else
		{
			throw new SMFAgentException(domainData.getPo_error_code()+toString(), domainData.getPo_error_desc());
		}

		return response;
	}

	private statechangeTrackUpdateData setRequestData(
		StateChangeTrackUpdateRequest request, HeaderDetails headerDetails) {
		statechangeTrackUpdateData data =  new statechangeTrackUpdateData();
		if(headerDetails.getNetworkID()!= null)
		data.setPi_network_id(headerDetails.getNetworkID());
		
		if(request.getMsisdn() != null)
		data.setPi_MSISDN(Long.parseLong(request.getMsisdn()));
		
		if(request.getTransactionRefNum() != null)
			data.setPi_transactionRefNum(request.getTransactionRefNum());
		
		if(request.getOldSubcrStatus() != null)
			data.setPi_oldSubcrStatus(request.getOldSubcrStatus());
		
		if(request.getRemarks() != null)
			data.setPi_remarks(request.getRemarks());
		
		if(request.getStatus() != null)
			data.setPi_status(request.getStatus());
		
		return data;
	}

	private StateChangeTrackUpdateResponse setWebserviceResponse(
			statechangeTrackUpdateData domainData) {
		StateChangeTrackUpdateResponse response = new StateChangeTrackUpdateResponse();
		response.setMessage(SMFAgentConstants.SUCCESS);
		return response;
	}

}

