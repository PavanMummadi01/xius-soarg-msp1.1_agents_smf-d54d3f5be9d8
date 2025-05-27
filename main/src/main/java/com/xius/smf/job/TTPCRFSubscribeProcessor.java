package com.xius.smf.job;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.smf.domaindata.TTPCRFCursorData;
import com.xius.smf.domaindata.TTPCRFUpdateDATA;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;
import com.xius.smf.webservices.smfservices.TTPCRFProcessImpl;
import com.xius.tia.TTprovisioning_xsd.ProdListType;
import com.xius.tia.TTprovisioning_xsd.ProvisionPCRFRequest;
import com.xius.tia.TTprovisioning_xsd.ProvisionPCRFResponse;
import com.xius.tia.TTprovisioning_xsd.ResponseDataType;

public class TTPCRFSubscribeProcessor implements Runnable {
	
	private static final Logger logger = LogManager.getLogger(TTPCRFSubscribeProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	TTPCRFCursorData cursorData = null;
	TTPCRFUpdateDATA updatedData =new TTPCRFUpdateDATA();
	TTPCRFUpdateProcessor updateProcessor = new TTPCRFUpdateProcessor();

	public TTPCRFSubscribeProcessor(CountDownLatch latch,
			TTPCRFCursorData curData) {
		this.latch = latch;
		this.cursorData = curData;
	}

	public TTPCRFSubscribeProcessor(TTPCRFCursorData curData) {
		this.cursorData = curData;
	}
	public void run() {
		logger.debug(">>>>> TTPCRFSubscribeProcessor run called ...");
		try {
			callProvisionPCRF();
		} finally {
			if (latch != null)
				latch.countDown();
		}
	}

	public void callProvisionPCRF() {

		logger.debug(">>>>> TTPCRFSubscribeProcessor callProvisionPCRF called ...");
		try {
			HeaderDetails headerDetails = new HeaderDetails();

			headerDetails.setLoginID("SMFJob");
			if(cursorData!=null)
			headerDetails.setNetworkID(cursorData.getNetworkid());
			headerDetails.setPassword("11111111");

			TTPCRFProcessImpl pcrfImpl = new TTPCRFProcessImpl();

			ProvisionPCRFRequest request = new ProvisionPCRFRequest();
			ProvisionPCRFResponse response = null;

			if (cursorData != null) {
				if (cursorData.getImsi() != null) {
					request.setIMSI(String.valueOf(cursorData.getImsi()));
				}
				if (cursorData.getMsisdn() != null) {
					request.setMSISDN(String.valueOf(cursorData.getMsisdn()));
				}
				if (cursorData.getThreeg_indicator() != null) {
					request.setThreegind(cursorData.getThreeg_indicator());
				}
				if (cursorData.getProduct_list() != null) {
					ProdListType[] types = new ProdListType[1];
					ProdListType listType = null;
					listType = new ProdListType();
					listType.setProductID(cursorData.getProduct_list());
					listType.setStatrtDate(cursorData.getStart_date());
					listType.setEndDate(cursorData.getEnd_date());
					types[0] = listType;
					request.setProdList(types);
				}
				// added for update
				if (cursorData.getNetworkid() != null) {
					updatedData.setPi_network_id(cursorData.getNetworkid());
				}
				logger.debug(">>>>> TTPCRFSubscribeProcessor - cursorData.getNetworkid()  "+cursorData.getNetworkid());
				if (cursorData.getTransation_id() != null) {
					updatedData.setPi_transation_id(cursorData
							.getTransation_id());
				}
			} else {
				logger.debug(">>>>> TTPCRFSubscribeProcessor - TTPCRFCursorData  is Null ...");
			}

			response = pcrfImpl.provision(request, headerDetails);

			if (response != null) {

				if (response.getStatus() != null) {
					if (response.getStatus() != null
							&& (String
									.valueOf(response.getStatus())
									.equalsIgnoreCase(SMFAgentConstants.SUCCESS)   || String.valueOf(response.getStatus()).equalsIgnoreCase("successfully provisioned"))) {

						updatedData.setPi_status(SMFAgentConstants.PCRF_SUCCESS_FLAG);
						updatedData.setPi_config_error("0");
					} else {
						updatedData.setPi_status(SMFAgentConstants.PCRF_FALIURE_FLAG);
						if (response.getResponseData() != null) {
							ResponseDataType rsd = response.getResponseData();
							updatedData.setPi_config_error(rsd.getReturnCode());
						}

					}
				} else {
					updatedData.setPi_status(SMFAgentConstants.PCRF_FALIURE_FLAG);
					if (response.getResponseData() != null) {
						ResponseDataType rsd = response.getResponseData();
						updatedData.setPi_config_error(rsd.getReturnCode());
					}

				}
			} else {
				updatedData.setPi_status(SMFAgentConstants.PCRF_FALIURE_FLAG);
				// domainData.setPi_remarks("TIA response is NULL");
			}

		} catch (SMFAgentException _exp) {

			logger.error("TTPCRFSubscribeProcessor - ProvisionPCRFResponse ---> SMFAgentException");
			updatedData.setPi_status(SMFAgentConstants.PCRF_FALIURE_FLAG);
			logger.error(Utilities.getStackTrace(_exp));

		} catch (Exception _exp) {
			logger.error("TTPCRFSubscribeProcessor - ProvisionPCRFResponse ---> Exception");
			updatedData.setPi_status(SMFAgentConstants.PCRF_FALIURE_FLAG);

			logger.error(Utilities.getStackTrace(_exp));
		} finally {

			try {
				if (updatedData != null){
					updateProcessor.statusUpdate(updatedData);
				}
				else {
					logger.error("TTPCRFSubscribeProcessor -- updateProcessor -domainData is Null");
				}
			} catch (Exception e) {
				logger.error("TTPCRFSubscribeProcessor -- updateProcessor ---> Exception");
				logger.error(Utilities.getStackTrace(e));
			}

		}

	}

}