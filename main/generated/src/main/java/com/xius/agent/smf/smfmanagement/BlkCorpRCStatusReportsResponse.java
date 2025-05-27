
package com.xius.agent.smf.smfmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for blkCorpRCStatusReportsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="blkCorpRCStatusReportsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="blkCorpRCStatusReportsList" type="{http://smf.agent.xius.com/SMFManagement.xsd}blkCorpRCStatusReportsListType" maxOccurs="unbounded"/>
 *         &lt;element name="blkCorpRCStatusLists" type="{http://smf.agent.xius.com/SMFManagement.xsd}blkCorpRCStatusListType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "blkCorpRCStatusReportsResponse", propOrder = {
    "blkCorpRCStatusReportsList",
    "blkCorpRCStatusLists"
})
public class BlkCorpRCStatusReportsResponse {

    protected List<BlkCorpRCStatusReportsListType> blkCorpRCStatusReportsList;
    protected BlkCorpRCStatusListType blkCorpRCStatusLists;

    /**
     * Gets the value of the blkCorpRCStatusReportsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blkCorpRCStatusReportsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlkCorpRCStatusReportsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BlkCorpRCStatusReportsListType }
     * 
     * 
     */
    public List<BlkCorpRCStatusReportsListType> getBlkCorpRCStatusReportsList() {
        if (blkCorpRCStatusReportsList == null) {
            blkCorpRCStatusReportsList = new ArrayList<BlkCorpRCStatusReportsListType>();
        }
        return this.blkCorpRCStatusReportsList;
    }

    /**
     * Gets the value of the blkCorpRCStatusLists property.
     * 
     * @return
     *     possible object is
     *     {@link BlkCorpRCStatusListType }
     *     
     */
    public BlkCorpRCStatusListType getBlkCorpRCStatusLists() {
        return blkCorpRCStatusLists;
    }

    /**
     * Sets the value of the blkCorpRCStatusLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlkCorpRCStatusListType }
     *     
     */
    public void setBlkCorpRCStatusLists(BlkCorpRCStatusListType value) {
        this.blkCorpRCStatusLists = value;
    }

}
