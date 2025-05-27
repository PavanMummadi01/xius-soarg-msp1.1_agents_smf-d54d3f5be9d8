/******************************************************************
 * Company XIUS (Megasoft Pvt Ltd Hyderabad,INDIA)
 * � Copyright 2006 MEGASOFT. 
 *
 * Package      : com.xius.mspgw.client.invoker;
 * Name of File : TIARegNotificationInvoker.java
 * Date /Year   : Mar 13, 2020
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
import com.xius.tia.TTprovisioning_wsdl.TTprovisioningBindingStub;
import com.xius.tia.TTprovisioning_wsdl.TTprovisioningManagementLocator;
import com.xius.tia.TTprovisioning_xsd.TtRegNotificationRequest;
import com.xius.tia.TTprovisioning_xsd.TtRegNotificationResponse;

public class TIARegNotificationInvoker {
    private static final Logger logger = LogManager.getLogger(TIARegNotificationInvoker.class);

	public TtRegNotificationResponse regnotification(HeaderDetails headerDetails,
			TtRegNotificationRequest request) throws  SMFAgentException {
		
		logger.info("TIARegNotificationInvoker regnotification calling ----------------------------");
		
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		
		TtRegNotificationResponse response = null;
		TTprovisioningBindingStub bindingStub = null;
		try {
			bindingStub = getBindingStubq(headerDetails);
			response = bindingStub.ttRegNotification(request);
			
			if (response != null) {
				if (logger.isInfoEnabled()) {
					if(response.getMessage()!=null){
						
						logger.info(
								">>>Response from  TIARegNotificationInvoker---> regnotification api getStatus : "
									+ response.getMessage());
					}else{
						logger.info(
								">>>Response from  TIARegNotificationInvoker---> regnotification api getMessage() is Null : ");
					}
										
					endTime = System.currentTimeMillis();
					logger.info(
							" TIARegNotificationInvoker---> regnotification Success:"
									+ (int) (endTime - startTime) + "ms");
				}
			} else {
				logger.error(
						"TIARegNotificationInvoker---> regnotification Response is NULL ...");
				endTime = System.currentTimeMillis();
				logger.info(
						" TIARegNotificationInvoker--->regnotification Failure:"
								+ (int) (endTime - startTime) + "ms");
				throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
			}

		} catch (ErrorDetailsType e) {
			logger.error(
					" TIARegNotificationInvoker---> regnotification - ErrorDetailsType ErroCode:"
							+ e.getErrorCode());
			logger.error(
					" TIARegNotificationInvoker---> regnotification - ErrorDetailsType ErrorMessage:"
							+ e.getErrorMessage());
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIARegNotificationInvoker---> regnotification Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(e.getErrorCode(), e.getErrorMessage());
		} catch (AxisFault e) {
			logger.error(
					" TIARegNotificationInvoker---> regnotification- AxisFault :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIARegNotificationInvoker---> regnotification aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (SOAPException e) {
			logger.error(
					" TIARegNotificationInvoker---> regnotification- SOAPException :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIARegNotificationInvoker---> regnotification aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		}catch (RemoteException e) {
			logger.error(
					"TIARegNotificationInvoker---> regnotification - RemoteException:"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIARegNotificationInvoker---> regnotification Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (MalformedURLException e) {
			logger.error(
					" TIARegNotificationInvoker---> regnotification - MalformedURLException :"
							+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIARegNotificationInvoker---> regnotification Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		}
		return response;
	}

	 

	private TTprovisioningBindingStub getBindingStubq(HeaderDetails headerDetails)
			throws AxisFault, MalformedURLException, SOAPException {
		TTprovisioningBindingStub bindingStub = null;
		bindingStub = new TTprovisioningBindingStub(new URL(getTTprovisioningurl()),
				new TTprovisioningManagementLocator());
		SOAPHeaderElement header = Utilities.getTIASoapHeader(headerDetails);
		bindingStub.setHeader(header);
		bindingStub.setTimeout(getTIATimeOut());
		return bindingStub;
	}

	private int getTIATimeOut() {
		return Integer.parseInt(InitiateAll.getSMFProps().getProperty("TIA.timeOut"));
	}

	private String getTTprovisioningurl() {
		
		String url = InitiateAll.getSMFProps().getProperty("TIA_PROVISIONING_URL");
		if (logger.isInfoEnabled()) {
			logger.info("TIA_PROVISIONING_URL is" + url);
		}
		return url;
	}

	
}
