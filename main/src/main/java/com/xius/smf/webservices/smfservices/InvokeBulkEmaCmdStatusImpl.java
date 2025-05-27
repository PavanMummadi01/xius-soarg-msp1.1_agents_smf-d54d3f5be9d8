package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;
import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.EmaCmdRequestDtlsType;
import com.xius.agent.smf.smfmanagement.InvokeBulkEmaCmdStatusRequest;
import com.xius.agent.smf.smfmanagement.InvokeBulkEmaCmdStatusResponse;
import com.xius.smf.domaindata.InvokeBulkEmaCmdStatusCursorData;
import com.xius.smf.domaindata.InvokeBulkEmaCmdStatusData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;


import net.bcgi.util.db.SPFactory;

@Service("InvokeBulkEmaCmdStatusImpl")
public class InvokeBulkEmaCmdStatusImpl {
	
	private  static final Logger logger = LogManager.getLogger(InvokeBulkEmaCmdStatusImpl.class.getSimpleName());
	public InvokeBulkEmaCmdStatusResponse invokeBulkEmaCmdStatus(
			InvokeBulkEmaCmdStatusRequest request,HeaderDetails headerDetails) throws RemoteException,SMFAgentException {
		
		InvokeBulkEmaCmdStatusResponse response=new InvokeBulkEmaCmdStatusResponse();
		InvokeBulkEmaCmdStatusData domainData =null;
		
		domainData = setRequestData(request, headerDetails);
		
		SPFactory spfactory=ServiceUtils.executeSPWithOutCommit("pro_get_ema_cmd_request_dtls", domainData, domainData);

		if (logger.isInfoEnabled()) {

			logger.info(
					"Error Code ==>" + domainData.getPo_error_code());
			logger.info(
					"Error Msg ==>" + domainData.getPo_error_msg());
		}
		
		Utilities.commitOrRollback(spfactory, domainData.getPo_error_code());
		
		if(domainData.getPo_error_code()!=0)
		{
			
			throw new SMFAgentException(domainData.getPo_error_code().toString(), domainData.getPo_error_msg());
		}
		else
		{
			response=setWebserviceResponse(domainData);
		}
		
		return response;
	}
	private InvokeBulkEmaCmdStatusResponse setWebserviceResponse(
			InvokeBulkEmaCmdStatusData domainData) {
		
		InvokeBulkEmaCmdStatusResponse response=new InvokeBulkEmaCmdStatusResponse();
		
		if(domainData!=null){
			EmaCmdRequestDtlsType[] emaCmdRequestDtlsType=null;
			EmaCmdRequestDtlsType dtls=null;
			InvokeBulkEmaCmdStatusCursorData cur=null;
			
			if(domainData.getPo_ema_cmd_request_dtls()!=null&&domainData.getPo_ema_cmd_request_dtls().size()>0){
				
				emaCmdRequestDtlsType=new EmaCmdRequestDtlsType[domainData.getPo_ema_cmd_request_dtls().size()];
				
				for(int i=0;i<domainData.getPo_ema_cmd_request_dtls().size();i++){
					
					cur=domainData.getPo_ema_cmd_request_dtls().get(i);
					
					dtls=new EmaCmdRequestDtlsType();
					
					if(cur.getLoginId()!=null){
						dtls.setLoginId(cur.getLoginId());
					}
					if(cur.getInternal_TranId()!=null){
						//dtls.setInternal_TranId(cur.getInternal_TranId());
						dtls.setInternalTranId(cur.getInternal_TranId());
					}
					if(cur.getMSISDN()!=null){
						dtls.setMSISDN(cur.getMSISDN().toString());
					}
					if(cur.getCMD_NAME()!=null){
						//dtls.setCMD_NAME(cur.getCMD_NAME());
						dtls.setCMDNAME(cur.getCMD_NAME());
					}
					if(cur.getCREATED_DATE()!=null){
						//dtls.setCREATED_DATE(cur.getCREATED_DATE());
						dtls.setCREATEDDATE(cur.getCREATED_DATE());
					}
					if(cur.getSTATUS()!=null){
						dtls.setSTATUS(cur.getSTATUS());
					}
					if(cur.getREMARKS()!=null){
						dtls.setREMARKS(cur.getREMARKS());
					}
					if(cur.getReason()!=null){
						dtls.setREASON(cur.getReason());
					}
					
					emaCmdRequestDtlsType[i]=dtls;
				}
			}
			if(emaCmdRequestDtlsType!=null) {
				//response.setEmaCmdRequestDtls(emaCmdRequestDtlsType);
				response.getEmaCmdRequestDtls().addAll(Arrays.asList(emaCmdRequestDtlsType));
			}
			
		}
		response.setMessage(domainData.getPo_error_msg());
		return response;
	}
	private InvokeBulkEmaCmdStatusData setRequestData(
			InvokeBulkEmaCmdStatusRequest request, HeaderDetails headerDetails) {
		
		InvokeBulkEmaCmdStatusData data=new InvokeBulkEmaCmdStatusData();
		
		if(headerDetails.getNetworkID()!=null){
			data.setPi_network_id(headerDetails.getNetworkID());
		}
		if(request.getTransactionID()!=null){
			data.setPi_transaction_id(request.getTransactionID());
		}
		
		return data;
	}
}
