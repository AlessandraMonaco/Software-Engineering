/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movie_soapws;

import java.sql.SQLException;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author studente
 */
@WebService
public interface WSInterface {
    
    //Here you define the services that you need to offer
    
    //get the list of all movies
    public List<Movie> getMovies()throws ClassNotFoundException, SQLException;
    
    //get info related to a single movie with a certain id
    
    
    //get the director details of a movie, from director id
    public Director getDirector(String id) throws ClassNotFoundException, SQLException;
    
}
