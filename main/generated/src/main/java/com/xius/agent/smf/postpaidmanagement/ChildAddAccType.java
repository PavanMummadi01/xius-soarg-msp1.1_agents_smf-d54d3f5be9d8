
package com.xius.agent.smf.postpaidmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChildAddAccType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChildAddAccType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mainLineMSISDN" type="{http://smf.agent.xius.com/PostPaidManagement.xsd}MSISDNType" minOccurs="0"/>
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
@XmlType(name = "ChildAddAccType", propOrder = {
    "mainLineMSISDN",
    "optGRPCredit",
    "optGrpBill"
})
public class ChildAddAccType {

    protected String mainLineMSISDN;
    protected String optGRPCredit;
    protected String optGrpBill;

    /**
     * Gets the value of the mainLineMSISDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainLineMSISDN() {
        return mainLineMSISDN;
    }

    /**
     * Sets the value of the mainLineMSISDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainLineMSISDN(String value) {
        this.mainLineMSISDN = value;
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
