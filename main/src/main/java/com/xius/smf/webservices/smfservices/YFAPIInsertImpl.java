package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;


import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.YFAPIInsertRequest;
import com.xius.agent.smf.smfmanagement.YFAPIInsertResponse;
import com.xius.smf.domaindata.YFAPIInsertData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("YFAPIInsertImpl")
public class YFAPIInsertImpl {
	
	private  static final Logger logger = LogManager.getLogger(YFAPIInsertImpl.class.getSimpleName());

	public YFAPIInsertResponse YFAPIInsert(YFAPIInsertRequest request, HeaderDetails header) throws RemoteException,	
	SMFAgentException {
		
		YFAPIInsertResponse response=null;		
		YFAPIInsertData domainData =null;		
		
		domainData = setRequestData(request, header);		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_thiredparty_notification",domainData, domainData);
		
		if(logger.isInfoEnabled()) {
			logger.info( "Error code from DB - YFAPIInsert " + domainData.getPo_error_code() );
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
	
	private YFAPIInsertData setRequestData(YFAPIInsertRequest request,
			HeaderDetails headerDetails) {
	
		YFAPIInsertData domainData = new YFAPIInsertData();
		
		domainData.setPi_network_id(headerDetails.getNetworkID());
		
		if(headerDetails.getLoginID()!=null) {
			domainData.setPi_username(headerDetails.getLoginID());
		}
		
		if(request.getMSISDN()!=null){
			domainData.setPi_msisdn_no(Long.valueOf(request.getMSISDN()));
		}
		
		if(request.getAccountId()!=null){
			domainData.setPi_account_id(Long.valueOf(request.getAccountId()));
		}
		
		if(request.getDpi()!=null){
			domainData.setPi_dpi(request.getDpi());
		}
		
		if(request.getSIM()!=null){
			domainData.setPi_sim_no(request.getSIM());
		}
		
		if(request.getIMSI()!=null){
			domainData.setPi_imsi(request.getIMSI());
		}
		
		if(request.getSellerCode()!=null){
			domainData.setPi_sellercode(request.getSellerCode());
		}
		
		if(request.getWalletUnits()!=null){
			domainData.setPi_walletunits(Long.valueOf(request.getWalletUnits()));
		}
		
		if(request.getActivity()!=null){
			domainData.setPi_activity(request.getActivity());
		}
		
		if(request.getTransactionId()!=null){
			domainData.setPi_transaction_id(request.getTransactionId());
		}
		
		if(request.getExtTransId()!=null){
			domainData.setPi_external_trans_id(request.getExtTransId());
		}
		
		
		if(request.getNIT()!=null){
			domainData.setPi_nit(request.getNIT());
		}
		
		if(request.getFirstName()!=null){
			domainData.setPi_first_name(request.getFirstName());
		}
		
		if(request.getLastName()!=null){
			domainData.setPi_last_name(request.getLastName());
		}
		
		if(request.getPublicityID()!=null){
			domainData.setPi_publicity_id(request.getPublicityID());
		}
		
		if(request.getAmount()!=null){
			domainData.setPi_amount(request.getAmount().longValue());
		}
		
		if(request.getChannel()!=null){
			domainData.setPi_channel(request.getChannel());
		}
		
		if(request.getDescription()!=null){
			domainData.setPi_pack_description(request.getDescription());
		}
		
		if(request.getAuthorizationID()!=null){
			domainData.setPi_authentic_code(request.getAuthorizationID());
		}
		
	 	return domainData;
	}
	
	
	private YFAPIInsertResponse setWebserviceResponse(
			YFAPIInsertData domainData) {
		YFAPIInsertResponse response = new YFAPIInsertResponse();
		response.setStatus(SMFAgentConstants.SUCCESS);
		return response;
	}


}
