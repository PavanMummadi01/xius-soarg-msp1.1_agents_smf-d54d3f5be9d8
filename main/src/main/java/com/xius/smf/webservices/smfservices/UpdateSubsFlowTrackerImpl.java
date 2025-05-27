package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;


import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.UpdateSubsFlowTrackerRequest;
import com.xius.agent.smf.smfmanagement.UpdateSubsFlowTrackerResponse;
import com.xius.smf.domaindata.UpdateSubsFlowTrackerData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.ne.NPRsmsConfirmationHelper;
import com.xius.smf.ne.TempMessageInfo;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("UpdateSubsFlowTrackerImpl")
public class UpdateSubsFlowTrackerImpl {

	private  static final Logger logger = LogManager.getLogger(UpdateSubsFlowTrackerImpl.class.getSimpleName());


	public UpdateSubsFlowTrackerResponse UpdateSubsFlowTracker(
			UpdateSubsFlowTrackerRequest request, HeaderDetails headerDetails)
			throws RemoteException, SMFAgentException, com.xius.smf.exceptions.SMFAgentException {

		UpdateSubsFlowTrackerResponse response = new UpdateSubsFlowTrackerResponse();

		UpdateSubsFlowTrackerData domainData = null;
		logger.info("setRequestData........................");

		//String tmpArr[] = request.getProcessing_flag().split("~");
		String tmpArr[] = request.getProcessingFlag().split("~");

		if (tmpArr != null && tmpArr.length > 2) {
			//request.setProcessing_flag(tmpArr[0]);
			request.setProcessingFlag(tmpArr[0]);
		}

		domainData = setRequestData(request, headerDetails);
		SPFactory factory = ServiceUtils.executeSPWithOutCommit(
				"pro_subs_bulk_flow_tracker_update", domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info(
					"Error Code from  pro_subs_bulk_flow_tracker_update  ==>"
							+ domainData.getPo_error_code());
			logger.info(
					"Error Msg from  pro_subs_bulk_flow_tracker_update  ==>"
							+ domainData.getPo_error_desc());
		}
		if (domainData.getPo_error_code() == 0) {
			response = setWebserviceResponse(domainData);
		}

		else {
			throw new SMFAgentException(domainData.getPo_error_code().toString(),
					domainData.getPo_error_desc());
		}

		// NE REQUEST
		//if (request.getProcessing_flag() != null) {
		  if (request.getProcessingFlag() != null) {
			if (tmpArr.length > 2) {
				if (tmpArr[0].equalsIgnoreCase("S")) {
					String notifyflag = null;
					if (tmpArr[1].equalsIgnoreCase("P")) {
						notifyflag = InitiateAll.getSMFProps().getProperty(
								"FIVEGPROV_NOTIFY_ID");

						logger.info("UpdateSubsFlowTracker Success getting  FIVEGPROV_NOTIFY_ID property for notification>"
								+ notifyflag);
					} else {
						notifyflag = InitiateAll.getSMFProps().getProperty(
								"FIVEGDEPROV_NOTIFY_ID");

						logger.info("UpdateSubsFlowTracker Success getting  FIVEGDEPROV_NOTIFY_ID property for notification>"
								+ notifyflag);
					}
					if (notifyflag != null) {
						if (notifyflag.length() > 0) {
							logger.info("  UpdateSubsFlowTracker setting NE request for event code"
									+ notifyflag);

							NPRsmsConfirmationHelper nPRsmsConfirmationHelper = new NPRsmsConfirmationHelper();
							TempMessageInfo smsData = new TempMessageInfo();
							String destMSISDNs = tmpArr[2];
							smsData.setNetworkId(headerDetails.getNetworkID()
									+ "");
							smsData.setUserDefined5(".");
							smsData.setDestMSISDNs(destMSISDNs);
							smsData.setEventReferenceCode(notifyflag);
							nPRsmsConfirmationHelper
									.sendMsgToSubscriber(smsData);
						}
					}
				}
			} else {
				if (tmpArr[0].equalsIgnoreCase("S")) {
					String eventrefcode = null;

					String fiveGprop = InitiateAll.getSMFProps().getProperty("FIVEGPROV_NOTIFY_ID");

					eventrefcode = splitPropVal(fiveGprop, domainData);
					logger.info("UpdateSubsFlowTracker Success getting  FIVEGPROV_NOTIFY_ID property for notification>"
							+ eventrefcode);

					if (eventrefcode == null) {
						String fiveGDEprop = InitiateAll.getSMFProps().getProperty("FIVEGDEPROV_NOTIFY_ID");

						eventrefcode = splitPropVal(fiveGDEprop, domainData);

						logger.info("UpdateSubsFlowTracker Success getting  FIVEGDEPROV_NOTIFY_ID property for notification>"
								+ eventrefcode);
					}
					if (eventrefcode != null) {

						if (eventrefcode.length() > 0) {
							logger.info("  UpdateSubsFlowTracker setting NE request for event code"
									+ eventrefcode);

							NPRsmsConfirmationHelper nPRsmsConfirmationHelper = new NPRsmsConfirmationHelper();
							TempMessageInfo smsData = new TempMessageInfo();
							smsData.setNetworkId(headerDetails.getNetworkID()
									+ "");
							smsData.setUserDefined5(".");
							smsData.setDestMSISDNs(domainData.getPo_msisdn()
									+ "");
							smsData.setEventReferenceCode(eventrefcode);
							nPRsmsConfirmationHelper
									.sendMsgToSubscriber(smsData);
						}
					}
				}

			}
		}

		return response;

	}

	String splitPropVal(String propValue, UpdateSubsFlowTrackerData domainData) {
		String eventCoderes = null;
		if (propValue != null) {
			String[] splitArr = propValue.split(",");

			for (int i = 0; i < splitArr.length; i++) {
				String[] splitAgain = splitArr[i].split("#");
				System.out.println("hi");
				if (splitAgain.length > 1 && domainData.getPo_flowid() == (Long.parseLong(splitAgain[0]))) {
					eventCoderes = splitAgain[1];
					break;
				}
			}
		}
		return eventCoderes;
	}

	public UpdateSubsFlowTrackerData setRequestData(
			UpdateSubsFlowTrackerRequest request, HeaderDetails headerDetails) {

		UpdateSubsFlowTrackerData data = new UpdateSubsFlowTrackerData();
		if (headerDetails.getNetworkID() != null)
			data.setPi_network_id(headerDetails.getNetworkID());

		/*if (request.getTransaction_id() != null)
			data.setPi_transaction_id(request.getTransaction_id());*/
		if (request.getTransactionId() != null)
			data.setPi_transaction_id(request.getTransactionId());

		/*if (request.getProcessing_flag() != null)
			data.setPi_processing_flag(request.getProcessing_flag());*/
		if (request.getProcessingFlag() != null)
			data.setPi_processing_flag(request.getProcessingFlag());
		
		if (request.getRemarks() != null)
			data.setPi_remarks(request.getRemarks());

		if (request.getRemarks() != null)
			data.setPi_remarks(request.getRemarks());

		/*if (request.getInternal_trans_id() != null)
			data.setPi_internal_trans_id(request.getInternal_trans_id());*/
		if (request.getInternalTransId() != null)
			data.setPi_internal_trans_id(request.getInternalTransId());

		return data;
	}

	private UpdateSubsFlowTrackerResponse setWebserviceResponse(
			UpdateSubsFlowTrackerData domainData) {

		UpdateSubsFlowTrackerResponse response = new UpdateSubsFlowTrackerResponse();
		if (domainData.getPo_error_code() != null)
			response.setRespCode(domainData.getPo_error_code() + "");
		if (domainData.getPo_error_desc() != null)
			response.setRespDescription(domainData.getPo_error_desc() + "");

		return response;

	}

}
