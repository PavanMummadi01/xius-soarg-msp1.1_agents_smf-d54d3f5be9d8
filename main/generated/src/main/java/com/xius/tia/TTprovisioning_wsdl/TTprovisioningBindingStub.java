/**
 * TTprovisioningBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TTprovisioning_wsdl;

public class TTprovisioningBindingStub extends org.apache.axis.client.Stub implements com.xius.tia.TTprovisioning_wsdl.TTprovisioningBindingPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[11];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("assignPolicy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "provisionPCRFRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "provisionPCRFRequest"), com.xius.tia.TTprovisioning_xsd.ProvisionPCRFRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "provisionPCRFResponse"));
        oper.setReturnClass(com.xius.tia.TTprovisioning_xsd.ProvisionPCRFResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "provisionPCRFResponse"));
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
        oper.setName("ttRegNotification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "ttRegNotificationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "ttRegNotificationRequest"), com.xius.tia.TTprovisioning_xsd.TtRegNotificationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "ttRegNotificationResponse"));
        oper.setReturnClass(com.xius.tia.TTprovisioning_xsd.TtRegNotificationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "ttRegNotificationResponse"));
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
        oper.setName("unAssignPolicy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "deletePCRFRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "deletePCRFRequest"), com.xius.tia.TTprovisioning_xsd.DeletePCRFRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "deletePCRFResponse"));
        oper.setReturnClass(com.xius.tia.TTprovisioning_xsd.DeletePCRFResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "deletePCRFResponse"));
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
        oper.setName("queryPCRF");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "queryPCRFRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "queryPCRFRequest"), com.xius.tia.TTprovisioning_xsd.QueryPCRFRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "queryPCRFResponse"));
        oper.setReturnClass(com.xius.tia.TTprovisioning_xsd.QueryPCRFResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "queryPCRFResponse"));
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
        oper.setName("volteProvision");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "volteProvisionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "volteProvisionRequest"), com.xius.tia.TTprovisioning_xsd.VolteProvisionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "volteProvisionResponse"));
        oper.setReturnClass(com.xius.tia.TTprovisioning_xsd.VolteProvisionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "volteProvisionResponse"));
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
        oper.setName("volteDeProvision");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "volteDeProvisionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "volteDeProvisionRequest"), com.xius.tia.TTprovisioning_xsd.VolteDeProvisionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "volteDeProvisionResponse"));
        oper.setReturnClass(com.xius.tia.TTprovisioning_xsd.VolteDeProvisionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "volteDeProvisionResponse"));
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
        oper.setName("volteServiceStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "volteServiceStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "volteServiceStatusRequest"), com.xius.tia.TTprovisioning_xsd.VolteServiceStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "volteServiceStatusResponse"));
        oper.setReturnClass(com.xius.tia.TTprovisioning_xsd.VolteServiceStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "volteServiceStatusResponse"));
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
        oper.setName("fiveGProvision");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "fiveGProvisionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "fiveGProvisionRequest"), com.xius.tia.TTprovisioning_xsd.FiveGProvisionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "fiveGProvisionResponse"));
        oper.setReturnClass(com.xius.tia.TTprovisioning_xsd.FiveGProvisionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "fiveGProvisionResponse"));
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
        oper.setName("fiveGDeProvision");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "fiveGDeProvisionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "fiveGDeProvisionRequest"), com.xius.tia.TTprovisioning_xsd.FiveGDeProvisionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "fiveGDeProvisionResponse"));
        oper.setReturnClass(com.xius.tia.TTprovisioning_xsd.FiveGDeProvisionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "fiveGDeProvisionResponse"));
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
        oper.setName("getLicenseInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "getLicenseInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "getLicenseInfoRequest"), com.xius.tia.TTprovisioning_xsd.GetLicenseInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "getLicenseInfoResponse"));
        oper.setReturnClass(com.xius.tia.TTprovisioning_xsd.GetLicenseInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "getLicenseInfoResponse"));
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
        oper.setName("deviceCheck");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "deviceCheckRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "deviceCheckRequest"), com.xius.tia.TTprovisioning_xsd.DeviceCheckRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "deviceCheckResponse"));
        oper.setReturnClass(com.xius.tia.TTprovisioning_xsd.DeviceCheckResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "deviceCheckResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[10] = oper;

    }

    public TTprovisioningBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TTprovisioningBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TTprovisioningBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "deletePCRFRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TTprovisioning_xsd.DeletePCRFRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "deletePCRFResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TTprovisioning_xsd.DeletePCRFResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "deviceCheckRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TTprovisioning_xsd.DeviceCheckRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "deviceCheckResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TTprovisioning_xsd.DeviceCheckResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "fiveGDeProvisionRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TTprovisioning_xsd.FiveGDeProvisionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "fiveGDeProvisionResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TTprovisioning_xsd.FiveGDeProvisionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "fiveGProvisionRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TTprovisioning_xsd.FiveGProvisionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "fiveGProvisionResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TTprovisioning_xsd.FiveGProvisionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "getLicenseInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TTprovisioning_xsd.GetLicenseInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "getLicenseInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TTprovisioning_xsd.GetLicenseInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "IMSIType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "MSISDNType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "ProdListType");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TTprovisioning_xsd.ProdListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "ProductType");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TTprovisioning_xsd.ProductType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "provisionPCRFRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TTprovisioning_xsd.ProvisionPCRFRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "provisionPCRFResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TTprovisioning_xsd.ProvisionPCRFResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "queryPCRFRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TTprovisioning_xsd.QueryPCRFRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "queryPCRFResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TTprovisioning_xsd.QueryPCRFResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "ResponseDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TTprovisioning_xsd.ResponseDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "ttRegNotificationRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TTprovisioning_xsd.TtRegNotificationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "ttRegNotificationResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TTprovisioning_xsd.TtRegNotificationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "volteDeProvisionRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TTprovisioning_xsd.VolteDeProvisionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "volteDeProvisionResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TTprovisioning_xsd.VolteDeProvisionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "volteProvisionRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TTprovisioning_xsd.VolteProvisionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "volteProvisionResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TTprovisioning_xsd.VolteProvisionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "volteServiceStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TTprovisioning_xsd.VolteServiceStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "volteServiceStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.TTprovisioning_xsd.VolteServiceStatusResponse.class;
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

    public com.xius.tia.TTprovisioning_xsd.ProvisionPCRFResponse assignPolicy(com.xius.tia.TTprovisioning_xsd.ProvisionPCRFRequest provisionPCRFRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("assignPolicy");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "assignPolicy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {provisionPCRFRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TTprovisioning_xsd.ProvisionPCRFResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TTprovisioning_xsd.ProvisionPCRFResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TTprovisioning_xsd.ProvisionPCRFResponse.class);
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

    public com.xius.tia.TTprovisioning_xsd.TtRegNotificationResponse ttRegNotification(com.xius.tia.TTprovisioning_xsd.TtRegNotificationRequest ttRegNotificationRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ttRegNotification");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ttRegNotification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ttRegNotificationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TTprovisioning_xsd.TtRegNotificationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TTprovisioning_xsd.TtRegNotificationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TTprovisioning_xsd.TtRegNotificationResponse.class);
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

    public com.xius.tia.TTprovisioning_xsd.DeletePCRFResponse unAssignPolicy(com.xius.tia.TTprovisioning_xsd.DeletePCRFRequest unAssignPCRFRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("unAssignPolicy");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "unAssignPolicy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {unAssignPCRFRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TTprovisioning_xsd.DeletePCRFResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TTprovisioning_xsd.DeletePCRFResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TTprovisioning_xsd.DeletePCRFResponse.class);
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

    public com.xius.tia.TTprovisioning_xsd.QueryPCRFResponse queryPCRF(com.xius.tia.TTprovisioning_xsd.QueryPCRFRequest queryPCRFRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("queryPCRF");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "queryPCRF"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryPCRFRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TTprovisioning_xsd.QueryPCRFResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TTprovisioning_xsd.QueryPCRFResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TTprovisioning_xsd.QueryPCRFResponse.class);
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

    public com.xius.tia.TTprovisioning_xsd.VolteProvisionResponse volteProvision(com.xius.tia.TTprovisioning_xsd.VolteProvisionRequest volteProvisionRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("volteProvision");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "volteProvision"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {volteProvisionRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TTprovisioning_xsd.VolteProvisionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TTprovisioning_xsd.VolteProvisionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TTprovisioning_xsd.VolteProvisionResponse.class);
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

    public com.xius.tia.TTprovisioning_xsd.VolteDeProvisionResponse volteDeProvision(com.xius.tia.TTprovisioning_xsd.VolteDeProvisionRequest volteDeProvisionRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("volteDeProvision");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "volteDeProvision"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {volteDeProvisionRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TTprovisioning_xsd.VolteDeProvisionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TTprovisioning_xsd.VolteDeProvisionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TTprovisioning_xsd.VolteDeProvisionResponse.class);
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

    public com.xius.tia.TTprovisioning_xsd.VolteServiceStatusResponse volteServiceStatus(com.xius.tia.TTprovisioning_xsd.VolteServiceStatusRequest volteServiceStatusRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("volteServiceStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "volteServiceStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {volteServiceStatusRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TTprovisioning_xsd.VolteServiceStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TTprovisioning_xsd.VolteServiceStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TTprovisioning_xsd.VolteServiceStatusResponse.class);
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

    public com.xius.tia.TTprovisioning_xsd.FiveGProvisionResponse fiveGProvision(com.xius.tia.TTprovisioning_xsd.FiveGProvisionRequest fiveGProvisionRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("fiveGProvision");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "fiveGProvision"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fiveGProvisionRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TTprovisioning_xsd.FiveGProvisionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TTprovisioning_xsd.FiveGProvisionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TTprovisioning_xsd.FiveGProvisionResponse.class);
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

    public com.xius.tia.TTprovisioning_xsd.FiveGDeProvisionResponse fiveGDeProvision(com.xius.tia.TTprovisioning_xsd.FiveGDeProvisionRequest fiveGDeProvisionRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("fiveGDeProvision");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "fiveGDeProvision"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fiveGDeProvisionRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TTprovisioning_xsd.FiveGDeProvisionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TTprovisioning_xsd.FiveGDeProvisionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TTprovisioning_xsd.FiveGDeProvisionResponse.class);
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

    public com.xius.tia.TTprovisioning_xsd.GetLicenseInfoResponse getLicenseInfo(com.xius.tia.TTprovisioning_xsd.GetLicenseInfoRequest getLicenseInfoRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getLicenseInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getLicenseInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getLicenseInfoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TTprovisioning_xsd.GetLicenseInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TTprovisioning_xsd.GetLicenseInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TTprovisioning_xsd.GetLicenseInfoResponse.class);
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

    public com.xius.tia.TTprovisioning_xsd.DeviceCheckResponse deviceCheck(com.xius.tia.TTprovisioning_xsd.DeviceCheckRequest deviceCheckRequest) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("deviceCheck");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deviceCheck"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deviceCheckRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.TTprovisioning_xsd.DeviceCheckResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.TTprovisioning_xsd.DeviceCheckResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.TTprovisioning_xsd.DeviceCheckResponse.class);
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
