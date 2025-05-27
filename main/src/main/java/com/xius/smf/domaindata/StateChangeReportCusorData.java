package com.xius.smf.domaindata;


public class StateChangeReportCusorData {

	/* network_id, msisdn_no, new_subscr_status,
                          TO_CHAR
                                 (inserted_date,
                                  'MM/DD/YYYY HH24:MM:SS'
                                 ) AS transaction_date,
                          transaction_id, reason, user_id, channel_id,
                          transaction_ref_num, remarks, old_subscr_status,
                          status, ROWNUM AS row_num
	 * */
	private Long network_id;
	private Long msisdn_no;
	private String new_subscr_status;
	private String transaction_date;
	private String transaction_id;
	private String reason;
	private String user_id;
	private String channel_id;
	private String transaction_ref_num;
	private String remarks;
	private String old_subscr_status;
	private String status;
	private Long row_num;
	
	
	public Long getNetwork_id() {
		return network_id;
	}
	public void setNetwork_id(Long network_id) {
		this.network_id = network_id;
	}
	public Long getMsisdn_no() {
		return msisdn_no;
	}
	public void setMsisdn_no(Long msisdn_no) {
		this.msisdn_no = msisdn_no;
	}
	public String getNew_subscr_status() {
		return new_subscr_status;
	}
	public void setNew_subscr_status(String new_subscr_status) {
		this.new_subscr_status = new_subscr_status;
	}
	public String getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(String transaction_date) {
		this.transaction_date = transaction_date;
	}
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getChannel_id() {
		return channel_id;
	}
	public void setChannel_id(String channel_id) {
		this.channel_id = channel_id;
	}
	public String getTransaction_ref_num() {
		return transaction_ref_num;
	}
	public void setTransaction_ref_num(String transaction_ref_num) {
		this.transaction_ref_num = transaction_ref_num;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getOld_subscr_status() {
		return old_subscr_status;
	}
	public void setOld_subscr_status(String old_subscr_status) {
		this.old_subscr_status = old_subscr_status;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getRow_num() {
		return row_num;
	}
	public void setRow_num(Long row_num) {
		this.row_num = row_num;
	}
	
}
