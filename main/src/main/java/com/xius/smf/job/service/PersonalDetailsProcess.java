package com.xius.smf.job.service;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.Utilities;


public class PersonalDetailsProcess {

	private static final Logger logger = LogManager.getLogger("PersonalDetailsProcess");

	public String filename=null;
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		//readProperties();
		readFtpFile();
	}*/

	
	public static List<String> readFtpFile() {
		
		FTPClient ftp =	null;	
		String ftpIp="",ftpUser="",ftpPwd="",dwldFileNm="",filePath="",fileName="", localfilePath="";
		FileOutputStream fop = null;
 		File file;
 		 
 		List<String> ftpFilesList = null;
		try{
			ftpIp=InitiateAll.getSMFProps().getProperty( "ftp.ip").toString();
			ftpUser=InitiateAll.getSMFProps().getProperty( "ftp.user").toString();
			ftpPwd=InitiateAll.getSMFProps().getProperty( "ftp.password").toString();
			filePath=InitiateAll.getSMFProps().getProperty( "ftp.file.path").toString();
			fileName=InitiateAll.getSMFProps().getProperty( "ftp.readFileName").toString();
			localfilePath=InitiateAll.getSMFProps().getProperty( "ftp.file.local.path").toString();
			
			if(Utilities.isNull( ftpIp )||
					Utilities.isNull( ftpUser )||
					Utilities.isNull( ftpPwd )|| 
					Utilities.isNull( filePath )|| 
					Utilities.isNull( fileName )) {
				
				logger.error( "MISSING FTP PROPERTIES");
				logger.error("SERVER IS STOPING");
				
				System.exit(0);
			}
			
			ftpFilesList = new ArrayList<String>();
			ftpFilesList.add(fileName);
			
			ftp= new FTPClient();
			int reply;
			
			ftp.connect(ftpIp);
	        ftp.login(ftpUser,ftpPwd);
	         
	        reply = ftp.getReplyCode();
	        if(FTPReply.isPositiveCompletion(reply)){
	            logger.info("Ftp Connected Successfully to: "+ftpIp);
	        }else {
	            logger.info("---->Connection Failed to the given FTP server: "+ftpIp);
	            throw new Exception("Connection Failed to the given FTP server: "+ftpIp);
	        }
	         
	         if(!ftp.getStatus(filePath).contains(fileName)){
	         	logger.info("---->File not available at the given path:"+filePath+"/"+fileName);
	         	throw new Exception("File not available at the given path:"+filePath+"/"+fileName);
	         }
			
	         InputStream stO = new BufferedInputStream(
						ftp.retrieveFileStream(filePath+"/"+fileName),
						  ftp.getBufferSize());
	         
	         
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
			logger.info(e.getMessage());
			e.printStackTrace();
		}finally{
		}
	
		return ftpFilesList;
	}
	
	
	
	/*public static void readProperties(){
		
		//ftpConnectProps = new Properties();
		String propsPath="E:/APPS/PersonalDetails/properties/personalDetails.properties";
		try{
			//ftpConnectProps.load(new FileInputStream(propsPath));
			logger.log(BCGLevel.INFO,ftpConnectProps);
			
			if( InitiateAll.getSMFProps().getProperty( "ftp.ip")==null || InitiateAll.getSMFProps().getProperty( "ftp.ip").toString().trim().length()<=0){
				throw new Exception("ftp.ip is not configured");
			}
			if( InitiateAll.getSMFProps().getProperty( "ftp.user")==null || InitiateAll.getSMFProps().getProperty( "ftp.user").toString().trim().length()<=0){
				throw new Exception("ftp.user is not configured");
			}
			if( InitiateAll.getSMFProps().getProperty( "ftp.password")==null || InitiateAll.getSMFProps().getProperty( "ftp.password").toString().trim().length()<=0){
				throw new Exception("ftp.password is not configured");
			}
			
			if( InitiateAll.getSMFProps().getProperty( "ftp.file.path")==null || InitiateAll.getSMFProps().getProperty( "ftp.file.path").toString().trim().length()<=0){
				throw new Exception("ftp.file.path is not configured");
			}
			
			if( InitiateAll.getSMFProps().getProperty( "ftp.readFileName")==null || InitiateAll.getSMFProps().getProperty( "ftp.readFileName").toString().trim().length()<=0){
				throw new Exception("ftp.readFileName is not configured");
			}
		}catch(Exception e){
			//logger.log(BCGLevel.INFO,propsPath+" File not available or cannot read the file");
			e.printStackTrace();
		}
	}*/
	
}
