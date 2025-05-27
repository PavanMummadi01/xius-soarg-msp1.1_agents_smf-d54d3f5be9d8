package com.xius.smf.ne;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPElement;


import org.apache.axis.AxisFault;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.ne.NotificationManagement_wsdl.NotificationManagementBindingStub;
import com.xius.ne.NotificationManagement_xsd.NotifyMessageRequest;
import com.xius.ne.NotificationManagement_xsd.NotifyMessageResponse;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;

public class NEServiceInvoker {
	static Logger logger = LogManager.getLogger("NEServiceInvoker");
	 static final String NE_WEBSERVICE_URL = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.NE_URL);
	 static final String messageHeaderNameSpace = "http://ne.xius.com/common/header/HeaderDetails.xsd";


	 public static NotifyMessageResponse invokeNotifyMessageFromNE(NotifyMessageRequest notifyMessageRequest,TempMessageInfo smsData){
			
		 
			NotificationManagementBindingStub binding = null;
			NotifyMessageResponse notifyMessageResponse = new NotifyMessageResponse();
			try {
				String neURL = InitiateAll.getSMFProps().getProperty("ne.webservice.url");
				
				if(logger.isDebugEnabled())
					logger.debug("In invokeNotifyMessageFromNE()----URL--"+neURL);
				
				java.net.URL url=new java.net.URL(neURL);
				binding = (NotificationManagementBindingStub) new com.xius.ne.NotificationManagement_wsdl.NotificationManagementServiceLocator().getNotificationManagementPort(url);
				
	
				String carrierId = smsData.getNetworkId();
				String userId = smsData.getLoginId();
		
				SOAPHeaderElement header = new SOAPHeaderElement(messageHeaderNameSpace,"messageHeader");
				header.setActor(null);
				header.setPrefix("head");
				SOAPElement node1;
				SOAPElement c_node1;
				SOAPElement c_node2;
				SOAPElement c_node3;
				SOAPElement c_node4;
				SOAPElement c_node5;
				node1 = header.addChildElement("trackingMessageHeader");

				c_node1 = node1.addChildElement("messageId");
				c_node1.addTextNode("23023"); // dummy value

				c_node2 = node1.addChildElement("carrierId");
				c_node2.addTextNode(carrierId);

				/*String nwName = GetNetworkName.getName(cursorData.getNetwork_id().toString());
				logger.info("NetworkName read from Property File ChangeMSISDNRetryProcessor: "+nwName);
				c_node3 = node1.addChildElement("networkName");
				c_node3.addTextNode(nwName);*/

				c_node4 = node1.addChildElement("userId");
				c_node4.addTextNode(userId);

				/*c_node5 = node1.addChildElement("password");
				c_node5.addTextNode("11111111");*/

				binding.setHeader(header);
				//setting the time out value			
				binding.setTimeout(getNETimeOut());
				
				//set the request if not set in other class.
				notifyMessageResponse = binding.notifyMessage(notifyMessageRequest);
				
				if (notifyMessageResponse!=null){
					logger.debug("transID:"+notifyMessageResponse.getTransID());
				}
			}	
			catch (AxisFault e) {
					logger.error( "Got AxisFault in invokeNotifyMessageFromNE");
					logger.error( Utilities.getStackTrace(e));
				
				
			} catch (MalformedURLException e) {
				logger.error( "Got MalformedURLException invokeNotifyMessageFromNE");
				logger.error( Utilities.getStackTrace(e));
				
			} catch (ServiceException e) {
				logger.error( "Got ServiceException invokeNotifyMessageFromNE");
				logger.error( Utilities.getStackTrace(e));
				
			} catch (RemoteException e) {
				logger.error("Got RemoteException invokeNotifyMessageFromNE");
				logger.error( Utilities.getStackTrace(e));
				
			} catch (Exception e) {
				logger.error( "Got Exception invokeNotifyMessageFromNE");
				logger.error( Utilities.getStackTrace(e));
				
			}
			return notifyMessageResponse;
		}
	 
	 private static int getNETimeOut()
		{
//			settng default time out value as 90 seconds
			int timeOut = 90000;
			try{
				String neTimeOut = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.NE_TIMEOUT);
				timeOut = Integer.parseInt(neTimeOut)*1000;
			}
			catch (Exception e) {
				logger.error( "Invalid time out value,setting default value 90 sec");
				timeOut = 90000;
			}
			return timeOut;
		}
}
