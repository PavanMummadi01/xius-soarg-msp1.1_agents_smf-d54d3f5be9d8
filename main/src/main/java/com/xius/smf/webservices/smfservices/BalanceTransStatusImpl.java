/**
 * 
 */
package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.BalTransStatusType;
import com.xius.agent.smf.smfmanagement.GetBalanceTransStatusRequest;
import com.xius.agent.smf.smfmanagement.GetBalanceTransStatusResponse;
import com.xius.smf.domaindata.BalTransStatusCursorData;
import com.xius.smf.domaindata.BalTransStatusData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

/**
 * @author prince.kumar
 *
 */
@Service("BalanceTransStatusImpl")
public class BalanceTransStatusImpl {

	/**
	 * @param request
	 * @param headerDetails
	 * @return
	 */
	private  static final Logger logger = LogManager.getLogger(BalanceTransStatusImpl.class.getSimpleName());
	
	
	
	public GetBalanceTransStatusResponse getBalanceTransStatus(
			GetBalanceTransStatusRequest request, HeaderDetails headerDetails) throws RemoteException,SMFAgentException  {
		
		
		
		GetBalanceTransStatusResponse response=new GetBalanceTransStatusResponse();
		BalTransStatusData domainData =null;
		domainData = setRequestData(request, headerDetails);	

		SPFactory spfactory= null;
				ServiceUtils._executeStoredProcedure("pro_balance_adjust_rpt", domainData, domainData);


		
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
		
		
		private BalTransStatusData setRequestData(
				GetBalanceTransStatusRequest request, HeaderDetails headerDetails2) {
			BalTransStatusData domainData = new BalTransStatusData();
			
			
			if(headerDetails2.getNetworkID()!=null)
			domainData.setPi_network_id(headerDetails2.getNetworkID());
			
			if(request.getTransactionId()!=null)
			domainData.setIntTransId(request.getTransactionId());
			
			if(request.getExttransId()!=null)
			domainData.setExtTransId(request.getExttransId());
			
	
			return domainData;
		}	
		
		
		
		private GetBalanceTransStatusResponse setWebserviceResponse(
				BalTransStatusData domainData) throws SMFAgentException {
			GetBalanceTransStatusResponse response=new GetBalanceTransStatusResponse();
			
	if (domainData != null) {
				
		BalTransStatusType[] balTransStatusType=null;
		BalTransStatusType det=null;
		BalTransStatusCursorData cur=null;
		
				if(domainData.getPo_balance_trans_status()!=null && domainData.getPo_balance_trans_status().size()>0 && !domainData.getPo_balance_trans_status().isEmpty() )
				{
					
					balTransStatusType=new BalTransStatusType[domainData.getPo_balance_trans_status().size()];
					
					for(int iter=0;iter<domainData.getPo_balance_trans_status().size();iter++)
					{
						cur=domainData.getPo_balance_trans_status().get(iter);
						det=new BalTransStatusType();
						
						
					if(cur.getMsisdnNo()!=null)
						det.setMSISDN(cur.getMsisdnNo().toString());
					
						if(cur.getAmount()!=null)
							det.setAmount(cur.getAmount().toString());
						
						if(cur.getTransId()!=null)
						det.setTransactionId(cur.getTransId());
					
						if(cur.getExtTransId()!=null)
							det.setExttransId(cur.getExtTransId());
						
						if(cur.getTransDate()!=null)
							det.setTransactionDate(cur.getTransDate().toString());
						
						if(cur.getExtErrorCode()!=null)
							det.setExtErrorCode(cur.getExtErrorCode().toString());
						
						if(cur.getStatus()!=null)
							det.setStatus(cur.getStatus());
						
						
						if(cur.getRemarks()!=null)
							det.setRemarks(cur.getRemarks());
						
						if(cur.getResponseDate()!=null)
							det.setResponseDate(cur.getResponseDate().toString());
						
						
						if(cur.getActivityId()!=null)
							det.setActivityID(cur.getActivityId().toString());
						
						if(cur.getRequestType()!=null)
							det.setRequestType(cur.getRequestType());
						
						balTransStatusType[iter]=det;
						
						 
					}
					response.setBalTransStatusDtls(det);
					response.setMessage((SMFAgentConstants.SUCCESS));
				
				}
				else{
					response.setMessage(SMFAgentConstants.NO_DATA_FOUND);
					
				}
				}
			
			
			return response;
		}
	}


