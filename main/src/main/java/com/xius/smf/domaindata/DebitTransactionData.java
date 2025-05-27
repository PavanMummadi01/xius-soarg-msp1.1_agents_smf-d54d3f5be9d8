package com.xius.smf.domaindata;

import java.math.BigDecimal;

public class DebitTransactionData extends DomainDataBase {

	private Long pi_msisdn_no;
	private String pi_ext_trans_id;
	private BigDecimal amtToDebit;
	private String po_activity_id;
	private String po_trans_id;
	private String operation;
	
	
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public Long getPi_msisdn_no() {
		return pi_msisdn_no;
	}
	public void setPi_msisdn_no(Long pi_msisdn_no) {
		this.pi_msisdn_no = pi_msisdn_no;
	}
	public String getPi_ext_trans_id() {
		return pi_ext_trans_id;
	}
	public void setPi_ext_trans_id(String pi_ext_trans_id) {
		this.pi_ext_trans_id = pi_ext_trans_id;
	}
	public BigDecimal getAmtToDebit() {
		return amtToDebit;
	}
	public void setAmtToDebit(BigDecimal amtToDebit) {
		this.amtToDebit = amtToDebit;
	}
	public String getPo_activity_id() {
		return po_activity_id;
	}
	public void setPo_activity_id(String po_activity_id) {
		this.po_activity_id = po_activity_id;
	}
	public String getPo_trans_id() {
		return po_trans_id;
	}
	public void setPo_trans_id(String po_trans_id) {
		this.po_trans_id = po_trans_id;
	}
	@Override
	public String toString() {
		return "DebitTransactionData [pi_msisdn_no=" + pi_msisdn_no
				+ ", pi_ext_trans_id=" + pi_ext_trans_id + ", amtToDebit="
				+ amtToDebit + ", po_activity_id=" + po_activity_id
				+ ", po_trans_id=" + po_trans_id + "]";
	}

	
	
	
	
}
