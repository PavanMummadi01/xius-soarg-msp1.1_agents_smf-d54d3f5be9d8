
package com.xius.agent.smf.smfmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for blkCorpRCStatusListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="blkCorpRCStatusListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="blkCorpRCStatusList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "blkCorpRCStatusListType", propOrder = {
    "blkCorpRCStatusList"
})
public class BlkCorpRCStatusListType {

    @XmlElement(required = true)
    protected List<String> blkCorpRCStatusList;

    /**
     * Gets the value of the blkCorpRCStatusList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blkCorpRCStatusList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlkCorpRCStatusList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBlkCorpRCStatusList() {
        if (blkCorpRCStatusList == null) {
            blkCorpRCStatusList = new ArrayList<String>();
        }
        return this.blkCorpRCStatusList;
    }

}
