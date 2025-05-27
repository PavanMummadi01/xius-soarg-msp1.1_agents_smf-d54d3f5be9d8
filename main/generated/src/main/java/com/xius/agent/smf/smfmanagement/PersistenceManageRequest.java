
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersistenceManageRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersistenceManageRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="persistenceManageType" type="{http://smf.agent.xius.com/SMFManagement.xsd}PersistenceManage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersistenceManageRequest", propOrder = {
    "persistenceManageType"
})
public class PersistenceManageRequest {

    protected PersistenceManage persistenceManageType;

    /**
     * Gets the value of the persistenceManageType property.
     * 
     * @return
     *     possible object is
     *     {@link PersistenceManage }
     *     
     */
    public PersistenceManage getPersistenceManageType() {
        return persistenceManageType;
    }

    /**
     * Sets the value of the persistenceManageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersistenceManage }
     *     
     */
    public void setPersistenceManageType(PersistenceManage value) {
        this.persistenceManageType = value;
    }

}
