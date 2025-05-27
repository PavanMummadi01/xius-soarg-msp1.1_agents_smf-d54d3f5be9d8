package com.xius.smf.client.invoker;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;



import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.xius.smf.domaindata.CancelLocationData;
import com.xius.smf.domaindata.CancelLocationDatainsert;
import com.xius.smf.exception.SMFAgentException;
import com.xius.smf.utils.InitiateAll;

public class Restinvoker {

    private static final Logger logger = LogManager.getLogger(Restinvoker.class);

	String URL = InitiateAll.getSMFProps().getProperty("TTSA_REST_URL");
	String timeOut = InitiateAll.getSMFProps().getProperty("TTSA_REST_URL_TIMEOUT");
	String readtimeOut = InitiateAll.getSMFProps().getProperty("TTSA_REST_URL_READTIMEOUT");

	public String getCancelLocationDetails(String msisdn, CancelLocationData domaindata,
			CancelLocationDatainsert domaindata1) {
		String response = new String();
		try {
			logger.info( "Invoking rest invoker  for getCancelLocationDetails==>");
			logger.info( "URL --------->" + URL);
			// Replace this URL with the correct endpoint URL
			URL url = new URL(URL);
			// Open a connection to the URL
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			// Set request method to POST
			connection.setRequestMethod("POST");

			// Set content-type property
			connection.setRequestProperty("Content-Type", "application/json");

			// Enable output and write the request body
			connection.setDoOutput(true);

			if (timeOut != null && timeOut.length() > 0) {
				connection.setConnectTimeout(Integer.parseInt(timeOut));

			}
			if (readtimeOut != null && readtimeOut.length() > 0) {
				connection.setReadTimeout(Integer.parseInt(readtimeOut));

			}

			DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());
			// String msisdn="60173800166";
			// String cmdValue =
			// "SET:MVNOSUB:TRANSID,$TRANSID:IMSI,$IMSI:MSISDN,$MSISDN:USERTYPE,$USERTYPE:3GIND,$3GIND:APRODLIST,DEF,TT0400;";
			// SET:MVNOSUB:TRANSID,$TRANSID:IMSI,$IMSI:MSISDN,$MSISDN:USERTYPE,$USERTYPE:3GIND,$3GIND:APRODLIST,DEF,$EMAID;

			String cc = InitiateAll.getSMFProps().getProperty("EMACMD_COUNTRY_CODE");
			String mdn = String.valueOf(domaindata.getPo_msisdn());

			if (cc != null) {
				mdn = cc + mdn;
			}
			String cmdValue = domaindata1.getPo_cmd();
			cmdValue = cmdValue.replace("$TRANSID", String.valueOf(domaindata1.getPo_transaction_id()))
					.replace("$IMSI", String.valueOf(domaindata.getPo_imsi())).replace("$MSISDN", mdn)
					.replace("$USERTYPE", String.valueOf(domaindata.getPo_usertype()))
					.replace("$3GIND", String.valueOf(domaindata.getPo_three_gind()));
			logger.info( "Invoking cmd for getCancelLocationDetails as ==>" + cmdValue);

			String cmd = cmdValue;
			String requestBody = "{\"ttsacmd\": [{\"cmd\": \"" + cmd + "\", \"squenceID\": \"1\"}]}";

			outputStream.writeBytes(requestBody);
			outputStream.flush();

			// Read the response from the server
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String line;

			while ((line = reader.readLine()) != null) {
				response = line;

			}
			reader.close();

			// Print the response
			System.out.println("Response from server:");
			System.out.println(response.toString());

			// Close the connection
			connection.disconnect();

		} catch (Exception e) {
			e.printStackTrace();
			response = null;
		}
		return response;
	}

	public String getinvokeEmaCmdDetails(String cmd) {
		String response = new String();
		try {
			logger.info( "Invoking rest invoker  for getinvokeEmaCmdDetails==>");
			logger.info( "URL --------->" + URL);
			// Replace this URL with the correct endpoint URL
			URL url = new URL(URL);
			// Open a connection to the URL
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			// Set request method to POST
			connection.setRequestMethod("POST");

			// Set content-type property
			connection.setRequestProperty("Content-Type", "application/json");

			// Enable output and write the request body
			connection.setDoOutput(true);

			if (timeOut != null && timeOut.length() > 0) {
				connection.setConnectTimeout(Integer.parseInt(timeOut));
			}
			if (readtimeOut != null && readtimeOut.length() > 0) {
				connection.setReadTimeout(Integer.parseInt(readtimeOut));

			}

			DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());

			// String msisdn="60173800166";
			// String cmdValue =
			// "SET:MVNOSUB:TRANSID,$TRANSID:IMSI,$IMSI:MSISDN,$MSISDN:USERTYPE,$USERTYPE:3GIND,$3GIND:APRODLIST,DEF,TT0400;";
			// SET:MVNOSUB:TRANSID,$TRANSID:IMSI,$IMSI:MSISDN,$MSISDN:USERTYPE,$USERTYPE:3GIND,$3GIND:APRODLIST,DEF,$EMAID;
			String requestBody = "{\"ttsacmd\": [{\"cmd\": \"" + cmd + "\", \"squenceID\": \"1\"}]}";
			outputStream.writeBytes(requestBody);
			outputStream.flush();

			// Read the response from the server
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String line;

			while ((line = reader.readLine()) != null) {
				response = line;
				logger.info( "line --------->Response from serverwhil:" + response);

			}
			reader.close();

			// Print the response
			logger.info( "line --------->Response from server:" + response);
			// System.out.println(response.toString());
			outputStream.close();
			// Close the connection
			connection.disconnect();

		} catch (Exception e) {
			e.printStackTrace();
			response = null;
		} finally {
			logger.info( "line --------->Response from serverGGG:" + response);
		}
		return response;
	}

	public String[] getinvokeEmaCmdPriorityDetails(String[] cmd, String[] priority, String ipsending)
			throws SMFAgentException {
		String[] response = new String[2];
		try {

			String URL = InitiateAll.getSMFProps().getProperty("TTSA_REST_URL");
			// Replace this URL with the correct endpoint URL
			if (ipsending != null) {
				URL = InitiateAll.getSMFProps().getProperty("TTSA_REST_URL" + "_" + ipsending);
			}
			logger.debug( "calling invoker URL" + URL);

			URL url = new URL(URL);
			// Open a connection to the URL
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			// Set request method to POST
			connection.setRequestMethod("POST");

			// Set content-type property
			connection.setRequestProperty("Content-Type", "application/json");

			// Enable output and write the request body
			logger.debug( "before pushing");

			if (timeOut != null && timeOut.length() > 0) {
				connection.setConnectTimeout(Integer.parseInt(timeOut));
			}
			if (readtimeOut != null && readtimeOut.length() > 0) {
				connection.setReadTimeout(Integer.parseInt(readtimeOut));

			}

			connection.setDoOutput(true);
			DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());

			JSONArray jsonArray = new JSONArray();

			for (int i = 0; i < cmd.length; i++) {

				JSONObject jsonObject = new JSONObject();
				jsonObject.put("cmd", cmd[i]);
				jsonObject.put("squenceID", priority[i]);

				jsonArray.put(jsonObject);
			}

			JSONObject requestBody = new JSONObject();
			requestBody.put("ttsacmd", jsonArray);

			logger.debug( "requestBody.toString()>>>" + requestBody.toString());

			outputStream.writeBytes(requestBody.toString());
			outputStream.flush();

			// Read the response from the server
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String line;

			while ((line = reader.readLine()) != null) {
				response[0] = line;
				logger.debug( "line>>>" + line);
			}
			reader.close();

			// Print the response
			logger.debug( "Response from server:");
			logger.debug( response[0].toString());
			logger.debug( response[0]);

			if (response != null) {
				JSONObject jsonObject = new JSONObject(response[0]);
				if (jsonObject != null) {
					try {
						String failedSeqId = (String) jsonObject.get("ttsaFailedSquenceID");
						if (failedSeqId != null) {
							response[1] = failedSeqId;
						}
					} catch (Exception e) {
						logger.debug(
								"Exception while reading response obj ttsaFailedSquenceID in resp>>" + response[0]);
					}
				}
			}
			// Close the connection
			connection.disconnect();

		} catch (Exception e) {
			e.printStackTrace();
			response = null;
		}
		return response;
	}

	public ArrayList getinvokeEmaCmdPriorityDet(String[] cmd, String[] priority) throws SMFAgentException {
		ArrayList<ArrayList<?>> arrayResp = new ArrayList();
		ArrayList<String[]> resp = new ArrayList<String[]>();
		ArrayList<String> idList = new ArrayList<String>();
		ArrayList<String> msgList = new ArrayList<String>();
		String[] response = new String[2];
		try {
			logger.debug( "calling invoker");
			// Replace this URL with the correct endpoint URL
			URL url = new URL(URL);
			// Open a connection to the URL
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			// Set request method to POST
			connection.setRequestMethod("POST");

			// Set content-type property
			connection.setRequestProperty("Content-Type", "application/json");

			// Enable output and write the request body
			logger.debug("before pushing");

			if (timeOut != null && timeOut.length() > 0) {
				connection.setConnectTimeout(Integer.parseInt(timeOut));
			}
			if (readtimeOut != null && readtimeOut.length() > 0) {
				connection.setReadTimeout(Integer.parseInt(readtimeOut));

			}

			connection.setDoOutput(true);
			DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());

			JSONArray jsonArray = new JSONArray();

			for (int i = 0; i < cmd.length; i++) {

				JSONObject jsonObject = new JSONObject();
				jsonObject.put("cmd", cmd[i]);
				jsonObject.put("squenceID", priority[i]);

				jsonArray.put(jsonObject);
			}

			JSONObject requestBody = new JSONObject();
			requestBody.put("ttsacmd", jsonArray);

			logger.debug( "requestBody.toString()>>>" + requestBody.toString());

			outputStream.writeBytes(requestBody.toString());
			outputStream.flush();

			// Read the response from the server
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String line;

			while ((line = reader.readLine()) != null) {
				response[0] = line;
				logger.debug( "line>>>" + line);
			}
			reader.close();

			// Print the response
			logger.debug( "Response from server:");
			logger.debug( response[0].toString());
			logger.debug( response[0]);

			if (response != null) {
				JSONObject jsonObject = new JSONObject(response[0]);
				if (jsonObject != null) {
					try {
						String failedSeqId = (String) jsonObject.get("ttsaFailedSquenceID");
						if (failedSeqId != null) {
							response[1] = failedSeqId;
						}
					} catch (Exception e) {
						logger.debug(
								"Exception while reading response obj ttsaFailedSquenceID in resp>>" + response[0]);
					}

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

						// Print values
						System.out.println("ttsaSquenceID:");
						for (String id : ttsaSquenceID) {
							System.out.println(id);
							idList.add(id);
						}

						System.out.println("\nttsaResponseMsg:");
						for (String msg : ttsaResponseMsg) {
							System.out.println(msg);
							msgList.add(msg);
						}
					} catch (Exception e) {
						logger.debug(
								"Exception while reading response obj ttsaCMDResponse in resp>>" + response[0]);
					}
				}
			}
			// Close the connection
			connection.disconnect();

		} catch (Exception e) {
			e.printStackTrace();
			response = null;
		}
		resp.add(response);

		arrayResp.add(resp);
		arrayResp.add(idList);
		arrayResp.add(msgList);

		return arrayResp;
	}
}
