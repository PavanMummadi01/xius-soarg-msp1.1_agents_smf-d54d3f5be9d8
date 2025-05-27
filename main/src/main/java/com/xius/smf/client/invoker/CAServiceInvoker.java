package com.xius.smf.client.invoker;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;
import org.apache.axis.AxisFault;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;
import com.xius.xbus.messages.common.SecurityId;
import com.xius.xbus.messages.common.ServiceContext;
import com.xius.xbus.messages.selfcare.communityaccountservice.ManageCommActATPRequest;
import com.xius.xbus.messages.selfcare.communityaccountservice.ManageCommActATPResponse;
import com.xius.xbus.services.selfcare.communityaccountservice.CommunityAccountServiceLocator;
import com.xius.xbus.services.selfcare.communityaccountservice.CommunityAccountServicePortType;

public class CAServiceInvoker {
	

    private static final Logger logger = LogManager.getLogger(CAServiceInvoker.class);
	
	public ManageCommActATPResponse manageCaATP(
			ManageCommActATPRequest manageCommActATPRequest,HeaderDetails headerDetails) throws SMFAgentException, ServiceException {
		
		logger.info("The call reached ATPSubscriptionInvoker ");
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		
		manageCommActATPRequest.setMessageID(headerDetails.getRequestID());
		
		SecurityId securityId=new SecurityId();
		securityId.setUserAccountName(headerDetails.getLoginID());
		securityId.setUserAccountPassword("11111111");
		manageCommActATPRequest.setSecurityId(securityId);
		
		ServiceContext serviceContext=new ServiceContext();
		serviceContext.setCarrierId(String.valueOf(headerDetails.getNetworkID()));
		manageCommActATPRequest.setVersion("1");
		manageCommActATPRequest.setServiceContext(serviceContext);
		manageCommActATPRequest.setMessageID("112233");
		ManageCommActATPResponse response=null;
		CommunityAccountServiceLocator locator = null;
		CommunityAccountServicePortType   porttype=null;
		
		try{
			String xBusURL=InitiateAll.getSMFProps().getProperty("xbus.url.cxf.CommunityAccountService");
			if (logger.isInfoEnabled()) {
				logger.info("the url for request" + xBusURL);
			}
			locator = new CommunityAccountServiceLocator();
			porttype = locator.getCommunityAccountServicePort(new URL(xBusURL.trim()));
			response=porttype.manageCommActATP(manageCommActATPRequest);
			
		} catch (AxisFault e) {
			logger.error(
					" CAServiceInvoker--->manageCaATP- AxisFault :"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" CAServiceInvoker--->manageCaATP aFilure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (RemoteException e) {
			logger.error(
					"CAServiceInvoker--->manageCaATP - RemoteException:"
							+ Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" CAServiceInvoker--->manageCaATP Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		} catch (MalformedURLException e) {
			logger.error(
					" CAServiceInvoker--->manageCaATP - MalformedURLException :"
							+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info(
						" CAServiceInvoker--->manageCaATP Failure:"
								+ (int) (endTime - startTime) + "ms");
			}
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR,null);
		}
		return response;
	}
}
