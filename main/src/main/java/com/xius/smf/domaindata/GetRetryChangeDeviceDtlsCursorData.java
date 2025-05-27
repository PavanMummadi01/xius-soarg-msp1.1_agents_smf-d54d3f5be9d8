package com.xius.smf.domaindata;

public class GetRetryChangeDeviceDtlsCursorData {
	
//network_id, transaction_id, activity_type, failed_node
	private Long network_id ;
	private String transaction_id;
	private String activity_type;
	private String failed_node;
	
	
	public Long getNetwork_id() {
		return network_id;
	}
	public void setNetwork_id(Long network_id) {
		this.network_id = network_id;
	}
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getActivity_type() {
		return activity_type;
	}
	public void setActivity_type(String activity_type) {
		this.activity_type = activity_type;
	}
	public String getFailed_node() {
		return failed_node;
	}
	public void setFailed_node(String failed_node) {
		this.failed_node = failed_node;
	}
	@Override
	public String toString() {
		return "GetRetryChangeDeviceDtlsCursorData [network_id=" + network_id
				+ ", transaction_id=" + transaction_id + ", activity_type="
				+ activity_type + ", failed_node=" + failed_node + "]";
	}
	
}