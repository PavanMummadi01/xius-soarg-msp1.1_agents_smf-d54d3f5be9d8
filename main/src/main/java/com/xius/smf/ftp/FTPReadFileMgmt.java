/******************************************************************
 * Company XIUS (Megasoft Pvt Ltd Hyderabad,INDIA)
 * � Copyright 2006 MEGASOFT. 
 *
 * Package      : com.xius.smf.ftp;
 * Name of File : FTPReadFileMgmt.java
 * Date /Year   : 
 * Author       : Sambasiva Rao Aakula
 * Discription  :
 * Method names : 
 * Modifications:
 * Method Name  |  Date   |  Author  | Explanation
 * -------------------------------------------------------------              
 *              |         |          |
 *              |         |          | 
 *             
 ********************************************************************/ 

package com.xius.smf.ftp;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import net.bcgi.util.db.SPFactory;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.domaindata.BadFileMovingData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
public class FTPReadFileMgmt {
	private static final Logger logger = LogManager.getLogger(FTPReadFileMgmt.class.getSimpleName());

	public String[] fileRead(String filename, String path, FTPClient ftpconn , int skipLines, String splitString){
		 logger.info("FTPFileMgmt  fileRead filepath:"+path+",filename:"+filename);
		 BufferedReader bufferedReader = null;
	     InputStreamReader inputStreamReader = null;
		// InputStream inputStream = null;
		 List data = new ArrayList();
		 String[] out = null;
		 String toDir = null;
		try{
			InputStream inputStream = ftpconn.retrieveFileStream(path + filename);
			logger.debug("input stream object " + inputStream);
			if (inputStream != null) {
				
				/*
				 * This method is Used to Read file results in filling in String array  
				 * 
				 * */
				
				
				logger.debug("in if condition got inputStream object ");

				inputStreamReader = new InputStreamReader(inputStream);
				bufferedReader = new BufferedReader(inputStreamReader);
				String str;
			  
				int countline = 0;
				while ((str = bufferedReader.readLine()) != null) {
					countline++;
					if (countline <= skipLines) {
						continue;
					}
					data.add(str.trim());

				}
				
				out = (String[]) data.toArray(new String[data.size()]);
				if (logger.isDebugEnabled())
					logger.debug(" IF FTPFileMgmt  fileRead filepath:" + path
							+ ",filename:" + filename + ",out length:"
							+ out.length);

				int result, result1;
				result = 0;
				result1 = 0;
				result = ftpconn.rnfr(path + filename);

				if (FTPReply.isPositiveCompletion(ftpconn.getReplyCode())) {
					logger.info("ReplyCode to read >>>>>>>>"
							+ ftpconn.getReplyCode());
				}
				logger.info("result---->" + result);

				String[] filerename = filename.split(splitString);
				logger.info("filerename[0]>>>>" + filerename[0]);
				if (filerename.length > 0) {
					toDir = filerename[0] + Utilities.dateTimeStamp()
							+ splitString;
				} else {
					logger.info("filerename in else ------------------ "
							+ toDir);
				}

				for (int i = 0; i < out.length; i++) {
					  
					logger.info(out[i]
							+ "    Length of each record if >>>>   : "
							+ out[i].split(",",-1).length);
                        logger.info("Checking of Length of Each Record :   ===:> ::  "+ i);
                       
					if (out[i].split(",",-1).length == 23 || out[i].split(",",-1).length == 20 || out[i].split(",",-1).length == 26 ) {
						if (out.length == i)
							return out;
					} else {
						return null;

					}

				}
				if (FTPReply.isPositiveCompletion(ftpconn.getReplyCode())) {
					logger.info("ReplyCode aftermoving >>>>>>>>"
							+ ftpconn.getReplyCode());
				}
				logger.info("result1......>" + result1);

			} else {
				logger.debug("in else condition got inputStream object as null");
				if (logger.isDebugEnabled())
					logger.debug("Else FTPFileMgmt  fileRead filepath:" + path
							+ ",filename:" + filename + ",out :" + out);
			}

		} catch (Exception e) {
			logger.error("fileRead - Exception: " + Utilities.getStackTrace(e));
		}

		return out;
	}
	
     
 	
 	public List<String> getFileList(String fldpath, FTPClient ftpClient){
	String	expectedfileName = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.FTP_BULKSIM_UPLOAD_EXPECTED_FILENAME);
	 FTPClient ftpconn1=null;
	    int fltp=0;
	 
 		List<String> list = null;
 		try{ 
 			
 			String[] networkIdAndfileName=null;
 			
 		
 				networkIdAndfileName=expectedfileName.split("#");
 				logger.info ("***** Getting file form FTP form path ****** "+fldpath);
 				
 				FTPFile[] files = ftpClient.listFiles(fldpath);
 				
 				if(files != null && files.length > 0){
 					list = new ArrayList<String>();
 					
 					for(FTPFile file:files){
  						if(file.getSize()<Long.parseLong(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.FILE_SIZE_LIMIT))){
 							for (int i = 0; i < networkIdAndfileName.length; i++) {
 	 							if(file.getName().contains(networkIdAndfileName[i])){
 	 	 							list.add(file.getName());
 	 							}
 							}
 						}
 						else{
 							ftpClient = new ReadFTPConnection().getConnection();
 							callDbForBadFileTracking(file.getName(),"FTPBULKSIMUPLOAD");
 							logger.info ("Copying file Path for bad file ==>" + InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BAD_FILE_MOVING_PATH)+file.getName());
 							fltp=ftpClient.rnto(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BAD_FILE_MOVING_PATH)+file.getName());
 							
 						}
 						
 						
 					}
 					if (logger.isDebugEnabled())
 						logger.debug("get FileList  path: "+fldpath+", list size: "+list.size());
 				}
 				
 		}catch(Exception e){
 			logger.error("get  FileList Exception:"+Utilities.getStackTrace(e));
 		}
 			return list;
 	}
 	
 	
 	
 	
 	private void callDbForBadFileTracking(String fileName,String channel){

		SPFactory spFactory = null;

		BadFileMovingData data = setMosfRequest(fileName, channel);

		if (logger.isDebugEnabled()) {

			logger.info (data.toString());
		}

		try {
			spFactory = ServiceUtils.executeSPWithOutCommit("pro_bad_file_req_insert", data, data);

			if (logger.isInfoEnabled()) {

				logger.info ("Error Code ==>" + data.getPo_error_code());
				logger.info ("Error Msg ==>" + data.getPo_error_desc());
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











