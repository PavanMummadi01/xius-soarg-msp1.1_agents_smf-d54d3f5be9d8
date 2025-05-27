
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insertExternalDetailsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insertExternalDetailsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SIMNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MSISDN" type="{http://smf.agent.xius.com/SMFManagement.xsd}MSISDNType" minOccurs="0"/>
 *         &lt;element name="externalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invokerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TPID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transRefNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertExternalDetailsRequest", propOrder = {
    "idType",
    "idValue",
    "simNo",
    "msisdn",
    "externalID",
    "invokerID",
    "tpid",
    "channel",
    "transRefNumber"
})
public class InsertExternalDetailsRequest {

    @XmlElement(name = "IDType")
    protected String idType;
    @XmlElement(name = "IDValue")
    protected String idValue;
    @XmlElement(name = "SIMNo")
    protected String simNo;
    @XmlElement(name = "MSISDN")
    protected String msisdn;
    @XmlElement(required = true)
    protected String externalID;
    @XmlElement(required = true)
    protected String invokerID;
    @XmlElement(name = "TPID", required = true)
    protected String tpid;
    @XmlElement(required = true)
    protected String channel;
    @XmlElement(required = true)
    protected String transRefNumber;

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDType(String value) {
        this.idType = value;
    }

    /**
     * Gets the value of the idValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDValue() {
        return idValue;
    }

    /**
     * Sets the value of the idValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDValue(String value) {
        this.idValue = value;
    }

    /**
     * Gets the value of the simNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIMNo() {
        return simNo;
    }

    /**
     * Sets the value of the simNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIMNo(String value) {
        this.simNo = value;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSISDN() {
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
    public void setMSISDN(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the externalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalID() {
        return externalID;
    }

    /**
     * Sets the value of the externalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalID(String value) {
        this.externalID = value;
    }

    /**
     * Gets the value of the invokerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvokerID() {
        return invokerID;
    }

    /**
     * Sets the value of the invokerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvokerID(String value) {
        this.invokerID = value;
    }

    /**
     * Gets the value of the tpid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPID() {
        return tpid;
    }

    /**
     * Sets the value of the tpid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPID(String value) {
        this.tpid = value;
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

    /**
     * Gets the value of the transRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransRefNumber() {
        return transRefNumber;
    }

    /**
     * Sets the value of the transRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransRefNumber(String value) {
        this.transRefNumber = value;
    }

}
