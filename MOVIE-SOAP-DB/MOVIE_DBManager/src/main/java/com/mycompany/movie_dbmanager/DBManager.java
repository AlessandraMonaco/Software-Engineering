/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movie_dbmanager;

import java.sql.*;
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
        
        //Running with "create" option
        /*Tables:
            movies(ID, title, year, directorID)
            directors(ID, name, yearOfBirth)
        */
       
        
        if (args[1].equals("create")) {
            
            //Create tables
            stat.executeUpdate("drop table if exists MOVIES;");
            stat.executeUpdate("drop table if exists DIRECTORS;");
            stat.executeUpdate("create table MOVIES (id, title, year, directorId);");
            stat.executeUpdate("create table DIRECTORS (id, name, yearOfBirth);");
            
            //Add some dummy data to directors
            PreparedStatement prep = conn.prepareStatement(
                    "insert into DIRECTORS values (?, ?, ?);");
            //? ? are the parameters that I have to set later 
            //I do in this way to use the same prepareStatement for all the data
            prep.setString(1, "1"); //parameter 1: id
            prep.setString(2, "Paolo Rossi"); //parameter 2: name
            prep.setString(3, "1970"); //nel testo dice che deve essere stringa anche year
            //prep.setInt(3, 1970); //parameter 3: yearOfBirth
            prep.addBatch();
            conn.setAutoCommit(false);
            prep.executeBatch();
            conn.setAutoCommit(true);
            
            prep.setString(1, "2"); //parameter 1: id
            prep.setString(2, "Giulia Neri"); //parameter 2: name
            prep.setString(3, "1980"); //parameter 3: yearOfBirth
            prep.addBatch();
            conn.setAutoCommit(false);
            prep.executeBatch();
            conn.setAutoCommit(true);
            
            prep.setString(1, "3"); //parameter 1: id
            prep.setString(2, "Frank Yellow"); //parameter 2: name
            prep.setString(3, "1991"); //parameter 3: yearOfBirth
            prep.addBatch();
            conn.setAutoCommit(false);
            prep.executeBatch();
            conn.setAutoCommit(true);
            
            prep.setString(1, "4"); //parameter 1: id
            prep.setString(2, "Mary Bloody"); //parameter 2: name
            prep.setString(3, "1980"); //parameter 3: yearOfBirth
            prep.addBatch();
            conn.setAutoCommit(false);
            prep.executeBatch();
            conn.setAutoCommit(true);
            
            //Add some dummy data to movies(ID, title, year, directorID)
            PreparedStatement prep2 = conn.prepareStatement(
                    "insert into MOVIES values (?, ?, ?, ?);");
            //? ? are the parameters that I have to set later 
            //I do in this way to use the same prepareStatement for all the data
            prep2.setString(1, "1"); //parameter 1: id
            prep2.setString(2, "Il silenzio degli innocenti"); //parameter 2: title
            prep2.setString(3, "1995"); //parameter 3: year
            prep2.setString(4,"1"); //parameter 4: directorId
            prep2.addBatch();
            conn.setAutoCommit(false);
            prep2.executeBatch();
            conn.setAutoCommit(true);
            
            prep2.setString(1, "2"); //parameter 1: id
            prep2.setString(2, "Vivere oggi"); //parameter 2: title
            prep2.setString(3, "2000"); //parameter 3: year
            prep2.setString(4,"1"); //parameter 4: directorId
            prep2.addBatch();
            conn.setAutoCommit(false);
            prep2.executeBatch();
            conn.setAutoCommit(true);
            
            prep2.setString(1, "3"); //parameter 1: id
            prep2.setString(2, "Coraggio e paura"); //parameter 2: title
            prep2.setString(3, "2010"); //parameter 3: year
            prep2.setString(4,"2"); //parameter 4: directorId
            prep2.addBatch();
            conn.setAutoCommit(false);
            prep2.executeBatch();
            conn.setAutoCommit(true);
            
            prep2.setString(1, "4"); //parameter 1: id
            prep2.setString(2, "Stop it"); //parameter 2: title
            prep2.setString(3, "2011"); //parameter 3: year
            prep2.setString(4,"2"); //parameter 4: directorId
            prep2.addBatch();
            conn.setAutoCommit(false);
            prep2.executeBatch();
            conn.setAutoCommit(true);
            
            prep2.setString(1, "5"); //parameter 1: id
            prep2.setString(2, "Flash"); //parameter 2: title
            prep2.setString(3, "2016"); //parameter 3: year
            prep2.setString(4,"3"); //parameter 4: directorId
            prep2.addBatch();
            conn.setAutoCommit(false);
            prep2.executeBatch();
            conn.setAutoCommit(true);
            
            prep2.setString(1, "6"); //parameter 1: id
            prep2.setString(2, "Flash 2"); //parameter 2: title
            prep2.setString(3, "2017"); //parameter 3: year
            prep2.setString(4,"3"); //parameter 4: directorId
            prep2.addBatch();
            conn.setAutoCommit(false);
            prep2.executeBatch();
            conn.setAutoCommit(true);
            
            prep2.setString(1, "7"); //parameter 1: id
            prep2.setString(2, "Flash 3"); //parameter 2: title
            prep2.setString(3, "2018"); //parameter 3: year
            prep2.setString(4,"3"); //parameter 4: directorId
            prep2.addBatch();
            conn.setAutoCommit(false);
            prep2.executeBatch();
            conn.setAutoCommit(true);
            
            prep2.setString(1, "8"); //parameter 1: id
            prep2.setString(2, "Flash 4"); //parameter 2: title
            prep2.setString(3, "2019"); //parameter 3: year
            prep2.setString(4,"3"); //parameter 4: directorId
            prep2.addBatch();
            conn.setAutoCommit(false);
            prep2.executeBatch();
            conn.setAutoCommit(true);
            
            prep2.setString(1, "9"); //parameter 1: id
            prep2.setString(2, "Another sad story"); //parameter 2: title
            prep2.setString(3, "2019"); //parameter 3: year
            prep2.setString(4,"2"); //parameter 4: directorId
            prep2.addBatch();
            conn.setAutoCommit(false);
            prep2.executeBatch();
            conn.setAutoCommit(true);
            
            prep2.setString(1, "10"); //parameter 1: id
            prep2.setString(2, "Speriamo che compili"); //parameter 2: title
            prep2.setString(3, "2019"); //parameter 3: year
            prep2.setString(4,"1"); //parameter 4: directorId
            prep2.addBatch();
            conn.setAutoCommit(false);
            prep2.executeBatch();
            conn.setAutoCommit(true);
            
            prep2.setString(1, "11"); //parameter 1: id
            prep2.setString(2, "Alla ricerca dei bug"); //parameter 2: title
            prep2.setString(3, "2020"); //parameter 3: year
            prep2.setString(4,"1"); //parameter 4: directorId
            prep2.addBatch();
            conn.setAutoCommit(false);
            prep2.executeBatch();
            conn.setAutoCommit(true);
            
            prep2.setString(1, "12"); //parameter 1: id
            prep2.setString(2, "Alla ricerca dei bug 2"); //parameter 2: title
            prep2.setString(3, "2021"); //parameter 3: year
            prep2.setString(4,"1"); //parameter 4: directorId
            prep2.addBatch();
            conn.setAutoCommit(false);
            prep2.executeBatch();
            conn.setAutoCommit(true);
            
            prep2.setString(1, "13"); //parameter 1: id
            prep2.setString(2, "Nemo-Nessuno"); //parameter 2: title
            prep2.setString(3, "2015"); //parameter 3: year
            prep2.setString(4,"2"); //parameter 4: directorId
            prep2.addBatch();
            conn.setAutoCommit(false);
            prep2.executeBatch();
            conn.setAutoCommit(true);
            
            prep2.setString(1, "14"); //parameter 1: id
            prep2.setString(2, "Nessuno è perfetto"); //parameter 2: title
            prep2.setString(3, "2019"); //parameter 3: year
            prep2.setString(4,"4"); //parameter 4: directorId
            prep2.addBatch();
            conn.setAutoCommit(false);
            prep2.executeBatch();
            conn.setAutoCommit(true);
            
            prep2.setString(1, "15"); //parameter 1: id
            prep2.setString(2, "Hello baby"); //parameter 2: title
            prep2.setString(3, "2015"); //parameter 3: year
            prep2.setString(4,"4"); //parameter 4: directorId
            prep2.addBatch();
            conn.setAutoCommit(false);
            prep2.executeBatch();
            conn.setAutoCommit(true);
            
        } else {
            
            //else we have to read the db, not to create
            ResultSet rs = stat.executeQuery("select * from DIRECTORS;");
            System.out.print("DIRECTORS--------------------------------\n");
            while (rs.next()) {
                System.out.print("Director " + rs.getString("id") + ":");
                System.out.println(rs.getString("name") + "(" + 
                        rs.getString("yearOfBirth") + ")");
            }
            rs.close();
            
            ResultSet rs2 = stat.executeQuery("select * from MOVIES;");
            System.out.print("MOVIES--------------------------------\n");
            while (rs2.next()) {
                System.out.print("Movie " + rs2.getString("id") + ":");
                System.out.println(rs2.getString("title") + "(" +  
                        rs2.getString("year") + "), " + rs2.getString("directorId"));
            }
            rs2.close();
        }
        conn.close();
        //it's always a good practice to close everything at the end
    }
}
    
