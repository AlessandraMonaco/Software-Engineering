/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movie_soapws;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;

/**
 *
 * @author studente
 */
@WebService(endpointInterface = "com.mycompany.movie_soapws.WSInterface")
public class WSImpl implements WSInterface {
    
    public List<Movie> getMovies() throws ClassNotFoundException, SQLException{
        
        List<Movie> movies = new ArrayList<>();          
       
        //Connect to the database
        Class.forName("org.sqlite.JDBC"); //Ask for jdbc provider (Class)
        //ask for a connection with sql lite
        String database = "/home/studente/movie_db.sql" ;
        //for DOCKER ONLY (db is in the same folder as dockerfiles
        //String database = "movie_db.sql" ;
        Connection conn = DriverManager.getConnection("jdbc:sqlite:"+database);
        Statement stat = conn.createStatement();
        
        ResultSet rs = stat.executeQuery("select * from MOVIES;");
        System.out.print("MOVIES--------------------------------\n");
        while (rs.next()) {
            //You can not print, you should add to the list (they should be printed at
            //client side, not server side
            Director director = getDirector(rs.getString("directorId"));
            Movie movie = new MovieImpl(rs.getString("id"), rs.getString("title"),
                    rs.getString("year"), director);
            movies.add(movie);
            /*
            System.out.print("\nMovie " + rs.getString("id") + ":");
            System.out.println(rs.getString("title") + "(" + 
                        rs.getString("year") + ")");
             
            Director director = getDirector(rs.getString("directorId"));
            System.out.println("Directed by " + director.getName()+ "(" + 
                        director.getYearOfBirth() + ")");
            */
        }
        rs.close();
        conn.close();
        return movies;
    }
    
   
    public Director getDirector(String id) throws ClassNotFoundException, SQLException {
        //Here you define the method to get a director object by its id
        String database = "/home/studente/movie_db.sql" ;
        Connection conn = DriverManager.getConnection("jdbc:sqlite:"+database);
        PreparedStatement stat = null;
        Director d = null;
        stat = conn.prepareStatement("select * from DIRECTORS where id = ?");
        stat.setString(1, String.valueOf(id));
        
        ResultSet rs = stat.executeQuery();
        if (rs.next()) {
            d = new DirectorImpl(rs.getString("id"), rs.getString("name"), 
                    rs.getString("yearOfBirth"));
        }
        rs.close();
        return d;
    }

}
