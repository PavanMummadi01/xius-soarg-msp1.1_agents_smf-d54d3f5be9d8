/**
 * Copyright   2012 XIUS.
 * All rights reserved. These computer programs, listings, and
 * specifications are the property of XIUS. 
 * And may not be copied, stored, used or transmitted, in
 * whole or in part, in any for or by any means, without the
 * prior written permission of XIUS.
 *
 */
/**
* ${todo}
* @author srikanthm $Author: kiranmai.kode $
* @version $Id: //depot/xb/MSP1.0/MSP-AWS/agents/smf/main/src/main/java/com/xius/smf/utils/HeaderUtils.java#2 $ 
* $DateTime: 2023/12/08 12:29:41 $Change:  $
*/

package com.xius.smf.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPHeader;

import org.apache.axis.MessageContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 

public class HeaderUtils {
	/**
	 * Logger for this class
	 */
	private static final Logger log = LogManager.getLogger(HeaderUtils.class.getSimpleName());
	public static HeaderDetails prepareHeaderObject(MessageContext msgContext) {

		HeaderDetails details = new HeaderDetails();
		SOAPHeader header = null;

		try {

			header = msgContext.getMessage().getSOAPHeader();

			if (log.isDebugEnabled()) {

				log.debug("Header in prepareHeaderObject********* " + details);
			}
		} catch (Exception _exp) {

			//log.log(BCGLevel.ERROR, "Exception ..." + Utilities.getStackTrace(_exp));
		}

		processHeader(msgContext, header, details);
		return details;
	}

	/**
	 * @param msgContext
	 * @param header
	 * @param details
	 */
	private static void processHeader(MessageContext msgContext, SOAPHeader header, HeaderDetails details) {

		if (log.isDebugEnabled()) {

			log.debug("processHeader(MessageContext, SOAPHeader, HeaderDetails) - Bang processing SOAPHeader");
		}

		Iterator itera = header.getChildElements();
		SOAPElement element = getTrackingMessageHeader(itera);

		if (null != element) {

			for (Iterator iterator = element.getChildElements(); iterator.hasNext();) {

				SOAPElement elements = (SOAPElement) iterator.next();

				fillHeaderDetails(elements, details);
				if (log.isDebugEnabled()){

					log.debug("processHeader(MessageContext, SOAPHeader, HeaderDetails) - elements.getElementName().getLocalName()::"
							+ elements.getElementName().getLocalName());
				}

				if (log.isDebugEnabled()) {
					
					log.debug("processHeader(MessageContext, SOAPHeader, HeaderDetails) - elements.getValue()::"
							+ elements.getValue());
				}
			}
		}
		
		details.setIpAddress(msgContext.getStrProp(org.apache.axis.Constants.MC_REMOTE_ADDR));
		if (log.isDebugEnabled()) {
			
			log.debug("processHeader(MessageContext, SOAPHeader, HeaderDetails) - End of processing SOAPHeader");
		}
	}
	
	/**
	 * Mapping values from WebService layer to Native xml layer as below
	 * messageId ==>REQUESTID
	 * carrierId ==>NETWORKID
	 * userId ==> LOGINID
	 * @param element
	 * @param details
	 */
	private static void fillHeaderDetails(SOAPElement element, HeaderDetails details) {

		if ("messageId".equalsIgnoreCase(element.getElementName().getLocalName())) {

			details.setRequestID(element.getValue().trim());
		} else if ("carrierId".equalsIgnoreCase(element.getElementName().getLocalName())) {
			
			details.setNetworkID(new Long(element.getValue().trim()));
		} else if ("userId".equalsIgnoreCase(element.getElementName().getLocalName())) {

			details.setLoginID(element.getValue());
		} else if ("timeToLive".equalsIgnoreCase(element.getElementName().getLocalName())) {

			details.setTimeToLive(element.getValue());
			//details.setTimeToLive("300");
		} else if ("messageDateTimeStamp".equalsIgnoreCase(element.getElementName().getLocalName())) {

			details.setMessageDateTimeStamp(messageTimeStamp());
		} else if ("password".equalsIgnoreCase(element.getElementName().getLocalName())) {
	
			details.setPassword(element.getValue());
		}

	}

	/**
	 * @param iterator
	 * @return
	 */
	private static SOAPElement getTrackingMessageHeader(Iterator iterator) {
		
		while (iterator.hasNext()) {
			
			SOAPElement element = (SOAPElement) iterator.next();
			if (element.getElementName().getLocalName().indexOf("trackingMessageHeader") >= 0)
				return element;
			else
				return getTrackingMessageHeader(element.getChildElements());
		}

		return null;
	}

	/**
	 * @return result String
	 */
	public static String messageTimeStamp() {
		
		Date today =  new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
		today = new Date();
		String result = formatter.format(today);
		
		return result;

	}

	/**
	 * @param messageContext
	 * @param soapHeader
	 * @return
	 */
	public static HeaderDetails prepareResponseHeaderObject(MessageContext messageContext,SOAPHeader soapHeader) {
		
		HeaderDetails details = new HeaderDetails();
		processHeader(messageContext, soapHeader, details);

		return details;
	}
}

