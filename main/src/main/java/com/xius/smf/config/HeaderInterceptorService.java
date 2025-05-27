package com.xius.smf.config;

import java.io.ByteArrayInputStream;
import java.io.StringWriter;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.soap.SoapMessage;

import com.xius.agent.smf.common.header.headerdetails.MessageHeader;
import com.xius.agent.smf.common.header.headerdetails.ObjectFactory;
import com.xius.agent.smf.common.header.headerdetails.TrackingMessageHeaderType;
import com.xius.smf.utils.JaxbContextProvider;




public class HeaderInterceptorService implements EndpointInterceptor {
	
	    private static final Logger logger = LogManager.getLogger(HeaderInterceptorService.class);

	    private static final ObjectFactory FACTORY = new ObjectFactory();
	    private static final String TRACKING_MESSAGE_HEADER = "trackingMessageHeader";
	    
	    private final CurrentHeader currentHeader;

	    @Autowired
	    public HeaderInterceptorService(CurrentHeader currentHeader) {
	        this.currentHeader = currentHeader;
	    }

	    @Override
	    public void afterCompletion(MessageContext context, Object endpoint, Exception ex) {
	        // No implementation needed
	    }

	    @Override
	    public boolean handleFault(MessageContext context, Object endpoint) throws Exception {
	    	logger.info("------------ handleFAULT ------------ ");
	        handleSoapHeader(context.getResponse());
	        return true;
	    }

	    @Override
	    public boolean handleRequest(MessageContext context, Object endpoint) throws Exception {
	    	logger.info("------------ handleRequest ------------ ");
	        SoapMessage soapMessage = (SoapMessage) context.getRequest();
	        
	        TrackingMessageHeaderType headerType = extractTrackingHeader(soapMessage);
	        currentHeader.setCurrentUser(headerType);
	        
	        return true;
	    }

	    @Override
	    public boolean handleResponse(MessageContext context, Object endpoint) throws Exception {
	    	logger.info("------------ handleResponse ------------ ");
	        handleSoapHeader(context.getResponse());
	        return true;
	    }

	    private void handleSoapHeader(org.springframework.ws.WebServiceMessage message) throws Exception {
	        SoapMessage soapMessage = (SoapMessage) message;
	        MessageHeader msgHeader = FACTORY.createMessageHeader();
	        msgHeader.setTrackingMessageHeader(currentHeader.getCurrentUser());
	        
	        Marshaller marshaller = JaxbContextProvider.getContext().createMarshaller();
	        marshaller.marshal(msgHeader, soapMessage.getSoapHeader().getResult());
	    }

	    private TrackingMessageHeaderType extractTrackingHeader(SoapMessage soapMessage) throws Exception {
	        String headerXml = convertSourceToString(soapMessage.getSoapHeader().getSource());
	        
	        XMLInputFactory xmlFactory = XMLInputFactory.newInstance();
	        XMLStreamReader reader = null;
	        
	        try {
	            reader = xmlFactory.createXMLStreamReader(
	                new StreamSource(new ByteArrayInputStream(headerXml.getBytes())));
	            
	            // Navigate to tracking header element
	            reader.nextTag();
	            while (!reader.getLocalName().equals(TRACKING_MESSAGE_HEADER)) {
	                reader.nextTag();
	            }
	            
	            Unmarshaller unmarshaller = JaxbContextProvider.getContext().createUnmarshaller();
	            JAXBElement<TrackingMessageHeaderType> element = 
	                unmarshaller.unmarshal(reader, TrackingMessageHeaderType.class);
	            
	            return element.getValue();
	        } finally {
	            if (reader != null) {
	                reader.close();
	            }
	        }
	    }

	    private String convertSourceToString(javax.xml.transform.Source source) throws Exception {
	        StringWriter writer = new StringWriter();
	        TransformerFactory.newInstance()
	            .newTransformer()
	            .transform(source, new StreamResult(writer));
	        return writer.toString();
	    }
	}
