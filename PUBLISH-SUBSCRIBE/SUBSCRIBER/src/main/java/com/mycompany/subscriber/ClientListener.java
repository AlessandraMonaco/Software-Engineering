/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.subscriber;

import java.util.Properties;
import java.util.Scanner;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import javax.jms.TopicSubscriber;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author studente
 */
public class ClientListener implements MessageListener {
    
    private TopicConnection topicConnection;
    private TopicSession topicSession = null;
    private Destination destination = null;
    private MessageProducer producer = null;
    
    public ClientListener() {
        Context jndiContext = null;
        ConnectionFactory topicConnectionFactory = null;
                
        String destinationName = "dynamicTopics/1706205-topics";
        String topicId = chooseTopic();
        String messageSelector = "Id = '"+topicId+"'";
                
        try {
			
            Properties props = new Properties();
                    
            props.setProperty(Context.INITIAL_CONTEXT_FACTORY,
                    "org.apache.activemq.jndi.ActiveMQInitialContextFactory");
            props.setProperty(Context.PROVIDER_URL,"tcp://localhost:61616");
            jndiContext = new InitialContext(props);  
                    
            topicConnectionFactory = (ConnectionFactory)jndiContext.lookup("ConnectionFactory");
            destination = (Destination)jndiContext.lookup(destinationName);
            topicConnection = (TopicConnection)topicConnectionFactory.createConnection();
            topicSession = (TopicSession)topicConnection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            
            TopicSubscriber topicSubscriber = null;
            if (messageSelector != null && messageSelector.length() > 0) {
                //HERE WE IMPLEMENT THE SELECTOR
                topicSubscriber = topicSession.createSubscriber(
                    (Topic) destination, messageSelector, false);
            } else {
                topicSubscriber = topicSession.createSubscriber(
                    (Topic) destination);
            }		
            topicSubscriber.setMessageListener(this);
        } catch (JMSException err) {
            err.printStackTrace();
	} catch (NamingException err) {
            err.printStackTrace();
        }
    }
    
    public String chooseTopic() {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        System.out.print("Enter a topic id in 0...7: ");
        String tId= sc.nextLine(); //reads string.
        return tId;
    }

    public void stop() {
        try {
            topicConnection.stop();
        } catch (JMSException err) {
            err.printStackTrace();
        }
    }

    // Apre la ricezione messaggi
    public void start() {
        try {
            topicConnection.start();
        } catch (JMSException err) {
            err.printStackTrace();
        }
    }
    
    //What happens when you receive a message (implement this otherwise you have problem of abstract)
    public void onMessage(Message mex) {
        try {
            String id = mex.getStringProperty("Id");
            TextMessage textMex = (TextMessage) mex;
            System.out.println(textMex.getText());  //getText() needs TextMessage class, not Message
	} catch (JMSException err) {
            err.printStackTrace();
	}
    }

}


