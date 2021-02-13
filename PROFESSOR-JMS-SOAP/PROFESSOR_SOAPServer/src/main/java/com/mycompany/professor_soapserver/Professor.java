/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.professor_soapserver;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/**
 *
 * @author studente
 */
@XmlJavaTypeAdapter(ProfessorAdapter.class)
public interface Professor { //notice that this is an INTERFACE NOT A CLASS
    public String getId(); //id of professor
    public String getName(); //name
    public String getSurname(); //surname
    public String getCourse(); //course
}
