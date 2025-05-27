package com.xius.smf.client.ws;

import java.io.IOException;
import java.net.MalformedURLException;
import java.security.GeneralSecurityException;
import java.util.Properties;

import org.apache.axis.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.tunetalk.topup.notification.NotificationError;
import com.tunetalk.topup.notification.NotificationServiceStub.AuthHeader;
import com.tunetalk.topup.notification.NotificationServiceStub.AuthHeaderE;
import com.tunetalk.topup.notification.NotificationServiceStub.BalanceNotificationE;
import com.tunetalk.topup.notification.NotificationServiceStub.BalanceNotificationResponse;
import com.tunetalk.topup.notification.NotificationServiceStub.Response;
import com.xius.smf.client.paytm.PaytmTxStatusInvoker;
import com.xius.smf.client.ws.stubs.BalanceNotifiCustomStub;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;

public class BalanceNotificationClient {

    private static final Logger logger = LogManager.getLogger("BalanceNotificationClient");

	private static String userName = null;
	private static String password = null;
	private static String trustStorePath = null;
	private static String trustStorePswd = null;
	private static String EXTERNAL_SYSTEM_URL = null;
	BalanceNotifiCustomStub stub = null;
	EndpointReference epr = null;
	static {

		Properties SMFProp = InitiateAll.getSMFProps();
		userName=SMFProp.getProperty(SMFAgentConstants.EXTERNAL_SYSTEM_USER);
		password=SMFProp.getProperty(SMFAgentConstants.EXTERNAL_SYSTEM_PASSWORD);
		trustStorePath=SMFProp.getProperty(SMFAgentConstants.TRUSTSTORE_PATH);
		trustStorePswd=SMFProp.getProperty(SMFAgentConstants.TRUSTSTORE_PASSWORD);
		EXTERNAL_SYSTEM_URL=SMFProp.getProperty(SMFAgentConstants.EXTERNAL_SYSTEM_URL);

		/*if(logger.isDebugEnabled()) {

			logger.log(BCGLevel.DEBUG, "Ext User: " + userName );
			logger.log(BCGLevel.DEBUG, "Ext User password: " + password );
			logger.log(BCGLevel.DEBUG, "trust store path: " + trustStorePath );
			logger.log(BCGLevel.DEBUG, "trust store password: " + trustStorePswd );
			logger.log(BCGLevel.DEBUG, "trust store password: " + EXTERNAL_SYSTEM_URL );
		}*/

		if( Utilities.isNull( userName ) 
				||  Utilities.isNull( password ) 
				||  Utilities.isNull( trustStorePath ) 
				||  Utilities.isNull( trustStorePswd ) 
				||  Utilities.isNull( EXTERNAL_SYSTEM_URL )){

			logger.error( "### smfagent's properties USER/PASSWORD/TRUSTSTORE/TRUSTSTOREPSWD/EXTERNAL_SYSTEM_URL should not be null or empty");
			System.exit(1);
		}
	}
	public BalanceNotificationClient() throws AxisFault 
	{
		/**
		 * Setting trust store user and password for basic SSL handshaking
		 */

		/*System.setProperty("javax.net.ssl.trustStore",trustStorePath);
		System.setProperty("javax.net.ssl.trustStorePassword",trustStorePswd);*/

		/**
		 * Stub based communicatiton 
		 */

		/**
		 * Setting EPR externally (property file)
		 */
		/*epr = new EndpointReference( EXTERNAL_SYSTEM_URL );

		stub = new BalanceNotifiCustomStub();

		stub._getServiceClient().getOptions().setTo( epr );*/

	}
	public Response invokeService(BalanceNotificationE bal, String transID) 
			throws NotificationError, MalformedURLException, GeneralSecurityException, IOException {

		String MSISDN = "";
		if(null != bal.getBalanceNotification() && null != bal.getBalanceNotification().getMSISDN())
			MSISDN = bal.getBalanceNotification().getMSISDN().getMSISDN();
		logger.debug( (new StringBuilder()).append("1    InvokeService for transID:").append(transID).append(" and MSISDN : ").append(MSISDN).toString());

		Long startTime  = System.currentTimeMillis();

		Response response = null;
		logger.debug( (new StringBuilder()).append("2    Setting User name Password for transID:").append(transID).append(" and MSISDN : ").append(MSISDN).toString());
		AuthHeader auth = new AuthHeader();

		/**
		 * Setting the values from the property file
		 */
		auth.setUsername(userName);
		auth.setPassword(password);

		AuthHeaderE authE = new AuthHeaderE();
		authE.setAuthHeader( auth );

		logger.debug( (new StringBuilder()).append("3     Started Setting System propery trustStore name trustStorePassword for transID:").append(transID).append(" and MSISDN : ").append(MSISDN).toString());
		System.setProperty("javax.net.ssl.trustStore", trustStorePath);
		System.setProperty("javax.net.ssl.trustStorePassword", trustStorePswd);
		logger.debug( (new StringBuilder()).append("4     Compleeted Setting System propery trustStore name trustStorePassword for transID:").append(transID).append(" and MSISDN : ").append(MSISDN).toString());
		logger.debug( (new StringBuilder()).append("5    Creating EndpointReference for transID:").append(transID).append(" and MSISDN : ").append(MSISDN).toString());
		EndpointReference epr = new EndpointReference(EXTERNAL_SYSTEM_URL);
		logger.debug( (new StringBuilder()).append("6    Creating BalanceNotifiCustomStub for transID:").append(transID).append(" and MSISDN : ").append(MSISDN).toString());
		BalanceNotifiCustomStub stub = new BalanceNotifiCustomStub();
		logger.debug( (new StringBuilder()).append("7    Setting EPR to ServiceClient for transID:").append(transID).append(" and MSISDN : ").append(MSISDN).toString());
		stub._getServiceClient().getOptions().setTo(epr);
		logger.debug( (new StringBuilder()).append("8     Sending request to MSISDN:").append(MSISDN).append(" to URL : ").append(EXTERNAL_SYSTEM_URL).toString());
		/*
		 * TODO: 2nd way of SSL hand shaking: need to do some R&D on this.
		 * 
		 * AuthSSLProtocolSocketFactory authSSLFactory = new AuthSSLProtocolSocketFactory(new URL("keystore URL"), "pwd", new URL("truststore URL"), "pwd");
		Protocol authhttps = new Protocol ("https", authSSLFactory, 443);
		Protocol.registerProtocol("https", authhttps);*/


		BalanceNotificationResponse balResponse = stub.notifyBalance (bal, authE);
		logger.debug( (new StringBuilder()).append("9    BalanceNotificationResponse after invocation for transID:").append(transID).append(" and MSISDN : ").append(MSISDN).toString());

		if(null != balResponse) {

			//response = balResponse.getBalanceNotificationResponse();
			response = balResponse.getBalanceNotificationResponse();
		}
		logger.info("BBalanceNotification success"+(int) (System.currentTimeMillis() - startTime)+" ms");
		logger.debug( (new StringBuilder()).append("10    Returning Response after invocation for transID:").append(transID).append(" and MSISDN : ").append(MSISDN).toString());
		return response;
	}
}
