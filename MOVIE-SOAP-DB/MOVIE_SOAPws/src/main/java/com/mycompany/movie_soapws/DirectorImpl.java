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
@XmlType(name = "Director")
public class DirectorImpl implements Director {
    
    //Attributes
    private String id;
    private String name;
    private String yearOfBirth;
    
    //Get methods
    public String getId() { return id; }
    public String getName() { return name; }
    public String getYearOfBirth() { return yearOfBirth; }
    
    //Set methods
    public void setId(String i) { id = i; }
    public void setName(String n) { name = n; }
    public void setYearOfBirth(String y) { yearOfBirth = y; }
    
    //Constructors
    public DirectorImpl(String id, String name, String year) { 
        this.id = id;
        this.name = name;
        this.yearOfBirth = year;
    } 
    //Empty constructor
    public DirectorImpl() {}
    
}
