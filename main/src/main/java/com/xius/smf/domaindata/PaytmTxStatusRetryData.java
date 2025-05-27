package com.xius.smf.domaindata;

import java.util.ArrayList;
import java.util.Arrays;

public class PaytmTxStatusRetryData extends DomainDataBase {
	private Integer network_id;
	private Long pi_max_records;
	private String pi_instance_id;
	private ArrayList<PaytmTxStatusRetryCursorData> po_transaction_details;

	public String getPi_instance_id() {
		return pi_instance_id;
	}

	public void setPi_instance_id(String pi_instance_id) {
		this.pi_instance_id = pi_instance_id;
	}

	

	public Integer getNetwork_id() {
		return network_id;
	}

	public void setNetwork_id(Integer network_id) {
		this.network_id = network_id;
	}

	public Long getPi_max_records() {
		return pi_max_records;
	}

	public void setPi_max_records(Long pi_max_records) {
		this.pi_max_records = pi_max_records;
	}

	public ArrayList<PaytmTxStatusRetryCursorData> getPo_transaction_details() {
		return po_transaction_details;
	}

	public void setPo_transaction_details(
			ArrayList<PaytmTxStatusRetryCursorData> po_transaction_details) {
		this.po_transaction_details = po_transaction_details;
	}

	@Override
	public String toString() {
		return "PaytmTxStatusRetryData [network_id=" + network_id
				+ ", pi_max_records=" + pi_max_records + ", pi_instance_id="
				+ pi_instance_id + ", po_transaction_details="
				+ po_transaction_details + "]";
	}

	

}
