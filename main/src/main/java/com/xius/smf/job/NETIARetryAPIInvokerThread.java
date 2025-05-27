
package com.xius.smf.job;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.domaindata.TIARetryCursorDtlsData;
import com.xius.smf.ne.NPRsmsConfirmationHelper;
import com.xius.smf.ne.TempMessageInfo;
import com.xius.smf.utils.GetNetworkName;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.Utilities;

public class NETIARetryAPIInvokerThread implements Runnable {

	private static final Logger logger = LogManager.getLogger(NETIARetryAPIInvokerThread.class.getSimpleName());

	TIARetryCursorDtlsData data;
	String flag;
	
	public NETIARetryAPIInvokerThread(TIARetryCursorDtlsData data,String flag){
		this.data=data;
	    this.flag=flag; 
	    }
	public void run() {
		logger.info("Invoking Ne Webservice Call with desitnation data as"+data.getMsisdn_no());
		
		callNeService(data,flag);
		
		
		
	}


	private void callNeService(TIARetryCursorDtlsData data,String flag) {
		String reffcode = null;
		NPRsmsConfirmationHelper helper=new NPRsmsConfirmationHelper();
		
		TempMessageInfo smsData=new TempMessageInfo();
		
		if(null!=data.getMsisdn_no() && null!=data.getNetwork_id() )
		{	
		smsData.setDestMSISDNs(data.getMsisdn_no().toString());
	
		if(null!=data.getOld_msisdn_no())	
		smsData.setMsisdn1(data.getOld_msisdn_no());
		smsData.setMsisdn2(data.getMsisdn_no());
			smsData.setNetworkId(data.getNetwork_id().toString());
			String neLoginCredentials=Utilities.getNetworkId(data.getNetwork_id().toString());
			String nwName = GetNetworkName.getName(String.valueOf(data.getNetwork_id()));
			if(null!=nwName)
			smsData.setUserDefined1(nwName);
			if(flag!=null && flag.equalsIgnoreCase("success")){
			 
			String	reffcodeSwitch=Utilities.getEventRefCodeSuccessTiaRetryForActivation(data.getNetwork_id().toString());
			if(null!=reffcodeSwitch && reffcodeSwitch.contains(",") ){
				String [] reffArray=reffcodeSwitch.split(",");
				if(reffArray.length > 1 && reffArray[1].equalsIgnoreCase("T") ){
					reffcode=reffArray[0];	
				}
				
			}
			
			}else{
				String	reffcodeSwitch=Utilities.getEventRefCodeFailureTiaRetryForActivation(data.getNetwork_id().toString());
				if(null!=reffcodeSwitch && reffcodeSwitch.contains(",") ){
					String [] reffArray=reffcodeSwitch.split(",");
					if(reffArray.length > 1 && reffArray[1].equalsIgnoreCase("T") ){
						reffcode=reffArray[0];	
					}
			}
			if(null!=reffcode){
			smsData.setEventReferenceCode(reffcode);
			 if(null!=InitiateAll.getSMFProps().getProperty("UserDefined5ForTIARetry"))
				smsData.setUserDefined5(InitiateAll.getSMFProps().getProperty("UserDefined5ForTIARetry"));
	            if(null!=InitiateAll.getSMFProps().getProperty("UserDefined6ForTIARetry"))
	            smsData.setUserDefined6(InitiateAll.getSMFProps().getProperty("UserDefined6ForTIARetry"));
				
	            helper.sendMsgToNE(smsData, neLoginCredentials);	
			}else{
				logger.info("NE Intimation Thread is switched off check for property file");	
			}
				
		
			}
		
	}else{
		
		logger.info("No Proper data recived in object"+data.toString());	
	}
	}

	
	
}
