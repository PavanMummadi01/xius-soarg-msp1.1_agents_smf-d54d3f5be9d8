/**
 * HLRManagementBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.ttsa.hlr.HLRManagement_wsdl;

public class HLRManagementBindingStub extends org.apache.axis.client.Stub implements com.xius.ttsa.hlr.HLRManagement_wsdl.HLRManagementPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[12];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("simRegistration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "simRegistrationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "SimRegistrationRequest"), com.xius.ttsa.hlr.HLRManagement_xsd.SimRegistrationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "SimRegistrationResponse"));
        oper.setReturnClass(com.xius.ttsa.hlr.HLRManagement_xsd.SimRegistrationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "simRegistrationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeSubMSISDN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "changeSubMSISDNRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "ChangeSubMSISDNRequest"), com.xius.ttsa.hlr.HLRManagement_xsd.ChangeSubMSISDNRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "ChangeSubMSISDNResponse"));
        oper.setReturnClass(com.xius.ttsa.hlr.HLRManagement_xsd.ChangeSubMSISDNResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "changeSubMSISDNResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("simSwap");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "simSwapRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "SIMSwapRequest"), com.xius.ttsa.hlr.HLRManagement_xsd.SIMSwapRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "SIMSwapResponse"));
        oper.setReturnClass(com.xius.ttsa.hlr.HLRManagement_xsd.SIMSwapResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "simSwapResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activateGSMGPRS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "activateGSMGPRSRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "ActivateGSMGPRSRequest"), com.xius.ttsa.hlr.HLRManagement_xsd.ActivateGSMGPRSRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "ActivateGSMGPRSResponse"));
        oper.setReturnClass(com.xius.ttsa.hlr.HLRManagement_xsd.ActivateGSMGPRSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "activateGSMGPRSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("purgeSubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "purgeSubscriberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "PurgeSubscriberRequest"), com.xius.ttsa.hlr.HLRManagement_xsd.PurgeSubscriberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "PurgeSubscriberResponse"));
        oper.setReturnClass(com.xius.ttsa.hlr.HLRManagement_xsd.PurgeSubscriberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "purgeSubscriberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateOptionalServices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "updateOptionalServicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "UpdateOptionalServicesRequest"), com.xius.ttsa.hlr.HLRManagement_xsd.UpdateOptionalServicesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "UpdateOptionalServicesResponse"));
        oper.setReturnClass(com.xius.ttsa.hlr.HLRManagement_xsd.ServiceType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "updateOptionalServicesResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "failedServiceType"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addAllowedFtnRange");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "addAllowedFtnRangeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "AddAllowedFtnRangeRequest"), com.xius.ttsa.hlr.HLRManagement_xsd.AddAllowedFtnRangeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "AddAllowedFtnRangeResponse"));
        oper.setReturnClass(com.xius.ttsa.hlr.HLRManagement_xsd.AddAllowedFtnRangeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "addAllowedFtnRangeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manageAllowedFtnRange");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "manageAllowedFtnRangeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "ManageAllowedFtnRangeRequest"), com.xius.ttsa.hlr.HLRManagement_xsd.ManageAllowedFtnRangeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "ManageAllowedFtnRangeResponse"));
        oper.setReturnClass(com.xius.ttsa.hlr.HLRManagement_xsd.ManageAllowedFtnRangeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "manageAllowedFtnRangeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeSubMSISDNBulk");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "changeSubMSISDNBulkRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "ChangeSubMSISDNBulkRequest"), com.xius.ttsa.hlr.HLRManagement_xsd.ChangeSubMSISDNBulkRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "ChangeSubMSISDNBulkResponse"));
        oper.setReturnClass(com.xius.ttsa.hlr.HLRManagement_xsd.ChangeSubMSISDNBulkResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "changeSubMSISDNBulkResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getGsmGprsStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "getGsmGprsStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "GetGsmGprsStatusRequest"), com.xius.ttsa.hlr.HLRManagement_xsd.GetGsmGprsStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "GetGsmGprsStatusResponse"));
        oper.setReturnClass(com.xius.ttsa.hlr.HLRManagement_xsd.GetGsmGprsStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "getGsmGprsStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("unbarServices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "unbarServicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "UnbarServicesRequest"), com.xius.ttsa.hlr.HLRManagement_xsd.UnbarServicesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "UnbarServicesResponse"));
        oper.setReturnClass(com.xius.ttsa.hlr.HLRManagement_xsd.UnbarServicesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "unbarServicesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeSubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "removeSubscriberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "RemoveSubscriberRequest"), com.xius.ttsa.hlr.HLRManagement_xsd.RemoveSubscriberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "RemoveSubscriberResponse"));
        oper.setReturnClass(com.xius.ttsa.hlr.HLRManagement_xsd.RemoveSubscriberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "removeSubscriberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[11] = oper;

    }

    public HLRManagementBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public HLRManagementBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public HLRManagementBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/common/error/ErrorDetails.xsd", "ErrorCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/common/error/ErrorDetails.xsd", "ErrorMessageType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "ActivateGSMGPRSRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.ActivateGSMGPRSRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "ActivateGSMGPRSResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.ActivateGSMGPRSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "AddAllowedFtnRangeRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.AddAllowedFtnRangeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "AddAllowedFtnRangeResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.AddAllowedFtnRangeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "AllowedFTNRangeListType");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.AllowedFTNRangeType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "AllowedFTNRangeType");
            qName2 = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "allowedFTNRange");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "AllowedFTNRangeType");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.AllowedFTNRangeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "ChangeSubMSISDNBulkRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.ChangeSubMSISDNBulkRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "ChangeSubMSISDNBulkResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.ChangeSubMSISDNBulkResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "ChangeSubMSISDNRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.ChangeSubMSISDNRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "ChangeSubMSISDNResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.ChangeSubMSISDNResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "GetGsmGprsStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.GetGsmGprsStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "GetGsmGprsStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.GetGsmGprsStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "ManageAllowedFtnRangeRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.ManageAllowedFtnRangeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "ManageAllowedFtnRangeResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.ManageAllowedFtnRangeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "OptionFlagType");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.OptionFlagType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "PurgeSubscriberRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.PurgeSubscriberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "PurgeSubscriberResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.PurgeSubscriberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "RemoveSubscriberRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.RemoveSubscriberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "RemoveSubscriberResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.RemoveSubscriberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "ServicesListType");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.ServicesListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "ServiceType");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.ServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "SimRegistrationRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.SimRegistrationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "SimRegistrationResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.SimRegistrationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "SIMSwapRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.SIMSwapRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "SIMSwapResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.SIMSwapResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "UnbarServicesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.UnbarServicesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "UnbarServicesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.UnbarServicesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "UpdateOptionalServicesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.UpdateOptionalServicesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "UpdateOptionalServicesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.ttsa.hlr.HLRManagement_xsd.ServiceType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "ServiceType");
            qName2 = new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "failedServiceType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

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

    public com.xius.ttsa.hlr.HLRManagement_xsd.SimRegistrationResponse simRegistration(com.xius.ttsa.hlr.HLRManagement_xsd.SimRegistrationRequest body) throws java.rmi.RemoteException, com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
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
                return (com.xius.ttsa.hlr.HLRManagement_xsd.SimRegistrationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.ttsa.hlr.HLRManagement_xsd.SimRegistrationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.ttsa.hlr.HLRManagement_xsd.SimRegistrationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.ttsa.hlr.HLRManagement_xsd.ChangeSubMSISDNResponse changeSubMSISDN(com.xius.ttsa.hlr.HLRManagement_xsd.ChangeSubMSISDNRequest body) throws java.rmi.RemoteException, com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("changeSubMSISDN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changeSubMSISDN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.ttsa.hlr.HLRManagement_xsd.ChangeSubMSISDNResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.ttsa.hlr.HLRManagement_xsd.ChangeSubMSISDNResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.ttsa.hlr.HLRManagement_xsd.ChangeSubMSISDNResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.ttsa.hlr.HLRManagement_xsd.SIMSwapResponse simSwap(com.xius.ttsa.hlr.HLRManagement_xsd.SIMSwapRequest body) throws java.rmi.RemoteException, com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("simSwap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "simSwap"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.ttsa.hlr.HLRManagement_xsd.SIMSwapResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.ttsa.hlr.HLRManagement_xsd.SIMSwapResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.ttsa.hlr.HLRManagement_xsd.SIMSwapResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.ttsa.hlr.HLRManagement_xsd.ActivateGSMGPRSResponse activateGSMGPRS(com.xius.ttsa.hlr.HLRManagement_xsd.ActivateGSMGPRSRequest body) throws java.rmi.RemoteException, com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("activateGSMGPRS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "activateGSMGPRS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.ttsa.hlr.HLRManagement_xsd.ActivateGSMGPRSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.ttsa.hlr.HLRManagement_xsd.ActivateGSMGPRSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.ttsa.hlr.HLRManagement_xsd.ActivateGSMGPRSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.ttsa.hlr.HLRManagement_xsd.PurgeSubscriberResponse purgeSubscriber(com.xius.ttsa.hlr.HLRManagement_xsd.PurgeSubscriberRequest body) throws java.rmi.RemoteException, com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("purgeSubscriber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "purgeSubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.ttsa.hlr.HLRManagement_xsd.PurgeSubscriberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.ttsa.hlr.HLRManagement_xsd.PurgeSubscriberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.ttsa.hlr.HLRManagement_xsd.PurgeSubscriberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.ttsa.hlr.HLRManagement_xsd.ServiceType[] updateOptionalServices(com.xius.ttsa.hlr.HLRManagement_xsd.UpdateOptionalServicesRequest body) throws java.rmi.RemoteException, com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updateOptionalServices");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateOptionalServices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.ttsa.hlr.HLRManagement_xsd.ServiceType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.ttsa.hlr.HLRManagement_xsd.ServiceType[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.ttsa.hlr.HLRManagement_xsd.ServiceType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.ttsa.hlr.HLRManagement_xsd.AddAllowedFtnRangeResponse addAllowedFtnRange(com.xius.ttsa.hlr.HLRManagement_xsd.AddAllowedFtnRangeRequest body) throws java.rmi.RemoteException, com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("addAllowedFtnRange");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "addAllowedFtnRange"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.ttsa.hlr.HLRManagement_xsd.AddAllowedFtnRangeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.ttsa.hlr.HLRManagement_xsd.AddAllowedFtnRangeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.ttsa.hlr.HLRManagement_xsd.AddAllowedFtnRangeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.ttsa.hlr.HLRManagement_xsd.ManageAllowedFtnRangeResponse manageAllowedFtnRange(com.xius.ttsa.hlr.HLRManagement_xsd.ManageAllowedFtnRangeRequest body) throws java.rmi.RemoteException, com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("manageAllowedFtnRange");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "manageAllowedFtnRange"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.ttsa.hlr.HLRManagement_xsd.ManageAllowedFtnRangeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.ttsa.hlr.HLRManagement_xsd.ManageAllowedFtnRangeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.ttsa.hlr.HLRManagement_xsd.ManageAllowedFtnRangeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.ttsa.hlr.HLRManagement_xsd.ChangeSubMSISDNBulkResponse changeSubMSISDNBulk(com.xius.ttsa.hlr.HLRManagement_xsd.ChangeSubMSISDNBulkRequest body) throws java.rmi.RemoteException, com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("changeSubMSISDNBulk");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changeSubMSISDNBulk"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.ttsa.hlr.HLRManagement_xsd.ChangeSubMSISDNBulkResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.ttsa.hlr.HLRManagement_xsd.ChangeSubMSISDNBulkResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.ttsa.hlr.HLRManagement_xsd.ChangeSubMSISDNBulkResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.ttsa.hlr.HLRManagement_xsd.GetGsmGprsStatusResponse getGsmGprsStatus(com.xius.ttsa.hlr.HLRManagement_xsd.GetGsmGprsStatusRequest body) throws java.rmi.RemoteException, com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getGsmGprsStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getGsmGprsStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.ttsa.hlr.HLRManagement_xsd.GetGsmGprsStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.ttsa.hlr.HLRManagement_xsd.GetGsmGprsStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.ttsa.hlr.HLRManagement_xsd.GetGsmGprsStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.ttsa.hlr.HLRManagement_xsd.UnbarServicesResponse unbarServices(com.xius.ttsa.hlr.HLRManagement_xsd.UnbarServicesRequest body) throws java.rmi.RemoteException, com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("unbarServices");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "unbarServices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.ttsa.hlr.HLRManagement_xsd.UnbarServicesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.ttsa.hlr.HLRManagement_xsd.UnbarServicesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.ttsa.hlr.HLRManagement_xsd.UnbarServicesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.ttsa.hlr.HLRManagement_xsd.RemoveSubscriberResponse removeSubscriber(com.xius.ttsa.hlr.HLRManagement_xsd.RemoveSubscriberRequest body) throws java.rmi.RemoteException, com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("removeSubscriber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "removeSubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.ttsa.hlr.HLRManagement_xsd.RemoveSubscriberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.ttsa.hlr.HLRManagement_xsd.RemoveSubscriberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.ttsa.hlr.HLRManagement_xsd.RemoveSubscriberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.ttsa.hlr.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
