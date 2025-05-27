/**
 * ProductPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.ProductManagement_wsdl;

public interface ProductPortType extends java.rmi.Remote {
    public com.xius.billing.ProductManagement_xsd.GetTpBundleDtlsResponse getTpBundleDtls(com.xius.billing.ProductManagement_xsd.GetTpBundleDtlsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.ProductManagement_xsd.GetBundleBalancesResponse getBundleBalances(com.xius.billing.ProductManagement_xsd.GetBundleBalancesRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.ProductManagement_xsd.GetTpdetailsResponse getTpDetails(com.xius.billing.ProductManagement_xsd.GetTpdetailsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.ProductManagement_xsd.GetAvailableTpsResponse getAvailableTps(com.xius.billing.ProductManagement_xsd.GetAvailableTpsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.ProductManagement_xsd.GetBundleDtlsResponse getBundleDtls(com.xius.billing.ProductManagement_xsd.GetBundleDtlsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.ProductManagement_xsd.GetProductDetailsResponse getProductDetails(com.xius.billing.ProductManagement_xsd.GetProductDetailsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.ProductManagement_xsd.GetProductDtlsResponse getProductDtls(com.xius.billing.ProductManagement_xsd.GetProductDtlsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.ProductManagement_xsd.ProductPurchageResponse productPurchage(com.xius.billing.ProductManagement_xsd.ProductPurchageRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.ProductManagement_xsd.ProductPurchageEnquiryResponse productPurchageEnquiry(com.xius.billing.ProductManagement_xsd.ProductPurchageEnquiryRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.ProductManagement_xsd.GetATPBenefitsResponse getATPBenefits(com.xius.billing.ProductManagement_xsd.GetATPBenefitsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.billing.ProductManagement_xsd.GetRemainingBktBalResponse getRemainingBktBal(com.xius.billing.ProductManagement_xsd.GetRemainingBktBalRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType;
}
