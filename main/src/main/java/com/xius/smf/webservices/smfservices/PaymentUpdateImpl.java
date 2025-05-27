package com.xius.smf.webservices.smfservices;


import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import com.xius.agent.smf.smfmanagement.PaymentUpdateRequest;
import com.xius.agent.smf.smfmanagement.PaymentUpdateResponse;
import com.xius.smf.domaindata.PaymentUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("PaymentUpdateImpl")
public class PaymentUpdateImpl {

	private  static final Logger logger = LogManager.getLogger(PaymentUpdateImpl.class.getSimpleName());
	public PaymentUpdateResponse paymentUpdate(PaymentUpdateRequest request,
			HeaderDetails headerDetails) throws SMFAgentException {
	
		PaymentUpdateResponse response = new PaymentUpdateResponse();
		PaymentUpdateData domainData = null;
		domainData = setRequestData(request, headerDetails);
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_payment_req_upd",domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from  pro_payment_req_upd  ==>" + domainData.getPo_error_code());
			logger.info( "Error Msg from  pro_payment_req_upd  ==>" + domainData.getPo_error_desc());
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

	private PaymentUpdateData setRequestData(PaymentUpdateRequest request,
			HeaderDetails headerDetails) {
		PaymentUpdateData domainData = new PaymentUpdateData();
		
		domainData.setPi_network_id(headerDetails.getNetworkID());
	    if(request.getTransactionId() != null)
	    	domainData.setPi_transaction_id(request.getTransactionId());
	    if(request.getStatus() != null)
	    	domainData.setPi_status(request.getStatus());
	    if(request.getRemarks() != null)
	    	domainData.setPi_remarks(request.getRemarks());
	    if(request.getExtErrorCode() != null)
	    	domainData.setPi_ext_err_code(request.getExtErrorCode());
	    if(request.getExttransId() != null)
	    	domainData.setPi_ext_trans_id(request.getExttransId());
	    if(request.getPaymentType() != null)
	    	domainData.setPi_payment_type(request.getPaymentType());
	    if(request.getExternalMsg() != null)
	    	domainData.setPi_ext_error_msg(request.getExternalMsg());
		return domainData;
	}
	
	private PaymentUpdateResponse setWebserviceResponse(
			PaymentUpdateData domainData) {
		PaymentUpdateResponse response = new PaymentUpdateResponse();
		
		response.setMessage(SMFAgentConstants.SUCCESS);
		
		return response;
	}
	
}
