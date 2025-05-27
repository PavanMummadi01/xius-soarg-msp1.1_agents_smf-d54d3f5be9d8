package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.DebitTransactionUpdateRequest;
import com.xius.agent.smf.smfmanagement.DebitTransactionUpdateResponse;
import com.xius.smf.domaindata.DebitTransactionUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("DebitTransactionUpdateImpl")
public class DebitTransactionUpdateImpl {
	private  static final Logger logger = LogManager.getLogger(DebitTransactionUpdateImpl.class.getSimpleName());

	public DebitTransactionUpdateResponse debitTransactionUpdate(
		DebitTransactionUpdateRequest request,HeaderDetails header) throws RemoteException,SMFAgentException {
	
	
		DebitTransactionUpdateResponse response=new DebitTransactionUpdateResponse();
		DebitTransactionUpdateData domainData =null;
		
		domainData = setRequestData(request, header);
		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("debitTransactionUpdate",domainData, domainData);
		
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		
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

	private DebitTransactionUpdateData setRequestData(DebitTransactionUpdateRequest request,
			HeaderDetails headerDetails) {
	
		DebitTransactionUpdateData domainData = new DebitTransactionUpdateData();
		
		if(headerDetails.getNetworkID()!=null)
			domainData.setPi_network_id(headerDetails.getNetworkID());
		
		if(request.getTransactionId()!=null)
		domainData.setPi_transaction_id(request.getTransactionId());
		
		if(request.getExtErrorCode()!=null)
		domainData.setPi_ext_error_code(Long.parseLong(request.getExtErrorCode()));
		
		if(request.getStatus()!=null)
		domainData.setPi_status(request.getStatus());
		
		if(request.getRemarks()!=null)
		domainData.setPi_remarks(request.getRemarks());
		
		return domainData;
	}
	
	private DebitTransactionUpdateResponse setWebserviceResponse(
			DebitTransactionUpdateData domainData) {
		DebitTransactionUpdateResponse response=new DebitTransactionUpdateResponse();
		
		
		response.setMessage(SMFAgentConstants.SUCCESS);
		
		

		return response;
	}

}
