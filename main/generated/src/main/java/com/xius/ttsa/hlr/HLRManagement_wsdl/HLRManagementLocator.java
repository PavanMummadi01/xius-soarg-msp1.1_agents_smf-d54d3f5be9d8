/**
 * HLRManagementLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.ttsa.hlr.HLRManagement_wsdl;

public class HLRManagementLocator extends org.apache.axis.client.Service implements com.xius.ttsa.hlr.HLRManagement_wsdl.HLRManagement {

    public HLRManagementLocator() {
    }


    public HLRManagementLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HLRManagementLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ManagementPort
    private java.lang.String ManagementPort_address = "http://localhost:8080/axis/HLRManagement/v1";

    public java.lang.String getManagementPortAddress() {
        return ManagementPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ManagementPortWSDDServiceName = "ManagementPort";

    public java.lang.String getManagementPortWSDDServiceName() {
        return ManagementPortWSDDServiceName;
    }

    public void setManagementPortWSDDServiceName(java.lang.String name) {
        ManagementPortWSDDServiceName = name;
    }

    public com.xius.ttsa.hlr.HLRManagement_wsdl.HLRManagementPortType getManagementPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ManagementPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getManagementPort(endpoint);
    }

    public com.xius.ttsa.hlr.HLRManagement_wsdl.HLRManagementPortType getManagementPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.xius.ttsa.hlr.HLRManagement_wsdl.HLRManagementBindingStub _stub = new com.xius.ttsa.hlr.HLRManagement_wsdl.HLRManagementBindingStub(portAddress, this);
            _stub.setPortName(getManagementPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setManagementPortEndpointAddress(java.lang.String address) {
        ManagementPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.xius.ttsa.hlr.HLRManagement_wsdl.HLRManagementPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.xius.ttsa.hlr.HLRManagement_wsdl.HLRManagementBindingStub _stub = new com.xius.ttsa.hlr.HLRManagement_wsdl.HLRManagementBindingStub(new java.net.URL(ManagementPort_address), this);
                _stub.setPortName(getManagementPortWSDDServiceName());
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
        if ("ManagementPort".equals(inputPortName)) {
            return getManagementPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.wsdl", "HLRManagement");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.wsdl", "ManagementPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ManagementPort".equals(portName)) {
            setManagementPortEndpointAddress(address);
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
