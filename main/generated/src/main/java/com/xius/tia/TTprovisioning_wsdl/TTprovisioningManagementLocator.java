/**
 * TTprovisioningManagementLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TTprovisioning_wsdl;

public class TTprovisioningManagementLocator extends org.apache.axis.client.Service implements com.xius.tia.TTprovisioning_wsdl.TTprovisioningManagement {

    public TTprovisioningManagementLocator() {
    }


    public TTprovisioningManagementLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TTprovisioningManagementLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TTprovisioningPort
    private java.lang.String TTprovisioningPort_address = "http://localhost:8080/axis/TTprovisioning/v1";

    public java.lang.String getTTprovisioningPortAddress() {
        return TTprovisioningPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TTprovisioningPortWSDDServiceName = "TTprovisioningPort";

    public java.lang.String getTTprovisioningPortWSDDServiceName() {
        return TTprovisioningPortWSDDServiceName;
    }

    public void setTTprovisioningPortWSDDServiceName(java.lang.String name) {
        TTprovisioningPortWSDDServiceName = name;
    }

    public com.xius.tia.TTprovisioning_wsdl.TTprovisioningBindingPortType getTTprovisioningPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TTprovisioningPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTTprovisioningPort(endpoint);
    }

    public com.xius.tia.TTprovisioning_wsdl.TTprovisioningBindingPortType getTTprovisioningPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.xius.tia.TTprovisioning_wsdl.TTprovisioningBindingStub _stub = new com.xius.tia.TTprovisioning_wsdl.TTprovisioningBindingStub(portAddress, this);
            _stub.setPortName(getTTprovisioningPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTTprovisioningPortEndpointAddress(java.lang.String address) {
        TTprovisioningPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.xius.tia.TTprovisioning_wsdl.TTprovisioningBindingPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.xius.tia.TTprovisioning_wsdl.TTprovisioningBindingStub _stub = new com.xius.tia.TTprovisioning_wsdl.TTprovisioningBindingStub(new java.net.URL(TTprovisioningPort_address), this);
                _stub.setPortName(getTTprovisioningPortWSDDServiceName());
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
        if ("TTprovisioningPort".equals(inputPortName)) {
            return getTTprovisioningPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.wsdl", "TTprovisioningManagement");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.wsdl", "TTprovisioningPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TTprovisioningPort".equals(portName)) {
            setTTprovisioningPortEndpointAddress(address);
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
