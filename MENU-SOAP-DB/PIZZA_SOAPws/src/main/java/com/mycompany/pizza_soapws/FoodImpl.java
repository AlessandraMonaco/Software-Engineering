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
@XmlType(name = "Food")
public class FoodImpl implements Food { 
    
    //Private attributes of the class
    private String id;
    private String food;
    private float cost;
    
    //public GET methods
    public String getId() { return id; }
    public String getFood() { return food; }
    public float getCost() { return cost; }
    
    //public SET methods
    public void setId(String id) { this.id = id; }
    public void setFood(String food) { this.food = food; }
    public void setCost(float cost) { this.cost = cost; }
    
    //CONSTRUCTOR
    public FoodImpl(String id, String food, float cost) {
        this.id = id;
        this.food = food;
        this.cost = cost;
    }
    
    //EMPTY CONSTRUCTOR
    public FoodImpl() {}
}
