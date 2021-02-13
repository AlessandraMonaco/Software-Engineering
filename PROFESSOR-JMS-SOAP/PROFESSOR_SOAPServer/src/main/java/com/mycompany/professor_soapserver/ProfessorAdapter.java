/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.professor_soapserver;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 *
 * @author studente
 */
public class ProfessorAdapter extends XmlAdapter<ProfessorImpl, Professor>{
    
    @Override
    public ProfessorImpl marshal(Professor prof) throws Exception {
        if (prof instanceof ProfessorImpl)
            return (ProfessorImpl) prof;
        return new ProfessorImpl(prof.getId(), prof.getName(), prof.getSurname(), prof.getCourse());
    }

    @Override
    public Professor unmarshal(ProfessorImpl v) throws Exception {
        return v;
    }
}
