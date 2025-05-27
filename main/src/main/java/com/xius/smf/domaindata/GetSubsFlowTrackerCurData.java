package com.xius.smf.domaindata;

public class GetSubsFlowTrackerCurData {

	private Long network_id;
	private String request_data;
	private String flow_id;
	private String transaction_id;
	private String transaction_date;
	private String processing_flag;
	private String row_update_time;
	private String internal_trans_id;
	private String sub_flow_ids;
	private String org_request_data;

	private String user_id;
	private String channel;
	private Long account_type;
	private String service_flag;
	private Long account_id;
	private String sim_serial_no;
	private Long imsi_no;
	private String acct_status;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Long getAccount_type() {
		return account_type;
	}

	public void setAccount_type(Long account_type) {
		this.account_type = account_type;
	}

	public String getService_flag() {
		return service_flag;
	}

	public void setService_flag(String service_flag) {
		this.service_flag = service_flag;
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

	public String getOrg_request_data() {
		return org_request_data;
	}

	public void setOrg_request_data(String org_request_data) {
		this.org_request_data = org_request_data;
	}

	public Long getNetwork_id() {
		return network_id;
	}

	public void setNetwork_id(Long network_id) {
		this.network_id = network_id;
	}

	public String getRequest_data() {
		return request_data;
	}

	public void setRequest_data(String request_data) {
		this.request_data = request_data;
	}

	public String getFlow_id() {
		return flow_id;
	}

	public void setFlow_id(String flow_id) {
		this.flow_id = flow_id;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public String getTransaction_date() {
		return transaction_date;
	}

	public void setTransaction_date(String transaction_date) {
		this.transaction_date = transaction_date;
	}

	public String getProcessing_flag() {
		return processing_flag;
	}

	public void setProcessing_flag(String processing_flag) {
		this.processing_flag = processing_flag;
	}

	public String getRow_update_time() {
		return row_update_time;
	}

	public void setRow_update_time(String row_update_time) {
		this.row_update_time = row_update_time;
	}

	public String getInternal_trans_id() {
		return internal_trans_id;
	}

	public void setInternal_trans_id(String internal_trans_id) {
		this.internal_trans_id = internal_trans_id;
	}

	public String getSub_flow_ids() {
		return sub_flow_ids;
	}

	public void setSub_flow_ids(String sub_flow_ids) {
		this.sub_flow_ids = sub_flow_ids;
	}

	@Override
	public String toString() {
		return "GetSubsFlowTrackerCurData [network_id=" + network_id
				+ ", request_data=" + request_data + ", flow_id=" + flow_id
				+ ", transaction_id=" + transaction_id + ", transaction_date="
				+ transaction_date + ", processing_flag=" + processing_flag
				+ ", row_update_time=" + row_update_time
				+ ", internal_trans_id=" + internal_trans_id
				+ ", sub_flow_ids=" + sub_flow_ids + "]";
	}

}
