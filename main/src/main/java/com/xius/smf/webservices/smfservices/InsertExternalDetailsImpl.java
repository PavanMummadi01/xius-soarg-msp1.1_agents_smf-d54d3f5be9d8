package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.common.error.errordetails.ErrorDetailsType;
import com.xius.agent.smf.smfmanagement.InsertExternalDetailsRequest;
import com.xius.agent.smf.smfmanagement.InsertExternalDetailsResponse;
import com.xius.smf.domaindata.InsertExternalDetailsData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("InsertExternalDetailsImpl")
public class InsertExternalDetailsImpl {
	private  static final Logger logger = LogManager.getLogger(InsertExternalDetailsImpl.class.getSimpleName());
	
	public InsertExternalDetailsResponse insertExternalDetails(
			InsertExternalDetailsRequest request, HeaderDetails headerDetails) throws RemoteException,
		    SMFAgentException {
		
		InsertExternalDetailsResponse response =new InsertExternalDetailsResponse();
		InsertExternalDetailsData domainData = null;
domainData = setRequestData(request, headerDetails);
		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_insert_sim_act_ext_dtls",domainData, domainData);
		
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from pro_insert_sim_act_ext_dtls   ==>" + domainData.getPo_error_code());
			logger.info( "Error Msg from pro_insert_sim_act_ext_dtls   ==>" + domainData.getPo_error_desc());
		}
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

	private InsertExternalDetailsData setRequestData(
			InsertExternalDetailsRequest request, HeaderDetails headerDetails) {
		InsertExternalDetailsData data =  new InsertExternalDetailsData();
		
		if(headerDetails.getNetworkID()!= null)
		data.setPi_network_id(headerDetails.getNetworkID());
		
		if(headerDetails.getLoginID()!= null)
			data.setPi_username(headerDetails.getLoginID());
		
		if(request.getMSISDN() != null)
			data.setPi_msisdn_no(Long.parseLong(request.getMSISDN()));
		if(request.getSIMNo() != null)
			data.setPi_sim_no(request.getSIMNo());	
		if(request.getTPID() != null)
			data.setPi_tpid(request.getTPID());
		if(request.getIDType() != null)
			data.setPi_id_type(request.getIDType());
		
		if(request.getIDValue() != null)
			data.setPi_id_value(request.getIDValue());
		
		if(request.getInvokerID() != null)
			data.setPi_invoker_id(request.getInvokerID());
	
		
		if(request.getTransRefNumber()!= null)
			data.setPi_original_trans_id(request.getTransRefNumber());
		if(request.getExternalID()!=null)
			data.setPi_external_id(request.getExternalID());
		
		if(request.getChannel() != null)
			data.setPi_channel(request.getChannel());
		
		
		return data;
	}

	private InsertExternalDetailsResponse setWebserviceResponse(
			InsertExternalDetailsData domainData) {
		InsertExternalDetailsResponse response = new InsertExternalDetailsResponse();
		
		response.setRespDescription(SMFAgentConstants.SUCCESS);
		response.setRespCode( domainData.getPo_error_code()+"");
		if(domainData.getPo_trans_ref_id()!=null)
		response.setTransID(domainData.getPo_trans_ref_id());
		response.setTransRefNumber(domainData.getPi_original_trans_id());
		return response;
	}
	}