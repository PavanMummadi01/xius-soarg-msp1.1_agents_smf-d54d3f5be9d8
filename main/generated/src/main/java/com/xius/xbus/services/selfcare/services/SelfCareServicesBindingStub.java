/**
 * SelfCareServicesBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.services.selfcare.services;

public class SelfCareServicesBindingStub extends org.apache.axis.client.Stub implements com.xius.xbus.services.selfcare.services.SelfCareServicesPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[21];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("loginAuthenticate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "loginAuthenticateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">loginAuthenticateRequest"), com.xius.xbus.messages.selfcare.services.LoginAuthenticateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">loginAuthenticateResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.services.LoginAuthenticateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "loginAuthenticateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("voucherTopUp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "voucherTopUpRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">voucherTopUpRequest"), com.xius.xbus.messages.selfcare.services.VoucherTopUpRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">voucherTopUpResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.services.VoucherTopUpResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "voucherTopUpResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("transferBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "transferBalanceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">transferBalanceRequest"), com.xius.xbus.messages.selfcare.services.TransferBalanceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">transferBalanceResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.services.TransferBalanceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "transferBalanceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changePassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "changePasswordRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">changePasswordRequest"), com.xius.xbus.messages.selfcare.services.ChangePasswordRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">changePasswordResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.services.ChangePasswordResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "changePasswordResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateAccountDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "updateAccountDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">updateAccountDetailsRequest"), com.xius.xbus.messages.selfcare.services.UpdateAccountDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">updateAccountDetailsResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.services.UpdateAccountDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "updateAccountDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "getServicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getServicesRequest"), com.xius.xbus.messages.selfcare.services.GetServicesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getServicesResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.services.GetServicesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "getServicesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("forgotPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "forgotPasswordRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">forgotPasswordRequest"), com.xius.xbus.messages.selfcare.services.ForgotPasswordRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">forgotPasswordResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.services.ForgotPasswordResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "forgotPasswordResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("forgotUserName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "forgotUserNameRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">forgotUserNameRequest"), com.xius.xbus.messages.selfcare.services.ForgotUserNameRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">forgotUserNameResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.services.ForgotUserNameResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "forgotUserNameResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registerAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "registerAccountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">registerAccountRequest"), com.xius.xbus.messages.selfcare.services.RegisterAccountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">registerAccountResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.services.RegisterAccountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "registerAccountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDeviceDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "getDeviceDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getDeviceDetailsRequest"), com.xius.xbus.messages.selfcare.services.GetDeviceDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getDeviceDetailsResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.services.GetDeviceDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "getDeviceDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDataPlans");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "getDataPlansRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getDataPlansRequest"), com.xius.xbus.messages.selfcare.services.GetDataPlansRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getDataPlansResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.services.GetDataPlansResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "getDataPlansResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manageMultipleDataPlans");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "manageMultipleDataPlansRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">manageMultipleDataPlansRequest"), com.xius.xbus.messages.selfcare.services.ManageMultipleDataPlansRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">manageMultipleDataPlansResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.services.ManageMultipleDataPlansResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "manageMultipleDataPlansResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateServices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "updateServicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">updateServicesRequest"), com.xius.xbus.messages.selfcare.services.UpdateServicesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">updateServicesResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.services.UpdateServicesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "updateServicesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "changeDeviceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">changeDeviceRequest"), com.xius.xbus.messages.selfcare.services.ChangeDeviceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">changeDeviceResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.services.ChangeDeviceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "changeDeviceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDesiredMSISDNs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "getDesiredMSISDNsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getDesiredMSISDNsRequest"), com.xius.xbus.messages.selfcare.services.GetDesiredMSISDNsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getDesiredMSISDNsResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.services.GetDesiredMSISDNsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "getDesiredMSISDNsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAssociatedMSISDNs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "getAssociatedMSISDNsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getAssociatedMSISDNsRequest"), com.xius.xbus.messages.selfcare.services.GetAssociatedMSISDNsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getAssociatedMSISDNsResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.services.GetAssociatedMSISDNsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "getAssociatedMSISDNsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "getAccountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getAccountRequest"), com.xius.xbus.messages.selfcare.services.GetAccountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getAccountResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.services.GetAccountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "getAccountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLanguage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "getLanguageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getLanguageRequest"), com.xius.xbus.messages.selfcare.services.GetLanguageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getLanguageResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.services.GetLanguageResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "getLanguageResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLanguage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "setLanguageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">setLanguageRequest"), com.xius.xbus.messages.selfcare.services.SetLanguageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">setLanguageResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.services.SetLanguageResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "setLanguageResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updatePaymentStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "updatePaymentStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">updatePaymentStatusRequest"), com.xius.xbus.messages.selfcare.services.UpdatePaymentStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">updatePaymentStatusResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.services.UpdatePaymentStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "updatePaymentStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("walletPayment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "walletPaymentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">walletPaymentRequest"), com.xius.xbus.messages.selfcare.services.WalletPaymentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">walletPaymentResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.services.WalletPaymentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "walletPaymentResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[20] = oper;

    }

    public SelfCareServicesBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SelfCareServicesBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SelfCareServicesBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.errordetails.ErrorDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorMessageType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountIdType");
            cachedSerQNames.add(qName);
            cls = long.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountRetrievalIdType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.AccountRetrievalIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountRetrievalType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.AccountRetrievalType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.AccountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "BillingAccountIdKey");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.BillingAccountIdKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "BillingAccountType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.BillingAccountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "CarrierIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "DeviceIdKey");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.DeviceIdKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ErrorCategory");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.ErrorCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ErrorData");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.ErrorData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "IdValueType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ImsiType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "MessageIDType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "MsisdnType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "PersonalIdentityType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.PersonalIdentityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "PostPaidDetails");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.PostPaidDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "RegistrationType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.RegistrationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "SecurityId");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.SecurityId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "SelfcareAccountStatusType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.SelfcareAccountStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ServiceContext");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.ServiceContext.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "SeverityCode");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.SeverityCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "SimType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "StatusCode");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.StatusCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "SubscriberIdKeyType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.SubscriberIdKeyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "UserAccountNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "UserAccountPasswordType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "UserType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.UserType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "WSRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.WSRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "WSResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.WSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ZipCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">>transferBalanceRequest>password");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">>updateServicesResponse>invalidServices");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.UpdateServicesResponseInvalidServices.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">>updateServicesResponse>subscribedServices");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.UpdateServicesResponseSubscribedServices.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">>updateServicesResponse>unSubscribedServices");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.UpdateServicesResponseUnSubscribedServices.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">>voucherTopUpRequest>IVR");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">changeDeviceRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.ChangeDeviceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">changeDeviceResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.ChangeDeviceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">changePasswordRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.ChangePasswordRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">changePasswordResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.ChangePasswordResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">forgotPasswordRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.ForgotPasswordRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">forgotPasswordResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.ForgotPasswordResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">forgotUserNameRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.ForgotUserNameRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">forgotUserNameResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.ForgotUserNameResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getAccountRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.GetAccountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getAccountResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.GetAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getAssociatedMSISDNsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.GetAssociatedMSISDNsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getAssociatedMSISDNsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.GetAssociatedMSISDNsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getDataPlansRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.GetDataPlansRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getDataPlansResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.GetDataPlansResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getDesiredMSISDNsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.GetDesiredMSISDNsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getDesiredMSISDNsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.GetDesiredMSISDNsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getDeviceDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.GetDeviceDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getDeviceDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.GetDeviceDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getLanguageRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.GetLanguageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getLanguageResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.GetLanguageResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getServicesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.GetServicesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getServicesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.GetServicesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">loginAuthenticateRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.LoginAuthenticateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">loginAuthenticateResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.LoginAuthenticateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">manageMultipleDataPlansRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.ManageMultipleDataPlansRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">manageMultipleDataPlansResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.ManageMultipleDataPlansResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">registerAccountRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.RegisterAccountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">registerAccountResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.RegisterAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">setLanguageRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.SetLanguageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">setLanguageResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.SetLanguageResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">transferBalanceRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.TransferBalanceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">transferBalanceResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.TransferBalanceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">updateAccountDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.UpdateAccountDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">updateAccountDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.UpdateAccountDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">updatePaymentStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.UpdatePaymentStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">updatePaymentStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.UpdatePaymentStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">updateServicesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.UpdateServicesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">updateServicesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.UpdateServicesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">voucherTopUpRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.VoucherTopUpRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">voucherTopUpResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.VoucherTopUpResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">walletPaymentRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.WalletPaymentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">walletPaymentResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.WalletPaymentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "AssociatedMSISDN");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.AssociatedMSISDN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "AssociatedMSISDNList");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.AssociatedMSISDN[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "AssociatedMSISDN");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "AssociatedMSISDN");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "BillingAddressData");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.BillingAddressData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "DataPlanDetailType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.DataPlanDetailType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "DataPlanInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.DataPlanDetailType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "DataPlanDetailType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "dataPlan");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "DataPlanTinyInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.DataPlanTinyInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "DataPlanType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.DataPlanType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "DeviceType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.DeviceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "IMSIDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.IMSIDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "MSISDNDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.MSISDNDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "PersonalData");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.PersonalData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "PlanDataInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.PlanDataType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "PlanDataType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "dataPlanData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "PlanDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.PlanDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "PublicityIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "Service");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.Service.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "ServiceList");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.Service[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "Service");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "serviceList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "servicePlanType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.SubscribeServiceSuccessType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "SubscribeServiceSuccessType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "availableServicePlans");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "SIMDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.SIMDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "SubscriberDetailsInfo");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.SubscriberDetailsInfo.class;
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
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "SubscribeServiceSuccessType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.SubscribeServiceSuccessType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "SubUnSubType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.SubUnSubType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "UserDefinedInfo");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.UserDefinedInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "UserIdentificationData");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.services.UserIdentificationData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

    public com.xius.xbus.messages.selfcare.services.LoginAuthenticateResponse loginAuthenticate(com.xius.xbus.messages.selfcare.services.LoginAuthenticateRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("loginAuthenticate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "loginAuthenticate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.services.LoginAuthenticateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.services.LoginAuthenticateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.services.LoginAuthenticateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.selfcare.services.VoucherTopUpResponse voucherTopUp(com.xius.xbus.messages.selfcare.services.VoucherTopUpRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("voucherTopUp");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "voucherTopUp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.services.VoucherTopUpResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.services.VoucherTopUpResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.services.VoucherTopUpResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.selfcare.services.TransferBalanceResponse transferBalance(com.xius.xbus.messages.selfcare.services.TransferBalanceRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("transferBalance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "transferBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.services.TransferBalanceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.services.TransferBalanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.services.TransferBalanceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.selfcare.services.ChangePasswordResponse changePassword(com.xius.xbus.messages.selfcare.services.ChangePasswordRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("changePassword");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changePassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.services.ChangePasswordResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.services.ChangePasswordResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.services.ChangePasswordResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.selfcare.services.UpdateAccountDetailsResponse updateAccountDetails(com.xius.xbus.messages.selfcare.services.UpdateAccountDetailsRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updateAccountDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateAccountDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.services.UpdateAccountDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.services.UpdateAccountDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.services.UpdateAccountDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.selfcare.services.GetServicesResponse getServices(com.xius.xbus.messages.selfcare.services.GetServicesRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getServices");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getServices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.services.GetServicesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.services.GetServicesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.services.GetServicesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.selfcare.services.ForgotPasswordResponse forgotPassword(com.xius.xbus.messages.selfcare.services.ForgotPasswordRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("forgotPassword");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "forgotPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.services.ForgotPasswordResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.services.ForgotPasswordResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.services.ForgotPasswordResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.selfcare.services.ForgotUserNameResponse forgotUserName(com.xius.xbus.messages.selfcare.services.ForgotUserNameRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("forgotUserName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "forgotUserName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.services.ForgotUserNameResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.services.ForgotUserNameResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.services.ForgotUserNameResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.selfcare.services.RegisterAccountResponse registerAccount(com.xius.xbus.messages.selfcare.services.RegisterAccountRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("registerAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "registerAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.services.RegisterAccountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.services.RegisterAccountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.services.RegisterAccountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.selfcare.services.GetDeviceDetailsResponse getDeviceDetails(com.xius.xbus.messages.selfcare.services.GetDeviceDetailsRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getDeviceDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDeviceDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.services.GetDeviceDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.services.GetDeviceDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.services.GetDeviceDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.selfcare.services.GetDataPlansResponse getDataPlans(com.xius.xbus.messages.selfcare.services.GetDataPlansRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getDataPlans");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDataPlans"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.services.GetDataPlansResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.services.GetDataPlansResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.services.GetDataPlansResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.selfcare.services.ManageMultipleDataPlansResponse manageMultipleDataPlans(com.xius.xbus.messages.selfcare.services.ManageMultipleDataPlansRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("manageMultipleDataPlans");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "manageMultipleDataPlans"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.services.ManageMultipleDataPlansResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.services.ManageMultipleDataPlansResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.services.ManageMultipleDataPlansResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.selfcare.services.UpdateServicesResponse updateServices(com.xius.xbus.messages.selfcare.services.UpdateServicesRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updateServices");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateServices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.services.UpdateServicesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.services.UpdateServicesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.services.UpdateServicesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.selfcare.services.ChangeDeviceResponse changeDevice(com.xius.xbus.messages.selfcare.services.ChangeDeviceRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("changeDevice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changeDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.services.ChangeDeviceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.services.ChangeDeviceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.services.ChangeDeviceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.selfcare.services.GetDesiredMSISDNsResponse getDesiredMSISDNs(com.xius.xbus.messages.selfcare.services.GetDesiredMSISDNsRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getDesiredMSISDNs");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDesiredMSISDNs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.services.GetDesiredMSISDNsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.services.GetDesiredMSISDNsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.services.GetDesiredMSISDNsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.selfcare.services.GetAssociatedMSISDNsResponse getAssociatedMSISDNs(com.xius.xbus.messages.selfcare.services.GetAssociatedMSISDNsRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getAssociatedMSISDNs");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getAssociatedMSISDNs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.services.GetAssociatedMSISDNsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.services.GetAssociatedMSISDNsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.services.GetAssociatedMSISDNsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.selfcare.services.GetAccountResponse getAccount(com.xius.xbus.messages.selfcare.services.GetAccountRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.services.GetAccountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.services.GetAccountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.services.GetAccountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.selfcare.services.GetLanguageResponse getLanguage(com.xius.xbus.messages.selfcare.services.GetLanguageRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getLanguage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getLanguage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.services.GetLanguageResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.services.GetLanguageResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.services.GetLanguageResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.selfcare.services.SetLanguageResponse setLanguage(com.xius.xbus.messages.selfcare.services.SetLanguageRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("setLanguage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "setLanguage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.services.SetLanguageResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.services.SetLanguageResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.services.SetLanguageResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.selfcare.services.UpdatePaymentStatusResponse updatePaymentStatus(com.xius.xbus.messages.selfcare.services.UpdatePaymentStatusRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updatePaymentStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updatePaymentStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.services.UpdatePaymentStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.services.UpdatePaymentStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.services.UpdatePaymentStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.selfcare.services.WalletPaymentResponse walletPayment(com.xius.xbus.messages.selfcare.services.WalletPaymentRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("walletPayment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "walletPayment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.services.WalletPaymentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.services.WalletPaymentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.services.WalletPaymentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
