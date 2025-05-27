package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.APITrackerRequest;
import com.xius.agent.smf.smfmanagement.APITrackerResponse;
import com.xius.smf.domaindata.APITrackerData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("APITrackerImpl")
public class APITrackerImpl {
	
	public APITrackerResponse APITracker(APITrackerRequest request,HeaderDetails headerDetails)
	throws RemoteException,SMFAgentException {

	
	APITrackerResponse response=new APITrackerResponse();
	APITrackerData domainData =null;
	
	domainData = setRequestData(request, headerDetails);
	
	SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_api_request_tracker",domainData, domainData);
	
	Utilities.commitOrRollback(factory, domainData.getPo_error_code());
	
	if(domainData.getPo_error_code()==0)
	{
	response=setWebserviceResponse(domainData);
	}
	else
	{
		throw Utilities.setSMFAgentException(domainData.getPo_error_code().toString(), domainData.getPo_error_desc());
	}
	return response;
}
	
	private APITrackerData setRequestData(APITrackerRequest request,
			HeaderDetails headerDetails) {
	
		APITrackerData domainData = new APITrackerData();
		
		if(headerDetails.getNetworkID()!=null)
			domainData.setPi_network_id(headerDetails.getNetworkID());
		
		if(request.getChannel()!=null)
		domainData.setChannel(request.getChannel());
		
		if(request.getApiName()!=null)
		domainData.setApiName(request.getApiName());
		
		if(headerDetails.getLoginID()!=null)
		domainData.setPi_username(headerDetails.getLoginID());
		
		return domainData;
	}
	
	private APITrackerResponse setWebserviceResponse(
			APITrackerData domainData) {
		APITrackerResponse response=new APITrackerResponse();
		
		
		response.setMessage(SMFAgentConstants.SUCCESS);
		
		

		return response;
	}
	
	
}
