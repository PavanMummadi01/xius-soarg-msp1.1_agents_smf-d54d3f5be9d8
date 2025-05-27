/**
 * NotificationManagementPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.ne.NotificationManagement_wsdl;

public interface NotificationManagementPortType extends java.rmi.Remote {
    public com.xius.ne.NotificationManagement_xsd.PingServiceResponse pingService(com.xius.ne.NotificationManagement_xsd.PingServiceRequest body) throws java.rmi.RemoteException, com.xius.ne.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.ne.NotificationManagement_xsd.NotifyMessageResponse notifyMessage(com.xius.ne.NotificationManagement_xsd.NotifyMessageRequest body) throws java.rmi.RemoteException, com.xius.ne.common.error.ErrorDetails_xsd.ErrorDetailsType;
}
