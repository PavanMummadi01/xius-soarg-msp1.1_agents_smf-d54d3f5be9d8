
package com.xius.agent.smf.common.header.headerdetails;

import java.math.BigInteger;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for TrackingMessageHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackingMessageHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageId" type="{http://smf.agent.xius.com/common/header/HeaderDetails.xsd}MessageIdType"/>
 *         &lt;element name="carrierId" type="{http://smf.agent.xius.com/common/header/HeaderDetails.xsd}CarrierIdType"/>
 *         &lt;element name="userId" type="{http://smf.agent.xius.com/common/header/HeaderDetails.xsd}UserIdType"/>
 *         &lt;element name="password" type="{http://smf.agent.xius.com/common/header/HeaderDetails.xsd}PasswordType" minOccurs="0"/>
 *         &lt;element name="timeToLive" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="messageDateTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackingMessageHeaderType", propOrder = {
    "messageId",
    "carrierId",
    "userId",
    "password",
    "timeToLive",
    "messageDateTimeStamp"
})
public class TrackingMessageHeaderType {

    @XmlElement(required = true)
    protected String messageId;
    @XmlElement(required = true)
    protected String carrierId;
    @XmlElement(required = true)
    protected String userId;
    protected String password;
    protected BigInteger timeToLive;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar messageDateTimeStamp;

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the carrierId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierId() {
        return carrierId;
    }

    /**
     * Sets the value of the carrierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierId(String value) {
        this.carrierId = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the timeToLive property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeToLive() {
        return timeToLive;
    }

    /**
     * Sets the value of the timeToLive property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeToLive(BigInteger value) {
        this.timeToLive = value;
    }

    /**
     * Gets the value of the messageDateTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getMessageDateTimeStamp() {
        return messageDateTimeStamp;
    }

    /**
     * Sets the value of the messageDateTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageDateTimeStamp(Calendar value) {
        this.messageDateTimeStamp = value;
    }

}
