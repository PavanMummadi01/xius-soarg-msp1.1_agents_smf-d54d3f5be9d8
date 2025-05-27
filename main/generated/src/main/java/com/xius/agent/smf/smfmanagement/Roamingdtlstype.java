
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for roamingdtlstype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="roamingdtlstype">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baseIdsDerivdIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ATPIDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chargeIDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publicityIDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activationfees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ATPUniqueID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "roamingdtlstype", propOrder = {
    "service",
    "baseIdsDerivdIds",
    "atpiDs",
    "chargeIDs",
    "publicityIDs",
    "activationfees",
    "atpUniqueID"
})
public class Roamingdtlstype {

    protected String service;
    protected String baseIdsDerivdIds;
    @XmlElement(name = "ATPIDs")
    protected String atpiDs;
    protected String chargeIDs;
    protected String publicityIDs;
    protected String activationfees;
    @XmlElement(name = "ATPUniqueID")
    protected String atpUniqueID;

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * Gets the value of the baseIdsDerivdIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseIdsDerivdIds() {
        return baseIdsDerivdIds;
    }

    /**
     * Sets the value of the baseIdsDerivdIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseIdsDerivdIds(String value) {
        this.baseIdsDerivdIds = value;
    }

    /**
     * Gets the value of the atpiDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATPIDs() {
        return atpiDs;
    }

    /**
     * Sets the value of the atpiDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATPIDs(String value) {
        this.atpiDs = value;
    }

    /**
     * Gets the value of the chargeIDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeIDs() {
        return chargeIDs;
    }

    /**
     * Sets the value of the chargeIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeIDs(String value) {
        this.chargeIDs = value;
    }

    /**
     * Gets the value of the publicityIDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicityIDs() {
        return publicityIDs;
    }

    /**
     * Sets the value of the publicityIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicityIDs(String value) {
        this.publicityIDs = value;
    }

    /**
     * Gets the value of the activationfees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationfees() {
        return activationfees;
    }

    /**
     * Sets the value of the activationfees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationfees(String value) {
        this.activationfees = value;
    }

    /**
     * Gets the value of the atpUniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATPUniqueID() {
        return atpUniqueID;
    }

    /**
     * Sets the value of the atpUniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATPUniqueID(String value) {
        this.atpUniqueID = value;
    }

}
