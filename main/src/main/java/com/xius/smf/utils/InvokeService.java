package com.xius.smf.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/*import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.Name;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPMessage;

import net.bcgi.common.jmon.monitor.BCGLevel;
import net.bcgi.common.jmon.monitor.BCGLogger;

import org.apache.axis.AxisEngine;
import org.apache.axis.AxisFault;
import org.apache.axis.AxisProperties;
import org.apache.axis.Constants;
import org.apache.axis.Message;
import org.apache.axis.MessageContext;
import org.apache.axis.message.MessageElement;
import org.apache.axis.message.SOAPHeader;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.axis.session.Session;
import org.w3c.dom.Element;

import com.tunetalk.topup.notification.BalanceNotification;
import com.tunetalk.topup.notification.NotificationBindingStub;
import com.tunetalk.topup.notification.NotificationServiceLocator;
import com.tunetalk.topup.schema.common.Response;*/

/**
File Name:InvokeService.java
Description:This class is used to call balance notification external api 
@Author : srikanthm
@Created Date : Jul 28, 2011
@Modified By:
@Modified Date:
@Modifications:
@Reason for Modification
 */

public class InvokeService {
	
	private static  Logger log = LogManager.getLogger("InvokeService");

	/*private static String serverURL = null;
	private static String user = null;
	private static String password = null;
	private static String timeOut = null;
	NotificationBindingStub stub = null;

	static {

		serverURL = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.EXTERNAL_SYSTEM_URL );
		user = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.EXTERNAL_SYSTEM_USER );
		password = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.EXTERNAL_SYSTEM_PASSWORD );
		timeOut = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.LOW_BALANCE_NOTIFICATION_TIMEOUT );
	}

	public Response invokeService(BalanceNotification balNotification) throws AxisFault {
		
		Response response = null;
		Long startTime  = System.currentTimeMillis();
		java.net.URL url = null;
		try {
			url = new java.net.URL( serverURL );
		} catch (MalformedURLException e) {

			logger.log(BCGLevel.DEBUG,  Utilities.getStackTrace( e ));
		}
		
		try {

			System.setProperty("javax.net.ssl.trustStore","D:/workreleated/Releases/mytruststore");
			System.setProperty("javax.net.ssl.trustStorePassword","changeit");
			stub.setHeader(getSOAPHeaderElement());
			stub = (NotificationBindingStub) new NotificationServiceLocator().getNotificationPort(url);
		} catch (Exception e) {

			logger.log(BCGLevel.DEBUG,  Utilities.getStackTrace( e ));
		}

		// This would set time out for getting external system's response 
		if( Utilities.isNull( timeOut ) == false ) {

			stub.setTimeout( Integer.parseInt( timeOut.trim() ) );			
		}
		// AxisProperties.setProperty("axis.socketSecureFactory","org.apache.axis.components.net.SunFakeTrustSocketFactory");

		try {
			
			
			response  = stub.notifyBalance(balNotification);
			logger.log(BCGLevel.DEBUG,"Invoked Service ");
		} catch (RemoteException e) {

			logger.log(BCGLevel.DEBUG,  Utilities.getStackTrace( e ));
		}
		^.*logger\ .*$\n?("InvokeService success",  (int) (System.currentTimeMillis() - startTime),"0000");
		return response;
	}

	public static SOAPHeaderElement getSOAPHeaderElement() 
			throws Exception {


		String authHeaderNameSpace = "http://topup.tunetalk.com/schema/common";	 

		
		
		MessageElement authHeaderEl = new MessageElement( new QName("AuthHeader") );
		SOAPHeaderElement authHeader = new SOAPHeaderElement( authHeaderEl );
		
			
		//Element wsaElm = addToElement.getOwnerDocument().createElementNS(authHeaderNameSpace, "AuthHeader");
		
		SOAPFactory factory = SOAPFactory.newInstance(); 
		Name attrName = factory.createName( "AuthHeader", authHeaderNameSpace, "");
		
		
		SOAPHeaderElement authHeader = new SOAPHeaderElement( attrName );
		
		//SOAPHeaderElement authHeader = new SOAPHeaderElement(new QName("AuthHeader"));
		
		SOAPHeaderElement authHeader = new SOAPHeaderElement( authHeaderNameSpace, "AuthHeader" );
		
		authHeader.setNamespaceURI( authHeaderNameSpace );

		authHeader.addChildElement("username");
		authHeader.addChildElement("password");    

		@SuppressWarnings("unchecked")
		Iterator<MessageElement> authHeaderIteratort = authHeader.getChildElements();

		while( authHeaderIteratort.hasNext() ) {

			MessageElement authHeaderHeaderEl = null;

			authHeaderHeaderEl = (MessageElement)authHeaderIteratort.next();

			if( authHeaderHeaderEl.getName().equalsIgnoreCase("username")) {

				authHeaderHeaderEl.addTextNode( user );
			}
			if( authHeaderHeaderEl.getName().equalsIgnoreCase("password")) {

				authHeaderHeaderEl.addTextNode( password );
			}    						

		}
		
		SOAPFactory factory = SOAPFactory.newInstance(); 
		Name mustAttr = factory.createName(Constants.ATTR_MUST_UNDERSTAND, Constants.NS_PREFIX_SOAP_ENV, "");
		
		System.out.println("URL : " + mustAttr.getURI() );
		//authHeader.removeAttribute( mustAttr );
		
		MessageContext context=  AxisEngine.getCurrentMessageContext();
		SOAPMessage sm = context.getMessage();
		Message m = context.getCurrentMessage();
		SOAPEnvelope env = m.getSOAPEnvelope();
		javax.xml.soap.SOAPHeader hd = env.getHeader();
		
		hd.removeAttribute( mustAttr );
		
		return authHeader;
	}*/
}