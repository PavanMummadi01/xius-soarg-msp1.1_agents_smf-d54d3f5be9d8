package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.FirstLUUpdateRequest;
import com.xius.agent.smf.smfmanagement.FirstLUUpdateResponse;
import com.xius.smf.domaindata.FirstLUUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("FirstLUUpdateImpl")
public class FirstLUUpdateImpl {
	private  static final Logger logger = LogManager.getLogger(FirstLUUpdateImpl.class.getSimpleName());
	 public FirstLUUpdateResponse firstLUUpdate(FirstLUUpdateRequest request,HeaderDetails header) throws RemoteException,
			SMFAgentException {
		
		 FirstLUUpdateResponse response=new FirstLUUpdateResponse();
		
		 FirstLUUpdateData domainData =null;
		
		
		domainData = setRequestData(request, header);
		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_first_lu_req_update",domainData, domainData);
		
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
	
	private FirstLUUpdateData setRequestData(FirstLUUpdateRequest request,
			HeaderDetails headerDetails) {
	
		FirstLUUpdateData domainData = new FirstLUUpdateData();
		
		if(headerDetails.getNetworkID()!=null)
		domainData.setPi_network_id(headerDetails.getNetworkID());
		if(request.getTransactionId()!=null)
			domainData.setPi_trans_id(request.getTransactionId());
			
		
		if(request.getNewMSISDN()!=null)
		domainData.setPi_new_msisdn_no(Long.parseLong(request.getNewMSISDN()));
		
		if(request.getSIM()!=null)
			domainData.setPi_sim_serial_no(request.getSIM());
			
		if(request.getCurrentStateId()!=null)
			domainData.setPi_curr_state_id(Long.parseLong(request.getCurrentStateId()));
			
		if(request.getStatus()!=null)
		domainData.setPi_status(request.getStatus());
		
		if(request.getRemarks()!=null)
		domainData.setPi_remarks(request.getRemarks());
		
		if(request.getOldMSISDN()!=null)
		domainData.setPi_old_msisdn_no(Long.parseLong(request.getOldMSISDN()));
		
		if(request.getBAN()!=null)
		domainData.setPi_ban(request.getBAN());
		
		if(request.getLinkTransId()!=null)
			domainData.setPi_link_transaction_id(request.getLinkTransId());	
		
		if(request.getExtErrorCode()!=null)
			domainData.setPi_ext_error_code(request.getExtErrorCode());
		
		return domainData;
	}
	
	
	private FirstLUUpdateResponse setWebserviceResponse(
			FirstLUUpdateData domainData) {
		FirstLUUpdateResponse response=new FirstLUUpdateResponse();
		response.setMessage(SMFAgentConstants.SUCCESS);
			return response;
	}

}






