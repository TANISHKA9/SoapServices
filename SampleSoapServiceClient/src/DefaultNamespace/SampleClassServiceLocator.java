/**
 * SampleClassServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public class SampleClassServiceLocator extends org.apache.axis.client.Service implements DefaultNamespace.SampleClassService {

    public SampleClassServiceLocator() {
    }


    public SampleClassServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SampleClassServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for sampleClass
    private java.lang.String sampleClass_address = "http://localhost:8080/SampleSoapService/services/sampleClass";

    public java.lang.String getsampleClassAddress() {
        return sampleClass_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String sampleClassWSDDServiceName = "sampleClass";

    public java.lang.String getsampleClassWSDDServiceName() {
        return sampleClassWSDDServiceName;
    }

    public void setsampleClassWSDDServiceName(java.lang.String name) {
        sampleClassWSDDServiceName = name;
    }

    public DefaultNamespace.SampleClass getsampleClass() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(sampleClass_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getsampleClass(endpoint);
    }

    public DefaultNamespace.SampleClass getsampleClass(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DefaultNamespace.SampleClassSoapBindingStub _stub = new DefaultNamespace.SampleClassSoapBindingStub(portAddress, this);
            _stub.setPortName(getsampleClassWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setsampleClassEndpointAddress(java.lang.String address) {
        sampleClass_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DefaultNamespace.SampleClass.class.isAssignableFrom(serviceEndpointInterface)) {
                DefaultNamespace.SampleClassSoapBindingStub _stub = new DefaultNamespace.SampleClassSoapBindingStub(new java.net.URL(sampleClass_address), this);
                _stub.setPortName(getsampleClassWSDDServiceName());
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
        if ("sampleClass".equals(inputPortName)) {
            return getsampleClass();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://DefaultNamespace", "sampleClassService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://DefaultNamespace", "sampleClass"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("sampleClass".equals(portName)) {
            setsampleClassEndpointAddress(address);
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
