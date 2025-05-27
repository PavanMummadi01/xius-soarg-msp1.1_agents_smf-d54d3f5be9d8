/******************************************************************
 * Company XIUS (Megasoft Pvt Ltd Hyderabad,INDIA)
 * � Copyright 2006 MEGASOFT. 
 *
 * Package      : com.xius.mspgw.client.invoker;
 * Name of File : ImeiEnquiryInvoker.java
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
import com.xius.tia.TIAManagement_xsd.IMEIEnquiryRequest; 
import com.xius.tia.TIAManagement_xsd.IMEIEnquiryResponse;

public class IMEIEnquiryTiaInvoker {
    private static final Logger logger = LogManager.getLogger(IMEIEnquiryTiaInvoker.class);


	public IMEIEnquiryResponse ImeiEnquiry(HeaderDetails headerDetails,
			IMEIEnquiryRequest Request) throws SMFAgentException, SOAPException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		String url = InitiateAll.getSMFProps().getProperty("TIA_URL");
		if (logger.isInfoEnabled()) {
			logger.info("the url for request" + url);
		}
		IMEIEnquiryResponse response = null;
		TIAManagementBindingStub bindingStub = null;
		try {
			bindingStub = new TIAManagementBindingStub(new URL(url),new TIAManagementLocator());
			SOAPHeaderElement header = Utilities.getTIASoapHeader(headerDetails);
			bindingStub.setHeader(header);

			bindingStub.setTimeout(Integer.parseInt(InitiateAll.getSMFProps().getProperty("iba.timeout")));

			response = bindingStub.IMEIEnquiry(Request);

			if (response != null) {
				if (logger.isInfoEnabled()) {
					 
					logger.info(
							">>>Response from  ImeiEnquiryInvoker---> ImeiEnquiry api getResponseCode : "
									+ response.getResponseData().getResponsecode());
					logger.info(
							">>>Response from  ImeiEnquiryInvoker---> ImeiEnquiry api getResponseDescription : "
									+ response.getResponseData().getRespdescription());
										
					endTime = System.currentTimeMillis();
					logger.info(
							" ImeiEnquiryInvoker--->Recharge Success:"
									+ (int) (endTime - startTime) + "ms");
				}
			} else {
				logger.error(
						"No response from IBA for ImeiEnquiryInvoker---> ImeiEnquiry api..");
				endTime = System.currentTimeMillis();
				logger.info(
						" ImeiEnquiryInvoker--->ImeiEnquiryInvoker Failure:"
								+ (int) (endTime - startTime) + "ms");
				throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
			}

		} catch (ErrorDetailsType e) {
			logger.error(
					" ImeiEnquiryInvoker--->ImeiEnquiry - ErrorDetailsType ErroCode:"
							+ e.getErrorCode());
			logger.error(
					" ImeiEnquiryInvoker--->ImeiEnquiry - ErrorDetailsType ErrorMessage:"
							+ e.getErrorMessage());
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" ImeiEnquiryInvoker--->ImeiEnquiry Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(e.getErrorCode(), e.getErrorMessage());
		} catch (AxisFault e) {
			logger.error(
					" ImeiEnquiryInvoker--->ImeiEnquiry- AxisFault :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" ImeiEnquiryInvoker--->ImeiEnquiry aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (RemoteException e) {
			logger.error(
					"ImeiEnquiryInvoker--->ImeiEnquiry - RemoteException:"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" ImeiEnquiryInvoker--->ImeiEnquiry Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (MalformedURLException e) {
			logger.error(
					" ImeiEnquiryInvoker--->ImeiEnquiry - MalformedURLException :"
							+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" ImeiEnquiryInvoker--->ImeiEnquiry Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		}
		return response;
	}
}
