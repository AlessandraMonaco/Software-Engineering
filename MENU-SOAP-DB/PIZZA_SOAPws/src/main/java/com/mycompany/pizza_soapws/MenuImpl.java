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
@XmlType(name = "Menu") //REMEMBER THIS
public class MenuImpl implements Menu{ //REMEMBER IMPLEMENTS
    
    //Private attributes of the class
    private String id;
    private String name;
    private Drink drink;
    private Food food;
    private float cost;
    
    //public GET methods
    public String getId() { return id; }
    public String getName() { return name; }
    public Drink getDrink() { return drink; }
    public Food getFood() { return food; }
    public float getCost() { return cost; }
    
    //public SET methods
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setDrink(Drink drink) { this.drink = drink; }
    public void setFood(Food food) { this.food = food; }
    public void setCost(float cost) { this.cost = cost; }
    
    //CONSTRUCTOR
    public MenuImpl(String id, String name, Drink drink, Food food, float cost) {
        this.id = id;
        this.name = name;
        this.drink = drink;
        this.food = food;
        this.cost = cost;
    }
    
    //EMPTY CONSTRUCTOR
    public MenuImpl() {}
}
