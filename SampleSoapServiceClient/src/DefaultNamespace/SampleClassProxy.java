package DefaultNamespace;

public class SampleClassProxy implements DefaultNamespace.SampleClass {
  private String _endpoint = null;
  private DefaultNamespace.SampleClass sampleClass = null;
  
  public SampleClassProxy() {
    _initSampleClassProxy();
  }
  
  public SampleClassProxy(String endpoint) {
    _endpoint = endpoint;
    _initSampleClassProxy();
  }
  
  private void _initSampleClassProxy() {
    try {
      sampleClass = (new DefaultNamespace.SampleClassServiceLocator()).getsampleClass();
      if (sampleClass != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sampleClass)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sampleClass)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sampleClass != null)
      ((javax.xml.rpc.Stub)sampleClass)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DefaultNamespace.SampleClass getSampleClass() {
    if (sampleClass == null)
      _initSampleClassProxy();
    return sampleClass;
  }
  
  public java.lang.String method1() throws java.rmi.RemoteException{
    if (sampleClass == null)
      _initSampleClassProxy();
    return sampleClass.method1();
  }
  
  public java.lang.String interactMethod(java.lang.String abc) throws java.rmi.RemoteException{
    if (sampleClass == null)
      _initSampleClassProxy();
    return sampleClass.interactMethod(abc);
  }
  
  
}