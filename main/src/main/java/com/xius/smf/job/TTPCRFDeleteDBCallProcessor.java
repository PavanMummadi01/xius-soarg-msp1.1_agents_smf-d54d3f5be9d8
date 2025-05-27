package com.xius.smf.job;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.smf.domaindata.TTPCRFCursorData;
import com.xius.smf.domaindata.TTPCRFDeleteDATA;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.Utilities;

public class TTPCRFDeleteDBCallProcessor implements Runnable {
	private static final Logger logger = LogManager.getLogger(TTPCRFDeleteDBCallProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	TTPCRFCursorData cursorData = null;
	TTPCRFDeleteDATA deleteData = new TTPCRFDeleteDATA();
	TTPCRFDeleteDBProcessor deleteProcessor = new TTPCRFDeleteDBProcessor();

	public TTPCRFDeleteDBCallProcessor(CountDownLatch latch,
			TTPCRFCursorData curData) {
		this.latch = latch;
		this.cursorData = curData;
	}

	public TTPCRFDeleteDBCallProcessor(TTPCRFCursorData curData) {
		this.cursorData = curData;
	}
	public void run() {

		logger.debug(">>>>> TTPCRFUnsubscribeProcessor run called ...");
		try {
			HeaderDetails headerDetails = new HeaderDetails();

			headerDetails.setLoginID("SMFJob");
			headerDetails.setNetworkID(cursorData.getNetworkid());
			headerDetails.setPassword("11111111");


			if (cursorData != null) {

				// added for update
				if (cursorData.getNetworkid() != null) {
					deleteData.setPi_network_id(cursorData.getNetworkid());
				}
				if (cursorData.getTransation_id() != null) {
					deleteData.setPi_transation_id(cursorData
							.getTransation_id());
				}

			} else {
				logger.debug(">>>>> TTPCRFUnsubscribeProcessor - TTPCRFCursorData  is Null ...");
			}

			try {
				if (deleteData != null) {
					deleteProcessor.statusUpdate(deleteData);
				} else {
					logger.error("TTPCRFUnsubscribeProcessor -- deleteProcessor -domainData is Null");
				}
			} catch (Exception e) {
				logger.error("TTPCRFUnsubscribeProcessor -- deleteProcessor ---> Exception");
				logger.error(Utilities.getStackTrace(e));
			}

		} catch (Exception _exp) {
			logger.error("TTPCRFUnsubscribeProcessor - ProvisionPCRFResponse ---> Exception");

			logger.error(Utilities.getStackTrace(_exp));
		} finally {

			latch.countDown();
		}

	}
}