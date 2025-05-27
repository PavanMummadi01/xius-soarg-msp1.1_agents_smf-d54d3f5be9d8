
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimRegistrationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimRegistrationRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDType" type="{http://smf.agent.xius.com/SMFManagement.xsd}IDType" minOccurs="0"/>
 *         &lt;element name="IDvalue" type="{http://smf.agent.xius.com/SMFManagement.xsd}IDNoType" minOccurs="0"/>
 *         &lt;element name="SIM" type="{http://smf.agent.xius.com/SMFManagement.xsd}SIMType" minOccurs="0"/>
 *         &lt;element name="transRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNA" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NIR" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UserDefined1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimRegistrationRequest", propOrder = {
    "idType",
    "iDvalue",
    "sim",
    "transRefNumber",
    "channel",
    "tpid",
    "sna",
    "nir",
    "userDefined1"
})
public class SimRegistrationRequest {

    @XmlElement(name = "IDType")
    protected String idType;
    @XmlElement(name = "IDvalue")
    protected String iDvalue;
    @XmlElement(name = "SIM")
    protected String sim;
    protected String transRefNumber;
    protected String channel;
    @XmlElement(name = "TPID")
    protected String tpid;
    @XmlElement(name = "SNA")
    protected Long sna;
    @XmlElement(name = "NIR")
    protected Long nir;
    @XmlElement(name = "UserDefined1")
    protected String userDefined1;

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDType() {
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
    public void setIDType(String value) {
        this.idType = value;
    }

    /**
     * Gets the value of the iDvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDvalue() {
        return iDvalue;
    }

    /**
     * Sets the value of the iDvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDvalue(String value) {
        this.iDvalue = value;
    }

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
     * Gets the value of the transRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransRefNumber() {
        return transRefNumber;
    }

    /**
     * Sets the value of the transRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransRefNumber(String value) {
        this.transRefNumber = value;
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
     * Gets the value of the tpid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPID() {
        return tpid;
    }

    /**
     * Sets the value of the tpid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPID(String value) {
        this.tpid = value;
    }

    /**
     * Gets the value of the sna property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSNA() {
        return sna;
    }

    /**
     * Sets the value of the sna property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSNA(Long value) {
        this.sna = value;
    }

    /**
     * Gets the value of the nir property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNIR() {
        return nir;
    }

    /**
     * Sets the value of the nir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNIR(Long value) {
        this.nir = value;
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

}
