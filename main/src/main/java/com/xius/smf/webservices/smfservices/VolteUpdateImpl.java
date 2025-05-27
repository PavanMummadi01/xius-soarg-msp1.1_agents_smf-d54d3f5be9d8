package com.xius.smf.webservices.smfservices;


import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.VolteUpdateRequest;
import com.xius.agent.smf.smfmanagement.VolteUpdateResponse;
import com.xius.smf.domaindata.VolteUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("VolteUpdateImpl")
public class VolteUpdateImpl {
	private  static final Logger logger = LogManager.getLogger(VolteUpdateImpl.class.getSimpleName());

	public VolteUpdateResponse volteUpdate(
			VolteUpdateRequest request, HeaderDetails headerDetails) throws SMFAgentException {
		VolteUpdateResponse response =new VolteUpdateResponse();
		VolteUpdateData domainData = null;
domainData = setRequestData(request, headerDetails);
		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_lte_srvc_update",domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from pro_lte_srvc_update  ==>" + domainData.getPo_error_code());
			logger.info( "Error Msg from pro_lte_srvc_update  ==>" + domainData.getPo_error_desc());
		}
		if(domainData.getPo_error_code()==0)
		{
			response=setWebserviceResponse(domainData);
		}
		
		else
		{
			throw new SMFAgentException(String.valueOf(domainData.getPo_error_code()), domainData.getPo_error_desc());
		}

		return response;
	}

	private VolteUpdateData setRequestData(
		VolteUpdateRequest request, HeaderDetails headerDetails) {
		VolteUpdateData data =  new VolteUpdateData();
		if(headerDetails.getNetworkID()!= null)
		data.setPi_network_id(headerDetails.getNetworkID());
		if(request.getTransactionId() != null)
		data.setPi_trans_id(Long.parseLong(request.getTransactionId()));
		if(request.getStatus() != null)
		data.setPi_status(request.getStatus());
		if(request.getRemarks() != null)
		data.setPi_remarks(request.getRemarks());
		return data;
	}

	private VolteUpdateResponse setWebserviceResponse(
			VolteUpdateData domainData) {
		VolteUpdateResponse response = new VolteUpdateResponse();
		response.setMessage(SMFAgentConstants.SUCCESS);
		
		return response;
	}

}

