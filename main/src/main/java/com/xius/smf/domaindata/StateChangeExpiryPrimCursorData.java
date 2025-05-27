package com.xius.smf.domaindata;

public class StateChangeExpiryPrimCursorData {
	
	
	private String cardnumber;
	private String customerid;
	private String isPrimary;
	private Long Exp_MSISDN;
	private String transactionId_del;
	private String transactionId_Mod;
	private Integer network_id;
	private Long primaryMSISDN;
	private String ext_operation;
	
	
	public String getExt_operation() {
		return ext_operation;
	}
	public void setExt_operation(String ext_operation) {
		this.ext_operation = ext_operation;
	}
	
	public Long getPrimaryMSISDN() {
		return primaryMSISDN;
	}
	public void setPrimaryMSISDN(Long primaryMSISDN) {
		this.primaryMSISDN = primaryMSISDN;
	}
	public Integer getNetwork_id() {
		return network_id;
	}
	public void setNetwork_id(Integer network_id) {
		this.network_id = network_id;
	}
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getIsPrimary() {
		return isPrimary;
	}
	public void setIsPrimary(String isPrimary) {
		this.isPrimary = isPrimary;
	}
	
	
	public Long getExp_MSISDN() {
		return Exp_MSISDN;
	}
	public void setExp_MSISDN(Long exp_MSISDN) {
		Exp_MSISDN = exp_MSISDN;
	}
	
	public String getTransactionId_Mod() {
		return transactionId_Mod;
	}
	public void setTransactionId_Mod(String transactionId_Mod) {
		this.transactionId_Mod = transactionId_Mod;
	}
	public String getTransactionId_del() {
		return transactionId_del;
	}
	public void setTransactionId_del(String transactionId_del) {
		this.transactionId_del = transactionId_del;
	}
	@Override
	public String toString() {
		return "StateChangeExpiryPrimCursorData [cardnumber=" + cardnumber
				+ ", customerid=" + customerid + ", isPrimary=" + isPrimary
				+ ", Exp_MSISDN=" + Exp_MSISDN + ", transactionId_del="
				+ transactionId_del + ", transactionId_Mod="
				+ transactionId_Mod + ", network_id=" + network_id
				+ ", primaryMSISDN=" + primaryMSISDN + ", ext_operation="
				+ ext_operation + "]";
	}
	
	
	
}
