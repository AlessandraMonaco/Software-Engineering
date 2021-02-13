/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movie_rest_xmlapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 *
 * @author studente
 */
@Path("/movies") 
@Produces("text/xml")
public class MovieRepository {
    
    private Map<Integer, Movie> movies = new HashMap<>(); {
    
        //Simulating a data structure in main memory (!!Do it here and not in the main)
        Director director1 = new Director(1, "Alessio Siena", "1987");
        Director director2 = new Director(2, "Franco Rossi", "1985");
        Director director3 = new Director(3, "Angela Angelini", "1990");
                
        Movie movie1 = new Movie(1, "Alla ricerca dei cfu", "2000", director1);
        Movie movie2 = new Movie(2, "Alla ricerca dei cfu 2", "2001", director1);
        Movie movie3 = new Movie(3, "Alla ricerca dei cfu 3", "2002", director1);
        Movie movie4 = new Movie(4, "Please compile", "2000", director2);
        Movie movie5 = new Movie(5, "Hoping that it works", "2002", director2);
        Movie movie6 = new Movie(6, "Il silenzio degli universitari", "2005", director3);
        
        movies.put(1, movie1);
        movies.put(2, movie2);
        movies.put(3, movie3);
        movies.put(4, movie4);
        movies.put(5, movie5);
        movies.put(6, movie6);
       
    }
    
    private Movie findById(int id){
        for(Map.Entry<Integer, Movie> movie : movies.entrySet()){
            if(movie.getKey() == id){
                return movie.getValue();
            }
        }
        return null;
    }
    
    
    
    //GET A MOVIE
    @GET
    @Path("/{movieId}")
    public Movie getMovie(@PathParam("movieId") int movieId){
        return findById(movieId);
    }
    
    
    @PUT
    @Path("{movieId}")
    public Response updateMovie(@PathParam("movieId") int id, Movie movie){
        Movie existingMovie = findById(id);
        if(existingMovie == null){
            return Response.status(Response.Status.NOT_FOUND).build();
        }else{
            movies.put(id, movie);
            return Response.ok().build();
        }        
    } 
    
    
    @Path("{movieId}/director")
    public Movie pathToDirector(@PathParam("movieId") int movieId){
        return findById(movieId);
    }
    
}
