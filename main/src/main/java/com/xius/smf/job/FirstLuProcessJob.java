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

import com.xius.smf.domaindata.BulkLUJobData;
import com.xius.smf.domaindata.FirstLuProcessData;
import com.xius.smf.domaindata.GetBulkFluDtlsCursorData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class FirstLuProcessJob implements Job,StatefulJob {

	private	 static final Logger logger = LogManager.getLogger(FirstLuProcessJob.class.getSimpleName());

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		
		FirstLuProcessData data=new FirstLuProcessData();
		ArrayList<GetBulkFluDtlsCursorData> cursordata=null;
       
        String nwIdSplit=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.FIRST_LU_PROCESS_JOB_EXTERNAL_NW_ID);
		  if(!Utilities.isNull(nwIdSplit)){
			  data.setPi_network_id(Long.valueOf(nwIdSplit));  
		  }
		
		String maxrec=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.FIRST_LU_PROCESS_JOB_MAX_RECORDS);
		if(maxrec!=null)
			data.setPi_max_records(Long.valueOf(maxrec));
		
		try {
				cursordata=fetchDataFromDb(data);			
			if(cursordata!=null) {		
				processLUData(cursordata);
			}
			else{
				logger.info("CursorData is empty");
			}
		} catch (SMFAgentException e) {
			e.printStackTrace();
		}
	}

	// 1. from cursor Data, find the total no of SIMs to process
	// 2. form a object with NIR,office code, netowkrid
	// 3. create the latch with the size of the SIMs to be processed
	// 4. Iterate through the SIM range
	// 5. Invoke FirstLu process with data from point 2
	// 6. Wait till the latch size becomes zero
	// 7. nullify the latch, executor and other objects
	// 8. on completion of all the records update the SMF DB with completed state
	
	private void processLUData(ArrayList<GetBulkFluDtlsCursorData> cursordata) {
		
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		ThreadPoolExecutor taskExecutor;
		CountDownLatch latch = null;
		//assuming always only 1 record will be fetched at a time
		String maxThreadsStr =InitiateAll.getSMFProps().getProperty(SMFAgentConstants.FIRST_LU_PROCESS_JOB_MAX_THREADS);
		int maxThreads = 5;
		if(maxThreadsStr!=null && maxThreadsStr.length()>0){
			maxThreads = Integer.parseInt(maxThreadsStr);
		}
		taskExecutor= new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
		int num=0;
		for(GetBulkFluDtlsCursorData curData:cursordata)
		{
			logger.info("FirstLuProcessJob iteration start for  cursordata------------"+num);	
			if(curData.getIccid_from()!=null && curData.getIccid_to()!=null){
				BulkLUJobData data = new BulkLUJobData();
				
				Long iccid_from=Long.valueOf(curData.getIccid_from());
				Long iccid_to=Long.valueOf(curData.getIccid_to());
				Long longSize=iccid_to-iccid_from;
				int size= longSize.intValue(); 
				
				if(curData.getNetwork_id()!=null)
					data.setPi_network_id(Long.valueOf(curData.getNetwork_id()));
				if(curData.getNir_code()!=null)
					data.setPi_nir_code(curData.getNir_code());
				if(curData.getOffice_code()!=null)
					data.setPi_office_code(curData.getOffice_code());
				if(curData.getTrans_id()!=null)
					data.setTrans_id(curData.getTrans_id());
				if(curData.getChannel()!=null)
					data.setChannel(curData.getChannel());
				
	
				Long iccid_current=iccid_from;
				latch = new CountDownLatch(size);
				for (int i = 0; i <= size; i++) {
					try {
						taskExecutor.execute(new FirstLuProcessProcessor(latch,
								data, iccid_current));
					} catch (Exception _exp) {

					}
					iccid_current += 1;
				}
				try {
					if (latch != null)
						latch.await();
				} catch (InterruptedException e) {
					logger.error("Excepion in await()"+ Utilities.getStackTrace(e));
				}
				
				// Update the SMF DB - with status as 'Completed' for the transaction ID
				FLUBulkFinalStatUpdate finalUpdate = new FLUBulkFinalStatUpdate();
				try {
				finalUpdate.statuUpdate(data);
				}catch(Exception _exp){
					_exp.printStackTrace();
				}
				num++;
				logger.info("FirstLuProcessJob iteration finished ----------------------------");			
			}
		}
		
		taskExecutor.shutdown();
		while (!taskExecutor.isTerminated()) {

		}
		latch = null;
		taskExecutor = null;
	}
	 // Invoke the SMF DB procedure to get the Records to be processed
	private ArrayList<GetBulkFluDtlsCursorData> fetchDataFromDb(
			FirstLuProcessData data) throws SMFAgentException {
		
			ArrayList<GetBulkFluDtlsCursorData> cursordate=null;
			logger.info("Data Sending to DB "+data.toString());
			ServiceUtils._executeStoredProcedure("pro_get_bulk_flu", data, data);
		
		if(data.getPo_error_code()==0)
		{
			cursordate=new ArrayList<GetBulkFluDtlsCursorData>();
			cursordate=data.getPo_bulk_flu_dtls();
			
		}
		
		
		return cursordate;
	}

}
