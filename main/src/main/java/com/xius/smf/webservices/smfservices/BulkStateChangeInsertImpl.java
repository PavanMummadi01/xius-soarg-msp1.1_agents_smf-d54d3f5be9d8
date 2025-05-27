package com.xius.smf.webservices.smfservices;

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.common.error.errordetails.ErrorDetailsType;
import com.xius.agent.smf.smfmanagement.BulkStateChangeInsertRequest;
import com.xius.agent.smf.smfmanagement.BulkStateChangeInsertResponse;
import com.xius.smf.domaindata.BulkStateChangeData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("BulkStateChangeInsertImpl")
public class BulkStateChangeInsertImpl {

	private  static final Logger logger = LogManager.getLogger(BulkStateChangeInsertImpl.class.getSimpleName());

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
	private BulkStateChangeData setRequest(
			BulkStateChangeInsertRequest request, HeaderDetails headerDetails) {
		logger.info("setRequest called========>");
		BulkStateChangeData data = new BulkStateChangeData();

		if (null != headerDetails.getNetworkID()) {
			data.setPi_network_id(headerDetails.getNetworkID());
		}
		if (null != headerDetails.getLoginID()) {
			data.setPi_username(headerDetails.getLoginID().trim());
		}

		if (null != request.getReason()) {
			//data.setPi_reason(request.getReason());
			List<String> reasonList = request.getReason();
			String[] reasonArray = reasonList.toArray(new String[reasonList.size()]);
			data.setPi_reason(reasonArray);
		}

		if (null != request.getFileName()) {
			data.setPi_file_name(request.getFileName());
		}
		if (null != request.getNetworkName()) {
			data.setPi_network_name(request.getNetworkName());
		}
	
		String[] str = null;
		if(null!=request.getMSISDN()){
			//str=request.getMSISDN();
			List<String> msisdnList = request.getMSISDN();
			str = msisdnList.toArray(new String[msisdnList.size()]);	
		}

		Long[] lNum=new Long[str.length];
		for (int i=0 ;i<str.length; i++){
			lNum[i]=Long.parseLong(str[i]);
			data.setPi_msisdn(lNum);
			logger.info("loop  excuting=======>");
		}logger.info("loop  excuting end=======>");
			
		if (null != request.getChannelID())
			data.setPi_channel_id(request.getChannelID());
		if (null != request.getStatus()){
			//data.setPi_newsubscrstatus(request.getStatus());
			List<String> statusList = request.getStatus();
			String[] statusArray = statusList.toArray(new String[statusList.size()]);
			data.setPi_newsubscrstatus(statusArray);

		}

		return data;
	}

	public BulkStateChangeInsertResponse BulkStateChangeInsert(
			BulkStateChangeInsertRequest request, HeaderDetails headerDetails)
			throws SMFAgentException {

		/**
		 * Populate domain object with the data from web service request
		 */
		BulkStateChangeInsertResponse response = new BulkStateChangeInsertResponse();
		BulkStateChangeData domainData = setRequest(request, headerDetails);
		logger.info("request setting end=======>");
		if (logger.isDebugEnabled()) {

			logger.debug( domainData.toString());
		}
		logger.info("proc called=======>");
		spFactory = ServiceUtils.executeSPWithOutCommit("pro_state_change_bulk_insert", domainData, domainData);
				
		logger.info("proc called= end======>");
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

	

	private BulkStateChangeInsertResponse setWebserviceResponse(
			BulkStateChangeData domainData, BulkStateChangeInsertRequest request) {

		BulkStateChangeInsertResponse response = new BulkStateChangeInsertResponse();

		if (domainData.getPo_file_trans_id() != null) {
			response.setTransactionNumber(domainData.getPo_file_trans_id());
			logger.info("(domainData.getPo_file_trans_id()=======>");

			if (logger.isDebugEnabled()) {
				logger.debug("TransNumber ==> "
						+ response.getTransactionNumber());
			}
		}

		return response;
	}
}
