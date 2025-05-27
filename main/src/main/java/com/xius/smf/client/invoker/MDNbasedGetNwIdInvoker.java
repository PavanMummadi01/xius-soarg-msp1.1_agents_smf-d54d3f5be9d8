package com.xius.smf.client.invoker;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;



import org.apache.axis.AxisFault;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.billing.AccountManagement_wsdl.AccountManagementBindingStub;
import com.xius.billing.AccountManagement_wsdl.AccountServiceLocator;
import com.xius.billing.AccountManagement_xsd.MDNBasedGetNwIdRequest;
import com.xius.billing.AccountManagement_xsd.MDNBasedGetNwIdResponse;
import com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;

public class MDNbasedGetNwIdInvoker {
    private static final Logger logger = LogManager.getLogger(MDNbasedGetNwIdInvoker.class);

	MDNBasedGetNwIdResponse response = null;

public MDNBasedGetNwIdResponse MDNbasedGetNwId(
	HeaderDetails headerDetails, MDNBasedGetNwIdRequest dataRequest)
	throws SMFAgentException {
long startTime = System.currentTimeMillis();
long endTime = 0;

String url = InitiateAll.getSMFProps().getProperty("iba.AccountManagement");
if (logger.isInfoEnabled()) {
	logger.info("****  The url for request  ****   :  " + url);
}

AccountManagementBindingStub bindingStub = null;
try {
	bindingStub = new AccountManagementBindingStub(new URL(url),
			new AccountServiceLocator());
	SOAPHeaderElement header = Utilities.getSoapHeader(headerDetails);
	bindingStub.setHeader(header);

	bindingStub.setTimeout(Integer.parseInt(InitiateAll.getSMFProps()
			.getProperty("iba.timeout")));
	response=new MDNBasedGetNwIdResponse();

	response = bindingStub.MDNbasedGetNwId(dataRequest);

	if (response != null) {
		if (logger.isInfoEnabled()) {

			logger.info(
					">>>Response from  MDNbasedGetNwIdInvoker--->  MDNbasedGetNwId Response: "
							+ response.getNetworkId());
			logger.info(
					">>>Response from  MDNbasedGetNwIdInvoker--->  MDNbasedGetNwId Response: "
							+ response.getAccountId());
			logger.info(
					">>>Response from  MDNbasedGetNwIdInvoker--->  MDNbasedGetNwId Response: "
							+ response.getIdValue());
			logger.info(
					">>>Response from  MDNbasedGetNwIdInvoker--->  MDNbasedGetNwId Response: "
							+ response.getIMSI());
			logger.info(
					">>>Response from  MDNbasedGetNwIdInvoker--->  MDNbasedGetNwId Response: "
							+ response.getMSISDN());
			logger.info(
					">>>Response from  MDNbasedGetNwIdInvoker--->  MDNbasedGetNwId Response: "
							+ response.getNetworkName());
			logger.info(
					">>>Response from  MDNbasedGetNwIdInvoker--->  MDNbasedGetNwId Response: "
							+ response.getSIM());
			endTime = System.currentTimeMillis();
			logger.info(
					" MDNbasedGetNwIdInvoker--->Subscriber MDNbasedGetNwId Success:"
							+ (int) (endTime - startTime) + "ms");
		}

	} else {
		logger.error(
				
				"No response from IBA for MDNbasedGetNwIdInvoker---> MDNbasedGetNwId api..");
		endTime = System.currentTimeMillis();
		logger.info(
				" MDNbasedGetNwIdInvoker--->MDNbasedGetNwId Failure:"
						+ (int) (endTime - startTime) + "ms");
		throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
	}

} catch (ErrorDetailsType e) {
	logger.error(
			" MDNbasedGetNwIdInvoker--->MDNbasedGetNwId - ErrorDetailsType ErroCode:"
					+ e.getErrorCode());
	logger.error(
			
			"MDNbasedGetNwIdInvoker--->MDNbasedGetNwId - ErrorDetailsType ErrorMessage:"
					+ e.getErrorMessage());
	endTime = System.currentTimeMillis();
	if (logger.isInfoEnabled()) {
		logger.info(
				" MDNbasedGetNwId--->MDNbasedGetNwId Failure:"
						+ (int) (endTime - startTime) + "ms");
	}
	throw new  SMFAgentException(e.getErrorCode(), e.getErrorMessage());
} catch (AxisFault e) {
	logger.error(
			" MDNbasedGetNwIdInvoker--->MDNbasedGetNwId - AxisFault :"
					+ Utilities.getStackTrace(e));
	endTime = System.currentTimeMillis();
	if (logger.isInfoEnabled()) {
		logger.info(
				" MDNbasedGetNwIdInvoker--->MDNbasedGetNwId Filure:"
						+ (int) (endTime - startTime) + "ms");
	}
	throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
} catch (RemoteException e) {
	logger.error(
			" MDNbasedGetNwIdInvoker--->MDNbasedGetNwId - RemoteException:"
					+ Utilities.getStackTrace(e));
	endTime = System.currentTimeMillis();
	if (logger.isInfoEnabled()) {
		logger.info(
				" MDNbasedGetNwIdInvoker--->MDNbasedGetNwId Failure:"
						+ (int) (endTime - startTime) + "ms");
	}
	throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
} catch (MalformedURLException e) {
	logger.error(
			" MDNbasedGetNwIdInvoker--->MDNbasedGetNwId - MalformedURLException :"
					+ Utilities.getStackTrace(e));
	endTime = System.currentTimeMillis();
	if (logger.isInfoEnabled()) {
		logger.info(
				" MDNbasedGetNwIdInvoker--->MDNbasedGetNwId Failure:"
						+ (int) (endTime - startTime) + "ms");
	}
	throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
}

return response;
}

}
