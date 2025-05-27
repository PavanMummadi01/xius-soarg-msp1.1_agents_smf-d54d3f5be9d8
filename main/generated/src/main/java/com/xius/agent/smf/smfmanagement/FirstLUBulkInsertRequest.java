
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FirstLUBulkInsertRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FirstLUBulkInsertRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ICCIDFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ICCIDTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NIRCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="officeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FirstLUBulkInsertRequest", propOrder = {
    "iccidFrom",
    "iccidTo",
    "nirCode",
    "officeCode",
    "channel"
})
public class FirstLUBulkInsertRequest {

    @XmlElement(name = "ICCIDFrom")
    protected String iccidFrom;
    @XmlElement(name = "ICCIDTo")
    protected String iccidTo;
    @XmlElement(name = "NIRCode")
    protected String nirCode;
    protected String officeCode;
    protected String channel;

    /**
     * Gets the value of the iccidFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICCIDFrom() {
        return iccidFrom;
    }

    /**
     * Sets the value of the iccidFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICCIDFrom(String value) {
        this.iccidFrom = value;
    }

    /**
     * Gets the value of the iccidTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICCIDTo() {
        return iccidTo;
    }

    /**
     * Sets the value of the iccidTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICCIDTo(String value) {
        this.iccidTo = value;
    }

    /**
     * Gets the value of the nirCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIRCode() {
        return nirCode;
    }

    /**
     * Sets the value of the nirCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIRCode(String value) {
        this.nirCode = value;
    }

    /**
     * Gets the value of the officeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeCode() {
        return officeCode;
    }

    /**
     * Sets the value of the officeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeCode(String value) {
        this.officeCode = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

}
