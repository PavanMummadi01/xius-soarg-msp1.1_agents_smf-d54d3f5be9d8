/**
 * TIAManagementPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TIAManagement_wsdl;

public interface TIAManagementPortType extends java.rmi.Remote {
    public com.xius.tia.TIAManagement_xsd.ChangeSubMSISDNResponse changeSubMSISDN(com.xius.tia.TIAManagement_xsd.ChangeSubMSISDNRequest changeSubMSISDNRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TIAManagement_xsd.SIMSwapResponse simSwap(com.xius.tia.TIAManagement_xsd.SIMSwapRequest simSwapRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TIAManagement_xsd.ActivateSubscriberResponse activateSubscriber(com.xius.tia.TIAManagement_xsd.ActivateSubscriberRequest activateSubscriberRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TIAManagement_xsd.DeactivateSubscriberResponse deactivateSubscriber(com.xius.tia.TIAManagement_xsd.DeactivateSubscriberRequest deactivateSubscriberRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TIAManagement_xsd.SuspendSubscriberResponse suspendSubscriber(com.xius.tia.TIAManagement_xsd.SuspendSubscriberRequest suspendSubscriberRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TIAManagement_xsd.CreateSubscriptionResponse createSubscription(com.xius.tia.TIAManagement_xsd.CreateSubscriptionRequest createSubscriptionRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TIAManagement_xsd.CreateAccountResponse createAccount(com.xius.tia.TIAManagement_xsd.CreateAccountRequest createAccountRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TIAManagement_xsd.GetSubscriptionProfileResponse getSubscriptionProfile(com.xius.tia.TIAManagement_xsd.GetSubscriptionProfileRequest getSubscriptionProfileRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TIAManagement_xsd.ChangeTechnologyResponse changeTechnology(com.xius.tia.TIAManagement_xsd.ChangeTechnologyRequest changeTechnologyRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TIAManagement_xsd.RoamingResponse roaming(com.xius.tia.TIAManagement_xsd.RoamingRequest roamingRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TIAManagement_xsd.TTPCRFNotifyResponse TTPCRFNotify(com.xius.tia.TIAManagement_xsd.TTPCRFNotifyRequest TTPCRFNotifyRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TIAManagement_xsd.PackageNotifyResponse packageNotify(com.xius.tia.TIAManagement_xsd.PackageNotifyRequest packageNotifyRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TIAManagement_xsd.DpiValidationResponse DPIValidation(com.xius.tia.TIAManagement_xsd.DpiValidationRequest DPIValidationRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TIAManagement_xsd.SimActivationResponse SIMActivation(com.xius.tia.TIAManagement_xsd.SimActivationRequest SIMActivationRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TIAManagement_xsd.YFCreateInvoiceResponse YFCreateInvoice(com.xius.tia.TIAManagement_xsd.YFCreateInvoiceRequest YFCreateInvoiceRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TIAManagement_xsd.YFNotificationResponse YFNotification(com.xius.tia.TIAManagement_xsd.YFNotificationRequest YFNotificationRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TIAManagement_xsd.QueryHLRResponse queryHLR(com.xius.tia.TIAManagement_xsd.QueryHLRRequest queryHLRRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TIAManagement_xsd.QueryTransactionsResponse queryTransactions(com.xius.tia.TIAManagement_xsd.QueryTransactionsRequest queryTransactionsRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TIAManagement_xsd.WebhookNotificationResponse webhookNotification(com.xius.tia.TIAManagement_xsd.WebhookNotificationRequest webhookNotificationRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.TIAManagement_xsd.IMEIEnquiryResponse IMEIEnquiry(com.xius.tia.TIAManagement_xsd.IMEIEnquiryRequest IMEIEnquiryRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
}
