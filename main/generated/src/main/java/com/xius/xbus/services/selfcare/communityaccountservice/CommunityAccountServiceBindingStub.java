/**
 * CommunityAccountServiceBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.services.selfcare.communityaccountservice;

public class CommunityAccountServiceBindingStub extends org.apache.axis.client.Stub implements com.xius.xbus.services.selfcare.communityaccountservice.CommunityAccountServicePortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[13];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAdnlFtrs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "GetAdnlFtrsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">GetAdnlFtrsRequest"), com.xius.xbus.messages.selfcare.communityaccountservice.GetAdnlFtrsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">GetAdnlFtrsResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.communityaccountservice.GetAdnlFtrsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "GetAdnlFtrsResponse"));
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
        oper.setName("getCARenwl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "GetCARenwlRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">GetCARenwlRequest"), com.xius.xbus.messages.selfcare.communityaccountservice.GetCARenwlRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">GetCARenwlResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.communityaccountservice.GetCARenwlResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "GetCARenwlResponse"));
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
        oper.setName("caRenwl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "CARenwlRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">CARenwlRequest"), com.xius.xbus.messages.selfcare.communityaccountservice.CARenwlRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">CARenwlResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.communityaccountservice.CARenwlResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "CARenwlResponse"));
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
        oper.setName("getServiceData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "GetServiceDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">GetServiceDataRequest"), com.xius.xbus.messages.selfcare.communityaccountservice.GetServiceDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">GetServiceDataResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.communityaccountservice.GetServiceDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "GetServiceDataResponse"));
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
        oper.setName("getCADetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "GetCADetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">GetCADetailsRequest"), com.xius.xbus.messages.selfcare.communityaccountservice.GetCADetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">GetCADetailsResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.communityaccountservice.GetCADetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "GetCADetailsResponse"));
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
        oper.setName("getPackage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "GetPackageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">GetPackageRequest"), com.xius.xbus.messages.selfcare.communityaccountservice.GetPackageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">GetPackageResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.communityaccountservice.GetPackageResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "GetPackageResponse"));
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
        oper.setName("managePackage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ManagePackageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">ManagePackageRequest"), com.xius.xbus.messages.selfcare.communityaccountservice.ManagePackageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">ManagePackageResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.communityaccountservice.ManagePackageResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ManagePackageResponse"));
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
        oper.setName("deletePackage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "DeletePackageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">DeletePackageRequest"), com.xius.xbus.messages.selfcare.communityaccountservice.DeletePackageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">DeletePackageResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.communityaccountservice.DeletePackageResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "DeletePackageResponse"));
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
        oper.setName("manageComuniAcct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ManageComuniAcctRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">ManageComuniAcctRequest"), com.xius.xbus.messages.selfcare.communityaccountservice.ManageComuniAcctRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">ManageComuniAcctResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.communityaccountservice.ManageComuniAcctResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ManageComuniAcctResponse"));
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
        oper.setName("getCommAcct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "GetCommAcctRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">GetCommAcctRequest"), com.xius.xbus.messages.selfcare.communityaccountservice.GetCommAcctRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">GetCommAcctResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.communityaccountservice.GetCommAcctResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "GetCommAcctResponse"));
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
        oper.setName("manageAddOnFtrs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ManageAddOnFtrsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">ManageAddOnFtrsRequest"), com.xius.xbus.messages.selfcare.communityaccountservice.ManageAddOnFtrsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">ManageAddOnFtrsResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.communityaccountservice.ManageAddOnFtrsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ManageAddOnFtrsResponse"));
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
        oper.setName("updateCAAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "UpdateCAAccountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">UpdateCAAccountRequest"), com.xius.xbus.messages.selfcare.communityaccountservice.UpdateCAAccountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">UpdateCAAccountResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.communityaccountservice.UpdateCAAccountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "UpdateCAAccountResponse"));
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
        oper.setName("manageCommActATP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ManageCommActATPRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">ManageCommActATPRequest"), com.xius.xbus.messages.selfcare.communityaccountservice.ManageCommActATPRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">ManageCommActATPResponse"));
        oper.setReturnClass(com.xius.xbus.messages.selfcare.communityaccountservice.ManageCommActATPResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ManageCommActATPResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[12] = oper;

    }

    public CommunityAccountServiceBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CommunityAccountServiceBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CommunityAccountServiceBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "CarrierIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

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

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ManageType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.ManageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "MessageIDType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "OptionFlagType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.OptionFlagType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "StatusCode");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.StatusCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "UpdateType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.UpdateType.class;
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

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">CARenwlRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.CARenwlRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">CARenwlResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.CARenwlResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">DeletePackageRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.DeletePackageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">DeletePackageResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.DeletePackageResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">GetAdnlFtrsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.GetAdnlFtrsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">GetAdnlFtrsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.GetAdnlFtrsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">GetCADetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.GetCADetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">GetCADetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.GetCADetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">GetCARenwlRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.GetCARenwlRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">GetCARenwlResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.GetCARenwlResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">GetCommAcctRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.GetCommAcctRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">GetCommAcctResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.GetCommAcctResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">GetPackageRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.GetPackageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">GetPackageResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.GetPackageResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">GetServiceDataRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.GetServiceDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">GetServiceDataResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.GetServiceDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">ManageAddOnFtrsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.ManageAddOnFtrsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">ManageAddOnFtrsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.ManageAddOnFtrsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">ManageCommActATPRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.ManageCommActATPRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">ManageCommActATPResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.ManageCommActATPResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">ManageComuniAcctRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.ManageComuniAcctRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">ManageComuniAcctResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.ManageComuniAcctResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">ManagePackageRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.ManagePackageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">ManagePackageResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.ManagePackageResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">UpdateCAAccountRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.UpdateCAAccountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">UpdateCAAccountResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.UpdateCAAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "AcctBalListsType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.AcctBalListsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "AddOnFeatrsDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.AddOnFeatrsDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "AddOnFtrsType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.AddOnFeatrsDataType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "AddOnFeatrsDataType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "AddOnFeatures");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "AdnlFetrListType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.AdnlFetType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "AdnlFetType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "adfeature");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "AdnlFetType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.AdnlFetType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "CAGroupType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.CAGroupType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "CaldrsListType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.CaldrType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "CaldrType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "calendar");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "CaldrType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.CaldrType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "CARenwlsType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.CARenwlType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "CARenwlType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "renewalInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "CARenwlType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.CARenwlType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ChildAcctDetailsViewType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.ChildAcctDetailsViewType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ChildAcctLimitListViewType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.ChildLimitItemViewType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ChildLimitItemViewType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "childLimit");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ChildAcctLmtListType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.ChildLmtItemType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ChildLmtItemType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "childLmt");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ChildAcctsType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.AcctBalListsType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "AcctBalListsType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "acctBalLists");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ChildAcctsViewType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.ChildAcctDetailsViewType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ChildAcctDetailsViewType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "childAcctDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ChildAcctViewType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.ChildAcctViewType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ChildLimitItemViewType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.ChildLimitItemViewType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ChildLmtItemType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.ChildLmtItemType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "CommunityGroupType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.CommunityGroupType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "DataZoneGroupInfoListType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.DataZoneGroupInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "DataZoneGroupInfoType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "dataZoneGroupInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "DataZoneGroupInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.DataZoneGroupInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "DeviceGroupInfoListType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.DeviceGroupInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "DeviceGroupInfoType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "deviceGroupInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "DeviceGroupInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.DeviceGroupInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ErrorDetailsItem");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.ErrorDetailsItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ErrorDetailsList");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.ErrorDetailsItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ErrorDetailsItem");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "errorDetailsList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "FailListType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.FailureType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "FailureType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "failure");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "FailureType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.FailureType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "GrpAddOnItemType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.GrpAddOnItemType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "GrpAddonListType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.GrpAddOnItemType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "GrpAddOnItemType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "grpAddOn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "GrpAddonsViewType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.GrpAddOnViewItemType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "GrpAddOnViewItemType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "grpAddOn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "GrpAddOnViewItemType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.GrpAddOnViewItemType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "IDType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.IDType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "NetwksType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.NetwksType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "PackageDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.PkgDetListType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "PkgDetListType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "package");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "PackageInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.PackageInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "PkgAdonMapListType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.PkgAdOnMapType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "PkgAdOnMapType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "pkgAdOnMap");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "PkgAdOnMapType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.PkgAdOnMapType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "PkgAdonsViewItemType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.PkgAdonsViewItemType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "PkgAdonsViewType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.PkgAdonsViewItemType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "PkgAdonsViewItemType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "pkgAddOn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "PkgDetListType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.PkgDetListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "PkgSrvcUnitsItemsType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.PkgSrvcUnitsItemsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "PkgSrvcUnitsType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.PkgSrvcUnitsItemsType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "PkgSrvcUnitsItemsType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "pkgServcUnit");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "PkgSrvcUnitsViewType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.PkgSrvcUtsViewItemType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "PkgSrvcUtsViewItemType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "pkgServcUnit");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "PkgSrvcUtsViewItemType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.PkgSrvcUtsViewItemType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "SerPlanCaldrsViewItemType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.SerPlanCaldrsViewItemType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "SerPlanCaldrsViewType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.SerPlanCaldrsViewItemType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "SerPlanCaldrsViewItemType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "servcPlanCalndr");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "SerPlanCalMapListType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.SerPlanCalMapType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "SerPlanCalMapType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "serPlanCalMap");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "SerPlanCalMapType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.SerPlanCalMapType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ServiceDataListType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.ServiceDataType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ServiceDataType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "serviceDataList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ServiceDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.ServiceDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ServiceUnitsType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.ServiceUnitType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ServiceUnitType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "unit");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ServiceUnitType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.ServiceUnitType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ServUnitsItemViewType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.ServUnitsItemViewType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ServUnitsViewType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.ServUnitsItemViewType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "ServUnitsItemViewType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "unit");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "Str100Type");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

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
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "Str1Type");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "VisNetwksListType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.selfcare.communityaccountservice.NetwksType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "NetwksType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "visNetwork");
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

    public com.xius.xbus.messages.selfcare.communityaccountservice.GetAdnlFtrsResponse getAdnlFtrs(com.xius.xbus.messages.selfcare.communityaccountservice.GetAdnlFtrsRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getAdnlFtrs");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getAdnlFtrs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.communityaccountservice.GetAdnlFtrsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.communityaccountservice.GetAdnlFtrsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.communityaccountservice.GetAdnlFtrsResponse.class);
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

    public com.xius.xbus.messages.selfcare.communityaccountservice.GetCARenwlResponse getCARenwl(com.xius.xbus.messages.selfcare.communityaccountservice.GetCARenwlRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getCARenwl");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCARenwl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.communityaccountservice.GetCARenwlResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.communityaccountservice.GetCARenwlResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.communityaccountservice.GetCARenwlResponse.class);
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

    public com.xius.xbus.messages.selfcare.communityaccountservice.CARenwlResponse caRenwl(com.xius.xbus.messages.selfcare.communityaccountservice.CARenwlRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("caRenwl");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "caRenwl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.communityaccountservice.CARenwlResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.communityaccountservice.CARenwlResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.communityaccountservice.CARenwlResponse.class);
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

    public com.xius.xbus.messages.selfcare.communityaccountservice.GetServiceDataResponse getServiceData(com.xius.xbus.messages.selfcare.communityaccountservice.GetServiceDataRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getServiceData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getServiceData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.communityaccountservice.GetServiceDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.communityaccountservice.GetServiceDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.communityaccountservice.GetServiceDataResponse.class);
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

    public com.xius.xbus.messages.selfcare.communityaccountservice.GetCADetailsResponse getCADetails(com.xius.xbus.messages.selfcare.communityaccountservice.GetCADetailsRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getCADetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCADetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.communityaccountservice.GetCADetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.communityaccountservice.GetCADetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.communityaccountservice.GetCADetailsResponse.class);
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

    public com.xius.xbus.messages.selfcare.communityaccountservice.GetPackageResponse getPackage(com.xius.xbus.messages.selfcare.communityaccountservice.GetPackageRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getPackage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getPackage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.communityaccountservice.GetPackageResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.communityaccountservice.GetPackageResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.communityaccountservice.GetPackageResponse.class);
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

    public com.xius.xbus.messages.selfcare.communityaccountservice.ManagePackageResponse managePackage(com.xius.xbus.messages.selfcare.communityaccountservice.ManagePackageRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("managePackage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "managePackage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.communityaccountservice.ManagePackageResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.communityaccountservice.ManagePackageResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.communityaccountservice.ManagePackageResponse.class);
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

    public com.xius.xbus.messages.selfcare.communityaccountservice.DeletePackageResponse deletePackage(com.xius.xbus.messages.selfcare.communityaccountservice.DeletePackageRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("deletePackage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deletePackage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.communityaccountservice.DeletePackageResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.communityaccountservice.DeletePackageResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.communityaccountservice.DeletePackageResponse.class);
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

    public com.xius.xbus.messages.selfcare.communityaccountservice.ManageComuniAcctResponse manageComuniAcct(com.xius.xbus.messages.selfcare.communityaccountservice.ManageComuniAcctRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("manageComuniAcct");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "manageComuniAcct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.communityaccountservice.ManageComuniAcctResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.communityaccountservice.ManageComuniAcctResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.communityaccountservice.ManageComuniAcctResponse.class);
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

    public com.xius.xbus.messages.selfcare.communityaccountservice.GetCommAcctResponse getCommAcct(com.xius.xbus.messages.selfcare.communityaccountservice.GetCommAcctRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getCommAcct");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCommAcct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.communityaccountservice.GetCommAcctResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.communityaccountservice.GetCommAcctResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.communityaccountservice.GetCommAcctResponse.class);
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

    public com.xius.xbus.messages.selfcare.communityaccountservice.ManageAddOnFtrsResponse manageAddOnFtrs(com.xius.xbus.messages.selfcare.communityaccountservice.ManageAddOnFtrsRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("manageAddOnFtrs");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "manageAddOnFtrs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.communityaccountservice.ManageAddOnFtrsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.communityaccountservice.ManageAddOnFtrsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.communityaccountservice.ManageAddOnFtrsResponse.class);
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

    public com.xius.xbus.messages.selfcare.communityaccountservice.UpdateCAAccountResponse updateCAAccount(com.xius.xbus.messages.selfcare.communityaccountservice.UpdateCAAccountRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updateCAAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateCAAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.communityaccountservice.UpdateCAAccountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.communityaccountservice.UpdateCAAccountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.communityaccountservice.UpdateCAAccountResponse.class);
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

    public com.xius.xbus.messages.selfcare.communityaccountservice.ManageCommActATPResponse manageCommActATP(com.xius.xbus.messages.selfcare.communityaccountservice.ManageCommActATPRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("manageCommActATP");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "manageCommActATP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.selfcare.communityaccountservice.ManageCommActATPResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.selfcare.communityaccountservice.ManageCommActATPResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.selfcare.communityaccountservice.ManageCommActATPResponse.class);
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
