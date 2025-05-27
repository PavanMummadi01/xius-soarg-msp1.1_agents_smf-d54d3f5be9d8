package com.xius.smf.webservices.smfservices;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.BulkSpecialCreditUpldRequest;
import com.xius.agent.smf.smfmanagement.BulkSpecialCreditUpldResponse;
import com.xius.smf.domaindata.BulkSplCreditUpldData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("BulkSplCreditUpldImpl")
public class BulkSplCreditUpldImpl {
	private  static final Logger logger = LogManager.getLogger(BulkSplCreditUpldImpl.class.getSimpleName());
	public BulkSpecialCreditUpldResponse bulkSpecialCreditUpld(
			BulkSpecialCreditUpldRequest request,HeaderDetails headerDetails) throws RemoteException,
		SMFAgentException {


	BulkSplCreditUpldData domainData =null;
	BulkSpecialCreditUpldResponse response=new BulkSpecialCreditUpldResponse();
	domainData = setRequestData(request, headerDetails);	
	SPFactory spfactory=ServiceUtils.executeSPWithOutCommit("pro_bulk_subs_spcl_credit_upld", domainData, domainData);

	Utilities.commitOrRollback(spfactory, domainData.getPo_error_code());
	
	if(domainData.getPo_error_code()!=0)
	{
		
		throw Utilities.setSMFAgentException(domainData.getPo_error_code().toString(), domainData.getPo_error_desc());
	}
	else
	{
		response=setWebserviceResponse(domainData);
	}
	
		
	return response;





}
	private BulkSplCreditUpldData setRequestData(
			BulkSpecialCreditUpldRequest request, HeaderDetails headerDetails) {
		BulkSplCreditUpldData domainData = new BulkSplCreditUpldData();
		Long[] msisdns={};
		BigDecimal[] amount={};
		
		if(headerDetails.getNetworkID()!=null)
		domainData.setPi_network_id(headerDetails.getNetworkID());
		
		if(headerDetails.getLoginID()!=null)
			domainData.setPi_user_id(headerDetails.getLoginID());
		
		List<String> msisdnList = request.getMSISDN();
		if(request.getMSISDN().size()>0 && request.getMSISDN()!=null)
		{
			/*msisdns=Utilities.convertStringArytoLongAry(request.getMSISDN());
			domainData.setPi_msisdn_no(msisdns);*/
			    String[] msisdnArray = msisdnList.toArray(new String[msisdnList.size()]);
			    msisdns = Utilities.convertStringArytoLongAry(msisdnArray);
			    domainData.setPi_msisdn_no(msisdns);
		}
		List<String> amountList = request.getAmount();
		if(request.getAmount().size()>0 && request.getAmount()!=null)
		{
			/*amount=Utilities.convertStringArytoBigDecimalAry(request.getAmount());
			domainData.setPi_credit_amount(amount);*/
			 String[] amountArray = amountList.toArray(new String[amountList.size()]); // Convert list to array
			 amount = Utilities.convertStringArytoBigDecimalAry(amountArray);
			 domainData.setPi_credit_amount(amount);
		}
		
		List<String> newValidityDateList = request.getNewValidityDate();
		if(request.getNewValidityDate().size()>0 && request.getNewValidityDate()!=null)
		{
			/*domainData.setPi_validity_date(request.getNewValidityDate());*/
			String[] newValidityDateArray = newValidityDateList.toArray(new String[newValidityDateList.size()]);
		    domainData.setPi_validity_date(newValidityDateArray);
		}
		
		List<String> newGracePeriodIEndDate = request.getNewGracePeriodIEndDate();
		if(request.getNewGracePeriodIEndDate().size()>0 && request.getNewGracePeriodIEndDate()!=null)
		{
			//domainData.setPi_gp_end_date(request.getNewGracePeriodIEndDate());
			String[] newGracePeriodIEndDateArray = newGracePeriodIEndDate.toArray(new String[newGracePeriodIEndDate.size()]);
		    domainData.setPi_gp_end_date(newGracePeriodIEndDateArray);
		}
		
		List<String> NewExpiryDate = request.getNewExpiryDate();
		if(request.getNewExpiryDate().size()>0 && request.getNewExpiryDate()!=null)
		{
			//domainData.setPi_expiry_date(request.getNewExpiryDate());
			String[] NewExpiryDateArray = NewExpiryDate.toArray(new String[NewExpiryDate.size()]);
		    domainData.setPi_expiry_date(NewExpiryDateArray);
		}
		
		List<String> Reason = request.getReason();
		if(request.getReason().size()>0 && request.getReason()!=null)
		{
				//domainData.setPi_reason(request.getReason());
				String[] ReasonArray = Reason.toArray(new String[Reason.size()]);
			    domainData.setPi_reason(ReasonArray);
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

	private BulkSpecialCreditUpldResponse setWebserviceResponse(
			BulkSplCreditUpldData domainData) {
		BulkSpecialCreditUpldResponse response=new BulkSpecialCreditUpldResponse();
		
		response.setMessage(SMFAgentConstants.SUCCESS);
		if(domainData.getPo_batch_id()!=null){
		response.setBatchId(domainData.getPo_batch_id());
		}
		return response;
	}



}
