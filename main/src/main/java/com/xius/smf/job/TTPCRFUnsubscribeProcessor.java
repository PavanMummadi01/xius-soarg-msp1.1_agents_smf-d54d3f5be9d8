package com.xius.smf.job;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.smf.domaindata.TTPCRFCursorData;
import com.xius.smf.domaindata.TTPCRFSelectDATA;
import com.xius.smf.domaindata.TTPCRFUpdateDATA;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;
import com.xius.smf.webservices.smfservices.TTPCRFProcessImpl;
import com.xius.tia.TTprovisioning_xsd.DeletePCRFRequest;
import com.xius.tia.TTprovisioning_xsd.DeletePCRFResponse;
import com.xius.tia.TTprovisioning_xsd.ResponseDataType;

public class TTPCRFUnsubscribeProcessor implements Runnable {
	
	private static final Logger logger = LogManager.getLogger(TTPCRFUnsubscribeProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	TTPCRFCursorData cursorData = null;
	TTPCRFSelectDATA Data = null;
	TTPCRFUpdateDATA updatedData = null;
	TTPCRFUpdateProcessor updateProcessor = new TTPCRFUpdateProcessor();

	public TTPCRFUnsubscribeProcessor(CountDownLatch latch,
			TTPCRFCursorData curData) {
		this.latch = latch;
		this.cursorData = curData;
	}

	public TTPCRFUnsubscribeProcessor(TTPCRFCursorData curData) {
		this.cursorData = curData;
	}
	public void run() {

		logger.debug(">>>>> TTPCRFUnsubscribeProcessor run called ...");
		try {
			HeaderDetails headerDetails = new HeaderDetails();

			headerDetails.setLoginID("SMFJob");
			headerDetails.setNetworkID(cursorData.getNetworkid());
			headerDetails.setPassword("11111111");

			TTPCRFProcessImpl pcrfImpl = new TTPCRFProcessImpl();
			updatedData = new TTPCRFUpdateDATA();

			DeletePCRFRequest request = new DeletePCRFRequest();
			DeletePCRFResponse response = null;

			if (cursorData != null) {
				
				//deletepcrf tia request set
				if (cursorData.getMsisdn() != null) {
					request.setMSISDN(String.valueOf(cursorData.getMsisdn()));
				}
				if (cursorData.getProduct_list() != null) {
					request.setProductID(cursorData.getProduct_list());
				}
				if (cursorData.getThreeg_indicator() != null) {
					request.setThreegind(cursorData.getThreeg_indicator());
				}
				
				// added for update
				if (cursorData.getNetworkid() != null) {
					updatedData.setPi_network_id(cursorData.getNetworkid());
				}
				if (cursorData.getTransation_id() != null) {
					updatedData.setPi_transation_id(cursorData
							.getTransation_id());
				}
				 
				 
			} else {
				logger.debug(">>>>> TTPCRFUnsubscribeProcessor - TTPCRFCursorData  is Null ...");
			}

			response = pcrfImpl.delete(request, headerDetails);

			if (response != null) {

				if (response.getStatus() != null) {
					if (response.getStatus() != null
							&& (String
									.valueOf(response.getStatus())
									.equalsIgnoreCase(SMFAgentConstants.SUCCESS)   || String.valueOf(response.getStatus()).equalsIgnoreCase("successfully deprovisioned"))) {

						updatedData
								.setPi_status(SMFAgentConstants.PCRF_SUCCESS_FLAG);//Setting as S
						
						 if(response.getResponseData()!=null){
							 ResponseDataType rsd= response.getResponseData();
							 updatedData.setPi_config_error(rsd.getReturnCode()); 
						 }	
						
						logger.debug(">>>>> TTPCRFUnsubscribeProcessor - DeletePCRFResponse  is SUCCESS");

					} else {
						 if(response.getResponseData()!=null){
							 ResponseDataType rsd= response.getResponseData();
							 updatedData.setPi_config_error(rsd.getReturnCode()); 
						 }	
						updatedData
								.setPi_status(SMFAgentConstants.PCRF_FALIURE_FLAG);//Setting as F
					}
				} else {
					updatedData
							.setPi_status(SMFAgentConstants.PCRF_FALIURE_FLAG);//Setting as F
					// domainData.setPi_remarks("TIA RegisterCCResponse-getResult is NULL");
				}
			} else {
				updatedData.setPi_status(SMFAgentConstants.PCRF_FALIURE_FLAG);//Setting as F
				// domainData.setPi_remarks("TIA RegisterCCResponse is NULL");
			}

		} catch (SMFAgentException _exp) {

			logger.error("TTPCRFUnsubscribeProcessor - ProvisionPCRFResponse ---> SMFAgentException");
			updatedData = new TTPCRFUpdateDATA();
			updatedData.setPi_status(SMFAgentConstants.PCRF_FALIURE_FLAG);
			logger.error(Utilities.getStackTrace(_exp));

		} catch (Exception _exp) {
			logger.error("TTPCRFUnsubscribeProcessor - ProvisionPCRFResponse ---> Exception");
			updatedData = new TTPCRFUpdateDATA();
			updatedData.setPi_status(SMFAgentConstants.PCRF_FALIURE_FLAG);

			logger.error(Utilities.getStackTrace(_exp));
		} finally {

			try {
				if (updatedData != null) {
					updateProcessor.statusUpdate(updatedData);
				} else {
					logger.error("TTPCRFUnsubscribeProcessor -- updateProcessor -domainData is Null");
				}
			} catch (Exception e) {
				logger.error("TTPCRFUnsubscribeProcessor -- updateProcessor ---> Exception");
				logger.error(Utilities.getStackTrace(e));
			}

			latch.countDown();
		}

	}
}