package com.xius.smf.webservices.smfservices;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.postpaidmanagement.DoPostPaidPaymentRequest;
import com.xius.agent.smf.postpaidmanagement.DoPostPaidPaymentResponse;
import com.xius.smf.domaindata.DoPostPaidPaymentData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("DoPostPaidPaymentImpl")
public class DoPostPaidPaymentImpl {
	
	private  static final Logger logger = LogManager.getLogger(DoPostPaidPaymentImpl.class.getSimpleName());

	public DoPostPaidPaymentResponse doPostPaidPayment(
			DoPostPaidPaymentRequest request, HeaderDetails headerDetails) throws SMFAgentException {
		
		DoPostPaidPaymentResponse response = new DoPostPaidPaymentResponse();
		DoPostPaidPaymentData domainData = null;
		
		domainData = setRequestData(request, headerDetails);
		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_postpaid_payment_req_insert",domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info("Error Code from pro_postpaid_payment_req_insert   ==>" + domainData.getPo_error_code());
			logger.info( "Error Msg from pro_postpaid_payment_req_insert   ==>" + domainData.getPo_error_desc());
		}
		if(domainData.getPo_error_code()==0)
		{
		response=setWebserviceResponse(domainData);
		}
		else
		{
			throw Utilities.setSMFAgentException(domainData.getPo_error_code().toString(), domainData.getPo_error_desc());
		}
		return response;
	}

	private DoPostPaidPaymentData setRequestData(
			DoPostPaidPaymentRequest request, HeaderDetails headerDetails) {
	
		DoPostPaidPaymentData domainData = new DoPostPaidPaymentData();
		if(headerDetails.getNetworkID()!=null)
			domainData.setPi_network_id(headerDetails.getNetworkID());
		if(request.getAccountId()!=null)
			domainData.setPi_account_id(request.getAccountId());
		if(request.getMSISDN()!= null)
			domainData.setPi_msisdn_no(Long.parseLong(request.getMSISDN()));
		if(request.getTransRefNum() != null)
			domainData.setPi_ext_trans_id(request.getTransRefNum());
		if(headerDetails.getLoginID() != null)
			domainData.setPi_login_id(headerDetails.getLoginID());
		if(request.getChannel()!=null)
			domainData.setPi_channel(request.getChannel());
		if(request.getInvoiceId() != null)
			domainData.setPi_invoice_id(request.getInvoiceId());
		if(request.getAmountPaid() != null )
			domainData.setPi_amount_paid(new BigDecimal(request.getAmountPaid()));
		if(request.getPaymentMode() != null)
			domainData.setPi_payment_mode(request.getPaymentMode());
		if(request.getPaymentRefID() != null)
			domainData.setPi_payment_ref_id(request.getPaymentRefID());
		if(request.getRemarks() != null)
			domainData.setPi_reason(request.getRemarks());
				
		return domainData;
	}
	
	private DoPostPaidPaymentResponse setWebserviceResponse(
			DoPostPaidPaymentData domainData) {
		DoPostPaidPaymentResponse response =new DoPostPaidPaymentResponse();
		
		if(domainData.getPo_transaction_id() != null)
			response.setTransactionId(domainData.getPo_transaction_id());
		
		return response;
	}

}