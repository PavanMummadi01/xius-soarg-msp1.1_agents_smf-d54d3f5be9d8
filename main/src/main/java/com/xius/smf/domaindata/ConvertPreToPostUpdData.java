package com.xius.smf.domaindata;

import java.math.BigDecimal;

public class ConvertPreToPostUpdData extends DomainDataBase {

	private String pi_transaction_id;
	private String pi_status;
	private String pi_remarks;
	private String pi_ext_err_code;
	private Long pi_current_state_id;

	private String pi_tariff_pack_name;
	private Long pi_bill_cycle_day;
	private BigDecimal pi_credit_limit;
	private Long pi_tariff_pack_id;

	public Long getPi_current_state_id() {
		return pi_current_state_id;
	}

	public void setPi_current_state_id(Long pi_current_state_id) {
		this.pi_current_state_id = pi_current_state_id;
	}

	public String getPi_transaction_id() {
		return pi_transaction_id;
	}

	public void setPi_transaction_id(String pi_transaction_id) {
		this.pi_transaction_id = pi_transaction_id;
	}

	public String getPi_status() {
		return pi_status;
	}

	public void setPi_status(String pi_status) {
		this.pi_status = pi_status;
	}

	public String getPi_remarks() {
		return pi_remarks;
	}

	public void setPi_remarks(String pi_remarks) {
		this.pi_remarks = pi_remarks;
	}

	public String getPi_ext_err_code() {
		return pi_ext_err_code;
	}

	public void setPi_ext_err_code(String pi_ext_err_code) {
		this.pi_ext_err_code = pi_ext_err_code;
	}

	@Override
	public String toString() {
		return "ConvertPreToPostUpdData [pi_transaction_id="
				+ pi_transaction_id + ", pi_status=" + pi_status
				+ ", pi_remarks=" + pi_remarks + ", pi_ext_err_code="
				+ pi_ext_err_code + ", pi_current_state_id="
				+ pi_current_state_id + ", pi_tariff_pack_name="
				+ pi_tariff_pack_name + ", pi_bill_cycle_day="
				+ pi_bill_cycle_day + ", pi_credit_limit=" + pi_credit_limit
				+ ", pi_tariff_pack_id=" + pi_tariff_pack_id + "]";
	}

	public String getPi_tariff_pack_name() {
		return pi_tariff_pack_name;
	}

	public void setPi_tariff_pack_name(String pi_tariff_pack_name) {
		this.pi_tariff_pack_name = pi_tariff_pack_name;
	}

	public Long getPi_bill_cycle_day() {
		return pi_bill_cycle_day;
	}

	public void setPi_bill_cycle_day(Long pi_bill_cycle_day) {
		this.pi_bill_cycle_day = pi_bill_cycle_day;
	}

	public BigDecimal getPi_credit_limit() {
		return pi_credit_limit;
	}

	public void setPi_credit_limit(BigDecimal pi_credit_limit) {
		this.pi_credit_limit = pi_credit_limit;
	}

	public Long getPi_tariff_pack_id() {
		return pi_tariff_pack_id;
	}

	public void setPi_tariff_pack_id(Long pi_tariff_pack_id) {
		this.pi_tariff_pack_id = pi_tariff_pack_id;
	}
	
	

}
