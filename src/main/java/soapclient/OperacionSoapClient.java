package soapclient;

import org.springframework.web.client.RestClientException;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class OperacionSoapClient extends WebServiceGatewaySupport {

    // Método para consumir el servicio SOAP pasando el objeto de solicitud.
    public Object callSoapService(Object request) {
        try {
            // URI del servicio SOAP
            String uri = "https://www.crcind.com/csp/samples/SOAP.Demo.cls";

            // Marshal y enviar la solicitud SOAP al servicio, luego recibe la respuesta.
            return getWebServiceTemplate().marshalSendAndReceive(uri, request);
        } catch (RestClientException e) {
            // Manejo de errores en la llamada SOAP
            throw new RuntimeException("Error al llamar al servicio SOAP", e);
        }
    }

    // Método para realizar una operación SOAP utilizando un objeto de solicitud.
    public Object OperacionSoapService(Object soapRequest) {
        return callSoapService(soapRequest);  // Llamada al método que envía la solicitud
    }
}