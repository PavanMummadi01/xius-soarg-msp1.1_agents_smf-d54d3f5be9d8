package com.xius.smf.webservices.smfservices;


import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.VolteInsertRequest;
import com.xius.agent.smf.smfmanagement.VolteInsertResponse;
import com.xius.smf.domaindata.VolteInsertData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("VolteInsertImpl")
public class VolteInsertImpl {
	private  static final Logger logger = LogManager.getLogger(VolteInsertImpl.class.getSimpleName());
	public VolteInsertResponse volteInsert(
			VolteInsertRequest request, HeaderDetails headerDetails) throws SMFAgentException {
		VolteInsertResponse response =new VolteInsertResponse();
		VolteInsertData domainData = null;
		domainData = setRequestData(request, headerDetails);
		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_lte_srvc_req_insrt",domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from pro_lte_srvc_req_insrt  ==>" + domainData.getPo_error_code());
			logger.info( "Error Msg from pro_lte_srvc_req_insrt  ==>" + domainData.getPo_error_desc());
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

	private VolteInsertData setRequestData(
			VolteInsertRequest request, HeaderDetails headerDetails) {
		VolteInsertData data = new VolteInsertData();
	      if(headerDetails.getNetworkID()!= null)
	  		data.setPi_network_id(headerDetails.getNetworkID());
	      if(request.getMSISDN()!= null)
	    	  data.setPi_msisdn_no(Long.parseLong(request.getMSISDN()));
	      if(request.getAccountType()!= null)
	      	data.setPi_acc_type(Long.parseLong(request.getAccountType()));
	     if(headerDetails.getLoginID() != null)
	     	data.setPi_login_id(headerDetails.getLoginID());
	      if(request.getChannelName()!= null)
	      	data.setPi_channel_name(request.getChannelName());
	      if(request.getTransactionId()!= null)
	      	data.setPi_ext_transaction_id(request.getTransactionId());
	      if(request.getFlag()!=null)
	    	  data.setPi_service_flag(request.getFlag());
	      
	      if(request.getActivityId()!=null)
	    	  data.setPi_activity_id(Long.parseLong(request.getActivityId()));
	      
	      if(request.getAccountId()!=null)
	    	  data.setPi_account_id(Long.parseLong(request.getAccountId()));
	      
	      if(request.getICCID()!=null) 
	    	  data.setPi_sim_serial_no(request.getICCID());
	      if(request.getIMSI()!=null)
	    	  data.setPi_imsi_no(Long.parseLong(request.getIMSI()));
	      if(request.getAccountStatus()!=null)	 
	    	  data.setPi_acct_status(request.getAccountStatus());
		return data;
	}
	
	private VolteInsertResponse setWebserviceResponse(
			VolteInsertData domainData) {
		VolteInsertResponse response = new VolteInsertResponse();
		response.setRetransactionId(domainData.getPo_intrnl_transaction_id().toString());
		response.setMessage(SMFAgentConstants.SUCCESS);
		return response;
	}
	
}
