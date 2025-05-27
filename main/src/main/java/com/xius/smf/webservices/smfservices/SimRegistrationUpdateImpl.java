package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.SimRegistrationUpdateRequest;
import com.xius.agent.smf.smfmanagement.SimRegistrationUpdateResponse;
import com.xius.smf.domaindata.SimRegistrationUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("SimRegistrationUpdateImpl")
public class SimRegistrationUpdateImpl {
	private  static final Logger logger = LogManager.getLogger(SimRegistrationUpdateImpl.class.getSimpleName());
	 public SimRegistrationUpdateResponse simRegistrationUpdate(
				SimRegistrationUpdateRequest request,HeaderDetails header) throws RemoteException,SMFAgentException {
		
		 SimRegistrationUpdateResponse response=new SimRegistrationUpdateResponse();
		
		 SimRegistrationUpdateData domainData =null;
		
		
		domainData = setRequestData(request, header);
		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_sim_reg_request_upd",domainData, domainData);
		
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
	
	private SimRegistrationUpdateData setRequestData(SimRegistrationUpdateRequest request,
			HeaderDetails headerDetails) {
	
		SimRegistrationUpdateData domainData = new SimRegistrationUpdateData();
		
		if(headerDetails.getNetworkID()!=null)
		domainData.setPi_network_id(headerDetails.getNetworkID());
		if(request.getTransactionId()!=null)
			domainData.setPi_transaction_id(request.getTransactionId());
		
		if(request.getExtErrorCode()!=null)
		domainData.setPi_ext_error_code(request.getExtErrorCode());
		
		if(request.getStatus()!=null)
		domainData.setPi_status(request.getStatus());
		
		if(request.getRemarks()!=null)
		domainData.setPi_remarks(request.getRemarks());
		
		if(request.getStateId()!=null){
			domainData.setPi_state_id(Long.valueOf(request.getStateId()));
		}
		if(request.getUserDefined1()!=null){
			domainData.setPi_user_define(request.getUserDefined1());
		}
		
		return domainData;
	}
	
	private SimRegistrationUpdateResponse setWebserviceResponse(
			SimRegistrationUpdateData domainData) {
		SimRegistrationUpdateResponse response=new SimRegistrationUpdateResponse();
		response.setMessage(SMFAgentConstants.SUCCESS);
			return response;
	}

}
