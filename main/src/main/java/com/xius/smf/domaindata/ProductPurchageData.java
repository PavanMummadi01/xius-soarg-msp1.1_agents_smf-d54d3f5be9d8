package com.xius.smf.domaindata;

import java.math.BigDecimal;

public class ProductPurchageData extends DomainDataBase{
	
		private Long pi_account_id;
		private Long pi_msisdn_no;
		private String pi_publicity_id;
		private String pi_ext_trans_id;
		private String pi_user_data1;
		private String pi_user_data2;
		private String po_trans_id;
		private BigDecimal pi_charge;
		
		private String channel;
		private String flag;
		
		
		
		public String getChannel() {
			return channel;
		}
		public void setChannel(String channel) {
			this.channel = channel;
		}
		public String getFlag() {
			return flag;
		}
		public void setFlag(String flag) {
			this.flag = flag;
		}
		public BigDecimal getPi_charge() {
			return pi_charge;
		}
		public void setPi_charge(BigDecimal pi_charge) {
			this.pi_charge = pi_charge;
		}
		public Long getPi_account_id() {
			return pi_account_id;
		}
		public void setPi_account_id(Long pi_account_id) {
			this.pi_account_id = pi_account_id;
		}
		public Long getPi_msisdn_no() {
			return pi_msisdn_no;
		}
		public void setPi_msisdn_no(Long pi_msisdn_no) {
			this.pi_msisdn_no = pi_msisdn_no;
		}
		public String getPi_publicity_id() {
			return pi_publicity_id;
		}
		public void setPi_publicity_id(String pi_publicity_id) {
			this.pi_publicity_id = pi_publicity_id;
		}
		public String getPi_ext_trans_id() {
			return pi_ext_trans_id;
		}
		public void setPi_ext_trans_id(String pi_ext_trans_id) {
			this.pi_ext_trans_id = pi_ext_trans_id;
		}
		public String getPi_user_data1() {
			return pi_user_data1;
		}
		public void setPi_user_data1(String pi_user_data1) {
			this.pi_user_data1 = pi_user_data1;
		}
		public String getPi_user_data2() {
			return pi_user_data2;
		}
		public void setPi_user_data2(String pi_user_data2) {
			this.pi_user_data2 = pi_user_data2;
		}
		public String getPo_trans_id() {
			return po_trans_id;
		}
		public void setPo_trans_id(String po_trans_id) {
			this.po_trans_id = po_trans_id;
		}
		
		public String toString() {
			return "ProductPurchageData [pi_account_id=" + pi_account_id
					+ ", pi_msisdn_no=" + pi_msisdn_no + ", pi_publicity_id="
					+ pi_publicity_id + ", pi_ext_trans_id=" + pi_ext_trans_id
					+ ", pi_user_data1=" + pi_user_data1 + ", pi_user_data2="
					+ pi_user_data2 + ", po_trans_id=" + po_trans_id + "]";
		}

}


