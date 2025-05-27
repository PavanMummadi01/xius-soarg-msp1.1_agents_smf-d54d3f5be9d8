/**
 * SelfCareServicesPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.services.selfcare.services;

public interface SelfCareServicesPortType extends java.rmi.Remote {

    /**
     * This operation is used to authenticate the credentials given
     * by user.
     */
    public com.xius.xbus.messages.selfcare.services.LoginAuthenticateResponse loginAuthenticate(com.xius.xbus.messages.selfcare.services.LoginAuthenticateRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to Retrieve account details.
     */
    public com.xius.xbus.messages.selfcare.services.GetAccountResponse getAccount(com.xius.xbus.messages.selfcare.services.GetAccountRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to TopUp the balance with voucher and
     * returns the voucher details and resulting balance details.
     */
    public com.xius.xbus.messages.selfcare.services.VoucherTopUpResponse voucherTopUp(com.xius.xbus.messages.selfcare.services.VoucherTopUpRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to transfer the balance between the
     * Accounts.
     */
    public com.xius.xbus.messages.selfcare.services.TransferBalanceResponse transferBalance(com.xius.xbus.messages.selfcare.services.TransferBalanceRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to Change Password.
     */
    public com.xius.xbus.messages.selfcare.services.ChangePasswordResponse changePassword(com.xius.xbus.messages.selfcare.services.ChangePasswordRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to Update personal details
     */
    public com.xius.xbus.messages.selfcare.services.UpdateAccountDetailsResponse updateAccountDetails(com.xius.xbus.messages.selfcare.services.UpdateAccountDetailsRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to retrieve the registered services
     * for a given account.
     */
    public com.xius.xbus.messages.selfcare.services.GetServicesResponse getServices(com.xius.xbus.messages.selfcare.services.GetServicesRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to retrieve the password for a given
     * information.
     */
    public com.xius.xbus.messages.selfcare.services.ForgotPasswordResponse forgotPassword(com.xius.xbus.messages.selfcare.services.ForgotPasswordRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to retrieve the username for a given
     * information.
     */
    public com.xius.xbus.messages.selfcare.services.ForgotUserNameResponse forgotUserName(com.xius.xbus.messages.selfcare.services.ForgotUserNameRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to register an account or additional
     * subscription for already registered account
     */
    public com.xius.xbus.messages.selfcare.services.RegisterAccountResponse registerAccount(com.xius.xbus.messages.selfcare.services.RegisterAccountRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to change either SIM or IMSI or MSISDN,
     * 
     * 					any one of three is expected as input
     */
    public com.xius.xbus.messages.selfcare.services.ChangeDeviceResponse changeDevice(com.xius.xbus.messages.selfcare.services.ChangeDeviceRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to associated msisdns for the given
     * id value
     */
    public com.xius.xbus.messages.selfcare.services.GetAssociatedMSISDNsResponse getAssociatedMSISDNs(com.xius.xbus.messages.selfcare.services.GetAssociatedMSISDNsRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to update services
     */
    public com.xius.xbus.messages.selfcare.services.UpdateServicesResponse updateServices(com.xius.xbus.messages.selfcare.services.UpdateServicesRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to get available msisdns(free pool msisnds)
     */
    public com.xius.xbus.messages.selfcare.services.GetDesiredMSISDNsResponse getDesiredMSISDNs(com.xius.xbus.messages.selfcare.services.GetDesiredMSISDNsRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to get the device details for the given
     * account
     */
    public com.xius.xbus.messages.selfcare.services.GetDeviceDetailsResponse getDeviceDetails(com.xius.xbus.messages.selfcare.services.GetDeviceDetailsRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to DataPlans for the given account
     */
    public com.xius.xbus.messages.selfcare.services.GetDataPlansResponse getDataPlans(com.xius.xbus.messages.selfcare.services.GetDataPlansRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to manageMultipleDataPlans for the given
     * account
     */
    public com.xius.xbus.messages.selfcare.services.ManageMultipleDataPlansResponse manageMultipleDataPlans(com.xius.xbus.messages.selfcare.services.ManageMultipleDataPlansRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to getLanguage for the given account
     */
    public com.xius.xbus.messages.selfcare.services.GetLanguageResponse getLanguage(com.xius.xbus.messages.selfcare.services.GetLanguageRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to setLanguage for the given account
     */
    public com.xius.xbus.messages.selfcare.services.SetLanguageResponse setLanguage(com.xius.xbus.messages.selfcare.services.SetLanguageRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This API is to update The payment Status For AdPay GateWay
     */
    public com.xius.xbus.messages.selfcare.services.UpdatePaymentStatusResponse updatePaymentStatus(com.xius.xbus.messages.selfcare.services.UpdatePaymentStatusRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This API is to update The payment Status For AdPay GateWay
     */
    public com.xius.xbus.messages.selfcare.services.WalletPaymentResponse walletPayment(com.xius.xbus.messages.selfcare.services.WalletPaymentRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
}
