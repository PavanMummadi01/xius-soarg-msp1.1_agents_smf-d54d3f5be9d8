
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MsisdnvstariffIdViewResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MsisdnvstariffIdViewResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OldTariffPackID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewTariffPackID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MsisdnvstariffIdViewResponse", propOrder = {
    "oldTariffPackID",
    "newTariffPackID"
})
public class MsisdnvstariffIdViewResponse {

    @XmlElement(name = "OldTariffPackID")
    protected String oldTariffPackID;
    @XmlElement(name = "NewTariffPackID")
    protected String newTariffPackID;

    /**
     * Gets the value of the oldTariffPackID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldTariffPackID() {
        return oldTariffPackID;
    }

    /**
     * Sets the value of the oldTariffPackID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldTariffPackID(String value) {
        this.oldTariffPackID = value;
    }

    /**
     * Gets the value of the newTariffPackID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewTariffPackID() {
        return newTariffPackID;
    }

    /**
     * Sets the value of the newTariffPackID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewTariffPackID(String value) {
        this.newTariffPackID = value;
    }

}
