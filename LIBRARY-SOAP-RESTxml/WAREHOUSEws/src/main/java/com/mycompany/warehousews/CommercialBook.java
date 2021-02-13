/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.warehousews;

import java.util.List;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 * @author studente
 */
@XmlJavaTypeAdapter(CommercialBookAdapter.class)
public interface CommercialBook {
    
    public int getId();
    public float getPrice();
    public List<Seller> getSellers();
}
