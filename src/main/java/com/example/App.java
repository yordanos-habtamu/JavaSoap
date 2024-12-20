package com.example;

import javax.xml.ws.Endpoint;

import com.example.soap.SoapService;

public class App {
    public static void main(String[] args) {
        // Deploy SOAP Web Service on port 4000
        String soapUrl = "http://localhost:7000/ws/soap";
        Endpoint.publish(soapUrl, new SoapService());
        System.out.println("SOAP Web Service deployed at " + soapUrl);
    }
}