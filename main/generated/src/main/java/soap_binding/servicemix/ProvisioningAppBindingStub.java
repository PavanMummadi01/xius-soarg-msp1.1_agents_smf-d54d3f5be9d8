/**
 * ProvisioningAppBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap_binding.servicemix;

public class ProvisioningAppBindingStub extends org.apache.axis.client.Stub implements soap_binding.servicemix.IProvisioningAppPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[42];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProvisioningLog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetProvisioningLogRequest"), net.bcgi.si.messages.mvnoapi.provisioning.GetProvisioningLogRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetProvisioningLogResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.GetProvisioningLogResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changePersonalIdentity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ChangePersonalIDRequest"), net.bcgi.si.messages.mvnoapi.provisioning.ChangePersonalIDRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ChangePersonalIDResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.ChangePersonalIDResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("initiatePortIn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "InitiatePortInRequest"), net.bcgi.si.messages.mvnoapi.provisioning.InitiatePortInRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "InitiatePortInResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.InitiatePortInResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAssociatedMSISDNs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetAssociatedMSISDNsRequest"), net.bcgi.si.messages.mvnoapi.provisioning.GetAssociatedMSISDNsRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetAssociatedMSISDNsResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.GetAssociatedMSISDNsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("simRegistration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "SIMRegistrationRequest"), net.bcgi.si.messages.mvnoapi.provisioning.SIMRegistrationRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "SIMRegistrationResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.SIMRegistrationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("abandonOrCancelPortIn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "CancelPortInRequest"), net.bcgi.si.messages.mvnoapi.provisioning.CancelPortInRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "CancelPortInResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.CancelPortInResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOrderDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetOrderDetailsRequest"), net.bcgi.si.messages.mvnoapi.provisioning.GetOrderDetailsRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetOrderDetailsResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.GetOrderDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("l4AdNotification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "L4AdNotificationRequest"), net.bcgi.si.messages.mvnoapi.provisioning.L4AdNotificationRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "L4AdNotificationResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.L4AdNotificationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("acceptPortIn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AcceptPortInRequest"), net.bcgi.si.messages.mvnoapi.provisioning.AcceptPortInRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AcceptPortInResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.AcceptPortInResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("initiateMNPNotifications");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "InitiateMNPNotificationsRequest"), net.bcgi.si.messages.mvnoapi.provisioning.InitiateMNPNotificationsRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "InitiateMNPNotificationsResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.InitiateMNPNotificationsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getESN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetESNRequest"), net.bcgi.si.messages.mvnoapi.provisioning.GetESNRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetESNResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.GetESNResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validatePortOut");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PortOutValidationRequest"), net.bcgi.si.messages.mvnoapi.provisioning.PortOutValidationRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PortOutValidationResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.PortOutValidationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPortInStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetPortInStatusRequest"), net.bcgi.si.messages.mvnoapi.provisioning.GetPortInStatusRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetPortInStatusResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.GetPortInStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modifyPortIn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PortInRequest"), net.bcgi.si.messages.mvnoapi.provisioning.PortInRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PortInResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.PortInResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCSA");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetCSARequest"), net.bcgi.si.messages.mvnoapi.provisioning.GetCSARequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetCSAResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.GetCSAResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeMDN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ChangeMDNRequest"), net.bcgi.si.messages.mvnoapi.provisioning.ChangeMDNRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ChangeMDNResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.ChangeMDNResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("portOutReseller");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PortOutResellerRequest"), net.bcgi.si.messages.mvnoapi.provisioning.PortOutResellerRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PortOutResellerResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.PortOutResellerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateSIMRecStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "UpdateRecStatusResquest"), net.bcgi.si.messages.mvnoapi.provisioning.UpdateRecStatusResquest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "UpdateRecStatusResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.UpdateRecStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activateAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ActivateAccountRequest"), net.bcgi.si.messages.mvnoapi.provisioning.ActivateAccountRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ActivateAccountResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.ActivateAccountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTransactionHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetTransactionHistoryRequest"), net.bcgi.si.messages.mvnoapi.provisioning.GetTransactionHistoryRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetTransactionHistoryResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.GetTransactionHistoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("swapSIM");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "SIMSwapRequest"), net.bcgi.si.messages.mvnoapi.provisioning.SIMSwapRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "SIMSwapResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.SIMSwapResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateSubDemographicDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "UpdateSubDemographicDetailsRequest"), net.bcgi.si.messages.mvnoapi.provisioning.UpdateSubDemographicDetailsRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "UpdateSubDemographicDetailsResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.UpdateSubDemographicDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPreferredMSISDNs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetPreferredMSISDNRequest"), net.bcgi.si.messages.mvnoapi.provisioning.GetPreferredMSISDNRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetPreferredMSISDNResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.GetPreferredMSISDNResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registerAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "RegisterAccountRequest"), net.bcgi.si.messages.mvnoapi.provisioning.RegisterAccountRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "RegisterAccountResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.RegisterAccountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateAccountStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "UpdateAccountStatusRequest"), net.bcgi.si.messages.mvnoapi.provisioning.UpdateAccountStatusRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "UpdateAccountStatusResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.UpdateAccountStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDesiredMSISDNs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetDesiredMSISDNsRequest"), net.bcgi.si.messages.mvnoapi.provisioning.GetDesiredMSISDNsRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetDesiredMSISDNsResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.GetDesiredMSISDNsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("postpaidActivation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "postpaidActivationRequest"), net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "postpaidActivationResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPortInData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetPortInDataRequest"), net.bcgi.si.messages.mvnoapi.provisioning.GetPortInDataRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetPortInDataResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.GetPortInDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("portOutDeactivation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PortOutDeactivationRequest"), net.bcgi.si.messages.mvnoapi.provisioning.PortOutDeactivationRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PortOutDeactivationResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.PortOutDeactivationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeESN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ChangeESNRequest"), net.bcgi.si.messages.mvnoapi.provisioning.ChangeESNRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ChangeESNResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.ChangeESNResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ping");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "PingRequest"), net.bcgi.si.messages.mvnoapi.common.PingRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "PingResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.common.PingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("prepaidRegistration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "prepaidRegistrationRequest"), net.bcgi.si.messages.mvnoapi.provisioning.PrepaidRegistrationRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "prepaidRegistrationResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.PrepaidRegistrationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("portStatusRequestDac");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PortStatusRequest"), net.bcgi.si.messages.mvnoapi.provisioning.PortStatusRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PortStatusResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.PortStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("portIn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PortInRequest"), net.bcgi.si.messages.mvnoapi.provisioning.PortInRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PortInResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.PortInResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("disassociateOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "DisassociateOrderRequest"), net.bcgi.si.messages.mvnoapi.provisioning.DisassociateOrderRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "DisassociateOrderResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.DisassociateOrderResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("uploadSIMs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "UploadSIMsRequest"), net.bcgi.si.messages.mvnoapi.provisioning.UploadSIMsRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "UploadSIMsResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.UploadSIMsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelPortIn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "CancelPortInRequest"), net.bcgi.si.messages.mvnoapi.provisioning.CancelPortInRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "CancelPortInResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.CancelPortInResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("prepaidActivation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "prepaidActivationRequest"), net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "prepaidActivationResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("prepaidActivationRest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "prepaidActivationRestRequest"), net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationRestRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "prepaidActivationRestResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationRestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("postpaidActivationRest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "postpaidActivationRestRequest"), net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationRestRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "postpaidActivationRestResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationRestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changePortInDueDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PortInDueDateChangeRequest"), net.bcgi.si.messages.mvnoapi.provisioning.PortInDueDateChangeRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ChangeDueDateResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.ChangeDueDateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTransactionDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetTransactionDetailsRequest"), net.bcgi.si.messages.mvnoapi.provisioning.GetTransactionDetailsRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetTransactionDetailsResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.provisioning.GetTransactionDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

    }

    public ProvisioningAppBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ProvisioningAppBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ProvisioningAppBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "Duration");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.account.Duration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "AlternateAccountId");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.AlternateAccountId.class;
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

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ArrayOfIdData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.IdData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "IdData");
            qName2 = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "IdData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ArrayOfNameValuePair");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.NameValuePair[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "NameValuePair");
            qName2 = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "NameValuePair");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ArrayOfRejectData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.RejectData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "RejectData");
            qName2 = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "RejectData");
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

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "IdData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.IdData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "NameValuePair");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.NameValuePair.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "PersonalIdentityType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "PingRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.PingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "PingResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.PingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "PostpaidDetails");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.PostpaidDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "RejectData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.RejectData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "UploadType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.UploadType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "UserType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.UserType.class;
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

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AcceptPortInRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.AcceptPortInRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AcceptPortInResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.AcceptPortInResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AccountChallengeData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.AccountChallengeData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AccountConfigInfo");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.AccountConfigInfo.class;
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

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AccountInfo");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.AccountInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ActivateAccountRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.ActivateAccountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ActivateAccountResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.ActivateAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AddressInfo");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.AddressInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AllocateMSISDNType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.AllocateMSISDNType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ArrayOfAssociatedMSISDN");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.AssociatedMSISDN[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AssociatedMSISDN");
            qName2 = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AssociatedMSISDN");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ArrayOfFailedMSISDN");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.FailedMSISDN[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "FailedMSISDN");
            qName2 = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "FailedMSISDN");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ArrayOfFailureListType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.FailureListType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "FailureListType");
            qName2 = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "FailureListType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ArrayOfOrderDetails");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.OrderDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "OrderDetails");
            qName2 = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "OrderDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ArrayOfPortInMSISDN");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.PortInMSISDN[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "portInMSISDN");
            qName2 = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "portInMSISDN");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ArrayOfProvisioningJournal");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.ProvisioningJournal[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ProvisioningJournal");
            qName2 = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ProvisioningJournal");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ArrayOfProvisioningLog");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.ProvisioningLog[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ProvisioningLog");
            qName2 = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ProvisioningLog");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ArrayOfTransactionInfo");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.TransactionInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "TransactionInfo");
            qName2 = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "TransactionInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AssociatedMSISDN");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.AssociatedMSISDN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "BillingMethodType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.BillingMethodType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "CancelPortInRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.CancelPortInRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "CancelPortInResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.CancelPortInResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ChangeDueDateResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.ChangeDueDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ChangeESNRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.ChangeESNRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ChangeESNResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.ChangeESNResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ChangeMDNRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.ChangeMDNRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ChangeMDNResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.ChangeMDNResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ChangePersonalIDRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.ChangePersonalIDRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ChangePersonalIDResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.ChangePersonalIDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "childAddAccType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.ChildAddAccType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "CreditCardType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.CreditCardType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "CustomerType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.CustomerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "DialableNumberData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.DialableNumberData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "DisassociateOrderRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.DisassociateOrderRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "DisassociateOrderResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.DisassociateOrderResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "EmailNotificationType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.EmailNotificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "FailedMSISDN");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.FailedMSISDN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "FailureListType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.FailureListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetAssociatedMSISDNsRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.GetAssociatedMSISDNsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetAssociatedMSISDNsResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.GetAssociatedMSISDNsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetCSARequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.GetCSARequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetCSAResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.GetCSAResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetDesiredMSISDNsRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.GetDesiredMSISDNsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetDesiredMSISDNsResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.GetDesiredMSISDNsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetESNRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.GetESNRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetESNResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.GetESNResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetOrderDetailsRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.GetOrderDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetOrderDetailsResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.GetOrderDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetPortInDataRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.GetPortInDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetPortInDataResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.GetPortInDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetPortInStatusRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.GetPortInStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetPortInStatusResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.GetPortInStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetPreferredMSISDNRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.GetPreferredMSISDNRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetPreferredMSISDNResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.GetPreferredMSISDNResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetProvisioningLogRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.GetProvisioningLogRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetProvisioningLogResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.GetProvisioningLogResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetTransactionDetailsRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.GetTransactionDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetTransactionDetailsResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.GetTransactionDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetTransactionHistoryRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.GetTransactionHistoryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetTransactionHistoryResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.GetTransactionHistoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "IdentityData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.IdentityData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "InitiateMNPNotificationsRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.InitiateMNPNotificationsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "InitiateMNPNotificationsResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.InitiateMNPNotificationsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "InitiatePortInRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.InitiatePortInRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "InitiatePortInResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.InitiatePortInResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "L4AdNotificationRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.L4AdNotificationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "L4AdNotificationResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.L4AdNotificationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "L4AdNotificationType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.L4AdNotificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "MSISDNInfo");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.MSISDNInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "MSISDNValidationStatus");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.MSISDNValidationStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "NotificationPurposeType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.NotificationPurposeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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
            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "NotificationType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.NotificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "OrderDetails");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.OrderDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PaymentInfo");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.PaymentInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PersonalData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.PersonalData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PortInDueDateChangeRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.PortInDueDateChangeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "portInMSISDN");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.PortInMSISDN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PortInRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.PortInRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PortInResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.PortInResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PortOutDeactivationRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.PortOutDeactivationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PortOutDeactivationResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.PortOutDeactivationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PortOutResellerRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.PortOutResellerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PortOutResellerResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.PortOutResellerResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PortOutValidationRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.PortOutValidationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PortOutValidationResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.PortOutValidationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PortStatusRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.PortStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PortStatusResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.PortStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "postpaidActivationRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "postpaidActivationResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "postpaidActivationRestRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationRestRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "postpaidActivationRestResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationRestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "prepaidActivationRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "prepaidActivationResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "prepaidActivationRestRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationRestRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "prepaidActivationRestResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationRestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "prepaidRegistrationRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.PrepaidRegistrationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "prepaidRegistrationResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.PrepaidRegistrationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ProvisioningJournal");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.ProvisioningJournal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ProvisioningLog");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.ProvisioningLog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "RegisterAccountRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.RegisterAccountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "RegisterAccountResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.RegisterAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "RegistrationFeeDetails");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.RegistrationFeeDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "RegistrationType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.RegistrationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "SIMRegistrationRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.SIMRegistrationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "SIMRegistrationResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.SIMRegistrationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "SIMSwapRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.SIMSwapRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "SIMSwapResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.SIMSwapResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "SIMValidationStatus");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.SIMValidationStatus.class;
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

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "SubscriberDetails");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.SubscriberDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "subscriberOtherInfo");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.SubscriberOtherInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "TransactionInfo");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.TransactionInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "UpdateAccountStatusRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.UpdateAccountStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "UpdateAccountStatusResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.UpdateAccountStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "UpdateRecStatusResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.UpdateRecStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "UpdateRecStatusResquest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.UpdateRecStatusResquest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "UpdateSubDemographicDetailsRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.UpdateSubDemographicDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "UpdateSubDemographicDetailsResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.UpdateSubDemographicDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "UploadSIMsRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.UploadSIMsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "UploadSIMsResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.UploadSIMsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "UserDefinedInfo");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.UserDefinedInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "UserType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.UserType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountStatus");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.AccountStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountStatusType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.AccountStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "RegisterAccountBillingData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.RegisterAccountBillingData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "SubscriberStatusType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.SubscriberStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">abandonOrCancelPortIn");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.AbandonOrCancelPortIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">abandonOrCancelPortInResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.AbandonOrCancelPortInResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">acceptPortIn");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.AcceptPortIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">acceptPortInResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.AcceptPortInResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">activateAccount");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.ActivateAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">activateAccountResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.ActivateAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">cancelPortIn");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.CancelPortIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">cancelPortInResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.CancelPortInResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">changeESN");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.ChangeESN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">changeESNResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.ChangeESNResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">changeMDN");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.ChangeMDN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">changeMDNResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.ChangeMDNResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">changePersonalIdentity");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.ChangePersonalIdentity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">changePersonalIdentityResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.ChangePersonalIdentityResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">changePortInDueDate");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.ChangePortInDueDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">changePortInDueDateResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.ChangePortInDueDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">disassociateOrder");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.DisassociateOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">disassociateOrderResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.DisassociateOrderResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getAssociatedMSISDNs");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetAssociatedMSISDNs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getAssociatedMSISDNsResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetAssociatedMSISDNsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getCSA");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetCSA.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getCSAResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetCSAResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getDesiredMSISDNs");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetDesiredMSISDNs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getDesiredMSISDNsResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetDesiredMSISDNsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getESN");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetESN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getESNResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetESNResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getOrderDetails");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetOrderDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getOrderDetailsResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetOrderDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getPortInData");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetPortInData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getPortInDataResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetPortInDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getPortInStatus");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetPortInStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getPortInStatusResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetPortInStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getPreferredMSISDNs");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetPreferredMSISDNs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getPreferredMSISDNsResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetPreferredMSISDNsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getProvisioningLog");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetProvisioningLog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getProvisioningLogResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetProvisioningLogResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getTransactionDetails");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetTransactionDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getTransactionDetailsResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetTransactionDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getTransactionHistory");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetTransactionHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getTransactionHistoryResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetTransactionHistoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">initiateMNPNotifications");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.InitiateMNPNotifications.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">initiateMNPNotificationsResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.InitiateMNPNotificationsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">initiatePortIn");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.InitiatePortIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">initiatePortInResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.InitiatePortInResponse.class;
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
            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">l4AdNotification");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.L4AdNotification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">l4AdNotificationResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.L4AdNotificationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">modifyPortIn");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.ModifyPortIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">modifyPortInResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.ModifyPortInResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">ping");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.Ping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">pingResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.PingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">portIn");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.PortIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">portInResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.PortInResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">portOutDeactivation");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.PortOutDeactivation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">portOutDeactivationResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.PortOutDeactivationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">portOutReseller");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.PortOutReseller.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">portOutResellerResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.PortOutResellerResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">portStatusRequestDac");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.PortStatusRequestDac.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">portStatusRequestDacResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.PortStatusRequestDacResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">postpaidActivation");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.PostpaidActivation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">postpaidActivationResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.PostpaidActivationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">postpaidActivationRest");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.PostpaidActivationRest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">postpaidActivationRestResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.PostpaidActivationRestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">prepaidActivation");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.PrepaidActivation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">prepaidActivationResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.PrepaidActivationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">prepaidActivationRest");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.PrepaidActivationRest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">prepaidActivationRestResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.PrepaidActivationRestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">prepaidRegistration");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.PrepaidRegistration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">prepaidRegistrationResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.PrepaidRegistrationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">registerAccount");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.RegisterAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">registerAccountResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.RegisterAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">simRegistration");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.SimRegistration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">simRegistrationResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.SimRegistrationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">swapSIM");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.SwapSIM.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">swapSIMResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.SwapSIMResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">updateAccountStatus");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.UpdateAccountStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">updateAccountStatusResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.UpdateAccountStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">updateSIMRecStatus");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.UpdateSIMRecStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">updateSIMRecStatusResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.UpdateSIMRecStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">updateSubDemographicDetails");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.UpdateSubDemographicDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">updateSubDemographicDetailsResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.UpdateSubDemographicDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">uploadSIMs");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.UploadSIMs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">uploadSIMsResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.UploadSIMsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">validatePortOut");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.ValidatePortOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">validatePortOutResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.ValidatePortOutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:servicemix:soap-binding", "string");
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

    public net.bcgi.si.messages.mvnoapi.provisioning.GetProvisioningLogResponse getProvisioningLog(net.bcgi.si.messages.mvnoapi.provisioning.GetProvisioningLogRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "getProvisioningLog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.GetProvisioningLogResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.GetProvisioningLogResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.GetProvisioningLogResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.ChangePersonalIDResponse changePersonalIdentity(net.bcgi.si.messages.mvnoapi.provisioning.ChangePersonalIDRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "changePersonalIdentity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.ChangePersonalIDResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.ChangePersonalIDResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.ChangePersonalIDResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.InitiatePortInResponse initiatePortIn(net.bcgi.si.messages.mvnoapi.provisioning.InitiatePortInRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "initiatePortIn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.InitiatePortInResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.InitiatePortInResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.InitiatePortInResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.GetAssociatedMSISDNsResponse getAssociatedMSISDNs(net.bcgi.si.messages.mvnoapi.provisioning.GetAssociatedMSISDNsRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "getAssociatedMSISDNs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.GetAssociatedMSISDNsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.GetAssociatedMSISDNsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.GetAssociatedMSISDNsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.SIMRegistrationResponse simRegistration(net.bcgi.si.messages.mvnoapi.provisioning.SIMRegistrationRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "simRegistration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.SIMRegistrationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.SIMRegistrationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.SIMRegistrationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.CancelPortInResponse abandonOrCancelPortIn(net.bcgi.si.messages.mvnoapi.provisioning.CancelPortInRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "abandonOrCancelPortIn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.CancelPortInResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.CancelPortInResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.CancelPortInResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.GetOrderDetailsResponse getOrderDetails(net.bcgi.si.messages.mvnoapi.provisioning.GetOrderDetailsRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "getOrderDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.GetOrderDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.GetOrderDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.GetOrderDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.L4AdNotificationResponse l4AdNotification(net.bcgi.si.messages.mvnoapi.provisioning.L4AdNotificationRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "l4AdNotification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.L4AdNotificationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.L4AdNotificationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.L4AdNotificationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.AcceptPortInResponse acceptPortIn(net.bcgi.si.messages.mvnoapi.provisioning.AcceptPortInRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "acceptPortIn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.AcceptPortInResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.AcceptPortInResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.AcceptPortInResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.InitiateMNPNotificationsResponse initiateMNPNotifications(net.bcgi.si.messages.mvnoapi.provisioning.InitiateMNPNotificationsRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "initiateMNPNotifications"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.InitiateMNPNotificationsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.InitiateMNPNotificationsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.InitiateMNPNotificationsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.GetESNResponse getESN(net.bcgi.si.messages.mvnoapi.provisioning.GetESNRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "getESN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.GetESNResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.GetESNResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.GetESNResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.PortOutValidationResponse validatePortOut(net.bcgi.si.messages.mvnoapi.provisioning.PortOutValidationRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "validatePortOut"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.PortOutValidationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.PortOutValidationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.PortOutValidationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.GetPortInStatusResponse getPortInStatus(net.bcgi.si.messages.mvnoapi.provisioning.GetPortInStatusRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "getPortInStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.GetPortInStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.GetPortInStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.GetPortInStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.PortInResponse modifyPortIn(net.bcgi.si.messages.mvnoapi.provisioning.PortInRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "modifyPortIn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.PortInResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.PortInResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.PortInResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.GetCSAResponse getCSA(net.bcgi.si.messages.mvnoapi.provisioning.GetCSARequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "getCSA"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.GetCSAResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.GetCSAResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.GetCSAResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.ChangeMDNResponse changeMDN(net.bcgi.si.messages.mvnoapi.provisioning.ChangeMDNRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "changeMDN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.ChangeMDNResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.ChangeMDNResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.ChangeMDNResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.PortOutResellerResponse portOutReseller(net.bcgi.si.messages.mvnoapi.provisioning.PortOutResellerRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "portOutReseller"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.PortOutResellerResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.PortOutResellerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.PortOutResellerResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.UpdateRecStatusResponse updateSIMRecStatus(net.bcgi.si.messages.mvnoapi.provisioning.UpdateRecStatusResquest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "updateSIMRecStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.UpdateRecStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.UpdateRecStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.UpdateRecStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.ActivateAccountResponse activateAccount(net.bcgi.si.messages.mvnoapi.provisioning.ActivateAccountRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "activateAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.ActivateAccountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.ActivateAccountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.ActivateAccountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.GetTransactionHistoryResponse getTransactionHistory(net.bcgi.si.messages.mvnoapi.provisioning.GetTransactionHistoryRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "getTransactionHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.GetTransactionHistoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.GetTransactionHistoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.GetTransactionHistoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.SIMSwapResponse swapSIM(net.bcgi.si.messages.mvnoapi.provisioning.SIMSwapRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "swapSIM"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.SIMSwapResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.SIMSwapResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.SIMSwapResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.UpdateSubDemographicDetailsResponse updateSubDemographicDetails(net.bcgi.si.messages.mvnoapi.provisioning.UpdateSubDemographicDetailsRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "updateSubDemographicDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.UpdateSubDemographicDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.UpdateSubDemographicDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.UpdateSubDemographicDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.GetPreferredMSISDNResponse getPreferredMSISDNs(net.bcgi.si.messages.mvnoapi.provisioning.GetPreferredMSISDNRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "getPreferredMSISDNs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.GetPreferredMSISDNResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.GetPreferredMSISDNResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.GetPreferredMSISDNResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.RegisterAccountResponse registerAccount(net.bcgi.si.messages.mvnoapi.provisioning.RegisterAccountRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "registerAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.RegisterAccountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.RegisterAccountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.RegisterAccountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.UpdateAccountStatusResponse updateAccountStatus(net.bcgi.si.messages.mvnoapi.provisioning.UpdateAccountStatusRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "updateAccountStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.UpdateAccountStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.UpdateAccountStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.UpdateAccountStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.GetDesiredMSISDNsResponse getDesiredMSISDNs(net.bcgi.si.messages.mvnoapi.provisioning.GetDesiredMSISDNsRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "getDesiredMSISDNs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.GetDesiredMSISDNsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.GetDesiredMSISDNsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.GetDesiredMSISDNsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationResponse postpaidActivation(net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "postpaidActivation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.GetPortInDataResponse getPortInData(net.bcgi.si.messages.mvnoapi.provisioning.GetPortInDataRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "getPortInData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.GetPortInDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.GetPortInDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.GetPortInDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.PortOutDeactivationResponse portOutDeactivation(net.bcgi.si.messages.mvnoapi.provisioning.PortOutDeactivationRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "portOutDeactivation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.PortOutDeactivationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.PortOutDeactivationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.PortOutDeactivationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.ChangeESNResponse changeESN(net.bcgi.si.messages.mvnoapi.provisioning.ChangeESNRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "changeESN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.ChangeESNResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.ChangeESNResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.ChangeESNResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.common.PingResponse ping(net.bcgi.si.messages.mvnoapi.common.PingRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "ping"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.common.PingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.common.PingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.common.PingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.PrepaidRegistrationResponse prepaidRegistration(net.bcgi.si.messages.mvnoapi.provisioning.PrepaidRegistrationRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "prepaidRegistration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.PrepaidRegistrationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.PrepaidRegistrationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.PrepaidRegistrationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.PortStatusResponse portStatusRequestDac(net.bcgi.si.messages.mvnoapi.provisioning.PortStatusRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "portStatusRequestDac"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.PortStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.PortStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.PortStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.PortInResponse portIn(net.bcgi.si.messages.mvnoapi.provisioning.PortInRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "portIn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.PortInResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.PortInResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.PortInResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.DisassociateOrderResponse disassociateOrder(net.bcgi.si.messages.mvnoapi.provisioning.DisassociateOrderRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "disassociateOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.DisassociateOrderResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.DisassociateOrderResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.DisassociateOrderResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.UploadSIMsResponse uploadSIMs(net.bcgi.si.messages.mvnoapi.provisioning.UploadSIMsRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "uploadSIMs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.UploadSIMsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.UploadSIMsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.UploadSIMsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.CancelPortInResponse cancelPortIn(net.bcgi.si.messages.mvnoapi.provisioning.CancelPortInRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "cancelPortIn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.CancelPortInResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.CancelPortInResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.CancelPortInResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationResponse prepaidActivation(net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "prepaidActivation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationRestResponse prepaidActivationRest(net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationRestRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "prepaidActivationRest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationRestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationRestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationRestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationRestResponse postpaidActivationRest(net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationRestRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "postpaidActivationRest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationRestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationRestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationRestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.ChangeDueDateResponse changePortInDueDate(net.bcgi.si.messages.mvnoapi.provisioning.PortInDueDateChangeRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "changePortInDueDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.ChangeDueDateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.ChangeDueDateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.ChangeDueDateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.provisioning.GetTransactionDetailsResponse getTransactionDetails(net.bcgi.si.messages.mvnoapi.provisioning.GetTransactionDetailsRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "getTransactionDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.provisioning.GetTransactionDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.provisioning.GetTransactionDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.provisioning.GetTransactionDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
