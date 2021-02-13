/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.warehousews;

import java.util.List;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author studente
 */
@XmlType(name = "CommercialBook")
public class CommercialBookImpl implements CommercialBook {
    
    //PRIVATE ATTRIBUTES
    private int id;
    private float price;
    List<Seller> sellers;
    
    //GET
    public int getId() { return id; }
    public float getPrice() { return price; }
    public List<Seller> getSellers() { return sellers; }
    
    //SET
    public void setId(int id) { this.id = id; }
    public void setPrice(float price) { this.price = price; }
    public void setSellers(List<Seller> sellers) { this.sellers = sellers; }
    
    //CONSTRUCTOR
    public CommercialBookImpl(int id, float price, List<Seller> sellers) {
        this.id = id;
        this.price = price;
        this.sellers = sellers;
    }
    
    //EMPTY CONSTRUCTOR
    public CommercialBookImpl() {}
}
