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
import com.xius.smf.domaindata.BulkStateChangeJobData;
import com.xius.smf.domaindata.BulkStateChangeProcessCursorData;
import com.xius.smf.domaindata.BulkStateChangeProcessData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class BulkStateChangeProcessJob implements Job,StatefulJob {

	private	 static final Logger logger = LogManager.getLogger(BulkStateChangeProcessJob.class.getSimpleName());

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		
		if(logger.isInfoEnabled())
			logger.info("BulkStateChangeProcessJob - execute method called");
		
		BulkStateChangeProcessData data=new BulkStateChangeProcessData();
		ArrayList<BulkStateChangeProcessCursorData>  cursordata=null;
       
        String nwIdSplit=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_STATE_CHANGE_PROCESS_JOB_EXTERNAL_NW_ID);
		  if(!Utilities.isNull(nwIdSplit)){
			  data.setPi_network_id(Long.valueOf(nwIdSplit));  
		  }
		
		String maxrec=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_STATE_CHANGE_PROCESS_JOB_MAX_RECORDS);
		if(maxrec!=null)
			data.setPi_max_records(Long.valueOf(maxrec));
		
		try {
				cursordata=fetchDataFromDb(data);			
			if(cursordata!=null) {
				if(logger.isInfoEnabled())
					logger.info("BulkStateChangeProcessJob - cursor size is :: "+cursordata.size());
				for(int i=0;i<cursordata.size();i++){
					logger.info("cursordata >>> "+cursordata.get(i).getMsisdn_no());
				}
				processBulkStateChangeData(cursordata);
			}
			else{
				logger.info("CursorData is empty");
			}
		} catch (SMFAgentException e) {
			e.printStackTrace();
		}
	}

	// 1. from cursor Data, find the total no of SIMs to process
	// 2. on completion of all the records update the SMF DB with completed state
	
	private void processBulkStateChangeData(ArrayList<BulkStateChangeProcessCursorData> cursordata) {
		
		if(logger.isInfoEnabled())
			logger.info("BulkStateChangeProcessJob - processBulkStateChangeData called");
		
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		ThreadPoolExecutor taskExecutor;
		CountDownLatch latch = null;
		//assuming always only 1 record will be fetched at a time
		String maxThreadsStr =InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_STATE_CHANGE_PROCESS_JOB_MAX_THREADS);
		int maxThreads = 5;
		if(maxThreadsStr!=null && maxThreadsStr.length()>0){
			maxThreads = Integer.parseInt(maxThreadsStr);
		}
		taskExecutor= new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
		int num=0;
		int size=cursordata.size();
		latch = new CountDownLatch(size);
		for(BulkStateChangeProcessCursorData curData:cursordata)
		{
			logger.info("BulkStateChangeProcessJob iteration start for  cursordata------------"+num);	
			
			BulkStateChangeJobData data = new BulkStateChangeJobData();
				
				if(curData.getNetwork_id()!=null)
					data.setPi_network_id(Long.valueOf(curData.getNetwork_id()));
				if(curData.getUser_id()!=null)
					data.setPi_login_id(curData.getUser_id());
				if(curData.getChannel_id()!=null)
					data.setChannelId(curData.getChannel_id());
				if(curData.getMsisdn_no()!=null)
					data.setMSISDN(curData.getMsisdn_no().toString());
				if(curData.getNew_subscr_status()!=null)
					data.setNewStatus(curData.getNew_subscr_status());
				if(curData.getTransaction_ref_num()!=null)
					data.setTransactionId(curData.getTransaction_ref_num());
				if(curData.getReason()!=null)
					data.setReason(curData.getReason());
				
					try {
						taskExecutor.execute(new BulkStateChangeProcessor(latch,data));
								
					} catch (Exception _exp) {
						logger.error("Excepion in taskExecutor"+ Utilities.getStackTrace(_exp));
				}
				
				
				logger.info("BulkStateChengeProcessor iteration finished ----------------------------");	
				num++;
			}

		try {
			if (latch != null)
				latch.await();
		} catch (InterruptedException e) {
			logger.error("Excepion in await()"+ Utilities.getStackTrace(e));
		}
		
		
		if (taskExecutor!=null) {
			taskExecutor.shutdown();
		}
		
		while (!taskExecutor.isTerminated()) {

		}
		
		latch = null;
		taskExecutor = null;
	}
	 // Invoke the SMF DB procedure to get the Records to be processed
	private ArrayList<BulkStateChangeProcessCursorData> fetchDataFromDb(
			BulkStateChangeProcessData data) throws SMFAgentException {
		
			ArrayList<BulkStateChangeProcessCursorData> cursordate=null;
			logger.info("Data Sending to DB "+data.toString());
			ServiceUtils._executeStoredProcedure("pro_state_change_action_dtls", data, data);//pro_state_change_action_dtls
		
		if(data.getPo_error_code()==0)
		{
			cursordate=new ArrayList<BulkStateChangeProcessCursorData>();
			cursordate=data.getPo_state_change_cursor();
			
		}
		
		return cursordate;
	}

}
