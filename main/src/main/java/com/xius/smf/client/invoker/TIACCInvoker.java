/******************************************************************
 * Company XIUS (Megasoft Pvt Ltd Hyderabad,INDIA)
 * � Copyright 2006 MEGASOFT. 
 *
 * Package      : com.xius.mspgw.client.invoker;
 * Name of File : TIACCInvoker.java
 * Date /Year   : Feb 19, 2020
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
import com.xius.tia.ccard.CreditCardManagment_wsdl.CreditCardManagmentBindingStub;
import com.xius.tia.ccard.CreditCardManagment_wsdl.CreditCardManagmentLocator;
import com.xius.tia.ccard.CreditCardManagment_xsd.RegisterCCRequest;
import com.xius.tia.ccard.CreditCardManagment_xsd.RegisterCCResponse;

public class TIACCInvoker {
    private static final Logger logger = LogManager.getLogger(TIACCInvoker.class);


	public RegisterCCResponse registerCC(HeaderDetails headerDetails,
			RegisterCCRequest request) throws SMFAgentException, SOAPException {
		
		logger.info("TIACCInvoker registerCC calling ----------------------------");
		
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		String url = InitiateAll.getSMFProps().getProperty("TIA_CC_URL");
		if (logger.isInfoEnabled()) {
			logger.info("the TIA_CC_URL is" + url);
		}
		
		RegisterCCResponse response = null;
		CreditCardManagmentBindingStub bindingStub = null;
		try {
			bindingStub = new CreditCardManagmentBindingStub(new URL(url),new CreditCardManagmentLocator());
			SOAPHeaderElement header = Utilities.getTIASoapHeader(headerDetails);
			bindingStub.setHeader(header);

			bindingStub.setTimeout(Integer.parseInt(InitiateAll.getSMFProps().getProperty("TIA.timeOut")));

			response = bindingStub.registerCC(request);

			if (response != null) {
				if (logger.isInfoEnabled()) {
					if(response.getResult()!=null){
						
						logger.info(
								">>>Response from  TIACCInvoker---> registerCC api getRespStatus : "
									+ response.getResult().getRespStatus());
						logger.info(
								">>>Response from  TIACCInvoker---> registerCC api getRespcode : "
									+ response.getResult().getRespcode());
						logger.info(
								">>>Response from  TIACCInvoker---> registerCC api getRespdescription : "
									+ response.getResult().getRespdescription());
					}else{
						logger.info(
								">>>Response from  TIACCInvoker---> registerCC api response.getResult() is Null : ");
					}
										
					endTime = System.currentTimeMillis();
					logger.info(
							" TIACCInvoker---> registerCC Success:"
									+ (int) (endTime - startTime) + "ms");
				}
			} else {
				logger.error(
						"TIACCInvoker---> registerCC Response is NULL ...");
				endTime = System.currentTimeMillis();
				logger.info(
						" TIACCInvoker--->registerCC Failure:"
								+ (int) (endTime - startTime) + "ms");
				throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
			}

		} catch (ErrorDetailsType e) {
			logger.error(
					" TIACCInvoker---> registerCC - ErrorDetailsType ErroCode:"
							+ e.getErrorCode());
			logger.error(
					" TIACCInvoker---> registerCC - ErrorDetailsType ErrorMessage:"
							+ e.getErrorMessage());
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIACCInvoker---> registerCC Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(e.getErrorCode(), e.getErrorMessage());
		} catch (AxisFault e) {
			logger.error(
					" TIACCInvoker---> registerCC- AxisFault :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIACCInvoker---> registerCC aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (RemoteException e) {
			logger.error(
					"TIACCInvoker---> registerCC - RemoteException:"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIACCInvoker---> registerCC Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (MalformedURLException e) {
			logger.error(
					" TIACCInvoker---> registerCC - MalformedURLException :"
							+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIACCInvoker---> registerCC Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		}
		return response;
	}
	
}
