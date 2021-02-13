/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movie_soapclient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import soap.*;

/**
 *
 * @author studente
 */
public class Client {
    public static void main(String[] args) throws NullPointerException, ClassNotFoundException_Exception, 
            SQLException_Exception {
        
        //Print the list of movies 
        List<Movie> movies = getMovies();
        
        for(Movie next : movies) {
           
            //Get the director
            Director d = next.getDirector();
            //Print the movie infos
            System.out.println("\n--MOVIE " + next.getId() + " : " + next.getTitle() +
                    "(" + next.getYear() + "), directed by " + d.getName() + 
                    "(born in " + d.getYearOfBirth() + ")");
        }
    }
    
    //Il throws c'è perchè c'era anche on printMovies sul server 
    private static List<Movie> getMovies() throws ClassNotFoundException_Exception, SQLException_Exception {
        soap.WSImplService service = new soap.WSImplService();
        soap.WSInterface port = service.getWSImplPort();
        List<Movie> results = port.getMovies();
        return results;
    }
    
    private static Director getDirector(String id) throws ClassNotFoundException_Exception, SQLException_Exception {
        soap.WSImplService service = new soap.WSImplService();
        soap.WSInterface port = service.getWSImplPort();
        return port.getDirector(id);
    }
}


