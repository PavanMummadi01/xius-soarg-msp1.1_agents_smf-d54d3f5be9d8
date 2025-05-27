
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FirstLUBulkInsertResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FirstLUBulkInsertResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refTransId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FirstLUBulkInsertResponse", propOrder = {
    "refTransId"
})
public class FirstLUBulkInsertResponse {

    protected String refTransId;

    /**
     * Gets the value of the refTransId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefTransId() {
        return refTransId;
    }

    /**
     * Sets the value of the refTransId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefTransId(String value) {
        this.refTransId = value;
    }

}
