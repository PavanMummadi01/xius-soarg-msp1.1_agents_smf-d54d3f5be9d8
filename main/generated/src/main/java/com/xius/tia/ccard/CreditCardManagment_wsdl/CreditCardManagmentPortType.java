/**
 * CreditCardManagmentPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.ccard.CreditCardManagment_wsdl;

public interface CreditCardManagmentPortType extends java.rmi.Remote {
    public com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromCardResponse debitFromCard(com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromCardRequest body) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromWalletResponse debitFromWallet(com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromWalletRequest body) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromCCResponse debitFromCC(com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromCCRequest body) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.ccard.CreditCardManagment_xsd.RegisterCCResponse registerCC(com.xius.tia.ccard.CreditCardManagment_xsd.RegisterCCRequest body) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
}
