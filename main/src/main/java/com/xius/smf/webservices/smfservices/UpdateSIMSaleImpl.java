package com.xius.smf.webservices.smfservices;


import net.bcgi.util.db.SPFactory;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.Roamingdtlstype;
import com.xius.agent.smf.smfmanagement.SIMSaleUpdateRequest;
import com.xius.agent.smf.smfmanagement.SIMSaleUpdateResponse;
import com.xius.smf.domaindata.UpdateSIMSaleData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("UpdateSIMSaleImpl")
public class UpdateSIMSaleImpl {

	private  static final Logger logger = LogManager.getLogger(UpdateSIMSaleImpl.class.getSimpleName());

	HeaderDetails headerDetails = null;
	UpdateSIMSaleData domainData =null;
	SPFactory spFactory=null;
	
	public SIMSaleUpdateResponse UpdateSIMSale(
			SIMSaleUpdateRequest request, HeaderDetails headerDetails) 
					throws SMFAgentException {
		
		this.headerDetails = headerDetails;
		SIMSaleUpdateResponse response = new SIMSaleUpdateResponse();
		domainData = setRequestData(request, headerDetails);
		spFactory = ServiceUtils.executeSPWithOutCommit("pro_sim_sale_req_update", domainData, domainData);
		
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		/**
		 * invoke Stored Procedure.
		 */
		
		
		Long errCode  = domainData.getPo_error_code();
		String errMsg  = domainData.getPo_error_desc();
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from pro_sim_sale_req_update  ==>" + errCode);
			logger.info( "Error Msg from pro_sim_sale_req_update  ==>" + errMsg);
		}
		Utilities.commitOrRollback(spFactory, errCode);

		if ( errCode != 0) {
			
			throw Utilities.setSMFAgentException( errCode.toString(), errMsg );
		} 
		else{
				response=setWebserviceResponse(domainData);
		}
		return response;
	}

	private UpdateSIMSaleData setRequestData(
			SIMSaleUpdateRequest request, HeaderDetails headerDetails2) {
		UpdateSIMSaleData domainData = new UpdateSIMSaleData();
		
		if(Utilities.isNull(request.getTransactionId())==false)
			domainData.setPi_trans_id(request.getTransactionId());
		
		if(Utilities.isNull(request.getExternalTransId())==false)
			domainData.setPi_ext_trans_id(request.getExternalTransId());
				
		if(Utilities.isNull(request.getRemarks())==false){
			domainData.setPi_remarks(request.getRemarks());
		if(request.getRemarks().contains("-")&& Utilities.isNull(request.getExternalTransId())){
			String [] remarksSplitarray=request.getRemarks().split("-");
			if(null!=remarksSplitarray && remarksSplitarray.length>1 && !Utilities.isNull(remarksSplitarray[1])){
				domainData.setPi_ext_trans_id(remarksSplitarray[1]);
			}	
		}	
		}
		
		
		
		if(Utilities.isNull(request.getStatus())==false)
			domainData.setPi_status(request.getStatus());
			
		if(Utilities.isNull(String.valueOf(request.getCurentStateId()))==false)
			domainData.setPi_curr_state_id((request.getCurentStateId()));
	
		if(Utilities.isNull(String.valueOf(headerDetails2.getNetworkID()))==false)
			domainData.setPi_network_id(headerDetails2.getNetworkID());
		
		if(request.getNewMSISDN()!=null &&request.getNewMSISDN().length()>0 )
			domainData.setPi_new_msisdn(Long.parseLong(request.getNewMSISDN()));
		
		if(request.getOldMSISDN()!=null &&request.getOldMSISDN().length()>0 )
				domainData.setPio_old_msisdn(Long.parseLong(request.getOldMSISDN()));
		
		if(request.getOldIMSI()!=null &&request.getOldIMSI().length()>0 )
			domainData.setPio_old_imsi(request.getOldIMSI().trim());
		
		if(request.getNewIMSI()!=null &&request.getNewIMSI().length()>0 )
			domainData.setPio_new_imsi(request.getNewIMSI().trim());
		
		if(request.getNewSIM()!=null &&request.getNewSIM().length()>0 )
			domainData.setPio_new_sim(request.getNewSIM().trim());
		
		if(request.getOldSIM()!=null &&request.getOldSIM().length()>0 )
			domainData.setPio_old_sim(request.getOldSIM().trim());
		if(Utilities.isNull(request.getExternalstatus())==false)
			domainData.setPi_ext_trans_status(request.getExternalstatus());
		
		
		
		if(request.getExternalremarks()!=null )
			domainData.setPi_external_details(request.getExternalremarks());
		
		if(request.getResponsecode()!=null )
			domainData.setPi_response_code(request.getResponsecode());
		
		if(request.getResponsemsg()!=null )
			domainData.setPi_response_message(request.getResponsemsg());
		
		
		if(request.getExtErrorCode()!=null)
			domainData.setPi_ext_error_code(request.getExtErrorCode());
		
		if(Utilities.isNull(domainData.getPi_ext_trans_id()))
		{
			domainData.setPi_ext_trans_id(""+System.currentTimeMillis());
			
		}
		
		
		return domainData;
	}
	

	private SIMSaleUpdateResponse setWebserviceResponse(
			UpdateSIMSaleData domainData) {
		SIMSaleUpdateResponse response=new SIMSaleUpdateResponse();
			if(domainData.getPio_old_msisdn()!=null){
				response.setOldMSISDN(String.valueOf(domainData.getPio_old_msisdn()));
			}
			if(domainData.getPio_old_sim()!=null){
				response.setOldSIM(domainData.getPio_old_sim());
			}
			
			if(domainData.getPo_activity_type()!=null){
				response.setActivityType(domainData.getPo_activity_type());
			}
			
			if(domainData.getPi_network_id()!=null){
				response.setNetworkId(domainData.getPi_network_id());
			}
			
			
			if(domainData.getPo_new_msisdn()!=null)
			response.setNewMSISDN(domainData.getPo_new_msisdn().toString());
			
			if(domainData.getPio_new_sim()!=null)
			response.setNewSIM(domainData.getPio_new_sim());
			
			if(domainData.getPio_old_imsi()!=null)
			response.setOldIMSI(domainData.getPio_old_imsi());
			
			if(domainData.getPio_new_imsi()!=null)
			response.setNewIMSI(domainData.getPio_new_imsi());
			
			if(domainData.getPi_login_id()!=null)
			response.setUserId(domainData.getPi_login_id());
			
			/*if(domainData.getPi_service()!=null)
				response.setService(domainData.getPi_service());*/
			 
			if(domainData.getPo_unsub_atp_yn()!=null)
				response.setAtpUnSubsFlag(domainData.getPo_unsub_atp_yn());
				
			
			
			if(domainData.getCursor_data().size()>0)
			{  
				Roamingdtlstype roamingdtlstype=null;
				Roamingdtlstype[] roamingdtls=new Roamingdtlstype[domainData.getCursor_data().size()];
			
				for(int index=0;index<domainData.getCursor_data().size();index++)
					 {
				    roamingdtlstype=new Roamingdtlstype();
					roamingdtlstype.setService(domainData.getCursor_data().get(index).getServiceflag().toString());
					if(null!=domainData.getCursor_data().get(index).getAtp_id())
					roamingdtlstype.setATPIDs(domainData.getCursor_data().get(index).getAtp_id());
					if(null!=domainData.getCursor_data().get(index).getBasic_service_id())
					roamingdtlstype.setBaseIdsDerivdIds(domainData.getCursor_data().get(index).getBasic_service_id());
					/*if(null!=domainData.getCursor_data().get(index).getDerived_service_id())
					roamingdtlstype.setDerivedserviceIDs(domainData.getCursor_data().get(index).getDerived_service_id());*/ 
					if(null!=domainData.getCursor_data().get(index).getPublicity_id())	
					roamingdtlstype.setPublicityIDs(domainData.getCursor_data().get(index).getPublicity_id());
					if(null!=domainData.getCursor_data().get(index).getActivation_fee())
					roamingdtlstype.setActivationfees(domainData.getCursor_data().get(index).getActivation_fee());
					if(null!=domainData.getCursor_data().get(index).getCharge_id())
					roamingdtlstype.setChargeIDs(domainData.getCursor_data().get(index).getCharge_id());
					if(null!=domainData.getCursor_data().get(index).getPi_ATPUniqueid())
				   roamingdtlstype.setATPUniqueID(domainData.getCursor_data().get(index).getPi_ATPUniqueid());
						
					
					roamingdtls[index]=roamingdtlstype;
					
			 }
				response.getRoamingdtls().addAll(Arrays.asList(roamingdtls));	
				
			}
			
			
			
			response.setMessage(SMFAgentConstants.SUCCESS);
		
		return response;
	}
	
	
}
