package com.xius.smf.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = { "com.xius" })
@ComponentScan(basePackages = { "com.xius" })
public class SMFApplication {

	private static final Logger LOGGER = LogManager.getLogger(SMFApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SMFApplication.class, args);
	}
}
