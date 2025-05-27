/******************************************************************
 * Company XIUS (Megasoft Pvt Ltd Hyderabad,INDIA)
 * � Copyright 2006 MEGASOFT. 
 *
 * Package      : com.xius.smf.job;
 * Name of File : FTPFileBulkSimUploadJob.java
 * Date /Year   : 
 * Author       : Sambasiva Rao Aakula
 * Discription  : This Job is used to Read the text files from FTP and able to write the data to the DB
 * 					for bulk 
 * Method names : 
 * Modifications:
 * Method Name  |  Date   |  Author  | Explanation
 * -------------------------------------------------------------              
 *              |         |          |
 *              |         |          | 
 *             
 ********************************************************************/ 
package com.xius.smf.job;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import net.bcgi.util.db.SPFactory;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;

import com.xius.smf.domaindata.BadFileMovingData;
import com.xius.smf.domaindata.FTPBulkSimUploadData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.ftp.FTPReadFileMgmt;
import com.xius.smf.ftp.ReadFTPConnection;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class FTPFileBulkSimUploadJob implements Job , StatefulJob{
	private	 static final Logger logger = LogManager.getLogger(FTPFileBulkSimUploadJob.class.getSimpleName());
    FTPClient ftpconn=null;
    String expectedfileName=null;
    String[] networkIdAndfileName=null;
    String channelId=null;
    
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		channelId = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.CHANNEL_ID);
		logger.info("---The FTP_BULKSIM_UPLOAD_JOB started Execute---");
		expectedfileName = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.FTP_BULKSIM_UPLOAD_EXPECTED_FILENAME);
		logger.info("---The ActualFile Name  is  ========> " + expectedfileName);
	
			networkIdAndfileName=expectedfileName.split("#");
		
		logger.debug("---The FTP_BULKSIM_UPLOAD_JOB The expectedfileName Configured is---"+ expectedfileName);
		String fldpath = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.FTP_BULKSIM_UPLOAD_FOLDER_PATH);
		logger.debug("---The FTP_BULKSIM_UPLOAD_JOB The FolderPath Configured is---"+ fldpath);
		try {
			FTPReadFileMgmt readfilemgmt = new FTPReadFileMgmt();
			ftpconn = new ReadFTPConnection().getConnection();
			List fileNamelist = readfilemgmt.getFileList(fldpath, ftpconn);
			if (null != fileNamelist && fileNamelist.size() > 0) {
				logger.info("The file list size returned is"
						+ fileNamelist.size());
				for (int itr = 0; itr < fileNamelist.size(); itr++) {
					readfilemgmt = new FTPReadFileMgmt();
					ftpconn = new ReadFTPConnection().getConnection();
					logger.debug("---The fileName for process---"+ fileNamelist.get(itr));
					processFile((String) fileNamelist.get(itr), readfilemgmt,fldpath, ftpconn);
				}
				ftpconn.disconnect();
			} else {
				ftpconn.disconnect();

				logger.info("The size of fileName list  returned is null");
			}
		} catch (IOException e) {
			logger.error("Excepion in FTPclient Connection closing"
					+ Utilities.getStackTrace(e));
		}
	}
	
	private void processFile(String fileName,FTPReadFileMgmt  readfilemgmt,String path,FTPClient ftpconn) {
		SPFactory spFactory = null;
		int result1=0;
		String reNameFile=null;
		expectedfileName = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.FTP_BULKSIM_UPLOAD_EXPECTED_FILENAME);

		
			networkIdAndfileName=expectedfileName.split("#");
		int Skipline = Integer.parseInt(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.FTP_BULKSIM_UPLOAD_READ_SKIP_LINE));
		logger.debug("---The FTP_BULKSIM_UPLOAD_JOB The SKIPLINE Configured is---"+ Skipline);
		String fileNametype = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.FTP_BULKSIM_UPLOAD_FILE_NAME_TYPE);
		logger.debug("---The FTP_BULKSIM_UPLOAD_JOB The FILE NAME TYPE Configured is---"+ fileNametype);
		expectedfileName = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.FTP_BULKSIM_UPLOAD_EXPECTED_FILENAME);

		for (int i = 0; i < networkIdAndfileName.length; i++) {
				if(fileName.contains(networkIdAndfileName[i])){
		       //if(fileName!=null && fileName.contains(networkIdAndfileName[1])){
		        	String[] fileDataArray = readfilemgmt.fileRead(fileName, path, ftpconn,Skipline, fileNametype);
		    		
		    		String[] filerename=fileName.split(fileNametype);
		    		
		    		reNameFile= filerename[0]+Utilities.dateTimeStamp()+fileNametype;
		    		
		    		
		    		if (fileDataArray != null) {
		    			
		    			FTPBulkSimUploadData data = getDataForDB(fileDataArray, fileName);
		    			if (logger.isDebugEnabled()) {
		    				logger.debug( data.toString());
		    			}
		    			try {
		    				  				
		    				
		    				
		    				spFactory = ServiceUtils.executeSPWithOutCommit("sim_upload_data", data, data);
		    				if (logger.isInfoEnabled()) {
		    					logger.info("Error Code ==>" + data.getPo_error_code());
		    					logger.info("Error Msg ==>" + data.getPo_error_desc());
		    					
		    				}
		    				Utilities.commitOrRollback(spFactory, data.getPo_error_code());
	    					logger.info("Transaction ID For the File ====>  :  "+data.getPo_trans_no());

		    				if(data.getPo_error_code()==0){
							logger.info("=======>File Reading success with valid records and inserted in DB Successfully file is moving to  <========"+InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SIMREG_COMPLETED_PATH));
		    					try {
				    				//String[] filerename=fileName.split(fileNametype);
									logger.info("filerename[0]>>>>"+filerename[0]);
									if(filerename.length>0){
									 //reNameFile= filerename[0]+Utilities.dateTimeStamp()+fileNametype;
									result1=ftpconn.rnto(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SIMREG_COMPLETED_PATH)+reNameFile);
									}
				    			} catch (IOException e) {
									e.printStackTrace();
				    			}
		    				}
		    				else{
		    					
		    					logger.info("File Reading Failed due to Invaild records in file and file is reNamed  and Moving ====>  :  "+reNameFile);
								 result1=ftpconn.rnto(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BAD_FILE_MOVING_PATH)+reNameFile);
					    		callDbForBadFileTracking(fileName, channelId);
		    				}
		    				
		    			} catch (Exception e) {
		    				e.printStackTrace();
		    			}
		    			
		    		} else {
		    			
		    			try {
							logger.info("File Reading Failed due to Invaild records in file and file is reNamed  and Moving ====>  :  "+reNameFile);
							 result1=ftpconn.rnto(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BAD_FILE_MOVING_PATH)+reNameFile);
				    		callDbForBadFileTracking(fileName, channelId);
		    			
		    			} catch (IOException e) {
							e.printStackTrace();
						}
						
		    		}
		        }
		        /*else {
					logger.info("File Reading Failed due to Invaild records in file and file is reNamed  and Moving ====>  :  "+reNameFile);
					callDbForBadFileTracking(fileName, channelId);
				}*/
				
			

		}
		
		
		
	}

	
	
	private FTPBulkSimUploadData getDataForDB(String[] arrayOfString,String fileName) {
		
		String[] fileNameWithNetworkID=fileName.split("_");

		FTPBulkSimUploadData bulkSimUploadData = new FTPBulkSimUploadData();

		String[] simList = null;
		Long[] idTypeList = null;
		String[] idList = null;
		String[] firstNameList = null;
		String[] lastNameList = null;
		String[] surNameList = null;
		String[] dobList = null;
		String[] acctTypeList = null;
		BigDecimal[] creditLimitList = null;
		Long[] billcycledayList = null;
		String[] municipoalityList = null;
		String[] streetlimitsList = null;
		String[] genderList = null;
		String[] streetList = null;
		String[] colonyList = null;
		String[] countryList = null;
		String[] stateList = null;
		String[] cityList = null;
		Long[] postalcodeList = null;
		String[] emailList = null;
		Long[] alternatecontactnoList = null;
		String[] tariffpackageList = null;
		String[] userinputfield1List = null;
		String[] userinputfield2List = null;
		String[] userinputfield3List = null;
		String[] userinputfield4List = null;
		String[] userinputfield5List = null;
		Long[] tariffpackageidList = null;
		String[] billTypeList = null;
		String[] billFrquency = null;
		String[] internalNumber = null;
		String[] externalNumber = null;
		String[] dealer_id=null;
		Long[] location_code=null;
		String[] personal_information_yn=null;
		

		if (arrayOfString != null) {

			simList = new String[arrayOfString.length];
			idTypeList = new Long[arrayOfString.length];
			idList = new String[arrayOfString.length];

			firstNameList = new String[arrayOfString.length];
			lastNameList = new String[arrayOfString.length];
			dobList = new String[arrayOfString.length];

			genderList = new String[arrayOfString.length];
			acctTypeList = new String[arrayOfString.length];
			creditLimitList = new BigDecimal[arrayOfString.length];
			surNameList = new String[arrayOfString.length];

			billcycledayList = new Long[arrayOfString.length];
			municipoalityList = new String[arrayOfString.length];
			streetlimitsList = new String[arrayOfString.length];

			streetList = new String[arrayOfString.length];
			colonyList = new String[arrayOfString.length];
			countryList = new String[arrayOfString.length];
			stateList = new String[arrayOfString.length];
			cityList = new String[arrayOfString.length];
			postalcodeList = new Long[arrayOfString.length];
			emailList = new String[arrayOfString.length];
			alternatecontactnoList = new Long[arrayOfString.length];
			tariffpackageList = new String[arrayOfString.length];
			userinputfield1List = new String[arrayOfString.length];
			userinputfield2List = new String[arrayOfString.length];
			userinputfield3List = new String[arrayOfString.length];
			userinputfield4List = new String[arrayOfString.length];
			userinputfield5List = new String[arrayOfString.length];
			tariffpackageidList = new Long[arrayOfString.length];
			billTypeList = new String[arrayOfString.length];
			billFrquency = new String[arrayOfString.length];
			internalNumber = new String[arrayOfString.length];
			externalNumber = new String[arrayOfString.length];
			dealer_id=new String[arrayOfString.length]; 
			location_code=new Long[arrayOfString.length];
			personal_information_yn=new String[arrayOfString.length]; 
			

			logger.info( "No. of comma separated fields : "
					+ arrayOfString.length);
			for (int i = 0; i < arrayOfString.length; i++) {

				String[] data = arrayOfString[i]
						.split(SMFAgentConstants.DELIMETER_COMMA,-1);
				simList[i] = null;
				idTypeList[i] = null;
				idList[i] = null;
				firstNameList[i] = null;
				lastNameList[i] = null;
				surNameList[i] = null;

				dobList[i] = null;

				genderList[i] = null;

				acctTypeList[i] = null;
				creditLimitList[i] = null;

				billcycledayList[i] = null;
				municipoalityList[i] = null;
				streetlimitsList[i] = null;
				streetList[i] = null;
				colonyList[i] = null;
				countryList[i] = null;
				stateList[i] = null;
				cityList[i] = null;
				postalcodeList[i] = null;
				emailList[i] = null;
				alternatecontactnoList[i] = null;
				tariffpackageList[i] = null;
				userinputfield1List[i] = null;
				userinputfield2List[i] = null;
				userinputfield3List[i] = null;
				userinputfield4List[i] = null;
				userinputfield5List[i] = null;
				tariffpackageidList[i] = null;
				billTypeList[i] = null;

				billFrquency[i] = null;
				internalNumber[i] = null;
				externalNumber[i] = null;
				dealer_id[i]=null;
				location_code[i]=null;
				personal_information_yn[i]=null;

				
				if (null != data) {
					
					if ( Utilities.isNull(data[0]) == false) {
						simList[i] = data[0].trim();
						System.out.println("sim no :  "+data[0]);
						
					}
					if (Utilities.isNull(data[1]) == false) {
						idTypeList[i] = new Long(data[1].trim());
						System.out.println("idtype no :  "+data[1]);

					} else {
						idTypeList[i] = null;
					}
					
					if ( Utilities.isNull(data[2]) == false) {
						System.out.println("id no :  "+data[2]);

						idList[i] = data[2].trim();
					} else {
						idList[i] = null;
					}
					if (Utilities.isNull(data[3]) == false) {
						System.out.println("first name no :  "+data[3]);

						firstNameList[i] = data[3].trim();
					} else {
						firstNameList[i] = null;
					}

					if (Utilities.isNull(data[4]) == false) {
						System.out.println("last name:  "+data[4]);

						lastNameList[i] = data[4].trim();
					} else {
						lastNameList[i] = null;
					}
					if (Utilities.isNull(data[5]) == false) {
						System.out.println("surname :  "+data[5]);

						surNameList[i] = data[5].trim();
					} else {
						surNameList[i] = null;
					}
					if (Utilities.isNull(data[6]) == false) {
						System.out.println("date of birth :  "+data[6]);

						dobList[i] = data[6].trim();
					} else {
						dobList[i] = null;
					}
					/*if (Utilities.isNull(data[7]) == false) {
						acctTypeList[i] = data[7].trim();
					} else {
						acctTypeList[i] = null;
					}*/
					/*if (Utilities.isNull(data[8]) == false) {
						creditLimitList[i] = new BigDecimal(data[8].trim());
					} else {
						creditLimitList[i] = null;
					}
					if (Utilities.isNull(data[9]) == false) {
						billcycledayList[i] = new Long(data[9].trim());
					} else {
						billcycledayList[i] = null;
					}*/
					if (Utilities.isNull(data[7]) == false) {
						municipoalityList[i] = data[7].trim();
						System.out.println("municipoalityList:  "+data[7]);

					} else {
						municipoalityList[i] = null;
					}
					if (Utilities.isNull(data[8]) == false) {
						System.out.println("streetlimitsList:  "+data[8]);

						streetlimitsList[i] = data[8].trim();
					} else {

						streetlimitsList[i] = null;
					}

					if (Utilities.isNull(data[9]) == false) {
						System.out.println("genderList:  "+data[9]);

						genderList[i] = data[9].trim();
					} else {
						genderList[i] = null;
					}
					if (Utilities.isNull(data[10]) == false) {
						System.out.println("streetList:  "+data[10]);

						streetList[i] = data[10].trim();
					} else {
						streetList[i] = null;
					}
					if (Utilities.isNull(data[11]) == false) {
						System.out.println("colonyList:  "+data[11]);
						colonyList[i] = data[11].trim();
					} else {
						colonyList[i] = null;
					}
					/*if (Utilities.isNull(data[15]) == false) {
						countryList[i] = data[15].trim();
					} else {
						countryList[i] = null;
					}
					if (Utilities.isNull(data[16]) == false) {
						stateList[i] = data[16].trim();
					} else {
						stateList[i] = null;
					}*/
					if (Utilities.isNull(data[12]) == false) {
						System.out.println("cityList:  "+data[12]);

						cityList[i] = data[12].trim();
					} else {
						cityList[i] = null;
					}
					if ( Utilities.isNull(data[13]) == false) {
						System.out.println("postalcodeList:  "+data[13]);

						postalcodeList[i] = new Long(data[13].trim());
					} else {
						postalcodeList[i] = null;
					}
					if (Utilities.isNull(data[14]) == false) {
						System.out.println("emailList:  "+data[14]);

						emailList[i] = data[14].trim();
					} else {
						emailList[i] = null;
					}
					if ( Utilities.isNull(data[15]) == false) {
						System.out.println("alternatecontactnoList:  "+data[15]);

						alternatecontactnoList[i] = new Long(data[15].trim());
					} else {
						alternatecontactnoList[i] = null;
					}
					
					
					if (Utilities.isNull(data[16]) == false) {
						System.out.println("externalNumber:  "+data[16]);
						externalNumber[i] = data[16].trim();
					} else {
						externalNumber[i] = null;
					}
					if (Utilities.isNull(data[17]) == false) {
						System.out.println("internalNumber:  "+data[17]);
						internalNumber[i] = data[17].trim();
					} else {
						internalNumber[i] = null;
					}
					
					if (Utilities.isNull(data[18]) == false) {
						System.out.println("tariffpackageList:  "+data[18]);
						tariffpackageList[i] = data[18].trim();
					} else {
						tariffpackageList[i] = null;
					}
					if (Utilities.isNull(data[19]) == false) {
						System.out.println("tariffpackageidList:  "+data[19]);

						tariffpackageidList[i] = new Long(data[19].trim());
					} else {
						tariffpackageidList[i] = null;
					}
					 if(data.length==20)
					 {
					acctTypeList[i] ="1";
					System.out.println("acctType:  is set to 1 ");
					 }
					if(data.length!=20&&data.length==23)
				   {
			    	if (Utilities.isNull(data[20]) == false) {
			    		acctTypeList[i]=null;
						acctTypeList[i] = data[20].trim();
						System.out.println("acctType:  "+data[20]);
					} else {
						acctTypeList[i] ="1";
					}
					if (Utilities.isNull(data[21]) == false) {
						System.out.println("creditlimit:  "+data[21]);
						creditLimitList[i] = new BigDecimal(data[21].trim());
					} else {
						creditLimitList[i] = null;
					}
					if (Utilities.isNull(data[22]) == false) {
						System.out.println("billcycledayList:  "+data[22]);
						billcycledayList[i] = new Long(data[22].trim());
					} else {
						billcycledayList[i] = null;
					}
					
				   }
					/*if ( Utilities.isNull(data[23]) == false) {
						userinputfield1List[i] = data[23].trim();
					} else {
						userinputfield1List[i] = null;
					}
					if ( Utilities.isNull(data[24]) == false) {
						userinputfield2List[i] = data[24].trim();
					} else {

						userinputfield2List[i] = null;
					}
					if (Utilities.isNull(data[25]) == false) {

						userinputfield3List[i] = data[25].trim();
					} else {

						userinputfield3List[i] = null;
					}
					if ( Utilities.isNull(data[26]) == false) {

						userinputfield4List[i] = data[26].trim();
					} else {

						userinputfield4List[i] = null;
					}
					if (Utilities.isNull(data[27]) == false) {
						userinputfield5List[i] = data[27].trim();
					} else {
						 userinputfield5List[i] = null;
					}
					
					if (Utilities.isNull(data[28]) == false) {
						billTypeList[i] = data[28].trim();
					} else {
						billTypeList[i] = null;
					}
					if (Utilities.isNull(data[29]) == false) {
						billFrquency[i] = data[29].trim();
					} else {
						billFrquency[i] = null;}*/
					
					
				/*	dealer_id[i]=null;
					location_code[i]=null;
					personal_information_yn[i]=null;*/
					
					
					if(data.length!=20&&data.length!=23)
					   {
					
						if(data.length==26)
						   {
					if (Utilities.isNull(data[23]) == false) {
						System.out.println("Dealer Id:  "+data[23]);
						dealer_id[i] = new String(data[23].trim());
					} else {
						dealer_id[i] = null;
					}
					if (Utilities.isNull(data[24]) == false) {
						System.out.println("Location Code:  "+data[24]);
						location_code[i] = new Long(data[24].trim());
					} else {
						location_code[i] = null;
					}
					if (Utilities.isNull(data[25]) == false) {
						System.out.println("personal_information_yn:  "+data[25]);
						personal_information_yn[i] = new String(data[25].trim());
					} else {
						personal_information_yn[i] = null;
					}
						   }
					   }
					

				}
			}
			if(simList!=null){
				bulkSimUploadData.setPi_sim_no(simList);
			}
			
			if(idTypeList!=null){
				bulkSimUploadData.setPi_id_type(idTypeList);
			}
			if(idList!=null){
				bulkSimUploadData.setPi_id_no(idList);
			}
			if(firstNameList!=null){
				bulkSimUploadData.setPi_first_name(firstNameList);
			}
			
			if(lastNameList!=null){
				bulkSimUploadData.setPi_last_name(lastNameList);
			}
			
			if(surNameList!=null){
				bulkSimUploadData.setPi_sur_name(surNameList);
			}
			if(fileName!=null){
				bulkSimUploadData.setPi_file_name(fileName);
			}
						
			bulkSimUploadData.setPi_channel_id(InitiateAll.getSMFProps()
					.getProperty(SMFAgentConstants.CHANNEL_ID));
			if (Utilities.isNull(fileNameWithNetworkID[0]) == false) {
				bulkSimUploadData.setPi_network_id(Long
						.parseLong(fileNameWithNetworkID[0]));
			}
			
			bulkSimUploadData.setPi_date_of_birth(dobList);
			if(acctTypeList!=null){
				bulkSimUploadData.setPi_account_type(acctTypeList);

			}
			
			if(creditLimitList!=null){
				bulkSimUploadData.setPi_credit_limit(creditLimitList);
			}
			
			if(billcycledayList!=null){
				bulkSimUploadData.setPi_bill_cycleday(billcycledayList);
			}
			
			if(municipoalityList!=null){
				bulkSimUploadData.setPi_municipoality(municipoalityList);
			}
			

			if(streetlimitsList!=null){
				bulkSimUploadData.setPi_street_limits(streetlimitsList);
			}
			
			
			if(genderList!=null){
				bulkSimUploadData.setPi_gender(genderList);
			}
			
			if(streetList!=null){
				bulkSimUploadData.setPi_street(streetList);
			}
			
			if(colonyList!=null){
				bulkSimUploadData.setPi_colony(colonyList);
			}
			
			if(countryList!=null){
				bulkSimUploadData.setPi_country(countryList);
			}
			
			if(stateList!=null){
				bulkSimUploadData.setPi_state(stateList);
			}
			
			if(cityList!=null){
				bulkSimUploadData.setPi_city(cityList);
			}
			
			if(postalcodeList!=null){
				bulkSimUploadData.setPi_postal_code(postalcodeList);
			}
			
			if(emailList!=null){
				bulkSimUploadData.setPi_email(emailList);
			}
			
			if(alternatecontactnoList!=null){
				bulkSimUploadData.setPi_alternate_contact_no(alternatecontactnoList);
			}

			if(tariffpackageList!=null){
				bulkSimUploadData.setPi_tariff_package(tariffpackageList);
			}
			
			
			if(userinputfield1List!=null){
				bulkSimUploadData.setPi_user_input_field1(userinputfield1List);
			}
			
			if(userinputfield2List!=null){
				bulkSimUploadData.setPi_user_input_field2(userinputfield2List);

				
			}
			
			if(userinputfield3List!=null){
				bulkSimUploadData.setPi_user_input_field3(userinputfield3List);

				
			}
			
			if(userinputfield4List!=null){
				bulkSimUploadData.setPi_user_input_field4(userinputfield4List);

				
			}
			
			if(userinputfield5List!=null){
				bulkSimUploadData.setPi_user_input_field5(userinputfield5List);

				
			}if(billFrquency!=null){
				bulkSimUploadData.setPi_bill_frequency(billFrquency);

				
			}
			
			if(billTypeList!=null){
				bulkSimUploadData.setPi_bill_type(billTypeList);
			}
			
			if(tariffpackageidList!=null){
				bulkSimUploadData.setPi_tariff_package_id(tariffpackageidList);
			}
			
			if(externalNumber!=null){
				bulkSimUploadData.setPi_external_number(externalNumber);
			}
			
			if(internalNumber!=null){
				bulkSimUploadData.setPi_internal_number(internalNumber);
			}
			
			
			/*
			 * 
			 * 
			 * */
			
			if(dealer_id!=null){
				bulkSimUploadData.setPi_dealer_id(dealer_id);
			}
			
			if(externalNumber!=null){
				bulkSimUploadData.setPi_location_code(location_code);
			}
			
			if(internalNumber!=null){
				bulkSimUploadData.setPi_personal_information_yn(personal_information_yn);
			}
			
			if (Utilities.isNull(fileNameWithNetworkID[1]) == false) {
				
				String[] userIdArr=fileNameWithNetworkID[1].split(".txt");
				
				bulkSimUploadData.setPi_username(userIdArr[0]);
			}
		}
			
		return bulkSimUploadData;
	
	
	}
	
	
	private void callDbForBadFileTracking(String fileName,String channel){

		SPFactory spFactory = null;

		BadFileMovingData data = setMosfRequest(fileName, channel);

		if (logger.isDebugEnabled()) {

			logger.debug( data.toString());
		}

		try {
			spFactory = ServiceUtils.executeSPWithOutCommit("pro_bad_file_req_insert", data, data);

			if (logger.isInfoEnabled()) {

				logger.info("Error Code ==>" + data.getPo_error_code());
				logger.info("Error Msg ==>" + data.getPo_error_desc());
				logger.info("Bad File insert  Trans Id ==>" + data.getPo_trans_no());
			}

			Utilities.commitOrRollback(spFactory, data.getPo_error_code());

		} catch (SMFAgentException e) {

			e.printStackTrace();
		}

	}
	
	
	private BadFileMovingData setMosfRequest(String fileName, String ChannelId) {
		String[] fileNameWithNetworkID=fileName.split("_");


		BadFileMovingData badFileMovingData = new BadFileMovingData();
		if (Utilities.isNull(fileName) == false) {
			badFileMovingData.setPi_file_name(fileName);
		}
		if (Utilities.isNull(ChannelId) == false) {
			badFileMovingData.setPi_channel_id(ChannelId);
		}
		if (fileNameWithNetworkID[0] != null) {
			badFileMovingData.setPi_network_id(Long.parseLong(fileNameWithNetworkID[0]));
		}

		return badFileMovingData;

	}

}





