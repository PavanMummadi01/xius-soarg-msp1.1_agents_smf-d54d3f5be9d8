package com.xius.smf.domaindata;

public class BulkSimSwapInsertData extends DomainDataBase {

	private String po_trans_id;
	private String pi_network_name;
	private String pi_file_name;
	private String[] pi_new_sim;
	private String[] pi_old_msisdn;
	private String[] pi_reason;
	
	public String getPi_network_name() {
		return pi_network_name;
	}
	public void setPi_network_name(String pi_network_name) {
		this.pi_network_name = pi_network_name;
	}
	public String getPo_trans_id() {
		return po_trans_id;
	}
	
	public void setPo_trans_id(String po_trans_id) {
		this.po_trans_id = po_trans_id;
	}
	public String getPi_file_name() {
		return pi_file_name;
	}
	public void setPi_file_name(String pi_file_name) {
		this.pi_file_name = pi_file_name;
	}
	public String[] getPi_new_sim() {
		return pi_new_sim;
	}
	public void setPi_new_sim(String[] pi_new_sim) {
		this.pi_new_sim = pi_new_sim;
	}
	public String[] getPi_old_msisdn() {
		return pi_old_msisdn;
	}
	public void setPi_old_msisdn(String[] pi_old_msisdn) {
		this.pi_old_msisdn = pi_old_msisdn;
	}
	public String[] getPi_reason() {
		return pi_reason;
	}
	public void setPi_reason(String[] pi_reason) {
		this.pi_reason = pi_reason;
	}
	
}