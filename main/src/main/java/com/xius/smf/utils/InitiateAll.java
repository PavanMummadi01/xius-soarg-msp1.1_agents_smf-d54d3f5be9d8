/**
 * Copyright   2006 New Wireless Services, Inc.
 * All rights reserved. These computer programs, listings, and
 * specificaions are the property of New Wireless Services,
 * Inc. and may not be copied, stored, used or transmitted, in
 * whole or in part, in any for or by any means, without the
 * prior written permission of New Wireless Services, Inc.
 *
 */
package com.xius.smf.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.xius.smf.exceptions.SMFAgentException;
//import com.xius.smf.job.JobScheduler;
import com.xius.smf.scoket.TcpIpConfig;
/**
 * this class is used to load the startup data.
@Author : srikanthm $Author: kiranmai.kode $
@Date : Oct 12, 2009
 */
/**
 * @author srikanthm
 *
 */

@Configuration
@Order(1)
public class InitiateAll {
	/**
	 * Logger for this class
	 */
	private static  Logger log = LogManager.getLogger("InitiateAll");
	@Value("${config.directory:conf/}")
    private String configDirectory;

    @Value("${smfagent.properties.file:smfagent.properties}")
    private String smfPropertiesFile;

    @Value("${error.details.file:ErrorDetails.properties}")
    private String errorDetailsFile;

	static Properties SMFProps = null;
	static Properties errorProps = null;
	//private static String server_home = System.getProperty("jboss.server.home.dir");
	private static String PROPERTY_FILE_DIR ="conf/";
	private static String PROPERTY_DATA_FILE = "smfagent.properties";
	private static String ERR_DET_FILE = "ErrorDetails.properties";
	public static TcpIpConfig tcpIpConfig;
	public static Properties getSMFProps() {
		return SMFProps;
	}
	public static void setSMFProps() throws Exception {
		log.info("in setSMFProps method to read the smfagent.properties");
		FileInputStream inputStream = new FileInputStream(PROPERTY_FILE_DIR + PROPERTY_DATA_FILE);
		SMFProps = new Properties();
		SMFProps.load(inputStream);
	}
	public static Properties getErrorProps() {
		return errorProps;
	}
	public static void setErrorProps(InputStream inputStream) throws Exception {
		errorProps = new Properties();
		errorProps.load(inputStream);
	}

	@Bean
    public void initializeConfig() throws Exception {
		loadAll();
        log.info("All properties loaded successfully");
    }
	public void loadAll() throws Exception {
		setSMFProps();
		try {
			//InputStream inputStream = new FileInputStream("config/ErrorDetails.properties");
			
			//InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(ERR_DET_FILE);
			//setSMFProps();
			//setErrorProps(inputStream);


			// checking for the switch
			String EXP_NOTIFICATION_SWITCH = SMFProps.getProperty( SMFAgentConstants.EXP_NOTIFICATION_SWITCH );

			if(EXP_NOTIFICATION_SWITCH.equals(SMFAgentConstants.EXP_SWITCH_VALUE_ON)) {
				
				setTcpIpConfig();
			}
			//runSchedular();

		} catch (Exception _exp) {
			log.error( "Failed to load master data.."
					+ Utilities.getStackTrace(_exp));
			throw _exp;
		}
	}

	private void setTcpIpConfig() {

		tcpIpConfig = new TcpIpConfig();

		String host= InitiateAll.getSMFProps().getProperty("DCCS_HOST");
		String port = InitiateAll.getSMFProps().getProperty("DCCS_PORT");

		if( Utilities.isNull( host) || Utilities.isNull( port) ) {

			log.info( "<<<Error>>> either DCCS_HOST or DCCS_PORT property should not be null");
			System.exit(0);
		}
		tcpIpConfig.setUrlAddress(host);
		tcpIpConfig.setPort(new Integer(port));

		String readTimeOut = InitiateAll.getSMFProps().getProperty("DCCS_SOCKET_READ_TIMEOUT");
		String connectionTimeOut = InitiateAll.getSMFProps().getProperty("DCCS_SOCKET_CONNECT_TIMEOUT");
		String maxRespBytes = InitiateAll.getSMFProps().getProperty("DCCS_MAX_SIZE_OF_RESP_BYTES");

		if( Utilities.isNull( readTimeOut) ) {

			log.warn( "<<<Warning>>> property DCCS_SOCKET_READ_TIMEOUT is null... due this setting default value 30000 ");
			tcpIpConfig.setReadTimeout(30000);
		} else {

			try {

				tcpIpConfig.setReadTimeout( Integer.parseInt( readTimeOut ) );
			} catch (NumberFormatException e) {

				log.warn( "<<<Warning>>> property DCCS_SOCKET_READ_TIMEOUT is invalid... due this setting default value 30000 ");
				tcpIpConfig.setReadTimeout(30000);
			}
		}

		if( Utilities.isNull( connectionTimeOut) ) {

			log.warn( "<<<Warning>>> property DCCS_SOCKET_CONNECT_TIMEOUT is null... due this setting default value 20000 ");
			tcpIpConfig.setReadTimeout(20000);
		} else {

			try {

				tcpIpConfig.setReadTimeout( Integer.parseInt( connectionTimeOut ) );
			} catch (NumberFormatException e) {

				log.warn( "<<<Warning>>> property DCCS_SOCKET_CONNECT_TIMEOUT is invalid... due this setting default value 20000 ");
				tcpIpConfig.setReadTimeout(20000);
			}
		}

		if( Utilities.isNull( maxRespBytes) ) {

			log.warn( "<<<Warning>>> property DCCS_MAX_SIZE_OF_RESP_BYTES is null... due this setting default value 1024 ");
			tcpIpConfig.setReadTimeout(1024);
		} else {

			try {

				tcpIpConfig.setMaxSizeOfRespBytes( Integer.parseInt( maxRespBytes ) );
			} catch (NumberFormatException e) {

				log.warn( "<<<Warning>>> property DCCS_MAX_SIZE_OF_RESP_BYTES is invalid... due this setting default value 1024 ");
				tcpIpConfig.setReadTimeout(1024);
			}
		}
	}


	public void runSchedular(){
		if(null != SMFProps){
			// run the schedular
			//JobScheduler jobScheduler = new JobScheduler();
			//jobScheduler.startJobs("1");


		}
	}


	public static String sendNotification(String networkId) throws SMFAgentException {
		String freeAppPublicityId = null;
		String flag = null;
		String isAttachATPBasedOnNW=InitiateAll.getSMFProps().getProperty("isAttachATPBasedOnNW");
		if(isAttachATPBasedOnNW!=null && isAttachATPBasedOnNW.trim().length()>0){
		 HashMap<Integer,String> ndString=new HashMap<Integer,String>();
			String[] valuesOfNw=isAttachATPBasedOnNW.split("#");
			for (int i = 0; i < valuesOfNw.length; i++) {
				ndString.put(i, valuesOfNw[i]);
				if(ndString.get(i).contains(networkId+":YES")){
					String[] atpdetails=ndString.get(i).split(":");
					flag=atpdetails[1];
					freeAppPublicityId=atpdetails[2];
					break;
				}
			}
			if(flag!=null && flag.equalsIgnoreCase("YES") && freeAppPublicityId==null)
				throw new SMFAgentException("Provide FreeATP Name in Property File - isAttachATPBasedOnNW","40000");
		}else {
			log.info("Provide FreeATP realted Deatils in Property File - isAttachATPBasedOnNW");
		}
		return freeAppPublicityId;
	}
}