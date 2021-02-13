/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.publisher;

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
public class TopicProvider {
    
    //8 texts corresponding to 8 topics
    final String series[] = { "Breaking Bad", "Prison Break", "Vis a Vis", 
        "La casa de papel", "Peaky Blinders", "Ozark", "Diavoli", "Game of Thrones" };
    
    
    //Choose at random the id of the topic to be published
    private int chooseTopic() {
	int whichMsg;
	Random randomGen = new Random();
	whichMsg = randomGen.nextInt(this.series.length);
	return whichMsg;
    }
    
    //Gets the text correspondent to the topic with a certain id
    private String getTopic(int id) {
        return series[id];
    }
    
    private static final Logger LOG = LoggerFactory.getLogger(TopicProvider.class);
    
    
    public void start() throws NamingException, JMSException {
                
        Context jndiContext = null;
        ConnectionFactory connectionFactory = null;
        Connection connection = null;
        Session session = null;
        Destination destination = null;
        MessageProducer producer = null;
        String destinationName = "dynamicTopics/1706205-topics";
        
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
        
        try {
            connectionFactory = (ConnectionFactory)jndiContext.lookup("ConnectionFactory");
            destination = (Destination)jndiContext.lookup(destinationName);
        } catch (NamingException e) {
            LOG.info("JNDI API lookup failed: " + e);
            System.exit(1);
        }
        
        try {
            connection = connectionFactory.createConnection();
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            producer = session.createProducer(destination);
            
            TextMessage message = null;
            String messageType = null; //it's the id of the topic
		
            message = session.createTextMessage();
            
            int i = 0;
            while (true) {
		i++;
                int topicId = chooseTopic(); //gets a random id of a topic
		messageType = Integer.toString(topicId); //the property id should be a string
		message.setStringProperty("Id", messageType); 
                String topicText = getTopic(topicId);
		message.setText("ITEM " + i + " >> " + "Topic " + messageType + " : "
                        + topicText);

		//What is printed on the log of the server
                LOG.info(this.getClass().getName() + " Publishing: " + message.getText());
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
