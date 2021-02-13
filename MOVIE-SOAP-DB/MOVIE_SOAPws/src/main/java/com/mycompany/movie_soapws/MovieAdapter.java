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
public class MovieAdapter extends XmlAdapter<MovieImpl,Movie>{
    public MovieImpl marshal(Movie m) throws Exception {
        if (m instanceof MovieImpl)
            return (MovieImpl) m;
        return new MovieImpl(m.getId(), m.getTitle(), m.getYear(), m.getDirector());
    }

    @Override
    public Movie unmarshal(MovieImpl v) throws Exception {
        return v;
    }
}
