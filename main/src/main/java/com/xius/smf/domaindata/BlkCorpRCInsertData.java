package com.xius.smf.domaindata;

import java.math.BigDecimal;



public class BlkCorpRCInsertData extends DomainDataBase {
    
    private String[] pi_reason;		
    private Long[] pi_msisdn_no;	
    private Long[] pi_account_id;
    private Long pi_activity_type;
    private String pi_channel_id;
    private String[] pi_rc_id;
    private String[] pi_rc_category;
    private BigDecimal[] pi_rc_amount;
    private BigDecimal[] pi_mrp;
    private String po_transaction_id;
    
    private Long[] pi_office_code;
    
    
    
   	public BigDecimal[] getPi_mrp() {
		return pi_mrp;
	}
	public void setPi_mrp(BigDecimal[] pi_mrp) {
		this.pi_mrp = pi_mrp;
	}
	public Long[] getPi_office_code() {
   		return pi_office_code;
   	}
   	public void setPi_office_code(Long[] pi_office_code) {
   		this.pi_office_code = pi_office_code;
   	}
    
    
	public String[] getPi_rc_id() {
		return pi_rc_id;
	}
	public void setPi_rc_id(String[] pi_rc_id) {
		this.pi_rc_id = pi_rc_id;
	}
	public String[] getPi_rc_category() {
		return pi_rc_category;
	}
	public void setPi_rc_category(String[] pi_rc_category) {
		this.pi_rc_category = pi_rc_category;
	}
	public BigDecimal[] getPi_rc_amount() {
		return pi_rc_amount;
	}
	public void setPi_rc_amount(BigDecimal[] pi_rc_amount) {
		this.pi_rc_amount = pi_rc_amount;
	}
	public String[] getPi_reason() {
		return pi_reason;
	}
	public void setPi_reason(String[] pi_reason) {
		this.pi_reason = pi_reason;
	}
	public Long[] getPi_msisdn_no() {
		return pi_msisdn_no;
	}
	public void setPi_msisdn_no(Long[] pi_msisdn_no) {
		this.pi_msisdn_no = pi_msisdn_no;
	}
	public Long[] getPi_account_id() {
		return pi_account_id;
	}
	public void setPi_account_id(Long[] pi_account_id) {
		this.pi_account_id = pi_account_id;
	}
	public Long getPi_activity_type() {
		return pi_activity_type;
	}
	public void setPi_activity_type(Long pi_activity_type) {
		this.pi_activity_type = pi_activity_type;
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
    

}
