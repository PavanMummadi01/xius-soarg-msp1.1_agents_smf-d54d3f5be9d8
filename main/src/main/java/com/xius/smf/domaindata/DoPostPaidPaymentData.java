package com.xius.smf.domaindata;

import java.math.BigDecimal;

public class DoPostPaidPaymentData extends DomainDataBase {
	

	private Long pi_account_id;
	private Long pi_msisdn_no;
	private String pi_ext_trans_id;
	private String pi_channel;
	private Long pi_invoice_id;
	private BigDecimal pi_amount_paid;
	private String pi_payment_mode;
	private String pi_payment_ref_id;
	private String pi_reason;
	private String po_transaction_id;
	
	public Long getPi_account_id() {
		return pi_account_id;
	}
	public void setPi_account_id(Long pi_account_id) {
		this.pi_account_id = pi_account_id;
	}
	public Long getPi_msisdn_no() {
		return pi_msisdn_no;
	}
	public void setPi_msisdn_no(Long pi_msisdn_no) {
		this.pi_msisdn_no = pi_msisdn_no;
	}
	public String getPi_ext_trans_id() {
		return pi_ext_trans_id;
	}
	public void setPi_ext_trans_id(String pi_ext_trans_id) {
		this.pi_ext_trans_id = pi_ext_trans_id;
	}
	public String getPi_channel() {
		return pi_channel;
	}
	public void setPi_channel(String pi_channel) {
		this.pi_channel = pi_channel;
	}
	public Long getPi_invoice_id() {
		return pi_invoice_id;
	}
	public void setPi_invoice_id(Long pi_invoice_id) {
		this.pi_invoice_id = pi_invoice_id;
	}

	public String getPi_payment_mode() {
		return pi_payment_mode;
	}
	public void setPi_payment_mode(String pi_payment_mode) {
		this.pi_payment_mode = pi_payment_mode;
	}

	public String getPi_reason() {
		return pi_reason;
	}
	public void setPi_reason(String pi_reason) {
		this.pi_reason = pi_reason;
	}
	public String getPo_transaction_id() {
		return po_transaction_id;
	}
	public void setPo_transaction_id(String po_transaction_id) {
		this.po_transaction_id = po_transaction_id;
	}

	public BigDecimal getPi_amount_paid() {
		return pi_amount_paid;
	}
	public void setPi_amount_paid(BigDecimal pi_amount_paid) {
		this.pi_amount_paid = pi_amount_paid;
	}
	public String getPi_payment_ref_id() {
		return pi_payment_ref_id;
	}
	public void setPi_payment_ref_id(String pi_payment_ref_id) {
		this.pi_payment_ref_id = pi_payment_ref_id;
	}
	
	
	public String toString() {
		return "DoPostPaidPaymentData [pi_account_id=" + pi_account_id
				+ ", pi_msisdn_no=" + pi_msisdn_no + ", pi_ext_trans_id="
				+ pi_ext_trans_id + ", pi_channel=" + pi_channel
				+ ", pi_invoice_id=" + pi_invoice_id + ", pi_amount_paid="
				+ pi_amount_paid + ", pi_payment_mode=" + pi_payment_mode
				+ ", pi_payment_ref_id=" + pi_payment_ref_id + ", pi_reason="
				+ pi_reason + ", po_transaction_id=" + po_transaction_id
				+ ", pi_network_id=" + pi_network_id + ", pi_login_id="
				+ pi_login_id + ", pi_password=" + pi_password
				+ ", pi_username=" + pi_username + ", po_error_code="
				+ po_error_code + ", pi_app_id=" + pi_app_id
				+ ", po_error_desc=" + po_error_desc + "]";
	}

}

