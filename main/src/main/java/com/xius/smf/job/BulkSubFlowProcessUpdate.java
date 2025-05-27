package com.xius.smf.job;

import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.domaindata.UpdateSubsFlowTrackerData;
import com.xius.smf.ne.NPRsmsConfirmationHelper;
import com.xius.smf.ne.TempMessageInfo;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class BulkSubFlowProcessUpdate {
	private	 static final Logger logger = LogManager.getLogger(BulkSubFlowProcessUpdate.class.getSimpleName());

	public void statusUpdate(UpdateSubsFlowTrackerData domainData)
			throws Exception {

		SPFactory factory = ServiceUtils.executeSPWithOutCommit(
				"pro_subs_bulk_flow_tracker_update", domainData, domainData);

		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}

		Utilities.commitOrRollback(factory, domainData.getPo_error_code());

		if (logger.isInfoEnabled()) {
			logger.info(
					"Error Code from pro_subs_bulk_flow_tracker_update  ==>"
							+ domainData.getPo_error_code());
			logger.info(
					"Error Msg from pro_subs_bulk_flow_tracker_update  ==>"
							+ domainData.getPo_error_desc());
		}

		if (domainData.getPi_processing_flag().equalsIgnoreCase("S") && domainData.getPo_msisdn()!=null) {
			String eventrefcode = null;

			String fiveGprop = InitiateAll.getSMFProps().getProperty(
					"FIVEGPROV_NOTIFY_ID");

			eventrefcode = splitPropVal(fiveGprop, domainData);
			logger.info("BulkSubFlowProcessUpdate Success getting  FIVEGPROV_NOTIFY_ID property for notification>"
					+ eventrefcode);

			if (eventrefcode == null) {
				String fiveGDEprop = InitiateAll.getSMFProps().getProperty(
						"FIVEGDEPROV_NOTIFY_ID");

				eventrefcode = splitPropVal(fiveGDEprop, domainData);

				logger.info("BulkSubFlowProcessUpdate Success getting  FIVEGDEPROV_NOTIFY_ID property for notification>"
						+ eventrefcode);
			}
			if (eventrefcode != null) {

				if (eventrefcode.length() > 0) {
					logger.info("  BulkSubFlowProcessUpdate setting NE request for event code"
							+ eventrefcode);

					NPRsmsConfirmationHelper nPRsmsConfirmationHelper = new NPRsmsConfirmationHelper();
					TempMessageInfo smsData = new TempMessageInfo();
					smsData.setNetworkId(domainData.getPi_network_id() + "");
					smsData.setUserDefined5(".");
					smsData.setDestMSISDNs(domainData.getPo_msisdn() + "");
					smsData.setEventReferenceCode(eventrefcode);
					nPRsmsConfirmationHelper.sendMsgToSubscriber(smsData);
				}
			}
		}
		else{
			logger.error("BulkSubFlowProcessUpdate msisdn details not found/not required so not setting NE ");
		}

	}

	String splitPropVal(String propValue, UpdateSubsFlowTrackerData domainData) {
		String eventCoderes = null;
		if (propValue != null) {
			String[] splitArr = propValue.split(",");

			for (int i = 0; i < splitArr.length; i++) {
				String[] splitAgain = splitArr[i].split("#");
				if (splitAgain.length > 1
						&& domainData.getPo_flowid() == (Long
								.parseLong(splitAgain[0]))) {
					eventCoderes = splitAgain[1];
					break;
				}
			}
		}
		return eventCoderes;
	}

}
