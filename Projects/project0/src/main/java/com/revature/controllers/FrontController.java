package com.revature.controllers;

import java.util.Scanner;

public class FrontController {
	private static Scanner sc = new Scanner(System.in);
	private static EmployeeController ec;

	public static void run() {
		boolean run = true;
		
		while(run) {
			System.out.println("+-----------------------------------------------------------------+");
			System.out.println("|                 Welcome to Lemon's Used Cars!                   |");
			System.out.println("|        For pre-owned vehicles, you've come to the right place!  |");
			System.out.println("|                    Login and take a look!                       |");
			System.out.println("+-----------------------------------------------------------------+");			
				
			System.out.println("\n1: New users can register here.");
			System.out.println("\n2: login");
			System.out.println("\n3: Exit");

			String choice = sc.nextLine();
			
			switch(choice) {
			
			case "1":
				ec.RegisterUser(sc);
				System.out.println();
				run = false;
				break;
			
			case "2":
				ec.login(sc);
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
