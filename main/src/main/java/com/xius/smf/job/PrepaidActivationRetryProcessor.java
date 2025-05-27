package com.xius.smf.job;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.client.ws.XBusDeviceServiceAppClient;
import com.xius.smf.domaindata.PrepaidActivationData;
import com.xius.smf.domaindata.PrepaidActivationRetryCursorData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;


import net.bcgi.si.messages.mvnoapi.device.PrepaidActivationRetryResponse;
import net.bcgi.util.db.SPFactory;

public class PrepaidActivationRetryProcessor implements Runnable {

	private static final Logger logger = LogManager.getLogger(PrepaidActivationRetryProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	ArrayList<PrepaidActivationRetryCursorData> data = null;
	String transID = null;
	Long nwID = null;
	
	public PrepaidActivationRetryProcessor(CountDownLatch latch, String transID, Long nwID) {
		this.latch = latch;
		this.transID = transID;
		this.nwID = nwID;

	}

	@Override
	public void run() {
		if (logger.isInfoEnabled())
			logger.info("PrepaidActivationRetryProcessor - run method called");

		try {
			PrepaidActivationData data1 = null;

			XBusDeviceServiceAppClient deviceServiceAppClient = new XBusDeviceServiceAppClient();

			PrepaidActivationRetryResponse response = null;
			data1 = getDataForTrqansID(transID, nwID);

			if (data1 != null && data1.getPo_error_code() != null && data1.getPo_error_code() == 0
					&& data1.getPo_nw_pend_sim_reg_dtls() != null) {
				// xBus call
				data = data1.getPo_nw_pend_sim_reg_dtls();
				response = deviceServiceAppClient.doxBusPrepaidActivation(data);

				if (response != null && (response.getErrors() != null && response.getErrors().length > 0)) {
					logger.debug(response.getErrors()[0].getErrorCode());
					logger.debug(response.getErrors()[0].getErrorMessage());
				}
			}
						
		} catch (Exception _exp) {
			logger.error(Utilities.getStackTrace(_exp));
		}
		
		finally {
			try {
				latch.countDown();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		 

	}

	private PrepaidActivationData getDataForTrqansID(String transID, Long nwID) {
		PrepaidActivationData data = new PrepaidActivationData();

		data.setPi_network_id(nwID);

		if (transID != null) {
			data.setPi_trans_ref_number(transID);
			logger.info("PrepaidActivationRetryProcessor transID ---------------------" + transID);
		}
		
		SPFactory spfactory;
		try {
			spfactory = ServiceUtils.executeSPWithOutCommit("pro_get_trans_sim_reg_dtls", data, data);
			Utilities.commitOrRollback(spfactory, data.getPo_error_code());

		} catch (SMFAgentException e) {
			e.printStackTrace();
		}
		if (logger.isInfoEnabled()) {
			logger.info( "Error Code from  pro_get_trans_sim_reg_dtls  ==>" + data.getPo_error_code());
			logger.info( "Error Msg from  pro_get_trans_sim_reg_dtls  ==>" + data.getPo_error_desc());
		}
		return data;
	}

}
