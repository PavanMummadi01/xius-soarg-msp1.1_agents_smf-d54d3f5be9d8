package com.xius.smf.client.ws;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import net.bcgi.si.messages.mvnoapi.subscriber.UpdateSubscriberInfoRequest;
import net.bcgi.si.messages.mvnoapi.subscriber.UpdateSubscriberInfoResponse;
import soap_binding.servicemix.ISubscriberAppLocator;
import soap_binding.servicemix.ISubscriberAppPortType;

import com.xius.smf.utils.InitiateAll;

public class XBusSubscriberAppClient {

    private static final Logger logger = LogManager.getLogger(XBusSubscriberAppClient.class);

	ISubscriberAppPortType porttype = null;

	public XBusSubscriberAppClient() throws MalformedURLException, ServiceException, InstantiationException {

		String xBusURL=InitiateAll.getSMFProps().getProperty( "subscriber.app.url");
		ISubscriberAppLocator locator = new ISubscriberAppLocator();

		porttype = locator.getSubscriberApp( new URL(xBusURL.trim()) );

		if( null == porttype ) {

			throw new InstantiationException("Instance of IProvisioningAppPortType is null");
		}
	}

	public UpdateSubscriberInfoResponse updateSubscriberInfo(UpdateSubscriberInfoRequest request) 
			throws RemoteException{

		long startTime = System.currentTimeMillis();

		String SIM = request.getSimNumber();

		logger.info( ">>> Sending request to xBus's updateSubscriberInfo for SIM: " + SIM );

		UpdateSubscriberInfoResponse response = porttype.updatSubscriberInfo( request );
		
		if( null != response ) {

			logger.info( "<<< Recevied response from xBus's updateSubscriberInfo for SIM: " + SIM +" Status Code: " + response.getStatusCode());
		}

		logger.info( "### total time taken to Recevie xBus's updateSubscriberInfo response for SIM : "+ SIM +" in milli secons : " + (System.currentTimeMillis() - startTime ));
		return response;
	}
}
