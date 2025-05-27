package com.xius.smf.domaindata;

public class BulkStateChangeUpdateData extends DomainDataBase {

 private String   pi_trans_id;
 private String  pi_status;
 private String  pi_remarks;
 private String   pi_transaction_ref_num;
 private String   pi_old_status ;

public String getPi_trans_id() {
	return pi_trans_id;
}
public void setPi_trans_id(String pi_trans_id) {
	this.pi_trans_id = pi_trans_id;
}
public String getPi_status() {
	return pi_status;
}
public void setPi_status(String pi_status) {
	this.pi_status = pi_status;
}
public String getPi_remarks() {
	return pi_remarks;
}
public void setPi_remarks(String pi_remarks) {
	this.pi_remarks = pi_remarks;
}
public String getPi_transaction_ref_num() {
	return pi_transaction_ref_num;
}
public void setPi_transaction_ref_num(String pi_transaction_ref_num) {
	this.pi_transaction_ref_num = pi_transaction_ref_num;
}

public String getPi_old_status() {
	return pi_old_status;
}
public void setPi_old_status(String pi_old_status) {
	this.pi_old_status = pi_old_status;
}
   
 	

}
