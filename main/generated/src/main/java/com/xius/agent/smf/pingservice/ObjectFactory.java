
package com.xius.agent.smf.pingservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.xius.agent.smf.pingservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PingResponse_QNAME = new QName("http://smf.agent.xius.com/PingService.xsd", "pingResponse");
    private final static QName _PingService_QNAME = new QName("http://smf.agent.xius.com/PingService.xsd", "pingService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xius.agent.smf.pingservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PingResponse }
     * 
     */
    public PingResponse createPingResponse() {
        return new PingResponse();
    }

    /**
     * Create an instance of {@link PingServiceRequest }
     * 
     */
    public PingServiceRequest createPingServiceRequest() {
        return new PingServiceRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smf.agent.xius.com/PingService.xsd", name = "pingResponse")
    public JAXBElement<PingResponse> createPingResponse(PingResponse value) {
        return new JAXBElement<PingResponse>(_PingResponse_QNAME, PingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingServiceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smf.agent.xius.com/PingService.xsd", name = "pingService")
    public JAXBElement<PingServiceRequest> createPingService(PingServiceRequest value) {
        return new JAXBElement<PingServiceRequest>(_PingService_QNAME, PingServiceRequest.class, null, value);
    }

}
