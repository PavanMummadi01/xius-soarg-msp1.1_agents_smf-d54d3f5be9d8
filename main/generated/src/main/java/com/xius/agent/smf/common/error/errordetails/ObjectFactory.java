
package com.xius.agent.smf.common.error.errordetails;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.xius.agent.smf.common.error.errordetails package. 
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

    private final static QName _ErrorDetailItem_QNAME = new QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xius.agent.smf.common.error.errordetails
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ErrorDetailsType }
     * 
     */
    public ErrorDetailsType createErrorDetailsType() {
        return new ErrorDetailsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smf.agent.xius.com/common/error/ErrorDetails.xsd", name = "errorDetailItem")
    public JAXBElement<ErrorDetailsType> createErrorDetailItem(ErrorDetailsType value) {
        return new JAXBElement<ErrorDetailsType>(_ErrorDetailItem_QNAME, ErrorDetailsType.class, null, value);
    }

}
