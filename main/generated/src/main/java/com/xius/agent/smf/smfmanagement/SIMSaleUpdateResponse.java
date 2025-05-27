
package com.xius.agent.smf.smfmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SIMSaleUpdateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIMSaleUpdateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oldMSISDN" type="{http://smf.agent.xius.com/SMFManagement.xsd}MSISDNType" minOccurs="0"/>
 *         &lt;element name="newMSISDN" type="{http://smf.agent.xius.com/SMFManagement.xsd}MSISDNType" minOccurs="0"/>
 *         &lt;element name="ActivityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldSIM" type="{http://smf.agent.xius.com/SMFManagement.xsd}SIMType" minOccurs="0"/>
 *         &lt;element name="newSIM" type="{http://smf.agent.xius.com/SMFManagement.xsd}SIMType" minOccurs="0"/>
 *         &lt;element name="oldIMSI" type="{http://smf.agent.xius.com/SMFManagement.xsd}IMSIType" minOccurs="0"/>
 *         &lt;element name="newIMSI" type="{http://smf.agent.xius.com/SMFManagement.xsd}IMSIType" minOccurs="0"/>
 *         &lt;element name="networkId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roamingdtls" type="{http://smf.agent.xius.com/SMFManagement.xsd}roamingdtlstype" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="atpUnSubsFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIMSaleUpdateResponse", propOrder = {
    "oldMSISDN",
    "newMSISDN",
    "activityType",
    "message",
    "oldSIM",
    "newSIM",
    "oldIMSI",
    "newIMSI",
    "networkId",
    "userId",
    "roamingdtls",
    "atpUnSubsFlag"
})
public class SIMSaleUpdateResponse {

    protected String oldMSISDN;
    protected String newMSISDN;
    @XmlElement(name = "ActivityType")
    protected String activityType;
    protected String message;
    protected String oldSIM;
    protected String newSIM;
    protected String oldIMSI;
    protected String newIMSI;
    protected Long networkId;
    protected String userId;
    protected List<Roamingdtlstype> roamingdtls;
    protected String atpUnSubsFlag;

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
     * Gets the value of the newMSISDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewMSISDN() {
        return newMSISDN;
    }

    /**
     * Sets the value of the newMSISDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewMSISDN(String value) {
        this.newMSISDN = value;
    }

    /**
     * Gets the value of the activityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityType() {
        return activityType;
    }

    /**
     * Sets the value of the activityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityType(String value) {
        this.activityType = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the oldSIM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldSIM() {
        return oldSIM;
    }

    /**
     * Sets the value of the oldSIM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldSIM(String value) {
        this.oldSIM = value;
    }

    /**
     * Gets the value of the newSIM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSIM() {
        return newSIM;
    }

    /**
     * Sets the value of the newSIM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSIM(String value) {
        this.newSIM = value;
    }

    /**
     * Gets the value of the oldIMSI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldIMSI() {
        return oldIMSI;
    }

    /**
     * Sets the value of the oldIMSI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldIMSI(String value) {
        this.oldIMSI = value;
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
     * Gets the value of the networkId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNetworkId() {
        return networkId;
    }

    /**
     * Sets the value of the networkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNetworkId(Long value) {
        this.networkId = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the roamingdtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roamingdtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoamingdtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Roamingdtlstype }
     * 
     * 
     */
    public List<Roamingdtlstype> getRoamingdtls() {
        if (roamingdtls == null) {
            roamingdtls = new ArrayList<Roamingdtlstype>();
        }
        return this.roamingdtls;
    }

    /**
     * Gets the value of the atpUnSubsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtpUnSubsFlag() {
        return atpUnSubsFlag;
    }

    /**
     * Sets the value of the atpUnSubsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtpUnSubsFlag(String value) {
        this.atpUnSubsFlag = value;
    }

}
