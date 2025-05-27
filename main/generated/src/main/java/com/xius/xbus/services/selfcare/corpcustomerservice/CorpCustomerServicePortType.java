/**
 * CorpCustomerServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.services.selfcare.corpcustomerservice;

public interface CorpCustomerServicePortType extends java.rmi.Remote {
    public com.xius.xbus.messages.selfcare.corpcustomerservice.GetCorpPreDataResponse getCorpPreData(com.xius.xbus.messages.selfcare.corpcustomerservice.GetCorpPreDataRequest parameter) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.selfcare.corpcustomerservice.ScheduleTopupsResponse scheduleTopups(com.xius.xbus.messages.selfcare.corpcustomerservice.ScheduleTopupsRequest parameter) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.selfcare.corpcustomerservice.GetScheduleTopupsResponse getScheduleTopups(com.xius.xbus.messages.selfcare.corpcustomerservice.GetScheduleTopupsRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.selfcare.corpcustomerservice.ValidatePersonalIdResponse validatePersonalId(com.xius.xbus.messages.selfcare.corpcustomerservice.ValidatePersonalIdRequest parameter) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.selfcare.corpcustomerservice.ManageOfficeCodeResponse manageOfficeCode(com.xius.xbus.messages.selfcare.corpcustomerservice.ManageOfficeCodeRequest parameter) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
    public com.xius.xbus.messages.selfcare.corpcustomerservice.ActivateCorpRCProdResponse activateCorpRCProd(com.xius.xbus.messages.selfcare.corpcustomerservice.ActivateCorpRCProdRequest parameter) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
}
