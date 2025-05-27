
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for generateTokenResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generateTokenResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tokenLife" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tokenExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tokenExpiryTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generateTokenResponse", propOrder = {
    "token",
    "tokenLife",
    "tokenExpiryDate",
    "tokenExpiryTime"
})
public class GenerateTokenResponse {

    protected String token;
    protected String tokenLife;
    protected String tokenExpiryDate;
    protected String tokenExpiryTime;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the tokenLife property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenLife() {
        return tokenLife;
    }

    /**
     * Sets the value of the tokenLife property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenLife(String value) {
        this.tokenLife = value;
    }

    /**
     * Gets the value of the tokenExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenExpiryDate() {
        return tokenExpiryDate;
    }

    /**
     * Sets the value of the tokenExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenExpiryDate(String value) {
        this.tokenExpiryDate = value;
    }

    /**
     * Gets the value of the tokenExpiryTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenExpiryTime() {
        return tokenExpiryTime;
    }

    /**
     * Sets the value of the tokenExpiryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenExpiryTime(String value) {
        this.tokenExpiryTime = value;
    }

}
