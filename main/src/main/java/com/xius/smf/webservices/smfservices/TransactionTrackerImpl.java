package com.xius.smf.webservices.smfservices;

import java.math.BigDecimal;
import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;


import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.TransactionTrackerRequest;
import com.xius.agent.smf.smfmanagement.TransactionTrackerResponse;
import com.xius.smf.domaindata.TransactionTrackerData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("TransactionTrackerImpl")
public class TransactionTrackerImpl {
	private  static final Logger logger = LogManager.getLogger(TransactionTrackerImpl.class.getSimpleName());
	 public TransactionTrackerResponse transactionTracker(
				TransactionTrackerRequest request,HeaderDetails header) throws RemoteException,SMFAgentException {
		
		 TransactionTrackerResponse response=new TransactionTrackerResponse();
		
		 TransactionTrackerData domainData =null;
		
		
		domainData = setRequestData(request, header);
		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_selfc_debit_susped_req",domainData, domainData);
		
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
	
	private TransactionTrackerData setRequestData(TransactionTrackerRequest request,
			HeaderDetails headerDetails) {
	
		TransactionTrackerData domainData = new TransactionTrackerData();
		
		if(headerDetails.getNetworkID()!=null)
		domainData.setPi_network_id(headerDetails.getNetworkID());
	   	if(headerDetails.getLoginID()!=null)
			domainData.setPi_login_id(headerDetails.getLoginID());
			
		
		if(request.getChannelId()!=null)
		domainData.setPi_channel_id(request.getChannelId());
		
	
		if(request.getIDvalue()!=null)
		domainData.setPi_id_no(request.getIDvalue());
		
		if(request.getUserId()!=null)
			domainData.setPi_user_id(request.getUserId());
		
		if(request.getTransRefNumber()!=null)
		domainData.setPi_ext_trans_id(request.getTransRefNumber());
			
		if(request.getAccountId()!=null)
			domainData.setPi_account_id(Long.parseLong(request.getAccountId()));
		
		if(request.getMSISDN()!=null)
			domainData.setPi_msisdn_no(Long.parseLong(request.getMSISDN()));
		
		if(request.getActivityType()!=null)
			domainData.setPi_activity_type(request.getActivityType());
		
		if(request.getActualAmount()!=null)
			domainData.setPi_actual_amount(new BigDecimal(request.getActualAmount()));
		
		if(request.getDebitAmount()!=null)
			domainData.setPi_debited_amount(new BigDecimal(request.getDebitAmount()));		
		

		if(request.getReason()!=null)
			domainData.setPi_reason(request.getReason());		
		
		return domainData;
	}
	
	
	private TransactionTrackerResponse setWebserviceResponse(
			TransactionTrackerData domainData) {
		TransactionTrackerResponse response=new TransactionTrackerResponse();
		response.setTransId(domainData.getPo_transaction_id());
		return response;
	}

}




