package com.revature.models;

import java.util.ArrayList;
import java.util.Objects;

public class Employee {

	private int id;
	private String name;
	private String username;
	private String password;
	private UserType userType;
	private ArrayList<Payment> payment;
//	private boolean isManager;
	private String email;
	private String role;		
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
//			this.isManager = isManager;
		
		}
		
		
		public Employee(int id, String name, String username, String password) {
			super();
			this.id = id;
			this.name = name;
			this.username = username;
			this.password = password;
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
/*		public boolean isManager() {
			return isManager;
		}
		public void setManager(boolean isManager) {
			this.isManager = isManager;
		}
*/		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
			 
		}

		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		@Override
		public int hashCode() {
			return Objects.hash(email, id, name, password, payment, role, userType, username);
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
			return Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name)
					&& Objects.equals(password, other.password) && Objects.equals(payment, other.payment)
					&& Objects.equals(role, other.role) && userType == other.userType
					&& Objects.equals(username, other.username);
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password
					+ ", userType=" + userType + ", payment=" + payment + ", email=" + email + ", role=" + role + "]";
		}	
}