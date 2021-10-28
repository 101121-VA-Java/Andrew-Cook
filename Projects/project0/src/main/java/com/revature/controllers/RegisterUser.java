package com.revature.controllers;

import java.util.Scanner;

import com.revature.Employee;
import com.revature.exceptions.UsernameAlreadyExistsException;
import com.revature.services.EmployeeService;

public class RegisterUser {
private static EmployeeService us = new EmployeeService();
	
	public static void run(Scanner sc) throws UsernameAlreadyExistsException {
		System.out.println();
		System.out.println("Please enter your ID: (at least 4 char)");
		int id = sc.nextInt();
		if(id < 3) { 
			System.out.println("Your ID should be at least 4 characters.");
			return;
		}
		System.out.println("Please enter your username: at least 4 char");
		String lastname = sc.nextLine();
		if(lastname.trim().length() < 3) {
			System.out.println("Your username should be at least 4 characters.");
			return;
		}
		
		System.out.println("Please enter your password: at least 4 char");
		String firstname = sc.nextLine();
		if(firstname.trim().length() < 3) {
			System.out.println("Your password should be at least 4 characters.");
			return;
		}
		System.out.println("Please enter your password: at least 4 char");
		double salary = sc.nextDouble();
		if(salary < 3) {
			System.out.println("Your password should be at least 4 characters.");
			return;
		}
		Employee newEmp = new Employee(id, lastname, firstname, salary);
		
		newEmp = us.addEmployee(newEmp);
		System.out.println("Welcome " + newEmp.getName() + "!");
	}
}