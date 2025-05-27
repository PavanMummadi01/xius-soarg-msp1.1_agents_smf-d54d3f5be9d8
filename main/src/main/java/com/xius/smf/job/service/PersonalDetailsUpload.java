
package com.xius.smf.job.service;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.xml.rpc.ServiceException;

import net.bcgi.si.messages.mvnoapi.common.ErrorData;
import net.bcgi.si.messages.mvnoapi.common.SecurityId;
import net.bcgi.si.messages.mvnoapi.common.ServiceContext;
import net.bcgi.si.messages.mvnoapi.common.UploadType;
import net.bcgi.si.messages.mvnoapi.common.UserType;
import net.bcgi.si.messages.mvnoapi.provisioning.UploadSIMsRequest;
import net.bcgi.si.messages.mvnoapi.provisioning.UploadSIMsResponse;
import net.bcgi.util.db.SPFactory;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import soap_binding.servicemix.IProvisioningAppLocator;
import soap_binding.servicemix.IProvisioningAppPortType;

import com.xius.smf.domaindata.UploadSubTransDetailsData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.ftp.FTPProxy;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class PersonalDetailsUpload implements ValidationsInterface{

	 static final Logger logger = LogManager.getLogger("PersonalDetailsUpload");

	private long transformTime;
	private long validationTime;
	private long invokeXbusTime;

	private boolean fileEmpty = false, maxRec = false,ValRec = true;
	private List<String> validrecords = null,   inValidrecords= null;
	private Long networkID = null;
	private int errorCode = -1;
	private int recLen = 13;
	//private int maxLinesPerFile = 3000;
	private String version = "1.0";	

	private IProvisioningAppLocator locator = null;
	private IProvisioningAppPortType porttype = null;
	//private int MAX_RECD = 0;
	/*private SubTransInfoType[] actualIdDtls = null;
	private SyncUploadError[] syncUploadError = null;
	private CreditDetailsType[] creditDetailsType = null;*/

	private String badFileName = null;
	private String successFileName = null;
	private String userIdSepChar = null;
	private String userId = null;

	private String networkName = null;
	private String xBusURL = null;

	public String getBadFileName() {
		return badFileName;
	}
	public void setBadFileName(String badFileName) {
		this.badFileName = badFileName;
	}
	public String getSuccessFileName() {
		return successFileName;
	}
	public void setSuccessFileName(String successFileName) {
		this.successFileName = successFileName;
	}
	public String getUserIdSepChar() {
		return userIdSepChar;
	}
	public void setUserIdSepChar(String userIdSepChar) {
		this.userIdSepChar = userIdSepChar;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Long getNetworkID() {
		return networkID;
	}
	public void setNetworkID(Long networkID) {
		this.networkID = networkID;
	}
	public String getNetworkName() {
		return networkName;
	}
	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}
	public String getxBusURL() {
		return xBusURL;
	}
	public void setxBusURL(String xBusURL) {
		this.xBusURL = xBusURL;
	}
	/**
	 * 
	 * @throws Exception
	 */
	public PersonalDetailsUpload(String userId) throws Exception {

		/*XBUS_URL = InfinetUtility.getProperty("DSNCONURL1");
		if(XBUS_URL == null){
			throw new Exception(90113,"");
		}
		AGENT_URL = InfinetUtility.getProperty("DSNCONURL3");
		if(AGENT_URL == null){
			throw new Exception(90113,"");
		}*/
		logger.debug("PersonalDetailsUpload(String userId): " + userId);
		userIdSepChar = InitiateAll.getSMFProps().getProperty( "userid.seperation.char");
		String strNetworkId=InitiateAll.getSMFProps().getProperty( "NetworkId");
		if(Utilities.isNotEmpty(strNetworkId)) {
			networkID = Long.parseLong(strNetworkId);
		}
		networkName=InitiateAll.getSMFProps().getProperty( "NetworkName");
		xBusURL=InitiateAll.getSMFProps().getProperty( "ftp.xbus.url");
		this.userId = userId;
	}


	/**
	 * 
	 * This method  
	 * 
	 * @throws Exception
	 * ramsundar.balagoni
	 * Mar 7, 2011
	 *//*
	public void setValidateRecd() throws Exception {		
		if ( "10000#1000#500"!= null) { //InfinetUtility.getProperty("MAXRECRDISP")
			maxLinesPerFile = Integer.parseInt("10000#1000#500".split("#")[1]);//InfinetUtility.getProperty("MAXRECRDISP")
			ValRec = true;			
		}else {
			ValRec = false;
			throw new Exception("90113");
		}	

		if(maxLinesPerFile > MAX_RECD ){
			ValRec = false;
			throw new Exception("90114");
		}	
	}*/

	/**
	 * 
	 * This method  
	 * 
	 * @return
	 * ramsundar.balagoni
	 * Mar 7, 2011
	 */
	public boolean checkValidate(){
		return ValRec;
	}

	@SuppressWarnings({ "deprecation", "static-access" })
	public List<String> transform(String ftpFilesName, FTPProxy ftpProxy){

		long startTime = System.currentTimeMillis();

		if( logger.isDebugEnabled() ) {

			logger.debug("transforming file content as list of lines");
		}
		List<String> lines = null;
		try {

			lines = FileUtils.readLines(new File(ftpProxy.getLocalDirPath()+"/"+ftpFilesName));

		} catch (IOException e) {
			logger.error( ""+Utilities.getStackTrace(e));
		} catch (Exception e) {
			logger.error( ""+Utilities.getStackTrace(e));
		}

		this.transformTime = System.currentTimeMillis() - startTime;
		if( logger.isDebugEnabled() ) {

			logger.debug("#### Time taken to transform files to data structure(list fo strings) (milli secons) : "+ this.transformTime);
		}
		return lines;
	}
	/**
	 * 
	 * This method  
	 * 
	 * @param fileContents
	 * @throws Exception
	 * ramsundar.balagoni
	 * Mar 7, 2011
	 */
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public List<String> doValidations(List<String> fileContents , String fileName, FTPProxy ftpProxy ) throws Exception {

		long startTime = System.currentTimeMillis();

		if( logger.isDebugEnabled() ) {

			logger.debug("Processing(validating) file from local(copy of FTP)");
		}

		StringBuffer strb = null; 
		//simInfo = null;		
		//setValidateRecd();	
		try {
			strb = new StringBuffer("");

			for(int i=0; i<fileContents.size(); i++) {

				strb.append(fileContents.get(i));
			}
			if (strb.toString().trim().length() <= 0) {

				fileEmpty = true;
				logger.debug( "File Content is Empty");
			}  else {
				
				validrecords = new ArrayList();
				inValidrecords = new ArrayList();

				PersonalDetailsValidations validations = new PersonalDetailsValidations();
				int errCode = 0;

				String fileContent = null;

				for (int i = 0, j = 0; i < fileContents.size(); i++) {
					j = i + 1;

					fileContent = fileContents.get( i );
					if (Utilities.isNotEmpty(fileContent)) {

						//fileRecords.add( fileContent.toString() );
						if (CommonValidations.isNOofFieldsValid((String) fileContent, ",",recLen)){

							errCode = validations.validateReplaceRecord((String) fileContent);
							logger.trace( "Validation Error Code: " + errCode);

							switch (errCode) {

							case VALIDFIELD: {
								validrecords.add(fileContent);

								/**
								 * even though it is valid, 
								 * we are logging same to inValidrecords(which will be stored in physical file)
								 *//*
										inValidrecords.add(fileContent+"--VALID");*/
								//As per VB above statement is not required.
								break;
							}
							case SIM_EMPTY: {
								inValidrecords.add(fileContent+"--SIM_EMPTY");
								break;
							}
							case SIM_NON_NUMERIC: {
								inValidrecords.add(fileContent+"--SIM_NON_NUMERIC");
								break;
							}
							case SIM_INVALID_LENGTH: {
								inValidrecords.add(fileContent+"--SIM_INVALID_LENGTH");
								break;
							}
							case SIM_DUPLICATED: {
								inValidrecords.add(fileContent+"--SIM_DUPLICATED");
								break;
							}
							case ID_EMPTY: {
								inValidrecords.add(fileContent+"--ID_EMPTY_LIST");
								break;
							}
							case ID_INVALID: {
								inValidrecords.add(fileContent+ fileContent+"--ID_INVALID");
								break;
							}

							case ID_VALUE_EMPTY: {
								inValidrecords.add(fileContent+"--ID_VALUE_EMPTY");
								break;
							}
							case ID_VALUE_NON_ALPHA_NUMERIC: {
								inValidrecords.add(fileContent+"--ID_VALUE_NON_ALPHA_NUMERIC");
								break;
							}
							case ID_VALUE_INVALID_LENGTH: {
								inValidrecords.add(fileContent+"--ID_VALUE_INVALID_LENGTH");
								break;
							}
							case ID_VALUE_INVALID: {
								inValidrecords.add(fileContent+"--ID_VALUE_INVALID");
								break;
							}

							case FIRSTNAME_EMPTY: {
								inValidrecords.add(fileContent+"--FIRSTNAME_EMPTY");
								break;
							}
							case FIRSTNAME_INVALID: {
								inValidrecords.add(fileContent+"--FIRSTNAME_INVALID");
								break;
							}
							case FIRSTNAME_INVALID_LENGTH: {
								inValidrecords.add(fileContent+"--FIRSTNAME_INVALID_LENGTH");
								break;
							}

							case LASTNAME_EMPTY: {
								inValidrecords.add(fileContent+"--LASTNAME_EMPTY");
								break;
							}
							case LASTNAME_INVALID: {
								inValidrecords.add(fileContent+"--LASTNAME_INVALID");
								break;
							}
							case LASTNAME_INVALID_LENGTH: {
								inValidrecords.add(fileContent+"--LASTNAME_INVALID_LENGTH");
								break;
							}


							case FIRST_ADDRESS_EMPTY: {
								inValidrecords.add(fileContent+"--FIRST_ADDRESS_EMPTY");
								break;
							}
							case FIRST_ADDRESS_INVALID_LENGTH: {
								inValidrecords.add(fileContent+"--FIRST_ADDRESS_INVALID_LENGTH");
								break;
							}
							case SECOND_ADDRESS_INVALID_LENGTH: {
								inValidrecords.add(fileContent+"--SECOND_ADDRESS_INVALID_LENGTH");
								break;
							}

							case POSTCODE_EMPTY: {
								inValidrecords.add(fileContent+"--POSTCODE_EMPTY");
								break;
							}
							case POSTCODE_NON_NUMERIC: {
								inValidrecords.add(fileContent+"--POSTCODE_NON_NUMERIC");
								break;
							}
							case POSTCODE_INVALID_LENGTH: {
								inValidrecords.add(fileContent+"--POSTCODE_INVALID_LENGTH");
								break;
							}

							case CITY_EMPTY: {
								inValidrecords.add(fileContent+"--CITY_EMPTY");
								break;
							}
							case CITY_NON_APLHA: {
								inValidrecords.add(fileContent+"--CITY_NON_APLHA");
								break;
							}
							case CITY_INVALID_LENGTH: {
								inValidrecords.add(fileContent+"--CITY_INVALID_LENGTH");
								break;
							}

							case STATE_EMPTY: {
								inValidrecords.add(fileContent+"--STATE_EMPTY");
								break;
							}
							case STATE_NON_APLHA: {
								inValidrecords.add(fileContent+"--STATE_NON_APLHA");
								break;
							}
							case STATE_INVALID_LENGTH: {
								inValidrecords.add(fileContent+"--STATE_INVALID_LENGTH");
								break;
							}

							case COUNTRY_EMPTY: {
								inValidrecords.add(fileContent+"--COUNTRY_EMPTY");
								break;
							}
							case COUNTRY_NON_APLHA: {
								inValidrecords.add(fileContent+"--COUNTRY_NON_APLHA");
								break;
							}
							case COUNTRY_INVALID_LENGTH: {
								inValidrecords.add(fileContent+"--COUNTRY_INVALID_LENGTH");
								break;
							}
							case INVALID_GENDER: {
								inValidrecords.add(fileContent+"--INVALID_GENDER");
								break;
							}
							case INVALID_DOB: {
								inValidrecords.add(fileContent+"--INVALID_DOB");
								break;
							}
							default: {
								break;
							}
							}

						} else {
							inValidrecords.add(fileContent+"--INVALID_NO_FIELDS");
						}
					}
				}
				//String[] simArr = (String[])fileRecords.toArray(new String[fileRecords.size()]);


			} 

			/*logger.log(BCGLevel.DEBUG, "File Name: " + fileName);
			String filePrefix = null;
			String filePostfix = null;

			if(fileName.lastIndexOf(".") > 0) {
				filePrefix = fileName.substring(0, fileName.lastIndexOf("."));
				filePostfix = fileName.substring(fileName.lastIndexOf("."), fileName.length());
			} else {
				filePrefix = fileName;
				filePostfix = "";
			}*/

			/*if( null != inValidrecords && inValidrecords.size() > 0 &&
					( validrecords == null || (null != validrecords &&
							inValidrecords.size() > validrecords.size())) ) {*/

			if( null != inValidrecords && inValidrecords.size() > 0 ) {
				logger.trace( "Invalid Lines: "+inValidrecords);
				//String badFileName = filePrefix + "_" + System.currentTimeMillis() + filePostfix;
				if(!ftpProxy.upload(com.xius.smf.ftp.FTPProxy.UploadType.BAD_FILES, fileName, inValidrecords)) {
					logger.debug("FTP Upload falied for InvalidRecords to BadFiles folder for a file:" + fileName);
				}
				
				this.setBadFileName(fileName);

				// make validrecords null. becoz to stop invoking xBus call
				//validrecords = null;
				//As per VB above statement is not required. We need to process all valid records, even if invalid records are there in a file.

			}
			if(null != validrecords && validrecords.size() > 0) {	
				if( inValidrecords != null && inValidrecords.size() > 0) {
					logger.debug(  ".... Some lines are in the file is valid");
				} else {
					logger.debug( "Hureey.... All content in the file is valid");
					logger.debug( "Size of inValidrecords list is empty or null");
				}
				logger.trace( "Valid Lines: "+ validrecords);
				
				
				this.setSuccessFileName(fileName);
			}
		} catch (Exception e) {

			logger.error( "PersonalDetailsUpload.insert Exception" + Utilities.getStackTrace(e));
			throw new Exception("61001");
		} finally {

			strb = null;
			fileContents = null;
		}

		this.validationTime = System.currentTimeMillis() - startTime;
		if( logger.isDebugEnabled() ) {

			logger.debug("#### Time taken to validate lines (milli secons) : "+ this.validationTime );
		}
		return validrecords;
	}



	/**
	 * 
	 * This method  
	 * 
	 * @param simArr
	 * @throws Exception
	 * ramsundar.balagoni
	 * Mar 02, 2012
	 */
	public String invokeXBus(List<String> simArr) {

		long startTime = System.currentTimeMillis();

		if( logger.isDebugEnabled() ) {

			logger.debug("Sending valid lines to XBUS ");
		}

		String transactionId = null;
		UploadSIMsRequest uploadSIMsRequest = null;
		UploadSIMsResponse uploadSIMsResponse = null;
		SecurityId securityId = null;
		ServiceContext serviceContext = null;
		StringBuffer sbufx = null;

		try {

			sbufx = new StringBuffer("PersonalDetailsUpload.insert Request URL:" + xBusURL +"\n");
			locator = new IProvisioningAppLocator();
			porttype = locator.getProvisioningApp(new URL(xBusURL.trim()));
			uploadSIMsRequest = new UploadSIMsRequest();
			uploadSIMsResponse = new UploadSIMsResponse();
			securityId = new SecurityId();
			serviceContext = new ServiceContext();
			//System.out.println("LoginId:"+ getLoginId());
			sbufx.append("PersonalDetailsUpload.insert Request userID:"+ userId +"\n");
			securityId.setUserAccountName(userId);//InfinetUtility.getProperty("DSNAPPNME")
			securityId.setUserAccountPassword(userId);

			sbufx.append("PersonalDetailsUpload.insert Request userID:"+ networkID +"\n");
			serviceContext.setCarrierId(networkID.toString());

			sbufx.append("PersonalDetailsUpload.insert Request NetworkName:"+ networkName +"\n"); //InfinetUtility.getProperty("NetworkName").toString()
			uploadSIMsRequest.setNetworkName(networkName);//InfinetUtility.getProperty("NetworkName").toString()
			uploadSIMsRequest.setUserType(UserType.TTCARE);
			uploadSIMsRequest.setUploadType(UploadType.UPDATE_ID_DMGPC_DET);

			uploadSIMsRequest.setSimInformation( simArr.toArray(new String[simArr.size()]) );
			uploadSIMsRequest.setMessageID(String.valueOf(System.currentTimeMillis()));
			uploadSIMsRequest.setVersion(version);
			uploadSIMsRequest.setSecurityId(securityId);
			uploadSIMsRequest.setServiceContext(serviceContext);
			uploadSIMsResponse = porttype.uploadSIMs(uploadSIMsRequest);
			if(uploadSIMsResponse !=  null ){
				if(uploadSIMsResponse.getStatusCode() !=  null ){
					if(uploadSIMsResponse.getStatusCode().toString().trim().equalsIgnoreCase("SUCCESS")){
						errorCode = 0;
						sbufx.append("PersonalDetailsUpload.insert Response Status:"+ uploadSIMsResponse.getStatusCode().toString()+"\n"+" Response Transaction ID: " + uploadSIMsResponse.getTransactionId()+"\n");
						transactionId = uploadSIMsResponse.getTransactionId();
					}else{	
						sbufx.append("PersonalDetailsUpload.insert Response Status:"+ uploadSIMsResponse.getStatusCode().toString()+"\n");
						ErrorData[] errorDatas = uploadSIMsResponse.getErrors();

						if(errorDatas != null){
							for(int i=0; i<errorDatas.length; i++){

								sbufx.append("PersonalDetailsUpload.insert Response ErrorCode: " + errorDatas[i].getErrorCode() +"\n");
								sbufx.append("PersonalDetailsUpload.insert Response ErrorDescription: " +errorDatas[i].getErrorMessage()+"\n");
							}
						}
						else{
							sbufx.append("PersonalDetailsUpload.insert Response errData: " +errorDatas);
							throw new Exception("61001");
						}
					}
				}else {
					sbufx.append("PersonalDetailsUpload.insert Response Status " + uploadSIMsResponse.getStatusCode());
					throw new Exception("61001");
				}
			}else{
				sbufx.append("PersonalDetailsUpload.insert Response uploadSIMsResponse " + uploadSIMsResponse);
				throw new Exception("61001");
			}	
		} catch (MalformedURLException e) {
			e.printStackTrace();
			sbufx.append("PersonalDetailsUpload.insert MalformedURLException" +e.getLocalizedMessage()) ;
			//throw new Exception("61001");
		} catch (ServiceException e) {
			e.printStackTrace();
			sbufx.append("PersonalDetailsUpload.insert ServiceException" +e.getLocalizedMessage()) ;
			//throw new Exception("61001");
		} catch (RemoteException e) {
			e.printStackTrace();
			sbufx.append("PersonalDetailsUpload.insert RemoteException" +e.getLocalizedMessage()) ;
			//throw new Exception("61001");
		}catch (Exception e){
			e.printStackTrace();
		}finally{

			logger.debug( sbufx);
			//sbufx = null;
		}

		this.invokeXbusTime = System.currentTimeMillis() - startTime;

		if( logger.isDebugEnabled() ) {

			logger.debug("*** Time taken to invoke xBus (milli secons) : "+ this.invokeXbusTime );
		}
		return transactionId;
	}

	/**
	 * 
	 * This method  
	 * 
	 * @param simArr
	 * @throws Exception
	 * ramsundar.balagoni
	 * Mar 02, 2012
	 */
	public String callDB(List<String> simArr) {

		logger.info( "Calling DB to Upload Demographic Details");
		
		String transactionId = null;
		
		long startTime = System.currentTimeMillis();
		
		// Populate domain object with the data from web service request
		UploadSubTransDetailsData domainData = setMOSUploadSubTransDtlsRequest(simArr);
		
		try {
		
			/**
			 * calling db proc using mosf
			 */
			SPFactory spFactory = ServiceUtils.executeSPWithOutCommit("insert_sub_trans_dtls_proc_api", domainData, domainData);

			//Depending upon the result  either roll back(Failure) or commit(Success)
			Utilities.commitOrRollback(spFactory, domainData.getPo_error_code());
			if(logger.isInfoEnabled()) {

				logger.info("Error Code in insert_sub_trans_dtls_proc_api==>"+domainData.getPo_error_code());
			}

		} catch (SMFAgentException e) {
			logger.error( "Exception in Upload Demographic Details to DB with proc insert_sub_trans_dtls_proc_api \n"+Utilities.getStackTrace(e));
		}
		
		logger.info( "Error Code from insert_sub_trans_dtls_proc_api ==>" + domainData.getPo_error_code());
		logger.info( "Error desc from insert_sub_trans_dtls_proc_api ==>" + domainData.getPo_error_desc());

		logger.info("**** **** Time taken for insert_sub_trans_dtls_proc_api in (milli secons): " + (System.currentTimeMillis() - startTime) );
		
		transactionId = domainData.getPo_trans_id();
		
		logger.info( "Got TransactionId from insert_sub_trans_dtls_proc_api ==>" + domainData.getPo_trans_id());
		
		// Return the transactionId.
		return transactionId;
	}
	
	/**
     * this method is used to set data from request
     * @param request
     * @param headerDetails
     * @return UploadSubDetailsData
     * @throws SelfCareException 
     */
    private UploadSubTransDetailsData setMOSUploadSubTransDtlsRequest(List<String> simArr) {
        
    	UploadSubTransDetailsData domainData = null;

        List<String> iccNumbers = null;
        List<String> idNos = null;
        List<String> idTypes = null;
        List<String> firstNames = null;
        List<String> lastNames = null;
        List<String> firstAddress = null;
        //initialized secondAddress to send empty string as suggested and requested by Gangadhar(DB) Team
        List<String> secondAddress = new ArrayList<String>();
        List<String> postCodes = null;
        List<String> cityList = null;
        List<String> states = null;
        List<String> countries = null;
        List<String> dateOfBirth = new ArrayList<String>();
        List<String> gender = new ArrayList<String>();
        //List<String> userIdDb = null;
        List<String> netwokNameDb = null;
        List<String> userTypeDb = null;//(from smfagent always TTCARE)
        

        if ((null != simArr) && (simArr.size() > 0)) {
        	
        	domainData = new UploadSubTransDetailsData();
        	domainData.setPi_network_id(networkID);
        	domainData.setPi_user_id(userId);
        	
            iccNumbers    = new ArrayList<String>();
            idNos         = new ArrayList<String>();
            idTypes       = new ArrayList<String>();
            firstNames    = new ArrayList<String>();
            lastNames     = new ArrayList<String>();
            firstAddress  = new ArrayList<String>();
            postCodes     = new ArrayList<String>();
            cityList      = new ArrayList<String>();
            states        = new ArrayList<String>();
            countries     = new ArrayList<String>();
            //userIdDb      = new ArrayList<String>();
            netwokNameDb  = new ArrayList<String>();
            userTypeDb    = new ArrayList<String>();

            for (int index = 0; index < simArr.size(); index++) {
            	String[] tokens = Utilities.splitString(simArr.get(index),SMFAgentConstants.DELIMETER_COMMA);
 
            	if(logger.isDebugEnabled()) {
            		logger.debug( "spilttedRequest====>"+tokens);
            	}
            	if(logger.isDebugEnabled() && tokens!=null) {
            		logger.debug( "spilttedRequest Length==>"+tokens.length);
            	}

                if(null != tokens && tokens.length > 0){
                	
                	if(Utilities.isNull(tokens[0])==false){
                        iccNumbers.add(tokens[0].trim());
                	}
                	if(Utilities.isNull(tokens[1])==false){
                        idTypes.add(tokens[1].trim());
                	}
                	if(Utilities.isNull(tokens[2])==false){
                        idNos.add(tokens[2].trim());
                	}
                	if(Utilities.isNull(tokens[3])==false){
                        firstNames.add(tokens[3].trim());
                	}
                	if(Utilities.isNull(tokens[4])==false){
                        lastNames.add(tokens[4].trim());
                	}
                	if(Utilities.isNull(tokens[5])==false){
                        firstAddress.add(tokens[5].trim());
                	}
                	if(Utilities.isNull(tokens[6])==false){
                        secondAddress.add(tokens[6].trim());
                	} else {
                		secondAddress.add(SMFAgentConstants.EMPTY_STRING);
                	}
                	if(Utilities.isNull(tokens[7])==false){
                        postCodes.add(tokens[7].trim());
                	}
                	if(Utilities.isNull(tokens[8])==false){
                        cityList.add(tokens[8].trim());
                	}
                	if(Utilities.isNull(tokens[9])==false){
                        states.add(tokens[9].trim());
                	}
                	if(Utilities.isNull(tokens[10])==false){
                        countries.add(tokens[10].trim());
                	}
                	if(Utilities.isNull(tokens[11])==false){
                        gender.add(tokens[11].trim());
                	} else {
                		gender.add(SMFAgentConstants.SINGLE_SPACE);
                	}
                	if(Utilities.isNull(tokens[12])==false){
                		dateOfBirth.add(tokens[12].trim());
                	} else {
                		dateOfBirth.add(SMFAgentConstants.SINGLE_SPACE);
                	}
                	
                	//-----------------------
                	//userIdDb.add(userId);
                	userTypeDb.add(UserType.TTCARE.toString());
                	netwokNameDb.add(networkName);
                	//-----------------------
                	
                }
            } // End of FOR LOOP
            
            if( null != cityList && cityList.size() > 0 ) {
            	domainData.setPi_city_array(cityList.toArray(new String[0]));
            }
            if( null != countries && countries.size() > 0 ) {
            domainData.setPi_country_array(countries.toArray(new String[0]));
            }
            if( null != firstAddress && firstAddress.size() > 0 ) {
            domainData.setPi_first_address_array(firstAddress.toArray(new String[0]));
            }
            if( null != firstNames && firstNames.size() > 0 ) {
            domainData.setPi_first_name_array(firstNames.toArray(new String[0]));
            }
            if( null != iccNumbers && iccNumbers.size() > 0 ) {
            domainData.setPi_icc_num_array(iccNumbers.toArray(new String[0]));
            }
            if( null != idNos && idNos.size() > 0 ) {
            domainData.setPi_id_no_array(idNos.toArray(new String[0]));
            }
            if( null != idTypes && idTypes.size() > 0 ) {
            domainData.setPi_id_type_array(idTypes.toArray(new String[0]));
            }
            if( null != lastNames && lastNames.size() > 0 ) {
            domainData.setPi_last_name_array(lastNames.toArray(new String[0]));
            }
            if( null != postCodes && postCodes.size() > 0 ) {
            domainData.setPi_postcode_array(postCodes.toArray(new String[0]));
            }
            if( null != secondAddress && secondAddress.size() > 0 ) {
            domainData.setPi_second_address_array(secondAddress.toArray(new String[0]));
            }
            if( null != states && states.size() > 0 ) {
            domainData.setPi_state_array(states.toArray(new String[0]));
            }
            if( null != dateOfBirth && dateOfBirth.size() > 0 ) {
                domainData.setPi_date_of_birth(dateOfBirth.toArray(new String[0]));
            }
            if( null != gender && gender.size() > 0 ) {
                domainData.setPi_gender(gender.toArray(new String[0]));
            }
            
            //-----------------------
            /*if( null != userIdDb && userIdDb.size() > 0 ) {
            	domainData.setPi_user_id(userIdDb.toArray(new String[0]));
            }*/
            if( null != userTypeDb && userTypeDb.size() > 0 ) {
            	domainData.setPi_user_type(userTypeDb.toArray(new String[0]));
            }
            if( null != netwokNameDb && netwokNameDb.size() > 0 ) {
            	domainData.setPi_network_name(netwokNameDb.toArray(new String[0]));
            }
          //-----------------------
            
            //printValues(domainData);
        }

        return domainData;
    }
    
    private String getValue(String[] input) {
    	String output = "";
    	for(int i=0; i<input.length; i++) {
    		output = output + "," + input[i]; 
    	}
    	
    	return output;
    }
    
    @SuppressWarnings("unused")
	private void printValues(UploadSubTransDetailsData domainData) {
    	logger.debug( "Printing Values====>");
    	
    	logger.debug( "getPi_network_id====>" + domainData.getPi_network_id());
    	
    	logger.debug( "pi_icc_num_array====>" + getValue(domainData.getPi_icc_num_array()));
    	logger.debug( "pi_id_no_array====>" + getValue(domainData.getPi_id_no_array()));
    	logger.debug("pi_id_type_array====>" + getValue(domainData.getPi_id_type_array()));
    	logger.debug( "pi_first_name_array====>" + getValue(domainData.getPi_first_name_array()));
    	logger.debug( "pi_last_name_array====>" + getValue(domainData.getPi_last_name_array()));
    	logger.debug( "pi_first_address_array====>" + getValue(domainData.getPi_first_address_array()));
    	logger.debug( "pi_second_address_array====>" + getValue(domainData.getPi_second_address_array()));
    	logger.debug( "pi_postcode_array====>" + getValue(domainData.getPi_postcode_array()));
    	logger.debug( "pi_city_array====>" + getValue(domainData.getPi_city_array()));
    	logger.debug( "pi_state_array====>" + getValue(domainData.getPi_state_array()));
    	logger.debug( "pi_country_array====>" + getValue(domainData.getPi_country_array()));
    	logger.debug("pi_gender====>" + getValue(domainData.getPi_gender()));
    	logger.debug( "pi_date_of_birth====>" + getValue(domainData.getPi_date_of_birth()));
    	logger.debug( "pi_user_id====>" + domainData.getPi_user_id());
    	logger.debug( "pi_network_name====>" + getValue(domainData.getPi_network_name()));
    	logger.debug( "pi_user_type====>" + getValue(domainData.getPi_user_type()));
    	logger.debug( "po_trans_id====>" + domainData.getPo_trans_id());
    	logger.debug( "po_error_cd====>" + domainData.getPo_error_code());
    	logger.debug( "po_error_desc====>" + domainData.getPo_error_desc());
    }
    

	/**
	 * 
	 * This method  
	 * 
	 * @param txNumber
	 * @throws Exception
	 * ramsundar.balagoni
	 * Mar 7, 2011
	 */
	/*public  SubTransInfoType[] getTransDetails(String txNumber, Hashtable errCodes) throws Exception{

		errorCode = 0;
		StringBuffer sbufx = null;
		GetSubTransDetailsRequest getTransDetailsRequest = null;
		GetSubTransDetailsResponse getTransDetailsResponse = null;
		ReportsManagementServicesLocator reportsManagementServicesLocator = null;


		try {
			sbufx = new StringBuffer("PersonalDetailsUpload.getTransDetails Sending Request URL :" + AGENT_URL + "\n" +
					                 "PersonalDetailsUpload.getTransDetails Sending TX Number :" + txNumber+ "\n");
			getTransDetailsRequest = new GetSubTransDetailsRequest();
			getTransDetailsResponse = new GetSubTransDetailsResponse();
			getTransDetailsRequest.setTransactionId(txNumber);

			reportsManagementServicesLocator = new ReportsManagementServicesLocator();
			reportsManagementServicesLocator.setReportsManagementServicesPortEndpointAddress(AGENT_URL.trim()+ "\n");
			ReportsManagementServicesBindingStub stub = new ReportsManagementServicesBindingStub(new URL(AGENT_URL.trim()), reportsManagementServicesLocator);

			if(stub != null){
				sbufx.append("PersonalDetailsUpload.getTransDetails Request networkID "+networkID+"\n"	);
				stub.setHeader(getSOAPHeaderElement(networkID));
				sbufx.append("PersonalDetailsUpload.getTransDetails Request stub for Response "+"\n"	);
				getTransDetailsResponse = stub.getSubTransDetails(getTransDetailsRequest);
				if(getTransDetailsResponse != null){
					actualIdDtls  = getTransDetailsResponse.getSubTransDetailsList();
					if(actualIdDtls != null){
						sbufx.append("PersonalDetailsUpload.getTransDetails Response actualIdDtls length "+actualIdDtls.length+"\n"	);
					}else{
						sbufx.append("PersonalDetailsUpload.getTransDetails Response actualIdDtls length "+actualIdDtls+"\n"	);
					}
				}
			}else{
				sbufx.append("PersonalDetailsUpload.getTransDetails Response stub for Response "+stub+"\n"	);
			}

		}catch (ErrorDetailsType e) {

			sbufx.append("PersonalDetailsUpload.getTransDetails ErrorDetailsType  ErrorCode: " +e.getErrorCode()+"\n");
			sbufx.append("PersonalDetailsUpload.getTransDetails ErrorDetailsType  ErrorMessage: " +e.getErrorMessage()+"\n" );
			//ArrayList serviceErr = DataManagement.getServiceErrCodes();
			if(e.getErrorCode() !=null && errCodes.containsKey(e.getErrorCode())){
				throw new Exception(Integer.parseInt(e.getErrorCode()),"");
			}
			else{
				throw new Exception(61001,""); 
			}
		} catch (AxisFault e) {
			sbufx = new StringBuffer("PersonalDetailsUpload.getTransDetails AxisFault Exception:" +e.getLocalizedMessage()+"\n");
			throw new Exception(61001,"");
		} catch (MalformedURLException e) {
			sbufx = new StringBuffer("PersonalDetailsUpload.getTransDetails MalformedURLException:" +e.getLocalizedMessage()+"\n");
			throw new Exception(61001,"");
		} catch (RemoteException e) {
			sbufx = new StringBuffer("PersonalDetailsUpload.getTransDetails RemoteException:" +e.getLocalizedMessage()+"\n");
			throw new Exception(61001,"");
		}finally{
			InfinetUtility.log(sbufx);
			sbufx = null;
		}
		return actualIdDtls;

	}*/



	/**
	 * 
	 * This method  
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 * @throws Exception
	 * ramsundar.balagoni
	 * Mar 7, 2011
	 */
	/*public  TransactionType[] getTransDetailsDuration(String startDate, String endDate, Hashtable errCodes ) throws Exception{

		ReportsManagementServicesLocator reportsManagementServicesLocator = null;

		GetSubTransDurationRequest transDtlsDurationRequest = null;
		GetSubTransDurationResponse transDtlsDurationResponse = null;
		StringBuffer sbufx = null;
		 TransactionType[] transDtls = null;

			try {
				sbufx = new StringBuffer("PersonalDetailsUpload.getTransDetailsDuration Request URL:" +AGENT_URL.trim()+"\n"+
						"PersonalDetailsUpload.getTransDetailsDuration Request nwId:" +networkID+"\n");
				transDtlsDurationRequest = new GetSubTransDurationRequest();
				transDtlsDurationResponse = new GetSubTransDurationResponse();

				sbufx.append("PersonalDetailsUpload.getTransDetailsDuration Request startDate:" +startDate+"\n"+
						"PersonalDetailsUpload.getTransDetailsDuration Request endDate:" +endDate+"\n"	);
				DurationType durationType = new DurationType();
				durationType.setFromDate(startDate);
				durationType.setToDate(endDate);

				transDtlsDurationRequest.setDuration(durationType);

				reportsManagementServicesLocator = new ReportsManagementServicesLocator();
				reportsManagementServicesLocator.setReportsManagementServicesPortEndpointAddress(AGENT_URL.trim());
				ReportsManagementServicesBindingStub stub = new ReportsManagementServicesBindingStub(new URL(AGENT_URL.trim()), reportsManagementServicesLocator);

				if(stub != null){

					stub.setHeader(getSOAPHeaderElement(networkID));
					sbufx.append("PersonalDetailsUpload.getTransDetailsDuration Request stub for Response "+"\n"	);
					transDtlsDurationResponse = stub.getSubTransDuration(transDtlsDurationRequest);
					if(transDtlsDurationResponse != null){
						transDtls  = transDtlsDurationResponse.getSubTransDurationDetails();
						if(transDtls != null){
							sbufx.append("PersonalDetailsUpload.getTransDetailsDuration Response TransDtls length:" +transDtls.length+"\n");

						}else{
							sbufx.append("PersonalDetailsUpload.getTransDetailsDuration Response TransDtls :" +transDtls+"\n");
							throw new Exception(61001,"");
						}


					}else{
						sbufx.append("PersonalDetailsUpload.getTransDetailsDuration Response TransDtlsDurationResponse:" +transDtlsDurationResponse+"\n");
						throw new Exception(61001,"");
					}

				}else{
					sbufx.append("PersonalDetailsUpload.getTransDetailsDuration Response ReportsManagementServicesBindingStub:" +stub+"\n");
					throw new Exception(61001,"");
				}


			}catch (ErrorDetailsType e) {

				sbufx.append("PersonalDetailsUpload.getTransDetailsDuration ErrorDetailsType  ErrorCode: " +e.getErrorCode()+"\n");
				sbufx.append("PersonalDetailsUpload.getTransDetailsDuration ErrorDetailsType  ErrorMessage: " +e.getErrorMessage()+"\n" );
				if(e.getErrorCode() !=null && errCodes.containsKey(e.getErrorCode())){
					throw new Exception(Integer.parseInt(e.getErrorCode()),"");
				}
				else{
					throw new Exception(61001,""); 
				}
			}
			catch (AxisFault e) {
				sbufx.append("PersonalDetailsUpload.getTransDetailsDuration AxisFault Exception:" +e.getLocalizedMessage()+"\n");
				throw new Exception(61001,"");
			} catch (MalformedURLException e) {
				sbufx.append("PersonalDetailsUpload.getTransDetailsDuration MalformedURLException:" +e.getLocalizedMessage()+"\n");
				throw new Exception(61001,"");
			} catch (RemoteException e) {
				sbufx.append("PersonalDetailsUpload.getTransDetailsDuration RemoteException:" +e.getLocalizedMessage()+"\n");
				throw new Exception(61001,"");
			}
			finally{
				InfinetUtility.log(sbufx);
			}
		return transDtls;
	}*/


	/**
	 * 
	 * This method  
	 * 
	 * @param nwid
	 * @return
	 * ramsundar.balagoni
	 * Mar 7, 2011
	 */
	/*	public SOAPHeaderElement getSOAPHeaderElement(int nwid)  {

		String messageId = "TxHistory"; 
		String carrierId =nwid+""; 
		String userId = "test123";

		String messageHeaderNameSpace = "http://scare.xbus.xiusbcgi.com/common/header/HeaderDetails.xsd";
		SOAPHeaderElement messageHeader = null;

		try{

		messageHeader = 
			new SOAPHeaderElement(new QName("messageHeader"));
		messageHeader.setNamespaceURI( messageHeaderNameSpace );

		messageHeader.addChildElement("trackingMessageHeader");

		@SuppressWarnings("unchecked")
		Iterator messageHeaderIteratort = messageHeader.getChildElements();

		while(messageHeaderIteratort.hasNext()) {

			MessageElement trackingMessageHeaderEl = null;

			trackingMessageHeaderEl = (MessageElement)messageHeaderIteratort.next();

			if( trackingMessageHeaderEl.getName().equalsIgnoreCase("trackingMessageHeader")) {

				MessageElement headerElement = null;

				trackingMessageHeaderEl.addChildElement("messageId");
				trackingMessageHeaderEl.addChildElement("carrierId");
				trackingMessageHeaderEl.addChildElement("userId");
				@SuppressWarnings("unchecked")
				Iterator trackingMessageHeaderIterator = trackingMessageHeaderEl.getChildElements();

				while(trackingMessageHeaderIterator.hasNext()) {

					headerElement = (MessageElement)trackingMessageHeaderIterator.next();
					if( headerElement.getName().equalsIgnoreCase("messageId")) {

						headerElement.addTextNode( messageId );
					}
					if( headerElement.getName().equalsIgnoreCase("carrierId")) {

						headerElement.addTextNode( carrierId );
					}
					if( headerElement.getName().equalsIgnoreCase("userId")) {

						headerElement.addTextNode( userId );
					}
				}
			}

		}
		}
		catch(Exception e){
			InfinetUtility.log("SetCreditMgmt.getSOAPHeaderElement Exception" +e.getLocalizedMessage() );
			e.printStackTrace();
		}
		return messageHeader;
	}*/

	/*public SubTransInfoType[] getActualIdDtls() {
		return actualIdDtls;
	}*/



	/**
	 * 
	 * This method  
	 * 
	 * @param dupSet
	 * @param s
	 * @return
	 * ramsundar.balagoni
	 * Mar 7, 2011
	 */
	@SuppressWarnings({ "unused", "unchecked", "rawtypes" })
	private boolean validateDup(Set dupSet, String s) {
		if(!dupSet.add(s)){
			return false;
		}
		return true;
	}

	/**
	 * 
	 * This method  
	 * 
	 * @param nwid
	 * ramsundar.balagoni
	 * Mar 7, 2011
	 */
	/*public void setNwID(int nwid) {
		networkID = nwid;
	}*/

	/**
	 * 
	 * This method  
	 * 
	 * @return
	 * ramsundar.balagoni
	 * Mar 7, 2011
	 */
	public boolean isFileEmpty() {
		return this.fileEmpty;
	}

	/**
	 * 
	 * This method  
	 * 
	 * @return
	 * ramsundar.balagoni
	 * Mar 7, 2011
	 */
	public int getErrorCode() {
		return errorCode;
	}


	public boolean isMaxRec() {
		return this.maxRec;
	}


	/*public SyncUploadError[] getSyncUploadError() {
		return syncUploadError;
	}


	public CreditDetailsType[] getCreditDetailsType() {
		return creditDetailsType;
	}


	public void setCreditDetailsType(CreditDetailsType[] creditDetailsType) {
		this.creditDetailsType = creditDetailsType;
	}*/


	public void uploadToFTP(List<String> validLines, String txId, List<String> ftpFilesNames) {

		logger.debug( ""+validLines);
	}


	public long getTransformTime() {
		return transformTime;
	}


	public void setTransformTime(long transformTime) {
		this.transformTime = transformTime;
	}


	public long getValidationTime() {
		return validationTime;
	}


	public void setValidationTime(long validationTime) {
		this.validationTime = validationTime;
	}


	public long getInvokeXbusTime() {
		return invokeXbusTime;
	}


	public void setInvokeXbusTime(long invokeXbusTime) {
		this.invokeXbusTime = invokeXbusTime;
	}

	/*public List<String> downLoadFromFtp() {

		FTPClient ftp =	null;	
		String ftpIp= null;
		String ftpUser= null;
		String ftpPwd= null;
		String filePath= null;
		String fileName= null; 
		String localfilePath= null; 
		String xBusURL= null;

		FileOutputStream fop = null;
		File file = null;

		List<String> ftpFilesList = null;
		try{
			ftpIp=InitiateAll.getSMFProps().getProperty( "ftp.ip");
			ftpUser=InitiateAll.getSMFProps().getProperty( "ftp.user");
			ftpPwd=InitiateAll.getSMFProps().getProperty( "ftp.password");
			filePath=InitiateAll.getSMFProps().getProperty( "ftp.file.path");
			//fileName=InitiateAll.getSMFProps().getProperty( "ftp.readFileName");
			localfilePath=InitiateAll.getSMFProps().getProperty( "ftp.file.local.path");
			xBusURL=InitiateAll.getSMFProps().getProperty( "ftp.xbus.url");

			if(Utilities.isNull( ftpIp )||
					Utilities.isNull( ftpUser )||
					Utilities.isNull( ftpPwd )|| 
					Utilities.isNull( filePath )|| 
					Utilities.isNull( fileName ) ||
					Utilities.isNull( xBusURL )) {

				logger.log(BCGLevel.ERROR, "MISSING FTP PROPERTIES");
				logger.log(BCGLevel.ERROR, "SERVER IS STOPING");

				System.exit(0);
			}

			ftpFilesList = new ArrayList<String>();
			ftpFilesList.add(fileName);

			ftp= new FTPClient();
			int reply;

			ftp.connect(ftpIp);
			ftp.login(ftpUser,ftpPwd);

			reply = ftp.getReplyCode();
			if(FTPReply.isPositiveCompletion(reply) == false ){

				logger.log(BCGLevel.ERROR,"<<<####>>> Connection Failed to the given FTP server: "+ftpIp);
				throw new Exception("Connection Failed to the given FTP server: "+ftpIp);
			}

			if(!ftp.getStatus(filePath).contains(fileName)){

				logger.log(BCGLevel.ERROR,"<<<####>>> File not available at the given path:"+filePath+"/"+fileName);
				throw new Exception("File not available at the given path:"+filePath+"/"+fileName);
			}

			InputStream stO = new BufferedInputStream(ftp.retrieveFileStream(filePath+"/"+fileName), ftp.getBufferSize());

			file = new File(localfilePath+"/"+fileName);
			fop = new FileOutputStream(file);

			org.apache.commons.net.io.Util.copyStream(
					stO,
					fop,
					ftp.getBufferSize(),
					org.apache.commons.net.io.CopyStreamEvent.UNKNOWN_STREAM_SIZE,
					new org.apache.commons.net.io.CopyStreamAdapter() {
						public void bytesTransferred(long totalBytesTransferred,
								int bytesTransferred,
								long streamSize) {
						}
					});
			ftp.completePendingCommand();

			if(fop!=null)fop.close();
			if(ftp!=null)ftp.disconnect();
		}catch(Exception e){

			logger.log(BCGLevel.ERROR,"Exception: "+Utilities.getStackTrace(e) );
		}finally{
		}

		return ftpFilesList;
	}*/
}
