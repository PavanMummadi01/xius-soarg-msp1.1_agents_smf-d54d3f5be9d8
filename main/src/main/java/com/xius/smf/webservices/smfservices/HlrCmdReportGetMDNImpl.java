package com.xius.smf.webservices.smfservices;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.HlrCmdReportRequest;
import com.xius.billing.AccountManagement_xsd.MDNBasedGetNwIdRequest;
import com.xius.billing.AccountManagement_xsd.MDNBasedGetNwIdResponse;
import com.xius.smf.client.invoker.MDNbasedGetNwIdInvoker;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;


@Service("HlrCmdReportGetMDNImpl")
public class HlrCmdReportGetMDNImpl {

	private  static final Logger logger = LogManager.getLogger(HlrCmdReportGetMDNImpl.class.getSimpleName());


	public MDNBasedGetNwIdResponse getSimDetails(HlrCmdReportRequest smfRequest, HeaderDetails headerDetails)
					throws SMFAgentException {

		MDNBasedGetNwIdRequest ibarequest = new MDNBasedGetNwIdRequest();

		MDNBasedGetNwIdResponse mDNBasedGetNwIdResponse = new MDNBasedGetNwIdResponse();
				
		if (smfRequest.getSIM() != null) {
			ibarequest.setSIM(smfRequest.getSIM());
		}
		MDNbasedGetNwIdInvoker getNwIdInvoker = new MDNbasedGetNwIdInvoker();

		logger.info("HlrCmdReportGetMDNImpl-- invoking the iba MDNbasedGetNwId api for msisdn");

		
			mDNBasedGetNwIdResponse = getNwIdInvoker.MDNbasedGetNwId(headerDetails, ibarequest); // calling IBA Invoker for getting msisdn

			if (mDNBasedGetNwIdResponse != null) {
				smfRequest.setMsisdn(mDNBasedGetNwIdResponse.getMSISDN());
			}

		return mDNBasedGetNwIdResponse;
	}

}
