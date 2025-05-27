package com.xius.smf.domaindata;

public class BulkStateChangeProcessCursorData {
	/*
	 * network_id, user_id, msisdn_no, new_subscr_status,
                     reason, transaction_ref_num, channel_id
	 */
	private Integer network_id;
	private Long msisdn_no;
	private String user_id;
	private String new_subscr_status;
	private String reason;
	private String transaction_ref_num;
	private String channel_id;
	public Integer getNetwork_id() {
		return network_id;
	}
	public void setNetwork_id(Integer network_id) {
		this.network_id = network_id;
	}
	public Long getMsisdn_no() {
		return msisdn_no;
	}
	public void setMsisdn_no(Long msisdn_no) {
		this.msisdn_no = msisdn_no;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getNew_subscr_status() {
		return new_subscr_status;
	}
	public void setNew_subscr_status(String new_subscr_status) {
		this.new_subscr_status = new_subscr_status;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getTransaction_ref_num() {
		return transaction_ref_num;
	}
	public void setTransaction_ref_num(String transaction_ref_num) {
		this.transaction_ref_num = transaction_ref_num;
	}
	public String getChannel_id() {
		return channel_id;
	}
	public void setChannel_id(String channel_id) {
		this.channel_id = channel_id;
	}
	
	@Override
	public String toString() {
		return "BulkStateChangeProcessCursorData [network_id=" + network_id
				+ ", msisdn_no=" + msisdn_no + ", user_id=" + user_id
				+ ", new_subscr_status=" + new_subscr_status + ", reason="
				+ reason + ", transaction_ref_num=" + transaction_ref_num
				+ ", channel_id=" + channel_id + "]";
	}
	 
	
}
