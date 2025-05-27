
package com.xius.agent.smfreport.smfreportsmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for caGroupTransactionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="caGroupTransactionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="grpName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parntAcctID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="grpParentMsisdnNO" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="childMSISDN" type="{http://smfreport.agent.xius.com/SMFReportsManagement.xsd}MSISDNType" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusUpdatedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="internalTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rowCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "caGroupTransactionsType", propOrder = {
    "grpName",
    "parntAcctID",
    "grpParentMsisdnNO",
    "childMSISDN",
    "status",
    "userName",
    "statusUpdatedDate",
    "internalTransactionId",
    "transactionDate",
    "externalTransactionId",
    "remarks",
    "rowCount"
})
public class CaGroupTransactionsType {

    protected String grpName;
    protected Long parntAcctID;
    protected Long grpParentMsisdnNO;
    protected String childMSISDN;
    @XmlElement(name = "Status")
    protected String status;
    protected String userName;
    protected String statusUpdatedDate;
    protected String internalTransactionId;
    protected String transactionDate;
    protected String externalTransactionId;
    protected String remarks;
    protected Long rowCount;

    /**
     * Gets the value of the grpName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpName() {
        return grpName;
    }

    /**
     * Sets the value of the grpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpName(String value) {
        this.grpName = value;
    }

    /**
     * Gets the value of the parntAcctID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParntAcctID() {
        return parntAcctID;
    }

    /**
     * Sets the value of the parntAcctID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParntAcctID(Long value) {
        this.parntAcctID = value;
    }

    /**
     * Gets the value of the grpParentMsisdnNO property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGrpParentMsisdnNO() {
        return grpParentMsisdnNO;
    }

    /**
     * Sets the value of the grpParentMsisdnNO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGrpParentMsisdnNO(Long value) {
        this.grpParentMsisdnNO = value;
    }

    /**
     * Gets the value of the childMSISDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildMSISDN() {
        return childMSISDN;
    }

    /**
     * Sets the value of the childMSISDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildMSISDN(String value) {
        this.childMSISDN = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the statusUpdatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusUpdatedDate() {
        return statusUpdatedDate;
    }

    /**
     * Sets the value of the statusUpdatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusUpdatedDate(String value) {
        this.statusUpdatedDate = value;
    }

    /**
     * Gets the value of the internalTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalTransactionId() {
        return internalTransactionId;
    }

    /**
     * Sets the value of the internalTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalTransactionId(String value) {
        this.internalTransactionId = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDate(String value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the externalTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalTransactionId() {
        return externalTransactionId;
    }

    /**
     * Sets the value of the externalTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalTransactionId(String value) {
        this.externalTransactionId = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the rowCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRowCount() {
        return rowCount;
    }

    /**
     * Sets the value of the rowCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRowCount(Long value) {
        this.rowCount = value;
    }

}
