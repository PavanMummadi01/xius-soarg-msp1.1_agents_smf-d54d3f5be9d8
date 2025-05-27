
package com.xius.agent.smf.postpaidmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostpaidRegStatusRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostpaidRegStatusRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transRefferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SIMNumber" type="{http://smf.agent.xius.com/PostPaidManagement.xsd}SIMType" minOccurs="0"/>
 *         &lt;element name="msisdn" type="{http://smf.agent.xius.com/PostPaidManagement.xsd}MSISDNType" minOccurs="0"/>
 *         &lt;element name="additionalInput1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalInput2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalInput3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostpaidRegStatusRequest", propOrder = {
    "transRefferenceID",
    "simNumber",
    "msisdn",
    "additionalInput1",
    "additionalInput2",
    "additionalInput3"
})
public class PostpaidRegStatusRequest {

    protected String transRefferenceID;
    @XmlElement(name = "SIMNumber")
    protected String simNumber;
    protected String msisdn;
    protected String additionalInput1;
    protected String additionalInput2;
    protected String additionalInput3;

    /**
     * Gets the value of the transRefferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransRefferenceID() {
        return transRefferenceID;
    }

    /**
     * Sets the value of the transRefferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransRefferenceID(String value) {
        this.transRefferenceID = value;
    }

    /**
     * Gets the value of the simNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIMNumber() {
        return simNumber;
    }

    /**
     * Sets the value of the simNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIMNumber(String value) {
        this.simNumber = value;
    }

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
     * Gets the value of the additionalInput1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInput1() {
        return additionalInput1;
    }

    /**
     * Sets the value of the additionalInput1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInput1(String value) {
        this.additionalInput1 = value;
    }

    /**
     * Gets the value of the additionalInput2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInput2() {
        return additionalInput2;
    }

    /**
     * Sets the value of the additionalInput2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInput2(String value) {
        this.additionalInput2 = value;
    }

    /**
     * Gets the value of the additionalInput3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInput3() {
        return additionalInput3;
    }

    /**
     * Sets the value of the additionalInput3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInput3(String value) {
        this.additionalInput3 = value;
    }

}
