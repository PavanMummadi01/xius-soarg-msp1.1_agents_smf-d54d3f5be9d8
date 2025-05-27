package com.xius.smf.domaindata;

public class ThresholdLimitCurData {
	
			
			
			private String pi_network_display;
			private String pi_nir_code;
			private Integer pi_cur_percentage;
			private Integer pi_msisdn_threshold_percentage;
			private String pi_limit_reached_yn;
			private Integer pi_network_id;
			
			
			
			
			public String getPi_network_display() {
				return pi_network_display;
			}
			public void setPi_network_display(String pi_network_display) {
				this.pi_network_display = pi_network_display;
			}
			public String getPi_nir_code() {
				return pi_nir_code;
			}
			public void setPi_nir_code(String pi_nir_code) {
				this.pi_nir_code = pi_nir_code;
			}
			public Integer getPi_cur_percentage() {
				return pi_cur_percentage;
			}
			public void setPi_cur_percentage(Integer pi_cur_percentage) {
				this.pi_cur_percentage = pi_cur_percentage;
			}
			public Integer getPi_msisdn_threshold_percentage() {
				return pi_msisdn_threshold_percentage;
			}
			public void setPi_msisdn_threshold_percentage(
					Integer pi_msisdn_threshold_percentage) {
				this.pi_msisdn_threshold_percentage = pi_msisdn_threshold_percentage;
			}
			public String getPi_limit_reached_yn() {
				return pi_limit_reached_yn;
			}
			public void setPi_limit_reached_yn(String pi_limit_reached_yn) {
				this.pi_limit_reached_yn = pi_limit_reached_yn;
			}
			public Integer getPi_network_id() {
				return pi_network_id;
			}
			public void setPi_network_id(Integer pi_network_id) {
				this.pi_network_id = pi_network_id;
			}
			
			
			@Override
			public String toString() {
				return "ThresholdLimitCurData [pi_network_display="
						+ pi_network_display + ", pi_nir_code=" + pi_nir_code
						+ ", pi_cur_percentage=" + pi_cur_percentage
						+ ", pi_msisdn_threshold_percentage="
						+ pi_msisdn_threshold_percentage
						+ ", pi_limit_reached_yn=" + pi_limit_reached_yn
						+ ", pi_network_id=" + pi_network_id + "]";
			}
			
			
			
			

			
			
			
			

}
