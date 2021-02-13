/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bookws;

import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author studente
 */
@Path("/books") 
@Produces("text/xml")
public class BookRepository {
    
    private Map<Integer,Book> books = new HashMap<>(); {
    
        //Simulating a data structure in main memory (!!Do it here and not in the main)
        Book book1 = new Book(1, "Il silenzio dell'acqua", "Franca Marini", "2010");
        Book book2 = new Book(2, "Vivere", "Angelo Angelini", "2000");
        Book book3 = new Book(3, "Vieni qui", "Anna Rosi", "1997");
        Book book4 = new Book(4, "Rose in rose", "Rose rossi", "2010");
        Book book5 = new Book(5, "Remember me", "Joe Black", "1985" );
        Book book6 = new Book(6, "Jenny in Paris", "Mark Reen", "2000");
        Book book7 = new Book(7, "Anxiety", "Gianna Karen", "1995");
        Book book8 = new Book(8, "Orgoglio e pregiudizio", "Jane Austen", "1880");
        Book book9 = new Book(9, "Alla ricerca della felicita", "Mark Street", "1990");
        Book book10 = new Book(10, "Senza paura", "Sara Restaini", "2020");
        Book book11 = new Book(11, "Pandemic", "Josh Dister", "2021");
        
        //Add the created books
        books.put(1, book1);
        books.put(2, book2);
        books.put(3, book3);
        books.put(4, book4);
        books.put(5, book5);
        books.put(6, book6);
        books.put(7, book7);
        books.put(8, book8);
        books.put(9, book9);
        books.put(10, book10);
        books.put(11, book11);

    }
    
    private Book findById(int id){
        for(Map.Entry<Integer,Book> book : books.entrySet()){
            if(book.getKey() == id){
                return book.getValue();
            }
        }
        return null;
    }
    
    //GET A BOOK
    @GET
    @Path("/{bookId}")
    public Book getBook(@PathParam("bookId") int bookId){
        return findById(bookId);
    }
    
    //We don't need put or post for our purposes
}
