package com.xius.smf.domaindata;

public class SimRegistrationUpdateData extends DomainDataBase {

	String pi_transaction_id;
	String pi_status;
	String pi_remarks;
	String pi_ext_error_code;
	long pi_state_id;
	String pi_user_define;
	String po_trans_id;

	public String getPo_trans_id() {
		return po_trans_id;
	}

	public void setPo_trans_id(String po_trans_id) {
		this.po_trans_id = po_trans_id;
	}

	public long getPi_state_id() {
		return pi_state_id;
	}

	public void setPi_state_id(long pi_state_id) {
		this.pi_state_id = pi_state_id;
	}

	public String getPi_user_define() {
		return pi_user_define;
	}

	public void setPi_user_define(String pi_user_define) {
		this.pi_user_define = pi_user_define;
	}

	public String getPi_remarks() {
		return pi_remarks;
	}

	public void setPi_remarks(String pi_remarks) {
		this.pi_remarks = pi_remarks;
	}

	public String getPi_ext_error_code() {
		return pi_ext_error_code;
	}

	public void setPi_ext_error_code(String pi_ext_error_code) {
		this.pi_ext_error_code = pi_ext_error_code;
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

	@Override
	public String toString() {
		return "SimRegistrationUpdateData [pi_transaction_id="
				+ pi_transaction_id + ", pi_status=" + pi_status
				+ ", pi_remarks=" + pi_remarks + ", pi_ext_error_code="
				+ pi_ext_error_code + ", pi_state_id=" + pi_state_id
				+ ", pi_user_define=" + pi_user_define + ", po_trans_id="
				+ po_trans_id + "]";
	}
}
