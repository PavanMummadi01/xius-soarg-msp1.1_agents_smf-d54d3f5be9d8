package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.SimRegistrationRequest;
import com.xius.agent.smf.smfmanagement.SimRegistrationResponse;
import com.xius.smf.domaindata.SimRegistrationData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("SimRegistrationImpl")
public class SimRegistrationImpl {
	private  static final Logger logger = LogManager.getLogger(SimRegistrationImpl.class.getSimpleName());
	 public SimRegistrationResponse simRegistration(SimRegistrationRequest request,HeaderDetails header) throws RemoteException,SMFAgentException {
		
		 SimRegistrationResponse response=new SimRegistrationResponse();
		
		 SimRegistrationData domainData =null;
		
		
		domainData = setRequestData(request, header);
		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_sim_reg_request_insert",domainData, domainData);
		
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
	
	private SimRegistrationData setRequestData(SimRegistrationRequest request,
			HeaderDetails headerDetails) {
	
		SimRegistrationData domainData = new SimRegistrationData();
		
		if(headerDetails.getNetworkID()!=null)
		domainData.setPi_network_id(headerDetails.getNetworkID());
	   	if(headerDetails.getLoginID()!=null)
			domainData.setPi_user_id(headerDetails.getLoginID());
			
		if(request.getChannel()!=null)
		domainData.setPi_channel(request.getChannel());
		
		if(request.getIDType()!=null)
		domainData.setPi_id_type(Long.parseLong(request.getIDType()));
		
		if(request.getIDvalue()!=null)
		domainData.setPi_id_no(request.getIDvalue());
		
		if(request.getTransRefNumber()!=null)
		domainData.setPi_ext_trans_id(request.getTransRefNumber());
			
		if(request.getSIM()!=null)
			domainData.setPi_sim_no(request.getSIM());
			
		if(request.getNIR()!=null){
			domainData.setPi_nir(request.getNIR());
		}	
		if(request.getSNA()!=null){
			domainData.setPi_sna(request.getSNA());
		}
		if(request.getTPID()!=null){
			domainData.setPi_tpid(request.getTPID());
		}
		if(request.getUserDefined1()!=null){
			domainData.setPi_user_define(request.getUserDefined1());
		}
		domainData.setPi_state_id(0);
		
		return domainData;
	}
	
    
	
	private SimRegistrationResponse setWebserviceResponse(
			SimRegistrationData domainData) {
		SimRegistrationResponse response=new SimRegistrationResponse();
		response.setTransId(domainData.getPo_transaction_id());
		return response;
	}

}


