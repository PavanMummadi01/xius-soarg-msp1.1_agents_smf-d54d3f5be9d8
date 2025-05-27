package com.xius.smf.domaindata;

public class BulkStateChangeData extends DomainDataBase {

	
	
	private String pi_file_name;
	private Long[] pi_msisdn;
	private String[] pi_newsubscrstatus;
	private String[] pi_reason;
	private String pi_network_name;
	private String pi_channel_id;
	private String po_file_trans_id;
	
	public String getPi_file_name() {
		return pi_file_name;
	}
	public void setPi_file_name(String pi_file_name) {
		this.pi_file_name = pi_file_name;
	}
	public Long[] getPi_msisdn() {
		return pi_msisdn;
	}
	public void setPi_msisdn(Long[] pi_msisdn) {
		this.pi_msisdn = pi_msisdn;
	}
	public String[] getPi_newsubscrstatus() {
		return pi_newsubscrstatus;
	}
	public void setPi_newsubscrstatus(String[] pi_newsubscrstatus) {
		this.pi_newsubscrstatus = pi_newsubscrstatus;
	}
	public String[] getPi_reason() {
		return pi_reason;
	}
	public void setPi_reason(String[] pi_reason) {
		this.pi_reason = pi_reason;
	}
	public String getPi_network_name() {
		return pi_network_name;
	}
	public void setPi_network_name(String pi_network_name) {
		this.pi_network_name = pi_network_name;
	}
	public String getPi_channel_id() {
		return pi_channel_id;
	}
	public void setPi_channel_id(String pi_channel_id) {
		this.pi_channel_id = pi_channel_id;
	}
	public String getPo_file_trans_id() {
		return po_file_trans_id;
	}
	public void setPo_file_trans_id(String po_file_trans_id) {
		this.po_file_trans_id = po_file_trans_id;
	}
	
	
	
    
}