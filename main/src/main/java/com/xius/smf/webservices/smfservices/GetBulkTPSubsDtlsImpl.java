package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.BulkTPSubDetails;
import com.xius.agent.smf.smfmanagement.GetBulkTPSubsDtlsRequest;
import com.xius.agent.smf.smfmanagement.GetBulkTPSubsDtlsResponse;
import com.xius.smf.domaindata.GetBulkTPSubsCursorData;
import com.xius.smf.domaindata.GetBulkTPSubsDtlsData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("GetBulkTPSubsDtlsImpl")
public class GetBulkTPSubsDtlsImpl {
	private  static final Logger logger = LogManager.getLogger(GetBulkTPSubsDtlsImpl.class.getSimpleName());
	public GetBulkTPSubsDtlsResponse getBulkTPSubsDtls(
			GetBulkTPSubsDtlsRequest request,HeaderDetails headerDetails) throws RemoteException,SMFAgentException {
		GetBulkTPSubsDtlsResponse response=new GetBulkTPSubsDtlsResponse();
		GetBulkTPSubsDtlsData domainData =null;
	domainData = setRequestData(request, headerDetails);	

	SPFactory spfactory=ServiceUtils.executeSPWithOutCommit("pro_bulk_tp_change_trans_dtls", domainData, domainData);

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
	
	
	private GetBulkTPSubsDtlsData setRequestData(
			GetBulkTPSubsDtlsRequest request, HeaderDetails headerDetails2) {
		GetBulkTPSubsDtlsData domainData = new GetBulkTPSubsDtlsData();
		
		
		if(headerDetails2.getNetworkID()!=null)
		domainData.setPi_network_id(headerDetails2.getNetworkID());
		
		if(request.getStartDate()!=null)
		domainData.setPi_startdate(request.getStartDate());
		
		if(request.getEndDate()!=null)
		domainData.setPi_enddate(request.getEndDate());
		
		if(request.getBatchId()!=null)
		domainData.setPi_batch_id(request.getBatchId());
		
		
		return domainData;
	}	
	
	
	
	private GetBulkTPSubsDtlsResponse setWebserviceResponse(
			GetBulkTPSubsDtlsData domainData) {
		GetBulkTPSubsDtlsResponse response=new GetBulkTPSubsDtlsResponse();
		
if (domainData != null) {
			
	BulkTPSubDetails[] bulkTPSubDetails=null;
	BulkTPSubDetails det=null;
	GetBulkTPSubsCursorData cur=null;
	List<BulkTPSubDetails> sl = new ArrayList<BulkTPSubDetails>();
			if(domainData.getPo_tp_trans_dtls()!=null && domainData.getPo_tp_trans_dtls().size()>0 )
			{
				
				bulkTPSubDetails=new BulkTPSubDetails[domainData.getPo_tp_trans_dtls().size()];
				
				for(int iter=0;iter<domainData.getPo_tp_trans_dtls().size();iter++)
				{
					cur=domainData.getPo_tp_trans_dtls().get(iter);
					det=new BulkTPSubDetails();
					
					if(cur.getTransaction_id()!=null)
					det.setTransactionId(cur.getTransaction_id());
					
					if(cur.getMsisdn_no()!=null)
					det.setMsisdn(cur.getMsisdn_no().toString());
					
					if(cur.getNew_tarrif_pack_id()!=null)
					det.setNewTariffPlanID(cur.getNew_tarrif_pack_id());
				
					if(cur.getOld_tarrif_pack_id()!=null)
						det.setOldTariffPlanID(cur.getOld_tarrif_pack_id());
						
					
					if(cur.getStatus()!=null)
					det.setStatus(cur.getStatus());
					
					if(cur.getBatch_id()!=null)
					det.setBatchId(cur.getBatch_id().toString());
					
					if(cur.getCharge()!=null)
						det.setCharge(cur.getCharge().toString());
						
					
					bulkTPSubDetails[iter]=det;
				}
			
			
			}
			
			
			if(domainData.getPo_tp_batch_ids()!=null && domainData.getPo_tp_batch_ids().size()>0 )
			{
				
				bulkTPSubDetails=new BulkTPSubDetails[domainData.getPo_tp_batch_ids().size()];
				
				for(int iter=0;iter<domainData.getPo_tp_batch_ids().size();iter++)
				{
					cur=domainData.getPo_tp_batch_ids().get(iter);
					det=new BulkTPSubDetails();
				
					
					if(cur.getBatch_id()!=null)
					det.setBatchId(cur.getBatch_id().toString());
					
					if(cur.getTransaction_date() != null)
						det.setTransactionDate(cur.getTransaction_date());
					sl.add(det);
					
				}
			
			}
		for(int i=0 ; i<sl.size(); i++)
		{
			bulkTPSubDetails[i]=sl.get(i);
		}
			
			response.getBulkTPSubDetails().addAll(Arrays.asList(bulkTPSubDetails)) ;
			
		}
		
		response.setMessage(SMFAgentConstants.SUCCESS);
		return response;
	}

}


