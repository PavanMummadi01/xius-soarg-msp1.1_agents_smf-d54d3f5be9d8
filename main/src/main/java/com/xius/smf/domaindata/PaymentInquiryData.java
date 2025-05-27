package com.xius.smf.domaindata;

import java.util.ArrayList;

import com.xius.smf.webservices.smfservices.PaymentInquiryCursorData;

public class PaymentInquiryData extends DomainDataBase{

	private Long pi_network_id;
	private String pi_ext_trans_id;
	private String pi_transaction_id;
	private ArrayList<PaymentInquiryCursorData> po_enquiry_dtls;
	
	
	
	public Long getPi_network_id() {
		return pi_network_id;
	}
	public void setPi_network_id(Long pi_network_id) {
		this.pi_network_id = pi_network_id;
	}
	public String getPi_ext_trans_id() {
		return pi_ext_trans_id;
	}
	public void setPi_ext_trans_id(String pi_ext_trans_id) {
		this.pi_ext_trans_id = pi_ext_trans_id;
	}
	public String getPi_transaction_id() {
		return pi_transaction_id;
	}
	public void setPi_transaction_id(String pi_transaction_id) {
		this.pi_transaction_id = pi_transaction_id;
	}
	public ArrayList<PaymentInquiryCursorData> getPo_enquiry_dtls() {
		return po_enquiry_dtls;
	}
	public void setPo_enquiry_dtls(
			ArrayList<PaymentInquiryCursorData> po_enquiry_dtls) {
		this.po_enquiry_dtls = po_enquiry_dtls;
	}
	
	
	
	@Override
	public String toString() {
		return "PaymentInquiryData [pi_network_id=" + pi_network_id
				+ ", pi_ext_trans_id=" + pi_ext_trans_id
				+ ", pi_transaction_id=" + pi_transaction_id
				+ ", po_enquiry_dtls=" + po_enquiry_dtls + "]";
	}
	
	
	

  
}
