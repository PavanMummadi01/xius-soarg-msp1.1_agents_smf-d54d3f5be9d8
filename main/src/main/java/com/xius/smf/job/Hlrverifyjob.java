package com.xius.smf.job;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;
import org.springframework.stereotype.Component;

import com.xius.smf.domaindata.HlrverifyData;
import com.xius.smf.domaindata.ProcesssimswapRecordsData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;


@Component
public class Hlrverifyjob implements Job, StatefulJob {

	private static final Logger logger = LogManager.getLogger(Hlrverifyjob.class.getSimpleName());

	static final int MAX_T = 3;

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		if (logger.isInfoEnabled())
			logger.info("Hlrverifyjob - execute method called");

		HlrverifyData data = new HlrverifyData();
		String nwId = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.hlr_verify_job_Switch_EXTERNAL_NW_ID);
		if (!Utilities.isNull(nwId)) {
			data.setPi_network_id(Long.valueOf(nwId));
		}

		String OPERATIONTYPE = InitiateAll.getSMFProps()
				.getProperty(SMFAgentConstants.hlr_verify_job_Switch_OPERATION_TYPE);
		if (!Utilities.isNull(OPERATIONTYPE)) {
			String[] operarray = OPERATIONTYPE.split(",");

			data.setPi_flag(Utilities.convertStringArytoLongAry(operarray));
		}

		String maxrec = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.hlr_verify_job_Switch_MAX_RECORDS);
		if (maxrec != null) {
			data.setPi_max_records(Long.parseLong(maxrec));
		}

		try {
			HlrverifyData returndbdata = fetchDataFromDb(data);
			if (returndbdata != null) {
				if (logger.isInfoEnabled()) {
					logger.info("hlr_verify_job simswap - cursor size is :: " + returndbdata.getPo_simswap().size());
					logger.info("hlr_verify_job sim_reg- cursor size is :: " + returndbdata.getPo_sim_reg().size());
					logger.info("hlr_verify_job change_mdn- cursor size is :: " + returndbdata.getPo_change_mdn().size());
				}
				hlrSimSwapProcess(returndbdata);
			} else {
				logger.info("CursorData is empty");
			}
		} catch (SMFAgentException e) {
			e.printStackTrace();
		}

	}

	/*
	 * private void hlrSimSwapProcess(HlrverifyData processdata) { if
	 * (logger.isInfoEnabled())
	 * logger.info("Hlrverifyjob - hlrSimSwapProcess called"); Runnable r1 = null,
	 * r2 = null, r3 = null; int count = 0;
	 * 
	 * if (processdata.getPo_simswap().size() > 0) { r1 = new
	 * HLRVerifyJobTask("SIMSWAP", processdata.getPo_simswap()); count++; }else{
	 * logger.info("Po_simswap CursorData is empty"); } if
	 * (processdata.getPo_sim_reg().size() > 0) { r2 = new
	 * HLRVerifyJobTask("SIMREG", processdata.getPo_sim_reg()); count++; } else{
	 * logger.info("Po_sim_reg CursorData is empty"); } if
	 * (processdata.getPo_change_mdn().size() > 0) { r3 = new
	 * HLRVerifyJobTask("CHANGEMSISDN", processdata.getPo_change_mdn()); count++;
	 * }else{ logger.info("Po_change_mdn CursorData is empty"); }
	 * 
	 * if(count>0){ ExecutorService pool = Executors.newFixedThreadPool(count);
	 * 
	 * if (r1 != null) pool.execute(r1); if (r2 != null) pool.execute(r2); if (r3 !=
	 * null) pool.execute(r3);
	 * 
	 * pool.shutdown(); }
	 * 
	 * // passes the Task objects to the pool to execute (Step 3) }
	 */

	private void hlrSimSwapProcess(HlrverifyData processdata) {
		if (logger.isInfoEnabled()) {
			logger.info("Hlrverifyjob - hlrSimSwapProcess called");
		}

		// Sequential processing of different record types
		try {
			// Process SIMSWAP records
			processSimSwapRecords(processdata.getPo_simswap());

			// Process SIM REG records
			processSimRegRecords(processdata.getPo_sim_reg());

			// Process Change MDN records
			processChangeMdnRecords(processdata.getPo_change_mdn());

		} catch (Exception e) {
			logger.error("Error in sequential HLR processing", e);
		}
	}

	private void processSimSwapRecords(ArrayList<ProcesssimswapRecordsData> simswapRecords) {
		if (simswapRecords == null || simswapRecords.isEmpty()) {
			logger.info("No simswapRecords records to process");
			return;
		}

		logger.info("Processing simswapRecords records: " + simswapRecords.size());
		HLRVerifyJobTask task = new HLRVerifyJobTask("SIMSWAP", simswapRecords);
		task.processhlr();

	}

	private void processSimRegRecords(ArrayList<ProcesssimswapRecordsData> simRegRecords) {
		if (simRegRecords == null || simRegRecords.isEmpty()) {
			logger.info("No SIM REG records to process");
			return;
		}

		logger.info("Processing SIM REG records: " + simRegRecords.size());
		HLRVerifyJobTask task = new HLRVerifyJobTask("SIMREG", simRegRecords);
		task.processhlr();

	}

	private void processChangeMdnRecords(ArrayList<ProcesssimswapRecordsData> changeMdnRecords) {
		if (changeMdnRecords == null || changeMdnRecords.isEmpty()) {
			logger.info("No Change MDN records to process");
			return;
		}

		logger.info("Processing Change MDN records: " + changeMdnRecords.size());
		HLRVerifyJobTask task = new HLRVerifyJobTask("CHANGEMSISDN", changeMdnRecords);
		task.processhlr();

	}

	private HlrverifyData fetchDataFromDb(HlrverifyData data) throws SMFAgentException {

		logger.info("Data Sending to DB " + data.toString());
		try {
			ServiceUtils._executeStoredProcedure("pro_get_simswap_simreg_chngmd", data, data);

			logger.info("Error code from DB " + data.getPo_error_code());

		} catch (SMFAgentException e) {
			e.printStackTrace();
		} // pro_state_change_action_dtls
		if (data.getPo_error_code() != 0) {
			throw new SMFAgentException(data.getPo_error_code().toString(), data.getPo_error_msg());
		}
		return data;
	}

}
