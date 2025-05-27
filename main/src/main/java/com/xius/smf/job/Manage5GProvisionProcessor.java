package com.xius.smf.job;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.smf.client.invoker.Manage5GInvoker;
import com.xius.smf.domaindata.VOLTECursorData;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;
import com.xius.xbus.messages.billing.tariff.Manage5GRequest;
import com.xius.xbus.messages.billing.tariff.Manage5GResponse;

public class Manage5GProvisionProcessor implements Runnable {
	
	private static final Logger logger = LogManager.getLogger(Manage5GProvisionProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	VOLTECursorData cursorData = null;
	VOLTEUpdateProcessor updateProcessor = new VOLTEUpdateProcessor();
	VOLTEInsertProcessor insertProcessor = new VOLTEInsertProcessor();
	String nwId = InitiateAll.getSMFProps().getProperty(
			SMFAgentConstants.VOLTE_EXTERNAL_NW_ID);

	public Manage5GProvisionProcessor(CountDownLatch latch,
			VOLTECursorData curData) {
		this.latch = latch;
		this.cursorData = curData;
	}

	public Manage5GProvisionProcessor(VOLTECursorData curData) {
		this.cursorData = curData;
	}

	@Override
	public void run() {
		logger.debug(">>>>> Manage5GProvisionProcessor run called ...");
		try {
			callProvision5G();
		} finally {
			if (latch != null)
				latch.countDown();
		}
	}

	public void callProvision5G() {

		logger.debug(">>>>> Manage5GProvisionProcessor callProvisionVOLTE called ...");
		try {

			HeaderDetails headerDetails = new HeaderDetails();

			headerDetails.setLoginID("SMFJob");
			if (cursorData != null)
				headerDetails.setNetworkID(cursorData.getNetwork_id());
			headerDetails.setPassword("11111111");

			Manage5GRequest request = new Manage5GRequest();
			Manage5GResponse response = null;

			if (cursorData != null) {

				request.setChannel("SMFJOB");
				request.setMSISDN(cursorData.getMsisdn_no() + "");
				request.setTransactionId(cursorData.getPROCESS_SEQ_NUMBER()
						+ "");
				Manage5GInvoker manage5GInvoker = new Manage5GInvoker();
				response = manage5GInvoker.manage5Gprovision(request,
						headerDetails);

				if (response != null && response.getErrors() != null) {
					logger.error("FAIL");
					System.out.println(response.getErrors(0).getErrorCode());
					System.out.println(response.getErrors(0).getErrorMessage());
					if (response.getErrors().length > 0) {
						logger.error("errorMessage Manage5GResponse for "
								+ cursorData.getMsisdn_no() + ">>"
								+ response.getErrors()[0].getErrorMessage());
						logger.error("errorCode Manage5GResponse for "
								+ cursorData.getMsisdn_no() + ">>"
								+ response.getErrors()[0].getErrorCode());
					}
				} else {
					logger.debug("Message Manage5GResponse for "
							+ cursorData.getMsisdn_no() + ">>SUCCESS");
				}

			} else {
				logger.debug(">>>>> Manage5GProvisionProcessor - CursorData  is Null ...");
			}
		} catch (Exception _exp) {
			logger.error("Manage5GProvisionProcessor - Manage5GResponse ---> Exception");
			logger.error(Utilities.getStackTrace(_exp));
		}

	}

}
