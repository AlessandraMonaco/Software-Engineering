/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.warehousews;

import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/**
 *
 * @author studente
 */

@WebService
public interface WSInterface {
    
    public CommercialBook getBookInfos(int bookId);
    public Seller getSellerInfos(int bookId, String name);
}
