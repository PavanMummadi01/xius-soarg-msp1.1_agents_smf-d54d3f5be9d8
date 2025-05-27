/**
 * Copyright   2006 New Wireless Services, Inc.
 * All rights reserved. These computer programs, listings, and
 * specifications are the property of New Wireless Services,
 * Inc. and may not be copied, stored, used or transmitted, in
 * whole or in part, in any for or by any means, without the
 * prior written permission of New Wireless Services, Inc.
 *
 */
package com.xius.smf.utils;

import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.config.ApplicationContextProvider;
import com.xius.smf.domaindata.IDomainDataBase;
import com.xius.smf.exceptions.SMFAgentException;

import net.bcgi.util.TimerUtil;
import net.bcgi.util.db.DataTypeNotSupportedException;
import net.bcgi.util.db.SPCall;
import net.bcgi.util.db.SPDefinition;
import net.bcgi.util.db.SPFactory;
import net.bcgi.util.db.SPReturnValues;


/**
File Name:ServiceUtils.java
Description:
@Author : srikanthm
@Created Date : Jul 28, 2011
@Modified By:
@Modified Date:
@Modifications:
@Reason for Modification
 */
public class ServiceUtils {

	/**
	 * Logger for this class
	 */
	private static  Logger logger = LogManager.getLogger(ServiceUtils.class.getSimpleName());


//	private static BeanFactory _sp_applicationBeanFactory = null;
//
//	public static String[] S_BCGI_SPRING    = {	"bcgi-domain-ds.xml",
//												"bcgi-domain-constants.xml",
//												"spf-ds-map.xml",
//												"proc-config.xml"};
//
//	public static final Integer I_DATASTORE_ERROR = new Integer(1);
//	public static final String S_DATASTORE_ERROR = "System Error";
//
//	static {
//		try {
//			_sp_applicationBeanFactory = new ClassPathXmlApplicationContext(S_BCGI_SPRING);
//		} catch (Exception ex) {
//			logger.log(BCGLevel.ERROR, "Exception while loading stored procedure maping files.."+ Utilities.getStackTrace(ex));
//		}
//	}
//
//	public static BeanFactory getApplicationBeanFactory() {
//		return _sp_applicationBeanFactory;
//	}

	/**
	 * Used to not to commit the changes automatically
	 * @param spName
	 * @param input
	 * @param output
	 * @return
	 */
	public static SPFactory executeSPWithOutCommit(String spName, IDomainDataBase input, IDomainDataBase output )
	throws SMFAgentException {

	if (logger.isDebugEnabled()) {
			logger.debug( "Stored Procedure Name : " + spName);
		}
		
		SPFactory mgr 		= null;
		TimerUtil timer 	= null;
		TimerUtil timer2 	= null;
		//SPDefinition def 	= (SPDefinition) ServiceUtils.getApplicationBeanFactory().getBean(spName);
		SPDefinition def 	= (SPDefinition)ApplicationContextProvider.getApplicationContext().getBean(spName);

		try {

			if (logger.isDebugEnabled()) {

				timer = new TimerUtil();
			}
			SPCall spcall = new SPCall();
			spcall.setDefinition(def);

			if (logger.isDebugEnabled()) {

				timer2 = new TimerUtil();
			}
			spcall.setInputParameters(input);
			if (logger.isDebugEnabled()){

				logger.debug(spName + "|setinput|" + timer2.getElapsedTime());
			}

			mgr = new SPFactory(spcall);
			SPReturnValues val = mgr.executeWithOutCommit();

			val.setOutputParameters(output);
			if (logger.isDebugEnabled()){

				logger.debug(spName + "|completenoresultset|" + timer.getElapsedTime());
			}
		} catch (Exception ex) {

			logger.error("SMF Agent Domain Error: " + spName + Utilities.getStackTrace(ex));

			if(mgr!=null)
				closeConnetion(mgr);

			throw Utilities.setRejectDetails(SMFAgentConstants.INTERNAL_ERROR_CODE, null);
		}
		return mgr;
	}
	/**
	 * This method should be called after calling executeSPWithOutCommit, and either commit or rollback.
	 * @param factory
	 */
	public static void closeConnetion(SPFactory factory) {

		try {

			factory.closeConnection();

		} catch(Exception e){

			logger.error("Error while closing the connection:::"+Utilities.getStackTrace(e));

		}
	}

	/**
	 * This method should be called only after calling executeSPWithOutCommit, and prior to closing the connection.
	 * @param factory
	 */
	public static void commit(SPFactory factory){

		try {

			factory.commit();
		} catch (Exception e) {
			logger.error("Error while commiting the changes:::"+Utilities.getStackTrace(e));
		}
	}
	/**
	 * This method should be called only after calling executeSPWithOutCommit, and prior to closing the connection.
	 */
	public static void rollback(SPFactory factory){

		try {

			factory.rollback();
		} catch (Exception e) {

			logger.error("Error while rollbacking the changes:::" + Utilities.getStackTrace(e));

		}
	}

	/**
	 * First do rollback and then close the connection
	 * @param factory
	 */
	public static void closeConnectionWithRollback(SPFactory factory){

		try {

			factory.rollback();
			factory.closeConnection();
		} catch (Exception e) {
			logger.error("Error while rollbacking and closing the connection:::" + Utilities.getStackTrace(e));
		}
	}

	/**
	 * First do commit and then close the connection
	 * @param factory
	 */
	public static void closeConnectionWithCommit(SPFactory factory){

		try {

			factory.commit();
			factory.closeConnection();
		} catch (Exception e) {

			logger.error("Error while committing and closing the connection:::" + Utilities.getStackTrace(e));
		}
	}
	
	/**
	 * Method is responsible for executing a stored procedure.
	 * @param sP
	 * @param input
	 * @param output
	 */
	public static void _executeStoredProcedure(String sP, IDomainDataBase input, IDomainDataBase output )
	throws SMFAgentException {

		if (logger.isDebugEnabled()) {
			logger.debug("Stored Procedure Name : " + sP);
		}
		TimerUtil timer = null;
		TimerUtil timer2 = null;
		try {

			//SPDefinition def = (SPDefinition) ServiceUtils.getApplicationBeanFactory().getBean( sP );
			SPDefinition def 	= (SPDefinition)ApplicationContextProvider.getApplicationContext().getBean(sP);

			if ( logger.isDebugEnabled() ) {

				timer = new TimerUtil();
			}
			SPCall spcall = new SPCall();
			spcall.setDefinition(def);
			spcall.setInputParameters(input);

			if ( logger.isDebugEnabled() ) {

				timer2 = new TimerUtil();
				logger.debug(sP + "|setinput|" + timer2.getElapsedTime());
			}

			SPFactory mgr = new SPFactory(spcall);
			SPReturnValues val = mgr.execute();

			val.setOutputParameters(output);

			if ( logger.isDebugEnabled() ) {

				logger.debug(sP + "|completenoresultset|" + timer.getElapsedTime());
			}
		} catch (DataTypeNotSupportedException e) {
			logger.error("SMF Agent Domain Error: " + sP + Utilities.getStackTrace(e));
			throw Utilities.setRejectDetails();
		} catch (SQLException ex ) {
			logger.error("Database Retrieval Error: " + sP + Utilities.getStackTrace(ex));
			throw Utilities.setRejectDetails();
		} catch (Exception ex ) {
			logger.error("SMF Agent Domain Error: " + sP+ Utilities.getStackTrace(ex));
			throw Utilities.setRejectDetails();
		}
	}
	
}
