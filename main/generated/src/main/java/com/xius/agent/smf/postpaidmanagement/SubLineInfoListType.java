
package com.xius.agent.smf.postpaidmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subLineInfoListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subLineInfoListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ICCID" type="{http://smf.agent.xius.com/PostPaidManagement.xsd}SIMType"/>
 *         &lt;element name="TPID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditLimit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MSISDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="optGRPCredit" type="{http://smf.agent.xius.com/PostPaidManagement.xsd}flagType" minOccurs="0"/>
 *         &lt;element name="optGrpBill" type="{http://smf.agent.xius.com/PostPaidManagement.xsd}flagType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subLineInfoListType", propOrder = {
    "iccid",
    "tpid",
    "creditLimit",
    "msisdn",
    "optGRPCredit",
    "optGrpBill"
})
public class SubLineInfoListType {

    @XmlElement(name = "ICCID", required = true)
    protected String iccid;
    @XmlElement(name = "TPID", required = true)
    protected String tpid;
    @XmlElement(required = true)
    protected String creditLimit;
    @XmlElement(name = "MSISDN")
    protected String msisdn;
    protected String optGRPCredit;
    protected String optGrpBill;

    /**
     * Gets the value of the iccid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICCID() {
        return iccid;
    }

    /**
     * Sets the value of the iccid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICCID(String value) {
        this.iccid = value;
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
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLimit(String value) {
        this.creditLimit = value;
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
     * Gets the value of the optGRPCredit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptGRPCredit() {
        return optGRPCredit;
    }

    /**
     * Sets the value of the optGRPCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptGRPCredit(String value) {
        this.optGRPCredit = value;
    }

    /**
     * Gets the value of the optGrpBill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptGrpBill() {
        return optGrpBill;
    }

    /**
     * Sets the value of the optGrpBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptGrpBill(String value) {
        this.optGrpBill = value;
    }

}
