package com.xius.smf.ftp;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.List;


import org.apache.commons.io.FileUtils;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPConnectionClosedException;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.io.CopyStreamException;
import org.apache.commons.net.io.SocketOutputStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.exceptions.ErrorDetailsTypeException;
import com.xius.smf.utils.Utilities;

public class FTPClientUtil {
    private static final Logger logger = LogManager.getLogger("FTPClientUtil");

	//private FTPClient client = null;

	/*public static FTPClient getFTPClient(String serverIp, String userName, String password) throws SocketException, IOException {
		FTPClient client = new FTPClient();
		int reply;

		client.connect(serverIp);
		client.login(userName, password);

		logger.log(BCGLevel.INFO, "Connected to " + serverIp + ".");

		reply = client.getReplyCode();
		logger.log(BCGLevel.INFO, "ReplyCode: " + reply + " ReplyString: " + client.getReplyString());

		if(!FTPReply.isPositiveCompletion(reply)) {
			client.disconnect();
			logger.log(BCGLevel.INFO, "FTP server refused connection." + client.getReplyString());
			client = null;
		}

		return client;
	}*/

	public static boolean isDirectoryExists(FTPClient client, String dirName) {
		boolean isDirExists = false;
		if(Utilities.isNotEmpty(dirName)) {
			try {
				if(client.changeWorkingDirectory(dirName)) {
					isDirExists =  true;
				} else {
					isDirExists = false;
				}
			} catch (IOException e) {
				logger.error( "IOException while changeWorkingDirectory: " + Utilities.getStackTrace(e));
			}
			//completeFTPCommand(client);
		}
		return isDirExists;
	}

	/*public static boolean createDTPDir(FTPClient client, String ftpDirName, String ftpDirPath) {
		if(Utilities.isNotEmpty(ftpDirPath)) {
			if(!isDirectoryExists(client, ftpDirPath)) {
				client.makeDirectory(ftpDirPath);
			}
			client.changeWorkingDirectory(ftpDirPath);
			client.makeDirectory(ftpDirName);
			client.changeToParentDirectory();
		} else {
			client.makeDirectory(ftpDirName);
		}
	}*/

	public static boolean createFTPDir(FTPClient client, String ftpDirName, String ftpDirPath) {
		if(Utilities.isNotEmpty(ftpDirPath) && Utilities.isNotEmpty(ftpDirName)) {
			ftpDirName = ftpDirPath+ "/" + ftpDirName;
		}
		if(Utilities.isNotEmpty(ftpDirName)) {
			try {
				if(!isDirectoryExists(client, ftpDirName)) {
					if(client.makeDirectory(ftpDirName)) {
						logger.info( "FTP directory created:" + ftpDirName);
					} else {
						logger.info( "Unable to create directory:" + ftpDirName);
						return false;
					}
				}
			} catch (Exception e) {
				logger.error( "Exception create directory: " + Utilities.getStackTrace(e));
				return false;
			}
			return true;
		} else {
			return false;
		}

	}

	public static boolean moveFTPFile1(FTPClient client, String ftpFileName, String ftpDirName){
		boolean isFTPFileMoved = false;
		if(!isDirectoryExists(client, ftpDirName)) {
			try {
				if(client.makeDirectory(ftpDirName)) {
					logger.info( "FTP directory created:" + ftpDirName);
				} else {
					logger.info( "Unable to create directory:" + ftpDirName);
				}
			} catch (IOException e) {
				logger.error( "Exception create directory: " + Utilities.getStackTrace(e));
			}

		}
		try {
			isFTPFileMoved = client.rename(ftpFileName, ftpDirName + "/" + ftpFileName);
		} catch (IOException e) {
			logger.error( "IOException while moving a file: " + Utilities.getStackTrace(e));
		}

		return isFTPFileMoved;
	}

	public static void completeFTPCommand(FTPClient client){
		try {
			if(client.completePendingCommand()) {
				logger.info( "completePendingCommand success");
			} else {
				logger.info( "completePendingCommand failure");
			}
		} catch (FTPConnectionClosedException ftpClosedE) {
			logger.error( "FTPConnectionClosedException: While completePendingCommand: " + Utilities.getStackTrace(ftpClosedE));
		} catch (IOException e) {
			logger.error( "IOException: While completePendingCommand: " + Utilities.getStackTrace(e));
		}
	}
	public static boolean moveFTPFile(FTPClient client, String ftpFileName, String ftpSrcDirName, String ftpDestDir) {
		boolean isFTPFileMoved = false;
		/*if(!isDirectoryExists(client, ftpDirName)) {
			client.makeDirectory(ftpDirName);
		} */
		//return client.rename(currentDir + "/" + ftpSrcDirName+"/"+ftpFileName, currentDir + "/" + ftpDestDir + "/" + ftpFileName);
		logger.info( "ftpFileName:" + ftpFileName + " ftpSrcDirName:" + ftpSrcDirName+ " ftpDestDir:" +ftpDestDir);
		try {
			isFTPFileMoved = client.rename(ftpSrcDirName+"/"+ftpFileName, ftpDestDir + "/" + ftpFileName);
		} catch (IOException e) {
			logger.error( "IOException: File not uploaded: " + Utilities.getStackTrace(e));
		}
		//completeFTPCommand(client);

		return isFTPFileMoved;
	}

	public static boolean uploadFileToFTPPath(FTPClient client, FileInputStream fis, String destFileCompletePath) {
		boolean returnValue = false;

		if(fis != null) {
			if(destFileCompletePath != null) {
				try {
					returnValue = client.storeFile(destFileCompletePath, fis);
				} catch (IOException e) {
					logger.error( "IOException: File not uploaded: " + Utilities.getStackTrace(e));
				}
				completeFTPCommand(client);
			}
		}

		return returnValue;
	}

	public static boolean uploadFileToFTPPath(FTPClient client, String sourceFilePath, String destFileCompletePath) {
		boolean isUploaded = false;

		FileInputStream fis;
		try {
			fis = new FileInputStream( sourceFilePath );
			isUploaded = uploadFileToFTPPath(client, fis, destFileCompletePath);
		} catch (FileNotFoundException e) {
			logger.error( "FileNotFoundException: " + Utilities.getStackTrace(e));
		}
		return isUploaded;
	}

	public static boolean uploadFTPFile(FTPClient client, String sourceFilePath, String destFileName, String ftpDirPath){

		boolean isUploaded = false;

		FileInputStream fis;
		try {
			fis = new FileInputStream( sourceFilePath );
			isUploaded = uploadFTPFile(client, fis, destFileName, ftpDirPath);
		} catch (FileNotFoundException e) {
			logger.error( "FileNotFoundException: " + Utilities.getStackTrace(e));
		}
		return isUploaded;
	}

	public static boolean uploadFTPFile(FTPClient client, FileInputStream fis, String destFileName, String ftpDirpathName) {
		boolean returnValue = false;

		if(fis != null) {
			if(ftpDirpathName != null) {
				try {
					if(!client.changeWorkingDirectory(ftpDirpathName)) {
						logger.info( "direcotry exists");
						try {
							returnValue = client.storeFile(destFileName, fis);
							completeFTPCommand(client);
						} catch (IOException e) {
							logger.error( "IOException: File not uploaded: " + Utilities.getStackTrace(e));
						}		
					} else {
						logger.info( "direcotry does not exists");
					}
					//completeFTPCommand(client);
				} catch (IOException e) {
					logger.error( "IOException: changeWorkingDirectory failed: " + Utilities.getStackTrace(e));
				}
			}
		}

		return returnValue;
	}

	public static BufferedReader getFTPFileBufferedReader (FTPClient client, String ftpFileName){
		return getFTPFileBufferedReader(client, ftpFileName, null);
	}

	public static BufferedReader getFTPFileBufferedReader (FTPClient client, String ftpFileName, String fileEncoding) {
		BufferedReader bufferedReader = null;
		InputStreamReader inputStreamReader = getFTPFileInputStream(client, ftpFileName, fileEncoding);
		if(inputStreamReader != null) {
			bufferedReader = new BufferedReader(inputStreamReader);
		}

		return bufferedReader;
	}

	public static InputStreamReader getFTPFileInputStream (FTPClient client, String ftpFileName) {

		return getFTPFileInputStream(client, ftpFileName, null);
	}

	public static InputStreamReader getFTPFileInputStream (FTPClient client, String ftpFileName, String fileEncoding) {

		InputStreamReader inputStreamReader = null;
		InputStream inputStream = null;
		try {
			inputStream = client.retrieveFileStream(ftpFileName);
		} catch (IOException e) {
			logger.error( "IOException: while retrieveFileStream: " + Utilities.getStackTrace(e));
		}
		if(inputStream != null) {
			if(fileEncoding != null) {
				try {
					inputStreamReader = new InputStreamReader(inputStream, fileEncoding);
				} catch (UnsupportedEncodingException e) {
					logger.error( "UnsupportedEncodingException: " + Utilities.getStackTrace(e));
				}
			} else {
				inputStreamReader = new InputStreamReader(inputStream);
			}
		}
		return inputStreamReader;
	}

	/*public static void appendFTPFile (FTPClient client, String ftpFileName, String ftpDirName, FileInputStream fis, boolean appendInNewLine) throws IOException {
		byte[] buffer = new byte[1024];
		int len;
		logger.log(BCGLevel.INFO, "start");
		if(fis != null) {
			if(ftpDirName != null) {
				if(!isDirectoryExists(client, ftpDirName)) {
					client.makeDirectory(ftpDirName);
					client.changeWorkingDirectory(ftpDirName);
				}
			}
			OutputStream socketOutStream = client.appendFileStream(ftpFileName);

			while ((len = fis.read(buffer)) != -1){
				if(appendInNewLine) {
					socketOutStream.write("\n".getBytes());
					appendInNewLine = false;
				}
				socketOutStream.write(buffer, 0, len);
				socketOutStream.flush();
			}
			socketOutStream.close();
			if(client.completePendingCommand()) {
				logger.log(BCGLevel.INFO, "InputStream Transfer Completed");
			} else {
				logger.log(BCGLevel.INFO, "InputStream Not Transfer Completed");
			}
			if(ftpDirName != null) {
				client.changeToParentDirectory();
			}
		}
	}

	public static void appendFTPFile(FTPClient client, String ftpFileName, String ftpDirName, String stringToAppend, boolean appendInNewLine) throws IOException {

		if(stringToAppend != null) {
			if(ftpDirName != null) {
				if(!isDirectoryExists(client, ftpDirName)) {
					client.makeDirectory(ftpDirName);
				}
				client.changeWorkingDirectory(ftpDirName);
			}

			SocketOutputStream socketOutStream = (SocketOutputStream) client.appendFileStream(ftpFileName);
			if(appendInNewLine) {
				socketOutStream.write("\n".getBytes());
			}
			socketOutStream.write(stringToAppend.getBytes());
			socketOutStream.flush();
			socketOutStream.close();
			if(client.completePendingCommand()) {
				logger.log(BCGLevel.INFO, "String Transfer Completed");
			} else {
				logger.log(BCGLevel.INFO, "String Not Transfer Completed");
			}
			if(ftpDirName != null) {
				client.changeToParentDirectory();
			}
		}
	}*/
	public static boolean changeWorkingDirectory(FTPClient client, String dirName) {
		boolean isDirChanged = false;

		try {
			isDirChanged = client.changeWorkingDirectory(dirName);
		} catch (IOException e) {
			logger.error( "IOException while changing FTP directory: " + Utilities.getStackTrace(e));
		}
		//completeFTPCommand(client);
		return isDirChanged;
	}
	public static boolean moveFirstFTPFileTemp(FTPClient client, String srcDir, String destDir) {

		boolean isMoved = false;

		if(!isDirectoryExists(client, srcDir)) {
			logger.info( "DIRECTORY not exits to moved files from :" + srcDir);
		} else {
			FTPFile[] ftpFilesArr = null;
			if(changeWorkingDirectory(client, srcDir)) {
				logger.info( "Success in changing directory to:" + srcDir);
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

								logger.info( "FTPFile: " + ftpFile.getName() +
										"; " + FileUtils.byteCountToDisplaySize(
												ftpFile.getSize()));

								if(moveFTPFile1(client, fileName, destDir)) {
									logger.info("File " + fileName + " Moved to " + destDir);
									isMoved = true;

								} else {
									logger.info("File " + fileName + " not Moved to " + destDir);
								}
								break;
							}
						}
					}
				} catch (IOException e) {
					logger.error( "IOException while getting FTP client files: " + Utilities.getStackTrace(e));
					//completeFTPCommand(client);
				}


			} else {
				logger.info( "Failed in changing directory to:" + srcDir);
			}
		}

		return isMoved;
	}

	public static String moveFirstFTPFile11(FTPClient client, String srcDir, String ftpProcessingDir, String ftpbadDir, String ftpAuditFilePath, long maxFileSize) {

		String movedFTPFile = null;

		if(!isDirectoryExists(client, srcDir)) {
			logger.info( "DIRECTORY not exits to moved files from :" + srcDir);
		} else {
			FTPFile[] ftpFilesArr = null;
			if(changeWorkingDirectory(client, srcDir)) {
				logger.info( "Success in changing directory to:" + srcDir);

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
								logger.info( "FTPFile: " + ftpFile.getName() +
										"; " + FileUtils.byteCountToDisplaySize(
												ftpFile.getSize()));

								if(ftpFile.getSize() != 0 && ftpFile.getSize() <= maxFileSize) {
									if(moveFTPFile(client, fileName, srcDir, ftpProcessingDir)) {
										logger.info("File " + fileName + " moved to " + ftpProcessingDir);
										movedFTPFile = fileName;
									} else {
										logger.info("File " + fileName + " not moved to " + ftpProcessingDir);
									}
									break;
								} else {
									logger.info("Since file " + fileName + " size is ZERO or greater than configured maxUploadFileSize("+ maxFileSize +"), so moving to badFiles folder: " + ftpbadDir);
									if(moveFTPFile(client, fileName, srcDir, ftpbadDir)) {
										logger.info("File " + fileName + " moved to " + ftpbadDir);
										/*
										 * TODO: Write into to AuditFiles folder with this content
										 * "FileName - File size is invalid (Either ZERO or Greater than configured maxUploadFileSize(maxFileSize))"
										 */
										//ftpAuditFilePath
										String stringToAppend = fileName + " - " + "has file size ZERO or greater than configured maxUploadFileSize("+ maxFileSize +")";
										if(writeToFTPFile(client, ftpAuditFilePath, stringToAppend, true)) {
											logger.info("Successfully updated to Audit File:" + ftpAuditFilePath);
										} else {
											logger.info("Failed to update Audit File:" + ftpAuditFilePath);
										}
									} else {
										logger.info("File " + fileName + " not moved to " + ftpbadDir);
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
				logger.info( "Failed in changing directory to:" + srcDir);
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

	public static boolean downloadFromFTP(FTPClient client, String srcFTPDir, String destClientDir, String ftpFileName) {

		boolean isDownloaded = false;

		logger.debug("Downloading FTP file " + ftpFileName + " from srcFTPDir: " + srcFTPDir + " to destClientDir" + destClientDir);
		InputStream stO = null;
		try {

			stO = client.retrieveFileStream(srcFTPDir+"/"+ftpFileName);
			//completeFTPCommand(client);
		} catch (IOException e2) {

			logger.error("IOException in creating InputStream : " + Utilities.getStackTrace( e2 ));
			//completeFTPCommand(client);
			return false;
		}

		stO = new BufferedInputStream(stO, client.getBufferSize());

		File file = new File(destClientDir+"/"+ftpFileName);
		FileOutputStream fop = null;
		try {
			fop = new FileOutputStream(file);

			try {
				org.apache.commons.net.io.Util.copyStream(
						stO,
						fop,
						client.getBufferSize(),
						org.apache.commons.net.io.CopyStreamEvent.UNKNOWN_STREAM_SIZE,
						new org.apache.commons.net.io.CopyStreamAdapter() {
							public void bytesTransferred(long totalBytesTransferred,
									int bytesTransferred,
									long streamSize) {
							}
						});

				isDownloaded = true;
			} catch (CopyStreamException e) {

				logger.error("CopyStreamException : " + Utilities.getStackTrace( e ));
				isDownloaded = false;
			}
		} catch (FileNotFoundException e1) {
			logger.error("FileNotFoundException : " + Utilities.getStackTrace( e1 ));
			isDownloaded =  false;

		} finally {
			completeFTPCommand(client);
			if(stO != null) {
				try {
					stO.close();
				} catch (IOException e) {
					logger.error("IOException while closing InputStream  : " + Utilities.getStackTrace(e));
				}
				stO = null;
			}
			if(fop != null) {
				try {
					fop.close();
				} catch (IOException e) {
					logger.error("IOException while closing FileOutputStream  : " + Utilities.getStackTrace(e));
				}
			}
			if(file != null) {
				file = null;
			}
		}

		return isDownloaded;
	}

	public static boolean writeToFTPFile(FTPClient ftpClient, String ftpFileName, String ftpDirName, List<String> stringsToAppend, boolean appendInNewLine){

		boolean isAppended = false;
		if(stringsToAppend != null && stringsToAppend.size() > 0) {

			if(ftpDirName != null) {

				/*if(!changeWorkingDirectory(ftpClient, ftpFileName)) {
					logger.log(BCGLevel.ERROR,"Not able to change to directory:" + ftpDirName);
					isAppended = false;
				} else {
					logger.log(BCGLevel.DEBUG,"Changed to directory:" + ftpDirName);*/
				SocketOutputStream socketOutStream  = null;
				//ftpClient.enterLocalPassiveMode();
				//try {

				if( ftpClient.isConnected() && FTPReply.isPositiveCompletion(ftpClient.getReplyCode())) {

					try {
						ftpFileName = ftpDirName + "/" + ftpFileName;
						socketOutStream = (SocketOutputStream) ftpClient.appendFileStream(ftpFileName);
						logger.info("###################### socketOutStream : "+ socketOutStream);
						if(socketOutStream != null) {
							try {
								/*if(appendInNewLine) {
									socketOutStream.write("\n".getBytes());
									isAppended = true;
								}*/
								for(String str :stringsToAppend){
									if(Utilities.isNotEmpty(str)) {
										socketOutStream.write(str.getBytes());
										socketOutStream.write("\n".getBytes());
										isAppended = true;
									}
								}
								socketOutStream.flush();
								socketOutStream.close();
							} catch (IOException e) {
								logger.error("IOException while writing to socketOutStream: " + Utilities.getStackTrace( e ));
							}
						} else {
							logger.error("socketOutStream is null for a file:" + ftpFileName);
						}
					} catch (IOException e1) {
						logger.error("IOException while getting socketOutStream using FTP appendFileStream(): " + Utilities.getStackTrace( e1 ));
					}
				} else {
					logger.error("###################### ftpClient is not connected : "+ ftpClient.isConnected() );
				}
				completeFTPCommand(ftpClient);
				//}
			}
		}
		return isAppended;
	}

	public static boolean writeToFTPFile(FTPClient ftpClient, String ftpFilePath, String stringToAppend, boolean appendInNewLine){

		boolean isAppended = false;
		if(Utilities.isNotEmpty(stringToAppend)) {

			if(ftpFilePath != null) {

				SocketOutputStream socketOutStream  = null;
				
				if( ftpClient.isConnected() && FTPReply.isPositiveCompletion(ftpClient.getReplyCode())) {

					try {
						socketOutStream = (SocketOutputStream) ftpClient.appendFileStream(ftpFilePath);
						logger.debug("###################### socketOutStream : "+ socketOutStream);
						if(socketOutStream != null) {
							try {
								socketOutStream.write(stringToAppend.getBytes());
								if(appendInNewLine) {
									socketOutStream.write("\n".getBytes());
									isAppended = true;
								}

								socketOutStream.flush();
								socketOutStream.close();
								isAppended = true;
							} catch (IOException e) {
								logger.error("IOException while writing to socketOutStream: " + Utilities.getStackTrace( e ));
							}
						} else {
							logger.error("socketOutStream is null for a file:" + ftpFilePath);
						}
					} catch (IOException e1) {
						logger.error("IOException while getting socketOutStream using FTP appendFileStream(): " + Utilities.getStackTrace( e1 ));
					}
				} else {
					logger.error("###################### ftpClient is not connected : "+ ftpClient.isConnected() );
				}
				completeFTPCommand(ftpClient);
			} else {
				logger.debug("###################### ftpFilePath is EMPTY/NULL");
			}
		} else {
			logger.debug("###################### stringToAppend is EMPTY/NULL");
		}
		return isAppended;
	}

	public static boolean deleteFTPFile(FTPClient client, String ftpFileCompletePath) {
		boolean isDeleted = false;
		logger.info("FTP Deletining a file:" + ftpFileCompletePath);
		try {
			isDeleted = client.deleteFile(ftpFileCompletePath);
		} catch (IOException e) {
			logger.error("IOException while deleting a FTP file: " + Utilities.getStackTrace( e ));
		}

		return isDeleted;
	}

	public static boolean deleteFTPFile(FTPClient client, String ftpFileName, String ftpFileDirPath) {
		return deleteFTPFile(client, ftpFileDirPath + "/" + ftpFileName);
	}

	/*private static void fileUploadUsingFTP() {

		//You may avoid server disconnections while the client is idle by periodicaly sending NOOP commands to the server. 

		FileInputStream fis = null;
		BufferedReader reader = null;


		String auditLogFile = "auditLog.txt";
		String auditFtpDirName = "auditlog";

		String processingFtpDirName = "processing";

		String server = "192.168.149.179";
		String username = "msp_dev";
		String password = "xius123";

		try {

			client = getFTPClient(server, username, password);
			if(client != null) {

				if(!client.changeWorkingDirectory("testupload")) {
					logger.log(BCGLevel.INFO, "NO DIRECTORY: SHOULD EXIT FROM THE SYSTEM");
				}
				else
				{
					//ftpFile.setPermission(access, permission, value);
					do {
						FTPFile[] ftpFilesArr =  client.listFiles();

						if(ftpFilesArr == null || ftpFilesArr.length ==0)
						{
							logger.log(BCGLevel.INFO, "NO FILEs FOUND IN THE DIRECTORY: SHOULD EXIT FROM THE SYSTEM");
							break;
							//System.exit(1);
						}
						for (FTPFile ftpFile : ftpFilesArr) {
							//
							// Check if FTPFile is a regular file
							//
							if (ftpFile.getType() == FTPFile.FILE_TYPE) {
								String fileName = ftpFile.getName();

								logger.log(BCGLevel.INFO, "FTPFile: " + ftpFile.getName() +
										"; " + FileUtils.byteCountToDisplaySize(
												ftpFile.getSize()));

								if(moveFTPFile(client, fileName, processingFtpDirName)) {
									System.out.println("Moved");

									appendFTPFile(client, auditLogFile, auditFtpDirName, fileName + " is SuccessFully Done", true);

									String filename = "d:\\temp\\ErrorCodes.txt";
									fis = new FileInputStream(filename);
									appendFTPFile(client, auditLogFile, fis, true);

								} else {
									System.out.println("Not Moved");
								}

								break;
							}
						}



					} while(true);

					String localFileName = "d:\\temp\\ErrorCodes.txt";
					String ftpFilename = "ErrorCodes.txt";
					String ftpDirPath = "temp";
					String fileEncoding = "UTF-8";


					FileInputStream localFis = new FileInputStream(localFileName);

					if(uploadFTPFile(client, localFis, ftpFilename, null)) {
						System.out.println("Uploaded Successfully");

						reader = getFTPFileBufferedReader(client, ftpFilename, fileEncoding);
						if(reader != null) {
							System.out.println(reader.readLine());
						} else {
							System.out.println("Reading failed");
						}
					} else {
						System.out.println("Not Uploaded Successfully");
					}
				}

				client.logout();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					try { reader.close(); } catch (IOException logOrIgnore) {}
				}
				if (fis != null) {
					fis.close();
				}
				client.disconnect();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}*/
	public static void main(String[] args) {
		//fileUploadUsingFTP();
	}
}