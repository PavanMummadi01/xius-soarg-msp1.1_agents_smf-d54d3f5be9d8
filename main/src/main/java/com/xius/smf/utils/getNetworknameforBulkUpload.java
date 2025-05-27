package com.xius.smf.utils;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class getNetworknameforBulkUpload {
	private static final Logger logger = LogManager.getLogger(getNetworknameforBulkUpload.class.getSimpleName());
	public static Map<String,String> map=new HashMap<String,String>();

	static{
		
		String nwmap=InitiateAll.getSMFProps().getProperty("BULK_SIMS_UPLOAD_NETWORKNAME").trim();
		
		 String[] nwarray=nwmap.split("#");
		
		for(String strsplit:nwarray){
			//String[] stringout=strsplit.split(",");
               String networkid =strsplit.substring(0, strsplit.indexOf(":")).trim();
               String nwName=strsplit.substring(strsplit.indexOf(":")+1).trim();
		       map.put(networkid,nwName);
		}
			
		}
	
	public static String getName(String id){
		logger.info("network ID:"+id);
	return 	map.get(id);
	}
	}

