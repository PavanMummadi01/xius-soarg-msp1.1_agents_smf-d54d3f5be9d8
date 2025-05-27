package com.xius.smf.domaindata;

import java.util.ArrayList;

public class GetTpIdBasedCommandsData extends DomainDataBase{

	private Long pi_msisdn_no;
	private Long pi_tp_id;
	private Long pi_newtp_id;
	private ArrayList<GetTpIdBasedCommandsCursorData> po_command_list;
	
	public Long getPi_newtp_id() {
		return pi_newtp_id;
	}
	public void setPi_newtp_id(Long pi_newtp_id) {
		this.pi_newtp_id = pi_newtp_id;
	}
	public Long getPi_msisdn_no() {
		return pi_msisdn_no;
	}
	public void setPi_msisdn_no(Long pi_msisdn_no) {
		this.pi_msisdn_no = pi_msisdn_no;
	}
	public Long getPi_tp_id() {
		return pi_tp_id;
	}
	public void setPi_tp_id(Long pi_tp_id) {
		this.pi_tp_id = pi_tp_id;
	}
	public ArrayList<GetTpIdBasedCommandsCursorData> getPo_command_list() {
		return po_command_list;
	}
	public void setPo_command_list(
			ArrayList<GetTpIdBasedCommandsCursorData> po_command_list) {
		this.po_command_list = po_command_list;
	}
}
