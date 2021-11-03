package com.revature.controllers;

import java.util.Scanner;

public class FrontController {
	private static Scanner sc = new Scanner(System.in);
	// private EmployeeController ec;

	public static void runMenu() {
		boolean run = true;
		
		while(run) {
			System.out.println("+-----------------------------------------------------------------+");
			System.out.println("|                 Welcome to Lemon's Used Cars!                   |");
			System.out.println("|        For pre-owned vehicles, you've come to the right place!  |");
			System.out.println("|                 Take a look at our selection.                   |");
			System.out.println("+-----------------------------------------------------------------+");			
				
			System.out.println("\n1: New users can register here.");
			System.out.println("\n2: Browse the selection");
			System.out.println("\n3: login");
			System.out.println("\n4: Exit");

			String choice = sc.nextLine();
			
			switch(choice) {
			
			case"1":
				System.out.println("Enter your username" + "\n");
				String Input1 = "Username"; 	
				String Input2 = "Password"; 
				if (Input1.equals(sc.nextLine())) {
					System.out.println(" Enter your password ");
				}
				if (Input2.equals(sc.nextLine())) {
					System.out.println(" Successful login! ");
				}
				
//	switch (opt) {

			case "A":
	//		MANAGER:
	//			done = true;
				break;

				
				break;
			case "2":
				// --------------- Create a selection go-to
				System.out.println();
				break;
				
			case "3":
//				RegisterUser.run(sc);
				break;
				
			case "4":
				System.out.println("Sorry to see you leave, come back soon!");
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
