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

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.smf.utils.Utilities;

/**
File DCCSClient
Description:
@Author : Phani.Chavala
@Created Date : Oct 30, 2012
@Modified By:
@Modified Date:
@Modifications:
@Reason for Modification
 */
public class DCCSClient implements Runnable {

	static Logger logger = LogManager.getLogger("DCCSClient");

	private TcpIpConfig localTcpIpConfig;
	private String invocationRequest;
	private String msisdn;

	private String requestTemplate = "<Notification><DialogueId>NULL</DialogueId><MSISDN>XXXXXX</MSISDN><Event>NULL</Event><RequestedAction>NULL</RequestedAction><Response>NULL</Response></Notification >";

	public DCCSClient(){		
	}

	public DCCSClient(String msisdn){

		invocationRequest = requestTemplate.replaceAll("XXXXXX", msisdn);
		this.msisdn = msisdn;
	}

	public void run() {

		try {

			invoke();
		} catch (Exception e) {

			logger.error( Utilities.getStackTrace( e ) );
		}
	}

	private void invoke() throws Exception {

		long startTime= System.currentTimeMillis();

		String invocationResponse = null;

		Socket clientSocketOpenClose = null;
		BufferedOutputStream outputStreamOpenClose = null;
		BufferedInputStream inputStreamOpenClose = null;

		try {

			if(localTcpIpConfig != null) {

				clientSocketOpenClose = new Socket();
				// connect (with timeout)
				clientSocketOpenClose.connect(new InetSocketAddress(localTcpIpConfig.getUrlAddress(), localTcpIpConfig.getPort()), localTcpIpConfig.getConnectTimeout() );
				clientSocketOpenClose.setSoTimeout(localTcpIpConfig.getReadTimeout() );		

				outputStreamOpenClose = new BufferedOutputStream(clientSocketOpenClose.getOutputStream());

				byte[] rawRequest = Utilities.getBytesFromString(invocationRequest);

				if( logger.isInfoEnabled() ) {

					logger.info( ">>> Sent "+rawRequest.length+" bytes to DCCS and request is: "+ invocationRequest );
				}
				writeBytes(outputStreamOpenClose, rawRequest );

				inputStreamOpenClose = new BufferedInputStream(clientSocketOpenClose.getInputStream());

				byte[] bytesResponse = readBytes(inputStreamOpenClose, localTcpIpConfig.getMaxSizeOfRespBytes());		
				invocationResponse = Utilities.getStringFromByte(bytesResponse);

				if( null != bytesResponse ) {

					if( logger.isInfoEnabled() ) {

						logger.info( "<<< Received "+ bytesResponse.length +" bytes from DCCS and response is: "+invocationResponse);
					}
				} else {

					logger.error( "<<< Received null response from DCCS and response is: "+invocationResponse);
				}

				long totalTime = System.currentTimeMillis() - startTime;
				logger.info( "<<< ### >>>Time taken for MSISDN:"+this.msisdn+" in (milli secons) : " + totalTime);
			} else {
				
				logger.error( " localTcpIpConfig is NULL... possible may reason, property EXP_NOTIFICATION_SWITCH value may not on(should be on)");
			}
		} catch(SocketException socketException){

			if(outputStreamOpenClose != null) {

				outputStreamOpenClose.close();
			}
			if(inputStreamOpenClose != null) {

				inputStreamOpenClose.close();
			}
			if(clientSocketOpenClose != null){

				clientSocketOpenClose.close();
				clientSocketOpenClose = null;
			}

			throw socketException;

		} catch (Exception e) {

			throw e;
		} finally {

			if(outputStreamOpenClose != null)
				outputStreamOpenClose.close();
			if(inputStreamOpenClose != null)
				inputStreamOpenClose.close();
			if(clientSocketOpenClose != null)
				clientSocketOpenClose.close();
		}
	}
	public TcpIpConfig getLocalTcpIpConfig() {
		return localTcpIpConfig;
	}
	public void setLocalTcpIpConfig(TcpIpConfig localTcpIpConfig) {
		this.localTcpIpConfig = localTcpIpConfig;
	}

	private void writeBytes(OutputStream os, byte [] message) throws Exception{

		os.write(message);
		os.flush();
	}
	private byte [] readBytes(InputStream in,int maxSizeOfRespBytes) throws Exception
	{
		byte[] bytes 			= new byte[maxSizeOfRespBytes];
		int 	noOfBytesRead 	= 0;
		noOfBytesRead 			= in.read(bytes);
		if(noOfBytesRead>0)
			return Utilities.trim(bytes, noOfBytesRead);
		else
			return null;
	}
}
