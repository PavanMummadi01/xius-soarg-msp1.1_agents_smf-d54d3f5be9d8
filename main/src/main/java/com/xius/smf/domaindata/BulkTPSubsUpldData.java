package com.xius.smf.domaindata;

import java.math.BigDecimal;
import java.util.Arrays;

public class BulkTPSubsUpldData extends DomainDataBase{
	
	private Long[] pi_msisdn_no;
	
	private String[]   pi_reason;
	
	private String po_batch_id;
	
	private Long pi_office_code;
	
	public Long getPi_office_code() {
		return pi_office_code;
	}
	public void setPi_office_code(Long pi_office_code) {
		this.pi_office_code = pi_office_code;
	}
	public String getPo_batch_id() {
		return po_batch_id;
	}
	public void setPo_batch_id(String po_batch_id) {
		this.po_batch_id = po_batch_id;
	}
	public String[] getPi_reason() {
		return pi_reason;
	}
	public void setPi_reason(String[] pi_reason) {
		this.pi_reason = pi_reason;
	}
	public String[] getPi_new_tarrif_pack_id() {
		return pi_new_tarrif_pack_id;
	}
	public void setPi_new_tarrif_pack_id(String[] pi_new_tarrif_pack_id) {
		this.pi_new_tarrif_pack_id = pi_new_tarrif_pack_id;
	}
	public BigDecimal[] getPi_charge() {
		return pi_charge;
	}
	public void setPi_charge(BigDecimal[] pi_charge) {
		this.pi_charge = pi_charge;
	}
	private String[]  pi_new_tarrif_pack_id  ;
	private BigDecimal[]   pi_charge ;
     private String  pi_file_name      ;
     private String pi_channel_id;
	
	public String getPi_channel_id() {
		return pi_channel_id;
	}
	public void setPi_channel_id(String pi_channel_id) {
		this.pi_channel_id = pi_channel_id;
	}
	public Long[] getPi_msisdn_no() {
		return pi_msisdn_no;
	}
	public void setPi_msisdn_no(Long[] pi_msisdn_no) {
		this.pi_msisdn_no = pi_msisdn_no;
	}
	
	
	
	public String getPi_file_name() {
		return pi_file_name;
	}
	public void setPi_file_name(String pi_file_name) {
		this.pi_file_name = pi_file_name;
	}
	
	
	
}
