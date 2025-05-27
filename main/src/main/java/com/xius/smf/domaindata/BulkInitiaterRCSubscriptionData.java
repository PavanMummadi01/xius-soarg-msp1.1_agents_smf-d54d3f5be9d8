
package com.xius.smf.domaindata;

import java.util.Arrays;

public class BulkInitiaterRCSubscriptionData extends DomainDataBase {
	private Integer network_id[];

	public Integer[] getNetwork_id() {
		return network_id;
	}

	public void setNetwork_id(Integer[] network_id) {
		this.network_id = network_id;
	}

	@Override
	public String toString() {
		return "BulkInitiaterRCSubscriptionData [network_id="
				+ Arrays.toString(network_id) + "]";
	}

}
