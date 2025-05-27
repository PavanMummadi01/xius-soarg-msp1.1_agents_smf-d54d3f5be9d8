/******************************************************************
 * Company XIUS (Megasoft Pvt Ltd Hyderabad,INDIA)
 * � Copyright 2006 MEGASOFT. 
 *
 * Package      : com.xius.mspgw.client.invoker;
 * Name of File : TIAVOlteProvisionInvoker.java
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
import com.xius.tia.TTprovisioning_xsd.VolteProvisionRequest;
import com.xius.tia.TTprovisioning_xsd.VolteProvisionResponse;
import com.xius.tia.TTprovisioning_xsd.VolteDeProvisionRequest;
import com.xius.tia.TTprovisioning_xsd.VolteDeProvisionResponse;

public class TIAVOlteProvisionInvoker {
    private static final Logger logger = LogManager.getLogger(TIAVOlteProvisionInvoker.class);


	public VolteDeProvisionResponse deprovision(HeaderDetails headerDetails,
			VolteDeProvisionRequest request) throws  SMFAgentException {
		
		logger.info("TIAVOlteProvisionInvoker provision calling ----------------------------");
		
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		
		VolteDeProvisionResponse response = null;
		TTprovisioningBindingStub bindingStub = null;
		try {
			bindingStub = getBindingStub(headerDetails);
			response = bindingStub.volteDeProvision(request);
			
			if (response != null) {
				if (logger.isInfoEnabled()) {
					if(response.getStatus()!=null){
						
						logger.info(
								">>>Response from  TIAVOlteProvisionInvoker---> provision api getStatus : "
									+ response.getStatus());
					 
					}else{
						logger.info(
								">>>Response from  TIAVOlteProvisionInvoker---> provision api response.getStatus() is Null : ");
					}
										
					endTime = System.currentTimeMillis();
					logger.info(
							" TIAVOlteProvisionInvoker---> provision Success:"
									+ (int) (endTime - startTime) + "ms");
				}
			} else {
				logger.error(
						"TIAVOlteProvisionInvoker---> provision Response is NULL ...");
				endTime = System.currentTimeMillis();
				logger.info(
						" TIAVOlteProvisionInvoker--->provision Failure:"
								+ (int) (endTime - startTime) + "ms");
				throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
			}

		} catch (ErrorDetailsType e) {
			logger.error(
					" TIAVOlteProvisionInvoker---> provision - ErrorDetailsType ErroCode:"
							+ e.getErrorCode());
			logger.error(
					" TIAVOlteProvisionInvoker---> provision - ErrorDetailsType ErrorMessage:"
							+ e.getErrorMessage());
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAVOlteProvisionInvoker---> provision Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(e.getErrorCode(), e.getErrorMessage());
		} catch (AxisFault e) {
			logger.error(
					" TIAVOlteProvisionInvoker---> provision- AxisFault :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAVOlteProvisionInvoker---> provision aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (SOAPException e) {
			logger.error(
					" TIAVOlteProvisionInvoker---> provision- SOAPException :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAVOlteProvisionInvoker---> provision aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		}catch (RemoteException e) {
			logger.error(
					"TIAVOlteProvisionInvoker---> provision - RemoteException:"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAVOlteProvisionInvoker---> provision Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (MalformedURLException e) {
			logger.error(
					" TIAVOlteProvisionInvoker---> provision - MalformedURLException :"
							+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAVOlteProvisionInvoker---> provision Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		}
		return response;
	}

	public VolteProvisionResponse provision(HeaderDetails headerDetails,
			VolteProvisionRequest request) throws SMFAgentException {
		
	logger.info("TIAVOlteProvisionInvoker provision calling ----------------------------");
		
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		
		VolteProvisionResponse response = null;
		TTprovisioningBindingStub bindingStub = null;
		try {
			bindingStub = getBindingStub(headerDetails);
			response = bindingStub.volteProvision(request);
			
			if (response != null) {
				if (logger.isInfoEnabled()) {
					if(response.getStatus()!=null){
						
						logger.info(
								">>>Response from  TIAVOlteProvisionInvoker---> provision api getStatus : "
									+ response.getStatus());
						 
					}else{
						logger.info(
								">>>Response from  TIAVOlteProvisionInvoker---> provision api response.getStatus() is Null : ");
					}
										
					endTime = System.currentTimeMillis();
					logger.info(
							" TIAVOlteProvisionInvoker---> provision time:"
									+ (int) (endTime - startTime) + "ms");
				}
			} else {
				logger.error(
						"TIAVOlteProvisionInvoker---> provision Response is NULL ...");
				endTime = System.currentTimeMillis();
				logger.info(
						" TIAVOlteProvisionInvoker--->provision Failure:"
								+ (int) (endTime - startTime) + "ms");
				throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
			}

		} catch (ErrorDetailsType e) {
			logger.error(
					" TIAVOlteProvisionInvoker---> provision - ErrorDetailsType ErroCode:"
							+ e.getErrorCode());
			logger.error(
					" TIAVOlteProvisionInvoker---> provision - ErrorDetailsType ErrorMessage:"
							+ e.getErrorMessage());
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAVOlteProvisionInvoker---> provision Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(e.getErrorCode(), e.getErrorMessage());
		} catch (AxisFault e) {
			logger.error(
					" TIAVOlteProvisionInvoker---> provision- AxisFault :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAVOlteProvisionInvoker---> provision aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (SOAPException e) {
			logger.error(
					" TIAVOlteProvisionInvoker---> provision- SOAPException :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAVOlteProvisionInvoker---> provision aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		}catch (RemoteException e) {
			logger.error(
					"TIAVOlteProvisionInvoker---> provision - RemoteException:"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAVOlteProvisionInvoker---> provision Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (MalformedURLException e) {
			logger.error(
					" TIAVOlteProvisionInvoker---> provision - MalformedURLException :"
							+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAVOlteProvisionInvoker---> provision Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		}
		return response;
	}

	private TTprovisioningBindingStub getBindingStub(HeaderDetails headerDetails)
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
