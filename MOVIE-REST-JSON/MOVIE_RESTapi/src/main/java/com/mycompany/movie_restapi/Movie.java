/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movie_restapi;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
/**
 *
 * @author studente
 */
@JacksonXmlRootElement(localName = "Movie") //ADD THIS, REMEMBER!!!!1
public class Movie {
    //Attributes of Movie
    private String id;
    private String title;
    private String year;
    private Director director;
    
    //Defining GET methods
    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getYear() { return year; }
    public Director getDirector() { return director; }
    
    //Defining SET methods
    public void setId(String id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setYear(String year) { this.year = year; }
    public void setDirector(Director d) { this.director = d; }
    
    //Override hash code to override equals method
    //Id is the unique identifier, so we just need hashcode of id
    @Override
    public int hashCode() {
        return id.hashCode();
    }
    
    //Now we can override equals
    public boolean equals(Object obj) {
        return (obj instanceof Movie) && (id == ((Movie) obj).getId());
    }
    
    @Override
    public String toString() {
        return "\nMOVIE " + id + ": " + title + "(" + year + ")";
    }
    
}
