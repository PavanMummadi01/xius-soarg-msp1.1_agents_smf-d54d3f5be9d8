/**
 * DeviceAppBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap_binding.servicemix;

public class DeviceAppBindingStub extends org.apache.axis.client.Stub implements soap_binding.servicemix.IDeviceAppPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[6];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateDeviceAddress");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "UpdateDeviceAddressRequest"), net.bcgi.si.messages.mvnoapi.device.UpdateDeviceAddressRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "UpdateDeviceAddressResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.device.UpdateDeviceAddressResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDeviceAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "GetDeviceAllRequest"), net.bcgi.si.messages.mvnoapi.device.GetDeviceAllRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "GetDeviceAllResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.device.GetDeviceAllResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "GetDeviceRequest"), net.bcgi.si.messages.mvnoapi.device.GetDeviceRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "GetDeviceResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.device.GetDeviceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDeviceNetworkData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "GetDeviceNetworkDataRequest"), net.bcgi.si.messages.mvnoapi.device.GetDeviceNetworkDataRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "GetDeviceNetworkDataResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.device.GetDeviceNetworkDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateDeviceAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "UpdateDeviceAllRequest"), net.bcgi.si.messages.mvnoapi.device.UpdateDeviceAllRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "UpdateDeviceAllResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.device.UpdateDeviceAllResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("prepaidActivationRetry");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "PrepaidActivationRetryRequest"), net.bcgi.si.messages.mvnoapi.device.PrepaidActivationRetryRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "PrepaidActivationRetryResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.device.PrepaidActivationRetryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

    }

    public DeviceAppBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public DeviceAppBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public DeviceAppBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "AdjustmentDetail");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.account.AdjustmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "ArrayOfAdjustmentDetail");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.account.AdjustmentDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "AdjustmentDetail");
            qName2 = new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "AdjustmentDetail");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "ArrayOfDetailRecord");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.account.DetailRecord[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "DetailRecord");
            qName2 = new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "DetailRecord");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "ArrayOfMiscInfo");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.account.MiscInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "MiscInfo");
            qName2 = new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "MiscInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "DetailRecord");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.account.DetailRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "MiscInfo");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.account.MiscInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ArrayOfErrorData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.ErrorData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ErrorData");
            qName2 = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ErrorData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "BillingAddressData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.BillingAddressData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ErrorCategory");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.ErrorCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ErrorData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.ErrorData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "GenderType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.GenderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "PersonalIdentityType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "SecurityId");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.SecurityId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "SelfcareAccountStatusType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.SelfcareAccountStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ServiceContext");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.ServiceContext.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "SeverityCode");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.SeverityCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "StatusCode");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.StatusCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "DeviceHardwareData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.device.DeviceHardwareData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "DeviceIdKey");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.device.DeviceIdKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "DeviceIdKeyType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.device.DeviceIdKeyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "DeviceLockData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.device.DeviceLockData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "DeviceNetworkData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.device.DeviceNetworkData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "GetDeviceAllRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.device.GetDeviceAllRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "GetDeviceAllResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.device.GetDeviceAllResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "GetDeviceNetworkDataRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.device.GetDeviceNetworkDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "GetDeviceNetworkDataResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.device.GetDeviceNetworkDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "GetDeviceRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.device.GetDeviceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "GetDeviceResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.device.GetDeviceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "PrepaidAccountDetails");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.device.PrepaidAccountDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "PrepaidActivationRetryRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.device.PrepaidActivationRetryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "PrepaidActivationRetryResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.device.PrepaidActivationRetryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "ServicePlanDetails");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.device.ServicePlanDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "UpdateDeviceAddressRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.device.UpdateDeviceAddressRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "UpdateDeviceAddressResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.device.UpdateDeviceAddressResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "UpdateDeviceAllRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.device.UpdateDeviceAllRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "UpdateDeviceAllResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.device.UpdateDeviceAllResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AccountId");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.AccountId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AccountIdKeyType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.AccountIdKeyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "MSISDNInfo");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.MSISDNInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "RegistrationType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.RegistrationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "subcriberAddressInfo");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.SubcriberAddressInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "subcriberPersonalInfo");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.SubcriberPersonalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "subscriberOtherInfo");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.SubscriberOtherInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getDevice");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getDeviceAll");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetDeviceAll.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getDeviceAllResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetDeviceAllResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getDeviceNetworkData");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetDeviceNetworkData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getDeviceNetworkDataResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetDeviceNetworkDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getDeviceResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetDeviceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">prepaidActivationRetry");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.PrepaidActivationRetry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">prepaidActivationRetryResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.PrepaidActivationRetryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">updateDeviceAddress");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.UpdateDeviceAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">updateDeviceAddressResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.UpdateDeviceAddressResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">updateDeviceAll");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.UpdateDeviceAll.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">updateDeviceAllResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.UpdateDeviceAllResponse.class;
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

    public net.bcgi.si.messages.mvnoapi.device.UpdateDeviceAddressResponse updateDeviceAddress(net.bcgi.si.messages.mvnoapi.device.UpdateDeviceAddressRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "updateDeviceAddress"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.device.UpdateDeviceAddressResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.device.UpdateDeviceAddressResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.device.UpdateDeviceAddressResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.device.GetDeviceAllResponse getDeviceAll(net.bcgi.si.messages.mvnoapi.device.GetDeviceAllRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "getDeviceAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.device.GetDeviceAllResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.device.GetDeviceAllResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.device.GetDeviceAllResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.device.GetDeviceResponse getDevice(net.bcgi.si.messages.mvnoapi.device.GetDeviceRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "getDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.device.GetDeviceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.device.GetDeviceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.device.GetDeviceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.device.GetDeviceNetworkDataResponse getDeviceNetworkData(net.bcgi.si.messages.mvnoapi.device.GetDeviceNetworkDataRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "getDeviceNetworkData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.device.GetDeviceNetworkDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.device.GetDeviceNetworkDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.device.GetDeviceNetworkDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.device.UpdateDeviceAllResponse updateDeviceAll(net.bcgi.si.messages.mvnoapi.device.UpdateDeviceAllRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "updateDeviceAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.device.UpdateDeviceAllResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.device.UpdateDeviceAllResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.device.UpdateDeviceAllResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.device.PrepaidActivationRetryResponse prepaidActivationRetry(net.bcgi.si.messages.mvnoapi.device.PrepaidActivationRetryRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "prepaidActivationRetry"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.device.PrepaidActivationRetryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.device.PrepaidActivationRetryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.device.PrepaidActivationRetryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
