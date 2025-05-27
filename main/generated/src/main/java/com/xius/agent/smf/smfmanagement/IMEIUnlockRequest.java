
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IMEI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transReferenceNumb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clarifyReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceOfRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "imei",
    "transReferenceNumb",
    "reason",
    "clarifyReason",
    "sourceOfRequest",
    "comments"
})
@XmlRootElement(name = "IMEIUnlockRequest")
public class IMEIUnlockRequest {

    @XmlElement(name = "IMEI", required = true)
    protected String imei;
    protected String transReferenceNumb;
    @XmlElement(name = "Reason")
    protected String reason;
    protected String clarifyReason;
    protected String sourceOfRequest;
    protected String comments;

    /**
     * Gets the value of the imei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMEI() {
        return imei;
    }

    /**
     * Sets the value of the imei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMEI(String value) {
        this.imei = value;
    }

    /**
     * Gets the value of the transReferenceNumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransReferenceNumb() {
        return transReferenceNumb;
    }

    /**
     * Sets the value of the transReferenceNumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransReferenceNumb(String value) {
        this.transReferenceNumb = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the clarifyReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClarifyReason() {
        return clarifyReason;
    }

    /**
     * Sets the value of the clarifyReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClarifyReason(String value) {
        this.clarifyReason = value;
    }

    /**
     * Gets the value of the sourceOfRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOfRequest() {
        return sourceOfRequest;
    }

    /**
     * Sets the value of the sourceOfRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOfRequest(String value) {
        this.sourceOfRequest = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
