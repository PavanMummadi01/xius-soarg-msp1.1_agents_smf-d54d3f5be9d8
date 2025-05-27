/**
 * TariffServiceBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.services.billing.tariff;

public class TariffServiceBindingStub extends org.apache.axis.client.Stub implements com.xius.xbus.services.billing.tariff.TariffServicePortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[29];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateServices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "updateServicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">updateServicesRequest"), com.xius.xbus.messages.billing.tariff.UpdateServicesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">updateServicesResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.UpdateServicesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "updateServicesResponse"));
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
        oper.setName("getServices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "getServicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getServicesRequest"), com.xius.xbus.messages.billing.tariff.GetServicesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getServicesResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.GetServicesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "getServicesResponse"));
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
        oper.setName("configureServices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "configureServicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">configureServicesRequest"), com.xius.xbus.messages.billing.tariff.ConfigureServicesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">configureServicesResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.ConfigureServicesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "configureServicesResponse"));
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
        oper.setName("getTariffPlanInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "getTariffPlanInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getTariffPlanInfoRequest"), com.xius.xbus.messages.billing.tariff.GetTariffPlanInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getTariffPlanInfoResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.GetTariffPlanInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "getTariffPlanInfoResponse"));
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
        oper.setName("changeTariffPlan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "changeTariffPlanRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">changeTariffPlanRequest"), com.xius.xbus.messages.billing.tariff.ChangeTariffPlanRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">changeTariffPlanResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.ChangeTariffPlanResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "changeTariffPlanResponse"));
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
        oper.setName("getTariffPlans");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "getTariffPlansRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getTariffPlansRequest"), com.xius.xbus.messages.billing.tariff.GetTariffPlansRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getTariffPlansResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.GetTariffPlansResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "getTariffPlansResponse"));
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
        oper.setName("getDataPlans");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "getDataPlansRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getDataPlansRequest"), com.xius.xbus.messages.billing.tariff.GetDataPlansRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getDataPlansResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.GetDataPlansResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "getDataPlansResponse"));
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
        oper.setName("manageDataPlan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "manageDataPlanRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">manageDataPlanRequest"), com.xius.xbus.messages.billing.tariff.ManageDataPlanRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">manageDataPlanResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.ManageDataPlanResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "manageDataPlanResponse"));
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
        oper.setName("manageMultipleDataPlans");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "manageMultipleDataPlansRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">manageMultipleDataPlansRequest"), com.xius.xbus.messages.billing.tariff.ManageMultipleDataPlansRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">manageMultipleDataPlansResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.ManageMultipleDataPlansResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "manageMultipleDataPlansResponse"));
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
        oper.setName("getDataPlanStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "getDataPlanStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getDataPlanStatusRequest"), com.xius.xbus.messages.billing.tariff.GetDataPlanStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getDataPlanStatusResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.GetDataPlanStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "getDataPlanStatusResponse"));
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
        oper.setName("accountSharing");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "accountSharingRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">accountSharingRequest"), com.xius.xbus.messages.billing.tariff.AccountSharingRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">accountSharingResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.AccountSharingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "accountSharingResponse"));
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
        oper.setName("getAccountSharingBal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "getAccountSharingBalRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getAccountSharingBalRequest"), com.xius.xbus.messages.billing.tariff.GetAccountSharingBalRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getAccountSharingBalResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.GetAccountSharingBalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "getAccountSharingBalResponse"));
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
        oper.setName("getServicePackInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "getServicePackInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getServicePackInfoRequest"), com.xius.xbus.messages.billing.tariff.GetServicePackInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getServicePackInfoResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.GetServicePackInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "getServicePackInfoResponse"));
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
        oper.setName("manageServicePack");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "manageServicePackRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">manageServicePackRequest"), com.xius.xbus.messages.billing.tariff.ManageServicePackRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">manageServicePackResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.ManageServicePackResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "manageServicePackResponse"));
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
        oper.setName("getTariffServicePkgDtl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "getTariffServicePkgDtlRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getTariffServicePkgDtlRequest"), com.xius.xbus.messages.billing.tariff.GetTariffServicePkgDtlRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getTariffServicePkgDtlResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.GetTariffServicePkgDtlResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "getTariffServicePkgDtlResponse"));
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
        oper.setName("getBaseSubServices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "getBaseSubServicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getBaseSubServicesRequest"), com.xius.xbus.messages.billing.tariff.GetBaseSubServicesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getBaseSubServicesResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.GetBaseSubServicesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "getBaseSubServicesResponse"));
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
        oper.setName("getBaseATPServices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "getBaseATPServicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getBaseATPServicesRequest"), com.xius.xbus.messages.billing.tariff.GetBaseATPServicesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getBaseATPServicesResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.GetBaseATPServicesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "getBaseATPServicesResponse"));
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
        oper.setName("deleteService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "deleteServiceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">deleteServiceRequest"), com.xius.xbus.messages.billing.tariff.DeleteServiceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">deleteServiceResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.DeleteServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "deleteServiceResponse"));
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
        oper.setName("ATPSubscription");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ATPSubscriptionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">ATPSubscriptionRequest"), com.xius.xbus.messages.billing.tariff.ATPSubscriptionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">ATPSubscriptionResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.ATPSubscriptionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ATPSubscriptionResponse"));
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
        oper.setName("bulkATPSubscription");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "BulkATPSubscriptionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">BulkATPSubscriptionRequest"), com.xius.xbus.messages.billing.tariff.BulkATPSubscriptionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">BulkATPSubscriptionResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.BulkATPSubscriptionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "BulkATPSubscriptionResponse"));
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
        oper.setName("ATPSubscriptionWithCC");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ATPSubscriptionWithCCRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">ATPSubscriptionWithCCRequest"), com.xius.xbus.messages.billing.tariff.ATPSubscriptionWithCCRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">ATPSubscriptionWithCCResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.ATPSubscriptionWithCCResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ATPSubscriptionWithCCResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ActivateBulkATPSub");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ActivateBulkATPRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">ActivateBulkATPRequest"), com.xius.xbus.messages.billing.tariff.ActivateBulkATPRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">ActivateBulkATPResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.ActivateBulkATPResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ActivateBulkATPResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTPs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "getTPRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getTPRequest"), com.xius.xbus.messages.billing.tariff.GetTPRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getTPResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.GetTPResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "getTPResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDPlans");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "getDPlansRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getDPlansRequest"), com.xius.xbus.messages.billing.tariff.GetDPlansRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getDPlansResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.GetDPlansResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "getDPlansResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeTP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "changeTPRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">changeTPRequest"), com.xius.xbus.messages.billing.tariff.ChangeTPRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">changeTPResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.ChangeTPResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "changeTPResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manageMyPlan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ManageMyPlanRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">ManageMyPlanRequest"), com.xius.xbus.messages.billing.tariff.ManageMyPlanRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">ManageMyPlanResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.ManageMyPlanResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ManageMyPlanResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("myPlanRenewal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "MyPlanRenewalRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">MyPlanRenewalRequest"), com.xius.xbus.messages.billing.tariff.MyPlanRenewalRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">MyPlanRenewalResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.MyPlanRenewalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "MyPlanRenewalResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manageVolte");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ManageVolteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">ManageVolteRequest"), com.xius.xbus.messages.billing.tariff.ManageVolteRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">ManageVolteResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.ManageVolteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ManageVolteResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manage5G");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "Manage5GRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">Manage5GRequest"), com.xius.xbus.messages.billing.tariff.Manage5GRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">Manage5GResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.tariff.Manage5GResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "Manage5GResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[28] = oper;

    }

    public TariffServiceBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TariffServiceBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TariffServiceBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">>updateServicesResponse>invalidServices");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.UpdateServicesResponseInvalidServices.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">>updateServicesResponse>subscribedServices");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.UpdateServicesResponseSubscribedServices.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">>updateServicesResponse>unSubscribedServices");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.UpdateServicesResponseUnSubscribedServices.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">accountSharingRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.AccountSharingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">accountSharingResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.AccountSharingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">ActivateBulkATPRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ActivateBulkATPRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">ActivateBulkATPResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ActivateBulkATPResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">ATPSubscriptionRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ATPSubscriptionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">ATPSubscriptionResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ATPSubscriptionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">ATPSubscriptionWithCCRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ATPSubscriptionWithCCRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">ATPSubscriptionWithCCResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ATPSubscriptionWithCCResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">BulkATPSubscriptionRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.BulkATPSubscriptionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">BulkATPSubscriptionResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.BulkATPSubscriptionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">changeTariffPlanRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ChangeTariffPlanRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">changeTariffPlanResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ChangeTariffPlanResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">changeTPRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ChangeTPRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">changeTPResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ChangeTPResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">configureServicesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ConfigureServicesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">configureServicesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ConfigureServicesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">deleteServiceRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.DeleteServiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">deleteServiceResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.DeleteServiceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getAccountSharingBalRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.GetAccountSharingBalRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getAccountSharingBalResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.GetAccountSharingBalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getBaseATPServicesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.GetBaseATPServicesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getBaseATPServicesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.GetBaseATPServicesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getBaseSubServicesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.GetBaseSubServicesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getBaseSubServicesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.GetBaseSubServicesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getDataPlansRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.GetDataPlansRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getDataPlansResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.GetDataPlansResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getDataPlanStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.GetDataPlanStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getDataPlanStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.GetDataPlanStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getDPlansRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.GetDPlansRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getDPlansResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.GetDPlansResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getServicePackInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.GetServicePackInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getServicePackInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.GetServicePackInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getServicesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.GetServicesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getServicesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.GetServicesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getTariffPlanInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.GetTariffPlanInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getTariffPlanInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.GetTariffPlanInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getTariffPlansRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.GetTariffPlansRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getTariffPlansResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.GetTariffPlansResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getTariffServicePkgDtlRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.GetTariffServicePkgDtlRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getTariffServicePkgDtlResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.GetTariffServicePkgDtlResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getTPRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.GetTPRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getTPResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.GetTPResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">Manage5GRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.Manage5GRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">Manage5GResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.Manage5GResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">manageDataPlanRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ManageDataPlanRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">manageDataPlanResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ManageDataPlanResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">manageMultipleDataPlansRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ManageMultipleDataPlansRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">manageMultipleDataPlansResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ManageMultipleDataPlansResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">ManageMyPlanRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ManageMyPlanRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">ManageMyPlanResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ManageMyPlanResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">manageServicePackRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ManageServicePackRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">manageServicePackResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ManageServicePackResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">ManageVolteRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ManageVolteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">ManageVolteResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ManageVolteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">MyPlanRenewalRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.MyPlanRenewalRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">MyPlanRenewalResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.MyPlanRenewalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">updateServicesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.UpdateServicesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">updateServicesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.UpdateServicesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ATPListType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ServicePackInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ServicePackInfoType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "atpList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "AutoRenewalType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.AutoRenewalType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "BalanceInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.BalanceUnitsInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "BalanceUnitsInfoType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "balanceServUnits");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "BalanceUnitsInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.BalanceUnitsInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "bucketDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.BucketType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "bucketType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "bucket");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "bucketType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.BucketType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "CADataType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.CADataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "CAListType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.CADataType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "CADataType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ca");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "CallBarredNumbers");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.CallBarredNumbers.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "CategoryType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.CategoryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ChildAcctListsType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ChildAcctListsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ChildTypes");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ChildAcctListsType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ChildAcctListsType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "acctBalLists");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ConfigureServicesInfo");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ConfigureServicesInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "DataPlanDetailType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.DataPlanDetailType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "DataPlanInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.DataPlanDetailType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "DataPlanDetailType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "dataPlan");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "DataPlanTinyInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.DataPlanTinyInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "DataPlanType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.DataPlanType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "discountDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.DiscountType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "discountType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "discount");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "discountType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.DiscountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "DPlanDetailType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.DPlanDetailType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "DPlanInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.DPlanDetailType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "DPlanDetailType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "dataPlan");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "DPlanType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.DPlanType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "FailListType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.FailureType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "FailureType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "failure");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "FailureType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.FailureType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "IMSIDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.IMSIDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "MSISDNDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.MSISDNDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ParentInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ParentInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "PlanDataInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.PlanDataType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "PlanDataType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "dataPlanData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "PlanDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.PlanDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "PlanDetails");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.PlanDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "PublicityIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "Service");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.Service.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ServiceList");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.Service[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "Service");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "serviceList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ServiceListType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ServiceListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ServicePackInfoListType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ServicePackInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ServicePackInfoType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ServicePackInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ServicePackInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ServicePackInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ServicePlans");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.CategoryType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "CategoryType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "category");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "servicePlanType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.SubscribeServiceSuccessType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "SubscribeServiceSuccessType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "availableServicePlans");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ServicesListType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ServiceListType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ServiceListType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "service");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

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
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ServicesType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ServiceType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ServiceType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "service");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ServiceType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ServiceUnitType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.ServiceUnitType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "SIMDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.SIMDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "SpecialNumbers");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.SpecialNumbers.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "SubDataPlanDetailType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.SubDataPlanDetailType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "SubDataPlanInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.SubDataPlanDetailType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "SubDataPlanDetailType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "dataPlan");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "SubDataPlanType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.SubDataPlanType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "SubscribeServiceSuccessType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.SubscribeServiceSuccessType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "SubServicesListType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.SubServicesType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "SubServicesType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "subServicesList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "SubServicesType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.SubServicesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "SubUnSubType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.SubUnSubType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "TarrifPlanInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.TarrifPlanInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "TPInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.TPInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "UseParentCABalance");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.UseParentCABalance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "UseParentCoreBalance");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.tariff.UseParentCoreBalance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.AccountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AmountType");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "BillingAccountIdKey");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.BillingAccountIdKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "GroupActionType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.GroupActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "SecurityId");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.SecurityId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

    public com.xius.xbus.messages.billing.tariff.UpdateServicesResponse updateServices(com.xius.xbus.messages.billing.tariff.UpdateServicesRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
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
                return (com.xius.xbus.messages.billing.tariff.UpdateServicesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.UpdateServicesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.UpdateServicesResponse.class);
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

    public com.xius.xbus.messages.billing.tariff.GetServicesResponse getServices(com.xius.xbus.messages.billing.tariff.GetServicesRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
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
                return (com.xius.xbus.messages.billing.tariff.GetServicesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.GetServicesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.GetServicesResponse.class);
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

    public com.xius.xbus.messages.billing.tariff.ConfigureServicesResponse configureServices(com.xius.xbus.messages.billing.tariff.ConfigureServicesRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("configureServices");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "configureServices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.tariff.ConfigureServicesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.ConfigureServicesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.ConfigureServicesResponse.class);
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

    public com.xius.xbus.messages.billing.tariff.GetTariffPlanInfoResponse getTariffPlanInfo(com.xius.xbus.messages.billing.tariff.GetTariffPlanInfoRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getTariffPlanInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTariffPlanInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.tariff.GetTariffPlanInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.GetTariffPlanInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.GetTariffPlanInfoResponse.class);
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

    public com.xius.xbus.messages.billing.tariff.ChangeTariffPlanResponse changeTariffPlan(com.xius.xbus.messages.billing.tariff.ChangeTariffPlanRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("changeTariffPlan");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changeTariffPlan"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.tariff.ChangeTariffPlanResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.ChangeTariffPlanResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.ChangeTariffPlanResponse.class);
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

    public com.xius.xbus.messages.billing.tariff.GetTariffPlansResponse getTariffPlans(com.xius.xbus.messages.billing.tariff.GetTariffPlansRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getTariffPlans");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTariffPlans"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.tariff.GetTariffPlansResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.GetTariffPlansResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.GetTariffPlansResponse.class);
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

    public com.xius.xbus.messages.billing.tariff.GetDataPlansResponse getDataPlans(com.xius.xbus.messages.billing.tariff.GetDataPlansRequest body) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getDataPlans");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDataPlans"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.tariff.GetDataPlansResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.GetDataPlansResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.GetDataPlansResponse.class);
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

    public com.xius.xbus.messages.billing.tariff.ManageDataPlanResponse manageDataPlan(com.xius.xbus.messages.billing.tariff.ManageDataPlanRequest body) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("manageDataPlan");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "manageDataPlan"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.tariff.ManageDataPlanResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.ManageDataPlanResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.ManageDataPlanResponse.class);
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

    public com.xius.xbus.messages.billing.tariff.ManageMultipleDataPlansResponse manageMultipleDataPlans(com.xius.xbus.messages.billing.tariff.ManageMultipleDataPlansRequest body) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("manageMultipleDataPlans");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "manageMultipleDataPlans"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.tariff.ManageMultipleDataPlansResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.ManageMultipleDataPlansResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.ManageMultipleDataPlansResponse.class);
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

    public com.xius.xbus.messages.billing.tariff.GetDataPlanStatusResponse getDataPlanStatus(com.xius.xbus.messages.billing.tariff.GetDataPlanStatusRequest body) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getDataPlanStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDataPlanStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.tariff.GetDataPlanStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.GetDataPlanStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.GetDataPlanStatusResponse.class);
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

    public com.xius.xbus.messages.billing.tariff.AccountSharingResponse accountSharing(com.xius.xbus.messages.billing.tariff.AccountSharingRequest body) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("accountSharing");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "accountSharing"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.tariff.AccountSharingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.AccountSharingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.AccountSharingResponse.class);
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

    public com.xius.xbus.messages.billing.tariff.GetAccountSharingBalResponse getAccountSharingBal(com.xius.xbus.messages.billing.tariff.GetAccountSharingBalRequest body) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getAccountSharingBal");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getAccountSharingBal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.tariff.GetAccountSharingBalResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.GetAccountSharingBalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.GetAccountSharingBalResponse.class);
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

    public com.xius.xbus.messages.billing.tariff.GetServicePackInfoResponse getServicePackInfo(com.xius.xbus.messages.billing.tariff.GetServicePackInfoRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getServicePackInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getServicePackInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.tariff.GetServicePackInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.GetServicePackInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.GetServicePackInfoResponse.class);
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

    public com.xius.xbus.messages.billing.tariff.ManageServicePackResponse manageServicePack(com.xius.xbus.messages.billing.tariff.ManageServicePackRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("manageServicePack");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "manageServicePack"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.tariff.ManageServicePackResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.ManageServicePackResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.ManageServicePackResponse.class);
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

    public com.xius.xbus.messages.billing.tariff.GetTariffServicePkgDtlResponse getTariffServicePkgDtl(com.xius.xbus.messages.billing.tariff.GetTariffServicePkgDtlRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getTariffServicePkgDtl");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTariffServicePkgDtl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.tariff.GetTariffServicePkgDtlResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.GetTariffServicePkgDtlResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.GetTariffServicePkgDtlResponse.class);
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

    public com.xius.xbus.messages.billing.tariff.GetBaseSubServicesResponse getBaseSubServices(com.xius.xbus.messages.billing.tariff.GetBaseSubServicesRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getBaseSubServices");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBaseSubServices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.tariff.GetBaseSubServicesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.GetBaseSubServicesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.GetBaseSubServicesResponse.class);
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

    public com.xius.xbus.messages.billing.tariff.GetBaseATPServicesResponse getBaseATPServices(com.xius.xbus.messages.billing.tariff.GetBaseATPServicesRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getBaseATPServices");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBaseATPServices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.tariff.GetBaseATPServicesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.GetBaseATPServicesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.GetBaseATPServicesResponse.class);
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

    public com.xius.xbus.messages.billing.tariff.DeleteServiceResponse deleteService(com.xius.xbus.messages.billing.tariff.DeleteServiceRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("deleteService");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteService"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.tariff.DeleteServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.DeleteServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.DeleteServiceResponse.class);
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

    public com.xius.xbus.messages.billing.tariff.ATPSubscriptionResponse ATPSubscription(com.xius.xbus.messages.billing.tariff.ATPSubscriptionRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("atpSubscription");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ATPSubscription"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.tariff.ATPSubscriptionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.ATPSubscriptionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.ATPSubscriptionResponse.class);
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

    public com.xius.xbus.messages.billing.tariff.BulkATPSubscriptionResponse bulkATPSubscription(com.xius.xbus.messages.billing.tariff.BulkATPSubscriptionRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("bulkATPSubscription");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "bulkATPSubscription"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.tariff.BulkATPSubscriptionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.BulkATPSubscriptionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.BulkATPSubscriptionResponse.class);
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

    public com.xius.xbus.messages.billing.tariff.ATPSubscriptionWithCCResponse ATPSubscriptionWithCC(com.xius.xbus.messages.billing.tariff.ATPSubscriptionWithCCRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("atpSubscriptionWithCC");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ATPSubscriptionWithCC"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.tariff.ATPSubscriptionWithCCResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.ATPSubscriptionWithCCResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.ATPSubscriptionWithCCResponse.class);
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

    public com.xius.xbus.messages.billing.tariff.ActivateBulkATPResponse activateBulkATPSub(com.xius.xbus.messages.billing.tariff.ActivateBulkATPRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ActivateBulkATPSub");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ActivateBulkATPSub"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.tariff.ActivateBulkATPResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.ActivateBulkATPResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.ActivateBulkATPResponse.class);
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

    public com.xius.xbus.messages.billing.tariff.GetTPResponse getTPs(com.xius.xbus.messages.billing.tariff.GetTPRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getTPs");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTPs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.tariff.GetTPResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.GetTPResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.GetTPResponse.class);
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

    public com.xius.xbus.messages.billing.tariff.GetDPlansResponse getDPlans(com.xius.xbus.messages.billing.tariff.GetDPlansRequest body) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getDPlans");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDPlans"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.tariff.GetDPlansResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.GetDPlansResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.GetDPlansResponse.class);
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

    public com.xius.xbus.messages.billing.tariff.ChangeTPResponse changeTP(com.xius.xbus.messages.billing.tariff.ChangeTPRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("changeTP");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changeTP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.tariff.ChangeTPResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.ChangeTPResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.ChangeTPResponse.class);
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

    public com.xius.xbus.messages.billing.tariff.ManageMyPlanResponse manageMyPlan(com.xius.xbus.messages.billing.tariff.ManageMyPlanRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("manageMyPlan");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "manageMyPlan"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.tariff.ManageMyPlanResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.ManageMyPlanResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.ManageMyPlanResponse.class);
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

    public com.xius.xbus.messages.billing.tariff.MyPlanRenewalResponse myPlanRenewal(com.xius.xbus.messages.billing.tariff.MyPlanRenewalRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("myPlanRenewal");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "myPlanRenewal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.tariff.MyPlanRenewalResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.MyPlanRenewalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.MyPlanRenewalResponse.class);
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

    public com.xius.xbus.messages.billing.tariff.ManageVolteResponse manageVolte(com.xius.xbus.messages.billing.tariff.ManageVolteRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("manageVolte");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "manageVolte"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.tariff.ManageVolteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.ManageVolteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.ManageVolteResponse.class);
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

    public com.xius.xbus.messages.billing.tariff.Manage5GResponse manage5G(com.xius.xbus.messages.billing.tariff.Manage5GRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("manage5G");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "manage5G"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.tariff.Manage5GResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.tariff.Manage5GResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.tariff.Manage5GResponse.class);
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
