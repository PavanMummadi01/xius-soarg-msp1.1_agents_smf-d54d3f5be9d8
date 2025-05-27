package com.xius.smf.domaindata;

public class PaytmTxStatusRetryCursorData {

	private Integer network_id;
	private Long msisdn_no;
	private Long account_id;
	private String transaction_id; //orderId
	private String ext_trans_id;
	private String payment_type;
	private String channel;
	private String user_id;
	private String rc_code;
	private String wallet_type;
	private String retry_transaction_id;
	
	
	public String getRetry_transaction_id() {
		return retry_transaction_id;
	}
	public void setRetry_transaction_id(String retry_transaction_id) {
		this.retry_transaction_id = retry_transaction_id;
	}
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
	public Long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getExt_trans_id() {
		return ext_trans_id;
	}
	public void setExt_trans_id(String ext_trans_id) {
		this.ext_trans_id = ext_trans_id;
	}
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getRc_code() {
		return rc_code;
	}
	public void setRc_code(String rc_code) {
		this.rc_code = rc_code;
	}
	public String getWallet_type() {
		return wallet_type;
	}
	public void setWallet_type(String wallet_type) {
		this.wallet_type = wallet_type;
	}
	
	
	@Override
	public String toString() {
		return "PaytmTxStatusRetryCursorData [network_id=" + network_id
				+ ", msisdn_no=" + msisdn_no + ", account_id=" + account_id
				+ ", transaction_id=" + transaction_id + ", ext_trans_id="
				+ ext_trans_id + ", payment_type=" + payment_type
				+ ", channel=" + channel + ", user_id=" + user_id
				+ ", rc_code=" + rc_code + ", wallet_type=" + wallet_type + "]";
	}

	
	
	
	

}
