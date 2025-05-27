
package com.xius.agent.smf.smfmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HlrCmdReportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HlrCmdReportResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HlrCmdReportDetails" type="{http://smf.agent.xius.com/SMFManagement.xsd}HlrCmdReportType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HlrCmdReportResponse", propOrder = {
    "hlrCmdReportDetails",
    "message"
})
public class HlrCmdReportResponse {

    @XmlElement(name = "HlrCmdReportDetails")
    protected List<HlrCmdReportType> hlrCmdReportDetails;
    protected String message;

    /**
     * Gets the value of the hlrCmdReportDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hlrCmdReportDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHlrCmdReportDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HlrCmdReportType }
     * 
     * 
     */
    public List<HlrCmdReportType> getHlrCmdReportDetails() {
        if (hlrCmdReportDetails == null) {
            hlrCmdReportDetails = new ArrayList<HlrCmdReportType>();
        }
        return this.hlrCmdReportDetails;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
