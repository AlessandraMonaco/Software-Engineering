/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.professor_soapserver;

import javax.xml.ws.Endpoint;

/**
 *
 * @author studente
 */
public class Server {
    public static void main(String args[]) throws InterruptedException {
        WSImpl implementor = new WSImpl();
        //This is the address of the ws if you use DOCKER
        //String address = "http://0.0.0.0:7777/WSInterface";
        
        //This is the address for the professor web service
        String address = "http://localhost:7777/WSInterface";
        Endpoint.publish(address, implementor);
        while(true) {}
        //Thread.sleep(60 * 1000);
        //System.exit(0);
    }
}
