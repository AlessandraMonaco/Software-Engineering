/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movie_rest_xmlapi;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;

/**
 *
 * @author studente
 */
public class Server {
    public static void main(String... args){
        JAXRSServerFactoryBean factoryBean = new JAXRSServerFactoryBean();
        factoryBean.setResourceClasses(MovieRepository.class);
        factoryBean.setResourceProvider(new SingletonResourceProvider(new MovieRepository()));
        
        factoryBean.setAddress("http://localhost:9999/"); 
        
        org.apache.cxf.endpoint.Server server = factoryBean.create();
        
        while(true){
            
        }
    }
}
