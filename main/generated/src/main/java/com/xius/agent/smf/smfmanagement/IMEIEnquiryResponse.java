
package com.xius.agent.smf.smfmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="respCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="respDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GSMARefCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GSMAStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recordIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="blacklistStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="greylistStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marketingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="band" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatingSys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nfc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bluetooth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WLAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IMEIHistory" type="{http://smf.agent.xius.com/SMFManagement.xsd}IMEIHistoryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "respCode",
    "respDescription",
    "gsmaRefCode",
    "gsmaStatus",
    "deviceId",
    "partnerId",
    "branchId",
    "recordIdentifier",
    "blacklistStatus",
    "greylistStatus",
    "manufacturer",
    "brandName",
    "marketingName",
    "modelName",
    "band",
    "operatingSys",
    "nfc",
    "bluetooth",
    "wlan",
    "deviceType",
    "imeiHistory"
})
@XmlRootElement(name = "IMEIEnquiryResponse")
public class IMEIEnquiryResponse {

    protected String respCode;
    protected String respDescription;
    @XmlElement(name = "GSMARefCode")
    protected String gsmaRefCode;
    @XmlElement(name = "GSMAStatus")
    protected String gsmaStatus;
    protected String deviceId;
    protected String partnerId;
    protected String branchId;
    protected String recordIdentifier;
    protected String blacklistStatus;
    protected String greylistStatus;
    protected String manufacturer;
    protected String brandName;
    protected String marketingName;
    protected String modelName;
    protected String band;
    protected String operatingSys;
    protected String nfc;
    protected String bluetooth;
    @XmlElement(name = "WLAN")
    protected String wlan;
    protected String deviceType;
    @XmlElement(name = "IMEIHistory")
    protected List<IMEIHistoryType> imeiHistory;

    /**
     * Gets the value of the respCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespCode() {
        return respCode;
    }

    /**
     * Sets the value of the respCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespCode(String value) {
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
     * Gets the value of the gsmaRefCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSMARefCode() {
        return gsmaRefCode;
    }

    /**
     * Sets the value of the gsmaRefCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSMARefCode(String value) {
        this.gsmaRefCode = value;
    }

    /**
     * Gets the value of the gsmaStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSMAStatus() {
        return gsmaStatus;
    }

    /**
     * Sets the value of the gsmaStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSMAStatus(String value) {
        this.gsmaStatus = value;
    }

    /**
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the partnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * Sets the value of the partnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerId(String value) {
        this.partnerId = value;
    }

    /**
     * Gets the value of the branchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchId(String value) {
        this.branchId = value;
    }

    /**
     * Gets the value of the recordIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordIdentifier() {
        return recordIdentifier;
    }

    /**
     * Sets the value of the recordIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordIdentifier(String value) {
        this.recordIdentifier = value;
    }

    /**
     * Gets the value of the blacklistStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlacklistStatus() {
        return blacklistStatus;
    }

    /**
     * Sets the value of the blacklistStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlacklistStatus(String value) {
        this.blacklistStatus = value;
    }

    /**
     * Gets the value of the greylistStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGreylistStatus() {
        return greylistStatus;
    }

    /**
     * Sets the value of the greylistStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGreylistStatus(String value) {
        this.greylistStatus = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the brandName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * Sets the value of the brandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandName(String value) {
        this.brandName = value;
    }

    /**
     * Gets the value of the marketingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingName() {
        return marketingName;
    }

    /**
     * Sets the value of the marketingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingName(String value) {
        this.marketingName = value;
    }

    /**
     * Gets the value of the modelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Sets the value of the modelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * Gets the value of the band property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBand() {
        return band;
    }

    /**
     * Sets the value of the band property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBand(String value) {
        this.band = value;
    }

    /**
     * Gets the value of the operatingSys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingSys() {
        return operatingSys;
    }

    /**
     * Sets the value of the operatingSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingSys(String value) {
        this.operatingSys = value;
    }

    /**
     * Gets the value of the nfc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNfc() {
        return nfc;
    }

    /**
     * Sets the value of the nfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNfc(String value) {
        this.nfc = value;
    }

    /**
     * Gets the value of the bluetooth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBluetooth() {
        return bluetooth;
    }

    /**
     * Sets the value of the bluetooth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBluetooth(String value) {
        this.bluetooth = value;
    }

    /**
     * Gets the value of the wlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWLAN() {
        return wlan;
    }

    /**
     * Sets the value of the wlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWLAN(String value) {
        this.wlan = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceType(String value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the imeiHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imeiHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIMEIHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IMEIHistoryType }
     * 
     * 
     */
    public List<IMEIHistoryType> getIMEIHistory() {
        if (imeiHistory == null) {
            imeiHistory = new ArrayList<IMEIHistoryType>();
        }
        return this.imeiHistory;
    }

}
