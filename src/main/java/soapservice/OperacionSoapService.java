package soapservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import soapclient.OperacionSoapClient;

@Service
public class OperacionSoapService {

    @Autowired
    private OperacionSoapClient soapClientservice;

    public OperacionSoapService(OperacionSoapClient soapClient) {
        this.soapClientservice = soapClient;
    }

    /**
     * Método para llamar al servicio SOAP y obtener una respuesta.
     *
     * @param request El objeto que contiene los parámetros necesarios para la solicitud SOAP.
     * @return La respuesta del servicio SOAP.
     */
    public Object consumirServicioSoap(Object request) {
        // Realiza la llamada al servicio SOAP a través del cliente configurado
        return soapClientservice.callSoapService(request);
    }
}
