package com.xius.smf.domaindata;

public class PasswordUpdateData extends DomainDataBase {
	private String pi_login_id;
	private String pi_channel;
	private String pi_ext_trans_id;
	private String pi_reason;
	private String po_transaction_id;

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

	public String getPi_channel() {
		return pi_channel;
	}

	public void setPi_channel(String pi_channel) {
		this.pi_channel = pi_channel;
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

	@Override
	public String toString() {
		return "PasswordUpdateData [pi_login_id=" + pi_login_id
				+ ", pi_channel=" + pi_channel + ", pi_ext_trans_id="
				+ pi_ext_trans_id + ", pi_reason=" + pi_reason
				+ ", po_transaction_id=" + po_transaction_id
				+ ", pi_network_id=" + pi_network_id + ", pi_password="
				+ pi_password + ", pi_username=" + pi_username
				+ ", po_error_code=" + po_error_code + ", pi_app_id="
				+ pi_app_id + ", po_error_desc=" + po_error_desc + "]";
	}


}
