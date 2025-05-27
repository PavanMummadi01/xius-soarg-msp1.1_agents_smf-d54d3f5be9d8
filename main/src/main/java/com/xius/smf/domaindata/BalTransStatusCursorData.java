/**
 * 
 */
package com.xius.smf.domaindata;

import java.util.Date;

/**
 * @author prince.kumar
 *
 */
public class BalTransStatusCursorData {
    private Long networkId;
	private Long msisdnNo;
	private Long amount;
	private String transId;
	private String extTransId;
	private String transDate;
	private Long extErrorCode;
	private String Status;
	private String remarks;
	private String responseDate;
	private Long activityId;
	private String requestType;
	public Long getNetworkId() {
		return networkId;
	}
	public void setNetworkId(Long networkId) {
		this.networkId = networkId;
	}
	public Long getMsisdnNo() {
		return msisdnNo;
	}
	public void setMsisdnNo(Long msisdnNo) {
		this.msisdnNo = msisdnNo;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getTransId() {
		return transId;
	}
	public void setTransId(String transId) {
		this.transId = transId;
	}
	public String getExtTransId() {
		return extTransId;
	}
	public void setExtTransId(String extTransId) {
		this.extTransId = extTransId;
	}
	public String getTransDate() {
		return transDate;
	}
	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}
	public Long getExtErrorCode() {
		return extErrorCode;
	}
	public void setExtErrorCode(Long extErrorCode) {
		this.extErrorCode = extErrorCode;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getResponseDate() {
		return responseDate;
	}
	public void setResponseDate(String responseDate) {
		this.responseDate = responseDate;
	}
	public Long getActivityId() {
		return activityId;
	}
	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	@Override
	public String toString() {
		return "BalTransStatusCursorData [networkId=" + networkId
				+ ", msisdnNo=" + msisdnNo + ", amount=" + amount
				+ ", transId=" + transId + ", extTransId=" + extTransId
				+ ", transDate=" + transDate + ", extErrorCode=" + extErrorCode
				+ ", Status=" + Status + ", remarks=" + remarks
				+ ", responseDate=" + responseDate + ", activityId="
				+ activityId + ", requestType=" + requestType + "]";
	}
	

	
	
	
	
	

}
