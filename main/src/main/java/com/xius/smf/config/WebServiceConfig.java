package com.xius.smf.config;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.soap.server.endpoint.SoapFaultDefinition;
import org.springframework.ws.soap.server.endpoint.SoapFaultMappingExceptionResolver;
import org.springframework.ws.soap.server.endpoint.interceptor.PayloadValidatingInterceptor;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.validation.XmlValidator;
import org.springframework.xml.validation.XmlValidatorFactory;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import org.springframework.xml.xsd.XsdSchemaCollection;

import com.xius.smf.exceptions.DetailSoapFaultDefinitionExceptionResolver;

@EnableWs
@Configuration
@Component
public class WebServiceConfig extends WsConfigurerAdapter {

    private static final Logger logger = LogManager.getLogger(WebServiceConfig.class);

	public void addInterceptors(List<EndpointInterceptor> interceptors) {
		PayloadValidatingInterceptor validatingInterceptor = new PayloadValidatingInterceptor();
		validatingInterceptor.setValidateRequest(true);
		validatingInterceptor.setValidateResponse(true);
		validatingInterceptor.setXsdSchemaCollection(new XsdSchemaCollection() {
			@Override
			public XsdSchema[] getXsdSchemas() {
				return null;
			}

			@Override
			public XmlValidator createValidator() {
				try {
					return XmlValidatorFactory.createValidator(getSchemas(), "http://www.w3.org/2001/XMLSchema");
				} catch (Exception e) {
					logger.error("Failed to create validator e={}", e);
				}
				return null;
			}

			public Resource[] getSchemas() {
				return new Resource[] { new ClassPathResource("/wsdls/server/HeaderDetails.xsd"),
										new ClassPathResource("/wsdls/server/ErrorDetails.xsd"),
										new ClassPathResource("/wsdls/server/SMFManagement.xsd"),										
										new ClassPathResource("/wsdls/server/PostPaidManagement.xsd"),
										new ClassPathResource("/wsdls/server/SMFReportsManagement.xsd"),
										new ClassPathResource("/wsdls/server/PingService.xsd")
										
										
										
						};
			}
		});

		CurrentHeader currentHeader = new CurrentHeader();

		HeaderInterceptorService interceptorService = new HeaderInterceptorService(currentHeader);
		interceptors.add(interceptorService);
		interceptors.add(validatingInterceptor);

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context) {
		MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
		messageDispatcherServlet.setApplicationContext(context);
		messageDispatcherServlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(messageDispatcherServlet, "/smfservices/*");
	}

	@Bean
	public XsdSchema headerSchema() {
		return new SimpleXsdSchema(new ClassPathResource("/wsdls/server/HeaderDetails.xsd"));
	}

	@Bean(name = "SMFManagementServices")
	public DefaultWsdl11Definition sMFManagement(XsdSchema sMFManagementSchema) {
		DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
		definition.setPortTypeName("SMFManagementServicesPort");
		definition.setTargetNamespace("http://smf.agent.xius.com/SMFManagement.xsd");
		definition.setLocationUri("/smfservices");
		definition.setSchema(sMFManagementSchema);
		return definition;
	}

	@Bean
	public XsdSchema sMFManagementSchema() {
		return new SimpleXsdSchema(new ClassPathResource("/wsdls/server/SMFManagement.xsd"));
	}
	
	
	@Bean(name = "PostPaidManagementServices")
	public DefaultWsdl11Definition postPaidManagement(XsdSchema postPaidManagementSchema) {
		DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
		definition.setPortTypeName("PostPaidManagementServicesPort");
		definition.setTargetNamespace("http://smf.agent.xius.com/PostPaidManagement.xsd");
		definition.setLocationUri("/smfservices");
		definition.setSchema(postPaidManagementSchema);
		return definition;
	}

	@Bean
	public XsdSchema postPaidManagementSchema() {
		return new SimpleXsdSchema(new ClassPathResource("/wsdls/server/PostPaidManagement.xsd"));
	}
	
	
	@Bean(name = "SMFReportsManagementServices")
	public DefaultWsdl11Definition smfReportsManagementSchema(XsdSchema smfReportsManagementSchema) {
		DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
		definition.setPortTypeName("SMFReportsManagementServicesPort");
		definition.setTargetNamespace("http://smfreport.agent.xius.com/SMFReportsManagement.xsd");
		definition.setLocationUri("/smfservices");
		definition.setSchema(smfReportsManagementSchema);
		return definition;
	}

	@Bean
	public XsdSchema smfReportsManagementSchema() {
		return new SimpleXsdSchema(new ClassPathResource("/wsdls/server/SMFReportsManagement.xsd"));
	}
	
	@Bean(name = "PingServices")
	public DefaultWsdl11Definition pingServiceServicesSchema(XsdSchema pingServiceServicesSchema) {
		DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
		definition.setPortTypeName("PingServicePort");
		definition.setTargetNamespace("http://smf.agent.xius.com/PingService.xsd");
		definition.setLocationUri("/smfservices");
		definition.setSchema(pingServiceServicesSchema);
		return definition;
	}

	@Bean
	public XsdSchema pingServiceServicesSchema() {
		return new SimpleXsdSchema(new ClassPathResource("/wsdls/server/PingService.xsd"));
	}


	
	@Bean
	public SoapFaultMappingExceptionResolver exceptionResolver() {
		SoapFaultMappingExceptionResolver exceptionResolver = new DetailSoapFaultDefinitionExceptionResolver();

		SoapFaultDefinition faultDefinition = new SoapFaultDefinition();
		faultDefinition.setFaultCode(SoapFaultDefinition.CLIENT);
		exceptionResolver.setDefaultFault(faultDefinition);
		exceptionResolver.setOrder(1);
		return exceptionResolver;
	}
}
