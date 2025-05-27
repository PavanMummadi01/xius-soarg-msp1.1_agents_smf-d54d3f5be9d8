/**
 * TMobileBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TMobile_wsdl;

public class TMobileBindingStub extends org.apache.axis.client.Stub implements com.xius.tia.TMobile_wsdl.TMobilePortType {
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
        oper.setName("activate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "activateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "activateRequest"), com.xius.tia.TMobile_xsd.ActivateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "activateResponse"));
        oper.setReturnClass(com.xius.tia.TMobile_xsd.ActivateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "activateResponse"));
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
        oper.setName("reactivate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "reactivateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "ReactivateRequest"), com.xius.tia.TMobile_xsd.ReactivateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "ReactivateResponse"));
        oper.setReturnClass(com.xius.tia.TMobile_xsd.ReactivateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "reactivateResponse"));
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
        oper.setName("suspend");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "suspendRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "suspendRequest"), com.xius.tia.TMobile_xsd.SuspendRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "suspendResponse"));
        oper.setReturnClass(com.xius.tia.TMobile_xsd.SuspendResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "suspendResponse"));
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
        oper.setName("restoreSubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "restoreSubscriberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "RestoreSubscriberRequest"), com.xius.tia.TMobile_xsd.RestoreSubscriberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "RestoreSubscriberResponse"));
        oper.setReturnClass(com.xius.tia.TMobile_xsd.RestoreSubscriberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "restoreSubscriberResponse"));
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
        oper.setName("deactivate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "deactivateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "DeactivateRequest"), com.xius.tia.TMobile_xsd.DeactivateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "DeactivateResponse"));
        oper.setReturnClass(com.xius.tia.TMobile_xsd.DeactivateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "deactivateResponse"));
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
        oper.setName("addProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "addProductRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "AddProductRequest"), com.xius.tia.TMobile_xsd.AddProductRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "AddProductResponse"));
        oper.setReturnClass(com.xius.tia.TMobile_xsd.AddProductResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "addProductResponse"));
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
        oper.setName("replaceProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "replaceProductRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "ReplaceProductRequest"), com.xius.tia.TMobile_xsd.ReplaceProductRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "ReplaceProductResponse"));
        oper.setReturnClass(com.xius.tia.TMobile_xsd.ReplaceProductResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "replaceProductResponse"));
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
        oper.setName("removeProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "removeProductRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "RemoveProductRequest"), com.xius.tia.TMobile_xsd.RemoveProductRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "RemoveProductResponse"));
        oper.setReturnClass(com.xius.tia.TMobile_xsd.RemoveProductResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "removeProductResponse"));
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
        oper.setName("queryNetwork");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "queryNetworkRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "QueryNetworkRequest"), com.xius.tia.TMobile_xsd.QueryNetworkRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "QueryNetworkResponse"));
        oper.setReturnClass(com.xius.tia.TMobile_xsd.QueryNetworkResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "queryNetworkResponse"));
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
        oper.setName("subscriberInquiry");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "subscriberInquiryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "SubscriberInquiryRequest"), com.xius.tia.TMobile_xsd.SubscriberInquiryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "SubscriberInquiryResponse"));
        oper.setReturnClass(com.xius.tia.TMobile_xsd.SubscriberInquiryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "subscriberInquiryResponse"));
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
        oper.setName("cancelDeviceLoc");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "cancelDeviceLocRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "CancelDeviceLocRequest"), com.xius.tia.TMobile_xsd.CancelDeviceLocRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "CancelDeviceLocResponse"));
        oper.setReturnClass(com.xius.tia.TMobile_xsd.CancelDeviceLocResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "cancelDeviceLocResponse"));
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
        oper.setName("queryTrancStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "queryTrancStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "QueryTrancStatusRequest"), com.xius.tia.TMobile_xsd.QueryTrancStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "QueryTrancStatusResponse"));
        oper.setReturnClass(com.xius.tia.TMobile_xsd.QueryTrancStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "queryTrancStatusResponse"));
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
        oper.setName("changeSIM");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "changeSIMRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "ChangeSIMRequest"), com.xius.tia.TMobile_xsd.ChangeSIMRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "ChangeSIMResponse"));
        oper.setReturnClass(com.xius.tia.TMobile_xsd.ChangeSIMResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "changeSIMResponse"));
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
        oper.setName("changeMSISDN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "changeMSISDNRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "ChangeMSISDNRequest"), com.xius.tia.TMobile_xsd.ChangeMSISDNRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "ChangeMSISDNResponse"));
        oper.setReturnClass(com.xius.tia.TMobile_xsd.ChangeMSISDNResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "changeMSISDNResponse"));
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
        oper.setName("updateWPS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "updateWPSRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "UpdateWPSRequest"), com.xius.tia.TMobile_xsd.UpdateWPSRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "UpdateWPSResponse"));
        oper.setReturnClass(com.xius.tia.TMobile_xsd.UpdateWPSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "updateWPSResponse"));
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
        oper.setName("manageIMEIBlackList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "manageIMEIBlackListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "ManageIMEIBlackListRequest"), com.xius.tia.TMobile_xsd.ManageIMEIBlackListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "ManageIMEIBlackListResponse"));
        oper.setReturnClass(com.xius.tia.TMobile_xsd.ManageIMEIBlackListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "manageIMEIBlackListResponse"));
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
        oper.setName("queryIMEI");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "queryIMEIRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "QueryIMEIRequest"), com.xius.tia.TMobile_xsd.QueryIMEIRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "QueryIMEIResponse"));
        oper.setReturnClass(com.xius.tia.TMobile_xsd.QueryIMEIResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "queryIMEIResponse"));
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
        oper.setName("sendOTAMSISDN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "sendOTAMSISDNRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "SendOTAMSISDNRequest"), com.xius.tia.TMobile_xsd.SendOTAMSISDNRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "SendOTAMSISDNResponse"));
        oper.setReturnClass(com.xius.tia.TMobile_xsd.SendOTAMSISDNResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "sendOTAMSISDNResponse"));
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
        oper.setName("HLRBlockSIM");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "HLRBlockSIMRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "HLRBlockSIMRequest"), com.xius.tia.TMobile_xsd.HLRBlockSIMRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "HLRBlockSIMResponse"));
        oper.setReturnClass(com.xius.tia.TMobile_xsd.HLRBlockSIMResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "HLRBlockSIMResponse"));
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
        oper.setName("querySubscriberUsage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "querySubscriberUsageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "QuerySubscriberUsageRequest"), com.xius.tia.TMobile_xsd.QuerySubscriberUsageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "QuerySubscriberUsageResponse"));
        oper.setReturnClass(com.xius.tia.TMobile_xsd.QuerySubscriberUsageResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "querySubscriberUsageResponse"));
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

    public TMobileBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TMobileBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TMobileBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "activateRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.ActivateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "activateResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.ActivateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "AddProductRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.AddProductRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "AddProductResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.AddProductResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "baseProductType");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.ProductType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "productType");
            qName2 = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "product");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "CancelDeviceLocRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.CancelDeviceLocRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "CancelDeviceLocResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.CancelDeviceLocResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "ChangeMSISDNRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.ChangeMSISDNRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "ChangeMSISDNResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.ChangeMSISDNResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "ChangeSIMRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.ChangeSIMRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "ChangeSIMResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.ChangeSIMResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "DeactivateRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.DeactivateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "DeactivateResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.DeactivateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "HLRBlockSIMRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.HLRBlockSIMRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "HLRBlockSIMResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.HLRBlockSIMResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "IMEIInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.IMEIInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "limitType");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.LimitType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "ManageIMEIBlackListRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.ManageIMEIBlackListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "ManageIMEIBlackListResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.ManageIMEIBlackListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "MSISDNType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "NonEmptyString");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "productType");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.ProductType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "QueryIMEIRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.QueryIMEIRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "QueryIMEIResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.QueryIMEIResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "QueryNetworkRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.QueryNetworkRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "QueryNetworkResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.QueryNetworkResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "QuerySubscriberUsageRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.QuerySubscriberUsageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "QuerySubscriberUsageResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.QuerySubscriberUsageResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "QueryTrancStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.QueryTrancStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "QueryTrancStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.QueryTrancStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "ReactivateRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.ReactivateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "ReactivateResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.ReactivateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "RemoveProductRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.RemoveProductRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "RemoveProductResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.RemoveProductResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "renewalInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.RenewalInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "ReplaceProductRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.ReplaceProductRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "ReplaceProductResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.ReplaceProductResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "RestoreSubscriberRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.RestoreSubscriberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "RestoreSubscriberResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.RestoreSubscriberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "SendOTAMSISDNRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.SendOTAMSISDNRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "SendOTAMSISDNResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.SendOTAMSISDNResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "SubscriberInquiryRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.SubscriberInquiryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "SubscriberInquiryResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.SubscriberInquiryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "suspendRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.SuspendRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "suspendResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.SuspendResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "thresholdInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.ThresholdInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "UpdateWPSRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.UpdateWPSRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "UpdateWPSResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.UpdateWPSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "usageType");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TMobile_xsd.UsageType.class;
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

    public com.xius.tia.TMobile_xsd.ActivateResponse activate(com.xius.tia.TMobile_xsd.ActivateRequest activateRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("activate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "activate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {activateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TMobile_xsd.ActivateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TMobile_xsd.ActivateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TMobile_xsd.ActivateResponse.class);
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

    public com.xius.tia.TMobile_xsd.ReactivateResponse reactivate(com.xius.tia.TMobile_xsd.ReactivateRequest reactivateRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("reactivate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "reactivate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reactivateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TMobile_xsd.ReactivateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TMobile_xsd.ReactivateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TMobile_xsd.ReactivateResponse.class);
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

    public com.xius.tia.TMobile_xsd.SuspendResponse suspend(com.xius.tia.TMobile_xsd.SuspendRequest suspendRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("suspend");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "suspend"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {suspendRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TMobile_xsd.SuspendResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TMobile_xsd.SuspendResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TMobile_xsd.SuspendResponse.class);
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

    public com.xius.tia.TMobile_xsd.RestoreSubscriberResponse restoreSubscriber(com.xius.tia.TMobile_xsd.RestoreSubscriberRequest restoreSubscriberRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("restoreSubscriber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "restoreSubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {restoreSubscriberRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TMobile_xsd.RestoreSubscriberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TMobile_xsd.RestoreSubscriberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TMobile_xsd.RestoreSubscriberResponse.class);
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

    public com.xius.tia.TMobile_xsd.DeactivateResponse deactivate(com.xius.tia.TMobile_xsd.DeactivateRequest deactivateRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("deactivate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deactivate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deactivateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TMobile_xsd.DeactivateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TMobile_xsd.DeactivateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TMobile_xsd.DeactivateResponse.class);
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

    public com.xius.tia.TMobile_xsd.AddProductResponse addProduct(com.xius.tia.TMobile_xsd.AddProductRequest addProductRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("addProduct");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "addProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {addProductRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TMobile_xsd.AddProductResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TMobile_xsd.AddProductResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TMobile_xsd.AddProductResponse.class);
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

    public com.xius.tia.TMobile_xsd.ReplaceProductResponse replaceProduct(com.xius.tia.TMobile_xsd.ReplaceProductRequest replaceProductRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("replaceProduct");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "replaceProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {replaceProductRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TMobile_xsd.ReplaceProductResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TMobile_xsd.ReplaceProductResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TMobile_xsd.ReplaceProductResponse.class);
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

    public com.xius.tia.TMobile_xsd.RemoveProductResponse removeProduct(com.xius.tia.TMobile_xsd.RemoveProductRequest removeProductRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("removeProduct");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "removeProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {removeProductRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TMobile_xsd.RemoveProductResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TMobile_xsd.RemoveProductResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TMobile_xsd.RemoveProductResponse.class);
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

    public com.xius.tia.TMobile_xsd.QueryNetworkResponse queryNetwork(com.xius.tia.TMobile_xsd.QueryNetworkRequest queryNetworkRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("queryNetwork");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "queryNetwork"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryNetworkRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TMobile_xsd.QueryNetworkResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TMobile_xsd.QueryNetworkResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TMobile_xsd.QueryNetworkResponse.class);
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

    public com.xius.tia.TMobile_xsd.SubscriberInquiryResponse subscriberInquiry(com.xius.tia.TMobile_xsd.SubscriberInquiryRequest subscriberInquiryRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("subscriberInquiry");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "subscriberInquiry"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {subscriberInquiryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TMobile_xsd.SubscriberInquiryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TMobile_xsd.SubscriberInquiryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TMobile_xsd.SubscriberInquiryResponse.class);
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

    public com.xius.tia.TMobile_xsd.CancelDeviceLocResponse cancelDeviceLoc(com.xius.tia.TMobile_xsd.CancelDeviceLocRequest cancelDeviceLocRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("cancelDeviceLoc");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cancelDeviceLoc"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cancelDeviceLocRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TMobile_xsd.CancelDeviceLocResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TMobile_xsd.CancelDeviceLocResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TMobile_xsd.CancelDeviceLocResponse.class);
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

    public com.xius.tia.TMobile_xsd.QueryTrancStatusResponse queryTrancStatus(com.xius.tia.TMobile_xsd.QueryTrancStatusRequest queryTrancStatusRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("queryTrancStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "queryTrancStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryTrancStatusRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TMobile_xsd.QueryTrancStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TMobile_xsd.QueryTrancStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TMobile_xsd.QueryTrancStatusResponse.class);
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

    public com.xius.tia.TMobile_xsd.ChangeSIMResponse changeSIM(com.xius.tia.TMobile_xsd.ChangeSIMRequest changeSIMRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("changeSIM");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changeSIM"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {changeSIMRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TMobile_xsd.ChangeSIMResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TMobile_xsd.ChangeSIMResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TMobile_xsd.ChangeSIMResponse.class);
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

    public com.xius.tia.TMobile_xsd.ChangeMSISDNResponse changeMSISDN(com.xius.tia.TMobile_xsd.ChangeMSISDNRequest changeMSISDNRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("changeMSISDN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changeMSISDN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {changeMSISDNRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TMobile_xsd.ChangeMSISDNResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TMobile_xsd.ChangeMSISDNResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TMobile_xsd.ChangeMSISDNResponse.class);
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

    public com.xius.tia.TMobile_xsd.UpdateWPSResponse updateWPS(com.xius.tia.TMobile_xsd.UpdateWPSRequest updateWPSRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updateWPS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateWPS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateWPSRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TMobile_xsd.UpdateWPSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TMobile_xsd.UpdateWPSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TMobile_xsd.UpdateWPSResponse.class);
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

    public com.xius.tia.TMobile_xsd.ManageIMEIBlackListResponse manageIMEIBlackList(com.xius.tia.TMobile_xsd.ManageIMEIBlackListRequest manageIMEIBlackListRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("manageIMEIBlackList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "manageIMEIBlackList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {manageIMEIBlackListRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TMobile_xsd.ManageIMEIBlackListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TMobile_xsd.ManageIMEIBlackListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TMobile_xsd.ManageIMEIBlackListResponse.class);
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

    public com.xius.tia.TMobile_xsd.QueryIMEIResponse queryIMEI(com.xius.tia.TMobile_xsd.QueryIMEIRequest queryIMEIRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("queryIMEI");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "queryIMEI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryIMEIRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TMobile_xsd.QueryIMEIResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TMobile_xsd.QueryIMEIResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TMobile_xsd.QueryIMEIResponse.class);
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

    public com.xius.tia.TMobile_xsd.SendOTAMSISDNResponse sendOTAMSISDN(com.xius.tia.TMobile_xsd.SendOTAMSISDNRequest sendOTAMSISDNRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("sendOTAMSISDN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "sendOTAMSISDN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sendOTAMSISDNRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TMobile_xsd.SendOTAMSISDNResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TMobile_xsd.SendOTAMSISDNResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TMobile_xsd.SendOTAMSISDNResponse.class);
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

    public com.xius.tia.TMobile_xsd.HLRBlockSIMResponse HLRBlockSIM(com.xius.tia.TMobile_xsd.HLRBlockSIMRequest HLRBlockSIMRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("HLRBlockSIM");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "HLRBlockSIM"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {HLRBlockSIMRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TMobile_xsd.HLRBlockSIMResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TMobile_xsd.HLRBlockSIMResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TMobile_xsd.HLRBlockSIMResponse.class);
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

    public com.xius.tia.TMobile_xsd.QuerySubscriberUsageResponse querySubscriberUsage(com.xius.tia.TMobile_xsd.QuerySubscriberUsageRequest querySubscriberUsageRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("querySubscriberUsage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "querySubscriberUsage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {querySubscriberUsageRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TMobile_xsd.QuerySubscriberUsageResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TMobile_xsd.QuerySubscriberUsageResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TMobile_xsd.QuerySubscriberUsageResponse.class);
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
