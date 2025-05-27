package com.xius.smf.utils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.xius.agent.smf.common.error.errordetails.ErrorDetailsType;
import com.xius.agent.smf.common.header.headerdetails.MessageHeader;
import com.xius.agent.smf.common.header.headerdetails.TrackingMessageHeaderType;


@Component
public class JaxbContextProvider {
	private static final  Logger LOGGER = LogManager.getLogger(JaxbContextProvider.class.getSimpleName());

    private static volatile JAXBContext jaxbContext;

    // Thread-safe double-checked locking pattern
    public static JAXBContext getContext() {
        JAXBContext localContext = jaxbContext;
        if (localContext == null) {
            synchronized (JaxbContextProvider.class) {
                localContext = jaxbContext;
                if (localContext == null) {
                    try {
                        // Create context with all required classes
                        jaxbContext = JAXBContext.newInstance(
                                MessageHeader.class,
                                TrackingMessageHeaderType.class,
                                // Add other related classes here if needed
                                ErrorDetailsType.class
                               // OtherRelatedClass2.class
                        );
                        localContext = jaxbContext;
                        LOGGER.debug("JAXBContext initialized successfully");
                    } catch (JAXBException e) {
                        LOGGER.error("Failed to initialize JAXBContext", e);
                        throw new RuntimeException("JAXBContext initialization failed", e);
                    }
                }
            }
        }
        return localContext;
    }

    // Unmarshaller factory method
    public static Unmarshaller createUnmarshaller() throws JAXBException{
        try {
            return getContext().createUnmarshaller();
        } catch (JAXBException e) {
            LOGGER.error("Failed to create Unmarshaller", e);
            throw new RuntimeException("Unmarshaller creation failed", e);
        }
    }

    // Marshaller factory method with optimized settings
    public static Marshaller createMarshaller() {
        try {
            Marshaller marshaller = getContext().createMarshaller();
            // Optimize marshaller settings
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.FALSE);
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
            return marshaller;
        } catch (JAXBException e) {
            LOGGER.error("Failed to create Marshaller", e);
            throw new RuntimeException("Marshaller creation failed", e);
        }
    }

}
