package com.xius.smf.domaindata;

public class BulkSimSwapJobData extends DomainDataBase{
	
	private String pi_old_msisdn = null;
	private String pi_new_sim = null;
	private String trans_id ;
	private String finalStatus=null;
	private String pi_remarks=null;
	
	
	public String getFinalStatus() {
		return finalStatus;
	}
	public void setFinalStatus(String finalStatus) {
		this.finalStatus = finalStatus;
	}
	
	public String getPi_old_msisdn() {
		return pi_old_msisdn;
	}
	public void setPi_old_msisdn(String pi_old_msisdn) {
		this.pi_old_msisdn = pi_old_msisdn;
	}
	public String getPi_new_sim() {
		return pi_new_sim;
	}
	public void setPi_new_sim(String pi_new_sim) {
		this.pi_new_sim = pi_new_sim;
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
