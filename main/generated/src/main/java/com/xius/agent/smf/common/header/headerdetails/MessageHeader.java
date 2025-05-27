
package com.xius.agent.smf.common.header.headerdetails;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


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
 *         &lt;element name="trackingMessageHeader" type="{http://smf.agent.xius.com/common/header/HeaderDetails.xsd}TrackingMessageHeaderType"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "trackingMessageHeader"
})
@XmlRootElement(name = "messageHeader")
public class MessageHeader {

    @XmlElement(required = true)
    protected TrackingMessageHeaderType trackingMessageHeader;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the trackingMessageHeader property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingMessageHeaderType }
     *     
     */
    public TrackingMessageHeaderType getTrackingMessageHeader() {
        return trackingMessageHeader;
    }

    /**
     * Sets the value of the trackingMessageHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingMessageHeaderType }
     *     
     */
    public void setTrackingMessageHeader(TrackingMessageHeaderType value) {
        this.trackingMessageHeader = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
