package com.xius.smf.webservices.smfservices;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.xius.agent.smf.smfmanagement.InvokeEmaCmdRequest;
import com.xius.agent.smf.smfmanagement.InvokeEmaCmdResponse;
import com.xius.smf.client.invoker.Restinvoker;
import com.xius.smf.domaindata.CancelLocationData;
import com.xius.smf.domaindata.InvokeEmaCmdinsertData;
import com.xius.smf.domaindata.InvokeEmaCmdupdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.ne.NPRsmsConfirmationHelper;
import com.xius.smf.ne.TempMessageInfo;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;


import net.bcgi.util.db.SPFactory;

@Service("invokeEmaCmdimpl")
public class invokeEmaCmdimpl {

	private  static final Logger logger = LogManager.getLogger(invokeEmaCmdimpl.class.getSimpleName());
	String response1 = new String();

	public InvokeEmaCmdResponse invokeEmaCmd(InvokeEmaCmdRequest request, HeaderDetails headerDetails)
			throws SMFAgentException {

		CancelLocationData domaindata = new CancelLocationData();
		InvokeEmaCmdinsertData domaindata1 = new InvokeEmaCmdinsertData();
		InvokeEmaCmdupdateData domaindata2 = new InvokeEmaCmdupdateData();
		Restinvoker invoker = new Restinvoker();
		InvokeEmaCmdResponse response = new InvokeEmaCmdResponse();

		domaindata = setRequestData(request, headerDetails);
		SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("get_upload_kidetails", domaindata, domaindata);
		Utilities.commitOrRollback(spfactory, domaindata.getPo_error_code());
		if (logger.isInfoEnabled()) {
			logger.info( "Error Code from  get_upload_kidetails  ==>" + domaindata.getPo_error_code());
			logger.info("Error Msg from  get_upload_kidetails  ==>" + domaindata.getPo_error_desc());
		}
		if (domaindata.getPo_error_code() != 0) {
			throw new SMFAgentException(domaindata.getPo_error_code().toString(), domaindata.getPo_error_desc());
		} else {
			domaindata1 = setRequestDatainsert(request, headerDetails);
			SPFactory spfactory1 = ServiceUtils.executeSPWithOutCommit("pro_ttsa_ema_cmd_insert", domaindata1,
					domaindata1);
			Utilities.commitOrRollback(spfactory1, domaindata1.getPo_error_code());
			if (logger.isInfoEnabled()) {
				logger.info(
						"Error Code from  pro_ttsa_ema_cmd_insert  ==>" + domaindata1.getPo_error_code());
				logger.info(
						"Error Msg from  pro_ttsa_ema_cmd_insert  ==>" + domaindata1.getPo_error_msg());
			}
			if (domaindata1.getPo_error_code() != 0) {
				throw new SMFAgentException(domaindata1.getPo_error_code().toString(), domaindata1.getPo_error_desc());
			} else {
				logger.info( "Invoking rest invoker  ==>");
				String cmdValue = domaindata1.getPo_cmd();

				String cc = InitiateAll.getSMFProps().getProperty("EMACMD_COUNTRY_CODE");
				String mdn = request.getMSISDN() != null ? request.getMSISDN()
						: String.valueOf(domaindata.getPo_msisdn());
				String nmdn = request.getNEWMSISDN() != null ? request.getNEWMSISDN() : "";

				if (cc != null) {
					mdn = cc + mdn;
					nmdn = cc + nmdn;
				}

				cmdValue = cmdValue.replace("$TRANSID", String.valueOf(domaindata1.getPo_transaction_id()))
						// .replace("$IMSI",
						// String.valueOf(domaindata.getPo_imsi()))
						.replace("$IMSI",
								request.getIMSI() != null ? request.getIMSI() : String.valueOf(domaindata.getPo_imsi()))
						.replace("$NIMSI", request.getNEWIMSI() != null ? request.getNEWIMSI() : "")
						.replace("$NMSISDN", nmdn).replace("$CARDTYPE", String.valueOf(domaindata.getPo_car_type()))
						.replace("$ALG", String.valueOf(domaindata.getPo_alg()))
						.replace("$KI", String.valueOf(domaindata.getPo_ki_value()))
						.replace("$EMA_PROFILE", String.valueOf(domaindata.getPo_ema_profile())).replace("$MSISDN", mdn)
						.replace("$USERTYPE", String.valueOf(domaindata.getPo_usertype()))
						.replace("$3GIND", String.valueOf(domaindata.getPo_three_gind()));
				String cmd = cmdValue;
				System.out.println("updated command  ==>" + cmd);
				logger.info( "updated command  ==>" + cmd);
				response1 = invoker.getinvokeEmaCmdDetails(cmd);
				logger.info( "restinvoker response --->" + response1);
				if (response1 != null) {
					domaindata2 = setRequestDataupdate(response1, domaindata1, headerDetails, cmd);
					SPFactory spfactory2 = ServiceUtils.executeSPWithOutCommit("proc_ttsa_ema_cmd_req_update",
							domaindata2, domaindata2);
					Utilities.commitOrRollback(spfactory2, domaindata2.getPo_error_code());
					if (logger.isInfoEnabled()) {
						logger.info(
								"Error Code from  proc_ttsa_ema_cmd_req_update   ==>" + domaindata2.getPo_error_code());
						logger.info(
								"Error Msg from  proc_ttsa_ema_cmd_req_update   ==>" + domaindata2.getPo_error_msg());
					}
					if (domaindata2.getPo_error_code() != 0) {
						throw new SMFAgentException(domaindata2.getPo_error_code().toString(),
								domaindata2.getPo_error_desc());
					} else {
						if (domaindata2.getPi_status().equalsIgnoreCase("S")) {
							response.setTransID(domaindata1.getPo_transaction_id());
							response.setResponseCode("0");
							response.setResponseDescription("Success");
						} else {
							response.setTransID(domaindata1.getPo_transaction_id());
							response.setResponseCode("1");
							response.setResponseDescription("Failure");
						}
					}
				} else {
					if (headerDetails.getNetworkID() != null) {
						domaindata2.setPi_network_id(headerDetails.getNetworkID());
					}
					if (domaindata1.getPo_transaction_id() != null) {
						domaindata2.setPi_transaction_id(domaindata1.getPo_transaction_id());
					}
					if (cmd != null) {
						domaindata2.setPi_cmd(cmd);
					}
					if (request.getUserDefined1() != null) {
						domaindata2.setPi_status("N");
					} else {
						domaindata2.setPi_status("F");
					}
					domaindata2.setPi_remarks("TTSA Received Response is Null");
					SPFactory spfactory2 = ServiceUtils.executeSPWithOutCommit("proc_ttsa_ema_cmd_req_update",
							domaindata2, domaindata2);
					Utilities.commitOrRollback(spfactory2, domaindata2.getPo_error_code());
					if (logger.isInfoEnabled()) {
						logger.info(
								"Error Code from  proc_ttsa_ema_cmd_req_update   ==>" + domaindata2.getPo_error_code());
						logger.info(
								"Error Msg from  proc_ttsa_ema_cmd_req_update   ==>" + domaindata2.getPo_error_msg());
					}

					response.setTransID(domaindata1.getPo_transaction_id());
					response.setResponseCode("1");
					response.setResponseDescription("Failure");

					notifyEmail(domaindata1, headerDetails);
//					throw Utilities.setSMFAgentException(86958L,
//							"TTSA Received Response is Null");
				}
			}
		}
		return response;
	}

	private InvokeEmaCmdupdateData setRequestDataupdate(String response1, InvokeEmaCmdinsertData domaindata1,
			HeaderDetails headerDetails, String cmd) {

		ArrayList<String> idList = new ArrayList<String>();
		ArrayList<String> msgList = new ArrayList<String>();
		ArrayList<String> cmdResponseTimeList = new ArrayList<String>();

		InvokeEmaCmdupdateData data = new InvokeEmaCmdupdateData();
		String jsonString = response1.toString();
		Gson gson = new Gson();
		JsonObject jsonObject = gson.fromJson(jsonString, JsonObject.class);
		String responseCode = jsonObject.get("responseCode").getAsString();
		String responseStatus = jsonObject.get("responseMessage").getAsString();
		System.out.println("restinvoker responseCode" + responseCode);
		logger.info( "restinvoker responseCode" + responseCode);

		try {

			// Access the ttsaCMDResponse object
			JsonObject ttsaCMDResponse = jsonObject.getAsJsonObject("ttsaCMDResponse");

			// Access ttsaSquenceID and ttsaResponseMsg arrays
			String[] ttsaSquenceID = gson.fromJson(ttsaCMDResponse.get("ttsaSquenceID"), String[].class);
			String[] ttsaResponseMsg = gson.fromJson(ttsaCMDResponse.get("ttsaResponseMsg"), String[].class);
			String[] cmdResponseTime = gson.fromJson(ttsaCMDResponse.get("cmdResponseTime"), String[].class);

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
			logger.debug( "Exception while reading response obj ttsaCMDResponse in resp>>" + jsonString);
		}

		if (headerDetails.getNetworkID() != null) {
			data.setPi_network_id(headerDetails.getNetworkID());
		}
		if (domaindata1.getPo_transaction_id() != null) {
			data.setPi_transaction_id(domaindata1.getPo_transaction_id());
		}
		if (cmd != null) {
			data.setPi_cmd(cmd);
		}
		data.setPi_max_retry_count(new Long(InitiateAll.getSMFProps().getProperty("ema_cmd_maxretry_count")));
		if (responseCode != null && responseCode.equalsIgnoreCase("0") && responseStatus != null) {
			data.setPi_status("S");
			data.setPi_remarks(responseStatus);
			data.setPi_error_code(responseCode);
			if (msgList != null && msgList.size() > 0) {
				System.out.println("msgList.get(0s)" + msgList.get(0));
				data.setPi_error_msg(msgList.get(0));
			} else {
				data.setPi_error_msg(responseStatus);
			}

			if (cmdResponseTimeList != null && cmdResponseTimeList.size() > 0) {
				data.setPi_cmd_resp_time(cmdResponseTimeList.get(0));
			} else {
				data.setPi_cmd_resp_time("");
			}
		} else {
			data.setPi_status("F");
			data.setPi_remarks(responseStatus);
			data.setPi_error_code(responseCode);
			if (msgList != null && msgList.size() > 0) {
				data.setPi_error_msg(msgList.get(0));
			} else {
				data.setPi_error_msg(responseStatus);
			}

			if (cmdResponseTimeList != null && cmdResponseTimeList.size() > 0) {
				data.setPi_cmd_resp_time(cmdResponseTimeList.get(0));
			} else {
				data.setPi_cmd_resp_time("");
			}
		}

		// invoking NE for failed records

		try {
			logger.info("  emacmdimpl setting NE request for event code data.getPi_status()>>." + data.getPi_status());
			if (data != null && data.getPi_status().equalsIgnoreCase("F")) {
				String notifyflag = InitiateAll.getSMFProps().getProperty("EMA_CMD_FAILED_EVENT_ID");
				String emailFrom = InitiateAll.getSMFProps().getProperty("EMA_CMD_FAILED_EMAILID_FROM");
				String emailTo = InitiateAll.getSMFProps().getProperty("EMA_CMD_FAILED_EMAILID_TO");
				String subject = InitiateAll.getSMFProps().getProperty("EMA_CMD_FAILED_SUBJECT");

				if (notifyflag != null) {
					if (notifyflag.length() > 0) {
						logger.info("  emacmdimpl setting NE request for event code" + notifyflag);

						NPRsmsConfirmationHelper nPRsmsConfirmationHelper = new NPRsmsConfirmationHelper();
						TempMessageInfo smsData = new TempMessageInfo();
						String destMSISDNs = null;
						if (domaindata1.getPi_msisdn() != 0)
							destMSISDNs = domaindata1.getPi_msisdn() + "";

						smsData.setEmailFrom(emailFrom);
						smsData.setEmailTo(emailTo);
						smsData.setSubject(subject);
						smsData.setNetworkId(headerDetails.getNetworkID() + "");
						smsData.setUserDefined5(".");
						smsData.setDestMSISDNs(destMSISDNs);
						smsData.setUserDefined1(domaindata1.getPi_external_trans_id());
						smsData.setUserDefined2(domaindata1.getPo_transaction_id());
						smsData.setUserDefined3(domaindata1.getPi_command_name());
						if (data != null) {
							smsData.setUserDefined4(data.getPi_error_msg());
							smsData.setUserDefined5(data.getPi_error_code());
						}

						smsData.setEventReferenceCode(notifyflag);
						nPRsmsConfirmationHelper.sendMsgToSubscriber(smsData);
					}
				}
			}
		} catch (Exception e) {
			logger.error( "Exception while Sending Notification external_trans_id>>"
					+ domaindata1.getPi_external_trans_id() + " transaction_id>>" + domaindata1.getPo_transaction_id());
		}

		return data;
	}

	private void notifyEmail(InvokeEmaCmdinsertData domaindata1, HeaderDetails headerDetails) {

		try {

			String notifyflag = InitiateAll.getSMFProps().getProperty("EMA_CMD_FAILED_EVENT_ID");
			String emailFrom = InitiateAll.getSMFProps().getProperty("EMA_CMD_FAILED_EMAILID_FROM");
			String emailTo = InitiateAll.getSMFProps().getProperty("EMA_CMD_FAILED_EMAILID_TO");
			String subject = InitiateAll.getSMFProps().getProperty("EMA_CMD_FAILED_SUBJECT");

			if (notifyflag != null) {
				if (notifyflag.length() > 0) {
					logger.info("  emacmdimpl setting NE request for event code" + notifyflag);

					NPRsmsConfirmationHelper nPRsmsConfirmationHelper = new NPRsmsConfirmationHelper();
					TempMessageInfo smsData = new TempMessageInfo();
					String destMSISDNs = null;
					if (domaindata1.getPi_msisdn() != 0)
						destMSISDNs = domaindata1.getPi_msisdn() + "";

					smsData.setEmailFrom(emailFrom);
					smsData.setEmailTo(emailTo);
					smsData.setSubject(subject);
					smsData.setNetworkId(headerDetails.getNetworkID() + "");
					smsData.setUserDefined5(".");
					smsData.setDestMSISDNs(destMSISDNs);
					smsData.setUserDefined1(domaindata1.getPi_external_trans_id());
					smsData.setUserDefined2(domaindata1.getPo_transaction_id());
					if (domaindata1.getPi_command_name() != null && domaindata1.getPi_command_name().length() > 94)
						smsData.setUserDefined3(domaindata1.getPi_command_name().substring(0, 95) + "...");
					else
						smsData.setUserDefined3(domaindata1.getPi_command_name());
					smsData.setEventReferenceCode(notifyflag);
					nPRsmsConfirmationHelper.sendMsgToSubscriber(smsData);
				}
			}

		} catch (Exception e) {
			logger.error( "Exception while Sending Notification external_trans_id>>"
					+ domaindata1.getPi_external_trans_id() + " transaction_id>>" + domaindata1.getPo_transaction_id());
		}
	}

	private InvokeEmaCmdinsertData setRequestDatainsert(InvokeEmaCmdRequest request, HeaderDetails headerDetails) {

		InvokeEmaCmdinsertData data = new InvokeEmaCmdinsertData();

		if (headerDetails.getNetworkID() != null) {
			data.setPi_network_id(headerDetails.getNetworkID());
		}
		if (headerDetails.getLoginID() != null) {
			data.setPi_login_id(headerDetails.getLoginID());
		}
		if (request.getMSISDN() != null) {
			data.setPi_msisdn(new Long(request.getMSISDN()));
		}
		if (request.getCommand() != null) {
			data.setPi_command_name(request.getCommand());
		}
		data.setPi_status("T");
		if (request.getNEWIMSI() != null) {
			data.setPi_new_imsi(request.getNEWIMSI());
		}
		if (request.getNEWMSISDN() != null) {
			data.setPi_new_msisdn(new Long(request.getNEWMSISDN()));
		}
		if (request.getIMSI() != null) {
			data.setPi_imsi(request.getIMSI());
		}
		if (request.getUserDefined1() != null) {
			data.setPi_external_trans_id(request.getUserDefined1());
		}
		if (request.getUserDefined2() != null) {
			data.setPi_reason(request.getUserDefined2());
		}
		return data;
	}

	private CancelLocationData setRequestData(InvokeEmaCmdRequest request, HeaderDetails headerDetails) {

		CancelLocationData data = new CancelLocationData();
		if (headerDetails.getNetworkID() != null) {
			data.setPi_network_id(headerDetails.getNetworkID());
		}

		String prop = InitiateAll.getSMFProps().getProperty("TTSA_CHANGE_MDN_CMD");
		int flg = 0;
		if (prop != null) {
			String propArr[] = prop.split(",");
			for (int i = 0; i < propArr.length; i++) {
				if (propArr[i].equalsIgnoreCase(request.getCommand())) {
					flg = 1;
				}
			}
		}
		if (flg == 1) {
			if (request.getNEWMSISDN() != null) {
				data.setPi_msisdn_no(new Long(request.getNEWMSISDN()));
			} else if (request.getMSISDN() != null) {
				data.setPi_msisdn_no(new Long(request.getMSISDN()));
			}
		} else if (request.getMSISDN() != null) {
			data.setPi_msisdn_no(new Long(request.getMSISDN()));
		}

		return data;
	}
}