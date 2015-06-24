package com.absolutgus.client;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.absolutgus.test.ShoppingCartSession;

public class StatefulClientTest {

	public static void main(String[] args) {
		
		try{
			Context jndi = new InitialContext();
			ShoppingCartSession cart = (ShoppingCartSession) jndi.lookup("java:global/EmployeeManagement/ShoppingCartSessionImplementation");
			
			cart.addItem( "Boogie Board" );
			cart.addItem( "Sunglasses" );
			cart.addItem( "Beach Towel" );
			
			List<String> items = cart.getAllItems();
			
			for(String i : items) {
				System.out.println( i );
			}
			
			cart.checkout();
			
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
