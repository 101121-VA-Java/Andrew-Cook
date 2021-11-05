package com.revature.controllers;
import java.util.Scanner;

import com.revature.models.Customer;

import com.revature.Employee;
import com.revature.exceptions.UsernameAlreadyExistsException;
import com.revature.services.EmployeeService;


public class RegisterUser {
	boolean run = true;
	while(run) {
		
		System.out.println("Pick your registration: ");
		System.out.println("1: New Employee");
		System.out.println("2: New Customer");
		System.out.println("3: Return to the front menu");
		
		String input = sc.nextLine();
		switch(input) {
		case"1":
			System.out.println("New Employee:");
			System.out.println();
			registerUser();
			flag = false;
			break;
		}
	}
	


private static EmployeeService us = new EmployeeService();
	public RegisterUser(Scanner sc) throws UsernameAlreadyExistsException {
		System.out.println();
		System.out.println("Please enter your ID: (at least 4 char)");
		
		int id = sc.nextInt();
		if(id < 4) { 
			System.out.println("Your ID should be at least 4 characters.");
			return;
		}
		System.out.println("Please enter your username: at least 4 char");
		String lastname = sc.nextLine();
		if(lastname.trim().length() < 4) {
			System.out.println("Your username should be at least 4 characters.");
			return;
		}
		 
		System.out.println("Please enter your password: at least 4 char");
		String password = sc.nextLine();
		if(password.trim().length() < 4) {
			System.out.println("Your password should be at least 4 characters.");
			return;
		}
		try {
			
			String username;
			Employee newEmp = new Employee(id, lastname, username);
			newEmp = us.addEmployee(newEmp);
			System.out.println("Welcome " + newEmp.getName());
		}
		catch (UsernameAlreadyExistsException e) {
				System.out.println("Username is already in use.\nPlease try again.");
		}
		
	}
}


