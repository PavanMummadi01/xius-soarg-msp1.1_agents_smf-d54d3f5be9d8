
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BulkMDNRegActStatusReportsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BulkMDNRegActStatusReportsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Transdates" type="{http://smf.agent.xius.com/SMFManagement.xsd}DatesBtwnType" minOccurs="0"/>
 *           &lt;element name="TransNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="Actionflag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BulkMDNRegActStatusReportsRequest", propOrder = {
    "transdates",
    "transNumber",
    "actionflag"
})
public class BulkMDNRegActStatusReportsRequest {

    @XmlElement(name = "Transdates")
    protected DatesBtwnType transdates;
    @XmlElement(name = "TransNumber")
    protected String transNumber;
    @XmlElement(name = "Actionflag")
    protected String actionflag;

    /**
     * Gets the value of the transdates property.
     * 
     * @return
     *     possible object is
     *     {@link DatesBtwnType }
     *     
     */
    public DatesBtwnType getTransdates() {
        return transdates;
    }

    /**
     * Sets the value of the transdates property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatesBtwnType }
     *     
     */
    public void setTransdates(DatesBtwnType value) {
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

    /**
     * Gets the value of the actionflag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionflag() {
        return actionflag;
    }

    /**
     * Sets the value of the actionflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionflag(String value) {
        this.actionflag = value;
    }

}
