/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movie_soapws;

import javax.xml.ws.Endpoint;

/**
 *
 * @author studente
 */
public class Server {
    public static void main(String args[]) throws InterruptedException {
        WSImpl implementor = new WSImpl();
        //FOR DOCKER USE THIS
        //String address = "http://0.0.0.0:7777/WSInterface";
        
        //WITHOUT DOCKER USE THIS
        String address = "http://localhost:7777/WSInterface";
        Endpoint.publish(address, implementor);
        while(true) {}
        //Thread.sleep(60 * 1000);
        //System.exit(0);
    }
}
