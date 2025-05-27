package com.xius.smf.domaindata;

import java.math.BigDecimal;

public class ChangeTPData extends DomainDataBase {

	private Long pi_msisdn_no;
	private Long pi_account_id;
	private Long pi_new_tarrif_pack_id;
	private String pi_reason;
	private BigDecimal pi_charge;
	private String pi_channel_id;
	private String po_transaction_id;
	private String pi_old_tarrif_pack_id;
	private String pi_ext_trans_id;

	public String getPi_ext_trans_id() {
		return pi_ext_trans_id;
	}

	public void setPi_ext_trans_id(String pi_ext_trans_id) {
		this.pi_ext_trans_id = pi_ext_trans_id;
	}

	public String getPi_old_tarrif_pack_id() {
		return pi_old_tarrif_pack_id;
	}

	public void setPi_old_tarrif_pack_id(String pi_old_tarrif_pack_id) {
		this.pi_old_tarrif_pack_id = pi_old_tarrif_pack_id;
	}

	public Long getPi_msisdn_no() {
		return pi_msisdn_no;
	}

	public void setPi_msisdn_no(Long pi_msisdn_no) {
		this.pi_msisdn_no = pi_msisdn_no;
	}

	public Long getPi_new_tarrif_pack_id() {
		return pi_new_tarrif_pack_id;
	}

	public void setPi_new_tarrif_pack_id(Long pi_new_tarrif_pack_id) {
		this.pi_new_tarrif_pack_id = pi_new_tarrif_pack_id;
	}

	public String getPi_reason() {
		return pi_reason;
	}

	public void setPi_reason(String pi_reason) {
		this.pi_reason = pi_reason;
	}

	public BigDecimal getPi_charge() {
		return pi_charge;
	}

	public void setPi_charge(BigDecimal pi_charge) {
		this.pi_charge = pi_charge;
	}

	public String getPi_channel_id() {
		return pi_channel_id;
	}

	public void setPi_channel_id(String pi_channel_id) {
		this.pi_channel_id = pi_channel_id;
	}

	public String getPo_transaction_id() {
		return po_transaction_id;
	}

	public void setPo_transaction_id(String po_transaction_id) {
		this.po_transaction_id = po_transaction_id;
	}

	public Long getPi_account_id() {
		return pi_account_id;
	}

	public void setPi_account_id(Long pi_account_id) {
		this.pi_account_id = pi_account_id;
	}

	@Override
	public String toString() {
		return "ChangeTPData [pi_msisdn_no=" + pi_msisdn_no
				+ ", pi_account_id=" + pi_account_id
				+ ", pi_new_tarrif_pack_id=" + pi_new_tarrif_pack_id
				+ ", pi_reason=" + pi_reason + ", pi_charge=" + pi_charge
				+ ", pi_channel_id=" + pi_channel_id + ", po_transaction_id="
				+ po_transaction_id + ", pi_old_tarrif_pack_id="
				+ pi_old_tarrif_pack_id + ", pi_ext_trans_id="
				+ pi_ext_trans_id + "]";
	}

}
