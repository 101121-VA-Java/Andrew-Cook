package com.revature;
			
public class Employee{   // employee constructor
		int id = 0;
		String lastname = "No Name";
		String firstname = "No Name";
		Role role;
		double salary = 0.0;
		
	
		
	public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}


	public Employee(int id, String lastname, String firstname, double salary) {
		 // elements being added to the variables
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.salary = salary;
		}


	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
		
}
