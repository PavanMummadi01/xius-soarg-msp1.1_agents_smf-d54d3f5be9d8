package com.xius.smf.webservices.smfservices;

import net.bcgi.util.db.SPFactory;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import com.xius.agent.smf.smfmanagement.BlkCorpActDeActInsertRequest;
import com.xius.agent.smf.smfmanagement.BlkCorpActDeActInsertResponse;
import com.xius.smf.domaindata.BlkCorpActDeActInsertData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("BlkCorpActDeActInsertImpl")
public class BlkCorpActDeActInsertImpl {
	private  static final Logger logger = LogManager.getLogger(BlkCorpActDeActInsertImpl.class.getSimpleName());

	public BlkCorpActDeActInsertResponse blkCorpActDeActInsert(BlkCorpActDeActInsertRequest request,
			HeaderDetails headerDetails) throws SMFAgentException {
		BlkCorpActDeActInsertResponse response = new BlkCorpActDeActInsertResponse();
		BlkCorpActDeActInsertData domainData = null;

		domainData = setRequestData(request, headerDetails);
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_corp_deactive_reactive_req",domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from  pro_corp_deactive_reactive_req  ==>" + domainData.getPo_error_code());
			logger.info( "Error Msg from  pro_corp_deactive_reactive_req  ==>" + domainData.getPo_error_desc());
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
	
	private BlkCorpActDeActInsertData setRequestData(BlkCorpActDeActInsertRequest request,
			HeaderDetails headerDetails) {
		BlkCorpActDeActInsertData domainData = new BlkCorpActDeActInsertData();
		
		domainData.setPi_network_id(headerDetails.getNetworkID());
		domainData.setPi_login_id(headerDetails.getLoginID());
		
		if(request.getMsisdn()!=null)
		{	
			
				
		if(request.getMsisdn().size()>0) {
		List<Long> msisdnList = request.getMsisdn(); 
		Long[] msisdnArray = msisdnList.toArray(new Long[0]);
		domainData.setPi_msisdn_no(msisdnArray);
		//domainData.setPi_msisdn_no(Utilities.convertStringArytoLongAry(request.getMsisdn()));
		}
		}
		

		if(request.getAccountId()!=null)
		{	
		if(request.getAccountId().size()>0) {
		List<Long> msisdnList = request.getAccountId();
		 Long[] msisdnArray = msisdnList.toArray(new Long[0]);
		 domainData.setPi_account_id(msisdnArray);
		//domainData.setPi_account_id(Utilities.convertStringArytoLongAry(request.getAccountId().toArray(new String[request.getAccountId().size()])));
		}}
		
		if(request.getActivityType()!=null)
		{	
		if(request.getActivityType().size()>0)
		domainData.setPi_activity_type(request.getActivityType().toArray(new String[request.getActivityType().size()]));
		}
		
		if(request.getChannel()!=null)
			domainData.setPi_channel_id(request.getChannel());
		
			
			if(request.getReason()!=null)
			{	
			if(request.getReason().size()>0)
			domainData.setPi_reason(request.getReason().toArray(new String[request.getReason().size()]));
			}
			
			if(request.getOfficecode()!=null)
			{	
			if(request.getOfficecode().size()>0)
			domainData.setPi_office_code(Utilities.convertStringArytoLongAry(request.getOfficecode().toArray(new String[request.getOfficecode().size()])));
			}
			
		
		return domainData;
	}

	private BlkCorpActDeActInsertResponse setWebserviceResponse(
			BlkCorpActDeActInsertData domainData) {
		BlkCorpActDeActInsertResponse response = new BlkCorpActDeActInsertResponse();
		
		if(domainData.getPo_transaction_id() != null)
			response.setTransactionId(domainData.getPo_transaction_id());
		
		return response;
	}

}
