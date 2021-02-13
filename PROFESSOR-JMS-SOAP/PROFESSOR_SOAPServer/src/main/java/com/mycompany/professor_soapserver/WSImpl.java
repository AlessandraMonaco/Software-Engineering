/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.professor_soapserver;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.jws.WebService;

/**
 *
 * @author studente
 */
@WebService(endpointInterface = "com.mycompany.professor_soapserver.WSInterface")
public class WSImpl implements WSInterface {
    
    //List of professors
    List<Professor> professors = new ArrayList<>();
    
    //Initialize the structure with some data (in memory)
    {   Professor first = new ProfessorImpl("1", "Alberto", "Bersani", "analisi 1");
        Professor second = new ProfessorImpl("2", "Tiziana", "Catarci", "HCI");
        Professor third = new ProfessorImpl("3", "Silvia", "Bonomi", "Distributed Systems");
        Professor fourth = new ProfessorImpl("4", "Riccardo", "Rosati", "KRST");
        Professor fifth = new ProfessorImpl("5", "Luca", "Becchetti", "Big Data Computing");
        
        professors.add(first);
        professors.add(second);
        professors.add(third);
        professors.add(fourth);
        professors.add(fifth);
    }
    
    
    public Professor getDetails(String id) {
        Professor found = new ProfessorImpl();
        for(Professor professor : professors){
           if(professor.getId().equals(id)){
               found = professor;
               break;
           }
        }
        return found;
    }
}
