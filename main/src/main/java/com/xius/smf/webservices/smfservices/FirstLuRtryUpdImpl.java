package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.FirstLuRtryUpdRequest;
import com.xius.agent.smf.smfmanagement.FirstLuRtryUpdResponse;
import com.xius.smf.domaindata.FirstLuRtryUpdData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("FirstLuRtryUpdImpl")
public class FirstLuRtryUpdImpl {
	private  static final Logger logger = LogManager.getLogger(FirstLuRtryUpdImpl.class.getSimpleName());

	
	
	public FirstLuRtryUpdResponse firstLuRtryUpd(FirstLuRtryUpdRequest request,HeaderDetails headerDetails)
			throws RemoteException,SMFAgentException {

		FirstLuRtryUpdData domainData = null;
		SPFactory spFactory = null;

		
		FirstLuRtryUpdResponse response=null;
		
		
		domainData = setRequestData(request, headerDetails);
		spFactory = ServiceUtils.executeSPWithOutCommit("pro_first_lu_rtry_upd", domainData, domainData);

		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}

		Long errCode = domainData.getPo_error_code();
		String errMsg = domainData.getPo_error_desc();
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from   ==>" + errCode);
			logger.info( "Error Msg from  ==>" + errMsg);
		}

		Utilities.commitOrRollback(spFactory, errCode);

		if (errCode == 0) {
			response = setWebserviceResponse(domainData);
		} else
			throw Utilities.setSMFAgentException(errCode.toString(), errMsg);

		return response;
	}
	
	
	private FirstLuRtryUpdData setRequestData(
			FirstLuRtryUpdRequest request, HeaderDetails headerDetails) {

		FirstLuRtryUpdData domainData = new FirstLuRtryUpdData();

		if (headerDetails.getNetworkID() != null)
			domainData.setPi_network_id(headerDetails.getNetworkID());

		if (Utilities.isNull(request.getTransactionId()) == false)
			domainData.setPi_trans_id(request.getTransactionId().trim());

		if (Utilities.isNull(request.getStatus()) == false)
			domainData.setPi_status(request.getStatus().trim());
		
		
		if (Utilities.isNull(request.getMSISDN()) == false)
			domainData.setPi_msisdn_no(Long.parseLong(request.getMSISDN()));
		
		if (Utilities.isNull(request.getBAN()) == false)
			domainData.setPi_bussines_account_id(request.getBAN().trim());

		if (Utilities.isNull(request.getRemarks()) == false)
			domainData.setPi_remarks(request.getRemarks().trim());
		
		if(request.getExtErrorCode()!=null)
			domainData.setPi_ext_error_code(request.getExtErrorCode());

		return domainData;
	}
	
	private FirstLuRtryUpdResponse setWebserviceResponse(
			FirstLuRtryUpdData domainData) {

		FirstLuRtryUpdResponse response = new FirstLuRtryUpdResponse();

		if(domainData.getPo_link_transaction_id()!=null)
		response.setLinkTransId(domainData.getPo_link_transaction_id());
		
		if (Utilities.isNull(domainData.getPo_error_desc()) == false)
			response.setMessage(domainData.getPo_error_desc());

		return response;
	}
	
}
