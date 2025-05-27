package com.xius.smf.domaindata;

import java.util.Arrays;

public class BulkATPSubsUpldData extends DomainDataBase {
	
	private Long[] pi_msisdn_no;
	private String pi_channel;
	public String getPi_channel() {
		return pi_channel;
	}
	public void setPi_channel(String pi_channel) {
		this.pi_channel = pi_channel;
	}

	private String[] pi_publicity_id;
	
	public Long[] getPi_msisdn_no() {
		return pi_msisdn_no;
	}
	public void setPi_msisdn_no(Long[] pi_msisdn_no) {
		this.pi_msisdn_no = pi_msisdn_no;
	}
	public String[] getPi_publicity_id() {
		return pi_publicity_id;
	}
	public void setPi_publicity_id(String[] pi_publicity_id) {
		this.pi_publicity_id = pi_publicity_id;
	}
	
	@Override
	public String toString() {
		return "BulkATPSubsUpldData [pi_msisdn_no="
				+ Arrays.toString(pi_msisdn_no) + ", pi_publicity_id="
				+ Arrays.toString(pi_publicity_id) + "]";
	}


	
	
}
