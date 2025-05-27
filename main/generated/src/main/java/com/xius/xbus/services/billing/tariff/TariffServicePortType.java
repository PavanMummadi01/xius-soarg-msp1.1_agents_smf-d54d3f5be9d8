/**
 * TariffServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.services.billing.tariff;

public interface TariffServicePortType extends java.rmi.Remote {
    public com.xius.xbus.messages.billing.tariff.UpdateServicesResponse updateServices(com.xius.xbus.messages.billing.tariff.UpdateServicesRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.billing.tariff.GetServicesResponse getServices(com.xius.xbus.messages.billing.tariff.GetServicesRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.billing.tariff.ConfigureServicesResponse configureServices(com.xius.xbus.messages.billing.tariff.ConfigureServicesRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.billing.tariff.GetTariffPlanInfoResponse getTariffPlanInfo(com.xius.xbus.messages.billing.tariff.GetTariffPlanInfoRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.billing.tariff.ChangeTariffPlanResponse changeTariffPlan(com.xius.xbus.messages.billing.tariff.ChangeTariffPlanRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.billing.tariff.ChangeTPResponse changeTP(com.xius.xbus.messages.billing.tariff.ChangeTPRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.billing.tariff.GetTariffPlansResponse getTariffPlans(com.xius.xbus.messages.billing.tariff.GetTariffPlansRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.billing.tariff.GetDataPlansResponse getDataPlans(com.xius.xbus.messages.billing.tariff.GetDataPlansRequest body) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.billing.tariff.ManageDataPlanResponse manageDataPlan(com.xius.xbus.messages.billing.tariff.ManageDataPlanRequest body) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.billing.tariff.ManageMultipleDataPlansResponse manageMultipleDataPlans(com.xius.xbus.messages.billing.tariff.ManageMultipleDataPlansRequest body) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.billing.tariff.GetDataPlanStatusResponse getDataPlanStatus(com.xius.xbus.messages.billing.tariff.GetDataPlanStatusRequest body) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.billing.tariff.AccountSharingResponse accountSharing(com.xius.xbus.messages.billing.tariff.AccountSharingRequest body) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.billing.tariff.GetAccountSharingBalResponse getAccountSharingBal(com.xius.xbus.messages.billing.tariff.GetAccountSharingBalRequest body) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.billing.tariff.GetServicePackInfoResponse getServicePackInfo(com.xius.xbus.messages.billing.tariff.GetServicePackInfoRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.billing.tariff.ManageServicePackResponse manageServicePack(com.xius.xbus.messages.billing.tariff.ManageServicePackRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.billing.tariff.GetTariffServicePkgDtlResponse getTariffServicePkgDtl(com.xius.xbus.messages.billing.tariff.GetTariffServicePkgDtlRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.billing.tariff.GetBaseSubServicesResponse getBaseSubServices(com.xius.xbus.messages.billing.tariff.GetBaseSubServicesRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.billing.tariff.GetBaseATPServicesResponse getBaseATPServices(com.xius.xbus.messages.billing.tariff.GetBaseATPServicesRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.billing.tariff.DeleteServiceResponse deleteService(com.xius.xbus.messages.billing.tariff.DeleteServiceRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.billing.tariff.ATPSubscriptionResponse ATPSubscription(com.xius.xbus.messages.billing.tariff.ATPSubscriptionRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.billing.tariff.ATPSubscriptionWithCCResponse ATPSubscriptionWithCC(com.xius.xbus.messages.billing.tariff.ATPSubscriptionWithCCRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.billing.tariff.BulkATPSubscriptionResponse bulkATPSubscription(com.xius.xbus.messages.billing.tariff.BulkATPSubscriptionRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.billing.tariff.ActivateBulkATPResponse activateBulkATPSub(com.xius.xbus.messages.billing.tariff.ActivateBulkATPRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.billing.tariff.GetTPResponse getTPs(com.xius.xbus.messages.billing.tariff.GetTPRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.billing.tariff.GetDPlansResponse getDPlans(com.xius.xbus.messages.billing.tariff.GetDPlansRequest body) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.billing.tariff.ManageMyPlanResponse manageMyPlan(com.xius.xbus.messages.billing.tariff.ManageMyPlanRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.billing.tariff.MyPlanRenewalResponse myPlanRenewal(com.xius.xbus.messages.billing.tariff.MyPlanRenewalRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.billing.tariff.ManageVolteResponse manageVolte(com.xius.xbus.messages.billing.tariff.ManageVolteRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.billing.tariff.Manage5GResponse manage5G(com.xius.xbus.messages.billing.tariff.Manage5GRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
}
