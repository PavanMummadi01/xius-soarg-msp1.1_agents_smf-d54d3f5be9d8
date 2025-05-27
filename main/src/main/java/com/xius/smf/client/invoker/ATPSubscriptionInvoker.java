package com.xius.smf.client.invoker;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;


import org.apache.axis.AxisFault;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.app.SMFApplication;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;
import com.xius.xbus.messages.billing.tariff.ATPSubscriptionRequest;
import com.xius.xbus.messages.billing.tariff.ATPSubscriptionResponse;
import com.xius.xbus.messages.common.SecurityId;
import com.xius.xbus.messages.common.ServiceContext;
import com.xius.xbus.services.billing.tariff.TariffServiceLocator;
import com.xius.xbus.services.billing.tariff.TariffServicePortType;

public class ATPSubscriptionInvoker {
	
    private static final Logger logger = LogManager.getLogger(ATPSubscriptionInvoker.class);

	public com.xius.xbus.messages.billing.tariff.ATPSubscriptionResponse atpSubscription(
			ATPSubscriptionRequest aTPSubscriptionRequest,HeaderDetails headerDetails) throws SMFAgentException, ServiceException {
		
		logger.info("The call reached ATPSubscriptionInvoker ");
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		
		aTPSubscriptionRequest.setMessageID(headerDetails.getRequestID());
		
		SecurityId securityId=new SecurityId();
		securityId.setUserAccountName(headerDetails.getLoginID());
		securityId.setUserAccountPassword("11111111");
		aTPSubscriptionRequest.setSecurityId(securityId);
		
		ServiceContext serviceContext=new ServiceContext();
		serviceContext.setCarrierId(String.valueOf(headerDetails.getNetworkID()));
		aTPSubscriptionRequest.setVersion("1");
		aTPSubscriptionRequest.setServiceContext(serviceContext);
		
		ATPSubscriptionResponse response=null;
		TariffServiceLocator locator = null;
		TariffServicePortType   porttype=null;
		
		try{
			String xBusURL=InitiateAll.getSMFProps().getProperty("xbus.url.cxf.tariffservice");
			if (logger.isInfoEnabled()) {
				logger.info("the url for request" + xBusURL);
			}
			locator = new TariffServiceLocator();
			porttype = locator.getTariffServicePort(new URL(xBusURL.trim()));
			response=porttype.ATPSubscription(aTPSubscriptionRequest);
			
		} catch (AxisFault e) {
			logger.error(
					" ATPSubscriptionInvoker--->ATPSubscription- AxisFault :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" ATPSubscriptionInvoker--->ATPSubscription aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (RemoteException e) {
			logger.error(
					"ATPSubscriptionInvoker--->ATPSubscription - RemoteException:"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" ATPSubscriptionInvoker--->ATPSubscription Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (MalformedURLException e) {
			logger.error(
					" ATPSubscriptionInvoker--->ATPSubscription - MalformedURLException :"
							+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" ATPSubscriptionInvoker--->ATPSubscription Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,
					null);
		}
		return response;
	}
}
