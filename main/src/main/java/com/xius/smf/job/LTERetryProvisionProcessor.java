package com.xius.smf.job;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.smf.domaindata.LTERetryProcessCursorData;
import com.xius.smf.domaindata.VolteUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;
import com.xius.smf.webservices.smfservices.VolteProcessImpl;
import com.xius.tia.TTprovisioning_xsd.VolteProvisionRequest;
import com.xius.tia.TTprovisioning_xsd.VolteProvisionResponse;

public class LTERetryProvisionProcessor implements Runnable {
	private static final Logger logger = LogManager.getLogger(LTERetryProvisionProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	LTERetryProcessCursorData cursorData = null;
	VolteUpdateData Updateddata = new VolteUpdateData();
	VOLTEUpdateProcessor updateProcessor = new VOLTEUpdateProcessor();
	public LTERetryProvisionProcessor(CountDownLatch latch, LTERetryProcessCursorData curData) {
		this.latch = latch;
		this.cursorData = curData;
	}

	public LTERetryProvisionProcessor(LTERetryProcessCursorData curData) {
		this.cursorData = curData;
	}

	@Override
	public void run() {
		logger.debug(">>>>> VOLTEProvisionProcessor run called ...");
		try {
			callProvisionVOLTE();
		} finally {
			if (latch != null)
				latch.countDown();
		}
	}

	public void callProvisionVOLTE() {

		logger.debug(">>>>> VOLTEProvisionProcessor callProvisionVOLTE called ...");
		try {

			HeaderDetails headerDetails = new HeaderDetails();

			headerDetails.setLoginID("SMFJob");
			  headerDetails.setNetworkID(cursorData.getNETWORK_ID());
			headerDetails.setPassword("11111111");

			VolteProcessImpl volteImpl = new VolteProcessImpl();

			VolteProvisionRequest request = new VolteProvisionRequest();
			VolteProvisionResponse response = null;

			if (cursorData != null) {
				
				Updateddata.setPi_trans_id(Long.parseLong(cursorData.getINTERNAL_TRANSACTION_ID()));
				  Updateddata.setPi_network_id(cursorData.getNETWORK_ID());	
					// setting tia request as insert success

					request.setChannelId("SMFJOB");

					if (cursorData.getMsisdn_no() != null) {
						request.setMSISDN(cursorData.getMsisdn_no().toString());
					}
					if (cursorData.getAccount_type()!= null) {
						request.setServiceType(cursorData.getAccount_type().toString());
					}
					if (cursorData.getExt_transaction_id()!= null) {
						request.setTransID(cursorData.getExt_transaction_id()
								);
					}

					response = volteImpl.provision(request, headerDetails);
					if (response != null) {

						if (response.getStatus() != null) {
							if (response.getStatus() != null
									&& (String.valueOf(response.getStatus())
											.equalsIgnoreCase(
													SMFAgentConstants.SUCCESS) || String
											.valueOf(response.getStatus())
											.equalsIgnoreCase(
													"successfully provisioned"))) {

								
								//setting update data
								
								Updateddata
										.setPi_status(SMFAgentConstants.SUCCESS);
								if(response.getResponseData()!=null){
									if(response.getResponseData().getRespdescription()!=null){
								 Updateddata.setPi_remarks(response.getResponseData().getRespdescription());
									}
								}
							} else {
								Updateddata
										.setPi_status(SMFAgentConstants.FAILURE);
								 
									if(response.getResponseData()!=null){
										if(response.getResponseData().getRespdescription()!=null){
									 Updateddata.setPi_remarks(response.getResponseData().getRespdescription());
									 if(response.getResponseData().getResponsecode()!=null){
										 Updateddata.setPi_remarks(response.getResponseData().getResponsecode()+"#"+response.getResponseData().getRespdescription());
									 }
									}								
										}

							}
						} else {
							Updateddata
									.setPi_status(SMFAgentConstants.FAILURE);
							if(response.getResponseData()!=null){
								if(response.getResponseData().getRespdescription()!=null){
							 Updateddata.setPi_remarks(response.getResponseData().getRespdescription());
								}
							}

						}
					} else {
						logger.debug(">>>>> VOLTEProvisionProcessor - TIA response received null ...");
					}

			} else {
				logger.debug(">>>>> VOLTEProvisionProcessor - CursorData  is Null ...");
			}
		} catch (com.xius.smf.exceptions.SMFAgentException _exp) {

			logger.error("VOLTEProvisionProcessor - VolteProvisionResponse ---> SMFAgentException");
			Updateddata.setPi_status(SMFAgentConstants.FAILURE);
			logger.error(Utilities.getStackTrace(_exp));

		} catch (Exception _exp) {
			logger.error("VOLTEProvisionProcessor - VolteProvisionResponse ---> Exception");
			Updateddata.setPi_status(SMFAgentConstants.FAILURE);

			logger.error(Utilities.getStackTrace(_exp));
		} finally {

			try {
				if (Updateddata != null) {
					if(Updateddata.getPi_trans_id()!=null){
					updateProcessor.statusUpdate(Updateddata);
					}
				} else {
					logger.error("VOLTEProvisionProcessor -- updateProcessor -domainData is Null");
				}
			} catch (Exception e) {
				logger.error("VOLTEProvisionProcessor -- updateProcessor ---> Exception");
				logger.error(Utilities.getStackTrace(e));
			}

		}
	}
}
