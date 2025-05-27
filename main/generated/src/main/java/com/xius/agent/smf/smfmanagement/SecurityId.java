
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="securityToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userAccountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userAccountPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityId", propOrder = {
    "securityToken",
    "userAccountName",
    "userAccountPassword"
})
public class SecurityId {

    @XmlElement(nillable = true)
    protected String securityToken;
    @XmlElement(required = true)
    protected String userAccountName;
    @XmlElement(required = true)
    protected String userAccountPassword;

    /**
     * Gets the value of the securityToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityToken() {
        return securityToken;
    }

    /**
     * Sets the value of the securityToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityToken(String value) {
        this.securityToken = value;
    }

    /**
     * Gets the value of the userAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAccountName() {
        return userAccountName;
    }

    /**
     * Sets the value of the userAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAccountName(String value) {
        this.userAccountName = value;
    }

    /**
     * Gets the value of the userAccountPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAccountPassword() {
        return userAccountPassword;
    }

    /**
     * Sets the value of the userAccountPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAccountPassword(String value) {
        this.userAccountPassword = value;
    }

}
