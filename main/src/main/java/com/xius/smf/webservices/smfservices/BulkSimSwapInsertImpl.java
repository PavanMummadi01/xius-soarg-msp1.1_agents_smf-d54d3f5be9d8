package com.xius.smf.webservices.smfservices;

import net.bcgi.util.db.SPFactory;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.BulkSimSwapInsertRequest;
import com.xius.agent.smf.smfmanagement.BulkSimSwapInsertResponse;
import com.xius.smf.domaindata.BulkSimSwapInsertData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("BulkSimSwapInsertImpl")
public class BulkSimSwapInsertImpl {

	private  static final Logger logger = LogManager.getLogger(BulkSimSwapInsertImpl.class.getSimpleName());

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
	private BulkSimSwapInsertData setMOSRequest(BulkSimSwapInsertRequest request,
			HeaderDetails headerDetails) {

		BulkSimSwapInsertData data = new BulkSimSwapInsertData();
		
		if (null != headerDetails.getNetworkID()){
	         data.setPi_network_id(headerDetails.getNetworkID());
			}
			if (null != headerDetails.getLoginID()){
	         data.setPi_username(headerDetails.getLoginID().trim() );
			}

		/*if (null != request.getOldMSISDN()) {
			data.setPi_old_msisdn(request.getOldMSISDN());
		}*/
		if (null != request.getOldMSISDN()) {
		    List<String> OldMSISDNList = request.getOldMSISDN();
		    String[] OldMSISDNArray = OldMSISDNList.toArray(new String[OldMSISDNList.size()]);
		    data.setPi_old_msisdn(OldMSISDNArray);
		}
		/*if (null != request.getNewSIM()) {
			data.setPi_new_sim(request.getNewSIM());
		}*/
		if (null != request.getNewSIM()) {
		    List<String> newMSISDNList = request.getNewSIM();
		    String[] newMSISDNArray = newMSISDNList.toArray(new String[newMSISDNList.size()]);
		    data.setPi_new_sim(newMSISDNArray);
		}
		/*if (null != request.getReason()) {
			data.setPi_reason(request.getReason());
		}*/
		if (null != request.getReason()) {
		    List<String> ReasonList = request.getReason();
		    String[] ReasonListArray = ReasonList.toArray(new String[ReasonList.size()]);
		    data.setPi_reason(ReasonListArray);
		}
		
		if (null != request.getFileName()){
			data.setPi_file_name(request.getFileName());
		}
		if (null != request.getNetworkName()){
			data.setPi_network_name(request.getNetworkName());
		}
		
		return data;
	}

	public BulkSimSwapInsertResponse BulkSimSwapInsert(BulkSimSwapInsertRequest request,
			HeaderDetails headerDetails) throws SMFAgentException {

		/**
		 * Populate domain object with the data from web service request
		 */
		BulkSimSwapInsertResponse response = new BulkSimSwapInsertResponse();
		BulkSimSwapInsertData domainData = setMOSRequest(request, headerDetails);
		if (logger.isDebugEnabled()) {

			logger.debug( domainData.toString());
		}
		
		spFactory = ServiceUtils.executeSPWithOutCommit("pro_sim_swap_bulk_insert",
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

	private BulkSimSwapInsertResponse setWebserviceResponse(BulkSimSwapInsertData domainData,
			BulkSimSwapInsertRequest request) {

		BulkSimSwapInsertResponse response = new BulkSimSwapInsertResponse();

		if ( domainData.getPo_trans_id()!=null) {
			response.setTransactionNumber(domainData.getPo_trans_id());
			
			if (logger.isDebugEnabled()) {
				logger.debug("TransNumber ==> "+response.getTransactionNumber());
			}
		}
		

		return response;
	}
}
