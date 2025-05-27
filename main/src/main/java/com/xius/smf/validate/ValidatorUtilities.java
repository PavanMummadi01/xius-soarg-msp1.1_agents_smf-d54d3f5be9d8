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
* @version $Id: //depot/xb/MSP1.0/MSP-AWS/agents/smf/main/src/main/java/com/xius/smf/validate/ValidatorUtilities.java#2 $ 
* $DateTime: 2023/12/08 12:29:41 $Change:  $
*/

package com.xius.smf.validate;

import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;

import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;
 

public class ValidatorUtilities {
	private  static Logger logger = LogManager.getLogger("ValidatorUtilities");

	private static Schema schema;

	static{

		try {
			getSchema();
		} catch (SMFAgentException e) {
			e.printStackTrace();
		}
	}

	public static Schema getSchema() throws SMFAgentException{

		if(null != schema)
			return schema;

		Source[] src = new Source[5];
		try {
			src[0] = new StreamSource(ValidatorUtilities.class.getClassLoader().getResource(
					"HeaderDetails.xsd").openStream());
			src[1] = new StreamSource(ValidatorUtilities.class.getClassLoader().getResource(
			"ErrorDetails.xsd").openStream());
			
			src[2] = new StreamSource(ValidatorUtilities.class.getClassLoader().getResource(
			"SMFManagement.xsd").openStream());
             
			src[3] = new StreamSource(ValidatorUtilities.class.getClassLoader().getResource(
					"SMFReportsManagement.xsd").openStream());
			src[4] = new StreamSource(ValidatorUtilities.class.getClassLoader().getResource(
			"PostPaidManagement.xsd").openStream());


			
			SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			schema = factory.newSchema(src);

		} catch (IOException ex) {
			logger.error("IOExcepton in getSchema()"+Utilities.getStackTrace(ex));
			throw Utilities.setSMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE, null);
		} catch (SAXException e) {
			logger.error("SAXExcepton in getSchema()"+Utilities.getStackTrace(e));
			throw Utilities.setSMFAgentException(SMFAgentConstants.DEFAULT_ERROR_CODE, null);
		}

		if(logger.isDebugEnabled())
			logger.debug("For the first time schema initiation..."+schema);

		return schema;
	}
}

