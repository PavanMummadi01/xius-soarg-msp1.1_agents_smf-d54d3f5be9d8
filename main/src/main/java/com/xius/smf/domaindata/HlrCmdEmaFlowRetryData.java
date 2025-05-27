package com.xius.smf.domaindata;

public class HlrCmdEmaFlowRetryData extends DomainDataBase{

	private String pi_trans_id;

	public String getPi_trans_id() {
		return pi_trans_id;
	}

	public void setPi_trans_id(String pi_trans_id) {
		this.pi_trans_id = pi_trans_id;
	}

	@Override
	public String toString() {
		return "HlrCmdEmaFlowRetryData [pi_trans_id=" + pi_trans_id + "]";
	}
	
}
