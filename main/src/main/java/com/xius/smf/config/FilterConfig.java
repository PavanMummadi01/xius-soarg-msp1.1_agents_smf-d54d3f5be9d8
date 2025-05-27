package com.xius.smf.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

	 @Bean
	   public FilterRegistrationBean abcFilter() {
		   FilterRegistrationBean filterRegBean = new FilterRegistrationBean();
		   filterRegBean.setFilter(new RequestResponseLogFilter());
		   filterRegBean.addUrlPatterns("/smfservices/*");
		   return filterRegBean;
	   }
}
