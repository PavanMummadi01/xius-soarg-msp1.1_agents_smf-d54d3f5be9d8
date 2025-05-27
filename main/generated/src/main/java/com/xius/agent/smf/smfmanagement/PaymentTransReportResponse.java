
package com.xius.agent.smf.smfmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentTransReportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentTransReportResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalRecords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentTransDtls" type="{http://smf.agent.xius.com/SMFManagement.xsd}PaymentTransDtlsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentTransReportResponse", propOrder = {
    "totalRecords",
    "paymentTransDtls"
})
public class PaymentTransReportResponse {

    protected String totalRecords;
    @XmlElement(name = "PaymentTransDtls")
    protected PaymentTransDtlsType paymentTransDtls;

    /**
     * Gets the value of the totalRecords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalRecords() {
        return totalRecords;
    }

    /**
     * Sets the value of the totalRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalRecords(String value) {
        this.totalRecords = value;
    }

    /**
     * Gets the value of the paymentTransDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransDtlsType }
     *     
     */
    public PaymentTransDtlsType getPaymentTransDtls() {
        return paymentTransDtls;
    }

    /**
     * Sets the value of the paymentTransDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransDtlsType }
     *     
     */
    public void setPaymentTransDtls(PaymentTransDtlsType value) {
        this.paymentTransDtls = value;
    }

}
