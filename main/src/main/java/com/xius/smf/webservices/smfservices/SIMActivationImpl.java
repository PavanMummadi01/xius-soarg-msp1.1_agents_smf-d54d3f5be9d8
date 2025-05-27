package com.xius.smf.webservices.smfservices;


import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.common.error.errordetails.ErrorDetailsType;
import com.xius.agent.smf.smfmanagement.SIMActivationRequest;
import com.xius.agent.smf.smfmanagement.SIMActivationResponse;
import com.xius.smf.domaindata.SIMActivationData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("SIMActivationImpl")
public class SIMActivationImpl {

	private  static final Logger logger = LogManager.getLogger(SIMActivationImpl.class.getSimpleName());

	HeaderDetails headerDetails = null;
	SIMActivationData domainData =null;
	SPFactory spFactory=null;
	
	public SIMActivationResponse SIMActivation(
			SIMActivationRequest request, HeaderDetails headerDetails) 
					throws SMFAgentException {
		
		this.headerDetails = headerDetails;
		
		domainData = setRequestData(request, headerDetails);
		spFactory = ServiceUtils.executeSPWithOutCommit("pro_sim_act_req_insert", domainData, domainData);
		
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		/**
		 * invoke Stored Procedure.
		 */
		Long errCode  = domainData.getPo_error_code();
		String errMsg  = domainData.getPo_error_desc();
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from pro_sim_act_req_inserte  ==>" + errCode);
			logger.info( "Error Msg from pro_sim_act_req_insert  ==>" + errMsg);
		}
		Utilities.commitOrRollback(spFactory, errCode);

		if ( errCode != 0) {

			throw Utilities.setSMFAgentException( errCode.toString(), errMsg );
		}
		SIMActivationResponse response=setWebserviceResponse(domainData);;
		
		return response;
	}

	private SIMActivationData setRequestData(
			SIMActivationRequest request, HeaderDetails headerDetails2) {
		SIMActivationData domainData = new SIMActivationData();
		
		if(Utilities.isNull(request.getIMSI())==false)
			domainData.setPi_imsi(Long.parseLong(request.getIMSI()));
		if(Utilities.isNull(request.getSIM())==false)
			domainData.setPi_sim_serial_no(request.getSIM());
		if(Utilities.isNull(request.getMSISDN())==false)
			domainData.setPi_msisdn_no(Long.parseLong(request.getMSISDN()));
		if(Utilities.isNull(String.valueOf(request.getCurentStateId()))==false)
			domainData.setPi_curr_state_id((request.getCurentStateId()));
		if(Utilities.isNull(request.getCustomField())==false)
			domainData.setPi_custom_field1(request.getCustomField());
		if(Utilities.isNull(String.valueOf(headerDetails2.getNetworkID()))==false)
			domainData.setPi_network_id(headerDetails2.getNetworkID());
		
		if(request.getActivityId()!=null)
			domainData.setPi_activity_type(request.getActivityId());
		
		if(request.getLinkTransId()!=null)
			domainData.setPi_link_transaction_id(request.getLinkTransId());
		
		if(request.getOldMSISDN()!=null)
			domainData.setPi_old_msisdn_no(Long.parseLong(request.getOldMSISDN()));
		
		if(request.getChannel()!=null && request.getChannel().length()>0)
			domainData.setPi_channel(request.getChannel());
		if(request.getSNA() !=null){
			domainData.setPi_sna(request.getSNA());
		}
         if(request.getNIR() !=null){
        	 domainData.setPi_nir(request.getNIR());
		}
		return domainData;
	}

	private SIMActivationResponse setWebserviceResponse(
			SIMActivationData domainData) {
		SIMActivationResponse response=new SIMActivationResponse();
		if(domainData.getPo_trans_id()!=null){
			response.setTransactionId(domainData.getPo_trans_id());
		}
		response.setMessage(SMFAgentConstants.SUCCESS);
		return response;
	}

	
}
