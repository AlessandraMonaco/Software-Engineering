/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.book_client;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.Scanner;
import javax.xml.bind.JAXB;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import soap.CommercialBook;
import soap.*;

/**
 *
 * @author studente
 */
public class Client {
    private static final String BASE_URL = "http://localhost:9999/books/";
    private static CloseableHttpClient client;
    
    public static void main(String[] args) throws IOException{
        client = HttpClients.createDefault();
        
        // Example GET 1
        //Get the list of all books (id and name)
        //Print of book should have just id and title
        printBookList();
        
        //Example GET 2
        //Gets details of a certain book by id
        Scanner myObj = new Scanner(System.in);
        System.out.print("\n\nENTER BOOK ID:");
        int id_search = myObj.nextInt();
        //int id_search = 1; //get from user
        printBookInfo(id_search);
        
        //Example GET 3
        //get Seller's delivery date for a book
        myObj = new Scanner(System.in);
        System.out.print("\n\nENTER SELLER NAME (respect upper cases):");
        String s_name = myObj.nextLine();
        //String s_name = "Manzoni"; //get seller name by user
        printSellerDelivery(id_search, s_name);
        
        
        
        client.close();  
    }
    
    //REST
    private static Book getBook(int bookOrder) throws IOException {
        final URL url = new URL(BASE_URL + bookOrder);
        final InputStream input = url.openStream();
        return JAXB.unmarshal(new InputStreamReader(input), Book.class);
    }
    
    //SOAP
    private static CommercialBook getBookInfos(int id) {
        soap.WSImplService service = new soap.WSImplService();
        soap.WSInterface port = service.getWSImplPort();
        return port.getBookInfos(id);
    }
    
    private static Seller getSellerInfos(int id, String name) {
        soap.WSImplService service = new soap.WSImplService();
        soap.WSInterface port = service.getWSImplPort();
        return port.getSellerInfos(id, name);
    }
    
    //CLIENT FUNCTION to get the list of all books
    private static void printBookList() throws IOException {
        System.out.println("THIS IS THE LIST OF AVAILABLE BOOKS------\n");
        int i;
        for(i=1; i<=11; i++) {
            Book book = getBook(i);
            System.out.println("Book " + book.getId() + " >> " + book.getTitle());
        }
    }
    
    //CLIENT FUNCTION to get a particular book infos
    private static void printBookInfo(int id_search) throws IOException {
        Book searched = getBook(id_search);
        System.out.println("\nDetails of the searched book: ");
        System.out.println(searched); //prints book infos
        CommercialBook c = getBookInfos(id_search);
        System.out.println("price : " + c.getPrice() + " euros.");
        List<Seller> sellers = c.getSellers();
        System.out.print("Sellers : " );
        for(Seller seller : sellers){
            System.out.print(seller.getName() + " - ");
        }
    }
    
    private static void printSellerDelivery(int bookId, String s_name) {
        Seller s = getSellerInfos(bookId,s_name);
        System.out.println("Delivery date for seller " + s.getName() + " and book "
                + bookId + " is : " + s.getDeliveryDate());
    }
}
