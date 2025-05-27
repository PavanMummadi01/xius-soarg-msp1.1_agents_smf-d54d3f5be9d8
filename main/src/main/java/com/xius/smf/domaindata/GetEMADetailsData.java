package com.xius.smf.domaindata;

public class GetEMADetailsData extends DomainDataBase {
	/**
	 * pi_network_id IN NUMBER, po_emaid OUT arr_varchar, po_emacommand OUT
	 * arr_varchar,
	 */
	private String[] po_emaid;
	private String[] po_reasons_list;
	private String[] po_emacommand;

	private String[] po_reasons_list_id;

	public String[] getPo_reasons_list_id() {
		return po_reasons_list_id;
	}

	public void setPo_reasons_list_id(String[] po_reasons_list_id) {
		this.po_reasons_list_id = po_reasons_list_id;
	}

	public String[] getPo_emaid() {
		return po_emaid;
	}

	public void setPo_emaid(String[] po_emaid) {
		this.po_emaid = po_emaid;
	}

	public String[] getPo_emacommand() {
		return po_emacommand;
	}

	public void setPo_emacommand(String[] po_emacommand) {
		this.po_emacommand = po_emacommand;
	}

	public String[] getPo_reasons_list() {
		return po_reasons_list;
	}

	public void setPo_reasons_list(String[] po_reasons_list) {
		this.po_reasons_list = po_reasons_list;
	}

}
