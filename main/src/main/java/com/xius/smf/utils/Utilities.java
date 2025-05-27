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

//~--- JDK imports ------------------------------------------------------------

import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.security.SecureRandom;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.TimeZone;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;

import net.bcgi.util.db.SPFactory;

import org.apache.axis.Constants;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.ws.soap.SoapHeaderElement;

import com.xius.agent.smf.common.error.errordetails.ErrorDetailsType;
import com.xius.agent.smf.common.header.headerdetails.MessageHeader;
import com.xius.smf.exceptions.SMFAgentException;


/**
 * this class is used to have common utility methods.
 * @Author : srikanthm $Author: kiranmai.kode $
 * @Date : Oct 8, 2009
 */
@Service("Utilities")
public class Utilities {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
	private static final Logger logger = LogManager.getLogger(Utilities.class.getSimpleName());

	public static String getStackTrace(Throwable t) {
		StringWriter stringWriter = new StringWriter();
		PrintWriter  printWriter  = new PrintWriter(stringWriter);

		t.printStackTrace(printWriter);
		printWriter.flush();

		return stringWriter.toString();
	}
	
	
	public HeaderDetails getHeader(SoapHeaderElement header) {
		MessageHeader authentication = null;
		HeaderDetails headerDetails = null;
		try {

			JAXBContext context = JAXBContext.newInstance(MessageHeader.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			authentication = (MessageHeader) unmarshaller.unmarshal(header.getSource());

			headerDetails = new HeaderDetails();
			headerDetails = setsmfHeader(authentication, headerDetails);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

		return headerDetails;

	}
	
	private HeaderDetails setsmfHeader(MessageHeader authentication, HeaderDetails headerDetails) {

		com.xius.agent.smf.common.header.headerdetails.TrackingMessageHeaderType smfHeader = authentication.getTrackingMessageHeader();

		if (smfHeader != null) {
			if (smfHeader.getCarrierId() != null) {
				headerDetails.setNetworkID(Long.parseLong(smfHeader.getCarrierId()));
			}
			if (smfHeader.getMessageId() != null) {
				headerDetails.setRequestID(smfHeader.getMessageId());
			}
			/*if (ibaHeader.getNetworkName() != null) {
				headerDetails.setNetworkName(ibaHeader.getNetworkName());
			}*/
			if (smfHeader.getPassword() != null) {
				headerDetails.setPassword(smfHeader.getPassword());
			}
			if (smfHeader.getUserId() != null) {
				headerDetails.setLoginID(smfHeader.getUserId());
			}
			if (smfHeader.getTimeToLive() != null) {
				headerDetails.setTimeToLive(smfHeader.getTimeToLive() + "".trim());
			}
			if (smfHeader.getMessageDateTimeStamp() != null) {
				headerDetails.setTimeToLive(smfHeader.getMessageDateTimeStamp() + "".trim());
			}

		} else {
			if (logger.isInfoEnabled()) {
				logger.info(" Utilities  ---->MessageHeader --> TrackingMessageHeaderType Null");
			}
		}

		return headerDetails;
	}

	/**
	 * this method is used to set reject details
	 * @param errorCode
	 * @param errorMessage
	 * @return
	 */
	public static SMFAgentException setRejectDetails(String errorCode , String errorMessage) {

		/**
		 * This will get error codes and its messsages as properties
		 */
		Properties errorCodesFile = InitiateAll.getErrorProps();
		//String errorMessage = null;
		SMFAgentException smfException = new SMFAgentException();

		if(errorMessage != null  && errorMessage != null )
		{
			smfException.setErrorMessage( errorMessage );
			smfException.setErrorCode(errorCode+"");
			return smfException;
		}
		if ( errorCode == null || (!errorCodesFile.containsKey(errorCode)))
			errorCode = SMFAgentConstants.INTERNAL_ERROR_CODE;

		errorMessage = (String) errorCodesFile.getProperty(errorCode.toString());
		if( errorMessage != null )
			smfException.setErrorMessage( errorMessage );
		else
			smfException.setErrorMessage( SMFAgentConstants.INTERNAL_ERROR_MSG);
		return smfException;
	}
	/**
	 * this method is used to set reject details
	 * @param errorCode
	 * @param errorMessage
	 * @return
	 */
	public static SMFAgentException setRejectDetails() {
		SMFAgentException smfException = new SMFAgentException();
		smfException.setErrorCode(""+SMFAgentConstants.INTERNAL_ERROR_CODE);
		smfException.setErrorMessage( SMFAgentConstants.INTERNAL_ERROR_MSG );
		return smfException;
	}

	/**
	 * this method is used to check whether the given field is null or not.
	 * @param str
	 * @return boolean
	 */
	public static  boolean isNull(String str) {
		if (str != null) {
			if (str.trim().length() != 0 && !str.equals(""))
				return false;
		}
		return true;
	}

	/**
	 * this method is used to convert Date to String.
	 * @param str
	 * @return boolean
	 */
	public static  String getDateStr(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		return sdf.format(date);

	}

	public static void commitOrRollback(SPFactory factory, Long po_error_code) {

		if(po_error_code!= null && po_error_code !=0){
			ServiceUtils.closeConnectionWithRollback(factory);
			//throw Utilities.setMNPException(String.valueOf(po_error_code),null);
		}else{			
			ServiceUtils.closeConnectionWithCommit(factory);
		}
	}

	public static byte[] trim(byte[] data, int amount) {
		if (data == null) {
			return new byte[amount];
		} else if (data.length == amount) {
			return data;
		} else {
			byte[] newArray = new byte[amount];
			System.arraycopy(data, 0, newArray, 0, amount);
			return newArray;
		}
	}
	public static String getStringFromByte(byte[] data){
		String StringMessage = null;
		if(data != null)
			StringMessage = new String(data).toString();
		return StringMessage;
	}
	public static byte[] getBytesFromString(String data){
		return data.getBytes();
	}
	
	/**
	 * 1) if error is message sent to this block then it will fill and return ErrorDetails obj else
	 * 2) it will pick up the message from property file and construct the ErrorDetails
	 * 3) if no message is found for the code then ErrorDetails obj is constructed with default message
	 * 	  here is Internal server error
	 * @param errorCode String
	 * @param errorMessage String
	 * @return errorDetailsType ErrorDetailsType
	 */
	public static ErrorDetailsType fillErrorDetailsType(String errorCode , String errorMessage) {

		/**
		 * This will get error codes and its messsages as properties
		 */
		Properties errorCodesFile = InitiateAll.getErrorProps();
		//String errorMessage = null;
		ErrorDetailsType errorDetailsType = new ErrorDetailsType();

		if( errorMessage == null ) {

			if ( errorCode != null ) {

				/**
				 * This will get error message corresponding to code.
				 */
				if(errorCode.equals("100"))
					errorCode="88888";

				errorMessage = (String) errorCodesFile.getProperty( errorCode );
				//errorDetailsType.setErrorCode( errorCode );
				if( errorMessage != null ) {

					errorDetailsType.setErrorMessage( errorMessage );
				} else {

					errorDetailsType.setErrorMessage( "Internal server error" );
				}
			}
		} else {

			errorDetailsType.setErrorMessage( errorMessage );
		}

		errorDetailsType.setErrorCode( errorCode );
		/*
		 * errorDetailsType.removeFaultDetail(Constants.QNAME_FAULTDETAIL_EXCEPTIONNAME)
		 * ; errorDetailsType.removeHostname();
		 */
		return errorDetailsType;
	}
	/**
	 * This method is used to build infinet billing  exception by getting error message from property file
	 * @param long1
	 * @param errorMessage
	 * @return
	 */
	public static SMFAgentException setSMFAgentException(String long1, String errorMessage) {

		/**
		 * This will get error codes and its messsages as properties
		 */
		Properties errorCodesFile = InitiateAll.getErrorProps();
		
		
		String     errorCode      = (null != long1)
				? String.valueOf(long1)
						: null;

			
			

				// String errorMessage = null;
				SMFAgentException smfAgentException = new SMFAgentException();

				smfAgentException.setErrorCode(long1+"");

				if ((long1 != null) && (errorMessage != null)) {
					smfAgentException.setErrorCode(long1+"");
					smfAgentException.setErrorMessage(errorMessage);

					return smfAgentException;
				} else {
					if (long1 != null) {
						smfAgentException.setErrorCode(long1+"");

						/**
						 * This will get error message corresponding to code.
						 */
						errorMessage = (String) errorCodesFile.getProperty(String.valueOf(long1));

						if (errorMessage != null) {
							smfAgentException.setErrorMessage(errorMessage);
						} else {

							//                  if no message is found for the given error code setting the default value
							smfAgentException.setErrorCode(SMFAgentConstants.DEFAULT_ERROR_CODE);
							smfAgentException.setErrorMessage(SMFAgentConstants.DEFAULT_ERROR_MESG);
						}
					} else {

						//              if no message is found for the given error code setting the default value
						smfAgentException.setErrorCode(SMFAgentConstants.DEFAULT_ERROR_CODE);
						smfAgentException.setErrorMessage(SMFAgentConstants.DEFAULT_ERROR_MESG);
					}
				}

				return smfAgentException;
	}

	
	
	
	
	
	/**
	 * This method is used to build infinet billing exception by getting error message from property file
	 * @param errCode
	 * @return
	 */
	public static SMFAgentException setSMFAgentException(Long errCode) {

		/**
		 * This will get error message from property file.
		 */
		String errorMessage   = null;
		Properties errorCodesFile = InitiateAll.getErrorProps();
		SMFAgentException smfAgentException = new SMFAgentException();

		if(errCode!= null)
		{
			/**
			 * This will get error message corresponding to code.
			 */
			errorMessage = (String) errorCodesFile.getProperty(String.valueOf(errCode));

			if (errorMessage != null)
			{
				smfAgentException.setErrorMessage(errorMessage);
				smfAgentException.setErrorCode(""+errCode);
				return smfAgentException;
			}
			else 
			{
				//if no message is found for the given error code setting the default value
				smfAgentException.setErrorCode(SMFAgentConstants.DEFAULT_ERROR_CODE);
				smfAgentException.setErrorMessage(SMFAgentConstants.DEFAULT_ERROR_MESG);
				return smfAgentException;
			}
		}
		else
			smfAgentException.setErrorCode(SMFAgentConstants.DEFAULT_ERROR_CODE);
		smfAgentException.setErrorMessage(SMFAgentConstants.DEFAULT_ERROR_MESG);
		return smfAgentException;
	}
	/**
	 * @param msgException
	 * @return
	 */
	public static ErrorDetailsType setErrorDetailsType(SMFAgentException msgException) {
		ErrorDetailsType errorDetailsType = null;

		if (msgException != null) {
			errorDetailsType = new ErrorDetailsType();
			errorDetailsType.setErrorCode(msgException.getErrorCode().toString());
			errorDetailsType.setErrorMessage(msgException.getErrorMessage());
		} else {
			errorDetailsType = fillErrorDetailsType("88893", null);    // internal server Error
		}

		/*
		 * errorDetailsType.removeHostname();
		 * errorDetailsType.removeFaultDetail(Constants.QNAME_FAULTDETAIL_EXCEPTIONNAME)
		 * ;
		 */

		return errorDetailsType;
	}
	
	public static String convertLongListToString(List<Long> objList, String seperator) {
		if(objList != null && objList.size()>0) {
			StringBuilder sbTemp = new StringBuilder("");
			boolean flag = false;
			for(Long obj : objList) {
				if(obj != null) {
					if(flag) {
						sbTemp.append(seperator);
					}
					sbTemp.append(obj.toString());
					flag = true;
				}
			}
			return sbTemp.toString();
		} else {
			return null;
		}
	}
	
	public static String convertBigDecimalListToString(List<BigDecimal> objList, String seperator) {
		if(objList != null && objList.size()>0) {
			StringBuilder sbTemp = new StringBuilder("");
			boolean flag = false;
			for(BigDecimal obj : objList) {
				if(obj != null) {
					if(flag) {
						sbTemp.append(seperator);
					}
					sbTemp.append(obj.toString());
					flag = true;
				}
			}
			return sbTemp.toString();
		} else {
			return null;
		}
	}
	
	/**
	 * This method is for checking if object is not empty 
	 * @param obj
	 * @return
	 */
	public static boolean isNotEmpty(Object obj) {
	    if ((obj == null) || ((obj.getClass() == String.class) && (((String) obj).trim().equals("")))) {
	        return false;
	    } else {
	        return true;
	    }
	}
	
	/**
	 * This method is for checking if object is empty 
	 * @param obj
	 * @return
	 */
	public static boolean isEmpty(Object obj) {
	    if ((obj == null) || ((obj.getClass() == String.class) && (((String) obj).trim().equals("")))) {
	        return true;
	    } else {
	        return false;
	    }
	}
	
	public static BigDecimal[] convertLongListToBigDecimalArray(List<Long> objList) {
		BigDecimal[] objBigDecimal = null;
		List<BigDecimal> objBDList = convertLongListToBigDecimalList(objList);
		if(objBDList != null) {
			objBigDecimal = objBDList.toArray(new BigDecimal[objBDList.size()]);
		}
		return objBigDecimal;
	}
	
	public static List<BigDecimal> convertLongListToBigDecimalList(List<Long> objList) {
		List<BigDecimal> objBigDecimal = null;
		if(objList != null && objList.size()>0) {
			objBigDecimal = new ArrayList<BigDecimal>();
			for(Long obj : objList) {
				if(obj != null) {
					objBigDecimal.add(new BigDecimal(obj));
				}
			}
		}
		return objBigDecimal;
	}
	
	public static List<String> convertLongListToStringList(List<Long> objList) {
		List<String> objStringList = null;
		if(objList != null && objList.size()>0) {
			objStringList = new ArrayList<String>();
			for(Long obj : objList) {
				if(obj != null) {
					objStringList.add(obj.toString());
				}
			}
		}
		return objStringList;
	}
	
	public static String[] convertLongListToStringArray(List<Long> objList) {
		String[] objStringArr = null;
		List<String> objStringList = convertLongListToStringList(objList);
		if(objStringList != null) {
			objStringArr = objStringList.toArray(new String[objStringList.size()]);
		}
		return objStringArr;
	}
	
	public static String getAUid() {
		SecureRandom secRand = new SecureRandom();
		int nextInt = secRand.nextInt();
		if (nextInt < 0)
			nextInt = 0 - nextInt;
		long timeInMillis = Calendar.getInstance().getTimeInMillis();
		long uid_long = (timeInMillis / 10000) + nextInt;
		String uid = Long.toString(uid_long);
		return uid;
	}
	
	public static Calendar covertStringToCalendar(String calString, String timeZone) {

		String delimiter = "";
		if (calString.indexOf("-") > 0)
			delimiter = "-";
		if (calString.indexOf("/") > 0)
			delimiter = "/";
		if (calString.indexOf("\\") > 0)
			delimiter = "\\";
		String onlyDate = calString;
		if (calString.indexOf(":") > 0)
			onlyDate = calString.substring(0, calString.indexOf(":") - 2);

		String parts[] = onlyDate.split(delimiter);
		String year = "yyyy";
		if (parts[2].length() == 2)
			year = "yy";

		SimpleDateFormat sdf = null;
		String format = "";

		if (calString.indexOf(":") > 0) {
			format = "MM" + delimiter + "dd" + delimiter + year + " hh:mm:ss a"; // 05-29-2008
																					// 12:00:00
																					// AM
		} else {
			format = "MM" + delimiter + "dd" + delimiter + year; // 05-29-2008
		}

		sdf = new SimpleDateFormat(format);
		TimeZone tz = TimeZone.getTimeZone(timeZone);
		sdf.setTimeZone(tz);
		Date d = null;
		try {

			d = sdf.parse(calString);
		} catch (ParseException e) {

			e.printStackTrace();
		}

		Calendar cal = Calendar.getInstance(tz);
		cal.setTimeInMillis(d.getTime());
		return cal;

	}
	
	public static String[] splitString(String strValue, String delimitter) {
		String strvalue1 = strValue;
		int arrcount = 0;
		while (strvalue1.indexOf(delimitter) >= 0) {
			int start = strvalue1.indexOf(delimitter);
			//String tokenValue = strvalue1.substring(0, start);
			strvalue1 = strvalue1.substring(start + 1);
			arrcount++;
		}
		String tokenizedarr[] = new String[arrcount + 1];
		int tokencount = 0;
		while (strValue.indexOf(delimitter) >= 0) {
			int start = strValue.indexOf(delimitter);
			String tokenValue = strValue.substring(0, start);
			strValue = strValue.substring(start + 1);
			tokenizedarr[tokencount] = tokenValue;
			tokencount++;
		}
		tokenizedarr[tokencount] = strValue;
		return tokenizedarr; 
	}
	
	
	
	public static Long[] convertStringArytoLongAry(String[] stringArray)
	{
		int size=stringArray.length;
		
		Long[] longArray= new Long[size];
		
		for(int iter=0;iter<size;iter++)
		{
			if(null!=stringArray[iter])
			longArray[iter]=Long.parseLong(stringArray[iter]);
			
			
		}
		
		
		
		return longArray;
	}
	
	public static BigDecimal[] convertStringArytoBigDecimalAry(String[] stringArray)
	{
		int size=stringArray.length;
		
		BigDecimal[] longArray= new BigDecimal[size];
		
		for(int iter=0;iter<size;iter++)
		{
			if(null!=stringArray[iter])
			longArray[iter]=new BigDecimal(stringArray[iter]);
			
			
		}
		
		
		
		return longArray;
	}
	
	public static String dateTimeStamp(){
		String str = new String();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		str=sdf.format(timestamp);
		return str;
	}
	
	public static Integer[] StringToInt(String[] nwIds) {
		int size = nwIds.length;
		Integer[] intAry = new Integer[size];
		for (int iter = 0; iter < size; iter++) {
			intAry[iter] = Integer.parseInt(nwIds[iter]);
		}
		return intAry;
	}
	
	
	
	
	
	public static String getNetworkId(String networkID) {
		String[] nwid = InitiateAll.getSMFProps().getProperty("ne.networkID").split("#");
		return getValue(networkID, nwid);
	}

	public static String getEmailToNir(String networkID) {
		String[] emailto = InitiateAll.getSMFProps().getProperty("EmailToNir").split("#");
		return getValue(networkID,emailto);
	}
	
	public static String getEmailFromNir(String networkID) {
		String[] emailfrom = InitiateAll.getSMFProps().getProperty("EmailFromNir").split("#");
		return getValue(networkID,emailfrom);
	}
	
	public static String getDestMsisdnNir(String networkID) {
		String[] destmsisdn = InitiateAll.getSMFProps().getProperty("DestMsisdnNir").split("#");
		return getValue(networkID,destmsisdn);
	}
	
	public static String getEventEmailRefCode(String networkID) {
		String[] eventRefCode = InitiateAll.getSMFProps().getProperty("NIREmailNotificationEvent").split("#");
		return getValue(networkID,eventRefCode);
	}
	
	public static String getEventSmsRefCode(String networkID) {
		String[] eventRefCode = InitiateAll.getSMFProps().getProperty("NIRSmsNotificationEvent").split("#");
		return getValue(networkID,eventRefCode);
	}

	public static String getEventRefCodeForActivation(String networkID) {
		String[] eventRefCode = InitiateAll.getSMFProps().getProperty("ActivationNotificationEvent").split("#");
		return getValue(networkID,eventRefCode);
	}
		
	public static String getEventRefCodeSuccessTiaRetryForActivation(String networkID) {
		String[] eventRefCode = InitiateAll.getSMFProps().getProperty("TIARetrySuccessNotificationEvent").split("#");
		return getValue(networkID,eventRefCode);
	}

	public static String getEventRefCodeFailureTiaRetryForActivation(String networkID) {
		String[] eventRefCode = InitiateAll.getSMFProps().getProperty("TIARetryFailureNotificationEvent").split("#");
		return getValue(networkID,eventRefCode);
	}
	
	public static String getMsisdnNir(String networkID,String MSISDNs) {
		String[] destmsisdn = MSISDNs.split("#");
		return getValue(networkID,destmsisdn);
	}

	public static String getSmsEventRefCode(String networkID,String eventCode) {
		String[] eventRefCode = eventCode.split("#");
		return getValue(networkID,eventRefCode);
	}
	public static String getEmailTo(String networkID,String EmailsToList) {
		String[] emailto = EmailsToList.split("#");
		return getValue(networkID,emailto);
	}
	
	public static String getEmailFrom(String networkID,String EmailsFromList) {
		String[] emailfrom = EmailsFromList.split("#");
		return getValue(networkID,emailfrom);
	}
	
	
	public static String getEventRefCodeForExpiryNotification(String networkID) {
		String[] eventRefCode = InitiateAll.getSMFProps().getProperty("SMS_EXPIRY_NOTIFICATION_EVENT").split("#");
		return getValue(networkID,eventRefCode);
	}
	
	public static String getEventRefCodeForLowBalanceNotification(String networkID) {
		String[] eventRefCode = InitiateAll.getSMFProps().getProperty("SMS_LOWBALANCE_EVENT_NOTIFICATION").split("#");
		return getValue(networkID,eventRefCode);
	}
	
	public static String getPropertyExpiryDateRecquired(String networkID) {
		String[] eventRefCode = InitiateAll.getSMFProps().getProperty("SMS_EXPIRY_DATE_REQUIRED").split("#");
		return getValue(networkID,eventRefCode);
	}
	
	public static String getPopertyValueForExpiryBalanceRecquired(String networkID) {
		String[] eventRefCode = InitiateAll.getSMFProps().getProperty("SMS_EXPIRY_BALANCE_REQUIRED").split("#");
		return getValue(networkID,eventRefCode);
	}
	
	public static String getPropertyValueForExpiryMarketingText(String networkID) {
		String[] eventRefCode = InitiateAll.getSMFProps().getProperty("SMS_EXPIRY_MARKETING_TEXT").split("#");
		return getValue(networkID,eventRefCode);
	}
	
	
	public static String getPropertyValueForLowBalanceMarketingText(String networkID) {
		String[] eventRefCode = InitiateAll.getSMFProps().getProperty("SMS_LOWBALANCE_MARKETING_TEXT").split("#");
		return getValue(networkID,eventRefCode);
	}
	
	public static String getPropertyValueForLowBalanceExpiryDate(String networkID) {
		String[] eventRefCode = InitiateAll.getSMFProps().getProperty("SMS_LOWBALANCE_EXPIRY_DATE_REQUIRED").split("#");
		return getValue(networkID,eventRefCode);
	}
	
	public static String getLoginCredentialsForNE(String networkID) {
		String[] eventRefCode = InitiateAll.getSMFProps().getProperty("SMS_NE_CREDENTIALS").split("#");
		return getValue(networkID,eventRefCode);
	}
	
	//SMS_COMMON_EVENT_WITHOUT_FLAG
	
	public static String getSMSEventReffCodeForCommonEvent(String networkID) {
		String[] eventRefCode = InitiateAll.getSMFProps().getProperty("SMS_COMMON_EVENT_WITHOUT_FLAG").split("#");
		return getValue(networkID,eventRefCode);
	}
	
	
	public static String getPropertyValueForCCLengthCofig(String networkID) {
		String[] eventRefCode = InitiateAll.getSMFProps().getProperty("SMS_CC_LENGTH_CONFIG_FLAG").split("#");
		return getValue(networkID,eventRefCode);
	}
	
	
	
	public static String getValue(String networkID,String[] values){
		String value = null;
		for (String string : values) {
			String[] ar = string.split(":");
			if (ar[0].equals(networkID)) {
				value = ar[1];
				break;
			}
		}
		return value;
	}
	
	
	public static SOAPHeaderElement getSoapHeader(HeaderDetails headerDetails) {

		SOAPHeaderElement header = new SOAPHeaderElement(
				"http://billing.xius.com/common/header/HeaderDetails.xsd",
				"messageHeader");
		header.setActor(null);
		header.setPrefix("head");
		SOAPElement cNode;
		SOAPElement node1;
		SOAPElement node2;
		SOAPElement node3;
		SOAPElement node4;
		try {
			cNode = header.addChildElement("trackingMessageHeader");
			node1 = cNode.addChildElement("messageId");
			node1.addTextNode(headerDetails.getRequestID());
			node2 = cNode.addChildElement("carrierId");
			node2.addTextNode(String.valueOf(headerDetails.getNetworkID()));
			node3 = cNode.addChildElement("userId");
			node3.addTextNode(headerDetails.getLoginID());
			node4 = cNode.addChildElement("password");
			node4.addTextNode(headerDetails.getPassword());
		} catch (SOAPException se) {
			se.printStackTrace();
		}
		return header;
	}
	
	
	
	public static Long[] convertLongArytolongAry(long[] stringArray)
	{
		int size=stringArray.length;
		
		Long[] longArray= new Long[size];
		
		for(int iter=0;iter<size;iter++)
		{
			longArray[iter]=stringArray[iter];
			
		}
		
		return longArray;
	}
	
	public static SOAPHeaderElement getTIASoapHeader(HeaderDetails headerDetails) throws SOAPException {

		SOAPHeaderElement header = new SOAPHeaderElement(
				"http://tia.xius.com/common/header/HeaderDetails.xsd","messageHeader");
		header.setActor(null);							
		header.setPrefix("head");
		SOAPElement node1;
		SOAPElement c_node1;
		SOAPElement c_node2;
		SOAPElement c_node3;
		SOAPElement c_node4;
		SOAPElement c_node5;
		node1 = header.addChildElement("trackingMessageHeader");

		c_node1 = node1.addChildElement("messageId");
		c_node1.addTextNode("23023"); // dummy value

		c_node2 = node1.addChildElement("carrierId");
		c_node2.addTextNode(String.valueOf(headerDetails.getNetworkID()));

		String nwName = GetNetworkName.getName(String.valueOf(headerDetails.getNetworkID()));
		c_node3 = node1.addChildElement("networkName");
		c_node3.addTextNode(nwName);
		
		c_node4 = node1.addChildElement("userId");
		c_node4.addTextNode(headerDetails.getLoginID());

		c_node5 = node1.addChildElement("password");
		c_node5.addTextNode(headerDetails.getPassword());

		return header;
	}
	
	public static SOAPHeaderElement getSelfCareSoapHeader(
			HeaderDetails headerDetails) {

		SOAPHeaderElement header = new SOAPHeaderElement(
				"http://scare.xbus.xiusbcgi.com/common/header/HeaderDetails.xsd",
				"messageHeader");
		header.setActor(null);
		header.setPrefix("head");
		SOAPElement cNode;
		SOAPElement node1;
		SOAPElement node2;
		SOAPElement node3;
		SOAPElement node4;
		try {
			cNode = header.addChildElement("trackingMessageHeader");
			node1 = cNode.addChildElement("messageId");
			node1.addTextNode(headerDetails.getRequestID());
			node2 = cNode.addChildElement("carrierId");
			node2.addTextNode(String.valueOf(headerDetails.getNetworkID()));
			node3 = cNode.addChildElement("userId");
			node3.addTextNode(headerDetails.getLoginID());
			node4 = cNode.addChildElement("password");
			node4.addTextNode(new String(headerDetails.getPassword()));
		} catch (SOAPException se) {
			se.printStackTrace();
		}
		return header;
	}
	
	public static String getMSISDNWithCCSubFLows(String Value, String Id, String CC) {

		String CC_SUBFLOW_IDS[] = InitiateAll.getSMFProps().getProperty("BULK_SUBS_FLOW_PROCESS_JOB_CC_SUBFLOW_IDS")
				.split(",");
		for (int i = 0; i < CC_SUBFLOW_IDS.length; i++) {
			if (CC_SUBFLOW_IDS[i].equalsIgnoreCase(Id)) {
				String splitArr[] = Value.split("~");
				if (splitArr.length >= 1) {
					if (splitArr[0] != null) {
						splitArr[0] = CC + splitArr[0];
					}
				}
				if (splitArr.length >= 2) {
					if (splitArr[1] != null) {
						splitArr[1] = CC + splitArr[1];
					}
				}
				return strJoin(splitArr, "~");
			}
		}

		return Value;
	}

	public static String strJoin(String[] aArr, String sSep) {
		StringBuilder sbStr = new StringBuilder();
		for (int i = 0, il = aArr.length; i < il; i++) {
			if (i > 0)
				sbStr.append(sSep);
			sbStr.append(aArr[i]);
		}
		return sbStr.toString();
	}
}
