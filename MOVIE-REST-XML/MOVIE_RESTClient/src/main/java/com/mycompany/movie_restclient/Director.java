/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movie_restclient;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 *
 * @author studente
 */
@JacksonXmlRootElement(localName = "Director") //ADD THIS, REMEMBER!!!!1
public class Director {
    //Attributes of Director
    private String id;
    private String name;
    private String yearOfBirth;
    
    //Defining GET methods
    public String getId() { return id; }
    public String getName() { return name; }
    public String getYearOfBirth() { return yearOfBirth; }
    
    //Defining SET methods
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setYearOfBirth(String year) { this.yearOfBirth = year; }
    
    //Override hash code to override equals method
    //Id is the unique identifier, so we just need hashcode of id
    @Override
    public int hashCode() {
        return id.hashCode();
    }
    
    //Now we can override equals
    public boolean equals(Object obj) {
        return (obj instanceof Director) && (id == ((Director) obj).getId());
    }
    
    @Override
    public String toString() {
        return "director " + name + "(" + yearOfBirth + ")";
    }
}

