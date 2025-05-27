package com.xius.smf.domaindata;

public class LTERetryProcessCursorData {
	/*
	 * msisdn_no, ext_transaction_id, account_type, acct_status ,service_flag
	 */
	
	private Long msisdn_no;
	private Long NETWORK_ID;
	private Long account_type;
	private String acct_status;
	private String service_flag;
	private String ext_transaction_id;
	private String INTERNAL_TRANSACTION_ID;
	
	
	public Long getNETWORK_ID() {
		return NETWORK_ID;
	}
	public void setNETWORK_ID(Long nETWORK_ID) {
		NETWORK_ID = nETWORK_ID;
	}
	public String getINTERNAL_TRANSACTION_ID() {
		return INTERNAL_TRANSACTION_ID;
	}
	public void setINTERNAL_TRANSACTION_ID(String iNTERNAL_TRANSACTION_ID) {
		INTERNAL_TRANSACTION_ID = iNTERNAL_TRANSACTION_ID;
	}
	public Long getMsisdn_no() {
		return msisdn_no;
	}
	public void setMsisdn_no(Long msisdn_no) {
		this.msisdn_no = msisdn_no;
	}
	public Long getAccount_type() {
		return account_type;
	}
	public void setAccount_type(Long account_type) {
		this.account_type = account_type;
	}
	public String getAcct_status() {
		return acct_status;
	}
	public void setAcct_status(String acct_status) {
		this.acct_status = acct_status;
	}
	public String getService_flag() {
		return service_flag;
	}
	public void setService_flag(String service_flag) {
		this.service_flag = service_flag;
	}
	public String getExt_transaction_id() {
		return ext_transaction_id;
	}
	public void setExt_transaction_id(String ext_transaction_id) {
		this.ext_transaction_id = ext_transaction_id;
	}
	
	
	@Override
	public String toString() {
		return "LTERetryProcessCursorData [msisdn_no=" + msisdn_no
				+ ", NETWORK_ID=" + NETWORK_ID + ", account_type="
				+ account_type + ", acct_status=" + acct_status
				+ ", service_flag=" + service_flag + ", ext_transaction_id="
				+ ext_transaction_id + ", INTERNAL_TRANSACTION_ID="
				+ INTERNAL_TRANSACTION_ID + "]";
	}
	
	
	
	
	
	
}
