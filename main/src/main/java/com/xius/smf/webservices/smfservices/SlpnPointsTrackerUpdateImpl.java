package com.xius.smf.webservices.smfservices;

import java.math.BigDecimal;
import java.rmi.RemoteException;

import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.SlpnPointsTrackerUpdateRequest;
import com.xius.agent.smf.smfmanagement.SlpnPointsTrackerUpdateResponse;
import com.xius.smf.domaindata.SlpnPointsTrackerData;
import com.xius.smf.domaindata.SlpnPointsTrackerUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("SlpnPointsTrackerUpdateImpl")
public class SlpnPointsTrackerUpdateImpl {
	
	
	
	public SlpnPointsTrackerUpdateResponse slpnPointsTrackerUpdate(
			SlpnPointsTrackerUpdateRequest request, HeaderDetails header) throws RemoteException,SMFAgentException {
		
		SlpnPointsTrackerUpdateResponse response = new SlpnPointsTrackerUpdateResponse();
		SlpnPointsTrackerUpdateData domainData =null;
		
		domainData = setRequestData(request, header);
		
		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_atp_subscription_stus_upd",domainData, domainData);
		
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
	
	
	private SlpnPointsTrackerUpdateData setRequestData(SlpnPointsTrackerUpdateRequest request,
			HeaderDetails headerDetails) {
	
		SlpnPointsTrackerUpdateData domainData = new SlpnPointsTrackerUpdateData();
		
		if(headerDetails.getNetworkID()!=null)
			domainData.setPi_network_id(headerDetails.getNetworkID());
		
		if(request.getTransactionId()!=null)
		domainData.setPi_transaction_id(request.getTransactionId());
		
		if(request.getExtErrorCode()!=null)
		domainData.setPi_ext_error_code(Long.parseLong(request.getExtErrorCode()));
		
		if(request.getStatus()!=null)
		domainData.setPi_status(request.getStatus());
		
		if(request.getRemarks()!=null)
		domainData.setPi_remarks(request.getRemarks());
		
		return domainData;
	}
	
	
	private SlpnPointsTrackerUpdateResponse setWebserviceResponse(
			SlpnPointsTrackerUpdateData domainData) {
		SlpnPointsTrackerUpdateResponse response=new SlpnPointsTrackerUpdateResponse();
		
		
		response.setMessage(SMFAgentConstants.SUCCESS);
		
		

		return response;
	}
	
	

}
