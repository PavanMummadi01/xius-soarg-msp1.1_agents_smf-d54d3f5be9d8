package com.xius.smf.domaindata;

public class GenerateTokenData extends DomainDataBase{
	
	private Long pi_msisdn_no;
	private Long pi_account_id;
	private String user_id;
	private String pi_channel;
	private String pi_reason;
	private String pi_time_to_live;
	private Long pio_token;
	private String po_expiry_date;
	private String po_expiry_time;
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

	public String getPi_channel() {
		return pi_channel;
	}
	public void setPi_channel(String pi_channel) {
		this.pi_channel = pi_channel;
	}
	public String getPi_reason() {
		return pi_reason;
	}
	public void setPi_reason(String pi_reason) {
		this.pi_reason = pi_reason;
	}
	public String getPi_time_to_live() {
		return pi_time_to_live;
	}
	public void setPi_time_to_live(String pi_time_to_live) {
		this.pi_time_to_live = pi_time_to_live;
	}
	public Long getPio_token() {
		return pio_token;
	}
	public void setPio_token(Long pio_token) {
		this.pio_token = pio_token;
	}
	public String getPo_expiry_date() {
		return po_expiry_date;
	}
	public void setPo_expiry_date(String po_expiry_date) {
		this.po_expiry_date = po_expiry_date;
	}
	public String getPo_expiry_time() {
		return po_expiry_time;
	}
	public void setPo_expiry_time(String po_expiry_time) {
		this.po_expiry_time = po_expiry_time;
	}
	@Override
	public String toString() {
		return "GenerateTokenData [pi_msisdn_no=" + pi_msisdn_no
				+ ", pi_account_id=" + pi_account_id + ", user_id=" + user_id
				+ ", pi_channel=" + pi_channel + ", pi_reason=" + pi_reason
				+ ", pi_time_to_live=" + pi_time_to_live + ", pio_token="
				+ pio_token + ", po_expiry_date=" + po_expiry_date
				+ ", po_expiry_time=" + po_expiry_time + ", pi_network_id="
				+ pi_network_id + ", pi_login_id=" + pi_login_id
				+ ", pi_password=" + pi_password + ", pi_username="
				+ pi_username + ", po_error_code=" + po_error_code
				+ ", pi_app_id=" + pi_app_id + ", po_error_desc="
				+ po_error_desc + "]";
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
}
