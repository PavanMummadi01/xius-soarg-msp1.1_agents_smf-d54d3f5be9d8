package com.xius.smf.domaindata;

import java.util.ArrayList;

public class PaymentTransReportData extends DomainDataBase {

	private Long pi_msisdn_no;
	private Long pi_account_id;
	private String pi_from_date;
	private String pi_to_date;
	private Long pi_max_records;
	private Long pi_next_rec_index;
	private Long po_total_records;
	private ArrayList<PaymentDtlsCursorData> po_payment_trans_dtls;

	public Long getPi_msisdn_no() {
		return pi_msisdn_no;
	}

	public void setPi_msisdn_no(Long pi_msisdn_no) {
		this.pi_msisdn_no = pi_msisdn_no;
	}

	public Long getPi_account_id() {
		return pi_account_id;
	}

	public void setPi_account_id(Long pi_account_id) {
		this.pi_account_id = pi_account_id;
	}

	public String getPi_from_date() {
		return pi_from_date;
	}

	public void setPi_from_date(String pi_from_date) {
		this.pi_from_date = pi_from_date;
	}

	public String getPi_to_date() {
		return pi_to_date;
	}

	public void setPi_to_date(String pi_to_date) {
		this.pi_to_date = pi_to_date;
	}

	public Long getPi_max_records() {
		return pi_max_records;
	}

	public void setPi_max_records(Long pi_max_records) {
		this.pi_max_records = pi_max_records;
	}

	public Long getPi_next_rec_index() {
		return pi_next_rec_index;
	}

	public void setPi_next_rec_index(Long pi_next_rec_index) {
		this.pi_next_rec_index = pi_next_rec_index;
	}

	public Long getPo_total_records() {
		return po_total_records;
	}

	public void setPo_total_records(Long po_total_records) {
		this.po_total_records = po_total_records;
	}

	public ArrayList<PaymentDtlsCursorData> getPo_payment_trans_dtls() {
		return po_payment_trans_dtls;
	}

	public void setPo_payment_trans_dtls(
			ArrayList<PaymentDtlsCursorData> po_payment_trans_dtls) {
		this.po_payment_trans_dtls = po_payment_trans_dtls;
	}

	@Override
	public String toString() {
		return "PaymentTransReportData [pi_msisdn_no=" + pi_msisdn_no
				+ ", pi_account_id=" + pi_account_id + ", pi_from_date="
				+ pi_from_date + ", pi_to_date=" + pi_to_date
				+ ", pi_max_records=" + pi_max_records + ", pi_next_rec_index="
				+ pi_next_rec_index + ", po_total_records=" + po_total_records
				+ ", po_payment_trans_dtls=" + po_payment_trans_dtls + "]";
	}
	
	
}
