/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.subscriber;

/**
 *
 * @author studente
 */
public class Client {
    public static void main(String[] args) {
		ClientListener lis = new ClientListener();
                lis.start();
                
	}
}
