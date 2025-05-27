package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;


import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.UpdateExternalDetailsRequest;
import com.xius.agent.smf.smfmanagement.UpdateExternalDetailsResponse;
import com.xius.smf.domaindata.UpdateExternalDetailsData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("UpdateExternalDetailsImpl")
public class UpdateExternalDetailsImpl {

	private  static final Logger logger = LogManager.getLogger(UpdateExternalDetailsImpl.class.getSimpleName());

	public UpdateExternalDetailsResponse updateExternalDetails(
			UpdateExternalDetailsRequest request, HeaderDetails headerDetails)
			throws RemoteException, SMFAgentException {

		UpdateExternalDetailsResponse response = new UpdateExternalDetailsResponse();

		UpdateExternalDetailsData domainData = null;
		logger.info("setRequestData........................");
		
		domainData = setRequestData(request, headerDetails);
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_upd_external_details",domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info(domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from  pro_upd_external_details  ==>" + domainData.getPo_error_code());
			logger.info("Error Msg from  pro_upd_external_details  ==>" + domainData.getPo_error_desc());
		}
		if(domainData.getPo_error_code()==0)
		{
			response=setWebserviceResponse(domainData);
		}
		
		else
		{
			throw new SMFAgentException(domainData.getPo_error_code().toString(), domainData.getPo_error_desc());
		}
		

		return response;

	}


	public UpdateExternalDetailsData setRequestData(
			UpdateExternalDetailsRequest request, HeaderDetails headerDetails) {
		UpdateExternalDetailsData data= new UpdateExternalDetailsData();
		
		if (headerDetails.getNetworkID() != null)
			data.setPi_network_id(headerDetails.getNetworkID());
		if(headerDetails.getLoginID()!= null)
			data.setPi_username(headerDetails.getLoginID());
		
		
		
		if(request.getIDValue()!=null)	{
			data.setPi_id_value(request.getIDValue());
			
		}
		
		if(request.getMSISDN()!=null){
			data.setPi_msisdn_no(Long.parseLong(request.getMSISDN()));
		}
		if(request.getSIMNo()!=null){
			data.setPi_sim_no(request.getSIMNo());
		}
		if(request.getAccountId()!=null)
			data.setPi_account_id(request.getAccountId());
		
		if(request.getIMSI()!=null)
			data.setPi_imsi_no(Long.parseLong(request.getIMSI()));
		
		if(request.getPartnerId()!=null)
			data.setPi_partner_id(request.getPartnerId());
		
		if(request.getPartnernName()!=null)
			data.setPi_partner_name(request.getPartnernName());
		
		if(request.getStatus()!=null)
			data.setPi_status(request.getStatus());
		
		if(request.getReason()!=null)
			data.setPi_reason(request.getReason());
		if(request.getTransRefNumber()!=null)
			data.setPi_extarnal_trans_id(request.getTransRefNumber());
		
		
		return data;
	}
	
	private UpdateExternalDetailsResponse setWebserviceResponse(
			UpdateExternalDetailsData domainData) {
		
		UpdateExternalDetailsResponse response= new UpdateExternalDetailsResponse();

		response.setResponseMessage(SMFAgentConstants.SUCCESS);
		response.setResponseCode( domainData.getPo_error_code()+"");
		response.setStatus(domainData.getPi_status());
		response.setTransRefNumber(domainData.getPi_extarnal_trans_id());
		return response;
		
	}

	
}
