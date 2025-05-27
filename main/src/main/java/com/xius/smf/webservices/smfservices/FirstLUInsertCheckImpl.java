package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.FirstLUInsertCheckRequest;
import com.xius.agent.smf.smfmanagement.FirstLUInsertCheckResponse;
import com.xius.smf.domaindata.FirstLUInsertCheckData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("FirstLUInsertCheckImpl")
public class FirstLUInsertCheckImpl {
	
	private  static final Logger logger = LogManager.getLogger(FirstLUInsertCheckImpl.class.getSimpleName());
	
	public FirstLUInsertCheckResponse firstLUInsertCheck(FirstLUInsertCheckRequest request, HeaderDetails header) throws RemoteException,	
SMFAgentException {
		
		FirstLUInsertCheckResponse response=null;		
		FirstLUInsertCheckData domainData =null;		
		
		domainData = setRequestData(request, header);		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_sim_act_req_check",domainData, domainData);
		
		if(logger.isInfoEnabled()) {
			logger.info( "Error code from DB - FLU insert check " + domainData.getPo_error_code() );
		}
		
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());		
		if(domainData.getPo_error_code()==0){
			response=setWebserviceResponse(domainData);			
		}
		else{
			throw new SMFAgentException(String.valueOf(domainData.getPo_error_code()), domainData.getPo_error_desc());			
		}
		
		return response;
	}
	
	private FirstLUInsertCheckData setRequestData(FirstLUInsertCheckRequest request,
			HeaderDetails headerDetails) {
	
		FirstLUInsertCheckData domainData = new FirstLUInsertCheckData();
		
		domainData.setPi_network_id(headerDetails.getNetworkID());
		domainData.setPi_imsi(Long.valueOf(request.getIMSI()));
		
		if(headerDetails.getLoginID()!=null) {
			domainData.setPi_username(headerDetails.getLoginID());
		}
	 	return domainData;
	}
	
	
	private FirstLUInsertCheckResponse setWebserviceResponse(
			FirstLUInsertCheckData domainData) {
		FirstLUInsertCheckResponse response=new FirstLUInsertCheckResponse();
		if(domainData.getPo_trans_id()!=null)
			response.setTransId(domainData.getPo_trans_id());
		if(domainData.getPo_new_msisdn()!=null)
			response.setMSISDN(String.valueOf(domainData.getPo_new_msisdn()));
		if(domainData.getPo_new_msisdn()!=null)
			response.setSIM(domainData.getPo_sim_serial_no());
		
			return response;
	}


}
