package com.revature.models;

public class Employee extends User {

	public Employee() {
		super();}
		public Employee(int id, String name, String username, String password, Role system, int manager) {
			super(id, name, username, password, system, manager);
		}
	}
}
