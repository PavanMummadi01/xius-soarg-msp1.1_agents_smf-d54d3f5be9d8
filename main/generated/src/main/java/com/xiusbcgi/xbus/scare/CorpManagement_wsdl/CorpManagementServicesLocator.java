/**
 * CorpManagementServicesLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xiusbcgi.xbus.scare.CorpManagement_wsdl;

public class CorpManagementServicesLocator extends org.apache.axis.client.Service implements com.xiusbcgi.xbus.scare.CorpManagement_wsdl.CorpManagementServices {

    public CorpManagementServicesLocator() {
    }


    public CorpManagementServicesLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CorpManagementServicesLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CorpManagementServicesPort
    private java.lang.String CorpManagementServicesPort_address = "http://192.168.149.187:8210/selfcareservices/services/CorpManagementServicesPort?wsdl";

    public java.lang.String getCorpManagementServicesPortAddress() {
        return CorpManagementServicesPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CorpManagementServicesPortWSDDServiceName = "CorpManagementServicesPort";

    public java.lang.String getCorpManagementServicesPortWSDDServiceName() {
        return CorpManagementServicesPortWSDDServiceName;
    }

    public void setCorpManagementServicesPortWSDDServiceName(java.lang.String name) {
        CorpManagementServicesPortWSDDServiceName = name;
    }

    public com.xiusbcgi.xbus.scare.CorpManagement_wsdl.CorpManagementPortType getCorpManagementServicesPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CorpManagementServicesPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCorpManagementServicesPort(endpoint);
    }

    public com.xiusbcgi.xbus.scare.CorpManagement_wsdl.CorpManagementPortType getCorpManagementServicesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.xiusbcgi.xbus.scare.CorpManagement_wsdl.CorpManagementServicesBindingStub _stub = new com.xiusbcgi.xbus.scare.CorpManagement_wsdl.CorpManagementServicesBindingStub(portAddress, this);
            _stub.setPortName(getCorpManagementServicesPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCorpManagementServicesPortEndpointAddress(java.lang.String address) {
        CorpManagementServicesPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.xiusbcgi.xbus.scare.CorpManagement_wsdl.CorpManagementPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.xiusbcgi.xbus.scare.CorpManagement_wsdl.CorpManagementServicesBindingStub _stub = new com.xiusbcgi.xbus.scare.CorpManagement_wsdl.CorpManagementServicesBindingStub(new java.net.URL(CorpManagementServicesPort_address), this);
                _stub.setPortName(getCorpManagementServicesPortWSDDServiceName());
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
        if ("CorpManagementServicesPort".equals(inputPortName)) {
            return getCorpManagementServicesPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.wsdl", "CorpManagementServices");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.wsdl", "CorpManagementServicesPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CorpManagementServicesPort".equals(portName)) {
            setCorpManagementServicesPortEndpointAddress(address);
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
