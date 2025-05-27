
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateEMADetailsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateEMADetailsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emaCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateEMADetailsRequest", propOrder = {
    "emaID",
    "emaCommand"
})
public class UpdateEMADetailsRequest {

    protected String emaID;
    protected String emaCommand;

    /**
     * Gets the value of the emaID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmaID() {
        return emaID;
    }

    /**
     * Sets the value of the emaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmaID(String value) {
        this.emaID = value;
    }

    /**
     * Gets the value of the emaCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmaCommand() {
        return emaCommand;
    }

    /**
     * Sets the value of the emaCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmaCommand(String value) {
        this.emaCommand = value;
    }

}
