/**
 * CAManagementPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_wsdl;

public interface CAManagementPortType extends java.rmi.Remote {
    public com.xius.billing.CAManagement_xsd.ManageAddOnFtrsResponse manageAddOnFtrs(com.xius.billing.CAManagement_xsd.ManageAddOnFtrsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.CAManagement_xsd.CAAccountExistCountResponse cAAccountExistCount(com.xius.billing.CAManagement_xsd.CAAccountExistCountRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.CAManagement_xsd.CARenewalResponse caRenewal(com.xius.billing.CAManagement_xsd.CARenewalRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.CAManagement_xsd.GetCAPreLoadDataResponse getCAPreLoadData(com.xius.billing.CAManagement_xsd.GetCAPreLoadDataRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.CAManagement_xsd.GetCAServiceInfoResponse getCAServiceInfo(com.xius.billing.CAManagement_xsd.GetCAServiceInfoRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.CAManagement_xsd.GetCalendarsResponse getCalendars(com.xius.billing.CAManagement_xsd.GetCalendarsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.CAManagement_xsd.GetAdnlFeturResponse getAdditionalFeatures(com.xius.billing.CAManagement_xsd.GetAdnlFeturRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.CAManagement_xsd.GetVistngNetwrkResponse getVistingNetworks(com.xius.billing.CAManagement_xsd.GetVistngNetwrkRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.CAManagement_xsd.ManageCAGroupResponse manageCAGroup(com.xius.billing.CAManagement_xsd.ManageCAGroupRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.CAManagement_xsd.GetCAGroupResponse getCAGroup(com.xius.billing.CAManagement_xsd.GetCAGroupRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.CAManagement_xsd.ManagePackageResponse managePackage(com.xius.billing.CAManagement_xsd.ManagePackageRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.CAManagement_xsd.DeletePackageResponse deletePackage(com.xius.billing.CAManagement_xsd.DeletePackageRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.CAManagement_xsd.GetPackageResponse getPackage(com.xius.billing.CAManagement_xsd.GetPackageRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.CAManagement_xsd.GetCAInfoResponse getCAInfo(com.xius.billing.CAManagement_xsd.GetCAInfoRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.CAManagement_xsd.GetCARenewalsResponse getCARenewals(com.xius.billing.CAManagement_xsd.GetCARenewalsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.CAManagement_xsd.UpdateCAActResponse updateCAAct(com.xius.billing.CAManagement_xsd.UpdateCAActRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.CAManagement_xsd.DeactCAGrpImmdResponse deactCAGrpImmd(com.xius.billing.CAManagement_xsd.DeactCAGrpImmdRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.CAManagement_xsd.GetCAPackageChargesResponse getCAPackageCharges(com.xius.billing.CAManagement_xsd.GetCAPackageChargesRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.CAManagement_xsd.ManageCaATPResponse manageCaATP(com.xius.billing.CAManagement_xsd.ManageCaATPRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.CAManagement_xsd.ManageCaNotifResponse manageCaNotif(com.xius.billing.CAManagement_xsd.ManageCaNotifRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.CAManagement_xsd.UpateCAGrpCreditLimitResponse upateCAGrpCreditLimit(com.xius.billing.CAManagement_xsd.UpateCAGrpCreditLimitRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.CAManagement_xsd.GetPostpaidGrpCountDetResponse getPostpaidGrpCountDet(com.xius.billing.CAManagement_xsd.GetPostpaidGrpCountDetRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
}
