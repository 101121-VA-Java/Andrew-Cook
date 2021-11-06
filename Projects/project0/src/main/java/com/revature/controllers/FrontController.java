package com.revature.controllers;

import java.util.Scanner;

public class FrontController {
	static Scanner sc = new Scanner(System.in);
	private static EmployeeController ec;

	public static void run() {
		boolean run = true;
		
		while(run) {
			System.out.println("+-----------------------------------------------------------------+");
			System.out.println("|                 Welcome to Lemon's Used Cars!                   |");
			System.out.println("|      For pre-owned vehicles, you've come to the right place!    |");
			System.out.println("|                    Login and take a look!                       |");
			System.out.println("+-----------------------------------------------------------------+");			
				
			System.out.println("\n1: New users can register here.");
			System.out.println("\n2: login");
			System.out.println("\n3: Exit");

			String choice = sc.nextLine();
			
			switch(choice) {
			
			case "1":
				System.out.println("Pick your registration: ");
				System.out.println("1: New Employee");
				System.out.println("2: New Customer");
				System.out.println("3: Return to the front menu");
				
				String eou = sc.nextLine();
				switch(eou) {
				
				case "1":
					System.out.println("Employee registration");
					RegisterUser ec = new RegisterUser();
					ec.registerEmployee(sc);
				
				break;
			
				case "2":
					System.out.println("Customer register");
					RegisterUser cc = new RegisterUser();
					cc.registerCustomer(sc);
				break;
				
				case "3":
					System.out.println("Return to the front menu");
					FrontController.run();
				
				
				}
			case "2"://Jump to the login menu
				LoginController login = new LoginController();
				login.login(sc); // creating an instance of login using the login method
				
				
				
				
				
				
				break;
				
			case "3":
				System.out.println("Sorry to see you leave, come back soon!");
				run = false;
				break;
				
			default:
				System.out.println("Invalid");
				System.out.println();
				
				
			}
			
			sc.close();
	    }
	}
	}
