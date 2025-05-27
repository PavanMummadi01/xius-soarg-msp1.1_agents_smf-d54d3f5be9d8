package com.xius.smf.config;

import java.io.FileInputStream;
import java.util.Properties;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({ "classpath:bcgi-domain-ds.xml", "classpath:bcgi-domain-constants.xml", "classpath:spf-ds-map.xml",
		"classpath:proc-config.xml" })
public class SpringStartupConfig {
	private static final Logger logger = LogManager.getLogger("SpringStartupConfig");
	@Value("${config.directory:conf/}")
	public static String PROPERTY_FILE_DIR;

	@PostConstruct
	public static Properties getErrorDetails() {
		Properties errorProps = new Properties();

		try {
			logger.info("in SpringStartupConfig");
			// InitiateAll.setSMFProps();
			logger.info(" ErrorDetails   Path : >/conf/ErrorDetails.properties");
			errorProps.load(new FileInputStream("conf/ErrorDetails.properties"));
		} catch (Exception e) {
			logger.error("getErrorDetails Exception :" + e);
		}
		return errorProps;
	}
}
