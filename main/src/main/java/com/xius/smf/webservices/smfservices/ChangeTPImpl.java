package com.xius.smf.webservices.smfservices;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.ChangeTPRequest;
import com.xius.agent.smf.smfmanagement.ChangeTPResponse;
import com.xius.smf.domaindata.ChangeTPData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("ChangeTPImpl")
public class ChangeTPImpl {

	private  static final Logger logger = LogManager.getLogger(ChangeTPImpl.class.getSimpleName());
	public ChangeTPResponse changeTP(ChangeTPRequest request,
			HeaderDetails headerDetails) throws SMFAgentException {
		ChangeTPResponse response = new ChangeTPResponse();
		ChangeTPData domainData = null;
		domainData = setRequestData(request, headerDetails);
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_tarifpack_change_req",domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info(domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from pro_tarifpack_change_req  ==>" + domainData.getPo_error_code());
			logger.info( "Error Msg from pro_tarifpack_change_req  ==>" + domainData.getPo_error_desc());
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
	private ChangeTPData setRequestData(ChangeTPRequest request,
			HeaderDetails headerDetails) {
		ChangeTPData data = new ChangeTPData();
		 if(headerDetails.getNetworkID()!= null)
		  		data.setPi_network_id(headerDetails.getNetworkID());
		 if(request.getMSISDN() != null)
			 data.setPi_msisdn_no(Long.parseLong(request.getMSISDN()));
		 if(request.getAccountId() != null)
			 data.setPi_account_id(request.getAccountId());
		 if(request.getNewTariffPackID() != null)
			data.setPi_new_tarrif_pack_id(Long.parseLong(request.getNewTariffPackID()));
		 if(request.getReason() != null)
			 data.setPi_reason(request.getReason());
		 if(request.getCharge() != null)
			 data.setPi_charge(new BigDecimal(request.getCharge()));
		 if(request.getChannelID() != null)
			 data.setPi_channel_id(request.getChannelID());
		 if(request.getOldTariffPackId() != null)
			 data.setPi_old_tarrif_pack_id(request.getOldTariffPackId());
		 if(request.getExternalTransId() != null)
			 data.setPi_ext_trans_id(request.getExternalTransId());
		return data;
	}
   
	private ChangeTPResponse setWebserviceResponse(ChangeTPData domainData) {
		ChangeTPResponse response = new ChangeTPResponse();
		if(domainData.getPo_transaction_id() != null)
		response.setTransId(domainData.getPo_transaction_id());
		return response;
	}

}
