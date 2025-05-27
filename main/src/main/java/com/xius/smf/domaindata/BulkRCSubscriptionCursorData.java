
package com.xius.smf.domaindata;

import java.math.BigDecimal;

public class BulkRCSubscriptionCursorData {
	/*
	 * msisdn_no, office_code, transaction_no, status, amount, created_date,
	 * network_id, rc_code, rc_category, batch_seq_id
	 */

	private Long msisdn_no;
	private Long office_code;
	private String status;
	private Long transaction_no;
	private BigDecimal amount;
	private String created_date;
	private Long network_id;
	private String rc_code;
	private String rc_category;
	private Long batch_seq_id;

	private String frequency_type;
	private BigDecimal lb_value;

	public Long getMsisdn_no() {
		return msisdn_no;
	}

	public String getFrequency_type() {
		return frequency_type;
	}

	public void setFrequency_type(String frequency_type) {
		this.frequency_type = frequency_type;
	}

	public BigDecimal getLb_value() {
		return lb_value;
	}

	public void setLb_value(BigDecimal lb_value) {
		this.lb_value = lb_value;
	}

	public void setMsisdn_no(Long msisdn_no) {
		this.msisdn_no = msisdn_no;
	}

	public Long getOffice_code() {
		return office_code;
	}

	public void setOffice_code(Long office_code) {
		this.office_code = office_code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTransaction_no() {
		return transaction_no;
	}

	public void setTransaction_no(Long transaction_no) {
		this.transaction_no = transaction_no;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}

	public Long getNetwork_id() {
		return network_id;
	}

	public void setNetwork_id(Long network_id) {
		this.network_id = network_id;
	}

	public String getRc_code() {
		return rc_code;
	}

	public void setRc_code(String rc_code) {
		this.rc_code = rc_code;
	}

	public String getRc_category() {
		return rc_category;
	}

	public void setRc_category(String rc_category) {
		this.rc_category = rc_category;
	}

	public Long getBatch_seq_id() {
		return batch_seq_id;
	}

	public void setBatch_seq_id(Long batch_seq_id) {
		this.batch_seq_id = batch_seq_id;
	}

	@Override
	public String toString() {
		return "BulkRCSubscriptionCursorData [msisdn_no=" + msisdn_no
				+ ", office_code=" + office_code + ", status=" + status
				+ ", transaction_no=" + transaction_no + ", amount=" + amount
				+ ", created_date=" + created_date + ", network_id="
				+ network_id + ", rc_code=" + rc_code + ", rc_category="
				+ rc_category + ", batch_seq_id=" + batch_seq_id
				+ ", frequency_type=" + frequency_type + ", lb_value="
				+ lb_value + "]";
	}

}
