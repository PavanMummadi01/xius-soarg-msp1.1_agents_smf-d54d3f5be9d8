
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DuplicateTransIDCheakRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DuplicateTransIDCheakRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtTransID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="new_msisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="new_sim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="old_msisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="old_sim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DuplicateTransIDCheakRequest", propOrder = {
    "extTransID",
    "orderid",
    "newMsisdn",
    "newSim",
    "oldMsisdn",
    "oldSim",
    "flag"
})
public class DuplicateTransIDCheakRequest {

    @XmlElement(name = "ExtTransID", required = true)
    protected String extTransID;
    protected String orderid;
    @XmlElement(name = "new_msisdn")
    protected String newMsisdn;
    @XmlElement(name = "new_sim")
    protected String newSim;
    @XmlElement(name = "old_msisdn")
    protected String oldMsisdn;
    @XmlElement(name = "old_sim")
    protected String oldSim;
    @XmlElement(required = true)
    protected String flag;

    /**
     * Gets the value of the extTransID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtTransID() {
        return extTransID;
    }

    /**
     * Sets the value of the extTransID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtTransID(String value) {
        this.extTransID = value;
    }

    /**
     * Gets the value of the orderid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * Sets the value of the orderid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderid(String value) {
        this.orderid = value;
    }

    /**
     * Gets the value of the newMsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewMsisdn() {
        return newMsisdn;
    }

    /**
     * Sets the value of the newMsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewMsisdn(String value) {
        this.newMsisdn = value;
    }

    /**
     * Gets the value of the newSim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSim() {
        return newSim;
    }

    /**
     * Sets the value of the newSim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSim(String value) {
        this.newSim = value;
    }

    /**
     * Gets the value of the oldMsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldMsisdn() {
        return oldMsisdn;
    }

    /**
     * Sets the value of the oldMsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldMsisdn(String value) {
        this.oldMsisdn = value;
    }

    /**
     * Gets the value of the oldSim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldSim() {
        return oldSim;
    }

    /**
     * Sets the value of the oldSim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldSim(String value) {
        this.oldSim = value;
    }

    /**
     * Gets the value of the flag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag(String value) {
        this.flag = value;
    }

}
