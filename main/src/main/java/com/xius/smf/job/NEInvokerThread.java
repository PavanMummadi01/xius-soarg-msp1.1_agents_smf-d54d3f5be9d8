package com.xius.smf.job;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.domaindata.YFAPICursorDtlsData;
import com.xius.smf.ne.NPRsmsConfirmationHelper;
import com.xius.smf.ne.TempMessageInfo;
import com.xius.smf.utils.GetNetworkName;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.Utilities;

public class NEInvokerThread implements Runnable {

	
	private static final Logger logger = LogManager.getLogger(NEInvokerThread.class.getSimpleName());

	YFAPICursorDtlsData data;
	
	public NEInvokerThread(YFAPICursorDtlsData data){
		this.data=data;
	 
	    }
	public void run() {
		logger.info("Invoking Ne Webservice Call with desitnation data as"+data.getMsisdn_no());
		
		callNeService(data);
		
		
		
	}


	private void callNeService(YFAPICursorDtlsData data) {
		logger.info("Notification Engine call in run method");
		
		NPRsmsConfirmationHelper helper=new NPRsmsConfirmationHelper();
		
		TempMessageInfo smsData=new TempMessageInfo();
		
		if(null!=data.getMsisdn_no() && null!=data.getNetwork_id() )
		{	
		smsData.setDestMSISDNs(data.getMsisdn_no().toString());
		smsData.setMsisdn1(data.getMsisdn_no());
		smsData.setMsisdn2(data.getMsisdn_no());
			smsData.setNetworkId(data.getNetwork_id().toString());
			String neLoginCredentials=Utilities.getNetworkId(data.getNetwork_id().toString());
			String nwName = GetNetworkName.getName(String.valueOf(data.getNetwork_id()));
			if(null!=nwName)
			smsData.setUserDefined1(nwName);
			String reffcodeSwitch=Utilities.getEventRefCodeForActivation(data.getNetwork_id().toString());
			
			
				if(null!=reffcodeSwitch && reffcodeSwitch.contains(",") ){
					String [] reffArray=reffcodeSwitch.split(",");
					if(reffArray.length > 1 && reffArray[1].equalsIgnoreCase("T") ){
						
						String reffcode=reffArray[0];	
						logger.info("Invoking Ne Webservice Call with Event ID  "+reffcode);
						smsData.setEventReferenceCode(reffcode);
						if(null!=InitiateAll.getSMFProps().getProperty("UserDefined5ForActivation"))
							smsData.setUserDefined5(InitiateAll.getSMFProps().getProperty("UserDefined5ForActivation"));
				            if(null!=InitiateAll.getSMFProps().getProperty("UserDefined6ForActivation"))
				            smsData.setUserDefined6(InitiateAll.getSMFProps().getProperty("UserDefined6ForActivation"));
							
				            helper.sendMsgToNE(smsData, neLoginCredentials);	
						
					}else{
						logger.info("NE Switch is OFF in property file");
					}	
				
			
			}else{
				logger.info("Reffrence code is not mapped");
			}
				
		
	
		
	}else{
		
		logger.info("No Proper data recived in object"+data.toString());	
	}
	}

}
