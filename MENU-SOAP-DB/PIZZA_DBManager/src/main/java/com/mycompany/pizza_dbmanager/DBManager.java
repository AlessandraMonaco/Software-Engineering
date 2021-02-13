/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pizza_dbmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author studente
 */
public class DBManager {
    public static void main(String[] args) throws Exception {
        
        //Set up the connection
        Class.forName("org.sqlite.JDBC"); //Ask for jdbc provider (Class)
        //ask for a connection with sql lite
        Connection conn = DriverManager.getConnection("jdbc:sqlite:"+args[0]);
        Statement stat = conn.createStatement();

        if (args[1].equals("create")) {
            
            //Create tables
            stat.executeUpdate("drop table if exists FOOD;");
            stat.executeUpdate("drop table if exists DRINKS;");
            stat.executeUpdate("drop table if exists FULLMENU;");

            stat.executeUpdate("create table FOOD (id, food, cost);");
            stat.executeUpdate("create table DRINKS (id, drink, cost);");
            stat.executeUpdate("create table FULLMENU (id, name, drinkId, foodId, cost);");
            
            //ADD DATA TO THE FOOD TABLE
            PreparedStatement prep = conn.prepareStatement(
                    "insert into FOOD values (?, ?, ?);");
            //? ? are the parameters that I have to set later 
            //I do in this way to use the same prepareStatement for all the data
            prep.setString(1, "1"); //parameter 1: id
            prep.setString(2, "Margherita"); //parameter 2: pizza
            prep.setFloat(3, 5.50f);  //parameter 3: cost
            prep.addBatch();
            conn.setAutoCommit(false);
            prep.executeBatch();
            conn.setAutoCommit(true);
            
            prep.setString(1, "2"); //parameter 1: id
            prep.setString(2, "Diavola"); //parameter 2: pizza
            prep.setFloat(3, 8.50f);  //parameter 3: cost
            prep.addBatch();
            conn.setAutoCommit(false);
            prep.executeBatch();
            conn.setAutoCommit(true);
            
            prep.setString(1, "3"); //parameter 1: id
            prep.setString(2, "Bufalina"); //parameter 2: pizza
            prep.setFloat(3, 8.50f);  //parameter 3: cost
            prep.addBatch();
            conn.setAutoCommit(false);
            prep.executeBatch();
            conn.setAutoCommit(true);
            
            prep.setString(1, "4"); //parameter 1: id
            prep.setString(2, "Marinara"); //parameter 2: pizza
            prep.setFloat(3, 4.50f);  //parameter 3: cost
            prep.addBatch();
            conn.setAutoCommit(false);
            prep.executeBatch();
            conn.setAutoCommit(true);
            
            prep.setString(1, "5"); //parameter 1: id
            prep.setString(2, "Quattro stagioni"); //parameter 2: pizza
            prep.setFloat(3, 6.50f);  //parameter 3: cost
            prep.addBatch();
            conn.setAutoCommit(false);
            prep.executeBatch();
            conn.setAutoCommit(true);
            
            prep.setString(1, "6"); //parameter 1: id
            prep.setString(2, "Wurstel e patatine"); //parameter 2: pizza
            prep.setFloat(3, 6.50f);  //parameter 3: cost
            prep.addBatch();
            conn.setAutoCommit(false);
            prep.executeBatch();
            conn.setAutoCommit(true);
            
            prep.setString(1, "7"); //parameter 1: id
            prep.setString(2, "Fish & chips"); //parameter 2: pizza
            prep.setFloat(3, 8.50f);  //parameter 3: cost
            prep.addBatch();
            conn.setAutoCommit(false);
            prep.executeBatch();
            conn.setAutoCommit(true);
            
            prep.setString(1, "8"); //parameter 1: id
            prep.setString(2, "Chips with cheese"); //parameter 2: pizza
            prep.setFloat(3, 4.50f);  //parameter 3: cost
            prep.addBatch();
            conn.setAutoCommit(false);
            prep.executeBatch();
            conn.setAutoCommit(true);
            
            prep.setString(1, "9"); //parameter 1: id
            prep.setString(2, "Salmone sandwich"); //parameter 2: pizza
            prep.setFloat(3, 3.50f);  //parameter 3: cost
            prep.addBatch();
            conn.setAutoCommit(false);
            prep.executeBatch();
            conn.setAutoCommit(true);
            
            prep.setString(1, "10"); //parameter 1: id
            prep.setString(2, "Hamburger"); //parameter 2: pizza
            prep.setFloat(3, 7.50f);  //parameter 3: cost
            prep.addBatch();
            conn.setAutoCommit(false);
            prep.executeBatch();
            conn.setAutoCommit(true);
            
            prep.setString(1, "11"); //parameter 1: id
            prep.setString(2, "Hot dog"); //parameter 2: pizza
            prep.setFloat(3, 5.50f);  //parameter 3: cost
            prep.addBatch();
            conn.setAutoCommit(false);
            prep.executeBatch();
            conn.setAutoCommit(true);
            
            prep.setString(1, "12"); //parameter 1: id
            prep.setString(2, "Caesar salad"); //parameter 2: pizza
            prep.setFloat(3, 6.50f);  //parameter 3: cost
            prep.addBatch();
            conn.setAutoCommit(false);
            prep.executeBatch();
            conn.setAutoCommit(true);
            
            System.out.println("Food table successfully created!");
            
            //ADD VALUES TO THE TABLE OF DRINKS
            PreparedStatement prep2 = conn.prepareStatement(
                    "insert into DRINKS values (?, ?, ?);");
            //? ? are the parameters that I have to set later 
            //I do in this way to use the same prepareStatement for all the data
            prep2.setString(1, "1"); //parameter 1: id
            prep2.setString(2, "Coca Cola"); //parameter 2: pizza
            prep2.setFloat(3, 2.00f);  //parameter 3: cost
            prep2.addBatch();
            conn.setAutoCommit(false);
            prep2.executeBatch();
            conn.setAutoCommit(true);
            
            prep2.setString(1, "2"); //parameter 1: id
            prep2.setString(2, "Pepsi"); //parameter 2: pizza
            prep2.setFloat(3, 2.00f);  //parameter 3: cost
            prep2.addBatch();
            conn.setAutoCommit(false);
            prep2.executeBatch();
            conn.setAutoCommit(true);
            
            prep2.setString(1, "3"); //parameter 1: id
            prep2.setString(2, "Water"); //parameter 2: pizza
            prep2.setFloat(3, 1.00f);  //parameter 3: cost
            prep2.addBatch();
            conn.setAutoCommit(false);
            prep2.executeBatch();
            conn.setAutoCommit(true);
            
            prep2.setString(1, "4"); //parameter 1: id
            prep2.setString(2, "Fanta"); //parameter 2: pizza
            prep2.setFloat(3, 2.00f);  //parameter 3: cost
            prep2.addBatch();
            conn.setAutoCommit(false);
            prep2.executeBatch();
            conn.setAutoCommit(true);
            
            System.out.println("Drinks table successfully created!");
            
            //ADD VALUES TO THE TABLE OF FULLMENU (id, name, idDrink, idFood, cost)
            PreparedStatement prep3 = conn.prepareStatement(
                    "insert into FULLMENU values (?, ?, ?, ?, ?);");
            //? ? are the parameters that I have to set later 
            //I do in this way to use the same prepareStatement for all the data
            prep3.setString(1, "1"); //parameter 1: id
            prep3.setString(2, "Fit menu"); //parameter 2: menu name
            prep3.setString(3, "3"); //id drink
            prep3.setString(4, "12"); //id food
            prep3.setFloat(5, 6.00f);  //parameter 5: cost of full menu
            prep3.addBatch();
            conn.setAutoCommit(false);
            prep3.executeBatch();
            conn.setAutoCommit(true);
            
            prep3.setString(1, "2"); //parameter 1: id
            prep3.setString(2, "American"); //parameter 2: menu name
            prep3.setString(3, "1"); //id drink
            prep3.setString(4, "10"); //id food
            prep3.setFloat(5, 8.00f);  //parameter 5: cost of full menu
            prep3.addBatch();
            conn.setAutoCommit(false);
            prep3.executeBatch();
            conn.setAutoCommit(true);
            
            prep3.setString(1, "3"); //parameter 1: id
            prep3.setString(2, "English"); //parameter 2: menu name
            prep3.setString(3, "2"); //id drink
            prep3.setString(4,"7"); //id food
            prep3.setFloat(5, 9.00f);  //parameter 5: cost of full menu
            prep3.addBatch();
            conn.setAutoCommit(false);
            prep3.executeBatch();
            conn.setAutoCommit(true);
            
            prep3.setString(1, "4"); //parameter 1: id
            prep3.setString(2, "Margherita menu");
            prep3.setString(3, "1"); //id drink
            prep3.setString(4,"1"); //id food
            prep3.setFloat(5, 6.00f);  //parameter 5: cost of full menu
            prep3.addBatch();
            conn.setAutoCommit(false);
            prep3.executeBatch();
            conn.setAutoCommit(true);
            
            prep3.setString(1, "5"); //parameter 1: id
            prep3.setString(2, "Aperitivo"); //parameter 2: menu name
            prep3.setString(3, "4"); //id drink
            prep3.setString(4,"8"); //id food
            prep3.setFloat(5, 5.00f);  //parameter 5: cost of full menu
            prep3.addBatch();
            conn.setAutoCommit(false);
            prep3.executeBatch();
            conn.setAutoCommit(true);
            
            System.out.println("Menu table successfully created!");
        } else {
            
            //else we have to read the db, not to create
            ResultSet rs = stat.executeQuery("select * from FOOD;");
            System.out.print("FOOD MENU--------------------------------\n");
            while (rs.next()) {
                System.out.print(rs.getString("id") + " >> ");
                System.out.println(rs.getString("food") + " " + 
                        rs.getFloat("cost") + " euro.");
            }
            rs.close();
            
            rs = stat.executeQuery("select * from DRINKS;");
            System.out.print("DRINKS MENU--------------------------------\n");
            while (rs.next()) {
                System.out.print(rs.getString("id") + " >> ");
                System.out.println(rs.getString("drink") + " " + 
                        rs.getFloat("cost") + " euro.");
            }
            rs.close();
            
            rs = stat.executeQuery("select * from FULLMENU;");
            System.out.print("SOME PREBUILT MENU--------------------------------\n");
            while (rs.next()) {
                System.out.print(rs.getString("id") + " >> ");
                System.out.println(rs.getString("name") + " contains drink " + 
                        rs.getString("drinkId") + " and food " + rs.getString("foodId")
                        + ", " + rs.getFloat("cost") + " euro.");
            }
            rs.close();
            
        }
        conn.close();
        //it's always a good practice to close everything at the end
    }
}
