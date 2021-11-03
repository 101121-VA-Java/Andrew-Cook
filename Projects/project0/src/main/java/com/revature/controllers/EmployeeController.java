package com.revature.controllers;

import java.util.Scanner;

public class EmployeeController {

	private static Scanner sc = new Scanner(System.in);
	boolean flag = true;
		
		public static void employeeDashboard() {
		while(flag) {
			System.out.println("+-------------------------------------------+");
			System.out.println("  Welcome Employee! Please select an option.");
			System.out.println("\n 1: Remove an item.");
			System.out.println("\n 2: Add an item.");
			System.out.println("\n 3: View all offers.");
			System.out.println("\n 4: View payments.");
			System.out.println("\n 5: Log out.");
			System.out.println("\n+-------------------------------------------+");
		}
		String input = sc.nextLine();
		switch(input) {
		case "1" :
			System.out.println();
			flag = false;
			break;
			
		case "2" :
			// Remove an item from the shop
			System.out.println();
			flag = false;
			break;
			
		case "3" :
			System.out.println();
			flag = false;
			break;
			
		case "4" :
			System.out.println();
			flag = false;
			break;
			
		case "5" :
			System.out.println();
			flag = false;
			break;
			
		default:
			System.out.println("Please input a selection of 1 - 5.");
	
	
		}
		}
	
	
	
}
