/**
 * WalletIntegrationLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.WalletManagement_wsdl;

public class WalletIntegrationLocator extends org.apache.axis.client.Service implements com.xius.tia.WalletManagement_wsdl.WalletIntegration {

    public WalletIntegrationLocator() {
    }


    public WalletIntegrationLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WalletIntegrationLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WalletIntegrationPort
    private java.lang.String WalletIntegrationPort_address = "http://localhost:8080/axis/WalletIntegration/v1";

    public java.lang.String getWalletIntegrationPortAddress() {
        return WalletIntegrationPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WalletIntegrationPortWSDDServiceName = "WalletIntegrationPort";

    public java.lang.String getWalletIntegrationPortWSDDServiceName() {
        return WalletIntegrationPortWSDDServiceName;
    }

    public void setWalletIntegrationPortWSDDServiceName(java.lang.String name) {
        WalletIntegrationPortWSDDServiceName = name;
    }

    public com.xius.tia.WalletManagement_wsdl.WalletIntegrationPortType getWalletIntegrationPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WalletIntegrationPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWalletIntegrationPort(endpoint);
    }

    public com.xius.tia.WalletManagement_wsdl.WalletIntegrationPortType getWalletIntegrationPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.xius.tia.WalletManagement_wsdl.WalletIntegrationBindingStub _stub = new com.xius.tia.WalletManagement_wsdl.WalletIntegrationBindingStub(portAddress, this);
            _stub.setPortName(getWalletIntegrationPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWalletIntegrationPortEndpointAddress(java.lang.String address) {
        WalletIntegrationPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.xius.tia.WalletManagement_wsdl.WalletIntegrationPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.xius.tia.WalletManagement_wsdl.WalletIntegrationBindingStub _stub = new com.xius.tia.WalletManagement_wsdl.WalletIntegrationBindingStub(new java.net.URL(WalletIntegrationPort_address), this);
                _stub.setPortName(getWalletIntegrationPortWSDDServiceName());
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
        if ("WalletIntegrationPort".equals(inputPortName)) {
            return getWalletIntegrationPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tia.xius.com/WalletManagement.wsdl", "WalletIntegration");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tia.xius.com/WalletManagement.wsdl", "WalletIntegrationPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WalletIntegrationPort".equals(portName)) {
            setWalletIntegrationPortEndpointAddress(address);
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
