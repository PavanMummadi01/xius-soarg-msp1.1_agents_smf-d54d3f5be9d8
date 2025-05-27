
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrepaidActivationinsertRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrepaidActivationinsertRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressInfo" type="{http://smf.agent.xius.com/SMFManagement.xsd}subcriberAddressInfo" minOccurs="0"/>
 *         &lt;element name="isCorp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="dealerUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initiatedFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="msisdnInfo" type="{http://smf.agent.xius.com/SMFManagement.xsd}MSISDNInfo" minOccurs="0"/>
 *         &lt;element name="networkName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="officeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherInfo" type="{http://smf.agent.xius.com/SMFManagement.xsd}subscriberOtherInfo" minOccurs="0"/>
 *         &lt;element name="personalInfo" type="{http://smf.agent.xius.com/SMFManagement.xsd}subcriberPersonalInfo"/>
 *         &lt;element name="promoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registrationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="registrationType" type="{http://smf.agent.xius.com/SMFManagement.xsd}RegistrationType" minOccurs="0"/>
 *         &lt;element name="securityId" type="{http://smf.agent.xius.com/SMFManagement.xsd}SecurityId"/>
 *         &lt;element name="serviceContext" type="{http://smf.agent.xius.com/SMFManagement.xsd}ServiceContext"/>
 *         &lt;element name="tariffPackageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscriberStatus" type="{http://smf.agent.xius.com/SMFManagement.xsd}SelfcareAccountStatusType" minOccurs="0"/>
 *         &lt;element name="userType" type="{http://smf.agent.xius.com/SMFManagement.xsd}UserType"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrepaidActivationinsertRequest", propOrder = {
    "addressInfo",
    "isCorp",
    "dealerUserId",
    "initiatedFrom",
    "locationCode",
    "messageID",
    "msisdnInfo",
    "networkName",
    "officeCode",
    "orderID",
    "otherInfo",
    "personalInfo",
    "promoCode",
    "registrationRequired",
    "registrationType",
    "securityId",
    "serviceContext",
    "tariffPackageId",
    "subscriberStatus",
    "userType",
    "version",
    "sna",
    "transactionID"
})
public class PrepaidActivationinsertRequest {

    protected SubcriberAddressInfo addressInfo;
    protected Boolean isCorp;
    protected String dealerUserId;
    protected String initiatedFrom;
    protected String locationCode;
    @XmlElement(required = true)
    protected String messageID;
    protected MSISDNInfo msisdnInfo;
    protected String networkName;
    protected String officeCode;
    protected String orderID;
    protected SubscriberOtherInfo otherInfo;
    @XmlElement(required = true)
    protected SubcriberPersonalInfo personalInfo;
    protected String promoCode;
    protected Boolean registrationRequired;
    protected RegistrationType registrationType;
    @XmlElement(required = true)
    protected SecurityId securityId;
    @XmlElement(required = true)
    protected ServiceContext serviceContext;
    protected String tariffPackageId;
    protected SelfcareAccountStatusType subscriberStatus;
    @XmlElement(required = true)
    protected UserType userType;
    @XmlElement(nillable = true)
    protected String version;
    @XmlElement(name = "SNA")
    protected String sna;
    protected String transactionID;

    /**
     * Gets the value of the addressInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SubcriberAddressInfo }
     *     
     */
    public SubcriberAddressInfo getAddressInfo() {
        return addressInfo;
    }

    /**
     * Sets the value of the addressInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubcriberAddressInfo }
     *     
     */
    public void setAddressInfo(SubcriberAddressInfo value) {
        this.addressInfo = value;
    }

    /**
     * Gets the value of the isCorp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCorp() {
        return isCorp;
    }

    /**
     * Sets the value of the isCorp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCorp(Boolean value) {
        this.isCorp = value;
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
     * Gets the value of the initiatedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatedFrom() {
        return initiatedFrom;
    }

    /**
     * Sets the value of the initiatedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatedFrom(String value) {
        this.initiatedFrom = value;
    }

    /**
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageID(String value) {
        this.messageID = value;
    }

    /**
     * Gets the value of the msisdnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MSISDNInfo }
     *     
     */
    public MSISDNInfo getMsisdnInfo() {
        return msisdnInfo;
    }

    /**
     * Sets the value of the msisdnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSISDNInfo }
     *     
     */
    public void setMsisdnInfo(MSISDNInfo value) {
        this.msisdnInfo = value;
    }

    /**
     * Gets the value of the networkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkName() {
        return networkName;
    }

    /**
     * Sets the value of the networkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkName(String value) {
        this.networkName = value;
    }

    /**
     * Gets the value of the officeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeCode() {
        return officeCode;
    }

    /**
     * Sets the value of the officeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeCode(String value) {
        this.officeCode = value;
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
     * Gets the value of the otherInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberOtherInfo }
     *     
     */
    public SubscriberOtherInfo getOtherInfo() {
        return otherInfo;
    }

    /**
     * Sets the value of the otherInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberOtherInfo }
     *     
     */
    public void setOtherInfo(SubscriberOtherInfo value) {
        this.otherInfo = value;
    }

    /**
     * Gets the value of the personalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SubcriberPersonalInfo }
     *     
     */
    public SubcriberPersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    /**
     * Sets the value of the personalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubcriberPersonalInfo }
     *     
     */
    public void setPersonalInfo(SubcriberPersonalInfo value) {
        this.personalInfo = value;
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
     * Gets the value of the registrationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegistrationRequired() {
        return registrationRequired;
    }

    /**
     * Sets the value of the registrationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegistrationRequired(Boolean value) {
        this.registrationRequired = value;
    }

    /**
     * Gets the value of the registrationType property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationType }
     *     
     */
    public RegistrationType getRegistrationType() {
        return registrationType;
    }

    /**
     * Sets the value of the registrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationType }
     *     
     */
    public void setRegistrationType(RegistrationType value) {
        this.registrationType = value;
    }

    /**
     * Gets the value of the securityId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityId }
     *     
     */
    public SecurityId getSecurityId() {
        return securityId;
    }

    /**
     * Sets the value of the securityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityId }
     *     
     */
    public void setSecurityId(SecurityId value) {
        this.securityId = value;
    }

    /**
     * Gets the value of the serviceContext property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceContext }
     *     
     */
    public ServiceContext getServiceContext() {
        return serviceContext;
    }

    /**
     * Sets the value of the serviceContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceContext }
     *     
     */
    public void setServiceContext(ServiceContext value) {
        this.serviceContext = value;
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
     * Gets the value of the subscriberStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SelfcareAccountStatusType }
     *     
     */
    public SelfcareAccountStatusType getSubscriberStatus() {
        return subscriberStatus;
    }

    /**
     * Sets the value of the subscriberStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelfcareAccountStatusType }
     *     
     */
    public void setSubscriberStatus(SelfcareAccountStatusType value) {
        this.subscriberStatus = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setUserType(UserType value) {
        this.userType = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the sna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNA() {
        return sna;
    }

    /**
     * Sets the value of the sna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNA(String value) {
        this.sna = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

}
