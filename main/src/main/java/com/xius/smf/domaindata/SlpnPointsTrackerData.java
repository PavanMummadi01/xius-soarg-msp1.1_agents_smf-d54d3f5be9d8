package com.xius.smf.domaindata;

import java.math.BigDecimal;

public class SlpnPointsTrackerData extends DomainDataBase {

	
	private Long pi_msisdn_no;
	private String pi_client_id;
	private Long  pi_slpn_points;
	private BigDecimal  pi_recharge_denom;
	private String pi_reversal_ref_no;
	private String  pi_publicity_id;
	private String pi_operation;
	private String po_transaction_id;
	private String pi_channel;
	
	
	
	public String getPi_channel() {
		return pi_channel;
	}
	public void setPi_channel(String pi_channel) {
		this.pi_channel = pi_channel;
	}
	public Long getPi_msisdn_no() {
		return pi_msisdn_no;
	}
	public void setPi_msisdn_no(Long pi_msisdn_no) {
		this.pi_msisdn_no = pi_msisdn_no;
	}
	public String getPi_client_id() {
		return pi_client_id;
	}
	public void setPi_client_id(String pi_client_id) {
		this.pi_client_id = pi_client_id;
	}
	public Long getPi_slpn_points() {
		return pi_slpn_points;
	}
	public void setPi_slpn_points(Long pi_slpn_points) {
		this.pi_slpn_points = pi_slpn_points;
	}
	public BigDecimal getPi_recharge_denom() {
		return pi_recharge_denom;
	}
	public void setPi_recharge_denom(BigDecimal pi_recharge_denom) {
		this.pi_recharge_denom = pi_recharge_denom;
	}
	public String getPi_reversal_ref_no() {
		return pi_reversal_ref_no;
	}
	public void setPi_reversal_ref_no(String pi_reversal_ref_no) {
		this.pi_reversal_ref_no = pi_reversal_ref_no;
	}
	public String getPi_publicity_id() {
		return pi_publicity_id;
	}
	public void setPi_publicity_id(String pi_publicity_id) {
		this.pi_publicity_id = pi_publicity_id;
	}
	public String getPi_operation() {
		return pi_operation;
	}
	public void setPi_operation(String pi_operation) {
		this.pi_operation = pi_operation;
	}
	public String getPo_transaction_id() {
		return po_transaction_id;
	}
	public void setPo_transaction_id(String po_transaction_id) {
		this.po_transaction_id = po_transaction_id;
	}
	
	
	
	
	
	
	
}
