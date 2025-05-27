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
* @version $Id: //depot/xb/MSP1.0/MSP-AWS/agents/smf/main/src/main/java/com/xius/smf/utils/HeaderDetails.java#2 $ 
* $DateTime: 2023/12/08 12:29:41 $Change:  $
*/

package com.xius.smf.utils;
 

public class HeaderDetails {
	String ipAddress;
	String requestID;
	Long networkID;
	String loginID;
	String messageDateTimeStamp;
	String timeToLive;
	String password;
	
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getRequestID() {
		return requestID;
	}
	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}
	public Long getNetworkID() {
		return networkID;
	}
	public void setNetworkID(Long networkID) {
		this.networkID = networkID;
	}
	public String getLoginID() {
		return loginID;
	}
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}
	public String getMessageDateTimeStamp() {
		return messageDateTimeStamp;
	}
	public void setMessageDateTimeStamp(String messageDateTimeStamp) {
		this.messageDateTimeStamp = messageDateTimeStamp;
	}
	public String getTimeToLive() {
		return timeToLive;
	}
	public void setTimeToLive(String timeToLive) {
		this.timeToLive = timeToLive;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

