package com.xius.smf.job;

import java.util.ArrayList;

import net.bcgi.util.db.SPFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;

import com.xius.smf.domaindata.IMEIJobFailDtlsData;
import com.xius.smf.domaindata.imei_log_file_Data;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class IMEILogReadJob implements Job,StatefulJob {
	private static final Logger logger = LogManager.getLogger(IMEILogReadJob.class.getSimpleName());

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		
		
			try {
				logger.info("In IMEILogReadJob---------------------------->");	 
				 
				ArrayList<String>	data=fetchLogDataFromSFTP();
				
				UpdateDataToDb(data);
				 
						
		} catch (SMFAgentException e) {
			// TODO Auto-generated catch block
			 
			logger.error("SMFAgentException in IMEILogReadJob"+Utilities.getStackTrace(e));
		}
		
	}
	
	public ArrayList<String> fetchLogDataFromSFTP() throws SMFAgentException {
		
		logger.info("IMEILogReadJob fetchLogDataFromSFTP method called ----------------------------");	
		IMEILogFileReadProcessor processor=new IMEILogFileReadProcessor();
		ArrayList<String> ReturnData=processor.ReadLogSFTP();
		logger.info("IMEILogReadJob fetchDataFromDb method Ended ----------------------------");
		return ReturnData  ;
	}
	
	public int UpdateDataToDb(ArrayList<String> data) throws SMFAgentException {
		
		logger.info("IMEILogReadJob UpdateDataToDb method called ----------------------------");
		String separator = InitiateAll.getSMFProps().getProperty(
		"IMEI_SFTP_RECORD_SEPARATOR");
		
		
		imei_log_file_Data domaindata = new imei_log_file_Data();
		IMEIJobFailDtlsData dtlsData= new IMEIJobFailDtlsData();
		String FileExt = InitiateAll.getSMFProps().getProperty("IMEI_SFTP_FILE_EXTENTION");
		logger.info("IMEILogReadJob UpdateDataToDb LOG file Lines count " + data!=null?data.size():"0");
		if (data.size() != 0) {
			
			dtlsData.setPi_file_name(data.get(0).split(separator)[1]);
			logger.info("IMEILogReadJob UpdateDataToDb LOG file Name to DB " + dtlsData.getPi_file_name().replace(".", "#").split("#")[0]+"."+FileExt);
			domaindata.setPi_file_id(dtlsData.getPi_file_name().replace(".", "#").split("#")[0]+"."+FileExt);
			domaindata.setPi_file_name(dtlsData.getPi_file_name().replace(".", "#").split("#")[0]+"."+FileExt);
			dtlsData.setPi_file_name(domaindata.getPi_file_name());
			if (data.size() > 2) {
				String[] imsi_arr = new String[data.size()];
				String[] error_code_arr = new String[data.size()];
				String[] remarks_arr = new String[data.size()];
				for (int i = 1; i < data.size() - 1; i++) {
					imsi_arr[i] = data.get(i).split(separator)[2];
					error_code_arr[i] = data.get(i).split(separator)[1];
					if (data.get(i).split(separator).length > 4) {
						remarks_arr[i] = data.get(i).split(separator)[0] + "#"
								+ data.get(i).split(separator)[4];
					}

				}
				if (imsi_arr != null)
					dtlsData.setPi_imei_array(imsi_arr);
				if (error_code_arr != null)
					dtlsData.setPi_gsme_error_code_arr(error_code_arr);
				if (remarks_arr != null)
					dtlsData.setPi_remarks_arr(remarks_arr);
				
				SPFactory factory =	ServiceUtils.executeSPWithOutCommit("pro_gsme_job_fail_imei_dtls",
						dtlsData, dtlsData);
				
				Utilities.commitOrRollback(factory, dtlsData.getPo_error_code());

				if (logger.isInfoEnabled()) {
					logger.info("Error Code from pro_gsme_job_fail_imei_dtls  ==>"+ dtlsData.getPo_error_code());
					logger.info("Error Msg from pro_gsme_job_fail_imei_dtls  ==>"+ dtlsData.getPo_error_desc());
				}	
				
				
			}
			SPFactory factory = ServiceUtils.executeSPWithOutCommit("pro_update_fileinfo",
					domaindata, domaindata);
			
			Utilities.commitOrRollback(factory, domaindata.getPo_error_code());

			if (logger.isInfoEnabled()) {
				logger.info("Error Code from pro_update_fileinfo  ==>"+ domaindata.getPo_error_code());
				logger.info("Error Msg from pro_update_fileinfo  ==>"+ domaindata.getPo_error_desc());
			}	
		}
		
		else{
			logger.info("IMEILogReadJob fetchDataFromDb method Ended ----------------------------");
			return 1;
		}
		logger.info("IMEILogReadJob fetchDataFromDb method Ended ----------------------------");
		return 0;
	}
	
	 

}
