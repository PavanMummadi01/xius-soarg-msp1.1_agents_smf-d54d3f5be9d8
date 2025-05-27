/**
 * Copyright   2006 New Wireless Services, Inc.
 *
 * All rights reserved. These computer programs, listings, and
 * specificaions are the property of New Wireless Services,
 * Inc. and may not be copied, stored, used or transmitted, in
 * whole or in part, in any for or by any means, without the
 * prior written permission of New Wireless Services, Inc.
 *
 *//*

package com.xius.smf.webservices.handler;

import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import net.bcgi.common.jmon.monitor.BCGLevel;
import net.bcgi.common.jmon.monitor.BCGLogger;

import org.apache.axis.AxisFault;
import org.apache.axis.MessageContext;
import org.apache.axis.handlers.BasicHandler;
import org.apache.axis.message.MessageElement;
import org.apache.axis.message.PrefixedQName;
import org.apache.axis.message.SOAPEnvelope;
import org.apache.axis.message.SOAPHeader;
import org.apache.axis.message.SOAPHeaderElement;

import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.HeaderUtils;
import com.xius.smf.utils.Utilities;


*//**
 * @author VB Kumar $Author: kiranmai.kode $
 * @version $Id: //depot/xb/MSP1.0/MSP-AWS/agents/smf/main/src/main/java/com/xius/smf/webservices/handler/ResponseHeaderHandler.java#2 $
 * $DateTime: 2023/12/08 12:29:41 $ $Change: 226227 $
 *//*

public class ResponseHeaderHandler extends BasicHandler{

	private static BCGLogger logger = BCGLogger.getBCGLogger("ResponseHeaderHandler");
	private static String HDR_NAMESPACE = "http://pcrf.xbus.xiusbcgi.com/common/header/HeaderDetails.xsd";

	public void invoke(MessageContext messageContext) throws AxisFault {
		HeaderDetails headerDetails = null;
		// TODO Auto-generated method stub
		SOAPMessage msg = (SOAPMessage)messageContext.getMessage();
		org.apache.axis.SOAPPart part = (org.apache.axis.SOAPPart)msg.getSOAPPart();
		SOAPEnvelope envelope;
		try {

			if (logger.isDebugEnabled())
			{
				logger.log(BCGLevel.DEBUG,"in ResponseHeaderHandler");
			}
			envelope = (SOAPEnvelope)part.getEnvelope();
			SOAPHeader header = (SOAPHeader)envelope.getHeader();
			SOAPHeaderElement messageHeader = (SOAPHeaderElement) header.addHeaderElement(new PrefixedQName(HDR_NAMESPACE, "messageHeader", "head"));
			messageHeader.setActor(null);
			MessageElement trackingMessageHeader = new MessageElement(new PrefixedQName(HDR_NAMESPACE,"trackingMessageHeader", "head"));
			SOAPHeader soapHeader = (SOAPHeader)messageContext.getRequestMessage().getSOAPHeader();
			headerDetails=HeaderUtils.prepareResponseHeaderObject(messageContext, soapHeader);

			if(headerDetails!=null){
				if(null !=headerDetails.getRequestID()){
					MessageElement messageId = new MessageElement(new PrefixedQName(HDR_NAMESPACE, "messageId", "head"));
					messageId.setValue(headerDetails.getRequestID());
					trackingMessageHeader.addChildElement(messageId);
				}

				if(null !=headerDetails.getNetworkID()){
					MessageElement carrierId = new MessageElement(new PrefixedQName(HDR_NAMESPACE, "carrierId", "head"));
					carrierId.setValue(Long.toString(headerDetails.getNetworkID()));
					trackingMessageHeader.addChildElement(carrierId);
				}

				if(null != headerDetails.getLoginID()){
					MessageElement userId = new MessageElement(new PrefixedQName(HDR_NAMESPACE, "userId", "head"));
					userId.setValue(headerDetails.getLoginID());
					trackingMessageHeader.addChildElement(userId);
				}

				MessageElement password = new MessageElement(new PrefixedQName(HDR_NAMESPACE, "password", "head"));
				password.setValue("");
				trackingMessageHeader.addChildElement(password);

				if(null !=headerDetails.getTimeToLive()){
					MessageElement timeToLive = new MessageElement(new PrefixedQName(HDR_NAMESPACE, "timeToLive", "head"));
					timeToLive.setValue(headerDetails.getTimeToLive());
					trackingMessageHeader.addChildElement(timeToLive);
				}

				if(null !=headerDetails.getMessageDateTimeStamp()){
					MessageElement messageDateTimeStamp = new MessageElement(new PrefixedQName(HDR_NAMESPACE, "messageDateTimeStamp", "head"));
					messageDateTimeStamp.setValue(headerDetails.getMessageDateTimeStamp());
					trackingMessageHeader.addChildElement(messageDateTimeStamp);
				}
				messageHeader.addChildElement(trackingMessageHeader);
			}

			if(logger.isEnabledFor(BCGLevel.DEBUG)){

				StringBuilder builder = new StringBuilder();
				builder.append("Response from Agent =======>\n").append( null != messageContext.getResponseMessage()?messageContext.getResponseMessage().getSOAPHeader():"Response header is missing..").append("\n");
				builder.append("\n").append( null != messageContext.getResponseMessage()?messageContext.getResponseMessage().getSOAPBody():"Response data is missing...").append("\n");

				logger.log(BCGLevel.DEBUG, builder.toString());
			}
		} catch (SOAPException e) {
			logger.log(BCGLevel.ERROR, "SOAPException occurred.."	+ Utilities.getStackTrace(e));
			throw Utilities.fillErrorDetailsType("40000", null);	
		} catch (Exception e) {
			logger.log(BCGLevel.ERROR, "Exception occurred.."	+ Utilities.getStackTrace(e));	
			throw Utilities.fillErrorDetailsType("40000", null);	
		}

	}

}*/