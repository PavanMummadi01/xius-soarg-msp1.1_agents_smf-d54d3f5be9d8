package com.xius.smf.domaindata;

public class BulkLUJobData extends DomainDataBase{
	private String pi_iccid = null;
	private Long pi_nir_code = null;
	private String pi_office_code = null;
	private String po_IMSI = null;
	private String SIMNo=null;
	private String trans_id ;
	private String finalStatus=null;
	private String pi_remarks=null;
	private String channel ;
	
	
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
	public String getFinalStatus() {
		return finalStatus;
	}
	public void setFinalStatus(String finalStatus) {
		this.finalStatus = finalStatus;
	}
	public String getSIMNo() {
		return SIMNo;
	}
	public void setSIMNo(String no) {
		SIMNo = no;
	}
	public String getPi_iccid() {
		return pi_iccid;
	}
	public void setPi_iccid(String pi_iccid) {
		this.pi_iccid = pi_iccid;
	}
	public Long getPi_nir_code() {
		return pi_nir_code;
	}
	public void setPi_nir_code(Long pi_nir_code) {
		this.pi_nir_code = pi_nir_code;
	}
	public String getPi_office_code() {
		return pi_office_code;
	}
	public void setPi_office_code(String pi_office_code) {
		this.pi_office_code = pi_office_code;
	}
	public String getPo_IMSI() {
		return po_IMSI;
	}
	public void setPo_IMSI(String po_IMSI) {
		this.po_IMSI = po_IMSI;
	}
	/**
	 * @param trans_id the trans_id to set
	 */
	public void setTrans_id(String trans_id) {
		this.trans_id = trans_id;
	}
	/**
	 * @return the trans_id
	 */
	public String getTrans_id() {
		return trans_id;
	}
	/**
	 * @param pi_remarks the pi_remarks to set
	 */
	public void setPi_remarks(String pi_remarks) {
		this.pi_remarks = pi_remarks;
	}
	/**
	 * @return the pi_remarks
	 */
	public String getPi_remarks() {
		return pi_remarks;
	}
	

}
