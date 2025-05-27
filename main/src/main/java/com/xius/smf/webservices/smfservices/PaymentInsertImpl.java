package com.xius.smf.webservices.smfservices;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.PaymentInsertRequest;
import com.xius.agent.smf.smfmanagement.PaymentInsertResponse;
import com.xius.smf.domaindata.PaymentInsertData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;


@Service("PaymentInsertImpl")
public class PaymentInsertImpl {
	private  static final Logger logger = LogManager.getLogger(PaymentInsertImpl.class.getSimpleName());
	
	public PaymentInsertResponse paymentInsert(PaymentInsertRequest request,
			HeaderDetails headerDetails) throws SMFAgentException {
		PaymentInsertResponse response = new PaymentInsertResponse();
		PaymentInsertData domainData = null;

		domainData = setRequestData(request, headerDetails);
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_payment_req_insrt",domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from  pro_payment_req_insrt  ==>" + domainData.getPo_error_code());
			logger.info( "Error Msg from  pro_payment_req_insrt  ==>" + domainData.getPo_error_desc());
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
	
	private PaymentInsertData setRequestData(PaymentInsertRequest request,
			HeaderDetails headerDetails) {
		PaymentInsertData domainData = new PaymentInsertData();
		
		domainData.setPi_network_id(headerDetails.getNetworkID());
		if(request.getAccountId() != null && request.getAccountId().trim().length() > 0)
			domainData.setPi_account_id(Long.parseLong(request.getAccountId()));
		if(request.getMSISDN() != null && request.getMSISDN().trim().length() > 0)
			domainData.setPi_msisdn_no(Long.parseLong(request.getMSISDN()));
		if(request.getActivityType() != null)
			domainData.setPi_activity_type(request.getActivityType());
		if(request.getPaymentType() != null)
			domainData.setPi_payment_type(request.getPaymentType());
		if(request.getPaymentAmount() != null && request.getPaymentAmount().trim().length() > 0)
			domainData.setPi_payment_amount(new BigDecimal(request.getPaymentAmount()));
		
		if(headerDetails.getLoginID() != null)
			domainData.setPi_login_id(headerDetails.getLoginID());
		if(request.getChannelID() != null)
			domainData.setPi_channel(request.getChannelID());
		if(request.getRcDescription() != null)
			domainData.setPi_description(request.getRcDescription());
		if(request.getRcCode() != null)
			domainData.setPi_rc_code(request.getRcCode());
		if(request.getRemarks() != null)
			domainData.setPi_remarks(request.getRemarks());
		if(request.getWalletType() != null)
			domainData.setPi_wallet_type(request.getWalletType());
		if(request.getWalletType() != null)
			domainData.setPi_payment_gatewaytype(request.getPaymentGateWayType());
		return domainData;
	}

	private PaymentInsertResponse setWebserviceResponse(
			PaymentInsertData domainData) {
		PaymentInsertResponse response = new PaymentInsertResponse();
		
		if(domainData.getPo_transaction_id() != null)
			response.setTransactionId(domainData.getPo_transaction_id());
		
		return response;
	}

}
