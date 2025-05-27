/**
 * Copyright   2012 XIUS.
 * All rights reserved. These computer programs, listings, and
 * specifications are the property of XIUS.
 * And may not be copied, stored, used or transmitted, in
 * whole or in part, in any for or by any means, without the
 * prior written permission of XIUS.
 *
 */


/**
 * 	@company	XIUS (Megasoft Pvt Ltd Hyderabad,INDIA)
 *	@package	com.xius.smf.domaindata
 * 	@author		SaiRajesh.g
 *	@Date		Jan 29, 2014,6:38:51 PM
*/

package com.xius.smf.domaindata;

import java.util.Date;

public class HLRCursorData {
	
	
	
	/*network_id, account_id, imsi, msisdn_no, old_status,
    new_status, odb_value, status_change_date,
    status_change_reason,
    process_flag,
    processed_date, remarks, transaction_id,
    row_num*/
	private Long network_id;
	private Long account_id;
	private Long imsi;
	private Long msisdn_no;
	private String old_status;
	private String new_status;
	private Long odb_value;
	private Date status_change_date;
	private String status_change_reason;
	private String process_flag;
	private Date processed_date;
	private String remarks;
	private String transaction_id;
	private Long row_num;
	
	
	public Long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}
	public Long getImsi() {
		return imsi;
	}
	public void setImsi(Long imsi) {
		this.imsi = imsi;
	}
	public Long getMsisdn_no() {
		return msisdn_no;
	}
	public void setMsisdn_no(Long msisdn_no) {
		this.msisdn_no = msisdn_no;
	}
	public String getOld_status() {
		return old_status;
	}
	public void setOld_status(String old_status) {
		this.old_status = old_status;
	}
	public String getNew_status() {
		return new_status;
	}
	public void setNew_status(String new_status) {
		this.new_status = new_status;
	}
	public Long getOdb_value() {
		return odb_value;
	}
	public void setOdb_value(Long odb_value) {
		this.odb_value = odb_value;
	}
	public Date getStatus_change_date() {
		return status_change_date;
	}
	public void setStatus_change_date(Date status_change_date) {
		this.status_change_date = status_change_date;
	}
	public String getStatus_change_reason() {
		return status_change_reason;
	}
	public void setStatus_change_reason(String status_change_reason) {
		this.status_change_reason = status_change_reason;
	}
	public String getProcess_flag() {
		return process_flag;
	}
	public void setProcess_flag(String process_flag) {
		this.process_flag = process_flag;
	}
	public Date getProcessed_date() {
		return processed_date;
	}
	public void setProcessed_date(Date processed_date) {
		this.processed_date = processed_date;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	public Long getRow_num() {
		return row_num;
	}
	public void setRow_num(Long row_num) {
		this.row_num = row_num;
	}
	@Override
	public String toString() {
		return "HLRCursorData [network_id"+ network_id +", account_id=" + account_id + ", imsi=" + imsi
				+ ", msisdn_no=" + msisdn_no + ", old_status=" + old_status
				+ ", new_status=" + new_status + ", odb_value=" + odb_value
				+ ", status_change_date=" + status_change_date
				+ ", status_change_reason=" + status_change_reason
				+ ", process_flag=" + process_flag + ", processed_date="
				+ processed_date + ", remarks=" + remarks + ", transaction_id="
				+ transaction_id + ", row_num=" + row_num + "]";
	}
	public Long getNetwork_id() {
		return network_id;
	}
	public void setNetwork_id(Long network_id) {
		this.network_id = network_id;
	}
	
}
