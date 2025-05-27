
package com.xius.agent.smf.smfmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BulkSimSwapStatusReportsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BulkSimSwapStatusReportsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="SimSwapStatusReportsList" type="{http://smf.agent.xius.com/SMFManagement.xsd}SimSwapStatusReportsListType" maxOccurs="unbounded"/>
 *         &lt;element name="SimSwapList" type="{http://smf.agent.xius.com/SMFManagement.xsd}SimSwapListType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BulkSimSwapStatusReportsResponse", propOrder = {
    "simSwapStatusReportsList",
    "simSwapList"
})
public class BulkSimSwapStatusReportsResponse {

    @XmlElement(name = "SimSwapStatusReportsList")
    protected List<SimSwapStatusReportsListType> simSwapStatusReportsList;
    @XmlElement(name = "SimSwapList")
    protected SimSwapListType simSwapList;

    /**
     * Gets the value of the simSwapStatusReportsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simSwapStatusReportsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimSwapStatusReportsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimSwapStatusReportsListType }
     * 
     * 
     */
    public List<SimSwapStatusReportsListType> getSimSwapStatusReportsList() {
        if (simSwapStatusReportsList == null) {
            simSwapStatusReportsList = new ArrayList<SimSwapStatusReportsListType>();
        }
        return this.simSwapStatusReportsList;
    }

    /**
     * Gets the value of the simSwapList property.
     * 
     * @return
     *     possible object is
     *     {@link SimSwapListType }
     *     
     */
    public SimSwapListType getSimSwapList() {
        return simSwapList;
    }

    /**
     * Sets the value of the simSwapList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimSwapListType }
     *     
     */
    public void setSimSwapList(SimSwapListType value) {
        this.simSwapList = value;
    }

}
