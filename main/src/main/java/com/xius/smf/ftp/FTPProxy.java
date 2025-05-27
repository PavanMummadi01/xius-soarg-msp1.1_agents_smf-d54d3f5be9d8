package com.xius.smf.ftp;

import java.io.IOException;
import java.net.SocketException;
import java.util.List;


import org.apache.commons.io.FileUtils;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;

public class FTPProxy {

	private FTPClient ftpClient = null;

	private static String  ftpIp;
	private static String ftpUser;
	private static String ftpPwd;
	private static String smfAgentInstance;
	private static String ftpSourceFilesDirPath;
	private static String ftpBadFilesDirPath;
	private static String ftpSuccessFilesDirPath;
	private static String ftpProcessingFilesDirPath;
	private static String ftpAuditFilesDirPath;
	private static String ftpAuditFileName;
	private static String ftpBaseDir;
	private static long ftpUploadFileSize;
	private static String userIdSepChar;
	
	private static String localDirPath;
	
	private String downloadFile;

	private boolean isConnected;
	private boolean isDownLoaded;
	private boolean isUploaded;

	private long connectionTime;
	private long downloadingTime;
	private long uploadTime;
	
	 static final Logger logger = LogManager.getLogger("FTPProxy");

	public enum UploadType {

		BAD_FILES("BAD"),SUCCESS_FILES("SUCCESS");
		
		private String value = null;

		private UploadType(String value)
		{
			this.value  = value;
		}
		public String getValue()
		{
			return value;
		}
	}

	public String getUserIdSepChar() {
		return userIdSepChar;
	}
	public void setUserIdSepChar(String userIdSepChar) {
		FTPProxy.userIdSepChar = userIdSepChar;
	}
	public static String getSmfAgentInstance() {
		return smfAgentInstance;
	}
	public static void setSmfAgentInstance(String smfAgentInstance) {
		FTPProxy.smfAgentInstance = smfAgentInstance;
	}
	public static String getLocalDirPath() {
		return localDirPath;
	}
	public static void setLocalDirPath(String localDirPath) {
		FTPProxy.localDirPath = localDirPath;
	}
	public static String getFtpBadFilesDirPath() {
		return ftpBadFilesDirPath;
	}
	public static void setFtpBadFilesDirPath(String ftpBadFilesDirPath) {
		FTPProxy.ftpBadFilesDirPath = ftpBadFilesDirPath;
	}
	public static String getFtpSourceFilesDirPath() {
		return ftpSourceFilesDirPath;
	}
	public static void setFtpSourceFilesDirPath(String ftpSourceFilesDirPath) {
		FTPProxy.ftpSourceFilesDirPath = ftpSourceFilesDirPath;
	}
	public static String getFtpSuccessFilesDirPath() {
		return ftpSuccessFilesDirPath;
	}
	public static void setFtpSuccessFilesDirPath(String ftpSuccessFilesDirPath) {
		FTPProxy.ftpSuccessFilesDirPath = ftpSuccessFilesDirPath;
	}
	public static String getFtpProcessingFilesDirPath() {
		return ftpProcessingFilesDirPath;
	}
	public static void setFtpProcessingFilesDirPath(String ftpProcessingFilesDirPath) {
		FTPProxy.ftpProcessingFilesDirPath = ftpProcessingFilesDirPath;
	}
	public static String getFtpAuditFilesDirPath() {
		return ftpAuditFilesDirPath;
	}
	public static void setFtpAuditFilesDirPath(String ftpAuditFilesDirPath) {
		FTPProxy.ftpAuditFilesDirPath = ftpAuditFilesDirPath;
	}
	public static String getFtpAuditFileName() {
		return ftpAuditFileName;
	}
	public static void setFtpAuditFileName(String ftpAuditFileName) {
		FTPProxy.ftpAuditFileName = ftpAuditFileName;
	}
	public static String getFtpBaseDir() {
		return ftpBaseDir;
	}
	public static void setFtpBaseDir(String ftpBaseDir) {
		FTPProxy.ftpBaseDir = ftpBaseDir;
	}
	public static long getFtpUploadFileSize() {
		return ftpUploadFileSize;
	}
	public static void setFtpUploadFileSize(long ftpUploadFileSize) {
		FTPProxy.ftpUploadFileSize = ftpUploadFileSize;
	}

	static {

		loadAllFTPProperties();
	}

	/*private FTPProxy() {
		loadAllFTPProperties();
		getInstance();
	}*/
	
	private FTPProxy() {
		
	}
	private static FTPProxy ftpProxy = null;
	
	public static FTPProxy getInstance(){

		if( null == ftpProxy ) {
			ftpProxy = new FTPProxy();
			//loadAllFTPProperties();
		}
		
		return ftpProxy;
	}
	
	public FTPClient getFTPClientInstance(){

		if( null == ftpClient ) {
			ftpClient = new FTPClient();
		}

		return ftpClient;
	}

	public boolean disconnect() {

		if( logger.isDebugEnabled() ) {

			logger.debug("Disconnecting .... ");
		}
		if( null != ftpClient ) {

			try {

				ftpClient.disconnect();
				this.isConnected = false;

				logger.debug("####: FTPProxy disconnected");
			} catch (IOException e) {

				logger.error("IOException while disconnecting: "+Utilities.getStackTrace(e) );
				this.isConnected = true;
			}
		}

		return this.isConnected;
	}
	
	public boolean connect() {

		long startTime = System.currentTimeMillis();

		if( logger.isDebugEnabled() ) {

			logger.debug("Connecting to FTP.... ");
		}

		//ftpClient = getInstance();
		try {
			ftpClient = getFTPClientInstance();
			ftpClient.connect(ftpIp);
		} catch (SocketException e) {

			this.isConnected = false;
			logger.error("SocketException while connecting: "+Utilities.getStackTrace(e) );
		} catch (IOException e) {

			this.isConnected = false;
			logger.error("IOException while connecting: "+Utilities.getStackTrace(e) );
		}
		try {

			ftpClient.login(ftpUser,ftpPwd);
		} catch (IOException e) {

			this.isConnected = false;
			logger.error("IOException while login: "+Utilities.getStackTrace(e) );
		}
		int reply = ftpClient.getReplyCode();

		if( FTPReply.isPositiveCompletion(reply) ){

			logger.debug("FTP Connected successfully");
			try {
				ftpBaseDir = ftpClient.printWorkingDirectory();
				logger.debug("FTP BaseDir:" + ftpBaseDir);
				//FTPClientUtil.completeFTPCommand(ftpClient);
				this.isConnected = true;
			} catch (IOException e) {
				logger.error("IOException while getting working directory of FTP: "+Utilities.getStackTrace(e) );
			}
		} else {

			logger.error("<<<####>>> Connection Failed to the given FTP server: "+ftpIp);
			this.isConnected = false;
		}

		this.connectionTime = System.currentTimeMillis() - startTime;

		if( logger.isDebugEnabled() ) {

			logger.debug("*** Time taken to connect FTP (milli secons)"+ this.connectionTime );
		}

		return this.isConnected;
	}
	
	public boolean checkFTPDirectories(FTPClient ftpClient) {
		boolean allFTPDirsExists = false;
		
		if(FTPClientUtil.isDirectoryExists(ftpClient, ftpBaseDir + "/" + ftpSourceFilesDirPath) && 
				FTPClientUtil.isDirectoryExists(ftpClient, ftpBaseDir + "/" + ftpProcessingFilesDirPath) &&
				FTPClientUtil.isDirectoryExists(ftpClient, ftpBaseDir + "/" + ftpSuccessFilesDirPath) &&
				FTPClientUtil.isDirectoryExists(ftpClient, ftpBaseDir + "/" + ftpBadFilesDirPath) &&
				FTPClientUtil.isDirectoryExists(ftpClient, ftpBaseDir + "/" + ftpAuditFilesDirPath)) {
			
			logger.debug("All predefined(configured) FTP directories exists.... ");
			allFTPDirsExists = true;
		}
		
		return allFTPDirsExists;
	}
	
	public boolean checkLocalDirectories() {
		boolean allLocalDirsExists = false;
		
		if(com.xius.smf.utils.FileUtils.isDirExists(localDirPath)) {
			logger.debug("All predefined(configured) Local directories exists.... ");
			allLocalDirsExists = true;
		}
		
		return allLocalDirsExists;
	}
	
	public boolean deleteLocalFile(String fileName) {
		boolean isDeleted = false;
		
		String localFilepath = localDirPath + "/" + fileName;
		
		if(com.xius.smf.utils.FileUtils.deleteFile(localFilepath)) {
			logger.debug("Deletion successful for file: " + localFilepath);
			isDeleted = true;
		} else {
			logger.debug("Deletion falied for file: " + localFilepath);
		}
		
		return isDeleted;
	}
	
	public String getUserIdFromFileName(String ftpFileName) {
		String userId = null;

		int lastIndex = ftpFileName.lastIndexOf(userIdSepChar);
		if(lastIndex > 0) {
			userId = ftpFileName.substring(0, lastIndex);
		}
		return userId;
	}

	public boolean upload(UploadType uploadType, String fileName, List<String> lines){

		boolean isUploaded = false;
		long startTime = System.currentTimeMillis();
		if( logger.isDebugEnabled() ) {

			logger.debug("Uploading to FTP");
		}

		//logger.log(BCGLevel.DEBUG,"#### FTPProxy-ftpClient: "+ ftpClient );
		logger.debug("FTP BaseDir in upload:" + ftpBaseDir);
		/*try {
			logger.log(BCGLevel.DEBUG,"FTP BaseDir1:" + ftpClient.printWorkingDirectory());
		} catch (IOException e) {
			logger.log(BCGLevel.DEBUG,"Not able to print current dir :" + Utilities.getStackTrace(e) );
		}*/
		if(UploadType.BAD_FILES.equals( uploadType ) ) {
			isUploaded = FTPClientUtil.writeToFTPFile(ftpClient, fileName, ftpBaseDir + "/" + ftpBadFilesDirPath, lines, true);
		} else if(UploadType.SUCCESS_FILES.equals( uploadType ) ) {
			isUploaded = FTPClientUtil.writeToFTPFile(ftpClient, fileName, ftpBaseDir + "/" + ftpSuccessFilesDirPath, lines, true);
		}
		
		this.uploadTime = System.currentTimeMillis() - startTime;
		
		if( logger.isDebugEnabled() ) {

			logger.debug("#### Time taken to upload to FTP (milli secons) : "+ this.uploadTime );
		}

		return isUploaded;
	}
	
	public boolean upload(UploadType uploadType, String fileName) {

		boolean isUploaded = false;
		long startTime = System.currentTimeMillis();
		if( logger.isDebugEnabled() ) {

			logger.debug("Uploading to FTP");
		}

		if(UploadType.BAD_FILES.equals( uploadType ) ) {
			String badFilePath = localDirPath + "/" + "badfiles/" + fileName;
			isUploaded = FTPClientUtil.uploadFileToFTPPath(ftpClient, badFilePath, ftpBaseDir + "/" + ftpBadFilesDirPath + "/" + fileName);
		} else if(UploadType.SUCCESS_FILES.equals( uploadType ) ) {
			String successFilePath = localDirPath + "/" + "successfiles/" + fileName;
			isUploaded = FTPClientUtil.uploadFileToFTPPath(ftpClient, successFilePath, ftpBaseDir + "/" + ftpSuccessFilesDirPath + "/" + fileName);
		}
		
		this.uploadTime = System.currentTimeMillis() - startTime;
		
		if( logger.isDebugEnabled() ) {

			logger.debug("#### Time taken to upload to FTP (milli secons) : "+ this.uploadTime );
		}

		return isUploaded;
	}

	public boolean download() {

		boolean isDownloaded = false;
		long startTime = System.currentTimeMillis();

		if( logger.isDebugEnabled() ) {

			logger.debug("Downloading from ftp.....");
		}

		String ftpSourceDir = ftpBaseDir + "/" + ftpSourceFilesDirPath;
		String ftpProcessingDir = ftpBaseDir + "/" + ftpProcessingFilesDirPath;
		String ftpBadDir = ftpBaseDir + "/" + ftpBadFilesDirPath;
		String ftpAuditFilePath = ftpBaseDir + "/" + ftpAuditFilesDirPath + "/" + ftpAuditFileName;
		
		
		
		String firstFile = moveFirstFTPFile(ftpClient, ftpSourceDir, ftpProcessingDir, ftpBadDir, ftpAuditFilePath, ftpUploadFileSize);
		if( Utilities.isNotEmpty( firstFile )) {
			
			if( FTPClientUtil.downloadFromFTP(ftpClient, ftpProcessingDir, localDirPath, firstFile) ) {

				// TODO: if any thing you need
				isDownloaded = true;
				downloadFile =firstFile;
			}  
		} else {
			logger.debug( "NO FILEs FOUND IN THE DIRECTORY:" + ftpSourceDir);
		}

		this.downloadingTime = System.currentTimeMillis() - startTime;

		if( logger.isDebugEnabled() ) {

			logger.debug("#### Time taken to download files from FTP (milli secons) : "+ this.downloadingTime );
		}
		return isDownloaded;
	}

	/*public boolean download() {

		long startTime = System.currentTimeMillis();

		if( logger.isDebugEnabled() ) {

			logger.log(BCGLevel.DEBUG,"Downloading from ftp.....");
		}

		FileOutputStream fop = null;
		File file = null;

		String fileName = InitiateAll.getSMFProps().getProperty( "ftp.readFileName");
		String filePath = InitiateAll.getSMFProps().getProperty( "ftp.file.path");
		String localfilePath = InitiateAll.getSMFProps().getProperty( "ftp.file.local.path");
		try{


			ftpClient.cwd(filePath);

			FTPFile[] ftpFiles = ftpClient.listFiles();


			if( null != ftpFiles && ftpFiles.length > 0 ) {

				downloadList = new ArrayList<String>( ftpFiles.length );
				String ftpFileName = null;

				for(FTPFile ftpFile: ftpFiles) {


					if( null != ftpFile ) {

						ftpFileName = ftpFile.getName() ;

						logger.log(BCGLevel.ERROR,"ftpFileName: "+ftpFileName );

						file = new File(localfilePath+"/"+ftpFileName);
						fop = new FileOutputStream(file);

						ftpClient.retrieveFile(ftpFileName, fop);
						if(fop!=null) {

							fop.close();
							fop = null;
						}

						downloadList.add( ftpFileName );
					}
				}
			}


			downloadList.add(fileName);

			if(!ftpClient.getStatus(filePath).contains(fileName)){

				logger.log(BCGLevel.ERROR,"<<<####>>> File not available at the given path:"+filePath+"/"+fileName);
				//throw new Exception("File not available at the given path:"+filePath+"/"+fileName);
			}



			InputStream stO = new BufferedInputStream(ftpClient.retrieveFileStream(filePath+"/"+fileName), ftpClient.getBufferSize());

			file = new File(localfilePath+"/"+fileName);
			fop = new FileOutputStream(file);

			org.apache.commons.net.io.Util.copyStream(
					stO,
					fop,
					ftpClient.getBufferSize(),
					org.apache.commons.net.io.CopyStreamEvent.UNKNOWN_STREAM_SIZE,
					new org.apache.commons.net.io.CopyStreamAdapter() {
						public void bytesTransferred(long totalBytesTransferred,
								int bytesTransferred,
								long streamSize) {
						}
					});
			ftpClient.completePendingCommand();

			if(fop!=null) {
				fop.close();
			}
			if(ftpClient!=null) {

				ftpClient.disconnect();
			}
			this.isDownLoaded = true;
		}catch(Exception e){

			logger.log(BCGLevel.ERROR,"Exception: "+Utilities.getStackTrace(e) );
		}finally{
		}

		if( logger.isDebugEnabled() ) {

			if(this.isDownLoaded &&  ( null != downloadList && downloadList.size() > 0 ) ) {

				logger.log(BCGLevel.DEBUG,"Downloading completed successfully");
			}
		}

		this.downloadingTime = System.currentTimeMillis() - startTime;

		if( logger.isDebugEnabled() ) {

			logger.log(BCGLevel.DEBUG,"#### Time taken to download files from FTP (milli secons) : "+ this.downloadingTime );
		}
		return this.isDownLoaded;
	}*/


	public static void loadAllFTPProperties() {

		try {

			String networkId=InitiateAll.getSMFProps().getProperty( "NetworkId");
			String networkName=InitiateAll.getSMFProps().getProperty( "NetworkName");
			String xBusURL=InitiateAll.getSMFProps().getProperty( "ftp.xbus.url");
			smfAgentInstance=InitiateAll.getSMFProps().getProperty( "smf.agent.instance");
			
			ftpIp=InitiateAll.getSMFProps().getProperty( "ftp.ip");
			ftpUser=InitiateAll.getSMFProps().getProperty( "ftp.user");
			ftpPwd=InitiateAll.getSMFProps().getProperty( "ftp.password");
			localDirPath = InitiateAll.getSMFProps().getProperty( "ftp.file.local.path");
			
			ftpSourceFilesDirPath = InitiateAll.getSMFProps().getProperty( "ftp.source.files.dir");
			ftpProcessingFilesDirPath  = InitiateAll.getSMFProps().getProperty( "ftp.processing.files.dir");
			ftpBadFilesDirPath = InitiateAll.getSMFProps().getProperty( "ftp.bad.files.dir");
			ftpSuccessFilesDirPath  = InitiateAll.getSMFProps().getProperty( "ftp.success.files.dir");
			ftpAuditFilesDirPath  = InitiateAll.getSMFProps().getProperty( "ftp.audit.log.files.dir");
			String strFtpUploadFileSize  = InitiateAll.getSMFProps().getProperty( "ftp.file.upload.maxsize");
			userIdSepChar = InitiateAll.getSMFProps().getProperty( "userid.seperation.char");
			
			logger.error( "------- FTP Properties ---------");
			
			logger.error( "smfAgentInstance:" + smfAgentInstance);
			logger.error( "ftpIp:" + ftpIp);
			logger.error( "ftpUser:" + ftpUser);
			logger.error( "ftpPwd:" + ftpPwd);
			logger.error( "localDirPath:" + localDirPath);
			logger.error( "ftpSourceFilesDirPath:" + ftpSourceFilesDirPath);
			logger.error( "ftpProcessingFilesDirPath:" + ftpProcessingFilesDirPath);
			logger.error( "ftpBadFilesDirPath:" + ftpBadFilesDirPath);
			logger.error("ftpSuccessFilesDirPath:" + ftpSuccessFilesDirPath);
			logger.error( "ftpAuditFilesDirPath:" + ftpAuditFilesDirPath);
			logger.error( "ftpUploadFileSize:" + strFtpUploadFileSize);
			logger.error("userIdSepChar:" + userIdSepChar);
			
			logger.error( "------- End of FTP Properties ---------");
			
			if(Utilities.isEmpty( smfAgentInstance )||
					Utilities.isEmpty( ftpIp )||
					Utilities.isEmpty( ftpUser )||
					Utilities.isEmpty( ftpPwd ) ||
					Utilities.isEmpty( localDirPath ) ||
					Utilities.isEmpty( ftpSourceFilesDirPath ) ||
					Utilities.isEmpty( ftpBadFilesDirPath ) ||
					Utilities.isEmpty( ftpSuccessFilesDirPath ) ||
					Utilities.isEmpty( ftpProcessingFilesDirPath ) ||
					Utilities.isEmpty( ftpAuditFilesDirPath ) ||
					Utilities.isEmpty( strFtpUploadFileSize ) ||
					Utilities.isEmpty( userIdSepChar ) ||
					Utilities.isEmpty( networkId )||
					Utilities.isEmpty( networkName ) ||
					Utilities.isEmpty( xBusURL )
				) {

				logger.error( "MISSING FTP PROPERTIES");
				logger.error( "SERVER IS STOPING");

				System.exit(0);
			}
			
			try {
				ftpUploadFileSize = Long.parseLong(strFtpUploadFileSize);
			} catch (Exception e) {
				logger.error( "FtpUploadFileSize parsing exception "+ Utilities.getStackTrace(e));
				System.exit(0);
			}
			try {
				Long.parseLong(networkId);
			} catch (Exception e) {
				logger.error( "networkId parsing exception "+ Utilities.getStackTrace(e));
				System.exit(0);
			}
			
			ftpAuditFileName = SMFAgentConstants.FTP_AUDIT_FILE_NAME + "#" + smfAgentInstance + ".txt";
			
			logger.error("ftpAuditFilePath:" + ftpAuditFileName);
			
		} catch (Exception e) {

			logger.error( "Exception in loading FTP properties"+ Utilities.getStackTrace(e));
			System.exit(0);
		}
	}
	
	public static String moveFirstFTPFile(FTPClient client, String srcDir, String ftpProcessingDir, String ftpbadDir, String ftpAuditFilePath, long maxFileSize) {

		String movedFTPFile = null;

		if(!FTPClientUtil.isDirectoryExists(client, srcDir)) {
			logger.debug("DIRECTORY not exits to moved files from :" + srcDir);
		} else {
			FTPFile[] ftpFilesArr = null;
			if(FTPClientUtil.changeWorkingDirectory(client, srcDir)) {
				logger.debug( "Success in changing directory to:" + srcDir);

				try {
					ftpFilesArr = client.listFiles();
					//completeFTPCommand(client);
					if(ftpFilesArr != null && ftpFilesArr.length >0){
						for (FTPFile ftpFile : ftpFilesArr) {
							//
							// Check if FTPFile is a regular file
							//
							if (ftpFile.getType() == FTPFile.FILE_TYPE) {
								String fileName = ftpFile.getName();
								logger.debug( "FTPFile: " + ftpFile.getName() +
										"; " + FileUtils.byteCountToDisplaySize(
												ftpFile.getSize()));

								if(ftpFile.getSize() != 0 && ftpFile.getSize() <= maxFileSize) {
									if(FTPClientUtil.moveFTPFile(client, fileName, srcDir, ftpProcessingDir)) {
										logger.debug("File " + fileName + " moved to " + ftpProcessingDir);
										movedFTPFile = fileName;
									} else {
										logger.debug("File " + fileName + " not moved to " + ftpProcessingDir);
									}
									break;
								} else {
									logger.debug("Since file " + fileName + " size is ZERO or greater than configured maxUploadFileSize("+ maxFileSize +"), so moving to badFiles folder: " + ftpbadDir);
									
									/*
									 * Write into to AuditFiles folder with this content
									 * "FileName - File size is invalid (Either ZERO or Greater than configured maxUploadFileSize(maxFileSize))"
									 */
									String logContent = SMFAgentConstants.FAILURE + " - " + "File size is ZERO or greater than configured maxUploadFileSize("+ maxFileSize +")";
									//String logContent = SMFAgentConstants.FAILURE + " - ";
									logger.debug("Logging to audit file " + ftpAuditFilePath + " with content: " + logContent);
									/*if(FTPClientUtil.writeToFTPFile(client, ftpAuditFilePath, logContent, true)) {
										logger.log(BCGLevel.DEBUG,"Successfully updated to Audit File:" + ftpAuditFilePath);
									} else {
										logger.log(BCGLevel.DEBUG,"Failed to update Audit File:" + ftpAuditFilePath);
									}*/
									ftpProxy.logToAuditFile(ftpProxy.getFTPClientInstance(), fileName, logContent);
									if(FTPClientUtil.moveFTPFile(client, fileName, srcDir, ftpbadDir)) {
										logger.debug("File " + fileName + " moved to " + ftpbadDir);
									} else {
										logger.debug("File " + fileName + " not moved to " + ftpbadDir);
									}
								}
							}
						}
					}
				} catch (IOException e) {
					logger.error( "IOException while getting FTP client files: " + Utilities.getStackTrace(e));
					//completeFTPCommand(client);
				}
			} else {
				logger.debug( "Failed in changing directory to:" + srcDir);
			}

		}
		/*if( isMoved ) {
			try {
				client.changeToParentDirectory();
			} catch (IOException e) {
				logger.log(BCGLevel.ERROR,"IOException : " + Utilities.getStackTrace( e ));
			}
		}*/
		return movedFTPFile;
	}
	
	
	public void moveToSuccessFilesAndLog(FTPClient client, String fileName, String logContent) {
		
		String ftpProcessingDir = ftpBaseDir + "/" + ftpProcessingFilesDirPath;
		
		logToAuditFile(client, fileName, logContent);
		moveToSuccessFiles(client, fileName, logContent, ftpProcessingDir);
	}
	
	public void moveToSuccessFilesAndLog(FTPClient client, String fileName, String logContent, String srcDir) {
		
		if(Utilities.isNotEmpty(srcDir)) {
			moveToSuccessFiles(client, fileName, logContent, srcDir);
			logToAuditFile(client, fileName, logContent);
		} else {
			logger.debug("Moving failed since, source directory should not be EMPTY/NULL");
		}
		
	}
	
	public void moveToBadFilesAndLog(FTPClient client, String fileName, String logContent) {
		
		String ftpProcessingDir = ftpBaseDir + "/" + ftpProcessingFilesDirPath;
		
		logToAuditFile(client, fileName, logContent);
		moveToBadFiles(client, fileName, logContent, ftpProcessingDir);
	}
	
	public void moveToBadFilesAndLog(FTPClient client, String fileName, String logContent, String srcDir) {
		
		if(Utilities.isNotEmpty(srcDir)) {
			logToAuditFile(client, fileName, logContent);
			moveToBadFiles(client, fileName, logContent, srcDir);
		} else {
			logger.debug("Moving failed since, source directory should not be EMPTY/NULL");
		}
	}
	
	public boolean logToAuditFile(FTPClient client, String fileName, String logContent) {
		
		boolean isLogged = false;
		
		String ftpAuditFilePath = ftpBaseDir + "/" + ftpAuditFilesDirPath + "/" + ftpAuditFileName;
		
		/*
		 * Write into to AuditFiles folder with logContent
		 */
		String stringToAppend = fileName + " - " + logContent;
		logger.debug("Logging to audit file " + ftpAuditFilePath + " with content: " + stringToAppend);
		if(FTPClientUtil.writeToFTPFile(client, ftpAuditFilePath, stringToAppend, true)) {
			logger.debug("Successfully updated to Audit File:" + ftpAuditFilePath);
			isLogged = true;
		} else {
			logger.debug("Failed to update Audit File:" + ftpAuditFilePath);
		}
		
		return isLogged;
	}
	
	public static boolean moveToBadFiles(FTPClient client, String fileName, String logContent, String srcDir) {
		
		boolean isMoved = false;
		
		String ftpBadDir = ftpBaseDir + "/" + ftpBadFilesDirPath;
		
		logger.debug("File " + fileName + " is moving to badFiles folder: " + ftpBadDir + " Since, " + logContent);
		if(FTPClientUtil.moveFTPFile(client, fileName, srcDir, ftpBadDir)) {
			logger.debug("File " + fileName + " moved to " + ftpBadDir);
			isMoved = true;
		} else {
			logger.debug("File " + fileName + " not moved to " + ftpBadDir);
		}
		
		return isMoved;
	}
	
	public static boolean moveToSuccessFiles(FTPClient client, String fileName, String logContent, String srcDir) {
		
		boolean isMoved = false;
		
		String ftpSuccessDir = ftpBaseDir + "/" + ftpSuccessFilesDirPath;
		
		logger.debug("File " + fileName + " is moving to Success folder: " + ftpSuccessDir + " Since, " + logContent);
		if(FTPClientUtil.moveFTPFile(client, fileName, srcDir, ftpSuccessDir)) {
			logger.debug("File " + fileName + " moved to " + ftpSuccessDir);
			isMoved = true;
		} else {
			logger.debug("File " + fileName + " not moved to " + ftpSuccessDir);
		}
		
		return isMoved;
	}
	
	public boolean deleteFTPFile(FTPClient client, String ftpFileCompletePath) {
		boolean isDeleted = false;
		logger.debug("FTP Deletining a file:" + ftpFileCompletePath);
		try {
			isDeleted = client.deleteFile(ftpFileCompletePath);
		} catch (IOException e) {
			logger.error("IOException while deleting a FTP file: " + Utilities.getStackTrace( e ));
		}

		return isDeleted;
	}

	public boolean deleteFTPFile(FTPClient client, String ftpFileName, String ftpFileDirPath) {
		return deleteFTPFile(client, ftpFileDirPath + "/" + ftpFileName);
	}
	
	public boolean deleteFTPFileFromProcessing(FTPClient client, String ftpFileName) {
		
		String ftpProcessingDir = ftpBaseDir + "/" + ftpProcessingFilesDirPath;
		
		return deleteFTPFile(client, ftpProcessingDir + "/" + ftpFileName);
	}

	public String getDownloadFile() {
		return downloadFile;
	}
	public void setDownloadFile(String downloadFile) {
		this.downloadFile = downloadFile;
	}

	public boolean isConnected() {
		return isConnected;
	}
	public void setConnected(boolean isConnected) {
		this.isConnected = isConnected;
	}

	public boolean isDownLoaded() {
		return isDownLoaded;
	}
	public void setDownLoaded(boolean isDownLoaded) {
		this.isDownLoaded = isDownLoaded;
	}

	public boolean isUploaded() {
		return isUploaded;
	}
	public void setUploaded(boolean isUploaded) {
		this.isUploaded = isUploaded;
	}

	public long getConnectionTime() {
		return connectionTime;
	}
	public void setConnectionTime(long connectionTime) {
		this.connectionTime = connectionTime;
	}
	public long getDownloadingTime() {
		return downloadingTime;
	}
	public void setDownloadingTime(long downloadingTime) {
		this.downloadingTime = downloadingTime;
	}
	public long getUploadTime() {
		return uploadTime;
	}
	public void setUploadTime(long uploadTime) {
		this.uploadTime = uploadTime;
	}
}
