package com.xius.smf.job;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.client.ws.XBusDeviceAppClient;
import com.xius.smf.domaindata.BulkChangeMsisdnStatusUpdateData;
import com.xius.smf.domaindata.GetBulkChangeMsisdnDtlsCursorData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;
import com.xius.xbus.messages.provisioning.device.ChangeDeviceResponse;
import com.xius.xbus.messages.provisioning.device.ChangeDeviceRestResponse;


public class BulkChangeMsisdnProcessor implements Runnable {
	private	 static final Logger logger = LogManager.getLogger(BulkChangeMsisdnProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	BulkChangeMsisdnStatusUpdateData updatedata = new BulkChangeMsisdnStatusUpdateData();
	GetBulkChangeMsisdnDtlsCursorData data = null;

	public BulkChangeMsisdnProcessor(CountDownLatch latch, GetBulkChangeMsisdnDtlsCursorData data) {
		this.latch = latch;
		this.data = data;

	}

	@Override
	public void run() {

		if (logger.isInfoEnabled())
			logger.info("BulkChangeMsisdnProcessProcessor - run method called");

		BulkChangeMsisdnStatusUpdate finalupdate = new BulkChangeMsisdnStatusUpdate();
		String faildNode = "~";
		String simSaleTransId = "~";
		try {
			// call xBus call doxBusChangeMsisdn
			XBusDeviceAppClient deviceServiceClient = new XBusDeviceAppClient();
			ChangeDeviceResponse resp = null;
			ChangeDeviceRestResponse respRest = null;
			String propflag = InitiateAll.getSMFProps().getProperty("invokeXbusRestApis");
			String[] splArr = null;

			if (data.getProvcomp() != null)
				splArr = data.getProvcomp().split("~");
			int flg = 0;
			if (propflag != null && propflag.equalsIgnoreCase("Y") && splArr != null && splArr.length > 0
					&& splArr[0].equalsIgnoreCase("RESTAPI")) {

				data.setProvcomp(splArr[1]);
				respRest = deviceServiceClient.doxBusChangeDeviceRest(data);
				flg = 1;
				if (respRest != null && respRest.getFailedNode() != null) {
					faildNode = respRest.getFailedNode() + "~";
				}
				if (respRest != null && respRest.getSimSaleTransID() != null) {
					simSaleTransId = "~" + respRest.getSimSaleTransID();
				}

			} else {
				resp = deviceServiceClient.doxBusChangeMsisdn(data);
				if (resp != null && resp.getFailedNode() != null) {
					faildNode = resp.getFailedNode() + "~";
				}
				if (resp != null && resp.getVersion() != null) {
					simSaleTransId = "~" + resp.getVersion();// simsale transID
				}
			}
			if (flg == 0 && resp != null && (resp.getErrors() != null && resp.getErrors().length > 0)) {
				logger.debug(resp.getErrors()[0].getErrorCode());
				logger.debug(resp.getErrors()[0].getErrorMessage());

				logger.debug(":::got failed from  xbus:::");
				updatedata.setPi_network_id(data.getNetwork_id());
				updatedata.setPi_trans_id(data.getTransaction_id());
				updatedata.setPi_status(SMFAgentConstants.FAILURE);

				updatedata.setPi_remarks(faildNode + resp.getErrors()[0].getErrorCode() + "#"
						+ resp.getErrors()[0].getErrorMessage() + simSaleTransId);

			} else if (flg == 0 && resp != null) {
				logger.debug(":::got sucess from  xbus:::");
				updatedata.setPi_network_id(data.getNetwork_id());
				updatedata.setPi_status(SMFAgentConstants.SUCCESS);
				updatedata.setPi_trans_id(data.getTransaction_id());
				updatedata.setPi_remarks(SMFAgentConstants.SUCCESS);
			} else if (flg == 0 && resp == null) {
				logger.debug(":::got NULL from  xbus:::");
				updatedata.setPi_network_id(data.getNetwork_id());
				updatedata.setPi_status(SMFAgentConstants.FAILURE);
				updatedata.setPi_trans_id(data.getTransaction_id());
				updatedata.setPi_remarks(faildNode + "response is NULL from xBus" + simSaleTransId);
			}

			if (flg == 1 && respRest != null && (respRest.getErrors() != null && respRest.getErrors().length > 0)) {
				logger.debug(respRest.getErrors()[0].getErrorCode());
				logger.debug(respRest.getErrors()[0].getErrorMessage());

				logger.debug(":::got failed from  xbus:::");
				updatedata.setPi_network_id(data.getNetwork_id());
				updatedata.setPi_trans_id(data.getTransaction_id());
				updatedata.setPi_status(SMFAgentConstants.FAILURE);

				updatedata.setPi_remarks(faildNode + respRest.getErrors()[0].getErrorCode() + "#"
						+ respRest.getErrors()[0].getErrorMessage() + simSaleTransId);

			} else if (flg == 1 && respRest != null) {
				logger.debug(":::got sucess from  xbus:::");
				updatedata.setPi_network_id(data.getNetwork_id());
				updatedata.setPi_status(SMFAgentConstants.SUCCESS);
				updatedata.setPi_trans_id(data.getTransaction_id());
				updatedata.setPi_remarks(SMFAgentConstants.SUCCESS);
			} else if (flg == 1 && respRest == null) {
				logger.debug(":::got NULL from  xbus:::");
				updatedata.setPi_network_id(data.getNetwork_id());
				updatedata.setPi_status(SMFAgentConstants.FAILURE);
				updatedata.setPi_trans_id(data.getTransaction_id());
				updatedata.setPi_remarks(faildNode + "response is NULL from xBus" + simSaleTransId);
			}

		} catch (SMFAgentException _exp) {
			logger.debug(":::got failed from  xbus:::");
			updatedata.setPi_network_id(data.getNetwork_id());
			updatedata.setPi_trans_id(data.getTransaction_id());
			updatedata.setPi_status(SMFAgentConstants.FAILURE);
			updatedata.setPi_remarks(faildNode + _exp.getErrorCode() + "#" + _exp.getErrorMessage() + simSaleTransId);
		} catch (Exception _exp) {
			logger.error(Utilities.getStackTrace(_exp));
		} finally {
			try {
				finalupdate.statuUpdate(updatedata);
				latch.countDown();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
