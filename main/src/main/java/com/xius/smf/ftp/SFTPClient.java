package com.xius.smf.ftp;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;
import com.xius.smf.utils.InitiateAll;

public class SFTPClient {
	
	private Session session = null;

	String privateKeyPath=InitiateAll.getSMFProps().getProperty("IMEI_SFTP_KEY");
	String REMOTE_HOST =InitiateAll.getSMFProps().getProperty("IMEI_SFTP_IP");
	String USERNAME = InitiateAll.getSMFProps().getProperty("IMEI_SFTP_USERNAME");
	String PASSWORD = InitiateAll.getSMFProps().getProperty("IMEI_SFTP_PASSWORD");
	
	int REMOTE_PORT = Integer.parseInt(InitiateAll.getSMFProps().getProperty("IMEI_SFTP_PORT"));
	
	private static final Logger logger = LogManager.getLogger("SFTPClient");

	public void connect() throws JSchException {

		JSch jsch = new JSch();

		// Uncomment the line below if the FTP server requires certificate
		if (privateKeyPath != null && privateKeyPath.length() > 0) {
			jsch.addIdentity(privateKeyPath);
		}
		session = jsch.getSession(USERNAME, REMOTE_HOST, REMOTE_PORT);
		session.setPassword(PASSWORD);
		session.setConfig("StrictHostKeyChecking", "no");
		session.connect();
		logger.info( "Connected Successfully ");

	}

	public void upload(String source, String destination, String fileName) throws JSchException,
			SftpException {
		
		logger.info( "File upload - SFTP source : "+source);
		logger.info( "File upload - SFTP destination :"+destination);
		logger.info( "File download - SFTP file :"+fileName);

		Channel channel = session.openChannel("sftp");
		channel.connect();
		ChannelSftp sftpChannel = (ChannelSftp) channel;
		sftpChannel.put(source+fileName, destination);
		sftpChannel.exit();
		logger.info( "File Uploaded Successfully In SFTP");
	}

	public void download(String source, String destination,String fileName)
			throws JSchException, SftpException {
		
		logger.info( "File download - SFTP source : "+source);
		logger.info( "File download - SFTP destination :"+destination);
		logger.info( "File download - SFTP file :"+fileName);

		Channel channel = session.openChannel("sftp");
		channel.connect();
		ChannelSftp sftpChannel = (ChannelSftp) channel;
		sftpChannel.get(source+fileName, destination);
		sftpChannel.exit();
		logger.info( "File Downloaded Successfully from SFTP");
	}
	
	public void move(String source, String destination,String fileName)
			throws JSchException, SftpException {

		logger.info( "File move - source : "+source);
		logger.info( "File move - destination :"+destination);
		logger.info( "File move - file :"+fileName);
		 File file = new File(source+fileName);
	        // renaming the file and moving it to a new location
	        if(file.renameTo
	           (new File(destination+fileName)))
	        {
	            // if file copied successfully then delete the original file
	            file.delete();
	        }
		logger.info( "File move Successfully ");
	}

	public void disconnect() {

		if (session != null) {
			session.disconnect();
		}

	}
}