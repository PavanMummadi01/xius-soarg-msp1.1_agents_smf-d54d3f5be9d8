/**
 * AccountServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_wsdl;

public class AccountServiceLocator extends org.apache.axis.client.Service implements com.xius.billing.AccountManagement_wsdl.AccountService {

    public AccountServiceLocator() {
    }


    public AccountServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AccountServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AccountManagementPort
    private java.lang.String AccountManagementPort_address = "http://localhost:8080/infinet/services/v1/accountServices";

    public java.lang.String getAccountManagementPortAddress() {
        return AccountManagementPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AccountManagementPortWSDDServiceName = "AccountManagementPort";

    public java.lang.String getAccountManagementPortWSDDServiceName() {
        return AccountManagementPortWSDDServiceName;
    }

    public void setAccountManagementPortWSDDServiceName(java.lang.String name) {
        AccountManagementPortWSDDServiceName = name;
    }

    public com.xius.billing.AccountManagement_wsdl.AccountManagementPortType getAccountManagementPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AccountManagementPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAccountManagementPort(endpoint);
    }

    public com.xius.billing.AccountManagement_wsdl.AccountManagementPortType getAccountManagementPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.xius.billing.AccountManagement_wsdl.AccountManagementBindingStub _stub = new com.xius.billing.AccountManagement_wsdl.AccountManagementBindingStub(portAddress, this);
            _stub.setPortName(getAccountManagementPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAccountManagementPortEndpointAddress(java.lang.String address) {
        AccountManagementPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.xius.billing.AccountManagement_wsdl.AccountManagementPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.xius.billing.AccountManagement_wsdl.AccountManagementBindingStub _stub = new com.xius.billing.AccountManagement_wsdl.AccountManagementBindingStub(new java.net.URL(AccountManagementPort_address), this);
                _stub.setPortName(getAccountManagementPortWSDDServiceName());
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
        if ("AccountManagementPort".equals(inputPortName)) {
            return getAccountManagementPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.wsdl", "AccountService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.wsdl", "AccountManagementPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AccountManagementPort".equals(portName)) {
            setAccountManagementPortEndpointAddress(address);
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
