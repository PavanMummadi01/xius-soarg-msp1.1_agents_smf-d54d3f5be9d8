package com.xius.smf.webservices.smfservices;

import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.BucketsSummaryInsertRequest;
import com.xius.agent.smf.smfmanagement.BucketsSummaryInsertResponse;
import com.xius.smf.domaindata.BucketsSummaryInsertData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("BucketsSummaryInsertImpl")
public class BucketsSummaryInsertImpl {
	private  static final Logger logger = LogManager.getLogger(BucketsSummaryInsertImpl.class.getSimpleName());
	public BucketsSummaryInsertResponse bucketsSummaryInsert(
			BucketsSummaryInsertRequest request, HeaderDetails headerDetails) throws SMFAgentException {
		BucketsSummaryInsertResponse response =new BucketsSummaryInsertResponse();
		BucketsSummaryInsertData domainData = null;
		domainData = setRequestData(request, headerDetails);
		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_bkt_summary_req_insert",domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from pro_bkt_summary_req_insert  ==>" + domainData.getPo_error_code());
			logger.info( "Error Msg from pro_bkt_summary_req_insert  ==>" + domainData.getPo_error_desc());
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

	private BucketsSummaryInsertData setRequestData(
			BucketsSummaryInsertRequest request, HeaderDetails headerDetails) {
		BucketsSummaryInsertData data = new BucketsSummaryInsertData();
	      if(headerDetails.getNetworkID()!= null)
	  		data.setPi_network_id(headerDetails.getNetworkID());
	      if(request.getMSISDN() != null)
	    	  data.setPi_msisdn_no(Long.parseLong(request.getMSISDN()));
	      if(request.getAccountId() != null)
	      	data.setPi_account_id(Long.parseLong(request.getAccountId()));
	      if(headerDetails.getLoginID() != null)
	      	data.setPi_login_id(headerDetails.getLoginID());
	      if(request.getChannelId() != null)
	      	data.setPi_channel_id(request.getChannelId());
	      if(request.getTransRefNumber() != null)
	      	data.setPi_ext_trans_id(request.getTransRefNumber());
		return data;
	}
	
	private BucketsSummaryInsertResponse setWebserviceResponse(
			BucketsSummaryInsertData domainData) {
		BucketsSummaryInsertResponse response = new BucketsSummaryInsertResponse();
		response.setTransactionId(domainData.getPo_transaction_id());
		response.setMessage(SMFAgentConstants.SUCCESS);
		return response;
	}
	
}
