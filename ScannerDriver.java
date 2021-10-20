package com.revature;

import java.util.Scanner;

public class ScannerDriver {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	
			menu(); {
			int num = sc.nextInt();
			sc.nextLine();
			System.out.println("You have selected menu option number" + num);}
		while(num != 3) {
		if(num == 1) {
			long rn = Math.round(Math.random();
			System.out.println("Random number: " + rn);
			menu();
			num = sc.nextln();
			sc.nextLine();
			System.out.println("You have selected the menu option" + num);}
		else if(num == 2) {
			StringBuffer sb = new StringBuffer (sc.nextln()));
			System.out.println("This is the reversed word: " + sb.reverse());

			menu();
			num = sc.nextInt();
			sc.nextLine();
			System.out.println("This is the menu option: " + num);}
		else {
			System.out.println("Invalid entry. Pick from the menu.");
			menu();
			num = sc.nextInt();
			
		public static void menu() {
			System.out.println("Select from the items");
			System.out.println("1. Get a random number");
			System.out.println("2. Word is reversed");
			System.out.println("3. Exit")
		}
	}
	/*
	 * 
	 * Ideas/classroom practice/first drafts below
	 * 
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		System.out.println("What's your name?");
		
		String name = sc.nextLine();
		
		System.out.println("Hello " + name);
		System.out.println("Pick a number:");
		
		int num = sc.nextInt();
		sc.nextLine(); // this sc.nextLine() flushes/grabs the leftovers from the previous input capture
//		String number = sc.nextLine();
		// some validation
//		int num = Integer.parseInt(number);
		
		System.out.println("You picked " + num);
		
		ScannerDriver.loginScreen();
		
		// Please close your resources people
		sc.close();
		*/
		/*
		 * Create a menu that gives a user multiple options:
		 * 		- 1: get a random number
		 * 		- 2: Using StringBuffer, reverse a word of the user's choice
		 * 		- 3: exit the program
		 * This menu should repeat until the user decides to exit.
		 */
		
		
		/*
	public static void loginScreen() {
		String uname = "admin";
		String pass = "pass";
		
		System.out.println("Username:");
		String username = sc.nextLine();
		System.out.println("Password:");
		String password = sc.nextLine();
		if(uname.equals(username) && pass.equals(password)) {
			System.out.println("You're logged in.");
		} else {
			System.out.println("Not quite.");
		}
	}
}
		*/