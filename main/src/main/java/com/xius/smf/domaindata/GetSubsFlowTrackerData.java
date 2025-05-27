package com.xius.smf.domaindata;

import java.util.ArrayList;
import java.util.Arrays;

public class GetSubsFlowTrackerData extends DomainDataBase {
	private Long Pi_max_records;
	private ArrayList<GetSubsFlowTrackerCurData> po_subs_flow_dtls;
	private Long[] pi_networkids;
	private String[] Pi_flow_ids;
	private String[] pi_sub_flow_ids;
	private String Pi_instance_id;

	public String[] getPi_sub_flow_ids() {
		return pi_sub_flow_ids;
	}

	public void setPi_sub_flow_ids(String[] pi_sub_flow_ids) {
		this.pi_sub_flow_ids = pi_sub_flow_ids;
	}

	public String[] getPi_flow_ids() {
		return Pi_flow_ids;
	}

	public void setPi_flow_ids(String[] pi_flow_ids) {
		Pi_flow_ids = pi_flow_ids;
	}

	public String getPi_instance_id() {
		return Pi_instance_id;
	}

	public void setPi_instance_id(String pi_instance_id) {
		Pi_instance_id = pi_instance_id;
	}

	public Long[] getPi_networkids() {
		return pi_networkids;
	}

	public void setPi_networkids(Long[] pi_networkids) {
		this.pi_networkids = pi_networkids;
	}

	public ArrayList<GetSubsFlowTrackerCurData> getPo_subs_flow_dtls() {
		return po_subs_flow_dtls;
	}

	public void setPo_subs_flow_dtls(
			ArrayList<GetSubsFlowTrackerCurData> po_subs_flow_dtls) {
		this.po_subs_flow_dtls = po_subs_flow_dtls;
	}

	public Long getPi_max_records() {
		return Pi_max_records;
	}

	public void setPi_max_records(Long pi_max_records) {
		Pi_max_records = pi_max_records;
	}

	@Override
	public String toString() {
		return "GetSubsFlowTrackerData [Pi_max_records=" + Pi_max_records
				+ ", po_subs_flow_dtls=" + po_subs_flow_dtls
				+ ", pi_networkids=" + Arrays.toString(pi_networkids)
				+ ", Pi_flow_ids=" + Arrays.toString(Pi_flow_ids)
				+ ", pi_sub_flow_ids=" + Arrays.toString(pi_sub_flow_ids)
				+ ", Pi_instance_id=" + Pi_instance_id + "]";
	}
 

}
