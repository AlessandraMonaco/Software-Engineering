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
public class CommercialBookAdapter extends XmlAdapter<CommercialBookImpl, CommercialBook> {
    
    @Override
    public CommercialBookImpl marshal(CommercialBook book) throws Exception {
        if (book instanceof CommercialBookImpl)
            return (CommercialBookImpl) book;
        return new CommercialBookImpl(book.getId(), book.getPrice(), book.getSellers());
    }

    @Override
    public CommercialBook unmarshal(CommercialBookImpl v) throws Exception {
        return v;
    }
}
