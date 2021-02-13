/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pizza_soapws;

import java.sql.SQLException;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author studente
 */
@WebService //REMEMBER THIS
public interface WSInterface {
    
    //A service that allows the user to retrieve the list of all foods
    public List<Food> getFoodMenu()throws ClassNotFoundException, SQLException;
    
    //A service that allows the user to retrieve the list of all drinks
    public List<Drink> getDrinkMenu()throws ClassNotFoundException, SQLException;
    
    //A service that allows the user to retrieve the list of full menus suggested
    public List<Menu> getSuggestedMenu()throws ClassNotFoundException, SQLException;
    
    //methods needed by the service getSuggestedMenu
    //get food details by id
    public Food getFood(String id) throws ClassNotFoundException, SQLException;
    //get drink details by id
    public Drink getDrink(String id) throws ClassNotFoundException, SQLException;
    
}
