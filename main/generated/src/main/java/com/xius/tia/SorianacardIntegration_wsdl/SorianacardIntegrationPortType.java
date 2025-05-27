/**
 * SorianacardIntegrationPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.SorianacardIntegration_wsdl;

public interface SorianacardIntegrationPortType extends java.rmi.Remote {
    public com.xius.tia.SorianacardIntegration_xsd.GetSorianaPointsResponse getSorianaPoints(com.xius.tia.SorianacardIntegration_xsd.GetSorianaPointsRequest getSorianaPointsRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.SorianacardIntegration_xsd.GetClientIdResponse getclientId(com.xius.tia.SorianacardIntegration_xsd.GetClientIdRequest getClientIdRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.SorianacardIntegration_xsd.ResponseType modifyprincipalMSISDN(com.xius.tia.SorianacardIntegration_xsd.RequestType modifyprincipalMSISDNRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.SorianacardIntegration_xsd.ResponseType addMSISDN(com.xius.tia.SorianacardIntegration_xsd.RequestType addMSISDNRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.tia.SorianacardIntegration_xsd.ResponseType deleteMSISDN(com.xius.tia.SorianacardIntegration_xsd.RequestType deleteMSISDNRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType;
}
