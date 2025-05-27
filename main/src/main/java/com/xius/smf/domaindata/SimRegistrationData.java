package com.xius.smf.domaindata;

public class SimRegistrationData extends DomainDataBase {

	String pi_sim_no;
	Long pi_id_type;
	String pi_id_no;
	String pi_user_id;
	String pi_ext_trans_id;
	String pi_channel;
	private long pi_nir;
	private long pi_sna;
	private long pi_state_id;
	private String pi_tpid;
	private String pi_user_define;
	String po_transaction_id;

	public long getPi_nir() {
		return pi_nir;
	}

	public void setPi_nir(long pi_nir) {
		this.pi_nir = pi_nir;
	}

	public long getPi_sna() {
		return pi_sna;
	}

	public void setPi_sna(long pi_sna) {
		this.pi_sna = pi_sna;
	}

	public long getPi_state_id() {
		return pi_state_id;
	}

	public void setPi_state_id(long pi_state_id) {
		this.pi_state_id = pi_state_id;
	}

	public String getPi_tpid() {
		return pi_tpid;
	}

	public void setPi_tpid(String pi_tpid) {
		this.pi_tpid = pi_tpid;
	}

	public String getPi_user_define() {
		return pi_user_define;
	}

	public void setPi_user_define(String pi_user_define) {
		this.pi_user_define = pi_user_define;
	}

	public String getPi_sim_no() {
		return pi_sim_no;
	}

	public void setPi_sim_no(String pi_sim_no) {
		this.pi_sim_no = pi_sim_no;
	}

	public Long getPi_id_type() {
		return pi_id_type;
	}

	public void setPi_id_type(Long pi_id_type) {
		this.pi_id_type = pi_id_type;
	}

	public String getPi_id_no() {
		return pi_id_no;
	}

	public void setPi_id_no(String pi_id_no) {
		this.pi_id_no = pi_id_no;
	}

	public String getPi_user_id() {
		return pi_user_id;
	}

	public void setPi_user_id(String pi_user_id) {
		this.pi_user_id = pi_user_id;
	}

	public String getPi_ext_trans_id() {
		return pi_ext_trans_id;
	}

	public void setPi_ext_trans_id(String pi_ext_trans_id) {
		this.pi_ext_trans_id = pi_ext_trans_id;
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

	@Override
	public String toString() {
		return "SimRegistrationData [pi_sim_no=" + pi_sim_no + ", pi_id_type="
				+ pi_id_type + ", pi_id_no=" + pi_id_no + ", pi_user_id="
				+ pi_user_id + ", pi_ext_trans_id=" + pi_ext_trans_id
				+ ", pi_channel=" + pi_channel + ", pi_nir=" + pi_nir
				+ ", pi_sna=" + pi_sna + ", pi_state_id=" + pi_state_id
				+ ", pi_tpid=" + pi_tpid + ", pi_user_define=" + pi_user_define
				+ ", po_transaction_id=" + po_transaction_id + "]";
	}
}
