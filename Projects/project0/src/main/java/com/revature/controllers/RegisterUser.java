package com.revature.controllers;
import java.util.Scanner;

import com.revature.models.Customer;
import com.revature.exceptions.UsernameAlreadyExistsException;
import com.revature.services.EmployeeService;
import com.revature.services.*;
import com.revature.models.Employee;

public class RegisterUser {
	private static EmployeeService es = new EmployeeService();

			public void registerEmployee(Scanner scan) {
				System.out.println("Enter your name:");
				String name = scan.nextLine();
				
				System.out.println("Enter a username:");
				String username = scan.nextLine();
				
				System.out.println("Enter a password");
				String password = scan.nextLine();
				
	Employee newemp = new Employee(name, username, password);
	
	es.addEmployee(newemp);
			}

		private CustomerService cs = new CustomerService();
				// Registering a new Customer
			public void registerCustomer(Scanner scan) {
				System.out.println("Enter your name:");
				String name = scan.nextLine();
				
				System.out.println("Enter a username:");
				String username = scan.nextLine();
				
				System.out.println("Enter a password");
				String password = scan.nextLine();
				
			}
				Customer newCustomer = new Customer(name, username, password);
		        ca.cd.addCustomer(newCustomer);
		        try {
					FrontEndController.start();
				} catch (LoginException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
			
			
}
	
	
	
	
	
	

