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
public class MenuAdapter extends XmlAdapter<MenuImpl,Menu> { //EXTENDS PART
    public MenuImpl marshal(Menu m) throws Exception {
        if (m instanceof MenuImpl)
            return (MenuImpl) m;
        return new MenuImpl(m.getId(),m.getName(), m.getDrink(),m.getFood(), m.getCost());
    }

    @Override
    public Menu unmarshal(MenuImpl v) throws Exception {
        return v;
    }
}
