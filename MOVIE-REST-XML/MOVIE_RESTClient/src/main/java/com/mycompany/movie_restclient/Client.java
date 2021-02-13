/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movie_restclient;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import javax.xml.bind.JAXB;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 *
 * @author studente
 */
public class Client {
    
    private static final String BASE_URL = "http://localhost:8080/movies/";
    private static CloseableHttpClient client;
    
    public static void main(String[] args) throws IOException { 
        client = HttpClients.createDefault();
        int n_movies = 15;
 
        //Suppose we know how many movies we have in the db
        //Suppose also that the paths are ordered like
        //movie/1,   movie/2,  movie/3 and so on
        for(int i=1; i<=n_movies; i++) {
            
            //TAKE THE MOVIE
            ObjectMapper mapper = new ObjectMapper();
            URL url = new URL(BASE_URL + i); //i-th movie
            InputStream input = url.openStream();
            
            //To correctly transform the json object to the Movie object
            Movie m = (Movie)mapper.readValue(input, Movie.class);        
            System.out.println(m); 
            //when you print movie, it is printed according to the function 
            //that you have defined on the server (toString function in Movie.java)
            
            //TAKE THE DIRECTOR INFO
            //get the director id
            Director director = m.getDirector();
            //ObjectMapper mapper2 = new ObjectMapper();
            //URL urld = new URL(BASE_URL + "2/" + directorId); //2 is just an example
        
            //InputStream inputd = urld.openStream();
        
            //To correctly transform the json object to the Director object
            //Director d = (Director)mapper2.readValue(inputd, Director.class);        
            //System.out.println(d);
            System.out.println(director);
        }        

    }
}
