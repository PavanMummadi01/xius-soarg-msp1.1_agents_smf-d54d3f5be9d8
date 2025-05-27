package com.xius.smf.client.invoker;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

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
import com.xius.xbus.messages.provisioning.device.FirstLUActivationRequest;
import com.xius.xbus.messages.provisioning.device.FirstLUActivationResponse;
import com.xius.xbus.services.provisioning.device.DeviceServiceBindingStub;
import com.xius.xbus.services.provisioning.device.DeviceServiceLocator;

public class FirstLuActivationInvoker {
    private static final Logger logger = LogManager.getLogger(FirstLuActivationInvoker.class);
	
	public FirstLUActivationResponse firstLuActivation(
			FirstLUActivationRequest xbusRequest, HeaderDetails headerDetails) throws SMFAgentException {
			
		logger.info("The call reached FirstLuActivationInvoker ");
		long startTime= System.currentTimeMillis();
		long endTime= 0;
			
		     xbusRequest.setMessageID(headerDetails.getRequestID());
			
			SecurityId securityId=new SecurityId();
			securityId.setUserAccountName(headerDetails.getLoginID());
			securityId.setUserAccountPassword("11111111");
			xbusRequest.setSecurityId(securityId);
			
			ServiceContext serviceContext=new ServiceContext();
			serviceContext.setCarrierId(String.valueOf(headerDetails.getNetworkID()));
			xbusRequest.setVersion("1");
			xbusRequest.setServiceContext(serviceContext);
			
			String url = InitiateAll.getSMFProps().getProperty("xbus.url.cxf.DeviceService");
			
			if(logger.isInfoEnabled()){
				logger.info("The  Url for calling xbus invoker"+url);
			}
			
			FirstLUActivationResponse response=null;
			DeviceServiceBindingStub stub = null;
			
			try{
				stub = new DeviceServiceBindingStub(new URL(url),new DeviceServiceLocator());
				stub.setTimeout(Integer.parseInt(InitiateAll.getSMFProps().getProperty("XBUS_TIMEOUT")));
				
				response=stub.firstLUActivation(xbusRequest);
				
				if(response!=null && response.getErrors()!=null){
					com.xius.xbus.messages.common.ErrorData[] Errors = response.getErrors();
					logger.error( "firstLUActivation - ErrorData :"+Errors[0].getErrorCode()+"#"+Errors[0].getErrorMessage());
					endTime = System.currentTimeMillis();
					logger.info("firstLUActivation Failure:"+(int) (endTime - startTime)+"ms");
					throw new SMFAgentException(Errors[0].getErrorCode(), Errors[0].getErrorMessage());
				}
				
			}catch (AxisFault e) {
			logger.error( "firstLUActivation - AxisFault :"+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			logger.info("firstLUActivation Failure:"+(int) (endTime - startTime)+"ms");
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
			}
			catch (RemoteException e) {
			logger.error( "firstLUActivation - RemoteException:"+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			logger.info("firstLUActivation Failure:"+(int) (endTime - startTime)+"ms");
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
			}
			catch (MalformedURLException e) {
			logger.error( "firstLUActivation - MalformedURLException :"+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			logger.info("firstLUActivation Failure:"+(int) (endTime - startTime)+"ms");
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, null);
			}
			return response;
		}

}
