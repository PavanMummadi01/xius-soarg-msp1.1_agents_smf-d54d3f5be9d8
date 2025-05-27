/**
 * Copyright   2006 New Wireless Services, Inc.
 * All rights reserved. These computer programs, listings, and
 * specifications are the property of New Wireless Services,
 * Inc. and may not be copied, stored, used or transmitted, in
 * whole or in part, in any for or by any means, without the
 * prior written permission of New Wireless Services, Inc.
 *
 */
package com.xius.smf.scoket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.Utilities;

/**
File Name:TCPClient.java
Description:
@Author : srikanthm
@Created Date : Jul 25, 2011
@Modified By:
@Modified Date:
@Modifications:
@Reason for Modification
 */
public class TCPClient {
	static Logger logger = LogManager.getLogger("TCPClient");

	/**
	 * @param requestString
	 * @return
	 * @throws SMFAgentException
	 */
	public String socketCommunication(String requestString)throws SMFAgentException
	{
		
		Socket socketObj=null;
		String host = null;
		String port=null;
		
        try {
			//get host and portNumber from property file
			host= InitiateAll.getSMFProps().getProperty("USSD_GW_Host");
			port = InitiateAll.getSMFProps().getProperty("USSD_GW_PortNumber");
			
			int portNumber = Integer.parseInt(port.trim());
			if(logger.isDebugEnabled())
				logger.debug( "Host  = "+ host + " Port Number = "+ portNumber);
			
			socketObj = new Socket(host,portNumber);
		} catch (UnknownHostException e) {
			logger.error("UnknownHostException : " + Utilities.getStackTrace(e));
			throw new SMFAgentException();
		} catch (IOException e) {
			logger.error("SocketException : " + Utilities.getStackTrace(e));

			throw new SMFAgentException();
		}catch (Exception ex) {
			logger.error( "Cannont connect to Host "+host+" at port " + port+" :"+Utilities.getStackTrace(ex));
			throw new SMFAgentException();

		} 
		BufferedReader reader = null;
		PrintWriter writer = null;
		String responseString = null;
		try {
			
			writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socketObj.getOutputStream())), true);  
			writer.println(requestString);
			reader = new BufferedReader(new InputStreamReader(socketObj.getInputStream()));			
			responseString = reader.readLine();


		} catch (SocketException ex) {
			logger.error( "SocketException : " + Utilities.getStackTrace(ex));

			throw new SMFAgentException();

		} catch (SocketTimeoutException ex) {
			logger.error( "SocketTimeoutException : " + Utilities.getStackTrace(ex));

			throw new SMFAgentException();

		} catch (Exception ex) {
			//errorCode = "1002";
			logger.error( "Exception : " + Utilities.getStackTrace(ex));
			if(ex instanceof SMFAgentException)
				throw (SMFAgentException)ex;
			else
			{
				throw new SMFAgentException();
			}

		} finally {

			try {
				if (socketObj != null) {
					socketObj.close();
				}
			} catch (Exception ex) {
				logger.error( "Exception in closing Socket");

				throw new SMFAgentException();
			}
		}
		if(logger.isDebugEnabled())
			logger.info("Response Recieved from USSD Gateway: "+responseString);
		
		return responseString;
	}

}
