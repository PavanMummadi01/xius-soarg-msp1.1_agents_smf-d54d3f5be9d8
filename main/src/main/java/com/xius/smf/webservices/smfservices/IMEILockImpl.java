package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.IMEILockRequest;
import com.xius.agent.smf.smfmanagement.IMEILockResponse;
import com.xius.smf.domaindata.IMEILockData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("IMEILockImpl")
public class IMEILockImpl {
	
	private  static final Logger logger = LogManager.getLogger(IMEILockImpl.class.getSimpleName());
	
	public IMEILockResponse imeiLock(
			IMEILockRequest request, HeaderDetails headerDetails) throws RemoteException,	
	SMFAgentException {
		
		IMEILockResponse response=null;		
		IMEILockData domainData =null;		
		
		domainData = setRequestData(request, headerDetails);		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_imei_block",domainData, domainData);
		
		if(logger.isInfoEnabled()) {
			logger.info( "Error code from DB - IMEILock " + domainData.getPo_error_code() );
		}
		
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());		
		if (domainData.getPo_error_code() == 0) {
			response = setWebserviceResponse(domainData);
		} else {

			response = new IMEILockResponse();
			response.setRespDescription(SMFAgentConstants.FAILURE);
			response.setTransationId(String.valueOf(domainData.getPo_transce_id()));

			throw new SMFAgentException(domainData.getPo_error_code().toString(),
					domainData.getPo_error_desc());
		}
		
		return response;
	}
	
	private IMEILockData setRequestData(IMEILockRequest request,
			HeaderDetails headerDetails) {
	
		IMEILockData domainData = new IMEILockData();
		
		domainData.setPi_network_id(headerDetails.getNetworkID());
		
		if(headerDetails.getLoginID()!=null) {
			domainData.setPi_username(headerDetails.getLoginID());
		}
		
		if(request.getIMEI()!=null){
			domainData.setPio_imei(request.getIMEI());
		}
		
		if(request.getTransReferenceNumb()!=null){
			domainData.setPi_transreferencenumb(Long.parseLong(request.getTransReferenceNumb()));
		}
		

		if(request.getReason()!=null){
			domainData.setPi_reason(request.getReason());
		}
		if(request.getComments()!=null){
			domainData.setPi_comments(request.getComments());
		}
		if(request.getSourceOfRequest()!=null){
			domainData.setPi_source_of_request(request.getSourceOfRequest());
		}
		if(request.getClarifyReason()!=null){
			domainData.setPi_clarify_reason(request.getClarifyReason());
		}
		 
		 
		
		
	 	return domainData;
	}
	
	
	private IMEILockResponse setWebserviceResponse(
			IMEILockData  domainData) {
		IMEILockResponse response = new IMEILockResponse();
			if(domainData.getPo_transce_id()!=null)
			response.setTransationId(String.valueOf(domainData.getPo_transce_id()));
			if(domainData.getPo_resp_description()!=null)
			response.setRespDescription(SMFAgentConstants.SUCCESS);
			if(domainData.getPo_effective_date()!=null)
			response.setEffectiveDate(domainData.getPo_effective_date());
			if(domainData.getPo_error_code()!=null)
			response.setRespCode(domainData.getPo_error_code().toString());
			if(domainData.getPio_imei()!=null)
			response.setIMEI(domainData.getPio_imei().toString());
			
		return response;
	}


}
