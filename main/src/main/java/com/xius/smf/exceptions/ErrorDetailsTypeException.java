package com.xius.smf.exceptions;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.app.SMFApplication;
import com.xius.smf.config.SpringStartupConfig;
import com.xius.smf.utils.SMFAgentConstants;


public class ErrorDetailsTypeException extends Exception {

	private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = LogManager.getLogger(ErrorDetailsTypeException.class);

	private Properties errorProps = null;
	private java.lang.String errorCode;
	private java.lang.String errorMessage;

	public ErrorDetailsTypeException(String errorMessage,String errorCode ) {
		//errorProps = SMFApplication.getErrorDetails();
		errorProps=SpringStartupConfig.getErrorDetails();
		if (errorProps != null) {
			LOGGER.info("ErrorCode >>>" + errorCode + " checking from ErrorDetails.Props");
			if ((errorCode != null) && (errorProps.containsKey(errorCode))) {
				errorMessage = errorProps.getProperty(errorCode);
				LOGGER.info("errorMessage >>>" + errorMessage);
			} else if (errorMessage == null) {
				LOGGER.info("ErrorCode Details Not Found in ErrorDetails.Props");
				errorMessage = SMFAgentConstants.DEFAULT_ERROR_MESG;
			}
		} else {
			LOGGER.error("config/ErrorDetails.properties Details Not Found");
		}
		this.setErrorMessage(errorMessage);
		this.setErrorCode(errorCode);
	}

	public ErrorDetailsTypeException() {
		// TODO Auto-generated constructor stub
	}

	public java.lang.String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(java.lang.String errorCode) {
		this.errorCode = errorCode;
	}

	public java.lang.String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(java.lang.String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
