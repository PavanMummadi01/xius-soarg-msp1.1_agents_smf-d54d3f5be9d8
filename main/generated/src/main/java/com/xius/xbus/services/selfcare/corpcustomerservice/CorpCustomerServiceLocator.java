/**
 * CorpCustomerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.services.selfcare.corpcustomerservice;

public class CorpCustomerServiceLocator extends org.apache.axis.client.Service implements com.xius.xbus.services.selfcare.corpcustomerservice.CorpCustomerService {

    public CorpCustomerServiceLocator() {
    }


    public CorpCustomerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CorpCustomerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CorpCustomerServicePort
    private java.lang.String CorpCustomerServicePort_address = "http://localhost:8080";

    public java.lang.String getCorpCustomerServicePortAddress() {
        return CorpCustomerServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CorpCustomerServicePortWSDDServiceName = "CorpCustomerServicePort";

    public java.lang.String getCorpCustomerServicePortWSDDServiceName() {
        return CorpCustomerServicePortWSDDServiceName;
    }

    public void setCorpCustomerServicePortWSDDServiceName(java.lang.String name) {
        CorpCustomerServicePortWSDDServiceName = name;
    }

    public com.xius.xbus.services.selfcare.corpcustomerservice.CorpCustomerServicePortType getCorpCustomerServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CorpCustomerServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCorpCustomerServicePort(endpoint);
    }

    public com.xius.xbus.services.selfcare.corpcustomerservice.CorpCustomerServicePortType getCorpCustomerServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.xius.xbus.services.selfcare.corpcustomerservice.CorpCustomerServiceBindingStub _stub = new com.xius.xbus.services.selfcare.corpcustomerservice.CorpCustomerServiceBindingStub(portAddress, this);
            _stub.setPortName(getCorpCustomerServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCorpCustomerServicePortEndpointAddress(java.lang.String address) {
        CorpCustomerServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.xius.xbus.services.selfcare.corpcustomerservice.CorpCustomerServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.xius.xbus.services.selfcare.corpcustomerservice.CorpCustomerServiceBindingStub _stub = new com.xius.xbus.services.selfcare.corpcustomerservice.CorpCustomerServiceBindingStub(new java.net.URL(CorpCustomerServicePort_address), this);
                _stub.setPortName(getCorpCustomerServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CorpCustomerServicePort".equals(inputPortName)) {
            return getCorpCustomerServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xbus.xius.com/services/selfcare/corpcustomerservice", "CorpCustomerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xbus.xius.com/services/selfcare/corpcustomerservice", "CorpCustomerServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CorpCustomerServicePort".equals(portName)) {
            setCorpCustomerServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
