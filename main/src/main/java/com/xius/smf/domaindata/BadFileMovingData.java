package com.xius.smf.domaindata;

public class BadFileMovingData extends DomainDataBase {
	
	private String pi_file_name;
	private String pi_channel_id;
	private String po_trans_no;

	public String getPi_file_name() {
		return pi_file_name;
	}

	public void setPi_file_name(String pi_file_name) {
		this.pi_file_name = pi_file_name;
	}

	public String getPi_channel_id() {
		return pi_channel_id;
	}

	public void setPi_channel_id(String pi_channel_id) {
		this.pi_channel_id = pi_channel_id;
	}

	public String getPo_trans_no() {
		return po_trans_no;
	}

	public void setPo_trans_no(String po_trans_no) {
		this.po_trans_no = po_trans_no;
	}

	@Override
	public String toString() {
		return "BadFileMovingData [pi_file_name=" + pi_file_name
				+ ", pi_channel_id=" + pi_channel_id + ", po_trans_no="
				+ po_trans_no + ", pi_network_id=" + pi_network_id
				+ ", pi_login_id=" + pi_login_id + ", pi_password="
				+ pi_password + ", pi_username=" + pi_username
				+ ", po_error_code=" + po_error_code + ", pi_app_id="
				+ pi_app_id + ", po_error_desc=" + po_error_desc + "]";
	}

}
