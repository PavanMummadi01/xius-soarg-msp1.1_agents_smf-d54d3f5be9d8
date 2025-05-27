package com.xius.smf.job;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.smf.domaindata.GetSubsFlowTrackerCurData;
import com.xius.smf.domaindata.UpdateSubsFlowTrackerData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.ne.NPRsmsConfirmationHelper;
import com.xius.smf.ne.TempMessageInfo;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;
import com.xius.smf.webservices.smfservices.FiveGDeProvisionImpl;
import com.xius.tia.TTprovisioning_xsd.FiveGDeProvisionRequest;
import com.xius.tia.TTprovisioning_xsd.FiveGDeProvisionResponse;
import com.xius.tia.TTprovisioning_xsd.ProductType;

public class FiveGDeProvisionProcessor implements Runnable {
	
	private	 static final Logger logger = LogManager.getLogger(FiveGDeProvisionProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	UpdateSubsFlowTrackerData updatedata = new UpdateSubsFlowTrackerData();
	GetSubsFlowTrackerCurData data = null;

	public FiveGDeProvisionProcessor(CountDownLatch latch,
			GetSubsFlowTrackerCurData data) {
		this.latch = latch;
		this.data = data;

	}

	@Override
	public void run() {

		if (logger.isInfoEnabled())
			logger.info("FiveGDeProvisionProcessor - run method called");

		BulkSubFlowProcessUpdate finalupdate = new BulkSubFlowProcessUpdate();
		FiveGDeProvisionResponse response = null;
		try {
			if (data != null && data.getRequest_data() != null) {
				FiveGDeProvisionImpl processImpl = new FiveGDeProvisionImpl();

				FiveGDeProvisionRequest request = new FiveGDeProvisionRequest();
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

				HeaderDetails details = new HeaderDetails();
				details.setLoginID("SMFJOB");
				details.setNetworkID(data.getNetwork_id());
				details.setRequestID("123"); // dummy
				details.setPassword("12345678"); // dummy

				if (data.getImsi_no() != null) {
					request.setIMSI(data.getImsi_no() + "");
					request.setAccountType(data.getAccount_type() + "");
					ProductType[] prodList = new ProductType[1];
					prodList[0] = new ProductType("4");

					String propprodList = InitiateAll.getSMFProps()
							.getProperty("provisioning5GProductList");
					request.setProdList(prodList);
					if (propprodList != null) {
						String[] propprodArr = propprodList.split("#");
						ProductType[] tmpprodList = new ProductType[propprodArr.length];
						for (int i = 0; i < propprodArr.length; i++) {
							ProductType productType = new ProductType();
							productType.setProductID(propprodArr[i]);
							tmpprodList[i] = productType;
						}
						request.setProdList(tmpprodList);
					}

					response = processImpl.fiveGDeProvision(request, details);

					if (response != null) {

						if (response.getResponseData() != null) {
							if (response.getResponseData().getReturnCode() != null
									&& response.getResponseData()
											.getReturnCode()
											.equalsIgnoreCase("0")) {
								updatedata.setPi_processing_flag("S");
								updatedata
										.setPi_remarks(SMFAgentConstants.SUCCESS);
							} else {
								updatedata.setPi_processing_flag("F");
								updatedata.setPi_remarks(String
										.valueOf(response.getResponseData()
												.getReturnCode())
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
									.setPi_remarks("TIA FiveGDeProvisionResponse-getResponseData is NULL");
						}
					} else {
						updatedata.setPi_processing_flag("F");
						updatedata
								.setPi_remarks("TIA FiveGDeProvisionResponse is NULL");
					}

				} else {
					updatedata.setPi_network_id(data.getNetwork_id());
					updatedata.setPi_transaction_id(data.getTransaction_id());
					updatedata.setPi_processing_flag("F");
					updatedata.setPi_remarks("NO DATA Found");
				}
				updatedata.setPi_transaction_id(data.getTransaction_id());
				updatedata.setPi_network_id(data.getNetwork_id());

			} else {
				updatedata.setPi_network_id(data.getNetwork_id());
				updatedata.setPi_transaction_id(data.getTransaction_id());
				updatedata.setPi_processing_flag("NA");
			}
		} catch (SMFAgentException _exp) {
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
