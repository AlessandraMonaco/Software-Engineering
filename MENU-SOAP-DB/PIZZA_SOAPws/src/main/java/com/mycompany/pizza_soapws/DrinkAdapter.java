/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pizza_soapws;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 *
 * @author studente
 */
public class DrinkAdapter extends XmlAdapter<DrinkImpl,Drink>{
    
     public DrinkImpl marshal(Drink d) throws Exception {
        if (d instanceof DrinkImpl)
            return (DrinkImpl) d;
        return new DrinkImpl(d.getId(), d.getDrink(), d.getCost());
    }

    @Override
    public Drink unmarshal(DrinkImpl v) throws Exception {
        return v;
    }
}
