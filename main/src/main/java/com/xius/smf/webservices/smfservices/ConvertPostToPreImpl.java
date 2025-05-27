package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.postpaidmanagement.ConvertPostToPreRequest;
import com.xius.agent.smf.postpaidmanagement.ConvertPostToPreResponse;
import com.xius.smf.domaindata.ConvertPreToPostData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("ConvertPostToPreImpl")
public class ConvertPostToPreImpl {
	private  static final Logger logger = LogManager.getLogger(ConvertPostToPreImpl.class.getSimpleName());
	public ConvertPostToPreResponse convertPostToPre(ConvertPostToPreRequest request,HeaderDetails header) throws RemoteException,
			SMFAgentException {
		
		ConvertPostToPreResponse response=new ConvertPostToPreResponse();
		
		ConvertPreToPostData domainData =null;
		
		
		domainData = setRequestData(request, header);
		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_pre_post_convert_req",domainData, domainData);
		
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
	
	private ConvertPreToPostData setRequestData(ConvertPostToPreRequest request,
			HeaderDetails headerDetails) {
	
		ConvertPreToPostData domainData = new ConvertPreToPostData();
		
		if(headerDetails.getNetworkID()!=null)
		domainData.setPi_network_id(headerDetails.getNetworkID());
		
		if(headerDetails.getLoginID()!=null)
			domainData.setPi_user_id(headerDetails.getLoginID());

		
		if(request.getMSISDN()!=null)
		domainData.setPi_msisdn_no(Long.parseLong(request.getMSISDN()));
		
		if(request.getAccountId()!=null)
		domainData.setPi_account_id(request.getAccountId());
		
		if(request.getChannel()!=null)
		domainData.setPi_channel(request.getChannel());
		
		
			if(request.getChannel()!=null)
			domainData.setPi_channel(request.getChannel());
			
			if(request.getRemarks()!=null)
				domainData.setPi_reason(request.getRemarks());

			
			if(request.getActivityID()!=null)
				domainData.setPi_activity_type(request.getActivityID());

		
		if(request.getTransRefNum()!=null)
		domainData.setPi_ext_trans_id(request.getTransRefNum());
			
			
		return domainData;
	}
	
	
	private ConvertPostToPreResponse setWebserviceResponse(
			ConvertPreToPostData domainData) {
		ConvertPostToPreResponse response=new ConvertPostToPreResponse();
		
		
		response.setTransactionId(domainData.getPo_transaction_id());
				return response;
	}

	

}

