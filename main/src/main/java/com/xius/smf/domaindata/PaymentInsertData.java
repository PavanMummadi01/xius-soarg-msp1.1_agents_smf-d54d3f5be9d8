package com.xius.smf.domaindata;

import java.math.BigDecimal;

public class PaymentInsertData extends DomainDataBase {

	private Long pi_account_id;
	private Long pi_msisdn_no;
	private String pi_activity_type;
	private BigDecimal pi_payment_amount;
	
	private String pi_channel;
	private String pi_payment_type;
	private String po_transaction_id;
	private String pi_description;
	private String pi_rc_code;
	private String pi_wallet_type;
	private String pi_remarks;
	private String pi_payment_gatewaytype;
	
	
	public String getPi_payment_gatewaytype() {
		return pi_payment_gatewaytype;
	}
	public void setPi_payment_gatewaytype(String pi_payment_gatewaytype) {
		this.pi_payment_gatewaytype = pi_payment_gatewaytype;
	}
	public String getPi_remarks() {
		return pi_remarks;
	}
	public void setPi_remarks(String pi_remarks) {
		this.pi_remarks = pi_remarks;
	}
	public String getPi_rc_code() {
		return pi_rc_code;
	}
	public void setPi_rc_code(String pi_rc_code) {
		this.pi_rc_code = pi_rc_code;
	}
	public String getPi_description() {
		return pi_description;
	}
	public void setPi_description(String pi_description) {
		this.pi_description = pi_description;
	}
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
	public String getPi_activity_type() {
		return pi_activity_type;
	}
	public void setPi_activity_type(String pi_activity_type) {
		this.pi_activity_type = pi_activity_type;
	}
	public BigDecimal getPi_payment_amount() {
		return pi_payment_amount;
	}
	public void setPi_payment_amount(BigDecimal pi_payment_amount) {
		this.pi_payment_amount = pi_payment_amount;
	}
		public String getPi_channel() {
		return pi_channel;
	}
	public void setPi_channel(String pi_channel) {
		this.pi_channel = pi_channel;
	}
	public String getPi_payment_type() {
		return pi_payment_type;
	}
	public void setPi_payment_type(String pi_payment_type) {
		this.pi_payment_type = pi_payment_type;
	}
	public String getPo_transaction_id() {
		return po_transaction_id;
	}
	public void setPo_transaction_id(String po_transaction_id) {
		this.po_transaction_id = po_transaction_id;
	}
	public String getPi_wallet_type() {
		return pi_wallet_type;
	}
	public void setPi_wallet_type(String pi_wallet_type) {
		this.pi_wallet_type = pi_wallet_type;
	}
	@Override
	public String toString() {
		return "PaymentInsertData [pi_account_id=" + pi_account_id
				+ ", pi_msisdn_no=" + pi_msisdn_no + ", pi_activity_type="
				+ pi_activity_type + ", pi_payment_amount=" + pi_payment_amount
				+ ", pi_channel=" + pi_channel + ", pi_payment_type="
				+ pi_payment_type + ", po_transaction_id=" + po_transaction_id
				+ ", pi_description=" + pi_description + ", pi_rc_code="
				+ pi_rc_code + ", pi_wallet_type=" + pi_wallet_type
				+ ", pi_remarks=" + pi_remarks + ", pi_payment_gatewaytype="
				+ pi_payment_gatewaytype + "]";
	}
	
}
