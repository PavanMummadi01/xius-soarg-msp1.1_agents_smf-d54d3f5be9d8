
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for detailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="provisioned4G" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provisioned5G" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailsType", propOrder = {
    "provisioned4G",
    "provisioned5G",
    "reason"
})
public class DetailsType {

    protected String provisioned4G;
    protected String provisioned5G;
    protected String reason;

    /**
     * Gets the value of the provisioned4G property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvisioned4G() {
        return provisioned4G;
    }

    /**
     * Sets the value of the provisioned4G property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvisioned4G(String value) {
        this.provisioned4G = value;
    }

    /**
     * Gets the value of the provisioned5G property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvisioned5G() {
        return provisioned5G;
    }

    /**
     * Sets the value of the provisioned5G property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvisioned5G(String value) {
        this.provisioned5G = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

}
