package com.xius.smf.job;

import com.xius.smf.domaindata.DomainDataBase;

/**
@author sumalatha.muri
@Date : Aug 30, 2013
*/

public class GetDummySimDetRefCursorData extends DomainDataBase{

	private String sim_serial_num;
	private String trans_num;
	private Long id_type;
	private String id_val;
	private Long dummy_id_type;
	private String dummy_id_val;
	private String txstatus;
	private String msisdn;
	private String user_id;
	private Long network_id;
	private String network_name;
	private String icc_no;
	private String sim_status;
	private Long counter; 
	private String remarks;
	private Long error_code;
	private String error_msg;
	
	public Long getCounter() {
		return counter;
	}
	public void setCounter(Long counter) {
		this.counter = counter;
	}
	public String getSim_serial_num() {
		return sim_serial_num;
	}
	public void setSim_serial_num(String sim_serial_num) {
		this.sim_serial_num = sim_serial_num;
	}
	public String getTrans_num() {
		return trans_num;
	}
	public void setTrans_num(String trans_num) {
		this.trans_num = trans_num;
	}
	public String getId_val() {
		return id_val;
	}
	public void setId_val(String id_val) {
		this.id_val = id_val;
	}
	public String getDummy_id_val() {
		return dummy_id_val;
	}
	public void setDummy_id_val(String dummy_id_val) {
		this.dummy_id_val = dummy_id_val;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public Long getNetwork_id() {
		return network_id;
	}
	public void setNetwork_id(Long network_id) {
		this.network_id = network_id;
	}
	public String getNetwork_name() {
		return network_name;
	}
	public void setNetwork_name(String network_name) {
		this.network_name = network_name;
	}
	public String getIcc_no() {
		return icc_no;
	}
	public void setIcc_no(String icc_no) {
		this.icc_no = icc_no;
	}
	public String getSim_status() {
		return sim_status;
	}
	public void setSim_status(String sim_status) {
		this.sim_status = sim_status;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Long getError_code() {
		return error_code;
	}
	public void setError_code(Long error_code) {
		this.error_code = error_code;
	}
	public String getError_msg() {
		return error_msg;
	}
	public void setError_msg(String error_msg) {
		this.error_msg = error_msg;
	}
	public String getTxstatus() {
		return txstatus;
	}
	public void setTxstatus(String txstatus) {
		this.txstatus = txstatus;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public Long getId_type() {
		return id_type;
	}
	public void setId_type(Long id_type) {
		this.id_type = id_type;
	}
	public Long getDummy_id_type() {
		return dummy_id_type;
	}
	public void setDummy_id_type(Long dummy_id_type) {
		this.dummy_id_type = dummy_id_type;
	}
	
	
}
