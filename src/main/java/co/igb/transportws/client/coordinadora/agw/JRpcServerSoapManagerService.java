
package co.igb.transportws.client.coordinadora.agw;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "JRpcServerSoapManagerService", targetNamespace = "https://sandbox.coordinadora.com/agw/ws/guias/1.6/server.php", wsdlLocation = "file:/C:/Users/jguisao/Documents/server_1.wsdl")
public class JRpcServerSoapManagerService
    extends Service
{

    private final static URL JRPCSERVERSOAPMANAGERSERVICE_WSDL_LOCATION;
    private final static WebServiceException JRPCSERVERSOAPMANAGERSERVICE_EXCEPTION;
    private final static QName JRPCSERVERSOAPMANAGERSERVICE_QNAME = new QName("https://sandbox.coordinadora.com/agw/ws/guias/1.6/server.php", "JRpcServerSoapManagerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/jguisao/Documents/server_1.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        JRPCSERVERSOAPMANAGERSERVICE_WSDL_LOCATION = url;
        JRPCSERVERSOAPMANAGERSERVICE_EXCEPTION = e;
    }

    public JRpcServerSoapManagerService() {
        super(__getWsdlLocation(), JRPCSERVERSOAPMANAGERSERVICE_QNAME);
    }

    public JRpcServerSoapManagerService(WebServiceFeature... features) {
        super(__getWsdlLocation(), JRPCSERVERSOAPMANAGERSERVICE_QNAME, features);
    }

    public JRpcServerSoapManagerService(URL wsdlLocation) {
        super(wsdlLocation, JRPCSERVERSOAPMANAGERSERVICE_QNAME);
    }

    public JRpcServerSoapManagerService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, JRPCSERVERSOAPMANAGERSERVICE_QNAME, features);
    }

    public JRpcServerSoapManagerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public JRpcServerSoapManagerService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns JRpcServerSoapManagerPort
     */
    @WebEndpoint(name = "JRpcServerSoapManagerPort")
    public JRpcServerSoapManagerPort getJRpcServerSoapManagerPort() {
        return super.getPort(new QName("https://sandbox.coordinadora.com/agw/ws/guias/1.6/server.php", "JRpcServerSoapManagerPort"), JRpcServerSoapManagerPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns JRpcServerSoapManagerPort
     */
    @WebEndpoint(name = "JRpcServerSoapManagerPort")
    public JRpcServerSoapManagerPort getJRpcServerSoapManagerPort(WebServiceFeature... features) {
        return super.getPort(new QName("https://sandbox.coordinadora.com/agw/ws/guias/1.6/server.php", "JRpcServerSoapManagerPort"), JRpcServerSoapManagerPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (JRPCSERVERSOAPMANAGERSERVICE_EXCEPTION!= null) {
            throw JRPCSERVERSOAPMANAGERSERVICE_EXCEPTION;
        }
        return JRPCSERVERSOAPMANAGERSERVICE_WSDL_LOCATION;
    }

}
