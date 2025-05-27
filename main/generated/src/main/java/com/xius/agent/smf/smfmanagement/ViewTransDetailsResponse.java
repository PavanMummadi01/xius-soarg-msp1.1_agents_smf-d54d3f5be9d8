
package com.xius.agent.smf.smfmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ViewTransDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewTransDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ViewTransDetailsList" type="{http://smf.agent.xius.com/SMFManagement.xsd}ViewTransDetailsListType" maxOccurs="unbounded"/>
 *         &lt;element name="DispensedSIMSList" type="{http://smf.agent.xius.com/SMFManagement.xsd}UploadSimsListType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewTransDetailsResponse", propOrder = {
    "viewTransDetailsList",
    "dispensedSIMSList"
})
public class ViewTransDetailsResponse {

    @XmlElement(name = "ViewTransDetailsList")
    protected List<ViewTransDetailsListType> viewTransDetailsList;
    @XmlElement(name = "DispensedSIMSList")
    protected UploadSimsListType dispensedSIMSList;

    /**
     * Gets the value of the viewTransDetailsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viewTransDetailsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViewTransDetailsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ViewTransDetailsListType }
     * 
     * 
     */
    public List<ViewTransDetailsListType> getViewTransDetailsList() {
        if (viewTransDetailsList == null) {
            viewTransDetailsList = new ArrayList<ViewTransDetailsListType>();
        }
        return this.viewTransDetailsList;
    }

    /**
     * Gets the value of the dispensedSIMSList property.
     * 
     * @return
     *     possible object is
     *     {@link UploadSimsListType }
     *     
     */
    public UploadSimsListType getDispensedSIMSList() {
        return dispensedSIMSList;
    }

    /**
     * Sets the value of the dispensedSIMSList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadSimsListType }
     *     
     */
    public void setDispensedSIMSList(UploadSimsListType value) {
        this.dispensedSIMSList = value;
    }

}
