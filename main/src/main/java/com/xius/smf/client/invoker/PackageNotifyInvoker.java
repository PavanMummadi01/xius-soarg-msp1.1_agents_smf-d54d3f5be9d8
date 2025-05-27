/******************************************************************
 * Company XIUS (Megasoft Pvt Ltd Hyderabad,INDIA)
 * � Copyright 2006 MEGASOFT. 
 *
 * Package      : com.xius.mspgw.client.invoker;
 * Name of File : PackageNotifyInvoker.java
 * Date /Year   : Oct 18, 2018
 * Author       : Shashidhar.P
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
import javax.xml.soap.SOAPException;

import org.apache.axis.AxisFault;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;
import com.xius.tia.TIAManagement_wsdl.TIAManagementBindingStub;
import com.xius.tia.TIAManagement_wsdl.TIAManagementLocator;
import com.xius.tia.TIAManagement_xsd.PackageNotifyRequest;
import com.xius.tia.TIAManagement_xsd.PackageNotifyResponse;

public class PackageNotifyInvoker {
    private static final Logger logger = LogManager.getLogger(PackageNotifyInvoker.class);

	public PackageNotifyResponse PackageNotify(HeaderDetails headerDetails,
			PackageNotifyRequest Request) throws SMFAgentException, SOAPException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		String url = InitiateAll.getSMFProps().getProperty("TIA_URL");
		if (logger.isInfoEnabled()) {
			logger.info("the url for request" + url);
		}
		PackageNotifyResponse response = null;
		TIAManagementBindingStub bindingStub = null;
		try {
			bindingStub = new TIAManagementBindingStub(new URL(url),new TIAManagementLocator());
			SOAPHeaderElement header = Utilities.getTIASoapHeader(headerDetails);
			bindingStub.setHeader(header);

			bindingStub.setTimeout(Integer.parseInt(InitiateAll.getSMFProps().getProperty("iba.timeout")));

			response = bindingStub.packageNotify(Request);

			if (response != null) {
				if (logger.isInfoEnabled()) {
					logger.info(
							">>>Response from  PackageNotifyInvoker---> PackageNotify api getReason : "
									+ response.getReason());
					logger.info(
							">>>Response from  PackageNotifyInvoker---> PackageNotify api getResponseCode : "
									+ response.getResponseData().getResponsecode());
					logger.info(
							">>>Response from  PackageNotifyInvoker---> PackageNotify api getResponseDescription : "
									+ response.getResponseData().getRespdescription());
										
					endTime = System.currentTimeMillis();
					logger.info(
							" PackageNotifyInvoker--->Recharge Success:"
									+ (int) (endTime - startTime) + "ms");
				}
			} else {
				logger.error(
						"No response from IBA for PackageNotifyInvoker---> Recharge api..");
				endTime = System.currentTimeMillis();
				logger.info(
						" PackageNotifyInvoker--->PackageNotifyInvoker Failure:"
								+ (int) (endTime - startTime) + "ms");
				throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
			}

		} catch (ErrorDetailsType e) {
			logger.error(
					" PackageNotifyInvoker--->PackageNotify - ErrorDetailsType ErroCode:"
							+ e.getErrorCode());
			logger.error(
					" PackageNotifyInvoker--->PackageNotify - ErrorDetailsType ErrorMessage:"
							+ e.getErrorMessage());
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" PackageNotifyInvoker--->PackageNotify Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(e.getErrorCode(), e.getErrorMessage());
		} catch (AxisFault e) {
			logger.error(
					" PackageNotifyInvoker--->PackageNotify- AxisFault :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" PackageNotifyInvoker--->PackageNotify aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,
					null);
		} catch (RemoteException e) {
			logger.error(
					"PackageNotifyInvoker--->PackageNotify - RemoteException:"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" PackageNotifyInvoker--->PackageNotify Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (MalformedURLException e) {
			logger.error(
					" PackageNotifyInvoker--->PackageNotify - MalformedURLException :"
							+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" PackageNotifyInvoker--->PackageNotify Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		}
		return response;
	}
}
