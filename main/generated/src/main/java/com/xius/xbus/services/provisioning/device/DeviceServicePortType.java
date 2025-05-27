/**
 * DeviceServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.services.provisioning.device;

public interface DeviceServicePortType extends java.rmi.Remote {

    /**
     * This operation is used to   chnagedevice
     */
    public com.xius.xbus.messages.provisioning.device.ChangeDeviceRetryResponse changeDeviceRetry(com.xius.xbus.messages.provisioning.device.ChangeDeviceRetryRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to   Activate SIM
     */
    public com.xius.xbus.messages.provisioning.device.SimActivateResponse simActivate(com.xius.xbus.messages.provisioning.device.SimActivateRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * this is using for Retry  prepaidActivation process
     */
    public com.xius.xbus.messages.provisioning.device.PrepaidActivationRetryResponse prepaidActivationRetry(com.xius.xbus.messages.provisioning.device.PrepaidActivationRetryRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to change either SIM or
     * 				IMSI or MSISDN,
     * 				any one of three is expected as input
     */
    public com.xius.xbus.messages.provisioning.device.ChangeDeviceRestResponse changeDeviceRest(com.xius.xbus.messages.provisioning.device.ChangeDeviceRestRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to change either SIM or
     * 				IMSI or MSISDN,
     * 				any one of three is expected as input
     */
    public com.xius.xbus.messages.provisioning.device.ChangeDeviceResponse changeDevice(com.xius.xbus.messages.provisioning.device.ChangeDeviceRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to activate/reactivate the
     * 				MSISDN
     */
    public com.xius.xbus.messages.provisioning.device.ActivateMSISDNResponse activateMSISDN(com.xius.xbus.messages.provisioning.device.ActivateMSISDNRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This request is to update the msisdn/account
     * 				status in billing db
     */
    public com.xius.xbus.messages.provisioning.device.UpdateMSISDNStatusResponse updateMSISDNStatus(com.xius.xbus.messages.provisioning.device.UpdateMSISDNStatusRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This request is to get the charges for change
     * 				msisdn
     */
    public com.xius.xbus.messages.provisioning.device.GetChangeMSISDNChargesResponse getChangeMSISDNCharges(com.xius.xbus.messages.provisioning.device.GetChangeMSISDNChargesRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This request is to get the IMSI info
     */
    public com.xius.xbus.messages.provisioning.device.GetChangeIMSIChargesResponse getChangeIMSICharges(com.xius.xbus.messages.provisioning.device.GetChangeIMSIChargesRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.provisioning.device.ActivateDeactivateGsmGprsResponse activateDeactivateGsmGprs(com.xius.xbus.messages.provisioning.device.ActivateDeactivateGsmGprsRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.provisioning.device.GetGsmGprsStatusResponse getGsmGprsStatus(com.xius.xbus.messages.provisioning.device.GetGsmGprsStatusRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.provisioning.device.CancelLocationLinkResponse cancelLocationLink(com.xius.xbus.messages.provisioning.device.CancelLocationLinkRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.provisioning.device.GetDeviceDetailsResponse getDeviceDetails(com.xius.xbus.messages.provisioning.device.GetDeviceDetailsRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.provisioning.device.UpdateBillingDetailsResponse updateBillingDetails(com.xius.xbus.messages.provisioning.device.UpdateBillingDetailsRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to get the Type MSISDN
     * 				attached to the SIM(Pseudo
     * 				or Actual)
     */
    public com.xius.xbus.messages.provisioning.device.GetSimTypeResponse getSimType(com.xius.xbus.messages.provisioning.device.GetSimTypeRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.provisioning.device.HssSubsStatusChangeResponse hssSubsStatusChange(com.xius.xbus.messages.provisioning.device.HssSubsStatusChangeRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to allocate the MDN based
     * 				on First LU
     */
    public com.xius.xbus.messages.provisioning.device.FirstLUActivationResponse firstLUActivation(com.xius.xbus.messages.provisioning.device.FirstLUActivationRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.provisioning.device.OnActivationResponse onActivation(com.xius.xbus.messages.provisioning.device.OnActivationRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.provisioning.device.AfterSaleResponse afterSale(com.xius.xbus.messages.provisioning.device.AfterSaleRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.provisioning.device.InitiateChngMsisdnResponse initiateChngMsisdn(com.xius.xbus.messages.provisioning.device.InitiateChngMsisdnRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to initiate change SimSwap
     */
    public com.xius.xbus.messages.provisioning.device.InitiateChngSimSwapResponse initiateChngSimSwap(com.xius.xbus.messages.provisioning.device.InitiateChngSimSwapRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.provisioning.device.AfterSimSwapResponse afterSimSwap(com.xius.xbus.messages.provisioning.device.AfterSimSwapRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.provisioning.device.InitiateRoamingResponse initiateRoaming(com.xius.xbus.messages.provisioning.device.InitiateRoamingRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.provisioning.device.AfterRoamingResponse afterRoaming(com.xius.xbus.messages.provisioning.device.AfterRoamingRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.provisioning.device.CreateMobileAccountResponse createMobileAccount(com.xius.xbus.messages.provisioning.device.CreateMobileAccountRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to retry the Failure APIs
     */
    public com.xius.xbus.messages.provisioning.device.RetryResponse retry(com.xius.xbus.messages.provisioning.device.RetryRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to retry the Failure APIs
     */
    public com.xius.xbus.messages.provisioning.device.TeleVerificationResponse teleVerification(com.xius.xbus.messages.provisioning.device.TeleVerificationRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to subscriberStateChange
     */
    public com.xius.xbus.messages.provisioning.device.SubscriberStateChangeResponse subscriberStateChange(com.xius.xbus.messages.provisioning.device.SubscriberStateChangeRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to   activateTPtoSubscriber
     */
    public com.xius.xbus.messages.provisioning.device.ActivateTPtoSubscriberResponse activateTPtoSubscriber(com.xius.xbus.messages.provisioning.device.ActivateTPtoSubscriberRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to   manageContract
     */
    public com.xius.xbus.messages.provisioning.device.ManageContractResponse manageContract(com.xius.xbus.messages.provisioning.device.ManageContractRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
}
