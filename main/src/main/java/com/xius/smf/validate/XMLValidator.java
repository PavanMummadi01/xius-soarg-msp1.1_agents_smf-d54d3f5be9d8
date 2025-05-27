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
* @version $Id: //depot/xb/MSP1.0/MSP-AWS/agents/smf/main/src/main/java/com/xius/smf/validate/XMLValidator.java#2 $ 
* $DateTime: 2023/12/08 12:29:41 $Change:  $
*/

package com.xius.smf.validate;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.SOAPException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.validation.Schema;
import javax.xml.validation.Validator;

import org.apache.axis.Message;
import org.apache.axis.MessageContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;
 

public class XMLValidator {

private  static Logger logger = LogManager.getLogger("XMLValidator");

	public XMLValidator(){
		super();
	}

	private void validateXML(String xml) throws SMFAgentException {

		DocumentBuilderFactory documentBuilderFactory = null;
		DocumentBuilder parser;
		try {

			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilderFactory.setNamespaceAware(true);
			parser = documentBuilderFactory.newDocumentBuilder();

			InputSource inputSource = new InputSource(new StringReader(xml));
			Document document 		= parser.parse(inputSource);
			Schema schema 			= ValidatorUtilities.getSchema();
			
			if(null != schema){
				
				Validator validator 	= schema.newValidator();
				validator.validate(new DOMSource(document));
			}

		} catch (ParserConfigurationException e) {
			throw Utilities.setSMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE, e.getMessage());
		} catch (SAXException e) {
			String message = e.getMessage().indexOf(":") > 0 ? e.getMessage()
					.substring(e.getMessage().indexOf(":") + 1) : e
					.getMessage();
					throw Utilities.setSMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE, message);
		} catch (IOException e) {
			throw Utilities.setSMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE, e.getMessage());
		}
	}

	/**
	 * @param msgContext
	 * @throws SOAPException
	 * @throws SelfCareException
	 */
	public void validateRequest(MessageContext msgContext)throws SOAPException,SMFAgentException{

		Message inboundMsg = msgContext.getRequestMessage();

		if (logger.isDebugEnabled()) {

			StringBuilder builder = new StringBuilder(1000);
			builder.append("\n**** **** Message Header**** **** \n");
			builder.append(inboundMsg.getSOAPHeader());
			builder.append("\n**** **** Message Body**** **** \n");
			builder.append(inboundMsg.getSOAPBody());

			logger.debug( builder.toString());
		}

		//validating the header
		if(inboundMsg.getSOAPHeader()!= null && inboundMsg.getSOAPHeader().getFirstChild()!= null)
			validateXML(inboundMsg.getSOAPHeader().getFirstChild().toString()); 
		else
			throw Utilities.setSMFAgentException(SMFAgentConstants.MISSING_MSG_HEADER_ERROR_CODE, null);

		//validating the body
		if(inboundMsg.getSOAPBody()!= null && inboundMsg.getSOAPBody().getFirstChild()!= null)
			validateXML(inboundMsg.getSOAPBody().getFirstChild().toString()); 
		else
			throw Utilities.setSMFAgentException(SMFAgentConstants.INVALID_MSG_BODY_ERROR_CODE, null);
	}
}

