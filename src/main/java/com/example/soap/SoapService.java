package com.example.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class SoapService {

    @WebMethod
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}