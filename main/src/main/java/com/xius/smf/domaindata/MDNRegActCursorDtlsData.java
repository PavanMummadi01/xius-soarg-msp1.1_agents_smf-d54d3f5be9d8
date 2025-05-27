package com.xius.smf.domaindata;

public class MDNRegActCursorDtlsData {

	private Long network_id ;
	private Long msisdn_no ;
	private String user_id ;
	private String action_flag ;
	private String networkName ;
	private Long msdn_rec_trans_id ;
	private String tarifplan_id;
	private Long sna ;
	private Long nir ;
	private String sim;
	
	public Long getSna() {
		return sna;
	}
	public void setSna(Long sna) {
		this.sna = sna;
	}
	public Long getNir() {
		return nir;
	}
	public void setNir(Long nir) {
		this.nir = nir;
	}
	public String getSim() {
		return sim;
	}
	public void setSim(String sim) {
		this.sim = sim;
	}
	/**
	 * @return the msisdn_no
	 */
	public Long getMsisdn_no() {
		return msisdn_no;
	}
	/**
	 * @param msisdn_no the msisdn_no to set
	 */
	public void setMsisdn_no(Long msisdn_no) {
		this.msisdn_no = msisdn_no;
	}
	/**
	 * @return the network_id
	 */
	public Long getNetwork_id() {
		return network_id;
	}
	/**
	 * @param network_id the network_id to set
	 */
	public void setNetwork_id(Long network_id) {
		this.network_id = network_id;
	}
	/**
	 * @return the user_id
	 */
	public String getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	/**
	 * @return the action_flag
	 */
	public String getAction_flag() {
		return action_flag;
	}
	/**
	 * @param action_flag the action_flag to set
	 */
	public void setAction_flag(String action_flag) {
		this.action_flag = action_flag;
	}
	/**
	 * @return the networkName
	 */
	public String getNetworkName() {
		return networkName;
	}
	/**
	 * @param networkName the networkName to set
	 */
	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}
	/**
	 * @return the msdn_rec_trans_id
	 */
	public Long getMsdn_rec_trans_id() {
		return msdn_rec_trans_id;
	}
	/**
	 * @param msdn_rec_trans_id the msdn_rec_trans_id to set
	 */
	public void setMsdn_rec_trans_id(Long msdn_rec_trans_id) {
		this.msdn_rec_trans_id = msdn_rec_trans_id;
	}
	/**
	 * @param tarifplan_id the tarifplan_id to set
	 */
	public void setTarifplan_id(String tarifplan_id) {
		this.tarifplan_id = tarifplan_id;
	}
	/**
	 * @return the tarifplan_id
	 */
	public String getTarifplan_id() {
		return tarifplan_id;
	}
	
}
