package com.xius.smf.webservices.smfservices;


import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.postpaidmanagement.PostPaidPmtUpdRequest;
import com.xius.agent.smf.postpaidmanagement.PostPaidPmtUpdResponse;
import com.xius.smf.domaindata.PostPaidPmtUpdData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("PostPaidPmtUpdImpl")
public class PostPaidPmtUpdImpl {
	private  static final Logger logger = LogManager.getLogger(PostPaidPmtUpdImpl.class.getSimpleName());
	public PostPaidPmtUpdResponse postPaidPmtUpd(PostPaidPmtUpdRequest request,
			HeaderDetails headerDetails) throws SMFAgentException {
		PostPaidPmtUpdResponse response=new PostPaidPmtUpdResponse();
		
		PostPaidPmtUpdData domainData =null;
		
		domainData = setRequestData(request, headerDetails);
		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_postpaid_payment_req_upd",domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from pro_postpaid_payment_req_upd  ==>" + domainData.getPo_error_code());
			logger.info( "Error Msg from pro_postpaid_payment_req_upd  ==>" + domainData.getPo_error_desc());
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

	private PostPaidPmtUpdData setRequestData(PostPaidPmtUpdRequest request,
			HeaderDetails headerDetails) {
		
		PostPaidPmtUpdData data = new PostPaidPmtUpdData();
		
		if(headerDetails.getNetworkID() != null)
			data.setPi_network_id(headerDetails.getNetworkID());
		if(request.getTransactionId() != null)
			data.setPi_transaction_id(request.getTransactionId());
		if(request.getStatus() != null)
		data.setPi_status(request.getStatus());
		if(request.getStatus() != null)
			data.setPi_remarks(request.getStatus());
		if(request.getCurStateId() != null)
			data.setPi_current_state_id(Long.parseLong(request.getCurStateId()));
		if(request.getExtErrorCode() != null)
			data.setPi_ext_err_code(request.getExtErrorCode());
		
		return data;
	}
	
	private PostPaidPmtUpdResponse setWebserviceResponse(
			PostPaidPmtUpdData domainData) {
	
		PostPaidPmtUpdResponse response = new PostPaidPmtUpdResponse();
		
		response.setMessage(SMFAgentConstants.SUCCESS);
		
		return response;
	}

}
