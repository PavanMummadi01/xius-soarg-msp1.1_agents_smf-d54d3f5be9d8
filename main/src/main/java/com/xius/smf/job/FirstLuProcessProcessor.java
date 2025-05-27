package com.xius.smf.job;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.smf.client.ws.XBusDeviceAppClient;
import com.xius.smf.domaindata.BulkLUJobData;
import com.xius.smf.domaindata.FluValidationData;
import com.xius.smf.domaindata.GetBulkFluDtlsCursorData;
import com.xius.smf.utils.Utilities;
import com.xius.xbus.messages.provisioning.device.FirstLUActivationResponse;

public class FirstLuProcessProcessor implements Runnable{
	
	private	 static final Logger logger = LogManager.getLogger(FirstLuProcessProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	GetBulkFluDtlsCursorData cursordata=null;
	BulkLUJobData data =null;
	String SIM=null;
	public FirstLuProcessProcessor(CountDownLatch latch, BulkLUJobData data,Long SIM)
	{
		this.latch=latch;
		this.data=data;
		this.SIM=SIM.toString();
		
	}
	//1. invoke IN DB procedure for validating the iccid
	//2. If validation is success invoke xBus
	//3. if validation is not success update DB
	public void run() {

	 try {

		 FluValidationImpl fluValidationImpl = new FluValidationImpl();
		 FluValidationData validationData=null;
		 validationData = fluValidationImpl.fluValidation(data, SIM);
			if (validationData!=null && validationData.getPo_error_code()!=null && validationData.getPo_error_code()==0 
					&& validationData.getPo_IMSI() != null) {
				// call xBus FLU call
				XBusDeviceAppClient deviceClient = new XBusDeviceAppClient();
				deviceClient.doxBusFirstLU(validationData.getPo_IMSI(), data);
				
			} else {
				logger.debug(">>>>> else called.");
				// If IMSI is not coming, there is any error call SMF DB to note the rejected transactions	
				if(validationData.getPo_error_code()!=null && validationData.getPo_error_code()!=0){
					
					RejectInsertImpl rejectInsertImpl=new RejectInsertImpl();
					rejectInsertImpl.rejectInsert(data, SIM,validationData);
				}
				else{
					if(logger.isDebugEnabled()){
						logger.debug(">>>>> RejectInsert Not Called.");
						logger.debug(">>>>> FluValidation - IMSI is Not Null and ErrorCode,Error desc are Null.");
					}
				}
			}
		
			latch.countDown();
			
		} catch (Exception _exp) {
			logger.error(Utilities.getStackTrace(_exp));		
		}
	}
	
	 

	
}
	
	
	
	 