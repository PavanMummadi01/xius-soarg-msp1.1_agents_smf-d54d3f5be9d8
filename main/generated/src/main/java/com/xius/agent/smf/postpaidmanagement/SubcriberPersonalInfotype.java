
package com.xius.agent.smf.postpaidmanagement;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter2;


/**
 * <p>Java class for subcriberPersonalInfotype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subcriberPersonalInfotype">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstName" type="{http://smf.agent.xius.com/PostPaidManagement.xsd}FirstNameType"/>
 *         &lt;element name="lastName" type="{http://smf.agent.xius.com/PostPaidManagement.xsd}LastNameType" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://smf.agent.xius.com/PostPaidManagement.xsd}GenderType"/>
 *         &lt;element name="idType" type="{http://smf.agent.xius.com/PostPaidManagement.xsd}IDType"/>
 *         &lt;element name="idValue" type="{http://smf.agent.xius.com/PostPaidManagement.xsd}IDNoType"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ethnic" type="{http://smf.agent.xius.com/PostPaidManagement.xsd}EthnicType" minOccurs="0"/>
 *         &lt;element name="email" type="{http://smf.agent.xius.com/PostPaidManagement.xsd}EmailType" minOccurs="0"/>
 *         &lt;element name="contactnumber" type="{http://smf.agent.xius.com/PostPaidManagement.xsd}MSISDNType" minOccurs="0"/>
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
@XmlType(name = "subcriberPersonalInfotype", propOrder = {
    "firstName",
    "lastName",
    "gender",
    "idType",
    "idValue",
    "dateOfBirth",
    "ethnic",
    "email",
    "contactnumber",
    "userDefined1",
    "userDefined2"
})
public class SubcriberPersonalInfotype {

    @XmlElement(required = true)
    protected String firstName;
    protected String lastName;
    @XmlElement(required = true)
    protected String gender;
    @XmlElement(required = true)
    protected String idType;
    @XmlElement(required = true)
    protected String idValue;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Date dateOfBirth;
    protected String ethnic;
    protected String email;
    protected String contactnumber;
    protected String userDefined1;
    protected String userDefined2;

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
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdType(String value) {
        this.idType = value;
    }

    /**
     * Gets the value of the idValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdValue() {
        return idValue;
    }

    /**
     * Sets the value of the idValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdValue(String value) {
        this.idValue = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirth(Date value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the ethnic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEthnic() {
        return ethnic;
    }

    /**
     * Sets the value of the ethnic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEthnic(String value) {
        this.ethnic = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the contactnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactnumber() {
        return contactnumber;
    }

    /**
     * Sets the value of the contactnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactnumber(String value) {
        this.contactnumber = value;
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
