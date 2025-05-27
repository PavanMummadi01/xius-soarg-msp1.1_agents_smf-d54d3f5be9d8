package com.xius.smf.job;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.jettison.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.xius.agent.smf.smfmanagement.CommandlistType;
import com.xius.agent.smf.smfmanagement.GetTpIdBasedCommandsRequest;
import com.xius.agent.smf.smfmanagement.GetTpIdBasedCommandsResponse;
import com.xius.agent.smf.smfmanagement.InsertSubsFlowTrackerRequest;
import com.xius.agent.smf.smfmanagement.InsertSubsFlowTrackerResponse;
import com.xius.billing.SubscriberManagement_xsd.GetSubDataRequest;
import com.xius.billing.SubscriberManagement_xsd.GetSubDataResponse;
import com.xius.smf.client.invoker.GetSubDataInvoker;
import com.xius.smf.client.invoker.Restinvoker;
import com.xius.smf.domaindata.CancelLocationData;
import com.xius.smf.domaindata.EmaFlowCMDSInsertData;
import com.xius.smf.domaindata.EmaFlowProcessCursorData;
import com.xius.smf.domaindata.EmaFlowUpdateData;
import com.xius.smf.domaindata.GetTpIdBasedCommandsCursorData;
import com.xius.smf.domaindata.GetTpIdBasedCommandsData;
import com.xius.smf.domaindata.InsertSubsFlowTrackerData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.ne.NPRsmsConfirmationHelper;
import com.xius.smf.ne.TempMessageInfo;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;


import net.bcgi.util.db.SPFactory;

public class EmaFlowProcessor implements Runnable {
	private	 static final Logger logger = LogManager.getLogger(EmaFlowProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	List<EmaFlowProcessCursorData> emaFlowProcessCursorData = new ArrayList<EmaFlowProcessCursorData>();
	String[] status = null;
	String ipsending = null;

	public EmaFlowProcessor(CountDownLatch latch, List<EmaFlowProcessCursorData> data, String ipsending) {
		this.latch = latch;
		this.emaFlowProcessCursorData = data;
		this.ipsending = ipsending;
	}

	@Override
	public void run() {

		if (logger.isInfoEnabled())
			logger.info("EmaFlowProcessor - run method called");
		EmaFlowUpdateData emaFlowUpdateData = new EmaFlowUpdateData();

		try {

			String[] cmds = new String[emaFlowProcessCursorData.size()];
			String[] errorcodes = new String[emaFlowProcessCursorData.size()];
			String[] errormsgs = new String[emaFlowProcessCursorData.size()];
			String[] processtime = new String[emaFlowProcessCursorData.size()];
			String[] priority = new String[emaFlowProcessCursorData.size()];
			Restinvoker invoker = new Restinvoker();
			String[] transIdArray = new String[emaFlowProcessCursorData.size()];
			status = new String[emaFlowProcessCursorData.size()];
			String[] remarks = new String[emaFlowProcessCursorData.size()];
			String[] inttransid = new String[emaFlowProcessCursorData.size()];
			int getdataflag = 0;
			for (int i = 0; i < emaFlowProcessCursorData.size(); i++) {

				emaFlowUpdateData.setPi_network_id(emaFlowProcessCursorData.get(i).getNetwork_id());

				CancelLocationData data = getCursorData(emaFlowProcessCursorData.get(i));

				if (data != null && data.getPo_error_code() == 0) {

					if (data != null && data.getPo_error_code() == 0) {

						String cc = InitiateAll.getSMFProps().getProperty("EMACMD_COUNTRY_CODE");
						String mdn = null;

						mdn = String.valueOf(data.getPo_msisdn());

						String prop = InitiateAll.getSMFProps().getProperty("TTSA_CHANGE_MDN_CMD");

						String oldimsi = data.getPo_imsi();

						int flg = 0;
						if (prop != null) {
							String propArr[] = prop.split(",");
							for (int j = 0; j < propArr.length; j++) {
								if (emaFlowProcessCursorData.get(i).getCommand_name() != null && propArr[j]
										.equalsIgnoreCase(emaFlowProcessCursorData.get(i).getCommand_name())) {
									flg = 1;
								}
							}
						}

						if (flg == 1) {
							mdn = emaFlowProcessCursorData.get(i).getMsisdn();
							if (emaFlowProcessCursorData.get(i).getImsi() != null) {
								oldimsi = emaFlowProcessCursorData.get(i).getImsi();
							}
						}

						String nmdn = emaFlowProcessCursorData.get(i).getNew_msisdn();

						if (nmdn == null) {
							nmdn = mdn;
						}

						if (cc != null) {
							mdn = cc + mdn;
							nmdn = cc + nmdn;
						}

						String cmdValue = emaFlowProcessCursorData.get(i).getCommand();
						cmdValue = cmdValue
								.replace("$TRANSID", String.valueOf(emaFlowProcessCursorData.get(i).getTrans_id()))
								.replace("$IMSI", String.valueOf(oldimsi))
								.replace("$CARDTYPE", String.valueOf(data.getPo_car_type()))
								.replace("$ALG", String.valueOf(data.getPo_alg()))
								.replace("$KI", String.valueOf(data.getPo_ki_value()))
								.replace("$EMA_PROFILE", String.valueOf(data.getPo_ema_profile()))
								.replace("$MSISDN", mdn).replace("$USERTYPE", String.valueOf(data.getPo_usertype()))
								.replace("$NMSISDN", nmdn)
								.replace("$NIMSI",
										emaFlowProcessCursorData.get(i).getNew_imsi() != null
												? emaFlowProcessCursorData.get(i).getNew_imsi()
												: "")
								.replace("$3GIND", String.valueOf(data.getPo_three_gind()));
						logger.info( "updated command  ==>" + cmdValue);
						cmds[i] = cmdValue;
						priority[i] = emaFlowProcessCursorData.get(i).getPriority() + "";
					}
				} else {
					getdataflag = 1;
					break;
				}
			}
			if (getdataflag == 0) {
				logger.info( "Invoking rest invoker  ==>");
				String[] response = invoker.getinvokeEmaCmdPriorityDetails(cmds, priority, ipsending);

				logger.info( "restinvoker response --->" + response);
				if (response != null) {
					int failureSeqFlg = 0;

					ArrayList<String> idList = new ArrayList<String>();
					ArrayList<String> msgList = new ArrayList<String>();
					ArrayList<String> cmdResponseTimeList = new ArrayList<String>();

					try {
						// Parse JSON
						Gson gson = new Gson();
						JsonObject jObject = gson.fromJson(response[0], JsonObject.class);

						// Access the ttsaCMDResponse object
						JsonObject ttsaCMDResponse = jObject.getAsJsonObject("ttsaCMDResponse");

						// Access ttsaSquenceID and ttsaResponseMsg arrays
						String[] ttsaSquenceID = gson.fromJson(ttsaCMDResponse.get("ttsaSquenceID"), String[].class);
						String[] ttsaResponseMsg = gson.fromJson(ttsaCMDResponse.get("ttsaResponseMsg"),
								String[].class);
						String[] cmdResponseTime = gson.fromJson(ttsaCMDResponse.get("cmdResponseTime"),
								String[].class);

						// Print values
						System.out.println("ttsaSquenceID:");
						for (String id : ttsaSquenceID) {
							System.out.println(id);
							idList.add(id);
						}

						System.out.println("ttsaResponseMsg:");
						for (String msg : ttsaResponseMsg) {
							System.out.println(msg);
							msgList.add(msg);
						}

						System.out.println("cmdResponseTime:");
						for (String msg : cmdResponseTime) {
							System.out.println(msg);
							cmdResponseTimeList.add(msg);
						}

					} catch (Exception e) {
						logger.debug(
								"Exception while reading response obj ttsaCMDResponse in resp>>" + response[0]);
					}

					String tmpSeqId = null;
					for (int i = 0; i < emaFlowProcessCursorData.size(); i++) {

						String skipflagflowName = InitiateAll.getSMFProps()
								.getProperty("TTSA_EMA_FLOW_FAIL_SKIP_FLOWNAME");
						String skipflagcmdName = InitiateAll.getSMFProps()
								.getProperty("TTSA_EMA_FLOW_FAIL_SKIP_CMDNAME");
						int skipflag = 0;
						if (skipflagflowName != null
								&& emaFlowProcessCursorData.get(i).getFlow_name().equalsIgnoreCase(skipflagflowName)) {
							String[] skipcmdArr = skipflagcmdName.split(",");
							for (int j = 0; j < skipcmdArr.length; j++) {
								if (skipcmdArr[j].equalsIgnoreCase(emaFlowProcessCursorData.get(i).getCommand_name())) {
									skipflag = 1;
								}
							}

						}

						JSONObject result = new JSONObject(response[0]);
						if (result.get("responseCode") != null) {
							String respcode = result.get("responseCode").toString();
							String respmsg = result.get("responseMessage").toString();
							if (respcode != null) {
								if (response != null && response[1] != null) {
									if (response[1]
											.equalsIgnoreCase(emaFlowProcessCursorData.get(i).getPriority() + "")) {
										failureSeqFlg = 1;
									}
								}
								if (failureSeqFlg == 0) {
									transIdArray[i] = emaFlowProcessCursorData.get(i).getTrans_id();
									status[i] = "S";
									inttransid[i] = emaFlowProcessCursorData.get(i).getInt_trans_id();
									remarks[i] = "SUCCESS";
									if (idList != null
											&& idList.contains(emaFlowProcessCursorData.get(i).getPriority() + "")) {
										errorcodes[i] = "0";
										errormsgs[i] = msgList.get(
												idList.indexOf(emaFlowProcessCursorData.get(i).getPriority() + ""));
										processtime[i] = cmdResponseTimeList.get(
												idList.indexOf(emaFlowProcessCursorData.get(i).getPriority() + ""));
									} else {
										errorcodes[i] = "0";
										errormsgs[i] = "SUCCESS";
										processtime[i] = "";
									}
								} else {

									transIdArray[i] = emaFlowProcessCursorData.get(i).getTrans_id();
									status[i] = "F";
									inttransid[i] = emaFlowProcessCursorData.get(i).getInt_trans_id();

									if (response[1]
											.equalsIgnoreCase(emaFlowProcessCursorData.get(i).getPriority() + "")) {
										errorcodes[i] = respcode;
										errormsgs[i] = respmsg;
										remarks[i] = SMFAgentConstants.FAILURE;
										processtime[i] = "";
										tmpSeqId = emaFlowProcessCursorData.get(i).getPriority() + "";

										if (skipflag == 1) {
											status[i] = "S";
											errorcodes[i] = respcode;
											errormsgs[i] = respmsg;
											remarks[i] = "SKIP";
											processtime[i] = "";
											tmpSeqId = emaFlowProcessCursorData.get(i).getPriority() + "";
										}

									} else {
										if (idList != null && idList
												.contains(emaFlowProcessCursorData.get(i).getPriority() + "")) {
											errorcodes[i] = "1";
											errormsgs[i] = msgList.get(
													idList.indexOf(emaFlowProcessCursorData.get(i).getPriority() + ""));
											remarks[i] = "PENDING";
											processtime[i] = "";
										} else {
											errorcodes[i] = "";
											errormsgs[i] = "Command hold due to " + tmpSeqId + " Sequence id failed";
											remarks[i] = "PENDING";
											processtime[i] = "";
											tmpSeqId = emaFlowProcessCursorData.get(i).getPriority() + "";
										}
									}

								}

							} else {

								transIdArray[i] = emaFlowProcessCursorData.get(i).getTrans_id();
								status[i] = "F";
								inttransid[i] = emaFlowProcessCursorData.get(i).getInt_trans_id();
								remarks[i] = SMFAgentConstants.FAILURE;

							}

						} else {
							transIdArray[i] = emaFlowProcessCursorData.get(i).getTrans_id();
							status[i] = "F";
							inttransid[i] = emaFlowProcessCursorData.get(i).getInt_trans_id();
							remarks[i] = SMFAgentConstants.FAILURE;
							errorcodes[i] = "40000";
							errormsgs[i] = "Internal Server Error TTSAApp";
							processtime[i] = "";
						}
					}
					emaFlowUpdateData.setPi_trans_id(transIdArray);
					emaFlowUpdateData.setPi_status(status);
					emaFlowUpdateData.setPi_remarks(remarks);
					emaFlowUpdateData.setPi_int_trans_id(inttransid);
					emaFlowUpdateData.setPi_cmds(cmds);
					emaFlowUpdateData.setPi_error_codes(errorcodes);
					emaFlowUpdateData.setPi_error_msg(errormsgs);
					emaFlowUpdateData.setPi_cmd_resp_time(processtime);
					notifyEmail(emaFlowUpdateData);

				} else {

					for (int i = 0; i < emaFlowProcessCursorData.size(); i++) {
						transIdArray[i] = emaFlowProcessCursorData.get(i).getTrans_id();
						status[i] = "F";
						inttransid[i] = emaFlowProcessCursorData.get(i).getInt_trans_id();
						remarks[i] = SMFAgentConstants.FAILURE + "~NO RESPONE FROM TTSAApp";
						errorcodes[i] = "40000";
						errormsgs[i] = "Internal Server Error TTSAApp.";
						processtime[i] = "";
					}

					emaFlowUpdateData.setPi_trans_id(transIdArray);
					emaFlowUpdateData.setPi_status(status);
					emaFlowUpdateData.setPi_remarks(remarks);
					emaFlowUpdateData.setPi_int_trans_id(inttransid);
					emaFlowUpdateData.setPi_cmds(cmds);
					emaFlowUpdateData.setPi_error_codes(errorcodes);
					emaFlowUpdateData.setPi_error_msg(errormsgs);
					emaFlowUpdateData.setPi_cmd_resp_time(processtime);
					notifyEmail(emaFlowUpdateData);
				}
			} else {
				for (int i = 0; i < emaFlowProcessCursorData.size(); i++) {
					transIdArray[i] = emaFlowProcessCursorData.get(i).getTrans_id();
					status[i] = "F";
					inttransid[i] = emaFlowProcessCursorData.get(i).getInt_trans_id();
					remarks[i] = SMFAgentConstants.FAILURE + "~NO DATA FOUND FOR GIVEN MSISDN";
					errorcodes[i] = "";
					errorcodes[i] = "";
					errormsgs[i] = "";
					processtime[i] = "";
				}
				emaFlowUpdateData.setPi_trans_id(transIdArray);
				emaFlowUpdateData.setPi_status(status);
				emaFlowUpdateData.setPi_remarks(remarks);
				emaFlowUpdateData.setPi_int_trans_id(inttransid);
				emaFlowUpdateData.setPi_cmds(cmds);
				emaFlowUpdateData.setPi_error_codes(errorcodes);
				emaFlowUpdateData.setPi_error_msg(errormsgs);
				emaFlowUpdateData.setPi_cmd_resp_time(processtime);
				notifyEmail(emaFlowUpdateData);
			}

		} /*
			 * catch (SMFAgentException _exp) { String[] transIdArray = new
			 * String[emaFlowProcessCursorData.size()]; String[] status = new
			 * String[emaFlowProcessCursorData.size()]; String[] remarks = new
			 * String[emaFlowProcessCursorData.size()]; String[] inttransid = new
			 * String[emaFlowProcessCursorData.size()]; String[] cmds = new
			 * String[emaFlowProcessCursorData.size()]; String[] errorcodes = new
			 * String[emaFlowProcessCursorData.size()]; String[] errormsgs = new
			 * String[emaFlowProcessCursorData.size()]; String[] processtime = new
			 * String[emaFlowProcessCursorData.size()]; for (int i = 0; i <
			 * emaFlowProcessCursorData.size(); i++) { transIdArray[i] =
			 * emaFlowProcessCursorData.get(i).getTrans_id(); status[i] = "F"; inttransid[i]
			 * = emaFlowProcessCursorData.get(i).getInt_trans_id(); remarks[i] =
			 * _exp.getErrorMessage(); cmds[i] =
			 * emaFlowProcessCursorData.get(i).getCommand(); errorcodes[i] = "";
			 * errormsgs[i] = ""; processtime[i] = ""; }
			 * 
			 * emaFlowUpdateData.setPi_trans_id(transIdArray);
			 * emaFlowUpdateData.setPi_status(status);
			 * emaFlowUpdateData.setPi_remarks(remarks);
			 * emaFlowUpdateData.setPi_int_trans_id(inttransid);
			 * emaFlowUpdateData.setPi_cmds(cmds);
			 * emaFlowUpdateData.setPi_error_codes(errorcodes);
			 * emaFlowUpdateData.setPi_error_msg(errormsgs);
			 * emaFlowUpdateData.setPi_cmd_resp_time(processtime);
			 * 
			 * notifyEmail(emaFlowUpdateData);
			 * 
			 * }
			 */ catch (Exception _exp) {
			logger.error(Utilities.getStackTrace(_exp));
		} finally {
			try {
				try {

					setupdateCall(emaFlowUpdateData);
				} catch (Exception e) {
					logger.error("Emaflow while upadte>" + Utilities.getStackTrace(e));
				}

				try {
					// Added for traveler packs case
					String Tprop = InitiateAll.getSMFProps().getProperty("EMACMD_REG_FLOW_NAMES_TRAVELLER_PACK");
					String TStatus = InitiateAll.getSMFProps().getProperty("EMACMD_REG_TRAVELLER_PACK_STATUS");

					if (Tprop != null && status != null && status.length > 0 && status[0] != null
							&& ((TStatus != null && TStatus.contains(status[0])) || status[0].equalsIgnoreCase("S"))) {

						String[] FlowNameArrayProp = Tprop.split("#");
						for (int i = 0; i < FlowNameArrayProp.length; i++) {
							if (emaFlowProcessCursorData.get(0).getFlow_name().equalsIgnoreCase(FlowNameArrayProp[i])) {
								logger.error( "EMACMD_REG_FLOW_NAMES_TRAVELLER_PACK HERE>>>");
								GetTpIdBasedCommandsRequest getTpIdBasedCommandsRequest = new GetTpIdBasedCommandsRequest();

								if (emaFlowProcessCursorData.get(0).getNew_msisdn() != null) {
									getTpIdBasedCommandsRequest
											.setMsisdn(emaFlowProcessCursorData.get(0).getNew_msisdn());
								} else {
									getTpIdBasedCommandsRequest.setMsisdn(emaFlowProcessCursorData.get(0).getMsisdn());
								}
								getTpIdBasedCommandsRequest.setFlag("I");

								HeaderDetails headerDetails = new HeaderDetails();
								headerDetails.setLoginID("SMFJOBEMA");
								headerDetails.setNetworkID(emaFlowProcessCursorData.get(0).getNetwork_id());
								getTpIdBasedCommands(getTpIdBasedCommandsRequest, headerDetails);

								break;
							}
						}

					}
				} catch (Exception e) {
					logger.error("WHile Traveller pack" + Utilities.getStackTrace(e));
				}
				try {
					// Added for Volte Insert after reg
					String prop = InitiateAll.getSMFProps().getProperty("EMACMD_REG_FLOW_NAMES_VOLTEACT");
					String propflowID = InitiateAll.getSMFProps().getProperty("EMACMD_REG_FLOW_ID");
					String flgStatus = InitiateAll.getSMFProps().getProperty("EMACMD_REG_FLOW_ID_STATUSFLAG");

					if (prop != null && emaFlowProcessCursorData != null && status != null && status.length > 0
							&& status[0] != null && ((flgStatus != null && flgStatus.contains(status[0]))
									|| status[0].equalsIgnoreCase("S"))) {
						logger.error( "EMACMD_REG_FLOW_NAMES_VOLTEACT HERE >>>");
						String[] FlowNameArrayProp = prop.split("#");
						for (int i = 0; i < FlowNameArrayProp.length; i++) {
							if (emaFlowProcessCursorData.get(0).getFlow_name().equalsIgnoreCase(FlowNameArrayProp[i])) {
								InsertSubsFlowTrackerRequest insertSubsFlowTrackerRequest = new InsertSubsFlowTrackerRequest();
								insertSubsFlowTrackerRequest.setChannel("SMFEMAFLOWREG");
								if (propflowID != null) {
									insertSubsFlowTrackerRequest.setFlowId(propflowID);
								} else {
									insertSubsFlowTrackerRequest.setFlowId("101");
								}
								if (emaFlowProcessCursorData.get(0).getNew_msisdn() != null) {
									insertSubsFlowTrackerRequest
											.setRequestData(emaFlowProcessCursorData.get(0).getNew_msisdn() + "~"
													+ emaFlowProcessCursorData.get(0).getMsisdn() + "~~Registration");
								} else {
									insertSubsFlowTrackerRequest
											.setRequestData(emaFlowProcessCursorData.get(0).getMsisdn() + "~"
													+ emaFlowProcessCursorData.get(0).getMsisdn() + "~~Registration");
								}
								insertSubsFlowTrackerRequest
										.setUserDefined3(emaFlowProcessCursorData.get(0).getTrans_id());
								insertSubsFlowTrackerRequest.setUserId("SMFEMAFLOWREG");
								HeaderDetails headerDetails = new HeaderDetails();
								headerDetails.setLoginID("SMFJOBEMA");
								headerDetails.setNetworkID(emaFlowProcessCursorData.get(0).getNetwork_id());
								insertSubsFlowTracker(insertSubsFlowTrackerRequest, headerDetails);

								break;
							}
						}

					}
				} catch (Exception e) {
					logger.error("WHile EMAFLOW volte" + Utilities.getStackTrace(e));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			latch.countDown();
		}

	}

	private void notifyEmail(EmaFlowUpdateData updateData) {
		String external_trans_id = null, transaction_id = null, command_name = null, err_code = null, err_msg = null;
		String notifyflag = InitiateAll.getSMFProps().getProperty("EMA_CMD_FAILED_EVENT_ID");
		try {
			int cnt = 0;

			if (notifyflag != null && updateData != null && notifyflag.length() > 0) {
				external_trans_id = "";
				transaction_id = "";
				command_name = "";
				err_code = "";
				err_msg = "";

				for (int i = 0; i < updateData.getPi_status().length; i++) {
					if (updateData.getPi_status()[i].equalsIgnoreCase("F")) {
						cnt++;
						external_trans_id = external_trans_id + "~" + updateData.getPi_trans_id()[i];
						transaction_id = transaction_id + "~" + updateData.getPi_int_trans_id()[i];
						command_name = command_name + "~" + updateData.getPi_cmds()[i];
						err_code = err_code + "~" + updateData.getPi_error_codes()[i];
						err_msg = err_msg + "~" + updateData.getPi_error_msg()[i];
						if (err_msg != null && err_msg.length() > 100)
							err_msg = err_msg.substring(0, 100);

					}
				}
				if (cnt > 0) {

					String emailFrom = InitiateAll.getSMFProps().getProperty("EMA_CMD_FAILED_EMAILID_FROM");
					String emailTo = InitiateAll.getSMFProps().getProperty("EMA_CMD_FAILED_EMAILID_TO");
					String subject = InitiateAll.getSMFProps().getProperty("EMA_CMD_FAILED_SUBJECT");

					if (notifyflag != null) {
						if (notifyflag.length() > 0) {
							logger.info("  emacmdimpl setting NE request for event code" + notifyflag);

							NPRsmsConfirmationHelper nPRsmsConfirmationHelper = new NPRsmsConfirmationHelper();
							TempMessageInfo smsData = new TempMessageInfo();
							String destMSISDNs = null;

							smsData.setEmailFrom(emailFrom);
							smsData.setEmailTo(emailTo);
							smsData.setSubject(subject);
							smsData.setNetworkId(updateData.getPi_network_id() + "");
							smsData.setDestMSISDNs(destMSISDNs);
							smsData.setUserDefined1(external_trans_id);
							smsData.setUserDefined2(transaction_id);
							if (command_name != null && command_name.length() > 94)
								smsData.setUserDefined3(command_name.substring(0, 95) + "...");
							else
								smsData.setUserDefined3(command_name);
							smsData.setUserDefined4(err_msg);
							smsData.setUserDefined5(err_code);
							smsData.setUserDefined6(".");
							smsData.setEventReferenceCode(notifyflag);
							nPRsmsConfirmationHelper.sendMsgToSubscriber(smsData);
						}
					}
				}
			}
		} catch (Exception e) {
			logger.error( "Exception while Sending Notification external_trans_id>>" + external_trans_id
					+ " transaction_id>>" + transaction_id);
		}
	}

	private void setupdateCall(EmaFlowUpdateData updateData) {

		try {

			SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_update_ema_flow_cmds", updateData,
					updateData);

			if (logger.isInfoEnabled()) {
				logger.info( updateData.toString());
			}
			Utilities.commitOrRollback(spfactory, updateData.getPo_error_code());

		} catch (SMFAgentException e) {
			e.printStackTrace();
		}

		if (logger.isInfoEnabled()) {
			logger.info(
					"Error Code from  pro_update_ema_flow_cmds   ==>" + updateData.getPo_error_code());
			logger.info( "Error Msg from  pro_update_ema_flow_cmds   ==>" + updateData.getPo_error_desc());
		}

	}

	private CancelLocationData getCursorData(EmaFlowProcessCursorData emaFlowProcessCursorData) {

		String commandNameprop = InitiateAll.getSMFProps().getProperty("TTSA_REGSIMSWAP_CMD_NAME_GETNEWIMSI");
		String flowNameprop = InitiateAll.getSMFProps().getProperty("TTSA_REGSIMSWAP_FLOW_NAME_GETNEWIMSI");

		int cmdNameflg = 0;
		int flowNameflg = 0;
		if (commandNameprop != null && flowNameprop != null) {

			String propArr[] = flowNameprop.split(",");
			for (int j = 0; j < propArr.length; j++) {
				if (emaFlowProcessCursorData.getFlow_name() != null
						&& propArr[j].equalsIgnoreCase(emaFlowProcessCursorData.getFlow_name())) {
					flowNameflg = 1;
					break;
				}
			}
			if (flowNameflg == 1) {
				propArr = commandNameprop.split(",");
				for (int j = 0; j < propArr.length; j++) {
					if (emaFlowProcessCursorData.getCommand_name() != null
							&& propArr[j].equalsIgnoreCase(emaFlowProcessCursorData.getCommand_name())) {
						cmdNameflg = 1;
						break;
					}
				}
			}
		}

		String flowprop = InitiateAll.getSMFProps().getProperty("TTSA_CHANGE_MDN_CMD_FLOW");

		int flowflg = 0;
		if (flowprop != null) {
			String propArr[] = flowprop.split(",");
			for (int j = 0; j < propArr.length; j++) {
				if (emaFlowProcessCursorData.getFlow_name() != null
						&& propArr[j].equalsIgnoreCase(emaFlowProcessCursorData.getFlow_name())) {
					flowflg = 1;
					break;
				}
			}
		}

		CancelLocationData data = new CancelLocationData();
		if (emaFlowProcessCursorData.getNetwork_id() != null) {
			data.setPi_network_id(emaFlowProcessCursorData.getNetwork_id());
		}
		if (emaFlowProcessCursorData.getMsisdn() != null) {
			data.setPi_msisdn_no(new Long(emaFlowProcessCursorData.getMsisdn()));
		}
		if (emaFlowProcessCursorData.getNew_msisdn() != null) {
			data.setPi_msisdn_no(new Long(emaFlowProcessCursorData.getNew_msisdn()));
		}
		if (flowflg == 1 && emaFlowProcessCursorData.getImsi() != null) {
			data.setPi_msisdn_no(new Long(emaFlowProcessCursorData.getImsi()));
		}

		if (cmdNameflg == 1 && emaFlowProcessCursorData.getNew_imsi() != null) {
			data.setPi_msisdn_no(new Long(emaFlowProcessCursorData.getNew_imsi()));
		}

		SPFactory spfactory;
		try {
			spfactory = ServiceUtils.executeSPWithOutCommit("get_upload_kidetails", data, data);
			Utilities.commitOrRollback(spfactory, data.getPo_error_code());

		} catch (SMFAgentException e) {
			e.printStackTrace();
		}
		if (logger.isInfoEnabled()) {
			logger.info( "Emaflow Error Code from  get_upload_kidetails  ==>" + data.getPo_error_code());
			logger.info( "Emaflow Error Msg from  get_upload_kidetails  ==>" + data.getPo_error_desc());
		}

		if (flowflg == 1 && emaFlowProcessCursorData != null) {
			if (emaFlowProcessCursorData.getNew_msisdn() != null || emaFlowProcessCursorData.getMsisdn() != null) {
				logger.info(
						"flowflg is active so changing to:" + emaFlowProcessCursorData.getMsisdn() + " from :"
								+ emaFlowProcessCursorData.getNew_msisdn() != null
										? emaFlowProcessCursorData.getNew_msisdn()
										: emaFlowProcessCursorData.getMsisdn());
				data.setPo_msisdn(Long.parseLong(
						emaFlowProcessCursorData.getNew_msisdn() != null ? emaFlowProcessCursorData.getNew_msisdn()
								: emaFlowProcessCursorData.getMsisdn()));
			}
		}

		return data;
	}

	public InsertSubsFlowTrackerResponse insertSubsFlowTracker(InsertSubsFlowTrackerRequest request,
			HeaderDetails headerDetails) throws RemoteException, SMFAgentException {

		InsertSubsFlowTrackerResponse response = new InsertSubsFlowTrackerResponse();

		InsertSubsFlowTrackerData domainData = null;
		logger.info("Emaflow volte insert setRequestData........................");

		domainData = setRequestData(request, headerDetails);

		String msisdnNonCC = null;
		if (request.getRequestData() != null) {
			if (request.getRequestData() != null) {
				String splitArr[] = request.getRequestData().split("~");

				msisdnNonCC = splitArr[0];
			}

		}

		// getsubdata
		try {
			GetSubDataRequest idRequest = new GetSubDataRequest();

			com.xius.billing.SubscriberManagement_xsd.AccountType account1 = new com.xius.billing.SubscriberManagement_xsd.AccountType();
			account1.setMSISDN(msisdnNonCC);
			idRequest.setAccount(account1);

			GetSubDataInvoker getSubDataInvoker = new GetSubDataInvoker();
			GetSubDataResponse resp = getSubDataInvoker.GetSubData(headerDetails, idRequest);

			if (resp != null) {
				domainData.setPi_msisdn_no(Long.parseLong(msisdnNonCC));
				if (resp.getAccountType() != null) {
					domainData.setPi_acc_type(Long.parseLong(resp.getAccountType()));
				}
				if (resp.getAccountID() != null) {
					domainData.setPi_account_id(resp.getAccountID());
				}
				if (resp.getSIM() != null) {
					domainData.setPi_sim_serial_no(resp.getSIM());
				}
				if (resp.getIMSI() != null) {
					domainData.setPi_imsi_no(resp.getIMSI());
				}
				if (resp.getAccountStatus() != null) {
					domainData.setPi_acct_status(resp.getAccountStatus());
				}

			}

		} catch (Exception e) {
			logger.info(
					"Emaflow volte insert  Exception in InsertSubsFlowTracker while getsubdata for MSISDN="
							+ msisdnNonCC);
		}
		// end of getsubdata

		SPFactory factory = ServiceUtils.executeSPWithOutCommit("pro_subs_bulk_flow_tracker_insert", domainData,
				domainData);
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info( "Emaflow volte insert Error Code from  pro_subs_bulk_flow_tracker_insert  ==>"
					+ domainData.getPo_error_code());
			logger.info( "Emaflow volte insert  Error Msg from  pro_subs_bulk_flow_tracker_insert  ==>"
					+ domainData.getPo_error_desc());
			logger.info("Emaflow volte insert  transid from  pro_subs_bulk_flow_tracker_insert  ==>"
					+ domainData.getPo_transaction_id());
		}

		if (domainData.getPo_error_code() == 0) {
			response = setWebserviceResponse(domainData);
		}

		else {
			throw new SMFAgentException(domainData.getPo_error_code().toString(), domainData.getPo_error_desc());
		}

		return response;

	}

	public InsertSubsFlowTrackerData setRequestData(InsertSubsFlowTrackerRequest request, HeaderDetails headerDetails) {

		InsertSubsFlowTrackerData data = new InsertSubsFlowTrackerData();
		String requestData = "";
		if (headerDetails.getNetworkID() != null)
			data.setPi_network_id(headerDetails.getNetworkID());
		if (request.getRequestData() != null)
			requestData = request.getRequestData();
		if (request.getFlowId() != null)
			data.setPi_flow_id(request.getFlowId());

		if (request.getUserDefined1() != null) {
			requestData = requestData + "~" + request.getUserDefined1();
		}
		if (request.getUserDefined2() != null) {
			requestData = requestData + "~" + request.getUserDefined2();
		}
		if (request.getUserDefined3() != null) {
			data.setPi_trans_id(request.getUserDefined3());
		}
		if (request.getUserId() != null) {
			data.setPi_user_id(request.getUserId());
		}

		if (headerDetails.getLoginID() != null) {
			data.setPi_user_id(headerDetails.getLoginID());
		}

		if (request.getChannel() != null) {
			data.setPi_channel(request.getChannel());
		}

		data.setPi_request_data(requestData);
		return data;
	}

	private InsertSubsFlowTrackerResponse setWebserviceResponse(InsertSubsFlowTrackerData domainData) {

		InsertSubsFlowTrackerResponse response = new InsertSubsFlowTrackerResponse();
		if (domainData.getPo_transaction_id() != null)
			response.setTransID(domainData.getPo_transaction_id());
		return response;

	}

	// Added for traveler packs case

	public GetTpIdBasedCommandsResponse getTpIdBasedCommands(GetTpIdBasedCommandsRequest request,
			HeaderDetails headerDetails) throws RemoteException, SMFAgentException {

		GetTpIdBasedCommandsResponse response = new GetTpIdBasedCommandsResponse();
		GetTpIdBasedCommandsData domainData = null;
		domainData = setRequestData(request, headerDetails);

		if (request.getFlag() != null
				&& (request.getFlag().equalsIgnoreCase("I") || (request.getFlag().equalsIgnoreCase("G")))) {// ONLY IF
																											// TP REQ
			// RECIVED
			SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_msisdn_tp_cmd_name_ttsa", domainData,
					domainData);

			if (logger.isInfoEnabled()) {

				logger.info( "EMAflow Traveller pack pro_msisdn_tp_cmd_name_ttsa for msisdn" + ">>"
						+ request.getMsisdn() + "Error Code ==>" + domainData.getPo_error_code());
				logger.info( "EMAflow Traveller pack  pro_msisdn_tp_cmd_name_ttsa for msisdn" + ">>"
						+ request.getMsisdn() + "Error Msg ==>" + domainData.getPo_error_desc());
			}

			Utilities.commitOrRollback(spfactory, domainData.getPo_error_code());

			if (domainData.getPo_error_code() != 0) {

				throw new SMFAgentException(domainData.getPo_error_code().toString(), domainData.getPo_error_desc());
			} else {
				response = setWebserviceResponse(domainData);
			}
		}

		if (domainData != null && domainData.getPo_command_list() != null && domainData.getPo_command_list().size() > 0
				&& request.getFlag() != null && request.getFlag().equalsIgnoreCase("I")) {
			EmaFlowCMDSInsertData emaFlowCMDSInsertData = new EmaFlowCMDSInsertData();
			String[] pi_cmd_names = new String[domainData.getPo_command_list().size()];
			Long[] pi_priorities = new Long[domainData.getPo_command_list().size()];
			GetTpIdBasedCommandsCursorData cur = null;

			for (int i = 0; i < domainData.getPo_command_list().size(); i++) {
				cur = domainData.getPo_command_list().get(i);
				logger.info(
						"EMAflow Traveller pack  pro_ema_flwcmds_ins Inserting commands for msisdn" + ">>"
								+ request.getMsisdn() + " command >>" + cur.getCommand_name() + " priority >> "
								+ cur.getPriority());

				if (cur.getCommand_name() != null) {
					pi_cmd_names[i] = cur.getCommand_name();
				}
				if (cur.getPriority() != null) {
					pi_priorities[i] = cur.getPriority();
				}

			}
			emaFlowCMDSInsertData.setPi_network_id(headerDetails.getNetworkID());
			emaFlowCMDSInsertData.setPi_status("P");
			emaFlowCMDSInsertData.setPi_priorities(pi_priorities);
			emaFlowCMDSInsertData.setPi_msisdn(request.getMsisdn());
			emaFlowCMDSInsertData.setPi_flow_name(request.getFlowName());
			emaFlowCMDSInsertData.setPi_cmd_names(pi_cmd_names);

			SPFactory spfactory1 = ServiceUtils.executeSPWithOutCommit("pro_ema_flwcmds_ins", emaFlowCMDSInsertData,
					emaFlowCMDSInsertData);

			if (logger.isInfoEnabled()) {

				logger.info( "EMAflow Traveller pack  pro_ema_flwcmds_ins for msisdn" + ">>"
						+ request.getMsisdn() + "Error Code ==>" + domainData.getPo_error_code());
				logger.info( "EMAflow Traveller pack  pro_ema_flwcmds_ins for msisdn" + ">>"
						+ request.getMsisdn() + "Error Msg ==>" + domainData.getPo_error_desc());
			}

			Utilities.commitOrRollback(spfactory1, domainData.getPo_error_code());

			if (emaFlowCMDSInsertData.getPo_error_code() != 0) {

				throw new SMFAgentException(emaFlowCMDSInsertData.getPo_error_code().toString(),
						emaFlowCMDSInsertData.getPo_error_desc());
			} else {
				response = setWebserviceResponse(emaFlowCMDSInsertData, pi_cmd_names, pi_priorities);
			}

		}

		return response;
	}

	private GetTpIdBasedCommandsResponse setWebserviceResponse(GetTpIdBasedCommandsData domainData) {

		GetTpIdBasedCommandsResponse response = new GetTpIdBasedCommandsResponse();
		CommandlistType[] commandlistType = null;
		CommandlistType obj = null;
		GetTpIdBasedCommandsCursorData cur = null;

		if (domainData != null) {

			if (domainData.getPo_command_list() != null && domainData.getPo_command_list().size() > 0) {

				commandlistType = new CommandlistType[domainData.getPo_command_list().size()];

				for (int i = 0; i < domainData.getPo_command_list().size(); i++) {
					cur = domainData.getPo_command_list().get(i);
					obj = new CommandlistType();

					if (cur.getCommand_name() != null) {
						obj.setCommandname(cur.getCommand_name());
					}
					if (cur.getPriority() != null) {
						obj.setPriority(cur.getPriority().toString());
					}
					commandlistType[i] = obj;
				}
			}
			if (commandlistType != null) {
				// response.setCommandlist(commandlistType);
				response.getCommandlist().addAll(Arrays.asList(commandlistType));
			}
		}
		response.setMessage(domainData.getPo_error_desc());

		return response;
	}

	private GetTpIdBasedCommandsResponse setWebserviceResponse(EmaFlowCMDSInsertData domainData, String[] pi_cmd_names,
			Long[] pi_priorities) {

		GetTpIdBasedCommandsResponse response = new GetTpIdBasedCommandsResponse();
		CommandlistType[] commandlistType = null;
		CommandlistType obj = null;

		if (domainData != null) {

			if (pi_cmd_names != null && pi_cmd_names.length > 0) {

				commandlistType = new CommandlistType[pi_cmd_names.length];

				for (int i = 0; i < pi_cmd_names.length; i++) {

					obj = new CommandlistType();

					if (pi_cmd_names[i] != null) {
						obj.setCommandname(pi_cmd_names[i]);
					}
					if (pi_priorities[i] != null) {
						obj.setPriority(pi_priorities[i] + "");
					}
					commandlistType[i] = obj;
				}
			}
			if (commandlistType != null) {
				// response.setCommandlist(commandlistType);
				response.getCommandlist().addAll(Arrays.asList(commandlistType));
			}

		}
		response.setMessage(domainData.getPo_error_desc());
		return response;
	}

	private GetTpIdBasedCommandsData setRequestData(GetTpIdBasedCommandsRequest request, HeaderDetails headerDetails) {

		GetTpIdBasedCommandsData data = new GetTpIdBasedCommandsData();
		if (headerDetails.getNetworkID() != null) {
			data.setPi_network_id(headerDetails.getNetworkID());
		}
		if (request.getMsisdn() != null) {
			data.setPi_msisdn_no(Long.parseLong(request.getMsisdn()));
		}
		if (request.getTariffPackageId() != null) {
			data.setPi_tp_id(Long.parseLong(request.getTariffPackageId()));
		}
		if (request.getNewTariffPackageId() != null) {
			data.setPi_newtp_id(Long.parseLong(request.getNewTariffPackageId()));
		}

		return data;
	}
}
