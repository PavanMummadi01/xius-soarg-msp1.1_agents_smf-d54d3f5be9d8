
package com.xius.agent.smf.smfmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrepaidRegStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrepaidRegStatusResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="respCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="respDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transRefferenceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regStatusInfo" type="{http://smf.agent.xius.com/SMFManagement.xsd}RegStatusInfoListtype" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="additionalOutput1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalOutput2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrepaidRegStatusResponse", propOrder = {
    "transStatus",
    "respCode",
    "respDescription",
    "transRefferenceID",
    "regStatusInfo",
    "additionalOutput1",
    "additionalOutput2"
})
public class PrepaidRegStatusResponse {

    protected int transStatus;
    protected int respCode;
    @XmlElement(required = true)
    protected String respDescription;
    @XmlElement(required = true)
    protected String transRefferenceID;
    protected List<RegStatusInfoListtype> regStatusInfo;
    protected String additionalOutput1;
    protected String additionalOutput2;

    /**
     * Gets the value of the transStatus property.
     * 
     */
    public int getTransStatus() {
        return transStatus;
    }

    /**
     * Sets the value of the transStatus property.
     * 
     */
    public void setTransStatus(int value) {
        this.transStatus = value;
    }

    /**
     * Gets the value of the respCode property.
     * 
     */
    public int getRespCode() {
        return respCode;
    }

    /**
     * Sets the value of the respCode property.
     * 
     */
    public void setRespCode(int value) {
        this.respCode = value;
    }

    /**
     * Gets the value of the respDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespDescription() {
        return respDescription;
    }

    /**
     * Sets the value of the respDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespDescription(String value) {
        this.respDescription = value;
    }

    /**
     * Gets the value of the transRefferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransRefferenceID() {
        return transRefferenceID;
    }

    /**
     * Sets the value of the transRefferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransRefferenceID(String value) {
        this.transRefferenceID = value;
    }

    /**
     * Gets the value of the regStatusInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regStatusInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegStatusInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegStatusInfoListtype }
     * 
     * 
     */
    public List<RegStatusInfoListtype> getRegStatusInfo() {
        if (regStatusInfo == null) {
            regStatusInfo = new ArrayList<RegStatusInfoListtype>();
        }
        return this.regStatusInfo;
    }

    /**
     * Gets the value of the additionalOutput1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalOutput1() {
        return additionalOutput1;
    }

    /**
     * Sets the value of the additionalOutput1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalOutput1(String value) {
        this.additionalOutput1 = value;
    }

    /**
     * Gets the value of the additionalOutput2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalOutput2() {
        return additionalOutput2;
    }

    /**
     * Sets the value of the additionalOutput2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalOutput2(String value) {
        this.additionalOutput2 = value;
    }

}
