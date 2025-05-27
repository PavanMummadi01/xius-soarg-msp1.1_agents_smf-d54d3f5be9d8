/*
 *
 * FileName: ManageOfficeDetailsData.java
 * Description:
 * Author: Janaki Sontiyala
 * Created Date: 11/11/18
 * Modified By:
 * Modified Date: 11/11/18
 * Modifications:
 * Reason for Modification:
 *
*/



package com.xius.smf.domaindata;

import java.math.BigDecimal;

public class ManageOfficeDetailsData extends DomainDataBase{
	
	private Long office_code;
	private Integer level_no;
	private String office_name;
	private String address;
	private String city;
	private String state;
	private String country;
	private String postal_code;
	private String emailid;
	private String phone_no;
	private Long parent_entcode;
	private String off_manager_name;
	private BigDecimal credit_limit;
	private String status_code;
	private Integer plan_id;
	private BigDecimal deposit_amt;
	private String company_registration_no;
	private String bank_name;
	private String bank_account_holder_name;
	private String bank_account_number;
	private String type_of_business;
	
	private Long po_office_code;
	private String plan_name;
	private Integer contact_per_code;
	private BigDecimal outstanding_amt;
	
	private String contact_person;
	
	/**
	 * REQ		     : REQ1208# TT: MNP functionality changes for corporate GUI & Schedule TopUp Report
	 * Description  : fax is mandatory in MNP, due to this fax is added newly and this is mandatory. 
				    
	 * Done By		 : Phani.Chavala
	 * Date		 : Aug 22, 2012
	 */
	private Long fax;
	
	// This is added for post paid purpose
	private String accountType;
	
	/**
	 * REQ#1235: corporate UI post paid changes
   	 * Modified: Phani.Chavala
   	 * Date: 20th Sep, 2012
   				
   	 * Disc: Added post paid details optional element 
	 */
	
	private BigDecimal postPaidCreditLimit;
	private BigDecimal availableCreditLimit;
	private String billingType;
	private Integer billingFrequency;
	private String billingDate;
	private Integer billDay;
	
	public Integer getBillDay() {
		return billDay;
	}
	public void setBillDay(Integer billDay) {
		this.billDay = billDay;
	}
	public BigDecimal getPostPaidCreditLimit() {
		return postPaidCreditLimit;
	}
	public void setPostPaidCreditLimit(BigDecimal postPaidCreditLimit) {
		this.postPaidCreditLimit = postPaidCreditLimit;
	}
	public BigDecimal getAvailableCreditLimit() {
		return availableCreditLimit;
	}
	public void setAvailableCreditLimit(BigDecimal availableCreditLimit) {
		this.availableCreditLimit = availableCreditLimit;
	}
	public String getBillingType() {
		return billingType;
	}
	public void setBillingType(String billingType) {
		this.billingType = billingType;
	}
	public Integer getBillingFrequency() {
		return billingFrequency;
	}
	public void setBillingFrequency(Integer billingFrequency) {
		this.billingFrequency = billingFrequency;
	}
	public String getBillingDate() {
		return billingDate;
	}
	public void setBillingDate(String billingDate) {
		this.billingDate = billingDate;
	}
	public Long getFax() {
		return fax;
	}
	public void setFax(Long fax) {
		this.fax = fax;
	}
	private String po_state_name;
	private String po_country_name;
	
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getContact_person() {
		return contact_person;
	}
	public void setContact_person(String contact_person) {
		this.contact_person = contact_person;
	}
	public String getPlan_name() {
		return plan_name;
	}
	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}
	public Integer getContact_per_code() {
		return contact_per_code;
	}
	public void setContact_per_code(Integer contact_per_code) {
		this.contact_per_code = contact_per_code;
	}
	public BigDecimal getOutstanding_amt() {
		return outstanding_amt;
	}
	public void setOutstanding_amt(BigDecimal outstanding_amt) {
		this.outstanding_amt = outstanding_amt;
	}
	public Long getOffice_code() {
		return office_code;
	}
	public void setOffice_code(Long office_code) {
		this.office_code = office_code;
	}
	public Integer getLevel_no() {
		return level_no;
	}
	public void setLevel_no(Integer level_no) {
		this.level_no = level_no;
	}
	public String getOffice_name() {
		return office_name;
	}
	public void setOffice_name(String office_name) {
		this.office_name = office_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public Long getParent_entcode() {
		return parent_entcode;
	}
	public void setParent_entcode(Long parent_entcode) {
		this.parent_entcode = parent_entcode;
	}
	public String getOff_manager_name() {
		return off_manager_name;
	}
	public void setOff_manager_name(String off_manager_name) {
		this.off_manager_name = off_manager_name;
	}
	public BigDecimal getCredit_limit() {
		return credit_limit;
	}
	public void setCredit_limit(BigDecimal credit_limit) {
		this.credit_limit = credit_limit;
	}
	public String getStatus_code() {
		return status_code;
	}
	public void setStatus_code(String status_code) {
		this.status_code = status_code;
	}
	public Integer getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(Integer plan_id) {
		this.plan_id = plan_id;
	}
	public BigDecimal getDeposit_amt() {
		return deposit_amt;
	}
	public void setDeposit_amt(BigDecimal deposit_amt) {
		this.deposit_amt = deposit_amt;
	}
	public String getCompany_registration_no() {
		return company_registration_no;
	}
	public void setCompany_registration_no(String company_registration_no) {
		this.company_registration_no = company_registration_no;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getBank_account_holder_name() {
		return bank_account_holder_name;
	}
	public void setBank_account_holder_name(String bank_account_holder_name) {
		this.bank_account_holder_name = bank_account_holder_name;
	}
	public String getBank_account_number() {
		return bank_account_number;
	}
	public void setBank_account_number(String bank_account_number) {
		this.bank_account_number = bank_account_number;
	}
	public String getType_of_business() {
		return type_of_business;
	}
	public void setType_of_business(String type_of_business) {
		this.type_of_business = type_of_business;
	}
	
	public Long getPo_office_code() {
		return po_office_code;
	}
	public void setPo_office_code(Long po_office_code) {
		this.po_office_code = po_office_code;
	}
	public Integer getPay_cnt() {
		return pay_cnt;
	}
	public void setPay_cnt(Integer pay_cnt) {
		this.pay_cnt = pay_cnt;
	}
	private Integer pay_cnt;

	/**
	 * @return the po_state_name
	 */
	public String getPo_state_name() {
		return po_state_name;
	}
	/**
	 * @param poStateName the po_state_name to set
	 */
	public void setPo_state_name(String poStateName) {
		po_state_name = poStateName;
	}
	/**
	 * @return the po_country_name
	 */
	public String getPo_country_name() {
		return po_country_name;
	}
	/**
	 * @param poCountryName the po_country_name to set
	 */
	public void setPo_country_name(String poCountryName) {
		po_country_name = poCountryName;
	}
	
}
