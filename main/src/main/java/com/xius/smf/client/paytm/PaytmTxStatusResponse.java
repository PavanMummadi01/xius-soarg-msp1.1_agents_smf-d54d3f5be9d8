package com.xius.smf.client.paytm;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonProperty;


@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PaytmTxStatusResponse {
	
	@JsonProperty("MID")
	private String mId;
	
	@JsonProperty("TXNID")
	private String txnId; 
	
	@JsonProperty("ORDERID")
	private String  orderId;
	
	@JsonProperty("BANKTXNID")
	private String bankTxnId;
	
	@JsonProperty("TXNAMOUNT")
	private String  txnAmount;
	
	@JsonProperty("CURRENCY")
	private String currency;
	
	@JsonProperty("STATUS")
	private String  status;
	
	@JsonProperty("RESPCODE")
	private String  respCode;
	
	@JsonProperty("RESPMSG")
	private String  respMsg;
	
	@JsonProperty("TXNDATE")
	private String txnDate;
	
	@JsonProperty("GATEWAYNAME")
	private String  gatewayName;
	
	@JsonProperty("BANKNAME")
	private String  bankName;
	
	@JsonProperty("PAYMENTMODE")
	private String paymentMode;
	
	@JsonProperty("TXNTYPE")
	private String  txnType;
	
	@JsonProperty("REFUNDAMT")
	private String refundAmt;

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getBankTxnId() {
		return bankTxnId;
	}

	public void setBankTxnId(String bankTxnId) {
		this.bankTxnId = bankTxnId;
	}

	public String getTxnAmount() {
		return txnAmount;
	}

	public void setTxnAmount(String txnAmount) {
		this.txnAmount = txnAmount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRespCode() {
		return respCode;
	}

	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}

	public String getRespMsg() {
		return respMsg;
	}

	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}

	public String getTxnDate() {
		return txnDate;
	}

	public void setTxnDate(String txnDate) {
		this.txnDate = txnDate;
	}

	public String getGatewayName() {
		return gatewayName;
	}

	public void setGatewayName(String gatewayName) {
		this.gatewayName = gatewayName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getTxnType() {
		return txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

	public String getRefundAmt() {
		return refundAmt;
	}

	public void setRefundAmt(String refundAmt) {
		this.refundAmt = refundAmt;
	}

	@Override
	public String toString() {
		return "PaytmTxStatusResponse [mId=" + mId + ", txnId=" + txnId
				+ ", orderId=" + orderId + ", bankTxnId=" + bankTxnId
				+ ", txnAmount=" + txnAmount + ", currency=" + currency
				+ ", status=" + status + ", respCode=" + respCode
				+ ", respMsg=" + respMsg + ", txnDate=" + txnDate
				+ ", gatewayName=" + gatewayName + ", bankName=" + bankName
				+ ", paymentMode=" + paymentMode + ", txnType=" + txnType
				+ ", refundAmt=" + refundAmt + "]";
	}
	
	
	
	
	
	

}
