package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.postpaidmanagement.ConvertPreToPostUpdRequest;
import com.xius.agent.smf.postpaidmanagement.ConvertPreToPostUpdResponse;
import com.xius.smf.domaindata.ConvertPreToPostUpdData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("ConvertPreToPostUpdImpl")
public class ConvertPreToPostUpdImpl {
	private  static final Logger logger = LogManager.getLogger(ConvertPreToPostUpdImpl.class.getSimpleName());
	public ConvertPreToPostUpdResponse convertPreToPostUpd(
			ConvertPreToPostUpdRequest request,HeaderDetails header) throws RemoteException,
		SMFAgentException {
		
		ConvertPreToPostUpdResponse response=new ConvertPreToPostUpdResponse();
		
		ConvertPreToPostUpdData domainData =null;
		
		
		domainData = setRequestData(request, header);
		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_pre_post_convert_req_upd",domainData, domainData);
		
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
	
	private ConvertPreToPostUpdData setRequestData(ConvertPreToPostUpdRequest request,
			HeaderDetails headerDetails) {
	
		ConvertPreToPostUpdData domainData = new ConvertPreToPostUpdData();
		
		if(headerDetails.getNetworkID()!=null)
		domainData.setPi_network_id(headerDetails.getNetworkID());
			
		if(request.getTransactionId()!=null)
		domainData.setPi_transaction_id(request.getTransactionId());
		
		if(request.getExtErrorCode()!=null)
		domainData.setPi_ext_err_code(request.getExtErrorCode());
		
		if(request.getStatus()!=null)
		domainData.setPi_status(request.getStatus());
		
		if(request.getRemarks()!=null)
			domainData.setPi_remarks(request.getRemarks());

		if (request.getCurStateId() != null) {
			domainData.setPi_current_state_id(Long.parseLong(request
					.getCurStateId()));
		}
			
		if (request.getTariffPlanID() != null) {
			domainData.setPi_tariff_pack_id(Long.parseLong(request
					.getTariffPlanID()));
		}
		
		if (request.getTariffPlanName() != null) {
			domainData.setPi_tariff_pack_name(request.getTariffPlanName());
		}
		
		if (request.getBillCycleDay() != null) {
			domainData.setPi_bill_cycle_day(Long.parseLong(request.getBillCycleDay()));
		}
		
		if (request.getCreditLimit() != null) {
			domainData.setPi_credit_limit(request.getCreditLimit());
		}
			
		return domainData;
	}
	
	
	private ConvertPreToPostUpdResponse setWebserviceResponse(
			ConvertPreToPostUpdData domainData) {
		ConvertPreToPostUpdResponse response=new ConvertPreToPostUpdResponse();
		
		
		response.setMessage("success");
				return response;
	}

	

}



