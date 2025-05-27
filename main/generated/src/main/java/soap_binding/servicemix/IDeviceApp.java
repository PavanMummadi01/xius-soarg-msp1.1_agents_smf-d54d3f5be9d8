/**
 * IDeviceApp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap_binding.servicemix;

public interface IDeviceApp extends javax.xml.rpc.Service {
    public java.lang.String getDeviceAppAddress();

    public soap_binding.servicemix.IDeviceAppPortType getDeviceApp() throws javax.xml.rpc.ServiceException;

    public soap_binding.servicemix.IDeviceAppPortType getDeviceApp(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
