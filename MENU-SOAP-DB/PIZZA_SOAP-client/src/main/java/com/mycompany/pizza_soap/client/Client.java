/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pizza_soap.client;

import java.util.List;
import soap.ClassNotFoundException_Exception;
import soap.Drink;
import soap.Food;
import soap.Menu;
import soap.SQLException_Exception;

/**
 *
 * @author studente
 */
public class Client {
    public static void main(String[] args) throws NullPointerException, ClassNotFoundException_Exception, 
            SQLException_Exception {
        
        //Print the list of movies 
        List<Food> food = getFoodMenu();
        List<Drink> drinks = getDrinkMenu();
        List<Menu> suggested = getSuggestedMenu();
        
        System.out.println("\n--------FOOD MENU:");
        for(Food item : food) {
            //Print the food infos
            System.out.println(item.getId() + " >> " + item.getFood() +
                    "-----" + item.getCost() + " euro.");
        }
        
        System.out.println("\n--------DRINKS MENU:");
        for(Drink item : drinks) { 
            //Print the drink infos
            System.out.println(item.getId() + " >> " + item.getDrink() +
                    "-----" + item.getCost() + " euro.");
        }
        
        
        System.out.println("\n--------SUGGESTED MENUs:");
        for(Menu item : suggested) {
            System.out.println(item.getId() + " >> " + item.getName() +
                    " >> " + item.getFood().getFood() + " + " + item.getDrink().getDrink() + "-----" + item.getCost() + " euro.");
        }
    }
    
    
    
    
    //Il throws c'è perchè c'era anche on printMovies sul server 
    private static List<Drink> getDrinkMenu() throws ClassNotFoundException_Exception, SQLException_Exception {
        soap.WSImplService service = new soap.WSImplService();
        soap.WSInterface port = service.getWSImplPort();
        List<Drink> results = port.getDrinkMenu();
        return results;
    }
    
    private static List<Food> getFoodMenu() throws ClassNotFoundException_Exception, SQLException_Exception {
        soap.WSImplService service = new soap.WSImplService();
        soap.WSInterface port = service.getWSImplPort();
        List<Food> results = port.getFoodMenu();
        return results;
    }
    
    private static List<Menu> getSuggestedMenu() throws ClassNotFoundException_Exception, SQLException_Exception {
        soap.WSImplService service = new soap.WSImplService();
        soap.WSInterface port = service.getWSImplPort();
        List<Menu> results = port.getSuggestedMenu();
        return results;
    }
    
    
    private static Drink getDrink(String id) throws ClassNotFoundException_Exception, SQLException_Exception {
        soap.WSImplService service = new soap.WSImplService();
        soap.WSInterface port = service.getWSImplPort();
        return port.getDrink(id);
    }
    
    private static Food getFood(String id) throws ClassNotFoundException_Exception, SQLException_Exception {
        soap.WSImplService service = new soap.WSImplService();
        soap.WSInterface port = service.getWSImplPort();
        return port.getFood(id);
    }
}
