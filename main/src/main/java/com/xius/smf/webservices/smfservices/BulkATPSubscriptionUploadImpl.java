package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.BulkATPSubscriptionUploadRequest;
import com.xius.agent.smf.smfmanagement.BulkATPSubscriptionUploadResponse;
import com.xius.smf.domaindata.BulkATPSubsUpldData;
import com.xius.smf.domaindata.SIMActivationData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("BulkATPSubscriptionUploadImpl")
public class BulkATPSubscriptionUploadImpl {
	
	
	public BulkATPSubscriptionUploadResponse bulkATPSubscriptionUpload(
		BulkATPSubscriptionUploadRequest request,HeaderDetails headerDetails) throws RemoteException,SMFAgentException {


		BulkATPSubsUpldData domainData =null;
		BulkATPSubscriptionUploadResponse response=new BulkATPSubscriptionUploadResponse();
	
		domainData = setRequestData(request, headerDetails);	

	SPFactory spfactory=ServiceUtils.executeSPWithOutCommit("pro_bulkatp_subscription_upld", domainData, domainData);

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
	private BulkATPSubsUpldData setRequestData(
			BulkATPSubscriptionUploadRequest request, HeaderDetails headerDetails2) {
		BulkATPSubsUpldData domainData = new BulkATPSubsUpldData();
		Long[] msisdns={};
		
		if(headerDetails2.getNetworkID()!=null)
		domainData.setPi_network_id(headerDetails2.getNetworkID());
		
		/*if(request.getMSISDN().size()>0 && request.getMSISDN()!=null)
		{
			msisdns=Utilities.convertStringArytoLongAry(request.getMSISDN());
			domainData.setPi_msisdn_no(msisdns);
		}*/
		if(request.getMSISDN().size()>0 && request.getMSISDN()!=null){
		    String[] msisdnArray = request.getMSISDN().toArray(new String[request.getMSISDN().size()]);
		    msisdns = Utilities.convertStringArytoLongAry(msisdnArray);
		    domainData.setPi_msisdn_no(msisdns);
		}
		if(request.getPublicityID().size()>0 && request.getPublicityID()!=null)
		{
			//domainData.setPi_publicity_id(request.getPublicityID());
			 String[] publicityIdArray = request.getPublicityID().toArray(new String[request.getPublicityID().size()]);
			 domainData.setPi_publicity_id(publicityIdArray);
		}
		if(request.getChannelID()!=null )
		{
			domainData.setPi_channel(request.getChannelID());
		}
		
		
		return domainData;
	}	

	private BulkATPSubscriptionUploadResponse setWebserviceResponse(
			BulkATPSubsUpldData domainData) {
		BulkATPSubscriptionUploadResponse response=new BulkATPSubscriptionUploadResponse();
		
		response.setMessage(SMFAgentConstants.SUCCESS);
		return response;
	}



}
