/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bookws;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author studente
 */
@XmlRootElement(name = "Book") //REMEMBER THIS!!!!!!!
public class Book {
    
    //DEFINE PRIVATE ATTRIBUTES
    private int id;
    private String title;
    private String author;
    private String yearOfPublication;
    
    //DEFINE GET METHODS
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getYearOfPublication() { return yearOfPublication; }
    
    //DEFINE SET METHODS
    public void setId(int id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setYearOfPublication(String year) { this.yearOfPublication = year; }
    
    //CONSTRUCTOR
    public Book(int id, String title, String author, String year) {
        this.id = id; 
        this.title = title;
        this.author = author;
        this.yearOfPublication = year;
    }
    
    //EMPTY CONSTRUCTOR
    public Book() {}
    
    @Override
    public boolean equals(Object o) {
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int hashCode() {
        return id + title.hashCode();
    }
}
