package com.xius.smf.ftp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class FTPFactory {

	private static FTPProxy ftpProxy = null;

	 static final Logger logger = LogManager.getLogger("FTPProxy");

	private FTPFactory(){

	}

	public static FTPProxy getInstance(){
		
		if( null == ftpProxy ) {
			
			ftpProxy = FTPProxy.getInstance();
		}
		
		return ftpProxy;
	}
}
