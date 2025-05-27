package com.xius.smf.webservices.smfservices;

import java.math.BigDecimal;
import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.BulkDebitUpldRequest;
import com.xius.agent.smf.smfmanagement.BulkDebitUpldResponse;
import com.xius.smf.domaindata.BulkDebitUpldData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;


@Service("BulkDebitUpldImpl")
public class BulkDebitUpldImpl {
	private  static final Logger logger = LogManager.getLogger(BulkDebitUpldImpl.class.getSimpleName());

	public BulkDebitUpldResponse BulkDebitUpld(BulkDebitUpldRequest request,HeaderDetails headerDetails) throws RemoteException,
		SMFAgentException {


	BulkDebitUpldData domainData =null;
	BulkDebitUpldResponse response=new BulkDebitUpldResponse();
	domainData = setRequestData(request, headerDetails);	
	SPFactory spfactory=ServiceUtils.executeSPWithOutCommit("pro_bulk_subs_debit_upld", domainData, domainData);

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
	private BulkDebitUpldData setRequestData(
			BulkDebitUpldRequest request, HeaderDetails headerDetails) {
		BulkDebitUpldData domainData = new BulkDebitUpldData();
		Long[] msisdns={};
		BigDecimal[] amount={};
		if(headerDetails.getNetworkID()!=null)
		domainData.setPi_network_id(headerDetails.getNetworkID());
		
		if(headerDetails.getLoginID()!=null)
			domainData.setPi_user_id(headerDetails.getLoginID());
			
		if(request.getMSISDN().size()>0 && request.getMSISDN()!=null)
		{
			msisdns=Utilities.convertStringArytoLongAry(request.getMSISDN().toArray(new String[request.getMSISDN().size()]));
			domainData.setPi_msisdn_no(msisdns);
		}
		if(request.getAmount().size()>0 && request.getAmount()!=null)
		{
			amount=Utilities.convertStringArytoBigDecimalAry(request.getAmount().toArray(new String[request.getMSISDN().size()]));
			domainData.setPi_debit_amount(amount);
		}
		
		if(request.getReason().size()>0 && request.getReason()!=null)
		{
				domainData.setPi_reason(request.getReason().toArray(new String[0]));
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

	private BulkDebitUpldResponse setWebserviceResponse(
			BulkDebitUpldData domainData) {
		BulkDebitUpldResponse response=new BulkDebitUpldResponse();
		
		response.setMessage(SMFAgentConstants.SUCCESS);
		if(domainData.getPo_batch_id()!=null){
		response.setBatchId(domainData.getPo_batch_id());
		}
		return response;
	}



}
