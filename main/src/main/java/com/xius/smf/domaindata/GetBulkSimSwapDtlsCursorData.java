package com.xius.smf.domaindata;

public class GetBulkSimSwapDtlsCursorData {
    /*
     * 
     *  network_id, user_id, NEW_SIM, OLD_SIM,
                      REMARKS,TRANS_ID
     */
    private Integer network_id ;
	private String user_id ;
	private String NEW_SIM ;
	private String OLD_MSISDN ;
	private String TRANS_ID ;
	private String REMARKS;
	private String file_name;
	private String failednode;
	private String	simSaleTransID;
	
	
	public String getSimSaleTransID() {
		return simSaleTransID;
	}
	public void setSimSaleTransID(String simSaleTransID) {
		this.simSaleTransID = simSaleTransID;
	}
	public Integer getNetwork_id() {
		return network_id;
	}
	public void setNetwork_id(Integer network_id) {
		this.network_id = network_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getNEW_SIM() {
		return NEW_SIM;
	}
	public void setNEW_SIM(String nEW_SIM) {
		NEW_SIM = nEW_SIM;
	}
	public String getOLD_MSISDN() {
		return OLD_MSISDN;
	}
	public void setOLD_MSISDN(String oLD_MSISDN) {
		OLD_MSISDN = oLD_MSISDN;
	}
	public String getTRANS_ID() {
		return TRANS_ID;
	}
	public void setTRANS_ID(String tRANS_ID) {
		TRANS_ID = tRANS_ID;
	}
	public String getREMARKS() {
		return REMARKS;
	}
	public void setREMARKS(String rEMARKS) {
		REMARKS = rEMARKS;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getFailednode() {
		return failednode;
	}
	public void setFailednode(String failednode) {
		this.failednode = failednode;
	}
	@Override
	public String toString() {
		return "GetBulkSimSwapDtlsCursorData [network_id=" + network_id
				+ ", user_id=" + user_id + ", NEW_SIM=" + NEW_SIM
				+ ", OLD_MSISDN=" + OLD_MSISDN + ", TRANS_ID=" + TRANS_ID
				+ ", REMARKS=" + REMARKS + ", file_name=" + file_name
				+ ", failednode=" + failednode + "]";
	}
	
}