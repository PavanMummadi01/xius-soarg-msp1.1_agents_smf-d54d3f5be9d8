package com.xius.smf.domaindata;

import java.math.BigDecimal;

public class BulkTPSubsUpdateData extends DomainDataBase {
	private String pi_transaction_id;

	private BigDecimal pi_charge;
	private String pi_old_tarrif_pack_id;
	private String pi_status;
	private String pi_remarks;
	private String pi_ext_error_code;
	public String getPi_transaction_id() {
		return pi_transaction_id;
	}

	

	public void setPi_transaction_id(String pi_transaction_id) {
		this.pi_transaction_id = pi_transaction_id;
	}

	public BigDecimal getPi_charge() {
		return pi_charge;
	}

	public void setPi_charge(BigDecimal pi_charge) {
		this.pi_charge = pi_charge;
	}

	public String getPi_old_tarrif_pack_id() {
		return pi_old_tarrif_pack_id;
	}

	public void setPi_old_tarrif_pack_id(String pi_old_tarrif_pack_id) {
		this.pi_old_tarrif_pack_id = pi_old_tarrif_pack_id;
	}

	public String getPi_status() {
		return pi_status;
	}

	public void setPi_status(String pi_status) {
		this.pi_status = pi_status;
	}

	public String getPi_remarks() {
		return pi_remarks;
	}

	public void setPi_remarks(String pi_remarks) {
		this.pi_remarks = pi_remarks;
	}

	public String getPi_ext_error_code() {
		return pi_ext_error_code;
	}

	public void setPi_ext_error_code(String pi_ext_error_code) {
		this.pi_ext_error_code = pi_ext_error_code;
	}



	@Override
	public String toString() {
		return "BulkTPSubsUpdateData [pi_transaction_id=" + pi_transaction_id
				+ ", pi_charge=" + pi_charge + ", pi_old_tarrif_pack_id="
				+ pi_old_tarrif_pack_id + ", pi_status=" + pi_status
				+ ", pi_remarks=" + pi_remarks + ", pi_ext_error_code="
				+ pi_ext_error_code + "]";
	}
	
	
	

}
