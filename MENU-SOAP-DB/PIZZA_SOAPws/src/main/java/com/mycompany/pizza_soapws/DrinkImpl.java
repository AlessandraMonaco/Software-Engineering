/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pizza_soapws;

import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author studente
 */
@XmlType(name = "Drink") //REMEMBER THIS
public class DrinkImpl implements Drink {
    
    //Private attributes of the class
    private String id;
    private String drink;
    private float cost;
    
    //public GET methods
    public String getId() { return id; }
    public String getDrink() { return drink; }
    public float getCost() { return cost; }
    
    //public SET methods
    public void setId(String id) { this.id = id; }
    public void setDrink(String drink) { this.drink = drink; }
    public void setCost(float cost) { this.cost = cost; }
    
    //CONSTRUCTOR
    public DrinkImpl(String id, String drink, float cost) {
        this.id = id;
        this.drink = drink;
        this.cost = cost;
    }
    
    //EMPTY CONSTRUCTOR
    public DrinkImpl() {}
    
}
