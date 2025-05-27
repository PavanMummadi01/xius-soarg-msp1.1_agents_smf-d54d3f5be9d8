package com.xius.smf.domaindata;


public class TIARetryCursorDtlsData {

	private Long imsi;
	private Long sim_serial_no;
	private Long old_msisdn_no;
	private Long msisdn_no;
    private String trans_id;
	private Long network_id;
	private Long activity_id;
	
	
	/**
	 * @return the activity_id
	 */
	public Long getActivity_id() {
		return activity_id;
	}
	/**
	 * @param activity_id the activity_id to set
	 */
	public void setActivity_id(Long activity_id) {
		this.activity_id = activity_id;
	}
	/**
	 * @return the imsi
	 */
	public Long getImsi() {
		return imsi;
	}
	/**
	 * @param imsi the imsi to set
	 */
	public void setImsi(Long imsi) {
		this.imsi = imsi;
	}
	/**
	 * @return the sim_serial_no
	 */
	public Long getSim_serial_no() {
		return sim_serial_no;
	}
	/**
	 * @param sim_serial_no the sim_serial_no to set
	 */
	public void setSim_serial_no(Long sim_serial_no) {
		this.sim_serial_no = sim_serial_no;
	}
	/**
	 * @return the old_msisdn_no
	 */
	public Long getOld_msisdn_no() {
		return old_msisdn_no;
	}
	/**
	 * @param old_msisdn_no the old_msisdn_no to set
	 */
	public void setOld_msisdn_no(Long old_msisdn_no) {
		this.old_msisdn_no = old_msisdn_no;
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
	 * @return the trans_id
	 */
	public String getTrans_id() {
		return trans_id;
	}
	/**
	 * @param trans_id the trans_id to set
	 */
	public void setTrans_id(String trans_id) {
		this.trans_id = trans_id;
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
	
	
	
}
