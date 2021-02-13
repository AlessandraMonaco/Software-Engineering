/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.warehousews;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 *
 * @author studente
 */
public class SellerAdapter extends XmlAdapter<SellerImpl, Seller>{
    
    @Override
    public SellerImpl marshal(Seller seller) throws Exception {
        if (seller instanceof SellerImpl)
            return (SellerImpl) seller;
        return new SellerImpl(seller.getName(), seller.getDeliveryDate());
    }

    @Override
    public Seller unmarshal(SellerImpl v) throws Exception {
        return v;
    }
}
