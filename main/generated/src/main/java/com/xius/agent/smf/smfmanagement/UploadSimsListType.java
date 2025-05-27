
package com.xius.agent.smf.smfmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UploadSimsListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadSimsListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommaSeparatedSIMSList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadSimsListType", propOrder = {
    "commaSeparatedSIMSList"
})
public class UploadSimsListType {

    @XmlElement(name = "CommaSeparatedSIMSList", required = true)
    protected List<String> commaSeparatedSIMSList;

    /**
     * Gets the value of the commaSeparatedSIMSList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commaSeparatedSIMSList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommaSeparatedSIMSList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCommaSeparatedSIMSList() {
        if (commaSeparatedSIMSList == null) {
            commaSeparatedSIMSList = new ArrayList<String>();
        }
        return this.commaSeparatedSIMSList;
    }

}
