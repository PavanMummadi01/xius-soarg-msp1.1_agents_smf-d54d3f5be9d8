
package com.xius.agent.smf.smfmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TopUpCUGListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopUpCUGListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="topUpCUGData" type="{http://smf.agent.xius.com/SMFManagement.xsd}TopUpCUGDataType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopUpCUGListType", propOrder = {
    "topUpCUGData"
})
public class TopUpCUGListType {

    @XmlElement(required = true)
    protected List<TopUpCUGDataType> topUpCUGData;

    /**
     * Gets the value of the topUpCUGData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topUpCUGData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopUpCUGData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopUpCUGDataType }
     * 
     * 
     */
    public List<TopUpCUGDataType> getTopUpCUGData() {
        if (topUpCUGData == null) {
            topUpCUGData = new ArrayList<TopUpCUGDataType>();
        }
        return this.topUpCUGData;
    }

}
