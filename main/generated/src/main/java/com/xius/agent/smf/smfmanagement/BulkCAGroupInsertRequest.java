
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bulkCAGroupInsertRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bulkCAGroupInsertRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="caGroup" type="{http://smf.agent.xius.com/SMFManagement.xsd}CAGroupDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bulkCAGroupInsertRequest", propOrder = {
    "userType",
    "channel",
    "fileName",
    "actionFlag",
    "caGroup"
})
public class BulkCAGroupInsertRequest {

    @XmlElement(required = true)
    protected String userType;
    @XmlElement(required = true)
    protected String channel;
    protected String fileName;
    @XmlElement(required = true)
    protected String actionFlag;
    @XmlElement(required = true)
    protected CAGroupDetails caGroup;

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
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
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the actionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionFlag() {
        return actionFlag;
    }

    /**
     * Sets the value of the actionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionFlag(String value) {
        this.actionFlag = value;
    }

    /**
     * Gets the value of the caGroup property.
     * 
     * @return
     *     possible object is
     *     {@link CAGroupDetails }
     *     
     */
    public CAGroupDetails getCaGroup() {
        return caGroup;
    }

    /**
     * Sets the value of the caGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAGroupDetails }
     *     
     */
    public void setCaGroup(CAGroupDetails value) {
        this.caGroup = value;
    }

}
