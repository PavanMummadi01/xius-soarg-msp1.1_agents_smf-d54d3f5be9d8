package com.xius.smf.job;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.smf.domaindata.MDNRegActCursorDtlsData;
import com.xius.smf.domaindata.MDNRegActUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;
import com.xius.smf.webservices.smfservices.ActivateSubscriberImpl;
import com.xius.smf.webservices.smfservices.MDNRegActUpdateImpl;
import com.xius.xbus.messages.common.StatusCode;
import com.xius.xbus.messages.provisioning.device.FirstLUActivationResponse;

public class MDNActProcessor implements Runnable {

	private static final Logger logger = LogManager.getLogger(MDNActProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	MDNRegActCursorDtlsData data = null;

	public MDNActProcessor(CountDownLatch latch, MDNRegActCursorDtlsData data) {
		this.latch = latch;
		this.data = data;

	}
	public void run() {
		logger.debug(">>>>> MDNActProcessor run called ...");

		MDNRegActUpdateImpl mdnRegActUpdateImpl = new MDNRegActUpdateImpl();
		MDNRegActUpdateData mdnRegActUpdateData = null;

		try {

			ActivateSubscriberImpl activateSubscriberImpl = new ActivateSubscriberImpl();

			HeaderDetails headerDetails = new HeaderDetails();
			mdnRegActUpdateData = new MDNRegActUpdateData();

			FirstLUActivationResponse fluResponse = null;
			if (data != null) {

				headerDetails.setLoginID(data.getUser_id());
				headerDetails.setNetworkID(data.getNetwork_id());
				headerDetails.setPassword("1433411");
				headerDetails.setRequestID("1");
				if (data.getMsdn_rec_trans_id() != null) {
					mdnRegActUpdateData.setPi_trans_no(data
							.getMsdn_rec_trans_id());
				} else {
					logger
							.debug(">>>>> MDNRegActCursorDtlsData - getMsdn_rec_trans_id is Null ...");
				}
				mdnRegActUpdateData.setPi_network_id(data.getNetwork_id());
				
				 logger.debug(">>>>> MDNRegActCursorDtlsData - MSISDN "+data.getMsisdn_no());
				 logger.debug(">>>>> MDNRegActCursorDtlsData - MSISDN Transaction Id  "+data.getMsdn_rec_trans_id());
				
				 if(data.getSim()!=null){
					 logger.debug(">>>>> MDNRegActCursorDtlsData - SIM "+data.getSim());
				 }else{
					 logger.debug(">>>>> MDNRegActCursorDtlsData - SIM ===>SIM value is NULL");
				 }
				 if(data.getSna()!=null){
					 logger.debug(">>>>> MDNRegActCursorDtlsData - SNA "+data.getSna());
				 }else{
					 logger.debug(">>>>> MDNRegActCursorDtlsData - SNA ===>SNA value is NULL");
				 }
				 if(data.getNir()!=null){
					 logger.debug(">>>>> MDNRegActCursorDtlsData - NIR "+data.getNir());
				 }else{
					 logger.debug(">>>>> MDNRegActCursorDtlsData - NIR ===>NIR value is NULL");
				 }
				 if(data.getTarifplan_id()!=null){
					 logger.debug(">>>>> MDNRegActCursorDtlsData - Tarifplan_id "+data.getTarifplan_id());
				 }else{
					 logger.debug(">>>>> MDNRegActCursorDtlsData - Tarifplan_id ===>Tarifplan_id value is NULL");
				 }
				
				
				 
				fluResponse = activateSubscriberImpl.activateSubscriber(
						data.getMsisdn_no(), String.valueOf(data
						.getMsdn_rec_trans_id()),data.getSim(),data.getSna()!=null?data.getSna()==0?null:data.getSna():null,
								data.getNir()!=null?data.getNir()==0?null:data.getNir():null,data.getTarifplan_id(), headerDetails);

			} else {
				logger.debug(">>>>> MDNRegActCursorDtlsData is Null ...");
			}

			if (fluResponse != null
					&& !fluResponse.getStatusCode().equals(StatusCode.ERROR)) {
				mdnRegActUpdateData
						.setPi_msdn_status(SMFAgentConstants.SUCCESS);
				mdnRegActUpdateData.setPi_remarks(SMFAgentConstants.SUCCESS);
			} else if (fluResponse != null
					&& !fluResponse.getStatusCode().equals(StatusCode.SUCCESS)) {
				mdnRegActUpdateData
						.setPi_msdn_status(SMFAgentConstants.FAILURE);
				mdnRegActUpdateData.setPi_remarks(fluResponse.getErrors()[0]
						.getErrorCode()
						+ "#" + fluResponse.getErrors()[0].getErrorMessage());
			} else {
				mdnRegActUpdateData
						.setPi_msdn_status(SMFAgentConstants.FAILURE);
				mdnRegActUpdateData
						.setPi_remarks(SMFAgentConstants.INTERNAL_ERROR_MSG);
			}

		} catch (SMFAgentException _exp) {

			mdnRegActUpdateData = new MDNRegActUpdateData();
			logger.error(Utilities.getStackTrace(_exp));
			logger.error("MDNActProcessor ---> SMFAgentException");
			mdnRegActUpdateData.setPi_msdn_status(SMFAgentConstants.FAILURE);
			mdnRegActUpdateData.setPi_trans_no(data
					.getMsdn_rec_trans_id());
			String erroMsg = SMFAgentConstants.INTERNAL_ERROR_MSG;
			if (_exp.getErrorMessage() != null) {
				erroMsg = _exp.getErrorMessage();
			}
			mdnRegActUpdateData.setPi_remarks(_exp.getErrorCode() + "#"
					+ erroMsg);

		} catch (Exception _exp) {
			logger.error("MDNActProcessor ---> Exception");
			logger.error(Utilities.getStackTrace(_exp));
			mdnRegActUpdateData = new MDNRegActUpdateData();
			logger.error("MDNActProcessor ---> SMFAgentException");
			mdnRegActUpdateData.setPi_msdn_status(SMFAgentConstants.FAILURE);
			mdnRegActUpdateData.setPi_trans_no(data
					.getMsdn_rec_trans_id());
			mdnRegActUpdateData
					.setPi_remarks(SMFAgentConstants.INTERNAL_ERROR_CODE + "#"
							+ SMFAgentConstants.INTERNAL_ERROR_MSG);

		} finally {

			try {
				if (mdnRegActUpdateData != null
						&& mdnRegActUpdateData.getPi_trans_no() != null)
					mdnRegActUpdateImpl.mdnRegActUpdate(mdnRegActUpdateData);
				else {
					logger
							.error("MDNActProcessor -- mdnRegActUpdate -mdnRegActUpdateData is Null");
				}
			} catch (Exception e) {
				logger
						.error("MDNActProcessor -- mdnRegActUpdate ---> Exception");
				logger.error(Utilities.getStackTrace(e));
			}

			latch.countDown();
		}

	}

}
