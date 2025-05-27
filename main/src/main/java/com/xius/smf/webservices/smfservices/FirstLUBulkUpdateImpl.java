package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.FirstLUBulkInsertRequest;
import com.xius.agent.smf.smfmanagement.FirstLUBulkInsertResponse;
import com.xius.smf.domaindata.FirstLUBulkData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("FirstLUBulkUpdateImpl")
public class FirstLUBulkUpdateImpl {
	
	private  static final Logger logger = LogManager.getLogger(FirstLUBulkUpdateImpl.class.getSimpleName());
	
	 public FirstLUBulkInsertResponse firstLUBulkUpdate(FirstLUBulkInsertRequest request,HeaderDetails header) throws RemoteException,	
	SMFAgentException {
		
		 FirstLUBulkInsertResponse response=null;		
		 FirstLUBulkData domainData =null;		
		
		domainData = setRequestData(request, header);		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_bulk_flu_insert",domainData, domainData);
		
		if(logger.isInfoEnabled()) {
			logger.info( "Error code from DB - bulk LU insert " + domainData.getPo_error_code() );
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
	
	private FirstLUBulkData setRequestData(FirstLUBulkInsertRequest request,
			HeaderDetails headerDetails) {
	
		FirstLUBulkData domainData = new FirstLUBulkData();
		
		domainData.setPi_network_id(headerDetails.getNetworkID());
		domainData.setPi_iccid_from(request.getICCIDFrom());
		domainData.setPi_iccid_to(request.getICCIDTo());
		if (request.getNIRCode()!=null){
		domainData.setPi_nir_code(request.getNIRCode());
		}
		if (request.getOfficeCode()!=null){
		domainData.setPi_office_Code(request.getOfficeCode());
		}
		if(request.getChannel()!=null) {
				domainData.setPi_channel(request.getChannel());
		}
		if(headerDetails.getLoginID()!=null) {
			domainData.setPi_username(headerDetails.getLoginID());
		}
	 	return domainData;
	}
	
	
	private FirstLUBulkInsertResponse setWebserviceResponse(
			FirstLUBulkData domainData) {
		FirstLUBulkInsertResponse response=new FirstLUBulkInsertResponse();
		response.setRefTransId(domainData.getPo_trans_id());
		
			return response;
	}

}
