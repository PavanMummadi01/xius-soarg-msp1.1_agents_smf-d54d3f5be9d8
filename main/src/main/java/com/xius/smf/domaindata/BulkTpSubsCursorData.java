package com.xius.smf.domaindata;

import java.math.BigDecimal;

public class BulkTpSubsCursorData extends DomainDataBase {
	private String transaction_id;
	private String  new_tarrif_pack_id;
	private Long msisdn_no;
	private Long network_id;
private BigDecimal	charge;

private String channel_id;

private Long office_code;


	public Long getOffice_code() {
	return office_code;
}
public void setOffice_code(Long office_code) {
	this.office_code = office_code;
}
	public String getChannel_id() {
	return channel_id;
}
public void setChannel_id(String channel_id) {
	this.channel_id = channel_id;
}
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
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
	public Long getNetwork_id() {
		return network_id;
	}
	public void setNetwork_id(Long network_id) {
		this.network_id = network_id;
	}
	public BigDecimal getCharge() {
		return charge;
	}
	public void setCharge(BigDecimal charge) {
		this.charge = charge;
	}
	
}
