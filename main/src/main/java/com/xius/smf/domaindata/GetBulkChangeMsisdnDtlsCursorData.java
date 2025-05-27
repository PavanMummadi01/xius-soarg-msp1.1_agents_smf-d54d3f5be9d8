package com.xius.smf.domaindata;

public class GetBulkChangeMsisdnDtlsCursorData {
    /*
     * 
     *  network_id,  user_id, msisdn, account_id,
                device_type, charge, id_value, new_value, old_value,
                new_serial_no, zip_code, provcomp
     */
    private Long network_id ;
	private String user_id ;
	private Long msisdn ;
	private Long account_id ;
	private String device_type ;
	private String charge;
	private String id_value;
	private String new_value;
	private String old_value;
	private String new_serial_no;
	private String zip_code;
	private String provcomp;
	private String transaction_id;
	private String failed_node;
	private String simSaleTransID;
	
	
	public String getSimSaleTransID() {
		return simSaleTransID;
	}
	public void setSimSaleTransID(String simSaleTransID) {
		this.simSaleTransID = simSaleTransID;
	}
	public String getFailed_node() {
		return failed_node;
	}
	public void setFailed_node(String failed_node) {
		this.failed_node = failed_node;
	}
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	public Long getNetwork_id() {
		return network_id;
	}
	public void setNetwork_id(Long network_id) {
		this.network_id = network_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public Long getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(Long msisdn) {
		this.msisdn = msisdn;
	}
	public Long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}
	public String getDevice_type() {
		return device_type;
	}
	public void setDevice_type(String device_type) {
		this.device_type = device_type;
	}
	public String getCharge() {
		return charge;
	}
	public void setCharge(String charge) {
		this.charge = charge;
	}
	public String getId_value() {
		return id_value;
	}
	public void setId_value(String id_value) {
		this.id_value = id_value;
	}
	public String getNew_value() {
		return new_value;
	}
	public void setNew_value(String new_value) {
		this.new_value = new_value;
	}
	public String getOld_value() {
		return old_value;
	}
	public void setOld_value(String old_value) {
		this.old_value = old_value;
	}
	public String getNew_serial_no() {
		return new_serial_no;
	}
	public void setNew_serial_no(String new_serial_no) {
		this.new_serial_no = new_serial_no;
	}
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	public String getProvcomp() {
		return provcomp;
	}
	public void setProvcomp(String provcomp) {
		this.provcomp = provcomp;
	}
	@Override
	public String toString() {
		return "GetBulkChangeMsisdnDtlsCursorData [network_id=" + network_id
				+ ", user_id=" + user_id + ", msisdn=" + msisdn
				+ ", account_id=" + account_id + ", device_type=" + device_type
				+ ", charge=" + charge + ", id_value=" + id_value
				+ ", new_value=" + new_value + ", old_value=" + old_value
				+ ", new_serial_no=" + new_serial_no + ", zip_code=" + zip_code
				+ ", provcomp=" + provcomp + ", transaction_id="
				+ transaction_id + ", failed_node=" + failed_node + "]";
	}
	
}