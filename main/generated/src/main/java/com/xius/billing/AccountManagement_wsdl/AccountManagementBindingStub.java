/**
 * AccountManagementBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_wsdl;

public class AccountManagementBindingStub extends org.apache.axis.client.Stub implements com.xius.billing.AccountManagement_wsdl.AccountManagementPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[70];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("managePostPaidGrp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "managePostPaidGrpRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ManagePostPaidGrpRequest"), com.xius.billing.AccountManagement_xsd.ManagePostPaidGrpRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ManagePostPaidGrpResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.ManagePostPaidGrpResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "managePostPaidGrpResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTechnology");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getTechnologyRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetTechnologyRequest"), com.xius.billing.AccountManagement_xsd.GetTechnologyRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetTechnologyResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.GetTechnologyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getTechnologyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getForceRenDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getForceRenDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getForceRenDetailsRequest"), com.xius.billing.AccountManagement_xsd.GetForceRenDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getForceRenDetailsResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.GetForceRenDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getForceRenDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reActivateMSISDN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "reActivateMSISDNRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ReActivateMSISDNRequest"), com.xius.billing.AccountManagement_xsd.ReActivateMSISDNRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ReActivateMSISDNResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.ReActivateMSISDNResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "reActivateMSISDNResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCreditProfiles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getCreditProfilesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetCreditProfilesRequest"), com.xius.billing.AccountManagement_xsd.GetCreditProfilesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetCreditProfilesResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.GetCreditProfilesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getCreditProfilesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validateMSISDN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "validateMSISDNRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ValidateMSISDNRequest"), com.xius.billing.AccountManagement_xsd.ValidateMSISDNRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ValidateMSISDNResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.ValidateMSISDNResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "validateMSISDNResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateBillingType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "updateBillingTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UpdateBillingTypeRequest"), com.xius.billing.AccountManagement_xsd.UpdateBillingTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UpdateBillingTypeResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.UpdateBillingTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "updateBillingTypeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("viewTroubleTkts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "viewTroubleTktsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ViewTroubleTktsRequest"), com.xius.billing.AccountManagement_xsd.ViewTroubleTktsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ViewTroubleTktsResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.ViewTroubleTktsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "viewTroubleTktsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manageTroubleTkts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "manageTroubleTktsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ManageTroubleTktsRequest"), com.xius.billing.AccountManagement_xsd.ManageTroubleTktsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ManageTroubleTktsResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.ManageTroubleTktsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "manageTroubleTktsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTroubleTktsPreInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "trblTktsPreInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TrblTktsPreInfoRequest"), com.xius.billing.AccountManagement_xsd.TrblTktsPreInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TrblTktsPreInfoResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.TrblTktsPreInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "trblTktsPreInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeMSISDNs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "changeMSISDNsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ChangeMSISDNsRequest"), com.xius.billing.AccountManagement_xsd.ChangeMSISDNsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ChangeMSISDNsResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.ChangeMSISDNsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "changeMSISDNsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("simRegistration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMRegistrationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMRegistrationRequest"), com.xius.billing.AccountManagement_xsd.SIMRegistrationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMRegistrationResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.SIMRegistrationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMRegistrationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateActData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "updateActDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UpdateActDataRequest"), com.xius.billing.AccountManagement_xsd.UpdateActDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UpdateActDataResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.UpdateActDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "updateActDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateActStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "updateActStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UpdateActStatusRequest"), com.xius.billing.AccountManagement_xsd.UpdateActStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UpdateActStatusResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.UpdateActStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "updateActStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeMSISDN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "changeMSISDNRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ChangeMSISDNRequest"), com.xius.billing.AccountManagement_xsd.ChangeMSISDNRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ChangeMSISDNResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.ChangeMSISDNResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "changeMSISDNResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("swapSIM");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMSwapRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMSwapRequest"), com.xius.billing.AccountManagement_xsd.SIMSwapRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMSwapResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.SIMSwapResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMSwapResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeIMSI");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "changeIMSIRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ChangeIMSIRequest"), com.xius.billing.AccountManagement_xsd.ChangeIMSIRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ChangeIMSIResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.ChangeIMSIResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "changeIMSIResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeIMSIPreInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "changeIMSIPreInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ChangeIMSIPreInfoRequest"), com.xius.billing.AccountManagement_xsd.ChangeIMSIPreInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ChangeIMSIPreInfoResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.ChangeIMSIPreInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "changeIMSIPreInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deActivateAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "deActivateAccountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "DeActivateAccountRequest"), com.xius.billing.AccountManagement_xsd.DeActivateAccountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "DeActivateAccountResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.DeActivateAccountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "deActivateAccountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeMSISDNPreInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "chngMSISDNPreInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ChngMSISDNPreInfoRequest"), com.xius.billing.AccountManagement_xsd.ChngMSISDNPreInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ChngMSISDNPreInfoResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.ChngMSISDNPreInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "chngMSISDNPreInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMSISDNInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getMSISDNInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetMSISDNInfoRequest"), com.xius.billing.AccountManagement_xsd.GetMSISDNInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetMSISDNInfoResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.GetMSISDNInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getMSISDNInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("subGroupChangePreInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "subGroupChangePreInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SubGroupChangePreInfoRequest"), com.xius.billing.AccountManagement_xsd.SubGroupChangePreInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SubGroupChangePreInfoResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.SubGroupChangePreInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "subGroupChangePreInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("subGroupChange");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "subGroupChangeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SubGroupChangeRequest"), com.xius.billing.AccountManagement_xsd.SubGroupChangeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SubGroupChangeResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.SubGroupChangeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "subGroupChangeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manageAdditionalServices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "manageAdditionalServicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ManageAdditionalServicesRequest"), com.xius.billing.AccountManagement_xsd.ManageAdditionalServicesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ManageAdditionalServicesResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.ManageAdditionalServicesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "manageAdditionalServicesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAdditionalServices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getAdditionalServicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetAdditionalServicesRequest"), com.xius.billing.AccountManagement_xsd.GetAdditionalServicesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetAdditionalServicesResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.GetAdditionalServicesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getAdditionalServicesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("convertAccountType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "convertAccountTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ConvertAccountTypeRequest"), com.xius.billing.AccountManagement_xsd.ConvertAccountTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ConvertAccountTypeResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.ConvertAccountTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "convertAccountTypeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPostpaidAcctDet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getPostpaidAcctDetRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetPostpaidAcctDetRequest"), com.xius.billing.AccountManagement_xsd.GetPostpaidAcctDetRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetPostpaidAcctDetResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.GetPostpaidAcctDetResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getPostpaidAcctDetResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateCreditLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "updateCreditLimitRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UpdateCreditLimitRequest"), com.xius.billing.AccountManagement_xsd.UpdateCreditLimitRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UpdateCreditLimitResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.UpdateCreditLimitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "updateCreditLimitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validateUserAPI");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "validateUserAPIRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ValidateUserAPIRequest"), com.xius.billing.AccountManagement_xsd.ValidateUserAPIRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ValidateUserAPIResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.ValidateUserAPIResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "validateUserAPIResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAndBlockMSISDN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getAndBlockMSISDNRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetAndBlockMSISDNRequest"), com.xius.billing.AccountManagement_xsd.GetAndBlockMSISDNRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetAndBlockMSISDNResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.GetAndBlockMSISDNResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getAndBlockMSISDNResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeSimMdnAudit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "changeSimMdnAuditRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "changeSimMdnAuditRequest"), com.xius.billing.AccountManagement_xsd.ChangeSimMdnAuditRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "changeSimMdnAuditResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.ChangeSimMdnAuditResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "changeSimMdnAuditResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("simDealerValidation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "simDealerValidationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SimDealerValidationRequest"), com.xius.billing.AccountManagement_xsd.SimDealerValidationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SimDealerValidationResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.SimDealerValidationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "simDealerValidationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getChargeInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getChargeInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetChargeInfoRequest"), com.xius.billing.AccountManagement_xsd.GetChargeInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetChargeInfoResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.GetChargeInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getChargeInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("simSwapCrdtRptUpdt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "simSwapCrdtRptUpdtRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SimSwapCrdtRptUpdtRequest"), com.xius.billing.AccountManagement_xsd.SimSwapCrdtRptUpdtRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SimSwapCrdtRptUpdtResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.SimSwapCrdtRptUpdtResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "simSwapCrdtRptUpdtResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manageProvsngRetry");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "manageProvsngRetryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ManageProvsngRetryRequest"), com.xius.billing.AccountManagement_xsd.ManageProvsngRetryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ManageProvsngRetryResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.ManageProvsngRetryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "manageProvsngRetryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updatePostpaidAcctDet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "updatePostpaidAcctDetRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UpdatePostpaidAcctDetRequest"), com.xius.billing.AccountManagement_xsd.UpdatePostpaidAcctDetRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UpdatePostpaidAcctDetResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.UpdatePostpaidAcctDetResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "updatePostpaidAcctDetResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLocationAssoMsisdn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getLocationAssoMsisdnRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetLocationAssoMsisdnRequest"), com.xius.billing.AccountManagement_xsd.GetLocationAssoMsisdnRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetLocationAssoMsisdnResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.GetLocationAssoMsisdnResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getLocationAssoMsisdnResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activateSubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "activateSubscriberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ActivateSubscriberRequest"), com.xius.billing.AccountManagement_xsd.ActivateSubscriberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ActivateSubscriberResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.ActivateSubscriberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "activateSubscriberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("forceRenewal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "forceRenewalRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ForceRenewalRequest"), com.xius.billing.AccountManagement_xsd.ForceRenewalRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ForceRenewalResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.ForceRenewalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "forceRenewalResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("HLRIntegration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "HLRIntegrationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "HLRIntegrationRequest"), com.xius.billing.AccountManagement_xsd.HLRIntegrationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "HLRIntegrationResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.HLRIntegrationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "HLRIntegrationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("HLRIntegrationUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "HLRIntegrationUpdateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "HLRIntegrationUpdateRequest"), com.xius.billing.AccountManagement_xsd.HLRIntegrationUpdateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "HLRIntegrationUpdateResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.HLRIntegrationUpdateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "HLRIntegrationUpdateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MDNbasedGetNwId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "MDNbasedGetNwIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "MDNBasedGetNwIdRequest"), com.xius.billing.AccountManagement_xsd.MDNBasedGetNwIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "MDNBasedGetNwIdResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.MDNBasedGetNwIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "MDNbasedGetNwIdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("regSimSwap");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "regSimSwapRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "RegSimSwapRequest"), com.xius.billing.AccountManagement_xsd.RegSimSwapRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "RegSimSwapResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.RegSimSwapResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "regSimSwapResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateTroubleTkt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "updateTroubleTktRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UpdateTroubleTktRequest"), com.xius.billing.AccountManagement_xsd.UpdateTroubleTktRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UpdateTroubleTktResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.UpdateTroubleTktResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "updateTroubleTktResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateSubscriberCategory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "updateSubscriberCategoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "updateSubscriberCategoryRequest"), com.xius.billing.AccountManagement_xsd.UpdateSubscriberCategoryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "updateSubscriberCategoryResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.UpdateSubscriberCategoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "updateSubscriberCategoryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTroubleTktStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getTroubleTktStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetTroubleTktStatusRequest"), com.xius.billing.AccountManagement_xsd.GetTroubleTktStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetTroubleTktStatusResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.GetTroubleTktStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getTroubleTktStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTroubleTktHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getTroubleTktHistoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetTroubleTktHistoryRequest"), com.xius.billing.AccountManagement_xsd.GetTroubleTktHistoryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetTroubleTktHistoryResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.GetTroubleTktHistoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getTroubleTktHistoryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("roamingServiceStatusUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "roamingServiceStatusUpdateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "roamingServiceStatusUpdateRequest"), com.xius.billing.AccountManagement_xsd.RoamingServiceStatusUpdateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "roamingServiceStatusUpdateResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.RoamingServiceStatusUpdateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "roamingServiceStatusUpdateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAccountDates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getAccountDatesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getAccountDatesRequest"), com.xius.billing.AccountManagement_xsd.GetAccountDatesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getAccountDatesResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.GetAccountDatesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getAccountDatesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAccountAllDates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getAccountAllDatesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getAccountAllDatesRequest"), com.xius.billing.AccountManagement_xsd.GetAccountAllDatesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getAccountAllDatesResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.GetAccountAllDatesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getAccountAllDatesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getcategoryID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getcategoryIDRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getcategoryIDRequest"), com.xius.billing.AccountManagement_xsd.GetcategoryIDRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getcategoryIDResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.GetcategoryIDResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getcategoryIDResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("managePathInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "managePathInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ManagePathInfoRequest"), com.xius.billing.AccountManagement_xsd.ManagePathInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ManagePathInfoResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.ManagePathInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "managePathInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPathInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getPathInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetPathInfoRequest"), com.xius.billing.AccountManagement_xsd.GetPathInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetPathInfoResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.GetPathInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getPathInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validateID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "validateIDRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ValidateIDRequest"), com.xius.billing.AccountManagement_xsd.ValidateIDRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ValidateIDResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.ValidateIDResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "validateIDResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TeleVerification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TeleVerificationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TeleVerificationRequest"), com.xius.billing.AccountManagement_xsd.TeleVerificationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TeleVerificationResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.TeleVerificationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TeleVerificationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validateCorpMSISDNVoucher");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "validateCorpMSISDNVoucherRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "validateCorpMSISDNVoucherRequest"), com.xius.billing.AccountManagement_xsd.ValidateCorpMSISDNVoucherRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "validateCorpMSISDNVoucherResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.ValidateCorpMSISDNVoucherResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "validateCorpMSISDNVoucherResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("accountVsBANMapping");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "accountVsBANMappingRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "accountVsBANMappingRequest"), com.xius.billing.AccountManagement_xsd.AccountVsBANMappingRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "accountVsBANMappingResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.AccountVsBANMappingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "accountVsBANMappingResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("publicityIdHLRcodeGet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "publicityIdHLRcodeGetRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "publicityIdHLRcodeGetRequest"), com.xius.billing.AccountManagement_xsd.PublicityIdHLRcodeGetRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "publicityIdHLRcodeGetResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.PublicityIdHLRcodeGetResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "publicityIdHLRcodeGetResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ttsaUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ttsaUpdateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ttsaUpdateRequest"), com.xius.billing.AccountManagement_xsd.TtsaUpdateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ttsaUpdateResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.TtsaUpdateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ttsaUpdateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("bascDrvdIdHLRcodeGet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "bascDrvdIdHLRcodeGetRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "bascDrvdIdHLRcodeGetRequest"), com.xius.billing.AccountManagement_xsd.BascDrvdIdHLRcodeGetRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "bascDrvdIdHLRcodeGetResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.BascDrvdIdHLRcodeGetResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "bascDrvdIdHLRcodeGetResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("bascDrvdIdHLRUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "bascDrvdIdHLRUpdateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "bascDrvdIdHLRUpdateRequest"), com.xius.billing.AccountManagement_xsd.BascDrvdIdHLRUpdateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "bascDrvdIdHLRUpdateResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.BascDrvdIdHLRUpdateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "bascDrvdIdHLRUpdateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTTPCRFintimateDtls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getTTPCRFintimateDtlsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getTTPCRFintimateDtlsRequest"), com.xius.billing.AccountManagement_xsd.GetTTPCRFintimateDtlsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getTTPCRFintimateDtlsResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.GetTTPCRFintimateDtlsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getTTPCRFintimateDtlsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TTPCRFUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TTPCRFUpdateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TTPCRFUpdateRequest"), com.xius.billing.AccountManagement_xsd.TTPCRFUpdateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TTPCRFUpdateResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.TTPCRFUpdateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TTPCRFUpdateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("corpTpProdGetUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "corpTpProdGetUpdateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "corpTpProdGetUpdateRequest"), com.xius.billing.AccountManagement_xsd.CorpTpProdGetUpdateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "corpTpProdGetUpdateResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.CorpTpProdGetUpdateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "corpTpProdGetUpdateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("accountProductIdMap");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "accountProductIdMapRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "accountProductIdMapRequest"), com.xius.billing.AccountManagement_xsd.AccountProductIdMapRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "accountProductIdMapResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.AccountProductIdMapResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "accountProductIdMapResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validateSim");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "validateSimRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "validateSimRequest"), com.xius.billing.AccountManagement_xsd.ValidateSimRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "validateSimResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.ValidateSimResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "validateSimResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SIMActivate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMActivateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "simActivateRequest"), com.xius.billing.AccountManagement_xsd.SimActivateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "simActivateResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.SimActivateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMActivateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFreeMsisdn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getFreeMsisdnRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetFreeMsisdnRequest"), com.xius.billing.AccountManagement_xsd.GetFreeMsisdnRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetFreeMsisdnResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.GetFreeMsisdnResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getFreeMsisdnResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDtlsForRegistration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getDtlsForRegistrationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getDtlsForRegistrationRequest"), com.xius.billing.AccountManagement_xsd.GetDtlsForRegistrationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getDtlsForRegistrationResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.GetDtlsForRegistrationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getDtlsForRegistrationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTripletDtlsForReg");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getTripletDtlsForRegRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getTripletDtlsForRegRequest"), com.xius.billing.AccountManagement_xsd.GetTripletDtlsForRegRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getTripletDtlsForRegResponse"));
        oper.setReturnClass(com.xius.billing.AccountManagement_xsd.GetTripletDtlsForRegResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getTripletDtlsForRegResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[69] = oper;

    }

    public AccountManagementBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AccountManagementBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AccountManagementBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", ">General");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.General.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "accountDetailsInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.AccountDetailsInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "accountDetailsListType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.AccountDetailsInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "accountDetailsInfoType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "accountDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "accountIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "AccountIdType");
            cachedSerQNames.add(qName);
            cls = long.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "accountProductIdMapRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.AccountProductIdMapRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "accountProductIdMapResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.AccountProductIdMapResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "AccountType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.AccountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "accountVsBANMappingRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.AccountVsBANMappingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "accountVsBANMappingResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.AccountVsBANMappingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ActionFlagType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ActionFlagType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ActivateSubscriberRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ActivateSubscriberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ActivateSubscriberResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ActivateSubscriberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "AddtionalServiceType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.AddtionalServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "AddtnalServcListType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.AddtionalServiceType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "AddtionalServiceType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "service");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "AllAccountType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.AllAccountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "atpDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.AtpDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "bascDrvdIdHLRcodeGetRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.BascDrvdIdHLRcodeGetRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "bascDrvdIdHLRcodeGetResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.BascDrvdIdHLRcodeGetResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "bascDrvdIdHLRUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.BascDrvdIdHLRUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "bascDrvdIdHLRUpdateResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.BascDrvdIdHLRUpdateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "BillFreqType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "BillingListType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.BillingTypeData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "BillingTypeData");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "BillingTypeData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "BillingType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.BillingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "BillingTypeData");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.BillingTypeData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "BillType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "CalendarIdType");
            cachedSerQNames.add(qName);
            cls = long.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "CardProfilesListType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.CardProfilesListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "CardProfilesType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.CardProfilesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ChangeIMSIPreInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ChangeIMSIPreInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ChangeIMSIPreInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ChangeIMSIPreInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ChangeIMSIRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ChangeIMSIRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ChangeIMSIResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ChangeIMSIResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ChangeMSISDNRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ChangeMSISDNRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ChangeMSISDNResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ChangeMSISDNResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ChangeMSISDNsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ChangeMSISDNsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ChangeMSISDNsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ChangeMSISDNsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "changeSimMdnAuditRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ChangeSimMdnAuditRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "changeSimMdnAuditResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ChangeSimMdnAuditResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ChargesType");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ChngMSISDNPreInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ChngMSISDNPreInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ChngMSISDNPreInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ChngMSISDNPreInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ConvertAccountTypeRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ConvertAccountTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ConvertAccountTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ConvertAccountTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "corpTpProdGetUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.CorpTpProdGetUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "corpTpProdGetUpdateResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.CorpTpProdGetUpdateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "CountryCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "CreditLimitType");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "CreditProfilesListType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.CreditProfilesListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "CreditProfilesType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.CreditProfilesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "CreditType");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "DateType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "DDMONYYYYFormat");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "DeActivateAccountRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.DeActivateAccountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "DeActivateAccountResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.DeActivateAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "eventIdType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.EventIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "FirstNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ForceRenewalRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ForceRenewalRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ForceRenewalResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ForceRenewalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getAccountAllDatesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetAccountAllDatesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getAccountAllDatesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetAccountAllDatesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getAccountDatesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetAccountDatesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getAccountDatesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetAccountDatesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetAdditionalServicesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetAdditionalServicesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetAdditionalServicesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetAdditionalServicesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetAndBlockMSISDNRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetAndBlockMSISDNRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetAndBlockMSISDNResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetAndBlockMSISDNResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getcategoryIDRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetcategoryIDRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getcategoryIDResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetcategoryIDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetChargeInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetChargeInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetChargeInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetChargeInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetCreditProfilesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetCreditProfilesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetCreditProfilesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetCreditProfilesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getDtlsForRegistrationRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetDtlsForRegistrationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getDtlsForRegistrationResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetDtlsForRegistrationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getForceRenDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetForceRenDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getForceRenDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetForceRenDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetFreeMsisdnRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetFreeMsisdnRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetFreeMsisdnResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetFreeMsisdnResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetLocationAssoMsisdnRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetLocationAssoMsisdnRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetLocationAssoMsisdnResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetLocationAssoMsisdnResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetMSISDNInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetMSISDNInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetMSISDNInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetMSISDNInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetPathInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetPathInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetPathInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetPathInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetPostpaidAcctDetRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetPostpaidAcctDetRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetPostpaidAcctDetResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetPostpaidAcctDetResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetTechnologyRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetTechnologyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetTechnologyResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetTechnologyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getTripletDtlsForRegRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetTripletDtlsForRegRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getTripletDtlsForRegResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetTripletDtlsForRegResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetTroubleTktHistoryRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetTroubleTktHistoryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetTroubleTktHistoryResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetTroubleTktHistoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetTroubleTktStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetTroubleTktStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetTroubleTktStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetTroubleTktStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getTTPCRFintimateDtlsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetTTPCRFintimateDtlsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getTTPCRFintimateDtlsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GetTTPCRFintimateDtlsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GroupListType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GroupType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GroupType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "group");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GroupType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GroupType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GrpDtlsType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GrpDtlsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GrpListDtlsType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.GrpDtlsType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GrpDtlsType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GrpInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "HLRCodeDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.HLRCodeDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "HLRIntegrationRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.HLRIntegrationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "HLRIntegrationResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.HLRIntegrationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "HLRIntegrationUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.HLRIntegrationUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "HLRIntegrationUpdateResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.HLRIntegrationUpdateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "IDInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.IDInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "IDNoType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "IDType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "IMSIType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "IPAddressType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "IsCorpType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "LastNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "LocationIdType");
            cachedSerQNames.add(qName);
            cls = double.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ManageAdditionalServicesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ManageAdditionalServicesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ManageAdditionalServicesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ManageAdditionalServicesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ManagePathInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ManagePathInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ManagePathInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ManagePathInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ManagePostPaidGrpRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ManagePostPaidGrpRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ManagePostPaidGrpResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ManagePostPaidGrpResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ManageProvsngRetry");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ManageProvsngRetry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ManageProvsngRetryRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ManageProvsngRetryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ManageProvsngRetryResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ManageProvsngRetryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ManageTroubleTktsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ManageTroubleTktsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ManageTroubleTktsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ManageTroubleTktsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "MDNBasedGetNwIdRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.MDNBasedGetNwIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "MDNBasedGetNwIdResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.MDNBasedGetNwIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "MessageType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "MSISDNInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.MSISDNInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "MSISDNListType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.MSISDNInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "MSISDNInfoType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "msisdnInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "MSISDNsType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "MSISDNType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "MSISDN");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "MSISDNType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "NameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "NAMType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.NAMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "NewRoutesType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "NewRouteType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "newRoute");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "NewRouteType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "OfficeDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.OfficeDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "OperationType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.OperationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "OperatorType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "OrderIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "PathDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.PathInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "PathInfoType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "pathInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "PathInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.PathInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "PostpaidAcctDetListType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.PostpaidAcctDetType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "PostpaidAcctDetType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "postpaidAcctDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "PostpaidAcctDetType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.PostpaidAcctDetType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ProfileDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ProfileDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "PromoCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "publicityIdHLRcodeGetRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.PublicityIdHLRcodeGetRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "publicityIdHLRcodeGetResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.PublicityIdHLRcodeGetResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "RangeType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.RangeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ReActivateMSISDNRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ReActivateMSISDNRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ReActivateMSISDNResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ReActivateMSISDNResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ReasonType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "RegSimSwapRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.RegSimSwapRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "RegSimSwapResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.RegSimSwapResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "RequestIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "roamingServiceStatusUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.RoamingServiceStatusUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "roamingServiceStatusUpdateResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.RoamingServiceStatusUpdateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SerialNoType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ServiceIdType");
            cachedSerQNames.add(qName);
            cls = long.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ServiceNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "simActivateRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.SimActivateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "simActivateResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.SimActivateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SimDealerValidationRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.SimDealerValidationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SimDealerValidationResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.SimDealerValidationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMRegistrationRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.SIMRegistrationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMRegistrationResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.SIMRegistrationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMSerialNosType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMSerialNoType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMSerialNo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMSerialNoType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SimSwapCrdtRptUpdtRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.SimSwapCrdtRptUpdtRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SimSwapCrdtRptUpdtResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.SimSwapCrdtRptUpdtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMSwapRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.SIMSwapRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMSwapResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.SIMSwapResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "StatusType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "Str1Type");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "Str2000Type");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "Str2Type");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SubGroupChangePreInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.SubGroupChangePreInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SubGroupChangePreInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.SubGroupChangePreInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SubGroupChangeRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.SubGroupChangeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SubGroupChangeResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.SubGroupChangeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SubscriberInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.SubscriberInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SubscriberListType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.SubscriberInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SubscriberInfoType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "subscriberInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TeleVerificationRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.TeleVerificationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TeleVerificationResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.TeleVerificationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TenDigitsType");
            cachedSerQNames.add(qName);
            cls = long.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "tktHistoryListType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.TktHistoryTypeData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TktHistoryTypeData");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TktHistoryData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TktHistoryTypeData");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.TktHistoryTypeData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TktListType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.TrblTktsType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TrblTktsType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "tkts");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TktsPreInfoListType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.TktsPreInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TktsPreInfoType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "info");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TktsPreInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.TktsPreInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TktStatusListType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.TktStatusTypeData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TktStatusTypeData");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TktStatusTypeData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TktStatusTypeData");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.TktStatusTypeData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TrblTktsPreInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.TrblTktsPreInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TrblTktsPreInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.TrblTktsPreInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TrblTktsType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.TrblTktsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TTPCRFUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.TTPCRFUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TTPCRFUpdateResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.TTPCRFUpdateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ttsaUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.TtsaUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ttsaUpdateResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.TtsaUpdateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TwoDigitsType");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UpdateActDataRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.UpdateActDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UpdateActDataResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.UpdateActDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UpdateActStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.UpdateActStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UpdateActStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.UpdateActStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UpdateBillingTypeRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.UpdateBillingTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UpdateBillingTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.UpdateBillingTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UpdateCreditLimitRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.UpdateCreditLimitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UpdateCreditLimitResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.UpdateCreditLimitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UpdatePostpaidAcctDetRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.UpdatePostpaidAcctDetRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UpdatePostpaidAcctDetResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.UpdatePostpaidAcctDetResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "updateSubscriberCategoryRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.UpdateSubscriberCategoryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "updateSubscriberCategoryResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.UpdateSubscriberCategoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UpdateTroubleTktRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.UpdateTroubleTktRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UpdateTroubleTktResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.UpdateTroubleTktResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UserType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "validateCorpMSISDNVoucherRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ValidateCorpMSISDNVoucherRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "validateCorpMSISDNVoucherResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ValidateCorpMSISDNVoucherResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ValidateIDRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ValidateIDRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ValidateIDResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ValidateIDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ValidateMSISDNRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ValidateMSISDNRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ValidateMSISDNResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ValidateMSISDNResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "validateSimRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ValidateSimRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "validateSimResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ValidateSimResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ValidateUserAPIRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ValidateUserAPIRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ValidateUserAPIResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ValidateUserAPIResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ViewTroubleTktsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ViewTroubleTktsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ViewTroubleTktsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.AccountManagement_xsd.ViewTroubleTktsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ZipCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorMessageType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.xius.billing.AccountManagement_xsd.ManagePostPaidGrpResponse managePostPaidGrp(com.xius.billing.AccountManagement_xsd.ManagePostPaidGrpRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("managePostPaidGrp");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "managePostPaidGrp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.ManagePostPaidGrpResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.ManagePostPaidGrpResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.ManagePostPaidGrpResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.GetTechnologyResponse getTechnology(com.xius.billing.AccountManagement_xsd.GetTechnologyRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getTechnology");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTechnology"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.GetTechnologyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.GetTechnologyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.GetTechnologyResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.GetForceRenDetailsResponse getForceRenDetails(com.xius.billing.AccountManagement_xsd.GetForceRenDetailsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getForceRenDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getForceRenDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.GetForceRenDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.GetForceRenDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.GetForceRenDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.ReActivateMSISDNResponse reActivateMSISDN(com.xius.billing.AccountManagement_xsd.ReActivateMSISDNRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("reActivateMSISDN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "reActivateMSISDN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.ReActivateMSISDNResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.ReActivateMSISDNResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.ReActivateMSISDNResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.GetCreditProfilesResponse getCreditProfiles(com.xius.billing.AccountManagement_xsd.GetCreditProfilesRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getCreditProfiles");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCreditProfiles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.GetCreditProfilesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.GetCreditProfilesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.GetCreditProfilesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.ValidateMSISDNResponse validateMSISDN(com.xius.billing.AccountManagement_xsd.ValidateMSISDNRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("validateMSISDN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "validateMSISDN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.ValidateMSISDNResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.ValidateMSISDNResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.ValidateMSISDNResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.UpdateBillingTypeResponse updateBillingType(com.xius.billing.AccountManagement_xsd.UpdateBillingTypeRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updateBillingType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateBillingType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.UpdateBillingTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.UpdateBillingTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.UpdateBillingTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.ViewTroubleTktsResponse viewTroubleTkts(com.xius.billing.AccountManagement_xsd.ViewTroubleTktsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("viewTroubleTkts");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "viewTroubleTkts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.ViewTroubleTktsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.ViewTroubleTktsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.ViewTroubleTktsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.ManageTroubleTktsResponse manageTroubleTkts(com.xius.billing.AccountManagement_xsd.ManageTroubleTktsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("manageTroubleTkts");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "manageTroubleTkts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.ManageTroubleTktsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.ManageTroubleTktsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.ManageTroubleTktsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.TrblTktsPreInfoResponse getTroubleTktsPreInfo(com.xius.billing.AccountManagement_xsd.TrblTktsPreInfoRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getTroubleTktsPreInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTroubleTktsPreInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.TrblTktsPreInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.TrblTktsPreInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.TrblTktsPreInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.ChangeMSISDNsResponse changeMSISDNs(com.xius.billing.AccountManagement_xsd.ChangeMSISDNsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("changeMSISDNs");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changeMSISDNs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.ChangeMSISDNsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.ChangeMSISDNsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.ChangeMSISDNsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.SIMRegistrationResponse simRegistration(com.xius.billing.AccountManagement_xsd.SIMRegistrationRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("simRegistration");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "simRegistration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.SIMRegistrationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.SIMRegistrationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.SIMRegistrationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.UpdateActDataResponse updateActData(com.xius.billing.AccountManagement_xsd.UpdateActDataRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updateActData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateActData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.UpdateActDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.UpdateActDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.UpdateActDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.UpdateActStatusResponse updateActStatus(com.xius.billing.AccountManagement_xsd.UpdateActStatusRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updateActStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateActStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.UpdateActStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.UpdateActStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.UpdateActStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.ChangeMSISDNResponse changeMSISDN(com.xius.billing.AccountManagement_xsd.ChangeMSISDNRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("changeMSISDN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changeMSISDN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.ChangeMSISDNResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.ChangeMSISDNResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.ChangeMSISDNResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.SIMSwapResponse swapSIM(com.xius.billing.AccountManagement_xsd.SIMSwapRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("swapSIM");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "swapSIM"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.SIMSwapResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.SIMSwapResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.SIMSwapResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.ChangeIMSIResponse changeIMSI(com.xius.billing.AccountManagement_xsd.ChangeIMSIRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("changeIMSI");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changeIMSI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.ChangeIMSIResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.ChangeIMSIResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.ChangeIMSIResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.ChangeIMSIPreInfoResponse changeIMSIPreInfo(com.xius.billing.AccountManagement_xsd.ChangeIMSIPreInfoRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("changeIMSIPreInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changeIMSIPreInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.ChangeIMSIPreInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.ChangeIMSIPreInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.ChangeIMSIPreInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.DeActivateAccountResponse deActivateAccount(com.xius.billing.AccountManagement_xsd.DeActivateAccountRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("deActivateAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deActivateAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.DeActivateAccountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.DeActivateAccountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.DeActivateAccountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.ChngMSISDNPreInfoResponse changeMSISDNPreInfo(com.xius.billing.AccountManagement_xsd.ChngMSISDNPreInfoRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("changeMSISDNPreInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changeMSISDNPreInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.ChngMSISDNPreInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.ChngMSISDNPreInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.ChngMSISDNPreInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.GetMSISDNInfoResponse getMSISDNInfo(com.xius.billing.AccountManagement_xsd.GetMSISDNInfoRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getMSISDNInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getMSISDNInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.GetMSISDNInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.GetMSISDNInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.GetMSISDNInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.SubGroupChangePreInfoResponse subGroupChangePreInfo(com.xius.billing.AccountManagement_xsd.SubGroupChangePreInfoRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("subGroupChangePreInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "subGroupChangePreInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.SubGroupChangePreInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.SubGroupChangePreInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.SubGroupChangePreInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.SubGroupChangeResponse subGroupChange(com.xius.billing.AccountManagement_xsd.SubGroupChangeRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("subGroupChange");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "subGroupChange"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.SubGroupChangeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.SubGroupChangeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.SubGroupChangeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.ManageAdditionalServicesResponse manageAdditionalServices(com.xius.billing.AccountManagement_xsd.ManageAdditionalServicesRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("manageAdditionalServices");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "manageAdditionalServices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.ManageAdditionalServicesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.ManageAdditionalServicesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.ManageAdditionalServicesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.GetAdditionalServicesResponse getAdditionalServices(com.xius.billing.AccountManagement_xsd.GetAdditionalServicesRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getAdditionalServices");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getAdditionalServices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.GetAdditionalServicesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.GetAdditionalServicesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.GetAdditionalServicesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.ConvertAccountTypeResponse convertAccountType(com.xius.billing.AccountManagement_xsd.ConvertAccountTypeRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("convertAccountType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "convertAccountType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.ConvertAccountTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.ConvertAccountTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.ConvertAccountTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.GetPostpaidAcctDetResponse getPostpaidAcctDet(com.xius.billing.AccountManagement_xsd.GetPostpaidAcctDetRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getPostpaidAcctDet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getPostpaidAcctDet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.GetPostpaidAcctDetResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.GetPostpaidAcctDetResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.GetPostpaidAcctDetResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.UpdateCreditLimitResponse updateCreditLimit(com.xius.billing.AccountManagement_xsd.UpdateCreditLimitRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updateCreditLimit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateCreditLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.UpdateCreditLimitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.UpdateCreditLimitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.UpdateCreditLimitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.ValidateUserAPIResponse validateUserAPI(com.xius.billing.AccountManagement_xsd.ValidateUserAPIRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("validateUserAPI");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "validateUserAPI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.ValidateUserAPIResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.ValidateUserAPIResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.ValidateUserAPIResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.GetAndBlockMSISDNResponse getAndBlockMSISDN(com.xius.billing.AccountManagement_xsd.GetAndBlockMSISDNRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getAndBlockMSISDN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getAndBlockMSISDN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.GetAndBlockMSISDNResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.GetAndBlockMSISDNResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.GetAndBlockMSISDNResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.ChangeSimMdnAuditResponse changeSimMdnAudit(com.xius.billing.AccountManagement_xsd.ChangeSimMdnAuditRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("changeSimMdnAudit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changeSimMdnAudit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.ChangeSimMdnAuditResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.ChangeSimMdnAuditResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.ChangeSimMdnAuditResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.SimDealerValidationResponse simDealerValidation(com.xius.billing.AccountManagement_xsd.SimDealerValidationRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("simDealerValidation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "simDealerValidation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.SimDealerValidationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.SimDealerValidationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.SimDealerValidationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.GetChargeInfoResponse getChargeInfo(com.xius.billing.AccountManagement_xsd.GetChargeInfoRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getChargeInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getChargeInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.GetChargeInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.GetChargeInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.GetChargeInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.SimSwapCrdtRptUpdtResponse simSwapCrdtRptUpdt(com.xius.billing.AccountManagement_xsd.SimSwapCrdtRptUpdtRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("simSwapCrdtRptUpdt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "simSwapCrdtRptUpdt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.SimSwapCrdtRptUpdtResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.SimSwapCrdtRptUpdtResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.SimSwapCrdtRptUpdtResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.ManageProvsngRetryResponse manageProvsngRetry(com.xius.billing.AccountManagement_xsd.ManageProvsngRetryRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("manageProvsngRetry");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "manageProvsngRetry"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.ManageProvsngRetryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.ManageProvsngRetryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.ManageProvsngRetryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.UpdatePostpaidAcctDetResponse updatePostpaidAcctDet(com.xius.billing.AccountManagement_xsd.UpdatePostpaidAcctDetRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updatePostpaidAcctDet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updatePostpaidAcctDet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.UpdatePostpaidAcctDetResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.UpdatePostpaidAcctDetResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.UpdatePostpaidAcctDetResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.GetLocationAssoMsisdnResponse getLocationAssoMsisdn(com.xius.billing.AccountManagement_xsd.GetLocationAssoMsisdnRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getLocationAssoMsisdn");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getLocationAssoMsisdn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.GetLocationAssoMsisdnResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.GetLocationAssoMsisdnResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.GetLocationAssoMsisdnResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.ActivateSubscriberResponse activateSubscriber(com.xius.billing.AccountManagement_xsd.ActivateSubscriberRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("activateSubscriber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "activateSubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.ActivateSubscriberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.ActivateSubscriberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.ActivateSubscriberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.ForceRenewalResponse forceRenewal(com.xius.billing.AccountManagement_xsd.ForceRenewalRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("forceRenewal");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "forceRenewal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.ForceRenewalResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.ForceRenewalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.ForceRenewalResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.HLRIntegrationResponse HLRIntegration(com.xius.billing.AccountManagement_xsd.HLRIntegrationRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("HLRIntegration");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "HLRIntegration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.HLRIntegrationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.HLRIntegrationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.HLRIntegrationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.HLRIntegrationUpdateResponse HLRIntegrationUpdate(com.xius.billing.AccountManagement_xsd.HLRIntegrationUpdateRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("HLRIntegrationUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "HLRIntegrationUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.HLRIntegrationUpdateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.HLRIntegrationUpdateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.HLRIntegrationUpdateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.MDNBasedGetNwIdResponse MDNbasedGetNwId(com.xius.billing.AccountManagement_xsd.MDNBasedGetNwIdRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("MDNbasedGetNwId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "MDNbasedGetNwId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.MDNBasedGetNwIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.MDNBasedGetNwIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.MDNBasedGetNwIdResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.RegSimSwapResponse regSimSwap(com.xius.billing.AccountManagement_xsd.RegSimSwapRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("regSimSwap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "regSimSwap"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.RegSimSwapResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.RegSimSwapResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.RegSimSwapResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.UpdateTroubleTktResponse updateTroubleTkt(com.xius.billing.AccountManagement_xsd.UpdateTroubleTktRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updateTroubleTkt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateTroubleTkt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.UpdateTroubleTktResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.UpdateTroubleTktResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.UpdateTroubleTktResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.UpdateSubscriberCategoryResponse updateSubscriberCategory(com.xius.billing.AccountManagement_xsd.UpdateSubscriberCategoryRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updateSubscriberCategory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateSubscriberCategory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.UpdateSubscriberCategoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.UpdateSubscriberCategoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.UpdateSubscriberCategoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.GetTroubleTktStatusResponse getTroubleTktStatus(com.xius.billing.AccountManagement_xsd.GetTroubleTktStatusRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getTroubleTktStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTroubleTktStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.GetTroubleTktStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.GetTroubleTktStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.GetTroubleTktStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.GetTroubleTktHistoryResponse getTroubleTktHistory(com.xius.billing.AccountManagement_xsd.GetTroubleTktHistoryRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getTroubleTktHistory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTroubleTktHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.GetTroubleTktHistoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.GetTroubleTktHistoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.GetTroubleTktHistoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.RoamingServiceStatusUpdateResponse roamingServiceStatusUpdate(com.xius.billing.AccountManagement_xsd.RoamingServiceStatusUpdateRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("roamingServiceStatusUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "roamingServiceStatusUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.RoamingServiceStatusUpdateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.RoamingServiceStatusUpdateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.RoamingServiceStatusUpdateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.GetAccountDatesResponse getAccountDates(com.xius.billing.AccountManagement_xsd.GetAccountDatesRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getAccountDates");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getAccountDates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.GetAccountDatesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.GetAccountDatesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.GetAccountDatesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.GetAccountAllDatesResponse getAccountAllDates(com.xius.billing.AccountManagement_xsd.GetAccountAllDatesRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getAccountAllDates");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getAccountAllDates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.GetAccountAllDatesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.GetAccountAllDatesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.GetAccountAllDatesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.GetcategoryIDResponse getcategoryID(com.xius.billing.AccountManagement_xsd.GetcategoryIDRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getcategoryID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getcategoryID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.GetcategoryIDResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.GetcategoryIDResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.GetcategoryIDResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.ManagePathInfoResponse managePathInfo(com.xius.billing.AccountManagement_xsd.ManagePathInfoRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("managePathInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "managePathInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.ManagePathInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.ManagePathInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.ManagePathInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.GetPathInfoResponse getPathInfo(com.xius.billing.AccountManagement_xsd.GetPathInfoRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getPathInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getPathInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.GetPathInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.GetPathInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.GetPathInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.ValidateIDResponse validateID(com.xius.billing.AccountManagement_xsd.ValidateIDRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("validateID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "validateID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.ValidateIDResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.ValidateIDResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.ValidateIDResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.TeleVerificationResponse teleVerification(com.xius.billing.AccountManagement_xsd.TeleVerificationRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("TeleVerification");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TeleVerification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.TeleVerificationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.TeleVerificationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.TeleVerificationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.ValidateCorpMSISDNVoucherResponse validateCorpMSISDNVoucher(com.xius.billing.AccountManagement_xsd.ValidateCorpMSISDNVoucherRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("validateCorpMSISDNVoucher");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "validateCorpMSISDNVoucher"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.ValidateCorpMSISDNVoucherResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.ValidateCorpMSISDNVoucherResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.ValidateCorpMSISDNVoucherResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.AccountVsBANMappingResponse accountVsBANMapping(com.xius.billing.AccountManagement_xsd.AccountVsBANMappingRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("accountVsBANMapping");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "accountVsBANMapping"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.AccountVsBANMappingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.AccountVsBANMappingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.AccountVsBANMappingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.PublicityIdHLRcodeGetResponse publicityIdHLRcodeGet(com.xius.billing.AccountManagement_xsd.PublicityIdHLRcodeGetRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("publicityIdHLRcodeGet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "publicityIdHLRcodeGet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.PublicityIdHLRcodeGetResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.PublicityIdHLRcodeGetResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.PublicityIdHLRcodeGetResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.TtsaUpdateResponse ttsaUpdate(com.xius.billing.AccountManagement_xsd.TtsaUpdateRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ttsaUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ttsaUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.TtsaUpdateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.TtsaUpdateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.TtsaUpdateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.BascDrvdIdHLRcodeGetResponse bascDrvdIdHLRcodeGet(com.xius.billing.AccountManagement_xsd.BascDrvdIdHLRcodeGetRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("bascDrvdIdHLRcodeGet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "bascDrvdIdHLRcodeGet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.BascDrvdIdHLRcodeGetResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.BascDrvdIdHLRcodeGetResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.BascDrvdIdHLRcodeGetResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.BascDrvdIdHLRUpdateResponse bascDrvdIdHLRUpdate(com.xius.billing.AccountManagement_xsd.BascDrvdIdHLRUpdateRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("bascDrvdIdHLRUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "bascDrvdIdHLRUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.BascDrvdIdHLRUpdateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.BascDrvdIdHLRUpdateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.BascDrvdIdHLRUpdateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.GetTTPCRFintimateDtlsResponse getTTPCRFintimateDtls(com.xius.billing.AccountManagement_xsd.GetTTPCRFintimateDtlsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getTTPCRFintimateDtls");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTTPCRFintimateDtls"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.GetTTPCRFintimateDtlsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.GetTTPCRFintimateDtlsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.GetTTPCRFintimateDtlsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.TTPCRFUpdateResponse TTPCRFUpdate(com.xius.billing.AccountManagement_xsd.TTPCRFUpdateRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("TTPCRFUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TTPCRFUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.TTPCRFUpdateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.TTPCRFUpdateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.TTPCRFUpdateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.CorpTpProdGetUpdateResponse corpTpProdGetUpdate(com.xius.billing.AccountManagement_xsd.CorpTpProdGetUpdateRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("corpTpProdGetUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "corpTpProdGetUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.CorpTpProdGetUpdateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.CorpTpProdGetUpdateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.CorpTpProdGetUpdateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.AccountProductIdMapResponse accountProductIdMap(com.xius.billing.AccountManagement_xsd.AccountProductIdMapRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("accountProductIdMap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "accountProductIdMap"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.AccountProductIdMapResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.AccountProductIdMapResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.AccountProductIdMapResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.ValidateSimResponse validateSim(com.xius.billing.AccountManagement_xsd.ValidateSimRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("validateSim");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "validateSim"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.ValidateSimResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.ValidateSimResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.ValidateSimResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.SimActivateResponse SIMActivate(com.xius.billing.AccountManagement_xsd.SimActivateRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SIMActivate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SIMActivate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.SimActivateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.SimActivateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.SimActivateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.GetFreeMsisdnResponse getFreeMsisdn(com.xius.billing.AccountManagement_xsd.GetFreeMsisdnRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getFreeMsisdn");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getFreeMsisdn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.GetFreeMsisdnResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.GetFreeMsisdnResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.GetFreeMsisdnResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.GetDtlsForRegistrationResponse getDtlsForRegistration(com.xius.billing.AccountManagement_xsd.GetDtlsForRegistrationRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getDtlsForRegistration");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDtlsForRegistration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.GetDtlsForRegistrationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.GetDtlsForRegistrationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.GetDtlsForRegistrationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.billing.AccountManagement_xsd.GetTripletDtlsForRegResponse getTripletDtlsForReg(com.xius.billing.AccountManagement_xsd.GetTripletDtlsForRegRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getTripletDtlsForReg");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTripletDtlsForReg"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.AccountManagement_xsd.GetTripletDtlsForRegResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.AccountManagement_xsd.GetTripletDtlsForRegResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.AccountManagement_xsd.GetTripletDtlsForRegResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
