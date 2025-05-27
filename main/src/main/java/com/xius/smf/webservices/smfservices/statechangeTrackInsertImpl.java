package com.xius.smf.webservices.smfservices;


import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.StateChangeTrackInsertRequest;
import com.xius.agent.smf.smfmanagement.StateChangeTrackInsertResponse;
import com.xius.smf.domaindata.statechangeTrackInsertData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("statechangeTrackInsertImpl")
public class statechangeTrackInsertImpl {
	private  static final Logger logger = LogManager.getLogger(statechangeTrackInsertImpl.class.getSimpleName());

	public StateChangeTrackInsertResponse StateChangeTrackInsert(
			StateChangeTrackInsertRequest request, HeaderDetails headerDetails) throws SMFAgentException {
		StateChangeTrackInsertResponse response =new StateChangeTrackInsertResponse();
		statechangeTrackInsertData domainData = null;
domainData = setRequestData(request, headerDetails);
		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_state_change_Track_Insert",domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info(domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from pro_state_change_Track_Insert  ==>" + domainData.getPo_error_code());
			logger.info( "Error Msg from pro_state_change_Track_Insert  ==>" + domainData.getPo_error_desc());
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

	private statechangeTrackInsertData setRequestData(
		StateChangeTrackInsertRequest request, HeaderDetails headerDetails) {
		statechangeTrackInsertData data =  new statechangeTrackInsertData();
		if(headerDetails.getNetworkID()!= null)
		data.setPi_network_id(headerDetails.getNetworkID());
		
		if(headerDetails.getLoginID()!= null)
			data.setPi_username(headerDetails.getLoginID());
		
		if(request.getMsisdn() != null)
			data.setPi_MSISDN(Long.parseLong(request.getMsisdn()));
			
		if(request.getNewSubscrStatus() != null)
		data.setPi_newSubscrStatus(request.getNewSubscrStatus());
		
		if(request.getTransactionId() != null)
			data.setPi_transactionId(request.getTransactionId());
		
		if(request.getReason() != null)
			data.setPi_reason(request.getReason());
		
		if(request.getChannel() != null)
			data.setPi_CHANNELID(request.getChannel());
		return data;
	}

	private StateChangeTrackInsertResponse setWebserviceResponse(
			statechangeTrackInsertData domainData) {
		StateChangeTrackInsertResponse response = new StateChangeTrackInsertResponse();
		response.setMessage(SMFAgentConstants.SUCCESS);
		if(domainData.getPo_transactionRefNum()!=null)
		response.setTransactionRefNum(domainData.getPo_transactionRefNum());
		return response;
	}

}

