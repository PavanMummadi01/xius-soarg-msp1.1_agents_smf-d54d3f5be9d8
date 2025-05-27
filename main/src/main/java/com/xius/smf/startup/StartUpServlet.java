/**
 * Copyright   2006 New Wireless Services, Inc.
 * All rights reserved. These computer programs, listings, and
 * specifications are the property of New Wireless Services,
 * Inc. and may not be copied, stored, used or transmitted, in
 * whole or in part, in any for or by any means, without the
 * prior written permission of New Wireless Services, Inc.
 *
 */



package com.xius.smf.startup;

//~--- non-JDK imports --------------------------------------------------------

import javax.servlet.http.HttpServlet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.Utilities;

public class StartUpServlet extends HttpServlet {

    /**
     * Logger for this class
     */
	static Logger logger = LogManager.getLogger("StartUpServlet");

    public void init() {
    	
        if (logger.isInfoEnabled()) {
            logger.info( "init Invoked .............................................");
        }
        try {

            // getting the startup data
        	 InitiateAll iniateAll = new InitiateAll();
        	 iniateAll.loadAll();
        } catch (Exception _exp) {
            logger.error( "StartUp servlet failed..." + Utilities.getStackTrace(_exp));
        }
    }
}
