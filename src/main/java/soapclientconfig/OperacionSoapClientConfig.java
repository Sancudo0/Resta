package soapclientconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import soapclient.OperacionSoapClient;

@Configuration
public class OperacionSoapClientConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.example.soapclient"); // Paquete generado por wsimport
        return marshaller;
    }

    @Bean
    public OperacionSoapClient soapClient(Jaxb2Marshaller marshaller) {
        OperacionSoapClient client = new OperacionSoapClient();
        client.setDefaultUri("https://www.crcind.com/csp/samples/SOAP.Demo.cls"); // URL del servicio WSDL
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}

