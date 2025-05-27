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

import com.xius.billing.ProductManagement_wsdl.ProductBindingStub;
import com.xius.billing.ProductManagement_wsdl.ProductDetailsLocator;
import com.xius.billing.ProductManagement_xsd.ProductPurchageRequest;
import com.xius.billing.ProductManagement_xsd.ProductPurchageResponse;
import com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;

public class ProductPurchageInvoker {
    private static final Logger logger = LogManager.getLogger(ProductPurchageInvoker.class);


	public ProductPurchageResponse productPurchage(HeaderDetails headerDetails,
			ProductPurchageRequest Request) throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		String url = InitiateAll.getSMFProps().getProperty("iba.ProductManagement");
		if (logger.isInfoEnabled()) {
			logger.info("the url for request" + url);
		}
		ProductPurchageResponse response = null;
		ProductBindingStub bindingStub = null;
		try {
			bindingStub = new ProductBindingStub(new URL(url),new ProductDetailsLocator());
			SOAPHeaderElement header = Utilities.getSoapHeader(headerDetails);
			bindingStub.setHeader(header);

			bindingStub.setTimeout(Integer.parseInt(InitiateAll.getSMFProps().getProperty("iba.timeout")));

			response = bindingStub.productPurchage(Request);

			if (response != null) {
				if (logger.isInfoEnabled()) {
					logger.info(
							">>>Response from  ProductPurchageInvoker---> ProductPurchage api TransID : "
									+ response.getProductPurchageData().getInternalTtransId());
					logger.info(
							">>>Response from  ProductPurchageInvoker---> ProductPurchage api getResponseCode : "
									+ response.getProductPurchageData().getResponseCode());
					logger.info(
							">>>Response from  ProductPurchageInvoker---> ProductPurchage api getResponseDescription : "
									+ response.getProductPurchageData().getResponseDescription());
										
					endTime = System.currentTimeMillis();
					logger.info(
							" ProductPurchageInvoker--->Recharge Success:"
									+ (int) (endTime - startTime) + "ms");
				}
			} else {
				logger.error(
						"No response from IBA for ProductPurchageInvoker---> Recharge api..");
				endTime = System.currentTimeMillis();
				logger.info(
						" ProductPurchageInvoker--->ProductPurchageInvoker Failure:"
								+ (int) (endTime - startTime) + "ms");
				throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
			}

		} catch (ErrorDetailsType e) {
			logger.error(
					" ProductPurchageInvoker--->ProductPurchage - ErrorDetailsType ErroCode:"
							+ e.getErrorCode());
			logger.error(
					" ProductPurchageInvoker--->ProductPurchage - ErrorDetailsType ErrorMessage:"
							+ e.getErrorMessage());
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" ProductPurchageInvoker--->ProductPurchage Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(e.getErrorCode(), e.getErrorMessage());
		} catch (AxisFault e) {
			logger.error(
					" ProductPurchageInvoker--->ProductPurchage- AxisFault :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" ProductPurchageInvoker--->ProductPurchage aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (RemoteException e) {
			logger.error(
					"ProductPurchageInvoker--->ProductPurchage - RemoteException:"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" ProductPurchageInvoker--->ProductPurchage Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (MalformedURLException e) {
			logger.error(
					" ProductPurchageInvoker--->ProductPurchage - MalformedURLException :"
							+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" ProductPurchageInvoker--->ProductPurchage Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		}
		return response;
	}
}
