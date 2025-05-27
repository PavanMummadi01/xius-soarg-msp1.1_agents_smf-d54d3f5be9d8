package com.xius.smf.domaindata;

import java.util.Arrays;



public class ForceSimActivationInsertData extends DomainDataBase {
	
	private String po_trans_id;
	private String pi_network_name;
	private String pi_file_name;
	private String[] pi_sim;
	private String[] pi_msisdn;
	private String[] pi_tpid;
	private long[] pi_sna;
	private long[] pi_nir;
	
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
	public String[] getPi_sim() {
		return pi_sim;
	}
	public void setPi_sim(String[] pi_sim) {
		this.pi_sim = pi_sim;
	}
	public String[] getPi_msisdn() {
		return pi_msisdn;
	}
	public void setPi_msisdn(String[] pi_msisdn) {
		this.pi_msisdn = pi_msisdn;
	}
	public String[] getPi_tpid() {
		return pi_tpid;
	}
	public void setPi_tpid(String[] pi_tpid) {
		this.pi_tpid = pi_tpid;
	}
	public long[] getPi_sna() {
		return pi_sna;
	}
	public void setPi_sna(long[] pi_sna) {
		this.pi_sna = pi_sna;
	}
	public long[] getPi_nir() {
		return pi_nir;
	}
	public void setPi_nir(long[] pi_nir) {
		this.pi_nir = pi_nir;
	}
	
	
	@Override
	public String toString() {
		return "ForceSimActivationInsertData [po_trans_id=" + po_trans_id
				+ ", pi_network_name=" + pi_network_name + ", pi_file_name="
				+ pi_file_name + ", pi_sim=" + Arrays.toString(pi_sim)
				+ ", pi_msisdn=" + Arrays.toString(pi_msisdn) + ", pi_tpid="
				+ Arrays.toString(pi_tpid) + ", pi_sna="
				+ Arrays.toString(pi_sna) + ", pi_nir="
				+ Arrays.toString(pi_nir) + "]";
	}
	
	
	
}