/******************************************************************
 * Company XIUS (Megasoft Pvt Ltd Hyderabad,INDIA)
 * � Copyright 2006 MEGASOFT. 
 *
 * Package      : com.xius.mspgw.client.invoker;
 * Name of File : TIAMngmtInvoker.java
 * Date /Year   : Feb 19, 2020
 * Author       : Shashidhar.P
 * Discription  : This class is the invoker class for invoking tia services 
 *
 * Method names : invoice,queryTransactions
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
import com.xius.tia.TIAManagement_xsd.QueryTransactionsRequest;
import com.xius.tia.TIAManagement_xsd.QueryTransactionsResponse;
import com.xius.tia.TIAManagement_xsd.SimActivationRequest;
import com.xius.tia.TIAManagement_xsd.SimActivationResponse;
import com.xius.tia.TIAManagement_xsd.YFCreateInvoiceRequest;
import com.xius.tia.TIAManagement_xsd.YFCreateInvoiceResponse;
import com.xius.tia.TTprovisioning_wsdl.TTprovisioningBindingStub;
import com.xius.tia.TTprovisioning_xsd.FiveGDeProvisionRequest;
import com.xius.tia.TTprovisioning_xsd.FiveGDeProvisionResponse;
import com.xius.tia.TTprovisioning_xsd.FiveGProvisionRequest;
import com.xius.tia.TTprovisioning_xsd.FiveGProvisionResponse;

public class TIAMngmtInvoker {
    private static final Logger logger = LogManager.getLogger(TIAMngmtInvoker.class);

	public YFCreateInvoiceResponse invoice(HeaderDetails headerDetails,
			YFCreateInvoiceRequest request) throws SMFAgentException, SOAPException {
		
		logger.info("TIAMngmtInvoker invoice calling ----------------------------");
		
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		String url = InitiateAll.getSMFProps().getProperty("TIA_URL");
		if (logger.isInfoEnabled()) {
			logger.info("TIA_URL is  " + url);
		}
		
		YFCreateInvoiceResponse response = null;
		TIAManagementBindingStub bindingStub = null;
		try {
			bindingStub = new TIAManagementBindingStub(new URL(url),new TIAManagementLocator());
			SOAPHeaderElement header = Utilities.getTIASoapHeader(headerDetails);
			bindingStub.setHeader(header);

			bindingStub.setTimeout(Integer.parseInt(InitiateAll.getSMFProps().getProperty("TIA.timeOut")));

			response = bindingStub.YFCreateInvoice(request);

			if (response != null) {
				if (logger.isInfoEnabled()) {
					if(response.getResponseData()!=null){
						
						logger.info(
								">>>Response from  TIAMngmtInvoker---> invoice api getReturnCode : "
									+ response.getResponseData().getReturnCode());
						logger.info(
								">>>Response from  TIAMngmtInvoker---> invoice api getResponsecode : "
									+ response.getResponseData().getResponsecode());
						logger.info(
								">>>Response from  TIAMngmtInvoker---> invoice api getRespdescription : "
									+ response.getResponseData().getRespdescription());
					}else{
						logger.info(
								">>>Response from  TIAMngmtInvoker---> invoice api response.getResult() is Null : ");
					}
										
					endTime = System.currentTimeMillis();
					logger.info(
							" TIAMngmtInvoker---> invoice Success:"
									+ (int) (endTime - startTime) + "ms");
				}
			} else {
				logger.error(
						" TIAMngmtInvoker---> invoice Response is NULL ...");
				endTime = System.currentTimeMillis();
				logger.info(
						" TIAMngmtInvoker---> invoice Failure:"
								+ (int) (endTime - startTime) + "ms");
				throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
			}

		} catch (ErrorDetailsType e) {
			logger.error(
					" TIAMngmtInvoker---> invoice - ErrorDetailsType ErroCode:"
							+ e.getErrorCode());
			logger.error(
					" TIAMngmtInvoker---> invoice - ErrorDetailsType ErrorMessage:"
							+ e.getErrorMessage());
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAMngmtInvoker---> invoice Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(e.getErrorCode(), e.getErrorMessage());
		} catch (AxisFault e) {
			logger.error(
					" TIAMngmtInvoker---> invoice - AxisFault :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAMngmtInvoker---> invoice aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,
					null);
		} catch (RemoteException e) {
			logger.error(
					" TIAMngmtInvoker---> invoice - RemoteException:"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAMngmtInvoker---> invoice Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (MalformedURLException e) {
			logger.error(
					" TIAMngmtInvoker---> invoice - MalformedURLException :"
							+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAMngmtInvoker---> invoice Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		}
		return response;
	}
	
	
	/**
	 * This method is used for invoking query transaction API of TIA 
	 * @param  QueryTransactionsRequest
	 * @return QueryTransactionsResponse
	 * @throws SMFAgentException, SOAPException
	 * */
	
	
	public QueryTransactionsResponse queryTransactions(HeaderDetails headerDetails,
			QueryTransactionsRequest request) throws SMFAgentException, SOAPException {
		
		logger.info("TIAMngmtInvoker invoice called ----------------------------");
		
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		String url = InitiateAll.getSMFProps().getProperty("TIA_URL");
		if (logger.isInfoEnabled()) {
			logger.info("TIA_URL is  " + url);
		}
		
		QueryTransactionsResponse response = null;
		TIAManagementBindingStub bindingStub = null;
		try {
			bindingStub = new TIAManagementBindingStub(new URL(url),new TIAManagementLocator());
			SOAPHeaderElement header = Utilities.getTIASoapHeader(headerDetails);
			bindingStub.setHeader(header);

			bindingStub.setTimeout(Integer.parseInt(InitiateAll.getSMFProps().getProperty("TIA.timeOut")));

			response = bindingStub.queryTransactions(request);

			if (response != null) {
				if (logger.isInfoEnabled()) {
					if(response.getResponseData()!=null){
						
						logger.info(
								">>>Response from  TIAMngmtInvoker---> queryTransactions api getReturnCode : "
									+ response.getResponseData().getReturnCode());
						logger.info(
								">>>Response from  TIAMngmtInvoker---> queryTransactions api getResponsecode : "
									+ response.getResponseData().getResponsecode());
						logger.info(
								">>>Response from  TIAMngmtInvoker---> queryTransactions api getRespdescription : "
									+ response.getResponseData().getRespdescription());
					}else{
						logger.info(
								">>>Response from  TIAMngmtInvoker---> queryTransactions api response.getResult() is Null : ");
					}
										
					endTime = System.currentTimeMillis();
					logger.info(
							" TIAMngmtInvoker---> queryTransactions Success:"
									+ (int) (endTime - startTime) + "ms");
				}
			} else {
				logger.error(
						" TIAMngmtInvoker---> queryTransactions Response is NULL ...");
				endTime = System.currentTimeMillis();
				logger.info(
						" TIAMngmtInvoker---> queryTransactions Failure:"
								+ (int) (endTime - startTime) + "ms");
				throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
			}

		} catch (ErrorDetailsType e) {
			logger.error(
					" TIAMngmtInvoker---> queryTransactions - ErrorDetailsType ErroCode:"
							+ e.getErrorCode());
			logger.error(
					" TIAMngmtInvoker---> queryTransactions - ErrorDetailsType ErrorMessage:"
							+ e.getErrorMessage());
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAMngmtInvoker---> queryTransactions Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(e.getErrorCode(), e.getErrorMessage());
		} catch (AxisFault e) {
			logger.error(
					" TIAMngmtInvoker---> queryTransactions - AxisFault :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAMngmtInvoker---> queryTransactions aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (RemoteException e) {
			logger.error(
					" TIAMngmtInvoker---> queryTransactions - RemoteException:"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAMngmtInvoker---> queryTransactions Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (MalformedURLException e) {
			logger.error(
					" TIAMngmtInvoker---> queryTransactions - MalformedURLException :"
							+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAMngmtInvoker---> queryTransactions Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		}
		return response;
	}

	
	
	
	
	public SimActivationResponse SIMActivation(HeaderDetails headerDetails,
			SimActivationRequest request) throws SMFAgentException, SOAPException {
		
		logger.info("TIAMngmtInvoker invoice called ----------------------------");
		
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		String url = InitiateAll.getSMFProps().getProperty("TIA_URL");
		if (logger.isInfoEnabled()) {
			logger.info("TIA_URL is  " + url);
		}
		
		SimActivationResponse response = null;
		TIAManagementBindingStub bindingStub = null;
		try {
			bindingStub = new TIAManagementBindingStub(new URL(url),new TIAManagementLocator());
			SOAPHeaderElement header = Utilities.getTIASoapHeader(headerDetails);
			bindingStub.setHeader(header);

			bindingStub.setTimeout(Integer.parseInt(InitiateAll.getSMFProps().getProperty("TIA.timeOut")));

			response = bindingStub.SIMActivation(request);

			if (response != null) {
				if (logger.isInfoEnabled()) {
					if(response.getResponseData()!=null){
						
						logger.info(
								">>>Response from  TIAMngmtInvoker---> SIMActivation api getReturnCode : "
									+ response.getResponseData().getReturnCode());
						logger.info(
								">>>Response from  TIAMngmtInvoker---> SIMActivation api getResponsecode : "
									+ response.getResponseData().getResponsecode());
						logger.info(
								">>>Response from  TIAMngmtInvoker---> SIMActivation api getRespdescription : "
									+ response.getResponseData().getRespdescription());
					}else{
						logger.info(
								">>>Response from  TIAMngmtInvoker---> SIMActivation api response.getResult() is Null : ");
					}
										
					endTime = System.currentTimeMillis();
					logger.info(
							" TIAMngmtInvoker---> SIMActivation Success:"
									+ (int) (endTime - startTime) + "ms");
				}
			} else {
				logger.error(
						" TIAMngmtInvoker---> SIMActivation Response is NULL ...");
				endTime = System.currentTimeMillis();
				logger.info(
						" TIAMngmtInvoker---> SIMActivation Failure:"
								+ (int) (endTime - startTime) + "ms");
				throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
			}

		} catch (ErrorDetailsType e) {
			logger.error(
					" TIAMngmtInvoker---> SIMActivation - ErrorDetailsType ErroCode:"
							+ e.getErrorCode());
			logger.error(
					" TIAMngmtInvoker---> SIMActivation - ErrorDetailsType ErrorMessage:"
							+ e.getErrorMessage());
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAMngmtInvoker---> SIMActivation Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(e.getErrorCode(), e.getErrorMessage());
		} catch (AxisFault e) {
			logger.error(
					" TIAMngmtInvoker---> SIMActivation - AxisFault :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAMngmtInvoker---> SIMActivation aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (RemoteException e) {
			logger.error(
					" TIAMngmtInvoker---> SIMActivation - RemoteException:"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAMngmtInvoker---> SIMActivation Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (MalformedURLException e) {
			logger.error(
					" TIAMngmtInvoker---> SIMActivation - MalformedURLException :"
							+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAMngmtInvoker---> SIMActivation Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		}
		return response;
	}
	
	public FiveGProvisionResponse fiveGProvision(HeaderDetails headerDetails,
			FiveGProvisionRequest request) throws SMFAgentException, SOAPException {
		
		logger.info("TIAMngmtInvoker invoice called ----------------------------");
		
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		String url = InitiateAll.getSMFProps().getProperty("TIA_PROVISIONING_URL");
		if (logger.isInfoEnabled()) {
			logger.info("TIA_PROVISIONING_URL is  " + url);
		}
		
		FiveGProvisionResponse response = null;
		TTprovisioningBindingStub bindingStub = null;
		try {
			bindingStub = new TTprovisioningBindingStub(new URL(url),new TIAManagementLocator());
			SOAPHeaderElement header = Utilities.getTIASoapHeader(headerDetails);
			bindingStub.setHeader(header);

			bindingStub.setTimeout(Integer.parseInt(InitiateAll.getSMFProps().getProperty("TIA.timeOut")));

			response = bindingStub.fiveGProvision(request);

			if (response != null) {
				if (logger.isInfoEnabled()) {
					if(response.getResponseData()!=null){
						
						logger.info(
								">>>Response from  TIAMngmtInvoker---> fiveGProvision api getReturnCode : "
									+ response.getResponseData().getReturnCode());
						logger.info(
								">>>Response from  TIAMngmtInvoker---> fiveGProvision api getResponsecode : "
									+ response.getResponseData().getResponsecode());
						logger.info(
								">>>Response from  TIAMngmtInvoker---> fiveGProvision api getRespdescription : "
									+ response.getResponseData().getRespdescription());
					}else{
						logger.info(
								">>>Response from  TIAMngmtInvoker---> fiveGProvision api response.getResult() is Null : ");
					}
										
					endTime = System.currentTimeMillis();
					logger.info(
							" TIAMngmtInvoker---> fiveGProvision Success:"
									+ (int) (endTime - startTime) + "ms");
				}
			} else {
				logger.error(
						" TIAMngmtInvoker---> fiveGProvision Response is NULL ...");
				endTime = System.currentTimeMillis();
				logger.info(
						" TIAMngmtInvoker---> fiveGProvision Failure:"
								+ (int) (endTime - startTime) + "ms");
				throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
			}

		} catch (ErrorDetailsType e) {
			logger.error(
					" TIAMngmtInvoker---> fiveGProvision - ErrorDetailsType ErroCode:"
							+ e.getErrorCode());
			logger.error(
					" TIAMngmtInvoker---> fiveGProvision - ErrorDetailsType ErrorMessage:"
							+ e.getErrorMessage());
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAMngmtInvoker---> fiveGProvision Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(e.getErrorCode(), e.getErrorMessage());
		} catch (AxisFault e) {
			logger.error(
					" TIAMngmtInvoker---> fiveGProvision - AxisFault :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAMngmtInvoker---> fiveGProvision aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (RemoteException e) {
			logger.error(
					" TIAMngmtInvoker---> fiveGProvision - RemoteException:"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAMngmtInvoker---> fiveGProvision Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (MalformedURLException e) {
			logger.error(
					" TIAMngmtInvoker---> fiveGProvision - MalformedURLException :"
							+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAMngmtInvoker---> fiveGProvision Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		}
		return response;
	}
	public FiveGDeProvisionResponse fiveGDeProvision(HeaderDetails headerDetails,
			FiveGDeProvisionRequest request) throws SMFAgentException, SOAPException {
		
		logger.info("TIAMngmtInvoker invoice called ----------------------------");
		
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		String url = InitiateAll.getSMFProps().getProperty("TIA_PROVISIONING_URL");
		if (logger.isInfoEnabled()) {
			logger.info("TIA_URL is  " + url);
		}
		
		FiveGDeProvisionResponse response = null;
		TTprovisioningBindingStub bindingStub = null;
		try {
			bindingStub = new TTprovisioningBindingStub(new URL(url),new TIAManagementLocator());
			SOAPHeaderElement header = Utilities.getTIASoapHeader(headerDetails);
			bindingStub.setHeader(header);

			bindingStub.setTimeout(Integer.parseInt(InitiateAll.getSMFProps().getProperty("TIA.timeOut")));

			response = bindingStub.fiveGDeProvision(request);

			if (response != null) {
				if (logger.isInfoEnabled()) {
					if(response.getResponseData()!=null){
						
						logger.info(
								">>>Response from  TIAMngmtInvoker---> fiveGDeProvision api getReturnCode : "
									+ response.getResponseData().getReturnCode());
						logger.info(
								">>>Response from  TIAMngmtInvoker---> fiveGDeProvision api getResponsecode : "
									+ response.getResponseData().getResponsecode());
						logger.info(
								">>>Response from  TIAMngmtInvoker---> fiveGDeProvision api getRespdescription : "
									+ response.getResponseData().getRespdescription());
					}else{
						logger.info(
								">>>Response from  TIAMngmtInvoker---> fiveGDeProvision api response.getResult() is Null : ");
					}
										
					endTime = System.currentTimeMillis();
					logger.info(
							" TIAMngmtInvoker---> fiveGDeProvision Success:"
									+ (int) (endTime - startTime) + "ms");
				}
			} else {
				logger.error(
						" TIAMngmtInvoker---> fiveGDeProvision Response is NULL ...");
				endTime = System.currentTimeMillis();
				logger.info(
						" TIAMngmtInvoker---> fiveGDeProvision Failure:"
								+ (int) (endTime - startTime) + "ms");
				throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
			}

		} catch (ErrorDetailsType e) {
			logger.error(
					" TIAMngmtInvoker---> fiveGDeProvision - ErrorDetailsType ErroCode:"
							+ e.getErrorCode());
			logger.error(
					" TIAMngmtInvoker---> fiveGDeProvision - ErrorDetailsType ErrorMessage:"
							+ e.getErrorMessage());
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAMngmtInvoker---> fiveGDeProvision Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(e.getErrorCode(), e.getErrorMessage());
		} catch (AxisFault e) {
			logger.error(
					" TIAMngmtInvoker---> fiveGDeProvision - AxisFault :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAMngmtInvoker---> fiveGDeProvision aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (RemoteException e) {
			logger.error(
					" TIAMngmtInvoker---> fiveGDeProvision - RemoteException:"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAMngmtInvoker---> fiveGDeProvision Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (MalformedURLException e) {
			logger.error(
					" TIAMngmtInvoker---> fiveGDeProvision - MalformedURLException :"
							+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" TIAMngmtInvoker---> fiveGDeProvision Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		}
		return response;
	}
	
}
