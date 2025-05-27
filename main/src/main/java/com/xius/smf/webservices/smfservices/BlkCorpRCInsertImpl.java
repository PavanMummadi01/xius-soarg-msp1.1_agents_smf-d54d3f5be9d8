package com.xius.smf.webservices.smfservices;

import net.bcgi.util.db.SPFactory;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.BlkCorpRCInsertRequest;
import com.xius.agent.smf.smfmanagement.BlkCorpRCInsertResponse;
import com.xius.smf.domaindata.BlkCorpRCInsertData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("BlkCorpRCInsertImpl")
public class BlkCorpRCInsertImpl {
	private  static final Logger logger = LogManager.getLogger(BlkCorpRCInsertImpl.class.getSimpleName());

	public BlkCorpRCInsertResponse blkCorpRCInsert(BlkCorpRCInsertRequest request,
			HeaderDetails headerDetails) throws SMFAgentException {
		BlkCorpRCInsertResponse response = new BlkCorpRCInsertResponse();
		BlkCorpRCInsertData domainData = null;

		domainData = setRequestData(request, headerDetails);
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_corp_bulk_rct_req",domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from  pro_corp_bulk_rct_req  ==>" + domainData.getPo_error_code());
			logger.info("Error Msg from  pro_corp_bulk_rct_req  ==>" + domainData.getPo_error_desc());
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
	
	private BlkCorpRCInsertData setRequestData(BlkCorpRCInsertRequest request,
			HeaderDetails headerDetails) {
		BlkCorpRCInsertData domainData = new BlkCorpRCInsertData();
		
		domainData.setPi_network_id(headerDetails.getNetworkID());
		domainData.setPi_login_id(headerDetails.getLoginID());
		
		if(request.getMsisdn()!=null)
		{	
		if(request.getMsisdn().size()>0) {
			List<Long> msisdnList = request.getMsisdn(); // Assuming this returns a List<Long>
			Long[] msisdnArray = msisdnList.toArray(new Long[0]);
		  domainData.setPi_msisdn_no(msisdnArray);
		}
		}
		

		if(request.getAccountId()!=null)
		{	
			if(request.getAccountId().size()>0){
				//domainData.setPi_account_id(Utilities.convertLongArytolongAry(request.getAccountId()));
				List<Long> accountIdList = request.getAccountId();
				Long[] accountIdArray = new Long[accountIdList.size()];
				for (int i = 0; i < accountIdList.size(); i++) {
				accountIdArray[i] = accountIdList.get(i);
		}
			domainData.setPi_account_id(accountIdArray);
		}
		}
		domainData.setPi_activity_type(22L);// need to change this value**********************************************************
		
		if(request.getRcId()!=null)
		{	
		if(request.getRcId().size()>0)
		domainData.setPi_rc_id(request.getRcId().toArray(new String[request.getAccountId().size()]));
		}
		
		if(request.getRcCategory()!=null)
		{	
		if(request.getRcCategory().size()>0)
		domainData.setPi_rc_category(request.getRcCategory().toArray(new String[request.getAccountId().size()]));
		}
		
		
		if(request.getRcAmt()!=null)
		{	
		if(request.getRcAmt().size()>0)
		domainData.setPi_rc_amount(Utilities.convertStringArytoBigDecimalAry(request.getRcAmt().toArray(new String[request.getRcAmt().size()])));
		}
		
		
		if(request.getChannel()!=null)
			domainData.setPi_channel_id(request.getChannel());
		
			
			if(request.getReason()!=null)
			{	
			if(request.getReason().size()>0)
			domainData.setPi_reason(request.getReason().toArray(new String[request.getRcAmt().size()]));
			}
			
			if(request.getOfficecode()!=null)
			{	
			if(request.getOfficecode().size()>0)
			domainData.setPi_office_code(Utilities.convertStringArytoLongAry(request.getOfficecode().toArray(new String[request.getRcAmt().size()])));
			}
			
			if(request.getMrp()!=null)
			{	
			if(request.getMrp().size()>0)
			domainData.setPi_mrp(Utilities.convertStringArytoBigDecimalAry(request.getMrp().toArray(new String[request.getRcAmt().size()])));
			}
		
		return domainData;
	}

	private BlkCorpRCInsertResponse setWebserviceResponse(
			BlkCorpRCInsertData domainData) {
		BlkCorpRCInsertResponse response = new BlkCorpRCInsertResponse();
		
		if(domainData.getPo_transaction_id() != null)
			response.setTransactionId(domainData.getPo_transaction_id());
		
		return response;
	}

}
