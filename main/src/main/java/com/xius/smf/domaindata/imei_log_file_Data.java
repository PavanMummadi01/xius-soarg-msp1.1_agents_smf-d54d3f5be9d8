package com.xius.smf.domaindata;


public class imei_log_file_Data extends DomainDataBase {

	private String pi_file_id;
	private String pi_file_name;
	private String pi_file_generated_timestamp;
	private String pi_sftp_timestamp;
	private Long pi_records_writen_in_file;
	
	public String getPi_file_id() {
		return pi_file_id;
	}
	public void setPi_file_id(String pi_file_id) {
		this.pi_file_id = pi_file_id;
	}
	public String getPi_file_name() {
		return pi_file_name;
	}
	public void setPi_file_name(String pi_file_name) {
		this.pi_file_name = pi_file_name;
	}
	public String getPi_file_generated_timestamp() {
		return pi_file_generated_timestamp;
	}
	public void setPi_file_generated_timestamp(String pi_file_generated_timestamp) {
		this.pi_file_generated_timestamp = pi_file_generated_timestamp;
	}
	public String getPi_sftp_timestamp() {
		return pi_sftp_timestamp;
	}
	public void setPi_sftp_timestamp(String pi_sftp_timestamp) {
		this.pi_sftp_timestamp = pi_sftp_timestamp;
	}
	public Long getPi_records_writen_in_file() {
		return pi_records_writen_in_file;
	}
	public void setPi_records_writen_in_file(Long pi_records_writen_in_file) {
		this.pi_records_writen_in_file = pi_records_writen_in_file;
	}

}
