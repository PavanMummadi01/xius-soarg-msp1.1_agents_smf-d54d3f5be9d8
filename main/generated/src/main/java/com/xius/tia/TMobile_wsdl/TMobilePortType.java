/**
 * TMobilePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TMobile_wsdl;

public interface TMobilePortType extends java.rmi.Remote {
    public com.xius.tia.TMobile_xsd.ActivateResponse activate(com.xius.tia.TMobile_xsd.ActivateRequest activateRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TMobile_xsd.ReactivateResponse reactivate(com.xius.tia.TMobile_xsd.ReactivateRequest reactivateRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TMobile_xsd.SuspendResponse suspend(com.xius.tia.TMobile_xsd.SuspendRequest suspendRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TMobile_xsd.RestoreSubscriberResponse restoreSubscriber(com.xius.tia.TMobile_xsd.RestoreSubscriberRequest restoreSubscriberRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TMobile_xsd.DeactivateResponse deactivate(com.xius.tia.TMobile_xsd.DeactivateRequest deactivateRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TMobile_xsd.AddProductResponse addProduct(com.xius.tia.TMobile_xsd.AddProductRequest addProductRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TMobile_xsd.ReplaceProductResponse replaceProduct(com.xius.tia.TMobile_xsd.ReplaceProductRequest replaceProductRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TMobile_xsd.RemoveProductResponse removeProduct(com.xius.tia.TMobile_xsd.RemoveProductRequest removeProductRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TMobile_xsd.QueryNetworkResponse queryNetwork(com.xius.tia.TMobile_xsd.QueryNetworkRequest queryNetworkRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TMobile_xsd.SubscriberInquiryResponse subscriberInquiry(com.xius.tia.TMobile_xsd.SubscriberInquiryRequest subscriberInquiryRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TMobile_xsd.CancelDeviceLocResponse cancelDeviceLoc(com.xius.tia.TMobile_xsd.CancelDeviceLocRequest cancelDeviceLocRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TMobile_xsd.QueryTrancStatusResponse queryTrancStatus(com.xius.tia.TMobile_xsd.QueryTrancStatusRequest queryTrancStatusRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TMobile_xsd.ChangeSIMResponse changeSIM(com.xius.tia.TMobile_xsd.ChangeSIMRequest changeSIMRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TMobile_xsd.ChangeMSISDNResponse changeMSISDN(com.xius.tia.TMobile_xsd.ChangeMSISDNRequest changeMSISDNRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TMobile_xsd.UpdateWPSResponse updateWPS(com.xius.tia.TMobile_xsd.UpdateWPSRequest updateWPSRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TMobile_xsd.ManageIMEIBlackListResponse manageIMEIBlackList(com.xius.tia.TMobile_xsd.ManageIMEIBlackListRequest manageIMEIBlackListRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TMobile_xsd.QuerySubscriberUsageResponse querySubscriberUsage(com.xius.tia.TMobile_xsd.QuerySubscriberUsageRequest querySubscriberUsageRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TMobile_xsd.HLRBlockSIMResponse HLRBlockSIM(com.xius.tia.TMobile_xsd.HLRBlockSIMRequest HLRBlockSIMRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TMobile_xsd.SendOTAMSISDNResponse sendOTAMSISDN(com.xius.tia.TMobile_xsd.SendOTAMSISDNRequest sendOTAMSISDNRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TMobile_xsd.QueryIMEIResponse queryIMEI(com.xius.tia.TMobile_xsd.QueryIMEIRequest queryIMEIRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
}
