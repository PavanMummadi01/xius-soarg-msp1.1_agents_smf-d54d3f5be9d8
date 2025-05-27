package com.xius.smf.job;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.smf.domaindata.Get5gProvData;
import com.xius.smf.domaindata.GetSubsFlowTrackerCurData;
import com.xius.smf.domaindata.UpdateSubsFlowTrackerData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
import com.xius.smf.webservices.smfservices.VolteProcessImpl;
import com.xius.tia.TTprovisioning_xsd.VolteProvisionRequest;
import com.xius.tia.TTprovisioning_xsd.VolteProvisionResponse;

public class FourGProvisionProcessor implements Runnable {
	
	private	 static final Logger logger = LogManager.getLogger(FourGProvisionProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	UpdateSubsFlowTrackerData updatedata = new UpdateSubsFlowTrackerData();
	GetSubsFlowTrackerCurData data = null;
	int CheckFlag = 0;
	public FourGProvisionProcessor(CountDownLatch latch,
			GetSubsFlowTrackerCurData data, int CheckFlag) {
		this.latch = latch;
		this.data = data;
		this.CheckFlag = CheckFlag;
	}

	@Override
	public void run() {

		if (logger.isInfoEnabled())
			logger.info("FourGProvisionProcessor - run method called");

		BulkSubFlowProcessUpdate finalupdate = new BulkSubFlowProcessUpdate();
		VolteProvisionResponse response = null;
		try {
			if (data != null && data.getRequest_data() != null) {
				VolteProcessImpl processImpl = new VolteProcessImpl();

				VolteProvisionRequest request = new VolteProvisionRequest();
				String msisdnNonCC = null;
				if (data != null) {
					if (data.getRequest_data() != null) {
						String splitArr[] = data.getRequest_data().split("~");
						if (splitArr.length >= 1) {

							request.setMSISDN(splitArr[0]);

						}

					}
					if (data.getOrg_request_data() != null) {
						String splitArr[] = data.getOrg_request_data().split(
								"~");

						if (splitArr.length >= 1) {
							msisdnNonCC = splitArr[0];

						}

					}

				} else {
					logger.debug(">>>>>  CursorDtlsData is Null ...");
				}

				int checkResult = 0;
				if (CheckFlag == 1) {

					Get5gProvData get5gProvData = new Get5gProvData();

					get5gProvData.setPi_msisdn(Long.parseLong(msisdnNonCC));
					get5gProvData.setPi_network_id(data.getNetwork_id());

					ServiceUtils._executeStoredProcedure(
							"pro_get_5gprov_details", get5gProvData,
							get5gProvData);

					if (get5gProvData != null) {
						if ((get5gProvData.getPo_atpid_5gprov() != null && get5gProvData
								.getPo_atpid_5gprov().equalsIgnoreCase("Y"))) {
							checkResult = 1;
						} else if ((get5gProvData.getPo_nw_id_5gprov() != null && get5gProvData
								.getPo_nw_id_5gprov().equalsIgnoreCase("Y"))) {
							checkResult = 1;
						} else if ((get5gProvData.getPo_tariffid_5gprov() != null && get5gProvData
								.getPo_tariffid_5gprov().equalsIgnoreCase("Y"))) {
							checkResult = 1;
						}
					}

				}
				if (CheckFlag == 1 && checkResult == 0) {

					updatedata.setPi_network_id(data.getNetwork_id());
					updatedata.setPi_transaction_id(data.getTransaction_id());
					updatedata.setPi_processing_flag("NR");
					updatedata.setPi_remarks("4G not Required");
				}   
				
				 
				else {
				HeaderDetails details = new HeaderDetails();
				details.setLoginID("SMFJOB");
				details.setNetworkID(data.getNetwork_id());
				details.setRequestID("123"); // dummy
				details.setPassword("12345678"); // dummy

				request.setChannelId("SMFJOB");
				request.setServiceType(data.getAccount_type()+"");
				request.setTransID(data.getTransaction_id());
				response = processImpl.provision(request, details);

				if (response != null) {

					if (response.getResponseData() != null) {
						if (response.getResponseData().getReturnCode() != null
								&& response.getResponseData().getReturnCode()
										.equalsIgnoreCase("0")) {
							updatedata.setPi_processing_flag("S");
							updatedata.setPi_remarks(SMFAgentConstants.SUCCESS);
						} else {
							updatedata.setPi_processing_flag("F");
							updatedata.setPi_remarks(String.valueOf(response
									.getResponseData().getReturnCode())
									+ "#"
									+ response.getResponseData()
											.getResponsecode()
									+ "::"
									+ response.getResponseData()
											.getRespdescription());
						}
					} else {
						updatedata.setPi_processing_flag("F");
						updatedata
								.setPi_remarks("TIA FourGProvisionResponse-getResponseData is NULL");
					}
				} else {
					updatedata.setPi_processing_flag("F");
					updatedata
							.setPi_remarks("TIA FourGProvisionResponse is NULL");
				}

			} 
			}else {
				updatedata.setPi_network_id(data.getNetwork_id());
				updatedata.setPi_transaction_id(data.getTransaction_id());
				updatedata.setPi_processing_flag("F");
				updatedata.setPi_remarks("NO DATA Found");
			}
			updatedata.setPi_transaction_id(data.getTransaction_id());
			updatedata.setPi_network_id(data.getNetwork_id());

		} catch (com.xius.smf.exceptions.SMFAgentException _exp) {
			logger.debug(":::got failed from  tia:::");
			updatedata.setPi_network_id(data.getNetwork_id());
			updatedata.setPi_transaction_id(data.getTransaction_id());
			updatedata.setPi_processing_flag("F");
			updatedata.setPi_remarks(_exp.getErrorCode() + "#"
					+ _exp.getErrorMessage());

		} catch (Exception _exp) {
			logger.error(Utilities.getStackTrace(_exp));

		} finally {
			try {
				finalupdate.statusUpdate(updatedata);
				response = null;
			} catch (Exception e) {
				e.printStackTrace();
			}
			latch.countDown();
		}

	}
}
