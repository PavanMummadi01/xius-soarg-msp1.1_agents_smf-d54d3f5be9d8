package com.xius.smf.webservices.smfservices;

import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.MsisdnvstariffIdViewRequest;
import com.xius.agent.smf.smfmanagement.MsisdnvstariffIdViewResponse;
import com.xius.smf.domaindata.MsisdnvstariffIdViewData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;

import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("MsisdnvstariffIdViewImpl")
public class MsisdnvstariffIdViewImpl {
	private  static final Logger logger = LogManager.getLogger(MsisdnvstariffIdViewImpl.class.getSimpleName());

	public MsisdnvstariffIdViewResponse msisdnvstariffIdView(
			MsisdnvstariffIdViewRequest request, HeaderDetails headerDetails) throws SMFAgentException {
		MsisdnvstariffIdViewResponse response =new MsisdnvstariffIdViewResponse();
		MsisdnvstariffIdViewData domainData = null;
domainData = setRequestData(request, headerDetails);
		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_msisdnvstariffid_view",domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from pro_msisdnvstariffid_view  ==>" + domainData.getPo_error_code());
			logger.info( "Error Msg from pro_msisdnvstariffid_view  ==>" + domainData.getPo_error_desc());
		}
		if(domainData.getPo_error_code()==0)
		{
			response=setWebserviceResponse(domainData);
		}
		
		else
		{
			throw new SMFAgentException(domainData.getPo_error_code()+toString(), domainData.getPo_error_desc());
		}

		return response;
	}

	private MsisdnvstariffIdViewData setRequestData(
			MsisdnvstariffIdViewRequest request, HeaderDetails headerDetails) {
		MsisdnvstariffIdViewData data =  new MsisdnvstariffIdViewData();
		
		if(headerDetails.getNetworkID()!= null){
		data.setPi_network_id(headerDetails.getNetworkID());
		}
		if(request.getMSISDN() != null){
		data.setPi_msisdn(Long.parseLong(request.getMSISDN()));
		}
		if(request.getSIMNumber()!= null){
			data.setPi_sim(Long.parseLong(request.getSIMNumber()));
		}
		if(request.getIMSI()!= null){
			data.setPi_imsi(request.getIMSI());
		}
		
		return data;
	}

	private MsisdnvstariffIdViewResponse setWebserviceResponse(
			MsisdnvstariffIdViewData domainData) {
		MsisdnvstariffIdViewResponse response = new MsisdnvstariffIdViewResponse();
		if(domainData.getPo_old_tariff_pack_id()!=null){
		response.setOldTariffPackID(domainData.getPo_old_tariff_pack_id());
		}
		if(domainData.getPo_new_tariff_pack_id()!=null){
			response.setNewTariffPackID(domainData.getPo_new_tariff_pack_id());
			}
		
		return response;
	}

}

