package com.xius.smf.domaindata;

import java.util.List;

import com.xius.smf.domaindata.DomainDataBase;

public class GetNotificationsMsisdnsData extends DomainDataBase{
	
    private String network_id;	
	
	
	private List<NotificationDetailsCursorData> po_notification_details = null;

	/**
	 * @return the po_notification_details
	 */
	public List<NotificationDetailsCursorData> getPo_notification_details() {
		return po_notification_details;
	}

	/**
	 * @param po_notification_details the po_notification_details to set
	 */
	public void setPo_notification_details(
			List<NotificationDetailsCursorData> po_notification_details) {
		this.po_notification_details = po_notification_details;
	}
	
	 /**
		 * @return the network_id
		 */
		public String getNetwork_id() {
			return network_id;
		}

		/**
		 * @param network_id the network_id to set
		 */
		public void setNetwork_id(String network_id) {
			this.network_id = network_id;
		}
	
}
