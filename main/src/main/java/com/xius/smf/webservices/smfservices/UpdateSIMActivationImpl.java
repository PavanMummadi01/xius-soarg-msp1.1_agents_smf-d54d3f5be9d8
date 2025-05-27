package com.xius.smf.webservices.smfservices;


import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.SIMActivationUpdateRequest;
import com.xius.agent.smf.smfmanagement.SIMActivationUpdateResponse;
import com.xius.smf.domaindata.UpdateSIMActivationData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("UpdateSIMActivationImpl")
public class UpdateSIMActivationImpl {

	private  static final Logger logger = LogManager.getLogger(UpdateSIMActivationImpl.class.getSimpleName());

	HeaderDetails headerDetails = null;
	UpdateSIMActivationData domainData =null;
	SPFactory spFactory=null;
	
	public SIMActivationUpdateResponse UpdateSIMActivation(
			SIMActivationUpdateRequest request, HeaderDetails headerDetails) 
					throws SMFAgentException {
		
		this.headerDetails = headerDetails;
		SIMActivationUpdateResponse response = new SIMActivationUpdateResponse();
		domainData = setRequestData(request, headerDetails);
		spFactory = ServiceUtils.executeSPWithOutCommit("pro_sim_act_req_update", domainData, domainData);
		
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		/**
		 * invoke Stored Procedure.
		 */
		Long errCode  = domainData.getPo_error_code();
		String errMsg  = domainData.getPo_error_desc();
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from pro_sim_act_req_update  ==>" + errCode);
			logger.info("Error Msg from pro_sim_act_req_update  ==>" + errMsg);
		}
		Utilities.commitOrRollback(spFactory, errCode);

		if ( errCode != 0) {

			throw Utilities.setSMFAgentException( errCode.toString(), errMsg );
		} 
		
			
		else{
			response=setWebserviceResponse(domainData);
			}
		return response;
	}

	private UpdateSIMActivationData setRequestData(
			SIMActivationUpdateRequest request, HeaderDetails headerDetails2) {
		UpdateSIMActivationData domainData = new UpdateSIMActivationData();
		
		if(Utilities.isNull(request.getTransactionId())==false)
			domainData.setPi_trans_id(request.getTransactionId());
		
		if(Utilities.isNull(request.getRemarks())==false)
			domainData.setPi_remarks(request.getRemarks());
		
		if(Utilities.isNull(request.getStatus())==false)
			domainData.setPi_status(request.getStatus());
			
		if(Utilities.isNull(String.valueOf(request.getCurentStateId()))==false)
			domainData.setPi_curr_state_id((request.getCurentStateId()));
	
		if(Utilities.isNull(String.valueOf(headerDetails2.getNetworkID()))==false)
			domainData.setPi_network_id(headerDetails2.getNetworkID());
		
		if(request.getNewMSISDN()!=null)
			domainData.setPi_new_msisdn_no(Long.parseLong(request.getNewMSISDN()));
			
			
		return domainData;
	}

	private SIMActivationUpdateResponse setWebserviceResponse(
			UpdateSIMActivationData domainData) {
		SIMActivationUpdateResponse response=new SIMActivationUpdateResponse();
		if(domainData.getPo_error_code()== 0){
			response.setMessage(SMFAgentConstants.SUCCESS);
		}
		else
			response.setMessage(SMFAgentConstants.FAILURE);
		return response;
	}

	
}
