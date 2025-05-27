package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.TransactionTrackerUpdateRequest;
import com.xius.agent.smf.smfmanagement.TransactionTrackerUpdateResponse;
import com.xius.smf.domaindata.TransactionTrackerUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("TransactionTrackerUpdateImpl")
public class TransactionTrackerUpdateImpl {
	private  static final Logger logger = LogManager.getLogger(TransactionTrackerUpdateImpl.class.getSimpleName());
	 public TransactionTrackerUpdateResponse transactionTrackerUpdate(
				TransactionTrackerUpdateRequest request,HeaderDetails header) throws RemoteException,SMFAgentException {
		
		 TransactionTrackerUpdateResponse response=new TransactionTrackerUpdateResponse();
		
		 TransactionTrackerUpdateData domainData =null;
		
		
		domainData = setRequestData(request, header);
		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_selfc_debit_susped_req_upd",domainData, domainData);
		
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
	
	private TransactionTrackerUpdateData setRequestData(TransactionTrackerUpdateRequest request,
			HeaderDetails headerDetails) {
	
		TransactionTrackerUpdateData domainData = new TransactionTrackerUpdateData();
		
		if(headerDetails.getNetworkID()!=null)
		domainData.setPi_network_id(headerDetails.getNetworkID());
		if(request.getTransactionId()!=null)
			domainData.setPi_transaction_id(request.getTransactionId());
		if(request.getActivityType()!=null)
			domainData.setPi_activity_type(request.getActivityType());
		if(request.getExtErrorCode()!=null)
		domainData.setPi_ext_error_code(request.getExtErrorCode());
		
		if(request.getStatus()!=null)
		domainData.setPi_status(request.getStatus());
		
		if(request.getRemarks()!=null)
		domainData.setPi_remarks(request.getRemarks());
		
		
			
		return domainData;
	}
	
	
	private TransactionTrackerUpdateResponse setWebserviceResponse(
			TransactionTrackerUpdateData domainData) {
		TransactionTrackerUpdateResponse response=new TransactionTrackerUpdateResponse();
		response.setMessage(SMFAgentConstants.SUCCESS);
			return response;
	}

}






