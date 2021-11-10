package com.revature.controllers;

import java.util.Scanner;

import javax.security.auth.login.LoginException;

import com.revature.models.Customer;

public class CustomerController {

			//Registering new Customer
	public void registerCustomer(Scanner scan) {
		System.out.println("First name:");
		String firstname = scan.nextLine();
		System.out.println("Last name:");
		String lastname = scan.nextLine();
		System.out.println("Username:");
		String username = scan.nextLine();
		System.out.println("Password");
		String password = scan.nextLine();
		
		Customer newCustomer = new Customer(firstname, lastname, username, password,  );
        ca.cd.addCustomer(newCustomer);
        try {
        	System.out.println("Customer registered");
			FrontController.run();
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

