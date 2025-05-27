
package com.xius.agent.smf.postpaidmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for postpaidRegistrationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="postpaidRegistrationRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="msisdnInfo" type="{http://smf.agent.xius.com/PostPaidManagement.xsd}MSISDNInfotype"/>
 *         &lt;element name="dealerUserId" type="{http://smf.agent.xius.com/PostPaidManagement.xsd}UserIDType" minOccurs="0"/>
 *         &lt;element name="personalInfo" type="{http://smf.agent.xius.com/PostPaidManagement.xsd}subcriberPersonalInfotype"/>
 *         &lt;element name="addressInfo" type="{http://smf.agent.xius.com/PostPaidManagement.xsd}subcriberAddressInfotype"/>
 *         &lt;element name="orderID" type="{http://smf.agent.xius.com/PostPaidManagement.xsd}OrderIDType" minOccurs="0"/>
 *         &lt;element name="userType" type="{http://smf.agent.xius.com/PostPaidManagement.xsd}UserIDType"/>
 *         &lt;element name="postpaidDetails" type="{http://smf.agent.xius.com/PostPaidManagement.xsd}PostpaidDetails" minOccurs="0"/>
 *         &lt;element name="tariffPackageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isMainLine" type="{http://smf.agent.xius.com/PostPaidManagement.xsd}flagType" minOccurs="0"/>
 *         &lt;element name="isSubLine" type="{http://smf.agent.xius.com/PostPaidManagement.xsd}flagType" minOccurs="0"/>
 *         &lt;element name="subLineInfo" type="{http://smf.agent.xius.com/PostPaidManagement.xsd}subLineInfoListType" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="userDefined1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userDefined2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "postpaidRegistrationRequest", propOrder = {
    "msisdnInfo",
    "dealerUserId",
    "personalInfo",
    "addressInfo",
    "orderID",
    "userType",
    "postpaidDetails",
    "tariffPackageId",
    "promoCode",
    "isMainLine",
    "isSubLine",
    "subLineInfo",
    "userDefined1",
    "userDefined2"
})
public class PostpaidRegistrationRequest {

    @XmlElement(required = true)
    protected MSISDNInfotype msisdnInfo;
    protected String dealerUserId;
    @XmlElement(required = true)
    protected SubcriberPersonalInfotype personalInfo;
    @XmlElement(required = true)
    protected SubcriberAddressInfotype addressInfo;
    protected String orderID;
    @XmlElement(required = true)
    protected String userType;
    protected PostpaidDetails postpaidDetails;
    protected String tariffPackageId;
    protected String promoCode;
    protected String isMainLine;
    protected String isSubLine;
    protected List<SubLineInfoListType> subLineInfo;
    protected String userDefined1;
    protected String userDefined2;

    /**
     * Gets the value of the msisdnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MSISDNInfotype }
     *     
     */
    public MSISDNInfotype getMsisdnInfo() {
        return msisdnInfo;
    }

    /**
     * Sets the value of the msisdnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSISDNInfotype }
     *     
     */
    public void setMsisdnInfo(MSISDNInfotype value) {
        this.msisdnInfo = value;
    }

    /**
     * Gets the value of the dealerUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerUserId() {
        return dealerUserId;
    }

    /**
     * Sets the value of the dealerUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerUserId(String value) {
        this.dealerUserId = value;
    }

    /**
     * Gets the value of the personalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SubcriberPersonalInfotype }
     *     
     */
    public SubcriberPersonalInfotype getPersonalInfo() {
        return personalInfo;
    }

    /**
     * Sets the value of the personalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubcriberPersonalInfotype }
     *     
     */
    public void setPersonalInfo(SubcriberPersonalInfotype value) {
        this.personalInfo = value;
    }

    /**
     * Gets the value of the addressInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SubcriberAddressInfotype }
     *     
     */
    public SubcriberAddressInfotype getAddressInfo() {
        return addressInfo;
    }

    /**
     * Sets the value of the addressInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubcriberAddressInfotype }
     *     
     */
    public void setAddressInfo(SubcriberAddressInfotype value) {
        this.addressInfo = value;
    }

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

    /**
     * Gets the value of the postpaidDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PostpaidDetails }
     *     
     */
    public PostpaidDetails getPostpaidDetails() {
        return postpaidDetails;
    }

    /**
     * Sets the value of the postpaidDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostpaidDetails }
     *     
     */
    public void setPostpaidDetails(PostpaidDetails value) {
        this.postpaidDetails = value;
    }

    /**
     * Gets the value of the tariffPackageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffPackageId() {
        return tariffPackageId;
    }

    /**
     * Sets the value of the tariffPackageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffPackageId(String value) {
        this.tariffPackageId = value;
    }

    /**
     * Gets the value of the promoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoCode() {
        return promoCode;
    }

    /**
     * Sets the value of the promoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoCode(String value) {
        this.promoCode = value;
    }

    /**
     * Gets the value of the isMainLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMainLine() {
        return isMainLine;
    }

    /**
     * Sets the value of the isMainLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMainLine(String value) {
        this.isMainLine = value;
    }

    /**
     * Gets the value of the isSubLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSubLine() {
        return isSubLine;
    }

    /**
     * Sets the value of the isSubLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSubLine(String value) {
        this.isSubLine = value;
    }

    /**
     * Gets the value of the subLineInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subLineInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubLineInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubLineInfoListType }
     * 
     * 
     */
    public List<SubLineInfoListType> getSubLineInfo() {
        if (subLineInfo == null) {
            subLineInfo = new ArrayList<SubLineInfoListType>();
        }
        return this.subLineInfo;
    }

    /**
     * Gets the value of the userDefined1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDefined1() {
        return userDefined1;
    }

    /**
     * Sets the value of the userDefined1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDefined1(String value) {
        this.userDefined1 = value;
    }

    /**
     * Gets the value of the userDefined2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDefined2() {
        return userDefined2;
    }

    /**
     * Sets the value of the userDefined2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDefined2(String value) {
        this.userDefined2 = value;
    }

}
