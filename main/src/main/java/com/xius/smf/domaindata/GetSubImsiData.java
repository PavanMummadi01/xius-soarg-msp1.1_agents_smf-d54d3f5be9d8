package com.xius.smf.domaindata;

public class GetSubImsiData extends DomainDataBase {

	private Long pio_msisdn_no;
	private String pio_sim_no;
	private Long pio_accountid;
	private Long po_imsi;
	private Long po_billcycle_day;
	private Long po_account_type;
	private Long po_tariff_package_id;

	public Long getPio_msisdn_no() {
		return pio_msisdn_no;
	}

	public void setPio_msisdn_no(Long pio_msisdn_no) {
		this.pio_msisdn_no = pio_msisdn_no;
	}

	public String getPio_sim_no() {
		return pio_sim_no;
	}

	public void setPio_sim_no(String pio_sim_no) {
		this.pio_sim_no = pio_sim_no;
	}

	public Long getPio_accountid() {
		return pio_accountid;
	}

	public void setPio_accountid(Long pio_accountid) {
		this.pio_accountid = pio_accountid;
	}

	public Long getPo_imsi() {
		return po_imsi;
	}

	public void setPo_imsi(Long po_imsi) {
		this.po_imsi = po_imsi;
	}

	public Long getPo_billcycle_day() {
		return po_billcycle_day;
	}

	public void setPo_billcycle_day(Long po_billcycle_day) {
		this.po_billcycle_day = po_billcycle_day;
	}

	public Long getPo_account_type() {
		return po_account_type;
	}

	public void setPo_account_type(Long po_account_type) {
		this.po_account_type = po_account_type;
	}

	public Long getPo_tariff_package_id() {
		return po_tariff_package_id;
	}

	public void setPo_tariff_package_id(Long po_tariff_package_id) {
		this.po_tariff_package_id = po_tariff_package_id;
	}

}
