
package com.xius.agent.smf.smfmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for blkActDeActReportsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="blkActDeActReportsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="blkActDeActReportsList" type="{http://smf.agent.xius.com/SMFManagement.xsd}blkActDeActReportsListType" maxOccurs="unbounded"/>
 *         &lt;element name="blkActDeActLists" type="{http://smf.agent.xius.com/SMFManagement.xsd}blkActDeActListType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "blkActDeActReportsResponse", propOrder = {
    "blkActDeActReportsList",
    "blkActDeActLists"
})
public class BlkActDeActReportsResponse {

    protected List<BlkActDeActReportsListType> blkActDeActReportsList;
    protected BlkActDeActListType blkActDeActLists;

    /**
     * Gets the value of the blkActDeActReportsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blkActDeActReportsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlkActDeActReportsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BlkActDeActReportsListType }
     * 
     * 
     */
    public List<BlkActDeActReportsListType> getBlkActDeActReportsList() {
        if (blkActDeActReportsList == null) {
            blkActDeActReportsList = new ArrayList<BlkActDeActReportsListType>();
        }
        return this.blkActDeActReportsList;
    }

    /**
     * Gets the value of the blkActDeActLists property.
     * 
     * @return
     *     possible object is
     *     {@link BlkActDeActListType }
     *     
     */
    public BlkActDeActListType getBlkActDeActLists() {
        return blkActDeActLists;
    }

    /**
     * Sets the value of the blkActDeActLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlkActDeActListType }
     *     
     */
    public void setBlkActDeActLists(BlkActDeActListType value) {
        this.blkActDeActLists = value;
    }

}
