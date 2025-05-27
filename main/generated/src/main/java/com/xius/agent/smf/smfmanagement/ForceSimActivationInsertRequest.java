
package com.xius.agent.smf.smfmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForceSimActivationInsertRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForceSimActivationInsertRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SIM" type="{http://smf.agent.xius.com/SMFManagement.xsd}SIMType" maxOccurs="unbounded"/>
 *         &lt;element name="MSISDN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NIR" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SNA" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TPID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NetworkName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForceSimActivationInsertRequest", propOrder = {
    "sim",
    "msisdn",
    "nir",
    "sna",
    "tpid",
    "fileName",
    "networkName"
})
public class ForceSimActivationInsertRequest {

    @XmlElement(name = "SIM", required = true)
    protected List<String> sim;
    @XmlElement(name = "MSISDN")
    protected List<String> msisdn;
    @XmlElement(name = "NIR", type = Long.class)
    protected List<Long> nir;
    @XmlElement(name = "SNA", type = Long.class)
    protected List<Long> sna;
    @XmlElement(name = "TPID")
    protected List<String> tpid;
    @XmlElement(name = "FileName", required = true)
    protected String fileName;
    @XmlElement(name = "NetworkName", required = true)
    protected String networkName;

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
     * Gets the value of the msisdn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the msisdn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMSISDN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMSISDN() {
        if (msisdn == null) {
            msisdn = new ArrayList<String>();
        }
        return this.msisdn;
    }

    /**
     * Gets the value of the nir property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nir property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNIR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getNIR() {
        if (nir == null) {
            nir = new ArrayList<Long>();
        }
        return this.nir;
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

    /**
     * Gets the value of the tpid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTPID() {
        if (tpid == null) {
            tpid = new ArrayList<String>();
        }
        return this.tpid;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
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

}
