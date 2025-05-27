package com.xius.smf.webservices.smfservices;

import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.ATPSubscriptionRequest;
import com.xius.agent.smf.smfmanagement.ATPSubscriptionResponse;
import com.xius.smf.domaindata.ATPSubscriptionData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("ATPSubscriptionImpl")
public class ATPSubscriptionImpl {
	private  static final Logger logger = LogManager.getLogger(ATPSubscriptionImpl.class.getSimpleName());
	public ATPSubscriptionResponse ATPSubscription(
			ATPSubscriptionRequest request, HeaderDetails headerDetails) throws SMFAgentException {
		ATPSubscriptionResponse response = new ATPSubscriptionResponse();
		ATPSubscriptionData domainData = null;
		domainData = setRequestData(request, headerDetails);
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_atp_subscription_req",domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from pro_atp_subscription_req  ==>" + domainData.getPo_error_code());
			logger.info( "Error Msg from pro_atp_subscription_req  ==>" + domainData.getPo_error_desc());
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

	private ATPSubscriptionData setRequestData(ATPSubscriptionRequest request,
			HeaderDetails headerDetails) {
		ATPSubscriptionData data = new ATPSubscriptionData();
		 if(headerDetails.getNetworkID()!= null)
		  		data.setPi_network_id(headerDetails.getNetworkID());
		 if(request.getMSISDN() != null)
	    	  data.setPi_msisdn_no(Long.parseLong(request.getMSISDN()));
		 if(request.getPublicityID() != null)
		      	data.setPi_publicity_id(request.getPublicityID());
		 if(request.getChannelID() != null)
			 data.setPi_channel(request.getChannelID());
		return data;
	}
     
	private ATPSubscriptionResponse setWebserviceResponse(
			ATPSubscriptionData domainData) {
		ATPSubscriptionResponse response = new ATPSubscriptionResponse();
		
		if(domainData.getPo_transaction_id() != null)
		response.setTransId(domainData.getPo_transaction_id());
		
		return response;
	}

}


