package com.xius.smf.domaindata;

import java.math.BigDecimal;

public class BulkCorpRctCursorData extends DomainDataBase {
	private String transaction_id;
	private Long msisdn_no;
	private Long network_id;
	private String user_id;
	private String activity_type;
	private String reason;
	private String channel_id;
	
	private String rc_id;
	private String rc_category;
	private BigDecimal rc_amount;
	
	private BigDecimal mrp;
	private Long office_code;
	
	public String getRc_id() {
		return rc_id;
	}

	public void setRc_id(String rc_id) {
		this.rc_id = rc_id;
	}

	public String getRc_category() {
		return rc_category;
	}

	public void setRc_category(String rc_category) {
		this.rc_category = rc_category;
	}

	public BigDecimal getRc_amount() {
		return rc_amount;
	}

	public void setRc_amount(BigDecimal rc_amount) {
		this.rc_amount = rc_amount;
	}

	public BigDecimal getMrp() {
		return mrp;
	}

	public void setMrp(BigDecimal mrp) {
		this.mrp = mrp;
	}

	public Long getOffice_code() {
		return office_code;
	}

	public void setOffice_code(Long office_code) {
		this.office_code = office_code;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getActivity_type() {
		return activity_type;
	}

	public void setActivity_type(String activity_type) {
		this.activity_type = activity_type;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getChannel_id() {
		return channel_id;
	}

	public void setChannel_id(String channel_id) {
		this.channel_id = channel_id;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public Long getMsisdn_no() {
		return msisdn_no;
	}

	public void setMsisdn_no(Long msisdn_no) {
		this.msisdn_no = msisdn_no;
	}

	public Long getNetwork_id() {
		return network_id;
	}

	public void setNetwork_id(Long network_id) {
		this.network_id = network_id;
	}

}
