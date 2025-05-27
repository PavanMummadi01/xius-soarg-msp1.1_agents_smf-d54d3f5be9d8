package com.xius.smf.domaindata;

import java.util.ArrayList;

public class ThresholdLimitJobData extends DomainDataBase {
	
	private Integer pi_nirCode_id;
	private ArrayList<ThresholdLimitCurData> po_pool_percentage_dtls;
	
	
	public Integer getPi_nirCode_id() {
		return pi_nirCode_id;
	}
	public void setPi_nirCode_id(Integer pi_nirCode_id) {
		this.pi_nirCode_id = pi_nirCode_id;
	}
	public ArrayList<ThresholdLimitCurData> getPo_pool_percentage_dtls() {
		return po_pool_percentage_dtls;
	}
	public void setPo_pool_percentage_dtls(
			ArrayList<ThresholdLimitCurData> po_pool_percentage_dtls) {
		this.po_pool_percentage_dtls = po_pool_percentage_dtls;
	}
	
	@Override
	public String toString() {
		return "ThresholdLimitJobData [pi_network_id=" + pi_network_id
				+ ", pi_nirCode_id=" + pi_nirCode_id
				+ ", po_pool_percentage_dtls=" + po_pool_percentage_dtls + "]";
	}



	
}
