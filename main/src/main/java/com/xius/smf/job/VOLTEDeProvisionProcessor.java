package com.xius.smf.job;

import java.util.concurrent.CountDownLatch;

import javax.xml.rpc.ServiceException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.bcgi.util.db.SPFactory;

import com.xius.smf.client.invoker.Manage5GInvoker;
import com.xius.smf.domaindata.InsertSubsFlowTrackerData;
import com.xius.smf.domaindata.VOLTECursorData;
import com.xius.smf.domaindata.VolteInsertData;
import com.xius.smf.domaindata.VolteUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
import com.xius.smf.webservices.smfservices.VolteProcessImpl;
import com.xius.tia.TTprovisioning_xsd.VolteDeProvisionRequest;
import com.xius.tia.TTprovisioning_xsd.VolteDeProvisionResponse;
import com.xius.xbus.messages.billing.tariff.Manage5GRequest;
import com.xius.xbus.messages.billing.tariff.Manage5GResponse;

public class VOLTEDeProvisionProcessor implements Runnable {
	
	private static final Logger logger = LogManager.getLogger(VOLTEDeProvisionProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	String ex5G = null;
	String xbusflag = null;
	VOLTECursorData cursorData = null;
	VolteInsertData InsertData = new VolteInsertData();
	VolteUpdateData Updateddata = new VolteUpdateData();
	VOLTEUpdateProcessor updateProcessor = new VOLTEUpdateProcessor();
	VOLTEInsertProcessor insertProcessor = new VOLTEInsertProcessor();
	String nwId = InitiateAll.getSMFProps().getProperty(
			SMFAgentConstants.VOLTE_EXTERNAL_NW_ID);

	public VOLTEDeProvisionProcessor(CountDownLatch latch,
			VOLTECursorData curData, String ex5G, String xbusflag) {
		this.latch = latch;
		this.cursorData = curData;
		this.ex5G = ex5G;
		this.xbusflag = xbusflag;
	}

	public VOLTEDeProvisionProcessor(VOLTECursorData curData) {
		this.cursorData = curData;
	}

	@Override
	public void run() {
		logger.debug(">>>>> VolteDeProvisionProcessor run called ...");
		try {
			callProvisionVOLTE();
		} finally {
			if (latch != null)
				latch.countDown();
		}
	}

	public void callProvisionVOLTE() {
		HeaderDetails headerDetails = new HeaderDetails();

		headerDetails.setLoginID("SMFJob");
		if (cursorData != null)
			headerDetails.setNetworkID(cursorData.getNetwork_id());
		headerDetails.setPassword("11111111");

		logger.debug(">>>>> VolteDeProvisionProcessor callProvisionVOLTE called ...");
		try {

			VolteProcessImpl volteImpl = new VolteProcessImpl();

			VolteDeProvisionRequest request = new VolteDeProvisionRequest();
			VolteDeProvisionResponse response = null;

			if (cursorData != null) {

				// Insert Data Setting
				if (nwId != null) {
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
				InsertData.setPi_service_flag("D");
				InsertData.setPi_activity_id(99L);
				InsertData.setPi_login_id("SMFJOB");

				if (cursorData.getAccount_id() != null)
					InsertData.setPi_account_id(cursorData.getAccount_id());
				if (cursorData.getSim_serial_no() != null)
					InsertData.setPi_sim_serial_no(cursorData
							.getSim_serial_no());
				if (cursorData.getImsi() != null)
					InsertData.setPi_imsi_no(cursorData.getImsi());
				if (cursorData.getImsi() != null)
					InsertData.setPi_acct_status(cursorData.getNEW_STATUS());

				insertProcessor.statusInsert(InsertData);

				if (InsertData.getPo_intrnl_transaction_id() != null) {

					// setting update data
					Updateddata.setPi_trans_id(InsertData
							.getPo_intrnl_transaction_id());

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
						//request.setTransID(cursorData.getPROCESS_SEQ_NUMBER().toString());
						request.setTransID(InsertData.getPo_intrnl_transaction_id().toString());
					}

					response = volteImpl.deprovision(request, headerDetails);
					if (response != null) {
						if (response.getStatus() != null) {
							if (response.getStatus() != null
									&& (String.valueOf(response.getStatus())
											.equalsIgnoreCase(
													SMFAgentConstants.SUCCESS) || String
											.valueOf(response.getStatus())
											.equalsIgnoreCase(
													"successfully provisioned"))) {

								// setting update data

								Updateddata
										.setPi_status(SMFAgentConstants.SUCCESS);
								if (response.getResponseData() != null) {
									if (response.getResponseData()
											.getRespdescription() != null) {
										Updateddata.setPi_remarks(response
												.getResponseData()
												.getRespdescription());
									}
								}
							} else {
								Updateddata
										.setPi_status(SMFAgentConstants.FAILURE);

								if (response.getResponseData() != null) {
									if (response.getResponseData()
											.getRespdescription() != null) {
										Updateddata.setPi_remarks(response
												.getResponseData()
												.getRespdescription());
										if (response.getResponseData()
												.getResponsecode() != null) {
											Updateddata
													.setPi_remarks(response
															.getResponseData()
															.getResponsecode()
															+ "#"
															+ response
																	.getResponseData()
																	.getRespdescription());
										}
									}
								}

							}
						} else {
							Updateddata.setPi_status(SMFAgentConstants.FAILURE);
							if (response.getResponseData() != null) {
								if (response.getResponseData()
										.getRespdescription() != null) {
									Updateddata.setPi_remarks(response
											.getResponseData()
											.getRespdescription());
								}
							}

						}
					} else {
						logger.debug(">>>>> VolteDeProvisionProcessor - TIA response received null ...");
					}

				} else {
					logger.debug(">>>>> VolteDeProvisionProcessor - Insert Data Failed ...");
				}

			} else {
				logger.debug(">>>>> VolteDeProvisionProcessor - CursorData  is Null ...");
			}
		} catch (SMFAgentException _exp) {

			logger.error("VolteDeProvisionProcessor - VolteDeProvisionResponse ---> SMFAgentException");
			Updateddata.setPi_status(SMFAgentConstants.FAILURE);
			logger.error(Utilities.getStackTrace(_exp));

		} catch (Exception _exp) {
			logger.error("VolteDeProvisionProcessor - VolteDeProvisionResponse ---> Exception");
			Updateddata.setPi_status(SMFAgentConstants.FAILURE);

			logger.error(Utilities.getStackTrace(_exp));
		} finally {
			if (xbusflag != null && xbusflag.equalsIgnoreCase("Y")) {

				HeaderDetails xbusheaderDetails = new HeaderDetails();

				xbusheaderDetails.setLoginID("SMFJob");
				if (cursorData != null)
					xbusheaderDetails.setNetworkID(cursorData.getNetwork_id());
				xbusheaderDetails.setPassword("11111111");

				Manage5GRequest request = new Manage5GRequest();
				Manage5GResponse response = null;

				if (cursorData != null) {

					request.setChannel("SMFJOB");
					request.setMSISDN(cursorData.getMsisdn_no() + "");
					request.setTransactionId(cursorData.getPROCESS_SEQ_NUMBER()
							+ "");
					Manage5GInvoker manage5GInvoker = new Manage5GInvoker();
					try {
						response = manage5GInvoker.manage5Gprovision(request,
								xbusheaderDetails);
					} catch (Exception _exp) {
						logger.error("VOLTEDeProvisionProcessor for 5g EX case - Manage5GResponse ---> Exception");
						logger.error(Utilities.getStackTrace(_exp));
					}

					if (response != null && response.getErrors() != null) {
						logger.error("FAIL");
						System.out
								.println(response.getErrors(0).getErrorCode());
						System.out.println(response.getErrors(0)
								.getErrorMessage());
						if (response.getErrors().length > 0) {
							logger.error("In VOLTEDeProvisionProcessor for 5g EX case errorMessage Manage5GResponse for "
									+ cursorData.getMsisdn_no()
									+ ">>"
									+ response.getErrors()[0].getErrorMessage());
							logger.error("In VOLTEDeProvisionProcessor for 5g EX case errorCode Manage5GResponse for "
									+ cursorData.getMsisdn_no()
									+ ">>"
									+ response.getErrors()[0].getErrorCode());
						}
					} else {
						logger.debug("In VOLTEDeProvisionProcessor for 5g EX case Message Manage5GResponse for "
								+ cursorData.getMsisdn_no() + ">>SUCCESS");
					}

				} else {
					logger.debug(">>>>> VOLTEDeProvisionProcessor for 5g EX case - CursorData  is Null ...");
				}

			} else if (ex5G != null) {

				// invoking 5G Deprovisioning
				try {
					if (ex5G.length() > 0) {
						InsertSubsFlowTrackerData domainData = new InsertSubsFlowTrackerData();

						if (headerDetails.getNetworkID() != null)
							domainData.setPi_network_id(headerDetails
									.getNetworkID());

						if (cursorData.getMsisdn_no() != null)
							domainData.setPi_request_data(cursorData
									.getMsisdn_no().toString());

						domainData.setPi_flow_id(ex5G);

						domainData.setPi_login_id("SMFJOBDEP");
						domainData.setPi_channel("SMFJOB");
						domainData.setPi_user_id("SMFJOBDEP");
						if (cursorData.getACCOUNT_TYPE() != null)
							domainData.setPi_acc_type(Long.parseLong(cursorData
									.getACCOUNT_TYPE()));

						domainData.setPi_account_id(cursorData.getAccount_id());

						domainData.setPi_imsi_no(cursorData.getImsi());

						domainData.setPi_msisdn_no(cursorData.getMsisdn_no());

						domainData.setPi_acct_status(cursorData.getNEW_STATUS());

						domainData.setPi_sim_serial_no(cursorData.getSim_serial_no());
						
						domainData.setPi_publicity_id(cursorData.getPublicity_id());

						SPFactory factory = ServiceUtils.executeSPWithOutCommit("pro_subs_bulk_flow_tracker_insert",domainData, domainData);
						if (logger.isInfoEnabled()) {
							logger.debug(domainData.toString());
						}
						Utilities.commitOrRollback(factory,
								domainData.getPo_error_code());
						if (logger.isInfoEnabled()) {

							logger.debug("In VolteDeprovison for 5g deprov insert Error Code from  pro_subs_bulk_flow_tracker_insert  ==>"
									+ domainData.getPo_error_code());
							logger.debug("In VolteDeprovison for 5g deprov insert  Error Msg from  pro_subs_bulk_flow_tracker_insert  ==>"
									+ domainData.getPo_error_desc());

							logger.debug("In VolteDeprovison for 5g deprov insert  transaction_id from  pro_subs_bulk_flow_tracker_insert  ==>"
									+ domainData.getPo_transaction_id());
						}

						if (domainData.getPo_error_code() == 0) {
							logger.error("In VolteDeprovison for 5g deprov insert  Success transaction_id = "
									+ domainData.getPo_transaction_id());
						}
					}
				} catch (Exception e) {
					logger.error("In VolteDeprovison for 5g deprov insert  failure cursorData.getMsisdn_no()"
							+ cursorData.getMsisdn_no());
				}
				// end of invoking 5G Deprovisioning

			}
			try {
				if (Updateddata != null) {
					if (Updateddata.getPi_trans_id() != null) {
						updateProcessor.statusUpdate(Updateddata);
					}
				} else {
					logger.error("VolteDeProvisionProcessor -- updateProcessor -domainData is Null");
				}
			} catch (Exception e) {
				logger.error("VolteDeProvisionProcessor -- updateProcessor ---> Exception");
				logger.error(Utilities.getStackTrace(e));
			}

		}
	}
}
