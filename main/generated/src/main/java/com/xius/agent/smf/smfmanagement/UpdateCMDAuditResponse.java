
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateCMDAuditResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateCMDAuditResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Messsge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateCMDAuditResponse", propOrder = {
    "messsge"
})
public class UpdateCMDAuditResponse {

    @XmlElement(name = "Messsge")
    protected String messsge;

    /**
     * Gets the value of the messsge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMesssge() {
        return messsge;
    }

    /**
     * Sets the value of the messsge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMesssge(String value) {
        this.messsge = value;
    }

}
