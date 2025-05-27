package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.DeleteExternalDetailsRequest;
import com.xius.agent.smf.smfmanagement.DeleteExternalDetailsResponse;
import com.xius.smf.domaindata.DeleteExternalDetailsData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("DeleteExternalDetailsImpl")
public class DeleteExternalDetailsImpl {

	private  static final Logger logger = LogManager.getLogger(DeleteExternalDetailsImpl.class.getSimpleName());

	public DeleteExternalDetailsResponse deleteExternalDetails(
			DeleteExternalDetailsRequest request, HeaderDetails headerDetails)
			throws RemoteException, SMFAgentException {

		DeleteExternalDetailsResponse response = new DeleteExternalDetailsResponse();

		DeleteExternalDetailsData domainData = null;
		logger.info("setRequestData........................");
		
		domainData = setRequestData(request, headerDetails);
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_del_external_dtils",domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from  pro_del_external_dtils   ==>" + domainData.getPo_error_code());
			logger.info( "Error Msg from  pro_del_external_dtils   ==>" + domainData.getPo_error_desc());
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

	public DeleteExternalDetailsData setRequestData(
			DeleteExternalDetailsRequest request, HeaderDetails headerDetails) {
		DeleteExternalDetailsData data =new DeleteExternalDetailsData();
					
						if(headerDetails.getNetworkID()!= null)
							data.setPi_network_id(headerDetails.getNetworkID());
						
						if(headerDetails.getLoginID()!= null)
							data.setPi_username(headerDetails.getLoginID());
					
						if(request.getChannel()!=null){
							data.setPi_channel(request.getChannel());
						}
						if(request.getExternalID()!=null){
							data.setPi_external_id(request.getExternalID());
						}
						if(request.getIDValue()!=null){
							data.setPi_id_value(request.getIDValue());
						}
						
						if(request.getMSISDN()!=null){
							data.setPi_msisdn(Long.parseLong(request.getMSISDN()));
						}
						
						if(request.getSIMNo()!=null){
							data.setPi_sim_no(request.getSIMNo());
						}
						if(request.getTransRefNumber()!=null){
							data.setPio_trans_ref_num(request.getTransRefNumber());
						}
						if(request.getInvokerID()!=null){
							data.setPi_invoker_id(request.getInvokerID());
						}
						
						
		return data;
	}

	public  DeleteExternalDetailsResponse setWebserviceResponse(
			DeleteExternalDetailsData domainData) {
		
		DeleteExternalDetailsResponse response= new DeleteExternalDetailsResponse();
		
		response.setRespDescription(SMFAgentConstants.SUCCESS);
		response.setRespCode( domainData.getPo_error_code()+"");
		if(domainData.getPo_trans_id()!=null)
		response.setTransID(domainData.getPo_trans_id());
		response.setTransRefNumber(domainData.getPio_trans_ref_num());
		
		
		return response;
	}

}
