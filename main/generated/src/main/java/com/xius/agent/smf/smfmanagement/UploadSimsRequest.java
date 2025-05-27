
package com.xius.agent.smf.smfmanagement;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UploadSimsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadSimsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SIM" type="{http://smf.agent.xius.com/SMFManagement.xsd}SIMType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="idType" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="idNo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SurName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DateofBirth" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Billcycleday" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CreditLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="municipoality" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StreetLimits" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Colony" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="emailID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AlternateContactNo" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Trafficpack" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TrafficpackId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InternalNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExternalNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BillType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BillFrequency" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UserInputField1" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UserInputField2" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UserInputField3" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UserInputField4" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UserInputField5" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DealerId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Locationcode" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonalInfoFlag" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfficeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isCorp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNA" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadSimsRequest", propOrder = {
    "sim",
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
    "trafficpack",
    "trafficpackId",
    "internalNumber",
    "externalNumber",
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
    "sna"
})
public class UploadSimsRequest {

    @XmlElement(name = "SIM")
    protected List<String> sim;
    @XmlElement(type = Long.class)
    protected List<Long> idType;
    @XmlElement(nillable = true)
    protected List<String> idNo;
    @XmlElement(nillable = true)
    protected List<String> firstName;
    @XmlElement(nillable = true)
    protected List<String> lastName;
    @XmlElement(name = "SurName", nillable = true)
    protected List<String> surName;
    @XmlElement(name = "DateofBirth", nillable = true)
    protected List<String> dateofBirth;
    @XmlElement(name = "AccountType", nillable = true)
    protected List<String> accountType;
    @XmlElement(name = "Billcycleday", type = Long.class)
    protected List<Long> billcycleday;
    @XmlElement(name = "CreditLimit")
    protected List<BigDecimal> creditLimit;
    @XmlElement(nillable = true)
    protected List<String> municipoality;
    @XmlElement(name = "StreetLimits", nillable = true)
    protected List<String> streetLimits;
    @XmlElement(name = "Gender", nillable = true)
    protected List<String> gender;
    @XmlElement(name = "Street", nillable = true)
    protected List<String> street;
    @XmlElement(name = "Colony", nillable = true)
    protected List<String> colony;
    @XmlElement(name = "City", nillable = true)
    protected List<String> city;
    @XmlElement(name = "State", nillable = true)
    protected List<String> state;
    @XmlElement(name = "Country", nillable = true)
    protected List<String> country;
    protected List<String> postalCode;
    @XmlElement(nillable = true)
    protected List<String> emailID;
    @XmlElement(name = "AlternateContactNo", type = Long.class)
    protected List<Long> alternateContactNo;
    @XmlElement(name = "Trafficpack", nillable = true)
    protected List<String> trafficpack;
    @XmlElement(name = "TrafficpackId", type = Long.class)
    protected List<Long> trafficpackId;
    @XmlElement(name = "InternalNumber", nillable = true)
    protected List<String> internalNumber;
    @XmlElement(name = "ExternalNumber", nillable = true)
    protected List<String> externalNumber;
    @XmlElement(name = "BillType", nillable = true)
    protected List<String> billType;
    @XmlElement(name = "BillFrequency", nillable = true)
    protected List<String> billFrequency;
    @XmlElement(name = "UserInputField1", nillable = true)
    protected List<String> userInputField1;
    @XmlElement(name = "UserInputField2", nillable = true)
    protected List<String> userInputField2;
    @XmlElement(name = "UserInputField3", nillable = true)
    protected List<String> userInputField3;
    @XmlElement(name = "UserInputField4", nillable = true)
    protected List<String> userInputField4;
    @XmlElement(name = "UserInputField5", nillable = true)
    protected List<String> userInputField5;
    @XmlElement(name = "DealerId", nillable = true)
    protected List<String> dealerId;
    @XmlElement(name = "Locationcode", type = Long.class)
    protected List<Long> locationcode;
    @XmlElement(name = "PersonalInfoFlag", nillable = true)
    protected List<String> personalInfoFlag;
    protected String channel;
    @XmlElement(name = "OfficeCode")
    protected String officeCode;
    protected String isCorp;
    @XmlElement(name = "SNA", type = Long.class)
    protected List<Long> sna;

    /**
     * Gets the value of the sim property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sim property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSIM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSIM() {
        if (sim == null) {
            sim = new ArrayList<String>();
        }
        return this.sim;
    }

    /**
     * Gets the value of the idType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getIdType() {
        if (idType == null) {
            idType = new ArrayList<Long>();
        }
        return this.idType;
    }

    /**
     * Gets the value of the idNo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idNo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdNo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdNo() {
        if (idNo == null) {
            idNo = new ArrayList<String>();
        }
        return this.idNo;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the firstName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFirstName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFirstName() {
        if (firstName == null) {
            firstName = new ArrayList<String>();
        }
        return this.firstName;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLastName() {
        if (lastName == null) {
            lastName = new ArrayList<String>();
        }
        return this.lastName;
    }

    /**
     * Gets the value of the surName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSurName() {
        if (surName == null) {
            surName = new ArrayList<String>();
        }
        return this.surName;
    }

    /**
     * Gets the value of the dateofBirth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateofBirth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateofBirth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDateofBirth() {
        if (dateofBirth == null) {
            dateofBirth = new ArrayList<String>();
        }
        return this.dateofBirth;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAccountType() {
        if (accountType == null) {
            accountType = new ArrayList<String>();
        }
        return this.accountType;
    }

    /**
     * Gets the value of the billcycleday property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billcycleday property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillcycleday().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getBillcycleday() {
        if (billcycleday == null) {
            billcycleday = new ArrayList<Long>();
        }
        return this.billcycleday;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getCreditLimit() {
        if (creditLimit == null) {
            creditLimit = new ArrayList<BigDecimal>();
        }
        return this.creditLimit;
    }

    /**
     * Gets the value of the municipoality property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the municipoality property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMunicipoality().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMunicipoality() {
        if (municipoality == null) {
            municipoality = new ArrayList<String>();
        }
        return this.municipoality;
    }

    /**
     * Gets the value of the streetLimits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the streetLimits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreetLimits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStreetLimits() {
        if (streetLimits == null) {
            streetLimits = new ArrayList<String>();
        }
        return this.streetLimits;
    }

    /**
     * Gets the value of the gender property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gender property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGender().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGender() {
        if (gender == null) {
            gender = new ArrayList<String>();
        }
        return this.gender;
    }

    /**
     * Gets the value of the street property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the street property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStreet() {
        if (street == null) {
            street = new ArrayList<String>();
        }
        return this.street;
    }

    /**
     * Gets the value of the colony property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colony property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColony().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getColony() {
        if (colony == null) {
            colony = new ArrayList<String>();
        }
        return this.colony;
    }

    /**
     * Gets the value of the city property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the city property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCity() {
        if (city == null) {
            city = new ArrayList<String>();
        }
        return this.city;
    }

    /**
     * Gets the value of the state property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the state property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getState() {
        if (state == null) {
            state = new ArrayList<String>();
        }
        return this.state;
    }

    /**
     * Gets the value of the country property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the country property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCountry() {
        if (country == null) {
            country = new ArrayList<String>();
        }
        return this.country;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postalCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostalCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPostalCode() {
        if (postalCode == null) {
            postalCode = new ArrayList<String>();
        }
        return this.postalCode;
    }

    /**
     * Gets the value of the emailID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEmailID() {
        if (emailID == null) {
            emailID = new ArrayList<String>();
        }
        return this.emailID;
    }

    /**
     * Gets the value of the alternateContactNo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateContactNo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateContactNo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getAlternateContactNo() {
        if (alternateContactNo == null) {
            alternateContactNo = new ArrayList<Long>();
        }
        return this.alternateContactNo;
    }

    /**
     * Gets the value of the trafficpack property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trafficpack property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrafficpack().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTrafficpack() {
        if (trafficpack == null) {
            trafficpack = new ArrayList<String>();
        }
        return this.trafficpack;
    }

    /**
     * Gets the value of the trafficpackId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trafficpackId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrafficpackId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getTrafficpackId() {
        if (trafficpackId == null) {
            trafficpackId = new ArrayList<Long>();
        }
        return this.trafficpackId;
    }

    /**
     * Gets the value of the internalNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInternalNumber() {
        if (internalNumber == null) {
            internalNumber = new ArrayList<String>();
        }
        return this.internalNumber;
    }

    /**
     * Gets the value of the externalNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExternalNumber() {
        if (externalNumber == null) {
            externalNumber = new ArrayList<String>();
        }
        return this.externalNumber;
    }

    /**
     * Gets the value of the billType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBillType() {
        if (billType == null) {
            billType = new ArrayList<String>();
        }
        return this.billType;
    }

    /**
     * Gets the value of the billFrequency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billFrequency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillFrequency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBillFrequency() {
        if (billFrequency == null) {
            billFrequency = new ArrayList<String>();
        }
        return this.billFrequency;
    }

    /**
     * Gets the value of the userInputField1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userInputField1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserInputField1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUserInputField1() {
        if (userInputField1 == null) {
            userInputField1 = new ArrayList<String>();
        }
        return this.userInputField1;
    }

    /**
     * Gets the value of the userInputField2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userInputField2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserInputField2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUserInputField2() {
        if (userInputField2 == null) {
            userInputField2 = new ArrayList<String>();
        }
        return this.userInputField2;
    }

    /**
     * Gets the value of the userInputField3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userInputField3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserInputField3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUserInputField3() {
        if (userInputField3 == null) {
            userInputField3 = new ArrayList<String>();
        }
        return this.userInputField3;
    }

    /**
     * Gets the value of the userInputField4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userInputField4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserInputField4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUserInputField4() {
        if (userInputField4 == null) {
            userInputField4 = new ArrayList<String>();
        }
        return this.userInputField4;
    }

    /**
     * Gets the value of the userInputField5 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userInputField5 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserInputField5().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUserInputField5() {
        if (userInputField5 == null) {
            userInputField5 = new ArrayList<String>();
        }
        return this.userInputField5;
    }

    /**
     * Gets the value of the dealerId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dealerId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDealerId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDealerId() {
        if (dealerId == null) {
            dealerId = new ArrayList<String>();
        }
        return this.dealerId;
    }

    /**
     * Gets the value of the locationcode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationcode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationcode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getLocationcode() {
        if (locationcode == null) {
            locationcode = new ArrayList<Long>();
        }
        return this.locationcode;
    }

    /**
     * Gets the value of the personalInfoFlag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personalInfoFlag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonalInfoFlag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPersonalInfoFlag() {
        if (personalInfoFlag == null) {
            personalInfoFlag = new ArrayList<String>();
        }
        return this.personalInfoFlag;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sna property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSNA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getSNA() {
        if (sna == null) {
            sna = new ArrayList<Long>();
        }
        return this.sna;
    }

}
