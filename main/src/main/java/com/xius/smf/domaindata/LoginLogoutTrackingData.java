package com.xius.smf.domaindata;

public class LoginLogoutTrackingData extends DomainDataBase{
	private String pi_user_name;
	private Long pi_unique_id;
	private String pi_operation;
	private String pi_user_type;
	
	public String getPi_user_name() {
		return pi_user_name;
	}
	public void setPi_user_name(String pi_user_name) {
		this.pi_user_name = pi_user_name;
	}
	public Long getPi_unique_id() {
		return pi_unique_id;
	}
	public void setPi_unique_id(Long pi_unique_id) {
		this.pi_unique_id = pi_unique_id;
	}
	public String getPi_operation() {
		return pi_operation;
	}
	public void setPi_operation(String pi_operation) {
		this.pi_operation = pi_operation;
	}
	public String getPi_user_type() {
		return pi_user_type;
	}
	public void setPi_user_type(String pi_user_type) {
		this.pi_user_type = pi_user_type;
	}

	public String toString() {
		return "LoginLogoutTrackingData [pi_user_name=" + pi_user_name
				+ ", pi_unique_id=" + pi_unique_id + ", pi_operation="
				+ pi_operation + ", pi_user_type=" + pi_user_type
				+ ", pi_network_id=" + pi_network_id + ", pi_login_id="
				+ pi_login_id + ", pi_password=" + pi_password
				+ ", pi_username=" + pi_username + ", po_error_code="
				+ po_error_code + ", pi_app_id=" + pi_app_id
				+ ", po_error_desc=" + po_error_desc + "]";
	}

}
