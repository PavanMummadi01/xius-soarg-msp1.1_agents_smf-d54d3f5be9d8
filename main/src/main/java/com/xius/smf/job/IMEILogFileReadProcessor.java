package com.xius.smf.job;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.SftpException;
import com.xius.smf.domaindata.IMEILogFileData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.ftp.SFTPClient;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class IMEILogFileReadProcessor {
	
	private static final Logger logger = LogManager.getLogger(IMEILogFileReadProcessor.class.getSimpleName());

	ArrayList<String> listOfLines = new ArrayList<String>();
	SFTPClient sftpClient = null;
	
	

	public ArrayList<String> ReadLogSFTP() throws SMFAgentException {
		
		String nwId = InitiateAll.getSMFProps().getProperty(
				"IMEI_SFTP_LOG_NETWORK_ID");
		String FileExt = InitiateAll.getSMFProps().getProperty(
				"IMEI_SFTP_LOG_FILE_EXTENTION");
		String FilePath = InitiateAll.getSMFProps().getProperty(
				"IMEI_SFTP_LOG_SOURCE_PATH");
		String destination = InitiateAll.getSMFProps().getProperty(
				"IMEI_SFTP_LOG_DEST_PATH");
		String completePath = InitiateAll.getSMFProps().getProperty(
				"IMEI_SFTP_COMPLETE_PATH");
		String call_sftp = InitiateAll.getSMFProps().getProperty(
		"CALL_SFTP");
		String dbFileName = null;

		try {

			// fileName from DB
			IMEILogFileData domaindata = new IMEILogFileData();
			domaindata.setPi_network_id(Long.valueOf(nwId));
			
			ServiceUtils._executeStoredProcedure("pro_get_file_name",
					domaindata, domaindata);
			if (domaindata.getPo_error_code() == 0) {
				logger.error("IMEIFileUploadProcessor Log file Name is :"
						+ domaindata.getPo_file_name());
				String[] names=domaindata.getPo_file_name().replace(".", "#").split("#");
				dbFileName = names[0] + "."+ FileExt;
				logger.error("IMEIFileUploadProcessor Log file Name is :"
						+ dbFileName);
				domaindata.setPo_file_name(dbFileName);

			} else {
				logger.error("IMEIFileUploadProcessor Log file Name Not found");
				throw new SMFAgentException(
						SMFAgentConstants.INTERNAL_ERROR_CODE,
						"LOG File Name Not found");
			}

			sftpClient = new SFTPClient();

			if (call_sftp != null & call_sftp.length() > 0
					&& call_sftp.equalsIgnoreCase("YES")) {
				logger.info("IMEIFileUploadProcessor Log file calling SFTP");
				// Establish Connection
				sftpClient.connect();
				// file upload to SFTP
				sftpClient.download(FilePath, destination, dbFileName);
			}
			// SFTP File Read Download End
			BufferedReader bufReader = new BufferedReader(new FileReader(
					destination + dbFileName));

			if (bufReader != null) {
				String line = bufReader.readLine();

				while (line != null) {
					listOfLines.add(line);
					line = bufReader.readLine();
				}

				bufReader.close();
			} else {
				logger.error("IMEIFileUploadProcessor File data is NULL");
			}

			sftpClient.move(destination, completePath, dbFileName);

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
				// disconnect
				sftpClient.disconnect();
			}
		}
		return listOfLines;

	}

}