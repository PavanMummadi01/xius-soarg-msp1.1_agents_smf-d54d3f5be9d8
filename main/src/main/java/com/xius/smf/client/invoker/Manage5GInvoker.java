package com.xius.smf.client.invoker;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;



import org.apache.axis.AxisFault;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.exception.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;
import com.xius.xbus.messages.billing.tariff.Manage5GRequest;
import com.xius.xbus.messages.billing.tariff.Manage5GResponse;
import com.xius.xbus.messages.common.SecurityId;
import com.xius.xbus.messages.common.ServiceContext;
import com.xius.xbus.services.billing.tariff.TariffServiceLocator;
import com.xius.xbus.services.billing.tariff.TariffServicePortType;

public class Manage5GInvoker {
	

    private static final Logger logger = LogManager.getLogger(Manage5GInvoker.class);
	public com.xius.xbus.messages.billing.tariff.Manage5GResponse manage5Gprovision(
			Manage5GRequest request,HeaderDetails headerDetails) throws SMFAgentException, ServiceException {
		
		logger.info("The call reached Manage5GInvoker ");
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		
		request.setMessageID("1");
		
		SecurityId securityId=new SecurityId();
		securityId.setUserAccountName(headerDetails.getLoginID());
		securityId.setUserAccountPassword("11111111");
		request.setSecurityId(securityId);
		
		ServiceContext serviceContext=new ServiceContext();
		serviceContext.setCarrierId(String.valueOf(headerDetails.getNetworkID()));
		request.setVersion("1");
		request.setServiceContext(serviceContext);
		request.setFlag("A");
		request.setChannel("SMFJOB");
		Manage5GResponse response=null;
		TariffServiceLocator locator = null;
		TariffServicePortType   porttype=null;
		
		try{
			String xBusURL=InitiateAll.getSMFProps().getProperty("xbus.url.cxf.tariffservice");
			if (logger.isInfoEnabled()) {
				logger.info("the url for request" + xBusURL);
			}
			locator = new TariffServiceLocator();
			porttype = locator.getTariffServicePort(new URL(xBusURL.trim()));
			response=porttype.manage5G(request);
			
		} catch (AxisFault e) {
			logger.error(
					" Manage5GInvoker--->Manage5G- AxisFault :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" Manage5GInvoker--->Manage5G aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(Long.parseLong(SMFAgentConstants.INTERNAL_ERROR_CODE_STR),
					SMFAgentConstants.INTERNAL_ERROR_MSG);
		} catch (RemoteException e) {
			logger.error(
					"Manage5GInvoker--->Manage5G - RemoteException:"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" Manage5GInvoker--->Manage5G Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(Long.parseLong(SMFAgentConstants.INTERNAL_ERROR_CODE_STR),
					SMFAgentConstants.INTERNAL_ERROR_MSG);
		} catch (MalformedURLException e) {
			logger.error(
					" Manage5GInvoker--->Manage5G - MalformedURLException :"
							+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" Manage5GInvoker--->Manage5G Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(Long.parseLong(SMFAgentConstants.INTERNAL_ERROR_CODE_STR),
					SMFAgentConstants.INTERNAL_ERROR_MSG);
		}
		return response;
	}
	
	public com.xius.xbus.messages.billing.tariff.Manage5GResponse manage5GDeprovision(
			Manage5GRequest request,HeaderDetails headerDetails) throws SMFAgentException, ServiceException {
		
		logger.info("The call reached Manage5GInvoker ");
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		
		request.setMessageID(headerDetails.getRequestID());
		
		SecurityId securityId=new SecurityId();
		securityId.setUserAccountName(headerDetails.getLoginID());
		securityId.setUserAccountPassword("11111111");
		request.setSecurityId(securityId);
		
		ServiceContext serviceContext=new ServiceContext();
		serviceContext.setCarrierId(String.valueOf(headerDetails.getNetworkID()));
		request.setVersion("1");
		request.setServiceContext(serviceContext);
		request.setFlag("D");
		request.setChannel("SMFJOB");
		Manage5GResponse response=null;
		TariffServiceLocator locator = null;
		TariffServicePortType   porttype=null;
		
		try{
			String xBusURL=InitiateAll.getSMFProps().getProperty("xbus.url.cxf.tariffservice");
			if (logger.isInfoEnabled()) {
				logger.info("the url for request" + xBusURL);
			}
			locator = new TariffServiceLocator();
			porttype = locator.getTariffServicePort(new URL(xBusURL.trim()));
			response=porttype.manage5G(request);
			
		} catch (AxisFault e) {
			logger.error(
					" Manage5GInvoker--->Manage5G- AxisFault :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" Manage5GInvoker--->Manage5G aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(Long.parseLong(SMFAgentConstants.INTERNAL_ERROR_CODE_STR),
					SMFAgentConstants.INTERNAL_ERROR_MSG);
		} catch (RemoteException e) {
			logger.error(
					"Manage5GInvoker--->Manage5G - RemoteException:"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" Manage5GInvoker--->Manage5G Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(Long.parseLong(SMFAgentConstants.INTERNAL_ERROR_CODE_STR),
					SMFAgentConstants.INTERNAL_ERROR_MSG);
		} catch (MalformedURLException e) {
			logger.error(
					" Manage5GInvoker--->Manage5G - MalformedURLException :"
							+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" Manage5GInvoker--->Manage5G Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(Long.parseLong(SMFAgentConstants.INTERNAL_ERROR_CODE_STR),
					SMFAgentConstants.INTERNAL_ERROR_MSG);
		}
		return response;
	}
}
