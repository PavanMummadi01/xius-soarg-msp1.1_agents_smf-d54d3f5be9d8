package com.xius.smf.client.invoker;

/******************************************************************
 * Company XIUS (Megasoft Pvt Ltd Hyderabad,INDIA)
 * � Copyright 2006 MEGASOFT. 
 *
 * Package      : com.xius.smf.client.invoker;
 * Name of File : GetSubscriberInfoInvoker.java
 * Date /Year   : Aug 1st, 2021
 * Author       : shashidhar.p
 * Discription  : To get the AccountId we are invoking this class
 *
 * Method names : getSubscriberInfoInvoker
 * 
 * Modifications
 * Method Name  |  Date   |  Author  | Explanation
 * -------------------------------------------------------------              
 *              |         |          |
 *              |         |          | 
 *             
 ********************************************************************/

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;



import org.apache.axis.AxisFault;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.billing.SubscriberManagement_wsdl.SubscriberManagementBindingStub;
import com.xius.billing.SubscriberManagement_wsdl.SubscriberServiceLocator;
import com.xius.billing.SubscriberManagement_xsd.GetSubscriberInfoRequest;
import com.xius.billing.SubscriberManagement_xsd.GetSubscriberInfoResponse;
import com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;

public class GetSubscriberInfoInvoker {
    private static final Logger logger = LogManager.getLogger(GetSubscriberInfoInvoker.class);


	public GetSubscriberInfoResponse getSubscriberInfoInvoker(
			HeaderDetails headerDetails, GetSubscriberInfoRequest ibarequest)
			throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		String url = InitiateAll.getSMFProps().getProperty(
				"iba.SubscriberManagement");
		if (logger.isInfoEnabled())
			logger
					.info( " /*********   the url for request"
							+ url);

		GetSubscriberInfoResponse response = null;
		SubscriberManagementBindingStub bindingStub = null;
		try {
			bindingStub = new SubscriberManagementBindingStub(new URL(url),
					new SubscriberServiceLocator());
			SOAPHeaderElement header = Utilities.getSoapHeader(headerDetails);
			bindingStub.setHeader(header);

			bindingStub.setTimeout(Integer.parseInt(InitiateAll.getSMFProps()
					.getProperty("iba.timeout")));

			response = bindingStub.getSubscriberInfo(ibarequest);

			if (response != null) {
				if (logger.isInfoEnabled()) {
					logger.info(
							">>>Response from  GetSubscriberInfoInvoker--->  AccountId is: "
									+ response.getAccountId());

					endTime = System.currentTimeMillis();
					logger.info(
							" GetSubscriberInfoInvoker--->getSubscriberInfo Success:"
									+ (int) (endTime - startTime) + "ms");
				}
			} else {
				logger
						.error(
								"No response from iba for GetSubscriberInfoInvoker---> getSubscriberInfo api..");
				endTime = System.currentTimeMillis();
				logger.info(
						" GetSubscriberInfoInvoker--->getSubscriberInfo Failure:"
								+ (int) (endTime - startTime) + "ms");
				throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
			}

		} catch (ErrorDetailsType e) {
			logger.error(
					" GetSubscriberInfoInvoker--->getSubscriberInfo - ErrorDetailsType ErroCode:"
							+ e.getErrorCode());
			logger
					.error(
							
							" GetSubscriberInfoInvoker--->getSubscriberInfo - ErrorDetailsType ErrorMessage:"
									+ e.getErrorMessage());
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" GetSubscriberInfoInvoker--->getSubscriberInfo Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
		} catch (AxisFault e) {
			logger.error(
					" GetSubscriberInfoInvoker--->getSubscriberInfo - AxisFault :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" GetSubscriberInfoInvoker--->getSubscriberInfo aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
		} catch (RemoteException e) {
			logger.error(
					" GetSubscriberInfoInvoker--->getSubscriberInfo - RemoteException:"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" GetSubscriberInfoInvoker--->getSubscriberInfo Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
		} catch (MalformedURLException e) {
			logger.error(
					" GetSubscriberInfoInvoker--->getSubscriberInfo - MalformedURLException :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" GetSubscriberInfoInvoker--->getSubscriberInfo Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
		}
		return response;
	}
}