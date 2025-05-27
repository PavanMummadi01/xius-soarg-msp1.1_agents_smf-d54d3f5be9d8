
package com.xius.agent.smf.smfmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BulkMDNRegActStatusReportsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BulkMDNRegActStatusReportsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="MDNRegActStatusReportsList" type="{http://smf.agent.xius.com/SMFManagement.xsd}MDNRegActStatusReportsListType" maxOccurs="unbounded"/>
 *         &lt;element name="MSISDNsList" type="{http://smf.agent.xius.com/SMFManagement.xsd}UploadMSISDNListType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BulkMDNRegActStatusReportsResponse", propOrder = {
    "mdnRegActStatusReportsList",
    "msisdNsList"
})
public class BulkMDNRegActStatusReportsResponse {

    @XmlElement(name = "MDNRegActStatusReportsList")
    protected List<MDNRegActStatusReportsListType> mdnRegActStatusReportsList;
    @XmlElement(name = "MSISDNsList")
    protected UploadMSISDNListType msisdNsList;

    /**
     * Gets the value of the mdnRegActStatusReportsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mdnRegActStatusReportsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMDNRegActStatusReportsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDNRegActStatusReportsListType }
     * 
     * 
     */
    public List<MDNRegActStatusReportsListType> getMDNRegActStatusReportsList() {
        if (mdnRegActStatusReportsList == null) {
            mdnRegActStatusReportsList = new ArrayList<MDNRegActStatusReportsListType>();
        }
        return this.mdnRegActStatusReportsList;
    }

    /**
     * Gets the value of the msisdNsList property.
     * 
     * @return
     *     possible object is
     *     {@link UploadMSISDNListType }
     *     
     */
    public UploadMSISDNListType getMSISDNsList() {
        return msisdNsList;
    }

    /**
     * Sets the value of the msisdNsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadMSISDNListType }
     *     
     */
    public void setMSISDNsList(UploadMSISDNListType value) {
        this.msisdNsList = value;
    }

}
