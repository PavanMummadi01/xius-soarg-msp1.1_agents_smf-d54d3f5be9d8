package com.xius.smf.client.invoker;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;



import org.apache.axis.AxisFault;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.billing.SubscriberManagement_wsdl.SubscriberManagementBindingStub;
import com.xius.billing.SubscriberManagement_wsdl.SubscriberServiceLocator;
import com.xius.billing.SubscriberManagement_xsd.FluValidationRequest;
import com.xius.billing.SubscriberManagement_xsd.FluValidationResponse;
import com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;

public class FluValidationInvoker {
	

    private static final Logger logger = LogManager.getLogger(FluValidationInvoker.class);
	
	public FluValidationResponse fluValidation(
			FluValidationRequest request,HeaderDetails headerDetails) throws SMFAgentException, ServiceException {
		
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		String url = InitiateAll.getSMFProps().getProperty("iba.SubscriberManagement");
		if (logger.isInfoEnabled()) {
			logger.info("the url for request" + url);
		}
		FluValidationResponse response = null;
		SubscriberManagementBindingStub bindingStub = null;
		try {
			bindingStub = new SubscriberManagementBindingStub(new URL(url),new SubscriberServiceLocator());
			SOAPHeaderElement header = Utilities.getSoapHeader(headerDetails);
			bindingStub.setHeader(header);

			bindingStub.setTimeout(Integer.parseInt(InitiateAll.getSMFProps().getProperty("iba.timeout")));

			response = bindingStub.fluValidation(request);

			if (response != null) {
				if (logger.isInfoEnabled()) {
					logger.info(
							">>>Response from  FluValidationInvoker---> fluValidation api getMessage : "
									+ response.getMessage());
					endTime = System.currentTimeMillis();
					logger.info(
							" FluValidationInvoker--->fluValidation Success:"
									+ (int) (endTime - startTime) + "ms");
				}
			} else {
				logger.error(
						"No response from IBA for FluValidationInvoker---> fluValidation api..");
				endTime = System.currentTimeMillis();
				logger.info(
						" FluValidationInvoker--->fluValidation API Failure:"
								+ (int) (endTime - startTime) + "ms");
				throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
			}

		} catch (ErrorDetailsType e) {
			logger.error(
					" FluValidationInvoker--->fluValidation - ErrorDetailsType ErroCode:"
							+ e.getErrorCode());
			logger.error(
					" FluValidationInvoker--->fluValidation - ErrorDetailsType ErrorMessage:"
							+ e.getErrorMessage());
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" FluValidationInvoker--->fluValidation Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(e.getErrorCode(), e.getErrorMessage());
		} catch (AxisFault e) {
			logger.error(
					" FluValidationInvoker--->fluValidation- AxisFault :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" FluValidationInvoker--->fluValidation aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (RemoteException e) {
			logger.error(
					"FluValidationInvoker--->fluValidation - RemoteException:"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" FluValidationInvoker--->FluValidation Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (MalformedURLException e) {
			logger.error(
					" FluValidationInvoker--->fluValidation - MalformedURLException :"
							+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" FluValidationInvoker--->fluValidation Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		}
		return response;
	}
}