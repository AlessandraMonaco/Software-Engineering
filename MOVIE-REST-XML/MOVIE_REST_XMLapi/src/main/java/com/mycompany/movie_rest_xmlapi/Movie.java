/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movie_rest_xmlapi;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author studente
 */
@XmlRootElement(name = "Movie") //REMEMBER THIS!!!!!!!
@XmlAccessorType (XmlAccessType.FIELD)
public class Movie {
    
    //Define the PRIVATE attributes
    private int id;
    private String title;
    private String year;
    private Director director;
    
    
    
    //Define GET methods
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getYear() { return year; }
    public Director getDirector() { return director; }
    
    //Define SET methods
    public void setId(int id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setYear(String year) { this.year = year; }
    public void setDirector(Director director) { this.director = director; }
    
    //Constructor
    public Movie(int id, String title, String year, Director director) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.director = director;
    }
    
    //EMPTY CONSTRUCTOR IS NEEDED, OTHERWISE Jaxb Illegal Annotation exceptions
    public Movie() {}
    
    @Override
    public boolean equals(Object o) {
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int hashCode() {
        return title.hashCode();
    }
    
   
    @GET
    @Path("{directorId}")
    public Director getDirectorInfo(@PathParam("directorId") int directorId){
        return this.director; //find in the set of students of the course
        //findById is defined in CourseRepository
    }
    
}
