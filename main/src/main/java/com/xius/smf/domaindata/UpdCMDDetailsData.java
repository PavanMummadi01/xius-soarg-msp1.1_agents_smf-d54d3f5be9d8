package com.xius.smf.domaindata;

public class UpdCMDDetailsData extends DomainDataBase{
	
	/*PROCEDURE pro_update_cmd_details (
		      pi_network_id     IN       NUMBER,
		      pi_command_name   IN       VARCHAR2,
		      pi_command        IN       VARCHAR2,
		      pi_user_id        IN       VARCHAR2,
		      po_error_code     OUT      NUMBER,
		      po_error_desc     OUT      VARCHAR2
		   );*/
	
	private String pi_command_name;
	private String pi_command;
	private String pi_user_id;
	
	public String getPi_command_name() {
		return pi_command_name;
	}
	public void setPi_command_name(String pi_command_name) {
		this.pi_command_name = pi_command_name;
	}
	public String getPi_command() {
		return pi_command;
	}
	public void setPi_command(String pi_command) {
		this.pi_command = pi_command;
	}
	public String getPi_user_id() {
		return pi_user_id;
	}
	public void setPi_user_id(String pi_user_id) {
		this.pi_user_id = pi_user_id;
	}

	
}
