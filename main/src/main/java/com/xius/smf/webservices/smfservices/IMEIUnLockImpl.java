package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.IMEIUnlockRequest;
import com.xius.agent.smf.smfmanagement.IMEIUnlockResponse;
import com.xius.smf.domaindata.IMEIUnLockData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("IMEIUnLockImpl")
public class IMEIUnLockImpl {
	
	private  static final Logger logger = LogManager.getLogger(IMEIUnLockImpl.class.getSimpleName());
	
	public IMEIUnlockResponse imeiUnlock(
			IMEIUnlockRequest request, HeaderDetails headerDetails) throws RemoteException,	SMFAgentException {
		
		IMEIUnlockResponse response=null;		
		IMEIUnLockData domainData =null;
		
		domainData = setRequestData(request, headerDetails);		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_imei_unblock",domainData, domainData);
		
		if(logger.isInfoEnabled()) {
			logger.info( "Error code from DB - IMEILock " + domainData.getPo_error_code() );
		}
		
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());		
		if (domainData.getPo_error_code() == 0) {
			response = setWebserviceResponse(domainData);
		} else {

			response = new IMEIUnlockResponse();
			response.setRespDescription(SMFAgentConstants.FAILURE);
			response.setTransationId(String.valueOf(domainData.getPo_transce_id()));

			throw new SMFAgentException(domainData.getPo_error_code().toString(),
					domainData.getPo_error_desc());
		}
		
		return response;
	}
	
	private IMEIUnLockData setRequestData(IMEIUnlockRequest request,
			HeaderDetails headerDetails) {
	
		IMEIUnLockData domainData = new IMEIUnLockData();
		
		domainData.setPi_network_id(headerDetails.getNetworkID());
		
		if(headerDetails.getLoginID()!=null) {
			domainData.setPi_username(headerDetails.getLoginID());
		}
		
		if(request.getIMEI()!=null && request.getIMEI().length()>0){
			domainData.setPio_imei(request.getIMEI());
		}
		
		if(request.getTransReferenceNumb()!=null && request.getTransReferenceNumb().length()>0){
			domainData.setPi_transreferencenumb(Long.parseLong(request.getTransReferenceNumb()));
		}
		
		if(request.getReason()!=null  && request.getReason().length()>0){
			domainData.setPi_reason(request.getReason());
		}
		 
		if(request.getComments()!=null  && request.getComments().length()>0){
			domainData.setPi_comments(request.getComments());
		}
		if(request.getSourceOfRequest()!=null && request.getSourceOfRequest().length()>0){
			domainData.setPi_source_of_request(request.getSourceOfRequest());
		}
		if(request.getClarifyReason()!=null  && request.getClarifyReason().length()>0){
			domainData.setPi_clarify_reason(request.getClarifyReason());
		}
		 
		
		
	 	return domainData;
	}
	
	
	private IMEIUnlockResponse setWebserviceResponse(
			IMEIUnLockData  domainData) {
		IMEIUnlockResponse response = new IMEIUnlockResponse();
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