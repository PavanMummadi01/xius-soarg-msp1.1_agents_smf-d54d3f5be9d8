
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertCMDAuditRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertCMDAuditRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Msisdn" type="{http://smf.agent.xius.com/SMFManagement.xsd}MSISDNType" minOccurs="0"/>
 *         &lt;element name="CommandName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewIMSI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewMsisdn" type="{http://smf.agent.xius.com/SMFManagement.xsd}MSISDNType" minOccurs="0"/>
 *         &lt;element name="IMSI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalTransID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertCMDAuditRequest", propOrder = {
    "msisdn",
    "commandName",
    "status",
    "newIMSI",
    "newMsisdn",
    "imsi",
    "externalTransID"
})
public class InsertCMDAuditRequest {

    @XmlElement(name = "Msisdn")
    protected String msisdn;
    @XmlElement(name = "CommandName")
    protected String commandName;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "NewIMSI")
    protected String newIMSI;
    @XmlElement(name = "NewMsisdn")
    protected String newMsisdn;
    @XmlElement(name = "IMSI")
    protected String imsi;
    @XmlElement(name = "ExternalTransID")
    protected String externalTransID;

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the commandName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandName() {
        return commandName;
    }

    /**
     * Sets the value of the commandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommandName(String value) {
        this.commandName = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the newIMSI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewIMSI() {
        return newIMSI;
    }

    /**
     * Sets the value of the newIMSI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewIMSI(String value) {
        this.newIMSI = value;
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
     * Gets the value of the imsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMSI() {
        return imsi;
    }

    /**
     * Sets the value of the imsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMSI(String value) {
        this.imsi = value;
    }

    /**
     * Gets the value of the externalTransID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalTransID() {
        return externalTransID;
    }

    /**
     * Sets the value of the externalTransID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalTransID(String value) {
        this.externalTransID = value;
    }

}
