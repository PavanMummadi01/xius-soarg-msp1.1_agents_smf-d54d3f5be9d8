package com.xius.smf.webservices.smfservices;

import java.math.BigDecimal;

public class PaymentInquiryCursorData {

	private String status;
	private String transRefNum;
	private Long invoiceId;
	private String tranxDate;
	private BigDecimal amountPaid;
	private String paymentMode;
	private Long paymentRefID;
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTransRefNum() {
		return transRefNum;
	}
	public void setTransRefNum(String transRefNum) {
		this.transRefNum = transRefNum;
	}
	public Long getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getTranxDate() {
		return tranxDate;
	}
	public void setTranxDate(String tranxDate) {
		this.tranxDate = tranxDate;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public Long getPaymentRefID() {
		return paymentRefID;
	}
	public void setPaymentRefID(Long paymentRefID) {
		this.paymentRefID = paymentRefID;
	}
	
	
	public BigDecimal getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(BigDecimal amountPaid) {
		this.amountPaid = amountPaid;
	}
	@Override
	public String toString() {
		return "PaymentInquiryCursorData [status=" + status + ", transRefNum="
				+ transRefNum + ", invoiceId=" + invoiceId + ", tranxDate="
				+ tranxDate + ", amountPaid=" + amountPaid + ", paymentMode="
				+ paymentMode + ", paymentRefID=" + paymentRefID + "]";
	}

	
	
	

}
