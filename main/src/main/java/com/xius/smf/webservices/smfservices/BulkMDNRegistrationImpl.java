package com.xius.smf.webservices.smfservices;

import net.bcgi.util.db.SPFactory;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.BulkMDNRegistartionRequest;
import com.xius.agent.smf.smfmanagement.BulkMDNRegistartionResponse;
import com.xius.smf.domaindata.BulkMDNRegistrationData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("BulkMDNRegistrationImpl")
public class BulkMDNRegistrationImpl {

	private  static final Logger logger = LogManager.getLogger(BulkMDNRegistrationImpl.class.getSimpleName());

	SPFactory spFactory = null;

	/**
	 * This method is used map webservice request object to domain (db) object
	 * 
	 * @param request
	 *            BulkMDNRegistartionRequest
	 * @param headerDetails
	 *            HeaderDetails
	 * @return BulkMDNRegistartionData
	 * @throws ErrorDetailsType
	 */
	private BulkMDNRegistrationData setMOSRequest(BulkMDNRegistartionRequest request,
			HeaderDetails headerDetails) {

		BulkMDNRegistrationData data = new BulkMDNRegistrationData();

		if (null != request.getMSISDN()) {
			//data.setPi_msisdn(request.getMSISDN());
			List<String> msisdnList = request.getMSISDN();
			String[] msisdnArray = msisdnList.toArray(new String[msisdnList.size()]);
			data.setPi_msisdn(msisdnArray);
		}
		if (null != request.getAction()) {
			data.setPi_action_flag(request.getAction());
		
		}
         if (null != request.getFileName()) {
        	 data.setPi_file_name(request.getFileName());
		}
         if (null != request.getNetworkName()) {
        	 data.setPi_network_name(request.getNetworkName());
         }
         if (null != request.getNetworkName()) {
        	 data.setPi_network_name(request.getNetworkName());
         }
         if (null != request.getTpID()) {
        	//data.setPi_tp_id(request.getTpID());
        	 List<String> tpidList = request.getTpID();
 			 String[] tpidArray = tpidList.toArray(new String[tpidList.size()]);
 			 data.setPi_msisdn(tpidArray);
         }
         data.setPi_network_id(headerDetails.getNetworkID());
         data.setPi_username(headerDetails.getLoginID().trim() );
				
		return data;
	}

	public BulkMDNRegistartionResponse BulkMDNRegistartion(BulkMDNRegistartionRequest request,
			HeaderDetails headerDetails) throws SMFAgentException{

		/**
		 * Populate domain object with the data from web service request
		 */
		BulkMDNRegistartionResponse response = new BulkMDNRegistartionResponse();
		BulkMDNRegistrationData domainData = setMOSRequest(request, headerDetails);
		if (logger.isDebugEnabled()) {

			logger.debug( domainData.toString());
		}
		
		spFactory = ServiceUtils.executeSPWithOutCommit("pro_msisdn_bulk_insert",
				domainData, domainData);

		if (logger.isInfoEnabled()) {

			logger.info(
					"Error Code ==>" + domainData.getPo_error_code());
			logger.info(
					"Error Msg ==>" + domainData.getPo_error_desc());
		}

		Utilities.commitOrRollback(spFactory, domainData.getPo_error_code());

		if (null != domainData.getPo_error_code()
				&& domainData.getPo_error_code() != 0) {

			throw Utilities.setSMFAgentException(domainData.getPo_error_code().toString(),
					domainData.getPo_error_desc());

		} else {

			/**
			 * Set response
			 */
			response = setWebserviceResponse(domainData, request);

		}
		return response;
	}

	private BulkMDNRegistartionResponse setWebserviceResponse(BulkMDNRegistrationData domainData,
			BulkMDNRegistartionRequest request) {

		BulkMDNRegistartionResponse response = new BulkMDNRegistartionResponse();

		if ( domainData.getPo_trans_id()!=null) {
			response.setTransactionNumber(domainData.getPo_trans_id());
			
			if (logger.isDebugEnabled()) {
				logger.debug(": TransNumber ==> "+response.getTransactionNumber());
			}
		}
		

		return response;
	}
}
