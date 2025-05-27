/******************************************************************
 * Company XIUS (Megasoft Pvt Ltd Hyderabad,INDIA)
 * � Copyright 2006 MEGASOFT. 
 *
 * Package      : com.xius.mspgw.client.invoker;
 * Name of File : ProductPurchageInvoker.java
 * Date /Year   : Dec 09, 2016
 * Author       : Sambasiva Rao Aakula
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

import com.xius.billing.CAManagement_wsdl.CAManagementServicesBindingStub;
import com.xius.billing.CAManagement_wsdl.CAManagementServicesLocator;
import com.xius.billing.CAManagement_xsd.CAAccountExistCountRequest;
import com.xius.billing.CAManagement_xsd.CAAccountExistCountResponse;

import com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;

public class CAManagementInvoker {
	
    private static final Logger logger = LogManager.getLogger(CAManagementInvoker.class);

	public CAAccountExistCountResponse cAAccountExistCount(HeaderDetails headerDetails,
			CAAccountExistCountRequest Request) throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		String url = InitiateAll.getSMFProps().getProperty("iba.CAManagement");
		if (logger.isInfoEnabled()) {
			logger.info("the url for request" + url);
		}
		CAAccountExistCountResponse response = null;
		CAManagementServicesBindingStub bindingStub = null;
		try {
			bindingStub = new CAManagementServicesBindingStub(new URL(url),new CAManagementServicesLocator());
			SOAPHeaderElement header = Utilities.getSoapHeader(headerDetails);
			bindingStub.setHeader(header);

			bindingStub.setTimeout(Integer.parseInt(InitiateAll.getSMFProps().getProperty("iba.timeout")));

			response = bindingStub.cAAccountExistCount(Request);

			if (response != null) {
				if (logger.isInfoEnabled()) {
					logger.info(
							">>>Response from  CAManagementInvoker---> CAAccountExistCount api getConfigureCaParentCount : "
									+ response.getConfigureCaParentCount());
					logger.info(
							">>>Response from  CAManagementInvoker---> CAAccountExistCount api getUsedCaParentCount : "
									+ response.getUsedCaParentCount());
					
					endTime = System.currentTimeMillis();
					logger.info(
							" CAManagementInvoker--->Recharge Success:"
									+ (int) (endTime - startTime) + "ms");
				}
			} else {
				logger.error(
						"No response from IBA for CAManagementInvoker---> CAAccountExistCount api..");
				endTime = System.currentTimeMillis();
				logger.info(
						" CAManagementInvoker--->CAManagementInvoker Failure:"
								+ (int) (endTime - startTime) + "ms");
				throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
			}

		} catch (ErrorDetailsType e) {
			logger.error(
					" CAManagementInvoker--->CAAccountExistCount - ErrorDetailsType ErroCode:"
							+ e.getErrorCode());
			logger.error(
					" CAManagementInvoker--->CAAccountExistCount - ErrorDetailsType ErrorMessage:"
							+ e.getErrorMessage());
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" CAManagementInvoker--->CAAccountExistCount Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(e.getErrorCode(), e.getErrorMessage());
		} catch (AxisFault e) {
			logger.error(
					" CAManagementInvoker--->CAAccountExistCount- AxisFault :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" CAManagementInvoker--->CAAccountExistCount aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (RemoteException e) {
			logger.error(
					"CAManagementInvoker--->CAAccountExistCount - RemoteException:"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" CAManagementInvoker--->CAAccountExistCount Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (MalformedURLException e) {
			logger.error(
					" CAManagementInvoker--->CAAccountExistCount - MalformedURLException :"
							+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" CAManagementInvoker--->CAAccountExistCount Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		}
		return response;
	}
}
