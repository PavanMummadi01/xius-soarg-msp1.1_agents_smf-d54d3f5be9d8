package com.xius.smf.webservices.smfservices;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.xius.agent.smf.smfmanagement.CancelLocationRequest;
import com.xius.agent.smf.smfmanagement.CancelLocationResponse;
import com.xius.smf.client.invoker.Restinvoker;
import com.xius.smf.domaindata.CancelLocationData;
import com.xius.smf.domaindata.CancelLocationDatainsert;
import com.xius.smf.domaindata.CancelLocationDataupdate;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

import net.bcgi.util.db.SPFactory;

@Service("CancelLocationimpl")
public class CancelLocationimpl {

	private  static final Logger logger = LogManager.getLogger(CancelLocationimpl.class.getSimpleName());
	String response1 = null;
	CancelLocationResponse response = new CancelLocationResponse();

	public CancelLocationResponse CancelLocation(CancelLocationRequest request, HeaderDetails headerDetails)
			throws SMFAgentException {

		// CancelLocationResponse response=new CancelLocationResponse();
		CancelLocationData domaindata = new CancelLocationData();
		CancelLocationDatainsert domaindata1 = new CancelLocationDatainsert();
		CancelLocationDataupdate domaindata2 = new CancelLocationDataupdate();
		Restinvoker invoker = new Restinvoker();

		domaindata = setRequestData(request, headerDetails);
		SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("get_upload_kidetails", domaindata, domaindata);
		Utilities.commitOrRollback(spfactory, domaindata.getPo_error_code());
		if (logger.isInfoEnabled()) {
			logger.info( "Error Code from  get_upload_kidetails  ==>" + domaindata.getPo_error_code());
			logger.info( "Error Msg from  get_upload_kidetails  ==>" + domaindata.getPo_error_desc());
		}
		if (domaindata.getPo_error_code() != 0) {
			throw new SMFAgentException(domaindata.getPo_error_code().toString(), domaindata.getPo_error_desc());
		} else {
			domaindata1 = setRequestDatainsert(request, headerDetails);
			SPFactory spfactory1 = ServiceUtils.executeSPWithOutCommit("pro_ttsa_cancel_loc_insert", domaindata1,
					domaindata1);
			Utilities.commitOrRollback(spfactory1, domaindata1.getPo_error_code());
			if (logger.isInfoEnabled()) {
				logger.info(
						"Error Code from  pro_ttsa_cancel_loc_insert  ==>" + domaindata1.getPo_error_code());
				logger.info(
						"Error Msg from  pro_ttsa_cancel_loc_insert  ==>" + domaindata1.getPo_error_msg());
			}
			if (domaindata1.getPo_error_code() != 0) {
				throw new SMFAgentException(domaindata1.getPo_error_code().toString(), domaindata1.getPo_error_desc());
			} else {
				logger.info( "Invoking rest invoker  ==>");

				response1 = invoker.getCancelLocationDetails(request.getMSISDN(), domaindata, domaindata1);
				System.out.println("restinvoker response --->" + response1);
				logger.info("restinvoker response --->" + response1);
				if (response1 != null) {
					domaindata2 = setRequestDataupdate(response1, domaindata1, headerDetails);
					SPFactory spfactory2 = ServiceUtils.executeSPWithOutCommit("proc_ttsa_cancel_loc_update",
							domaindata2, domaindata2);
					Utilities.commitOrRollback(spfactory2, domaindata2.getPo_error_code());
					if (logger.isInfoEnabled()) {
						logger.info(
								"Error Code from  proc_ttsa_cancel_loc_update  ==>" + domaindata2.getPo_error_code());
						logger.info(
								"Error Msg from  proc_ttsa_cancel_loc_update  ==>" + domaindata2.getPo_error_msg());
					}
					if (domaindata2.getPo_error_code() != 0) {
						throw new SMFAgentException(domaindata2.getPo_error_code().toString(),
								domaindata2.getPo_error_desc());
					} else {
						if (domaindata2.getPi_status().equalsIgnoreCase("S")) {
							response.setResponseCode("0");
							response.setResponseDescription("Success");
						} else {
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
					domaindata2.setPi_status("F");
					domaindata2.setPi_remarks("TTSA Received Response is Null");
					SPFactory spfactory2 = ServiceUtils.executeSPWithOutCommit("proc_ttsa_cancel_loc_update",
							domaindata2, domaindata2);
					Utilities.commitOrRollback(spfactory2, domaindata2.getPo_error_code());
					if (logger.isInfoEnabled()) {
						logger.info(
								"Error Code from  proc_ttsa_cancel_loc_update   ==>" + domaindata2.getPo_error_code());
						logger.info(
								"Error Msg from  proc_ttsa_cancel_loc_update   ==>" + domaindata2.getPo_error_msg());
					}
					throw new SMFAgentException("86958", "TTSA Received Response is Null");
				}
			}
		}
		return response;
	}

	private CancelLocationDataupdate setRequestDataupdate(String response1, CancelLocationDatainsert domaindata1,
			HeaderDetails headerDetails) {

		CancelLocationDataupdate data = new CancelLocationDataupdate();
		String jsonString = response1.toString();
		Gson gson = new Gson();
		JsonObject jsonObject = gson.fromJson(jsonString, JsonObject.class);
		String responseCode = jsonObject.get("responseCode").getAsString();
		String responseStatus = jsonObject.get("responseMessage").getAsString();
		System.out.println("restinvoker responseCode" + responseCode);
		logger.info( "restinvoker responseCode" + responseCode);
		if (headerDetails.getNetworkID() != null) {
			data.setPi_network_id(headerDetails.getNetworkID());
		}
		if (domaindata1.getPo_transaction_id() != null) {
			data.setPi_transaction_id(domaindata1.getPo_transaction_id());
		}
		if (responseCode != null && responseCode.equalsIgnoreCase("0") && responseStatus != null) {
			data.setPi_status("S");
			data.setPi_remarks(responseStatus);
		} else {
			data.setPi_status("F");
			data.setPi_remarks(responseStatus);
		}
		return data;
	}

	private CancelLocationDatainsert setRequestDatainsert(CancelLocationRequest request, HeaderDetails headerDetails) {

		CancelLocationDatainsert data = new CancelLocationDatainsert();
		if (headerDetails.getNetworkID() != null) {
			data.setPi_network_id(headerDetails.getNetworkID());
		}
		if (headerDetails.getLoginID() != null) {
			data.setPi_login_id(headerDetails.getLoginID());
		}
		if (request.getMSISDN() != null) {
			data.setPi_msisdn(new Long(request.getMSISDN()));
		}
		return data;
	}

	private CancelLocationData setRequestData(CancelLocationRequest request, HeaderDetails headerDetails) {

		CancelLocationData data = new CancelLocationData();
		if (headerDetails.getNetworkID() != null) {
			data.setPi_network_id(headerDetails.getNetworkID());
		}
		if (request.getMSISDN() != null) {
			data.setPi_msisdn_no(new Long(request.getMSISDN()));
		}

		data.setPi_status_check("AC");

		return data;
	}
}