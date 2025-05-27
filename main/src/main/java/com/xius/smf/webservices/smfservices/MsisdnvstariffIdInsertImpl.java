package com.xius.smf.webservices.smfservices;

import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.MsisdnvstariffIdInsertRequest;
import com.xius.agent.smf.smfmanagement.MsisdnvstariffIdInsertResponse;
import com.xius.smf.domaindata.MsisdnvstariffIdInsertData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("MsisdnvstariffIdInsertImpl")
public class MsisdnvstariffIdInsertImpl {
	private  static final Logger logger = LogManager.getLogger(MsisdnvstariffIdInsertImpl.class.getSimpleName());

	public MsisdnvstariffIdInsertResponse msisdnvstariffIdInsert(
			MsisdnvstariffIdInsertRequest request, HeaderDetails headerDetails) throws SMFAgentException {
		MsisdnvstariffIdInsertResponse response =new MsisdnvstariffIdInsertResponse();
		MsisdnvstariffIdInsertData domainData = null;
domainData = setRequestData(request, headerDetails);
		
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("pro_msisdnvstpid_insert",domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from pro_msisdnvstpid_insert  ==>" + domainData.getPo_error_code());
			logger.info( "Error Msg from pro_msisdnvstpid_insert  ==>" + domainData.getPo_error_desc());
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

	private MsisdnvstariffIdInsertData setRequestData(
			MsisdnvstariffIdInsertRequest request, HeaderDetails headerDetails) {
		MsisdnvstariffIdInsertData data =  new MsisdnvstariffIdInsertData();
		
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
		if(request.getNewTariffPackID()!= null){
			data.setPi_new_tariffpackid(request.getNewTariffPackID());
		}
		return data;
	}

	private MsisdnvstariffIdInsertResponse setWebserviceResponse(
			MsisdnvstariffIdInsertData domainData) {
		MsisdnvstariffIdInsertResponse response = new MsisdnvstariffIdInsertResponse();
		response.setMessage(SMFAgentConstants.SUCCESS);
		logger.info("Message==>" +response.getMessage());
		return response;
	}

}

