package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;
import com.xius.agent.smf.smfmanagement.BulkATPDubDetails;
import com.xius.agent.smf.smfmanagement.GetBulkATPSubsDtlsRequest;
import com.xius.agent.smf.smfmanagement.GetBulkATPSubsDtlsResponse;
import com.xius.smf.domaindata.GetBulkATPSubsCursorData;
import com.xius.smf.domaindata.GetBulkATPSubsDtlsData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("GetBulkATPSubsDtlsImpl")
public class GetBulkATPSubsDtlsImpl {
	
	
	public GetBulkATPSubsDtlsResponse getBulkATPSubsDtls(
			GetBulkATPSubsDtlsRequest request,HeaderDetails headerDetails) throws RemoteException,
			SMFAgentException {
		GetBulkATPSubsDtlsResponse response=new GetBulkATPSubsDtlsResponse();
		GetBulkATPSubsDtlsData domainData =null;
	domainData = setRequestData(request, headerDetails);	

	SPFactory spfactory=ServiceUtils.executeSPWithOutCommit("pro_bulkatp_subs_trans_dtls", domainData, domainData);

	Utilities.commitOrRollback(spfactory, domainData.getPo_error_code());
	
	if(domainData.getPo_error_code()!=0)
	{
		
		throw Utilities.setSMFAgentException(domainData.getPo_error_code()+"", domainData.getPo_error_desc());
	}
	else
	{
		response=setWebserviceResponse(domainData);
	}
	
		
	return response;

	}
	
	
	private GetBulkATPSubsDtlsData setRequestData(
			GetBulkATPSubsDtlsRequest request, HeaderDetails headerDetails2) {
		GetBulkATPSubsDtlsData domainData = new GetBulkATPSubsDtlsData();
		
		
		if(headerDetails2.getNetworkID()!=null)
		domainData.setPi_network_id(headerDetails2.getNetworkID());
		
		if(request.getStartDate()!=null)
		domainData.setPi_startdate(request.getStartDate());
		
		if(request.getEndDate()!=null)
		domainData.setPi_enddate(request.getEndDate());
		
		if(request.getTransactionId()!=null)
		domainData.setPi_transaction_id(request.getTransactionId());
		
		
		return domainData;
	}	
	
	
	
	private GetBulkATPSubsDtlsResponse setWebserviceResponse(
			GetBulkATPSubsDtlsData domainData) {
		GetBulkATPSubsDtlsResponse response=new GetBulkATPSubsDtlsResponse();
		
		
		
if (domainData != null) {
			
	BulkATPDubDetails[] bulkATPDubDetails=null;
	BulkATPDubDetails det=null;
	GetBulkATPSubsCursorData cur=null;
			if(domainData.getPo_trans_dtls()!=null && domainData.getPo_trans_dtls().size()>0 )
			{
				
				bulkATPDubDetails=new BulkATPDubDetails[domainData.getPo_trans_dtls().size()];
				
				for(int iter=0;iter<domainData.getPo_trans_dtls().size();iter++)
				{
					cur=domainData.getPo_trans_dtls().get(iter);
					det=new BulkATPDubDetails();
					
					if(cur.getPi_transaction_id()!=null)
					det.setTransactionId(cur.getPi_transaction_id());
					
					if(cur.getMsisdn_no()!=null)
					det.setMsisdn(cur.getMsisdn_no().toString());
					
					if(cur.getPublicity_id()!=null)
					det.setPublicityId(cur.getPublicity_id());
					
					if(cur.getStatus()!=null)
					det.setStatus(cur.getStatus());
					
					if(cur.getBatchId()!=null)
					det.setBatchId(cur.getBatchId().toString());
					
					bulkATPDubDetails[iter]=det;
				}
			
			
			}
			response.getBulkATPDubDetails().addAll(Arrays.asList(bulkATPDubDetails)) ;
		}
		
		response.setMessage(SMFAgentConstants.SUCCESS);
		return response;
	}

}
