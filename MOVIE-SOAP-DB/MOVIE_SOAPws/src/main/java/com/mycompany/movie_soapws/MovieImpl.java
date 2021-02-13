/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movie_soapws;

import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author studente
 */
@XmlType(name = "Movie")
public class MovieImpl implements Movie {
    
    //Attributes
    private String id;
    private String title;
    private String year;
    private Director director;
    
    //Get methods
    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getYear() { return year; }
    public Director getDirector() { return director; }
    
    //Set methods
    public void setId(String i) { id = i; }
    public void setTitle(String t) { title = t; }
    public void setYear(String y) { year = y; }
    public void setDirector(Director d) { director = d; }
    
    //Constructors
    public MovieImpl(String id, String title, String year, Director director) { 
        this.id = id;
        this.title = title;
        this.year = year;
        this.director = director;
    } 
    //Empty constructor
    public MovieImpl() {}
    
}

