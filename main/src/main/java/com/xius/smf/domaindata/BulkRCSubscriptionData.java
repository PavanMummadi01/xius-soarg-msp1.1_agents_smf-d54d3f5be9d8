package com.xius.smf.domaindata;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkRCSubscriptionData extends DomainDataBase {
	private Integer network_id[];
	private Long pi_max_rows;
	private String pi_instance_id;
	private ArrayList<BulkRCSubscriptionCursorData> po_topup_dtls;

	public Integer[] getNetwork_id() {
		return network_id;
	}

	public void setNetwork_id(Integer[] network_id) {
		this.network_id = network_id;
	}

	public Long getPi_max_rows() {
		return pi_max_rows;
	}

	public void setPi_max_rows(Long pi_max_rows) {
		this.pi_max_rows = pi_max_rows;
	}

	public String getPi_instance_id() {
		return pi_instance_id;
	}

	public void setPi_instance_id(String pi_instance_id) {
		this.pi_instance_id = pi_instance_id;
	}

	public ArrayList<BulkRCSubscriptionCursorData> getPo_topup_dtls() {
		return po_topup_dtls;
	}

	public void setPo_topup_dtls(
			ArrayList<BulkRCSubscriptionCursorData> po_topup_dtls) {
		this.po_topup_dtls = po_topup_dtls;
	}

	@Override
	public String toString() {
		return "BulkRCSubscriptionData [network_id="
				+ Arrays.toString(network_id) + ", pi_max_rows=" + pi_max_rows
				+ ", pi_instance_id=" + pi_instance_id + ", po_topup_dtls="
				+ po_topup_dtls + "]";
	}

}
