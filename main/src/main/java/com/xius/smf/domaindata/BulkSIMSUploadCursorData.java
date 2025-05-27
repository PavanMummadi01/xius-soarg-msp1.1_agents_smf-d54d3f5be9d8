package com.xius.smf.domaindata;

import java.math.BigDecimal;
import java.util.Date;

public class BulkSIMSUploadCursorData extends DomainDataBase {
	private String sim_serial_no;
	private String trans_id;
	private String transaction_no;
	private String status;
	private Long msisdn_no;
	private String order_no;
	private Date updated_date;
	private String first_name;
	private String last_name;
	private String sur_name;
	private String date_of_birth;
	private String account_type;
	private BigDecimal credit_limit;
	private Long bill_cycleday;
	private String municipoality;
	private String street_limits;
	private String gender;
	private String street;
	private String colony;
	private String country;
	private String state;
	private String city;
	private String postal_code;
	private String email;
	private Long alternate_contact_no;
	private String tariff_plan;
	private Long tariff_plan_id;
	private String user_input_field1;
	private String user_input_field2;
	private String user_input_field3;
	private String user_input_field4;
	private String user_input_field5;
	private String bill_type;
	private String bill_frequency;
	private String internal_number;
	private String external_number;
	private String user_id;
	private Long id_type;
	private String id_no;
	private Long network_id;
	private String dealer_id;
	private Long location_code;
	
	private String office_code;
	private String is_corp;

	private String is_main_line;
	private String is_sub_line;

	private Long main_line_msisdn;
	private String opt_grp_credit; 
	private String opt_grp_bill;
	

	
	
	
	
	
	/**
	 * @return the is_main_line
	 */
	public String getIs_main_line() {
		return is_main_line;
	}

	/**
	 * @param is_main_line the is_main_line to set
	 */
	public void setIs_main_line(String is_main_line) {
		this.is_main_line = is_main_line;
	}

	/**
	 * @return the is_sub_line
	 */
	public String getIs_sub_line() {
		return is_sub_line;
	}

	/**
	 * @param is_sub_line the is_sub_line to set
	 */
	public void setIs_sub_line(String is_sub_line) {
		this.is_sub_line = is_sub_line;
	}

	/**
	 * @return the main_line_msisdn
	 */
	public Long getMain_line_msisdn() {
		return main_line_msisdn;
	}

	/**
	 * @param main_line_msisdn the main_line_msisdn to set
	 */
	public void setMain_line_msisdn(Long main_line_msisdn) {
		this.main_line_msisdn = main_line_msisdn;
	}

	/**
	 * @return the opt_grp_credit
	 */
	public String getOpt_grp_credit() {
		return opt_grp_credit;
	}

	/**
	 * @param opt_grp_credit the opt_grp_credit to set
	 */
	public void setOpt_grp_credit(String opt_grp_credit) {
		this.opt_grp_credit = opt_grp_credit;
	}

	/**
	 * @return the opt_grp_bill
	 */
	public String getOpt_grp_bill() {
		return opt_grp_bill;
	}

	/**
	 * @param opt_grp_bill the opt_grp_bill to set
	 */
	public void setOpt_grp_bill(String opt_grp_bill) {
		this.opt_grp_bill = opt_grp_bill;
	}

	public String getOffice_code() {
		return office_code;
	}

	public void setOffice_code(String office_code) {
		this.office_code = office_code;
	}

	public String getIs_corp() {
		return is_corp;
	}

	public void setIs_corp(String is_corp) {
		this.is_corp = is_corp;
	}

	public String getDealer_id() {
		return dealer_id;
	}

	public void setDealer_id(String dealer_id) {
		this.dealer_id = dealer_id;
	}

	
	public Long getLocation_code() {
		return location_code;
	}

	public void setLocation_code(Long location_code) {
		this.location_code = location_code;
	}

	public String getSim_serial_no() {
		return sim_serial_no;
	}

	public void setSim_serial_no(String sim_serial_no) {
		this.sim_serial_no = sim_serial_no;
	}

	public Long getId_type() {
		return id_type;
	}

	public void setId_type(Long id_type) {
		this.id_type = id_type;
	}

	public String getId_no() {
		return id_no;
	}

	public void setId_no(String id_no) {
		this.id_no = id_no;
	}

	public String getTransaction_no() {
		return transaction_no;
	}

	public void setTransaction_no(String transaction_no) {
		this.transaction_no = transaction_no;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getMsisdn_no() {
		return msisdn_no;
	}

	public void setMsisdn_no(Long msisdn_no) {
		this.msisdn_no = msisdn_no;
	}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public Date getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getSur_name() {
		return sur_name;
	}

	public void setSur_name(String sur_name) {
		this.sur_name = sur_name;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public BigDecimal getCredit_limit() {
		return credit_limit;
	}

	public void setCredit_limit(BigDecimal credit_limit) {
		this.credit_limit = credit_limit;
	}

	public Long getBill_cycleday() {
		return bill_cycleday;
	}

	public void setBill_cycleday(Long bill_cycleday) {
		this.bill_cycleday = bill_cycleday;
	}

	public String getMunicipoality() {
		return municipoality;
	}

	public void setMunicipoality(String municipoality) {
		this.municipoality = municipoality;
	}

	public String getStreet_limits() {
		return street_limits;
	}

	public void setStreet_limits(String street_limits) {
		this.street_limits = street_limits;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getColony() {
		return colony;
	}

	public void setColony(String colony) {
		this.colony = colony;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getAlternate_contact_no() {
		return alternate_contact_no;
	}

	public void setAlternate_contact_no(Long alternate_contact_no) {
		this.alternate_contact_no = alternate_contact_no;
	}

	public String getTariff_plan() {
		return tariff_plan;
	}

	public void setTariff_plan(String tariff_plan) {
		this.tariff_plan = tariff_plan;
	}

	public Long getTariff_plan_id() {
		return tariff_plan_id;
	}

	public void setTariff_plan_id(Long tariff_plan_id) {
		this.tariff_plan_id = tariff_plan_id;
	}

	public String getUser_input_field1() {
		return user_input_field1;
	}

	public void setUser_input_field1(String user_input_field1) {
		this.user_input_field1 = user_input_field1;
	}

	public String getUser_input_field2() {
		return user_input_field2;
	}

	public void setUser_input_field2(String user_input_field2) {
		this.user_input_field2 = user_input_field2;
	}

	public String getUser_input_field3() {
		return user_input_field3;
	}

	public void setUser_input_field3(String user_input_field3) {
		this.user_input_field3 = user_input_field3;
	}

	public String getUser_input_field4() {
		return user_input_field4;
	}

	public void setUser_input_field4(String user_input_field4) {
		this.user_input_field4 = user_input_field4;
	}

	public String getUser_input_field5() {
		return user_input_field5;
	}

	public void setUser_input_field5(String user_input_field5) {
		this.user_input_field5 = user_input_field5;
	}

	public Long getNetwork_id() {
		return network_id;
	}

	public void setNetwork_id(Long network_id) {
		this.network_id = network_id;
	}

	public String getTrans_id() {
		return trans_id;
	}

	public void setTrans_id(String trans_id) {
		this.trans_id = trans_id;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getBill_type() {
		return bill_type;
	}

	public void setBill_type(String bill_type) {
		this.bill_type = bill_type;
	}

	public String getBill_frequency() {
		return bill_frequency;
	}

	public void setBill_frequency(String bill_frequency) {
		this.bill_frequency = bill_frequency;
	}

	public String getInternal_number() {
		return internal_number;
	}

	public void setInternal_number(String internal_number) {
		this.internal_number = internal_number;
	}

	public String getExternal_number() {
		return external_number;
	}

	public void setExternal_number(String external_number) {
		this.external_number = external_number;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "BulkSIMSUploadCursorData [sim_serial_no=" + sim_serial_no
				+ ", trans_id=" + trans_id + ", transaction_no="
				+ transaction_no + ", status=" + status + ", msisdn_no="
				+ msisdn_no + ", order_no=" + order_no + ", updated_date="
				+ updated_date + ", first_name=" + first_name + ", last_name="
				+ last_name + ", sur_name=" + sur_name + ", date_of_birth="
				+ date_of_birth + ", account_type=" + account_type
				+ ", credit_limit=" + credit_limit + ", bill_cycleday="
				+ bill_cycleday + ", municipoality=" + municipoality
				+ ", street_limits=" + street_limits + ", gender=" + gender
				+ ", street=" + street + ", colony=" + colony + ", country="
				+ country + ", state=" + state + ", city=" + city
				+ ", postal_code=" + postal_code + ", email=" + email
				+ ", alternate_contact_no=" + alternate_contact_no
				+ ", tariff_plan=" + tariff_plan + ", tariff_plan_id="
				+ tariff_plan_id + ", user_input_field1=" + user_input_field1
				+ ", user_input_field2=" + user_input_field2
				+ ", user_input_field3=" + user_input_field3
				+ ", user_input_field4=" + user_input_field4
				+ ", user_input_field5=" + user_input_field5 + ", bill_type="
				+ bill_type + ", bill_frequency=" + bill_frequency
				+ ", internal_number=" + internal_number + ", external_number="
				+ external_number + ", user_id=" + user_id + ", id_type="
				+ id_type + ", id_no=" + id_no + ", network_id=" + network_id
				+ ", dealer_id=" + dealer_id + ", location_code="
				+ location_code + "]";
	}

	
	

}
