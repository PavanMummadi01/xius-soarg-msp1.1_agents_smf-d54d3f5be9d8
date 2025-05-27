/**
 * WalletIntegrationPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.WalletManagement_wsdl;

public interface WalletIntegrationPortType extends java.rmi.Remote {
    public com.xius.tia.WalletManagement_xsd.CreditWalletResponse creditWallet(com.xius.tia.WalletManagement_xsd.CreditWalletRequest creditWalletRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.WalletManagement_xsd.CreateWalletResponse createWallet(com.xius.tia.WalletManagement_xsd.CreateWalletRequest createWalletRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.WalletManagement_xsd.GetBalanceResponse getBalance(com.xius.tia.WalletManagement_xsd.GetBalanceRequest getBalanceRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
}
