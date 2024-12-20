package com.example.soap;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class SoapClient {
    public static void main(String[] args) throws Exception {
        // The URL of the WSDL for the SOAP service
        URL url = new URL("http://localhost:7000/ws/soap?wsdl");
        
        // QName contains the target namespace and the service name
        QName qname = new QName("http://soap.example.com/", "SoapServiceService");
        
        // Create a Service instance from the WSDL URL and QName
        Service service = Service.create(url, qname);
        
        // Get a proxy for the SOAP service
        SoapService soapService = service.getPort(SoapService.class);
        
        // Invoke the sayHello method of the SOAP service
        System.out.println(soapService.sayHello("World"));
    }
}
