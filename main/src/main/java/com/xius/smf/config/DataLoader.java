//package com.xius.smf.config;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.xius.smf.utils.InitiateAll;
//import com.xius.smf.utils.Utilities;
//
//
//
//@Component
//public class DataLoader implements CommandLineRunner{
//
//    private static final Logger logger = LogManager.getLogger("DataLoader");
//
//	private final InitiateAll initiateAll;
//	
//    public DataLoader(InitiateAll initiateAll) {
//        this.initiateAll = initiateAll;
//    }
//	
//	@Override
//	public void run(String... args) throws Exception {
//		logger.info("StartUp  Init :");
//		try {
//			initiateAll.loadAll();
//		} catch (Exception _exp) {
//			logger.error( "StartUp servlet failed..." + Utilities.getStackTrace(_exp));
//		}
//	}
//}
