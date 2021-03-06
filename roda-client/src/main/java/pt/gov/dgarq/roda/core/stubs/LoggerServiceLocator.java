/**
 * LoggerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pt.gov.dgarq.roda.core.stubs;

public class LoggerServiceLocator extends org.apache.axis.client.Service implements pt.gov.dgarq.roda.core.stubs.LoggerService {

    public LoggerServiceLocator() {
    }


    public LoggerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LoggerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Logger
    private java.lang.String Logger_address = "http://localhost:8080/roda-core/services/Logger";

    public java.lang.String getLoggerAddress() {
        return Logger_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LoggerWSDDServiceName = "Logger";

    public java.lang.String getLoggerWSDDServiceName() {
        return LoggerWSDDServiceName;
    }

    public void setLoggerWSDDServiceName(java.lang.String name) {
        LoggerWSDDServiceName = name;
    }

    public pt.gov.dgarq.roda.core.stubs.Logger getLogger() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Logger_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLogger(endpoint);
    }

    public pt.gov.dgarq.roda.core.stubs.Logger getLogger(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            pt.gov.dgarq.roda.core.stubs.LoggerSoapBindingStub _stub = new pt.gov.dgarq.roda.core.stubs.LoggerSoapBindingStub(portAddress, this);
            _stub.setPortName(getLoggerWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLoggerEndpointAddress(java.lang.String address) {
        Logger_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (pt.gov.dgarq.roda.core.stubs.Logger.class.isAssignableFrom(serviceEndpointInterface)) {
                pt.gov.dgarq.roda.core.stubs.LoggerSoapBindingStub _stub = new pt.gov.dgarq.roda.core.stubs.LoggerSoapBindingStub(new java.net.URL(Logger_address), this);
                _stub.setPortName(getLoggerWSDDServiceName());
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
        if ("Logger".equals(inputPortName)) {
            return getLogger();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.core.roda.dgarq.gov.pt", "LoggerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.core.roda.dgarq.gov.pt", "Logger"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Logger".equals(portName)) {
            setLoggerEndpointAddress(address);
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
