package com.xius.smf.webservices.smfservices;

import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.smf.client.invoker.CAServiceInvoker;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.xbus.messages.selfcare.communityaccountservice.ManageCommActATPRequest;
import com.xius.xbus.messages.selfcare.communityaccountservice.ManageCommActATPResponse;

public class CAServiceImpl {

	private  static final Logger logger = LogManager.getLogger(CAServiceImpl.class.getSimpleName());

	public ManageCommActATPResponse manageCaATP(
			ManageCommActATPRequest request, HeaderDetails headerDetails)
			throws SMFAgentException, SOAPException, ServiceException {

		logger.info(
				"CAServiceImpl---> manageCaATP Method called ...");

		ManageCommActATPResponse response = null;

		CAServiceInvoker invoker = new CAServiceInvoker();
		response = invoker.manageCaATP(request, headerDetails);
		if (response != null && response.getStatusCode() != null) {
			logger.info(
					"CAServiceImpl---> manageCaATP response - StatusCode is ..."
							+ response.getStatusCode());
		}
		return response;

	}
}
