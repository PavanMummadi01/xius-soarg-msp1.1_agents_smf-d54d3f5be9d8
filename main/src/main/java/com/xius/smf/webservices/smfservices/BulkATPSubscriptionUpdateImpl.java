package com.xius.smf.webservices.smfservices;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import net.bcgi.util.db.SPFactory;
import com.xius.agent.smf.smfmanagement.BulkATPSubscriptionUpdateRequest;
import com.xius.agent.smf.smfmanagement.BulkATPSubscriptionUpdateResponse;
import com.xius.smf.domaindata.BulkAtpSubsUpdataData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("BulkATPSubscriptionUpdateImpl")
public class BulkATPSubscriptionUpdateImpl {

	private  static final Logger logger = LogManager.getLogger(BulkATPSubscriptionUpdateImpl.class.getSimpleName());

	public BulkATPSubscriptionUpdateResponse bulkATPSubscriptionUpdate(
			BulkATPSubscriptionUpdateRequest request,
			HeaderDetails headerDetails) throws SMFAgentException {
		BulkATPSubscriptionUpdateResponse response =new BulkATPSubscriptionUpdateResponse();
		BulkAtpSubsUpdataData domainData = null;
		domainData = setRequestData(request, headerDetails);
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_bulkatp_subscription_upd",domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from pro_bulkatp_subscription_upd  ==>" + domainData.getPo_error_code());
			logger.info( "Error Msg from pro_bulkatp_subscription_upd  ==>" + domainData.getPo_error_desc());
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

	private BulkAtpSubsUpdataData setRequestData(
			BulkATPSubscriptionUpdateRequest request,
			HeaderDetails headerDetails) {
		BulkAtpSubsUpdataData data = new BulkAtpSubsUpdataData();

		 if(headerDetails.getNetworkID()!= null)
		  		data.setPi_network_id(headerDetails.getNetworkID());
		 if(request.getTransactionId() != null)
			 data.setPi_transaction_id(request.getTransactionId());
		 if(request.getCharge() != null)
			 data.setPi_charge(new BigDecimal(request.getCharge()));
		 if(request.getChargeId() != null)
			 data.setPi_charge_id(request.getChargeId());
		 if(request.getStatus() != null)
			 data.setPi_status(request.getStatus());
		 if(request.getRemarks() != null)
			 data.setPi_remarks(request.getRemarks());
		 if(request.getExtErrorCode() != null)
			 data.setPi_ext_error_code(request.getExtErrorCode());
		if(request.getFlag() != null)
		{
			data.setPi_sub_unsub_flag(request.getFlag());
		}
		 
		return data;
	}

	private BulkATPSubscriptionUpdateResponse setWebserviceResponse(
			BulkAtpSubsUpdataData domainData) {
		BulkATPSubscriptionUpdateResponse response = new BulkATPSubscriptionUpdateResponse();
		response.setMessage(SMFAgentConstants.SUCCESS);
		return response;
	}

}
