/**
 * ProductBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.ProductManagement_wsdl;

public class ProductBindingStub extends org.apache.axis.client.Stub implements com.xius.billing.ProductManagement_wsdl.ProductPortType {
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
        oper.setName("getTpBundleDtls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getTpBundleDtlsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getTpBundleDtlsRequest"), com.xius.billing.ProductManagement_xsd.GetTpBundleDtlsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getTpBundleDtlsResponse"));
        oper.setReturnClass(com.xius.billing.ProductManagement_xsd.GetTpBundleDtlsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getTpBundleDtlsResponse"));
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
        oper.setName("getBundleBalances");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getBundleBalancesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getBundleBalancesRequest"), com.xius.billing.ProductManagement_xsd.GetBundleBalancesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getBundleBalancesResponse"));
        oper.setReturnClass(com.xius.billing.ProductManagement_xsd.GetBundleBalancesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getBundleBalancesResponse"));
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
        oper.setName("getProductDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getProductDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getProductDetailsRequest"), com.xius.billing.ProductManagement_xsd.GetProductDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getProductDetailsResponse"));
        oper.setReturnClass(com.xius.billing.ProductManagement_xsd.GetProductDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getProductDetailsResponse"));
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
        oper.setName("getBundleDtls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getBundleDtlsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getBundleDtlsRequest"), com.xius.billing.ProductManagement_xsd.GetBundleDtlsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getBundleDtlsResponse"));
        oper.setReturnClass(com.xius.billing.ProductManagement_xsd.GetBundleDtlsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getBundleDtlsResponse"));
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
        oper.setName("getTpDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getTpdetailsRsequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getTpdetailsRequest"), com.xius.billing.ProductManagement_xsd.GetTpdetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getTpdetailsResponse"));
        oper.setReturnClass(com.xius.billing.ProductManagement_xsd.GetTpdetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getTpdetailsResponse"));
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
        oper.setName("getAvailableTps");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getAvailableTpsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getAvailableTpsRequest"), com.xius.billing.ProductManagement_xsd.GetAvailableTpsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getAvailableTpsResponse"));
        oper.setReturnClass(com.xius.billing.ProductManagement_xsd.GetAvailableTpsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getAvailableTpsResponse"));
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
        oper.setName("productPurchage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "productPurchageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "productPurchageRequest"), com.xius.billing.ProductManagement_xsd.ProductPurchageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "productPurchageResponse"));
        oper.setReturnClass(com.xius.billing.ProductManagement_xsd.ProductPurchageResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "productPurchageResponse"));
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
        oper.setName("productPurchageEnquiry");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "productPurchageEnquiryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "productPurchageEnquiryRequest"), com.xius.billing.ProductManagement_xsd.ProductPurchageEnquiryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "productPurchageEnquiryResponse"));
        oper.setReturnClass(com.xius.billing.ProductManagement_xsd.ProductPurchageEnquiryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "productPurchageEnquiryResponse"));
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
        oper.setName("getProductDtls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getProductDtlsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getProductDtlsRequest"), com.xius.billing.ProductManagement_xsd.GetProductDtlsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getProductDtlsResponse"));
        oper.setReturnClass(com.xius.billing.ProductManagement_xsd.GetProductDtlsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getProductDtlsResponse"));
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
        oper.setName("getATPBenefits");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getATPBenefitsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getATPBenefitsRequest"), com.xius.billing.ProductManagement_xsd.GetATPBenefitsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getATPBenefitsResponse"));
        oper.setReturnClass(com.xius.billing.ProductManagement_xsd.GetATPBenefitsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getATPBenefitsResponse"));
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
        oper.setName("getRemainingBktBal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getRemainingBktBalRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getRemainingBktBalRequest"), com.xius.billing.ProductManagement_xsd.GetRemainingBktBalRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getRemainingBktBalResponse"));
        oper.setReturnClass(com.xius.billing.ProductManagement_xsd.GetRemainingBktBalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getRemainingBktBalResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[10] = oper;

    }

    public ProductBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ProductBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ProductBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "AttachedATPType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.AttachedATPType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "AvailableATPType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.AvailableATPType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "BenefitDtlsType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.BenefitDtlsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "BundleDtlsType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.BundleDtlsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "BundlesDtlsType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.BundleDtlsType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "BundleDtlsType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "BundleDtls");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "dataDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.DataDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getATPBenefitsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.GetATPBenefitsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getATPBenefitsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.GetATPBenefitsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getAvailableTpsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.GetAvailableTpsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getAvailableTpsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.GetAvailableTpsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getBundleBalancesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.GetBundleBalancesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getBundleBalancesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.GetBundleBalancesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getBundleDtlsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.GetBundleDtlsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getBundleDtlsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.GetBundleDtlsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getProductDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.GetProductDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getProductDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.GetProductDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getProductDtlsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.GetProductDtlsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getProductDtlsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.GetProductDtlsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getRemainingBktBalRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.GetRemainingBktBalRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getRemainingBktBalResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.GetRemainingBktBalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getTpBundleDtlsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.GetTpBundleDtlsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getTpBundleDtlsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.GetTpBundleDtlsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getTpdetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.GetTpdetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getTpdetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.GetTpdetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "globalDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.GlobalDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "MSISDNType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "planslistType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.PlansType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "plansType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "planlistName");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "plansType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.PlansType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "ProductDetailsDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.ProductDetailsDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "ProductDetailsTypeData");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.ProductDetailsDataType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "ProductDetailsDataType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "ProductDetailsTypeData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "ProductDtlsDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.ProductDtlsDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "ProductDtlsTypeData");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.ProductDtlsDataType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "ProductDtlsDataType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "ProductDtlsTypeData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "productPurchageEnquiryRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.ProductPurchageEnquiryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "productPurchageEnquiryResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.ProductPurchageEnquiryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "productPurchageEnquiryTypeData");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.ProductTransTypeData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "ProductTransTypeData");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "ProductTransData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "productPurchageRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.ProductPurchageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "productPurchageResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.ProductPurchageResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "ProductPurchageTypeData");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.ProductPurchageTypeData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "ProductTransTypeData");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.ProductTransTypeData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "smsDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.SmsDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "SubscribedTPType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.SubscribedTPType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "Types");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.Types.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "valueType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.ValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "voiceDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.billing.ProductManagement_xsd.VoiceDetailsType.class;
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

    public com.xius.billing.ProductManagement_xsd.GetTpBundleDtlsResponse getTpBundleDtls(com.xius.billing.ProductManagement_xsd.GetTpBundleDtlsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getTpBundleDtls");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTpBundleDtls"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.ProductManagement_xsd.GetTpBundleDtlsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.ProductManagement_xsd.GetTpBundleDtlsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.ProductManagement_xsd.GetTpBundleDtlsResponse.class);
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

    public com.xius.billing.ProductManagement_xsd.GetBundleBalancesResponse getBundleBalances(com.xius.billing.ProductManagement_xsd.GetBundleBalancesRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getBundleBalances");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBundleBalances"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.ProductManagement_xsd.GetBundleBalancesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.ProductManagement_xsd.GetBundleBalancesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.ProductManagement_xsd.GetBundleBalancesResponse.class);
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

    public com.xius.billing.ProductManagement_xsd.GetProductDetailsResponse getProductDetails(com.xius.billing.ProductManagement_xsd.GetProductDetailsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getProductDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getProductDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.ProductManagement_xsd.GetProductDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.ProductManagement_xsd.GetProductDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.ProductManagement_xsd.GetProductDetailsResponse.class);
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

    public com.xius.billing.ProductManagement_xsd.GetBundleDtlsResponse getBundleDtls(com.xius.billing.ProductManagement_xsd.GetBundleDtlsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getBundleDtls");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBundleDtls"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.ProductManagement_xsd.GetBundleDtlsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.ProductManagement_xsd.GetBundleDtlsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.ProductManagement_xsd.GetBundleDtlsResponse.class);
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

    public com.xius.billing.ProductManagement_xsd.GetTpdetailsResponse getTpDetails(com.xius.billing.ProductManagement_xsd.GetTpdetailsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getTpDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTpDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.ProductManagement_xsd.GetTpdetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.ProductManagement_xsd.GetTpdetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.ProductManagement_xsd.GetTpdetailsResponse.class);
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

    public com.xius.billing.ProductManagement_xsd.GetAvailableTpsResponse getAvailableTps(com.xius.billing.ProductManagement_xsd.GetAvailableTpsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getAvailableTps");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getAvailableTps"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.ProductManagement_xsd.GetAvailableTpsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.ProductManagement_xsd.GetAvailableTpsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.ProductManagement_xsd.GetAvailableTpsResponse.class);
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

    public com.xius.billing.ProductManagement_xsd.ProductPurchageResponse productPurchage(com.xius.billing.ProductManagement_xsd.ProductPurchageRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("productPurchage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "productPurchage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.ProductManagement_xsd.ProductPurchageResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.ProductManagement_xsd.ProductPurchageResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.ProductManagement_xsd.ProductPurchageResponse.class);
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

    public com.xius.billing.ProductManagement_xsd.ProductPurchageEnquiryResponse productPurchageEnquiry(com.xius.billing.ProductManagement_xsd.ProductPurchageEnquiryRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("productPurchageEnquiry");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "productPurchageEnquiry"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.ProductManagement_xsd.ProductPurchageEnquiryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.ProductManagement_xsd.ProductPurchageEnquiryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.ProductManagement_xsd.ProductPurchageEnquiryResponse.class);
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

    public com.xius.billing.ProductManagement_xsd.GetProductDtlsResponse getProductDtls(com.xius.billing.ProductManagement_xsd.GetProductDtlsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getProductDtls");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getProductDtls"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.ProductManagement_xsd.GetProductDtlsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.ProductManagement_xsd.GetProductDtlsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.ProductManagement_xsd.GetProductDtlsResponse.class);
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

    public com.xius.billing.ProductManagement_xsd.GetATPBenefitsResponse getATPBenefits(com.xius.billing.ProductManagement_xsd.GetATPBenefitsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getATPBenefits");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getATPBenefits"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.ProductManagement_xsd.GetATPBenefitsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.ProductManagement_xsd.GetATPBenefitsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.ProductManagement_xsd.GetATPBenefitsResponse.class);
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

    public com.xius.billing.ProductManagement_xsd.GetRemainingBktBalResponse getRemainingBktBal(com.xius.billing.ProductManagement_xsd.GetRemainingBktBalRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getRemainingBktBal");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getRemainingBktBal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.billing.ProductManagement_xsd.GetRemainingBktBalResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.billing.ProductManagement_xsd.GetRemainingBktBalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.billing.ProductManagement_xsd.GetRemainingBktBalResponse.class);
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
