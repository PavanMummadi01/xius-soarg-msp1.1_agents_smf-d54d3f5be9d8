package com.xius.smf.utils;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class StateChangeConfig {
	
	private static final Logger logger = LogManager.getLogger(StateChangeConfig.class.getSimpleName());

	public static Map<String,String> suspendMap=new HashMap<String,String>();
	public static Map<String,String> activeMap=new HashMap<String,String>();
	
	
	
static{
	
		String stsmap=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SUSPENDNEWSTATUS).trim();
		
		 String[] stsarray=stsmap.split("#");
		
		for(String strsplit:stsarray){
			
               String networkid =strsplit.substring(0, strsplit.indexOf(":")).trim();
               String nwName=strsplit.substring(strsplit.indexOf(":")+1).trim();
               suspendMap.put(networkid,nwName);
		}
			
		}

static{
	
	String stsmap=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.ACTIVATEOLDSTATUS).trim();
	
	 String[] stsarray=stsmap.split("#");
	
	for(String strsplit:stsarray){
		
           String networkid =strsplit.substring(0, strsplit.indexOf(":")).trim();
           String nwName=strsplit.substring(strsplit.indexOf(":")+1).trim();
           activeMap.put(networkid,nwName);
	}
		
	}

public static String getActOldStatus(String id){
	logger.info("network ID:"+id);
return 	activeMap.get(id);
}

public static String getSuspOldStatus(String id){
	logger.info("network ID:"+id);
return 	suspendMap.get(id);
}
}
