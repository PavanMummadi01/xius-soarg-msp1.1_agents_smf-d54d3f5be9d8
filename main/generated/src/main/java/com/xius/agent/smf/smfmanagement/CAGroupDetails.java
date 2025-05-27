
package com.xius.agent.smf.smfmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CAGroupDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CAGroupDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="grpID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="grpName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pkgID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="parntAcctID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="grpParentMsisdnNO" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="useParntSrvce" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iterFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parntExpStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="useParntCaBal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="useParntCoreBal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="allowedBalType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="childDefltLimt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="childDetails" type="{http://smf.agent.xius.com/SMFManagement.xsd}MSISDNType" maxOccurs="unbounded"/>
 *         &lt;element name="officeCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CAGroupDetails", propOrder = {
    "grpID",
    "grpName",
    "pkgID",
    "parntAcctID",
    "grpParentMsisdnNO",
    "useParntSrvce",
    "iterFlag",
    "parntExpStatus",
    "useParntCaBal",
    "useParntCoreBal",
    "allowedBalType",
    "childDefltLimt",
    "childDetails",
    "officeCode"
})
public class CAGroupDetails {

    protected Long grpID;
    @XmlElement(required = true)
    protected String grpName;
    protected long pkgID;
    protected long parntAcctID;
    protected Long grpParentMsisdnNO;
    @XmlElement(required = true)
    protected String useParntSrvce;
    @XmlElement(required = true)
    protected String iterFlag;
    @XmlElement(required = true)
    protected String parntExpStatus;
    @XmlElement(required = true)
    protected String useParntCaBal;
    @XmlElement(required = true)
    protected String useParntCoreBal;
    protected int allowedBalType;
    @XmlElement(required = true)
    protected String childDefltLimt;
    @XmlElement(required = true)
    protected List<String> childDetails;
    protected long officeCode;

    /**
     * Gets the value of the grpID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGrpID() {
        return grpID;
    }

    /**
     * Sets the value of the grpID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGrpID(Long value) {
        this.grpID = value;
    }

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
     * Gets the value of the pkgID property.
     * 
     */
    public long getPkgID() {
        return pkgID;
    }

    /**
     * Sets the value of the pkgID property.
     * 
     */
    public void setPkgID(long value) {
        this.pkgID = value;
    }

    /**
     * Gets the value of the parntAcctID property.
     * 
     */
    public long getParntAcctID() {
        return parntAcctID;
    }

    /**
     * Sets the value of the parntAcctID property.
     * 
     */
    public void setParntAcctID(long value) {
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
     * Gets the value of the useParntSrvce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseParntSrvce() {
        return useParntSrvce;
    }

    /**
     * Sets the value of the useParntSrvce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseParntSrvce(String value) {
        this.useParntSrvce = value;
    }

    /**
     * Gets the value of the iterFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIterFlag() {
        return iterFlag;
    }

    /**
     * Sets the value of the iterFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIterFlag(String value) {
        this.iterFlag = value;
    }

    /**
     * Gets the value of the parntExpStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParntExpStatus() {
        return parntExpStatus;
    }

    /**
     * Sets the value of the parntExpStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParntExpStatus(String value) {
        this.parntExpStatus = value;
    }

    /**
     * Gets the value of the useParntCaBal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseParntCaBal() {
        return useParntCaBal;
    }

    /**
     * Sets the value of the useParntCaBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseParntCaBal(String value) {
        this.useParntCaBal = value;
    }

    /**
     * Gets the value of the useParntCoreBal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseParntCoreBal() {
        return useParntCoreBal;
    }

    /**
     * Sets the value of the useParntCoreBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseParntCoreBal(String value) {
        this.useParntCoreBal = value;
    }

    /**
     * Gets the value of the allowedBalType property.
     * 
     */
    public int getAllowedBalType() {
        return allowedBalType;
    }

    /**
     * Sets the value of the allowedBalType property.
     * 
     */
    public void setAllowedBalType(int value) {
        this.allowedBalType = value;
    }

    /**
     * Gets the value of the childDefltLimt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildDefltLimt() {
        return childDefltLimt;
    }

    /**
     * Sets the value of the childDefltLimt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildDefltLimt(String value) {
        this.childDefltLimt = value;
    }

    /**
     * Gets the value of the childDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getChildDetails() {
        if (childDetails == null) {
            childDetails = new ArrayList<String>();
        }
        return this.childDetails;
    }

    /**
     * Gets the value of the officeCode property.
     * 
     */
    public long getOfficeCode() {
        return officeCode;
    }

    /**
     * Sets the value of the officeCode property.
     * 
     */
    public void setOfficeCode(long value) {
        this.officeCode = value;
    }

}
