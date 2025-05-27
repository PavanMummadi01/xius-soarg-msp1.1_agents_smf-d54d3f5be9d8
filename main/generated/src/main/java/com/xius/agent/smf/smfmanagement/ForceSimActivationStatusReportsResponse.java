
package com.xius.agent.smf.smfmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForceSimActivationStatusReportsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForceSimActivationStatusReportsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ForceSimActivationStatusReportsList" type="{http://smf.agent.xius.com/SMFManagement.xsd}ForceActivationStatusReportsListType" maxOccurs="unbounded"/>
 *         &lt;element name="ForceSimActivationLists" type="{http://smf.agent.xius.com/SMFManagement.xsd}ForceActivationListType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForceSimActivationStatusReportsResponse", propOrder = {
    "forceSimActivationStatusReportsList",
    "forceSimActivationLists"
})
public class ForceSimActivationStatusReportsResponse {

    @XmlElement(name = "ForceSimActivationStatusReportsList")
    protected List<ForceActivationStatusReportsListType> forceSimActivationStatusReportsList;
    @XmlElement(name = "ForceSimActivationLists")
    protected ForceActivationListType forceSimActivationLists;

    /**
     * Gets the value of the forceSimActivationStatusReportsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forceSimActivationStatusReportsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForceSimActivationStatusReportsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForceActivationStatusReportsListType }
     * 
     * 
     */
    public List<ForceActivationStatusReportsListType> getForceSimActivationStatusReportsList() {
        if (forceSimActivationStatusReportsList == null) {
            forceSimActivationStatusReportsList = new ArrayList<ForceActivationStatusReportsListType>();
        }
        return this.forceSimActivationStatusReportsList;
    }

    /**
     * Gets the value of the forceSimActivationLists property.
     * 
     * @return
     *     possible object is
     *     {@link ForceActivationListType }
     *     
     */
    public ForceActivationListType getForceSimActivationLists() {
        return forceSimActivationLists;
    }

    /**
     * Sets the value of the forceSimActivationLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceActivationListType }
     *     
     */
    public void setForceSimActivationLists(ForceActivationListType value) {
        this.forceSimActivationLists = value;
    }

}
