/**
 * TTprovisioningBindingPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TTprovisioning_wsdl;

public interface TTprovisioningBindingPortType extends java.rmi.Remote {
    public com.xius.tia.TTprovisioning_xsd.ProvisionPCRFResponse assignPolicy(com.xius.tia.TTprovisioning_xsd.ProvisionPCRFRequest provisionPCRFRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TTprovisioning_xsd.TtRegNotificationResponse ttRegNotification(com.xius.tia.TTprovisioning_xsd.TtRegNotificationRequest ttRegNotificationRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TTprovisioning_xsd.DeletePCRFResponse unAssignPolicy(com.xius.tia.TTprovisioning_xsd.DeletePCRFRequest unAssignPCRFRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TTprovisioning_xsd.QueryPCRFResponse queryPCRF(com.xius.tia.TTprovisioning_xsd.QueryPCRFRequest queryPCRFRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TTprovisioning_xsd.VolteProvisionResponse volteProvision(com.xius.tia.TTprovisioning_xsd.VolteProvisionRequest volteProvisionRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TTprovisioning_xsd.VolteDeProvisionResponse volteDeProvision(com.xius.tia.TTprovisioning_xsd.VolteDeProvisionRequest volteDeProvisionRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TTprovisioning_xsd.VolteServiceStatusResponse volteServiceStatus(com.xius.tia.TTprovisioning_xsd.VolteServiceStatusRequest volteServiceStatusRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TTprovisioning_xsd.FiveGProvisionResponse fiveGProvision(com.xius.tia.TTprovisioning_xsd.FiveGProvisionRequest fiveGProvisionRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TTprovisioning_xsd.FiveGDeProvisionResponse fiveGDeProvision(com.xius.tia.TTprovisioning_xsd.FiveGDeProvisionRequest fiveGDeProvisionRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TTprovisioning_xsd.GetLicenseInfoResponse getLicenseInfo(com.xius.tia.TTprovisioning_xsd.GetLicenseInfoRequest getLicenseInfoRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TTprovisioning_xsd.DeviceCheckResponse deviceCheck(com.xius.tia.TTprovisioning_xsd.DeviceCheckRequest deviceCheckRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
}
