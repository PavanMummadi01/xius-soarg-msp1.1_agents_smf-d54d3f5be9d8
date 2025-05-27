
package com.xius.smf.ftp;


import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.utils.InitiateAll;




public class ReadFTPConnection {
	private static final Logger logger = LogManager.getLogger(FTPReadFileMgmt.class.getSimpleName());

	
	 FTPClient ftp = null;
	
	 public FTPClient getConnection(){

		try{
			ftp= new FTPClient();
			ftp.connect(InitiateAll.getSMFProps().getProperty("ftp.ip"));
			ftp.login(InitiateAll.getSMFProps().getProperty("ftp.user"),InitiateAll.getSMFProps().getProperty("ftp.password"));
			ftp.setFileType(FTP.BINARY_FILE_TYPE);
			int reply = ftp.getReplyCode();
		     if(FTPReply.isPositiveCompletion(reply)){
		    	 logger.info("Ftp Connected Successfully to: "+InitiateAll.getSMFProps().getProperty("ftp.ip"));
		     }
		     else{
		    	 logger.info("Connection Failed to the given FTP server: "+InitiateAll.getSMFProps().getProperty("ftp.ip"));
		     }
		}catch(Exception e){
			e.printStackTrace();
		}

	
		return ftp;
	 }
	
	
}
