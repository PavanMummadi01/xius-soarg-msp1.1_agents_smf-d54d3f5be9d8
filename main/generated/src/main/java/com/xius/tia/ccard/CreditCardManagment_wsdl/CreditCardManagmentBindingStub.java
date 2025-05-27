/**
 * CreditCardManagmentBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.ccard.CreditCardManagment_wsdl;

public class CreditCardManagmentBindingStub extends org.apache.axis.client.Stub implements com.xius.tia.ccard.CreditCardManagment_wsdl.CreditCardManagmentPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("debitFromCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "debitFromCardRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "debitFromCardRequest"), com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromCardRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "debitFromCardResponse"));
        oper.setReturnClass(com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromCardResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "debitFromCardResponse"));
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
        oper.setName("debitFromWallet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "debitFromWalletRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "debitFromWalletRequest"), com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromWalletRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "debitFromWalletResponse"));
        oper.setReturnClass(com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromWalletResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "debitFromWalletResponse"));
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
        oper.setName("debitFromCC");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "debitFromCCRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "debitFromCCRequest"), com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromCCRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "debitFromCCResponse"));
        oper.setReturnClass(com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromCCResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "debitFromCCResponse"));
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
        oper.setName("registerCC");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "registerCCRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "registerCCRequest"), com.xius.tia.ccard.CreditCardManagment_xsd.RegisterCCRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "registerCCResponse"));
        oper.setReturnClass(com.xius.tia.ccard.CreditCardManagment_xsd.RegisterCCResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "registerCCResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://tia.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[3] = oper;

    }

    public CreditCardManagmentBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CreditCardManagmentBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CreditCardManagmentBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "debitFromCardRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromCardRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "debitFromCardResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromCardResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "debitFromCCRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromCCRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "debitFromCCResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromCCResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "debitFromWalletRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromWalletRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "debitFromWalletResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromWalletResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "MSISDNType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "registerCCRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.ccard.CreditCardManagment_xsd.RegisterCCRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "registerCCResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.ccard.CreditCardManagment_xsd.RegisterCCResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "RespDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.ccard.CreditCardManagment_xsd.RespDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "ResultDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.tia.ccard.CreditCardManagment_xsd.ResultDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

    public com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromCardResponse debitFromCard(com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromCardRequest body) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("debitFromCard");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "debitFromCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromCardResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromCardResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromCardResponse.class);
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

    public com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromWalletResponse debitFromWallet(com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromWalletRequest body) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("debitFromWallet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "debitFromWallet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromWalletResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromWalletResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromWalletResponse.class);
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

    public com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromCCResponse debitFromCC(com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromCCRequest body) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("debitFromCC");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "debitFromCC"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromCCResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromCCResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.ccard.CreditCardManagment_xsd.DebitFromCCResponse.class);
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

    public com.xius.tia.ccard.CreditCardManagment_xsd.RegisterCCResponse registerCC(com.xius.tia.ccard.CreditCardManagment_xsd.RegisterCCRequest body) throws java.rmi.RemoteException, com.xius.tia.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("registerCC");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "registerCC"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.tia.ccard.CreditCardManagment_xsd.RegisterCCResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.tia.ccard.CreditCardManagment_xsd.RegisterCCResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.tia.ccard.CreditCardManagment_xsd.RegisterCCResponse.class);
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
