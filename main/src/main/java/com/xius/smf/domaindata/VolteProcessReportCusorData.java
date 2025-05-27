package com.xius.smf.domaindata;


public class VolteProcessReportCusorData {

	/*  TO_CHAR (process_date, 'MM/DD/YYYY HH24:MM:SS'),
                             msisdn_no, ext_transaction_id,
                             internal_transaction_id, user_id, account_type,
                             channel_name, process_status, process_remarks,
                             service_flag, ROWNUM AS row_num
	 * */
	
	private Long row_num;
	private String user_id;
	private Long internal_transaction_id;
	private String ext_transaction_id;
	private Long msisdn_no;
	private String process_date;
	private Long account_type;
	private String channel_name;
	private String process_remarks;
	private String process_status;
	private String service_flag;
	private String  activity_id;
	private Long account_id;
	private String sim_serial_no;
	private Long imsi_no;
	private String acct_status;
	
	
	
	public String getActivity_id() {
		return activity_id;
	}
	public void setActivity_id(String activity_id) {
		this.activity_id = activity_id;
	}
	public Long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}
	public String getSim_serial_no() {
		return sim_serial_no;
	}
	public void setSim_serial_no(String sim_serial_no) {
		this.sim_serial_no = sim_serial_no;
	}
	public Long getImsi_no() {
		return imsi_no;
	}
	public void setImsi_no(Long imsi_no) {
		this.imsi_no = imsi_no;
	}
	public String getAcct_status() {
		return acct_status;
	}
	public void setAcct_status(String acct_status) {
		this.acct_status = acct_status;
	}
	public Long getAccount_type() {
		return account_type;
	}
	public void setAccount_type(Long account_type) {
		this.account_type = account_type;
	}
	public String getChannel_name() {
		return channel_name;
	}
	public void setChannel_name(String channel_name) {
		this.channel_name = channel_name;
	}
	public String getProcess_remarks() {
		return process_remarks;
	}
	public void setProcess_remarks(String process_remarks) {
		this.process_remarks = process_remarks;
	}
	public String getProcess_status() {
		return process_status;
	}
	public void setProcess_status(String process_status) {
		this.process_status = process_status;
	}
	public String getService_flag() {
		return service_flag;
	}
	public void setService_flag(String service_flag) {
		this.service_flag = service_flag;
	}
	public Long getRow_num() {
		return row_num;
	}
	public void setRow_num(Long row_num) {
		this.row_num = row_num;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public Long getInternal_transaction_id() {
		return internal_transaction_id;
	}
	public void setInternal_transaction_id(Long internal_transaction_id) {
		this.internal_transaction_id = internal_transaction_id;
	}
	public String getExt_transaction_id() {
		return ext_transaction_id;
	}
	public void setExt_transaction_id(String ext_transaction_id) {
		this.ext_transaction_id = ext_transaction_id;
	}
	public Long getMsisdn_no() {
		return msisdn_no;
	}
	public void setMsisdn_no(Long msisdn_no) {
		this.msisdn_no = msisdn_no;
	}
	public String getProcess_date() {
		return process_date;
	}
	public void setProcess_date(String process_date) {
		this.process_date = process_date;
	}
	@Override
	public String toString() {
		return "VolteProcessReportCusorData [row_num=" + row_num + ", user_id="
				+ user_id + ", internal_transaction_id="
				+ internal_transaction_id + ", ext_transaction_id="
				+ ext_transaction_id + ", msisdn_no=" + msisdn_no
				+ ", process_date=" + process_date + ", account_type="
				+ account_type + ", channel_name=" + channel_name
				+ ", process_remarks=" + process_remarks + ", process_status="
				+ process_status + ", service_flag=" + service_flag + "]";
	}
	
	
	
	
}
