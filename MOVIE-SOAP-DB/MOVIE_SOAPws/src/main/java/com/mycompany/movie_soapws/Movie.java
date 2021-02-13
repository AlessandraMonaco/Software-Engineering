/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movie_soapws;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 * @author studente
 */
@XmlJavaTypeAdapter(MovieAdapter.class) //each concept should have its interface
public interface Movie {
    public String getId();
    public String getTitle();
    public String getYear();
    public Director getDirector();

}
