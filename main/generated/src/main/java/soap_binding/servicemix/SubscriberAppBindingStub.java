/**
 * SubscriberAppBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap_binding.servicemix;

public class SubscriberAppBindingStub extends org.apache.axis.client.Stub implements soap_binding.servicemix.ISubscriberAppPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[31];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAccountNote");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetAccountNoteRequest"), net.bcgi.si.messages.mvnoapi.subscriber.GetAccountNoteRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetAccountNoteResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.GetAccountNoteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDropdown");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetDropdownRequest"), net.bcgi.si.messages.mvnoapi.subscriber.GetDropdownRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetDropdownResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.GetDropdownResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateCallReason");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdateCallReasonRequest"), net.bcgi.si.messages.mvnoapi.subscriber.UpdateCallReasonRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdateCallReasonResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.UpdateCallReasonResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSubscriberInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetSubscriberInfoRequest"), net.bcgi.si.messages.mvnoapi.subscriber.GetSubscriberInfoRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetSubscriberInfoResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.GetSubscriberInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("authenticate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AuthenticateRequest"), net.bcgi.si.messages.mvnoapi.subscriber.AuthenticateRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AuthenticateResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.AuthenticateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetAccountRequest"), net.bcgi.si.messages.mvnoapi.subscriber.GetAccountRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetAccountResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.GetAccountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRegionDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetRegionDetailsRequest"), net.bcgi.si.messages.mvnoapi.subscriber.GetRegionDetailsRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetRegionDetailsResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.GetRegionDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSubscriberProfileInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetSubscriberProfileInfoRequest"), net.bcgi.si.messages.mvnoapi.subscriber.GetSubscriberProfileInfoRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetSubscriberProfileInfoResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.GetSubscriberProfileInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAbbrevatedAccountNotes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetAbbrevatedAccountNotesRequest"), net.bcgi.si.messages.mvnoapi.subscriber.GetAbbrevatedAccountNotesRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetAbbrevatedAccountNotesResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.GetAbbrevatedAccountNotesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateAccountPersonal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdateAccountPersonalRequest"), net.bcgi.si.messages.mvnoapi.subscriber.UpdateAccountPersonalRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdateAccountPersonalResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.UpdateAccountPersonalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findAccounts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "FindAccountsRequest"), net.bcgi.si.messages.mvnoapi.subscriber.FindAccountsRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "FindAccountsResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.FindAccountsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateCorpSubscriberInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdateSubscriberInfoRequest"), net.bcgi.si.messages.mvnoapi.subscriber.UpdateSubscriberInfoRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdateSubscriberInfoResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.UpdateSubscriberInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addTroubleTicket");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AddTroubleTicketRequest"), net.bcgi.si.messages.mvnoapi.subscriber.AddTroubleTicketRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AddTroubleTicketResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.AddTroubleTicketResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("viewTroubleTicket");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ViewTroubleTicketRequest"), net.bcgi.si.messages.mvnoapi.subscriber.ViewTroubleTicketRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ViewTroubleTicketResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.ViewTroubleTicketResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateAccountNote");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdateAccountNoteRequest"), net.bcgi.si.messages.mvnoapi.subscriber.UpdateAccountNoteRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdateAccountNoteResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.UpdateAccountNoteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetSubscriberRequest"), net.bcgi.si.messages.mvnoapi.subscriber.GetSubscriberRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetSubscriberResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.GetSubscriberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manageRegionDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ManageRegionDetailsRequest"), net.bcgi.si.messages.mvnoapi.subscriber.ManageRegionDetailsRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ManageRegionDetailsResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.ManageRegionDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAccountPersonal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetAccountPersonalRequest"), net.bcgi.si.messages.mvnoapi.subscriber.GetAccountPersonalRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetAccountPersonalResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.GetAccountPersonalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

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
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("forgotPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ForgotPasswordRequest"), net.bcgi.si.messages.mvnoapi.subscriber.ForgotPasswordRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ForgotPasswordResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.ForgotPasswordResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changePassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ChangePasswordRequest"), net.bcgi.si.messages.mvnoapi.subscriber.ChangePasswordRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ChangePasswordResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.ChangePasswordResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("forgotUserName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ForgotUserNameRequest"), net.bcgi.si.messages.mvnoapi.subscriber.ForgotUserNameRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ForgotUserNameResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.ForgotUserNameResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPrepaidAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "PrepaidAccountDetailsRequest"), net.bcgi.si.messages.mvnoapi.subscriber.PrepaidAccountDetailsRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "PrepaidAccountDetailsResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.PrepaidAccountDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addAccountNote");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AddAccountNoteRequest"), net.bcgi.si.messages.mvnoapi.subscriber.AddAccountNoteRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AddAccountNoteResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.AddAccountNoteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updatSubscriberInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdateSubscriberInfoRequest"), net.bcgi.si.messages.mvnoapi.subscriber.UpdateSubscriberInfoRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdateSubscriberInfoResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.UpdateSubscriberInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addAccountHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AddAccountHistoryRequest"), net.bcgi.si.messages.mvnoapi.subscriber.AddAccountHistoryRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AddAccountHistoryResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.AddAccountHistoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updatePrepaidAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdatePrepaidAccountDetailsRequest"), net.bcgi.si.messages.mvnoapi.subscriber.UpdatePrepaidAccountDetailsRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdatePrepaidAccountDetailsResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.UpdatePrepaidAccountDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAccountHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetAccountHistoryRequest"), net.bcgi.si.messages.mvnoapi.subscriber.GetAccountHistoryRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetAccountHistoryResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.GetAccountHistoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateAccountDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdateAccountDetailsRequest"), net.bcgi.si.messages.mvnoapi.subscriber.UpdateAccountDetailsRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdateAccountDetailsResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.UpdateAccountDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("syncUpload");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "SyncUploadRequest"), net.bcgi.si.messages.mvnoapi.subscriber.SyncUploadRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "SyncUploadResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.SyncUploadResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNetworkID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetNetworkIDRequest"), net.bcgi.si.messages.mvnoapi.subscriber.GetNetworkIDRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetNetworkIDResponse"));
        oper.setReturnClass(net.bcgi.si.messages.mvnoapi.subscriber.GetNetworkIDResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

    }

    public SubscriberAppBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SubscriberAppBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SubscriberAppBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "AccountType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.AccountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ArrayOfNameValuePair");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.NameValuePair[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "NameValuePair");
            qName2 = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "NameValuePair");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ArrayOfRegionDetails");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.RegionDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "RegionDetails");
            qName2 = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "RegionDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "BillingAccountIdKey");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.BillingAccountIdKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "BillingAddressData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.BillingAddressData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "BillingIdKeyType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.BillingIdKeyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "FetchByType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.FetchByType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "GenderType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.GenderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "NameValuePair");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.NameValuePair.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "OperationType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.OperationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "RegionDetails");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.RegionDetails.class;
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

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "SyncUploadType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.SyncUploadType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "UserType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.common.UserType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "DeviceNetworkData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.device.DeviceNetworkData.class;
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

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "BillingMethodType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.BillingMethodType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "DialableNumberData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.DialableNumberData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PersonalData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.PersonalData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "UserDefinedInfo");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.provisioning.UserDefinedInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AbbrevatedAccountNoteData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.AbbrevatedAccountNoteData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountHistoryData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.AccountHistoryData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountHistoryFilterData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.AccountHistoryFilterData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountId");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.AccountId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountIdKeyType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.AccountIdKeyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountNoteData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.AccountNoteData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountNumberMap");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.AccountNumberMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountPersonalData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.AccountPersonalData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountPreferences");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.AccountPreferences.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AddAccountHistoryRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.AddAccountHistoryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AddAccountHistoryResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.AddAccountHistoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AddAccountNoteRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.AddAccountNoteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AddAccountNoteResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.AddAccountNoteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AddressData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.AddressData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AddTroubleTicketRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.AddTroubleTicketRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AddTroubleTicketResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.AddTroubleTicketResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ArrayOfAbbrevatedAccountNoteData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.AbbrevatedAccountNoteData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AbbrevatedAccountNoteData");
            qName2 = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AbbrevatedAccountNoteData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ArrayOfAccountHistoryData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.AccountHistoryData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountHistoryData");
            qName2 = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountHistoryData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ArrayOfAccountNoteData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.AccountNoteData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountNoteData");
            qName2 = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountNoteData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ArrayOfDropdownData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.DropdownData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "DropdownData");
            qName2 = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "DropdownData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ArrayOfFindAccountData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.FindAccountData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "FindAccountData");
            qName2 = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "FindAccountData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ArrayOfSubscriberProfileInfo");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.SubscriberProfileInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "SubscriberProfileInfo");
            qName2 = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "SubscriberProfileInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ArrayOfSyncUploadError");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.SyncUploadError[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "SyncUploadError");
            qName2 = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "SyncUploadError");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ArrayOfTroubleTicketData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.TroubleTicketData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "TroubleTicketData");
            qName2 = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "TroubleTicketData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AuthenticateRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.AuthenticateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AuthenticateResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.AuthenticateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "BalanceDetails");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.BalanceDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "BucketBalances");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.BucketBalances.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ChangePasswordRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.ChangePasswordRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ChangePasswordResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.ChangePasswordResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "DetailsInfo");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.DetailsInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "DropdownData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.DropdownData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "DropdownFilterData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.DropdownFilterData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "FindAccountData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.FindAccountData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "FindAccountFilterData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.FindAccountFilterData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "FindAccountsRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.FindAccountsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "FindAccountsResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.FindAccountsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ForgotPasswordRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.ForgotPasswordRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ForgotPasswordResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.ForgotPasswordResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ForgotUserNameRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.ForgotUserNameRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ForgotUserNameResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.ForgotUserNameResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetAbbrevatedAccountNotesRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.GetAbbrevatedAccountNotesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetAbbrevatedAccountNotesResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.GetAbbrevatedAccountNotesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetAccountHistoryRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.GetAccountHistoryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetAccountHistoryResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.GetAccountHistoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetAccountNoteRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.GetAccountNoteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetAccountNoteResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.GetAccountNoteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetAccountPersonalRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.GetAccountPersonalRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetAccountPersonalResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.GetAccountPersonalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetAccountRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.GetAccountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetAccountResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.GetAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetDropdownRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.GetDropdownRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetDropdownResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.GetDropdownResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetNetworkIDRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.GetNetworkIDRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetNetworkIDResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.GetNetworkIDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetRegionDetailsRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.GetRegionDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetRegionDetailsResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.GetRegionDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetSubscriberInfoRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.GetSubscriberInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetSubscriberInfoResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.GetSubscriberInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetSubscriberProfileInfoRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.GetSubscriberProfileInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetSubscriberProfileInfoResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.GetSubscriberProfileInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetSubscriberRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.GetSubscriberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetSubscriberResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.GetSubscriberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "LanguageType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.LanguageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ManageRegionDetailsRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.ManageRegionDetailsRequest.class;
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
            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ManageRegionDetailsResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.ManageRegionDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "MessageLevelType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.MessageLevelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "OperationType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.OperationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "OrderDetails");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.OrderDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "PrepaidAccountDetailsRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.PrepaidAccountDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "PrepaidAccountDetailsResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.PrepaidAccountDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "RetrievalType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.RetrievalType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "SpecificSubscriber");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.SpecificSubscriber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "SubscriberDetailsInfo");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.SubscriberDetailsInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "SubscriberIdKey");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.SubscriberIdKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "SubscriberIdKeyType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.SubscriberIdKeyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "SubscriberProfileInfo");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.SubscriberProfileInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "SubscriberStatusType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.SubscriberStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "SyncUploadError");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.SyncUploadError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "SyncUploadRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.SyncUploadRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "SyncUploadResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.SyncUploadResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "TroubleTicketData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.TroubleTicketData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "TroubleTicketStatus");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.TroubleTicketStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "TroubleTicketType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.TroubleTicketType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdateAccountDetailsRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.UpdateAccountDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdateAccountDetailsResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.UpdateAccountDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdateAccountNoteRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.UpdateAccountNoteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdateAccountNoteResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.UpdateAccountNoteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdateAccountPersonalRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.UpdateAccountPersonalRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdateAccountPersonalResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.UpdateAccountPersonalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdateCallReasonRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.UpdateCallReasonRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdateCallReasonResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.UpdateCallReasonResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdatePrepaidAccountDetailsRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.UpdatePrepaidAccountDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdatePrepaidAccountDetailsResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.UpdatePrepaidAccountDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdateSubscriberInfoRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.UpdateSubscriberInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdateSubscriberInfoResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.UpdateSubscriberInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UserIdentificationData");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.UserIdentificationData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UserType");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.UserType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ViewTroubleTicketRequest");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.ViewTroubleTicketRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ViewTroubleTicketResponse");
            cachedSerQNames.add(qName);
            cls = net.bcgi.si.messages.mvnoapi.subscriber.ViewTroubleTicketResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">addAccountHistory");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.AddAccountHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">addAccountHistoryResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.AddAccountHistoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">addAccountNote");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.AddAccountNote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">addAccountNoteResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.AddAccountNoteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">addTroubleTicket");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.AddTroubleTicket.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">addTroubleTicketResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.AddTroubleTicketResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">authenticate");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.Authenticate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">authenticateResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.AuthenticateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">changePassword");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.ChangePassword.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">changePasswordResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.ChangePasswordResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">findAccounts");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.FindAccounts.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">findAccountsResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.FindAccountsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">forgotPassword");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.ForgotPassword.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">forgotPasswordResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.ForgotPasswordResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">forgotUserName");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.ForgotUserName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">forgotUserNameResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.ForgotUserNameResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getAbbrevatedAccountNotes");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetAbbrevatedAccountNotes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getAbbrevatedAccountNotesResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetAbbrevatedAccountNotesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getAccount");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getAccountHistory");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetAccountHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getAccountHistoryResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetAccountHistoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getAccountNote");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetAccountNote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getAccountNoteResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetAccountNoteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getAccountPersonal");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetAccountPersonal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getAccountPersonalResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetAccountPersonalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getAccountResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getDropdown");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetDropdown.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getDropdownResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetDropdownResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getNetworkID");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetNetworkID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getNetworkIDResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetNetworkIDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getPrepaidAccount");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetPrepaidAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getPrepaidAccountResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetPrepaidAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getRegionDetails");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetRegionDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getRegionDetailsResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetRegionDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getSubscriber");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetSubscriber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getSubscriberInfo");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetSubscriberInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getSubscriberInfoResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetSubscriberInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getSubscriberProfileInfo");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetSubscriberProfileInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getSubscriberProfileInfoResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetSubscriberProfileInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">getSubscriberResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.GetSubscriberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">manageRegionDetails");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.ManageRegionDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">manageRegionDetailsResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.ManageRegionDetailsResponse.class;
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

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">syncUpload");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.SyncUpload.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">syncUploadResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.SyncUploadResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">updateAccountDetails");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.UpdateAccountDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">updateAccountDetailsResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.UpdateAccountDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">UpdateAccountNote");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.UpdateAccountNote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">UpdateAccountNoteResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.UpdateAccountNoteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">updateAccountPersonal");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.UpdateAccountPersonal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">updateAccountPersonalResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.UpdateAccountPersonalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">updateCallReason");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.UpdateCallReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">updateCallReasonResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.UpdateCallReasonResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">updateCorpSubscriberInfo");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.UpdateCorpSubscriberInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">updateCorpSubscriberInfoResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.UpdateCorpSubscriberInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">updatePrepaidAccount");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.UpdatePrepaidAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">updatePrepaidAccountResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.UpdatePrepaidAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">updatSubscriberInfo");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.UpdatSubscriberInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">updatSubscriberInfoResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.UpdatSubscriberInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">viewTroubleTicket");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.ViewTroubleTicket.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:servicemix:soap-binding", ">viewTroubleTicketResponse");
            cachedSerQNames.add(qName);
            cls = soap_binding.servicemix.ViewTroubleTicketResponse.class;
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

    public net.bcgi.si.messages.mvnoapi.subscriber.GetAccountNoteResponse getAccountNote(net.bcgi.si.messages.mvnoapi.subscriber.GetAccountNoteRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "getAccountNote"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.GetAccountNoteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.GetAccountNoteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.GetAccountNoteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.subscriber.GetDropdownResponse getDropdown(net.bcgi.si.messages.mvnoapi.subscriber.GetDropdownRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "getDropdown"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.GetDropdownResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.GetDropdownResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.GetDropdownResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.subscriber.UpdateCallReasonResponse updateCallReason(net.bcgi.si.messages.mvnoapi.subscriber.UpdateCallReasonRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "updateCallReason"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.UpdateCallReasonResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.UpdateCallReasonResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.UpdateCallReasonResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.subscriber.GetSubscriberInfoResponse getSubscriberInfo(net.bcgi.si.messages.mvnoapi.subscriber.GetSubscriberInfoRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "getSubscriberInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.GetSubscriberInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.GetSubscriberInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.GetSubscriberInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.subscriber.AuthenticateResponse authenticate(net.bcgi.si.messages.mvnoapi.subscriber.AuthenticateRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "authenticate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.AuthenticateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.AuthenticateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.AuthenticateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.subscriber.GetAccountResponse getAccount(net.bcgi.si.messages.mvnoapi.subscriber.GetAccountRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "getAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.GetAccountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.GetAccountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.GetAccountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.subscriber.GetRegionDetailsResponse getRegionDetails(net.bcgi.si.messages.mvnoapi.subscriber.GetRegionDetailsRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "getRegionDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.GetRegionDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.GetRegionDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.GetRegionDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.subscriber.GetSubscriberProfileInfoResponse getSubscriberProfileInfo(net.bcgi.si.messages.mvnoapi.subscriber.GetSubscriberProfileInfoRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "getSubscriberProfileInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.GetSubscriberProfileInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.GetSubscriberProfileInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.GetSubscriberProfileInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.subscriber.GetAbbrevatedAccountNotesResponse getAbbrevatedAccountNotes(net.bcgi.si.messages.mvnoapi.subscriber.GetAbbrevatedAccountNotesRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "getAbbrevatedAccountNotes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.GetAbbrevatedAccountNotesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.GetAbbrevatedAccountNotesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.GetAbbrevatedAccountNotesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.subscriber.UpdateAccountPersonalResponse updateAccountPersonal(net.bcgi.si.messages.mvnoapi.subscriber.UpdateAccountPersonalRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "updateAccountPersonal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.UpdateAccountPersonalResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.UpdateAccountPersonalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.UpdateAccountPersonalResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.subscriber.FindAccountsResponse findAccounts(net.bcgi.si.messages.mvnoapi.subscriber.FindAccountsRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "findAccounts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.FindAccountsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.FindAccountsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.FindAccountsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.subscriber.UpdateSubscriberInfoResponse updateCorpSubscriberInfo(net.bcgi.si.messages.mvnoapi.subscriber.UpdateSubscriberInfoRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "updateCorpSubscriberInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.UpdateSubscriberInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.UpdateSubscriberInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.UpdateSubscriberInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.subscriber.AddTroubleTicketResponse addTroubleTicket(net.bcgi.si.messages.mvnoapi.subscriber.AddTroubleTicketRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "addTroubleTicket"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.AddTroubleTicketResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.AddTroubleTicketResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.AddTroubleTicketResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.subscriber.ViewTroubleTicketResponse viewTroubleTicket(net.bcgi.si.messages.mvnoapi.subscriber.ViewTroubleTicketRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "viewTroubleTicket"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.ViewTroubleTicketResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.ViewTroubleTicketResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.ViewTroubleTicketResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.subscriber.UpdateAccountNoteResponse updateAccountNote(net.bcgi.si.messages.mvnoapi.subscriber.UpdateAccountNoteRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "UpdateAccountNote"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.UpdateAccountNoteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.UpdateAccountNoteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.UpdateAccountNoteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.subscriber.GetSubscriberResponse getSubscriber(net.bcgi.si.messages.mvnoapi.subscriber.GetSubscriberRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "getSubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.GetSubscriberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.GetSubscriberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.GetSubscriberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.subscriber.ManageRegionDetailsResponse manageRegionDetails(net.bcgi.si.messages.mvnoapi.subscriber.ManageRegionDetailsRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "manageRegionDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.ManageRegionDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.ManageRegionDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.ManageRegionDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.subscriber.GetAccountPersonalResponse getAccountPersonal(net.bcgi.si.messages.mvnoapi.subscriber.GetAccountPersonalRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "getAccountPersonal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.GetAccountPersonalResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.GetAccountPersonalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.GetAccountPersonalResponse.class);
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
        _call.setOperation(_operations[18]);
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

    public net.bcgi.si.messages.mvnoapi.subscriber.ForgotPasswordResponse forgotPassword(net.bcgi.si.messages.mvnoapi.subscriber.ForgotPasswordRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "forgotPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.ForgotPasswordResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.ForgotPasswordResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.ForgotPasswordResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.subscriber.ChangePasswordResponse changePassword(net.bcgi.si.messages.mvnoapi.subscriber.ChangePasswordRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "changePassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.ChangePasswordResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.ChangePasswordResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.ChangePasswordResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.subscriber.ForgotUserNameResponse forgotUserName(net.bcgi.si.messages.mvnoapi.subscriber.ForgotUserNameRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "forgotUserName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.ForgotUserNameResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.ForgotUserNameResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.ForgotUserNameResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.subscriber.PrepaidAccountDetailsResponse getPrepaidAccount(net.bcgi.si.messages.mvnoapi.subscriber.PrepaidAccountDetailsRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "getPrepaidAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.PrepaidAccountDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.PrepaidAccountDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.PrepaidAccountDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.subscriber.AddAccountNoteResponse addAccountNote(net.bcgi.si.messages.mvnoapi.subscriber.AddAccountNoteRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "addAccountNote"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.AddAccountNoteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.AddAccountNoteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.AddAccountNoteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.subscriber.UpdateSubscriberInfoResponse updatSubscriberInfo(net.bcgi.si.messages.mvnoapi.subscriber.UpdateSubscriberInfoRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "updatSubscriberInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.UpdateSubscriberInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.UpdateSubscriberInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.UpdateSubscriberInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.subscriber.AddAccountHistoryResponse addAccountHistory(net.bcgi.si.messages.mvnoapi.subscriber.AddAccountHistoryRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "addAccountHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.AddAccountHistoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.AddAccountHistoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.AddAccountHistoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.subscriber.UpdatePrepaidAccountDetailsResponse updatePrepaidAccount(net.bcgi.si.messages.mvnoapi.subscriber.UpdatePrepaidAccountDetailsRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "updatePrepaidAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.UpdatePrepaidAccountDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.UpdatePrepaidAccountDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.UpdatePrepaidAccountDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.subscriber.GetAccountHistoryResponse getAccountHistory(net.bcgi.si.messages.mvnoapi.subscriber.GetAccountHistoryRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "getAccountHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.GetAccountHistoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.GetAccountHistoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.GetAccountHistoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.subscriber.UpdateAccountDetailsResponse updateAccountDetails(net.bcgi.si.messages.mvnoapi.subscriber.UpdateAccountDetailsRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "updateAccountDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.UpdateAccountDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.UpdateAccountDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.UpdateAccountDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.subscriber.SyncUploadResponse syncUpload(net.bcgi.si.messages.mvnoapi.subscriber.SyncUploadRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "syncUpload"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.SyncUploadResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.SyncUploadResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.SyncUploadResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.bcgi.si.messages.mvnoapi.subscriber.GetNetworkIDResponse getNetworkID(net.bcgi.si.messages.mvnoapi.subscriber.GetNetworkIDRequest in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "getNetworkID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.bcgi.si.messages.mvnoapi.subscriber.GetNetworkIDResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.bcgi.si.messages.mvnoapi.subscriber.GetNetworkIDResponse) org.apache.axis.utils.JavaUtils.convert(_resp, net.bcgi.si.messages.mvnoapi.subscriber.GetNetworkIDResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
