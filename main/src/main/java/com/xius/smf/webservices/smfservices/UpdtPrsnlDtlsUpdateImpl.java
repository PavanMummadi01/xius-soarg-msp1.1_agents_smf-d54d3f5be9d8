package com.xius.smf.webservices.smfservices;


import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.UpdtPrsnlDtlsUpdateRequest;
import com.xius.agent.smf.smfmanagement.UpdtPrsnlDtlsUpdateResponse;
import com.xius.smf.domaindata.UpdtPrsnlDtlsUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("UpdtPrsnlDtlsUpdateImpl")
public class UpdtPrsnlDtlsUpdateImpl {

	private  static final Logger logger = LogManager.getLogger(UpdtPrsnlDtlsUpdateImpl.class.getSimpleName());

	HeaderDetails headerDetails = null;
	UpdtPrsnlDtlsUpdateData domainData =null;
	SPFactory spFactory=null;
	
	public UpdtPrsnlDtlsUpdateResponse updtPrsnlDtlsUpdate(
			UpdtPrsnlDtlsUpdateRequest request, HeaderDetails headerDetails) 
					throws SMFAgentException{
		
		this.headerDetails = headerDetails;
		UpdtPrsnlDtlsUpdateResponse response = new UpdtPrsnlDtlsUpdateResponse();
		domainData = setRequestData(request, headerDetails);
		spFactory = ServiceUtils.executeSPWithOutCommit("updtPrsnlDtlsUpdate", domainData, domainData);
		
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		/**
		 * invoke Stored Procedure.
		 */
		Long errCode  = domainData.getPo_error_code();
		String errMsg  = domainData.getPo_error_desc();
		if (logger.isInfoEnabled()) {

			logger.info("Error Code from pro_sim_act_req_update  ==>" + errCode);
			logger.info( "Error Msg from pro_sim_act_req_update  ==>" + errMsg);
		}
		Utilities.commitOrRollback(spFactory, errCode);

		if ( errCode != 0) {

			throw Utilities.setSMFAgentException( String.valueOf(errCode), errMsg );
		} 
		
			
		else{
			response=setWebserviceResponse(domainData);
			}
		return response;
	}

	private UpdtPrsnlDtlsUpdateData setRequestData(
			UpdtPrsnlDtlsUpdateRequest request, HeaderDetails headerDetails2) {
		UpdtPrsnlDtlsUpdateData domainData = new UpdtPrsnlDtlsUpdateData();
		
		if(Utilities.isNull(request.getTransactionId())==false)
			domainData.setPi_trans_id(request.getTransactionId());
		
		if(Utilities.isNull(request.getRemarks())==false)
			domainData.setPi_remarks(request.getRemarks());
		
		if(Utilities.isNull(request.getStatus())==false)
			domainData.setPi_status(request.getStatus());
			
		if(Utilities.isNull(request.getCurstateId())==false)
			domainData.setPi_curr_state_id((request.getCurstateId()));
	
		if(Utilities.isNull(String.valueOf(headerDetails2.getNetworkID()))==false)
			domainData.setPi_network_id(headerDetails2.getNetworkID());
		
		
			
			
		return domainData;
	}

	private UpdtPrsnlDtlsUpdateResponse setWebserviceResponse(
			UpdtPrsnlDtlsUpdateData domainData) {
		UpdtPrsnlDtlsUpdateResponse response=new UpdtPrsnlDtlsUpdateResponse();
		if(domainData.getPo_error_code()== 0){
			response.setMessage(SMFAgentConstants.SUCCESS);
		}
		else
			response.setMessage(SMFAgentConstants.FAILURE);
		return response;
	}

	
}
