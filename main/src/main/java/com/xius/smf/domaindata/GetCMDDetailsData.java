package com.xius.smf.domaindata;

import java.util.ArrayList;

public class GetCMDDetailsData extends DomainDataBase{
	/*pkg_flow_command_dtls
   PROCEDURE pro_get_cmd_details (
      pi_network_id    IN       NUMBER,
      po_cmd_details   OUT      sys_refcursor,
      po_error_code    OUT      NUMBER,
      po_error_desc    OUT      VARCHAR2
   );*/
	
	private ArrayList<GetCMDDetailsCursorData> po_cmd_details;

	public ArrayList<GetCMDDetailsCursorData> getPo_cmd_details() {
		return po_cmd_details;
	}

	public void setPo_cmd_details(ArrayList<GetCMDDetailsCursorData> po_cmd_details) {
		this.po_cmd_details = po_cmd_details;
	}

	
	
}
