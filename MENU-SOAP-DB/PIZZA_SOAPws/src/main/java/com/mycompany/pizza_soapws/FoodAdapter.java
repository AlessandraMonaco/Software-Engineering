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
public class FoodAdapter extends XmlAdapter<FoodImpl,Food>{
    
    public FoodImpl marshal(Food f) throws Exception {
        if (f instanceof FoodImpl)
            return (FoodImpl) f;
        return new FoodImpl(f.getId(),f.getFood(), f.getCost());
    }

    @Override
    public Food unmarshal(FoodImpl v) throws Exception {
        return v;
    }
}
