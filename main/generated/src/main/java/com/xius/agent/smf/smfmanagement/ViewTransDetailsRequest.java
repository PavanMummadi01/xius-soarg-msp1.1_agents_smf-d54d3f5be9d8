
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ViewTransDetailsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewTransDetailsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Transdates" type="{http://smf.agent.xius.com/SMFManagement.xsd}DatesBetweenType"/>
 *         &lt;element name="TransNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewTransDetailsRequest", propOrder = {
    "transdates",
    "transNumber"
})
public class ViewTransDetailsRequest {

    @XmlElement(name = "Transdates")
    protected DatesBetweenType transdates;
    @XmlElement(name = "TransNumber")
    protected String transNumber;

    /**
     * Gets the value of the transdates property.
     * 
     * @return
     *     possible object is
     *     {@link DatesBetweenType }
     *     
     */
    public DatesBetweenType getTransdates() {
        return transdates;
    }

    /**
     * Sets the value of the transdates property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatesBetweenType }
     *     
     */
    public void setTransdates(DatesBetweenType value) {
        this.transdates = value;
    }

    /**
     * Gets the value of the transNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransNumber() {
        return transNumber;
    }

    /**
     * Sets the value of the transNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransNumber(String value) {
        this.transNumber = value;
    }

}
