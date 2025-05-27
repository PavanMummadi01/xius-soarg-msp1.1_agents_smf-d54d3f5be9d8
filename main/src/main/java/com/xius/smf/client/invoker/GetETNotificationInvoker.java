/******************************************************************
 * Company XIUS (Megasoft Pvt Ltd Hyderabad,INDIA)
 * � Copyright 2006 MEGASOFT. 
 *
 * Package      : com.xius.mspgw.client.invoker;
 * Name of File : GetETNotificationInvoker.java
 * Date /Year   : Jun 26, 2018
 * Author       : shashidhar.p
 * Discription  : 
 *
 * Method names : 
 * 
 * Modifications
 * Method Name  |  Date   |  Author  | Explanation
 * -------------------------------------------------------------              
 *              |         |          |
 *              |         |          | 
 *             
 ********************************************************************/
package com.xius.smf.client.invoker;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;


import org.apache.axis.AxisFault;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.billing.SubscriberManagement_wsdl.SubscriberManagementBindingStub;
import com.xius.billing.SubscriberManagement_wsdl.SubscriberServiceLocator;
import com.xius.billing.SubscriberManagement_xsd.GetETNotifInfoRequest;
import com.xius.billing.SubscriberManagement_xsd.GetETNotifInfoResponse;
import com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;

public class GetETNotificationInvoker {
    private static final Logger logger = LogManager.getLogger(GetETNotificationInvoker.class);

	public GetETNotifInfoResponse GetETNotification(HeaderDetails headerDetails,
			GetETNotifInfoRequest Request) throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		String url = InitiateAll.getSMFProps().getProperty("iba.SubscriberManagement");
		if (logger.isInfoEnabled()) {
			logger.info("the url for request" + url);
		}
		GetETNotifInfoResponse response = null;
		SubscriberManagementBindingStub bindingStub = null;
		try {
			bindingStub = new SubscriberManagementBindingStub(new URL(url),new SubscriberServiceLocator());
			SOAPHeaderElement header = Utilities.getSoapHeader(headerDetails);
			bindingStub.setHeader(header);

			bindingStub.setTimeout(Integer.parseInt(InitiateAll.getSMFProps().getProperty("iba.timeout")));

			response = bindingStub.getETNotifInfo(Request);

			if (response != null) {
				if (logger.isInfoEnabled()) {
					logger.info(
							">>>Response from  GetETNotificationInvoker---> GetETNotification api getIsSendNotification : "
									+ response.getIsSendNotification());
					endTime = System.currentTimeMillis();
					logger.info(
							" GetETNotificationInvoker--->Recharge Success:"
									+ (int) (endTime - startTime) + "ms");
				}
			} else {
				logger.error(
						"No response from IBA for GetETNotificationInvoker---> Recharge api..");
				endTime = System.currentTimeMillis();
				logger.info(
						" GetETNotificationInvoker--->GetETNotificationInvoker Failure:"
								+ (int) (endTime - startTime) + "ms");
				throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
			}

		} catch (ErrorDetailsType e) {
			logger.error(
					" GetETNotificationInvoker--->GetETNotification - ErrorDetailsType ErroCode:"
							+ e.getErrorCode());
			logger.error(
					" GetETNotificationInvoker--->GetETNotification - ErrorDetailsType ErrorMessage:"
							+ e.getErrorMessage());
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" GetETNotificationInvoker--->GetETNotification Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(e.getErrorCode(), e.getErrorMessage());
		} catch (AxisFault e) {
			logger.error(
					" GetETNotificationInvoker--->GetETNotification- AxisFault :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" GetETNotificationInvoker--->GetETNotification aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (RemoteException e) {
			logger.error(
					"GetETNotificationInvoker--->GetETNotification - RemoteException:"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" GetETNotificationInvoker--->GetETNotification Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (MalformedURLException e) {
			logger.error(
					" GetETNotificationInvoker--->GetETNotification - MalformedURLException :"
							+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" GetETNotificationInvoker--->GetETNotification Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		}
		return response;
	}
}
