package com.xius.smf.webservices.smfservices;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.BulkTPChangeUpdateRequest;
import com.xius.agent.smf.smfmanagement.BulkTPChangeUpdateResponse;
import com.xius.smf.domaindata.BulkTPSubsUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("BulkTPChangeUpdateImpl")
public class BulkTPChangeUpdateImpl {
	private  static final Logger logger = LogManager.getLogger(BulkTPChangeUpdateImpl.class.getSimpleName());
	public BulkTPChangeUpdateResponse bulkTPChangeUpdate(
			BulkTPChangeUpdateRequest request, HeaderDetails headerDetails) throws SMFAgentException {
		
		BulkTPChangeUpdateResponse response = new BulkTPChangeUpdateResponse();
		
		BulkTPSubsUpdateData domainData = null;
		domainData = setRequestData(request, headerDetails);
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_bulk_tarifpack_change_upd",domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from pro_bulk_tarifpack_change_upd  ==>" + domainData.getPo_error_code());
			logger.info( "Error Msg from pro_bulk_tarifpack_change_upd  ==>" + domainData.getPo_error_desc());
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

	private BulkTPSubsUpdateData setRequestData(
			BulkTPChangeUpdateRequest request, HeaderDetails headerDetails) {
		BulkTPSubsUpdateData data = new BulkTPSubsUpdateData();
		 if(headerDetails.getNetworkID()!= null)
		  		data.setPi_network_id(headerDetails.getNetworkID());
		 if(request.getTransactionId() != null)
			 data.setPi_transaction_id(request.getTransactionId());
		 if(request.getOldTariffPackId() != null)
			 data.setPi_old_tarrif_pack_id(request.getOldTariffPackId());
		 if(request.getStatus() != null)
			 data.setPi_status(request.getStatus());
		 if(request.getRemarks() != null)
			 data.setPi_remarks(request.getRemarks());
		 if(request.getExtErrorCode() != null)
			 data.setPi_ext_error_code(request.getExtErrorCode());
		 if(request.getCharge()!= null)
			 data.setPi_charge(new BigDecimal(request.getCharge()));
		return data;
	}

	private BulkTPChangeUpdateResponse setWebserviceResponse(
			BulkTPSubsUpdateData domainData) {
		BulkTPChangeUpdateResponse response = new BulkTPChangeUpdateResponse();
		response.setMessage(SMFAgentConstants.SUCCESS);
		return response;
	}
}
