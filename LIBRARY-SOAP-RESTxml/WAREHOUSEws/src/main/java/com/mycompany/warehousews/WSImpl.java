/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.warehousews;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author studente
 */
@WebService(endpointInterface = "com.mycompany.warehousews.WSInterface")
public class WSImpl implements WSInterface {
    
    //List of professors
    List<CommercialBook> books = new ArrayList<>();
    
    //Initialize the structure with some data (in memory)
    { 
    
        Seller sell1 = new SellerImpl("La Feltrinelli", "12/02/2021");
        Seller sell2 = new SellerImpl("Manzoni", "01/02/2021");
        List<Seller> sb1 = new ArrayList<>();
        sb1.add(sell1);
        sb1.add(sell2);
        CommercialBook book1 = new CommercialBookImpl(1,12.50f,sb1);
        
        List<Seller> sb2 = new ArrayList<>();
        sb2.add(sell1);
        sb2.add(sell2);
        CommercialBook book2 = new CommercialBookImpl(2,8.50f,sb2);
        
        Seller sell3 = new SellerImpl("Amatori", "18/02/2021");
        Seller sell4 = new SellerImpl("Bookers", "01/03/2021");
        List<Seller> sb3 = new ArrayList<>();
        sb3.add(sell3);
        sb3.add(sell4);
        sb3.add(sell1);
        sb3.add(sell2);
        CommercialBook book3 = new CommercialBookImpl(3,21.99f,sb3);
        
        CommercialBook book4 = new CommercialBookImpl(4, 13.99f, sb2);
        
        Seller sell5 = new SellerImpl("Josue", "15/04/2021");
        Seller sell6 = new SellerImpl("Martini", "11/02/2021");
        List<Seller> sb4 = new ArrayList<>();
        sb4.add(sell5);
        sb4.add(sell6);
        CommercialBook book5 = new CommercialBookImpl(5, 18.90f, sb4);
        
        //Add the books
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
    }
    
    public CommercialBook getBookInfos(int bookId) {
        CommercialBook found = new CommercialBookImpl();
        for(CommercialBook book : books){
           if(book.getId()==bookId){
               found = book;
               break;
           }
        }
        return found;
    }
    
    
    public Seller getSellerInfos(int bookId, String name) {
        //Find the book
        CommercialBook found = new CommercialBookImpl();
        for(CommercialBook book : books){
            if(book.getId()==(bookId)){
                found = book;
            }
        }
        //Find the seller with the name
        Seller my_seller = new SellerImpl();
        List<Seller> s_list = found.getSellers();
        for(Seller s : s_list){
            if(s.getName().equals(name)) {
                my_seller = s;
                break;
            }
        }
        return my_seller;
    } 
}
