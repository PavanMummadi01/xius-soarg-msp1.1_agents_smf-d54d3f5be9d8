package com.xius.smf.domaindata;

public class TIARetryUpdateData extends DomainDataBase {

	private String pi_status; 
	private String  pi_remarks;
	private String  pi_transaction_id ;
	/**
	 * @return the pi_status
	 */
	public String getPi_status() {
		return pi_status;
	}
	/**
	 * @param pi_status the pi_status to set
	 */
	public void setPi_status(String pi_status) {
		this.pi_status = pi_status;
	}
	/**
	 * @return the pi_remarks
	 */
	public String getPi_remarks() {
		return pi_remarks;
	}
	/**
	 * @param pi_remarks the pi_remarks to set
	 */
	public void setPi_remarks(String pi_remarks) {
		this.pi_remarks = pi_remarks;
	}
	/**
	 * @return the pi_transaction_id
	 */
	public String getPi_transaction_id() {
		return pi_transaction_id;
	}
	/**
	 * @param pi_transaction_id the pi_transaction_id to set
	 */
	public void setPi_transaction_id(String pi_transaction_id) {
		this.pi_transaction_id = pi_transaction_id;
	}
	
}
