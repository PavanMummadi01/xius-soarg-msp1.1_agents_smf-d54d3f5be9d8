package com.xius.smf.client.invoker;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;


import net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationRequest;
import net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationResponse;

import org.apache.axis.AxisFault;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import soap_binding.servicemix.IProvisioningAppLocator;
import soap_binding.servicemix.ProvisioningAppBindingStub;

import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;

public class PrepaidRegistrationInvoker {
	
    private static final Logger logger = LogManager.getLogger(PrepaidRegistrationInvoker.class);
	
	
	public PrepaidActivationResponse prepaidRegistration(HeaderDetails headerDetails,PrepaidActivationRequest prepaidactRequest) throws SMFAgentException {
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		String msg="";
		ProvisioningAppBindingStub iprStub=null;
		PrepaidActivationResponse xbusresponse=null;
		
		try{
			
		String url = InitiateAll.getSMFProps().getProperty("provisioning.app.url");
		logger.info(" URL for calling XBUS PrepaidRegistrationInvoker Invoker : "+url);
		
		iprStub = new ProvisioningAppBindingStub(new URL(url),new IProvisioningAppLocator());
		iprStub.setTimeout(new Integer(InitiateAll.getSMFProps().getProperty("XBUS_TIMEOUT")));
		xbusresponse=iprStub.prepaidActivation(prepaidactRequest);
		
		endTime = System.currentTimeMillis();	
			
		}catch (AxisFault e) {
			logger.error("PrepaidActivation - AxisFault :"+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			logger.error("PrepaidActivation Failure:"+(int) (endTime - startTime)+"ms");
			msg=InitiateAll.getErrorProps().getProperty(SMFAgentConstants.INTERNAL_ERROR_CODE_STR);
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, msg);
		}
		catch (RemoteException e) {
			logger.error( "PrepaidActivation - RemoteException:"+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			logger.error("PrepaidActivation Failure:"+(int) (endTime - startTime)+"ms");
			msg=InitiateAll.getErrorProps().getProperty(SMFAgentConstants.INTERNAL_ERROR_CODE_STR);
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, msg);
			}
		catch (MalformedURLException e) {
			logger.error("PrepaidActivation - MalformedURLException :"+Utilities.getStackTrace(e));
			endTime = System.currentTimeMillis();
			logger.error("PrepaidActivation Failure:"+(int) (endTime - startTime)+"ms");
			msg=InitiateAll.getErrorProps().getProperty(SMFAgentConstants.INTERNAL_ERROR_CODE_STR);
			throw new SMFAgentException(SMFAgentConstants.INTERNAL_ERROR_CODE_STR, msg);
		}
		finally{
			iprStub=null;
		}
		return xbusresponse;
		}
		
	}	
