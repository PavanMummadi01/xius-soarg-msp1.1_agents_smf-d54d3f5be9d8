package com.xius.smf.domaindata;

public class UsageThresholdLimitCursorData  extends DomainDataBase{
	 private String service_category; 
	 private String period; 
	 private Long total_value;
	 private Long   average_value;
	 private Long    no_of_active_subs; 
	 private String   transaction_id;
	 private String avg_cal_from_date;
	 private String avg_cal_to_date;
	public String getService_category() {
		return service_category;
	}
	public void setService_category(String service_category) {
		this.service_category = service_category;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getAvg_cal_from_date() {
		return avg_cal_from_date;
	}
	public void setAvg_cal_from_date(String avg_cal_from_date) {
		this.avg_cal_from_date = avg_cal_from_date;
	}
	public String getAvg_cal_to_date() {
		return avg_cal_to_date;
	}
	public void setAvg_cal_to_date(String avg_cal_to_date) {
		this.avg_cal_to_date = avg_cal_to_date;
	}
	public Long getTotal_value() {
		return total_value;
	}
	public void setTotal_value(Long total_value) {
		this.total_value = total_value;
	}
	public Long getAverage_value() {
		return average_value;
	}
	public void setAverage_value(Long average_value) {
		this.average_value = average_value;
	}
	public Long getNo_of_active_subs() {
		return no_of_active_subs;
	}
	public void setNo_of_active_subs(Long no_of_active_subs) {
		this.no_of_active_subs = no_of_active_subs;
	}
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

}
