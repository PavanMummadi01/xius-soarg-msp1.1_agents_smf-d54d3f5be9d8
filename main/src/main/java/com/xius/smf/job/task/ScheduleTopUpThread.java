package com.xius.smf.job.task;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.bcgi.util.db.SPFactory;

import com.xius.smf.domaindata.TopUpCursorData;
import com.xius.smf.domaindata.TopUpData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class ScheduleTopUpThread implements Runnable {
	static Logger logger = LogManager.getLogger("ScheduleTopUpThread");

	private TopUpCursorData cursorData;
	private CountDownLatch latch;

	BufferedOutputStream outputStream = null;
	BufferedInputStream inputStream = null;
	HttpURLConnection urlConnection = null;
	String invocationResponse = null;

	public ScheduleTopUpThread(TopUpCursorData cursorData) {
		this.cursorData = cursorData;
	}

	public ScheduleTopUpThread(TopUpCursorData cursorData, CountDownLatch latch) {
		this.cursorData = cursorData;
		this.latch = latch;
	}

	public void run() {
		try {
			processTopUpRecords(cursorData);
		} catch (Exception e) {
			logger.error("Error in ScheduleTopUpThread run():"
					+ Utilities.getStackTrace(e));
			e.printStackTrace();
		} finally {
			latch.countDown();
		}
	}

	/**
	 * 
	 * @param data
	 */

	private void processTopUpRecords(TopUpCursorData data) {

		String url = null;
		String[] outputmsg = null;
		String eventtype = null;

		String source = "BULK_CHNG_MSISDN";
		if (source.equals(data.getSourceType())) {
			try {
				if (data.getSourceType() != null) {
					url = InitiateAll.getSMFProps().getProperty(
							data.getSourceType() + "_URL");
					eventtype = data.getSourceType();
				}

				String uname = InitiateAll.getSMFProps().getProperty(
						SMFAgentConstants.TOPUP_NOTIF_JOB_USERNAME);
				String pwd = InitiateAll.getSMFProps().getProperty(
						SMFAgentConstants.TOPUP_NOTIF_JOB_PASSWORD);
				url = formatURL(url, uname, pwd, data);
				inputStream = urlconnection(url, data, uname, pwd);
				invocationResponse = readLines(inputStream);
				logger.info(
						"*** *** ***ScheduleTopUpThread: Event Type received:"
								+ eventtype);
				if (invocationResponse != null
						&& invocationResponse.trim().length() > 0) {
					logger.info(
							"*** *** ***ScheduleTopUpThread: invocationResponse from TuneTalk:"
									+ invocationResponse);
					outputmsg = formatReponse(invocationResponse);
					callDBToUpdateScheduleTopUp(data.getNetwork_id(), data
							.getTransaction_id(), outputmsg[2] + ":"
							+ outputmsg[3], outputmsg[1]);
				} else {
					logger
							.info(
									"*** *** ***ScheduleTopUpThread: invocationResponse is NULL from TuneTalk:");
					callDBToUpdateScheduleTopUp(data.getNetwork_id(), data
							.getTransaction_id(),
							"Response is NULL from Third Party", "FAIL");
				}

			} catch (Exception e) {

				logger
						.error("Error in ScheduleTopUpThread processTopUpRecords():"
								+ Utilities.getStackTrace(e));
				callDBToUpdateScheduleTopUp(data.getNetwork_id(), data
						.getTransaction_id(), e.getLocalizedMessage(), "FAIL");

			} finally {
				try {
					if (outputStream != null) {
						outputStream.close();
					}
					if (inputStream != null) {
						inputStream.close();
					}
					if (urlConnection != null) {
						urlConnection.disconnect();
					}
				} catch (Exception e) {
					logger
							.error("Error in ScheduleTopUpThread processTopUpRecords():in closing Streams:"
									+ Utilities.getStackTrace(e));
				}

			}
		} else {
			CallFirstUrl(data);
		}

	}

	/**
	 * 
	 * @param inStream
	 * @return
	 * @throws Exception
	 */

	public static String readLines(InputStream inStream) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(inStream));
		String resultString = null;
		StringBuffer strBuffer = new StringBuffer("");
		String strLine = null;
		while ((strLine = in.readLine()) != null) {
			strBuffer.append(strLine);
		}
		if (null != strBuffer && strBuffer.length() > 0) {
			resultString = strBuffer.toString();
		} else {
			resultString = null;
		}
		return resultString;
	}

	/**
	 * Update for processed record
	 * 
	 * @param networkid
	 * @param transaction_id
	 * @param remarks
	 * @param status
	 */

	public void callDBToUpdateScheduleTopUp(Long networkid,
			String transaction_id, String remarks, String status) {
		TopUpData domainData = new TopUpData();
		domainData.setPi_network_id(networkid);
		domainData.setTransaction_Id(transaction_id);
		domainData.setStatus(status);
		domainData.setRemarks(remarks);
		domainData.setPi_app_id(InitiateAll.getSMFProps().getProperty(
				SMFAgentConstants.APP_ID_PROP));
		try {
			SPFactory factory = ServiceUtils.executeSPWithOutCommit(
					"pro_topup_trans_status_update", domainData, domainData);
			Utilities.commitOrRollback(factory, domainData.getPo_error_code());

			if (logger.isInfoEnabled()) {
				logger.info(
						"ScheduleTopUpThread:Error Code in pro_topup_trans_status_update==>"
								+ domainData.getPo_error_code());
			}
		} catch (SMFAgentException e) {
			logger.error(
					"ScheduleTopUpThread:Exception in pro_topup_trans_status_update \n"
							+ Utilities.getStackTrace(e));
		}
	}

	/**
	 * 
	 * @param url
	 * @param uname
	 * @param pwd
	 * @param data
	 * @return
	 */

	public String formatURL(String url, String uname, String pwd,
			TopUpCursorData data) {
		url = url.replace("$UNAME", uname);
		url = url.replace("$PWD", pwd);
		url = url.replace("$TRANS_ID", data.getTransaction_id());
		if (data.getMsisdn_no() != null) {
			url = url.replace("$MSISDN", data.getMsisdn_no().toString());
		}
		url = url.replace("$SIM", data.getSim());
		if (data.getOld_msisdn_no() != null) {
			url = url.replace("$OLDMSISDN", data.getOld_msisdn_no().toString());
		}
		if (data.getImsi() != null) {
			url = url.replace("$IMSI", data.getImsi().toString());
		}
		url = url.replace("$TOPUP_TIME", data.getDateTime());
		if (data.getTopupamnt() != null) {
			url = url.replace("$TOPUP_AMOUNT", data.getTopupamnt().toString());
		}
		if (data.getPrevBalance() != null) {
			url = url.replace("$OLDBAL", data.getPrevBalance().toString());
		}
		if (data.getCurrBalance() != null) {
			url = url.replace("$CURBAL", data.getCurrBalance().toString());
		}
		if (data.getVoucherSerial() != null) {
			url = url.replace("$SERIALNO", data.getVoucherSerial().toString());
		}
		if (data.getUserId() != null) {
			url = url.replace("$USERID", data.getUserId().toString());
		}
		if (data.getUserId() == null) {
			url = url.replace("$USERID", "");
		}

		return url;
	}

	/**
	 * 
	 * @param str
	 * @return
	 */

	public String[] formatReponse(String str) {
		String[] output = new String[4];
		if (str.indexOf("<action>") > 0 && str.indexOf("</action>") > 0) {
			output[0] = str.substring((str.indexOf("<action>") + 8), str
					.indexOf("</action>"));
		} else {
			output[0] = null;
		}
		if (str.indexOf("<status>") > 0 && str.indexOf("</status>") > 0) {
			output[1] = (str.substring((str.indexOf("<status>") + 8), str
					.indexOf("</status>")).toUpperCase());
		} else {
			output[1] = "FAIL";
		}
		if (str.indexOf("<code>") > 0 && str.indexOf("</code>") > 0) {
			output[2] = str.substring((str.indexOf("<code>") + 6), str
					.indexOf("</code>"));
		} else {
			output[2] = "40000";
		}
		if (str.indexOf("<description>") > 0
				&& str.indexOf("</description>") > 0) {
			output[3] = str.substring((str.indexOf("<description>") + 13), str
					.indexOf("</description>"));
		} else {
			output[3] = "No Message from Third Party";
		}
		return output;
	}

	/**
	 * @param str
	 */

	private void CallFirstUrl(TopUpCursorData data) {
		String url = null;
		String[] outputmsg = null;
		String eventtype = null;

		String output = null;
		String outputs = null;
		try {
			if (data.getSourceType() != null) {
				url = InitiateAll.getSMFProps().getProperty(
						data.getSourceType() + "_URL");
				logger.info(
						"*** *** ******************************:"
								+ data.getSourceType());
				eventtype = data.getSourceType();
			}
			String uname = InitiateAll.getSMFProps().getProperty(
					SMFAgentConstants.TOPUP_NOTIF_JOB_USERNAME);
			String pwd = InitiateAll.getSMFProps().getProperty(
					SMFAgentConstants.TOPUP_NOTIF_JOB_PASSWORD);
			url = formatURL(url, uname, pwd, data);

			inputStream = urlconnection(url, data, uname, pwd);

			invocationResponse = readLines(inputStream);
			if (invocationResponse != null
					&& invocationResponse.trim().length() > 0) {
				logger.info(
						"*** *** ***ScheduleTopUpThread: invocationResponse from TuneTalk For URL1:"
								+ invocationResponse);
				outputmsg = formatReponse(invocationResponse);
				output = outputmsg[2] + ":" + outputmsg[3];
				outputs = outputmsg[1];
				logger.info(
						"*** *** ***ScheduleTopUpThread: calling second Url:");
				CallSecondUrl(data, outputs, output);

			} else {
				logger
						.info(
								
								"*** *** ***ScheduleTopUpThread: invocationResponse is NULL from TuneTalk For URL1:");
				outputs = "FAIL";
				output = "Response is NULL from Third Party For URL1";
				logger.info(
						"*** *** ***ScheduleTopUpThread: calling second Url:");
				CallSecondUrl(data, outputs, output);

			}
		} catch (Exception e) {
			logger.info(
					"************ScheduleTopUpThread:in catch block url1");
			logger.error("Error in ScheduleTopUpThread processTopUpRecords():"
					+ Utilities.getStackTrace(e));
			output = e.getLocalizedMessage();
			outputs = "FAIL";
			logger.info(
					"*** *** ***ScheduleTopUpThread: calling second Url:");
			CallSecondUrl(data, outputs, output);

		} finally {
			try {
				if (outputStream != null) {
					outputStream.close();
				}
				if (inputStream != null) {
					inputStream.close();
				}
				if (urlConnection != null) {
					urlConnection.disconnect();
				}
			} catch (Exception e) {
				logger
						.error("Error in ScheduleTopUpThread processTopUpRecords():in closing Streams:"
								+ Utilities.getStackTrace(e));
			}
		}

	}

	/**
	 * @param str
	 */

	private void CallSecondUrl(TopUpCursorData data, String str, String strn) {

		String url = null;
		String[] outputmsgs = null;
		String eventtype = null;
		try {
			if (data.getSourceType() != null) {
				url = InitiateAll.getSMFProps().getProperty(
						data.getSourceType() + "_URL2");
				logger.info(
						"*** *** ****************************** For URL2::"
								+ url);
				eventtype = data.getSourceType();
			}
			String uname = InitiateAll.getSMFProps().getProperty(
					SMFAgentConstants.TOPUP_NOTIF_JOB_TTSA_USERNAME);
			String pwd = InitiateAll.getSMFProps().getProperty(
					SMFAgentConstants.TOPUP_NOTIF_JOB_TTSA_PASSWORD);
			url = formatSecondURL(url, uname, pwd, data);
			inputStream = urlconnection(url, data, uname, pwd);
			invocationResponse = readLines(inputStream);
			if (invocationResponse != null
					&& invocationResponse.trim().length() > 0) {
				logger
						.info(
								
								"*** *** ***ScheduleTopUpThread: invocationResponse from TuneTalk FOR Seconsd URL2:"
										+ invocationResponse);
				outputmsgs = formatReponse(invocationResponse);
				logger.info("process status  from URL1:" + str
						+ "      AND remarks from URL1:" + strn);
				logger.info( "process status  from URL2:"
						+ outputmsgs[1] + "   AND remarks from URL2::"
						+ outputmsgs[2] + ":" + outputmsgs[3]);
				callDBToUpdateScheduleTopUp(data.getNetwork_id(), data
						.getTransaction_id(), strn + "#" + outputmsgs[2] + ":"
						+ outputmsgs[3], str + "#" + outputmsgs[1]);
			} else {
				logger
						.info(
								
								"*** *** ***ScheduleTopUpThread: invocationResponse is NULL from TuneTalk  For URL2:");
				logger.info("process status  from URL1:" + str
						+ "      AND remarks from URL1:" + strn);
				callDBToUpdateScheduleTopUp(data.getNetwork_id(), data
						.getTransaction_id(), strn
						+ "Response is NULL from Third Party For URL2 ", str
						+ "#" + "FAIL");
			}
		} catch (Exception e) {
			logger.info(
					"************ScheduleTopUpThread:in catch block url2");
			logger.info("process status  from URL1:" + str
					+ "      AND remarks from URL1:" + strn);
			logger.error("Error in ScheduleTopUpThread processTopUpRecords():"
					+ Utilities.getStackTrace(e));
			callDBToUpdateScheduleTopUp(data.getNetwork_id(), data
					.getTransaction_id(), strn + "#" + e.getLocalizedMessage(),
					str + "#" + "FAIL");
		}

	}

	public BufferedInputStream urlconnection(String url, TopUpCursorData data,
			String uname, String pwd) throws IOException {
		BufferedOutputStream outputStream = null;
		BufferedInputStream inputStream = null;
		HttpURLConnection urlConnection = null;
		URL execURL = null;
		int timeout = 0;

		logger.info(
				"*** *** ***ScheduleTopUpThread: URL to be sent:" + url);
		execURL = new URL(url);

		urlConnection = (HttpURLConnection) execURL.openConnection();
		System.out.println("*** *** *** urlConnection" + urlConnection);

		urlConnection.setConnectTimeout(timeout);
		urlConnection.setReadTimeout(timeout);
		urlConnection.setDoOutput(true);

		if (urlConnection.getDoInput()) {
			outputStream = new BufferedOutputStream(urlConnection
					.getOutputStream());
			outputStream.write(url.getBytes());
			outputStream.flush();
			if (urlConnection.getDoOutput()) {
				inputStream = new BufferedInputStream(urlConnection
						.getInputStream());

			}
		}

		return inputStream;
	}

	public String formatSecondURL(String url, String uname, String pwd,
			TopUpCursorData data) {
		url = url.replace("user", uname);
		url = url.replace("pwd", pwd);
		url = url.replace("$TRANS_ID", data.getTransaction_id());
		if (data.getMsisdn_no() != null) {
			url = url.replace("$MSISDN", data.getMsisdn_no().toString());
		}
		url = url.replace("$SIM", data.getSim());
		if (data.getOld_msisdn_no() != null) {
			url = url.replace("$OLDMSISDN", data.getOld_msisdn_no().toString());
		}
		if (data.getImsi() != null) {
			url = url.replace("$IMSI", data.getImsi().toString());
		}
		url = url.replace("$TOPUP_TIME", data.getDateTime());
		if (data.getTopupamnt() != null) {
			url = url.replace("$TOPUP_AMOUNT", data.getTopupamnt().toString());
		}
		if (data.getPrevBalance() != null) {
			url = url.replace("$OLDBAL", data.getPrevBalance().toString());
		}
		if (data.getCurrBalance() != null) {
			url = url.replace("$CURBAL", data.getCurrBalance().toString());
		}
		if (data.getVoucherSerial() != null) {
			url = url.replace("$SERIALNO", data.getVoucherSerial().toString());
		}
		if (data.getUserId() != null) {

			url = url.replace("$USERID", data.getUserId().toString());

		}
		if (data.getUserId() == null) {
			url = url.replace("$USERID", "");
		}

		return url;
	}

}
