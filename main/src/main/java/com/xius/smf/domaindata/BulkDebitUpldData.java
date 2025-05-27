package com.xius.smf.domaindata;

import java.math.BigDecimal;

public class BulkDebitUpldData  extends  DomainDataBase{
	
     private Long[] pi_msisdn_no       ;
     private BigDecimal[] pi_debit_amount   ;
     private String[]  pi_reason      ;
     private String   pi_channel    ;
     private String  pi_user_id      ;
     private String  pi_file_name    ;
     private String   po_batch_id   ;
	public Long[] getPi_msisdn_no() {
		return pi_msisdn_no;
	}
	public void setPi_msisdn_no(Long[] pi_msisdn_no) {
		this.pi_msisdn_no = pi_msisdn_no;
	}
	
	public BigDecimal[] getPi_debit_amount() {
		return pi_debit_amount;
	}
	public void setPi_debit_amount(BigDecimal[] pi_debit_amount) {
		this.pi_debit_amount = pi_debit_amount;
	}
	public String[] getPi_reason() {
		return pi_reason;
	}
	public void setPi_reason(String[] pi_reason) {
		this.pi_reason = pi_reason;
	}
	public String getPi_channel() {
		return pi_channel;
	}
	public void setPi_channel(String pi_channel) {
		this.pi_channel = pi_channel;
	}
	public String getPi_user_id() {
		return pi_user_id;
	}
	public void setPi_user_id(String pi_user_id) {
		this.pi_user_id = pi_user_id;
	}
	public String getPi_file_name() {
		return pi_file_name;
	}
	public void setPi_file_name(String pi_file_name) {
		this.pi_file_name = pi_file_name;
	}
	public String getPo_batch_id() {
		return po_batch_id;
	}
	public void setPo_batch_id(String po_batch_id) {
		this.po_batch_id = po_batch_id;
	}
}
