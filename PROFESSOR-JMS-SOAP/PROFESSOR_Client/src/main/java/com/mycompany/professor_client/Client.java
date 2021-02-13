/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.professor_client;

import java.util.Properties;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.Topic;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import soap.*;
/**
 *
 * @author studente
 */
public class Client {
    private static WSImplService service = new WSImplService();
    private static WSInterface port;
    
    public static void main(String[] args) throws InterruptedException, NamingException, JMSException {
        
        //Set up connections for jms (same things as ProfessorProvider)
        Context jndiContext = null;
        ConnectionFactory connectionFactory = null;
        Connection connection = null;
        Session session = null;
        Destination destination = null;
        String destinationName = "dynamicTopics/professors";
        
        Properties props = new Properties();
        props.setProperty(Context.INITIAL_CONTEXT_FACTORY,"org.apache.activemq.jndi.ActiveMQInitialContextFactory");
        props.setProperty(Context.PROVIDER_URL,"tcp://localhost:61616");
        jndiContext = new InitialContext(props);
        
        connectionFactory = (ConnectionFactory)jndiContext.lookup("ConnectionFactory");
        connection = connectionFactory.createConnection();
        session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
        destination = (Topic) jndiContext.lookup(destinationName);
        MessageConsumer consumer = session.createConsumer(destination);
        
        connection.start();
        Message m;
        String id; //prof id
        while(true){
            m = consumer.receive(); //receive the message
            port = service.getWSImplPort();
            id = m.getStringProperty("Id");
            int i = m.getIntProperty("Item");
            Professor professor = port.getDetails(id);
            System.out.println("\nItem " + i + ">> Professor with id "+ id + 
                    "\nProfessor with id "+ professor.getId() + " has details " +
                    professor.getName() + " " + professor.getSurname() +
                    ", " + professor.getCourse());
            
        }
        
        /*
        //Test SOAP connection getting details of a certain Professor
        Professor p = Client.getDetails("1"); //we try to get details of first professor stored
        //NOTE: when you use a string, the symbol ' may give error; prefer symbol "
        //Print details obtained
        System.out.println("Id: " + p.getId() +
                "\nName : " + p.getName() + " " + p.getSurname() +
                "\nCourse: " + p.getCourse());
        /*This outputs:
        Id: 1
        Name : AlbertoBersani
        Course: analisi 1
        */
        
    }
    
    
    //Add getDetails method from SOAP
    private static Professor getDetails(String arg0) {
        soap.WSImplService service = new soap.WSImplService();
        soap.WSInterface port = service.getWSImplPort();
        return port.getDetails(arg0);
    }
    
}
