package com.xius.smf.webservices.smfservices;

import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.BucketsSummaryUpdateRequest;
import com.xius.agent.smf.smfmanagement.BucketsSummaryUpdateResponse;
import com.xius.smf.domaindata.BucketsSummaryUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("BucketsSummaryUpdateImpl")
public class BucketsSummaryUpdateImpl {
	private  static final Logger logger = LogManager.getLogger(BucketsSummaryUpdateImpl.class.getSimpleName());

	public BucketsSummaryUpdateResponse bucketsSummaryUpdate(
			BucketsSummaryUpdateRequest request, HeaderDetails headerDetails) throws SMFAgentException {
		BucketsSummaryUpdateResponse response =new BucketsSummaryUpdateResponse();
		BucketsSummaryUpdateData domainData = null;
domainData = setRequestData(request, headerDetails);
		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_bkt_summary_req_update",domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info("Error Code from pro_bkt_summary_req_update  ==>" + domainData.getPo_error_code());
			logger.info( "Error Msg from pro_bkt_summary_req_update  ==>" + domainData.getPo_error_desc());
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

	private BucketsSummaryUpdateData setRequestData(
			BucketsSummaryUpdateRequest request, HeaderDetails headerDetails) {
		BucketsSummaryUpdateData data =  new BucketsSummaryUpdateData();
		if(headerDetails.getNetworkID()!= null)
		data.setPi_network_id(headerDetails.getNetworkID());
		if(request.getTransactionId() != null)
		data.setPi_transaction_id(request.getTransactionId());
		if(request.getStatus() != null)
		data.setPi_status(request.getStatus());
		if(request.getRemarks() != null)
		data.setPi_remarks(request.getRemarks());
		return data;
	}

	private BucketsSummaryUpdateResponse setWebserviceResponse(
			BucketsSummaryUpdateData domainData) {
		BucketsSummaryUpdateResponse response = new BucketsSummaryUpdateResponse();
		response.setMessage(SMFAgentConstants.SUCCESS);
		
		return response;
	}

}

