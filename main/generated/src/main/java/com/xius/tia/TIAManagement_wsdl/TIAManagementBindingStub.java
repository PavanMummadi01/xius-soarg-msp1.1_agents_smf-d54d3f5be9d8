/**
 * TIAManagementBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TIAManagement_wsdl;

public class TIAManagementBindingStub extends org.apache.axis.client.Stub implements com.xius.tia.TIAManagement_wsdl.TIAManagementPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[20];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeSubMSISDN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "changeSubMSISDNRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "ChangeSubMSISDNRequest"), com.xius.tia.TIAManagement_xsd.ChangeSubMSISDNRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "ChangeSubMSISDNResponse"));
        oper.setReturnClass(com.xius.tia.TIAManagement_xsd.ChangeSubMSISDNResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "changeSubMSISDNResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("simSwap");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "simSwapRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "SIMSwapRequest"), com.xius.tia.TIAManagement_xsd.SIMSwapRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "SIMSwapResponse"));
        oper.setReturnClass(com.xius.tia.TIAManagement_xsd.SIMSwapResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "simSwapResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activateSubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "activateSubscriberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "ActivateSubscriberRequest"), com.xius.tia.TIAManagement_xsd.ActivateSubscriberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "ActivateSubscriberResponse"));
        oper.setReturnClass(com.xius.tia.TIAManagement_xsd.ActivateSubscriberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "activateSubscriberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deactivateSubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "deactivateSubscriberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "DeactivateSubscriberRequest"), com.xius.tia.TIAManagement_xsd.DeactivateSubscriberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "DeactivateSubscriberResponse"));
        oper.setReturnClass(com.xius.tia.TIAManagement_xsd.DeactivateSubscriberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "deactivateSubscriberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("suspendSubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "suspendSubscriberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "SuspendSubscriberRequest"), com.xius.tia.TIAManagement_xsd.SuspendSubscriberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "SuspendSubscriberResponse"));
        oper.setReturnClass(com.xius.tia.TIAManagement_xsd.SuspendSubscriberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "suspendSubscriberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateSubscription");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "createsubscriptionrequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "CreateSubscriptionRequest"), com.xius.tia.TIAManagement_xsd.CreateSubscriptionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "CreateSubscriptionResponse"));
        oper.setReturnClass(com.xius.tia.TIAManagement_xsd.CreateSubscriptionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "createsubscriptionresponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "createaccountrequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "CreateAccountRequest"), com.xius.tia.TIAManagement_xsd.CreateAccountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "CreateAccountResponse"));
        oper.setReturnClass(com.xius.tia.TIAManagement_xsd.CreateAccountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "createaccountresponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSubscriptionProfile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "getsubscriptionprofileRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "GetSubscriptionProfileRequest"), com.xius.tia.TIAManagement_xsd.GetSubscriptionProfileRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "GetSubscriptionProfileResponse"));
        oper.setReturnClass(com.xius.tia.TIAManagement_xsd.GetSubscriptionProfileResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "getsubscriptionprofileResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeTechnology");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "changeTechnologyRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "changeTechnologyRequest"), com.xius.tia.TIAManagement_xsd.ChangeTechnologyRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "changeTechnologyResponse"));
        oper.setReturnClass(com.xius.tia.TIAManagement_xsd.ChangeTechnologyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "changeTechnologyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Roaming");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "RoamingRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "RoamingRequest"), com.xius.tia.TIAManagement_xsd.RoamingRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "RoamingResponse"));
        oper.setReturnClass(com.xius.tia.TIAManagement_xsd.RoamingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "RoamingResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TTPCRFNotify");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "TTPCRFNotifyRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "TTPCRFNotifyRequest"), com.xius.tia.TIAManagement_xsd.TTPCRFNotifyRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "TTPCRFNotifyResponse"));
        oper.setReturnClass(com.xius.tia.TIAManagement_xsd.TTPCRFNotifyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "TTPCRFNotifyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PackageNotify");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "PackageNotifyRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "PackageNotifyRequest"), com.xius.tia.TIAManagement_xsd.PackageNotifyRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "PackageNotifyResponse"));
        oper.setReturnClass(com.xius.tia.TIAManagement_xsd.PackageNotifyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "PackageNotifyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DPIValidation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "DPIValidationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "dpiValidationRequest"), com.xius.tia.TIAManagement_xsd.DpiValidationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "dpiValidationResponse"));
        oper.setReturnClass(com.xius.tia.TIAManagement_xsd.DpiValidationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "DPIValidationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SIMActivation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "SIMActivationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "simActivationRequest"), com.xius.tia.TIAManagement_xsd.SimActivationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "simActivationResponse"));
        oper.setReturnClass(com.xius.tia.TIAManagement_xsd.SimActivationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "SIMActivationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("YFCreateInvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "YFCreateInvoiceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "YFCreateInvoiceRequest"), com.xius.tia.TIAManagement_xsd.YFCreateInvoiceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "YFCreateInvoiceResponse"));
        oper.setReturnClass(com.xius.tia.TIAManagement_xsd.YFCreateInvoiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "YFCreateInvoiceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("YFNotification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "YFNotificationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "YFNotificationRequest"), com.xius.tia.TIAManagement_xsd.YFNotificationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "YFNotificationResponse"));
        oper.setReturnClass(com.xius.tia.TIAManagement_xsd.YFNotificationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "YFNotificationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryHLR");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "queryHLRRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "queryHLRRequest"), com.xius.tia.TIAManagement_xsd.QueryHLRRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "queryHLRResponse"));
        oper.setReturnClass(com.xius.tia.TIAManagement_xsd.QueryHLRResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "queryHLRResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryTransactions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "queryTransactionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "queryTransactionsRequest"), com.xius.tia.TIAManagement_xsd.QueryTransactionsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "queryTransactionsResponse"));
        oper.setReturnClass(com.xius.tia.TIAManagement_xsd.QueryTransactionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "queryTransactionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("webhookNotification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "webhookNotificationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "webhookNotificationRequest"), com.xius.tia.TIAManagement_xsd.WebhookNotificationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "webhookNotificationResponse"));
        oper.setReturnClass(com.xius.tia.TIAManagement_xsd.WebhookNotificationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "webhookNotificationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("IMEIEnquiry");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "IMEIEnquiryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "IMEIEnquiryRequest"), com.xius.tia.TIAManagement_xsd.IMEIEnquiryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "IMEIEnquiryResponse"));
        oper.setReturnClass(com.xius.tia.TIAManagement_xsd.IMEIEnquiryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "IMEIEnquiryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[19] = oper;

    }

    public TIAManagementBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TIAManagementBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TIAManagementBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "ErrorCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "ErrorMessageType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "ActivateSubscriberRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.ActivateSubscriberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "ActivateSubscriberResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.ActivateSubscriberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "ChangeSubMSISDNRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.ChangeSubMSISDNRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "ChangeSubMSISDNResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.ChangeSubMSISDNResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "changeTechnologyRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.ChangeTechnologyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "changeTechnologyResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.ChangeTechnologyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "CommonData");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.CommonData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "CreateAccountRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.CreateAccountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "CreateAccountResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.CreateAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "CreateSubscriptionRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.CreateSubscriptionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "CreateSubscriptionResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.CreateSubscriptionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "DeactivateSubscriberRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.DeactivateSubscriberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "DeactivateSubscriberResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.DeactivateSubscriberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "dpiValidationRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.DpiValidationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "dpiValidationResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.DpiValidationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "GetSubscriptionProfileRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.GetSubscriptionProfileRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "GetSubscriptionProfileResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.GetSubscriptionProfileResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "IMEIEnquiryRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.IMEIEnquiryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "IMEIEnquiryResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.IMEIEnquiryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "IMEIHistoryType");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.IMEIHistoryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "IMSIType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "MNPflagType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "MSISDNType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "PackageNotifyRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.PackageNotifyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "PackageNotifyResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.PackageNotifyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "queryHLRRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.QueryHLRRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "queryHLRResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.QueryHLRResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "queryTransactionsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.QueryTransactionsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "queryTransactionsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.QueryTransactionsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "requestData");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.RequestData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "ResponseDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.ResponseDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "RoamingRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.RoamingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "RoamingResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.RoamingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "simActivationRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.SimActivationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "simActivationResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.SimActivationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "simDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.SimDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "SIMSwapRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.SIMSwapRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "SIMSwapResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.SIMSwapResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "subscriberRequestType");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.SubscriberRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "SubscriptionBilling");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.SubscriptionBilling.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "SubscriptionProfile");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.SubscriptionProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "SubscriptionRating");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.SubscriptionRating.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "SubscriptionStatus");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.SubscriptionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "SuspendSubscriberRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.SuspendSubscriberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "SuspendSubscriberResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.SuspendSubscriberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "TTPCRFNotifyRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.TTPCRFNotifyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "TTPCRFNotifyResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.TTPCRFNotifyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "webhookNotificationRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.WebhookNotificationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "webhookNotificationResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.WebhookNotificationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "YFCreateInvoiceRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.YFCreateInvoiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "YFCreateInvoiceResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.YFCreateInvoiceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "YFNotificationRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.YFNotificationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "YFNotificationResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TIAManagement_xsd.YFNotificationResponse.class;
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

    public com.xius.tia.TIAManagement_xsd.ChangeSubMSISDNResponse changeSubMSISDN(com.xius.tia.TIAManagement_xsd.ChangeSubMSISDNRequest changeSubMSISDNRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("changeSubMSISDN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changeSubMSISDN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {changeSubMSISDNRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TIAManagement_xsd.ChangeSubMSISDNResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TIAManagement_xsd.ChangeSubMSISDNResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TIAManagement_xsd.ChangeSubMSISDNResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.tia.TIAManagement_xsd.SIMSwapResponse simSwap(com.xius.tia.TIAManagement_xsd.SIMSwapRequest simSwapRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("simSwap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "simSwap"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {simSwapRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TIAManagement_xsd.SIMSwapResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TIAManagement_xsd.SIMSwapResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TIAManagement_xsd.SIMSwapResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.tia.TIAManagement_xsd.ActivateSubscriberResponse activateSubscriber(com.xius.tia.TIAManagement_xsd.ActivateSubscriberRequest activateSubscriberRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("activateSubscriber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "activateSubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {activateSubscriberRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TIAManagement_xsd.ActivateSubscriberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TIAManagement_xsd.ActivateSubscriberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TIAManagement_xsd.ActivateSubscriberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.tia.TIAManagement_xsd.DeactivateSubscriberResponse deactivateSubscriber(com.xius.tia.TIAManagement_xsd.DeactivateSubscriberRequest deactivateSubscriberRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("deactivateSubscriber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deactivateSubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deactivateSubscriberRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TIAManagement_xsd.DeactivateSubscriberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TIAManagement_xsd.DeactivateSubscriberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TIAManagement_xsd.DeactivateSubscriberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.tia.TIAManagement_xsd.SuspendSubscriberResponse suspendSubscriber(com.xius.tia.TIAManagement_xsd.SuspendSubscriberRequest suspendSubscriberRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("suspendSubscriber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "suspendSubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {suspendSubscriberRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TIAManagement_xsd.SuspendSubscriberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TIAManagement_xsd.SuspendSubscriberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TIAManagement_xsd.SuspendSubscriberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.tia.TIAManagement_xsd.CreateSubscriptionResponse createSubscription(com.xius.tia.TIAManagement_xsd.CreateSubscriptionRequest createSubscriptionRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CreateSubscription");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateSubscription"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createSubscriptionRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TIAManagement_xsd.CreateSubscriptionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TIAManagement_xsd.CreateSubscriptionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TIAManagement_xsd.CreateSubscriptionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.tia.TIAManagement_xsd.CreateAccountResponse createAccount(com.xius.tia.TIAManagement_xsd.CreateAccountRequest createAccountRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CreateAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createAccountRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TIAManagement_xsd.CreateAccountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TIAManagement_xsd.CreateAccountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TIAManagement_xsd.CreateAccountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.tia.TIAManagement_xsd.GetSubscriptionProfileResponse getSubscriptionProfile(com.xius.tia.TIAManagement_xsd.GetSubscriptionProfileRequest getSubscriptionProfileRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetSubscriptionProfile");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetSubscriptionProfile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getSubscriptionProfileRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TIAManagement_xsd.GetSubscriptionProfileResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TIAManagement_xsd.GetSubscriptionProfileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TIAManagement_xsd.GetSubscriptionProfileResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.tia.TIAManagement_xsd.ChangeTechnologyResponse changeTechnology(com.xius.tia.TIAManagement_xsd.ChangeTechnologyRequest changeTechnologyRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("changeTechnology");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changeTechnology"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {changeTechnologyRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TIAManagement_xsd.ChangeTechnologyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TIAManagement_xsd.ChangeTechnologyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TIAManagement_xsd.ChangeTechnologyResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.tia.TIAManagement_xsd.RoamingResponse roaming(com.xius.tia.TIAManagement_xsd.RoamingRequest roamingRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("Roaming");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Roaming"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {roamingRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TIAManagement_xsd.RoamingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TIAManagement_xsd.RoamingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TIAManagement_xsd.RoamingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.tia.TIAManagement_xsd.TTPCRFNotifyResponse TTPCRFNotify(com.xius.tia.TIAManagement_xsd.TTPCRFNotifyRequest TTPCRFNotifyRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("TTPCRFNotify");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TTPCRFNotify"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {TTPCRFNotifyRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TIAManagement_xsd.TTPCRFNotifyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TIAManagement_xsd.TTPCRFNotifyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TIAManagement_xsd.TTPCRFNotifyResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.tia.TIAManagement_xsd.PackageNotifyResponse packageNotify(com.xius.tia.TIAManagement_xsd.PackageNotifyRequest packageNotifyRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("PackageNotify");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "PackageNotify"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {packageNotifyRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TIAManagement_xsd.PackageNotifyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TIAManagement_xsd.PackageNotifyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TIAManagement_xsd.PackageNotifyResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.tia.TIAManagement_xsd.DpiValidationResponse DPIValidation(com.xius.tia.TIAManagement_xsd.DpiValidationRequest DPIValidationRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DPIValidation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DPIValidation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {DPIValidationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TIAManagement_xsd.DpiValidationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TIAManagement_xsd.DpiValidationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TIAManagement_xsd.DpiValidationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.tia.TIAManagement_xsd.SimActivationResponse SIMActivation(com.xius.tia.TIAManagement_xsd.SimActivationRequest SIMActivationRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SIMActivation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SIMActivation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {SIMActivationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TIAManagement_xsd.SimActivationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TIAManagement_xsd.SimActivationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TIAManagement_xsd.SimActivationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.tia.TIAManagement_xsd.YFCreateInvoiceResponse YFCreateInvoice(com.xius.tia.TIAManagement_xsd.YFCreateInvoiceRequest YFCreateInvoiceRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("YFCreateInvoice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "YFCreateInvoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {YFCreateInvoiceRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TIAManagement_xsd.YFCreateInvoiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TIAManagement_xsd.YFCreateInvoiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TIAManagement_xsd.YFCreateInvoiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.tia.TIAManagement_xsd.YFNotificationResponse YFNotification(com.xius.tia.TIAManagement_xsd.YFNotificationRequest YFNotificationRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("YFNotification");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "YFNotification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {YFNotificationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TIAManagement_xsd.YFNotificationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TIAManagement_xsd.YFNotificationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TIAManagement_xsd.YFNotificationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.tia.TIAManagement_xsd.QueryHLRResponse queryHLR(com.xius.tia.TIAManagement_xsd.QueryHLRRequest queryHLRRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryHLR");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryHLR"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryHLRRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TIAManagement_xsd.QueryHLRResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TIAManagement_xsd.QueryHLRResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TIAManagement_xsd.QueryHLRResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.tia.TIAManagement_xsd.QueryTransactionsResponse queryTransactions(com.xius.tia.TIAManagement_xsd.QueryTransactionsRequest queryTransactionsRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("QueryTransactions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryTransactions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryTransactionsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TIAManagement_xsd.QueryTransactionsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TIAManagement_xsd.QueryTransactionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TIAManagement_xsd.QueryTransactionsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.tia.TIAManagement_xsd.WebhookNotificationResponse webhookNotification(com.xius.tia.TIAManagement_xsd.WebhookNotificationRequest webhookNotificationRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("webhookNotification");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "webhookNotification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {webhookNotificationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TIAManagement_xsd.WebhookNotificationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TIAManagement_xsd.WebhookNotificationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TIAManagement_xsd.WebhookNotificationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.tia.TIAManagement_xsd.IMEIEnquiryResponse IMEIEnquiry(com.xius.tia.TIAManagement_xsd.IMEIEnquiryRequest IMEIEnquiryRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("IMEIEnquiry");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "IMEIEnquiry"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {IMEIEnquiryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TIAManagement_xsd.IMEIEnquiryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TIAManagement_xsd.IMEIEnquiryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TIAManagement_xsd.IMEIEnquiryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
