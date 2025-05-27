package com.xius.smf.domaindata;

import java.math.BigDecimal;

public class TransactionTrackerData extends DomainDataBase {
	private String pi_login_id        ;
	private String   pi_channel_id      ;
	private String  pi_activity_type    ;
	private String pi_user_id         ;
	private String pi_id_no        ;
	private Long pi_msisdn_no      ;
	private Long pi_account_id      ;
	private BigDecimal pi_actual_amount   ;
	private BigDecimal pi_debited_amount  ;
	private String pi_ext_trans_id    ;
	private String po_transaction_id   ;
	private String pi_reason;
	
	public String getPi_reason() {
		return pi_reason;
	}
	public void setPi_reason(String pi_reason) {
		this.pi_reason = pi_reason;
	}
	public String getPi_login_id() {
		return pi_login_id;
	}
	public void setPi_login_id(String pi_login_id) {
		this.pi_login_id = pi_login_id;
	}
	public String getPi_channel_id() {
		return pi_channel_id;
	}
	public void setPi_channel_id(String pi_channel_id) {
		this.pi_channel_id = pi_channel_id;
	}
	public String getPi_activity_type() {
		return pi_activity_type;
	}
	public void setPi_activity_type(String pi_activity_type) {
		this.pi_activity_type = pi_activity_type;
	}
	public String getPi_user_id() {
		return pi_user_id;
	}
	public void setPi_user_id(String pi_user_id) {
		this.pi_user_id = pi_user_id;
	}
	public String getPi_id_no() {
		return pi_id_no;
	}
	public void setPi_id_no(String pi_id_no) {
		this.pi_id_no = pi_id_no;
	}
	public Long getPi_msisdn_no() {
		return pi_msisdn_no;
	}
	public void setPi_msisdn_no(Long pi_msisdn_no) {
		this.pi_msisdn_no = pi_msisdn_no;
	}
	public Long getPi_account_id() {
		return pi_account_id;
	}
	public void setPi_account_id(Long pi_account_id) {
		this.pi_account_id = pi_account_id;
	}
	public BigDecimal getPi_actual_amount() {
		return pi_actual_amount;
	}
	public void setPi_actual_amount(BigDecimal pi_actual_amount) {
		this.pi_actual_amount = pi_actual_amount;
	}
	public BigDecimal getPi_debited_amount() {
		return pi_debited_amount;
	}
	public void setPi_debited_amount(BigDecimal pi_debited_amount) {
		this.pi_debited_amount = pi_debited_amount;
	}
	public String getPi_ext_trans_id() {
		return pi_ext_trans_id;
	}
	public void setPi_ext_trans_id(String pi_ext_trans_id) {
		this.pi_ext_trans_id = pi_ext_trans_id;
	}
	public String getPo_transaction_id() {
		return po_transaction_id;
	}
	public void setPo_transaction_id(String po_transaction_id) {
		this.po_transaction_id = po_transaction_id;
	}
	
}
