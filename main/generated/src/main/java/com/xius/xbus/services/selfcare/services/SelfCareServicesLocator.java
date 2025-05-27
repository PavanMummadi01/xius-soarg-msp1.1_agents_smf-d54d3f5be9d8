/**
 * SelfCareServicesLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.services.selfcare.services;

public class SelfCareServicesLocator extends org.apache.axis.client.Service implements com.xius.xbus.services.selfcare.services.SelfCareServices {

    public SelfCareServicesLocator() {
    }


    public SelfCareServicesLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SelfCareServicesLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SelfCareServicesPort
    private java.lang.String SelfCareServicesPort_address = "http://localhost:8080";

    public java.lang.String getSelfCareServicesPortAddress() {
        return SelfCareServicesPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SelfCareServicesPortWSDDServiceName = "SelfCareServicesPort";

    public java.lang.String getSelfCareServicesPortWSDDServiceName() {
        return SelfCareServicesPortWSDDServiceName;
    }

    public void setSelfCareServicesPortWSDDServiceName(java.lang.String name) {
        SelfCareServicesPortWSDDServiceName = name;
    }

    public com.xius.xbus.services.selfcare.services.SelfCareServicesPortType getSelfCareServicesPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SelfCareServicesPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSelfCareServicesPort(endpoint);
    }

    public com.xius.xbus.services.selfcare.services.SelfCareServicesPortType getSelfCareServicesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.xius.xbus.services.selfcare.services.SelfCareServicesBindingStub _stub = new com.xius.xbus.services.selfcare.services.SelfCareServicesBindingStub(portAddress, this);
            _stub.setPortName(getSelfCareServicesPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSelfCareServicesPortEndpointAddress(java.lang.String address) {
        SelfCareServicesPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.xius.xbus.services.selfcare.services.SelfCareServicesPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.xius.xbus.services.selfcare.services.SelfCareServicesBindingStub _stub = new com.xius.xbus.services.selfcare.services.SelfCareServicesBindingStub(new java.net.URL(SelfCareServicesPort_address), this);
                _stub.setPortName(getSelfCareServicesPortWSDDServiceName());
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
        if ("SelfCareServicesPort".equals(inputPortName)) {
            return getSelfCareServicesPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xbus.xius.com/services/selfcare/services", "SelfCareServices");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xbus.xius.com/services/selfcare/services", "SelfCareServicesPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SelfCareServicesPort".equals(portName)) {
            setSelfCareServicesPortEndpointAddress(address);
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
