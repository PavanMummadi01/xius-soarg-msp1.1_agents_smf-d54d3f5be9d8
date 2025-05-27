/**
 * Copyright   2012 XIUS.
 * All rights reserved. These computer programs, listings, and
 * specifications are the property of XIUS. 
 * And may not be copied, stored, used or transmitted, in
 * whole or in part, in any for or by any means, without the
 * prior written permission of XIUS.
 *
 */
/**
* ${todo}
* @author srikanthm $Author: kiranmai.kode $
* @version $Id: //depot/xb/MSP1.0/MSP-AWS/agents/smf/main/src/main/java/com/xius/smf/domaindata/ChildTopUpAccount.java#2 $ 
* $DateTime: 2023/12/08 12:29:41 $Change:  $
*/

package com.xius.smf.domaindata;

import java.math.BigDecimal;

public class ChildTopUpAccount{
	
	private Long msisdn;
	private BigDecimal topUpAmount;
	private String validityDate;
	private String expiryDate;
	private String gracePeriodIEndDate;
	
	public Long getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(Long msisdn) {
		this.msisdn = msisdn;
	}
	public BigDecimal getTopUpAmount() {
		return topUpAmount;
	}
	public void setTopUpAmount(BigDecimal topUpAmount) {
		this.topUpAmount = topUpAmount;
	}
	public String getValidityDate() {
		return validityDate;
	}
	public void setValidityDate(String validityDate) {
		this.validityDate = validityDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getGracePeriodIEndDate() {
		return gracePeriodIEndDate;
	}
	public void setGracePeriodIEndDate(String gracePeriodIEndDate) {
		this.gracePeriodIEndDate = gracePeriodIEndDate;
	}
}

