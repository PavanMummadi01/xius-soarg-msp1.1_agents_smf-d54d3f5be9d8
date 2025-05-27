
package com.xius.agent.smf.smfmanagement;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for simRegTrackerInsertRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="simRegTrackerInsertRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SIM" type="{http://smf.agent.xius.com/SMFManagement.xsd}SIMType"/>
 *         &lt;element name="networkName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SurName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateofBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Billcycleday" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CreditLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="municipoality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetLimits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Colony" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlternateContactNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrafficpackId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="extTransID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserInputField1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserInputField2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserInputField3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserInputField4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserInputField5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DealerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Locationcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PersonalInfoFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OfficeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isCorp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BlockMDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dealerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tpName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urbanization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parish" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userAccountPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simRegTrackerInsertRequest", propOrder = {
    "sim",
    "networkName",
    "idType",
    "idNo",
    "firstName",
    "lastName",
    "surName",
    "dateofBirth",
    "accountType",
    "billcycleday",
    "creditLimit",
    "municipoality",
    "streetLimits",
    "gender",
    "street",
    "colony",
    "city",
    "state",
    "country",
    "postalCode",
    "emailID",
    "alternateContactNo",
    "trafficpackId",
    "extTransID",
    "billType",
    "billFrequency",
    "userInputField1",
    "userInputField2",
    "userInputField3",
    "userInputField4",
    "userInputField5",
    "dealerId",
    "locationcode",
    "personalInfoFlag",
    "channel",
    "officeCode",
    "isCorp",
    "sna",
    "orderId",
    "blockMDN",
    "address1",
    "address2",
    "address3",
    "dealerName",
    "tpName",
    "billDay",
    "urbanization",
    "parish",
    "userAccountName",
    "userAccountPassword",
    "userType"
})
public class SimRegTrackerInsertRequest {

    @XmlElement(name = "SIM", required = true)
    protected String sim;
    protected String networkName;
    protected Long idType;
    protected String idNo;
    protected String firstName;
    protected String lastName;
    @XmlElement(name = "SurName")
    protected String surName;
    @XmlElement(name = "DateofBirth")
    protected String dateofBirth;
    @XmlElement(name = "AccountType")
    protected String accountType;
    @XmlElement(name = "Billcycleday")
    protected Long billcycleday;
    @XmlElement(name = "CreditLimit")
    protected BigDecimal creditLimit;
    protected String municipoality;
    @XmlElement(name = "StreetLimits")
    protected String streetLimits;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "Street")
    protected String street;
    @XmlElement(name = "Colony")
    protected String colony;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "Country")
    protected String country;
    protected String postalCode;
    protected String emailID;
    @XmlElement(name = "AlternateContactNo")
    protected String alternateContactNo;
    @XmlElement(name = "TrafficpackId")
    protected Long trafficpackId;
    protected String extTransID;
    @XmlElement(name = "BillType")
    protected String billType;
    @XmlElement(name = "BillFrequency")
    protected String billFrequency;
    @XmlElement(name = "UserInputField1")
    protected String userInputField1;
    @XmlElement(name = "UserInputField2")
    protected String userInputField2;
    @XmlElement(name = "UserInputField3")
    protected String userInputField3;
    @XmlElement(name = "UserInputField4")
    protected String userInputField4;
    @XmlElement(name = "UserInputField5")
    protected String userInputField5;
    @XmlElement(name = "DealerId")
    protected String dealerId;
    @XmlElement(name = "Locationcode")
    protected Long locationcode;
    @XmlElement(name = "PersonalInfoFlag")
    protected String personalInfoFlag;
    @XmlElement(required = true)
    protected String channel;
    @XmlElement(name = "OfficeCode")
    protected String officeCode;
    protected String isCorp;
    @XmlElement(name = "SNA")
    protected String sna;
    protected String orderId;
    @XmlElement(name = "BlockMDN")
    protected String blockMDN;
    protected String address1;
    protected String address2;
    protected String address3;
    protected String dealerName;
    protected String tpName;
    protected String billDay;
    protected String urbanization;
    protected String parish;
    protected String userAccountName;
    protected String userAccountPassword;
    protected String userType;

    /**
     * Gets the value of the sim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIM() {
        return sim;
    }

    /**
     * Sets the value of the sim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIM(String value) {
        this.sim = value;
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
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdType(Long value) {
        this.idType = value;
    }

    /**
     * Gets the value of the idNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * Sets the value of the idNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNo(String value) {
        this.idNo = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the surName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurName() {
        return surName;
    }

    /**
     * Sets the value of the surName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurName(String value) {
        this.surName = value;
    }

    /**
     * Gets the value of the dateofBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateofBirth() {
        return dateofBirth;
    }

    /**
     * Sets the value of the dateofBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateofBirth(String value) {
        this.dateofBirth = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the billcycleday property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBillcycleday() {
        return billcycleday;
    }

    /**
     * Sets the value of the billcycleday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillcycleday(Long value) {
        this.billcycleday = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditLimit(BigDecimal value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the municipoality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipoality() {
        return municipoality;
    }

    /**
     * Sets the value of the municipoality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipoality(String value) {
        this.municipoality = value;
    }

    /**
     * Gets the value of the streetLimits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetLimits() {
        return streetLimits;
    }

    /**
     * Sets the value of the streetLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetLimits(String value) {
        this.streetLimits = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the colony property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColony() {
        return colony;
    }

    /**
     * Sets the value of the colony property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColony(String value) {
        this.colony = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the emailID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailID() {
        return emailID;
    }

    /**
     * Sets the value of the emailID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailID(String value) {
        this.emailID = value;
    }

    /**
     * Gets the value of the alternateContactNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateContactNo() {
        return alternateContactNo;
    }

    /**
     * Sets the value of the alternateContactNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateContactNo(String value) {
        this.alternateContactNo = value;
    }

    /**
     * Gets the value of the trafficpackId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTrafficpackId() {
        return trafficpackId;
    }

    /**
     * Sets the value of the trafficpackId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTrafficpackId(Long value) {
        this.trafficpackId = value;
    }

    /**
     * Gets the value of the extTransID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtTransID() {
        return extTransID;
    }

    /**
     * Sets the value of the extTransID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtTransID(String value) {
        this.extTransID = value;
    }

    /**
     * Gets the value of the billType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillType() {
        return billType;
    }

    /**
     * Sets the value of the billType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillType(String value) {
        this.billType = value;
    }

    /**
     * Gets the value of the billFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillFrequency() {
        return billFrequency;
    }

    /**
     * Sets the value of the billFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillFrequency(String value) {
        this.billFrequency = value;
    }

    /**
     * Gets the value of the userInputField1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserInputField1() {
        return userInputField1;
    }

    /**
     * Sets the value of the userInputField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserInputField1(String value) {
        this.userInputField1 = value;
    }

    /**
     * Gets the value of the userInputField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserInputField2() {
        return userInputField2;
    }

    /**
     * Sets the value of the userInputField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserInputField2(String value) {
        this.userInputField2 = value;
    }

    /**
     * Gets the value of the userInputField3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserInputField3() {
        return userInputField3;
    }

    /**
     * Sets the value of the userInputField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserInputField3(String value) {
        this.userInputField3 = value;
    }

    /**
     * Gets the value of the userInputField4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserInputField4() {
        return userInputField4;
    }

    /**
     * Sets the value of the userInputField4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserInputField4(String value) {
        this.userInputField4 = value;
    }

    /**
     * Gets the value of the userInputField5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserInputField5() {
        return userInputField5;
    }

    /**
     * Sets the value of the userInputField5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserInputField5(String value) {
        this.userInputField5 = value;
    }

    /**
     * Gets the value of the dealerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerId() {
        return dealerId;
    }

    /**
     * Sets the value of the dealerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerId(String value) {
        this.dealerId = value;
    }

    /**
     * Gets the value of the locationcode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLocationcode() {
        return locationcode;
    }

    /**
     * Sets the value of the locationcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLocationcode(Long value) {
        this.locationcode = value;
    }

    /**
     * Gets the value of the personalInfoFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalInfoFlag() {
        return personalInfoFlag;
    }

    /**
     * Sets the value of the personalInfoFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalInfoFlag(String value) {
        this.personalInfoFlag = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
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
     * Gets the value of the isCorp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsCorp() {
        return isCorp;
    }

    /**
     * Sets the value of the isCorp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsCorp(String value) {
        this.isCorp = value;
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
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the blockMDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockMDN() {
        return blockMDN;
    }

    /**
     * Sets the value of the blockMDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockMDN(String value) {
        this.blockMDN = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the address3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * Sets the value of the address3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress3(String value) {
        this.address3 = value;
    }

    /**
     * Gets the value of the dealerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerName() {
        return dealerName;
    }

    /**
     * Sets the value of the dealerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerName(String value) {
        this.dealerName = value;
    }

    /**
     * Gets the value of the tpName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpName() {
        return tpName;
    }

    /**
     * Sets the value of the tpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpName(String value) {
        this.tpName = value;
    }

    /**
     * Gets the value of the billDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillDay() {
        return billDay;
    }

    /**
     * Sets the value of the billDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillDay(String value) {
        this.billDay = value;
    }

    /**
     * Gets the value of the urbanization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrbanization() {
        return urbanization;
    }

    /**
     * Sets the value of the urbanization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrbanization(String value) {
        this.urbanization = value;
    }

    /**
     * Gets the value of the parish property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParish() {
        return parish;
    }

    /**
     * Sets the value of the parish property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParish(String value) {
        this.parish = value;
    }

    /**
     * Gets the value of the userAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAccountName() {
        return userAccountName;
    }

    /**
     * Sets the value of the userAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAccountName(String value) {
        this.userAccountName = value;
    }

    /**
     * Gets the value of the userAccountPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAccountPassword() {
        return userAccountPassword;
    }

    /**
     * Sets the value of the userAccountPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAccountPassword(String value) {
        this.userAccountPassword = value;
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

}
