
package com.xius.smf.job.service;

public interface ValidationsInterface {
    
    // Global
    public static final int VALIDRECORD = 0;
    public static final int INVALID_LENGTH_RECORD = 1;
    public static final int VALIDFIELD = 100;    
   
   
   // MIN and MAX lenghts of the fields 
    public static final int MSISDN_MIN_LENGTH = 9;
    public static final int MSISDN_MAX_LENGTH = 20;    
    public static final int IMSI_MIN_LENGTH = 15;
    public static final int IMSI_MAX_LENGTH = 20;
    public static final int IMSI_FIXED_LENGTH = 15;
    
    //FreeMSISDN length    
    public static final int FREEMSISDN_LENGTH = 10;
    
    // KI Min and Max length is 32
    public static final int KI_LENGTH = 32;
    
    // OPC Min and Max length is 32
    public static final int OPC_LENGTH = 32;
    
    // VLR Min and Max lenngth  (Considering only CCNDC)
    public static final int VLR_MIN_LENGTH = 4;
    public static final int VLR_MAX_LENGTH = 13;
       

    //IMEI Min and Max lengths 
    public static final int IMEI_MAX_LENGTH = 20;
    public static final int IMEI_MIN_LENGTH = 15;
    
    // SIM Min and Max lengths
    public static final int SIM_MAX_LENGTH = 20; 
    public static final int SIM_MIN_LENGTH = 15; 
    
    // Below error codes should be unique
    // IMSI error codes
    public static final int IMSI_EMPTY = 2;
    public static final int IMSI_NON_NUMERIC = 3;
    public static final int IMSI_INVALID_LENGTH = 4;
    public static final int IMSI_INVALID_SERIES = 5;
        
 
    // MSISDN error codes
    public static final int MSISDN_EMPTY = 6;  
    public static final int MSISDN_NON_NUMERIC = 7;
    public static final int MSISDN_INVALID_LENGTH = 8;
    public static final int MSISDN_INVALID_SERIES = 9;
    
    // KI error codes
    public static final int KI_EMPTY = 10;    
    public static final int KI_INVALID_LENGTH=11;
    public static final int KI_INVALID_VALUE = 12;
    
    //OPC error codes
    public static final int OPC_EMPTY = 13;
    public static final int OPC_INVALID_LENGTH = 14;
    public static final int OPC_INVALID_VALUE = 15;
    
    //VLR error codes
    public static final int VLR_EMPTY = 16;
    public static final int VLR_NON_NUMERIC  = 17;
    public static final int VLR_INVALID_LENGTH = 18;
    
    public static final int IMSI_MSISDN_ALREADYMAPED = 19;
    public static final int IMSI_MSISDN_DUPLICATED = 20;    
    public static final int IMSI_DUPLICATED = 21;
    
    public static final int IP_EMPTY = 22;
    public static final int IP_INVALID = 23;
    public static final int IP_INVALID_LENGTH = 24;
    
    public static final int AUTHALG_EMPTY = 25;
    public static final int AUTHALG_INVALID=26;
    
    //Variable lengths
    public static final int NETWORKID_MIN_LENGTH=1;
    public static final int NETWORKID_MAX_LENGTH=6;
    public static final int SID_LENGTH=5;

    //NetworkId errorcodes
    public static final int NETWORKID_EMPTY=34;
    public static final int NETWORKID_NON_NUMERIC=35;
    public static final int NETWORKID_INVALID_LENGTH =36;
    public static final int NETWORKID_INVALID_SERIES =37;

    //SID errorcodes 
    public static final int SID_EMPTY=38;
    public static final int SID_NON_NUMERIC=39;
    public static final int SID_INVALID_LENGTH =40;
    public static final int SID_DUPLICATED = 41;
    
    // IMEI error codes
    public static final int IMEI_EMPTY = 42;                         
    public static final int IMEI_NON_NUMERIC =43 ;
    public static final int IMEI_INVALID_LENGTH =44 ;                
  
   // IMEI error codes
    public static final int SIM_EMPTY =45 ;                         
    public static final int SIM_NON_NUMERIC =46 ;
    public static final int SIM_INVALID_LENGTH =47 ;

    
//  OCSI Number List Min and Max Length and Max Number allowed
    public static final int MAX_NO_NUMLIST = 10;
    public static final int MIN_NUMLIST_LENGTH = 1;
    public static final int MAX_NUMLIST_LENGTH = 20;
    
//  OCSI Number Length List Min and Max Length and Max Number allowed
    public static final int MAX_NO_NUMLISTLENGTH = 3;
    public static final int MIN_NUMLENGTHLIST_LENGTH = 1;
    public static final int MAX_NUMLENGTHLIST_LENGTH = 2;
    
    
//  Error Codes for OCSI Number Criteria  
    public static final int INVALID_NUMLIST = 48;
    public static final int INVALID_NUMLIST_LENGTH = 49;
    public static final int INVALID_NUMLENGTHLIST=50;
    public static final int INVALID_NUMLENGTHLIST_LENGTH=51;    
    public static final int MATCHTYPE_EMPTY = 52;
    public static final int MATCHTYPE_INVALID = 53;
    
    public static final int ATLEAST_NUM_OR_NUMLENGTH_PRESENT = 54;
    public static final int NUM_INVALID_SERIES = 55;

    public static final int IMEI_DUPLICATED=56;
    public static final int SIM_DUPLICATED=57;
    
//  Upload TADIG Codes
    public static final int TADIG_EMPTY=58;
    public static final int TADIG_NON_ALPHA_NUMERIC=59;
    public static final int TADIG_INVALID_LENGTH =60;
    public static final int TADIG_DUPLICATED = 61;
    public static final int NETWORK_DUPLICATED = 62;
    public static final int TADIG_LENGTH=5;
    
//  Upload Matched Retail - Wholesale CDR Ids
    
    public static final int MATCHED_WHOLESALE_DUPLICATED=63;
    public static final int MATCHED_RETAIL_DUPLICATED=64;
    public static final int MATCHED_WHOLESALE_EMPTY=65;
    public static final int MATCHED_WHOLESALE_NON_NUMERIC=66;
    public static final int MATCHED_WHOLESALE_INVALID_LENGTH=67;
    public static final int MATCHED_MIN_LENGTH=1;
    public static final int MATCHED_MAX_LENGTH=10;
    public static final int MATCHED_RETAIL_EMPTY=68;
    public static final int MATCHED_RETAIL_NON_NUMERIC=69;
    public static final int MATCHED_RETAIL_INVALID_LENGTH=70; 

// Cahnge IMSI or MSISDN upload
    public static final int FROM_IMSI_EMPTY = 71;
    public static final int FROM_IMSI_NON_NUMERIC = 72;
    public static final int FROM_IMSI_INVALID_LENGTH = 73;
    public static final int FROM_IMSI_INVALID_SERIES = 74;
    
    public static final int FROM_MSISDN_EMPTY = 75;  
    public static final int FROM_MSISDN_NON_NUMERIC = 76;
    public static final int FROM_MSISDN_INVALID_LENGTH = 77;
   
    public static final int FROM_IMSI_DUPLICATED = 78;  
    public static final int TO_IMSI_DUPLICATED = 79;
    
    public static final int FROM_MSISDN_DUPLICATED = 80;
    public static final int TO_MSISDN_DUPLICATED = 81;    
    public static final int FROM_MSISDN_INVALID_SERIES=82;
    
    
    
    /*
     * Upload  Address Field Sizes Fixed for CMS Module
     * 
     * @Author Pavan Singaraju
     * 
     * @Date 18/SEPT/2008
     */
     public static final int MAX_UPLOAD_ADDRESSES_TOKENS = 21;//Max tokens allowed in upload addresses file
     public static final int MIN_UPLOAD_ADDRESSES_TOKENS = 8; //Min tokens allowed in upload addresses file
     public static final int MAX_UP_ADDR_USER_NAME_LEN = 30; //Max User name length
     public static final int MAX_UP_ADDR_ACC_NAME_LEN = 30; //Max Account name length
     public static final int MAX_UP_ADDR_ADDRESS_LEN = 100;// Maximum Address length
  	  public static final int MIN_UP_ADDR_USER_NAME_LEN = 4; //Minimum Address length
  	  public static final int MAX_CITY_NAME_LEN = 50; //Max length of city name
  	  public static final int MAX_STATE_COUNTRY_CODE_LEN = 2; //Max length of the State/Country Code
  	  public static final int MAX_PHONE_NUM_LEN = 30; //Max phone number length
     public static final int MIN_PHONE_NUM_LEN = 6; //Min Phone number length
  	  public static final int MAX_POSTAL_CODE_LEN = 8; //Max Postal code length
  	  public static final int MIN_POSTAL_CODE_LEN = 6; //Min Postal code length
  	  public static final int MAX_DOB_LEN = 10; // Maximum length of the date of birth
     public static final int MAX_EMAIL_LEN = 60;//Max Email length
     //added by pavan for promo tickets
     public static final int MAX_TICK_LEN = 16;
     public static final int TICKEMPTY = 1;
     public static final int TICKNONALPHA = 2;
     public static final int TICKINVLEN = 3;
   
     //added for CR 697
     public static final int ID_MIN_LEN = 1;
     public static final int ID_MAX_LEN = 1;
     public static final int ID_EMPTY = 83;
     public static final int ID_INVALID = 84;
     public static final int ID_NON_NUMERIC = 85;
 
     
     public static final int ID_VALUE_MIN_LEN = 1;
     public static final int ID_VALUE_MAX_LEN = 20;
     public static final int ID_VALUE_EMPTY = 86;
     public static final int ID_VALUE_INVALID_LENGTH = 87;
     public static final int ID_VALUE_NON_ALPHA_NUMERIC = 88;
     public static final int ID_VALUE_INVALID = 89;
     
     public static final int DUMMY_ID_VALUE_MIN_LEN = 1;
     public static final int DUMMY_ID_VALUE_MAX_LEN = 20;
     public static final int DUMMY_ID_VALUE_EMPTY = 90;
     public static final int DUMMY_ID_VALUE_INVALID_LENGTH = 91;
     public static final int DUMMY_ID_VALUE_NON_ALPHA_NUMERIC = 92;
     public static final int DUMMY_ID_VALUE_INVALID = 93;
     
     public static final int DUMMY_ID_TYPE_EMPTY = 94;
     public static final int DUMMY_ID_TYPE_INVALID = 95;
     
     public static final int STATE_EMPTY = 96;
     public static final int STATE_NON_APLHA = 97;
     public static final int STATE_INVALID_LENGTH = 98;
     public static final int STATE_MAX_LENGTH = 50;
     
     public static final int CITY_EMPTY = 99;
     public static final int CITY_NON_APLHA = 101;
     public static final int CITY_INVALID_LENGTH = 102;
     public static final int CITY_MAX_LENGTH = 60;
     
     public static final int ZIPCODE_EMPTY = 103;
     public static final int ZIPCODE_NON_NUMERIC = 104;
     public static final int ZIPCODE_INVALID_LENGTH = 105;
     public static final int ZIPCODE_MAX_LENGTH = 5;
     public static final int ZIPCODE_MIN_LENGTH = 4;
     public static final int ZIPCODE_DUPLICATED = 106;
     
     public static final int MSISDN_DUPLICATED = 107;
     public static final int AMOUNT_EMPTY = 108;
     public static final int AMOUNT_INVALID = 109;
     public static final int AMOUNT_INVALID_LENGTH = 110;
     public static final int AMOUNT_MAX_LENGTH = 8;
     public static final int AMOUNT_MIN_LENGTH = 1;
     public static final int REMARKS_EMPTY = 111;
     public static final int REMARKS_INVALID = 112;
     public static final int REMARKS_INVALID_LENGTH = 113;
     public static final int REMARKS_MAX_LENGTH = 500;
     
     
     public static final int COUNTRY_EMPTY = 114;
     public static final int COUNTRY_NON_APLHA = 115;
     public static final int COUNTRY_INVALID_LENGTH = 116;
     public static final int COUNTRY_MAX_LENGTH = 60;
     
     public static final int POSTCODE_EMPTY = 117;
     public static final int POSTCODE_NON_NUMERIC = 118;
     public static final int POSTCODE_INVALID_LENGTH = 119;
     
     public static final int FIRSTNAME_EMPTY = 120;
     public static final int FIRSTNAME_INVALID = 121;
     public static final int FIRSTNAME_INVALID_LENGTH = 122;
     
     public static final int LASTNAME_EMPTY = 123;
     public static final int LASTNAME_INVALID = 124;
     public static final int LASTNAME_INVALID_LENGTH = 125;
     
     public static final int FIRST_ADDRESS_EMPTY = 126;
     public static final int FIRST_ADDRESS_INVALID_LENGTH = 127;
     public static final int SECOND_ADDRESS_INVALID_LENGTH = 128;
     
     public static final int INVALID_GENDER = 129;
     public static final int INVALID_DOB= 130;
     //public static final int REC_EMPTY = 90;
}
