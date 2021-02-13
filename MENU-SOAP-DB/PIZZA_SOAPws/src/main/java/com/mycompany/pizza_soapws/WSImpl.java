/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pizza_soapws;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author studente
 */
@WebService(endpointInterface = "com.mycompany.pizza_soapws.WSInterface") //REMEMBER!!
public class WSImpl implements WSInterface{ //REMEMBER
    
    //Here we implement the services declared in the WSInterface
    public List<Food> getFoodMenu()throws ClassNotFoundException, SQLException {
        
        List<Food> food = new ArrayList<>();
        
        //Connect to the database
        Class.forName("org.sqlite.JDBC"); //Ask for jdbc provider (Class)
        //ask for a connection with sql lite
        String database = "/home/studente/MENU.sql" ;
        Connection conn = DriverManager.getConnection("jdbc:sqlite:"+database);
        Statement stat = conn.createStatement();
        
        ResultSet rs = stat.executeQuery("select * from FOOD;");
        System.out.print("Food menu retrieved\n");
        while (rs.next()) {
            //You can not print, you should add to the list (they should be printed at
            //client side, not server side
            Food item = new FoodImpl(rs.getString("id"), rs.getString("food"),
                    rs.getFloat("cost"));
            food.add(item);
        }
        rs.close();
        conn.close();
        return food;
    }
    
    
    public List<Drink> getDrinkMenu()throws ClassNotFoundException, SQLException {
        
        List<Drink> drinks = new ArrayList<>();
        
        //Connect to the database
        Class.forName("org.sqlite.JDBC"); //Ask for jdbc provider (Class)
        //ask for a connection with sql lite
        String database = "/home/studente/MENU.sql" ;
        Connection conn = DriverManager.getConnection("jdbc:sqlite:"+database);
        Statement stat = conn.createStatement();
        
        ResultSet rs = stat.executeQuery("select * from DRINKS;");
        System.out.print("Drink menu retrieved\n");
        while (rs.next()) {
            //You can not print, you should add to the list (they should be printed at
            //client side, not server side
            Drink item = new DrinkImpl(rs.getString("id"), rs.getString("drink"),
                    rs.getFloat("cost"));
            drinks.add(item);
        }
        rs.close();
        conn.close();
        return drinks;
    }
    
    
    
    public List<Menu> getSuggestedMenu()throws ClassNotFoundException, SQLException {
        
        List<Menu> menu = new ArrayList<>();
        
        //Connect to the database
        Class.forName("org.sqlite.JDBC"); //Ask for jdbc provider (Class)
        //ask for a connection with sql lite
        String database = "/home/studente/MENU.sql" ;
        Connection conn = DriverManager.getConnection("jdbc:sqlite:"+database);
        Statement stat = conn.createStatement();
        
        ResultSet rs = stat.executeQuery("select * from FULLMENU;");
        System.out.print("Suggested menu retrieved\n");
        while (rs.next()) {
            //You can not print, you should add to the list (they should be printed at
            //client side, not server side
            Drink drink = getDrink(rs.getString("drinkId"));
            Food food = getFood(rs.getString("foodId"));
            Menu item = new MenuImpl(rs.getString("id"), rs.getString("name"), 
                    drink, food, rs.getFloat("cost"));
            menu.add(item);
        }
        rs.close();
        conn.close();
        return menu;
    }
    
    
    public Food getFood(String id) throws ClassNotFoundException, SQLException {
        //Here you define the method to get a director object by its id
        String database = "/home/studente/MENU.sql" ;
        Connection conn = DriverManager.getConnection("jdbc:sqlite:"+database);
        PreparedStatement stat = null;
        Food f = null;
        stat = conn.prepareStatement("select * from FOOD where id = ?");
        stat.setString(1, String.valueOf(id));
        
        ResultSet rs = stat.executeQuery();
        if (rs.next()) {
            f = new FoodImpl(rs.getString("id"), rs.getString("food"), 
                    rs.getFloat("cost"));
        }
        rs.close();
        return f;
    }
    
    public Drink getDrink(String id) throws ClassNotFoundException, SQLException {
        //Here you define the method to get a director object by its id
        String database = "/home/studente/MENU.sql" ;
        Connection conn = DriverManager.getConnection("jdbc:sqlite:"+database);
        PreparedStatement stat = null;
        Drink d = null;
        stat = conn.prepareStatement("select * from DRINKS where id = ?");
        stat.setString(1, String.valueOf(id));
        
        ResultSet rs = stat.executeQuery();
        if (rs.next()) {
            d = new DrinkImpl(rs.getString("id"), rs.getString("drink"), 
                    rs.getFloat("cost"));
        }
        rs.close();
        return d;
    }
}
