package com.xius.smf.domaindata;

public class BulkSimSwapStatusUpdateData extends DomainDataBase{
	
	private String pi_file_trans_id;
	private String trans_id ;
	private String finalStatus;
	private String remarks;
	private String internal_ref_id;
	private String pi_old_sim;
	
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getInternal_ref_id() {
		return internal_ref_id;
	}
	public void setInternal_ref_id(String internal_ref_id) {
		this.internal_ref_id = internal_ref_id;
	}
	public String getPi_file_trans_id() {
		return pi_file_trans_id;
	}
	public void setPi_file_trans_id(String pi_file_trans_id) {
		this.pi_file_trans_id = pi_file_trans_id;
	}

	public String getFinalStatus() {
		return finalStatus;
	}
	public void setFinalStatus(String finalStatus) {
		this.finalStatus = finalStatus;
	}
	
	public void setTrans_id(String trans_id) {
		this.trans_id = trans_id;
	}
	
	public String getTrans_id() {
		return trans_id;
	}
	/**
	 * @param pi_msisdn_no the pi_msisdn_no to set
	 */
	public String getPi_old_sim() {
		return pi_old_sim;
	}
	public void setPi_old_sim(String pi_old_sim) {
		this.pi_old_sim = pi_old_sim;
	}
	
	@Override
	public String toString() {
		return "BulkSimSwapStatusUpdateData [pi_file_trans_id="
				+ pi_file_trans_id + ", trans_id=" + trans_id
				+ ", finalStatus=" + finalStatus + ", remarks=" + remarks
				+ ", internal_ref_id=" + internal_ref_id + ", pi_old_sim="
				+ pi_old_sim + "]";
	}
	
	
	
}
