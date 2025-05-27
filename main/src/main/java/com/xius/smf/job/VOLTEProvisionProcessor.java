package com.xius.smf.job;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.smf.domaindata.VOLTECursorData;
import com.xius.smf.domaindata.VolteInsertData;
import com.xius.smf.domaindata.VolteUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;
import com.xius.smf.webservices.smfservices.VolteProcessImpl;
import com.xius.tia.TTprovisioning_xsd.VolteProvisionRequest;
import com.xius.tia.TTprovisioning_xsd.VolteProvisionResponse;

public class VOLTEProvisionProcessor implements Runnable {
	
	private static final Logger logger = LogManager.getLogger(VOLTEProvisionProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	VOLTECursorData cursorData = null;
	VolteInsertData InsertData = new VolteInsertData();
	VolteUpdateData Updateddata = new VolteUpdateData();
	VOLTEUpdateProcessor updateProcessor = new VOLTEUpdateProcessor();
	VOLTEInsertProcessor insertProcessor = new VOLTEInsertProcessor();
	String nwId = InitiateAll.getSMFProps()
	.getProperty(SMFAgentConstants.VOLTE_EXTERNAL_NW_ID);

	public VOLTEProvisionProcessor(CountDownLatch latch, VOLTECursorData curData) {
		this.latch = latch;
		this.cursorData = curData;
	}

	public VOLTEProvisionProcessor(VOLTECursorData curData) {
		this.cursorData = curData;
	}
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
			if (cursorData != null)
				headerDetails.setNetworkID(cursorData.getNetwork_id());
			headerDetails.setPassword("11111111");

			VolteProcessImpl volteImpl = new VolteProcessImpl();

			VolteProvisionRequest request = new VolteProvisionRequest();
			VolteProvisionResponse response = null;

			if (cursorData != null) {

				// Insert Data Setting
				if(nwId!=null){
					InsertData.setPi_network_id(Long.parseLong(nwId));
					Updateddata.setPi_network_id(Long.parseLong(nwId));
				}
				if (cursorData.getACCOUNT_TYPE() != null) {
					InsertData.setPi_acc_type(Long.parseLong(cursorData
							.getACCOUNT_TYPE()));
				}
				if (cursorData.getMsisdn_no() != null) {
					InsertData.setPi_msisdn_no(cursorData.getMsisdn_no());
				}
				if (cursorData.getPROCESS_SEQ_NUMBER() != null) {
					InsertData.setPi_ext_transaction_id(cursorData
							.getPROCESS_SEQ_NUMBER() + "");
				}
					InsertData.setPi_channel_name("SMFJOB");
					InsertData.setPi_service_flag("A");
					
					InsertData.setPi_activity_id(99L);
					InsertData.setPi_login_id("SMFJOB");
					
					if(cursorData.getAccount_id()!=null)
						InsertData.setPi_account_id(cursorData.getAccount_id());
					if(cursorData.getSim_serial_no()!=null)
						InsertData.setPi_sim_serial_no(cursorData.getSim_serial_no());
					if(cursorData.getImsi()!=null)
						InsertData.setPi_imsi_no(cursorData.getImsi());
					if(cursorData.getImsi()!=null)
						InsertData.setPi_acct_status(cursorData.getNEW_STATUS());

				insertProcessor.statusInsert(InsertData);

				if (InsertData.getPo_intrnl_transaction_id() != null) {

					//setting update data
					
					Updateddata
							.setPi_trans_id(InsertData.getPo_intrnl_transaction_id());
					
					// setting tia request as insert success

					logger.debug(">>>>> Insert SMF is successfull sending TIA Provision Request");

					request.setChannelId("SMFJOB");

					if (cursorData.getMsisdn_no() != null) {
						request.setMSISDN(cursorData.getMsisdn_no().toString());
					}
					if (cursorData.getACCOUNT_TYPE() != null) {
						request.setServiceType(cursorData.getACCOUNT_TYPE());
					}
					if (cursorData.getPROCESS_SEQ_NUMBER() != null) {
						request.setTransID(cursorData.getPROCESS_SEQ_NUMBER()
								.toString());
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
					logger.debug(">>>>> VOLTEProvisionProcessor - Insert Data Failed ...");
				}

			} else {
				logger.debug(">>>>> VOLTEProvisionProcessor - CursorData  is Null ...");
			}
		} catch (SMFAgentException _exp) {

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
