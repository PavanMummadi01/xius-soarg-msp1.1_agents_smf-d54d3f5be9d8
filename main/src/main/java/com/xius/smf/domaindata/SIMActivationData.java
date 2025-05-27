package com.xius.smf.domaindata;

public class SIMActivationData extends DomainDataBase {

	private String pi_sim_serial_no;
	private Long pi_imsi;
	private Long pi_msisdn_no;
	private Long pi_curr_state_id;
	private String pi_custom_field1;
	private String pi_channel;
	private String po_trans_id;
	private Long pi_sna;
	private Long pi_nir;

	public Long getPi_sna() {
		return pi_sna;
	}

	public void setPi_sna(Long pi_sna) {
		this.pi_sna = pi_sna;
	}

	public Long getPi_nir() {
		return pi_nir;
	}

	public void setPi_nir(Long pi_nir) {
		this.pi_nir = pi_nir;
	}

	private String pi_activity_type;

	private String pi_link_transaction_id;

	private Long pi_old_msisdn_no;

	public Long getPi_old_msisdn_no() {
		return pi_old_msisdn_no;
	}

	public void setPi_old_msisdn_no(Long pi_old_msisdn_no) {
		this.pi_old_msisdn_no = pi_old_msisdn_no;
	}

	public String getPi_activity_type() {
		return pi_activity_type;
	}

	public void setPi_activity_type(String pi_activity_type) {
		this.pi_activity_type = pi_activity_type;
	}

	public String getPi_link_transaction_id() {
		return pi_link_transaction_id;
	}

	public void setPi_link_transaction_id(String pi_link_transaction_id) {
		this.pi_link_transaction_id = pi_link_transaction_id;
	}

	public String getPi_sim_serial_no() {
		return pi_sim_serial_no;
	}

	public void setPi_sim_serial_no(String pi_sim_serial_no) {
		this.pi_sim_serial_no = pi_sim_serial_no;
	}

	public Long getPi_imsi() {
		return pi_imsi;
	}

	public void setPi_imsi(Long pi_imsi) {
		this.pi_imsi = pi_imsi;
	}

	public Long getPi_msisdn_no() {
		return pi_msisdn_no;
	}

	public void setPi_msisdn_no(Long pi_msisdn_no) {
		this.pi_msisdn_no = pi_msisdn_no;
	}

	public Long getPi_curr_state_id() {
		return pi_curr_state_id;
	}

	public void setPi_curr_state_id(Long pi_curr_state_id) {
		this.pi_curr_state_id = pi_curr_state_id;
	}

	public String getPi_custom_field1() {
		return pi_custom_field1;
	}

	public void setPi_custom_field1(String pi_custom_field1) {
		this.pi_custom_field1 = pi_custom_field1;
	}

	public String getPo_trans_id() {
		return po_trans_id;
	}

	public void setPo_trans_id(String po_trans_id) {
		this.po_trans_id = po_trans_id;
	}

	/**
	 * @return the pi_channel
	 */
	public String getPi_channel() {
		return pi_channel;
	}

	/**
	 * @param pi_channel the pi_channel to set
	 */
	public void setPi_channel(String pi_channel) {
		this.pi_channel = pi_channel;
	}

}
