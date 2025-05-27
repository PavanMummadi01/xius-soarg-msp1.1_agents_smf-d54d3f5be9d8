package com.xius.smf.webservices.smfservices;


import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.SIMSaleRequest;
import com.xius.agent.smf.smfmanagement.SIMSaleResponse;
import com.xius.smf.domaindata.SIMSaleData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("SIMSaleImpl")
public class SIMSaleImpl {

	private  static final Logger logger = LogManager.getLogger(SIMSaleImpl.class.getSimpleName());

	HeaderDetails headerDetails = null;
	SIMSaleData domainData =null;
	SPFactory spFactory=null;
	
	public SIMSaleResponse SIMSale(
			SIMSaleRequest request, HeaderDetails headerDetails) 
					throws SMFAgentException {
		
		this.headerDetails = headerDetails;
		
		domainData = setRequestData(request, headerDetails);
		spFactory = ServiceUtils.executeSPWithOutCommit("pro_sim_sale_req_insert", domainData, domainData);
		
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		/**
		 * invoke Stored Procedure.
		 */
		Long errCode  = domainData.getPo_error_code();
		String errMsg  = domainData.getPo_error_desc();
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from pro_sim_sale_req_insert  ==>" + errCode);
			logger.info( "Error Msg from pro_sim_sale_req_insert ==>" + errMsg);
		}
		Utilities.commitOrRollback(spFactory, errCode);

		if ( errCode != 0) {

			throw Utilities.setSMFAgentException( errCode.toString(), errMsg );
		}
		SIMSaleResponse response=setWebserviceResponse(domainData);;
		
		return response;
	}

	private SIMSaleData setRequestData(
			SIMSaleRequest request, HeaderDetails headerDetails2) {
		SIMSaleData domainData = new SIMSaleData();
		

		if(Utilities.isNull(request.getActivityType())==false)
		{
			if(request.getActivityType().equalsIgnoreCase("CHANGEMSISDN"))
			 domainData.setPi_activity_type(SMFAgentConstants.CHANGE_MSISDN);
			else if(request.getActivityType().equalsIgnoreCase("SIMSWAP"))
				domainData.setPi_activity_type(SMFAgentConstants.SIM_SWAP);
			else if(request.getActivityType().equalsIgnoreCase("ACTIVATE"))
				domainData.setPi_activity_type(SMFAgentConstants.ACTIVATE);
			else if(request.getActivityType().equalsIgnoreCase("DEACTIVATE"))
				domainData.setPi_activity_type(SMFAgentConstants.DEACTIVATE);
			else
				domainData.setPi_activity_type(request.getActivityType());
		}
		
		if(Utilities.isNull(request.getNewMSISDN())==false)
			domainData.setPi_new_msisdn(Long.parseLong(request.getNewMSISDN()));
		if(Utilities.isNull(request.getOldMSISDN())==false)
			domainData.setPi_old_msisdn(Long.parseLong(request.getOldMSISDN()));
		if(Utilities.isNull(request.getNewIMSI())==false)
				domainData.setPi_new_imsi(Long.parseLong(request.getNewIMSI()));
		if(Utilities.isNull(request.getOldIMSI())==false)
			domainData.setPi_old_imsi(Long.parseLong(request.getOldIMSI()));
		if(Utilities.isNull(request.getNewSIM())==false)
			domainData.setPi_new_sim(request.getNewSIM());
		if(Utilities.isNull(request.getOldSIM())==false)
			domainData.setPi_old_sim(request.getOldSIM());
		
		if(Utilities.isNull(request.getNewAccountId())==false)
			domainData.setPi_new_account_id(request.getNewAccountId());
		
		if(Utilities.isNull(request.getOldAccountId())==false)
			domainData.setPi_old_account_id(request.getOldAccountId());
		
		
		
		
		
		if(Utilities.isNull(String.valueOf(request.getCurentStateId()))==false)
			domainData.setPi_curr_state_id((request.getCurentStateId()));
		if(Utilities.isNull(request.getCustomField())==false)
			domainData.setPi_custom_field1(request.getCustomField());
		if(Utilities.isNull(String.valueOf(headerDetails2.getNetworkID()))==false)
			domainData.setPi_network_id(headerDetails2.getNetworkID());
		
		if(request.getTechnology()!=null)
			domainData.setPi_technology(request.getTechnology());
		
		if(request.getExternalTransId2()!=null)
			domainData.setPi_ext_trans_id2(request.getExternalTransId2());
		if(request.getChannel()!=null)
			domainData.setPi_channel(request.getChannel());
		if(request.getCustomField2()!=null)
			domainData.setPi_custom_field2(request.getCustomField2());
		if(request.getCustomField3()!=null)
			domainData.setPi_custom_field3(request.getCustomField3());
		if(request.getCustomField4()!=null)
			domainData.setPi_custom_field4(request.getCustomField4());
		if(request.getCustomField5()!=null)
			domainData.setPi_custom_field5(request.getCustomField5());
		if(request.getCustomField6()!=null)
			domainData.setPi_custom_field6(request.getCustomField6());
            
		if(!Utilities.isNull(request.getService()))
			domainData.setPi_service(new Long(request.getService()));
        
		//Utilities.splitStringToLongAry(request.getService(), ",")
		// these are comma saperated in case of multiple and siple in caase of single string
		if(!Utilities.isNull(request.getBaseIdsDerivdIds()))
			domainData.setPi_baseserviceid(request.getBaseIdsDerivdIds());
		
		
	/*	if(!Utilities.isNull(request.getDerivedserviceIDs()))
			domainData.setPi_derivedserviceid(request.getDerivedserviceIDs());
*/
		if(!Utilities.isNull(request.getATPIDs()))
			domainData.setPi_ATPids(request.getATPIDs());
		
		if(!Utilities.isNull(request.getActivationfees()))
			domainData.setPi_activationfee(request.getActivationfees());
		
		if(!Utilities.isNull(request.getPublicityIDs()))
			domainData.setPi_publicityid(request.getPublicityIDs());
		
		if(!Utilities.isNull(request.getChargeIDs()))
			domainData.setPi_chargeid(request.getChargeIDs());
		
		if(!Utilities.isNull(request.getATPUniqueID()))
			domainData.setPi_ATPUniqueid(request.getATPUniqueID());
		if(!Utilities.isNull(request.getAtpUnSubsFlag()))
			domainData.setPi_unsub_atp_yn(request.getAtpUnSubsFlag());
		
		if(!Utilities.isNull(request.getNIR()))
			domainData.setPi_NIR(Long.parseLong(request.getNIR()));
		
		return domainData;
	}

	private SIMSaleResponse setWebserviceResponse(
			SIMSaleData domainData) {
		SIMSaleResponse response=new SIMSaleResponse();
		if(domainData.getPo_trans_id()!=null){
			response.setTransactionId(domainData.getPo_trans_id());
		}
		response.setMessage(SMFAgentConstants.SUCCESS);
		return response;
	}

	
}
