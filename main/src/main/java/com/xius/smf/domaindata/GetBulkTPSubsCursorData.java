package com.xius.smf.domaindata;

import java.math.BigDecimal;
import java.util.Date;


public class GetBulkTPSubsCursorData {
	
	private String new_tarrif_pack_id;
	private Long msisdn_no;
	private String status;
	private String transaction_id;
	private Long batch_id;
	private BigDecimal charge;
	private String old_tarrif_pack_id;
	private String transaction_date;
	
	public String getNew_tarrif_pack_id() {
		return new_tarrif_pack_id;
	}
	public void setNew_tarrif_pack_id(String new_tarrif_pack_id) {
		this.new_tarrif_pack_id = new_tarrif_pack_id;
	}
	public Long getMsisdn_no() {
		return msisdn_no;
	}
	public void setMsisdn_no(Long msisdn_no) {
		this.msisdn_no = msisdn_no;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	public Long getBatch_id() {
		return batch_id;
	}
	public void setBatch_id(Long batch_id) {
		this.batch_id = batch_id;
	}
	public BigDecimal getCharge() {
		return charge;
	}
	public void setCharge(BigDecimal charge) {
		this.charge = charge;
	}
	public String getOld_tarrif_pack_id() {
		return old_tarrif_pack_id;
	}
	public void setOld_tarrif_pack_id(String old_tarrif_pack_id) {
		this.old_tarrif_pack_id = old_tarrif_pack_id;
	}
	public String getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(String transaction_date) {
		this.transaction_date = transaction_date;
	}
	

}
