package com.xius.smf.domaindata;

public class GetBulkFluDtlsCursorData {
    
    private Integer network_id ;
	private String iccid_from ;
	private String iccid_to ;
	private Long nir_code ;
	private String office_code ;
	private String trans_id ;
	private String channel;
	
	
	
	/**
	 * @return the channel
	 */
	public String getChannel() {
		return channel;
	}
	/**
	 * @param channel the channel to set
	 */
	public void setChannel(String channel) {
		this.channel = channel;
	}
	/**
	 * @return the network_id
	 */
	public Integer getNetwork_id() {
		return network_id;
	}
	/**
	 * @param network_id the network_id to set
	 */
	public void setNetwork_id(Integer network_id) {
		this.network_id = network_id;
	}
	/**
	 * @return the iccid_from
	 */
	public String getIccid_from() {
		return iccid_from;
	}
	/**
	 * @param iccid_from the iccid_from to set
	 */
	public void setIccid_from(String iccid_from) {
		this.iccid_from = iccid_from;
	}
	/**
	 * @return the iccid_to
	 */
	public String getIccid_to() {
		return iccid_to;
	}
	/**
	 * @param iccid_to the iccid_to to set
	 */
	public void setIccid_to(String iccid_to) {
		this.iccid_to = iccid_to;
	}
	/**
	 * @return the nir_code
	 */
	public Long getNir_code() {
		return nir_code;
	}
	/**
	 * @param nir_code the nir_code to set
	 */
	public void setNir_code(Long nir_code) {
		this.nir_code = nir_code;
	}
	/**
	 * @return the office_code
	 */
	public String getOffice_code() {
		return office_code;
	}
	/**
	 * @param office_code the office_code to set
	 */
	public void setOffice_code(String office_code) {
		this.office_code = office_code;
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
	
	
}