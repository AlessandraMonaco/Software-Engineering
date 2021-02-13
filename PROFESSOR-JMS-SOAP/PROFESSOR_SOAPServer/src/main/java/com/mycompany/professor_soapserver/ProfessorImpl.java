/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.professor_soapserver;

import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author studente
 */
@XmlType(name = "Professor")
public class ProfessorImpl implements Professor{ //REMEMBR THE IMPLEMENTS PART
    private String id;
    private String name;
    private String surname;
    private String course;
    
    //GET methods
    public String getId() { return id; }
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public String getCourse() { return course; }
    
    //SET methods
    public void setId(String i) { id = i; }
    public void setName(String n) { name = n; }
    public void setSurname(String n) { surname = n; }
    public void setCourse(String n) { course = n; }
    
    //CONSTRUCTOR
    public ProfessorImpl(String i, String n, String s, String c) { 
        id = i;
        name = n;
        surname = s;
        course = c;
    } 
    //Empty constructor
    public ProfessorImpl() {}
    
}
