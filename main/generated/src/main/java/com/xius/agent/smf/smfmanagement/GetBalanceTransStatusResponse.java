
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBalanceTransStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBalanceTransStatusResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="balTransStatusDtls" type="{http://smf.agent.xius.com/SMFManagement.xsd}balTransStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBalanceTransStatusResponse", propOrder = {
    "message",
    "balTransStatusDtls"
})
public class GetBalanceTransStatusResponse {

    protected String message;
    protected BalTransStatusType balTransStatusDtls;

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
     * Gets the value of the balTransStatusDtls property.
     * 
     * @return
     *     possible object is
     *     {@link BalTransStatusType }
     *     
     */
    public BalTransStatusType getBalTransStatusDtls() {
        return balTransStatusDtls;
    }

    /**
     * Sets the value of the balTransStatusDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalTransStatusType }
     *     
     */
    public void setBalTransStatusDtls(BalTransStatusType value) {
        this.balTransStatusDtls = value;
    }

}
