package com.xius.smf.webservices.smfservices;

import java.math.BigDecimal;
import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.SlpnPointsTrackerRequest;
import com.xius.agent.smf.smfmanagement.SlpnPointsTrackerResponse;
import com.xius.smf.domaindata.SlpnPointsTrackerData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("SlpnPointsTrackerImpl")
public class SlpnPointsTrackerImpl {
	private  static final Logger logger = LogManager.getLogger(SlpnPointsTrackerImpl.class.getSimpleName());

	
	
	public SlpnPointsTrackerResponse slpnPointsTracker(
			SlpnPointsTrackerRequest request,HeaderDetails header) throws RemoteException,SMFAgentException {
		
		SlpnPointsTrackerResponse response = new SlpnPointsTrackerResponse();
		SlpnPointsTrackerData domainData =null;
		
		domainData = setRequestData(request, header);
		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_atp_slpn_subscription_req",domainData, domainData);
		
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		
		if(domainData.getPo_error_code()==0)
		{

			response=setWebserviceResponse(domainData);
			
			}
		else
		{
			throw Utilities.setSMFAgentException(domainData.getPo_error_code().toString(), domainData.getPo_error_desc());
			
		}
		
		
		
		
	return response	;
	}
	
	
	private SlpnPointsTrackerData setRequestData(SlpnPointsTrackerRequest request,
			HeaderDetails headerDetails) {
	
		SlpnPointsTrackerData domainData = new SlpnPointsTrackerData();
		
		if(headerDetails.getNetworkID()!=null)
			domainData.setPi_network_id(headerDetails.getNetworkID());
		
		if(request.getMsisdn()!=null)
			domainData.setPi_msisdn_no(Long.parseLong(request.getMsisdn().trim()));
				
		if(request.getPublicityId()!=null)
			domainData.setPi_publicity_id(request.getPublicityId().trim());
		
		if(request.getClientId()!=null)
		domainData.setPi_client_id(request.getClientId());
		
		if(request.getOperation()!=null)
		domainData.setPi_operation(request.getOperation());
		
		if(request.getRechargeDenom()!=null)
		domainData.setPi_recharge_denom(new BigDecimal(request.getRechargeDenom()));
		
		if(request.getRevRefTransId()!=null)
		domainData.setPi_reversal_ref_no(request.getRevRefTransId());
		
		if(request.getSlpnPoints()!=null)
		domainData.setPi_slpn_points(Long.parseLong(request.getSlpnPoints()));
		
		
		if(request.getChannel()!=null)
		domainData.setPi_channel(request.getChannel());
			
		return domainData;
	}
	
	
	
	
	private SlpnPointsTrackerResponse setWebserviceResponse(
			SlpnPointsTrackerData domainData) {
		SlpnPointsTrackerResponse response=new SlpnPointsTrackerResponse();
		
		
		response.setTransactionId(domainData.getPo_transaction_id());
		
		

		return response;
	}
	

}
