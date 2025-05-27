package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.common.error.errordetails.ErrorDetailsType;
import com.xius.agent.smf.postpaidmanagement.EnquiryDetailsType;
import com.xius.agent.smf.postpaidmanagement.PaymentInquiryRequest;
import com.xius.agent.smf.postpaidmanagement.PaymentInquiryResponse;
import com.xius.smf.domaindata.PaymentInquiryData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("PaymentInquiryImpl")
public class PaymentInquiryImpl {
	private  static final Logger logger = LogManager.getLogger(PaymentInquiryImpl.class.getSimpleName());
	public PaymentInquiryResponse paymentInquiry(PaymentInquiryRequest request,HeaderDetails header) throws RemoteException,
			SMFAgentException {
		
		PaymentInquiryResponse response=new PaymentInquiryResponse();
		
		PaymentInquiryData domainData =null;
		
		
		domainData = setRequestData(request, header);
		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_payment_enquiry_request",domainData, domainData);
		
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		
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
	
	private PaymentInquiryData setRequestData(PaymentInquiryRequest request,
			HeaderDetails headerDetails) {
	
		PaymentInquiryData domainData = new PaymentInquiryData();
		
		if(headerDetails.getNetworkID()!=null)
		domainData.setPi_network_id(headerDetails.getNetworkID());
		
		if(headerDetails.getLoginID()!=null)
			domainData.setPi_username(headerDetails.getLoginID());

		
		if(request.getTransId()!=null)
		domainData.setPi_transaction_id(request.getTransId());
		
		if(request.getTransRefNumber()!=null)
		domainData.setPi_ext_trans_id(request.getTransRefNumber());
		
	
		return domainData;
	}
	
	
	private PaymentInquiryResponse setWebserviceResponse(
			PaymentInquiryData domainData) {
		PaymentInquiryResponse response=new PaymentInquiryResponse();
		
		//EnquiryDetailsType[] enqDetails =null;
		EnquiryDetailsType enquiryDetails =null;
		ArrayList<PaymentInquiryCursorData> cur = null;
		
		if (domainData.getPo_enquiry_dtls()!=null && domainData.getPo_enquiry_dtls().size()>0 ) {
				cur=domainData.getPo_enquiry_dtls();
				enquiryDetails=new EnquiryDetailsType();
				
				if(cur.get(0).getAmountPaid()!=null)
				enquiryDetails.setAmountPaid(cur.get(0).getAmountPaid().toString());
				
				if(cur.get(0).getInvoiceId()!=null)
				enquiryDetails.setInvoiceId(cur.get(0).getInvoiceId());	
				
				if(cur.get(0).getStatus()!=null)
			    enquiryDetails.setStatus(cur.get(0).getStatus());	
				
				if(cur.get(0).getPaymentRefID()!=null)
				enquiryDetails.setPaymentRefID(cur.get(0).getPaymentRefID());
				
				if(cur.get(0).getTranxDate()!=null)
				enquiryDetails.setTranxDate(cur.get(0).getTranxDate());
				
				if(cur.get(0).getTransRefNum()!=null)
				enquiryDetails.setTransRefNum(cur.get(0).getTransRefNum());
				
				if(cur.get(0).getPaymentMode()!=null)
				enquiryDetails.setPaymentMode(cur.get(0).getPaymentMode());
				
				
			}
			response.setEnquiryDetails(enquiryDetails);
			return response;
		
	}

}
