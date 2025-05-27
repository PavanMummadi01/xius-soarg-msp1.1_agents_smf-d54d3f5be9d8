package com.xius.smf.job;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;

import com.xius.smf.domaindata.SMSNotifierData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class SMSNotifierJob implements Job,StatefulJob {

	private static final Logger logger = LogManager.getLogger(SMSNotifierJob.class.getSimpleName());

	SMSNotifierData notifierData;
	
	
	
	public void execute(JobExecutionContext context) throws JobExecutionException {
	
		logger.info(" ====================== SMSNotifierJob STARTED  ======================");
		 notifierData=formDBInputs();
		 try {
			notifierData=fetchDataFromDB(notifierData);
			if(null!=notifierData){
				
				
				SMSNotifierTask task=new SMSNotifierTask();
				task.processSMSNTask(notifierData);
				
				
			}else{
				
				logger.info("The records are not fetched");	
			}
			
			
		} catch (SMFAgentException e) {
			// TODO Auto-generated catch block
			
			logger.error("Exccception has raised at the block");	
			e.printStackTrace();
		}

	
	}


	private SMSNotifierData formDBInputs() {
		SMSNotifierData notifierData =new SMSNotifierData();
		
		String nwIdSplit=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SMS_NOTIFIER_PROCESS_JOB_EXTERNAL_NW_ID);
		logger.info("The NetworkIDS for which Notifierjob to be turned on"+nwIdSplit);
		
		  if(!Utilities.isNull(nwIdSplit)){
			  String[] nwIdSplitArray=nwIdSplit.split("#");
			  notifierData.setPi_network_id_arr(Utilities.convertStringArytoLongAry(nwIdSplitArray));  
		  }
		
		  String recordtoProcess =InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SMS_NOTIFIER_RECORD_TO_PROCESS);
			logger.info("The no of records fetch "+recordtoProcess);
			if(null!=recordtoProcess && recordtoProcess.length()>0){
				notifierData.setPi_record_process(Long.parseLong(recordtoProcess));
				
			}
			return notifierData;
	}	
	
	
	private SMSNotifierData fetchDataFromDB(SMSNotifierData notifierData) throws SMFAgentException{
		
		logger.info("Calling the proc for data");
		ServiceUtils._executeStoredProcedure("pro_sms_notify_ne_pro_backup", notifierData, notifierData);
		
		if(notifierData.getPo_error_code()==0)
		{
			logger.info("SMSNotifierJob proc executed success fully");
			
			}else{
				logger.info("SMSNotifierJob Error retuned from proc :: pro_sms_notify_ne_pro_backup"+notifierData.getPo_error_code());
			}
			
		
		return notifierData;
		}
		
}
