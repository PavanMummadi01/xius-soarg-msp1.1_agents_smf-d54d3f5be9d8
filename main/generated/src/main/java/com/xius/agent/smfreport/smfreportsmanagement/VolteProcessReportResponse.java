
package com.xius.agent.smfreport.smfreportsmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for volteProcessReportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="volteProcessReportResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalRecords" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="volteProcessTransactions" type="{http://smfreport.agent.xius.com/SMFReportsManagement.xsd}volteProcessReportType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "volteProcessReportResponse", propOrder = {
    "totalRecords",
    "volteProcessTransactions"
})
public class VolteProcessReportResponse {

    protected Long totalRecords;
    protected List<VolteProcessReportType> volteProcessTransactions;

    /**
     * Gets the value of the totalRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalRecords() {
        return totalRecords;
    }

    /**
     * Sets the value of the totalRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalRecords(Long value) {
        this.totalRecords = value;
    }

    /**
     * Gets the value of the volteProcessTransactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the volteProcessTransactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVolteProcessTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VolteProcessReportType }
     * 
     * 
     */
    public List<VolteProcessReportType> getVolteProcessTransactions() {
        if (volteProcessTransactions == null) {
            volteProcessTransactions = new ArrayList<VolteProcessReportType>();
        }
        return this.volteProcessTransactions;
    }

}
