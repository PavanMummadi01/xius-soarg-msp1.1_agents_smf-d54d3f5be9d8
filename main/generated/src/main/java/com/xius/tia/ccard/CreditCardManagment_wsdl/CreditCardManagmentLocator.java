/**
 * CreditCardManagmentLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.ccard.CreditCardManagment_wsdl;

public class CreditCardManagmentLocator extends org.apache.axis.client.Service implements com.xius.tia.ccard.CreditCardManagment_wsdl.CreditCardManagment {

    public CreditCardManagmentLocator() {
    }


    public CreditCardManagmentLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CreditCardManagmentLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CreditCardManagmentPort
    private java.lang.String CreditCardManagmentPort_address = "http://localhost:8080/axis/CreditCardManagment/v1";

    public java.lang.String getCreditCardManagmentPortAddress() {
        return CreditCardManagmentPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CreditCardManagmentPortWSDDServiceName = "CreditCardManagmentPort";

    public java.lang.String getCreditCardManagmentPortWSDDServiceName() {
        return CreditCardManagmentPortWSDDServiceName;
    }

    public void setCreditCardManagmentPortWSDDServiceName(java.lang.String name) {
        CreditCardManagmentPortWSDDServiceName = name;
    }

    public com.xius.tia.ccard.CreditCardManagment_wsdl.CreditCardManagmentPortType getCreditCardManagmentPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CreditCardManagmentPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCreditCardManagmentPort(endpoint);
    }

    public com.xius.tia.ccard.CreditCardManagment_wsdl.CreditCardManagmentPortType getCreditCardManagmentPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.xius.tia.ccard.CreditCardManagment_wsdl.CreditCardManagmentBindingStub _stub = new com.xius.tia.ccard.CreditCardManagment_wsdl.CreditCardManagmentBindingStub(portAddress, this);
            _stub.setPortName(getCreditCardManagmentPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCreditCardManagmentPortEndpointAddress(java.lang.String address) {
        CreditCardManagmentPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.xius.tia.ccard.CreditCardManagment_wsdl.CreditCardManagmentPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.xius.tia.ccard.CreditCardManagment_wsdl.CreditCardManagmentBindingStub _stub = new com.xius.tia.ccard.CreditCardManagment_wsdl.CreditCardManagmentBindingStub(new java.net.URL(CreditCardManagmentPort_address), this);
                _stub.setPortName(getCreditCardManagmentPortWSDDServiceName());
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
        if ("CreditCardManagmentPort".equals(inputPortName)) {
            return getCreditCardManagmentPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.wsdl", "CreditCardManagment");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.wsdl", "CreditCardManagmentPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CreditCardManagmentPort".equals(portName)) {
            setCreditCardManagmentPortEndpointAddress(address);
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
