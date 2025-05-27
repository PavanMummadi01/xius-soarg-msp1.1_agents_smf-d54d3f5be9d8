package com.xius.smf.domaindata;

public class PaymentUpdateData extends DomainDataBase {

	private String pi_transaction_id;
	private String pi_status;
	private String pi_payment_type;
	private String pi_ext_err_code;
	private String pi_ext_trans_id;
	private String pi_ext_error_msg;
	private String pi_remarks;

	

	public String getPi_remarks() {
		return pi_remarks;
	}

	public void setPi_remarks(String pi_remarks) {
		this.pi_remarks = pi_remarks;
	}

	public String getPi_payment_type() {
		return pi_payment_type;
	}

	public void setPi_payment_type(String pi_payment_type) {
		this.pi_payment_type = pi_payment_type;
	}

	public String getPi_ext_trans_id() {
		return pi_ext_trans_id;
	}

	public void setPi_ext_trans_id(String pi_ext_trans_id) {
		this.pi_ext_trans_id = pi_ext_trans_id;
	}

	public String getPi_ext_error_msg() {
		return pi_ext_error_msg;
	}

	public void setPi_ext_error_msg(String pi_ext_error_msg) {
		this.pi_ext_error_msg = pi_ext_error_msg;
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

	public String getPi_ext_err_code() {
		return pi_ext_err_code;
	}

	public void setPi_ext_err_code(String pi_ext_err_code) {
		this.pi_ext_err_code = pi_ext_err_code;
	}

	@Override
	public String toString() {
		return "PaymentUpdateData [pi_transaction_id=" + pi_transaction_id
				+ ", pi_status=" + pi_status + ", pi_payment_type="
				+ pi_payment_type + ", pi_ext_err_code=" + pi_ext_err_code
				+ ", pi_ext_trans_id=" + pi_ext_trans_id
				+ ", pi_ext_error_msg=" + pi_ext_error_msg + ", pi_remarks="
				+ pi_remarks + "]";
	}

	

}
