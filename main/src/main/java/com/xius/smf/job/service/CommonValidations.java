
package com.xius.smf.job.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CommonValidations {

	private static final Logger logger = LogManager.getLogger("CommonValidations");

	private static final String EMPTY_STRING = "";
	private static final int HHMAXVAL = 99;
	private static final int MMMAXVAL = 59;
	private static final int SSMAXVAL = 59;

	private static final char[] alphaNumeric = {
		'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
		'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 
		'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'
	};
        
   private static final char[] hexValues = {
       'A','B','C','D','E','F','0','1','2','3','4','5','6','7','8','9'
   };

	private static final char[] numeric = {
		'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'
	};

	public CommonValidations() {
	}

	/**
	 * This method Checks if a given string is null or "" (empty)
	 * @param s
	 * @return  true / false
	 *
	 * @Author karthik.nanjangude
	 * @Date Oct 1, 2008
	 */
	
	public static boolean isEmpty(String s) {
		return ((getStrValue(s).trim()).equals(EMPTY_STRING) ? true : false);
	}
	
	/**
	   * This method Checks if a given string consists only numeric value
	   * @param s
	   * @return true / false
	   *
	   * @Author karthik.nanjangude
	   * @Date Oct 1, 2008
	   */
		
		public static boolean isNumeric(String s) {
			if (s == null || s.length() == 0) {
				return false;
			}
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);

				if ((c < '0') || (c > '9')) {
					return false;
				}
			}
			return true;
		}
		
		/**
		 * This method Checks the length of a String is in between given min and max length
		 * @param s
		 * @param MINLENGTH
		 * @param MAXLENGTH
		 * @return true /false
		 *
		 * @Author karthik.nanjangude
		 * @Date Oct 1, 2008
		 */

		public static boolean isLengthValid(String s, int MINLENGTH, int MAXLENGTH) {
			if (s.length() >= MINLENGTH && s.length() <= MAXLENGTH)
				return true;
			return false;
		}
	
		
		/**
		 * This method checks for Alphanumeric
		 * @param s
		 * @return true /false
		 *
		 * @Author karthik.nanjangude
		 * @Date Oct 1, 2008 
		 */
		public static boolean isAlphaNumeric(String s) {
			char c;
			boolean status = true;
			for (int i = 0; i < s.length(); i++) {
				c = s.toLowerCase().charAt(i);
				int j;
				for (j = 0; j < alphaNumeric.length; j++) {
					if (c == alphaNumeric[j])
						break;

				}
				if (j == alphaNumeric.length) {
					status = false;
					break;
				}
			}
			return status;

		}
		
		
		 /**
		  * 
		  * This method validated the AlphaNumericWithSpace
		  * 
		  * @param s
		  * @return
		  * ramsundar.balagoni
		  * Apr 25, 2011
		  */
		 
		 public static boolean isAlphaNumericWithSpace(String s) {
			 
			 	String temp = String.valueOf(alphaNumeric) + String.valueOf(' ');
				char[] alphaNumericWithSpace = temp.toCharArray();
			 	char c;
				boolean status = true;
				for (int i = 0; i < s.length(); i++) {
					c = s.toLowerCase().charAt(i);
					int j;
					for (j = 0; j < alphaNumericWithSpace.length; j++) {
						if (c == alphaNumericWithSpace[j])
							break;

					}
					if (j == alphaNumericWithSpace.length) {
						status = false;
						break;
					}
				}
				return status;

			}
		 
		 
		 /**
			 * This method will check for String which 
			 * is only alphanumeric /space allowed
			 * @param s
			 * @return
			 *
			 * @Author karthik.nanjangude
			 * @Date Oct 1, 2008
			 */
			
			public static boolean isAlphabetWithSpace(String s) {
				for (int i = 0; i < s.length(); i++) {
					char c = s.charAt(i);
					if(c== ' '){continue;}
					if (((c < 'a') || (c > 'z')) && ((c < 'A') || (c > 'Z'))) {
						return false;
					}
				}
				return true;
			}
	
	
			private static String getStrValue(String s) {
				return ((null == s) ? "" : s);
			}
	
			
			/**
			 *  This will split the given String with the given delimitter 
			 * @param strValue
			 * @param delimitter
			 * @return tokenizedarr 
			 *
			 * @Author karthik.nanjangude
			 * @Date Oct 1, 2008
			 */
			
			public static String[] splitString(String strValue, String delimitter) {
				String strvalue1 = strValue;
				int arrcount = 0;
				while (strvalue1.indexOf(delimitter) >= 0) {
					int start = strvalue1.indexOf(delimitter);
					String tokenValue = strvalue1.substring(0, start);
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

			
			/**
			 * This Checks whether given string contains valid No of Fields when seperated by delimitter
			 * @param strValue
			 * @param delimitter
			 * @param noofFields
			 * @return true /false
			 *
			 * @Author karthik.nanjangude
			 * @Date Oct 1, 2008
			 */

			public static boolean isNOofFieldsValid(String strValue, String delimitter, int noofFields) {
				if (splitString(strValue, delimitter).length != noofFields) {
					return false;
				}
				return true;
			}
			
			public static boolean isNOofFieldsValidTemp(String strValue, String delimitter, int noofFields) {
				
				Pattern pattern = Pattern.compile(delimitter);
				Matcher matcher = pattern.matcher(strValue);

				int count = 0;
				while(matcher.find()) {
					count++;
				}
				if ((count + 1) == noofFields) {
					return true;
				}
				return false;
			}
	
	/**
	 * This Checks the length of a String
	 * @param s
	 * @param LENGTH
	 * @return  true /false
	 *
	 * @Author karthik.nanjangude
	 * @Date Oct 1, 2008
	 */

	
	/*public static boolean isLengthValid(String s, int LENGTH) {
		if (s.trim().length() < LENGTH || s.trim().length() > LENGTH) {
			return false;
		}
		return true;
	}*/

	
	
	
	/**
	 * This method Checks the length of a String is greather than the given length
	 * @param s
	 * @param LENGTH
	 * @return true /false
	 *
	 * @Author karthik.nanjangude
	 * @Date Oct 1, 2008
	 */

/*	public static boolean isLengthGreather(String s, int LENGTH) {
		if (s.trim().length() == LENGTH) {
			return false;
		}
		if (s.trim().length() < LENGTH) {
			return false;
		}
		return true;
	}*/

	
	
	


	
	
	/**
	 * This method checks whether the given Vector contains the given string or not
	 * @param s
	 * @param v
	 * @return true /false
	 *
	 * @Author karthik.nanjangude
	 * @Date Oct 1, 2008
	 */

/*	public static boolean containsValue(String s, Vector v) {
		if (v != null && v.contains(s.trim())) {
			return true;
		}
		return false;
	}*/

	
	
	/**
	 * This method Checks whether given to and from are in range
	 * @param to
	 * @param from
	 * @return true /false
	 *
	 * @Author karthik.nanjangude
	 * @Date Oct 1, 2008
	 */

/*	public static boolean isRangeNegative(String to, String from) {

		try {
			if ((Long.parseLong(to) - Long.parseLong(from)) >= 0) {
				return true;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
		return false;
	}*/
	
	
	



	
	/**
	 * This Checks whether the given String is in HHMMSS format 
	 * @param strVal
	 * @return
	 *
	 * @Author karthik.nanjangude
	 * @Date Oct 1, 2008
	 */

	/*public static boolean isFormatHHMMSS(String strVal) {
		try {
			if (Integer.parseInt(strVal.substring(2, 4)) > MMMAXVAL || Integer.parseInt(strVal.substring(4, 6)) > SSMAXVAL) {
				return false;
			}
		} catch (Exception ex) {
			return false;
		} finally {
		}
		return true;
	}*/

		
	/**
	 * This method will convert the given string(Should be HHMMSS) to seconds 
	 * @param strVal
	 * @return <xxxxxxxxxxxxxxxxxxxxxxx>
	 *
	 * @Author karthik.nanjangude
	 * @Date Oct 1, 2008
	 */

/*	public static int convertHHMMSStoSec(String strVal) {
		try {
			System.out.println(Integer.parseInt(strVal.substring(0, 2)) * 3600 + Integer.parseInt(strVal.substring(2, 4)) * 60 + Integer.parseInt(strVal.substring(4, 6)));
			return (Integer.parseInt(strVal.substring(0, 2)) * 3600 + Integer.parseInt(strVal.substring(2, 4)) * 60 + Integer.parseInt(strVal.substring(4, 6)));
		} catch (Exception ex) {
			return 0;
		} finally {
		}

	}*/

	
	/**
	 * Converts the given seconds to HHMMSS format
	 * @param strVal
	 * @return <xxxxxxxxxxxxxxxxxxxxxxx>
	 *
	 * @Author karthik.nanjangude
	 * @Date Oct 1, 2008
	 */

	/*public static String[] convertSectoHHMMSS(String strVal) {
		String str[] = {"00", "00", "00"};
		try {
			int l = Integer.parseInt(strVal);
			str[0] = "" + l / 3600;
			if (str[0].length() == 1) {
				str[0] = "0" + str[0];
			}
			str[1] = "" + (l % 3600) / 60;
			if (str[1].length() == 1) {
				str[1] = "0" + str[1];
			}
			str[2] = "" + (l % 3600) % 60;
			if (str[2].length() == 1) {
				str[2] = "0" + str[2];
			}
			//System.out.println(str[0]+"  "+str[1]+"  "+str[2]);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
		}
		// System.out.println("convertSectoHHMMSS  " + str[0]+"  "+str[1]+"  "+str[2]);
		return str;
	}*/


	/**
	 * This method will seperate the Line no and content from the given string 
	 * @param strValue
	 * @param seperator
	 * @return <xxxxxxxxxxxxxxxxxxxxxxx>
	 *
	 * @Author karthik.nanjangude
	 * @Date Oct 1, 2008
	 */

	/*public static String[] getLineandContent(String strValue, String seperator) {
		String[] str = splitString(strValue, seperator);
		if (str.length > 2) {
			for (int i = 2; i < str.length; i++) {
				str[1] = str[1] + seperator + str[i];
			}
		}
		// System.out.println(str[0]+"    "+ str[1]);
		return str;
	}*/

	
	/**
	 * Checks if a given string consists only numeric value
	 * @param s
	 * @return true /false
	 *
	 * @Author karthik.nanjangude
	 * @Date Oct 1, 2008
	 */

	/*public static boolean isAlphabet(String s) {
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (((c < 'a') || (c > 'z')) && ((c < 'A') || (c > 'Z'))) {
				return false;
			}
		}
		return true;
	}*/

	

	//         public static boolean isAlphabetUscore(String s) {
	//                for (int i = 0; i < s.length(); i++) {
	//                        char c = s.charAt(i);
	//
	//                        if (((c < 'a') || (c > 'z')) && ((c < 'A') || (c > 'Z'))) {
	//                            if (c == '_')  {
	//                                continue;    
	//                            }
	//                            
	//                            return false;
	//                        }
	//                }
	//                return true;
	//        }

	
	
        
    
	/**
	 * This method checks for isHexValue
	 * @param s
	 * @return true /false
	 *
	 * @Author karthik.nanjangude
	 * @Date Oct 1, 2008 
	 */
    /*public static boolean isHexValue(String s) {
		char c;
		boolean status = true;
		for (int i = 0; i < s.length(); i++) {
			c = s.toUpperCase().charAt(i);
			int j;
			for (j = 0; j < hexValues.length; j++) {
				if (c == hexValues[j])
					break;

			}
			if (j == hexValues.length) {
				status = false;
				break;
			}
		}
		return status;
	}*/

    
      /**
		 * This method checks for isAlphaNumericSPL with special value
		 * 
		 * @param s
		 * @return true /false
		 * @Author karthik.nanjangude
		 * @Date Oct 1, 2008
		 */
    
    
	/*public static boolean isAlphaNumericSPL(String s, char[] splchar) {
		String temp = String.valueOf(alphaNumeric) + String.valueOf(splchar);
		char[] alpha = temp.toCharArray();
		boolean status = true;
		char c;
		for (int i = 0; i < s.length(); i++) {
			c = s.toLowerCase().charAt(i);
			int j;
			for (j = 0; j < alpha.length; j++) {
				if (c == alpha[j])
					break;

			}
			if (j == alpha.length) {
				status = false;
				break;
			}
		}
		temp = null;
		alpha = null;
		return status;
	}*/

	
	/**
	 * This method checks for isNumericSPL with special value
	 * 
	 * @param s
	 * @return true /false
	 * @Author karthik.nanjangude
	 * @Date Oct 1, 2008
	 */
	
	/*public static boolean isNumericSPL(String s, char[] splchar) {
		String temp = String.valueOf(numeric) + String.valueOf(splchar);
		char[] alpha = temp.toCharArray();
		boolean status = true;
		char c;
		for (int i = 0; i < s.length(); i++) {
			c = s.toLowerCase().charAt(i);
			int j;
			for (j = 0; j < alpha.length; j++) {
				if (c == alpha[j])
					break;

			}
			if (j == alpha.length) {
				status = false;
				break;
			}
		}
		temp = null;
		alpha = null;
		return status;
	}*/

	
	/**
	 * This method checks for isDateCorrect
	 * 
	 * @param s
	 * @return true /false
	 * @Author karthik.nanjangude
	 * @Date Oct 1, 2008
	 */
	
	/*public static boolean isDateCorrect(String s) {
		if (isAlphabet(s)) {
			return false;
		}
		char ch[] = {'/', ':', ' '};
		if (!isNumericSPL(s, ch)) {
			return false;
		}
		if (s.endsWith("/") || s.endsWith(":")) {
			return false;
		}
		try {
			SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
			df.parse(s);
			return true;
		} catch (ParseException ex) {
			return false;
		}
	}*/

	/**
	 * This method checks for isDateGreather
	 * 
	 * @param s
	 * @return true /false
	 * @Author karthik.nanjangude
	 * @Date Oct 1, 2008
	 */
	
	/*public static boolean isDateGreather(String date1, String date2) {
		try {
			SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
			Date d1 = df.parse(date1);
			Date d2 = df.parse(date2);
			if (d1.after(d2)) {
				return true;
			}
		} catch (ParseException ex) {
			return true;
		}
		return false;
	}*/
        
    
	/**
	 * This method checks for isValidIP
	 * 
	 * @param s
	 * @return true /false
	 * @Author karthik.nanjangude
	 * @Date Oct 1, 2008
	 */
	 /*public static boolean isValidIP(String ipAddress) {
         try
         {
            StringTokenizer st = new StringTokenizer(ipAddress,".");
            int count = 0,flag=0;     
            while (st.hasMoreTokens()) {
               count++;
               if (count > 4) {
                  return false;
               }
               String quod = st.nextToken();
               int i = Integer.parseInt(quod);
               if(i==0)flag++;
               if (i<0 || i>255) {
                  return false;
               }
            }  
            if(flag==4)return false;
            return(count == 4);
         }
         catch (NumberFormatException ex) {
            return false;
         }catch(Exception ex){
             return false;
         }
      }*/
 
	
	 
		
		
		
  	 /**
  	  * This method validated the emial String
  	  * @param ca
  	  * @return
  	  *
  	  * @Author karthik.nanjangude
  	  * @Date Oct 1, 2008
  	  */	
	/* public static  boolean validateEmail(String ca) {
	 	 Pattern pattern = Pattern.compile("[a-zA-Z0-9_]+[.[a-zA-Z0-9]+]*@[a-zA-Z0-9_]+[.[a-zA-Z]+]+");
		 Matcher en = pattern.matcher(ca);
		 return en.matches();
	}
	
	         
	 public static boolean isPositiveRealValue(String s, int integralPart, int decimalPart) {
		 
		 int i = s.indexOf(".");
		 if ( i != -1 ){
			   if(s.substring(i+1) != null && s.substring(i+1).length() > 0){
		           if (!isNumeric(s.substring(i+1)) ||  s.substring(i+1).length() > decimalPart )
		        	   return false ; 
				   }
			   if(s.substring(0,i) != null && s.substring(0,i).length() > 0){
			   if (!isNumeric(s.substring(0,i)) || s.substring(0,i).length() > integralPart )
	        	   return false ; 
			   }
	           
	       }else{
	          if(!isNumeric(s) || s.length() > integralPart) return false;
	        }
		 
		 return true;
	 }*/

//	public static void main(String[] args) {
//		System.out.println(CommonValidations.isDateCorrect("25/01/2006    10:36:12"));
//
//	}

}
