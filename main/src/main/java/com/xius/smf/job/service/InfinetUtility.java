package com.xius.smf.job.service;

import java.sql.Connection;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



//import javax.servlet.http.HttpServletResponse;
//import com.xius.common.DBConnectionManager;

public class InfinetUtility {
		
	 static final Logger logger = LogManager.getLogger("InfinetUtility");

   static Connection conn = null;	
   private static final String SLSSYMB = "/";
   private static final String DSSSYMB = "-";
   private static final String DANDS   = "&&";
   private static final String ATRATE  = "@";
   private static final String DDSSSYMB = "--";
   
   /**
    * This variable represents the Date format1 type used
    * Format : DTFRMT1 = "dd/MM/yyyy"
    * @Date SEPT 10, 2008  
    * @author karthik.nanjangude
    */
   private static final String DTFRMT1 = "dd/MM/yyyy";
   
   
   /**
    * This variable represents the Date format2 type used
    * Format : DTFRMT2 = "MM/dd/yyyy"
    * @Date SEPT 10, 2008  
    * @author karthik.nanjangude
    */
   
   private static final String DTFRMT2 = "MM/dd/yyyy";
      
   /**
    * This variable represents the Date format3 type used
    * Format : DTFRMT3 = "MMM/dd/yyyy"
    * @Date SEPT 10, 2008  
    * @author karthik.nanjangude
    */
   private static final String DTFRMT3 = "MMM/dd/yyyy";
   
  
   /**
    * This variable represents the Date format4 type used
    * Format : DTFRMT4 = "dd/MM/yyyy h:mm a"
    * @Date SEPT 10, 2008  
    * @author karthik.nanjangude
    */
   private static final String DTFRMT4 = "dd/MM/yyyy h:mm a";
   
   /**
    * This variable represents the Date format4 type used
    * Format : DTFRMT4 = "dd/MM/yyyy h:mm a"
    * @Date SEPT 10, 2008  
    * @author karthik.nanjangude
    */
   private static final String DTFRMT5 = "EEEE, MMM dd, yyyy";
         
   /**
	 * This method contains an utility method to format an amount before its
	 * being dispalyed on the browser
	 * 
	 * @param double dAmount double value that is to be formatted
	 * @return String
	 */
   private static final String DECIMALFRMT="#####.####";
   
   /**
    * This String array represents the Multiple IP Address
    */
   private static String[] MIPADDS = null;	
   
   
   /**
    * This String array represents the Multiple Ports 
    */
   private static String[] MIPPRTS = null;
   
	/**
	 * Empty Constructer
	 * 
	 *
	 * @Date Apr 29, 2008
	 * @author karthik
	 */
   
	public InfinetUtility() {

	}
	
	/**
	 * This method contains an utility method to format an amount before its
	 * being dispalyed on the browser
	 * 
	 * @param double dAmount double value that is to be formatted
	 *  Decimal Fraction display is set to '2' [ 10.25 ] dAmount
	 * @return String
	 *
	 * @Date Apr 29, 2008
	 * @author karthik
	 */
	public static String formatDisplay(double dAmount) {
		String returnValue = null;
		NumberFormat numFormat = java.text.NumberFormat.getInstance();
		numFormat.setMaximumFractionDigits(2);
		numFormat.setMinimumFractionDigits(2);
		returnValue = numFormat.format(dAmount);
		return returnValue;
	}

	
	/**
	 * This method contains an utility method to format an amount before its
	 * being dispalyed on the browser
	 * 
	 * @param 
	 * @param double dAmount double value that is to be formatted
	 *   Decimal Fraction display is set to '0 [ 10.00 ] dAmount
	 * @return String
	 *
	 * @Date Apr 29, 2008
	 * @author karthik
	 */

	public static String formatDisplay2(double dAmount) {
		NumberFormat numFormat = NumberFormat.getInstance();
		numFormat.setMaximumFractionDigits(0);
		numFormat.setMinimumFractionDigits(0);
		return (numFormat.format(dAmount)).toString();		
	}

	
   /**
  	 * This method contains an utility method to format an amount before its
	 * being dispalyed on the browser
	 * 	 
	 * @param double dAmount double value that is to be formatted
	 *   Decimal Fraction display is set to '3' [ 10.025 ] dAmount
	 * @return String
	 *
	 * @Date Apr 29, 2008
	 * @author karthik
	 */
	
	public static String formatDisplay3(double dAmount) {		
		NumberFormat numFormat = NumberFormat.getInstance();
		numFormat.setMaximumFractionDigits(3);
		numFormat.setMinimumFractionDigits(2);
		return (numFormat.format(dAmount)).toString();
	}
	
	
	/**
	 * This method contains an utility method to format an amount before its
	 * being displayed on the browser with out grouping. 
	 * @param double dAmount double value that is to be formatted dAmount
	 * @return String
	 *
	 * @Date Apr 29, 2008
	 * @author karthik
	 */

	public static String formatInputDisplay(double dAmount) {		
		NumberFormat numFormat = NumberFormat.getInstance();
		numFormat.setMaximumFractionDigits(2);
		numFormat.setMinimumFractionDigits(2);
		numFormat.setGroupingUsed(false);
		return (numFormat.format(dAmount)).toString();		
	}

	
	/**
	 * This method contains an utility method to format an amount before its
	 * being inserted into the database.
	 * 
	 * @param double dAmount double value that is to be formatted dAmount
	 * @return String
	 *
	 * @Date Apr 29, 2008
	 * @author karthik
	 */

	public static String formatInsert(double dAmount) {		
		NumberFormat numFormat = NumberFormat.getInstance();
		numFormat.setGroupingUsed(false);
		numFormat.setMaximumFractionDigits(2);
		numFormat.setMinimumFractionDigits(2);
		return (numFormat.format(dAmount)).toString();		
	}

	
	
	/**
	 * @author pavan.chennopragada
	 * @param src
	 * @param timezone
	 * @return
	 * @throws Exception
	 */

	public static Date stringToDateWithTimeAndAM(Object src, String timezone,String dateFormat) throws Exception {
		if (src == null || ((String) src).trim().length() == 0)
			return null;
		String strdate = (String) src;
		TimeZone tz = null;
		if (timezone == null || timezone.trim().length() == 0)
			tz = TimeZone.getDefault();
		else tz = TimeZone.getTimeZone(timezone);

		SimpleDateFormat s_timestampUsagePattern1 = new SimpleDateFormat(dateFormat);
		s_timestampUsagePattern1.setTimeZone(tz);
		return s_timestampUsagePattern1.parse(strdate);
	}
	
	
	/**
	 * @author pavan.chennopragada
	 * @param str
	 * @return
	 * @throws Exception
	 */
	public static Calendar StringToCalender(String str,String dateFormat) throws Exception {
		Calendar cal = Calendar.getInstance();
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
			Date date = sdf.parse(str.trim());
			cal.setTime(date);
		} catch (Exception e) {
			throw new Exception("61001");
		}
		return cal;
	}
	
	
	
	/**
	 * @author pavan.chennopragada
	 * @param inputDate
	 * @param Timezone
	 * @return in GMT Format
	 */

	public static GregorianCalendar DateToCalendarWithTime(String inputDate, String TimezoneType,String dateFormat) throws Exception {
		if (inputDate == null)
			return null;
		TimeZone tz = TimeZone.getTimeZone(TimezoneType);
		GregorianCalendar calendar = new GregorianCalendar(tz);
		try {
			calendar.setTime(InfinetUtility.stringToDateWithTimeAndAM(inputDate,TimezoneType,dateFormat));
		} catch (Exception e) {
			throw new Exception("61001");
		}
		return calendar;
	}
	
	
	
	
	/**
	 * This method returns the Date different (+ /-) dates base on current date
	 * @param settlementDate
	 * @param days
	 * @return
	 * May 3, 2010
	 * karthik.nanjangude
	 */
	
	public static String getDifferDate(String settlementDate,int days) {
		String previousDate = "";
		Calendar cal = null;
		DateFormat df = null;
		SimpleDateFormat dateFormatter = null;
		Date date = null;
		try {
			cal = Calendar.getInstance();			
			df = DateFormat.getDateInstance(DateFormat.MEDIUM);
			dateFormatter = (SimpleDateFormat) DateFormat.getDateInstance(DateFormat.MEDIUM);
			dateFormatter.applyPattern(DTFRMT2);
			dateFormatter.setTimeZone(TimeZone.getDefault());
			date = dateFormatter.parse(settlementDate);
			cal.setTime(date);
			cal.add(Calendar.DATE, days);
			previousDate = dateFormatter.format(cal.getTime());			
		} catch (Exception e) {
			previousDate = DDSSSYMB;
		}
		return previousDate;
	}	
	
	/**
	 * This method logs the toString format of the object that is passed, on to
	 * the console. If the Object passed is an instance of Exception, it prints
	 * the stack trace of the exception in to the Trace log file.
	 * @param object
	 *
	 * @Date Apr 29, 2008
	 * @author karthik
	 */
	public static void log(Object object) {
		if (true){
			//System.out.println(object.toString());
		}
		logger.info( object);
		if (((new Exception()).getClass()).isAssignableFrom(object.getClass())) {
			((Exception) object).printStackTrace();
		}
	}
	
	/**
	 * This method logs the toString format of the object that is passed, on to
	 * the console. If the Object passed is an instance of Exception, it prints
	 * the stack trace of the exception in to the Trace log file.
	 * 
	 * @param loginId	 
	 * @param object
	 */
	public static void log(String loginId,Object object) {
		if (true){
			 //System.out.println(object.toString());
		}
		logger.info( object);
		if (((new Exception()).getClass()).isAssignableFrom(object.getClass())) {
			((Exception) object).printStackTrace();
		}
	}
	
	/**
	 * This method logs the toString format of the object that is passed, on to
	 * the console. If the Object passed is an instance of Exception, it prints
	 * the stack trace of the exception in to the Trace log file.
	 * @param sNwId
	 * @param sLoginId
	 * @param object
	 *
	 * @Author karthik.nanjangude
	 * @Date Oct 23, 2008
	 */
	public static void log(String sLoginId,String sNwId,Object object){
		if (true){
			//System.out.println(object.toString());
		}
		
		logger.info( "sNwId: "+ sNwId);
		logger.info( "sLoginId" + sLoginId);
		logger.info( "Object : " + object);
		
		if (((new Exception()).getClass()).isAssignableFrom(object.getClass())) {
			((Exception) object).printStackTrace();
		}
	}	
	
	
	/**
	 * This method logs the toString format of the object that is passed, on to
	 * the console. If the Object passed is an instance of Exception, it prints
	 * the stack trace of the exception in to the Trace log file.
	 * 
	 * @param loginId
	 * @param nwID
	 * @param module
	 * @param object
	 */
	public static void log(String loginId, String nwID,String module,Object object) {
		if (true){
			//System.out.println(object.toString());
		}
		
		logger.info( "nwID: "+ nwID);
		logger.info("loginId" + loginId);
		logger.info( "module" + module);
		logger.info( "Object : " + object);
		
		if (((new Exception()).getClass()).isAssignableFrom(object.getClass())) {
			((Exception) object).printStackTrace();
		}
	}	
	
	/**
	 * This method logs the long or int value that is passed, on to the console
	 * @param long value l
	 *
	 * @Date Apr 29, 2008
	 * @author karthik
	 */
	public static void log(long l) {
		if (true)
			InfinetUtility.log("InfinetUtility.log " + l);
	}

	
	/**
	 * This method logs the double or float value that is passed, on to the
	 * console 
	 * @param double value d 
	 *
	 * @Date Apr 29, 2008
	 * @author karthik
	 */
	/*public static void log(double d) {
		if (true)
			InfinetUtility.log("InfinetUtility.log " + d);
	}*/

	
   /**
    * This method logs the String[] value that is passed, on to the console
    * @param String[] s 
    *
    * @Date Apr 29, 2008
    * @author karthik
    */	
	/*public static void log(String[] s) {
		if (true) {
			for (int i = 0; i < (s != null ? s.length : 0); i++) {
				InfinetUtility.log("InfinetUtility.log " + s[i]);
			}
		}
	}*/	

    /**     	
     * This method logs the single StringArg with String[] value that is passed,  
     * on to Logger for printing to console 
     * the console
     * @param argsz
     * @param argsr
     * Nov 9, 2010
     * @Author karthik.nanjangude
     */
	
	/*public static void log(String argsz, Object argsr[]){
		if (true) {
		StringBuffer sbx = new StringBuffer(argsz);
		  for(int o=0;o<argsr.length;o++){
			sbx.append(argsr[o] + "\n");
		  }
		  InfinetUtility.log("InfinetUtility.log " + sbx.toString());
		  sbx = null;
		}		
	}*/

	/**
	 * This method logs the 2 StringArg Array value that is passed, 
	 * on to Logger for printing to console 
	 * @param argsz
	 * @param argsr
	 * Nov 9, 2010
	 * @Author karthik.nanjangude
	 */
	/*public static void log(String[] argsz, Object argsr[]){
		if (true) {
		StringBuffer sbx = new StringBuffer();
		  for(int o=0;o<argsr.length;o++){
			sbx.append(argsz[o] + " : " + argsr[o] + "\n");
		  }
		  InfinetUtility.log(sbx.toString());
		  sbx = null;
		}		
	}*/
	
   /**
    * This metod returns the server date in dd/mm/yy format
    * @return date string
    *
    * @Date Apr 29, 2008
    * @author karthik
    */	
	public static String getSysDate() {
		return (new SimpleDateFormat(DTFRMT1)).format(new Date());
	}
	
	
	/**
	 * This metod returns the server date in dd format
	 * @return server day
	 *
	 * @Date Apr 29, 2008
	 * @author karthik
	 */
	public static String getSysDay() {
		return (new SimpleDateFormat("dd")).format(new Date());
	}
	
	
	/**
	 * This metod returns the server month in MON format, eg. JAN
	 * @return server month
	 *
	 * @Date Apr 29, 2008
	 * @author karthik
	 */
	
	public static String getSysMonth() {
		return (new SimpleDateFormat("MMM")).format(new Date());
	}

	
	
   /**
    * This metod returns the server month in MM format, eg. 01 for jan
    * @return server month
    *
    * @Date Apr 29, 2008
    * @author karthik
    */	
	public static String getSysMM() {
		return (new SimpleDateFormat("MM")).format(new Date());
	}


	/**
	 * This metod returns the server year in yyyy format
	 * 
	 * @return server year
	 *
	 * @Date Apr 29, 2008
	 * @author karthik
	 */
	public static String getSysYear() {
		return (new SimpleDateFormat("yyyy")).format(new Date());
	}

	/**
	 * 
	 * @param dateip
	 * @param dteFrmatAvail
	 * @param dteFrmatcnvrt
	 * @return
	 *
	 * @Date Apr 29, 2008
	 * @author karthik
	 */
	public static String setDateFormatter(String dateip, String dteFrmatAvail, String dteFrmatcnvrt) {
		try {
			SimpleDateFormat sdfInput = new SimpleDateFormat(dteFrmatAvail);
			SimpleDateFormat sdfOutput = new SimpleDateFormat(dteFrmatcnvrt);
			dateip = sdfOutput.format(sdfInput.parse(dateip));
		} catch (Exception dtex) {
			;
		}
		return dateip;
	}

   /**
    * This metod returns the server date in dd/mm/yy format
    * @return date string
    *
    * @Date Apr 29, 2008
    * @author karthik
    */	
	
	public static String getSysDates() {
		return (new SimpleDateFormat(DTFRMT3)).format(new Date());
	}	
	
	/**
	 * This method returns the date of the day specified from current day
	 * Format : dd/MM/yyyy , dd/MM/yyyy HH:mm:ss ,dd/MM/yyyy hh:mm:ss
    *  MM/dd/yyyy , MM/dd/yyyy HH:mm:ss ,MM/dd/yyyy hh:mm:ss
	 * @param days [ - or + ] 
	 * @param DateFormat
	 * @return
	 */
	public static String previousDate(int days,String DateFormat){
		Calendar now = Calendar.getInstance();
  	   Calendar then = null; 
  	   SimpleDateFormat formatter = new SimpleDateFormat(DateFormat);
  	   then = (Calendar)now.clone();
  	   then.add(Calendar.DATE ,days);
  	   return formatter.format(then.getTime());
	}	
	
	/**
	 * Static method which reads the details from the property file,
	 * infinet.properties 
	 * 
	  * @param sKey String
	 * @return sValue String
	 *
	 * @Date Apr 29, 2008
	 * @author karthik
	 */

	/*
	public static String getProperty(String sKey) {
		Hashtable hvalues = StartServlet.getHsPropty();
		String sMessage = null;
		// TODO KARTHIK HAS REPLACED THIS
		try {
			sKey = sKey.trim();
			sMessage = (String) hvalues.get(sKey);
			log(" KEY <<<< " + sKey + " ::  " + " VALUE >>>> " + sMessage);
		} catch (Exception getProperty) {
			InfinetUtility.log(getProperty);
		}

		if (sMessage == null){
			InfinetUtility.log("InfinetUtility.getProperty : Message not available in the Property file for key : " + sKey);
		}
		return sMessage;
	}*/

	/**
	 * This metod returns the next date to server date in dd/mm/yy format
	 * 
	 * @return date string
	 */
	public static String getNextDayDate() {
		Date date = new Date();
		long ms = date.getTime() + 86400000;
		SimpleDateFormat sdf = new SimpleDateFormat(DTFRMT1);
		return (sdf.format(new Date(ms))).toString();
	}

	/**
	 * This metod returns the after two days date to server date in dd/mm/yy
	 * format
	 * 
	 * @return date string
	 */
	public static String getAfterTwoDaysDate() {
		java.util.Date date = new java.util.Date();
		long ms = date.getTime() + (2 * 86400000);
		SimpleDateFormat sdf = new SimpleDateFormat(DTFRMT1);
		return (sdf.format(new Date(ms))).toString();		
	}

	
	
	
	/**
	 * This method returns the string[] after split . param sVal String
	 * @param sVal
	 * @param sDelim
	 * @return
	 *
	 * @Date Apr 29, 2008
	 * @author karthik
	 */
	public static String[] split(String sVal, String sDelim) {
   // @IMP This was old jdk14x representation of jdk13x
		String[] sOutput = sVal.split(sDelim);		
		return sOutput;
	}



	
	/**
	 * Method : getFullDate,getFullTime
	 * Description : To get Day,MM, DD,YYYY h:mm a
	 * Time Format : Login Time 12:40:39 PM 
	 * Date Format : Monday,July 22, 2006 12:40
	 * 
	 * @return
	 * @throws Exception
	 *
	 * @Date Apr 29, 2008
	 * @author Suneel Chiguruvada
	 */
	public String getFullTime() throws Exception {
		Date d = new Date();
		DateFormat df1 = DateFormat.getTimeInstance(DateFormat.MEDIUM);
		final String loginTime = df1.format(d);
		return loginTime;
	}	

	
	/**
	 * This metod returns the server date in MM/dd/yyyy format
	 * @return date string
	 *
	 * @Date Apr 29, 2008
	 * @author karthik
	 */
	
	public static String getSysDateNew() {
		return (new SimpleDateFormat(DTFRMT2)).format(new Date());
	}

	/**
	 * This returns the System Currrent Date time in the required format
	 * as specified i/p
	 * @param DateTimefrmt specified format
	 *        ex : mm/dd/yyyy
	 *             dd/mm/yyyy
	 *             dd/MMM/yyyy
	 *             MM/dd/yyyyy
	 *             yyyy/dd/mm
	 *             mm/dd/yyyy HH:mm:ss
	 * @return
	 *
	 * @Date Jun 11, 2008
	 * @author karthik
	 */
	
	public static String  getSystemDateTimeformat(String DateTimefrmt){
		return (new SimpleDateFormat(DateTimefrmt)).format(new Date());
	}
	
	
	/**
	 * This method returns the calendar full date
	 * @return
	 * @throws Exception
	 *
	 * @Author karthik.nanjangude
	 * @Date Dec 16, 2008
	 */

	public String getFullDate() throws Exception {
		Calendar cal = Calendar.getInstance();
		String fulldate_ = null, fllday_ = null, fllmnth_ = null, fllyear_ = null, 
		       fllhrs_ = null, fllmints_ = null, fllsecs_ = null, fillType_ = null;
		SimpleDateFormat sdfInput = null, sdfOutput = null;
      
		try {
			sdfInput = new SimpleDateFormat(DTFRMT4);
			sdfOutput = new SimpleDateFormat(DTFRMT5);

			fllday_   = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
			fllmnth_  = (String.valueOf(cal.get(Calendar.MONTH) + 1));
			fllyear_  = String.valueOf(cal.get(Calendar.YEAR));
			fllhrs_   = String.valueOf(cal.get(Calendar.HOUR));
			fllmints_ = String.valueOf(cal.get(Calendar.MINUTE));
			fllsecs_  = String.valueOf(cal.get(Calendar.SECOND));

			if (cal.get(Calendar.HOUR) >= 12) {fillType_ = "AM";} else {fillType_ = "PM";}

			fulldate_ = sdfOutput.format(sdfInput.parse(fllday_ + SLSSYMB + 
			                                            fllmnth_ + SLSSYMB + fllyear_ + " " + 
			                                            fllhrs_ + ":" + fllmints_ + " " + fillType_));

		} catch (Exception e) {
			e.printStackTrace();
		}

		return fulldate_;
	}

	/**
	 * This method returns the date Format in Standard dd/MM/yyyy Only
	 * @param dateip
	 * @return
	 *
	 * @Date Apr 29, 2008
	 * @author karthik
	 */
	public static String getFormatedDaymonthyear(String dateip) {
		InfinetUtility.log("InfinetUtility.getFormatedDaymonthyear:setDateFormatter" + dateip);
		SimpleDateFormat sdfInput = null, sdfOutput = null;		
		try {
			
			if (dateip.indexOf(DSSSYMB) > 0) {
				dateip = dateip.replaceAll(DSSSYMB, SLSSYMB);
			}
			sdfInput = new SimpleDateFormat(DTFRMT2);
			sdfOutput = new SimpleDateFormat(DTFRMT1);
			dateip = sdfOutput.format(sdfInput.parse(dateip));
		} catch (Exception dtex) {
			dtex.printStackTrace();
		}
		InfinetUtility.log("InfinetUtility.getFormatedDaymonthyear: DATE IP AFER CONVERSION" + dateip);
		return dateip;
	}

	
	
	/**
	 * This metod returns the date in the dd/mmm/yyyy format
	 * @param dateip
	 * @param indteFrmat  input date format
	 * @param outdteFrmat Output date format
	 * @return
	 *
	 * @Date Apr 29, 2008
	 * @author karthik
	 */
	public static String getFormatedDaymonthyear(String dateip, String indteFrmat, String outdteFrmat) {
		SimpleDateFormat sdfInput = null, sdfOutput = null;
		try {
			sdfInput = new SimpleDateFormat(indteFrmat);
			sdfOutput = new SimpleDateFormat(outdteFrmat);
			dateip = sdfOutput.format(sdfInput.parse(dateip));

		} catch (Exception dtex) {
			dtex.printStackTrace();
		}
		InfinetUtility.log("InfinetUtility.getFormatedDaymonthyear: DATE IP AFER CONVERSION : " + dateip);
		return dateip;
	}
	

	
	/**
	 * This method is used to rectify the SQL error on "'"<br>
	 * and CHAR replaces "'" with "'"
	 *  
	 * @param toReplace attribute accepts single Quote [ Charli's ] 
	 * @return  attribute with single Quote inserted for SQL Compalient [ Charli''s]

	 *
	 * @Date Apr 29, 2008
	 * @author karthik
	 */

	public static String sQuoteVar(String toReplace) {
		String word = "";
		StringBuffer buff = new StringBuffer();
		buff = new StringBuffer(toReplace);
		for (int i = 0; i < buff.length(); i++) {
			if (buff.charAt(i) == '\'') {
				buff.insert(i, '\'');
				i++;
			}
		}
		word = (buff.toString().trim());
		buff.setLength(0);
		return word;
	}
	
	
		
	/**
	 * This method is used to rectify the SQL error on "'"<br>
	 * and CHAR replaces "'" with "'"
	 * 
	 * @param toReplace attribute accepts single Quote [ Charli's ] 
	 * @return  attribute with single Quote inserted for SQL Compalient [ 'Charli''s']
	 *
	 * @Date Apr 29, 2008
	 * @author karthik
	 */

	public static String sQuoteVars(String toReplace) {
		String word = "";
		StringBuffer buff = new StringBuffer();
		buff = new StringBuffer(toReplace);
		for (int i = 0; i < buff.length(); i++) {
			if (buff.charAt(i) == '\'') {
				buff.insert(i, '\'');
				i++;
			}
		}
		word = "'" + (buff.toString().trim())+ "'";
		buff.setLength(0) ;
		return word;
	}
	
	
	

	

	
	
	
	
   /**
    * This method validates the IP address value for max of 15 digits
	 * and appropriately returns "0" appended if less then 15 digits
	 * 
	 * "19.168.150.110"  == 019.168.150.110
	 * "192.168.50.110"  == 192.168.050.110
	 * "192.168.050.10"  == 192.168.050.010
	 * "19.168.0150.110" == 19.168.0150.110
	 * 
	 * 
    * @param ipnum
    * @return
    *
    * @Date Apr 29, 2008
    * @author karthik
    */	

	public static String ipvarify(String ipnum) {
		String[] ipvarify = null;
		String ipvalue = "", ipvalueTemp = "";		
		if (ipnum.length() <= 15) {
			ipvarify = ipnum.split("\\.");
			
			for (int y = 0; y < ipvarify.length; y++) {
				if (ipvarify[y].length() < 3) {
					ipvalueTemp = "0" + ipvarify[y];
				} else if (ipvarify[y].length() == 3) {
					ipvalueTemp = ipvarify[y];
				}
				ipvalue = ipvalue + "." + ipvalueTemp;

				if (ipvalue.startsWith(".")) {
					ipvalue = ipvalue.replaceFirst(".", "");
				}
			}

		} else if (ipnum.length() > 15) {
			ipvalue = ipnum;
		}
		return ipvalue;
	}
	
		
	/**
	 * This method check for a valid IP adress and returns Boolean value
	 * @param ipValue
	 * @return
	 *
	 * @Date Apr 29, 2008
	 * @author karthik
	 */
	public static boolean isIPAddress(String ipValue) {
		String checkOK = "0123456789.",checkStr = ipValue;
		boolean allValid = true;
		int j = 0;
		for (int i = 0; i < checkStr.length(); i++) {
			char ch = checkStr.charAt(i);
			for (j = 0; j < checkOK.length(); j++) {
				if (ch == checkOK.charAt(j))
					break;
				if (ch == ' ')
					return false;
			}
			if (j == checkOK.length()) {
				allValid = false;
				break;
			}
		}
		if (!allValid) {
			return false;
		}
		String[] ip = ipValue.split("\\.");
		if ((ip.length < 4) || (ip.length > 4)) {return false;}
		if ((ip[0].length() < 3) || (ip[0].length() > 3) 
		                         || (ip[1].length() > 3) 
		                         || (ip[2].length() > 3) 
		                         || (ip[3].length() > 3)) {
			return false;
		}
		return true;
	} 
	
	
	
	
	/**
	 * This method is used for fetching Multiple IPS/PORTS 
	 * details Only from Infinet.properties and return (1:1) IP /Port 
	 * 
	 * eg:
	 * 
	 *  I/p 
	 *  IPSPORTS = "172.016.17.26@1111@2222@3333&&172.016.17.36@1234"
	 * 
	 * O/p
	 * Use the following
	 * @getMIPadds for String array of IP's
	 * @getMIPprts for String array of Port's
	 * 
	 * @Date May 17, 2008
	 * @author karthik
	 */
	
	public static void splitIPPortDtls(String IPSPORTS){		
		ArrayList vkey = new ArrayList();
		ArrayList vVal = new ArrayList();
		String[] value = null;
		String[] IPDT = IPSPORTS.split(DANDS);
		String tempkey = null,tempValue=null;				
		for(int k=0;k<IPDT.length;k++){
			tempkey   = IPDT[k];
			tempValue = IPDT[k];
			tempkey = tempkey.substring(0,tempkey.indexOf(ATRATE));		   
		   tempValue = IPDT[k].substring(IPDT[k].indexOf(ATRATE)+1,IPDT[k].length());
		   value = tempValue.split(ATRATE);		   
		   for(int j=0;j<value.length;j++){		   	
		   	vkey.add(tempkey);
		   	vVal.add(value[j]);
		   }		   		   
		}		
		MIPADDS = (String[]) vkey.toArray(new String[0]);
		MIPPRTS = (String[]) vVal.toArray(new String[0]);		 	
	}
	
	/**
	 * This method is used for fetching IP's in String array format
	  * @return String []
	 *
	 * @Date May 20, 2008
	 * @author karthik
	 */
	public static String[] getMIPadds(){
		return MIPADDS;
	}
	
	/**
	 * This method is used for fetching Ports's in String array format
	 * @return String []
	 *
	 * @Date May 20, 2008
	 * @author karthik
	 */
	public static String[] getMIPprts(){
		return MIPPRTS;
	}
	
	
	/**
	 * This method expands the Exponential Double format for display
	 * @param val [ 1.0E-4 ==> 0.0001 ]
	 * @return    String
	 * 
	 * @author karthik
	 * @Date 20/SEPT/2007
	 */
	
	public static String setDecimalFix(String val){
		Double amount = new Double(val);		
		NumberFormat nf = new DecimalFormat(DECIMALFRMT);
		val = nf.format(amount);
		InfinetUtility.log("InfinetUtility.setDecimalFix: " + val);		
		return val;
	}
	
	
	/**
	 * This method takes input as double value and returns the formated double value as string 
	 * @param doubleval  [ 100       ==> 100 ]
	 *                   [ 100.00	 ==> 100 ]
	 *                   [ 100.25	 ==> 100.25 ]
	 *                   [ 100.2500  ==> 100.25 ]
	 *                   [ 100.2501  ==> 100.2501 ]
	 *                   [ 0.0001	 ==>  0.0001 ]
	 * 
	 * @return String
	 * @AUTHOR nagaraju.kuppala
	 * @Date Sep 11, 2008
	 */
	public static String setDecimalFix(double doubleval){
		String val="";
		NumberFormat nf = new DecimalFormat(DECIMALFRMT);
		val = nf.format(doubleval);
		InfinetUtility.log("InfinetUtility.setDecimalFix: " + val);		
		return val;
	}
	
	
	
	
	/**
	 * This method takes input as float value and returns the formated float vaule as string 
	 * @param floatval   [ 100       ==> 100 ]
	 *                   [ 100.00f	 ==> 100 ]
	 *                   [ 100.25f	 ==> 100.25 ]
	 *                   [ 100.2500f ==> 100.25 ]
	 *                   [ 100.2501f ==> 100.2501 ]
	 *                   [ 0.0001f   ==> 0.0001 ]
	 * @return
	 * @return String
	 * @AUTHOR nagaraju.kuppala
	 * @Date Sep 11, 2008
	 */
	
	public static String setDecimalFix(float floatval){
		String val="";
		NumberFormat nf = new DecimalFormat(DECIMALFRMT);
		val = nf.format(floatval);
		InfinetUtility.log("InfinetUtility.setDecimalFix: " + val);	
		return val;
	}	
	
	/**
	 * 
	 * @param num
	 * @param numMax
	 * @return
	 *
	 * @Date Mar 12, 2008
	 * @author karthik
	 */
	
	public static String setNumberFix(int num, int numMax) {
		StringBuffer upnd = new StringBuffer();
		if ((num + "").trim().length() > numMax) {
			upnd.append(num);
		} else if ((num + "").trim().length() <= numMax) {
			int ttlgth = numMax - (num + "").trim().length();			
			for (int h = 0; h < ttlgth; h++) {upnd.append("0");}
			upnd.append(num);
		}
		return upnd.toString();
	}
		
	/**
	 * This method provides number fix  preseding "0" depends on maxLength digits
	 * @param num       : I/p number
	 * @param maxLength : I/p Max Length displayed with '0' append
	 * @return '0' appemded values
	 *
	 * @Date Mar 12, 2008
	 * @author karthik
	 */
	
	public static String[] setNumberFix(int[] num,int maxLength){
		String[] numArray = new String[num.length];
		for(int y=0;y<num.length;y++){
			numArray[y] = setNumberFix(num[y],maxLength);			
		}		
		return numArray;	
	}
	
	
	
		
	/**
	 * This method Automatically Resizes the an 
	 * String arry by removal of empty buckets from the Array
	 *  
	 * @param valueRezise Array to be trimmed of empty buckets
	 * @return
	 *
	 * @Date Jul 1, 2008
	 * @author karthik
	 */
	public static String[] getResizeStringArray(String[] valueRezise) {
		String[] remove = {""};
		List list = new ArrayList(Arrays.asList(valueRezise));
		list.removeAll(new ArrayList(Arrays.asList(remove)));
		valueRezise = (String[]) list.toArray(new String[list.size()]);
		return valueRezise;
	}

	/**
	 * This method Automatically Resizes the an 
	 * String arry by removal of empty buckets from the Array
	 *  
	 * @param valueRezise valueRezise Array to be trimmed of empty 
	 *        buckets of toRemoveValue
	 * @param toRemoveValue Values of type to be removed from array
	 * @return
	 *
	 * @Date Jul 1, 2008
	 * @author karthik
	 */
	public static String[] getResizeStringArray(String[] valueRezise, String toRemoveValue) {
		String[] remove = {toRemoveValue};
		List list = new ArrayList(Arrays.asList(valueRezise));		
		list.removeAll(new ArrayList(Arrays.asList(remove)));		
		valueRezise = (String[]) list.toArray(new String[list.size()]);
		return valueRezise;
	}	
	
	
	/**
	 * This method Automatically Resizes the an 
	 * String arry by removal /replace the all occurance of replacements Data 
	 * buckets from the Array	 
	 * @param toRemoveValue
	 * @param toReplaceValue
	 * @return String Array[]
	 * Nov 9, 2010
	 * @Author karthik.nanjangude
	 */
	
	
	public static String[] getResizeStringArray(String[] valueRezise, String toRemoveValue,String toReplaceValue) {		
		List list = new ArrayList(Arrays.asList(valueRezise));
		Collections.replaceAll(list,toRemoveValue,toReplaceValue);
		valueRezise = (String[]) list.toArray(new String[list.size()]);
		return valueRezise;
	}
	
	
	/**
	 * this method formats the header data display with column headers 
	 * and respective values
	 * @author pavan.chennopragada
	 * @param header
	 * @param vals
	 * 
	 * @return
	 */
	public static String setdatadisplayformattable(String[] header,String[] vals){
		StringBuffer table = new StringBuffer("<br>&nbsp;&nbsp;&nbsp;<table width=\"36%\" border=\"1\" align=\"left\" cellpadding=\"1\" cellspacing=\"1\" class=\"tablecellborder\">");
		for(int i=0;i<header.length;i++){
			table.append("<tr><td nowrap=\"nowrap\" class=\"customercareheadings\">"+header[i]+"</td><td width=\"100\" nowrap=\"nowrap\" class=\"formrow2\" align=\"center\"><div class=\"content11\">"+vals[i]+"</div></td></tr>");
		}
		table.append("</table><br>");
		return table.toString();
	}
	
	
	/**
	 * this method changes the date to a specified format
	 * and respective values
	 * @author 
	 * @param date
	 * 
	 * @return
	 */
	public String getFormattedDate(String strDate) {
		try {
			SimpleDateFormat sdfSource = new SimpleDateFormat("MM/dd/yy hh:mm:ss.SSSSSS a");
			Date date = sdfSource.parse(strDate);
			SimpleDateFormat sdfDestination = new SimpleDateFormat("MM/dd/yy hh:mm:ss a");
			strDate = sdfDestination.format(date);
		}catch (ParseException pe){
			System.out.println("Parse Exception : " + pe);
		}finally{
			return strDate;
		}
	}
}