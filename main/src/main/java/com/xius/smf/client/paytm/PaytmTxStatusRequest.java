package com.xius.smf.client.paytm;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PaytmTxStatusRequest {

	@JsonProperty("MID")
	private String mId;
	
	@JsonProperty("ORDERID")
	private String orderId;
	
	@JsonProperty("CHECKSUMHASH")
	private String checksumhash;

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getChecksumhash() {
		return checksumhash;
	}

	public void setChecksumhash(String checksumhash) {
		this.checksumhash = checksumhash;
	}
	
	
	
	
	

	
}
