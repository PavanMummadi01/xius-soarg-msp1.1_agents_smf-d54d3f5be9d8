/**
 * CommunityAccountServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.services.selfcare.communityaccountservice;

public interface CommunityAccountServicePortType extends java.rmi.Remote {
    public com.xius.xbus.messages.selfcare.communityaccountservice.GetAdnlFtrsResponse getAdnlFtrs(com.xius.xbus.messages.selfcare.communityaccountservice.GetAdnlFtrsRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.selfcare.communityaccountservice.CARenwlResponse caRenwl(com.xius.xbus.messages.selfcare.communityaccountservice.CARenwlRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.selfcare.communityaccountservice.GetCADetailsResponse getCADetails(com.xius.xbus.messages.selfcare.communityaccountservice.GetCADetailsRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.selfcare.communityaccountservice.GetServiceDataResponse getServiceData(com.xius.xbus.messages.selfcare.communityaccountservice.GetServiceDataRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.selfcare.communityaccountservice.ManagePackageResponse managePackage(com.xius.xbus.messages.selfcare.communityaccountservice.ManagePackageRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.selfcare.communityaccountservice.GetPackageResponse getPackage(com.xius.xbus.messages.selfcare.communityaccountservice.GetPackageRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.selfcare.communityaccountservice.DeletePackageResponse deletePackage(com.xius.xbus.messages.selfcare.communityaccountservice.DeletePackageRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.selfcare.communityaccountservice.ManageComuniAcctResponse manageComuniAcct(com.xius.xbus.messages.selfcare.communityaccountservice.ManageComuniAcctRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.selfcare.communityaccountservice.GetCommAcctResponse getCommAcct(com.xius.xbus.messages.selfcare.communityaccountservice.GetCommAcctRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.selfcare.communityaccountservice.GetCARenwlResponse getCARenwl(com.xius.xbus.messages.selfcare.communityaccountservice.GetCARenwlRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.selfcare.communityaccountservice.ManageAddOnFtrsResponse manageAddOnFtrs(com.xius.xbus.messages.selfcare.communityaccountservice.ManageAddOnFtrsRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.selfcare.communityaccountservice.UpdateCAAccountResponse updateCAAccount(com.xius.xbus.messages.selfcare.communityaccountservice.UpdateCAAccountRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.selfcare.communityaccountservice.ManageCommActATPResponse manageCommActATP(com.xius.xbus.messages.selfcare.communityaccountservice.ManageCommActATPRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
}
