package com.xius.smf.domaindata;



public class BulkMDNRegistrationData extends DomainDataBase {

	
	private String po_trans_id;
	private String[] pi_msisdn;
	private String[] pi_tp_id;
	private String pi_action_flag;
	private String pi_file_name;
	private String pi_network_name;
	
	
	public String getPi_network_name() {
		return pi_network_name;
	}

	public void setPi_network_name(String pi_network_name) {
		this.pi_network_name = pi_network_name;
	}


	
	public String getPi_file_name() {
		return pi_file_name;
	}

	public void setPi_file_name(String pi_file_name) {
		this.pi_file_name = pi_file_name;
	}

	public String getPo_trans_id() {
		return po_trans_id;
	}

	public void setPo_trans_id(String po_trans_id) {
		this.po_trans_id = po_trans_id;
	}

	public String[] getPi_msisdn() {
		return pi_msisdn;
	}


	public void setPi_msisdn(String[] pi_msisdn) {
		this.pi_msisdn = pi_msisdn;
	}

	public String getPi_action_flag() {
		return pi_action_flag;
	}

	public void setPi_action_flag(String pi_action_flag) {
		this.pi_action_flag = pi_action_flag;
	}
	
	/**
	 * @param pi_tp_id the pi_tp_id to set
	 */
	public void setPi_tp_id(String[] pi_tp_id) {
		this.pi_tp_id = pi_tp_id;
	}

	/**
	 * @return the pi_tp_id
	 */
	public String[] getPi_tp_id() {
		return pi_tp_id;
	}
		
}