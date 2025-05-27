
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestAPIUserAuthRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RestAPIUserAuthRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mspapi_privilege_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestAPIUserAuthRequest", propOrder = {
    "mspapiPrivilegeId"
})
public class RestAPIUserAuthRequest {

    @XmlElement(name = "mspapi_privilege_id", required = true)
    protected String mspapiPrivilegeId;

    /**
     * Gets the value of the mspapiPrivilegeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMspapiPrivilegeId() {
        return mspapiPrivilegeId;
    }

    /**
     * Sets the value of the mspapiPrivilegeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMspapiPrivilegeId(String value) {
        this.mspapiPrivilegeId = value;
    }

}
