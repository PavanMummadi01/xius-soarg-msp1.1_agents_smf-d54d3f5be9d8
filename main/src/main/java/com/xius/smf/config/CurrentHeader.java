package com.xius.smf.config;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.xius.agent.smf.common.header.headerdetails.TrackingMessageHeaderType;

@Component
@Scope("request")
public class CurrentHeader {

	  private TrackingMessageHeaderType currentUser;

	public TrackingMessageHeaderType getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(TrackingMessageHeaderType currentUser) {
		this.currentUser = currentUser;
	}
	  
	   
	  
	
}
