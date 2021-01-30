
package org.xpande.aduana.ws.crt;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "wsImagen", targetNamespace = "www.aduanas.gub.uy/DAE", wsdlLocation = "file:/home/raul/Desarrollo/IDE/Eclipse/workspace/OpenUpAduana/src/org/openup/aduana/miscelanea/wsdl_CRT_produccion.xsd")
public class WsImagen
    extends Service
{

    private final static URL WSIMAGEN_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(org.xpande.aduana.ws.crt.WsImagen.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = org.xpande.aduana.ws.crt.WsImagen.class.getResource(".");
            url = new URL(baseUrl, "file:/home/raul/Desarrollo/IDE/Eclipse/workspace/OpenUpAduana/src/org/openup/aduana/miscelanea/wsdl_CRT_produccion.xsd");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/home/raul/Desarrollo/IDE/Eclipse/workspace/OpenUpAduana/src/org/openup/aduana/miscelanea/wsdl_CRT_produccion.xsd', retrying as a local file");
            logger.warning(e.getMessage());
        }
        WSIMAGEN_WSDL_LOCATION = url;
    }

    public WsImagen(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsImagen() {
        super(WSIMAGEN_WSDL_LOCATION, new QName("www.aduanas.gub.uy/DAE", "wsImagen"));
    }

    /**
     * 
     * @return
     *     returns WsImagenSoapPort
     */
    @WebEndpoint(name = "wsImagenSoapPort")
    public WsImagenSoapPort getWsImagenSoapPort() {
        return super.getPort(new QName("www.aduanas.gub.uy/DAE", "wsImagenSoapPort"), WsImagenSoapPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsImagenSoapPort
     */
    @WebEndpoint(name = "wsImagenSoapPort")
    public WsImagenSoapPort getWsImagenSoapPort(WebServiceFeature... features) {
        return super.getPort(new QName("www.aduanas.gub.uy/DAE", "wsImagenSoapPort"), WsImagenSoapPort.class, features);
    }

}
