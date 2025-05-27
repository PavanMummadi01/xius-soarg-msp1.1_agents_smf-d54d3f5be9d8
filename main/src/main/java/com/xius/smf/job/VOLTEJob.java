package com.xius.smf.job;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;

import com.xius.smf.domaindata.VOLTECursorData;
import com.xius.smf.domaindata.VOLTESelectDATA;
import com.xius.smf.exception.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class VOLTEJob implements Job, StatefulJob {
	
	private static final Logger logger = LogManager.getLogger(VOLTEJob.class.getSimpleName());

	public void execute(JobExecutionContext arg0) throws JobExecutionException {

		ArrayList<VOLTECursorData> cursordata = null;

		String nwId = InitiateAll.getSMFProps().getProperty(
				SMFAgentConstants.VOLTE_EXTERNAL_NW_ID);
		String maxRows = InitiateAll.getSMFProps().getProperty(
				SMFAgentConstants.VOLTE_JOB_MAX_RECORDS);
		// String FailureCountStr=InitiateAll.getSMFProps().getProperty(
		// SMFAgentConstants.VOLTE_FAILURE_COUNT);
		String statusprop = InitiateAll.getSMFProps().getProperty(
				"VOLTE_JOB_STATUS");

		try {

			VOLTESelectDATA data = new VOLTESelectDATA();
			if (nwId != null) {

				data.setPi_network_id(Long.parseLong(nwId));

			}
			if (maxRows != null) {
				data.setPi_max_rows(Long.parseLong(maxRows));
			}

			String[] status = new String[2];
			status[0] = "AC";
			status[1] = "EX";
			data.setPi_to_status(status);

			if (statusprop != null && statusprop.length() > 0) {
				String[] statusArr = statusprop.split(",");
				String[] statusSubmit = new String[statusArr.length];
				for (int i = 0; i < statusArr.length; i++) {
					statusSubmit[i] = statusArr[i];
				}
				data.setPi_to_status(statusSubmit);
			}

			// Fetching the data from DB
			if (data != null) {
				cursordata = fetchDataFromDb(data);
			}
			// data.setPo_cursor_data(cursordata);
			if (cursordata != null && cursordata.size() > 0) {
				processVOLTEData(cursordata);
			} else {
				logger.info("CursorData is Empty");
			}

		} catch (SMFAgentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<VOLTECursorData> fetchDataFromDb(VOLTESelectDATA domaindata)
			throws SMFAgentException {
		logger.info("VOLTEJob fetchDataFromDb method called ----------------------------");
		ArrayList<VOLTECursorData> cursordate = null;
		logger.info("Data Sending to DB " + domaindata);
		try {
			ServiceUtils._executeStoredProcedure("pro_lte_statechange_notif_job",
					domaindata, domaindata);
		} catch (com.xius.smf.exceptions.SMFAgentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("VOLTEJob fetchDataFromDb method called ----------------------------78"
				+ domaindata.toString());
		if (domaindata.getPo_error_code() == 0) {
			cursordate = new ArrayList<VOLTECursorData>();
			if (domaindata.getPo_trans_details() != null
					&& domaindata.getPo_trans_details().size() > 0) {
				logger.info("VOLTEJob fetchDataFromDb Cursor Size is :: "
						+ domaindata.getPo_trans_details().size());
				cursordate = domaindata.getPo_trans_details();
			} else {
				logger.info("VOLTEJob fetchDataFromDb Cursor is Null");
			}
		} else {
			logger.info("VOLTEJob fetchDataFromDb failed>>>"
					+ domaindata.getPo_error_code());
			logger.info("VOLTEJob fetchDataFromDb failed>>>"
					+ domaindata.getPo_error_desc());
		}
		logger.info("VOLTEJob fetchDataFromDb method Ended ----------------------------");
		return cursordate;
	}

	public void processVOLTEData(ArrayList<VOLTECursorData> cursordata) {
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(
				100000);
		CountDownLatch latch = null;
		int size = cursordata.size();

		ThreadPoolExecutor taskExecutor;

		String maxThreadsStr = InitiateAll.getSMFProps().getProperty(
				SMFAgentConstants.VOLTE_JOB_MAX_THREADS);
		int maxThreads = 5;

		if (maxThreadsStr != null) {
			try {
				maxThreads = Integer.parseInt(maxThreadsStr);

			} catch (Exception e) {
				if (logger.isDebugEnabled())
					logger.debug("Exception while parsing property VOLTE_JOB_MAX_THREADS. so taking default value 5");
			}
		} else {
			if (logger.isDebugEnabled())
				logger.debug("Property VOLTE_JOB_MAX_THREADS is null. so taking default value 5 ");
		}
		logger.info("processVOLTEData VOLTE_JOB_MAX_THREADS are "
				+ maxThreads);
		taskExecutor = new ThreadPoolExecutor(maxThreads, maxThreads, 100000,
				TimeUnit.SECONDS, queue);
		latch = new CountDownLatch(size);
		
		String enable5G = InitiateAll.getSMFProps().getProperty(
		"VOLTE_JOB_5GPROV_SUBFLOW_ID");
		
		String disable5G = InitiateAll.getSMFProps().getProperty(
		"VOLTE_JOB_5GDEPROV_SUBFLOW_ID");
		
		String ex5G = InitiateAll.getSMFProps().getProperty(
		"VOLTE_JOB_EX_5GDEPROV_SUBFLOW_ID");
		
		String xbusflag = InitiateAll.getSMFProps().getProperty(
		"VOLTE_JOB_5GXBUS_INVOKE");
		
		for (VOLTECursorData curData : cursordata) {
			
			logger.info("curData.getNetwork_id()::"+curData.getNetwork_id());
			logger.info("curData.getMsisdn_no()::"+curData.getMsisdn_no());
			logger.info("curData.getNEW_STATUS()::"+curData.getNEW_STATUS());
			logger.info("curData.getPROCESS_SEQ_NUMBER()::"+curData.getPROCESS_SEQ_NUMBER());
			logger.info("curData.getACCOUNT_TYPE()::"+curData.getACCOUNT_TYPE());
			logger.info("curData.getSim_serial_no()::"+curData.getSim_serial_no());
			logger.info("curData.getPublicity_id()::"+curData.getPublicity_id());
			
			String new_status = curData.getNEW_STATUS();
			String splitValue = null;
			String extflowId=null;
			if (new_status != null) {

				String[] splitValueArr = new_status.split("~");

				if (splitValueArr.length > 1) {
					splitValue = splitValueArr[1];
					new_status = splitValueArr[0];
				}
				if (splitValueArr.length > 2) {
					extflowId = splitValueArr[2];
				}
			}
			curData.setNEW_STATUS(new_status);
  
			if(splitValue !=null &&  curData.getMsisdn_no().SIZE!=0 && splitValue.equalsIgnoreCase("P") && enable5G!=null && enable5G.length()>0){// error code doesn't match with the configured error codes so delete
				 
				
				if(xbusflag!=null && xbusflag.equalsIgnoreCase("Y")){
					logger.info("VolteJob Manage5GProvisionProcessor XBUS Invoking as status is P flowid"+enable5G +"FOR MSISDN>>"+curData.getMsisdn_no());	
					taskExecutor.execute(new Manage5GProvisionProcessor(latch,
							curData));
					
				}
				else{
					logger.info("VolteJob VOLTE5GProvisionProcessor SMF Invoking as status is P flowid>"+enable5G+"extflowId >>"+extflowId+"FOR MSISDN>>"+curData.getMsisdn_no());	
				taskExecutor.execute(new VOLTE5GProvisionProcessor(latch,
						curData,enable5G,extflowId));
				}
		}
		 else if(splitValue !=null &&  curData.getMsisdn_no().SIZE!=0 && splitValue.equalsIgnoreCase("D") && disable5G!=null && disable5G.length()>0){// error code doesn't match with the configured error codes so delete
			 if(xbusflag!=null && xbusflag.equalsIgnoreCase("Y")){
				 logger.info("VolteJob Manage5GDeprovProcessor XBUS Invoking as status is D flowid>>"+disable5G+"FOR MSISDN>>"+curData.getMsisdn_no());	
				 taskExecutor.execute(new Manage5GDeprovProcessor(latch,
							curData));
				}
				else{
				logger.info("VolteJob VOLTE5GProvisionProcessor SMF Invoking as status is D flowid>>"+disable5G+"extflowId >>"+extflowId+"FOR MSISDN>>"+curData.getMsisdn_no());	
				taskExecutor.execute(new VOLTE5GDeProvisionProcessor(latch,
						curData,disable5G,extflowId));
				}
		}
		 else if(curData !=null &&  curData.getMsisdn_no().SIZE!=0 && curData.getNEW_STATUS().equalsIgnoreCase("AC")){// error code doesn't match with the configured error codes so delete
				 
					logger.info("VolteJob TVolteProvisionProcessor Invoking as status is AC"+"FOR MSISDN>>"+curData.getMsisdn_no());	
					taskExecutor.execute(new VOLTEProvisionProcessor(latch,
							curData));
			}
			 else if(curData !=null &&  curData.getMsisdn_no().SIZE!=0 && curData.getNEW_STATUS().equalsIgnoreCase("EX")){// error code doesn't match with the configured error codes so delete
				 
					logger.info("VolteJob VOLTEDeProvisionProcessor Invoking as status is EX"+"FOR MSISDN>>"+curData.getMsisdn_no());	
					taskExecutor.execute(new VOLTEDeProvisionProcessor(latch,
							curData,ex5G,xbusflag));
			}
			 else if(curData !=null && curData.getNEW_STATUS().equalsIgnoreCase("E") &&  curData.getMsisdn_no().SIZE!=0 && ex5G!=null && ex5G.length()>0){ 
					logger.info("VolteJob VOLTE5GProvisionProcessor Invoking as status is EX with flowid>>"+ex5G+"extflowId >>"+extflowId+"FOR MSISDN>>"+curData.getMsisdn_no());	
					taskExecutor.execute(new VOLTE5GDeProvisionProcessor(latch,
							curData,ex5G,extflowId));
			}
			 else {
				logger.info("VOLTEJob MSISDN is Null or MSISDNStatus is not AC/EX");
			}
			
		
		}
		try {
			if (latch != null)
				latch.await();
		} catch (InterruptedException e) {
			logger.error("Excepion in await()" + Utilities.getStackTrace(e));
		}
		taskExecutor.shutdown();
		while (!taskExecutor.isTerminated()) {

		}
		latch = null;
		taskExecutor = null;
		logger.info("Hlrstatechange iteration finished ----------------------------");

	}
}
