/******************************************************************
 * Company XIUS (Megasoft Pvt Ltd Hyderabad,INDIA)
 * � Copyright 2006 MEGASOFT. 
 *
 * Package      : com.xius.mspgw.client.invoker;
 * Name of File : GetSubDataInvoker.java
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
import com.xius.billing.SubscriberManagement_xsd.GetSubDataRequest;
import com.xius.billing.SubscriberManagement_xsd.GetSubDataResponse;
import com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;

public class GetSubDataInvoker {
    private static final Logger logger = LogManager.getLogger(GetETNotificationInvoker.class);


	public GetSubDataResponse GetSubData(HeaderDetails headerDetails,
			GetSubDataRequest Request) throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		String url = InitiateAll.getSMFProps().getProperty(
				"iba.SubscriberManagement");
		if (logger.isInfoEnabled()) {
			logger.info("the url for request" + url);
		}
		GetSubDataResponse response = null;
		SubscriberManagementBindingStub bindingStub = null;
		try {
			bindingStub = new SubscriberManagementBindingStub(new URL(url),
					new SubscriberServiceLocator());
			
			if((headerDetails!=null && headerDetails.getLoginID()==null) || (headerDetails!=null &&  headerDetails.getLoginID()!=null &&   headerDetails.getLoginID().length()==0)){
				headerDetails.setLoginID("SMF");
			}
			
			if((headerDetails!=null && headerDetails.getPassword()==null) || (headerDetails!=null &&  headerDetails.getPassword()!=null && headerDetails.getPassword().length()==0)){
				headerDetails.setPassword("12345678");
			}
			
			if((headerDetails!=null && headerDetails.getRequestID()==null) || (headerDetails!=null &&  headerDetails.getRequestID()!=null &&  headerDetails.getRequestID().length()==0)){
				headerDetails.setRequestID("1");
			}
		 
			 
		 
			
			SOAPHeaderElement header = Utilities.getSoapHeader(headerDetails);
			bindingStub.setHeader(header);

			bindingStub.setTimeout(Integer.parseInt(InitiateAll.getSMFProps()
					.getProperty("iba.timeout")));

			response = bindingStub.getSubData(Request);

			if (response != null) {
				if (logger.isInfoEnabled()) {
					logger.info(
							
							">>>Response from  GetSubDataInvoker---> GetSubData api getIsSendNotification : "
									+ response.getMSISDN());
					endTime = System.currentTimeMillis();
					logger.info(
							" GetSubDataInvoker--->Recharge Success:"
									+ (int) (endTime - startTime) + "ms");
				}
			} else {
				logger.error(
						"No response from IBA for GetSubDataInvoker---> Recharge api..");
				endTime = System.currentTimeMillis();
				logger.info(
						" GetSubDataInvoker--->GetSubDataInvoker Failure:"
								+ (int) (endTime - startTime) + "ms");
				throw new SMFAgentException((SMFAgentConstants.INTERNAL_ERROR_CODE_STR),null);
			}

		} catch (ErrorDetailsType e) {
			logger.error(
					" GetSubDataInvoker--->GetSubData - ErrorDetailsType ErroCode:"
							+ e.getErrorCode());
			logger.error(
					" GetSubDataInvoker--->GetSubData - ErrorDetailsType ErrorMessage:"
							+ e.getErrorMessage());
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" GetSubDataInvoker--->GetSubData Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException((e.getErrorCode()),e.getErrorMessage());
		} catch (AxisFault e) {
			logger.error(
					" GetSubDataInvoker--->GetSubData- AxisFault :");
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" GetSubDataInvoker--->GetSubData aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException((SMFAgentConstants.INTERNAL_ERROR_CODE_STR),null);
		} catch (RemoteException e) {
			logger.error(
					"GetSubDataInvoker--->GetSubData - RemoteException:");
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" GetSubDataInvoker--->GetSubData Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException((SMFAgentConstants.INTERNAL_ERROR_CODE_STR),null);
		} catch (MalformedURLException e) {
			logger.error(
					" GetSubDataInvoker--->GetSubData - MalformedURLException :");
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" GetSubDataInvoker--->GetSubData Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException((SMFAgentConstants.INTERNAL_ERROR_CODE_STR),null);
		}
		return response;
	}
}
