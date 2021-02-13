/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.professor_soapserver;

import javax.jws.WebService;

/**
 *
 * @author studente
 */
@WebService
public interface WSInterface {
    
    //Define the SERVICES offered
    //1. given an id return the full details of a Professor
    public Professor getDetails(String id);
    
}
