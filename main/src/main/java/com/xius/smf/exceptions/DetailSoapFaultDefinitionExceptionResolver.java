package com.xius.smf.exceptions;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import org.springframework.ws.soap.SoapFault;
import org.springframework.ws.soap.SoapFaultDetail;
import org.springframework.ws.soap.server.endpoint.SoapFaultMappingExceptionResolver;

import com.xius.agent.smf.common.error.errordetails.ErrorDetailsType;
import com.xius.agent.smf.common.error.errordetails.ObjectFactory;


public class DetailSoapFaultDefinitionExceptionResolver extends SoapFaultMappingExceptionResolver {

	private static final QName CODE = new QName("errorCode");
	private static final QName MESSAGE = new QName("errorMessage");

	@Override
	protected void customizeFault(Object endpoint, Exception ex, SoapFault fault) {
		//logger.warn("Exception processed ", ex);
		if (ex instanceof SMFAgentException) {
			//logger.warn("Exception pr ", ex);
			SoapFaultDetail detail = fault.addFaultDetail();
			
			ObjectFactory factory = new ObjectFactory();
			ErrorDetailsType errdtlsType=factory.createErrorDetailsType();
			errdtlsType.setErrorCode(((SMFAgentException) ex).getErrorCode());
			errdtlsType.setErrorMessage(((SMFAgentException) ex).getErrorMessage());
			JAXBElement<ErrorDetailsType> errdtls = factory.createErrorDetailItem(errdtlsType);
			
		
			try {
				JAXBContext jc = JAXBContext.newInstance(ErrorDetailsType.class);
				Marshaller marshaller = jc.createMarshaller();
			      marshaller.marshal(errdtls, detail.getResult());
			    } catch (JAXBException e) {
			    	logger.error("Could not marshall ErrorDetailsType", e);
			    }
		
			
		}
		if (ex instanceof ErrorDetailsTypeException) {
			//logger.warn("Exception pr ", ex);
			SoapFaultDetail detail = fault.addFaultDetail();
			
			ObjectFactory factory = new ObjectFactory();
			ErrorDetailsType errdtlsType=factory.createErrorDetailsType();
			errdtlsType.setErrorCode(((SMFAgentException) ex).getErrorCode());
			errdtlsType.setErrorMessage(((SMFAgentException) ex).getErrorMessage());
			JAXBElement<ErrorDetailsType> errdtls = factory.createErrorDetailItem(errdtlsType);
			
		
			try {
				JAXBContext jc = JAXBContext.newInstance(ErrorDetailsType.class);
				Marshaller marshaller = jc.createMarshaller();
			      marshaller.marshal(errdtls, detail.getResult());
			    } catch (JAXBException e) {
			    	logger.error("Could not marshall ErrorDetailsType", e);
			    }
		
			
		}
		
		
		
	}

}