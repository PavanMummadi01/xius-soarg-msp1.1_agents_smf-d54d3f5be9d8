package com.xius.smf.domaindata;

import java.math.BigDecimal;

public class PaymentDtlsCursorData {

	private String rc_code;
	private BigDecimal payment_amount;
	private String transaction_id;
	private String transaction_date;
	private String ext_trans_id;
	private String payment_type;
	private String status;
	private String remarks;
	private String description;
	private String ext_error_msg;
	private String wallet_type;
	private String payment_gatewaytype;
	private String user_id;
	

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPayment_gatewaytype() {
		return payment_gatewaytype;
	}

	public void setPayment_gatewaytype(String payment_gatewaytype) {
		this.payment_gatewaytype = payment_gatewaytype;
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

	public Long getRow_num() {
		return row_num;
	}

	public void setRow_num(Long row_num) {
		this.row_num = row_num;
	}

	private Long row_num;

	public BigDecimal getPayment_amount() {
		return payment_amount;
	}

	public void setPayment_amount(BigDecimal payment_amount) {
		this.payment_amount = payment_amount;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExt_error_msg() {
		return ext_error_msg;
	}

	public void setExt_error_msg(String ext_error_msg) {
		this.ext_error_msg = ext_error_msg;
	}

	@Override
	public String toString() {
		return "PaymentDtlsCursorData [rc_code=" + rc_code
				+ ", payment_amount=" + payment_amount + ", transaction_id="
				+ transaction_id + ", transaction_date=" + transaction_date
				+ ", ext_trans_id=" + ext_trans_id + ", payment_type="
				+ payment_type + ", status=" + status + ", remarks=" + remarks
				+ ", description=" + description + ", ext_error_msg="
				+ ext_error_msg + ", wallet_type=" + wallet_type
				+ ", payment_gatewaytype=" + payment_gatewaytype + ", row_num="
				+ row_num + ", user_id="+ user_id + "]";
	}

	
	
}
