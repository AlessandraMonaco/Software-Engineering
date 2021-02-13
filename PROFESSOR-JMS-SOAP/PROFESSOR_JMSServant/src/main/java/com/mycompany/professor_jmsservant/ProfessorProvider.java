/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.professor_jmsservant;

import java.net.InetSocketAddress;
import java.net.Socket;

import java.util.Properties;
import java.util.Random;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 *
 * @author studente
 */
//like ProduttoreQuotazioni, it has to produce professor ids to be published
public class ProfessorProvider {
    
    //These are the professor ids that will be published
   final String ids[] = { "1", "2", "3", "4", "5"};
   
   //Random generator of ids
   private String getRandomId(){
        int whichMsg;
        Random randomGen = new Random();
        
        whichMsg = randomGen.nextInt(this.ids.length);
        return this.ids[whichMsg];
    }
   
   private static final Logger LOG = LoggerFactory.getLogger(ProfessorProvider.class);
   
   //START method called in Server.java class
   public void start() throws NamingException, JMSException {
       
        Context jndiContext = null;
        ConnectionFactory connectionFactory = null;
        Connection connection = null;
        Session session = null;
        Destination destination = null;
        MessageProducer producer = null;
        String destinationName = "dynamicTopics/professors"; //change here the topics
        
        //Create a JNDI API InitialContext object
        try {
            Properties props = new Properties();
            props.setProperty(Context.INITIAL_CONTEXT_FACTORY,
                    "org.apache.activemq.jndi.ActiveMQInitialContextFactory");
            //Use this if you ARE USING DOCKER
            //props.setProperty(Context.PROVIDER_URL,"tcp://broker:61616");

            //Use this is you are NOT USING DOCKER
            props.setProperty(Context.PROVIDER_URL,"tcp://localhost:61616");
            jndiContext = new InitialContext(props);
            
        } catch (NamingException e) {
            LOG.info("ERROR in JNDI: " + e.toString());
            System.exit(1);
        }
        
        //Look up connection factory and destination.
        try {
            connectionFactory = (ConnectionFactory)jndiContext.lookup("ConnectionFactory");
            destination = (Destination)jndiContext.lookup(destinationName);
        } catch (NamingException e) {
            LOG.info("JNDI API lookup failed: " + e);
            System.exit(1);
        }
        
        /*
         * Create connection. Create session from connection; false means
         * session is not transacted. Create sender and text message. Send
         * messages, varying text slightly. Send end-of-messages message.
         * Finally, close connection.
         */
        try {
            connection = connectionFactory.createConnection();
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            producer = session.createProducer(destination);
                
            TextMessage message = null;
            String messageType = null;
		
            message = session.createTextMessage();
            
            int i = 0;
            while (true) {
		i = i+1;
		messageType = getRandomId(); //generate a random professor id from the list of ids
                message.setStringProperty("Id", messageType); //set the id in the message
                //If you want to add other parts (like floats) in the message
                message.setIntProperty("Item",i); //we want to store also the item number, it's int
                //message.setFloatProperty("Valore", quotazione); 
                //and quotazione should be selected as a get (like getRandomId)
                
                //This is how we want the message to be printed
                message.setText("Item " + i + ": " + "Prof Id: " + messageType);
                
                //This code prints in the output what messages have been published by the provider
                LOG.info(this.getClass().getName() + "Publishing msg: " + message.getText());
                
                //Now we can publish the message
                producer.send(message);
                
                try { 
                    Thread.sleep(5000);
                } catch (Exception ex) {
                    ex.printStackTrace();
		}
            }
        }
        
        catch (JMSException e) {
            LOG.info("Exception occurred: " + e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (JMSException e) {
                }
            }
        }
     
   }
}
