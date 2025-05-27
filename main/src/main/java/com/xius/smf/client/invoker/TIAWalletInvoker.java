/******************************************************************
 * Company XIUS (Megasoft Pvt Ltd Hyderabad,INDIA)
 * � Copyright 2006 MEGASOFT. 
 *
 * Package      : com.xius.mspgw.client.invoker;
 * Name of File : TIAWalletInvoker.java
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
import com.xius.tia.WalletManagement_wsdl.WalletIntegrationBindingStub;
import com.xius.tia.WalletManagement_wsdl.WalletIntegrationLocator;
import com.xius.tia.WalletManagement_xsd.CreateWalletRequest;
import com.xius.tia.WalletManagement_xsd.CreateWalletResponse;

public class TIAWalletInvoker {
    private static final Logger logger = LogManager.getLogger(TIAWalletInvoker.class);


	public CreateWalletResponse createWallet(HeaderDetails headerDetails,
			CreateWalletRequest request) throws SMFAgentException, SOAPException {
		
		logger.info("TIAWalletInvoker createWallet calling ----------------------------");
		
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		String url = InitiateAll.getSMFProps().getProperty("TIA_WALLET_URL");
		if (logger.isInfoEnabled()) {
			logger.info("TIA_WALLET_URL is  " + url);
		}
		
		CreateWalletResponse response = null;
		WalletIntegrationBindingStub bindingStub = null;
		try {
			bindingStub = new WalletIntegrationBindingStub(new URL(url),new WalletIntegrationLocator());
			SOAPHeaderElement header = Utilities.getTIASoapHeader(headerDetails);
			bindingStub.setHeader(header);

			bindingStub.setTimeout(Integer.parseInt(InitiateAll.getSMFProps().getProperty("TIA.timeOut")));

			response = bindingStub.createWallet(request);

			if (response != null) {
				if (logger.isInfoEnabled()) {
					if(response.getResponseData()!=null){
						
						logger.info(
								">>>Response from  TIAWalletInvoker---> createWallet api getReturnCode : "
									+ response.getResponseData().getReturnCode());
						logger.info(
								">>>Response from  TIAWalletInvoker---> createWallet api getResponsecode : "
									+ response.getResponseData().getResponsecode());
						logger.info(
								">>>Response from  TIAWalletInvoker---> createWallet api getRespdescription : "
									+ response.getResponseData().getRespdescription());
					}else{
						logger.info(
								">>>Response from  TIAWalletInvoker---> createWallet api response.getResult() is Null : ");
					}
										
					endTime = System.currentTimeMillis();
					logger.info(
							" TIAWalletInvoker---> createWallet Success:"
									+ (int) (endTime - startTime) + "ms");
				}
			} else {
				logger.error(
						" TIAWalletInvoker---> createWallet Response is NULL ...");
				endTime = System.currentTimeMillis();
				logger.info(
						" TIAWalletInvoker---> createWallet Failure:"
								+ (int) (endTime - startTime) + "ms");
				throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
			}

		} catch (ErrorDetailsType e) {
			logger.error(
					" TIAWalletInvoker---> createWallet - ErrorDetailsType ErroCode:"
							+ e.getErrorCode());
			logger.error(
					" TIAWalletInvoker---> createWallet - ErrorDetailsType ErrorMessage:"
							+ e.getErrorMessage());
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAWalletInvoker---> createWallet Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(e.getErrorCode(), e.getErrorMessage());
		} catch (AxisFault e) {
			logger.error(
					" TIAWalletInvoker---> createWallet- AxisFault :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAWalletInvoker---> createWallet aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (RemoteException e) {
			logger.error(
					" TIAWalletInvoker---> createWallet - RemoteException:"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAWalletInvoker---> createWallet Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (MalformedURLException e) {
			logger.error(
					" TIAWalletInvoker---> createWallet - MalformedURLException :"
							+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAWalletInvoker---> createWallet Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		}
		return response;
	}
	
}
