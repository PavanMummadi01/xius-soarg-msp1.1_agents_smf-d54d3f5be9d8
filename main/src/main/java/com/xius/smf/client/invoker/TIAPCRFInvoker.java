/******************************************************************
 * Company XIUS (Megasoft Pvt Ltd Hyderabad,INDIA)
 * � Copyright 2006 MEGASOFT. 
 *
 * Package      : com.xius.mspgw.client.invoker;
 * Name of File : TIAPCRFInvoker.java
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
import com.xius.tia.TTprovisioning_xsd.DeletePCRFRequest;
import com.xius.tia.TTprovisioning_xsd.DeletePCRFResponse;
import com.xius.tia.TTprovisioning_xsd.ProvisionPCRFRequest;
import com.xius.tia.TTprovisioning_xsd.ProvisionPCRFResponse;

public class TIAPCRFInvoker {
    private static final Logger logger = LogManager.getLogger(TIAPCRFInvoker.class);


	public ProvisionPCRFResponse provision(HeaderDetails headerDetails,
			ProvisionPCRFRequest request) throws  SMFAgentException {
		
		logger.info("TIAPCRFInvoker provision calling ----------------------------");
		
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		
		ProvisionPCRFResponse response = null;
		TTprovisioningBindingStub bindingStub = null;
		try {
			bindingStub = getBindingStub(headerDetails);
			response = bindingStub.assignPolicy(request);
			
			if (response != null) {
				if (logger.isInfoEnabled()) {
					if(response.getStatus()!=null){
						
						logger.
						info(
								">>>Response from  TIAPCRFInvoker---> provision api getStatus : "
									+ response.getStatus());
						logger.info(
								">>>Response from  TIAPCRFInvoker---> provision api getTransID : "
									+ response.getTransID());
					}else{
						logger.info(
								">>>Response from  TIAPCRFInvoker---> provision api response.getStatus() is Null : ");
					}
										
					endTime = System.currentTimeMillis();
					logger.info(
							" TIAPCRFInvoker---> provision Success:"
									+ (int) (endTime - startTime) + "ms");
				}
			} else {
				logger.error(
						"TIAPCRFInvoker---> provision Response is NULL ...");
				endTime = System.currentTimeMillis();
				logger.info(
						" TIAPCRFInvoker--->provision Failure:"
								+ (int) (endTime - startTime) + "ms");
				throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
			}

		} catch (ErrorDetailsType e) {
			logger.error(
					" TIAPCRFInvoker---> provision - ErrorDetailsType ErroCode:"
							+ e.getErrorCode());
			logger.error(
					" TIAPCRFInvoker---> provision - ErrorDetailsType ErrorMessage:"
							+ e.getErrorMessage());
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAPCRFInvoker---> provision Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(e.getErrorCode(), e.getErrorMessage());
		} catch (AxisFault e) {
			logger.error(
					" TIAPCRFInvoker---> provision- AxisFault :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAPCRFInvoker---> provision aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (SOAPException e) {
			logger.error(
					" TIAPCRFInvoker---> provision- SOAPException :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAPCRFInvoker---> provision aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		}catch (RemoteException e) {
			logger.error(
					"TIAPCRFInvoker---> provision - RemoteException:"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAPCRFInvoker---> provision Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (MalformedURLException e) {
			logger.error(
					" TIAPCRFInvoker---> provision - MalformedURLException :"
							+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAPCRFInvoker---> provision Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		}
		return response;
	}

	public DeletePCRFResponse delete(HeaderDetails headerDetails,
			DeletePCRFRequest request) throws SMFAgentException {
		
	logger.info("TIAPCRFInvoker delete calling ----------------------------");
		
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		
		DeletePCRFResponse response = null;
		TTprovisioningBindingStub bindingStub = null;
		try {
			bindingStub = getBindingStub(headerDetails);
			response = bindingStub.unAssignPolicy(request);
			
			if (response != null) {
				if (logger.isInfoEnabled()) {
					if(response.getStatus()!=null){
						
						logger.info(
								">>>Response from  TIAPCRFInvoker---> delete api getStatus : "
									+ response.getStatus());
						logger.info(
								">>>Response from  TIAPCRFInvoker---> delete api getTransID : "
									+ response.getTransID());
					}else{
						logger.info(
								">>>Response from  TIAPCRFInvoker---> delete api response.getStatus() is Null : ");
					}
										
					endTime = System.currentTimeMillis();
					logger.info(
							" TIAPCRFInvoker---> delete time:"
									+ (int) (endTime - startTime) + "ms");
				}
			} else {
				logger.error(
						"TIAPCRFInvoker---> delete Response is NULL ...");
				endTime = System.currentTimeMillis();
				logger.info(
						" TIAPCRFInvoker--->delete Failure:"
								+ (int) (endTime - startTime) + "ms");
				throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
			}

		} catch (ErrorDetailsType e) {
			logger.error(
					" TIAPCRFInvoker---> delete - ErrorDetailsType ErroCode:"
							+ e.getErrorCode());
			logger.error(
					" TIAPCRFInvoker---> delete - ErrorDetailsType ErrorMessage:"
							+ e.getErrorMessage());
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAPCRFInvoker---> delete Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(e.getErrorCode(), e.getErrorMessage());
		} catch (AxisFault e) {
			logger.error(
					" TIAPCRFInvoker---> delete- AxisFault :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAPCRFInvoker---> delete aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (SOAPException e) {
			logger.error(
					" TIAPCRFInvoker---> delete- SOAPException :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAPCRFInvoker---> delete aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		}catch (RemoteException e) {
			logger.error(
					"TIAPCRFInvoker---> delete - RemoteException:"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAPCRFInvoker---> delete Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (MalformedURLException e) {
			logger.error(
					" TIAPCRFInvoker---> delete - MalformedURLException :"
							+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAPCRFInvoker---> delete Failure:"
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
		
		String url = InitiateAll.getSMFProps().getProperty("TIA_PCRF_URL");
		if (logger.isInfoEnabled()) {
			logger.info("TIA_PCRF_URL is" + url);
		}
		return url;
	}

	
}
