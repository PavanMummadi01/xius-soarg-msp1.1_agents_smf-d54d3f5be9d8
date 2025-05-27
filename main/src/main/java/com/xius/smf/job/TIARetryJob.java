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

import com.xius.smf.domaindata.TIARetryCursorDtlsData;
import com.xius.smf.domaindata.TIARetryData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

/** This is landing class  for api retry process 
 * @author sumanth.komula
 *
 */
public class TIARetryJob implements Job,StatefulJob {

	private static final Logger logger = LogManager.getLogger(TIARetryJob.class.getSimpleName());
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		// TODO Auto-generated method stub
		logger.info(" ====================== TIARetryJob STARTED  ======================");
	
		TIARetryData data=new TIARetryData();
		ArrayList<TIARetryCursorDtlsData> cursordata=null;
       
        String nwIdSplit=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.TIA_API_RETRY_PROCESS_JOB_EXTERNAL_NW_ID);
		  if(!Utilities.isNull(nwIdSplit)){
			  String[] nwIdSplitArray=nwIdSplit.split("#");
			  data.setPi_networkid(Utilities.convertStringArytoBigDecimalAry(nwIdSplitArray));  
		  }
		
		String maxrec=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.TIA_API_RETRY_PROCESS_JOB_MAX_RECORDS);
		if(maxrec!=null)
			data.setPi_max_records(Long.valueOf(maxrec));
		
		String activityidsdefined=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.TIA_API_RETRY_PROCESS_ACTIVITIES);
		if(!Utilities.isNull(activityidsdefined)){
			  String[] actIdSplitArray=activityidsdefined.split("#");
			  data.setPi_activityid(Utilities.convertStringArytoBigDecimalAry(actIdSplitArray));  
		  }
		
		
		try {
				cursordata=fetchDataFromDb(data);			
			if(cursordata!=null && cursordata.size()>0) {		
				processTIARetry(cursordata);
			}
			else{
				logger.info("CursorData is empty");
			}
		} catch (SMFAgentException e) {
			e.printStackTrace();
		}
		
		logger.info(" ====================== TIARetryJob  ENDED ======================");	
		
	}


	


	private ArrayList<TIARetryCursorDtlsData> fetchDataFromDb(TIARetryData data) throws SMFAgentException {
		logger.info("TIARetry invoking data base with data from property files && calling the proc :: pkg_tia_api_retry.pro_sim_activation " );
		ArrayList<TIARetryCursorDtlsData> cursordata = null;
		logger.info("Data Sending to DB "+data.toString());
		ServiceUtils._executeStoredProcedure("pro_sim_activation", data, data);
	
	if(data.getPo_error_code()==0)
	{
		if(data.getPo_activationcursor()!=null && data.getPo_activationcursor().size()>0){
			logger.info("TiaRetryProcessJob fetchDataFromDb Cursor Size is :: "+data.getPo_activationcursor().size());
			cursordata=data.getPo_activationcursor();
		}else{
			logger.info("YFAPIProcessJob fetchDataFromDb Cursor is Null");
		}
		
	}
	
	logger.info("TiaRetryJob fetchDataFromDb method Ended ----------------------------");	
	return cursordata;

	}

	
	private void processTIARetry(ArrayList<TIARetryCursorDtlsData> cursordatalist) {
		logger.info("TIARetryJob processTIARetry method called ----------------------------");	
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		ThreadPoolExecutor taskExecutor;
		CountDownLatch latch = null;
		String maxThreadsStr =InitiateAll.getSMFProps().getProperty(SMFAgentConstants.TIA_API_RETRY_PROCESS_JOB_MAX_THREADS);
		int maxThreads = Integer.parseInt(maxThreadsStr);
		taskExecutor= new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
		latch = new CountDownLatch(cursordatalist.size());
	
	for(TIARetryCursorDtlsData retryCursorDtlsDataObj:cursordatalist ){
	if(retryCursorDtlsDataObj.getActivity_id().equals(1))	
	{
		//1 for sim activation
		logger
		.info("TIARetryJob SimActivationProcessor Invoking ----------------------------");
		taskExecutor.execute(new SimActivationProcessor(latch,retryCursorDtlsDataObj));
	}
	}
	}
	
	
}
