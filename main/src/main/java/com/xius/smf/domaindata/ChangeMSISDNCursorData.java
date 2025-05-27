package com.xius.smf.domaindata;

public class ChangeMSISDNCursorData {

	private Integer network_id;
	private String userid;
	private String transaction_id;
	private String transaction_id_ext;
	private Long old_account_id;
	private Long new_account_id;
	private Long old_msisdn_no;
	private Long new_msisdn_no;
	private Long old_imsi;
	private Long new_imsi;
	private Long old_sim;
	private Long new_sim;
	private String status;
	private String remarks;
	private String ext_error_code;
	private String notification_flag;
	private String retry_transaction_id;
	private String technology;
	private String retry_processing_flag;

	public String getRetry_processing_flag() {
		return retry_processing_flag;
	}

	public void setRetry_processing_flag(String retry_processing_flag) {
		this.retry_processing_flag = retry_processing_flag;
	}

	public Integer getNetwork_id() {
		return network_id;
	}

	public void setNetwork_id(Integer network_id) {
		this.network_id = network_id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public String getTransaction_id_ext() {
		return transaction_id_ext;
	}

	public void setTransaction_id_ext(String transaction_id_ext) {
		this.transaction_id_ext = transaction_id_ext;
	}

	public Long getOld_account_id() {
		return old_account_id;
	}

	public void setOld_account_id(Long old_account_id) {
		this.old_account_id = old_account_id;
	}

	public Long getNew_account_id() {
		return new_account_id;
	}

	public void setNew_account_id(Long new_account_id) {
		this.new_account_id = new_account_id;
	}

	public Long getOld_msisdn_no() {
		return old_msisdn_no;
	}

	public void setOld_msisdn_no(Long old_msisdn_no) {
		this.old_msisdn_no = old_msisdn_no;
	}

	public Long getNew_msisdn_no() {
		return new_msisdn_no;
	}

	public void setNew_msisdn_no(Long new_msisdn_no) {
		this.new_msisdn_no = new_msisdn_no;
	}

	public Long getOld_imsi() {
		return old_imsi;
	}

	public void setOld_imsi(Long old_imsi) {
		this.old_imsi = old_imsi;
	}

	public Long getNew_imsi() {
		return new_imsi;
	}

	public void setNew_imsi(Long new_imsi) {
		this.new_imsi = new_imsi;
	}

	public Long getOld_sim() {
		return old_sim;
	}

	public void setOld_sim(Long old_sim) {
		this.old_sim = old_sim;
	}

	public Long getNew_sim() {
		return new_sim;
	}

	public void setNew_sim(Long new_sim) {
		this.new_sim = new_sim;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getExt_error_code() {
		return ext_error_code;
	}

	public void setExt_error_code(String ext_error_code) {
		this.ext_error_code = ext_error_code;
	}

	public String getNotification_flag() {
		return notification_flag;
	}

	public void setNotification_flag(String notification_flag) {
		this.notification_flag = notification_flag;
	}

	public String getRetry_transaction_id() {
		return retry_transaction_id;
	}

	public void setRetry_transaction_id(String retry_transaction_id) {
		this.retry_transaction_id = retry_transaction_id;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	@Override
	public String toString() {
		return "ChangeMSISDNCursorData [network_id=" + network_id + ", userid="
				+ userid + ", transaction_id=" + transaction_id
				+ ", transaction_id_ext=" + transaction_id_ext
				+ ", old_account_id=" + old_account_id + ", new_account_id="
				+ new_account_id + ", old_msisdn_no=" + old_msisdn_no
				+ ", new_msisdn_no=" + new_msisdn_no + ", old_imsi=" + old_imsi
				+ ", new_imsi=" + new_imsi + ", old_sim=" + old_sim
				+ ", new_sim=" + new_sim + ", status=" + status + ", remarks="
				+ remarks + ", ext_error_code=" + ext_error_code
				+ ", notification_flag=" + notification_flag
				+ ", retry_transaction_id=" + retry_transaction_id
				+ ", technology=" + technology + "]";
	}

}
