
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subscriberOtherInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subscriberOtherInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ethic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderBooking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pleaseSpecify" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceofInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subscriberOtherInfo", propOrder = {
    "ethic",
    "orderBooking",
    "orderInfo",
    "pleaseSpecify",
    "sourceofInfo"
})
public class SubscriberOtherInfo {

    @XmlElement(nillable = true)
    protected String ethic;
    @XmlElement(nillable = true)
    protected String orderBooking;
    @XmlElement(nillable = true)
    protected String orderInfo;
    @XmlElement(nillable = true)
    protected String pleaseSpecify;
    @XmlElement(nillable = true)
    protected String sourceofInfo;

    /**
     * Gets the value of the ethic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEthic() {
        return ethic;
    }

    /**
     * Sets the value of the ethic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEthic(String value) {
        this.ethic = value;
    }

    /**
     * Gets the value of the orderBooking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderBooking() {
        return orderBooking;
    }

    /**
     * Sets the value of the orderBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderBooking(String value) {
        this.orderBooking = value;
    }

    /**
     * Gets the value of the orderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderInfo() {
        return orderInfo;
    }

    /**
     * Sets the value of the orderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderInfo(String value) {
        this.orderInfo = value;
    }

    /**
     * Gets the value of the pleaseSpecify property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPleaseSpecify() {
        return pleaseSpecify;
    }

    /**
     * Sets the value of the pleaseSpecify property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPleaseSpecify(String value) {
        this.pleaseSpecify = value;
    }

    /**
     * Gets the value of the sourceofInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceofInfo() {
        return sourceofInfo;
    }

    /**
     * Sets the value of the sourceofInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceofInfo(String value) {
        this.sourceofInfo = value;
    }

}
