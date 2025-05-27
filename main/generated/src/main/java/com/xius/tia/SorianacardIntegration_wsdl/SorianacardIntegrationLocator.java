/**
 * SorianacardIntegrationLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.SorianacardIntegration_wsdl;

public class SorianacardIntegrationLocator extends org.apache.axis.client.Service implements com.xius.tia.SorianacardIntegration_wsdl.SorianacardIntegration {

    public SorianacardIntegrationLocator() {
    }


    public SorianacardIntegrationLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SorianacardIntegrationLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SorianacardIntegrationPort
    private java.lang.String SorianacardIntegrationPort_address = "http://localhost:8080/axis/SorianacardIntegration/v1";

    public java.lang.String getSorianacardIntegrationPortAddress() {
        return SorianacardIntegrationPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SorianacardIntegrationPortWSDDServiceName = "SorianacardIntegrationPort";

    public java.lang.String getSorianacardIntegrationPortWSDDServiceName() {
        return SorianacardIntegrationPortWSDDServiceName;
    }

    public void setSorianacardIntegrationPortWSDDServiceName(java.lang.String name) {
        SorianacardIntegrationPortWSDDServiceName = name;
    }

    public com.xius.tia.SorianacardIntegration_wsdl.SorianacardIntegrationPortType getSorianacardIntegrationPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SorianacardIntegrationPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSorianacardIntegrationPort(endpoint);
    }

    public com.xius.tia.SorianacardIntegration_wsdl.SorianacardIntegrationPortType getSorianacardIntegrationPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.xius.tia.SorianacardIntegration_wsdl.SorianacardIntegrationBindingStub _stub = new com.xius.tia.SorianacardIntegration_wsdl.SorianacardIntegrationBindingStub(portAddress, this);
            _stub.setPortName(getSorianacardIntegrationPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSorianacardIntegrationPortEndpointAddress(java.lang.String address) {
        SorianacardIntegrationPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.xius.tia.SorianacardIntegration_wsdl.SorianacardIntegrationPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.xius.tia.SorianacardIntegration_wsdl.SorianacardIntegrationBindingStub _stub = new com.xius.tia.SorianacardIntegration_wsdl.SorianacardIntegrationBindingStub(new java.net.URL(SorianacardIntegrationPort_address), this);
                _stub.setPortName(getSorianacardIntegrationPortWSDDServiceName());
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
        if ("SorianacardIntegrationPort".equals(inputPortName)) {
            return getSorianacardIntegrationPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.wsdl", "SorianacardIntegration");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.wsdl", "SorianacardIntegrationPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SorianacardIntegrationPort".equals(portName)) {
            setSorianacardIntegrationPortEndpointAddress(address);
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
