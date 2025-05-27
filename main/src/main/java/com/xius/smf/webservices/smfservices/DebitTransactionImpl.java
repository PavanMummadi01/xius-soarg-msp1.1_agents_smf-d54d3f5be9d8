package com.xius.smf.webservices.smfservices;

import java.math.BigDecimal;
import java.rmi.RemoteException;

import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.common.error.errordetails.ErrorDetailsType;
import com.xius.agent.smf.smfmanagement.DebitTransactionRequest;
import com.xius.agent.smf.smfmanagement.DebitTransactionResponse;
import com.xius.smf.domaindata.DebitTransactionData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("DebitTransactionImpl")
public class DebitTransactionImpl {
	public DebitTransactionResponse debitTransaction(
			DebitTransactionRequest request,HeaderDetails header) throws RemoteException,SMFAgentException {
		
		DebitTransactionResponse response=new DebitTransactionResponse();
		
		DebitTransactionData domainData =null;
		
		
		domainData = setRequestData(request, header);
		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("debitTransaction",domainData, domainData);
		
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
	
	private DebitTransactionData setRequestData(DebitTransactionRequest request,
			HeaderDetails headerDetails) {
	
		DebitTransactionData domainData = new DebitTransactionData();
		
		if(headerDetails.getNetworkID()!=null)
		domainData.setPi_network_id(headerDetails.getNetworkID());
		
		if(request.getMsisdn()!=null)
		domainData.setPi_msisdn_no(Long.parseLong(request.getMsisdn().trim()));
		
		if(request.getOperation()!=null)
		domainData.setOperation(request.getOperation());
		
		if(request.getAmount()!=null)
		domainData.setAmtToDebit(new BigDecimal(request.getAmount()));
		
		if(request.getRevRefTransId()!=null)
		domainData.setPi_ext_trans_id(request.getRevRefTransId());
			
			
		return domainData;
	}
	
	
	private DebitTransactionResponse setWebserviceResponse(
			DebitTransactionData domainData) {
		DebitTransactionResponse response=new DebitTransactionResponse();
		
		
		response.setTransId(domainData.getPo_trans_id());
		
		response.setActivityId(domainData.getPo_activity_id());
		
		

		return response;
	}

}
