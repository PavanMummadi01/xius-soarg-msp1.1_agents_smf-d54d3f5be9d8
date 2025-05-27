package com.xius.smf.webservices.smfservices;

import java.math.BigDecimal;
import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.common.error.errordetails.ErrorDetailsType;
import com.xius.agent.smf.smfmanagement.BulkCreditUpldRequest;
import com.xius.agent.smf.smfmanagement.BulkCreditUpldResponse;
import com.xius.smf.domaindata.BulkATPSubsUpldData;
import com.xius.smf.domaindata.BulkCreditUpdData;
import com.xius.smf.domaindata.BulkCreditUpldData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("BulkCreditUpldImpl")
public class BulkCreditUpldImpl {
	private  static final Logger logger = LogManager.getLogger(BulkCreditUpldImpl.class.getSimpleName());

	public BulkCreditUpldResponse bulkCreditUpld(BulkCreditUpldRequest request,HeaderDetails headerDetails) throws RemoteException,
		SMFAgentException {


	BulkCreditUpldData domainData =null;
	BulkCreditUpldResponse response=new BulkCreditUpldResponse();
	domainData = setRequestData(request, headerDetails);	
	SPFactory spfactory=ServiceUtils.executeSPWithOutCommit("pro_bulk_subs_credit_upld", domainData, domainData);

	Utilities.commitOrRollback(spfactory, domainData.getPo_error_code());
	
	if(domainData.getPo_error_code()!=0)
	{
		
		throw Utilities.setSMFAgentException(String.valueOf(domainData.getPo_error_code()), domainData.getPo_error_desc());
	}
	else
	{
		response=setWebserviceResponse(domainData);
	}
	
		
	return response;





}
	private BulkCreditUpldData setRequestData(
			BulkCreditUpldRequest request, HeaderDetails headerDetails) {
		BulkCreditUpldData domainData = new BulkCreditUpldData();
		Long[] msisdns={};
		BigDecimal[] amount={};
		if(headerDetails.getNetworkID()!=null)
		domainData.setPi_network_id(headerDetails.getNetworkID());
		
		if(headerDetails.getLoginID()!=null)
			domainData.setPi_user_id(headerDetails.getLoginID());
			
		if(request.getMSISDN().size()>0 && request.getMSISDN()!=null)
		{
			//msisdns=Utilities.convertStringArytoLongAry(request.getMSISDN().toArray(new String[0]));
			msisdns=Utilities.convertStringArytoLongAry(request.getMSISDN().toArray(new String[request.getMSISDN().size()]));
			
			domainData.setPi_msisdn_no(msisdns);
		}
		if(request.getAmount().size()>0 && request.getAmount()!=null)
		{
			amount=Utilities.convertStringArytoBigDecimalAry(request.getAmount().toArray(new String[request.getAmount().size()]));
			domainData.setPi_credit_amount(amount);
		}
		
		if(request.getReason().size()>0 && request.getReason()!=null)
		{
				domainData.setPi_reason(request.getReason().toArray(new String[request.getReason().size()]));
		}
		if(request.getChannelID()!=null )
		{
			domainData.setPi_channel(request.getChannelID());
		}
		if(request.getFilename()!=null )
		{
			domainData.setPi_file_name(request.getFilename());
		}
		
		
		
		return domainData;
	}	

	private BulkCreditUpldResponse setWebserviceResponse(
			BulkCreditUpldData domainData) {
		BulkCreditUpldResponse response=new BulkCreditUpldResponse();
		
		response.setMessage(SMFAgentConstants.SUCCESS);
		if(domainData.getPo_batch_id()!=null){
		response.setBatchId(domainData.getPo_batch_id());
		}
		return response;
	}



}
