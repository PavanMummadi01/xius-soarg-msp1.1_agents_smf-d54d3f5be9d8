/**
 * CommunityAccountServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.services.selfcare.communityaccountservice;

public class CommunityAccountServiceLocator extends org.apache.axis.client.Service implements com.xius.xbus.services.selfcare.communityaccountservice.CommunityAccountService {

    public CommunityAccountServiceLocator() {
    }


    public CommunityAccountServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CommunityAccountServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CommunityAccountServicePort
    private java.lang.String CommunityAccountServicePort_address = "http://localhost:8080";

    public java.lang.String getCommunityAccountServicePortAddress() {
        return CommunityAccountServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CommunityAccountServicePortWSDDServiceName = "CommunityAccountServicePort";

    public java.lang.String getCommunityAccountServicePortWSDDServiceName() {
        return CommunityAccountServicePortWSDDServiceName;
    }

    public void setCommunityAccountServicePortWSDDServiceName(java.lang.String name) {
        CommunityAccountServicePortWSDDServiceName = name;
    }

    public com.xius.xbus.services.selfcare.communityaccountservice.CommunityAccountServicePortType getCommunityAccountServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CommunityAccountServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCommunityAccountServicePort(endpoint);
    }

    public com.xius.xbus.services.selfcare.communityaccountservice.CommunityAccountServicePortType getCommunityAccountServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.xius.xbus.services.selfcare.communityaccountservice.CommunityAccountServiceBindingStub _stub = new com.xius.xbus.services.selfcare.communityaccountservice.CommunityAccountServiceBindingStub(portAddress, this);
            _stub.setPortName(getCommunityAccountServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCommunityAccountServicePortEndpointAddress(java.lang.String address) {
        CommunityAccountServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.xius.xbus.services.selfcare.communityaccountservice.CommunityAccountServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.xius.xbus.services.selfcare.communityaccountservice.CommunityAccountServiceBindingStub _stub = new com.xius.xbus.services.selfcare.communityaccountservice.CommunityAccountServiceBindingStub(new java.net.URL(CommunityAccountServicePort_address), this);
                _stub.setPortName(getCommunityAccountServicePortWSDDServiceName());
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
        if ("CommunityAccountServicePort".equals(inputPortName)) {
            return getCommunityAccountServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xbus.xius.com/services/selfcare/communityaccountservice", "CommunityAccountService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xbus.xius.com/services/selfcare/communityaccountservice", "CommunityAccountServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CommunityAccountServicePort".equals(portName)) {
            setCommunityAccountServicePortEndpointAddress(address);
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
