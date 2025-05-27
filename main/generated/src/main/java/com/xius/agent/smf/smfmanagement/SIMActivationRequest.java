
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SIMActivationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIMActivationRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SIM" type="{http://smf.agent.xius.com/SMFManagement.xsd}SIMType" minOccurs="0"/>
 *         &lt;element name="IMSI" type="{http://smf.agent.xius.com/SMFManagement.xsd}IMSIType" minOccurs="0"/>
 *         &lt;element name="MSISDN" type="{http://smf.agent.xius.com/SMFManagement.xsd}MSISDNType" minOccurs="0"/>
 *         &lt;element name="CurentStateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CustomField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkTransId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldMSISDN" type="{http://smf.agent.xius.com/SMFManagement.xsd}MSISDNType" minOccurs="0"/>
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNA" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NIR" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIMActivationRequest", propOrder = {
    "sim",
    "imsi",
    "msisdn",
    "curentStateId",
    "customField",
    "activityId",
    "linkTransId",
    "oldMSISDN",
    "channel",
    "sna",
    "nir"
})
public class SIMActivationRequest {

    @XmlElement(name = "SIM")
    protected String sim;
    @XmlElement(name = "IMSI")
    protected String imsi;
    @XmlElement(name = "MSISDN")
    protected String msisdn;
    @XmlElement(name = "CurentStateId")
    protected Long curentStateId;
    @XmlElement(name = "CustomField")
    protected String customField;
    protected String activityId;
    protected String linkTransId;
    protected String oldMSISDN;
    protected String channel;
    @XmlElement(name = "SNA")
    protected Long sna;
    @XmlElement(name = "NIR")
    protected Long nir;

    /**
     * Gets the value of the sim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIM() {
        return sim;
    }

    /**
     * Sets the value of the sim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIM(String value) {
        this.sim = value;
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
     * Gets the value of the curentStateId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurentStateId() {
        return curentStateId;
    }

    /**
     * Sets the value of the curentStateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurentStateId(Long value) {
        this.curentStateId = value;
    }

    /**
     * Gets the value of the customField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomField() {
        return customField;
    }

    /**
     * Sets the value of the customField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomField(String value) {
        this.customField = value;
    }

    /**
     * Gets the value of the activityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityId() {
        return activityId;
    }

    /**
     * Sets the value of the activityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityId(String value) {
        this.activityId = value;
    }

    /**
     * Gets the value of the linkTransId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkTransId() {
        return linkTransId;
    }

    /**
     * Sets the value of the linkTransId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkTransId(String value) {
        this.linkTransId = value;
    }

    /**
     * Gets the value of the oldMSISDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldMSISDN() {
        return oldMSISDN;
    }

    /**
     * Sets the value of the oldMSISDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldMSISDN(String value) {
        this.oldMSISDN = value;
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
     * Gets the value of the sna property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSNA() {
        return sna;
    }

    /**
     * Sets the value of the sna property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSNA(Long value) {
        this.sna = value;
    }

    /**
     * Gets the value of the nir property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNIR() {
        return nir;
    }

    /**
     * Sets the value of the nir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNIR(Long value) {
        this.nir = value;
    }

}
