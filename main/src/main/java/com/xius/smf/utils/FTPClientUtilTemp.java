package com.xius.smf.utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.SocketException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.io.SocketOutputStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FTPClientUtilTemp {

	private static  Logger logger = LogManager.getLogger("FTPClientUtilTemp");

	static String srcFTPDir="testupload/sourcefiles";
	static String processingFTPDir="testupload/processingfiles";
	static String successFTPDir="testupload/successfiles";
	static String badFTPDir="testupload/badfiles";	
	
	private static FTPClient client = null;

	private static FTPClient getFTPClient(String serverIp, String userName, String password) throws SocketException, IOException {
		FTPClient client = new FTPClient();
		int reply;

		client.connect(serverIp);
		client.login(userName, password);

		logger.info( "Connected to " + serverIp + ".");

		reply = client.getReplyCode();
		logger.info( "ReplyCode: " + reply + " ReplyString: " + client.getReplyString());

		if(!FTPReply.isPositiveCompletion(reply)) {
			client.disconnect();
			logger.info( "FTP server refused connection." + client.getReplyString());
			client = null;
		}

		return client;
	}

	private static boolean isDirectoryExists(FTPClient client, String dirName) throws IOException {
		if(client.changeWorkingDirectory(dirName)) {
			client.changeToParentDirectory();
			return true;
		} else {
			return false;
		}
	}

	private static boolean moveFTPFile(FTPClient client, String ftpFileName, String ftpDirName) throws IOException {
		if(!isDirectoryExists(client, ftpDirName)) {
			client.makeDirectory(ftpDirName);
		} 
		return client.rename(ftpFileName, ftpDirName + "/" + ftpFileName);
	}

	private static boolean uploadFTPFile(FTPClient client, String sourceFileName, String destFileName, String ftpDirpathName) throws IOException {

		/*String filename = "d:\\temp\\ErrorCodes.txt";
		String destFilename = "ErrorCodes.txt";*/
		FileInputStream fis = new FileInputStream(sourceFileName);

		return uploadFTPFile(client, fis, destFileName, ftpDirpathName);

	}

	private static boolean uploadFTPFile(FTPClient client, FileInputStream fis, String destFileName, String ftpDirpathName) throws IOException {
		boolean returnValue = false;

		if(fis != null) {

			if(ftpDirpathName != null) {
				if(!client.changeWorkingDirectory(ftpDirpathName)) {
					client.makeDirectory(ftpDirpathName);
					client.changeWorkingDirectory(ftpDirpathName);
				} else {
					logger.info( "direcotry already exists");
				}
			}
			client.storeFile(destFileName, fis);
			returnValue = true;
		} else {
			returnValue = false;
		}

		return returnValue;
	}

	private static BufferedReader getFTPFileBufferedReader (FTPClient client, String ftpFileName) throws IOException {
		return getFTPFileBufferedReader(client, ftpFileName, null);
	}

	private static BufferedReader getFTPFileBufferedReader (FTPClient client, String ftpFileName, String fileEncoding) throws IOException {
		BufferedReader bufferedReader = null;
		InputStreamReader inputStreamReader = getFTPFileInputStream(client, ftpFileName, fileEncoding);
		if(inputStreamReader != null) {
			bufferedReader = new BufferedReader(inputStreamReader);
		}

		return bufferedReader;
	}

	private static InputStreamReader getFTPFileInputStream (FTPClient client, String ftpFileName) throws IOException {

		return getFTPFileInputStream(client, ftpFileName, null);
	}

	private static InputStreamReader getFTPFileInputStream (FTPClient client, String ftpFileName, String fileEncoding) throws IOException {

		InputStreamReader inputStreamReader = null;
		InputStream inputStream = client.retrieveFileStream(ftpFileName);
		if(inputStream != null) {
			if(fileEncoding != null) {
				inputStreamReader = new InputStreamReader(inputStream, fileEncoding);
			} else {
				inputStreamReader = new InputStreamReader(inputStream);
			}
		}
		return inputStreamReader;
	}

	private static void appendFTPFile (FTPClient client, String ftpFileName, String ftpDirName, FileInputStream fis, boolean appendInNewLine) throws IOException {
		byte[] buffer = new byte[1024];
		int len;
		logger.info( "start");
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
				logger.info( "InputStream Transfer Completed");
			} else {
				logger.info( "InputStream Not Transfer Completed");
			}
			if(ftpDirName != null) {
				client.changeToParentDirectory();
			}
		}
	}

	private static void appendFTPFile(FTPClient client, String ftpFileName, String ftpDirName, String stringToAppend, boolean appendInNewLine) throws IOException {

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
				logger.info( "String Transfer Completed");
			} else {
				logger.info( "String Not Transfer Completed");
			}
			if(ftpDirName != null) {
				client.changeToParentDirectory();
			}
		}
	}

	private static void fileUploadUsingFTP() {

		/*
		 * You may avoid server disconnections while the client is idle by periodically sending NOOP commands to the server. 
		 */

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

				if(!client.changeWorkingDirectory(srcFTPDir)) {
					logger.info( "NO DIRECTORY: SHOULD EXIT FROM THE SYSTEM");
				}
				else
				{
					//ftpFile.setPermission(access, permission, value);
					do {
					FTPFile[] ftpFilesArr =  client.listFiles();

					if(ftpFilesArr == null || ftpFilesArr.length ==0)
					{
						logger.info( "NO FILEs FOUND IN THE DIRECTORY: SHOULD EXIT FROM THE SYSTEM");
						break;
						//System.exit(1);
					}
					for (FTPFile ftpFile : ftpFilesArr) {
						//
						// Check if FTPFile is a regular file
						//
						if (ftpFile.getType() == FTPFile.FILE_TYPE) {
							String fileName = ftpFile.getName();

							logger.info( "FTPFile: " + ftpFile.getName() +"; " + FileUtils.byteCountToDisplaySize(ftpFile.getSize()));									
							if(moveFTPFile(client, fileName, processingFTPDir)) {
								System.out.println("Moved");

								appendFTPFile(client, auditLogFile, auditFtpDirName, fileName + " is SuccessFully Done", true);

								/*String filename = "d:\\temp\\ErrorCodes.txt";
									fis = new FileInputStream(filename);
									appendFTPFile(client, auditLogFile, fis, true);*/

							} else {
								System.out.println("Not Moved");
							}

							break;
						}
					}



					} while(true);

					/*String localFileName = "d:\\temp\\ErrorCodes.txt";
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
					}*/
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
	}
	public static void main(String[] args) {
		fileUploadUsingFTP();
	}
}