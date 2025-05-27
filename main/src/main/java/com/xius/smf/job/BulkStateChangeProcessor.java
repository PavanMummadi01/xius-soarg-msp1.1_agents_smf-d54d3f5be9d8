package com.xius.smf.job;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.smf.client.ws.XBusDeviceAppClient;
import com.xius.smf.domaindata.BulkStateChangeJobData;
import com.xius.smf.domaindata.BulkStateChangeUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;
import com.xius.xbus.messages.provisioning.device.SubscriberStateChangeResponse;

public class BulkStateChangeProcessor implements Runnable {
	
	private	 static final Logger logger = LogManager.getLogger(BulkStateChangeProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	BulkStateChangeUpdateData updatedata = new BulkStateChangeUpdateData();
	BulkStateChangeJobData data = null;

	public BulkStateChangeProcessor(CountDownLatch latch,
			BulkStateChangeJobData data) {
		this.latch = latch;
		this.data = data;

	}

	// 1.XBUS invoke Subscriberstatechange
	// 1. update DB

	public void run() {

		if (logger.isInfoEnabled())
			logger.info("BulkStateChengeProcessor - run method called");

		BulkStateChangeFinalStatUpdate finalupdate = new BulkStateChangeFinalStatUpdate();


				try {
					// call xBus SubscriberStateChange call
					XBusDeviceAppClient deviceServiceClient = new XBusDeviceAppClient();

					SubscriberStateChangeResponse resp = deviceServiceClient
							.doxBusSubscriberStateChange(data);

					if (resp != null
							&& (resp.getErrors() != null && resp.getErrors().length > 0)) {
						logger.debug(resp.getErrors()[0].getErrorCode());
						logger.debug(resp.getErrors()[0].getErrorMessage());

						logger.debug(":::got failed from  xbus:::");
						updatedata.setPi_network_id(data.getPi_network_id());
						if(resp.getTransactionId()!=null)
						updatedata.setPi_trans_id(resp.getTransactionRefNum());
						updatedata.setPi_status(SMFAgentConstants.FAILURE);
						if(resp.getOldStatus()!=null)
						updatedata.setPi_old_status(resp.getOldStatus());
						updatedata.setPi_remarks(resp.getErrors()[0]
								.getErrorCode()
								+ "#"
								+ resp.getErrors()[0].getErrorMessage());
						updatedata.setPi_transaction_ref_num(data
								.getTransactionId());
						if (resp.getTransactionId() != null)
							logger.info("xbus tanscation id:-->>"
									+ resp.getTransactionRefNum());
					} else if (resp != null) {
						logger.debug(":::got sucess from  xbus:::");
						updatedata.setPi_network_id(data.getPi_network_id());
						updatedata.setPi_status(SMFAgentConstants.SUCCESS);
						updatedata.setPi_transaction_ref_num(data
								.getTransactionId());
						if(resp.getTransactionId()!=null)
						updatedata.setPi_trans_id(resp.getTransactionRefNum());
						if(resp.getOldStatus()!=null)
						updatedata.setPi_old_status(resp.getOldStatus());
						updatedata.setPi_remarks(SMFAgentConstants.SUCCESS);
						if (resp.getTransactionId() != null)
							logger.info("xbus tanscation id:-->>"
									+ resp.getTransactionRefNum());
					} else if (resp == null) {
						logger.debug(":::got NULL from  xbus:::");
						updatedata.setPi_network_id(data.getPi_network_id());
						updatedata.setPi_status(SMFAgentConstants.FAILURE);
						updatedata.setPi_transaction_ref_num(data
								.getTransactionId());
						updatedata.setPi_remarks("response is NULL from xBus");
					}

					latch.countDown();

				} catch (SMFAgentException _exp) {
					logger.debug(":::got failed from  xbus:::");
					updatedata.setPi_network_id(data.getPi_network_id());
				
					updatedata.setPi_transaction_ref_num(data
							.getTransactionId());
					updatedata.setPi_status(SMFAgentConstants.FAILURE);
					updatedata.setPi_remarks(_exp.getErrorCode() + "#"
							+ _exp.getErrorMessage());

				} catch (Exception _exp) {
					logger.error(Utilities.getStackTrace(_exp));	
			
		} finally {
			try {
				finalupdate.statuUpdate(updatedata);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
