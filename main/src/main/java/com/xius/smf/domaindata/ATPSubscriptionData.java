package com.xius.smf.domaindata;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ATPSubscriptionData extends DomainDataBase{
	
	private String pi_publicity_id;
	private Long pi_msisdn_no;
	private String pi_channel;
	private String po_transaction_id;
	
	public String getPi_publicity_id() {
		return pi_publicity_id;
	}
	public void setPi_publicity_id(String pi_publicity_id) {
		this.pi_publicity_id = pi_publicity_id;
	}
	public Long getPi_msisdn_no() {
		return pi_msisdn_no;
	}
	public void setPi_msisdn_no(Long pi_msisdn_no) {
		this.pi_msisdn_no = pi_msisdn_no;
	}
	public String getPi_channel() {
		return pi_channel;
	}
	public void setPi_channel(String pi_channel) {
		this.pi_channel = pi_channel;
	}
	public String getPo_transaction_id() {
		return po_transaction_id;
	}
	public void setPo_transaction_id(String po_transaction_id) {
		this.po_transaction_id = po_transaction_id;
	}

	public String toString() {
		return "ATPSubscriptionData [pi_publicity_id=" + pi_publicity_id
				+ ", pi_msisdn_no=" + pi_msisdn_no + ", pi_channel="
				+ pi_channel + ", po_transaction_id=" + po_transaction_id
				+ ", pi_network_id=" + pi_network_id + ", pi_login_id="
				+ pi_login_id + ", pi_password=" + pi_password
				+ ", pi_username=" + pi_username + ", po_error_code="
				+ po_error_code + ", pi_app_id=" + pi_app_id
				+ ", po_error_desc=" + po_error_desc + "]";
	}
}
