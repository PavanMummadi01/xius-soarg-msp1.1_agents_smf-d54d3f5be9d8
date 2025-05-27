package com.xius.smf.job;

import java.util.ArrayList;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;

import com.xius.smf.domaindata.Imei_file_dtls;
import com.xius.smf.domaindata.Imei_file_dtls_cursor_dtls;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class IMEIFileUploadJob implements Job, StatefulJob {
	
	private static final Logger logger = LogManager.getLogger(IMEIFileUploadJob.class.getSimpleName());

	String fileName = null;
	String date = null;

	public void execute(JobExecutionContext arg0) throws JobExecutionException {

		ArrayList<Imei_file_dtls_cursor_dtls> cursordata = null;

		fileName = InitiateAll.getSMFProps().getProperty("IMEI_SFTP_FILE_NAME");
		String FileExt = InitiateAll.getSMFProps().getProperty(
				"IMEI_SFTP_FILE_EXTENTION");
		String Instance_ID = InitiateAll.getSMFProps().getProperty(
				"IMEI_SFTP_FILE_INSTANCE_ID");
		try {

			Imei_file_dtls data = new Imei_file_dtls();

			data.setPio_fileid(fileName + "." + FileExt);
			if (Instance_ID != null)
				data.setPi_instanceid(Long.parseLong(Instance_ID));
			cursordata = fetchDataFromDb(data);

			data.setPo_emi_file_dtls(cursordata);
			if (cursordata != null && cursordata.size() >= 0) {
				processData(cursordata);
			} else {
				logger.info("IMEIFileUploadJob CursorData is Empty");
			}

		} catch (SMFAgentException e) {
			logger.error("SMFAgentException in IMEIFileUploadJob"
					+ Utilities.getStackTrace(e));
		}

	}

	public ArrayList<Imei_file_dtls_cursor_dtls> fetchDataFromDb(
			Imei_file_dtls domaindata) throws SMFAgentException {
		logger
				.info("IMEIFileUploadJob fetchDataFromDb method called ----------------------------");
		ArrayList<Imei_file_dtls_cursor_dtls> cursordate = null;
		logger.info("Data Sending to DB " + domaindata.toString());
		ServiceUtils._executeStoredProcedure("pro_get_fileinfo", domaindata,
				domaindata);
		if (domaindata != null) {
			if (domaindata.getPio_fileid() != null) {
				fileName = domaindata.getPio_fileid();
			}
			if (domaindata.getPo_date() != null) {
				date = domaindata.getPo_date();
			}

			logger.info("IMEIFileUploadJob fetchDataFromDb FileName :: "
					+ fileName);
			logger.info("IMEIFileUploadJob fetchDataFromDb Date :: " + date);

			cursordate = new ArrayList<Imei_file_dtls_cursor_dtls>();
			if (domaindata.getPo_emi_file_dtls() != null
					&& domaindata.getPo_emi_file_dtls().size() > 0) {
				logger
						.info("IMEIFileUploadJob fetchDataFromDb Cursor Size is :: "
								+ domaindata.getPo_emi_file_dtls().size());
				cursordate = domaindata.getPo_emi_file_dtls();
			} else {
				logger.info("IMEIFileUploadJob fetchDataFromDb Cursor is Null");
			}
		}
		logger
				.info("IMEIFileUploadJob fetchDataFromDb method Ended ----------------------------");
		return cursordate;
	}

	public void processData(ArrayList<Imei_file_dtls_cursor_dtls> cursordata) {
		IMEIFileUploadProcessor processor = new IMEIFileUploadProcessor();
		processor.uploadSFTP(cursordata, fileName, date);
	}

}
