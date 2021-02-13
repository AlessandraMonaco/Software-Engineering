/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movie_soapws;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 *
 * @author studente
 */
public class DirectorAdapter extends XmlAdapter<DirectorImpl,Director>{
    public DirectorImpl marshal(Director d) throws Exception {
        if (d instanceof DirectorImpl)
            return (DirectorImpl) d;
        return new DirectorImpl(d.getId(),d.getName(), d.getYearOfBirth());
    }

    @Override
    public Director unmarshal(DirectorImpl v) throws Exception {
        return v;
    }
}
