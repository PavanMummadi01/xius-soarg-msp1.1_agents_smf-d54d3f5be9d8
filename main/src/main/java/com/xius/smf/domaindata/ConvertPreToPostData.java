package com.xius.smf.domaindata;

import java.math.BigDecimal;

public class ConvertPreToPostData extends DomainDataBase {
	 
     private Long pi_account_id         ;
     private Long pi_msisdn_no        ;
     private String pi_ext_trans_id    ;
     private String  pi_user_id            ;
     private String  pi_channel          ;
     private Long   pi_tariff_pack_id     ;
     private String  pi_tariff_pack_name   ;
     private String  pi_reason;
     private Long pi_bill_cycle_day    ;
     public String getPi_activity_type() {
		return pi_activity_type;
	}
	public void setPi_activity_type(String pi_activity_type) {
		this.pi_activity_type = pi_activity_type;
	}
	private String   pi_activity_type;
     public Long getPi_bill_cycle_day() {
		return pi_bill_cycle_day;
	}
	public void setPi_bill_cycle_day(Long pi_bill_cycle_day) {
		this.pi_bill_cycle_day = pi_bill_cycle_day;
	}
	private BigDecimal  pi_credit_limit  ;
     private String   po_transaction_id  ;
     
    
	public String getPi_reason() {
		return pi_reason;
	}
	public void setPi_reason(String pi_reason) {
		this.pi_reason = pi_reason;
	}
	public Long getPi_account_id() {
		return pi_account_id;
	}
	public void setPi_account_id(Long pi_account_id) {
		this.pi_account_id = pi_account_id;
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
	public String getPi_user_id() {
		return pi_user_id;
	}
	public void setPi_user_id(String pi_user_id) {
		this.pi_user_id = pi_user_id;
	}
	public String getPi_channel() {
		return pi_channel;
	}
	public void setPi_channel(String pi_channel) {
		this.pi_channel = pi_channel;
	}
	public Long getPi_tariff_pack_id() {
		return pi_tariff_pack_id;
	}
	public void setPi_tariff_pack_id(Long pi_tariff_pack_id) {
		this.pi_tariff_pack_id = pi_tariff_pack_id;
	}
	public String getPi_tariff_pack_name() {
		return pi_tariff_pack_name;
	}
	public void setPi_tariff_pack_name(String pi_tariff_pack_name) {
		this.pi_tariff_pack_name = pi_tariff_pack_name;
	}
	public BigDecimal getPi_credit_limit() {
		return pi_credit_limit;
	}
	public void setPi_credit_limit(BigDecimal pi_credit_limit) {
		this.pi_credit_limit = pi_credit_limit;
	}
	public String getPo_transaction_id() {
		return po_transaction_id;
	}
	public void setPo_transaction_id(String po_transaction_id) {
		this.po_transaction_id = po_transaction_id;
	}
	  
}
