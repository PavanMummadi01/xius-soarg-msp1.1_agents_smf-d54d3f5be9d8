package com.xius.smf.job;

import java.math.BigDecimal;
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

import com.xius.smf.domaindata.YFAPICursorDtlsData;
import com.xius.smf.domaindata.YFAPIProcessData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class YFAPIProcessJob implements Job,StatefulJob {
	private static final Logger logger = LogManager.getLogger(YFAPIProcessJob.class.getSimpleName());

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		logger.info(" ====================== YFAPIProcessJob STARTED  ======================");	
		YFAPIProcessData data=new YFAPIProcessData();
		ArrayList<YFAPICursorDtlsData> cursordata=null;
       
        String nwIdSplit=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.YF_API_PROCESS_JOB_EXTERNAL_NW_ID);
		  if(!Utilities.isNull(nwIdSplit)){
			  data.setPi_network_id(Long.valueOf(nwIdSplit));  
		  }
		
		String maxrec=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.YF_API_PROCESS_JOB_MAX_RECORDS);
		if(maxrec!=null)
			data.setPi_max_records(Long.valueOf(maxrec));
		
		try {
				cursordata=fetchDataFromDb(data);			
			if(cursordata!=null && cursordata.size()>0) {		
				processYFAPIData(cursordata);
			}
			else{
				logger.info("CursorData is empty");
			}
		} catch (SMFAgentException e) {
			e.printStackTrace();
		}
		
		logger.info(" ====================== YFAPIProcessJob  ENDED ======================");	
	}

	private void processYFAPIData(ArrayList<YFAPICursorDtlsData> cursordata) {
		logger.info("YFAPIProcessJob processYFAPIData method called ----------------------------");	
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		ThreadPoolExecutor taskExecutor;
		CountDownLatch latch = null;
		String maxThreadsStr =InitiateAll.getSMFProps().getProperty(SMFAgentConstants.YF_API_PROCESS_JOB_MAX_THREADS);
		int maxThreads = Integer.parseInt(maxThreadsStr);
		taskExecutor= new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
		int size= cursordata.size(); 
		latch = new CountDownLatch(size);
		
		for(YFAPICursorDtlsData curData:cursordata)
		{
			try{
				if(curData.getInternal_trans_id()!=null){
					
					logger.info("Activity is ::"+curData.getActivity());
					logger.info("Internal TransId is ::"+curData.getInternal_trans_id());
					
						if (curData.getActivity().equalsIgnoreCase("1")) {
							logger
								.info("YFAPIProcessJob RegisterCCProcessor Invoking ----------------------------");
							taskExecutor.execute(new RegisterCCProcessor(
									latch, curData));
						} else if (curData.getActivity().equalsIgnoreCase("2")) {
							logger
									.info("YFAPIProcessJob CreateWalletProcessor Invoking ----------------------------");
							taskExecutor.execute(new CreateWalletProcessor(
									latch, curData));
						} else if (curData.getActivity().equalsIgnoreCase("3")) {
							logger
									.info("YFAPIProcessJob InvoiceProcessor Invoking ----------------------------");
							taskExecutor.execute(new InvoiceProcessor(latch,
									curData));
						}else if (curData.getActivity().equalsIgnoreCase("4")) {
							logger
							.info("YFAPIProcessJob QueryProcessor Invoking ----------------------------");
					        taskExecutor.execute(new YFQueryProcessor(latch,
							   curData));	
						
				         }else{
							logger.info("Internal TransId is Null");
						}
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
				.info("YFAPIProcessJob iteration finished ----------------------------");
		logger
				.info("YFAPIProcessJob processYFAPIData method Ended ----------------------------");	
	}
	 // Invoke the SMF DB procedure to get the Records to be processed
	private ArrayList<YFAPICursorDtlsData> fetchDataFromDb(
			YFAPIProcessData data) throws SMFAgentException {
		logger.info("YFAPIProcessJob fetchDataFromDb method called ----------------------------");	
		String activities =InitiateAll.getSMFProps().getProperty(SMFAgentConstants.YF_API_PROCESS_ACTIVITIES);
		logger.info("YFAPIProcessJob fetchDataFromDb method for activities ::"+ activities);	
		if(activities!=null){
			String[] activitiesArray=activities.split(",");
			BigDecimal[] activity=new BigDecimal[activitiesArray.length];
			for (int i = 0; i < activitiesArray.length; i++) {
				activity[i]=new BigDecimal(activitiesArray[i]);
			}
			
			data.setPi_activity(activity);
		}
		
		
			ArrayList<YFAPICursorDtlsData> cursordate=null;
			logger.info("Data Sending to DB "+data.toString());
			ServiceUtils._executeStoredProcedure("pro_thiredparty_get", data, data);
		
		if(data.getPo_error_code()==0)
		{
			cursordate=new ArrayList<YFAPICursorDtlsData>();
			if(data.getPo_api_data_cursor()!=null && data.getPo_api_data_cursor().size()>0){
				logger.info("YFAPIProcessJob fetchDataFromDb Cursor Size is :: "+data.getPo_api_data_cursor().size());
				cursordate=data.getPo_api_data_cursor();
			}else{
				logger.info("YFAPIProcessJob fetchDataFromDb Cursor is Null");
			}
			
		}
		
		logger.info("YFAPIProcessJob fetchDataFromDb method Ended ----------------------------");	
		return cursordate;
	}

}
