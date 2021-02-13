/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pizza_soapws;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 * @author studente
 */
@XmlJavaTypeAdapter(MenuAdapter.class) //each concept should have its interface
public interface Menu {
    public String getId();
    public String getName();
    public Drink getDrink();
    public Food getFood();
    public float getCost();
}
