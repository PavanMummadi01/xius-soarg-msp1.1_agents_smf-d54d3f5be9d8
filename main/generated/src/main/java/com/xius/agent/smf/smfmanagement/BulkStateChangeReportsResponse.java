
package com.xius.agent.smf.smfmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bulkStateChangeReportsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bulkStateChangeReportsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="bulkStateChangeReportsList" type="{http://smf.agent.xius.com/SMFManagement.xsd}bulkStateChangeReportsListType" maxOccurs="unbounded"/>
 *         &lt;element name="bulkStateChangeLists" type="{http://smf.agent.xius.com/SMFManagement.xsd}bulkStateChangeListType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bulkStateChangeReportsResponse", propOrder = {
    "bulkStateChangeReportsList",
    "bulkStateChangeLists"
})
public class BulkStateChangeReportsResponse {

    protected List<BulkStateChangeReportsListType> bulkStateChangeReportsList;
    protected BulkStateChangeListType bulkStateChangeLists;

    /**
     * Gets the value of the bulkStateChangeReportsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bulkStateChangeReportsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBulkStateChangeReportsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BulkStateChangeReportsListType }
     * 
     * 
     */
    public List<BulkStateChangeReportsListType> getBulkStateChangeReportsList() {
        if (bulkStateChangeReportsList == null) {
            bulkStateChangeReportsList = new ArrayList<BulkStateChangeReportsListType>();
        }
        return this.bulkStateChangeReportsList;
    }

    /**
     * Gets the value of the bulkStateChangeLists property.
     * 
     * @return
     *     possible object is
     *     {@link BulkStateChangeListType }
     *     
     */
    public BulkStateChangeListType getBulkStateChangeLists() {
        return bulkStateChangeLists;
    }

    /**
     * Sets the value of the bulkStateChangeLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link BulkStateChangeListType }
     *     
     */
    public void setBulkStateChangeLists(BulkStateChangeListType value) {
        this.bulkStateChangeLists = value;
    }

}
