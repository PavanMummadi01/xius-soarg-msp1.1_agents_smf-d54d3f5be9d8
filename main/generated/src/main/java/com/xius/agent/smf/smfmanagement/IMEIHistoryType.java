
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IMEIHistoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IMEIHistoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taskPerfomed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskAssignedOn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskPerfomedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IMEIHistoryType", propOrder = {
    "taskPerfomed",
    "taskAssignedOn",
    "taskPerfomedBy",
    "country"
})
public class IMEIHistoryType {

    protected String taskPerfomed;
    protected String taskAssignedOn;
    protected String taskPerfomedBy;
    protected String country;

    /**
     * Gets the value of the taskPerfomed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskPerfomed() {
        return taskPerfomed;
    }

    /**
     * Sets the value of the taskPerfomed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskPerfomed(String value) {
        this.taskPerfomed = value;
    }

    /**
     * Gets the value of the taskAssignedOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskAssignedOn() {
        return taskAssignedOn;
    }

    /**
     * Sets the value of the taskAssignedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskAssignedOn(String value) {
        this.taskAssignedOn = value;
    }

    /**
     * Gets the value of the taskPerfomedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskPerfomedBy() {
        return taskPerfomedBy;
    }

    /**
     * Sets the value of the taskPerfomedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskPerfomedBy(String value) {
        this.taskPerfomedBy = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

}
