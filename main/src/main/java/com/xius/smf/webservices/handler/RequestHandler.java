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

import net.bcgi.common.jmon.monitor.BCGLevel;
import net.bcgi.common.jmon.monitor.BCGLogger;

import org.apache.axis.AxisFault;
import org.apache.axis.MessageContext;
import org.apache.axis.handlers.BasicHandler;

import com.xius.agent.smf.common.error.errordetails.ErrorDetailsType;
import com.xius.smf.exceptions.SMFAgentException;
//import com.xius.smf.exception.SMFAgentException;
import com.xius.smf.utils.Utilities;
import com.xius.smf.validate.XMLValidator;

*//**
 * @author VB Kumar $Author: kiranmai.kode $
 * @version $Id: //depot/xb/MSP1.0/MSP-AWS/agents/smf/main/src/main/java/com/xius/smf/webservices/handler/RequestHandler.java#2 $ $DateTime: 2023/12/08 12:29:41 $ $Change: 226227 $
 *//*

*//**
 * @author veerak
 *
 *//*
public class RequestHandler extends BasicHandler {

	private static final long serialVersionUID = 1L;
	private static BCGLogger logger = BCGLogger.getBCGLogger("RequestHandler");

	 (non-Javadoc)
	 * @see org.apache.axis.Handler#invoke(org.apache.axis.MessageContext)
	 
	public void invoke(MessageContext inMessage) throws AxisFault {
		
		try {
			
			new XMLValidator().validateRequest(inMessage);
			
		} catch (SMFAgentException agentException) {
			
			//ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			logger.log(BCGLevel.ERROR,  Utilities.getStackTrace(agentException));
			throw Utilities.setErrorDetailsType(agentException);
		} catch (Exception exception) {
			logger.log(BCGLevel.ERROR,  Utilities.getStackTrace(exception));
			throw Utilities.fillErrorDetailsType("40000", null);
		}

	}
}*/