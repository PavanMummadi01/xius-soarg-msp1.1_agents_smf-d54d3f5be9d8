package com.xius.smf.job;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.bcgi.util.db.SPFactory;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.xius.smf.client.invoker.Restinvoker;
import com.xius.smf.domaindata.CancelLocationData;
import com.xius.smf.domaindata.EmaCMDCursorData;
import com.xius.smf.domaindata.InvokeEmaCmdupdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.ne.NPRsmsConfirmationHelper;
import com.xius.smf.ne.TempMessageInfo;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

/******************************************************************
 * Company XIUS (Megasoft Pvt Ltd Hyderabad,INDIA) � Copyright 2006 MEGASOFT.
 * 
 * Package : com.xius.smf.job; Name of File : EmaCMDRetryProcessor.java Date
 * /Year : Apr 24, 2024 Author : vekatesh chintalapudi Discription : Based on
 * the cursor data of EmaCMD, This data is sent to restinvoker and the response
 * from based on restinvoker response data updated and stored in DB.
 * 
 * 
 * Method names :
 * 
 * Modifications Method Name | Date | Author | Explanation
 * ------------------------------------------------------------- | | | | | |
 * 
 ********************************************************************/

public class EmaCMDRetryProcessor implements Runnable {
	private	 static final Logger logger = LogManager.getLogger(EmaCMDRetryProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	EmaCMDCursorData cursordata = null;

	public EmaCMDRetryProcessor(CountDownLatch latch, EmaCMDCursorData cursordata) {
		this.latch = latch;
		this.cursordata = cursordata;

	}

	public void run() {
		String cmd = cursordata.getCommand();
		String response1 = new String();
		int getflag = 0;
		InvokeEmaCmdupdateData domaindata2 = new InvokeEmaCmdupdateData();
		SPFactory spfactory2 = null;
		try {

			CancelLocationData domaindata = new CancelLocationData();

			domaindata.setPi_network_id(cursordata.getNetwork_id());
			domaindata.setPi_msisdn_no(new Long(cursordata.getMsisdn_no()));

			if (cmd != null && cmd.contains("$")) {
				SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("get_upload_kidetails", domaindata,
						domaindata);
				Utilities.commitOrRollback(spfactory, domaindata.getPo_error_code());

				logger.info("domaindata.getPo_usertype()) ==>" + domaindata.getPo_usertype());

				logger.info( "domaindata.getPo_usertype()) ==>" + domaindata.getPo_three_gind());

				logger.info( "domaindata.getPo_usertype()) ==>" + domaindata.getPo_ema_profile());

				if (logger.isInfoEnabled()) {
					logger.info( "EmaCMDRetryProcessor Error Code from  get_upload_kidetails  ==>"
							+ domaindata.getPo_error_code());
					logger.info( "EmaCMDRetryProcessor Error Msg from  get_upload_kidetails  ==>"
							+ domaindata.getPo_error_desc());
				}
				if (domaindata.getPo_error_code() != null && domaindata.getPo_error_code() != 0) {
					getflag = 1;
				} else {
					String cc = InitiateAll.getSMFProps().getProperty("EMACMD_COUNTRY_CODE");
					String mdn = cursordata.getMsisdn_no() + "";
					String cmdValue = cursordata.getCommand();
					String nmdn = "";

					if (cc != null) {
						mdn = cc + mdn;
						nmdn = cc + nmdn;
					}

					cmdValue = cmdValue.replace("$IMSI", String.valueOf(domaindata.getPo_imsi()))
							.replace("$TRANSID", cursordata.getTransaction_id())
							.replace("$CARDTYPE", String.valueOf(domaindata.getPo_car_type()))
							.replace("$ALG", String.valueOf(domaindata.getPo_alg()))
							.replace("$KI", String.valueOf(domaindata.getPo_ki_value()))
							.replace("$EMA_PROFILE", String.valueOf(domaindata.getPo_ema_profile()))
							.replace("$MSISDN", mdn).replace("$USERTYPE", String.valueOf(domaindata.getPo_usertype()))
							.replace("$3GIND", String.valueOf(domaindata.getPo_three_gind()));
					cmd = cmdValue;
					logger.info("EmaCMDRetryProcessor updated command  ==>" + cmd);
				}

			}
			if (getflag == 0) {
				logger.info( "restinvoker request --->" + cmd);
				Restinvoker invoker = new Restinvoker();
				response1 = invoker.getinvokeEmaCmdDetails(cmd);
				logger.info( "restinvoker response --->" + response1);
			} else {
				domaindata2.setPi_error_msg("DATA NOT FOUND");
			}

		} catch (Exception e) {

			String errormsg = InitiateAll.getErrorProps().getProperty(SMFAgentConstants.TIA_ERRCODE);
			String errorcode = SMFAgentConstants.TIA_ERRCODE;

			logger.error("Communication error from Rest invoker:: " + errorcode + ":" + errormsg);

			logger.error("" + Utilities.getStackTrace(e));

		} finally {
			latch.countDown();
			logger.info( "Finallyyyyyyyyyyyyyyyyyyyyy");
			if (response1 != null) {
				domaindata2 = setRequestDataupdate(response1, cursordata, cmd, getflag);
				// SPFactory spfactory2;
				try {
					spfactory2 = ServiceUtils.executeSPWithOutCommit("proc_ttsa_ema_cmd_req_update", domaindata2,
							domaindata2);
				} catch (SMFAgentException e) {
					e.printStackTrace();
				}
				Utilities.commitOrRollback(spfactory2, domaindata2.getPo_error_code());
				if (logger.isInfoEnabled()) {
					logger.info(
							"Error Code from  proc_ttsa_ema_cmd_req_update   ==>" + domaindata2.getPo_error_code());
					logger.info(
							"Error Msg from  proc_ttsa_ema_cmd_req_update   ==>" + domaindata2.getPo_error_msg());
				}

			} else {

				domaindata2.setPi_cmd(cmd);

				if (new Long(cursordata.getNetwork_id()) != null) {
					domaindata2.setPi_network_id(new Long(cursordata.getNetwork_id()));
				}
				if (cursordata.getTransaction_id() != null) {
					domaindata2.setPi_transaction_id(cursordata.getTransaction_id());
				}
				domaindata2.setPi_status("F");
				domaindata2.setPi_remarks("TTSA Received Response is Empty");
				domaindata2.setPi_error_code("");
				domaindata2.setPi_error_msg("");
				notifyEmail(domaindata2);
				try {
					spfactory2 = ServiceUtils.executeSPWithOutCommit("proc_ttsa_ema_cmd_req_update", domaindata2,
							domaindata2);
				} catch (SMFAgentException e) {
					e.printStackTrace();
				}
				Utilities.commitOrRollback(spfactory2, domaindata2.getPo_error_code());
				if (logger.isInfoEnabled()) {
					logger.info(
							"Error Code from  proc_ttsa_ema_cmd_req_update   ==>" + domaindata2.getPo_error_code());
					logger.info(
							"Error Msg from  proc_ttsa_ema_cmd_req_update   ==>" + domaindata2.getPo_error_msg());
				}
				logger.error( "TTSA Received Response is Null   ==>" + domaindata2.getPo_error_msg());
			}

		}
	}

	private InvokeEmaCmdupdateData setRequestDataupdate(String response1, EmaCMDCursorData cursordata, String cmd,
			int getflag) {
		InvokeEmaCmdupdateData data = new InvokeEmaCmdupdateData();

		String responseCode = null;
		String responseStatus = null;

		ArrayList<String> idList = new ArrayList<String>();
		ArrayList<String> msgList = new ArrayList<String>();
		ArrayList<String> cmdResponseTimeList = new ArrayList<String>();

		if (response1 != null && response1.length() > 0) {
			String jsonString = response1.toString();
			Gson gson = new Gson();
			JsonObject jsonObject = gson.fromJson(jsonString, JsonObject.class);
			responseCode = jsonObject.get("responseCode").getAsString();
			responseStatus = jsonObject.get("responseMessage").getAsString();
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
				logger.debug(
						"Exception while reading response obj ttsaCMDResponse in resp>>" + jsonString);
			}

		}

		if (new Long(cursordata.getNetwork_id()) != null) {
			data.setPi_network_id(new Long(cursordata.getNetwork_id()));
		}
		if (cursordata.getTransaction_id() != null) {
			data.setPi_transaction_id(cursordata.getTransaction_id());
		}
		if (cursordata.getCommand() != null) {
			data.setPi_cmd(cursordata.getCommand());
		}
		if (responseCode != null && (responseCode.equalsIgnoreCase("0") || responseCode.equalsIgnoreCase("0;"))
				&& responseStatus != null) {
			data.setPi_status("S");
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

			data.setPi_cmd(cmd);
		} else {
			data.setPi_status("F");
			if (getflag == 1) {
				data.setPi_remarks("NO DATA FOUND");
				data.setPi_error_code("1");
				data.setPi_error_msg("NO DATA FOUND");
				notifyEmail(data);
			} else {
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

			data.setPi_cmd(cmd);
		}
		return data;
	}

	private void notifyEmail(InvokeEmaCmdupdateData updateData) {
		String external_trans_id = null, transaction_id = null, command_name = null;
		String notifyflag = InitiateAll.getSMFProps().getProperty("EMA_CMD_FAILED_EVENT_ID");
		try {
			int cnt = 0;

			if (notifyflag != null && updateData != null && notifyflag.length() > 0) {
				external_trans_id = "";
				transaction_id = "";
				command_name = "";
				if (updateData.getPi_status() != null && updateData.getPi_status().equalsIgnoreCase("F")) {
					cnt++;
					external_trans_id = external_trans_id + "~" + updateData.getPi_transaction_id();
					transaction_id = transaction_id + "~" + updateData.getPi_transaction_id();
					command_name = command_name + "~" + updateData.getPi_cmd();
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
							smsData.setUserDefined4(updateData.getPi_error_msg());
							smsData.setUserDefined5(updateData.getPi_error_code());
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
}
