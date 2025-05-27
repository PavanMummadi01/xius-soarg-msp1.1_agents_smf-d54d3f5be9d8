package com.xius.smf.domaindata;

public class RetryFromSMFCursorData {
	
	
	private String activityId;
	private String notification_flag;
	private String technology;

	private String old_state;
	private String new_state;
	
	private Long network_id;
	private Long old_account_id;
	private Long new_account_id;
	private Long old_msisdn;
	private Long new_msisdn;
	private Long old_imsi;
	private Long new_imsi;
	private String old_sim;
	private String new_sim;
    private String retry_transaction_id;
	
    
    
	public Long getNetwork_id() {
		return network_id;
	}

	public void setNetwork_id(Long network_id) {
		this.network_id = network_id;
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

	public Long getOld_msisdn() {
		return old_msisdn;
	}

	public void setOld_msisdn(Long old_msisdn) {
		this.old_msisdn = old_msisdn;
	}

	public Long getNew_msisdn() {
		return new_msisdn;
	}

	public void setNew_msisdn(Long new_msisdn) {
		this.new_msisdn = new_msisdn;
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

	public String getOld_sim() {
		return old_sim;
	}

	public void setOld_sim(String old_sim) {
		this.old_sim = old_sim;
	}

	public String getNew_sim() {
		return new_sim;
	}

	public void setNew_sim(String new_sim) {
		this.new_sim = new_sim;
	}

	public String getRetry_transaction_id() {
		return retry_transaction_id;
	}

	public void setRetry_transaction_id(String retry_transaction_id) {
		this.retry_transaction_id = retry_transaction_id;
	}

	public String getOld_state() {
		return old_state;
	}

	public void setOld_state(String old_state) {
		this.old_state = old_state;
	}

	public String getNew_state() {
		return new_state;
	}

	public void setNew_state(String new_state) {
		this.new_state = new_state;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getNotification_flag() {
		return notification_flag;
	}

	public void setNotification_flag(String notification_flag) {
		this.notification_flag = notification_flag;
	}

	@Override
	public String toString() {
		return "RetryFromSMFCursorData [activityId=" + activityId
				+ ", notification_flag=" + notification_flag + ", technology="
				+ technology + ", old_state=" + old_state + ", new_state="
				+ new_state + ", network_id=" + network_id
				+ ", old_account_id=" + old_account_id + ", new_account_id="
				+ new_account_id + ", old_msisdn=" + old_msisdn
				+ ", new_msisdn=" + new_msisdn + ", old_imsi=" + old_imsi
				+ ", new_imsi=" + new_imsi + ", old_sim=" + old_sim
				+ ", new_sim=" + new_sim + ", retry_transaction_id="
				+ retry_transaction_id + "]";
	}

	
	
}
