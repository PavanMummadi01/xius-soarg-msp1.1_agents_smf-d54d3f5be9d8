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

import com.xius.smf.domaindata.CAGroupCursorDtlsData;
import com.xius.smf.domaindata.CAGroupDetailsData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class CAGroupCreationJob implements Job,StatefulJob {

	private	 static final Logger logger = LogManager.getLogger(CAGroupCreationJob.class.getSimpleName());

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		logger.info(" ====================== CAGroupCreationJob STARTED  ======================");	
		CAGroupDetailsData data=new CAGroupDetailsData();
		ArrayList<CAGroupCursorDtlsData> cursordata=null;
       
        String nwIdSplit=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.CA_GROUP_CREATION_JOB_EXTERNAL_NW_ID);
		  if(!Utilities.isNull(nwIdSplit)){
			  logger.info("ntworkID is "+nwIdSplit);
			  data.setPi_network_id(Long.valueOf(nwIdSplit));  
		  }else{
			  logger.info("ntworkID is Null");
		  }
		
		String maxrec=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.CA_GROUP_CREATION_JOB_MAX_RECORDS);
		if(maxrec!=null)
			data.setPi_max_records(Long.valueOf(maxrec));
		
		try {
				cursordata=fetchDataFromDb(data);			
			if(cursordata!=null && cursordata.size()>0) {		
				processCAGrpCreationData(cursordata);
			}
			else{
				logger.info("CursorData is empty");
			}
		} catch (SMFAgentException e) {
			e.printStackTrace();
		}
		
		logger.info(" ====================== CAGroupCreationJob  ENDED ======================");	
	}

	private void processCAGrpCreationData(ArrayList<CAGroupCursorDtlsData> cursordata) {
		logger.info("CAGroupCreationJob processCAGrpCreationData method called ----------------------------");	
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		ThreadPoolExecutor taskExecutor;
		CountDownLatch latch = null;
		String maxThreadsStr =InitiateAll.getSMFProps().getProperty(SMFAgentConstants.CA_GROUP_CREATION_JOB_MAX_THREADS);
		int maxThreads = Integer.parseInt(maxThreadsStr);
		taskExecutor= new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
		int size= cursordata.size(); 
		latch = new CountDownLatch(size);
		
		for(CAGroupCursorDtlsData curData:cursordata)
		{
			try{
				if(curData.getInernal_transaction_id()!=null){
					
					logger.info("Internal TransId is ::"+curData.getInernal_transaction_id());
					
							taskExecutor.execute(new CAGroupDetailProcessor(latch, curData));
						} else{
							logger.info("Internal TransId is Null");
						}
					} catch (Exception _exp) {
						logger.error("Excepion in taskExecutor.execute Processer call"+ Utilities.getStackTrace(_exp));
					}
			}
		
		try {
			if (latch != null)
				logger.info("latch count is :: "+latch.getCount() +" So calling latch.await Function" );
				latch.await();
		} catch (InterruptedException e) {
			logger.error("Excepion in await()" + Utilities.getStackTrace(e));
		}
		taskExecutor.shutdown();
		while (!taskExecutor.isTerminated()) {

		}
		latch = null;
		taskExecutor = null;
		
		logger
				.info("CAGroupCreationJob iteration finished ----------------------------");
		logger
				.info("CAGroupCreationJob processCAGrpCreationData method Ended ----------------------------");	
	}
	 // Invoke the SMF DB procedure to get the Records to be processed
	private ArrayList<CAGroupCursorDtlsData> fetchDataFromDb(
			CAGroupDetailsData data) throws SMFAgentException {
		logger.info("CAGroupCreationData fetchDataFromDb method called ----------------------------");	

		ArrayList<CAGroupCursorDtlsData> cursordate=null;
		logger.info("Data Sending to DB "+data.toString());
		ServiceUtils._executeStoredProcedure("pro_get_ca_group_dtls", data, data);
		
		if(data.getPo_error_code()==0)
		{
			cursordate=new ArrayList<CAGroupCursorDtlsData>();
			if(data.getPo_ca_group_dtls_cursor()!=null && data.getPo_ca_group_dtls_cursor().size()>0){
				logger.info("CAGroupCreationJob fetchDataFromDb Cursor Size is :: "+data.getPo_ca_group_dtls_cursor().size());
				cursordate=data.getPo_ca_group_dtls_cursor();
			}else{
				logger.info("CAGroupCreationJob fetchDataFromDb Cursor is Null");
			}
			
		}
		
		logger.info("CAGroupCreationJob fetchDataFromDb method Ended ----------------------------");	
		return cursordate;
	}

}
