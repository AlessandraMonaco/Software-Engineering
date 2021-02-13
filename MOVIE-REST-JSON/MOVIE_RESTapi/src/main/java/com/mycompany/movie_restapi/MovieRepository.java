/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movie_restapi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.Consumes;
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
public class MovieRepository {
    private Connection conn;
    
    
    public void setConnection(String pos) {
        try {
            try {
                Class.forName("org.sqlite.JDBC");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MovieRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            conn = DriverManager.getConnection("jdbc:sqlite:"+pos);
            
        } catch (SQLException ex) {
            Logger.getLogger(MovieRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    //Define the GET method
    @GET
    @Path("{movieId}")
    @Produces("application/json") 
    //through this annotation I am telling to the system that it has to return info as json

    public Movie getMovie(@PathParam("movieId") String movieId) {
        return findById(movieId);
    }
    
    
    
    //Define the PUT method if you want to update
    
    
    
    private Movie findById(String id) {
        
        PreparedStatement stat = null;
        Movie m = null;
        Director d = null;
        try {
            stat = conn.prepareStatement("select * from MOVIES where id = ?");
            stat.setString(1, String.valueOf(id));
        
        ResultSet rs = stat.executeQuery();
        if (rs.next()) {
            m = new Movie();
            m.setId((rs.getString("id")));
            m.setTitle(rs.getString("title"));
            m.setYear(rs.getString("year"));
            Director director = findDirectorById(rs.getString("directorId"));
            m.setDirector(director);
            Logger.getLogger(MovieRepository.class.getName()).log(Level.INFO, "Accessed : " + m);
        }
        rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(MovieRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        /* simple version 
        for (Map.Entry<Integer, Fligth> fligth : fligths.entrySet()) {
            if (fligth.getKey() == id) {
                return fligth.getValue();
            }
        }
        */
        return m;   
    }
    
    
    
    
    //NOT NEEDED, WE HAVE DIRECTOR INSIDE /movies/{movieId}
    @GET  //REMEMBER THIS!!!!!!!!!
    //@Path("{movieId}/{directorId}/")
    @Path("{movieId}/{directorId}/")
    @Produces("application/json")  //REMEMBER THIS!!!!
    public Director pathToDirector(@PathParam("directorId") String directorId){
        return findDirectorById(directorId);
    }
    
    
    private Director findDirectorById(String id) {
        
        PreparedStatement stat = null;
        Director d = null;
        try {
            stat = conn.prepareStatement("select * from DIRECTORS where id = ?");
            stat.setString(1, String.valueOf(id));
        
        ResultSet rs = stat.executeQuery();
        if (rs.next()) {
            d = new Director();
            d.setId((rs.getString("id")));
            d.setName(rs.getString("name"));
            d.setYearOfBirth(rs.getString("yearOfBirth"));
            Logger.getLogger(MovieRepository.class.getName()).log(Level.INFO, "Accessed : " + d);
        }
        rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(MovieRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        /* simple version 
        for (Map.Entry<Integer, Fligth> fligth : fligths.entrySet()) {
            if (fligth.getKey() == id) {
                return fligth.getValue();
            }
        }
        */
        return d;   
    }
   
}
