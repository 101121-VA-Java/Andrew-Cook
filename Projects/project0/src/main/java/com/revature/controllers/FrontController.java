package com.revature.controllers;

import java.util.Scanner;

public class FrontController {
	private Scanner sc;
	private EmployeeController ec;
	
	public void run() {
		boolean run = true;
		
		while(run) {
			System.out.println("Welcome! Please login or register if you are new.");
			System.out.println("\n1: New users register here.");
			System.out.println("\n2: login");
			System.out.println("\n3: Exit");
			
			String choice = sc.nextLine();
			
			switch(choice) {
			
			case"1":
				
				System.out.println("Login creation");
				System.out.println();
				break;
				
			case "2":
				RegisterUser.run(sc);
				System.out.println();
				break;
				
			case "3":
				System.out.println("Thank you for visiting!");
				run = false;
				break;
				
			default:
				System.out.println("Invalid input");
				System.out.println();
			}
			
			sc.close();
		}
	}
	
}
