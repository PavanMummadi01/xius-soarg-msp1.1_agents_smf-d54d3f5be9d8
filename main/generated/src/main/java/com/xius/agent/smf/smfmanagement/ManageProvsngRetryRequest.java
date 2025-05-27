
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManageProvsngRetryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManageProvsngRetryRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="manageProvsngRetryType" type="{http://smf.agent.xius.com/SMFManagement.xsd}ManageProvsngRetry" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageProvsngRetryRequest", propOrder = {
    "manageProvsngRetryType"
})
public class ManageProvsngRetryRequest {

    protected ManageProvsngRetry manageProvsngRetryType;

    /**
     * Gets the value of the manageProvsngRetryType property.
     * 
     * @return
     *     possible object is
     *     {@link ManageProvsngRetry }
     *     
     */
    public ManageProvsngRetry getManageProvsngRetryType() {
        return manageProvsngRetryType;
    }

    /**
     * Sets the value of the manageProvsngRetryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManageProvsngRetry }
     *     
     */
    public void setManageProvsngRetryType(ManageProvsngRetry value) {
        this.manageProvsngRetryType = value;
    }

}
