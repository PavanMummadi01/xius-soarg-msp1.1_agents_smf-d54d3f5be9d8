package com.xius.smf.webservices.smfservices;


import net.bcgi.util.db.SPFactory;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.PaymentDtlsType;
import com.xius.agent.smf.smfmanagement.PaymentTransDtlsType;
import com.xius.agent.smf.smfmanagement.PaymentTransReportRequest;
import com.xius.agent.smf.smfmanagement.PaymentTransReportResponse;
import com.xius.smf.domaindata.PaymentTransReportData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("PaymentTransReportImpl")
public class PaymentTransReportImpl {

	private  static final Logger logger = LogManager.getLogger(PaymentTransReportImpl.class.getSimpleName());
	public  PaymentTransReportResponse paymentTransReport(
			PaymentTransReportRequest request,HeaderDetails headerDetails) throws SMFAgentException {
	
		PaymentTransReportResponse response = new PaymentTransReportResponse();
		PaymentTransReportData domainData = null;
		domainData = setRequestData(request, headerDetails);
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_payment_transaction_rpt",domainData, domainData);
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

	private PaymentTransReportData setRequestData(PaymentTransReportRequest request,
			HeaderDetails headerDetails) {
		PaymentTransReportData domainData = new PaymentTransReportData();
		
		domainData.setPi_network_id(headerDetails.getNetworkID());
		 if(request.getMSISDN() != null&& request.getMSISDN().trim().length()>0)
		    	domainData.setPi_msisdn_no(Long.parseLong(request.getMSISDN()));
	    if(request.getAccountId() != null &&request.getAccountId().trim().length()>0)
	    	domainData.setPi_account_id(Long.parseLong(request.getAccountId()));
	    if(request.getFromDate() != null)
	    	domainData.setPi_from_date(request.getFromDate());
	    if(request.getToDate() != null)
	    	domainData.setPi_to_date(request.getToDate());
	    if(request.getMaxRecords() != null && request.getMaxRecords().trim().length()>0 )
	    	domainData.setPi_max_records(Long.parseLong(request.getMaxRecords()));
	    if(request.getNextRecIndex() != null && request.getNextRecIndex().trim().length()>0 )
	    	domainData.setPi_next_rec_index(Long.parseLong(request.getNextRecIndex()));
	    
		return domainData;
	}
	
	private PaymentTransReportResponse setWebserviceResponse(
			PaymentTransReportData domainData) {
		PaymentTransReportResponse response = new PaymentTransReportResponse();
		PaymentDtlsType type=null;
		  PaymentDtlsType[] dtls=null;
		if(domainData.getPo_total_records()!=null)
		{
			response.setTotalRecords(domainData.getPo_total_records().toString());
		}
		
      if(domainData.getPo_payment_trans_dtls()!=null)
		 {
    	       dtls=new   PaymentDtlsType[domainData.getPo_payment_trans_dtls().size()];
    	       if(domainData.getPo_payment_trans_dtls().size()>0){
			   for(int i=0;i<domainData.getPo_payment_trans_dtls().size();i++){
		 	           type=new PaymentDtlsType();
		 	           
		      if (domainData.getPo_payment_trans_dtls().get(i).getUser_id() != null) {
				type.setUserID(domainData.getPo_payment_trans_dtls().get(i).getUser_id());
				}
				type.setErrorMsg(domainData.getPo_payment_trans_dtls().get(i).getExt_error_msg());
				type.setExtTransId(domainData.getPo_payment_trans_dtls().get(i).getExt_trans_id());
				type.setFinalStatus(domainData.getPo_payment_trans_dtls().get(i).getStatus());
				type.setPaymentType(domainData.getPo_payment_trans_dtls().get(i).getPayment_type());
				type.setRemarks(domainData.getPo_payment_trans_dtls().get(i).getRemarks());
				type.setTransTime(domainData.getPo_payment_trans_dtls().get(i).getTransaction_date());
				type.setTransID(domainData.getPo_payment_trans_dtls().get(i).getTransaction_id());
				 type.setRcDescription(domainData.getPo_payment_trans_dtls().get(i).getDescription());
			    
				 type.setRcCode(domainData.getPo_payment_trans_dtls().get(i).getRc_code());
			     if(domainData.getPo_payment_trans_dtls().get(i).getPayment_amount()!=null)
			     {
				type.setPrice(domainData.getPo_payment_trans_dtls().get(i).getPayment_amount().toString());
			     }
					if (domainData.getPo_payment_trans_dtls().get(i).getPayment_gatewaytype() != null) {
						type.setWalletType(domainData.getPo_payment_trans_dtls().get(i).getWallet_type());

					}
					if (domainData.getPo_payment_trans_dtls().get(i).getPayment_gatewaytype() != null) {
						type.setPaymentGateWayType(domainData.getPo_payment_trans_dtls().get(i).getPayment_gatewaytype());
					}
					
			    
				    dtls[i]=type;
			}
			//response.setPaymentTransDtls(dtls);
			   PaymentTransDtlsType paymentTransDtlsType=new PaymentTransDtlsType();
			   paymentTransDtlsType.getPaymentDtls().addAll(Arrays.asList(dtls));
			   response.setPaymentTransDtls(paymentTransDtlsType);
		}
				 }
				return response;
	}
	}


