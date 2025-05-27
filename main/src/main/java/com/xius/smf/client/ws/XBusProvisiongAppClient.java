package com.xius.smf.client.ws;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationRequest;
import net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationResponse;
import net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationRestRequest;
import net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationRestResponse;
import net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationRequest;
import net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationResponse;
import net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationRestRequest;
import net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationRestResponse;
import net.bcgi.si.messages.mvnoapi.provisioning.UpdateSubDemographicDetailsRequest;
import net.bcgi.si.messages.mvnoapi.provisioning.UpdateSubDemographicDetailsResponse;
import soap_binding.servicemix.IProvisioningAppLocator;
import soap_binding.servicemix.IProvisioningAppPortType;

import com.xius.smf.utils.InitiateAll;

public class XBusProvisiongAppClient {

    private static final Logger logger = LogManager.getLogger(XBusProvisiongAppClient.class);

	IProvisioningAppPortType porttype = null;

	public XBusProvisiongAppClient() throws MalformedURLException, ServiceException, InstantiationException {

		String xBusURL=InitiateAll.getSMFProps().getProperty( "provisioning.app.url");
		IProvisioningAppLocator locator = new IProvisioningAppLocator();

		porttype = locator.getProvisioningApp(new URL(xBusURL.trim()));

		if( null == porttype ) {

			throw new InstantiationException("Instance of IProvisioningAppPortType is null");
		}
	}

	public PrepaidActivationResponse prePaidActivation(PrepaidActivationRequest request) 
			throws RemoteException{

		long startTime = System.currentTimeMillis();

		String SIM =request.getMsisdnInfo().getSimNumber();

		logger.info( ">>> Sending request to xBus's prePaidActivation for SIM: " + SIM );

		PrepaidActivationResponse response = porttype.prepaidActivation( request );
		
		if( null != response ) {

			logger.info( "<<< Recevied response from xBus's prePaidActivation for SIM: " + SIM +" Status Code: " + response.getStatusCode());
		}

		logger.info( "### total time taken to Recevie xBus's prePaidActivation response for SIM : "+ SIM +" in milli secons : " + (System.currentTimeMillis() - startTime ));
		return response;
	}
	
	public PrepaidActivationRestResponse prepaidActivationRest(PrepaidActivationRestRequest request) 
			throws RemoteException{

		long startTime = System.currentTimeMillis();

		String SIM =request.getMsisdnInfo().getSimNumber();

		logger.info( ">>> Sending request to xBus's prepaidActivationRest for SIM: " + SIM );

		PrepaidActivationRestResponse response = porttype.prepaidActivationRest( request );
		
		if( null != response ) {

			logger.info( "<<< Recevied response from xBus's prepaidActivationRest for SIM: " + SIM +" Status Code: " + response.getStatusCode());
		}

		logger.info( "### total time taken to Recevie xBus's prepaidActivationRest response for SIM : "+ SIM +" in milli secons : " + (System.currentTimeMillis() - startTime ));
		return response;
	}
	
	public UpdateSubDemographicDetailsResponse updateSubDemographicDetails(UpdateSubDemographicDetailsRequest request)
			throws RemoteException{
		
		long startTime = System.currentTimeMillis();
		
		String SIM =request.getIccId();
		
		logger.info( ">>> Sending request to xBus's updateSubDemographicDetails for SIM: " + SIM );
		
		UpdateSubDemographicDetailsResponse response = porttype.updateSubDemographicDetails( request );
		
		if( null != response ) {
		
			logger.info( "<<< Recevied response from xBus's updateSubDemographicDetails for SIM: " + SIM +" Status Code: " + response.getStatusCode());
		}
		
		logger.info( "### total time taken to Recevie xBus's updateSubDemographicDetails response for SIM : "+ SIM +" in milli secons : " + (System.currentTimeMillis() - startTime ));
		return response;
	}
	
	public PostpaidActivationResponse postPaidActivation(PostpaidActivationRequest request) 
			throws RemoteException{

		long startTime = System.currentTimeMillis();

		String SIM =request.getMsisdnInfo().getSimNumber();

		logger.info( ">>> Sending request to xBus's postPaidActivation for SIM: " + SIM );

		PostpaidActivationResponse response = porttype.postpaidActivation( request );

		if( null != response ) {

			logger.info( "<<< Recevied response from xBus's postPaidActivation for SIM: " + SIM +" Status Code: " + response.getStatusCode());
		}

		logger.info( "### total time taken to Recevie xBus's postPaidActivation response for SIM : "+ SIM +" in milli secons : " + (System.currentTimeMillis() - startTime ));
		return response;
	}
	
	public PostpaidActivationRestResponse postpaidActivationRest(PostpaidActivationRestRequest request) 
			throws RemoteException{

		long startTime = System.currentTimeMillis();

		String SIM =request.getMsisdnInfo().getSimNumber();

		logger.info( ">>> Sending request to xBus's postpaidActivationRest for SIM: " + SIM );

		PostpaidActivationRestResponse response = porttype.postpaidActivationRest( request );

		if( null != response ) {

			logger.info( "<<< Recevied response from xBus's postpaidActivationRest for SIM: " + SIM +" Status Code: " + response.getStatusCode());
		}

		logger.info( "### total time taken to Recevie xBus's postpaidActivationRest response for SIM : "+ SIM +" in milli secons : " + (System.currentTimeMillis() - startTime ));
		return response;
	}
}
