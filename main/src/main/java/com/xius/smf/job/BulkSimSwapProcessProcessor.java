package com.xius.smf.job;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.billing.AccountManagement_xsd.MDNBasedGetNwIdRequest;
import com.xius.billing.AccountManagement_xsd.MDNBasedGetNwIdResponse;
import com.xius.smf.client.invoker.MDNbasedGetNwIdInvoker;
import com.xius.smf.client.ws.XBusDeviceAppClient;
import com.xius.smf.domaindata.BulkSimSwapJobData;
import com.xius.smf.domaindata.BulkSimSwapStatusUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;
import com.xius.xbus.messages.provisioning.device.InitiateChngSimSwapResponse;

public class BulkSimSwapProcessProcessor implements Runnable {
	private	 static final Logger logger = LogManager.getLogger(BulkSimSwapProcessProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	BulkSimSwapStatusUpdateData updatedata = new BulkSimSwapStatusUpdateData();
	BulkSimSwapJobData data = null;
	String oldSim = null;

	public BulkSimSwapProcessProcessor(CountDownLatch latch,
			BulkSimSwapJobData data) {
		this.latch = latch;
		this.data = data;

	}

	// 1. invoke IBA MDNMDNbasedGetNwId
	// 2.XBUS invoke intiate changesimswap
	// 2. update DB
	public void run() {

		if (logger.isInfoEnabled())
			logger.info("BulkSimSwapProcessProcessor - run method called");

		MDNbasedGetNwIdInvoker getNwIdInvoker = new MDNbasedGetNwIdInvoker();

		HeaderDetails details = new HeaderDetails();
		details.setLoginID(data.getPi_login_id());
		details.setNetworkID(data.getPi_network_id());
		details.setRequestID("123"); // dummy
		details.setPassword("12345678"); // dummy

		MDNBasedGetNwIdRequest ibaRequest = new MDNBasedGetNwIdRequest();
		BulkSimSwapFinalStatUpdate finalupdate = new BulkSimSwapFinalStatUpdate();

		ibaRequest.setMSISDN(data.getPi_old_msisdn());
		
		try {

			MDNBasedGetNwIdResponse mdnresp = getNwIdInvoker.MDNbasedGetNwId(
					details, ibaRequest);
			if (mdnresp != null) {
				
				oldSim = mdnresp.getSIM();

				try {
					// call xBus InitiateChngSimSwap call
					XBusDeviceAppClient deviceServiceClient = new XBusDeviceAppClient();
					InitiateChngSimSwapResponse resp = deviceServiceClient.doxBusInitiateChngSimSwap(oldSim, data);

					if (resp != null && (resp.getErrors()!=null && resp.getErrors().length > 0)) {
						logger.debug(resp.getErrors()[0].getErrorCode());
						logger.debug(resp.getErrors()[0].getErrorMessage());

						logger.debug(":::got failed from  xbus:::");
						updatedata.setPi_network_id(data.getPi_network_id());
						updatedata.setTrans_id(data.getTrans_id());
						updatedata.setFinalStatus(SMFAgentConstants.FAILURE);
						if (oldSim != null) {
							updatedata.setPi_old_sim(oldSim);
						}
						updatedata.setRemarks(resp.getErrors()[0]
								.getErrorCode()
								+ "#" + resp.getErrors()[0].getErrorMessage());
						updatedata.setInternal_ref_id(resp.getTransactionId());
						if (resp.getTransactionId() != null)
							logger.info("xbus tanscation id:-->>"
									+ resp.getTransactionId());
					} else if (resp != null) {
						logger.debug(":::got sucess from  xbus:::");
						updatedata.setPi_network_id(data.getPi_network_id());
						updatedata.setFinalStatus(SMFAgentConstants.SUCCESS);
						updatedata.setInternal_ref_id(resp.getTransactionId());
						updatedata.setTrans_id(data.getTrans_id());
						if (oldSim != null) {
							updatedata.setPi_old_sim(oldSim);
						}
						updatedata.setRemarks(SMFAgentConstants.SUCCESS);
						if (resp.getTransactionId() != null)
							logger.info("xbus tanscation id:-->>"
									+ resp.getTransactionId());
					} else if (resp == null) {
						logger.debug(":::got NULL from  xbus:::");
						updatedata.setPi_network_id(data.getPi_network_id());
						updatedata.setFinalStatus(SMFAgentConstants.FAILURE);
						updatedata.setInternal_ref_id(resp.getTransactionId());
						if (oldSim != null) {
							updatedata.setPi_old_sim(oldSim);
						}
						updatedata.setTrans_id(data.getTrans_id());
						updatedata.setRemarks("response is NULL from xBus");
					}

					latch.countDown();

				} catch (SMFAgentException _exp) {
					logger.debug(":::got failed from  xbus:::");
					updatedata.setPi_network_id(data.getPi_network_id());
					updatedata.setTrans_id(data.getTrans_id());
					updatedata.setFinalStatus(SMFAgentConstants.FAILURE);
					if (oldSim != null) {
						updatedata.setPi_old_sim(oldSim);
					}
					updatedata.setRemarks(_exp.getErrorCode() + "#"
							+ _exp.getErrorMessage());
				} catch (Exception _exp) {
					logger.error(Utilities.getStackTrace(_exp));
				}
			} else if (mdnresp == null) {
				logger.debug(":::got SIM null from  IBA MDNBasedGetNwId:::");
				updatedata.setPi_network_id(data.getPi_network_id());
				updatedata.setTrans_id(data.getTrans_id());
				if (oldSim != null) {
					updatedata.setPi_old_sim(oldSim);
				}
				updatedata.setFinalStatus(SMFAgentConstants.FAILURE);
				updatedata.setRemarks(SMFAgentConstants.INTERNAL_ERROR_CODE_STR
						+ "#" + "MDNBasedGetNwId response in null");

			}
		} catch (SMFAgentException exp) {
			logger.debug(":::got failed from MDNBasedGetNwId:::");
			updatedata.setPi_network_id(data.getPi_network_id());
			updatedata.setTrans_id(data.getTrans_id());
			if (oldSim != null) {
				updatedata.setPi_old_sim(oldSim);
			}
			updatedata.setFinalStatus(SMFAgentConstants.FAILURE);
			updatedata.setRemarks(SMFAgentConstants.INTERNAL_ERROR_CODE_STR
					+ "#" + "SIM NOT FOUND");
		} finally {
			try {
				finalupdate.statuUpdate(updatedata);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
