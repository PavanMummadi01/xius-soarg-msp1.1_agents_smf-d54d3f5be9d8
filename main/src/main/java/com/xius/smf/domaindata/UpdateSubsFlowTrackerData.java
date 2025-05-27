package com.xius.smf.domaindata;

public class UpdateSubsFlowTrackerData extends DomainDataBase {

	private String pi_transaction_id;
	private String pi_processing_flag;
	private String pi_remarks;
	private String pi_internal_trans_id;
	private Long po_flowid;
	private Long po_msisdn;

	public Long getPo_flowid() {
		return po_flowid;
	}

	public void setPo_flowid(Long po_flowid) {
		this.po_flowid = po_flowid;
	}

	public Long getPo_msisdn() {
		return po_msisdn;
	}

	public void setPo_msisdn(Long po_msisdn) {
		this.po_msisdn = po_msisdn;
	}

	public String getPi_internal_trans_id() {
		return pi_internal_trans_id;
	}

	public void setPi_internal_trans_id(String pi_internal_trans_id) {
		this.pi_internal_trans_id = pi_internal_trans_id;
	}

	public String getPi_transaction_id() {
		return pi_transaction_id;
	}

	public void setPi_transaction_id(String pi_transaction_id) {
		this.pi_transaction_id = pi_transaction_id;
	}

	public String getPi_processing_flag() {
		return pi_processing_flag;
	}

	public void setPi_processing_flag(String pi_processing_flag) {
		this.pi_processing_flag = pi_processing_flag;
	}

	/**
	 * @param pi_remarks
	 *            the pi_remarks to set
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

	@Override
	public String toString() {
		return "UpdateSubsFlowTrackerData " + "[pi_transaction_id= "
				+ pi_transaction_id + "pi_processing_flag="
				+ pi_processing_flag + "pi_remarks=" + pi_remarks + "]";
	}

}
