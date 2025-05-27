
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getExternalDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getExternalDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SIMNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MSISDN" type="{http://smf.agent.xius.com/SMFManagement.xsd}MSISDNType" minOccurs="0"/>
 *         &lt;element name="externalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invokerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insertDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="executedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForceActFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getExternalDetailsResponse", propOrder = {
    "idType",
    "idValue",
    "simNo",
    "msisdn",
    "externalID",
    "invokerID",
    "tpid",
    "status",
    "insertDate",
    "executedDate",
    "forceActFlag",
    "transRefNumber"
})
public class GetExternalDetailsResponse {

    @XmlElement(name = "IDType")
    protected String idType;
    @XmlElement(name = "IDValue")
    protected String idValue;
    @XmlElement(name = "SIMNo")
    protected String simNo;
    @XmlElement(name = "MSISDN")
    protected String msisdn;
    protected String externalID;
    protected String invokerID;
    @XmlElement(name = "TPID")
    protected String tpid;
    protected String status;
    protected String insertDate;
    protected String executedDate;
    @XmlElement(name = "ForceActFlag")
    protected String forceActFlag;
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
     * Gets the value of the insertDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertDate() {
        return insertDate;
    }

    /**
     * Sets the value of the insertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertDate(String value) {
        this.insertDate = value;
    }

    /**
     * Gets the value of the executedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutedDate() {
        return executedDate;
    }

    /**
     * Sets the value of the executedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutedDate(String value) {
        this.executedDate = value;
    }

    /**
     * Gets the value of the forceActFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForceActFlag() {
        return forceActFlag;
    }

    /**
     * Sets the value of the forceActFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForceActFlag(String value) {
        this.forceActFlag = value;
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
