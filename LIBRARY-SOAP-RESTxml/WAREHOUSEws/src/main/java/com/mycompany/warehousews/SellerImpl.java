/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.warehousews;

import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author studente
 */
@XmlType(name = "Seller")
public class SellerImpl implements Seller{
    
    //PRIVATE ATTRIBUTES
    private String name;
    private String deliveryDate;
    
    //GET
    public String getName() { return name; }
    public String getDeliveryDate() { return deliveryDate; }
    
    //SET
    public void setName(String name) { this.name = name; }
    public void setDeliveryDate(String delivery) { this.deliveryDate = delivery; }
    
    //CONSTRUCTOR
    public SellerImpl(String name, String deliveryDate) {
        this.name = name;
        this.deliveryDate = deliveryDate;
    }
    
    //EMPTY CONSTRUCTOR
    public SellerImpl() {}
    
    
}
