/**
 * BalanceManagementPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.BalanceManagement_wsdl;

public interface BalanceManagementPortType extends java.rmi.Remote {
    public com.xius.billing.BalanceManagement_xsd.UpdatePostPaidDiscountResponse updatePostPaidDiscount(com.xius.billing.BalanceManagement_xsd.UpdatePostPaidDiscountRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.BalanceManagement_xsd.MultiBalAdjustmentResponse multiBalAdjustment(com.xius.billing.BalanceManagement_xsd.MultiBalAdjustmentRequest multiBalAdjustmentRequest) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.BalanceManagement_xsd.BulkBalAdjustmentResponse bulkBalAdjustment(com.xius.billing.BalanceManagement_xsd.BulkBalAdjustmentRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.BalanceManagement_xsd.RetrieveVoucherResponse retrieveVoucher(com.xius.billing.BalanceManagement_xsd.RetrieveVoucherRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.BalanceManagement_xsd.SpecialDebitResponse specialDebit(com.xius.billing.BalanceManagement_xsd.SpecialDebitRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.BalanceManagement_xsd.SpecialTopUpResponse specialTopUp(com.xius.billing.BalanceManagement_xsd.SpecialTopUpRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.BalanceManagement_xsd.TransferBalanceResponse transferBalance(com.xius.billing.BalanceManagement_xsd.TransferBalanceRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.BalanceManagement_xsd.DebitResponse debit(com.xius.billing.BalanceManagement_xsd.DebitRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.BalanceManagement_xsd.WaiverResponse waiver(com.xius.billing.BalanceManagement_xsd.WaiverRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.BalanceManagement_xsd.TopUpResponse topUp(com.xius.billing.BalanceManagement_xsd.TopUpRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.BalanceManagement_xsd.RechargeResponse recharge(com.xius.billing.BalanceManagement_xsd.RechargeRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.BalanceManagement_xsd.RechargeReversalResponse rechargeReversal(com.xius.billing.BalanceManagement_xsd.RechargeReversalRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.BalanceManagement_xsd.RechargeInquiryResponse rechargeInquiry(com.xius.billing.BalanceManagement_xsd.RechargeInquiryRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.BalanceManagement_xsd.GetAllBalancesResponse getAllBalances(com.xius.billing.BalanceManagement_xsd.GetAllBalancesRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.BalanceManagement_xsd.DebitFullOrPartialCoreBalResponse debitFullOrPartialCoreBal(com.xius.billing.BalanceManagement_xsd.DebitFullOrPartialCoreBalRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.BalanceManagement_xsd.GetAllBalanceC1Response getAllBalanceC1(com.xius.billing.BalanceManagement_xsd.GetAllBalanceC1Request getAllBalanceC1Request) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.BalanceManagement_xsd.RechargeStatusUpdResponse rechargeStatusUpd(com.xius.billing.BalanceManagement_xsd.RechargeStatusUpdRequest rechargeStatusUpdRequest) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.BalanceManagement_xsd.GetRcProductResponse getRcProduct(com.xius.billing.BalanceManagement_xsd.GetRcProductRequest getRcProductRequest) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.BalanceManagement_xsd.GetMDNRcProductResponse getMDNRcProduct(com.xius.billing.BalanceManagement_xsd.GetMDNRcProductRequest getMDNRcProductRequest) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.BalanceManagement_xsd.GetRechargeInfoResponse getRechargeInfo(com.xius.billing.BalanceManagement_xsd.GetRechargeInfoRequest getRechargeInfoRequest) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.BalanceManagement_xsd.GetCategoryListResponse getCategoryList(com.xius.billing.BalanceManagement_xsd.GetCategoryListRequest getCategoryListRequest) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
}
