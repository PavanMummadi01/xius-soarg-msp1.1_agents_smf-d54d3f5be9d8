package com.xius.smf.domaindata;

import java.math.BigDecimal;


public class MainLineSubLineValidationData extends DomainDataBase {

	private String pi_main_line;
	private String[] pi_sub_line;
	private String po_main_desired_msisdn;
	private String[] po_sub_line_desired_msisdn;
	private Long pi_account_type;
	private String pi_id_value;
	private String po_main_line_error_msg;
	private Long po_main_line_error_code;
	private String[] po_sub_line_error_msg;
	private BigDecimal[] po_sub_line_error_code;
	private String pi_orderid;
	
	
	public String getPi_orderid() {
		return pi_orderid;
	}

	public void setPi_orderid(String pi_orderid) {
		this.pi_orderid = pi_orderid;
	}

	public Long getPi_account_type() {
		return pi_account_type;
	}

	public void setPi_account_type(Long pi_account_type) {
		this.pi_account_type = pi_account_type;
	}

	public String getPi_id_value() {
		return pi_id_value;
	}

	public void setPi_id_value(String pi_id_value) {
		this.pi_id_value = pi_id_value;
	}
	
	public String getPo_main_desired_msisdn() {
		return po_main_desired_msisdn;
	}

	public void setPo_main_desired_msisdn(String po_main_desired_msisdn) {
		this.po_main_desired_msisdn = po_main_desired_msisdn;
	}
 
	public String[] getPo_sub_line_desired_msisdn() {
		return po_sub_line_desired_msisdn;
	}

	public void setPo_sub_line_desired_msisdn(String[] po_sub_line_desired_msisdn) {
		this.po_sub_line_desired_msisdn = po_sub_line_desired_msisdn;
	}

	public String getPi_main_line() {
		return pi_main_line;
	}

	public void setPi_main_line(String pi_main_line) {
		this.pi_main_line = pi_main_line;
	}

	public String[] getPi_sub_line() {
		return pi_sub_line;
	}

	public void setPi_sub_line(String[] pi_sub_line) {
		this.pi_sub_line = pi_sub_line;
	}

	public String getPo_main_line_error_msg() {
		return po_main_line_error_msg;
	}

	public void setPo_main_line_error_msg(String po_main_line_error_msg) {
		this.po_main_line_error_msg = po_main_line_error_msg;
	}

	public Long getPo_main_line_error_code() {
		return po_main_line_error_code;
	}

	public void setPo_main_line_error_code(Long po_main_line_error_code) {
		this.po_main_line_error_code = po_main_line_error_code;
	}

	public String[] getPo_sub_line_error_msg() {
		return po_sub_line_error_msg;
	}

	public void setPo_sub_line_error_msg(String[] po_sub_line_error_msg) {
		this.po_sub_line_error_msg = po_sub_line_error_msg;
	}

	public BigDecimal[] getPo_sub_line_error_code() {
		return po_sub_line_error_code;
	}

	public void setPo_sub_line_error_code(BigDecimal[] po_sub_line_error_code) {
		this.po_sub_line_error_code = po_sub_line_error_code;
	}

}