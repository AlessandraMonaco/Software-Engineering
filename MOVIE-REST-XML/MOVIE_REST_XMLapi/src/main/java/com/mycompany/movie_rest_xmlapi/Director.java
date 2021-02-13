/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movie_rest_xmlapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author studente
 */
@XmlRootElement(name = "Director") //REMEMBER THIS!!!!!!
//@XmlAccessorType (XmlAccessType.FIELD)
public class Director {
    
    //Define the PRIVATE attributes
    private int id;
    private String name;
    private String yearOfBirth;
    
    //Define GET methods
    public int getId() { return id; }
    public String getName() { return name; }
    public String getYearOfBirth() { return yearOfBirth; }
    
    //Define SET methods
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setYearOfBirth(String year) { this.yearOfBirth = year; }
    
    //CONSTRUCTOR
    public Director(int id, String name, String yearOfBirth) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }
    
    public Director() {}
    
    @Override
    public boolean equals(Object o) {
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
