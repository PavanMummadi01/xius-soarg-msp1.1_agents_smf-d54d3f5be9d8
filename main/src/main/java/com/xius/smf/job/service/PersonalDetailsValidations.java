 
package com.xius.smf.job.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class PersonalDetailsValidations implements ValidationsInterface{

	private Set dupSIMSet = null;
	private String SIM = null, 
						//DUMMY_ID_TYPE = null,
						//DUMMY_ID_VALUE = null,
						ID_TYPE = null, 
						ID_VALUE = null,
						FIRSTNAME = null,
						LASTNAME = null,
						FIRSTADDRESS = null,
						SECONDADDRESS = null,
						POSTCODE = null,
						CITY = null,
						STATE = null,
						COUNTRY = null,
						GENDER = null,
						DOB = null;
	
	/**
	 * @author
	 * @param networkID
	 */
	public PersonalDetailsValidations() {
		dupSIMSet = new HashSet();
	}
	
	
	
	
	
	/*
	 * 
	SIM validations
	ID_TYPE	(MYKAD or OTHER)		
	ID_NO	(alpha-numeric-20)		
	FIRST_NAME(30-alpha,spaces)		
	LAST_NAME()(30-alpha,spaces)		
	ADDRESS1(30-no comma)			
	ADDRESS2(30-no comma)			
	POSTAL_CODE(4-6 -numeric)		
	CITY(Alpha,numeric,Space)		
	STATE(60-state creation validation)	
	COUNTRY	(60-alpha,space,check num)	
	
	firstname,lastname
	abcdefghijklmnopqrstuvwxyz.-_ @/,\\'\"
	 */
	/**
	 * 
	 * This method  
	 * 
	 * @param str
	 * @return
	 * Surendra
	 * Mar 7, 2011
	 */
	public int validateReplaceRecord(String str) {
		
		int i;
		String[] lineContents = CommonValidations.splitString(str, ",");
		
		SIM = lineContents[0];
		//DUMMY_ID_TYPE = lineContents[1];
		//DUMMY_ID_VALUE = lineContents[2];
		ID_TYPE = lineContents[1];
		ID_VALUE = lineContents[2];
		FIRSTNAME = lineContents[3];
		LASTNAME = lineContents[4];
		FIRSTADDRESS = lineContents[5];
		SECONDADDRESS = lineContents[6];
		POSTCODE = lineContents[7];
		CITY = lineContents[8];
		STATE = lineContents[9];
		COUNTRY = lineContents[10];
		GENDER = lineContents[11];
		DOB = lineContents[12];
		
		if (!validateDup(dupSIMSet, SIM.trim())) {
			return SIM_DUPLICATED;
		}
		if (VALIDFIELD != (i = validateSIM(SIM.trim()))) {
			return i;
		}
		
		/*if (VALIDFIELD != (i = validateDIDType(DUMMY_ID_TYPE))) {
			return i;
		}
		
		if (VALIDFIELD != (i = validateDIDValue(DUMMY_ID_VALUE))) {
			return i;
		}*/
		
		if (VALIDFIELD != (i = validateIDType(ID_TYPE))) {
			return i;
		}
		if (VALIDFIELD != (i = validateIDValue(ID_VALUE))) {
			return i;
		}
		
		//FIRSTNAME
		if (VALIDFIELD != (i = validateFirstName(FIRSTNAME.trim()))) {
			return i;
		}

		//LASTNAME
		if (VALIDFIELD != (i = validateLastName(LASTNAME.trim()))) {
			return i;
		}
		
		//FIRSTADDRESS -no validations for content
		if (CommonValidations.isEmpty(FIRSTADDRESS)) {
			return FIRST_ADDRESS_EMPTY;
		}
		if (!CommonValidations.isLengthValid(FIRSTADDRESS,0,30)) {
			return FIRST_ADDRESS_INVALID_LENGTH;
		}
		//SECONDADDRESS  -optional -no validations for content
		//if (CommonValidations.isEmpty(FIRSTADDRESS)) {
			//return 1;
		//}
		if(SECONDADDRESS.trim().length()>0){
			if (!CommonValidations.isLengthValid(SECONDADDRESS,0,30)) {
				return SECOND_ADDRESS_INVALID_LENGTH;
			}
		}
		
		//POSTCODE
		if (VALIDFIELD != (i = validatePostcode(POSTCODE.trim()))) {
			return i;
		}
		//CITY validateCity
		if (VALIDFIELD != (i = validateCity(CITY.trim()))) {
			return i;
		}
		//STATE
		if (VALIDFIELD != (i = validateState(STATE.trim()))) {
			return i;
		}
		//COUNTRY
		if (VALIDFIELD != (i = validateCountry(COUNTRY.trim()))) {
			return i;
		}
		
		if(GENDER.trim().length()>0){
			if(!("M".equalsIgnoreCase(GENDER.trim()) || "F".equalsIgnoreCase(GENDER.trim()))) {
				return INVALID_GENDER;
			}
		}
		
		if(DOB.trim().length()>0){
			if (VALIDFIELD != (i = isValidDateFormat(DOB.trim()))) {
				return i;
			}
		}
		
		return VALIDFIELD;
	}
	
	
	private boolean validateDup(Set dupSet, String s) {
		if(!dupSet.add(s)){
			return false;
		}
		return true;
	}	
	
	protected int validateSIM(String str) {

		if (CommonValidations.isEmpty(str)) {
			return SIM_EMPTY;
		}
		if (!CommonValidations.isNumeric(str) ) {
			return SIM_NON_NUMERIC;
		}
		if (!CommonValidations.isLengthValid(str, SIM_MIN_LENGTH, SIM_MAX_LENGTH)) {
			return SIM_INVALID_LENGTH;
		}
		return VALIDFIELD;
	}
	
	protected int validateIDType(String str) {

		if (CommonValidations.isEmpty(str)) {
			return ID_EMPTY;
		}
		if(!(str.equalsIgnoreCase("1") || str.equalsIgnoreCase("2"))){
			return  ID_INVALID;
		}
		return VALIDFIELD;
	}
	
	protected int validateIDValue(String str) {

		if (CommonValidations.isEmpty(str)) {
			return ID_VALUE_EMPTY;
		}
		if(str.length() == 1 & str.equalsIgnoreCase("0")){
			return ID_VALUE_INVALID;
		}
		if (!CommonValidations.isAlphaNumeric(str)) {
			return ID_VALUE_NON_ALPHA_NUMERIC;
		}
		if (!CommonValidations.isLengthValid(str, ID_VALUE_MIN_LEN, ID_VALUE_MAX_LEN)) {
			return ID_VALUE_INVALID_LENGTH;
		}
		return VALIDFIELD;
	}
	
	protected int validateCity(String str) {

		if (CommonValidations.isEmpty(str)) {
			return CITY_EMPTY;
		}
		if (!CommonValidations.isAlphaNumericWithSpace(str) ) {
			return CITY_NON_APLHA;
		}
		if (!CommonValidations.isLengthValid(str, 0, CITY_MAX_LENGTH)) {
			return CITY_INVALID_LENGTH;
		}
		return VALIDFIELD;
	}
	
	
	protected int validateState(String str) {

		if (CommonValidations.isEmpty(str)) {
			return STATE_EMPTY;
		}
		if (!CommonValidations.isAlphabetWithSpace(str) ) {
			return STATE_NON_APLHA;
		}
		if (!CommonValidations.isLengthValid(str, 0, 60)) {
			return STATE_INVALID_LENGTH;
		}
		return VALIDFIELD;
	}
	
	protected int validateCountry(String str) {
		if (CommonValidations.isEmpty(str)) {
			return COUNTRY_EMPTY;
		}
		if (!CommonValidations.isAlphabetWithSpace(str) ) {
			return COUNTRY_NON_APLHA;
		}
		if (!CommonValidations.isLengthValid(str, 0, COUNTRY_MAX_LENGTH)) {
			return COUNTRY_INVALID_LENGTH;
		}
		return VALIDFIELD;
	}
	
	protected int validatePostcode(String str) {
		if (CommonValidations.isEmpty(str)) {
			return POSTCODE_EMPTY;
		}
		if (!CommonValidations.isNumeric(str) ) {
			return POSTCODE_NON_NUMERIC;
		}
		if (!CommonValidations.isLengthValid(str,4,6)) {
			return POSTCODE_INVALID_LENGTH;
		}
		return VALIDFIELD;
	}
	
	
	protected int validateFirstName(String str) {
		if (CommonValidations.isEmpty(FIRSTNAME)) {
			return FIRSTNAME_EMPTY;
		}
		if (!isnamewithspaces(FIRSTNAME)) {  //check -abcdefghijklmnopqrstuvwxyz.-_ @/,\\'\"
			return FIRSTNAME_INVALID;
		}
		if (!CommonValidations.isLengthValid(FIRSTNAME,0,30)) {
			return FIRSTNAME_INVALID_LENGTH;
		}
		return VALIDFIELD;
	}
	
	
	protected int validateLastName(String str) {
		if (CommonValidations.isEmpty(LASTNAME)) {
			return LASTNAME_EMPTY;
		}
		if (!isnamewithspaces(LASTNAME)) {  //check -abcdefghijklmnopqrstuvwxyz.-_ @/,\\'\"
			return LASTNAME_INVALID;
		}
		if (!CommonValidations.isLengthValid(LASTNAME,0,30)) {
			return LASTNAME_INVALID_LENGTH;
		}
		return VALIDFIELD;
	}
	
	
	public static boolean isnamewithspaces(String name) {
		char[] str = new char[name.length()];
		String temp = "abcdefghijklmnopqrstuvwxyz.-_ @/\\'\"";
		for (int i = 0; i < name.length(); i++) {
			if (temp.contains((name.charAt(i) + "").toLowerCase())) {
			} else {
				return false;
			}
		}
		return true;
	}
	
	/*
	protected int validateDIDType(String str) {

		if (CommonValidations.isEmpty(str)) {
			return DUMMY_ID_TYPE_EMPTY;
		}
		if(!(str.equalsIgnoreCase("1") || str.equalsIgnoreCase("2"))){
			return  DUMMY_ID_TYPE_INVALID;
		}
		return VALIDFIELD;
	}
	
	protected int validateDIDValue(String str) {

		if (CommonValidations.isEmpty(str)) {
			return DUMMY_ID_VALUE_EMPTY;
		}
		if(str.length() == 1 && str.equalsIgnoreCase("0")){
			return DUMMY_ID_VALUE_INVALID;
		}
		if (!CommonValidations.isAlphaNumeric(str)) {
			return DUMMY_ID_VALUE_NON_ALPHA_NUMERIC;
		}
		if (!CommonValidations.isLengthValid(str, DUMMY_ID_VALUE_MIN_LEN, DUMMY_ID_VALUE_MAX_LEN)) {
			return DUMMY_ID_VALUE_INVALID_LENGTH;
		}
		return VALIDFIELD;
	}*/
	
	
	public int isValidDateFormat(String date1){
 	   SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
 	   Date testDate = null;
 	   try{
 	     testDate = sdf.parse(date1);
 	     if (!sdf.format(testDate).equals(date1)){
	  	   	InfinetUtility.log("PersonalDetailsValidations.isValidDateFormat: The date that you provided is invalid.");
	  	   	return INVALID_DOB;
	  	  }
 	     if ((getDateDiffMM(sdf.format(Calendar.getInstance().getTime()),date1,sdf) > 0)) {
 	   	 InfinetUtility.log("PersonalDetailsValidations.isValidDateFormat: dob greater than System date.");
	  	    return INVALID_DOB;
 	     }
 	   }catch (Exception e){
 	   	InfinetUtility.log("PersonalDetailsValidations.isValidDateFormat: The date you provided is in an invalid dateformat.");
 	     return INVALID_DOB;
 	   }
 	  return  VALIDFIELD;
 	}
	
	
	public long getDateDiffMM(String fromDate,String toDate,SimpleDateFormat simpat){
		long milliseconds = 0;			
	    try{
	    if(fromDate!=null && fromDate.trim().length()>0 && toDate!=null && toDate.trim().length()>0){
	        Date from = stringToDateMM(fromDate,simpat);			        
	        Date to   = stringToDateMM(toDate,simpat);	
	        milliseconds = to.getTime() - from.getTime();			     
	      }
	    }catch (Exception e) {
	        return 1;
        }
		return milliseconds;
	}
	
	public Date stringToDateMM(Object src,SimpleDateFormat simpat)throws ParseException {
	  if(src == null || ((String)src).trim().length()==0)
		  return null;
     String strdate = (String)src;
     return  simpat.parse(strdate);
   }
	
	
}
