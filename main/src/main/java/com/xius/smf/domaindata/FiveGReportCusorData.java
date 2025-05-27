package com.xius.smf.domaindata;

public class FiveGReportCusorData {

	private Long msisdn_no;
	private String transaction_id;
	private String provision_type;
	private String transaction_date;
	private String status;
	private String remarks;
	private String row_update_time;
	private String internal_transaction_id;
	private String insert_date;
	private String row_num;

	private String user_id;
	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getService_flag() {
		return service_flag;
	}

	public void setService_flag(String service_flag) {
		this.service_flag = service_flag;
	}

	public String getActivity_id() {
		return activity_id;
	}

	public void setActivity_id(String activity_id) {
		this.activity_id = activity_id;
	}

	public String getAccount_id() {
		return account_id;
	}

	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}

	public String getSim_serial_no() {
		return sim_serial_no;
	}

	public void setSim_serial_no(String sim_serial_no) {
		this.sim_serial_no = sim_serial_no;
	}

	public String getImsi_no() {
		return imsi_no;
	}

	public void setImsi_no(String imsi_no) {
		this.imsi_no = imsi_no;
	}

	public String getAcct_status() {
		return acct_status;
	}

	public void setAcct_status(String acct_status) {
		this.acct_status = acct_status;
	}

	private String account_type;
	private String channel;
	private String service_flag;
	private String activity_id;
	private String account_id;
	private String sim_serial_no;
	private String imsi_no;
	private String acct_status;

	public String getRow_num() {
		return row_num;
	}

	public void setRow_num(String row_num) {
		this.row_num = row_num;
	}

	public String getInsert_date() {
		return insert_date;
	}

	public void setInsert_date(String insert_date) {
		this.insert_date = insert_date;
	}

	public Long getMsisdn_no() {
		return msisdn_no;
	}

	public void setMsisdn_no(Long msisdn_no) {
		this.msisdn_no = msisdn_no;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public String getProvision_type() {
		return provision_type;
	}

	public void setProvision_type(String provision_type) {
		this.provision_type = provision_type;
	}

	public String getTransaction_date() {
		return transaction_date;
	}

	public void setTransaction_date(String transaction_date) {
		this.transaction_date = transaction_date;
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

	public String getRow_update_time() {
		return row_update_time;
	}

	public void setRow_update_time(String row_update_time) {
		this.row_update_time = row_update_time;
	}

	public String getInternal_transaction_id() {
		return internal_transaction_id;
	}

	public void setInternal_transaction_id(String internal_transaction_id) {
		this.internal_transaction_id = internal_transaction_id;
	}

	@Override
	public String toString() {
		return "FiveGReportCusorData [msisdn_no=" + msisdn_no
				+ ", transaction_id=" + transaction_id + ", provision_type="
				+ provision_type + ", transaction_date=" + transaction_date
				+ ", status=" + status + ", remarks=" + remarks
				+ ", row_update_time=" + row_update_time
				+ ", internal_transaction_id=" + internal_transaction_id
				+ ", insert_date=" + insert_date + ", row_num=" + row_num
				+ ", user_id=" + user_id + ", account_type=" + account_type
				+ ", channel=" + channel + ", service_flag=" + service_flag
				+ ", activity_id=" + activity_id + ", account_id=" + account_id
				+ ", sim_serial_no=" + sim_serial_no + ", imsi_no=" + imsi_no
				+ ", acct_status=" + acct_status + "]";
	}

}
