package com.xius.smf.job;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.SftpException;
import com.xius.smf.domaindata.Imei_file_dtls_cursor_dtls;
import com.xius.smf.ftp.SFTPClient;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.Utilities;

public class IMEIFileUploadProcessor {
	
	private static final Logger logger = LogManager.getLogger(IMEIFileUploadProcessor.class.getSimpleName());

	SFTPClient sftpClient = null;

	public void uploadSFTP(ArrayList<Imei_file_dtls_cursor_dtls> cursor,
			String fileName, String date) {

		String HEADER_IDENTIFIER = InitiateAll.getSMFProps().getProperty(
				"IMEI_SFTP_HEADER_IDENTIFIER");
		String FOOTER_IDENTIFIER = InitiateAll.getSMFProps().getProperty(
				"IMEI_SFTP_FOOTER_IDENTIFIER");
		String UPLOAD_IDENTIFIER = InitiateAll.getSMFProps().getProperty(
				"IMEI_SFTP_UPLOAD_IDENTIFIER");
		String SOURCE_OF_REQUEST = InitiateAll.getSMFProps().getProperty(
				"IMEI_SFTP_SOURCE_OF_REQUEST");
		String RECORD_SEPARATOR = InitiateAll.getSMFProps().getProperty(
				"IMEI_SFTP_RECORD_SEPARATOR");
		String organization_Id = InitiateAll.getSMFProps().getProperty(
				"IMEI_SFTP_ORGANIZATION_ID");
		String record_version = InitiateAll.getSMFProps().getProperty(
				"IMEI_SFTP_RECORD_VERSION");

		String FilePath = InitiateAll.getSMFProps().getProperty(
				"IMEI_SFTP_SOURCE_PATH")
				+ "/";
		String destination = InitiateAll.getSMFProps().getProperty(
				"IMEI_SFTP_DEST_PATH");
		String completePath = InitiateAll.getSMFProps().getProperty(
				"IMEI_SFTP_COMPLETE_PATH");
		String call_sftp = InitiateAll.getSMFProps().getProperty("CALL_SFTP");

		try {

			// Header format record identifier>file name>organization
			// ID>Date>record
			// specification version
			String Header = HEADER_IDENTIFIER + RECORD_SEPARATOR + fileName
					+ RECORD_SEPARATOR + organization_Id + RECORD_SEPARATOR
					+ date + RECORD_SEPARATOR + record_version;
			PrintStream fileStream = new PrintStream(new File(FilePath
					+ fileName));
			fileStream.println(Header);

			for (int i = 0; i < cursor.size(); i++) {
				Imei_file_dtls_cursor_dtls temp = cursor.get(i);
				String value = null;
				// record identifier>IMEI from>IMEI to(O) >Device Status
				// list>list action>Reason>clarify reason(O) >source of
				// request(O) >comments(O)

				value = UPLOAD_IDENTIFIER;
				value = value + RECORD_SEPARATOR;

				if (temp.getImei() != null) {
					value = value + temp.getImei();
				}
				value = value + RECORD_SEPARATOR;

				value = value + RECORD_SEPARATOR;// TO IMEI

				value = value + "B" + RECORD_SEPARATOR;// TO IMEI

				if (temp.getActual_reason() != null) {
					if (temp.getActual_reason().equalsIgnoreCase("BLOCK"))
						value = value + "I";
					else if (temp.getActual_reason()
							.equalsIgnoreCase("UNBLOCK")) {
						value = value + "R";
					}
				}
				value = value + RECORD_SEPARATOR;

				if (temp.getReason() != null) {
					value = value + temp.getReason();
				}
				value = value + RECORD_SEPARATOR;

				if (temp.getClarify_reason() != null) {
					value = value + temp.getClarify_reason();
				}

				value = value + RECORD_SEPARATOR;

				if (SOURCE_OF_REQUEST != null && SOURCE_OF_REQUEST.length() > 0) {
					value = value + SOURCE_OF_REQUEST;
				} else {
					if (temp.getSource_of_request() != null) {
						value = value + temp.getSource_of_request();
					}
				}

				value = value + RECORD_SEPARATOR;

				if (temp.getComments() != null) {
					value = value + temp.getComments();
				}
				fileStream.println(value);
				// fileStream.println(UPLOAD_IDENTIFIER+">"+temp.getImei()+">"+">"+temp.getAction_status()+">"+temp.getReason()+">"+temp.getClarify_reason()+">"+temp.getSource_of_request()+">"+temp.getComments());

			}
			// Trailer format record identifier>file name>organization
			// ID>Date>record specification version>record count
			String Tailer = FOOTER_IDENTIFIER + RECORD_SEPARATOR + fileName
					+ RECORD_SEPARATOR + organization_Id + RECORD_SEPARATOR
					+ date + RECORD_SEPARATOR + record_version
					+ RECORD_SEPARATOR + cursor.size();
			fileStream.println(Tailer);

			fileStream.close();
			logger.info("Successfully wrote to the file.");

			// SFTP File Upload Process Start

			if (call_sftp != null & call_sftp.length() > 0
					&& call_sftp.equalsIgnoreCase("YES")) {
				logger.info("IMEIFileUploadProcessor Log file calling SFTP");
				sftpClient = new SFTPClient();
				// Establish Connection
				sftpClient.connect();
				// file upload to SFTP
				sftpClient.upload(FilePath, destination, fileName);

				sftpClient.move(FilePath, completePath, fileName);
			}
			// SFTP File Upload Process End

		} catch (JSchException e) {
			logger.error("JSchException in IMEIFileUploadProcessor"
					+ Utilities.getStackTrace(e));
		} catch (SftpException e) {
			logger.error("SftpException in IMEIFileUploadProcessor"
					+ Utilities.getStackTrace(e));
		} catch (IOException e) {
			logger.error("IOException in IMEIFileUploadProcessor"
					+ Utilities.getStackTrace(e));
		} finally {
			if (sftpClient != null) {
				// Disconnect Connection
				sftpClient.disconnect();
			}
		}

	}

}