/**
 * HLRManagementPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.ttsa.hlr.HLRManagement_wsdl;

public interface HLRManagementPortType extends java.rmi.Remote {
    public com.xius.ttsa.hlr.HLRManagement_xsd.SimRegistrationResponse simRegistration(com.xius.ttsa.hlr.HLRManagement_xsd.SimRegistrationRequest body) throws java.rmi.RemoteException, com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.ttsa.hlr.HLRManagement_xsd.ChangeSubMSISDNResponse changeSubMSISDN(com.xius.ttsa.hlr.HLRManagement_xsd.ChangeSubMSISDNRequest body) throws java.rmi.RemoteException, com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.ttsa.hlr.HLRManagement_xsd.SIMSwapResponse simSwap(com.xius.ttsa.hlr.HLRManagement_xsd.SIMSwapRequest body) throws java.rmi.RemoteException, com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.ttsa.hlr.HLRManagement_xsd.ActivateGSMGPRSResponse activateGSMGPRS(com.xius.ttsa.hlr.HLRManagement_xsd.ActivateGSMGPRSRequest body) throws java.rmi.RemoteException, com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.ttsa.hlr.HLRManagement_xsd.PurgeSubscriberResponse purgeSubscriber(com.xius.ttsa.hlr.HLRManagement_xsd.PurgeSubscriberRequest body) throws java.rmi.RemoteException, com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.ttsa.hlr.HLRManagement_xsd.ServiceType[] updateOptionalServices(com.xius.ttsa.hlr.HLRManagement_xsd.UpdateOptionalServicesRequest body) throws java.rmi.RemoteException, com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.ttsa.hlr.HLRManagement_xsd.AddAllowedFtnRangeResponse addAllowedFtnRange(com.xius.ttsa.hlr.HLRManagement_xsd.AddAllowedFtnRangeRequest body) throws java.rmi.RemoteException, com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.ttsa.hlr.HLRManagement_xsd.ManageAllowedFtnRangeResponse manageAllowedFtnRange(com.xius.ttsa.hlr.HLRManagement_xsd.ManageAllowedFtnRangeRequest body) throws java.rmi.RemoteException, com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.ttsa.hlr.HLRManagement_xsd.ChangeSubMSISDNBulkResponse changeSubMSISDNBulk(com.xius.ttsa.hlr.HLRManagement_xsd.ChangeSubMSISDNBulkRequest body) throws java.rmi.RemoteException, com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.ttsa.hlr.HLRManagement_xsd.GetGsmGprsStatusResponse getGsmGprsStatus(com.xius.ttsa.hlr.HLRManagement_xsd.GetGsmGprsStatusRequest body) throws java.rmi.RemoteException, com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.ttsa.hlr.HLRManagement_xsd.UnbarServicesResponse unbarServices(com.xius.ttsa.hlr.HLRManagement_xsd.UnbarServicesRequest body) throws java.rmi.RemoteException, com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.ttsa.hlr.HLRManagement_xsd.RemoveSubscriberResponse removeSubscriber(com.xius.ttsa.hlr.HLRManagement_xsd.RemoveSubscriberRequest body) throws java.rmi.RemoteException, com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType;
}
