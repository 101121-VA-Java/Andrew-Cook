package com.revature.controllers;

import java.util.Scanner;

public class LoginController {
    private Scanner sc;
	public static void login(Scanner scan) {
	Scanner sc = new Scanner(System.in);
	//Give option of Customer or Employee
	System.out.println("Login Controller menu");
	System.out.println("Select an option below");
	System.out.println("1: Customer");
	System.out.println("2: Employee");
	System.out.println("3: Main menu");
	
	
		String coe = sc.nextLine();
		switch(coe) {
		case "1":
				System.out.println("Enter a username:");
				String username = scan.nextLine();
	
				System.out.println("Enter a password");
				String password = scan.nextLine();
		break;	
		
		case "2":
				System.out.println("Enter a username:");
				String e_username = scan.nextLine();
	
				System.out.println("Enter a password");
				String e_password = scan.nextLine();
		case "3":
				System.out.println("Front menu:");
				FrontController.run();
		break;
		default:
				System.out.println("Invalid, please select an option");
				LoginController.login(scan);
		
		
			}
		sc.close();
	}
}
