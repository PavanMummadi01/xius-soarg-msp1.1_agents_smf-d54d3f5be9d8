/**
 * Copyright   2006 New Wireless Services, Inc.
 * All rights reserved. These computer programs, listings, and
 * specifications are the property of New Wireless Services,
 * Inc. and may not be copied, stored, used or transmitted, in
 * whole or in part, in any for or by any means, without the
 * prior written permission of New Wireless Services, Inc.
 *
 */
package com.xius.smf.domaindata;

import java.math.BigDecimal;

/**
File Name:BalNotificationData.java
Description:
@Author : srikanthm
@Created Date : Jul 29, 2011
@Modified By:
@Modified Date:
@Modifications:
@Reason for Modification
 */
public class BalNotificationData extends DomainDataBase{

	private String pi_source;
	private String pi_consumer_type;

	private BigDecimal[] AccountNumber;
	private String[] AccountStatus;
	private String[] AccountType;
	private BigDecimal[] BalanceAmount;
	private String[] BalanceDatetime;
	private String[] BalanceExpiryDatetime;
	private BigDecimal[] MSISDN;
	private String[] transactionID;
	private long pi_record_limit;
	
	public String getPi_source() {
		return pi_source;
	}
	public void setPi_source(String pi_source) {
		this.pi_source = pi_source;
	}
	public String getPi_consumer_type() {
		return pi_consumer_type;
	}
	public void setPi_consumer_type(String pi_consumer_type) {
		this.pi_consumer_type = pi_consumer_type;
	}
	public BigDecimal[] getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(BigDecimal[] accountNumber) {
		AccountNumber = accountNumber;
	}
	public String[] getAccountStatus() {
		return AccountStatus;
	}
	public void setAccountStatus(String[] accountStatus) {
		AccountStatus = accountStatus;
	}
	public String[] getAccountType() {
		return AccountType;
	}
	public void setAccountType(String[] accountType) {
		AccountType = accountType;
	}
	public BigDecimal[] getBalanceAmount() {
		return BalanceAmount;
	}
	public void setBalanceAmount(BigDecimal[] balanceAmount) {
		BalanceAmount = balanceAmount;
	}
	public String[] getBalanceDatetime() {
		return BalanceDatetime;
	}
	public void setBalanceDatetime(String[] balanceDatetime) {
		BalanceDatetime = balanceDatetime;
	}
	public String[] getBalanceExpiryDatetime() {
		return BalanceExpiryDatetime;
	}
	public void setBalanceExpiryDatetime(String[] balanceExpiryDatetime) {
		BalanceExpiryDatetime = balanceExpiryDatetime;
	}
	public BigDecimal[] getMSISDN() {
		return MSISDN;
	}
	public void setMSISDN(BigDecimal[] mSISDN) {
		MSISDN = mSISDN;
	}
	public String[] getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(String[] transactionID) {
		this.transactionID = transactionID;
	}
	public long getPi_record_limit() {
		return pi_record_limit;
	}
	public void setPi_record_limit(long pi_record_limit) {
		this.pi_record_limit = pi_record_limit;
	}
	
}