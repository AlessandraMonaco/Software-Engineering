package com.mycompany.publisher;


import com.mycompany.publisher.TopicProvider;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author studente
 */
public class Server {
    public static void main(String args[]) throws Exception {
        TopicProvider t = new TopicProvider();
        t.start();
    }
}
