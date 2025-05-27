package com.xius.smf.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * @author Phani.Chavala
 */
public class DateUtil {
	private static final Logger logger = LogManager.getLogger(DateUtil.class.getSimpleName());

	/**
	 * Returns the previous date string which is nDays from the given date
	 */
	
	public static final String DDMMYYYY_HHMMSS_FORMATE = "dd/MM/yyyy HH:mm:ss";
	public static final String MMDDYYYY_HHMMSS_FORMATE = "MM/dd/yyyy HH:mm:ss";
	
	public static String getPreviousDate(String inDate, String inDateFormat,
			String outDateFormat, int nDays) throws Exception {
		String outDate = null;

		SimpleDateFormat inSdf = new SimpleDateFormat(inDateFormat);
		Date inputDate = inSdf.parse(inDate);

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(inputDate);
		calendar.add(Calendar.DATE, -nDays);
		Date convertedDate = calendar.getTime();

		SimpleDateFormat defaultSdf = new SimpleDateFormat("EEE MMM dd kk:mm:ss zzz y"); //this is the format of default date.toString()
		SimpleDateFormat outSdf = new SimpleDateFormat(outDateFormat);
		outDate = outSdf.format(defaultSdf.parse((convertedDate.toString())));

		return outDate;
	}

	/**
	 *	Returns the next date string which is nDays from the given date 
	 */
	public static String getNextDate(String inDate, String dateFormat,
			String outDateFormat, int nDays) throws Exception {
		String outDate = null;

		SimpleDateFormat inSdf = new SimpleDateFormat(dateFormat);
		Date inputDate = inSdf.parse(inDate);

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(inputDate);
		calendar.add(Calendar.DATE, nDays);
		Date convertedDate = calendar.getTime();

		SimpleDateFormat defaultSdf = new SimpleDateFormat("EEE MMM dd kk:mm:ss zzz y");//this is the format of default date.toString()
		SimpleDateFormat outSdf = new SimpleDateFormat(outDateFormat);
		outDate = outSdf.format(defaultSdf.parse((convertedDate.toString())));

		return outDate;
	}

	/**
	 *	Returns the next Date object which is nDays from the given date 
	 */
	public static Date getNextDate(Date inDate, int nDays) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(inDate);

		calendar.add(Calendar.DATE, nDays);
		Date nextDate = calendar.getTime();

		return nextDate;
	}

	/**
	 *	Returns the Date object for a given date string 
	 */
	public static Date getDate(String date, String format) {
		if(null == date )
			return null;

		Date outDate = null;
		SimpleDateFormat inSdf = new SimpleDateFormat(format);
		try {
			outDate = inSdf.parse(date);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Unable to parse the given date: " + date + "; format: " + format);
		}
		return outDate;
	}

	/**
	 *	Converts the given date string to required format 
	 */
	public static String getRequiredDate(String inDate, String dateFormat,String outDateFormat) {
		String outDate = null;

		Date inputDate = getDate(inDate, dateFormat);

		SimpleDateFormat defaultSdf = new SimpleDateFormat("EEE MMM dd kk:mm:ss zzz y");
		SimpleDateFormat outSdf = new SimpleDateFormat(outDateFormat);
		try {
			outDate = outSdf.format(defaultSdf.parse((inputDate.toString())));
		} catch (ParseException e) {

			e.printStackTrace();
		}

		return outDate;
	}

	/**
	 *	Returns date string for a given Date object 
	 */
	public static String getDate(Date date, String format) {
		String outDate = null;
		SimpleDateFormat defaultSdf = new SimpleDateFormat("EEE MMM dd kk:mm:ss zzz y");
		try {
			SimpleDateFormat outSdf = new SimpleDateFormat(format);
			outDate = outSdf.format(defaultSdf.parse((date.toString())));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Unable to parse the given date: " + date
					+ "; format: " + format);
		}
		return outDate;
	}

	/**
	 *	Returns number of days between given dates represented by Calendar objects 
	 */
	public static int getDaysBetween(java.util.Calendar d1, java.util.Calendar d2) {
		if (d1.after(d2)) { // swap dates so that d1 is start and d2 is end
			java.util.Calendar swap = d1;
			d1 = d2;
			d2 = swap;
		}
		int days = d2.get(java.util.Calendar.DAY_OF_YEAR)
				- d1.get(java.util.Calendar.DAY_OF_YEAR);
		int y2 = d2.get(java.util.Calendar.YEAR);
		if (d1.get(java.util.Calendar.YEAR) != y2) {
			d1 = (java.util.Calendar) d1.clone();
			do {
				days += d1.getActualMaximum(java.util.Calendar.DAY_OF_YEAR);
				d1.add(java.util.Calendar.YEAR, 1);
			} while (d1.get(java.util.Calendar.YEAR) != y2);
		}
		return days;
	}

	/**
	 *	Returns number of days between given dates represented by Date objects 
	 */
	public static int getDaysBetween(Date date1, Date date2) {
		Calendar d1 = new GregorianCalendar();
		d1.setTime(date1);

		Calendar d2 = new GregorianCalendar();
		d2.setTime(date2);

		if (d1.after(d2)) { // swap dates so that d1 is start and d2 is end
			java.util.Calendar swap = d1;
			d1 = d2;
			d2 = swap;
		}
		int days = d2.get(java.util.Calendar.DAY_OF_YEAR)
				- d1.get(java.util.Calendar.DAY_OF_YEAR);
		int y2 = d2.get(java.util.Calendar.YEAR);
		if (d1.get(java.util.Calendar.YEAR) != y2) {
			d1 = (java.util.Calendar) d1.clone();
			do {
				days += d1.getActualMaximum(java.util.Calendar.DAY_OF_YEAR);
				d1.add(java.util.Calendar.YEAR, 1);
			} while (d1.get(java.util.Calendar.YEAR) != y2);
		}
		return days;
	}

	/**
	 *	Returns the week day name for a given date string 
	 */
	public static String getWeekDay(String date, String format) {
		String[] weeks = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		Date inDate = getDate(date, format);

		Calendar d1 = new GregorianCalendar();
		d1.setTime(inDate);

		return weeks[d1.get(Calendar.DAY_OF_WEEK) - 1];
	}

	/**
	 * Compares two dates strings.
	 * 
	 * @param date1
	 *            Date 1
	 * @param date2
	 *            Date 2
	 * @param format
	 *            format of Date 1 and Date 2
	 * @return 0 if Date 1 = Date 2, 1 if Date 2 is greater than Date 1, -1 if
	 *         Date 1 is greater than Date 2
	 */
	public static int compare(String date1, String date2, String format) {

		Date d1 = getDate(date1, format);
		Date d2 = getDate(date2, format);

		if ((d2.getTime() - d1.getTime()) > 0)
			return 1;
		else if ((d2.getTime() - d1.getTime()) < 0)
			return -1;

		return 0;
	}

	/**
	 * Compares two Date objects
	 * 
	 * @param date1
	 *            Date 1
	 * @param date2
	 *            Date 2
	 * @param format
	 *            format of Date 1 and Date 2
	 * @return 0 if Date 1 = Date 2, 1 if Date 2 is greater than Date 1, -1 if
	 *         Date 1 is greater than Date 2
	 */
	public static int compare(Date d1, Date d2) {

		if ((d2.getTime() - d1.getTime()) > 0)
			return 1;
		else if ((d2.getTime() - d1.getTime()) < 0)
			return -1;

		return 0;
	}

	/**
	 * Checks whether a given date string falls in between two given date strings 
	 * 
	 * @param d1
	 *            startDate
	 * @param d2
	 *            endDate
	 * @param d
	 *            some date between startDate and endDate
	 * @param format
	 *            Date format string
	 * @return true if d is between d1 and d2, false otherwise
	 */
	public static boolean isWithinDateRange(String d1, String d2, String d, String format) {
		Date dt1 = getDate(d1, format);
		Date dt2 = getDate(d2, format);
		Date dt = getDate(d, format);

		if ((dt1.getTime() - dt.getTime()) <= 0
				&& (dt2.getTime() - dt.getTime()) >= 0)
			return true;

		return false;
	}


	/**
	 *	Returns SQL date for a given java.util.Date object 
	 */
	public static java.sql.Date getSqlDate(Date date) {
		java.sql.Date sqlDate = null;

		try {

			sqlDate = new java.sql.Date(date.getTime());

		} catch (Exception e) {
			System.out.println("Exception occured while converting date to Sql date: " + e);
		}

		return sqlDate;

	}

	/**
	 *	Returns SQL date for a given date string 
	 */
	public static java.sql.Date getSqlDate(String dateIn, String format, TimeZone timeZone) {
		java.sql.Date sqlDate = null;

		try {

			SimpleDateFormat sdf = new SimpleDateFormat(format);
			Calendar cal = Calendar.getInstance();

			if (timeZone != null)
				sdf.setTimeZone(timeZone);
			else
				sdf.setTimeZone(TimeZone.getDefault()); // apply default TimeZone

			cal.setTime(sdf.parse(dateIn));

			sqlDate = new java.sql.Date(cal.getTimeInMillis());

		} catch (Exception e) {
			System.out.println("Exception occured while converting date to Sql date: "+ e);
		}

		return sqlDate;
	}


	/**
	 *	Returns next date as string with the given format 
	 */
	public static String getNextDayDate(String format) {

		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, 1);
		Date nextDate = calendar.getTime();
		String nextDayDate = dateFormat.format(nextDate);

		return nextDayDate;
	}


	/**
	 * Checks whether the given date and time fall within the daterange and 
	 * after the current hour.
	 * 
	 * @param d1
	 *            startDate
	 * @param d2
	 *            endDate
	 * @param d
	 *            some date between startDate and endDate
	 * @param h           
	 *         	  Hour to check with current hour   
	 * @param format
	 *            Date format string
	 * @return true if d is between d1 and d2 & h > current hour, false otherwise
	 */
	public static boolean isAfterCurrentHour(String d1, String d2, String d, String h, String format) {

		Date dt1 = getDate(d1, format);
		Date dt2 = getDate(d2, format);
		Date dt = getDate(d, format);
		Calendar c1 = Calendar.getInstance();
		c1.setTime(dt);
		try{
			c1.set(Calendar.HOUR_OF_DAY, Integer.parseInt(h));
		}catch(Exception e){
			e.printStackTrace();
			c1.set(Calendar.HOUR_OF_DAY, 0);
		}

		Calendar current = Calendar.getInstance();
		//if given date is between start & end dates
		if ((dt1.getTime() - dt.getTime()) <= 0 && (dt2.getTime() - dt.getTime()) >= 0){

			if(c1.getTimeInMillis() > current.getTimeInMillis()){
				return true;
			}
		}
		return false;
	}

	/**
	 * Checks whether the given date and time is 
	 * after the current hour.
	 * 
	 * @param d
	 *            Date
	 * @param h           
	 *         	  Hour to check with current hour   
	 * @param format
	 *            Date format string
	 * @return true if d & h are greater than current hour, false otherwise
	 */
	public static boolean isAfterCurrentHour(String d, int h, String format) {

		Date dt = getDate(d, format);
		Calendar c1 = Calendar.getInstance();
		c1.setTime(dt);
		c1.set(Calendar.HOUR_OF_DAY, h);

		Calendar current = Calendar.getInstance();
		if(c1.getTimeInMillis() > current.getTimeInMillis()){
			return true;
		}

		return false;
	}

	public static Calendar getDateToCalendar(Date dateTobeConverted) {

		Calendar calendar = null;
		try {    

			SimpleDateFormat sdf = new SimpleDateFormat ( "dd/MM/yyyy hh:mm:ss" ) ; 

			String serviceDate = sdf.format ( dateTobeConverted  ) ; 
			if( serviceDate != null ) {

				Date date = (Date)sdf.parse(serviceDate);
				if( date != null ) {

					calendar = Calendar.getInstance();
					calendar.setTime(date);
				}
			}

		} catch (ParseException e){

			System.out.println("Exception :"+e);    
		}    

		return calendar;
	}

	public static Date getCalendarToDate(Calendar calendar) {

		Date date = null;
		if( calendar != null ) {

			date = calendar.getTime(); // Use this for method call
		}
		return date;
	}

	public static String getMMDDYYYYFormatedDate(Date date) {

		String MMddyyyDate = null;
		if( date != null ) {

			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
			MMddyyyDate = formatter.format( date );
		}

		return MMddyyyDate;
	}

	public static String getDDMMYYYYFormatedDate(Date date) {

		String MMddyyyDate = null;
		if( date != null ) {

			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
			MMddyyyDate = formatter.format( date );
		}

		return MMddyyyDate;
	}

	public static String parseDate(String date, String oldFormat, String newFormat ) {

		String formatedDate = null;
		Date oldFromatedDate = null;
		SimpleDateFormat oldFormatter = null;
		SimpleDateFormat newFormatter = null;
		
		if( Utilities.isNull( date ) == false ) {
			
			if( Utilities.isNull( oldFormat ) == false &&  
					Utilities.isNull( newFormat ) == false) {
				try {
					
					oldFormatter = new SimpleDateFormat( oldFormat );
					newFormatter = new SimpleDateFormat( newFormat );
					if( null != oldFormat ) {
						
						oldFormatter = new SimpleDateFormat(oldFormat);
						if( null != oldFormatter ) {
							
							oldFromatedDate = oldFormatter.parse(date);
						}
					}
					
					if( null != newFormatter ) {
						
						if( null != oldFromatedDate ) {
							
							formatedDate = newFormatter.format( oldFromatedDate );
						}
					}
					
				} catch (ParseException e) {
					
					e.printStackTrace();
				}
			}
		}

		return formatedDate;
	}

	/*public static void main(String[] args) {

		String MMddyyyDate = "02/17/2012";
		String ddMMyyyDate = parseDate( MMddyyyDate );
		System.out.println("Date : " + ddMMyyyDate);
	}*/

	/**
	 * @param dateWithFmt
	 * @return boolean
	 * This method is used to validate the given date with format
	 */
	public static boolean isDateFormatValid(String dateWithFmt) 
	{
		boolean flag 			= true;
		SimpleDateFormat format = null;
		try
		{
			format =  new java.text.SimpleDateFormat("MM/dd/yyyy");
			format.setLenient(false);
			format.parse(dateWithFmt);		

		}catch(ParseException e)
		{
			flag =false;
			//e.printStackTrace();

		}catch(IllegalArgumentException e)
		{
			flag =false;
			//e.printStackTrace();

		}catch(Exception e){

			flag =false;
			//e.printStackTrace();
		}finally{
			format =null;
		}
		return flag;
	}
	
	/**
	 * This method is used to convert valid date string to a Calendar object
	 * @param date String
	 * @return Calendar
	 */
	public static Calendar stringToCalendar(String date) {

		Calendar cal = null;
		SimpleDateFormat df = null;

		if( Utilities.isNull( date ) == false ) {

			if( date.length() <= 10 ) {

				// bnr date with time format dd/MM/yyyy
				df = new SimpleDateFormat( "dd/MM/yyyy");
			} else {

				// date with time format 
				df = new SimpleDateFormat( "MM/dd/yyyy hh:mm:ss");
			}

			try {
				cal = Calendar.getInstance();

				if( null != df ) {

					Date d1 = df.parse(date);

					cal.setTime(d1);
				}

			} catch (ParseException e) {
				logger.error(Utilities.getStackTrace(e));
			}
		}

		return cal;
	}
	/**
	 * Converts the date object to given formated date.
	 * if format is null then default format "dd/MM/yyyy hh:mm:ss" is applied.
	 * @param date Date
	 * @param format String
	 * @param timeZone String
	 * @return formatedDate String
	 */
	public static String calendarToString(Calendar calendar, String format, String timeZone) {

		String outDate = null;

		if(Utilities.isNull( timeZone ) == false ) {

			calendar.setTimeZone(TimeZone.getTimeZone( timeZone ));
		}
		Date date = calendar.getTime();

		//System.out.println("***************** : " + calendar );

		if( null != date ) {


			SimpleDateFormat defaultSdf = null;
			SimpleDateFormat outSdf     = null;

			try {
				defaultSdf = new SimpleDateFormat("EEE MMM dd kk:mm:ss zzz y");
				outSdf     = new SimpleDateFormat(format);
			} catch (IllegalArgumentException e) {

				// Default Format
				outSdf = new SimpleDateFormat( format );
			}

			try {
				outDate = outSdf.format(defaultSdf.parse((date.toString())));
			} catch (ParseException e) {
				logger.error(Utilities.getStackTrace(e));
			}
		}


		return outDate;
	}
} 
