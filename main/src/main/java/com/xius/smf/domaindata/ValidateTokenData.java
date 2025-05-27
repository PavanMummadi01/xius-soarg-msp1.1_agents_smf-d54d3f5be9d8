package com.xius.smf.domaindata;

public class ValidateTokenData extends DomainDataBase {

	private Long pi_msisdn_no;
	private Long pi_account_id;
	private Long pi_token;
	private String user_id;
	public String getPi_channel() {
		return pi_channel;
	}
	public void setPi_channel(String pi_channel) {
		this.pi_channel = pi_channel;
	}
	private String pi_channel;
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
	public Long getPi_token() {
		return pi_token;
	}
	public void setPi_token(Long pi_token) {
		this.pi_token = pi_token;
	}

	@Override
	public String toString() {
		return "ValidateTokenData [pi_msisdn_no=" + pi_msisdn_no
				+ ", pi_account_id=" + pi_account_id + ", pi_token=" + pi_token
				+ ", user_id=" + user_id + ", pi_network_id=" + pi_network_id
				+ ", pi_login_id=" + pi_login_id + ", pi_password="
				+ pi_password + ", pi_username=" + pi_username
				+ ", po_error_code=" + po_error_code + ", pi_app_id="
				+ pi_app_id + ", po_error_desc=" + po_error_desc + "]";
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

}

