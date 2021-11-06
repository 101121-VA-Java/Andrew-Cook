package com.revature.models;

import java.util.ArrayList;

public class Employee {

	private int id;
	private String name;
	private String username;
	private String password;
	private UserType userType;
	private ArrayList<Payment> payment;
	private boolean isManager;
	private String email;
			
	public Employee() {
		super();
}
		public Employee(String name, String username, String password, boolean isManager, int id) {
			super();
			// TODO Auto-generated constructor stub	
			this.id = id;
			this.name = name;
//			this.email = email;
			this.password = password;
			this.isManager = isManager;
		
		}
		public Employee(String name, String username, String password) {
			super();
			this.name = name;
			this.username = username;
			this.password = password;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public UserType getUserType() {
			return userType;
		}
		public void setUserType(UserType userType) {
			this.userType = userType;
		}
		public ArrayList<Payment> getPayment() {
			return payment;
		}
		public void setPayment(ArrayList<Payment> payment) {
			this.payment = payment;
		}
		public boolean isManager() {
			return isManager;
		}
		public void setManager(boolean isManager) {
			this.isManager = isManager;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
			 
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (email == null) {
				if (other.email != null)
					return false;
			} else if (!email.equals(other.email))
				return false;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (password == null) {
				if (other.password != null)
					return false;
			} else if (!password.equals(other.password))
				return false;
			return true;
		}	
}